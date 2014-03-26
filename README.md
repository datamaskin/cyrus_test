cyrus_test
==========

This is the Cyrus CODE TEST JAVA completed on St. Patrick's day and emailed
as a .zip of this same repo for evaluation. See the README for the details.

This code test did not meet the standards of a Java Developer.

This is the README file as requested by the online instructions for submitting a
.zip file in response to the Cyrus CODE TEST JAVA web page.

The contents of this zip is as follows:
* CyrusTest.java (the Java main)
* PlayComparatorByLastname.java (Java Comparator class compare by last name)
* PlayerComparatorByGenderAndLastname.java (Java Comparator class to compare 
first by gender then by last name)
* Player.java (Basic getter/setter class with constructor instance represents
the basic player properties.
* ReadWriteTextFile.java (simple utility file to read the input files)
* StringUtils.java (simple utility file to clean up the read input)
* PlayerTest.java (a single junit test source file).
* space.txt (the input files are included but the same files may be used with a
valid relative path such as: ./code_test/input_files/)
* comma.txt
* pipe.txt
* junit-4.10.jar (junit jar used for the tests)
* README (this file)
* All .class files that correspond to .java source files.

To build all using the command-line with .java and .class files in the same 
directory since the default package was used:
javac -cp .:junit-4.10.jar *.java

To run the junit tests:
java -cp .:junit-4.10.jar org.junit.runner.JUnitCore PlayerTest

To run the CyrusTest.class main():
java -cp . CyrusTest space.txt comma.txt pipe.txt

NB: the input files must be in the order indicated above. If the input files
are referenced elsewhere the relative paths must accompany each input file on
the command-line.

OS: Ubuntu 13.10
JDK: 1.7.0_51

OS: Windows7 (Ubuntu VM)
JDK: 1.7.0_51

It is assumed the command-lines stated above will work in the Windows
environment by replacing the colons (:) with semi-colons (;).

It is assumed the JDK bin directory is in either the Windows or Ubuntu PATH
environment variable.

CyrusTest and PlayerTest classes were executed in both environments described
above.

How to contact: david@davidwbrown.name
