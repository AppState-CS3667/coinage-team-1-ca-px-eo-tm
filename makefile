
JFLAGS = -g

default:
	@echo "'make clean' this command will removes *.class *~ files"
	@echo "'make compile' this command will compiles all Java files"
	@echo "'make Demo' this command will runs simulator demo"


clean:
	rm -f bin/*.class
	rm -f src/*~
	rm -f *~


compile: *.java
	javac $(JFLAGS) *.java

Demo: Demo.java
	javac Demo.java
	java Demo
