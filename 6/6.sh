#!/bin/bash
javac *.java

echo -e "\n\t---RecursiveString---\n"
echo -e "---hello h : isAlphabetic = true  |  length = 5  |  contains = true  |  startsWith = true"
java RecursiveString hello h
echo -e "---hel1o 4 : isAlphabetic = false  |  length = 5  |  contains = false  |  isPalindrome = false  |  startsWith = false"
java RecursiveString hel1o 4
echo -e "---a a : isAlphabetic = true  |  length = 1  |  contains = true  |  equals = true  |  isPalindrome = true  |  startsWith = true  |  areSemordnilap = true"
java RecursiveString a a
echo -e "---hannah anna :contains = true  |  isPalindrome = true  |  startsWith = false"
java RecursiveString hannah anna
echo -e "---asher asher : contains = true  |  equals = true  |  startsWith = true"
java RecursiveString asher asher
echo -e "---asher ash : equals = false  |  startsWith = true"
java RecursiveString asher ash
echo -e "---oprah harpo : areSemordnilap = true"
java RecursiveString oprah harpo
echo -e "---oprahs harpo : areSemordnilap = false"
java RecursiveString oprahs harpo

emacs RecursiveString.java -mm &