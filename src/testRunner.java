import java.io.IOException;

import org.apache.xmlbeans.XmlException;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.iface.Submit.Status;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

import junit.framework.Assert;

public class testRunner {

	

public static void main(String[] args) throws XmlException, IOException, SoapUIException {
		// TODO Auto-generated method stub

		WsdlProject project = new WsdlProject(
				"C:\\01_AhmedWork\\01_Study\\01_API_Testing\\01_API_Study\\Projects_Rahul\\Employee.xml");
		WsdlTestSuite testsuite = project.getTestSuiteByName("Testing");

		for (int i = 0; i < testsuite.getTestCaseCount(); i++) {
			
			WsdlTestCase testcase= testsuite.getTestCaseAt(i); // getting test cases from test suite
			TestRunner runner = testcase.run(new PropertiesMap(), false); //running test cases
			//Assert.assertEquals(Status.FINISHED, runner.getStatus());

		}

	
}

}
