package info.telescopeworld.controllers;

import info.telescopeworld.dao.*;
import info.telescopeworld.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static info.telescopeworld.dao.TelescopeSpecifications.*;

@Controller
public class TelescopeController {

  public static Logger logger = Logger.getLogger(TelescopeController.class.getName());

  @RequestMapping("/telescope")
  @ResponseBody
  public Iterable<ProductContainer> findTelescopes(
          @RequestParam(value="prof", defaultValue = "false") boolean isProf,
          @RequestParam(value="brand", required = false) Long brandId,
          @RequestParam(value="os", required = false) Long opticalSystemId,
          @RequestParam(value="mount", required = false) Long mountId,
          @RequestParam(value="fl", required = false) Double focusLow,
          @RequestParam(value="fh", required = false) Double focusHigh,
          @RequestParam(value="al", required = false) Double apertureLow,
          @RequestParam(value="ah", required = false) Double apertureHigh
  )
  {
    Mount mount = null;
    if (mountId!=null) {
      mount = mountRepository.findOne(mountId);
    }

    Brand brand = null;
    if (brandId!=null) {
      brand = brandRepository.findOne(brandId);
    }

    OpticalSystem opticalSystem = null;
    if (opticalSystemId!=null) {
      opticalSystem = opticalSystemRepository.findOne(opticalSystemId);
    }

    TelescopeSearchCriteria sc = new TelescopeSearchCriteria();
    sc.setMount(mount);
    sc.setBrand(brand);
    sc.setOpticalSystem(opticalSystem);
    if (isProf) {
      sc.setLowerAperture(5000);
    } else {
      if (apertureLow!=null) sc.setLowerAperture(apertureLow);
      if (apertureHigh!=null) {
        sc.setHigherAperture(Math.min(apertureHigh,5000));
      } else {
        sc.setHigherAperture(5000);
      }
    }
    if (focusLow!=null) sc.setLowerFocus(focusLow);
    if (focusHigh!=null) sc.setHigherFocus(focusHigh);

    List<ProductContainer> list = new ArrayList<>();
    Iterable<Telescope> telList = telescopeRepository.findAll(findByCriteria(sc));

    for (Telescope t: telList){
      ProductContainer c = new ProductContainer();
      c.setId(t.getId());
      if (t.getProduct()!=null) {
        c.setProductId(t.getProduct().getId());
      }
      c.setTitle((t.getTitle()!=null)?t.getTitle().trim():"");
      String brandS = ((t.getProduct()!=null && t.getProduct().getBrand()!=null)?t.getProduct().getBrand().getName().trim():"");
      String name = brandS+" "+((t.getName()!=null)?t.getName().trim():"");
      c.setName(name);
      c.setTimage((t.getProduct()!=null && t.getProduct().getTimage()!=null)?t.getProduct().getTimage().trim():"");
      c.setDescription(t.getProduct().getDescription());
      list.add(c);
    }

    return list;
  }

  @RequestMapping("/images")
  @ResponseBody
  public Iterable<String> findImages(
          @RequestParam(value="id", required = true) long id,
          @RequestParam(value="scope", defaultValue = "true") boolean isScope
  )
  {
    List<String> imgNamesList = new ArrayList<>();

    Product product = productRepository.findOne(id);

    if (product!=null){
      Iterable<Image> imgList = imageRepository.findByProductAndScope(product,true);
      for (Image i: imgList){
        imgNamesList.add(i.getName().trim());
      }
    }

    return imgNamesList;
  }

  @RequestMapping("/scope")
  @ResponseBody
  public Telescope findScope(
          @RequestParam(value="id", required = true) long id
  )
  {
    return telescopeRepository.findOne(id);
  }

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------

  @Autowired
  private MountRepository mountRepository;

  @Autowired
  private BrandRepository brandRepository;

  @Autowired
  private OpticalSystemRepository opticalSystemRepository;

  @Autowired
  private TelescopeRepository telescopeRepository;

  @Autowired
  private ProductRepository productRepository;

  @Autowired
  private ImageRepository imageRepository;
}
