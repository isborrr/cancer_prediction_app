import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class system_testing {

	@Test
	public void testCanerPredictionUsingRamdomForest() throws IOException, NumberFormatException {
				String filePath = "/Users/ismaelboro/Desktop/Desktop/Queens College/fall 2023/CSCI "
						+ "370 Software Engineering/Assignments/SoftwareProject/Data Source/patientData.txt";
				 BuildDatas[] dataForTrainning = new BuildDatas[50];
				int converStatusToINt = -1;
				int objectIndex = 0;
				int index = 0;
				// FileReader reads text files in the default encoding.
				FileReader fileReader = null;
				try {
					fileReader = new FileReader(filePath);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// Wrap FileReader in BufferedReader.
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				try {
					String line;
					// Read lines from the file until there are no more lines.
					try {
						while ((line = bufferedReader.readLine()) != null) {
							if (index == (dataForTrainning.length - 1)) {
								break;
							}
							ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList(line.split(",")));
							if (myArrayList.get(1).equals("M")) {
								// the person has cancer
								converStatusToINt = 1;
							} else if (myArrayList.get(1).equals("B")) {
								converStatusToINt = 0;

							}
							BuildDatas data = new BuildDatas(Integer.parseInt(myArrayList.get(0)), converStatusToINt,
									Double.parseDouble(myArrayList.get(2)), Double.parseDouble(myArrayList.get(3)),
									Double.parseDouble(myArrayList.get(4)), Double.parseDouble(myArrayList.get(5)),
									Double.parseDouble(myArrayList.get(6)), Double.parseDouble(myArrayList.get(7)),
									Double.parseDouble(myArrayList.get(8)), Double.parseDouble(myArrayList.get(9)),
									Double.parseDouble(myArrayList.get(10)), Double.parseDouble(myArrayList.get(11)),
									Double.parseDouble(myArrayList.get(12)), Double.parseDouble(myArrayList.get(13)),
									Double.parseDouble(myArrayList.get(14)), Double.parseDouble(myArrayList.get(15)),
									Double.parseDouble(myArrayList.get(16)), Double.parseDouble(myArrayList.get(17)),
									Double.parseDouble(myArrayList.get(18)), Double.parseDouble(myArrayList.get(19)),
									Double.parseDouble(myArrayList.get(20)), Double.parseDouble(myArrayList.get(21)),
									Double.parseDouble(myArrayList.get(22)), Double.parseDouble(myArrayList.get(23)),
									Double.parseDouble(myArrayList.get(24)), Double.parseDouble(myArrayList.get(25)),
									Double.parseDouble(myArrayList.get(26)), Double.parseDouble(myArrayList.get(27)),
									Double.parseDouble(myArrayList.get(28)), Double.parseDouble(myArrayList.get(29)),
									Double.parseDouble(myArrayList.get(30)), Double.parseDouble(myArrayList.get(31))

							);

							dataForTrainning[index] = data;
							index++;

						}
					} catch (NumberFormatException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} finally {
					// Always close files.
					try {
						bufferedReader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
				public static void main(String[] args) throws IOException {
				// TODO Auto-generated method stub

				// 1) Get the data from a txt file and feed it into an object array of 50 elemts
				// for trainning

				BuildDatas[] trainningDatas = new BuildDatas[50];

		//
				String filePath = "/Users/ismaelboro/Desktop/Desktop/Queens College/fall 2023/CSCI "
						+ "370 Software Engineering/Assignments/SoftwareProject/Data Source/patientData.txt"; // Update

				// 2) Building the desicion tree with the trainning data
				DecisionTree.callDecisionTree(trainningDatas);
				
				Scanner myObj = new Scanner(System.in); // Create a Scanner object
				System.out.println("Welcome to the Cancer Prediction App VERSION : 1.00 " );
				
				System.out.println(
						"Please enter the following Information regarding the patient in order, beginning and ending by { } and comment separated:    ");


				// Example usage
				double[][] data = {
						// Add your data here
				};
				RandomForest randomForest = new RandomForest(6);

				while (true) {
					String doctorInput = "202302,M,20.17,10.38,122.8,1001,0.1184,0.2776,0.3001,0.1471,0.2419,0.07871,"
							+ "1.095,0.9053,8.589,153.4,0.006399,0.04904,0.05373,0.01587,0.03003,0.006193,25.38,"
							+ "17.33,184.6,2019,0.1622,0.6656,0.7119,0.2654,0.4601,0.1189";

					int extectedResult = 1;
				int predictionResult = RandomForest.createBootstrapSample(doctorInput);
//TEST RESULT COMPARISON WITH EXPECTED VALUE
					assertEquals(extectedResult, predictionResult);


			}
		}
	}


