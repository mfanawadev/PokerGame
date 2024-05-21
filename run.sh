#!/bin/bash

# Create bin directory if it doesn't exist
mkdir -p bin

# Compile the Java program into the bin directory
javac -d bin src/poker/classes/Card.java src/poker/classes/Deck.java src/poker/classes/HandEvaluation.java src/poker/Poker.java

# Navigate to bin directory
cd bin

# Run the Java program
java poker.Poker

# Navigate one directory up
cd ..

# Compile the test files 
javac -d bin -cp lib/junit-platform-console-standalone-1.9.3.jar:bin -sourcepath test test/poker/classes/CardTest.java test/poker/classes/DeckTest.java test/poker/classes/HandEvaluationTest.java

# Run the tests 
java -jar lib/junit-platform-console-standalone-1.9.3.jar --class-path bin --scan-class-path