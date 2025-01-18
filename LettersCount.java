package test3;

public class LettersCount {

	public static void main(String[] args) {
		String s = "Java is plateform Independent";
		int letters =0;
		int space =0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
		  if(ch ==' ') {
		  space++;  
		  }else {
			  letters++;
		  }
		}
		System.out.println("the letters count in the given sentence is "+ letters);
	}

}
