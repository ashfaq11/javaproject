package test.test2.demo;
import java.util.*;
import java.util.Map.Entry;
public class Solution2 {
	
	public static void main(String[] args) {
		
		String str = "ab_a,";
		System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
	}
    public int firstUniqChar(String s) {
        		LinkedHashMap<Character, Integer> map = s.chars().mapToObj(ch -> (char) ch).collect(LinkedHashMap::new,
				(m, c) -> m.merge(c , 1, Integer::sum), LinkedHashMap::putAll);
		
        int count=0;

        for(Entry<Character,Integer> entry: map.entrySet()){
            
            if(entry.getValue()==1)
                return count;
            
                count++;
        }
		return count;
    }
}