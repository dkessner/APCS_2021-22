---
title: Unit 10 - Lists of objects
layout: page
geometry: margin=.75in
---

__Unit 10 (Lists of Objects) Assignment__  
__AP Computer Science 2021-22 / Dr. Kessner__  

## Coding Project

This semester we will have a lot more time for you to work on your projects.
Please start a project management document for your project.  This could be a
text file in your project folder, or a shared doc -- whatever works for you.
This document is for you to keep track of everything related to your project,
so you can organize it however you like.  A project management document is
useful whether you are working on a project alone or with collaborators.  I
recommend that you include at least the following:

* Task list: List your immediate next steps.  Each task should be relatively
  small (no more than 1 hour of coding), such as "add title screen" or "fix
  glitch that makes player's head fall off".

* Project TODO list: List all major features you want to include in your
  program, and prioritize them.

You can also include notes for things like user feedback, potential ideas for
new features, implementation notes, design decisions, or whatever else is
useful to you.

You should plan on updating this document whenever you work on your project.
Every time you sit down to work:

* Make sure your project builds and runs as you expect, before making changes.

* Do the task at the top of your task list.

* Make sure your project builds and runs properly, then check in the changes to
  your repository.

* Re-prioritize your list: add any new tasks, and re-order so your most
  important tasks are at the top of the list.  Periodically look to see where
  you are on your main Project TODO list.


## Reading

Review classes and objects:

* Eck Sections 5.1-3 (Objects and Classes)
[http://math.hws.edu/javanotes/c5/index.html](http://math.hws.edu/javanotes/c5/index.html)

* Wikibooks Java
[https://en.wikibooks.org/wiki/Java_Programming/Defining_Classes](https://en.wikibooks.org/wiki/Java_Programming/Defining_Classes)


## Code exercises

### Items

a) Write a class Item, representing a single item you can buy at a store.
   You should include:
    - private member variables for the name (String) and price (float) of the item
    - a constructor that sets these member variables
    - public accessor functions for the member variables

b) Write a class ItemCalculator that calculates various things about a list of
Item objects.  Include these functions:
    - a function that takes an ArrayList of Item objects as input, and prints the
      names and prices of the items in the list (returns nothing)
    - a function that takes an ArrayList of Item objects as input, and returns  
      the average price of the items
    - a function that takes an ArrayList of Item objects as input, and returns the
      name of the most expensive Item

c) Write unit tests for all ItemCalculator functions that return a value, to
demonstrate that the functions are working correctly.  These tests can be
written in the ItemCalculator class, or in an external ItemCalculatorTest
class.


### Persons

a) Write a class Person, including:
    - private member variables for the person's name (String) and number of pets (int)
    - a constructor that sets these member variables
    - public accessor functions for the member variables

b) Write a class PersonStats that calculates various things about lists of
Person objects.  Include three functions:
    - a function that takes an ArrayList of Person objects, and calculates the average
      number of pets
    - a function that takes an ArrayList of Person objects, and returns the name of the
      person with the most pets
    - a function that takes an ArrayList of Person objects, and returns an ArrayList
      of Person objects representing those people who have at least 2 pets.

c) Write unit tests for all PersonStats functions that return a value, to
demonstrate that the functions are working correctly.  These tests can be
written in PersonStats, or in an external PersonStatsTest class.


