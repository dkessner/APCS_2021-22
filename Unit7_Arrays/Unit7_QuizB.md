__Unit 7 (Arrays) Quiz B__  
__AP Computer Science 2021-22 / Dr. Kessner__  

\vspace{.1in}

```
Why did the programmer quit his job?
Because he didn't get arrays.
```

### 1. Sum / Difference

Write a function that takes an array of integers as input and calculates the
sum of the numbers.  However, if a given number is odd, make it negative before
adding to the sum.  (In other words, you're calculating the sum of the even numbers
minus the sum of the odd numbers).

```
sumDifference({2, 3, 4}) -> 2 + (-3) + 4 = 3
sumDifference({5, 5, 5}) -> (-5) + (-5) + (-5) = -15
sumDifference({4, 3, 2, 1}) -> 4 + (-3) + 2 + (-1) = 2
```


\vspace{3in}


### 2. Liquid Water

Write a function that takes an array of temperatures (double, Fahrenheit) of
water samples, and returns the number of samples where the water is liquid 
($32 \leq \text{temperature} \leq 212$).


```
countLiquid({20.5, 30.5, 60.5}) -> 1
countLiquid({180.1, 70.0, 160.0}) -> 3
```

\vspace{3in}


### 3. Acronym

Write a function that takes an array of strings as input and returns a single string
consisting of the first letters of the strings.

```
acronym({"International", "Business", "Machines"}) -> "IBM"
acronym({"Pre", "Calculus", "Honors", "Accelerated"}) -> "PCHA"
acronym({"Three", "Letter", "Acronym"}) -> "TLA"
```


---
geometry: margin=1in
---


