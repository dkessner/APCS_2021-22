__Unit 3 Quiz A (Strings)__  
__AP Computer Science 2021-22 / Dr. Kessner__  

```
99 little bugs in the code,
99 bugs in the code,
1 bug fixed...compile again,
100 little bugs in the code...
```

Note: Be sure to write a complete function declaration for each of these.


### 1. Counting

Write a function that takes two strings `name` and `thing` and an int `n`,
and returns a string declaring how many of that thing the person has.


```
bodyParts("Dr. Kessner", "finger", 10) -> "Dr. Kessner has 10 fingers!"
bodyParts("Mr. Octopus", "arm", 8) -> "Mr. Octopus has 8 arms!"
bodyParts("My cat", "live", 9) -> "My cat has 9 lives!"
```

\vspace{2.5in}


### 2. Fizzy

Given a drink name and number, we say that the drink is "Fizzy" if the number is
a multiple of 3.  Write a function that takes the name and number as input, and 
returns a string telling you whether the drink is Fizzy.

```
fizzy("Sprite", 3) -> "Fizzy"
fizzy("coffee", 5) -> "Not Fizzy"
fizzy("Root beer", 33) -> "Fizzy"
fizzy("Root beer", 34) -> "Not Fizzy"
```

\vspace{2.5in}


### 3. Tail Grab

Write a function that grabs and returns the substring representing the last 3 
characters of the input string.  Unless the string is "cat", in which
case return "Meow!".  If the string is less than 3 characters long, return the 
whole string.


```
grabTail("a") -> "a"
grabTail("aa") -> "aa"
grabTail("Dr. Kessner") -> "ner"
grabTail("tacocat") -> "cat"
grabTail("cat") -> "Meow!"
```


---
geometry: margin=1in
---


