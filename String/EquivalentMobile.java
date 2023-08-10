public class EquivalentMobile {
    public static void main(String[] args) {
        String str[]
        = { "2",    "22",  "222", "3",   "33", "333",
            "4",    "44",  "444", "5",   "55", "555",
            "6",    "66",  "666", "7",   "77", "777",
            "7777", "8",   "88",  "888", "9",  "99",
            "999",  "9999" };

    String input = "GEEKSFORGEEKS";
    System.out.println(printSequence(str, input));
    }
    public static String printSequence(String[] str, String input){
        String l="";
        for(int i=0;i<input.length();i++){
            int m=input.charAt(i)-65;
            l+= str[m];
        }
        return l;
    }
}
