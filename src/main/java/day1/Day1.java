package day1;


public class Day1 {

    public static void main(String[] args) {
        //Create method
        //add, sub, div, mul
        // return int

        Day1 cal = new Day1();
        System.out.println(cal.add(9999, 399));
        System.out.println(cal.sub(9, 10));
        System.out.println(cal.div(9, 0));
        cal.mul(4, 6);



    }
    public int add(int x, int y){
        return x+y;
    }
    public int sub(int x, int y){
        return x-y;
    }
    public double div(int x, int y){
        try{
            return x/y;
        }catch (Exception exception){
            return -1;
        }

    }
    public int mul(int x, int y){
        return x*y;
    }
}
