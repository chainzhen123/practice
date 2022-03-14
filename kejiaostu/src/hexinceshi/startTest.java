package hexinceshi;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class startTest {

	public static void main(String[] args) {
		
		TestNG tng = new TestNG();
		List<String> suites = new ArrayList<String>();
		suites.add("演示2_大数据相关测试.xml");
		tng.setTestSuites(suites);
		tng.run();
	}
}
