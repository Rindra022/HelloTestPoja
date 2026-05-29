package com.my.company.service;

import com.my.company.exception.BadRequestException;
import org.springframework.stereotype.Service;

@Service
public class ArithService {

  public void checkPositiveNumber(Double a, Double b) {
    if (a < 0 || b < 0) {
      throw new BadRequestException("Number can't be negative");
    }
  }

  public void checkNotNull(Double a, Double b) {
    if (a == null || b == null) {
      throw new BadRequestException("Missing a parameter");
    }
  }

  public Double add(Double a, Double b) {
    checkNotNull(a, b);
    checkPositiveNumber(a, b);
    return a + b;
  }

  public Double subtract(Double a, Double b) {
    checkNotNull(a, b);
    checkPositiveNumber(a, b);
    return a - b;
  }

  public Double multiply(Double a, Double b) {
    checkNotNull(a, b);
    return a * b;
  }

  public Double division(Double a, Double b) {
    checkNotNull(a, b);
    checkPositiveNumber(a, b);
    return a / b;
  }
}
