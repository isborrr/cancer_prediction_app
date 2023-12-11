public class BuildDatas {
// 1) Create a DataPoint class:
	// This class will represent a data point our dataset.
//	public class DataPoint {
		private int id;
		private int diagnosis;
		private double radius_mean;
		private double texture_mean;
		private double perimeter_mean;
		private double area_mean;
		private double smoothness_mean;
		private double compactness_mean;
		private double concavity_mean;
		private double concave_points_mean;
		private double symmetry_mean;
		private double fractal_dimension_mean;
		private double radius_standard_error;
		private double texture_standard_error;
		private double perimeter_standard_error;
		private double area_standard_error;
		private double smoothness_standard_error;
		private double compactness_standard_error;
		private double concavity_standard_error;
		private double concave_points_standard_error;
		private double symmetry_standard_error;
		private double fractal_dimension_standard_error;
		private double radius_worst;
		private double texture_worst;
		private double perimeter_worst;
		private double area_worst;
		private double smoothness_worst;
		private double compactness_worst;
		private double concavity_worst;
		private double concave_points_worst;
		private double symmetry_worst;
		private double fractal_dimension_worst;

		//
		public BuildDatas(int id, int diagnosis, double radius_mean, double texture_mean, double perimeter_mean,
				double area_mean, double smoothness_mean, double compactness_mean, double concavity_mean,
				double concave_points_mean, double symmetry_mean, double fractal_dimension_mean,
				double radius_standard_error, double texture_standard_error, double perimeter_standard_error,
				double area_standard_error, double smoothness_standard_error, double compactness_standard_error,
				double concavity_standard_error, double concave_points_standard_error, double symmetry_standard_error,
				double fractal_dimension_standard_error, double radius_worst, double texture_worst,
				double perimeter_worst, double area_worst, double smoothness_worst, double compactness_worst,
				double concavity_worst, double concave_points_worst, double symmetry_worst,
				double fractal_dimension_worst) {

			this.id = id;
			this.diagnosis = diagnosis;
			this.radius_mean = radius_mean;
			this.texture_mean = texture_mean;
			this.perimeter_mean = perimeter_mean;
			this.area_mean = area_mean;
			this.smoothness_mean = smoothness_mean;
			this.compactness_mean = compactness_mean;
			this.concavity_mean = concavity_mean;
			this.concave_points_mean = concave_points_mean;
			this.symmetry_mean = symmetry_mean;
			this.fractal_dimension_mean = fractal_dimension_mean;
			this.radius_standard_error = radius_standard_error ;
			this.texture_standard_error = texture_standard_error;
			this.perimeter_standard_error = perimeter_standard_error;
			this.area_standard_error = area_standard_error;
			this.smoothness_standard_error = smoothness_standard_error;
			this.compactness_standard_error = compactness_standard_error;
			this.concavity_standard_error = concavity_standard_error;
			this.concave_points_standard_error = concave_points_standard_error;
			this.symmetry_standard_error = symmetry_standard_error;
			this.fractal_dimension_standard_error = fractal_dimension_standard_error;
			this.radius_worst = radius_worst;
			this.texture_worst = texture_worst;
			this.perimeter_worst = texture_worst;
			this.area_worst = area_worst;
			this.smoothness_worst = smoothness_worst;
			this.compactness_worst = compactness_worst;
			this.concavity_worst = concavity_worst;
			this.concave_points_worst = concave_points_worst;
			this.symmetry_worst = symmetry_worst;
			this.fractal_dimension_worst = fractal_dimension_worst;
		}

		// Getter methods
		public int getid() {
			return id;
		}

		public int getdiagnosis() {
			return diagnosis;
		}

		public double getradius_mean() {
			return radius_mean;
		}

		public double gettexture_mean() {
			return texture_mean;
		}

		public double getperimeter_mean() {
			return perimeter_mean;
		}

		public double getarea_mean() {
			return area_mean;
		}

		public double getsmoothness_mean() {
			return smoothness_mean;
		}

		public double getcompactness_mean() {
			return compactness_mean;
		}

		public double getconcavity_mean() {
			return concavity_mean;
		}

		public double getconcave_points_mean() {
			return concave_points_mean;
		}

		public double getsymmetry_mean() {
			return symmetry_mean;
		}

		public double getfractal_dimension_mean() {
			return fractal_dimension_mean;
		}

		public double getradius_standard_error() {
			return radius_standard_error;
		}

		public double gettexture_standard_error() {
			return texture_standard_error;
		}

		public double getperimeter_standard_error() {
			return perimeter_standard_error;
		}

		public double getarea_standard_error() {
			return area_standard_error;
		}

		public double getsmoothness_standard_error() {
			return smoothness_standard_error;
		}

		public double getcompactness_standard_error() {
			return compactness_standard_error;
		}

		public double getconcavity_standard_error() {
			return concavity_standard_error;
		}

		public double getconcave_points_standard_error() {
			return concave_points_standard_error;
		}

		public double getsymmetry_standard_error() {
			return symmetry_standard_error;
		}

		public double getfractal_dimension_standard_error() {
			return fractal_dimension_standard_error;
		}

		public double getradius_worst() {
			return radius_worst;
		}

		public double gettexture_worst() {
			return texture_worst;
		}

		public double getperimeter_worst() {
			return perimeter_worst;
		}

		public double getarea_worst() {
			return area_worst;
		}

		public double getsmoothness_worst() {
			return smoothness_worst;
		}

		public double getcompactness_worst() {
			return compactness_worst;
		}

		public double getconcavity_worst() {
			return concavity_worst;
		}

		public double getconcave_points_worst() {
			return concave_points_worst;
		}

		public double getsymmetry_worst() {
			return symmetry_worst;
		}

		public double getfractal_dimension_worst() {
			return fractal_dimension_worst;
		}
//	}

		//// Setters of the values of the features

		public void setradius_mean(double new_radius_mean ) {
			this.radius_mean = new_radius_mean;
		}

		public void settexture_mean(double new_texture_mean) {
			this.texture_mean = new_texture_mean;
		}

		public void setperimeter_mean(double new_perimeter_mean) {
			this.perimeter_mean = new_perimeter_mean;
		}

		public void setarea_mean(double new_area_mean) {
			this.area_mean = new_area_mean;
		}

		public void setsmoothness_mean(double new_smoothness_mean) {
			this.smoothness_mean = new_smoothness_mean;
		}

		public void setcompactness_mean(double new_compactness_mean) {
			this.compactness_mean = new_compactness_mean;
		}

		public void setconcavity_mean(double new_concavity_mean) {
			this.concavity_mean = new_concavity_mean;
		}

		public void setconcave_points_mean(double new_concave_points_mean) {
			this.concave_points_mean = new_concave_points_mean;
		}

		public void setsymmetry_mean(double new_symmetry_mean) {
			this.symmetry_mean = new_symmetry_mean;
		}

		public void setfractal_dimension_mean(double new_fractal_dimension_mean) {
			this.fractal_dimension_mean = new_fractal_dimension_mean;
		}

		public void setradius_standard_error(double new_radius_standard_error) {
			this.radius_standard_error = new_radius_standard_error;
		}

		public void settexture_standard_error(double new_texture_standard_error) {
			this.texture_standard_error = new_texture_standard_error;
		}

		public void setperimeter_standard_error(double new_perimeter_standard_error) {
			this.perimeter_standard_error = new_perimeter_standard_error;
		}

		public void setarea_standard_error(double new_area_standard_error) {
			this.area_standard_error = new_area_standard_error;
		}

		public void setsmoothness_standard_error(double new_smoothness_standard_error) {
			this.smoothness_standard_error = new_smoothness_standard_error;
		}

		public void setcompactness_standard_error(double new_compactness_standard_error) {
			this.compactness_standard_error = new_compactness_standard_error;
		}

		public void setconcavity_standard_error(double new_concavity_standard_error) {
			this.concavity_standard_error = new_concavity_standard_error;
		}

		public void setconcave_points_standard_error(double new_concavity_standard_error) {
			this.concave_points_standard_error = new_concavity_standard_error;
		}

		public void setsymmetry_standard_error(double new_symmetry_standard_error) {
			this.symmetry_standard_error = new_symmetry_standard_error;
		}

		public void setfractal_dimension_standard_error(double new_fractal_dimension_standard_error) {
			this.fractal_dimension_standard_error = new_fractal_dimension_standard_error;
		}

		public void setradius_worst(double new_radius_worst) {
			this.radius_worst = new_radius_worst;
		}

		public void settexture_worst(double new_texture_worst) {
			this.texture_worst = new_texture_worst;
		}

		public void setperimeter_worst(double new_perimeter_worst) {
			this.perimeter_worst = new_perimeter_worst;
		}

		public void setarea_worst(double new_area_worst) {
			this.area_worst = new_area_worst;
		}

		public void setsmoothness_worst(double new_smoothness_worst) {
			this.smoothness_worst = new_smoothness_worst;
		}

		public void setcompactness_worst(double new_compactness_worst) {
			this.compactness_worst = new_compactness_worst;
		}

		public void setconcavity_worst(double new_concavity_worst) {
			this.concavity_worst = new_concavity_worst;
		}

		public void setconcave_points_worst(double new_perimeter_mean) {
			this.concave_points_worst = new_perimeter_mean;
		}

		public void setsymmetry_worst(double new_symmetry_worst) {
			this.symmetry_worst = new_symmetry_worst;
		}

		public void setfractal_dimension_worst(double new_fractal_dimension_worst) {
			this.fractal_dimension_worst = new_fractal_dimension_worst;
		}



}
