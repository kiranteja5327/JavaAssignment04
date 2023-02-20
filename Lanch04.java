
//4. WAP to count the number of consonants, vowels, special characters in a String.


public class Lanch04 {

	public static void main(String[] args) {
		
		String str="aeiou@#$zhl";
		
		
		int vowels=0;
		int specialchar=0;
		int consonants=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i'||ch=='o'|| ch=='u')
			{
				vowels++;
			}
			
			else if(ch>='a' && ch<='z')
			{
				consonants++;
			}
			else
			{
				specialchar++;
			}
		}
		System.out.println("no. of vowels : "+vowels);
		System.out.println("no. of specialchar : "+specialchar);
		System.out.println("no.of consonants : "+consonants);
		

	}

}
