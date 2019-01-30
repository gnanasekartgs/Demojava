package erp;

class Stat 
{
	static int a = 10;
	static int b = 20;
	 int c;
	
	public static void add()
	{
		int c =a+b;
		System.out.println(c);	
	}
	public int div(int e, int f)
	{
		int y = f/e;
		return y;
	}
	public int mul(int i, int j)
	{
	c = a * b;
	return c;
	}
	
	public static void main(String[] args)
	{
	/*A ob = new A();
		ob.add();
		ob.mul(5, 6);
		Stat.add();*/
		Stat.add();
		Stat ob = new Stat();
		System.out.println(ob.mul(5, 3));
		System.out.println(ob.div(a, b));
		System.out.println(ob.div(2, 6));
	}
}
