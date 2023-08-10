public class Mincoins {
    public static void main(String[] args) {
        int[] coin={1,2,5,10,20,50,100,500,1000};
        int v=20010;
        int n=coin.length,count=0;
        while(v>0){
            if(v>=2000){
                System.out.println(2000);
                v=v-2000;
            }else if(v>=500){
                System.out.println(500);
                v=v-500;
            }else if(v>=200){
                System.out.println(200);
                v=v-200;
            }else if(v>=100){
                System.out.println(100);
                v=v-100;
            }else if(v>=50){
                System.out.println(50);
                v=v-50;
            }else if(v>=20){
                System.out.println(20);
                v=v-20;
            }else if(v>=10){
                System.out.println(10);
                v=v-10;
            }else if(v>=5){
                System.out.println(5);
                v=v-5;
            }else if(v>=2){
                System.out.println(2);
                v=v-2;
            }else if(v>=1){
                System.out.println(1);
                v=v-1;
            }
        }

    }
}
