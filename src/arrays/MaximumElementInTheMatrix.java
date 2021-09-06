package arrays;
import java.util.Scanner;

public class MaximumElementInTheMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int maxNum =a[0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(maxNum<a[i][j]);
				{
					maxNum =a[i][j];
				}
			}
		}

	
	System.out.println("Max Number:"+maxNum);
	}

}
