#!/bin/bash
cp ~/cs235/lab8/gc.jar .

javac *.java

echo -e "\n\tFraction\n"
echo "1/2 (0.5 as double)  |  -1/2 (-0.5 as double)  |  0/1  |  1/1  |  -1/4  |  -1/1"
java FractionsDriver 1 2 20 -40
echo ''
echo "3/4 (0.75 as double)  |  7/8 (0.875 as double)  |  13/8  |  -1/8  |  21/32  |  6/7"
java FractionsDriver 3 4 14 16

emacs -mm Fraction.java

java -cp .:gc.jar GC

emacs -mm GameClock.java