package exception;

public class DebugDemo {
    public static void main(String[] args) {
        int [] a = {1,5,7,2,5,10,11,2,8};
        sort(a);
        System.out.println(a.toString());
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
