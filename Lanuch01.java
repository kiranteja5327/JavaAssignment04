import java.util.Arrays;

//1. WAP to remove Duplicates from a String.(Take any String ex with duplicates
//   character)Duplicates

public class Lanuch01{
public static void main(String[] args) {
      //program to remove duplicate characters
     String str="aabccdeef";
     int[] freqArr = new int[26];
     for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      freqArr[ch-'a']++;
     }


     for(int i=0;i<26;i++){
      if(freqArr[i]==1){
        System.out.print((char)(i+'a'));
      }
     }

}
}