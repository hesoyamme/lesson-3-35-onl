public class Main {
    public static void main(String[] args) {

        int num = 8665645;
        int max  =  num % 10;
        int min =  num % 1;
       while (num != 0 ){

           if (num %  10 >= max){
               max =  num % 10;

           }else if (num % 10 < min){
               min =  num % 10;
           }
num = num / 10;


       }
        System.out.println(max);
        System.out.println(min);
    }
}