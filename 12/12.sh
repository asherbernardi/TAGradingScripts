#!/bin/bash
cp ../*.java ../*.class .
javac *.java

java FileProcessor ../Ps132 | less
java FileProcessor ../Rev22 | less
java FileProcessor ../Rom12 | less

emacs -mm FileProcessor.java SIPair.java
