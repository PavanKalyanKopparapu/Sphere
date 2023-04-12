package RunnerDemo;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {}, features = "C:\\Users\\Pavan.Kopparapu\\Downloads\\Demoproject (2)\\Sphere", glue = "StepDefination")

public class runner {
}
