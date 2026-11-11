# Text Inspector

Count words, Unicode code points, letters and digits, and check normalized palindromes.

## Origin

New learning implementation created in November 2026, revisiting foundational programming topics. This is not an exact reconstruction of a lost file.

## Requirements

JDK 8 or later; no external dependencies. Open this folder in VS Code, IntelliJ IDEA or NetBeans, or use a terminal.

## Compile and run

```powershell
javac -encoding UTF-8 -d out TextInspector.java
java -cp out TextInspector "Anita lava la tina"
```

Words are whitespace-separated tokens. The palindrome check ignores accents, punctuation and case. Code points are not the same as user-perceived characters for combining sequences and emoji.

## Files

- [TextInspector.java](TextInspector.java): executable class.

## Verification

Compilation and sample command-line execution checked in this portfolio update.
