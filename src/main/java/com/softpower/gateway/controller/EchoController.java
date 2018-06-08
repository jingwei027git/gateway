package com.softpower.gateway.controller;

import com.softpower.gateway.model.Data;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/echo")
@RestController
public class EchoController {

  @Autowired
  private HttpServletRequest request;

  @Value("${project.name}")
  private String projectName;

  @GetMapping()
  public ResponseEntity<Data> reads() {
    System.out.println(projectName);
    return ResponseEntity.ok(Data.of(request.getRequestURL().toString()));
  }

}
