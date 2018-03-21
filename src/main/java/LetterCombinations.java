/**

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
 */
package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

  public List<String> letterCombinations(String digits) {
    List<String> results = new ArrayList<>();
    if (digits.isEmpty() || digits.contains("0") || digits.contains("1"))
      return results;

    Map<Character, String> map = getMappings();
    List<String> listOfStrings = new ArrayList<>();
    for (char c : digits.toCharArray()){
      listOfStrings.add(map.get(c));
    }

    for (String str : listOfStrings){
      results = makeCombinations(str, results);
    }

    return results;
  }

  private List<String> makeCombinations(String str, List<String> list){
    List<String> result = new ArrayList<>();
    if (list.isEmpty()) {
      for (char c : str.toCharArray())
        result.add(Character.toString(c));
    }
    else{
      for (char c : str.toCharArray())
        for (String tempStr : list){
          tempStr += c;
          result.add(tempStr);
        }
    }
    return result;
  }

  private Map<Character, String> getMappings(){
    Map<Character, String> map = new HashMap<>();
    map.put('2', "abc");
    map.put('3', "def");
    map.put('4', "ghi");
    map.put('5', "jkl");
    map.put('6', "mno");
    map.put('7', "pqrs");
    map.put('8', "tuv");
    map.put('9', "wxyz");

    return map;
  }

}
