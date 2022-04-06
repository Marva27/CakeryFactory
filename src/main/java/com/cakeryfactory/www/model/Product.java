package com.cakeryfactory.www.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-06T00:25:37.086418600-05:00[America/Chicago]")
public class Product   {
  @JsonProperty("productId")
  private BigDecimal productId;

  @JsonProperty("productName")
  private String productName;

  @JsonProperty("productPrice")
  private BigDecimal productPrice;

  @JsonProperty("sizesOffered")
  @Valid
  private List<String> sizesOffered = null;

  @JsonProperty("flavorsOffered")
  @Valid
  private List<String> flavorsOffered = null;

  @JsonProperty("icingColorsOffered")
  @Valid
  private List<String> icingColorsOffered = null;

  @JsonProperty("allowMultipleIcingColors")
  private Boolean allowMultipleIcingColors;

  @JsonProperty("otherCustomFields")
  @Valid
  private List<String> otherCustomFields = null;

  public Product productId(BigDecimal productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Unique id to represent a product
   * @return productId
  */
  @ApiModelProperty(example = "101", readOnly = true, value = "Unique id to represent a product")

  @Valid

  public BigDecimal getProductId() {
    return productId;
  }

  public void setProductId(BigDecimal productId) {
    this.productId = productId;
  }

  public Product productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Name of the product
   * @return productName
  */
  @ApiModelProperty(example = "Baby Shark Cake", required = true, value = "Name of the product")
  @NotNull


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Product productPrice(BigDecimal productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  /**
   * Price of the product
   * @return productPrice
  */
  @ApiModelProperty(example = "101.45", required = true, value = "Price of the product")
  @NotNull

  @Valid

  public BigDecimal getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(BigDecimal productPrice) {
    this.productPrice = productPrice;
  }

  public Product sizesOffered(List<String> sizesOffered) {
    this.sizesOffered = sizesOffered;
    return this;
  }

  public Product addSizesOfferedItem(String sizesOfferedItem) {
    if (this.sizesOffered == null) {
      this.sizesOffered = new ArrayList<>();
    }
    this.sizesOffered.add(sizesOfferedItem);
    return this;
  }

  /**
   * Specify the different sizes offered for this product
   * @return sizesOffered
  */
  @ApiModelProperty(value = "Specify the different sizes offered for this product")


  public List<String> getSizesOffered() {
    return sizesOffered;
  }

  public void setSizesOffered(List<String> sizesOffered) {
    this.sizesOffered = sizesOffered;
  }

  public Product flavorsOffered(List<String> flavorsOffered) {
    this.flavorsOffered = flavorsOffered;
    return this;
  }

  public Product addFlavorsOfferedItem(String flavorsOfferedItem) {
    if (this.flavorsOffered == null) {
      this.flavorsOffered = new ArrayList<>();
    }
    this.flavorsOffered.add(flavorsOfferedItem);
    return this;
  }

  /**
   * Specify the different flavors offered for this product
   * @return flavorsOffered
  */
  @ApiModelProperty(value = "Specify the different flavors offered for this product")


  public List<String> getFlavorsOffered() {
    return flavorsOffered;
  }

  public void setFlavorsOffered(List<String> flavorsOffered) {
    this.flavorsOffered = flavorsOffered;
  }

  public Product icingColorsOffered(List<String> icingColorsOffered) {
    this.icingColorsOffered = icingColorsOffered;
    return this;
  }

  public Product addIcingColorsOfferedItem(String icingColorsOfferedItem) {
    if (this.icingColorsOffered == null) {
      this.icingColorsOffered = new ArrayList<>();
    }
    this.icingColorsOffered.add(icingColorsOfferedItem);
    return this;
  }

  /**
   * Specify the different icing colors offered for this product
   * @return icingColorsOffered
  */
  @ApiModelProperty(value = "Specify the different icing colors offered for this product")


  public List<String> getIcingColorsOffered() {
    return icingColorsOffered;
  }

  public void setIcingColorsOffered(List<String> icingColorsOffered) {
    this.icingColorsOffered = icingColorsOffered;
  }

  public Product allowMultipleIcingColors(Boolean allowMultipleIcingColors) {
    this.allowMultipleIcingColors = allowMultipleIcingColors;
    return this;
  }

  /**
   * Specify if this product offers multiple icing colors
   * @return allowMultipleIcingColors
  */
  @ApiModelProperty(example = "true", value = "Specify if this product offers multiple icing colors")


  public Boolean getAllowMultipleIcingColors() {
    return allowMultipleIcingColors;
  }

  public void setAllowMultipleIcingColors(Boolean allowMultipleIcingColors) {
    this.allowMultipleIcingColors = allowMultipleIcingColors;
  }

  public Product otherCustomFields(List<String> otherCustomFields) {
    this.otherCustomFields = otherCustomFields;
    return this;
  }

  public Product addOtherCustomFieldsItem(String otherCustomFieldsItem) {
    if (this.otherCustomFields == null) {
      this.otherCustomFields = new ArrayList<>();
    }
    this.otherCustomFields.add(otherCustomFieldsItem);
    return this;
  }

  /**
   * Specify other customer fields such as Name, Age
   * @return otherCustomFields
  */
  @ApiModelProperty(value = "Specify other customer fields such as Name, Age")


  public List<String> getOtherCustomFields() {
    return otherCustomFields;
  }

  public void setOtherCustomFields(List<String> otherCustomFields) {
    this.otherCustomFields = otherCustomFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.productId, product.productId) &&
        Objects.equals(this.productName, product.productName) &&
        Objects.equals(this.productPrice, product.productPrice) &&
        Objects.equals(this.sizesOffered, product.sizesOffered) &&
        Objects.equals(this.flavorsOffered, product.flavorsOffered) &&
        Objects.equals(this.icingColorsOffered, product.icingColorsOffered) &&
        Objects.equals(this.allowMultipleIcingColors, product.allowMultipleIcingColors) &&
        Objects.equals(this.otherCustomFields, product.otherCustomFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productName, productPrice, sizesOffered, flavorsOffered, icingColorsOffered, allowMultipleIcingColors, otherCustomFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    sizesOffered: ").append(toIndentedString(sizesOffered)).append("\n");
    sb.append("    flavorsOffered: ").append(toIndentedString(flavorsOffered)).append("\n");
    sb.append("    icingColorsOffered: ").append(toIndentedString(icingColorsOffered)).append("\n");
    sb.append("    allowMultipleIcingColors: ").append(toIndentedString(allowMultipleIcingColors)).append("\n");
    sb.append("    otherCustomFields: ").append(toIndentedString(otherCustomFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

