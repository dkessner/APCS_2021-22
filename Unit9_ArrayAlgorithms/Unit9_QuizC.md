__Unit 9 (Array Algorithms) Quiz C__  
__AP Computer Science 2021-22 / Dr. Kessner__  

\vspace{.1in}

```
{"hip", "hip"};  // hip hip array
```

### 1.  Find min

Write a function that takes an ArrayList of double values as input and returns
the minimum value.

```
findMin(ArrayList({1.0, 2.1, 5.3})) -> 1.0
findMin(ArrayList({0.0, -35.0, 90.1})) -> -35.0
```


\vspace{3in}


### 2.  Filter D names

Write a function that takes an array of Strings as input and returns an
ArrayList of the strings that start with "d" or "D".

```
filterDNames({"Dr. Kessner", "Dr. Sands", "Edna"}) -> ArrayList({"Dr. Kessner", "Dr. Sands"})
filterDNames({"abcd", "bcde", "cdef", "defg"}) -> ArrayList({"defg"})
```
\vspace{3in}


### 3.  Transform strings

Write a function that takes an ArrayList of strings as input and returns an
array of integers representing the sizes of the strings in the input array.

```
sizes(ArrayList({"cat", "dog"})) -> {3, 3}
sizes(ArrayList({"duck", "goose", "turkey"})) -> {4, 5, 6}
sizes(ArrayList({"a", "b", "c", "d"})) -> {1, 1, 1, 1}
```

\vspace{3in}

### 4.  Geometric sequence terms

Write a function that takes a single integer `n` as input and returns an
ArrayList of double values representing the first `n` terms of the geometric
sequence $1, \frac{1}{2}, \frac{1}{4}, \frac{1}{8}, \ldots$.

```
geometric(1) -> ArrayList({1})
geometric(2) -> ArrayList({1, .5})
geometric(3) -> ArrayList({1, .5, .25})
geometric(4) -> ArrayList({1, .5, .25, .125})
...
```


---
geometry: margin=1in
---


