package co.sophos.banitsmo.certificate.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.konecta.linde.certificate.stepsdefinitions",
        features = "src/test/resources/features/reportepetroleo.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

    public class ReportePetroleoRunner {
    }
