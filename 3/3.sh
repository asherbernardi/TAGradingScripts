#!/bin/bash
javac *.java

echo -e "\nTask #1\n"
echo -e "* 10 20 30:"
echo -e "3\n1\n0\n10\n1\n2\n30\n1\n1\n20\n4\n2\n3\n5\n" | tee /dev/tty | java ArrayManip
echo -e "\n* 0 0 0 0 0 -1 6:"
echo -e "7\n1\n6\n7\n1\n5\n-1\n4\n2\n3\n5\n" | java ArrayManip
echo -e "\n* Many:"
echo -e "50\n4\n5\n" | java ArrayManip

echo -e "\nTask #2\n"
java Sieve

emacs *.java &
