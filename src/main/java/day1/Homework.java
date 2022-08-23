package day1;

public class Homework {
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
        if (number <=0){
            isPrime = false;
        }
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
        if (A == 'u' || A == 'e' || A == 'o' || A == 'a' || A == 'i'
                || A == 'U' || A == 'E' || A == 'O' || A == 'A' || A == 'I'){
            isVowel = true;
        }else{
            isVowel = false;
        }
        return isVowel;
    }
}
