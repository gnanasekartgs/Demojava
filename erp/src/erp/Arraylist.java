package erp;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) 
	{
	ArrayList<String> al = new ArrayList<String>();
	
	/*al.add(4*5);
	al.add("skfjdfklj");
	al.add("skfjdfklj");
	al.add(2, 4);
*/
	al.add("skfjdfklj");
	al.add("skfjdfklj");
/*	Iterator it = al.iterator();
	while(it.hasNext())
	{
		Object v = it.next();
		System.out.println(v);
	}*/
	for(String v:al)
	{
		System.out.println(v);
	}
	/*for (int i = 0; i<al.size(); i++) {
	System.out.println(al.get(i));
	
	}System.out.println(al.size());
	*/}

}
