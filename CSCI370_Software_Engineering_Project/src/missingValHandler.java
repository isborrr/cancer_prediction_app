
public class missingValHandler {

	public missingValHandler(BuildDatas [] dataToBeHadle) {
		// TODO Auto-generated constructor stub
		int maxMissingValue =0;
		for(int i= 0; i<dataToBeHadle.length; i++) {
			if((dataToBeHadle[i].getradius_mean() == -1 )) {
				maxMissingValue++;
				}
			if ((dataToBeHadle[i].gettexture_mean() == -1)) {
				maxMissingValue++;
				}
			if((	dataToBeHadle[i].getperimeter_mean() == -1)) {
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
						for (int i = 0; i < dataToBeHadle.length; i++) {
							if ((dataToBeHadle[i].getradius_mean() == -1)) {
								maxMissingValue++;
							}
							if ((dataToBeHadle[i].gettexture_mean() == -1)) {
								maxMissingValue++;
							}
							if ((dataToBeHadle[i].getperimeter_mean() == -1)) {
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
					}
					
		}
		
	}



