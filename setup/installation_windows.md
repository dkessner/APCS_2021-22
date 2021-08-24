---
title: Software installation - Windows
layout: page
---

## Install Chocolatey

Chocolatey is a package manager for Windows, similar to Homebrew on Mac.

Read the instructions from Chocolatey website:  
[https://chocolatey.org/install](https://chocolatey.org/install)  

- open up admin command prompt
    - right click Start menu, select `Command Prompt (Admin)`

- from the command line run `powershell`

- copy/paste the installation command from the Chocolatey website to your
  command line
    
## Install Atom

```
choco install atom
```

## Install Java

```
choco install jdk8
```

Verify that you have Java 8 (version 1.8) installed:
```
java -version
javac -version
```

## Paths

If you installed something but can't access it from the command line, you
probably need to adjust your ```PATH``` system environment variable.

Navigate to Control Panel (System Properties) / Advanced and click the
Environment Variables button.  Or search for "Edit the System Environment
Variables".



