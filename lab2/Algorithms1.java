public class Algorithms1 {
    static int ALG1(int [] A, int [] B, int N){
        if(N==0){
            return 0;
        }
        return A[N-1] * B[N-1] + ALG1(A,B,N-1);
    }
    //int get 32bits in memory
    public static void main(String args[]) {
        int x = 100;
        int [] A = new int [x];
        int [] B = new int [x];
        for(int i = 0; i < x; i++){
            A[i] = 2 * (i+1);
            B[i] = 2 * i + 1;
        }
        System.out.printf("lahcen rocks"+A,B,x);
    }
}
