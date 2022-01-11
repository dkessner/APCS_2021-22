---
title: Unit 11 - Inheritance & Interfaces
layout: page
geometry: margin=.75in
---

__Unit 11 (Inheritance & Interfaces) Assignment__  
__AP Computer Science 2021-22 / Dr. Kessner__  


## Reading

* Eck Section 5.5-5.7 (Inheritance, this and super, interfaces)  
[http://math.hws.edu/javanotes/c5/index.html](http://math.hws.edu/javanotes/c5/index.html)

* Wikibooks Java (Inheritance, interfaces)  
[https://en.wikibooks.org/wiki/Java_Programming/Inheritance](https://en.wikibooks.org/wiki/Java_Programming/Inheritance)  
[https://en.wikibooks.org/wiki/Java_Programming/Interfaces](https://en.wikibooks.org/wiki/Java_Programming/Interfaces)

## Code exercises

### Vehicle

Suppose you are given a Vehicle interface:

```java
public interface Vehicle
{
    public String name();
    public int wheelCount();
    public boolean isHumanPowered();
}
```

Write the following concrete classes implementing the Vehicle interface:
Car, Motorcycle, Bicycle, Unicycle

Write a VehicleTest class to show that your classes are behaving properly.  A
simple test is sufficient: create an ArrayList of various Vehicle objects and
iterate through it, printing info about each object. 

Write a VehicleStats class that calculates various things about a list of
Vehicle objects.  Include these functions:

- a function that takes an ArrayList of Vehicle objects and computes the total
  number of wheels

- a function that takes an ArrayList of Vehicle objects as input, and returns
  an ArrayList of Vehicle objects representing those vehicles that are
  human-powered.

Write tests for your VehicleStats functions to demonstrate that they are
returning the expected things.


### Animal

Write a class Animal.  You should include:

- private member variables for the name (String), leg count (int), furriness (boolean) 

- a constructor that sets these member variables

- public accessor functions for the member variables

Write four subclasses of Animal (for example: Human, Cat, Sponge, Centipede).
Note that your subclass constructors will need to call the Animal constructor
using super().

Write some test code to show your subclasses all behave properly.

Write a class AnimalCalculator that calculates various things about a list of
Animal objects.  Include these functions:

- a function that takes an ArrayList of Animal objects as input, and prints the
  name, number of legs, and "furry" or "not furry" (returns nothing)

- a function that takes an ArrayList of Animal objects as input, and returns  the
  average number of legs

- a function that takes an ArrayList of Animal objects as input, and returns the
  Animal object with the fewest legs

Write unit tests for all AnimalCalculator functions that return a value, to
demonstrate that the functions are working correctly.  These tests can be
written in the AnimalCalculator class, or in an external AnimalCalculatorTest
class.

