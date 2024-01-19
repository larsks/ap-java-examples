%.class: %.java
	javac $<

all: PigLatin.class Main.class

.PHONY: test
test: all
	java -ea Main
