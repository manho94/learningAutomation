package day2;

public class CheckPasswordComplex {
//    Password length > 10 chars
//    and At least 1 uppercase: ASCII from 65 -> 90
//    and At least 1 lowercase: ASCII from 97 -> 122
//    and At least 1 number: ASCII frm 48 -> 57
//    and At least 1 special character:
//    !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
//    33-> 47 or 58 --> 64 or 91 -> 96 || 123 -> 126

    public static boolean checkPasswordRuleCorrect(String password){
        boolean isPasswordRule = false;
        if (checkPasswordLength(password) == true && isUppercase(password) == true
                && isLowercase(password) == true && isNumber(password) == true
                && isSpecialChar(password) == true && isNotValidRule(password) == false){
            return true;
        }
        return isPasswordRule;
    }
    //Check password Length
    public static boolean checkPasswordLength(String password){
        boolean isLengthCorrect = false;
        if (password.length() > 10){
            isLengthCorrect = true;
        }
        return isLengthCorrect;
    }

    //Check password includes Uppercase
    public static boolean isUppercase(String password){
        boolean isUppercase = false;
        for (int i = 0; i < password.length(); i++){
            if ((int)password.charAt(i) >= 65 && (int)password.charAt(i)<=90){
                isUppercase = true;
            }
        }
        return isUppercase;
    }
    //Check password includes Lowercase
    public static boolean isLowercase(String password){
        boolean isLowercase = false;
        for (int i = 0; i < password.length(); i++){
            if ((int) password.charAt(i) >=97 && (int)password.charAt(i)<=122){
                isLowercase = true;
            }
        }
        return isLowercase;
    }

    //Check password includes number
    public static boolean isNumber(String password){
        boolean isNumber = false;
        for (int i = 0; i < password.length(); i++){
            if ((int)password.charAt(i) >= 48 && (int)password.charAt(i) <= 57){
                isNumber = true;
            }
        }
        return isNumber;
    }
    //Check password includes Special Character
    public static boolean isSpecialChar(String password){
        boolean isSpecialChar = false;
        for (int i = 0; i < password.length(); i++){
            if (((int)password.charAt(i) >=33 && (int)password.charAt(i)<=47)
                    || ((int)password.charAt(i) >=58 && (int)password.charAt(i)<=64)
                    || ((int)password.charAt(i) >=91 && (int)password.charAt(i)<=96)
                    || ((int)password.charAt(i) >=123 && (int)password.charAt(i)<=126)){
                isSpecialChar = true;
            }
        }
        return isSpecialChar;
    }

    //Check password does NOT include Non-printed Characters and space char
    public static boolean isNotValidRule(String password){
        boolean isNotValidRule = false;
        for (int i = 0; i < password.length(); i++){
            if (((int)password.charAt(i) >=0 && (int)password.charAt(i)<=31)
                    || ((int)password.charAt(i) == 32) | ((int)password.charAt(i) == 127)){
                isNotValidRule = true;
            }
        }
        return isNotValidRule;
    }

}
