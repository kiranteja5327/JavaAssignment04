//6. WAP to implement Pangram Checking with least inbuilt methods being used.
public class Lanch06 {

	public static void main(String[] args) {
	     
	     String str1="abcdefghijklmnopqrstuvwxyz";
	     
	     int[] freq=new int[26];
	     
	     for(int i=0;i<str1.length();i++){
	        char ch=str1.charAt(i);
	        freq[ch-'a']++;
	     }


	     for(int i=0;i<26;i++)
	     {
	      if(freq[i]==0)
	      {
	        System.out.print("false");
	        return;
	      }
	      System.out.println("true");
	     }
	     
	     
	    }
}
