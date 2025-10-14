package HashMap;
import java.util.*;

public class basic {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		
		Map<Integer,Integer> fq = new HashMap<>();
		int i =0;
		for(int el:arr) {
			
			fq.put(el,i);
			i++;
		}
		System.out.println(fq);		
	}
}
