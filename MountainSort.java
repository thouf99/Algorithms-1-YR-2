import java.util.Arrays;

public class MountainSort {
    public static void main(String[] args) {
//
        int[][] Tests = {
                {},
                {6, 2, 8, 5, 7, 5, 0, 2},
                {34, 12, 7, 43, 55, 97, 41, 28, 2, 62},
                {2,2,2,2,2,2,2,2},
                {4, -7, 2, 1, 0, 2, 4, 2, -3, 3, -3, 7, -2, 7, 7},
                {-2, -2, -4, -9, -1, -6, -1, -14, -3, -15, -12, -12, -2, -8, -9},
        };
        for (int[] A: Tests) {
            try {
                System.out.println("Given array: " + Arrays.toString(A));
                A = MountainSort(A); //change the name of function if necessary
                System.out.println("Array sorted: " + Arrays.toString(A));
                System.out.println();
            } catch (Exception e) {
                System.out.println("Error for array: "+ Arrays.toString(A));
                System.out.println(e);
            }
        }
    }


    private static int[] MountainSort(int[] A) {
        if (A.length == 0) {
            return new int[0];
        } else {
            int minimum_VAl = Arrays.stream(A).min().getAsInt();
            int maximum_VAL = Arrays.stream(A).max().getAsInt();
            int range_VAL = maximum_VAL - minimum_VAl + 1;
            int reverse_Count_Indx = A.length;
            int checking_value[] = new int[range_VAL];
            int reverse_Count_VAL[] = new int[A.length];

            for (int i : A){
                checking_value[i - minimum_VAl]++;
            }
            for (int i = 1; i < checking_value.length; i++){
                checking_value[i] = checking_value[i] + checking_value[i -1];
            }
            for(int i = A.length - 1; i >=0; i--){
                reverse_Count_VAL[checking_value[A[i] - minimum_VAl] - 1] = A[i];
                checking_value[A[i] - minimum_VAl]--;
            }
            for(int i = 0; i < A.length; i++){
                if (i >= A.length/2){
                    A[i] = reverse_Count_VAL[reverse_Count_Indx-1];
                    reverse_Count_Indx--;
                }else{
                    A[i] = reverse_Count_VAL[i];
                }
            }
        }
        return A;
    }
}
