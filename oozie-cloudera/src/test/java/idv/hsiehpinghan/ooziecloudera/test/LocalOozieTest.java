package idv.hsiehpinghan.ooziecloudera.test;


import java.util.Properties;

//import org.apache.oozie.client.OozieClient;
//import org.apache.oozie.client.WorkflowJob;
//import org.apache.oozie.local.LocalOozie;
//import org.apache.oozie.service.ConfigurationService;
//import org.apache.oozie.service.Services;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
//import org.testng.annotations.Test;

import idv.hsiehpinghan.ooziecloudera.configuration.SpringConfiguration;

//@ContextConfiguration(classes = { SpringConfiguration.class })
//public class LocalOozieTest extends AbstractTestNGSpringContextTests {
public class LocalOozieTest {
//	@Test  not work !!! 
//	public void test() throws Exception {
//		
//		System.setProperty(Services.OOZIE_HOME_DIR, "/var/lib/oozie");
//		System.setProperty(ConfigurationService.OOZIE_CONFIG_DIR, "/var/lib/oozie");
//		
//	    LocalOozie.start();
//	    OozieClient wc = new OozieClient("http://node0:11000/oozie");
//	    Properties conf = wc.createConfiguration();
//	    conf.setProperty(OozieClient.APP_PATH, "hdfs://node0:8020/user/oozie/examples/apps/shell");
//	    conf.setProperty("jobTracker", "node0:8032");
//	    String jobId = wc.run(conf);
//	    System.out.println("Workflow job submitted");
//	    while (wc.getJobInfo(jobId).getStatus() == WorkflowJob.Status.RUNNING) {
//	        System.out.println("Workflow job running ...");
//	        Thread.sleep(10 * 1000);
//	    }
//	    System.out.println("Workflow job completed ...");
//	    System.out.println(wc.getJobInfo(jobId));
//		
//	}
	
//	@Test  not work !!!
//	public void test() throws Exception {
//	    LocalOozie.start();
//	    OozieClient wc = LocalOozie.getClient();
//	    Properties conf = wc.createConfiguration();
//	    conf.setProperty("nameNode", "hdfs://node0:8020");
//	    conf.setProperty("jobTracker", "node0:8032");
//	    conf.setProperty("queueName", "default");
//	    conf.setProperty("examplesRoot", "examples");
//	    conf.setProperty("user", "oozie");
////	    conf.setProperty("oozie.home.dir", "/var/lib/oozie");
//	    
//	    
//	    conf.setProperty(OozieClient.APP_PATH, "${nameNode}/user/${user}/${examplesRoot}/apps/shell");
//	    String jobId = wc.run(conf);
//	    System.out.println("Workflow job submitted");
//	    while (wc.getJobInfo(jobId).getStatus() == WorkflowJob.Status.RUNNING) {
//	        System.out.println("Workflow job running ...");
//	        Thread.sleep(10 * 1000);
//	    }
//	    // print the final status o the workflow job
//	    System.out.println("Workflow job completed ...");
//	    System.out.println(wc.getJobInfo(jobId));
//	    // stop local Oozie
//	    LocalOozie.stop();
//		
//	}
}
