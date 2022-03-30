package com.salaryfinance.cucumber;

import com.cucumber.listener.Reporter;
import com.salaryfinance.propertyreader.PropertyReader;
import com.salaryfinance.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import com.salaryfinance.propertyreader.PropertyReader;
import com.salaryfinance.utility.Utility;

import java.io.IOException;

public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Kajal");
    }
    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            String screenShotPath = Utility.getScreenshot(driver,scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        closeBrowser();
    }
}


