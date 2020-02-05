/*
 * SonarQube, open source software quality management tool.
 * Copyright (C) 2008-2013 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * SonarQube is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * SonarQube is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.mrlonis.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.mrlonis.basics.Calculator;

public class Tests {
  @Test
  public void testAddition() {
    Calculator calc = new Calculator();

    Assertions.assertEquals(2, calc.add(1, 1), "Test: 1 + 1");
  }

  @Test
  public void testSubtraction() {
    Calculator calc = new Calculator();

    Assertions.assertEquals(0, calc.subtract(1, 1), "Test: 1 - 1");
  }

  @Test
  public void testMultiplication() {
    Calculator calc = new Calculator();

    Assertions.assertEquals(1, calc.multiply(1, 1), "Test: 1 * 1");
  }

  @Test
  public void testDivision() {
    Calculator calc = new Calculator();

    Assertions.assertEquals(1, calc.divide(1, 1), "Test: 1 / 1");
  }
}
