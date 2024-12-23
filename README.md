# Java Exercise

### Background

This app allows you to explicitly trace requirements, sources of bugs, 
bug fixes and new features, from their respective requirements/issue management systems 
to source code. 


### The Code 
The current project is a springboot app with maven build setup - Exposes the End point /api/traceability?id={BUG_ID}
 you could provide the bug id and get the class and method details where it is occured.
#### Currently only the Bug traceability has been implemented. This will be extended to scan BugFix, Feature in similar fashion

#### Sample Request
```
/api/traceability?id=BG_001
```
#### Sample Response
```
{
   "id":"BUG_001",
   "description":"this method is faulty",
   "className":"uk.co.svgc.interview.excerise.traceability.MyClass",
   "methodName":"methodOne"
}
```

The package:

```java
uk.co.svgc.interview.excerise.traceability.model
```

Contains a number of annotations and enums aimed at modelling the 
concepts required to address the problem.

```java
uk.co.svgc.interview.excerise.traceability.scanner
```

contains Scannerclasses which will scan for specific annotations in java classes in the current project and returns the details of where the bug/bugfix/ feature has been implemented
#### Currently only the BugScanner has been implemented. This will be extended to scan BugFix, Feature etc 

```java
MyClass
```

```java
MyClass2
```

Give examples of these annotations could/should be used.

#### Basic tests have been added to test MyClass 

## SETUP
1. clone the project
2. run 
   ```
   mvn clean install
   ```
3. run the springboot app via and IDE or on command line run the following command
   ```
   java -jar path_to_your_project/target/traceability-app-0.0.1-SNAPSHOT.jar
   ```
4. Run following command to generate API documentation
   ```
   mvn javadoc:javadoc
   ```
5. You can access the API documentation under **path_to_your_project/target/site/apidocs/index.html**





