//8. WAP to find the maximum occurring character in a String.
public class Lanch08 {

	
	public static void main(String[] args) {
	     
	     String str1="abcdefghidhhdhfgdfgsgwxyz";
	     
	     int[] freq=new int[26];
	     
	     for(int i=0;i<str1.length();i++){
	        char ch=str1.charAt(i);
	        freq[ch-'a']++;
	     }
	     int max=0;
	     char ch='a';
	     for(int i=0;i<26;i++){
	      if(max<freq[i]){
	        ch=(char)(i+'a');
	        max=freq[i];
	      }
	     }
	     System.out.print(ch);
	     
	    }

}
