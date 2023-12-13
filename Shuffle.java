import java.util.Random;
public class Shuffle {
	public static void main(String[] args) {
		        int[] array = {1, 2, 3, 4, 5, 6, 7};

		        System.out.println("Original Array:");
		        for(int i=0;i<array.length;i++)
		        {
		        	System.out.print(array[i]+" ");
		        }
		       
		        Random rd=new Random();
		        for(int i=array.length-1;i>0;i--)
		        {
		        	int randomIndex = rd.nextInt(i + 1);
		        	int temp = array[i];
		            array[i] = array[randomIndex];
		            array[randomIndex] = temp;
		        }
		    System.out.println("\nShuffled Array:");
		        for(int i=0;i<array.length;i++) 
		        {
		            System.out.print(array[i]+" ");
		        }
		        System.out.println();
		    }

}
