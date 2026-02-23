package arrays;

import java.util.ArrayList;
import java.util.List;

class Std{
	String name;
	int salary;
	public Std(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Std [name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class Sort_List_of_Objects {

	public static void main(String[] args) {
		List<Std> l=new ArrayList<Std>();
		l.add(new Std("pinku", 50000));
		l.add(new Std("pinku2", 90000));
		l.add(new Std("pinku3", 40000));
		
		l.sort((a,b)->a.salary - b.salary);
		System.out.println(l);

	}

}
