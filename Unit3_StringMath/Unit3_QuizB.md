__Unit 3 Quiz B (Strings)__  
__AP Computer Science 2021-22 / Dr. Kessner__  

```
99 little bugs in the code,
99 bugs in the code,
1 bug fixed...compile again,
100 little bugs in the code...
```

Note: Be sure to write a complete function declaration for each of these.


### 1. Bottles

Write a function that takes an integer `n` and a type of drink (String), and
returns a string declaring how many bottles of that drink are on the wall.


```
bottles(99, "root beer") -> "99 bottles of root beer on the wall!"
bottles(3, "hydrochloric acid") -> "3 bottles of hydrochloric acid on the wall!"
```

\vspace{2.5in}


### 2. Prefix

Given a string and a number `n`, return the prefix string consisting of the first 
`n` letters of the given string, adding an exclamation point.  If the string
has fewer than `n` letters, return the whole string.


```
prefix("Happy Birthday", 2) -> "Ha!"
prefix("Good riddance", 4) -> "Good!"
prefix("Hello", 99) -> "Hello!"
```

\vspace{2.5in}


### 3. Buzzy

A string is "buzzy" if the length of the string is a multiple of 5.  Write a
function that takes a single string as input and returns a string indicating
whether the input string is buzzy or not.


```
buzzy("cat") -> "Not buzzy."
buzzy("hello") -> "Buzzy."
buzzy("blah") -> "Not buzzy."
```


---
geometry: margin=1in
---


