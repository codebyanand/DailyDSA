import java.util.*;
  
  public class CountDigits{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      
      int num = scn.nextInt();
      scn.close();
      
      int count = 0;
      
      while(num > 0){
          num = num / 10;
          
          count++;
      }
      System.out.println(count);
   }
  }