package com.simboss.sdk.dto;




public class LocationDTO {

  private String iccid;

  private String longitude;

  private String latitude;

  private String coordinate;

  private String location;

  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getCoordinate() {
    return coordinate;
  }

  public void setCoordinate(String coordinate) {
    this.coordinate = coordinate;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
