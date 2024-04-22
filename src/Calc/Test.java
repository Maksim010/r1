package Calc;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.Test
     public void test(){
        int res=ClassTest.getResult(2,2);
        Assertions.assertEquals(4,res);
        int res1=ClassTest.getResult(3,2);
        Assertions.assertEquals(9,res1);
        int res2=ClassTest.getResult(3,4);
        Assertions.assertEquals(1,res2);
        int res3=ClassTest.getResult(10,10000);
        Assertions.assertEquals(0,res3);

    }
}
