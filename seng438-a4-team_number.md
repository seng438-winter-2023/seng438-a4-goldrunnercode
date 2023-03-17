**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#4 – Mutation Testing and Web app testing**


| Group \#: 29      |     |
| -------------- | --- |
| Student Names: |     |
| Evan                |   
| Abdullah            |   
| Jack                |   
| Max                 | 

# Introduction
We understand that mutation tests are needed because testing the validity of your tests is very important as you need to know that you can trust these tests to catch errors in the code. We understand that GUI testing is important as we need to be able to test our GUI's in a more efficient way than just exploratory testing and using something like Selenium will give us the tools to do so. 

# Analysis of 10 Mutants of the Range class 

Range Class Mutants
1.

public double getCentralValue() {
return (this.lower + this.upper) / 2.0;
}

Replacing the addition with subtraction results in a killed mutant

Ex. lower = 1 upper = 2

(1+2)/2 = 1.5
(1-2)/2 = -0.5

1.5 != -0.5, mutant killed

2.
Replacing the division with multiplication results in a killed mutant

Ex. lower = 1 upper = 2

(1+2)/2 = 1.5
(1+2)*2 = 6

1.5 != 6, mutant killed

3.
Replacing 2 with 1 results in a killed mutant

Ex. lower = 1 upper = 2

(1+2)/2 = 1.5
(1+2)/1 = 3

1.5 != 3, mutant killed

4.
public double getLength() {
if (lower > upper) {
String msg = "Range(double, double): require lower (" + lower
+ ") <= upper (" + upper + ").";
throw new IllegalArgumentException(msg);
}
return this.upper - this.lower;
}


Replacing the subtraction with addition results in a killed mutant

Ex. lower = 1 upper = 2

2-1= 1
2+1 = 3

1 != 3, mutant killed

5 and 6.

The Pit Mutation test created mutants for line 144 in the Range class. This class tests to see if the double value input is with the range of the class. The first mutation changes the conditional boundary of >= to >. The second mutation changes the other conditional boundary of <= to <. We didn't have a test for the contains function and therefore the mutant was not killed.

7 and 8.

The Pit Mutation test created mutants for line 90 in the Range class. The first mutation was to change the conditional boundary from > to >=. Our test suite survived this with our equals test because the function no longer threw an IllegalArgumentException instead of returning a value. The second mutation negated the condition entirely which our test suite survived with our rangedFlipped Bounds test which expected an illegalargumentexception.

9.
In the range constructor, the mutations test removed the assignment of the lower variable. This mutation was killed as illegal ranges are caught with our rangedFlipped Bounds test which expected an illegalargumentexception.

10.
removing the call to throw an illegalargumentexception caused our ranged flipped test to fail and allowed mutations to survive. This is because the test case was looking for errors and not exceptions.

# Report all the statistics and the mutation score for each test class

Data Utilities increased from 46% mutation coverage to 58%, an increase of 12%

Range increased from 8% to 19%, an increase of 11%


# Analysis drawn on the effectiveness of each of the test classes

For the utilities test we only tested 5 out of the 15 methods, because we only have 19% and we are trying to cover 33% of the methods we can assume that the mutation coverage is incomplete and would need more tests to further increase this score, including tests for the methods in range that went untested. For Datautilities we achieved a 58% coverage which is an alright score but it means that our tests are incomplete and we can increase our mutation score by adding more tests. 

# A discussion on the effect of equivalent mutants on mutation score accuracy
Equivelant mutants are mutants that produce the same behaviour as the original code so this can lead to almost an inflation of what your mutation coverage should actually be. This is because you are creating a mutant that isn't actually needed in your mutation testing but you are doing it anyway. But if your testing system isn't good enough they can actually lead to a lower score on your mutation testing and show you what you need to fix in your testing suite. 
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
We need mutation testing so that we can test the validity of the code abd it's ability to catch errors if the code is not working as we want it to. The advantages of mutation testing is that it improves the testing code which in turn improves the stability of the SUT it also can show some loopholes in the SUT that we could not identify before doing the mutation testing. The disadvantages are that mutation testing can't be used when you are doing blackbox testing and that it is time consuming if the test code is already up to standard it can be completely useless. Another disadvantage is if the code is complex it can be hard to analyze mutants generated. 

# Explain your SELENUIM test case design process
We are going to test several functions on the ikea canadian website: Best Prices Page, Gifting Page, Ikea Food, New at Ikea, and the Search Bar for each of the pages we are going to test navigating to different pages they are supposed to display and for the search function we will try the different data that you can search

# Explain the use of assertions and checkpoints
We use assertions to make sure that the function reaches the right page or the right search to confirm that we were succesfully to display the correct information.
# how did you test each functionaity with different test data
For each page there are different options of pages it should redirect you to so the different data that we used there was choosing different options. For the search function we tried both a search that should come up with options which was desk and a search that should not come up with options 40404.
# Discuss advantages and disadvantages of Selenium vs. Sikulix
Advantages of Selenium is that it is really easy to use as you can record most of the inputs that you want it to take and it will record those inputs for later use, you can then just add your assertion test cases. The disadvantage of using this is that it isn't really suitable for making large tests as making tests with recording is tedious. Another disadvantage is that it does not have any features for generating a report of the results. 

Sikulix the advantages are that it can work on just about anything you can get Sikulux to scrape just about anything that is on your screen including just ruunning through your own machine scraping for example your file explorer. The disadvantages are that it is a picture based system so if there are artifacts that look similar to one another the tests could fail just because the machine clicked the wrong button mistakenly.
# How the team work/effort was divided and managed
We split up the work for increasing the mutation testing and doing manual mutation looking Abduallah and Evan worked on DataUtilities and Jack and Max worked on Range. For the Selenium tests we each tested two of the pages or search function and the multiple data options for those functions

# Difficulties encountered, challenges overcome, and lessons learned
It was quite difficult to learn how to use sikulix as there are not many tutorials out there on how to learn how to use the tool. 
# Comments/feedback on the lab itself
Awesome lab! We had alot of fun learning about mutation testing and GUI testing 