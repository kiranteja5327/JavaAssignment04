import java.util.Arrays;

//5. WAP to implement Anagram Checking least inbuilt methods being used.
public class Lanch05 {

	public static void main(String[] args) {
	     
	     String str1="abcdef";
	     String str2="fedkcba";
	     int[] freq=new int[26];
	     
	     for(int i=0;i<str1.length();i++){
	        char ch=str1.charAt(i);
	        freq[ch-'a']++;
	     }
	     for(int i=0;i<str2.length();i++){
	      char ch=str2.charAt(i);
	      freq[ch-'a']--;
	     }


	     for(int i=0;i<26;i++){
	      if(freq[i]!=0){
	        System.out.print("false");
	        return;
	      }
	     }
	     System.out.print(true);
	     
	    }

}
