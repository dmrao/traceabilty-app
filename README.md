# Java Exercise

### Background

This app allows you explicitly trace requirements, sources of bugs, 
bug fixes and new features, from their respective requirements/issue management systems 
to source code. 


### The Code

The package:

```java
uk.co.svgc.interview.excerise.traceability.model
```

Contains a number of annotations and enums aimed at modelling the 
concepts required to address the problem.

```java
uk.co.svgc.interview.excerise.traceability.scanner
```

contains scanner classes which will scan for specific annotations in java classes in the current project
** Currently only the BugScanner has been implemented. This will be extended to scan BugFix, Feature etc **

```java
MyClass
```

```java
MyClass2
```

Give examples of these annotations could/should be used.

** Basic tests have been added to test MyClass **

### The Problem(s)

1. Introduce a build system
2. Document one of the annotations using JavaDoc
3. Get the build system to output javadocs
4. Add some placeholder unit tests for ```MyClass``` and ```MyClass2```
5. Add code to achieve the following:
    * Given a feature/bug/requirement id show if/how/where it is implemented
    * Display test coverage information for a given feature/bug/requirement
  
OR

1. Achieve the same outcome via a different route

The solution can be implemented in whatever way is deemed most appropriate
a command line solution is as valid as a web service.

### Presenting the solution

1. Share solution code at least 24 hours before the interview.
2. Make sure it is runnable with appropriate instructions for setting up - requiring
execution via an IDE is fine
3. Be prepared to present the solution via Teams and answer questions





