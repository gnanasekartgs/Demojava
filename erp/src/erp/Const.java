package erp;

 class Const1 {
	double length;
	double breath;
	
	Const1()
	{
		length = 5;
		breath = 6;
	}
	Const1 (double l, double b, double h)
	{
		this.length = l;
		this.breath = b;
		double height = h;
		h = 7;
	}
	double area()
	{
		double c = length * breath  ;
		System.out.println(c);
		return c;	
	}
}
public class Const{
	public static void main(String[] args) {
		
Const1 d = new Const1();
d.area();
	}

}
