package day2;

public class Main {
    public static void main(String[] args) {


//        if (isEvenNumber(8) == true){
//            System.out.println("This number is even number ");
//        }else
//            System.out.println("This number is NOT even number ");

        System.out.println(reverseNumber(0));

//        if (isPrime(31) == true){
//            System.out.println("This number is a prime number");
//        }else
//            System.out.println("This number is NOT a prime number");

//        if (isVowel('h')== true){
//            System.out.println("This number is a vowel");
//        }else
//            System.out.println("This number is NOT a vowel");


    }

    public static boolean isEvenNumber(int n){
        boolean isEven = true;
        if(n%2==0){
            isEven = true;
        }else{
            isEven = false;
        }
        return isEven;
    }

    public static int reverseNumber(int number){
        String nString = String.valueOf(number);
        String outputNumber = "";
        if(number <0){
            for (int i = nString.length()-1; i >0; i--){
                outputNumber = outputNumber + nString.charAt(i);
            }
            outputNumber = "-" + outputNumber;
        }else{
            for (int i = nString.length()-1; i >=0; i--){
                outputNumber = outputNumber + nString.charAt(i);
            }
        }

        return Integer.valueOf(outputNumber);
    }

    public static boolean isPrime(int number){
        boolean isPrime = true;
        if (number == 1){
            isPrime = false;
        }
        if (number == 2){
            isPrime = true;
        }
        if (number > 2){
            for (int i= 2; i <=number -1; i++){
                if (number%i ==0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;

    }

    public static boolean isVowel(char A){
        boolean isVowel = true;
        if (A == 'u' || A == 'e' || A == 'o' || A == 'a' || A == 'i'){
            isVowel = true;
        }else{
            isVowel = false;
        }
        return isVowel;
    }
}
