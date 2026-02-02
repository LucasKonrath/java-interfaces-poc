java-interfaces-poc

Purpose
- Minimal Java proof-of-concept demonstrating interfaces, default/static methods, multiple interface inheritance, and dependency injection via interfaces.

Requirements
- Java 17+ (works with Java 11+ if you remove the 'var' usage; this project avoids it).

Run (no build tool)
1) Compile:
   javac -d out src/main/java/poc/*.java
2) Run:
   java -cp out poc.Main

What to look at
- src/main/java/poc/Greeter.java: interface with default + static methods
- src/main/java/poc/TimeProvider.java: interface used for dependency injection
- src/main/java/poc/FriendlyGreeter.java + FormalGreeter.java: implementations
- src/main/java/poc/Loud.java + Polite.java: multiple interface inheritance via LoudPoliteGreeter
- src/main/java/poc/Main.java: runs demos
