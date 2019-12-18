#!/bin/bash
cp ../*.java .
javac *.java

echo -e "\n\tShapesDriver.java: triangle should have: Area = 1.984313483298443 and Perimeter = 7.0"
java ShapesDriver 2 2 3 2 2 3

echo -e "\n\tShapesDriver.java: triangle should have: Area = 8.181534085976786 and Perimeter = 21.0"
java ShapesDriver 10 2 9 10 2 9

emacs -mm Monkey.java Cat.java
