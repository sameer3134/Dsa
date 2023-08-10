import java.util.Arrays;

public class Triplesumsmaller {
    public static void main(String[] args) {
        int[] a = { -2, 0, 1, 3 };
        int sum = 2;
        int count = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            int j = i + 1, k = a.length - 1;
            while (j < k) {
                if (a[i] + a[j] + a[k] >= sum) {
                    k--;
                } else {
                    count += (k - j);
                    j++;
                }
            }
        }
        System.out.println(count);
    }
}
