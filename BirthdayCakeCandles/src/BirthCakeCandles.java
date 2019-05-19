import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BirthCakeCandles {

	 static Long biggestNumber=  new Long(0) ;

	public static void main(String[] args) {
		int[] arr = { 4, 3, 1, 1, 5, 4, 8, 4 };

		Map<Integer,Long> ocurrences = Arrays.stream(arr)
				                              .boxed()
				                              .collect(
				                            		  Collectors.groupingBy(Function.identity(),
				                            				  Collectors.counting()));
		ocurrences.forEach((key,value)-> {
			if (value >biggestNumber) {
				biggestNumber= value;
			}
		});
		
		System.out.println(biggestNumber);		

	}
}
