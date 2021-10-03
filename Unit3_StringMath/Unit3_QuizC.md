__Unit 3 Quiz C (Strings)__  
__AP Computer Science 2021-22 / Dr. Kessner__  

```
99 little bugs in the code,
99 bugs in the code,
1 bug fixed...compile again,
100 little bugs in the code...
```

Note: Be sure to write a complete function declaration for each of these.


### 1. Greetings

Write a function that takes a name (String) as input and returns the greeting string
"Hello (name), how are you?", replacing (name) with the input string.

Sample output:
```
greeting("Dr. Kessner") -> "Hello Dr. Kessner!"
greeting("world") -> "Hello world!"
```
\vspace{2.5in}


### 2. Lots of cats

Write a function that takes a String `name` and an integer `numberOfCats` as input.
If `n` is more than 5, return "(name) has a lot of cats!".  Otherwise return 
"(name) has (numberOfCats) cats.";
Note: replace (name) and (numberOfCats) with the input variables.

```
howManyCats("Dr. Kessner", 2) -> "Dr. Kessner has 2 cats."
howManyCats("That crazy cat lady", 10) -> "That crazy cat lady has a lot of cats!"
```
\vspace{2.5in}


### 3. Demanding

Given a string, return true if the string ends with "now!"  Otherwise return
false.  Make sure to check that the string is long enough before taking a
substring.

```
isDemanding("Give me $100 now.") -> false
isDemanding("Give me $100, now!") -> true
isDemanding("Give me a break.") -> false
isDemanding("Please give me the answer to #3 now!") -> true
```


---
geometry: margin=1in
---


