
//3. WAP to check if “2552” is palindrome or not.

public class Lanch03
{
	 public static void main(String[] args)
	 {
	      
	     String str="25523";
	     int i=0;
	     int j=str.length()-1;
	     while(i<j){
	      if(str.charAt(i)!=str.charAt(j))
	      {
	        System.out.print("false");
	        return;
	      }
	      i++;
	      j--;
	     }
	     System.out.print("true");
	}
 }      
