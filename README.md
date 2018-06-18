# Letter-Combinations-Of-Phone-Number
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.
 ('2', "abc");
 ('3', "def");
 ('4', "ghi");
 ('5', "jkl");
 ('6', "mno");
 ('7', "pqrs");
 ('8', "tuv");
 ('9', "wxyz");

 Input:Digit string "23"
 Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

 Note:
 Although the above answer is in lexicographical order, your answer could be in any order you want.

# Solution:

1. A string of numbers is received as function parameter. The return type is a List of strings which will hold all possible combinations of phone numbers.

2. loop through every character of the string and add mapping to a temporary list e.g number is "23" the tempList will get the values from hashMap as list = {"abc", "def"}

3. Loop through the tempList calling a helper function in which we will pass each string from tempList and a result List which will hold the results.

4. In helper function it is checked if the result is empty, if it is then each character of the string which is passed in is added in the result list

5. In case when the result list is not empty then each char of the string is concatenated with what we have in result list and result list is returned.
