package erp;
class Parent 
{ 
    // private methods are not overridden 
    static void m1() { System.out.println("From parent m1()");} 
      
    protected void m2() { System.out.println("From parent m2()"); } 
} 
  
class Child extends Parent 
{ 
    // new m1() method 
    // unique to Child class 
   static void m1() { System.out.println("From child m1()");} 
      
    // overriding method 
    // with more accessibility 
 
    public void m2() { System.out.println("From child m2()");} 
      
} 
  
// Driver class 
class Main 
{ 
    public static void main(String[] args) 
    { 
        Parent obj1 = new Parent(); 
        obj1.m2(); 
       obj1.m1();
        Parent obj2 = new Child(); 
        obj2.m2(); 
        obj2.m1();
        
    } 
} 
