package idv.hsiehpinghan.ooziecloudera.test;


import org.apache.oozie.local.LocalOozie;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import idv.hsiehpinghan.ooziecloudera.configuration.SpringConfiguration;

@ContextConfiguration(classes = { SpringConfiguration.class })
public class LocalOozieTest extends AbstractTestNGSpringContextTests {

	@Test
	public void test() {
//		org.apache.oozie.client.
		LocalOozie.getClient();
//		LocalOozie.getClient();
		
//		org.apache.oozie.cli.
		
	}
}
