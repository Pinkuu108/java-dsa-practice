package common.interview.code;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Functional1 {
	// public abstract void getmoney();

	   public abstract Integer getsum(int a, int b);

}

public class Functional_interface {

	public static void main(String[] args) {
//		Functional1 f1 = () -> System.out.println("Say hello");
//		f1.getmoney();
//		Functional1 ff=(a, b) ->a+b;
//		System.out.println(ff.getsum(1, 7));

		Function<String, Integer> f = t -> t.length();
		System.out.println(f.apply("pinkuna"));
		
		Predicate<Integer> p = t -> t > 20;
		System.out.println(p.test(21));
		
		Consumer<String> c = t -> System.out.println(t);
		c.accept("pinku");
		
		Supplier<Integer> s = () -> 12345;
		System.out.println(s.get());

	}

}
