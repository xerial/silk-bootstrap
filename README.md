Silk Bootstrap 
==============

A kick-start project template for programming with Silk.

### Usage

Download [tar.gz archive](https://github.com/xerial/silk-bootstrap/archive/master.tar.gz) or
[.zip](https://github.com/xerial/silk-bootstrap/archive/master.zip) of this project, then extract the contents.

Alternatively, you can run the following commands to extract the scala-min
project:

```shell
$ mkdir myproject
$ cd myproject
$ curl -L https://github.com/xerial/silk-bootstrap/archive/master.tar.gz | tar xvz --strip-components=1
$ ./sbt silk eval HelloSilk:wordCount README.md 
```


**Create IntelliJ project files**

    $ ./sbt gen-idea
