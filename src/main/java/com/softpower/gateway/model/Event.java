package com.softpower.gateway.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@ApiModel("Event model")
@AllArgsConstructor
@Getter
@Setter
public class Event implements Serializable {

  @ApiModelProperty(required = true, name = "data object", allowableValues = "ANY, ANY2, ANY3")
  private String name;

  private String description;

}
