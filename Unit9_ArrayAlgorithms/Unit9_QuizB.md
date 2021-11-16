__Unit 9 (Array Algorithms) Quiz B__  
__AP Computer Science 2021-22 / Dr. Kessner__  

\vspace{.1in}

```
{"hip", "hip"};  // hip hip array
```

### 1.  Find max

Write a function that takes an array of double values as input and returns
the maximum value.

```
findMax(({1.0, 2.1, 5.3})) -> 5.3
findMax(({0.0, -35.0, 90.1})) -> 90.1
```


\vspace{3in}


### 2.  Extract long names

Write a function that takes an array of Strings as input and returns an
ArrayList of the strings that are at least 5 letters long.

```
extractLong({"Dr. Kessner", "Dr. Sands", "Edna"}) -> ArrayList({"Dr. Kessner", "Dr. Sands"})
extractLong({"abcde", "bcde", "cdef", "defg"}) -> ArrayList({"abcde"})
```
\vspace{3in}


### 3.  First letters

Write a function that takes an ArrayList of strings as input and returns an
array of strings representing the first letters of the original strings.

```
first(ArrayList({"cat", "dog"})) -> {"c", "d"}
first(ArrayList({"duck", "goose", "turkey"})) -> {"d", "g", "t"}
first(ArrayList({"a", "b", "c", "d"})) -> {"a", "b", "c", "d"}
```

\vspace{3in}

### 4.  Arithmetic sequence terms

Write a function that takes a single integer `n` as input and returns an
array of integer values representing the first `n` terms of the arithmetic
sequence $1, 4, 7, 10, \ldots$.

```
arithmetic(1) -> {1}
arithmetic(2) -> {1, 4}
arithmetic(3) -> {1, 4, 7}
arithmetic(4) -> {1, 4, 7, 10}
...
```


---
geometry: margin=1in
---


