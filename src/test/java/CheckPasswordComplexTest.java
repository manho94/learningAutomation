import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckPasswordComplexTest {
    @Test
    void passwordLengthCorrect(){
        Assert.assertTrue(day2.CheckPasswordComplex.checkPasswordLength("ABnhjyutrty"));
    }
    @Test
    void passwordLengthIncorrect(){
        Assert.assertFalse(day2.CheckPasswordComplex.checkPasswordLength("abcdefghij"));
    }
    @Test
    void passwordIsUppercase1(){
        Assert.assertTrue(day2.CheckPasswordComplex.isUppercase("Auu"));
    }
    @Test
    void passwordIsUppercase2(){
        Assert.assertTrue(day2.CheckPasswordComplex.isUppercase("uuZ"));
    }
    @Test
    void passwordIsNotUppercase(){
        Assert.assertFalse(day2.CheckPasswordComplex.isUppercase("helloworld"));

    }
    @Test
    void passwordIsLowercase1(){
        Assert.assertTrue(day2.CheckPasswordComplex.isLowercase("aFF"));
    }
    @Test
    void passwordIsLowercase2(){
        Assert.assertTrue(day2.CheckPasswordComplex.isLowercase("FFz"));
    }
    @Test
    void passwordIsNotLowercase(){
        Assert.assertFalse(day2.CheckPasswordComplex.isLowercase("HELLO"));
    }
    @Test
    void passwordIsNumber(){
        Assert.assertTrue(day2.CheckPasswordComplex.isNumber("hello1"));
    }
    @Test
    void passwordIsNotNumber(){
        Assert.assertFalse(day2.CheckPasswordComplex.isNumber("hello@@#"));
    }
    @Test
    void passwordIsSpecialChar(){
        Assert.assertTrue(day2.CheckPasswordComplex.isSpecialChar("@#hhh"));
    }
    @Test
    void passwordIsNotSpecialChar(){
        Assert.assertFalse(day2.CheckPasswordComplex.isSpecialChar("hhhh1111"));
    }
    @Test
    void passwordIsNotValidChar(){
        Assert.assertTrue(day2.CheckPasswordComplex.isNotValidRule("56A hb"));
    }

    @Test
    void passwordRuleIsCorrect(){
        Assert.assertTrue(day2.CheckPasswordComplex.checkPasswordRuleCorrect("Abc1234@#bV"));
    }

    @Test
    void passwordRuleIsNotCorrectLength(){
        Assert.assertFalse(day2.CheckPasswordComplex.checkPasswordRuleCorrect("Abc1234@#b"));
    }
    @Test
    void passwordRuleIsNotCorrectUppercase(){
        Assert.assertFalse(day2.CheckPasswordComplex.checkPasswordRuleCorrect("abc1234@#bv"));
    }
    @Test
    void passwordRuleIsNotCorrectLowercase(){
        Assert.assertFalse(day2.CheckPasswordComplex.checkPasswordRuleCorrect("ABC1234@#BV"));
    }
    @Test
    void passwordRuleIsNotCorrectNumber(){
        Assert.assertFalse(day2.CheckPasswordComplex.checkPasswordRuleCorrect("ABCabcd@#BV"));
    }
    @Test
    void passwordRuleIsNotCorrectSpecialChar(){
        Assert.assertFalse(day2.CheckPasswordComplex.checkPasswordRuleCorrect("ABC123456BV"));
    }
    @Test
    void passwordRuleIsNotCorrectRuleSpace(){
        Assert.assertFalse(day2.CheckPasswordComplex.checkPasswordRuleCorrect("Abc12 34@#bV"));
    }

}
