package Util;
import io.cucumber.java.Scenario;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import net.serenitybdd.core.pages.PageObject;

public class UtilFactory extends PageObject{
    public UtilFactory(WebDriver driver) {
        driver = super.getDriver();
    }

    public String getFeatureName(Scenario scenario) {
        String featureFilePath = String.valueOf(scenario.getUri());
        return featureFilePath.substring((featureFilePath.lastIndexOf('/') + 1), featureFilePath.indexOf('.'));
    }
    public String readJSON(String featureName, String scenarioNo, String key, String fileName) {
        JSONParser parser = new JSONParser();
        try {
            String dataFileEnvPath = "src/test/resources/data/" + System.getProperty("env");
            String dataFilePath = dataFileEnvPath + "/" + fileName;
            java.io.File dataFile = new java.io.File(dataFilePath);
            if (!dataFile.exists()) {
                Assert.fail("Given environment data file not found at location=" + dataFilePath);
            }
            Object objectFromDataFile = parser.parse(new FileReader(dataFilePath));
            JSONObject jsonObjectFromDataFile = (JSONObject) objectFromDataFile;
            JSONObject featureObject = (JSONObject) jsonObjectFromDataFile.get(featureName);
            System.out.println("featureObject----->" + featureObject);
            JSONObject scenarioObject = (JSONObject) featureObject.get(scenarioNo);

            return (String) scenarioObject.get(key);
        } catch (FileNotFoundException e) {
            System.out.println("open page");

        } catch (IOException e) {
            System.out.println("login succesfully");
        } catch (ParseException e) {
            System.out.println("save changes");
        }
        return "Error while getting json value";
    }
}

