import java.util.*;

public class BigSumMain {

	public static void main(String[] args) {
		long[] array = {9,8,7,6,5,4,3,2,1};
		long bigSum =Arrays.stream(array).sum();
		System.out.println("salida: "+ bigSum);
	}
}
