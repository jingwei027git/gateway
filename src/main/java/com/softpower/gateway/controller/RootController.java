package com.softpower.gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class RootController {

  @GetMapping()
  public ResponseEntity<String> read() {
    return ResponseEntity.ok("v1");
  }

}
