import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;


public class Main {

	public static <T> void main(String[] args) {

		int startPoint = 7;
		int endPoint = 11;

		int locationAppleTree = 5;
		int locationOrangeTree = 15;

		int sizeArrApple = 3;
		int sizeArrOrange = 2;

		int[] apples = new int[sizeArrApple];
		int[] oranges = new int[sizeArrOrange];

		apples[0] = -2;
		apples[1] = 2;
		apples[2] = 1;

		oranges[0] = 5;
		oranges[1] = -6;

		IntStream appleStream = Arrays.stream(apples);
		IntStream orangeStream = Arrays.stream(oranges);
		int totalApple = appleStream.map(validateDistanceTrre(startPoint, endPoint, locationAppleTree)).sum();
		int totalorange = orangeStream.map(validateDistanceTrre(startPoint, endPoint, locationOrangeTree)).sum();

		System.out.println(totalApple);
		System.out.println(totalorange);

	}

	private static IntUnaryOperator validateDistanceTrre(int startPoint, int endPoint, int locationAppleTree) {
		return new IntUnaryOperator() {
			@Override
			public int applyAsInt(int operand) {

				int resultSum = locationAppleTree + operand;
				return validateStartPointAndEndPoint(startPoint, endPoint, resultSum) ? 1 : 0;
			}

		};
	}

	private static boolean validateStartPointAndEndPoint(int startPoint, int endPoint, int resultSum) {
		return resultSum >= startPoint && resultSum <= endPoint;
	}

}
