SRCS = $(wildcard *.java)
CLASSES = $(SRCS:.java=.class)

%.class: %.java
	javac -Xlint:unchecked $<

all: $(CLASSES)

.PHONY: test
test: all
	java -ea Main

clean:
	rm -f $(CLASSES)
