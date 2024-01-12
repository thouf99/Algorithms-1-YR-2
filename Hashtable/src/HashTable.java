import java.util.Arrays;

public class HashTable {

    // public for testing purposes
    public int buckets[];
    private long _a;
    private long _c;
    private long _m;

    public static void main(String[] args) {
        HashTable h = new HashTable(10,20,6);
        h.insert(10);
        h.insert(10);
        h.insert(20);
        h.insert(20);

    }

    public int[] getBuckets() {
        return buckets;
    }

    public void setBuckets(int[] buckets) {
        this.buckets = buckets;
    }

    public long get_a() {
        return _a;
    }

    public void set_a(long _a) {
        this._a = _a;
    }

    public long get_c() {
        return _c;
    }

    public void set_c(long _c) {
        this._c = _c;
    }

    public long get_m() {
        return _m;
    }

    public void set_m(long _m) {
        this._m = _m;
    }

    public HashTable(long _a, long _c, long _m) {

        this._a = _a;
        this._c = _c;
        this._m = _m;
        buckets = new int[(int) _m];
        for (int i = 0; i < buckets.length; i++){
            buckets[i] = 1;
        }
//        System.out.println(Arrays.toString(buckets));
    }

    public void insert(int key) {
        int modLen = (int) get_m();
//        System.out.println(modLen);
//        System.out.println(r);
        for (int i = 0; i < getBuckets().length; i++) {
            int r = key % modLen;
            if (buckets[r] == -1) {
                buckets[r] = key;
                if (buckets[r] != -1) {
                    buckets[r + 1] = key;
                }
            }
        }
        System.out.println(Arrays.toString(getBuckets()));

    }

    public void extend(){
    }

    public boolean find(int key) {
        return false;
    }

    public void remove(int key) {
    }

    public double loadFactor() {
        return 0.0;
    }
}
