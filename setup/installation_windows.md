---
title: Software installation - Windows
layout: page
---

## Install Chocolatey

Chocolatey is a package manager for Windows, similar to Homebrew on Mac.

Read and follow the instructions from Chocolatey website (carefully!) to
install:
[https://chocolatey.org/install](https://chocolatey.org/install)  
   

## Install Java

```
choco install openjdk
```

Check that everything is installed properly: each of these commands should
report version 16.x.

```
java -version
javac -version
```


## Install Atom

[Atom](https://atom.io/) is a text editor.  If you already have a favorite text
editor, feel free to use that instead.

```
choco install atom
```

## Paths

If you installed something but can't access it from the command line, you
probably need to adjust your ```PATH``` system environment variable.

Navigate to Control Panel (System Properties) / Advanced and click the
Environment Variables button.  Or search for "Edit the System Environment
Variables".



## Create a GitHub account

[GitHub](https://github.com/) hosts code repositories for software projects.
We will be using GitHub for sharing code.

Please make an account and email me your account name.


## Install GitHub Desktop

[GitHub Deskop](https://desktop.github.com/) is a desktop application
that facilitates interacting with repositories on GitHub.

```
choco install github-desktop
```

