import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MainMinMaxSum {

	public static void main(String[] args) {
		
		int [] arr = {1,3,5,7,9,14,20,30};
		int [] arrEx = arr;
		long acum =  0;
		List<Long> resultList = new ArrayList<Long>();
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arrEx.length; j++) {
				
				if (i!=j) {
					acum= acum + arrEx[j];
				}
				
			}
			resultList.add(acum);
			acum=0;
			
		}
		Collections.sort(resultList);
		System.out.println(resultList.get(0) + " " + resultList.get(resultList.size()-1));
	}

}
