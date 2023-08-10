import java.util.Arrays;

public class Threesum {
    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4 };
       Arrays.sort(a);
        for (int i = 0; i < a.length - 3; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                int b = -a[i];
                int l = i + 1, h = a.length - 1;
                while (l < h) {
                    int c = a[l] + a[h];
                    if (b == c) {
                        System.out.println(a[i] + "," + a[l] + "," + a[h]);
                        while (l < h && a[l] == a[l+ 1])
                            l++;
                        while (l < h && a[h] == a[h- 1])
                            h--;
                        l++;
                        h--;
                    } else if (c < b) {
                        l++;
                    } else {
                        h--;
                    }
                }
            }
        }
    }
}
