package com.github.ehdez73.serenitybddexample.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/PurchaseCarrierService.feature"
 )
public class PurchaseCarrierServiceTest {}
