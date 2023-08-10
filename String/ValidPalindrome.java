public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "sammas";
        s.toUpperCase();
        int i = 0, j = s.length() - 1, m = 0;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else if ((int) s.charAt(i) <= 65 &&(int) s.charAt(i) >= 90) {
                i++;
            } else if ((int) s.charAt(j) <= 65 && (int) s.charAt(j) >= 90) {
                j--;
            } else {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
