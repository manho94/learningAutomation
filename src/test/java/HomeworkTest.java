import day1.Homework;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeworkTest {
    @Test
    void twoIsEvenNumber(){
        Assert.assertTrue(day1.Homework.isEvenNumber(2));
    }

    @Test
    void threeIsNotEvenNumber(){
        Assert.assertFalse(day1.Homework.isEvenNumber(3));
    }

    @Test
    void reverseNegativeNumber(){
        Assert.assertEquals(day1.Homework.reverseNumber(-163),-361);
    }
    @Test
    void reversePositiveNumber(){
        Assert.assertEquals(day1.Homework.reverseNumber(470),74);
    }
    @Test
    void oneIsNotPrime(){
        Assert.assertFalse(day1.Homework.isPrime(1));
    }
    @Test
    void twoIsPrime(){
        Assert.assertTrue(day1.Homework.isPrime(2));
    }
    @Test
    void sevenIsPrime(){
        Assert.assertTrue(day1.Homework.isPrime(7));
    }
    @Test
    void eightIsNotPrime(){
        Assert.assertFalse(day1.Homework.isPrime(8));
    }
    @Test
    void negativeNumber(){
        Assert.assertFalse(day1.Homework.isPrime(-5));
    }
    @Test
    void uIsVowel(){
        Assert.assertTrue(day1.Homework.isVowel('u'));
    }
    @Test
    void uUppercaseIsVowel(){
        Assert.assertTrue(day1.Homework.isVowel('U'));
    }
    @Test
    void eIsVowel(){
        Assert.assertTrue(day1.Homework.isVowel('e'));
    }
    @Test
    void eUppercaseIsVowel(){
        Assert.assertTrue(day1.Homework.isVowel('E'));
    }
    @Test
    void oIsVowel(){
        Assert.assertTrue(day1.Homework.isVowel('o'));
    }
    @Test
    void oUppercaseIsVowel(){
        Assert.assertTrue(day1.Homework.isVowel('O'));
    }
    @Test
    void aIsVowel(){
        Assert.assertTrue(day1.Homework.isVowel('a'));
    }
    @Test
    void aUppercaseIsVowel(){
        Assert.assertTrue(day1.Homework.isVowel('A'));
    }
    @Test
    void iIsVowel(){
        Assert.assertTrue(day1.Homework.isVowel('i'));
    }
    @Test
    void iUppercaseVowel(){
        Assert.assertTrue(day1.Homework.isVowel('I'));
    }
    @Test
    void consonantIsNotVowel(){
        Assert.assertFalse(day1.Homework.isVowel('h'));
    }
    @Test
    void numberIsNotVowel(){
        Assert.assertFalse(day1.Homework.isVowel('2'));
    }


}
