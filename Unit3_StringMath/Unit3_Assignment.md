---
title: Unit 3 Assignment
layout: page
geometry: margin=.75in
---

__String & Math__  
__AP Computer Science 2021-22 / Dr. Kessner__   


## Reading

* [Eck Section 2.3.3 (Operations on Strings)](http://math.hws.edu/javanotes/c2/s3.html#basics.3.3) 

* Look at the online docs for the 
  [`String` class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html)
  (i.e. look at the intro, and skim down the list of functions to see what's
  available, find the functions we use in class).

* Look at the online docs for the 
  [`Math` class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html)


## Coding Bat practice

Do these exercises on [Coding Bat Warmup 1](http://codingbat.com/java/Warmup-1).

* nearHundred 
* missingChar 
* backAround 
* startHi 
* hasTeen
* mixStart 
* close10 
* monkeyTrouble 
* loneTeen 
* notString

Note:  There is nothing to turn in for this part.


## Code

1. Choose two of the above Coding Bat exercises involving the String class, and
   implement fully with at least 3 unit tests each.  

2. __Greetings.__ Write a function `greetings()` that takes a single String
   `name` and returns returns a greeting using the given name.  Be sure to
   include unit tests.

    Sample output:
```
    greetings("Dr. Kessner") -> "Hello, Dr. Kessner, how are you?"
    greetings("Ascii Cat") -> "Hello, Ascii Cat, how are you?"
    greetings("Sydneys") -> "Hello, Sydneys, how are you?"
```

3. __Attention.__  Write a function `attention()` that takes a single `String`
   as input and returns `true` if the string starts with "Hey, you!".  Be sure
   to include unit tests.

    Sample output:
```
    attention("Hello, my name is Inigo Montoya.") -> false
    attention("Excuse me, Dr. Kessner?") -> false
    attention("Hey you! Give me your code!" -> true
```

4. __Coin flip.__ Write a function that flips a coin randomly, returning a
   String, either "Heads" or "Tails".  Functions involving randomness are a
   little tricky to write unit tests for.  So you should just have your
   `main()` function print the results from 10 or 20 coin flips to try out your
   function.

5. __Die rolling__ Write a function that returns the result of rolling a single
   6-sided die.  In other words, when you call the function, it should randomly
   return 1, 2, 3, 4, 5, or 6.

Note: The Unit 3 Quiz will consist of writing functions involving Strings, like
\#2 and \#3 above, including complete function declarations.


