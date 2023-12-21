import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class my_UnitTest_Case {

//1) Test for getting the diagnostic (Status) 
	@Test
	public void test_getdiagnosis() {
		BuildDatas testObj = new BuildDatas(842302, 1, 20.17, 10.38, 122.8, 1001, 0.1184, 0.2776, 0.3001, 0.1471,
				0.2419, 0.07871, 1.095, 0.9053, 8.589, 153.4, 0.006399, 0.04904, 0.05373, 0.01587, 0.03003, 0.006193,
				25.38, 17.33, 184.6, 2019, 0.1622, 0.6656, 0.7119, 0.2654, 0.4601, 0.1189);
		int output_id = testObj.getdiagnosis();
		int extectedResult = 1;

		// TEST the output to see if the it is equal to the id: 842302

		assertEquals(extectedResult, output_id);
	}

	// 2) Test for getting the id
	@Test
	public void test_getid() {
		BuildDatas testObj = new BuildDatas(842302, 1, 20.17, 10.38, 122.8, 1001, 0.1184, 0.2776, 0.3001, 0.1471,
				0.2419, 0.07871, 1.095, 0.9053, 8.589, 153.4, 0.006399, 0.04904, 0.05373, 0.01587, 0.03003, 0.006193,
				25.38, 17.33, 184.6, 2019, 0.1622, 0.6656, 0.7119, 0.2654, 0.4601, 0.1189);
		int output_id = testObj.getid();
		int extectedResult = 842302;

		// TEST the output to see if the it is equal to the id: 842302

		assertEquals(extectedResult, output_id);
	}


}

