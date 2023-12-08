package com.demo.test;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseBits {
public static void main(String[] args) {
	
	reverseBits(3);
}

static void reverseBits(int number) {
	  
	
	   Map<Object, Integer> map = Stream.of("cake","biscuits","apple tart","cake").collect(
				Collectors.toMap(s -> s, s -> 1, (len1, len2) -> len1 + len2, (TreeMap::new) ));
	   
	   System.out.println(map);
	   
	   
	   Map<Integer, List<String>> map1 = Stream.of("cake","biscuits","apple tart","cake").collect(
				Collectors.groupingBy(String::length,TreeMap::new ,Collectors.toList()));
	  
	   System.out.println(map1);
 
	   Map<Boolean, List<String>> map2= Stream.of("cake","biscuits","apple tart","cake").collect(
				Collectors.partitioningBy(name -> name.toString().length()>4));
	   System.out.println(map2);
	   
	   Map<Boolean, Set<String>> map3= Stream.of("cake","biscuits","apple tart","cake").collect(
				Collectors.partitioningBy(name -> name.toString().length()>4,Collectors.toSet()));
	   System.out.println(map3);


	   Stream.of("cake","biscuits","apple tart","cake").
	   peek(s-> System.out.print("1."+s)).
	   distinct().forEach(s->System.out.println("2."+s));
	   
	   
	   
 

 }
}
