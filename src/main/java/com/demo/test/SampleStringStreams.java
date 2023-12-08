package com.demo.test;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SampleStringStreams {
public static void main(String[] args) {
	
 	String str ="abcabcM";
	
	System.out.println( str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	.entrySet().stream().filter(t->t.getValue()==1).map(t -> String.valueOf(t.getKey())).collect(Collectors.joining("")));
}
}
