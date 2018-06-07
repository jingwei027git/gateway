package com.softpower.gateway.controller;

import com.softpower.gateway.model.Event;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/events")
@RestController
public class EventController {

  @ApiOperation(value="load events", notes="load events")
  @GetMapping()
  public ResponseEntity<List<Event>> reads() {
    return ResponseEntity.ok(Arrays.asList(
        new Event("dog", "won won"),
        new Event("cat", "meow meow")));
  }

  @ApiOperation(value="load specify event", notes="load event by id")
  @ApiImplicitParam(name = "id", value = "Event ID", required = true, dataType = "Long")
  @GetMapping(value = "/{id}")
  public ResponseEntity<Event> read(@PathVariable Long id) {
    if (id == 1L) {
      return ResponseEntity.ok(new Event("dog", "won won"));

    } else if (id == 2L) {
      return ResponseEntity.ok(new Event("cat", "meow meow"));

    } else {
      return ResponseEntity.notFound().build();
    }
  }

}
