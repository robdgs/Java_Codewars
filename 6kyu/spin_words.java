/*
Write a function that takes in a string of one or more words,
and returns the same string, but with all words that have five or
more letters reversed. 
Strings passed in will consist of only letters and spaces. 
Words will be separated by exactly one space. 
There will be no leading or trailing spaces.
 */
public class SpinWords {

    public String spinWords(String sentence) {
        String result = "";
        String word = "";
        String reversed = "";
        int count = 0;
        int i = 0;

        while (i <= sentence.length()) {

            boolean endOfSentence = (i == sentence.length());

            if (endOfSentence || sentence.charAt(i) == ' ') 
            {
                if (count >= 5)
                    result = result + reversed;
                else
                    result = result + word;

                if (!endOfSentence)
                    result = result + " ";
                word = "";
                reversed = "";
                count = 0;
            } 
            else 
            {
                char c = sentence.charAt(i);
                word = word + c;
                reversed = c + reversed;
                count++;
            }
            i++;
        }
        return result;
    }
}

//OR
import java.util.Arrays;

public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i=0; i<words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ",words);
  }
}