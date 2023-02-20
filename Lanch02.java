//2. WAP to print Duplicates characters from the String.
public class Lanch02 
{
	public static void main(String[] args) {
	     
	     String str="aabccdeef";
	     int[] freqArr = new int[26];
	     for(int i=0;i<str.length();i++){
	      char ch=str.charAt(i);
	      freqArr[ch-'a']++;
	     }


	     for(int i=0;i<26;i++){
	      if(freqArr[i]>1){
	        System.out.print((char)(i+'a'));
	      }
	     }
	    }
}
