import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecisionTree {

	public static void callDecisionTree(BuildDatas[] data1) {
		// Example usage
		double[][] data = {
				{ 842302, 1, 17.99, 10.38, 122.8, 1001, 0.1184, 0.2776, 0.3001, 0.1471, 0.2419, 0.07871, 1.095, 0.9053,
						8.589, 153.4, 0.006399, 0.04904, 0.05373, 0.01587, 0.03003, 0.006193, 25.38, 17.33, 184.6, 2019,
						0.1622, 0.6656, 0.7119, 0.2654, 0.4601, 0.1189 },
				{ 842517, 1, 20.57, 17.77, 132.9, 1326, 0.08474, 0.07864, 0.0869, 0.07017, 0.1812, 0.05667, 0.5435,
						0.7339, 3.398, 74.08, 0.005225, 0.01308, 0.0186, 0.0134, 0.01389, 0.003532, 24.99, 23.41, 158.8,
						1956, 0.1238, 0.1866, 0.2416, 0.186, 0.275, 0.08902 },
				// Add more data as needed
		};

		String[] features = { "id", "status", "radius_mean", "texture_mean", "perimeter_mean", "area_mean",
				"smoothness_mean", "compactness_mean", "concavity_mean", "concave_points_mean", "symmetry_mean",
				"fractal_dimension_mean", "radius_standard_error", "texture_standard_error", "perimeter_standard_error",
				"area_standard_error", "smoothness_standard_error", "compactness_standard_error",
				"concavity_standard_error", "concave_points_standard_error", "symmetry_standard_error",
				"fractal_dimension_standard_error", "radius_worst", "texture_worst", "perimeter_worst", "area_worst",
				"smoothness_worst", "compactness_worst", "concavity_worst", "concave_points_worst", "symmetry_worst",
				"fractal_dimension_worst" };

		int targetIndex = 1; // Index of the status feature (target variable)

		DecisionTreeNode root = buildDecisionTree(data, features, targetIndex);
		System.out.println("Decision Tree built successfully!");

		// Example instance for prediction
		double[] instance = { 12345, 1, 15.0, 20.0, 110.0, 1000.0, 0.1, 0.2, 0.3, 0.15, 0.25, 0.07, 1.2, 1.0, 10.0,
				150.0, 0.005, 0.05, 0.06, 0.01, 0.02, 0.004, 22.0, 18.0, 120.0, 1300.0, 0.15, 0.6, 0.7, 0.2, 0.5, 0.1 };

		double prediction = predict(root, instance);
		System.out.println("Prediction for the instance: " + prediction);

	}



	private static DecisionTreeNode buildDecisionTree(double[][] data, String[] features, int targetIndex) {
		if (data.length == 0) {
			return null;
		}

		double[] classLabels = getColumn(data, targetIndex);

		// If all instances have the same class label, create a leaf node
		if (isHomogeneous(classLabels)) {
			return new DecisionTreeNode(classLabels[0]);
		}

		// If no features are left, create a leaf node with the majority class label
		if (features.length == 0) {
			double majorityClass = getMajorityClass(classLabels);
			return new DecisionTreeNode(majorityClass);
		}

		// Find the best feature for splitting
		String bestFeature = findBestFeature(data, features, classLabels);
		int bestFeatureIndex = Arrays.asList(features).indexOf(bestFeature);

		// Create a non-leaf node with the best feature as the decision attribute
		DecisionTreeNode node = new DecisionTreeNode(bestFeatureIndex, bestFeature);

		// Remove the best feature from the list of available features
		String[] remainingFeatures = Arrays.copyOfRange(features, 0, bestFeatureIndex);
		String[] newFeatures = Arrays.copyOfRange(features, bestFeatureIndex + 1, features.length);
		System.arraycopy(newFeatures, 0, remainingFeatures, bestFeatureIndex, newFeatures.length);

		// Split the data based on the best feature
		Map<Double, List<double[]>> subsets = splitData(data, bestFeatureIndex);

		// Recursively build the decision tree for each subset
		for (Map.Entry<Double, List<double[]>> entry : subsets.entrySet()) {
			double featureValue = entry.getKey();
			List<double[]> subset = entry.getValue();

			DecisionTreeNode childNode = buildDecisionTree(subset.toArray(new double[0][0]), remainingFeatures,
					targetIndex);
			node.addChild(featureValue, childNode);
		}

		return node;
	}

	static double predict(DecisionTreeNode node, double[] instance) {
		if (node.isLeaf()) {
			return node.getLabel();
		}

		double featureValue = instance[(int) node.getDecisionAttribute()];
		DecisionTreeNode childNode = node.getChild(featureValue);

		if (childNode == null) {
			// If there is no child node for the observed feature value, return the majority
			// class label
			return getMajorityClass(getColumn(node.getData(), node.getTargetIndex()));
		}

		// Recursively predict for the child node
		return predict(childNode, instance);
	}

	private static String findBestFeature(double[][] data, String[] features, double[] classLabels) {
		double bestInfoGain = Double.MIN_VALUE;
		String bestFeature = null;

		for (String feature : features) {
			double infoGain = calculateInfoGain(data, feature, classLabels);
			if (infoGain > bestInfoGain) {
				bestInfoGain = infoGain;
				bestFeature = feature;
			}
		}

		return bestFeature;
	}

	private static double calculateInfoGain(double[][] data, String feature, double[] classLabels) {
		double entropyBeforeSplit = calculateEntropy(classLabels);

		int featureIndex = Arrays.asList(feature).indexOf(feature);
		double[] featureValues = getColumn(data, featureIndex);

		Map<Double, List<double[]>> subsets = splitData(data, (int) featureValues[0]);

		double entropyAfterSplit = 0.0;
		for (List<double[]> subset : subsets.values()) {
			double[] subsetClassLabels = getColumn(subset.toArray(new double[0][0]), subset.get(0).length - 1);
			double weight = (double) subset.size() / data.length;
			entropyAfterSplit += weight * calculateEntropy(subsetClassLabels);
		}

		return entropyBeforeSplit - entropyAfterSplit;
	}

	private static double calculateEntropy(double[] classLabels) {
		int totalInstances = classLabels.length;
		Map<Double, Integer> classCounts = new HashMap<>();

		for (double label : classLabels) {
			classCounts.put(label, classCounts.getOrDefault(label, 0) + 1);
		}

		double entropy = 0.0;
		for (int count : classCounts.values()) {
			double probability = (double) count / totalInstances;
			entropy -= probability * log2(probability);
		}

		return entropy;
	}

	private static double log2(double x) {
		return Math.log(x) / Math.log(2);
	}

	private static boolean isHomogeneous(double[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[0]) {
				return false;
			}
		}
		return true;
	}

	private static double getMajorityClass(double[] classLabels) {
		Map<Double, Integer> classCounts = new HashMap<>();
		for (double label : classLabels) {
			classCounts.put(label, classCounts.getOrDefault(label, 0) + 1);
		}

		double majorityClass = 0;
		int maxCount = 0;

		for (Map.Entry<Double, Integer> entry : classCounts.entrySet()) {
			if (entry.getValue() > maxCount) {
				majorityClass = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		return majorityClass;
	}

	private static double[] getColumn(double[][] data, int columnIndex) {
		return Arrays.stream(data).mapToDouble(row -> row[columnIndex]).toArray();
	}

	private static Map<Double, List<double[]>> splitData(double[][] data, int featureIndex) {
		Map<Double, List<double[]>> subsets = new HashMap<>();

		for (int i = 0; i < data.length; i++) {
			double featureValue = data[i][featureIndex];
			double[] instance = data[i];

			subsets.computeIfAbsent(featureValue, key -> new ArrayList<>()).add(instance);
		}

		return subsets;
	}

	private static class DecisionTreeNode {
		private double label; // Class label for leaf nodes
		private int targetIndex; // Index of the target variable in the data
		private int decisionAttribute; // Index of the decision attribute (feature) for non-leaf nodes
		private String decisionAttributeName; // Name of the decision attribute
		private Map<Double, DecisionTreeNode> children; // Children nodes

		public DecisionTreeNode(double label) {
			this.label = label;
		}

		public DecisionTreeNode(int decisionAttribute, String decisionAttributeName) {
			this.decisionAttribute = decisionAttribute;
			this.decisionAttributeName = decisionAttributeName;
			this.children = new HashMap<>();
		}

		public void addChild(double featureValue, DecisionTreeNode childNode) {
			children.put(featureValue, childNode);
		}

		public DecisionTreeNode getChild(double featureValue) {
			return children.get(featureValue);
		}

		public boolean isLeaf() {
			return children == null || children.isEmpty();
		}

		public double getLabel() {
			return label;
		}

		public int getDecisionAttribute() {
			return decisionAttribute;
        }

		public int getTargetIndex() {
			return targetIndex;
		}

		public double[][] getData() {
			return null; // Implement if needed
        }
    }

	public void train(double[][] data, String[] features, int targetIndex) {
		// You can copy your existing buildDecisionTree logic here
		DecisionTreeNode root = buildDecisionTree(data, features, targetIndex);
	}

	public DecisionTreeNode getRoot() {
		// TODO Auto-generated method stub
		return null;
	}
}


