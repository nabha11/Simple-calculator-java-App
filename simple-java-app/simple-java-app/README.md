# Simple Java App

A minimal Maven-based Java project demonstrating standard project structure,
a small `Calculator` class, and a JUnit 5 test.

## Folder Structure

```
simple-java-app/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── example/
    │               └── app/
    │                   ├── App.java
    │                   └── Calculator.java
    └── test/
        └── java/
            └── com/
                └── example/
                    └── app/
                        └── CalculatorTest.java
```

## Requirements
- Java 17+
- Maven 3.6+

## Build

```bash
mvn clean package
```

## Run

```bash
java -cp target/simple-java-app.jar com.example.app.App
```

Or, run directly with Maven:

```bash
mvn compile exec:java -Dexec.mainClass="com.example.app.App"
```

## Test

```bash
mvn test
```

## Expected Output

```
Simple Java Project
--------------------
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2.0
```
