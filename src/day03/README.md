# Array Binary Search
- Given a sorted array and a key value to search for, find the index of the key without using Java's built in functions

## Challenge
- Create a method that will take a sorted array of integers and a key to search for as parameters.
- Determine the middle index of the array and use this as a starting point.
- Without using Java's built in methods, test the index to the left to see if it is greater than the key, if it is, then move left and repeat the process, the inverse is true (move to the right) if the left index is less than the key.