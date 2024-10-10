package org.naveenkumar;

public class Drivers {
  private String name;
  private Boolean isActiveLicense;

  public String getName() {
    return name;
  }

  public Drivers() {}

  public Drivers(String name, Boolean isActiveLicense) {
    this.name = name;
    this.isActiveLicense = isActiveLicense;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getActiveLicense() {
    return isActiveLicense;
  }

  public void setActiveLicense(Boolean activeLicense) {
    isActiveLicense = activeLicense;
  }
}
