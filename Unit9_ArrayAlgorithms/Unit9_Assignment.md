---
title: Unit 9 - Array algorithms
layout: page
geometry: margin=.75in
---

__Unit 9 (Array Algorithms) Assignment__  
__AP Computer Science 2021-22 / Dr. Kessner__  


## Reading and Project

Review anything about arrays or ArrayList you might be unsure about.
Continue work on your project.

## Code

Unit tests for the functions that return lists are optional (but recommended).
Practice using both for and for-each loops.

### Finding a maximum value

Write a function that takes an array of double values as input and returns
the maximum value.  Write unit tests for this one.

```
findMax(ArrayList({1.0, 2.1, 5.3})) -> 5.3
findMax(ArrayList({0.0, -35.0, 90.1})) -> 90.1
```

### Filtering a list

Write a function that takes an ArrayList of integer scores, and returns
an ArrayList representing the scores over 90.

```
filterGoodScores(ArrayList({51, 52, 53, 100})) -> ArrayList({100})
filterGoodScores(ArrayList({92, 89, 90, 99})) -> ArrayList({92, 99})
```

### Transforming a list 

(Re)write a `String reverse(String s)` function that returns the reverse of a
single string.  Then, using this `reverse()` function,  write a function
`reverseAll()` takes an array of Strings and returns a new array containing the
same strings, but with each string reversed. 

```
reverseAll({"abcd", "xyz"}) -> {"dcba", "zyx"}
reverseAll({"1234", "5678"}) -> {"4321", "8765"}
reverseAll({"racecar", "tacocat", "izzi"}) -> {"racecar", "tacocat", "izzi"}
```

### Constructing a sequence

Write a function that takes a single integer `n` and returns an array of integers
containing the first `n` terms of the Fibonacci sequence.

```
fibonacci(2) -> {1, 1}
fibonacci(3) -> {1, 1, 2}
fibonacci(4) -> {1, 1, 2, 3}
fibonacci(5) -> {1, 1, 2, 3, 5}
```

Bonus Challenge:  Write a function that returns the first `n` prime numbers in
an array or ArrayList.



## Bonus Code Exercises

These are some completely optional (but fun!) exercises to illustrate some
mathematical applications, using loops to calculate approximations to infinite
series.  These might be good ones to revisit during Winter Break (or any other
time) to keep your coding skills sharp!


### Approximating $\pi$

Write a function to approximate $\pi$ by using the following infinite series:
$$ \pi = 4 - \frac{4}{3} + \frac{4}{5} - \frac{4}{7} + \frac{4}{9} - \cdots $$

Your function should take a single integer `n` as input, representing the
number of terms to include in the sum:

`public double approximate_pi(int n);`

Note: This series converges very slowly, so you'll need a lot of iterations to 
get a good estimate of $\pi$ (e.g. ~ 1 million iterations for 5 decimal places).


### Approximating $e$

Write a function to approximate the natural exponential base $e = 2.718...$ by
using the following infinite series:
$$ e = 1 + 1 + \frac{1}{2!} + \frac{1}{3!} + \frac{1}{4!} + \cdots$$

Your function should take a single integer `n` as input, representing the
number of terms to include in the sum.  You will want to (re)write a factorial
function to use in the calculation of the sum.


### Math Lesson

For those of you who have studied Taylor expansions in calculus, this is where
these infinite series representations for $\pi$ and $e$ come from.

In particular, the formula for $e$ comes from the Maclaurin series for $e^x$
(evaluate at $x=1$):

$$
e^x = 1 + x + \frac{x^2}{2!} + \frac{x^3}{3!} + \frac{x^4}{4!} + \cdots
$$

The formula for $\pi$ comes from the Maclaurin series for $\tan^{-1}$:
$$
\tan^{-1}(x) = x - \frac{x^3}{3} + \frac{x^5}{5} - \frac{x^7}{7} + \cdots \\
$$

This series is known as the Madhava-Leibniz series, named after Madhava of
Sangamagrama, an Indian mathematician from the 14th century, and Gottfried
Leibniz, a German mathematician who is credited with developing calculus
independently from Isaac Newton, and who studied the same series in the 17th
century.

The Madhava-Leibniz series gives us an infinite series representation for
$\frac{\pi}{4}$ by evaluating at $x=1$:

$$ 
\begin{aligned}
\frac{\pi}{4}   &= \tan^{-1}(1) \\
                &= 1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \cdots
\end{aligned} 
$$ 

Multiplying both sides by 4 gives a formula for $\pi$.


### Approximating $\sin(x)$, $\cos(x)$, and $e^x$

Write functions to approximate $\sin(x)$, $\cos(x)$, and $\exp(x)$ using their
Taylor expansions:

$$
\begin{aligned}
\sin x &= x - \frac{x^3}{3!} + \frac{x^5}{5!} - \frac{x^7}{7!} + \cdots \\
\cos x &= 1 - \frac{x^2}{2!} + \frac{x^4}{4!} - \frac{x^6}{6!} + \cdots \\
e^x     &= 1 + x + \frac{x^2}{2!} + \frac{x^3}{3!} + \frac{x^4}{4!} + \cdots \\
\end{aligned}
$$

Your functions should take as input two variables: a double value `x`, and an
integer `n` representing the number of terms to include in the sum:

```
public double approximate_sin(double x, int n);  
public double approximate_cos(double x, int n);  
public double approximate_exp(double x, int n);  
```

You should test your functions with known values.  For example, you should test
your approximations for $\sin$ and $\cos$ at $x = 0, \frac{\pi}{6},
\frac{\pi}{4}, \frac{\pi}{3}, \frac{\pi}{2}$, where you can calculate
approximations using the `Math.sqrt()` function.


### Approximating $\sin(x)$, $\cos(x)$, and $e^x$ round two.

Of course, it's an extra burden for clients of your functions to have to
include the integer `n` to tell the function how many terms to include in the
approximation.  

It would be better to have your function automatically include as many terms as
is necessary to get a good approximation.  To implement this, you can
accumulate terms as usual until the size of the term falls below a certain
threshold.  For example, once the absolute value of the term falls below
`1e-6`, you know that your approximation is within `1e-6` of the actual value.


```
public double sin(double x);  
public double cos(double x);  
public double exp(double x);  
```


