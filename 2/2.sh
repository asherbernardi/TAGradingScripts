#!/bin/bash
javac *.java
echo -e "\n### Palindrome\n"

echo "o" | java Palindrome
echo "wow" | java Palindrome
echo "hannah" | java Palindrome
echo "hello" | java Palindrome
echo "text" | java Palindrome
echo "ttebt" | java Palindrome

echo -e "\n### BetterPalindrome\n"

echo "A man, a plan, a canal: Panama!" | java BetterPalindrome
echo "h2annah" | java BetterPalindrome
echo "o" | java BetterPalindrome
echo "race car" | java BetterPalindrome
echo "text" | java BetterPalindrome
echo "t!ext" | java BetterPalindrome

echo -e "\n### Pangram\n"

echo "The quick brown fox jumps over the lazy dog." | java Pangram
echo "Waltz, nymph, for quick jigs vex Bud." | java Pangram
echo "Bright vixens jump; dozy fowl quack." | java Pangram
echo "texttexttext" | java Pangram
echo "The quick brown fox jumps over the lazy do." | java Pangram
echo -e "\n"
