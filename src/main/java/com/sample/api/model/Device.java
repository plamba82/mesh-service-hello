package com.sample.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Device
 */

public class Device   {
  @JsonProperty("device_id")
  private String deviceId = null;

  @JsonProperty("manfacturer_id")
  private String manfacturerId = null;

  @JsonProperty("length")
  private String length = null;

  @JsonProperty("width")
  private String width = null;

  @JsonProperty("height")
  private String height = null;

  @JsonProperty("thikness")
  private String thikness = null;

  @JsonProperty("operating_system")
  private String operatingSystem = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("storage")
  private String storage = null;

  @JsonProperty("scree_size")
  private String screeSize = null;

  @JsonProperty("battry")
  private String battry = null;

  public Device deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Unique identifier representing a specific product (i.e. SKU)
   * @return deviceId
  **/
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public Device manfacturerId(String manfacturerId) {
    this.manfacturerId = manfacturerId;
    return this;
  }

   /**
   * manufacturer identifier  of device.
   * @return manfacturerId
  **/
  public String getManfacturerId() {
    return manfacturerId;
  }

  public void setManfacturerId(String manfacturerId) {
    this.manfacturerId = manfacturerId;
  }

  public Device length(String length) {
    this.length = length;
    return this;
  }

   /**
   * length of device.
   * @return length
  **/
  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public Device width(String width) {
    this.width = width;
    return this;
  }

   /**
   * width of device.
   * @return width
  **/
  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  public Device height(String height) {
    this.height = height;
    return this;
  }

   /**
   * height of device.
   * @return height
  **/
  
  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public Device thikness(String thikness) {
    this.thikness = thikness;
    return this;
  }

   /**
   * thickness of device..
   * @return thikness
  **/
  public String getThikness() {
    return thikness;
  }

  public void setThikness(String thikness) {
    this.thikness = thikness;
  }

  public Device operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * operating system of device.
   * @return operatingSystem
  **/
 
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public Device color(String color) {
    this.color = color;
    return this;
  }

   /**
   * color of device.
   * @return color
  **/
  
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Device storage(String storage) {
    this.storage = storage;
    return this;
  }

   /**
   * storage of device.
   * @return storage
  **/
 
  public String getStorage() {
    return storage;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }

  public Device screeSize(String screeSize) {
    this.screeSize = screeSize;
    return this;
  }

   /**
   * screen size of device.
   * @return screeSize
  **/
  
  public String getScreeSize() {
    return screeSize;
  }

  public void setScreeSize(String screeSize) {
    this.screeSize = screeSize;
  }

  public Device battry(String battry) {
    this.battry = battry;
    return this;
  }

   /**
   * battry details of device.
   * @return battry
  **/
  
  public String getBattry() {
    return battry;
  }

  public void setBattry(String battry) {
    this.battry = battry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.deviceId, device.deviceId) &&
        Objects.equals(this.manfacturerId, device.manfacturerId) &&
        Objects.equals(this.length, device.length) &&
        Objects.equals(this.width, device.width) &&
        Objects.equals(this.height, device.height) &&
        Objects.equals(this.thikness, device.thikness) &&
        Objects.equals(this.operatingSystem, device.operatingSystem) &&
        Objects.equals(this.color, device.color) &&
        Objects.equals(this.storage, device.storage) &&
        Objects.equals(this.screeSize, device.screeSize) &&
        Objects.equals(this.battry, device.battry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, manfacturerId, length, width, height, thikness, operatingSystem, color, storage, screeSize, battry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    manfacturerId: ").append(toIndentedString(manfacturerId)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    thikness: ").append(toIndentedString(thikness)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    screeSize: ").append(toIndentedString(screeSize)).append("\n");
    sb.append("    battry: ").append(toIndentedString(battry)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

