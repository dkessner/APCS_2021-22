---
title: Unit 5 Assignment
layout: page
geometry: margin=.75in
---

__Unit 5 (Classes and Objects)__  
__AP Computer Science 2021-22 / Dr. Kessner__  

## Reading

* Eck Sections 5.1-3 (Objects and Classes)
[http://math.hws.edu/javanotes/c5/index.html](http://math.hws.edu/javanotes/c5/index.html)

* Wikibooks Java
[https://en.wikibooks.org/wiki/Java_Programming/Defining_Classes](https://en.wikibooks.org/wiki/Java_Programming/Defining_Classes)

## Code

### Person

Write a `Person` class that includes the following:

* private member variables for name (String) and number of pets (int)
* public constructor taking name and number of pets as input
* public accessor functions for name and number of pets
* public member function `greeting` that returns a String:
    "Hello, my name is (name) and I have (numberOfPets) pets."

Also write a `TestPerson` class that instantiates some `Person` objects and
demonstrates that the functions are working properly.


### ScoreKeeper

Write a `ScoreKeeper` class that includes the following:

* private member variable to keep track of the score (initialized to 0)
* public accessor function for the score
* public method `scoreNormal()` that adds 100 to the score
* public method `scoreBonus()` that adds 1000 to the score

Write a `TestScoreKeeper` class that instantiates a `ScoreKeeper` object and
tests its functions.


### Magic Eight Ball

Write a `MagicEightBall` class that includes the following:

* private final String member variables to hold the possible replies (if you
  don't remember what `final` means, look it up again)
* public member function `ask()` that takes a single string as input, ignores it, and
  returns a string randomly from the possible replies

Write a `TestMagicEightBall` class that instantiates a `MagicEightBall` object
and asks it some important questions.


### Rectangle

Write a `Rectangle` class that includes the following:

* private double member variables for base and height
* public constructor with base and height as inputs
* public accessor functions for base and height
* public member function to return the area of the rectangle
* public member function to return the perimeter of the rectangle
* public member function to return the length of a diagonal of the rectangle

Be sure to include a test class to demonstrate that your Rectangle class
functions all work properly.


### Bonus Challenge:  Vector

Write a `Vector` class that represents a two-dimensional vector $\vec{v} = \left<x, y\right>$.
Include the following:

* private double member variables for $x$ and $y$
* public constructor taking $x$ and $y$ as input
* public accessor functions for $x$ and $y$
* public member function that returns the magnitude of the vector
* public member function that returns the direction of the vector (Note: this
  is a little tricky in general because you need to use atan() and check the
  quadrant.  Fortunately, the Java `Math` class includes a convenient function
  `atan2(y, x)` that does this check for you.  Note that `y` comes before `x`.)
* public member function that adds another vector to this one (like `+=`): 
    `public void add(Vector u)`
* public member function that multiplies this vector by a scalar (like `*=`):
    `public void scalarMultiply(double k)`
* public member function that computes and returns the dot product of this vector with
  another vector: `public double dotProduct(Vector u)`
* public member function that calculates the angle between this and another vector: 
    `public double angle(Vector u)`
  Hint: Use what you know from pre-calculus, together with `Math.acos()` and the
  `dotProduct` and `magnitude` functions above.

And yes, you guessed it, make sure to write a test class to verify that your
functions are all doing what they're supposed to be doing.


Note: The Unit 5 Quiz will consist of writing a class (but shorter than these
exercises, and no test class).  You will be responsible for writing the full
class declaration, including proper declaration of member variables and methods
(including constructors).

