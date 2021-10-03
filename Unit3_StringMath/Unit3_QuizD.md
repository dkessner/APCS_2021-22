__Unit 3 Quiz D (Strings)__  
__AP Computer Science 2021-22 / Dr. Kessner__  

```
99 little bugs in the code,
99 bugs in the code,
1 bug fixed...compile again,
100 little bugs in the code...
```

Note: Be sure to write a complete function declaration for each of these.


### 1. Favorite number

Write a function that takes a String `name` and the person's
favorite number `n` as input.  Return a string describing the
situation (see example).


```
favoriteNumber("Dr. Kessner", 23) -> "Dr. Kessner's favorite number is 23."
favoriteNumber("29A", 0x29A) -> "29A's favorite number is 666."
favoriteNumber("Mrs. Witch", 13) -> "Mrs. Witch's favorite number is 13."
```

\vspace{2.5in}


### 2. Demanding

Given a string, return true if the string begins with "Give".  Otherwise
return false.  Make sure to check that the string is long enough before taking
a substring.

```
isDemanding("Give me $100.") -> true
isDemanding("Give me a break.") -> true
isDemanding("Please give me the answer to #3.") -> false
```

\vspace{2.5in}


### 3. HeadTail

Write a function that takes a single input string, and returns the string made
by the first two and last two characters of the input string.  If the input
string has less than two characters, return the original string.

```
headTail("abcdefghijklmnopqrstuvwxyz") -> "abyz"
headTail("Madam, I'm Adam") -> "Maam"
headTail("abc") -> "abbc"
headTail("ab") -> "abab"
headTail("a") -> "a"
...

```


---
geometry: margin=1in
---


