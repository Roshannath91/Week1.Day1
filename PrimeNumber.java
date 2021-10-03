package week1.day1;

public class PrimeNumber {




    public static void main(String[] args) {




        int input = 17;




        boolean var=false;



        for(int i=2;i<=input/2;i++){
            if(input%i==0){
                var = true;
                break;
            }

            }
        if(var==false){
            System.out.println(input + " is a prime number");
        }else {
            System.out.println(input + " is not a prime number");
        }




    }

}
