class Prefic{
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String result=arr[0];
        for(int i = 1; i < arr.length; i++){
            
                result = result.substring(0, result.length()-1);
               
                // check for empty case. direct return if true..
                if(result.isEmpty()){
                    System.out.println(-1);
                }
            }
        }
        System.out.println(result);
    }
}