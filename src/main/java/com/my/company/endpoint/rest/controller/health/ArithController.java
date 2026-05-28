package com.my.company.endpoint.rest.controller.health;

import com.my.company.service.ArithService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arith")
public class ArithController {

  private ArithService arithService;

  @GetMapping("/add")
  public Double add(@RequestParam Double a, @RequestParam Double b) {

    return arithService.add(a, b);
  }

  @GetMapping("/substract")
  public Double substract(@RequestParam Double a, @RequestParam Double b) {
    return arithService.subtract(a, b);
  }

  @GetMapping("/multiply")
  public Double multiply(@RequestParam Double a, @RequestParam Double b) {
    return arithService.multiply(a, b);
  }

  @GetMapping("/division")
  public Double division(@RequestParam Double a, @RequestParam Double b) {
    return arithService.division(a, b);
  }
}
