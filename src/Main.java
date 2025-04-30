public class Main {
    public static void main(String[] args) {

        int number = 8665645;
        int max  =  number % 10;
        int min =  number % 10;
       while (number != 0 ){

           if (number %  10 >= max){
               max =  number % 10;

           }else if (number % 10 < min){
               min =  number % 10;
           }
           number = number / 10;


       }
        System.out.println(max);
        System.out.println(min);
    }
}