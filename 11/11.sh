#!/bin/bash
cp ../*.java ../*.class .
javac *.java
echo "TESTING TreeNode"
java TreeTest

echo "TESTING Interpreter"
echo "3 -> should return 3"
java Interpreter "3"
echo "(5+8) -> should return 13"
java Interpreter "(5+8)"
echo "((10/2)*3) -> should return 15"
java Interpreter "((10/2)*3)"
echo "((10*-2)-(0+3)) -> should return -23"
java Interpreter "((10*-2)-(0+3))"
