package baitap_tu_on_jv;

public class b6 {
    public static void main(String[] args) {
        int num = 1234 ;

        int sum = 0 ;
        while (num!=0){
          int digit= num%10 ;
           sum+=digit;
           num/=10;
        }
        System.out.println(sum);

    }
}
