__Unit 9 (Array Algorithms) Quiz A__  
__AP Computer Science 2021-22 / Dr. Kessner__  

\vspace{.1in}

```
{"hip", "hip"};  // hip hip array
```

### 1.  Sum

Write a function that takes an array of double values as input and returns the
sum.

```
sum({1.0, 2.0, 3.0}) -> 6.0
sum({100.0, 100.0, 100.0}) -> 300.0
```


\vspace{3in}


### 2.  Extract high temperatures

Write a function that takes an array of temperatures (doubles) as input and
returns an ArrayList of the temperatures that are greater than 100.0.

```
extractHigh({87.0, 101.0, 99.0}) -> ArrayList({101.0})
extractHigh({50.0, 250.0, 350.0}) -> ArrayList({250.0, 350.0})
```
\vspace{3in}


### 3.  Last letters

Write a function that takes an array of strings as input and returns an
ArrayList of strings representing the last letters of the original strings.

```
last(ArrayList({"cat", "dog"})) -> {"t", "g"}
last(ArrayList({"duck", "goose", "turkey"})) -> {"k", "e", "y"}
last(ArrayList({"a", "b", "c", "d"})) -> {"a", "b", "c", "d"}
```

\vspace{3in}

### 4.  FizzBuzz terms

Write a function that takes a single integer `n` as input and returns an array
of the first `n` FizzBuzz strings: 
`{"1", "2", "Fizz", "4", "Buzz", "Fizz", 7, ...}`.
Note: You'll want to use the static function `Integer.toString()` to convert
integers to strings.

```
fizzBuzz(1) -> {"1"}
fizzBuzz(2) -> {"1", "2"}
fizzBuzz(3) -> {"1", "2", "Fizz"}
fizzBuzz(4) -> {"1", "2", "Fizz", "4"}
...
```


---
geometry: margin=1in
---


