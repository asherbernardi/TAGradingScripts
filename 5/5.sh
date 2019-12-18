#!/bin/bash
javac *.java

echo -e "\n\tFirstSort\n"
java FirstSort

echo -e "\n\tRecExamples\n"
java RecExamples

emacs FirstSort.java RecExamples.java -mm &