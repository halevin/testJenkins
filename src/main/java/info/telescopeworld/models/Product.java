package info.telescopeworld.models;

import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

  // An autogenerated id (unique for each user in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotNull
  @ManyToOne
  @JoinColumn(name="brandid")
  private Brand brand;

  private String name;

  private String timage;

  private String folder;

  private String description;

  @ElementCollection
  @CollectionTable(
          name="IMAGE",
          joinColumns = @JoinColumn(name="PRODUCTID")
  )
  @Where(clause = "scope = 'TRUE'")
  @Column(name="name")
  private List<String> images;

  public Product() { }

  public Product(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public void setId(long value) {
    this.id = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTimage() {
    return timage;
  }

  public void setTimage(String timage) {
    this.timage = timage;
  }

  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }
}


