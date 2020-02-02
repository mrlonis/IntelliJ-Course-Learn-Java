package com.mrlonis.tests.lesson1;

import org.junit.Assert;
import org.junit.Test;
import com.mrlonis.lesson1.*;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    Task task = new Task();
    task.setText("Hello World");

    Assert.assertEquals(task.getText(), "Hello World");
  }
}