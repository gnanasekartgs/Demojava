
/* multiple extending using super keyword*/
package erp;

class prj1
{
	double attend;
	double review_att;
	double mockup;

	prj1(prj1 ob)                                     /* creating obj*/
	{   /*prj1 ob = new prj1();*/
		attend = ob.attend;
		review_att =ob.review_att;
		mockup = ob.mockup;
	}
	
	prj1(int att, int ratt, int m)                   /*automatic data type conversion */  
	{
		attend = att;
		review_att = ratt;
		mockup = m;
	}
	
	double calc()
	{	
		 return attend + review_att + mockup;
	}
}
	class prj2 extends prj1                              
	{                                                    /*prj2 extending from prj1*/
		double viva;
		
		prj2 (prj2 ob)
		{  
			/*prj2 ob = new prj2();*/
			super(ob);                              
			viva = ob.viva;
		}
		
		prj2 (int att, int ratt, int m, double v)
		{
			super (att, ratt, m);
			viva = v;
		}
		
		}
		class prj3 extends prj2
		{
			double result;
			prj3(prj3 ob) 
			{
				super(ob);
				result = ob.result;
			}
			
			prj3 (int att, int ratt, int m, double v, double r)
			{
				super (att, ratt, m, v);
				result = r;
			}
		}


public class Proj 
{
	public static void main(String[] args) 
	{
	prj2 p3 = new prj2(5, 6, 7 , 5.0);
	prj3 p4 = new prj3(9, 8, 7, 5.6, 6.8);
	
	double ans = p3.calc();  
	
	System.out.println(ans);      /*18*/
	System.out.println(p3.calc());/*18*/
	
	System.out.println(p4.calc());/*24*/
	
	/*double ans1 = p4.calc(); /*24*/
	
	/*System.out.println(ans1);   /*24*/
	System.out.println(p4.calc());/*24*/
	System.out.println(p3.viva);/*5*/
	System.out.println(p4.viva);/*5.6*/
	System.out.println(p4.result);/*6.8*/
	}

}
