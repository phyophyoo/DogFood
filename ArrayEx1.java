package Japan.Project;

import java.util.Scanner;

public class ArrayEx1 {
	public static void main(String[] args) {
		int marks[][]= new int[6][5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<6;i++)
		{
			int count = 0,stu= 0;
			System.out.println("Please enter the "+ (i+1)+ " person's marks");
			marks[i][0]= i+1;
			for(int j=1;j<4;j++)
			{	
				count++;
				switch(j)
				{
					case 1:System.out.print("Physics: ");break;
					case 2:System.out.print("Maths: ");break;
					case 3:System.out.print("Chemistry: ");break;
				}
				marks[i][j]= scan.nextInt();
				stu += marks[i][j];
			}
			marks[i][4]= stu/count;
		}
		
		for(int i=0;i<5;i++)
		{
			switch(i) 
			{
				case 0:System.out.print("No:"+ " ");break;
				case 1:System.out.print("Physics:"+ " ");break;
				case 2:System.out.print("Maths:"+ " ");break;
				case 3:System.out.print("Chemistry:"+ " ");break;
				case 4:System.out.print("Student Average:"+ " ");break;
			}
			
		}
		System.out.println();
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<5;j++)
			{
				
				System.out.print(marks[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
