package com.ntier.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

class SimpleStream {
	public static void main(String[] args) {
		
	String[] names = {"David", "Brody", "Gina", "Kendall", "Matthew", "Austin", "Isaiah", "Ricky", "Kip", "Rhonda"};
	Stream<String> nameStream = Arrays.stream(names);
	long count = nameStream
			.filter(i -> i.contains("K"))
			.count();
	
	System.out.println(count);
	
	List<String> list = Arrays.asList(names);
	long listStream = list
			.stream()
			.filter(i -> i.contains("a"))
			.count();
	
	System.out.println(listStream);
	
	Map<Integer, String> rank  = new HashMap<>();
	rank.put(1, "Matthew");
	rank.put(2, "Gina");
	rank.put(3, "Kip");
	rank.put(4, "Isaiah");
	rank.put(5, "Kendall");
	rank.put(6, "Ricky");
	rank.put(7, "Rhonda");
	rank.put(8, "David");
	rank.put(9, "Brody");
	rank.put(10,"Austin");
	
	rank.entrySet().stream().forEach(System.out::println);
	
	
	Double[] nums = {123.6 , 234.7, 827.9, 125.5, 438.2};
	Stream<Double> numsStream = Arrays.stream(nums);
	System.out.println(numsStream.max((x,y) -> Double.compare(x, y)));
	
	DoubleStream stream = DoubleStream.of(123.6 , 234.7, 827.9, 125.5, 438.2);
	System.out.println(stream.min());
	System.out.println( DoubleStream.of(123.6 , 234.7, 827.9, 125.5, 438.2).count());
	System.out.println( DoubleStream.of(123.6 , 234.7, 827.9, 125.5, 438.2).sum());
	
	}
}
