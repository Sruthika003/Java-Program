package test3;

public class NoOfVowelsAndConsonants {

	public static void main(String[] args) {
		String str ="Java is a programming language";
	     int vowels = 0, consonants =0, space =0;
	     String s = str.toLowerCase();
	     for(int i=0; i<s.length(); i++) {
	    	     char ch = s.charAt(i);
	    	 if(ch =='a'|| ch=='e'|| ch=='i'||ch =='o'||ch=='u') {
	    		 vowels++;
	    	 }else if(ch == ' ') {
	    		 space++;
	    	 }else {
	    		 consonants++;
	    	 }
	     }
	     System.out.println("The no of vowles in the string is "+ vowels);
	     System.out.println(space);
	     System.out.println("The no of consonanats in the string is "+ consonants);

	}

}
