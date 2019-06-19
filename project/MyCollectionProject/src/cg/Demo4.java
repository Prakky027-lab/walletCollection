package cg;
import java.util.*;
import com.cg.bean.*;
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Account> accmap=new TreeMap<Integer,Account>();
		Account ob1=new Account(101,986724701,"Ram",25000.00);
		accmap.put(ob1.getMobile(),ob1);
		Account ob2=new Account(102,986724702,"Shyam",55000.00);
		accmap.put(ob2.getMobile(),ob2);
		Account ob3=new Account(103,986724708,"Abdul",15000.00);
		accmap.put(ob3.getMobile(),ob3);
		Account ob4=new Account(104,986724704,"Ganesh",45000.00);
		accmap.put(ob4.getMobile(),ob4);
		
		System.out.println(accmap);// sort the account details as per key values 
		System.out.println(accmap.keySet());// keys get sorted only and prints only the keys i.e 986724701,986724702,
																								//986724704,986724708.
		Collection<Account>vc=accmap.values(); //  To retrieve the value
		List<Account> acclist=new ArrayList<Account>(vc); // To store in the list
		Collections.sort(acclist); // To sort the list
		for(Account d:acclist)
		{
			System.out.println(d); // printing list in sorted order
		}
		
		System.out.println("======================sort by name");
		Comparator bc=new NameComparator();
		Collections.sort(acclist,bc);
		for(Account o:acclist) {
			System.out.println(o);
		}
		/*
		Set<Account> aset=new TreeSet<Account>();
		aset.add(Account object); // invokes compareTo methood // constructor should be empty
		aset.add(Account object);
		
		//sort by name then
		Comparator nc=new NameComparator();
		Set<Account> aset=new TreeSet<Account>(nc);
		aset.add(Account object);
		aset.add(Account object);
		*/
	}

}
