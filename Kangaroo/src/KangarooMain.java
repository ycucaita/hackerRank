
public class KangarooMain {

	public static void main(String[] args) {

		int x1 = 0;
		int v1 = 2;
		int x2 = 5;
		int v2 = 3;
		
		/*int x1 = 0;
		int v1 = 3;
		int x2 = 4;
		int v2 = 2;*/
		
		int acumulatorDifference = -1;
		
		initJump(x1 , v1 , x2 ,v2 ,acumulatorDifference);

	}
	
	private static void initJump(int origin, int kanOne, int originkangaro2, int kanTwo, int acumulatorDifference) {
		
		if (kanOne>kanTwo) {
			int result = addJump(origin , kanOne , originkangaro2 ,kanTwo );
			System.out.println( result ==1 ? "YES": "NO");
			
		}else {
			System.out.println( "NO");
		}
	
	}
	
	private static int addJump(int origin, int kanOne, int originkangaro2, int kanTwo) {
		
		int acumulatorDifference = -1;
		int  resultDifference = 0;
		int result = 0;
		int kang1 = 0;
		int kang2 = 0;
		int decreaseDifferenceKangaro = 0;
		
		do {
			if (acumulatorDifference == -1) {
				kang1 = additionJump(origin, kanOne);
				kang2 = additionJump(originkangaro2, kanTwo);
				acumulatorDifference = resultDifference;
			}else {
				kang1 = additionJump(kang1, kanOne);
				kang2 = additionJump(kang2, kanTwo);
			}
			 
			if(validateIfhaveSamePosition(kang1,kang2)) {
				result = 1;
			}
			
			 resultDifference = validateDiferenceBetweenJump(kang1,kang2);
			 
			 if (resultDifference< acumulatorDifference) {
				 acumulatorDifference = resultDifference;
				 decreaseDifferenceKangaro  = decreaseDifferenceKangaro + 1;
			}
			 
			 if (decreaseDifferenceKangaro == 1000) {
				 result = 0;
				 break;
			}
			
		} while (!validateIfhaveSamePosition(kang1,kang2));
		
	return result;
	}

	
	/*
	private static int addJump(int origin, int kanOne, int originkangaro2, int kanTwo, int acumulatorDifference) {

		int resultOperation = 0;
		int kang1 = additionJump(origin, kanOne);
		int kang2 = additionJump(originkangaro2, kanTwo);

		if (validateIfhaveSamePosition(kang1, kang2)) {
			resultOperation = 1;

		} else {
			 
			int resultDifference = validateDiferenceBetweenJump(kang1, kang2);
			
			if (acumulatorDifference == -1) {
				acumulatorDifference = resultDifference;
				addJump(kang1, kanOne, kang2, kanTwo, acumulatorDifference);
			}

			if (resultDifference < acumulatorDifference) {
				acumulatorDifference = resultDifference;
				addJump(kang1, kanOne, kang2, kanTwo, acumulatorDifference);
			} 
			
		}

		return resultOperation;

	}*/

	private static int validateDiferenceBetweenJump(int kang1, int kang2) {
		return  kang2 - kang1  ;
	}

	private static boolean validateIfhaveSamePosition(int kangPos1, int kangPos2) {
		return kangPos1 == kangPos2;
	}

	private static int additionJump(int acumulator, int addition) {
		return acumulator + addition;
	}

}
