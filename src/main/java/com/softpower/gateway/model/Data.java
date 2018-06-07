package com.softpower.gateway.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@ApiModel("Common Data")
public class Data implements Serializable {

  @ApiModelProperty(required = true, name = "data object", allowableValues = "ANY, ANY2, ANY3")
  @Getter
  @Setter
  private Object data;

  private Data(Object data) {
    this.data = data;
  }

  public static Data of(Object data) {
    return new Data(data);
  }

}
