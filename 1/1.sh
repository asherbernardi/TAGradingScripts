#!/bin/bash
javac *.java
java PrintNumbers
java PrintNumbers
java PrintTens
java PrintTens
java FindNumbers
java FindNumbers
if [ -f FibNumbers.java ]
then
echo -e "\nYES!!! Fibonacci!\n"
java FibNumbers
fi
