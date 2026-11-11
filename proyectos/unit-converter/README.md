# Unit Converter

Convert Celsius/Fahrenheit and kilometres/miles with explicit input validation.

## Origin

New learning implementation created in November 2026, revisiting foundational programming topics. This is not an exact reconstruction of a lost file.

## Requirements

JDK 8 or later; no external dependencies. Open this folder in VS Code, IntelliJ IDEA or NetBeans, or use a terminal.

## Compile and run

```powershell
javac -encoding UTF-8 -d out UnitConverter.java
java -cp out UnitConverter c-to-f 25
```

Supported operations: c-to-f, f-to-c, km-to-mi, mi-to-km. Values must be finite; distances cannot be negative. Temperature conversion is mathematical and does not validate physical temperature limits.

## Files

- [UnitConverter.java](UnitConverter.java): executable class.

## Verification

Compilation and sample command-line execution checked in this portfolio update.
