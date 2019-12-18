#!/bin/bash
if [[ $# != 3 ]]; then echo argument: number_of_lab; exit; fi
files=$2/*
for f in $files
do
	lab=.*csci.*lab$1.*
	if [[ $f =~ $lab ]]
	then
		echo $1
		target=${f%.zip}
		echo this is first target: $target
		target=${target##$2/csci*lab$1}
		echo this is target: $target
		unzip $f -d $3/$target
	fi
done

exit 0
