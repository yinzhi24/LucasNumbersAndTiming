
# Recursive Combinatorics and Sequence Analysis (Java)

## Overview
This project explores recursive mathematical sequences and combinatorial enumeration techniques, focusing on exponential growth behavior and subset analysis.

It includes:

1. Lucas Number computation
2. Empirical runtime analysis of recursive sequences
3. Enumeration of combinations within a structured magic square

Together, these programs demonstrate foundational ideas in:

- recursion
- exponential complexity
- combinatorics
- mathematical pattern analysis
- empirical performance measurement

---

## Components

### LucasNumbers.java
Implements the Lucas sequence, a recursive integer sequence closely related to Fibonacci numbers.

Lucas numbers follow the recurrence relation:

L(n) = L(n−1) + L(n−2)

with base cases:

L(0) = 2  
L(1) = 1

Concepts demonstrated:
- recursion
- recurrence relations
- mathematical sequences
- exponential growth patterns

---

### LucasTiming.java
Measures execution time of recursive Lucas number computation in order to empirically observe exponential runtime growth.

The program computes:
- Lucas sequence values
- runtime per input size
- ratio between successive values
- ratio between successive runtimes

The output illustrates exponential time complexity approximately proportional to:

O(φⁿ)

where φ ≈ 1.618 (golden ratio).

Concepts demonstrated:
- empirical complexity analysis
- exponential runtime measurement
- growth rate comparison
- recursive performance evaluation

---

### MagicSquareCombinations.java
Enumerates combinations of values derived from a structured magic square using subset generation via bitmask enumeration.

The program:

- flattens a magic square into a 1D representation
- enumerates all possible subsets using binary masking
- counts combinations that sum to the magic constant
- identifies the sum that can be produced in the greatest number of ways

Total subsets evaluated:

2ⁿ

where n is the number of cells in the square.

Concepts demonstrated:
- combinatorial enumeration
- bitmask subset generation
- frequency analysis of sums
- exponential search space exploration

---

## Algorithms and Concepts Demonstrated

### Recursion
Direct implementation of recurrence relations using self-referential functions.

### Exponential Complexity
Empirical observation of exponential growth in recursive algorithms.

### Combinatorics
Enumeration of subsets using binary masks.

### Mathematical Modeling
Analysis of numerical patterns arising from structured systems.

### Performance Measurement
Comparison of theoretical growth behavior with measured runtime.

---

## Project Structure

src/
├── LucasNumbers.java
├── LucasTiming.java
├── MagicSquareCombinations.java

---

## How to Run

### Compile
javac LucasNumbers.java
javac LucasTiming.java
javac MagicSquareCombinations.java

---

### Run Lucas Number Generator
java LucasNumbers

Outputs the Lucas sequence up to a specified term.

---

### Run Lucas Runtime Analysis
java LucasTiming

Outputs:
- Lucas values
- runtime measurements
- growth ratios

---

### Run Magic Square Combination Analysis
java MagicSquareCombinations

Outputs:
- number of combinations summing to the magic constant
- distribution of subset sums
- most frequent achievable sum

---

## Technical Summary

| Component | Technique |
|----------|----------|
| Lucas sequence | recursive recurrence |
| runtime analysis | empirical timing measurement |
| subset enumeration | bitmask combinatorics |
| complexity behavior | exponential growth |
| search space size | O(2ⁿ) |

---

## Example Applications

Recursive sequence analysis:
- algorithm complexity education
- mathematical modeling
- growth rate comparison

Subset enumeration:
- combinatorial optimization
- constraint satisfaction problems
- statistical distribution analysis

Magic squares:
- mathematical recreation
- symmetry analysis
- structured combinatorics

---

## Author
Daniel Yin
