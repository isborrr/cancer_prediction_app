import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

//Final exam => Tuesday 19th
// For missing data = -1
//Max missing data = 8pts
//Change it to average of the col
//Deadline Friday
//Testing Reading data, One Dicision tree, Missing Data
//System entire Testing 

//Mystep 

//M=> The person ha cancer 
//B=>no cancer
public class PredictionApp {
	// 1) Function to read data from txt file and populate an array of object
//	static void myMethod(BuildDatas[] dataArr) throws Exception {
	private static void readFromFile(String filePath, BuildDatas[] dataForTrainning) throws IOException {
		int converStatusToINt = -1;
		int objectIndex = 0;
		int index = 0;
		// FileReader reads text files in the default encoding.
		FileReader fileReader = new FileReader(filePath);

		// Wrap FileReader in BufferedReader.
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		try {
			String line;
			// Read lines from the file until there are no more lines.
			while ((line = bufferedReader.readLine()) != null) {
				if (index == (dataForTrainning.length - 1)) {
					break;
				}
//				System.out.println(line); // You can process the line as needed.
				ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList(line.split(",")));
				if (myArrayList.get(1).equals("M")) {
					// the person has cancer
					converStatusToINt = 1;
//					System.out.println("M at : " + myArrayList.get(0));
				} else if (myArrayList.get(1).equals("B")) {
					converStatusToINt = 0;
//					System.out.println(myArrayList.get(1));

				}
				BuildDatas data = new BuildDatas(Integer.parseInt(myArrayList.get(0)), converStatusToINt,
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0)),
						Double.parseDouble(myArrayList.get(0)), Double.parseDouble(myArrayList.get(0))

				);
				
				dataForTrainning[index] = data;
				index++;

//				System.out.println(myArrayList);
				
			}
		} finally {
			// Always close files.
			bufferedReader.close();
		}
	}


		public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 1) Get the data from a txt file and feed it into an object array of 50 elemts
		// for trainning

		BuildDatas[] trainningDatas = new BuildDatas[50];

//
		String filePath = "/Users/ismaelboro/Desktop/Desktop/Queens College/fall 2023/CSCI "
				+ "370 Software Engineering/Assignments/SoftwareProject/Data Source/wdbc.txt"; // Update
																																										// with
																																										// your
																																										// file
																																										// path

		try {
			readFromFile(filePath, trainningDatas);
		} catch (IOException e) {
			e.printStackTrace();
		}

//
		System.out.println(trainningDatas[0].getdiagnosis());

		System.out.println("Ok workink");


	}

}
