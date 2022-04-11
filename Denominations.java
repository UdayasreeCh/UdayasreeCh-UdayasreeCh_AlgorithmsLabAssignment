package Denominations;
import java.util.Scanner;
public class Denominations {
	
	public static void countCurrency(int amount)
	{
	
	int n;
Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of Currency Denominations:");
		n = Sc.nextInt();

int[] array = new int[n];
		System.out.println("Enter the Currency Denominations value");
		for (int i=0;i<n;i++) {
			array[i]=Sc.nextInt();
		}
		
		
int[] noteCounter = new int[9];
int i = 0;

while (amount >= array[i]) {
	
	noteCounter[i] = amount/array[i];
	amount = amount - noteCounter[i] * array[i];
i++;

}
	

System.out.println("Currency Count");

for (int k=0; k <n; k++){

if (noteCounter[k] !=0)
{
	System.out.println(array[k]+ " : " + noteCounter[k]);
}	

}

	}


		
	public static void main(String[] Args)
	{
		int amount ;
		Scanner Sc1 = new Scanner(System.in);
		System.out.println("Enter the Amount:");
		amount = Sc1.nextInt();
		countCurrency(amount);
		
	}
	
}
