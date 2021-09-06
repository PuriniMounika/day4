package arrays;
import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of anarray");
		int m=sc.nextInt();
		int[]arr=new int[m+1];
		System.out.println("Enter"+m+"element");
		for(int i=0;i<m;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the position where you want to insert");
		int n=sc.nextInt();
		System.out.println("Enter the element which you want to insert");
		int a=sc.nextInt();
		for(int i=m-1;i>=(n-1);i--)
		{
			arr[i+1]=arr[i];
		}
		arr[n-1]=a;
		System.out.println("After inserting");
		for(int i=0;i<=m;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
