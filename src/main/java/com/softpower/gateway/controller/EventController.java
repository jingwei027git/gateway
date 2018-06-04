package com.softpower.gateway.controller;

import com.softpower.gateway.model.Event;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/events")
@RestController
public class EventController {

  @GetMapping()
  public ResponseEntity<List<Event>> reads() {
    return ResponseEntity.ok(Arrays.asList(
        new Event("dog", "won won"),
        new Event("cat", "meow meow")));
  }

}
