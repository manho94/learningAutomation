package features.elements;

import org.testng.annotations.*;

public class TestSample2 {
    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before suite: TestSample2");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test: TestSample2");
    }

    @Parameters({"browser"})
    @BeforeClass
    void beforeClass(String browser){
        System.out.println("Before Class: TestSample2" + browser);
    }
    @BeforeGroups
    void beforeGroup(){
        System.out.println("Before Group: TestSample2");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method: TestSample2");
    }
    @Test(description = "")
    public void tc01(){
        System.out.println("tc01: TestSample2");
    }
    @Test(description = "")
    public void tc02(){
        System.out.println(": TestSample2");
    }
    @Test(description = "")
    public void tc03(){
        System.out.println("tc03: TestSample2");
    }
    @Test(description = "")
    public void tc04(){
        System.out.println("tc04: TestSample2");
    }
    @Test(description = "")
    public void tc05(){
        System.out.println("tc05: TestSample2");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("After Method: TestSample2");
    }
    @AfterGroups
    void afterGroup(){
        System.out.println("After Group: TestSample2");
    }
    @AfterClass
    void afterClass(){
        System.out.println("After Class: TestSample2");
    }
    @AfterTest()
    void afterTest(){
        System.out.println("After Test: TestSample2");
    }
    @AfterSuite()
    void afterSuite(){
        System.out.println("After Suite: TestSample2");
    }
}
