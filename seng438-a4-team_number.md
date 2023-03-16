**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#4 – Mutation Testing and Web app testing**

| Group \#:      |     |
| -------------- | --- |
| Student Names: |     |
|                |     |
|                |     |
|                |     |

# Introduction


# Analysis of 10 Mutants of the Range class 

# Report all the statistics and the mutation score for each test class

# Analysis drawn on the effectiveness of each of the test classes

# A discussion on the effect of equivalent mutants on mutation score accuracy

# A discussion of what could have been done to improve the mutation score of the test suites
How did we go about developing new test cases?
We ran our original code as a Pit Mutation Test and proceeded to open up the .java files from the Pit Summary. At the bottom of the document there is a list of mutations that are either survived or killed. We would parse through this list and develop test cases to address different lines of code.

Data Utilities Mutation Coverage Increase:
Original: 46% Final: 58%

equalDoubleArrayCorrect(): Tests the equal function in DataUtilities to see if it can assert that two double arrays are equal.

unequalDoubleArrayCorrect(): Tests the equal function in DataUtilities to see if it can assert that two double arrays are unequal.

emptyDataSet(): Tests null as one of the values for the input of calculateColumnTotal. Should return zero.

emptyDataSet(): Tests null as one of the values for the input of calculateRowTotal. Should return zero.

Range Mutation Coverage Increase:

containsReturnTrue(): Tests to see if the contains function returns true if given a value within the range.

containsReturnsFalse(): Tests to see if the contains function returns false if given a value outside the range.

intersectsReturnsTrueLower(): Tests to see if the intersects function returns true if given two values that intersect with the lower bound.

intersectsReturnFalseLower(): Tests to see if the intersects function returns false if given two values outside the lower bound.

intersectsReturnsTrueUpper(): Tests to see if the intersects function returns true if given two values that intersect with the upper bound.

intersectsReturnFalseUpper(): Tests to see if the intersects function returns false if given two values outside the upper bound.

# Why do we need mutation testing? Advantages and disadvantages of mutation testing

# Explain your SELENUIM test case design process

# Explain the use of assertions and checkpoints

# how did you test each functionaity with different test data

# Discuss advantages and disadvantages of Selenium vs. Sikulix

# How the team work/effort was divided and managed


# Difficulties encountered, challenges overcome, and lessons learned

# Comments/feedback on the lab itself
