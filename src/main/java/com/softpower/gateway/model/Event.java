package com.softpower.gateway.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Event implements Serializable {

  private String name;
  private String description;

}
