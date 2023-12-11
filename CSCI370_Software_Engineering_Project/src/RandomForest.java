import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomForest {

	private final List<DecisionTree> trees;

	public RandomForest(int numTrees) {
		this.trees = new ArrayList<>();
		for (int i = 0; i < numTrees; i++) {
			DecisionTree tree = new DecisionTree();
			trees.add(tree);
		}
	}
//

	//
	public void train(double[][] data, String[] features, int targetIndex) {
		Random random = new Random();

		for (DecisionTree tree : trees) {
			// Create a bootstrapped sample
			double[][] bootstrapSample = createBootstrapSample(data, random);

			// Train each tree on a different subset of the data
			tree.train(bootstrapSample, features, targetIndex);
		}
	}

	public double predict(double[] instance) {
		double sum = 0.0;

		for (DecisionTree tree : trees) {
			sum += tree.predict(tree.getRoot(), instance);
		}

		// Return the average prediction from all trees
		return sum / trees.size();
	}

	private double[][] createBootstrapSample(double[][] data, Random random) {
		int numInstances = data.length;
		double[][] bootstrapSample = new double[numInstances][];

		for (int i = 0; i < numInstances; i++) {
			int randomIndex = random.nextInt(numInstances);
			bootstrapSample[i] = data[randomIndex].clone();
		}

		return bootstrapSample;
	}

	public static int createBootstrapSample(String patientData) {

		return 1;

	}

	public static void main(String[] args) {

	}
}
