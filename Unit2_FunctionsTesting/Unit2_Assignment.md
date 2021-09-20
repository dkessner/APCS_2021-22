---
title: Unit 2 Assignment
layout: page
geometry: margin=.75in
---

__Functions and Testing__  
__AP Computer Science 2021-22 / Dr. Kessner__   

## Reading

* Eck Section 3.1 Blocks, Loops, and Branches
    ([http://math.hws.edu/javanotes/c3/s1.html](http://math.hws.edu/javanotes/c3/s1.html))
* Eck Section 3.5 The `if` statement
    ([http://math.hws.edu/javanotes/c3/s1.html#control.1.3](http://math.hws.edu/javanotes/c3/s1.html#control.1.3))
* Supplemental: Wikibooks Java (Statements, Conditional blocks, Loop blocks, Boolean expressions)
    [https://en.wikibooks.org/wiki/Java_Programming](https://en.wikibooks.org/wiki/Java_Programming)


## Coding Bat

Do these five exercises on 
Coding Bat Warmup 1
([http://codingbat.com/java/Warmup-1](http://codingbat.com/java/Warmup-1)).

* diff21 
* parrotTrouble 
* makes10 
* posNeg 
* icyHot

Note:  There is nothing to turn in for this part.  These Coding Bat exercises
are really good practice, so feel free to come back to them periodically.


## Code

1. Choose two of the above Coding Bat exercises to implement and test on your
   own.  Your class should include the function, a testing function, and
   multiple tests in `main()`.

   For example, if you pick `diff21`, you should write a class named `Diff21`
   in a file `Diff21.java`.  The class should include a `static` function
   named `diff21()`, and a function named `testDiff21()`.  You should call
   the test function on multiple inputs in `main()`.

2. A person is a vampire if she is asleep during waking hours (6:00 to 22:00),
   or awake during sleeping hours (before 6:00 or after 22:00).  Write a class
   with a static function `boolean isVampire(float hour, boolean awake)` where
   `hour` is the time represented as a `float` (e.g. 6.5 means 6:30), and
   `awake` represents whether the person is awake, returning `true` if that
   person is a vampire.  Be sure to write a unit test function and a few 
   tests.

3. A store has marked down the prices of many items, but you only want to buy
   something if the discount is more than 25% (or in other words, the sale
   price is < 75% of the original price).  Write a function `boolean
   goodDeal(double originalPrice, double salePrice)` that returns true if
   you're getting a good deal on the item.  Be sure to write a test function
   and several tests.

Note: The Unit 2 Quiz will consist of problems similar to #2 and #3, but you
will be asked to write code for only the specified function, not the testing
function or unit tests.

## Bonus Exercise

Write a program to print the prime numbers.  

To do this, first write a function `isPrime()`:
```
static boolean isPrime(int n)
{
    // return true <-> n is prime
}
```

Then in your `main()` function, loop through the first 100 integers and
print only the ones for which `isPrime()` returns true.

