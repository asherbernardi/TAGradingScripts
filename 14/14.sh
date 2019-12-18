#!/bin/bash
cp ../*.java ../*.jar .
javac -cp simulation.jar:. *.java

java -cp simulation.jar:. Sprites 
vim AddListener.java
vim OkListener.java
