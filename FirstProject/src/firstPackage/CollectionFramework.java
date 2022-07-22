package firstPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionFramework {

	public static void main(String[] args) {
		
		int[] numbers = {1, 5, 9, 2, 6, 3};
		Arrays.sort(numbers);
//		System.out.println(Arrays.toString(numbers));
		
		int[] numbersTwo = new int[6];
		
		List<Integer> sampleList = new ArrayList<Integer>();
		
		sampleList.add(1);
		sampleList.add(5);
		sampleList.add(9);
		sampleList.add(2);
		sampleList.add(6);
		sampleList.add(3);
		
		Collections.sort(sampleList);
		
//		System.out.println(sampleList);
		
		
		List<String> names = new ArrayList<String>();
		
		names.add("anyName");
		names.add("someName");
		names.add("yourName");
		names.add("anyName");
		
		System.out.println(names);
		
		Set<String> setNames = new HashSet<String>();
		
		setNames.add("anyName");
		setNames.add("someName");
		setNames.add("yourName");
		setNames.add("anyName");
		
		System.out.println(setNames);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
