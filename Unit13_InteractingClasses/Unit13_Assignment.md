---
title: Unit 13 - Interacting classes
layout: page
geometry: margin=.75in
---

__Unit 13 (Interacting Classes) Assignment__  
__AP Computer Science 2021-22 / Dr. Kessner__  

## Code exercises

Make sure to write test code (not necessarily full unit tests) to make sure
your functions are behaving properly.

### ShapeCollection

a. Write a Shape class, with private variables for name and number of sides,
constructor, and accessor functions.

b. Write a ShapeCollection class, which has a private ArrayList of Shape objects.
Include the following:

    * a function to add a shape to the collection

    * a function that takes a shape name as input, looks up the shape object by
      name, and returns the number of sides of the named shape: 
      `int numberOfSides(String shapeName)`

    * a function that returns the average number of sides of the shapes in the collection

    * a function that returns an ArrayList of the shapes with an even number of sides

### AcademicClass

a. Write a Student class, with private variables for name and favorite number
(integer), including constructor and accessor functions.

b) Write a Teacher class, with private variables for name and subject,
including constructor and accessor functions.
    
c) Write a `class AcademicClass`, representing a course you take in school.
The AcademicClass should have a private variable for the teacher, and a private
ArrayList of students.  Either include the teacher in the constructor or write
a setTeacher() function.  Also include the following:
        
    * a function to add a student to the list

    * a function that prints info about the class (i.e print the teacher and
      all student names.
       
    * a function that takes a single integer `n` as input and returns an
      ArrayList of the names of the students whose favorite number is `n`

    * a function that returns an ArrayList of the names of the students whose
      favorite number is odd
