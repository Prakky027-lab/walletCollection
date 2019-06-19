package cg;
import java.util.*;
public class Demo3 {
	public static void main(String[] args){
		Map<String, Double> m=new HashMap<String,Double>();//only 1 null is allowed, gives random value
		//Map<String, Double> m=new TreeMap<String,Double>();//null is not allowed will give null pointer excep0tion
		m.put("Ram",5000.00);
		m.put("Shyam",7000.00);
		m.put("Abdul",9000.00);
		m.put("Ganesh",4000.00);
		m.put(null,5000.00);
		System.out.println(m);
		System.out.println(m.size());
		
		Set<String>keysSet=m.keySet();
		System.out.println(keysSet);// Prints only the keys i.e names only
		
		for(String k : keysSet)
		{
			Double val=m.get(k);
			System.out.println(k+" has balancce of Rs. "+val);
		}
			System.out.println("================");
			double bal=m.get("Shyam");
			System.out.println("Before balance "+bal);
			bal=bal-3000;       // Unboxing
			m.put("Shyam",bal); // autoboxing
			bal=m.get("Shyam");
			System.out.println("After balance "+bal);
			System.out.println("================");
			Collection<Double>vals=m.values();
			
			List<Double>vallist=new ArrayList<Double>(vals);// creating a list
			
			Collections.sort(vallist);// To sort the list// sort method will invoke the comapreTo method in Account class
														       //	and will sort internally on basis of account no(48)
			for(double d: vallist)
			{
				System.out.println(d); // printing list in sorted order
			}
	}
}
