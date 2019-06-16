import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class GradingStudentMain {

	public static void main(String[] args) {

		int[] grades = { 10, 14, 72, 84, 38, 53, 40, 93, 12, 44, 67 };
		IntStream gradesStream = Arrays.stream(grades);

		 int [] gradingStudents = gradesStream.skip(1).map(new IntUnaryOperator() {

			@Override
			public int applyAsInt(int operand) {
				return operand > 37 ? validateNumber(operand) : operand;
			}
		}).toArray();
		//.forEach(System.out::println);
		
	}

	private static int validateNumber(int parameter) {
		return validateModuleDifference(parameter);
	}

	private static int validateModuleDifference(int indexValue) {
		int mod = (indexValue % 5);
		return mod != 0 ? calculateGradingQualification(mod, indexValue) : indexValue;
	}

	private static int calculateGradingQualification(int module, int indexValue) {
		final int FIVE_VALUE = 5;
		int result = 0;

		if (FIVE_VALUE - module < 3) {
			result = indexValue + (FIVE_VALUE - module);
		} else {
			result = indexValue;
		}

		return result;
	}

}
