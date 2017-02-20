package com.sample.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * RatePlan
 */

public class RatePlan   {
  @JsonProperty("rate_plan_id")
  private String ratePlanId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("activation_fee")
  private String activationFee = null;

  @JsonProperty("monthly_subscription_amount")
  private String monthlySubscriptionAmount = null;

  @JsonProperty("retail_prize")
  private String retailPrize = null;

  @JsonProperty("subscription_discount_amount")
  private String subscriptionDiscountAmount = null;

  public RatePlan ratePlanId(String ratePlanId) {
    this.ratePlanId = ratePlanId;
    return this;
  }

   /**
   * Unique identifier representing rate plan for a SKU and feature (storage)
   * @return ratePlanId
  **/
  public String getRatePlanId() {
    return ratePlanId;
  }

  public void setRatePlanId(String ratePlanId) {
    this.ratePlanId = ratePlanId;
  }

  public RatePlan name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of rate plan.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RatePlan description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of the rate plan.
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RatePlan activationFee(String activationFee) {
    this.activationFee = activationFee;
    return this;
  }

   /**
   * activation fee for device.
   * @return activationFee
  **/
  public String getActivationFee() {
    return activationFee;
  }

  public void setActivationFee(String activationFee) {
    this.activationFee = activationFee;
  }

  public RatePlan monthlySubscriptionAmount(String monthlySubscriptionAmount) {
    this.monthlySubscriptionAmount = monthlySubscriptionAmount;
    return this;
  }

   /**
   * monthly subscription amount for device under this rate plan.
   * @return monthlySubscriptionAmount
  **/
  public String getMonthlySubscriptionAmount() {
    return monthlySubscriptionAmount;
  }

  public void setMonthlySubscriptionAmount(String monthlySubscriptionAmount) {
    this.monthlySubscriptionAmount = monthlySubscriptionAmount;
  }

  public RatePlan retailPrize(String retailPrize) {
    this.retailPrize = retailPrize;
    return this;
  }

   /**
   * retail amount for device under this rate plan.
   * @return retailPrize
  **/
  public String getRetailPrize() {
    return retailPrize;
  }

  public void setRetailPrize(String retailPrize) {
    this.retailPrize = retailPrize;
  }

  public RatePlan subscriptionDiscountAmount(String subscriptionDiscountAmount) {
    this.subscriptionDiscountAmount = subscriptionDiscountAmount;
    return this;
  }

   /**
   * subscription discount amount for device under this rate plan.
   * @return subscriptionDiscountAmount
  **/
  public String getSubscriptionDiscountAmount() {
    return subscriptionDiscountAmount;
  }

  public void setSubscriptionDiscountAmount(String subscriptionDiscountAmount) {
    this.subscriptionDiscountAmount = subscriptionDiscountAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatePlan ratePlan = (RatePlan) o;
    return Objects.equals(this.ratePlanId, ratePlan.ratePlanId) &&
        Objects.equals(this.name, ratePlan.name) &&
        Objects.equals(this.description, ratePlan.description) &&
        Objects.equals(this.activationFee, ratePlan.activationFee) &&
        Objects.equals(this.monthlySubscriptionAmount, ratePlan.monthlySubscriptionAmount) &&
        Objects.equals(this.retailPrize, ratePlan.retailPrize) &&
        Objects.equals(this.subscriptionDiscountAmount, ratePlan.subscriptionDiscountAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratePlanId, name, description, activationFee, monthlySubscriptionAmount, retailPrize, subscriptionDiscountAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatePlan {\n");
    
    sb.append("    ratePlanId: ").append(toIndentedString(ratePlanId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activationFee: ").append(toIndentedString(activationFee)).append("\n");
    sb.append("    monthlySubscriptionAmount: ").append(toIndentedString(monthlySubscriptionAmount)).append("\n");
    sb.append("    retailPrize: ").append(toIndentedString(retailPrize)).append("\n");
    sb.append("    subscriptionDiscountAmount: ").append(toIndentedString(subscriptionDiscountAmount)).append("\n");
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

