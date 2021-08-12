import org.testng.annotations.*;
import org.testng.annotations.Test;

public class PreandPostCondition {
    @Test
    public void testMethod(){

        System.out.println("im test");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("in before");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I'm after method");
    }

}
