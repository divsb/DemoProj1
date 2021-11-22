package cucumberruntest;

	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)				
	@CucumberOptions( features = "Features/mulitplevalues.feature",
			glue={"cucumbersearchstepdefinitions"})
	                              

	public class runnertestformultivalues 				
	{		

	}


