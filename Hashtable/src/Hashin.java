import java.util.Arrays;

public class Hashin {
    static int _a;
    static int _c;
    static int _m;
    public static int [] bucket;
//    private final int _a;
//    private final int _c;
//    private final int _m;


    public static void main(String[] args) {
        Hashin h = new Hashin(80,125,5);
        System.out.println(h);
        System.out.println(h.insert(26));
        System.out.println(h.insert(50));
        System.out.println(insert(26));
//        System.out.println(insert(900));
//        System.out.println(insert(240));



    }

    public static int get_a() {
        return _a;
    }

    public static int get_c() {
        return _c;
    }

    public static int get_m() {
        return _m;
    }

    public static int[] getBucket() {
        return bucket;
    }

    public Hashin(long _a, long _c, long _m) {
        this._a = (int) _a;
        this._c = (int) _c;
        this._m = (int) _m;
        this.bucket = new int[(int) _m];
//        int[]bucket = new int[(int) m];
        for (int i = 0; i < bucket.length; i++){
            bucket[i] = -1;
//            System.out.println(bucket[i]);
        }
        System.out.println(Arrays.toString(bucket));
    }
    public static int insert(int key) {
        int remaining = (((get_a()*key) + get_c()) % get_m());
        var width = getBucket();
        for (int j = 0; j<width.length; j++){
            if (width[j] == -1){
                width[remaining] = key;
            }
            else {
                remaining=j+1;
            }
//            System.out.println(remaining);
        }

        System.out.println(Arrays.toString(width));
        return remaining;
    }
}
