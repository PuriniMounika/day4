package arrays;
import java.util.Scanner;
public class MaximumElementInEachColoumn {

	public static void main(String[] args) {
		int n,m;
		int i,j;
	Scanner sc=new Scanner(System.in);
	m=sc.nextInt();
	n=sc.nextInt();
	int[][]a=new int[m][n];
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<n;i++)
	{
		int max=a[0][i];
		for(j=1;j<m;j++)
		{
			if(a[i][j]>max)
			{
				max=a[i][j];
			}
		}
		System.out.println(max);
	}
	
	

	}

}
