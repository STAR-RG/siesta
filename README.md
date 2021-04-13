# SIESTA

SIESTA stands for the Simple ImperativE SpecificaTion lAnguage, a minimalist specification language for expressing properties. It is built on top of Java, which is the programming language whose API properties we wanted to specify, and the language that lots of developers are familiar with. It includes the minimal number of features necessary to express various kinds of behavioral properties. We do *not* aim for generality.

This repository is organized according to the following structure: 

- the [`replication-package`](replication-package) folder contains the dataset of properties from PropertyDB, the language specification document, the applied questionnaires, and students' responses;
- the [`prototype`](prototype) folder contains the tool prototype for using the language. 
- the [`sample`](sample) folder contains a sample project already configured with the tool, specifying a particular property from our sample ([`StringBuilder_ThreadSafe`](https://github.com/runtimeverification/property-db/blob/master/annotated-java-api/java/lang/StringBuilder_ThreadSafe.mop)). 

## Setup Instructions

### Requirements
- Java 1.8
- Apache Commons Lang 3-3.1

### Executing SIESTA

Considering the [`sample`](sample) project, given the requirements, you only need to execute two commands in the command line: 
```
> ant ajmlc
> ant ajmlrac
```

If you wish to test a different scenario where the property is not violated, you can change the [`main.class`](https://github.com/STAR-RG/siesta/blob/d0ef1984077d50cea3a3dc28cdcf25d8a334ff5a/sample/StringBuilder%20Single%20Thread/build.xml#L38) property from the [`build.xml`](https://github.com/STAR-RG/siesta/blob/main/sample/StringBuilder%20Single%20Thread/build.xml) file in line 38 to `stringbuilderexample.StringBuilderSingleThreadDemo`.

## How to cite SIESTA

```
@inproceedings{TMR+:ICST2021,
	author = {Leopoldo Teixeira and Breno Miranda and Henrique Reb{\^{e}}lo and Marcelo d'Amorim},
	booktitle = {14th {IEEE} International Conference on Software Testing, Verification and Validation, {ICST} 2021, Virtual Event, April 12-16, 2021},
	title = {{Demystifying the Challenges of Formally Specifying API Properties for Runtime Verification}},
    publisher = {{IEEE}},
	year = {2021}
}
```