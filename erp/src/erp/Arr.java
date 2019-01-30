
package erp;
import java.util.*;
public class Arr {

	public static void main(String[] args) 
	{
		
double x[][] = new double [5][2];
Scanner in = new Scanner (System.in);
for (int i=0; i<5; i++)
{
	for(int j=0; j<2; j++)
	{
		System.out.println("enter");
		x[i][j] = in.nextDouble();
	}
}
for (int i = 0; i<5; i++)
{
	for (int j=0;j<2; j++)
	{
		System.out.print(x[i][j]);
	}System.out.println(" ");
}

	}}
