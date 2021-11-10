
JFLAGS = -g

default:
	@echo "'make clean' this command will removes *.class *~ files"
	@echo "'make compile' this command will compiles all Java files"
	@echo "'make demo' this command will runs simulator demo"


clean:
	rm -f bin/*.class
	rm -f src/*~
	rm -f *~


compile: *.java
	javac $(JFLAGS) *.java

demo: bin/Demo.class
	java -cp bin Demo
