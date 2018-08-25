package info.telescopeworld.dao;

import info.telescopeworld.models.Brand;
import info.telescopeworld.models.Mount;
import info.telescopeworld.models.OpticalSystem;

/**
 * Created by chalevina on 29/10/2017.
 */
public class TelescopeSearchCriteria {
    Mount mount;
    Brand brand;
    OpticalSystem opticalSystem;
    double lowerFocus;
    double higherFocus;
    double lowerAperture;
    double higherAperture;

    public Mount getMount() {
        return mount;
    }

    public void setMount(Mount mount) {
        this.mount = mount;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public OpticalSystem getOpticalSystem() {
        return opticalSystem;
    }

    public void setOpticalSystem(OpticalSystem opticalSystem) {
        this.opticalSystem = opticalSystem;
    }

    public double getLowerFocus() {
        return lowerFocus;
    }

    public void setLowerFocus(double lowerFocus) {
        this.lowerFocus = lowerFocus;
    }

    public double getHigherFocus() {
        return higherFocus;
    }

    public void setHigherFocus(double higherFocus) {
        this.higherFocus = higherFocus;
    }

    public double getLowerAperture() {
        return lowerAperture;
    }

    public void setLowerAperture(double lowerAperture) {
        this.lowerAperture = lowerAperture;
    }

    public double getHigherAperture() {
        return higherAperture;
    }

    public void setHigherAperture(double higherAperture) {
        this.higherAperture = higherAperture;
    }
}
