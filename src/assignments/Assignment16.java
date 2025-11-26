package assignments;

public class Assignment16 {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		  String wordToFind = "Java";

		        String[] words = paragraph.split("\\s+");

		        int count = 0;

		        System.out.println("Indexes of '" + wordToFind + "':");

		        for (int i = 0; i < words.length; i++) {
		            String cleanedWord = words[i].replaceAll("[^a-zA-Z]", "");

		            if (cleanedWord.equals(wordToFind)) {
		                count++;
		                System.out.println(i);
		            }
		        }

		        System.out.println("Total occurrences of '" + wordToFind + "': " + count);
		    }
}


	
