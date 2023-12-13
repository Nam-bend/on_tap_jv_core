package baitap_tu_on_jv;
// khoi tao mang tinhs all phan tu trong mang va in ra

public class b4 {
    public static void main(String[] args) {
        int[] num = new int[]{1,3,5,6,7,};
         int sum = 0 ;
        for ( int index = 0 ; index < num.length; index++){
            sum +=num[index];
        }
        System.out.println("sum ="+sum);
    }
}
