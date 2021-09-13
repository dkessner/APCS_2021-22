---
title: Unit 1 Assignment
layout: page
geometry: margin=.75in
---
__Java Basics__  
__AP Computer Science 2021-22 / Dr. Kessner__  

## Reading

You will not be quizzed on the readings.  The Unit 1 quiz next week (and
every quiz from now on) will be based on the code exercises in the
assignment.

On a first reading, you do not need to remember all the details.  You just
need to know how to look up the details when you need them.  As we progress,
I will assume that you have read the assigned chapters, so you may need to go
back to these readings to refresh your memory.  As you write more code, you
will start to internalize the details and you won't have to look up so many
things.


* Eck Section 2.1
    [http://math.hws.edu/javanotes/c2/s1.html](http://math.hws.edu/javanotes/c2/s1.html)

* Eck Section 2.2
    [http://math.hws.edu/javanotes/c2/s2.html](http://math.hws.edu/javanotes/c2/s2.html)

* Supplemental: Wikibooks Java Programming
    [https://en.wikibooks.org/wiki/Java_Programming](https://en.wikibooks.org/wiki/Java_Programming)

* Optional background reading: Eck Chapter 1 
    [http://math.hws.edu/javanotes/c1/index.html](http://math.hws.edu/javanotes/c1/index.html)


## Code

Use the demo code to do these exercises.  The Unit 1 quiz will consist of
similar exercises that you will write out by hand.  On the quiz you will need
to write the body of a given `main` function (i.e. the code between the braces
`{}`).  At this point, you do _not_ need to be able to write the declaration of
the class (`public class Blah`) or the declaration of the `main` function
(`public static void main(String[] args)`), but you will in the future.

__Important__:   Don't let yourself get stuck!  If you get frustrated, step
away from the keyboard.  Then try again when you're fresh, or ask a classmate
for help, or ask me.  I'm here to help you!  

If you struggle on an exercise, do it again the next day, and again until you
can do the exercise without hesitation.  Have you allocated time in your
schedule to write some code every day?


### 1. Multiples of 3

Write a program that prints the first 10 multiples of 3.  You should write a
class `MultiplesOf3` in a file `MultiplesOf3.java` 


### 2. FizzBuzz

Write a FizzBuzz program.  Your class should be named `FizzBuzz` and your
source file should be named `FizzBuzz.java`.

Your program should iterate through the first 30 positive integers, printing
each one.  However, if the integer $n$ is a multiple of 3, print `Fizz` instead
of the number.  And if $n$ is a multiple of 5, print `Buzz` instead.  And if
$n$ is a multiple of both 3 and 5, print `FizzBuzz` instead.

Sample output:
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
.
.
.
```

### 3. Geometric sequence

Write a program `Geometric.java` that prints out the first terms of a geometric
sequence, i.e. a sequence with a common ratio, for example: 3, 6, 12, 24, 48,
...


### 4. Cubes

Write a program `Cubes.java` that prints out the cubes of the counting numbers:
0, 1, 8, 27, 64, 125, ...


### 5. Fibonacci sequence

Write a program `Fibonacci.java` that prints out the first 30 terms of the
Fibonacci sequence: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

_Hint_: I find it easiest to think about this problem using 3 variables: $a$
and $b$ slide up the sequence, and we use a temporary variable $c$ to help do
this.

_Challenge_: After you've done this exercise, try doing it using only 2
variables.

_Challenge_: Try printing out the ratios of successive terms of the Fibonacci
sequence.  The sequence of ratios approaches a limit - do you recognize what
this limit is?

