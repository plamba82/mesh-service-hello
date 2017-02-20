package com.sample.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Product
 */

public class Product   {
	  @JsonProperty("product_id")
	  private String productId = null;

	  @JsonProperty("product_name")
	  private String productName = null;

	  @JsonProperty("product_desc")
	  private String productDesc = null;

	  @JsonProperty("product_type")
	  private String productType = null;

	  @JsonProperty("device")
	  private Device device = null;

	  @JsonProperty("rate_plans")
	  private List<RatePlan> ratePlans = new ArrayList<RatePlan>();

	  public Product productId(String productId) {
	    this.productId = productId;
	    return this;
	  }

	   /**
	   * Unique identifier representing a specific product (i.e. SKU)
	   * @return productId
	  **/
	  
	  public String getProductId() {
	    return productId;
	  }

	  public void setProductId(String productId) {
	    this.productId = productId;
	  }

	  public Product productName(String productName) {
	    this.productName = productName;
	    return this;
	  }

	   /**
	   * Name of the product.
	   * @return productName
	  **/
	
	  public String getProductName() {
	    return productName;
	  }

	  public void setProductName(String productName) {
	    this.productName = productName;
	  }

	  public Product productDesc(String productDesc) {
	    this.productDesc = productDesc;
	    return this;
	  }

	   /**
	   * Description of product.
	   * @return productDesc
	  **/
	
	  public String getProductDesc() {
	    return productDesc;
	  }

	  public void setProductDesc(String productDesc) {
	    this.productDesc = productDesc;
	  }

	  public Product productType(String productType) {
	    this.productType = productType;
	    return this;
	  }

	   /**
	   * product type(phone or accessaries etc.
	   * @return productType
	  **/
	  
	  public String getProductType() {
	    return productType;
	  }

	  public void setProductType(String productType) {
	    this.productType = productType;
	  }

	  public Product device(Device device) {
	    this.device = device;
	    return this;
	  }

	   /**
	   * Get device
	   * @return device
	  **/
	  
	  public Device getDevice() {
	    return device;
	  }

	  public void setDevice(Device device) {
	    this.device = device;
	  }

	  public Product ratePlans(List<RatePlan> ratePlans) {
	    this.ratePlans = ratePlans;
	    return this;
	  }

	  public Product addRatePlansItem(RatePlan ratePlansItem) {
	    this.ratePlans.add(ratePlansItem);
	    return this;
	  }

	   /**
	   * Get ratePlans
	   * @return ratePlans
	  **/
	 
	  public List<RatePlan> getRatePlans() {
	    return ratePlans;
	  }

	  public void setRatePlans(List<RatePlan> ratePlans) {
	    this.ratePlans = ratePlans;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    Product product = (Product) o;
	    return Objects.equals(this.productId, product.productId) &&
	        Objects.equals(this.productName, product.productName) &&
	        Objects.equals(this.productDesc, product.productDesc) &&
	        Objects.equals(this.productType, product.productType) &&
	        Objects.equals(this.device, product.device) &&
	        Objects.equals(this.ratePlans, product.ratePlans);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(productId, productName, productDesc, productType, device, ratePlans);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Product {\n");
	    
	    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
	    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
	    sb.append("    productDesc: ").append(toIndentedString(productDesc)).append("\n");
	    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
	    sb.append("    device: ").append(toIndentedString(device)).append("\n");
	    sb.append("    ratePlans: ").append(toIndentedString(ratePlans)).append("\n");
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

