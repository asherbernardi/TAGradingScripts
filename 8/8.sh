#!/bin/bash
javac *.java

echo -e "\n\tShapesDriver: 2.0; 6.0; 3.141592653589793; 6.283185307179586"

java ShapesDriver 1 2 1

echo -e "\n\tShapesDriver: 29.0; 33.0; 12.566370614359172; 12.566370614359172"
java ShapesDriver 2 14.5 2

emacs -mm Rectangle.java Circle.java
emacs -mm ShapesDriver.java

echo -e "\n\tComplex4Driver 2.0-2.0i | 0.0 | -2.0i | 1.0"
java Complex4Driver 1 -1 1 -1

echo -e "\n\tComplex4Driver 0.0 | -1.0-0.2i | -0.24-0.1i | -0.9999999+2.7755575E-17i"
java Complex4Driver -0.5 -0.1 0.5 0.1

echo -e "\n\tComplex4Driver 5.4-3.2i | -0.600001+0.8i | 4.79999999-8.39999999i | 0.73846153+0.0923076i"
java Complex4Driver 2.4 -1.2 3.0 -2.0

emacs -mm Complex4.java
