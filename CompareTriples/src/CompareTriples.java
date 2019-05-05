import java.util.ArrayList;
import java.util.List;
import  java.util.stream.*;

public class CompareTriples {

	public static void main(String[] args) {
		
		List<Integer> listOne = new ArrayList<Integer>();
		List<Integer> listTwo = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		listOne.add(5);
		listOne.add(6);
		listOne.add(7);
		listTwo.add(3);
		listTwo.add(6);
		listTwo.add(8);
		
		result =compareTriplets (listOne,listTwo);
		result.forEach(System.out :: println);

	}
	
	private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		
		int aliceResult = 0;
		int bobResult = 0;
		List<Integer> listResult = new ArrayList<Integer>();
		
		for (int i = 0; i < a.size(); i++) {
			
			if(a.get(i).intValue() > b.get(i).intValue()) {
				aliceResult = aliceResult + 1;
			}else if (a.get(i).intValue() < b.get(i).intValue()) {
				bobResult = bobResult + 1;
			}			
		}
		listResult.add(aliceResult);
		listResult.add(bobResult);

     return listResult;
    }

}
