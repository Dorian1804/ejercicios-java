# Binary Search CLI

Sort integer arguments and locate a target using binary search.

## Origin

New learning implementation created in November 2026, revisiting foundational programming topics. This is not an exact reconstruction of a lost file.

## Requirements

JDK 8 or later; no external dependencies. Open this folder in VS Code, IntelliJ IDEA or NetBeans, or use a terminal.

## Compile and run

```powershell
javac -encoding UTF-8 -d out BinarySearch.java
java -cp out BinarySearch 7 9 3 7 1
```

Returns the zero-based index in the sorted array, or Not found. Sorting costs O(n log n); the search itself costs O(log n). With duplicate values, any matching sorted index may be returned.

## Files

- [BinarySearch.java](BinarySearch.java): executable class.

## Verification

Compilation and sample command-line execution checked in this portfolio update.
