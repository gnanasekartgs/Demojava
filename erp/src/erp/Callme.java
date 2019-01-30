/*overridding*/

package erp;

class A
{
	void callme1()
	{
		System.out.println("call me 1");
	}
}

class B extends A
{
	void callme1()
	{
		System.out.println("call me A -1");
	}
	void callme2()
	{
		System.out.println("call me 2");
	}

class C extends B
{
	void callme1()
	{
		System.out.println(" call me A - 1");
	}
	void callme2()
	{
		System.out.println("call me B - 2");
	}
}
}
public class Callme {

	public static void main(String[] args) 
	{
		A a = new A();
		B b = new B();
		/*C c = new C();*/
		B x;
		x = b;
		x.callme2();
		x.callme1();
	}

}
