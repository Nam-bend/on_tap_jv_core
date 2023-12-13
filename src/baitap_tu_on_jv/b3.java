package baitap_tu_on_jv;
 //tinh giai thua cua 1 so cho truoc
public class b3 {
    public static void main(String[] args) {
        int n = 4
                ;
        int giaithua = 1 ;
        while(n==1 || n==0){
            return  ;
        }for(int index =2  ; index<= n ;index++){
            giaithua= giaithua*index;

        }
        System.out.println(giaithua);
    }
}
