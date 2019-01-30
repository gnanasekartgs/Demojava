package erp;

public class Switch_if 
{


	public static void main(String[] args) 
	{
	int review = 3;
	switch (review)
	{
	case 1:
		System.out.println("understand reqirement & identify scenarios");
		break;
	case 2:
		System.out.println("write test cases");
		break;
	case 3:
		if (review>3)
{
	System.out.println("attend review");
}
		else 
		{
			System.out.println("get back the reviewed testcases");
		}
		System.out.println("start executing");
		break;
		
	}
	}
}

