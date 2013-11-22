Silk Bootstrap 
==============

A kick-start project template for programming with Silk.

### Usage

Download [tar.gz archive](https://github.com/xerial/silk-bootstrap/archive/master.tar.gz) or
[.zip](https://github.com/xerial/silk-bootstrap/archive/master.zip) of this project, then extract the contents.

Alternatively, you can run the following commands to extract the silk-bootstrap project:

```shell
$ mkdir myproject
$ cd myproject
$ curl -L https://github.com/xerial/silk-bootstrap/archive/master.tar.gz | tar xvz --strip-components=1
$ ./sbt -Dloglevel=debug
sbt> silk eval Sort:objectSort -N 100000
```

#### Creating IntelliJ project files

    sbt> gen-idea


#### Running a workflow while programming

    sbt> ~silk eval Sort:objectSort -N 100000


#### Running a workflow in Silk cluster

    # Edit $HOME/.silk/hosts file to list up node names to use
    # Start ZooKeeper and SilkClients
    $ silk cluster start
    # Check cluster status
    $ silk cluster

    # Run the distributed workflow in the cluster
    $ ./sbt -Dloglevel=debug
    sbt> silk eval --framework cluster Sort:objectSort -N 10000000 -M 20 -r 10


