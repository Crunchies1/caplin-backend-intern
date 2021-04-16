# Caplin Test 

### Thoughts

I enjoyed the project and wished that I could do more to extend the class functionality. 

## Getting Started

All you need to get the program to run:

*You need the JDK runtime environment or an IDE which can run Java programs.* 

Clone the repository, the cd into it. After that run the following two lines.
```bash
javac Main.java
java Main
```

## Decisions and Interpretations

I decided to count all strings separated by whitespace as potential words which I could take the first letter found as the leading letter. However, there were some words with leading numbers, then a file extension such as ".zip". This meant that the leading letter would be taken as Z. I thought that this would be unusual, as this shouldn't be counted as a word with a leading letter, so I did not allow strings with leading numbers to be counted. 

The reason I chose Java to solve this problem was because I thought it would lead to a nice object oriented solution that wouldn't be overly complex. I did consider learning Kotlin in order to solve this exercise, but with the time constraints I decided against it. (The reason I considered it is because Kotlin has additional features and benefits that Java does not have.)