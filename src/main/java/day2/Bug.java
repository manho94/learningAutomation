package day2;

import java.util.Random;

public class Bug {
    private String title;
    private String id;
    private String description;
    protected String status;
    private String reporterTester;
    private String assigneeDevelopment;

    public Bug(String title, String description, String reporterTester, String assigneeDevelopment) {
        Random random = new Random();
        this.title = title;
        this.id = random.toString();
        this.description = description;
        this.status = "Open";
        this.reporterTester = reporterTester;
        this.assigneeDevelopment = assigneeDevelopment;
    }

    public Bug() {
    }

    public void infor(){

    }

    void changeStatus(String status){
        this.status = status;
    }
}
