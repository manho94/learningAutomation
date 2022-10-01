package features.elements;

import org.testng.annotations.*;

public class TestSample {
    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before suite");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test");
    }

    @Parameters({"browser"})
    @BeforeClass
    void beforeClass(String browser){
        System.out.println("Before Class" + browser);
    }
    @BeforeGroups
    void beforeGroup(){
        System.out.println("Before Group");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method");
    }
    @Test(description = "")
    public void tc01(){
        System.out.println("tc01");
    }
    @Test(description = "")
    public void tc02(){
        System.out.println("tc02");
    }
    @Test(description = "")
    public void tc03(){
        System.out.println("tc03");
    }
    @Test(description = "")
    public void tc04(){
        System.out.println("tc04");
    }
    @Test(description = "")
    public void tc05(){
        System.out.println("tc05");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("After Method");
    }
    @AfterGroups
    void afterGroup(){
        System.out.println("After Group");
    }
    @AfterClass
    void afterClass(){
        System.out.println("After Class");
    }
    @AfterTest()
    void afterTest(){
        System.out.println("After Test");
    }
    @AfterSuite()
    void afterSuite(){
        System.out.println("After Suite");
    }

}
