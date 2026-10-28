# Experiment 11 — JavaScript Program with Selenium Automation

## Files
`counter.html` is the JavaScript counter app. `CounterTest.java` opens the local page, increments twice, checks the count, resets, and checks zero.

## Run
Requires Java 17+, Maven, and Chrome:
```bash
mvn test
```

## Expected result
Maven reports `BUILD SUCCESS` with one passing test. Chrome runs headlessly, so no visible browser window is expected.
