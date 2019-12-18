#!/bin/bash
javac *.java

echo -e "\n**TwoDArrayManip.java\n"
echo -e "**[1, 2, -4]\n  [10, 0, 0] -> avg = 1.5"
echo -e "2\n3\n1\n0\n0\n1\n1\n0\n1\n2\n1\n0\n2\n-4\n1\n1\n0\n10\n2\n3\n4\n5\n" | java TwoDArrayManip
echo -e "\n**No negatives: min/max"
echo -e "1\n3\n1\n0\n0\n5\n1\n0\n1\n10\n1\n0\n2\n15\n3\n4\n5\n" | java TwoDArrayManip
echo -e "\n**Long array"
echo -e "7\n7\n4\n5" | java TwoDArrayManip

echo -e "\n\n**StaticArrayManip\n"
echo -e "15\n6\n4\n2\n3\n5\n9\n" | java StaticArrayManip
echo -e "\n**Sorted Array: [-5, 3, 6, 47]"
echo -e "4\n1\n0\n-5\n1\n1\n3\n1\n2\n6\n1\n3\n47\n5\n9\n" | java StaticArrayManip
echo -e "\n**Almost Sorted: [3,5,4,6]"
echo -e "4\n1\n0\n3\n1\n2\n5\n1\n2\n4\n1\n3\n6\n5\n9\n" | java StaticArrayManip
echo -e "\n**One Element: [0]"
echo -e "1\n5\n9\n" | java StaticArrayManip
echo ""

emacs TwoDArrayManip.java StaticArrayManip.java -mm &

exit