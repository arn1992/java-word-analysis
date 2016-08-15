import java.util.Collections;
//import java.util.List;
 import java.lang.String;
import java.lang.StringIndexOutOfBoundsException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;

public class WordAnalysis
{
    public static void main (String[] args) throws FileNotFoundException
    {
      Scanner arn =new Scanner(System.in);
      int i=0;
  Scanner wordDataFile = new Scanner(new File("E:\\lol.txt"));

        ArrayList<String> wordData = new ArrayList<String>();

        while(wordDataFile.hasNextLine())
        {
            wordData.add(wordDataFile.nextLine());
        }
//        wordDataFile.close();
        System.err.println("ArrayList is unsort");
        for(String temp: wordData){
           
   System.out.println(temp);
  
   i++;
        }
         System.out.println("word number ="+i);
      Collections.sort(wordData);
 
  //after sorted
  System.err.println("ArrayList is sorted");
  System.out.println(wordData);
  System.err.println("Now Cheaking");
   String b=arn.nextLine();
     Character l[]=new Character[b.length()];
   
      for(int j=0;j<b.length();j++)
      {
                 l[j]=b.charAt(j);
      
  }for(String a:wordData)
    {
      if(a.length()==l.length){
    
     for(int k=0;k<l.length;k++)
  {
      if(l[k]!='*')
      {
        if(a.charAt(k)==l[k])
             {
          System.out.print(a+";");
            }
        else{
          System.out.print(" "+";");
           }
      }
        else{
      }

     }
   
      }
    else{
      System.out.print(" "+";");
}
    }
  }
}

    
  

      
  
  

  
    

    





