---
title: Unit 6 - Processing libraries
layout: page
---

Topics:
- `CLASSPATH`
- using the Processing libraries

[Assignment](Unit6_Assignment)


## Set your CLASSPATH

On Mac, if you installed Processing in your Applications folder, the
Processing library (.jar) files are in ```/Applications/Processing.app/Contents/Java/core/library/*```

Use the ```CLASSPATH``` environment variable so that ```javac/java```
can find the Processing .jar files.

```console
export CLASSPATH=".:/Applications/Processing.app/Contents/Java/core/library/*"
```

You will want to add this line to your shell initialization file, e.g.
```.bash_profile```, ```.bashrc```, or ```.zshrc``` depending on your setup.


## Hello Processing libraries!

[demo/Hello.java](demo/Hello.java)

```console
{% include_relative demo/Hello.java %}
```


