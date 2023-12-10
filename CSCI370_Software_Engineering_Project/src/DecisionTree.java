
public class missingValHandler {
	
	public static void handleThisdata(BuildDatas[] dataToBeHadle) {

//	}   
//		System.out.println("The length is: " + dataToBeHadle[0].getradius_mean());

//	public  missingValHandler(BuildDatas [] dataToBeHadle) {
		// TODO Auto-generated constructor stub
		int maxMissingValue =0;
		for (int i = 0; i < dataToBeHadle.length - 3; i++) {
			if ((dataToBeHadle[i].getradius_mean() == -1)) {
				maxMissingValue++;
			}
			if ((dataToBeHadle[i].gettexture_mean() == -1)) {
				maxMissingValue++;
				}
			if((dataToBeHadle[i].getperimeter_mean() == -1)) {
				maxMissingValue++;
			}
			if ((dataToBeHadle[i].getarea_mean() == -1)) {
				maxMissingValue++;
			}
			if ((dataToBeHadle[i].getsmoothness_mean() == -1)) {
				maxMissingValue++;
			}

			if ((dataToBeHadle[i].getcompactness_mean() == -1)) {
				maxMissingValue++;
			}

			if ((dataToBeHadle[i].getconcavity_mean() == -1)) {
				maxMissingValue++;
			}
				
			if ((dataToBeHadle[i].getconcave_points_mean() == -1)) {
				maxMissingValue++;
			}
			if ((dataToBeHadle[i].getsymmetry_mean() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getfractal_dimension_mean() == -1)) {
				maxMissingValue++;
			}
				
			if ((dataToBeHadle[i].getradius_standard_error() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].gettexture_standard_error() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getperimeter_standard_error() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getarea_standard_error() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getsmoothness_standard_error() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getcompactness_standard_error() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getconcavity_standard_error() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getconcave_points_standard_error() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getsymmetry_standard_error() == -1)) {
				maxMissingValue++;
			}
					

			if ((dataToBeHadle[i].getfractal_dimension_standard_error() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getradius_worst() == -1)) {
				maxMissingValue++;
			}
				
			if ((dataToBeHadle[i].gettexture_worst() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getperimeter_worst() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getarea_worst() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getsmoothness_worst() == -1)) {
				maxMissingValue++;
			}
				

			if ((dataToBeHadle[i].getcompactness_worst() == -1)) {
				maxMissingValue++;
			}
			

			if ((dataToBeHadle[i].getconcavity_worst() == -1)) {
				maxMissingValue++;
			}
				
					

			if ((dataToBeHadle[i].getconcave_points_worst() == -1)) {
				maxMissingValue++;
			}
					
			if ((dataToBeHadle[i].getsymmetry_worst() == -1)) {
				maxMissingValue++;
					}

			if ((dataToBeHadle[i].getfractal_dimension_worst() == -1)) {
				maxMissingValue++;
					}
					
					}	

					if (maxMissingValue > 8) {
						System.out.println(
								"Sorry You have reached the allowed number of Missing values: Please correct your Data and try again:");
						System.exit(0);

					} else {
						for (int i = 0; i < dataToBeHadle.length - 3; i++) {
							if ((dataToBeHadle[i].getradius_mean() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getradius_mean();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setradius_mean(average);


							}
							if ((dataToBeHadle[i].gettexture_mean() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].gettexture_mean();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].settexture_mean(average);
							}
							if ((dataToBeHadle[i].getperimeter_mean() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getperimeter_mean();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setperimeter_mean(average);
							}
							if ((dataToBeHadle[i].getarea_mean() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getarea_mean();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setarea_mean(average);
							}
							if ((dataToBeHadle[i].getsmoothness_mean() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getsmoothness_mean();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setsmoothness_mean(average);
							}

							if ((dataToBeHadle[i].getcompactness_mean() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getcompactness_mean();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setcompactness_mean(average);
							}

							if ((dataToBeHadle[i].getconcavity_mean() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getconcavity_mean();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setconcavity_mean(average);
							}

							if ((dataToBeHadle[i].getconcave_points_mean() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getconcave_points_mean();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setconcave_points_mean(average);
							}
							if ((dataToBeHadle[i].getsymmetry_mean() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getsymmetry_mean();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setsymmetry_mean(average);
							}

							if ((dataToBeHadle[i].getfractal_dimension_mean() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getfractal_dimension_mean();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setfractal_dimension_mean(average);
							}

							if ((dataToBeHadle[i].getradius_standard_error() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getradius_standard_error();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setradius_standard_error(average);
							}

							if ((dataToBeHadle[i].gettexture_standard_error() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].gettexture_standard_error();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].settexture_standard_error(average);
							}

							if ((dataToBeHadle[i].getperimeter_standard_error() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getperimeter_standard_error();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setperimeter_standard_error(average);
							}

							if ((dataToBeHadle[i].getarea_standard_error() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getarea_standard_error();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setarea_standard_error(average);
							}

							if ((dataToBeHadle[i].getsmoothness_standard_error() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getsmoothness_standard_error();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setsmoothness_standard_error(average);
							}

							if ((dataToBeHadle[i].getcompactness_standard_error() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getsmoothness_standard_error();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setcompactness_standard_error(average);
							}

							if ((dataToBeHadle[i].getconcavity_standard_error() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getconcavity_standard_error();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setconcavity_standard_error(average);
							}

							if ((dataToBeHadle[i].getconcave_points_standard_error() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getconcave_points_standard_error();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setconcave_points_standard_error(average);
							}

							if ((dataToBeHadle[i].getsymmetry_standard_error() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getsymmetry_standard_error();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setsymmetry_standard_error(average);
							}

							if ((dataToBeHadle[i].getfractal_dimension_standard_error() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getfractal_dimension_standard_error();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setfractal_dimension_standard_error(average);
							}

							if ((dataToBeHadle[i].getradius_worst() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getradius_worst();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setradius_worst(average);
							}

							if ((dataToBeHadle[i].gettexture_worst() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].gettexture_worst();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].settexture_worst(average);
							}

							if ((dataToBeHadle[i].getperimeter_worst() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getperimeter_worst();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setperimeter_worst(average);
							}

							if ((dataToBeHadle[i].getarea_worst() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getarea_worst();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setarea_worst(average);
							}

							if ((dataToBeHadle[i].getsmoothness_worst() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getsmoothness_worst();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setsmoothness_worst(average);
							}

							if ((dataToBeHadle[i].getcompactness_worst() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getcompactness_worst();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setcompactness_worst(average);
							}
						
							if ((dataToBeHadle[i].getconcavity_worst() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getconcavity_worst();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setconcavity_worst(average);
							}

							if ((dataToBeHadle[i].getconcave_points_worst() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getconcave_points_worst();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setconcave_points_worst(average);
							}

							if ((dataToBeHadle[i].getsymmetry_worst() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getsymmetry_worst();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setsymmetry_worst(average);
							}

							if ((dataToBeHadle[i].getfractal_dimension_worst() == -1)) {
								double average = 0;
								int numbAvg = 0;
								for (int j = 0; j < dataToBeHadle.length - 3; j++) {
									average += dataToBeHadle[j].getfractal_dimension_worst();
									numbAvg++;
								}
								average = average / numbAvg;
								dataToBeHadle[i].setfractal_dimension_worst(average);

							}

						}
					}
					
		}
		
	}



