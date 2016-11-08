scala-project
=========

A project template to start programming with Scala.

### Contents

scala-project includes:
- Sample Scala codes for Scala 2.11.8 with sbt-0.13.8

### Usage

Download [tar.gz archive](https://github.com/yukihirai0505/scala-project/archive/master.tar.gz) or [.zip](https://github.com/yukihirai0505/scala-project/archive/master.zip) of this project, then extract the contents.

Alternatively, you can run the following commands to extract the scala-min project:

    $ mkdir myproject
    $ cd myproject
    $ curl -sL https://github.com/yukihirai0505/scala-project/archive/master.tar.gz | tar xvz --strip-components=1 '*/src' '*build.sbt'


**Run tests**

    $ ./sbt test