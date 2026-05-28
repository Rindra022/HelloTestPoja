package com.my.company.conf;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.my.company.service.ArithService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArithServiceTest {

  @Autowired private ArithService arithService;

  @Test
  void add_two_positive_number_should_return_their_sum() {

    Double a = 7.;
    Double b = 10.;

    var result = arithService.add(a, b);

    assertEquals(17., result);
  }

  @Test
  void add_negative_number_should_return_throw_exception() {
    Double a = -8.;
    Double b = 10.;

    assertThatThrownBy(() -> arithService.add(a, b))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("Number can't be negative");
  }

  @Test
  void substract_two_positive_number_should_return_their_substraction() {
    Double a = 7.;
    Double b = 10.;

    var result = arithService.subtract(a, b);

    assertEquals(-3., result);
  }

  @Test
  void substract_negative_number_should_return_throw_exception() {
    Double a = 5.;
    Double b = -6.;

    assertThatThrownBy(() -> arithService.subtract(a, b))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("Number can't be negative");
  }

  @Test
  void multiply_two_number_should_return_their_multiplication() {
    Double a = -2.;
    Double b = 5.;

    var result = arithService.multiply(a, b);

    assertEquals(-10., result);
  }

  @Test
  void divided_two_positive_number_should_return_their_division() {
    Double a = 8.;
    Double b = 2.;

    var result = arithService.division(a, b);

    assertEquals(4., result);
  }

  @Test
  void divided_negative_number_should_return_throw_exception() {
    Double a = 8.;
    Double b = -2.;

    assertThatThrownBy(() -> arithService.division(a, b))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("Number can't be negative");
  }
}
