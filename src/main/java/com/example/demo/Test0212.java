package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.print.attribute.HashAttributeSet;

/*{1: 2,3,4}
  {3: 5,6,7}
  {4: 8,9,10}

1:2,3,4,5,6,7,8,9,10*/
public class Test0212 {

	public static void main(String[] args) {
		int input = 3;
		Map<Integer, List<Integer>> map = new HashMap<>();
		List<Integer> list1 = new ArrayList();
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		List<Integer> list2 = new ArrayList();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		List<Integer> list3 = new ArrayList();
		list3.add(8);
		list3.add(9);
		list3.add(10);
		
		map.put(1, list1);
		map.put(3, list2);
		map.put(6, list3);
		CopyOnWriteArrayList<Integer> result = new CopyOnWriteArrayList<>();
		if (map.get(input) != null) {
			result.addAll(map.get(input));
			for (int reportee : result) {
				if (map.get(reportee) != null) {
					result.addAll(map.get(reportee));
				}
			}

		}
		System.out.println(result);
		List<Integer> result2 = new ArrayList();

		map.entrySet().stream().filter(entry -> entry.getKey() == input).flatMap(t -> t.getValue().stream())
				.peek(x->result2.add(x)).forEach(x -> {if(map.get(x)!=null)result2.addAll(map.get(x));});
		System.out.println(result2);

	}
	
//	public List<Integer> getReportees(){
//		
//	}
	
	
	
}
