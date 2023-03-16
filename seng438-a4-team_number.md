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