import java.util.Arrays;

public class HybridSort {
	public static void main(String[] args) {

		int[][] Tests = {
				{},
				{6, 2, 8, 5, 7, 5, 0, 2},
				{2,2,2,2,2,2,2,2},
				{4, -7, 2, 1, 0, 2, 4, 2, -3, 3, -3, 7, -2, 7, 7},
				{-2, -2, -4, -9, -1, -6, -1, -14, -3, -15, -12, -12, -2, -8, -9},
		};
		for (int[] A: Tests) {
			try {
				System.out.println("Given array: " + Arrays.toString(A));
				A = hybridSort(A); //change the name of function if necessary
				System.out.println("Array sorted: " + Arrays.toString(A));
			}   catch (Exception e) {
				System.out.println("Error for array: " + Arrays.toString(A));
				System.out.println(e);
			}
		}
	}


	public static int[] hybridSort(int[] A) {
		int counting = 0;
		int n = A.length;
		boolean changing = true;
		int high_Index = n - 1;
		int low_Index = 0;
		int minimum_Pos = 0;

		if (A.length == 0){
			return new int[0];
		}else {

			while (changing) {
				changing = false;
				counting++;
				for (int i = low_Index; i < high_Index; i++) {
//				System.out.println(Arrays.toString(A));
					if (A[i] > A[i + 1]) {
						swapping(A, i, i + 1);
						changing = true;
						if(A[i]< A[minimum_Pos]){
							minimum_Pos = i;
						}
					}
				}
				swapping(A, low_Index, minimum_Pos);
				low_Index++;
				high_Index --;
				minimum_Pos = low_Index;
			}
		}
		return A;
	}

	public static void swapping(int A[], int z, int y) {
		int temporary = A[z];
		A[z] = A[y];
		A[y] = temporary;
	}
}
