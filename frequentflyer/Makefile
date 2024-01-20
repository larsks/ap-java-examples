SRCS = $(wildcard *.java)
CLASSES = $(SRCS:.java=.class)

%.class: %.java
	javac $<

all: $(CLASSES)

.PHONY: test
test: all
	java -ea Main
