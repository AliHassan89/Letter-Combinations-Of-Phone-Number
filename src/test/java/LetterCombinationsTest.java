package test.java;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;
import main.java.LetterCombinations;
import org.junit.Test;

public class LetterCombinationsTest {

  private LetterCombinations lc = new LetterCombinations();

  @Test
  public void letterCombinations_testForEmptyInput(){
    //given
    String digits = "";

    //when
    List<String> results = lc.letterCombinations(digits);

    //then
    List<String> emptyList = new ArrayList<>();
    assertThat(results, equalTo(emptyList));
  }

  @Test
  public void letterCombinations_testForUnAllowedDigits(){
    //given
    String digits = "12345";

    //when
    List<String> results = lc.letterCombinations(digits);

    //then
    List<String> emptyList = new ArrayList<>();
    assertThat(results, equalTo(emptyList));
  }

  @Test
  public void letterCombinations_testForSingleDigit(){
    //given
    String digits = "2";

    //when
    List<String> results = lc.letterCombinations(digits);

    //then
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    assertThat(results, equalTo(list));
  }

  @Test
  public void letterCombinations_testForMultipleDigits(){
    //given
    String digits = "23";

    //when
    List<String> results = lc.letterCombinations(digits);

    //then
    List<String> list = new ArrayList<>();
    list.add("ad");
    list.add("bd");
    list.add("cd");
    list.add("ae");
    list.add("be");
    list.add("ce");
    list.add("af");
    list.add("bf");
    list.add("cf");
    assertThat(results, equalTo(list));
  }

}
