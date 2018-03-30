all : doc
	javac *.java
	javac geometrie/*.java

doc : 
	javadoc -charset utf8 -d doc/ *.java geometrie/*.java

clean :
	rm -rf doc *.class *~ geometrie/*.class geometrie/*~
