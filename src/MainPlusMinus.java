import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class MainPlusMinus {

	public static void main(String[] args) {
		
		final int DECIMAL_SCALE = 6;
		int[] arr = new int[12];
		
		arr[0]=-1;
		arr[1]=4;
		arr[2]=-30;
		arr[3]=7;
		arr[4]=-14;
		arr[5]=15;
		arr[6]=-21;
		arr[7]=0;
		arr[8]=-15;
		arr[9]=26;
		arr[10]=-17;
		arr[11]=0;
		
		int arrayLength= arr.length;
		
		//IntPredicate negative = n -> (n<0);
		//IntPredicate positive = n -> (n>0);
		//IntPredicate equalZero = n -> (n == 0);

		long numberNegativeValues = Arrays.stream(arr).filter(n -> (n<0)).count();
		long numberPositiveValues = Arrays.stream(arr).filter(n -> (n>0)).count();
		long numberZeroValues = Arrays.stream(arr).filter(n -> (n == 0)).count();
		
		BigDecimal negativeValue = new BigDecimal(numberNegativeValues);
		BigDecimal positiveValue = new BigDecimal(numberPositiveValues);
		BigDecimal zeroValue = new BigDecimal(numberZeroValues);
		BigDecimal arraySize = new BigDecimal(arrayLength);

		System.out.println(positiveValue.divide(arraySize, DECIMAL_SCALE, RoundingMode.CEILING));
		System.out.println(negativeValue.divide(arraySize, DECIMAL_SCALE, RoundingMode.CEILING));
		System.out.println(zeroValue.divide(arraySize, DECIMAL_SCALE, RoundingMode.CEILING));

	}
	
	



}
