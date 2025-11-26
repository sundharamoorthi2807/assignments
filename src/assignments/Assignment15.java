package assignments;

public class Assignment15 {

	public static void main(String[] args) {
		
		//Count the total number of words in the sentence.
		String sentence = "Java programming is fun and challenging";
		int length = sentence.length();
		System.out.println("Count the total number of words in the sentence:"+length);
		
		
		//Print the sentence words in reverse order.
		String reverse ="";
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse + sentence.charAt(i);
			
		}
		System.out.println("Reverse string: " +reverse);
		
		//Convert the first character of each word to uppercase and print original sentence
		
		char[] charArray = sentence.toCharArray();
	    boolean foundSpace = true;

	    for(int i = 0; i < charArray.length; i++) {

	      if(Character.isLetter(charArray[i])) {

	        if(foundSpace) {

	          charArray[i] = Character.toUpperCase(charArray[i]);
	          foundSpace = false;
	        }
	      }

	      else {
	        
	        foundSpace = true;
	      }
	    }

	    sentence = String.valueOf(charArray);
	    System.out.println("Message: " + sentence);
	  }
			

}


