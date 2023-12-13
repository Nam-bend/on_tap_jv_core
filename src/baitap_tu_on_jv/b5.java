package baitap_tu_on_jv;

public class b5 {
    public static void main(String[] args) {
        String str = "hello xin chao moi nguoi";
        int[] a = new int[255];
        for(char ch :str.toCharArray()){
            a[ch]++;
        }for(int index = 0 ; index < a.length;index++){
            if(a[index]!= 0){
                System.out.println((char)index + ":" + a[index]);
            }
        }
        int temp ;
        for(int i=0 ;i< a.length;i++ ){


        }
    }
}
