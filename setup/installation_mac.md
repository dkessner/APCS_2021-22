---
title: Software installation - Mac
layout: page
---

## Install Homebrew

The first step is to install Homebrew, which is a software package manager that
will help us install everything else we need.

- Go to the [Homebrew website](https://brew.sh/) and read the installation instructions.
- To install, you will copy/paste a command from their webpage to your Terminal.

You can install everything else with Homebrew, from the command line.


## Install Java

Install the Java Development Kit (JDK) from the Eclipse Foundation
(latest version, 16)
([info](https://formulae.brew.sh/cask/temurin)). 

```
brew install --cask temurin
```

Check that everything is installed properly: each of these commands should
report version 16.x.

```
javac -version
java -version
```

## Install Atom

[Atom](https://atom.io/) is a text editor.  If you already have a favorite text
editor, feel free to use that instead.

```
brew cask install atom
```




