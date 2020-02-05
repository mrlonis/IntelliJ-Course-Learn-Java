# Introduction to Java
 
## Classes

A Java class is used to hold data, perform functions (called methods in Java), or both.

A class, named *Calculator*, is declared in a file called *Calculator.java* below:

```java
public class Calculator {

}
```

### Public, private, static

Notice the class above is declared as ```public```. This means, anyone using a package containing this class can see the class and use it. A ```private``` class would not be visible or usable and a ```static``` class is a class that can only exist once in a package. Non-static classes can be create multiple times simultaneously.

## Methods

A method in Java can do whatever you program it to do. The method below simply adds two parameters, *x* & *y*, and adds them together. The class is conveniently named calculator, so it makes sense a calculator would have an add function.

```java
public class Calculator {
  public int add(int x, int y) {
    return x + y;
  }
}
```

### Data Types

## Task

Modify the calculator to be able to subtract, divide, and multiply.
