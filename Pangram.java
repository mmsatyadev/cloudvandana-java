import java.util.Scanner;
public class Pangram {
		 public static void main(String[] args)
		 {
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Enter a sentence to check if it's a pangram:");
			 String input = scanner.nextLine();	
			 if (isPangram(input)) 
			 {
				    System.out.println("The entered sentence is a pangram.");
			}
			 else
				{
				    System.out.println("The entered sentence is not a pangram.");
				
				}
			 	scanner.close();
		 }

		    private static boolean isPangram(String sentence) {
		        sentence = sentence.toLowerCase();
		        boolean[] lp = new boolean[26];
		        char c[]=sentence.toCharArray();
		        for (int i=0;i<c.length;i++)
		        {
		            if (Character.isLetter(c[i])) 
		            {
		                lp[c[i] - 'a'] = true;
		            }
		        }
		        for (int i = 0; i < lp.length; i++)
		        {
		            if (!lp[i])
		            {
		                return false;
		            }
		        }

		        return true;
		    }

	}

