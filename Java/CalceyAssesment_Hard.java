
import java.util.*; 
import java.io.*;
import java.util.ArrayList;
class CalceyAssesment_Hard {

  public static String GasStation(String[] strArr) {
    // code goes here  
    int gasStationsCount=Integer.parseInt(strArr[0]);
    ArrayList<String> str2 = new ArrayList<String>(); 

    for(int i=1; i<strArr.length; i++)
    {
      str2.add(strArr[i]);
    }
    
    
    for(int i=1; i<str2.size(); i++)
    {
      int startIndex=i, count=0,  gasInput=0;

      while(count<str2.size())
      {
        String[] station = str2.get(startIndex).toString().split(":");
        gasInput+=Integer.parseInt(station[0]);
        int gasRequired = Integer.parseInt(station[1]);

        if(gasInput<gasRequired)
        {
          break;
        }
        else
        {
          gasInput -= Integer.parseInt(station[1]);
          
          if((startIndex+1)==str2.size())
          {
            startIndex=0;
          }
          else
          {
            startIndex++;
          }
          count++;
        }
      }

      if(count==str2.size())
      {
        return String.valueOf(i+1);
      }
    }
    return "impossible";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    String[] arr = {"4","1:1","1:2","2:3","3:1"};
    System.out.println(GasStation(arr)); 
  }

}