import java.util.Scanner;
class Hw1
{
	public static void main(String args[])
	{
		System.out.println("enter any decimal number");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int[] rem = new int[20];
		int index=0;
		while (num>0)
		{
			rem[index]=num%2;
			num=num/2;
			index++;

		}
		for (int i = (index-1); i>=0 ;i-- )
		{
			System.out.print(rem[i]);
		}
	}
}