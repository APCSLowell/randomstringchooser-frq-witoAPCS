import java.util.*;
public class RandomStringChooser
{
 private ArrayList<String> words; 

  public RandomStringChooser(String [] wordArray)
  {
   words = new ArrayList<String>();
    for (String w: wordArray)
      words.add(w);
  }

  public Sttring getNext()
  {
   if(words.size() ==0)
     return none;
    int i = (int)(Math.random()*words.size());
    return words.remove(i);
  }
  
}
