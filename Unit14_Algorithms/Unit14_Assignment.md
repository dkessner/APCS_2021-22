---
title: Unit 14 - Algorithms
layout: page
geometry: margin=.75in
---

__Unit 14 (Algorithms) Assignment (Optional)__  
__AP Computer Science 2021-22 / Dr. Kessner__  

## Code exercises

Here are some optional fun code exercises to practice thinking about
algorithms.  Choose any that look interesting to you.  Make sure to write unit
tests to verify that your code is behaving the way you expect it to.

### Linear Search

Implement a linear search function.  Note: You have written similar functions
before, finding an object with a specified name in a list, for example.  In
this case you want to return the index into the array, not the object.

Example:
```
int find(int[] values, int searchValue);

find({1, 3, 5, 7}, 0) -> -1  // return -1 if searchValue is not found
find({1, 3, 5, 7}, 1) -> 0
find({1, 3, 5, 7}, 3) -> 1
find({1, 3, 5, 7}, 5) -> 2
find({1, 3, 5, 7}, 7) -> 3
```

### Sorting

* Implement selection sort.  Your function should take an ArrayList<Integer> as
  input, and return another ArrayList<Integer> with the same values sorted.

* Implement insertion sort.

* Implement bubble sort.

* Implement merge sort.


### Binary Search

Implement a binary search function.  Remember: the input list must be sorted in
order for this to work.

