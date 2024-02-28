
import java.util.*;
public class gradecaluclator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numofsub = sc.nextInt();
		
		int totalmarks = 0;
		
		for(int i=1;i<=numofsub;i++)
		{
			System.out.println("Enter marks obtained in each subject is" +i+":");
			int marks = sc.nextInt();
			totalmarks = totalmarks+marks;
			
			int average = totalmarks/numofsub;
			char grade = 0;
			
			if(marks >= 90)
			{
				System.out.println("A Grade");
			}
			else if(marks>=80)
			{
				System.out.println("B Grade");
			}
			else if(marks>=70)
			{
				System.out.println("C Grade");
			}
			else if(marks>=60)
			{
				System.out.println("D grade");
			}
			else
			{
				System.out.println("F");
			}
			System.out.println("Total Marks: " + totalmarks);
	        System.out.println("Average Percentage: " + average + "%");
	        System.out.println("Grade: " + grade);
	        	

		}
		 
		
	}

}
