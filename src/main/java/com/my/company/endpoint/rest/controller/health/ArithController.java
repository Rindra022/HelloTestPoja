package com.my.company.endpoint.rest.controller.health;

import com.my.company.exception.BadRequestException;
import com.my.company.service.ArithService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arith")
@RequiredArgsConstructor
public class ArithController {

  private final ArithService arithService;

  @GetMapping("/add")
  public ResponseEntity<?> add(@RequestParam Double a, @RequestParam Double b) {
    try {

      return ResponseEntity.ok(arithService.add(a, b));
    } catch (BadRequestException e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
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
