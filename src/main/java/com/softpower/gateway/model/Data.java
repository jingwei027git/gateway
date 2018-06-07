package com.softpower.gateway.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

public class Data implements Serializable {

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
