---
title: Unit 12 - 2D Arrays
layout: page
geometry: margin=.75in
---

__Unit 12 (2D Arrays) Assignment__  
__AP Computer Science 2021-22 / Dr. Kessner__  

## Reading

* Eck Section 7.5 (2D Arrays)  
[http://math.hws.edu/javanotes/c7/s5.html](http://math.hws.edu/javanotes/c7/s5.html)

* Wikibooks Java (Arrays)  
[https://en.wikibooks.org/wiki/Java_Programming/Arrays](https://en.wikibooks.org/wiki/Java_Programming/Arrays)  

## Code exercises

Make sure to write test code (not necessarily full unit tests) to print the
contents of your arrays and demonstrate/verify they have the values you think
they have.

### Array initialization

a) Declare and initialize a 10x10 array of integers with 1 on the diagonal (i.e. where
`i == j`) and 0 everywhere else.

b) Declare and initialize a 2D array of Strings (any size).

c) Declare and initialize a 5x5 array of doubles with the following values.
You must use a loop.

```
    11.0  12.0  13.0  14.0  15.0
    21.0  22.0  23.0  24.0  25.0
    31.0  32.0  33.0  34.0  35.0
    41.0  42.0  43.0  44.0  45.0
    51.0  52.0  53.0  54.0  55.0
```

d) Declare and initialize a 6x5 array of integers with the following values.
You must use a loop.

```
    1 1 1 1 1
    2 2 2 2 2 
    3 3 3 3 3 
    4 4 4 4 4 
    5 5 5 5 5 
    6 6 6 6 6 
```

### Computations on 2D arrays

a) Write a function that takes a 2D array of integers as input and returns the smallest.

b) Write a function that calculates the sum of a 2D array of floats.

c) Write a function that takes a 2D array of Strings as input, and counts the
number of strings that start with the letter "A".

### 2D arrays of objects

a) Write a class Rectangle.  Include the following:

- private member variables for the name (String), width and height (doubles)
- a constructor that sets these member variables
- public accessor functions for the member variables
- public functions to calculate the perimeter and area

b) Write a function that takes a 2D array of Rectangle objects as input and
returns the average perimeter.

c) Write a function that takes a 2D array of Rectangle objects as input and
returns the object with the greatest area.

