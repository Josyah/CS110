// Josyah Morrison
// Lab-02
// BuildingBlocks.java

public class StartA {

	public static void main(String[] args) {
			//declaring all the main variables to use through the file
		    int year = 0;
		    int month = 0;
		    int day = 0;
		    int inDays = 0;
		    int Jan = 31;
		    int Feb = 28;
		    int Mar = 31;
		    int Apr = 30;
		    int May = 31;
		    int Jun = 30;
		    int Jul = 31;
		    int Aug = 31;
		    int Sep = 30;
		    int Oct = 31;
		    int Nov = 30;
		    int Dec = 31;
		    Boolean checkingMonth = true;
		    Boolean checkingDay = false;
		    Boolean checkingYear = false;
		    Boolean calculating = false;
				// a loop for the Month so that if the user dosen't format correctly,
				// it tells them to correct it, then runs again
		      while(checkingMonth){
		        Magic.println("Please enter the month of your last menstrual period (1-12).");
		        month = Magic.nextInt();
		        if(month<=12 && month>=1){ //checks if it is between 12 and 1
		          checkingMonth = false; // breaks loop and moves on to the next one
		          checkingDay = true;
		        } else {
		        Magic.println("Check to see that the month you entered fitted the format");
		        }
		      }
					// a loop for the Day so that if the user dosen't format correctly,
					// it tells them to correct it, then runs again
		      while(checkingDay){
		        Magic.println("Please enter the day of your last menstrual period (1-31).");
		        day = Magic.nextInt();
		        if(day<=31 && day>=1){ //checks if it is between 31 and 1
		          checkingDay = false; // breaks loop and moves on to the next one
		          checkingYear = true;
		        } else {
		        Magic.println("Check to see that the month you entered fitted the format");
		        }
		      }

					// a loop for the year so that if the user dosen't format correctly,
					// it tells them to correct it, then runs again
		      while(checkingYear){
		        Magic.println("Please enter the year of your last menstrual period (0-2017).");
		        year = Magic.nextInt();
		        if(year<=2017 && year>=0){ //checks if it is in between 0 and 2017
		          checkingYear = false; // breaks loop and moves on to the next one
              calculating = true;
		        } else {
		        Magic.println("Check to see that the year you entered fitted the format");
		        }
          }
						//converts the date to purely days to allow adding 280 to the original date
			      if(month == 1){
			        inDays = day;
			      }
			      else if(month == 2){
			        inDays = Jan+day; // add all days of each month before the selected one and then adds the selected day
			      }
			      else if(month == 3){
			        inDays = Jan+Feb+day; // add all days of each month before the selected one and then adds the selected day
			      }
			      else if(month == 4){
			        inDays = Jan+Feb+Mar+day; // add all days of each month before the selected one and then adds the selected day
			      }
			      else if(month == 5){
			        inDays = Jan+Feb+Mar+Apr+day; // add all days of each month before the selected one and then adds the selected day
			      }
			      else if(month == 6){
			        inDays = Jan+Feb+Mar+Apr+May+day; // add all days of each month before the selected one and then adds the selected day
			      }
			      else if(month == 7){
			        inDays = Jan+Feb+Mar+Apr+May+Jun+day; // add all days of each month before the selected one and then adds the selected day
			      }
			      else if(month == 8){
			        inDays = Jan+Feb+Mar+Apr+May+Jun+Jul+day; // add all days of each month before the selected one and then adds the selected day
			      }
			      else if(month == 9){
			        inDays = Jan+Feb+Mar+Apr+May+Jun+Jul+Aug+day; // add all days of each month before the selected one and then adds the selected day
			      }
			      else if(month == 10){
			        inDays = Jan+Feb+Mar+Apr+May+Jun+Jul+Aug+Sep+day; // add all days of each month before the selected one and then adds the selected day
			      }
			      else if(month == 11){
			        inDays = Jan+Feb+Mar+Apr+May+Jun+Jul+Aug+Sep+Oct+day; // add all days of each month before the selected one and then adds the selected day
			      }
			      else if(month == 12){
			        inDays = Jan+Feb+Mar+Apr+May+Jun+Jul+Aug+Sep+Oct+Nov+day; // add all days of each month before the selected one and then adds the selected day
			      }
			      int dueMonth = 0;
			      int dueDay = 0;
			      int dueYear = year;
			      int dueDayinDays = inDays+280;
						// a loop so that if adding 280 days goes past one year,
						// it subtracts 365 and then converts it back to months to print out
			      while(calculating) {
			      if(dueDayinDays>365){
			        dueYear = year + 1;
              dueDayinDays= dueDayinDays - 365;
              dueDay = dueDayinDays;
              calculating = true;
			      } else { // finds specific month from the addition of 280 days to the original date
			        if(dueDayinDays<=31){
			          dueMonth = 1;
                dueDay = dueDayinDays;
			        }
			        else if(dueDayinDays<=59){
			          dueMonth = 2;
                dueDay = dueDayinDays - 31; // subtracts unnecessary days to give a pure day of the month
			        }
			        else if(dueDayinDays<=90){
			          dueMonth = 3;
                dueDay = dueDayinDays - 59; // subtracts unnecessary days to give a pure day of the month
			        }
			        else if(dueDayinDays<=120){
			          dueMonth = 4;
                dueDay = dueDayinDays - 90; // subtracts unnecessary days to give a pure day of the month
			        }
			        else if(dueDayinDays<=151){
			          dueMonth = 5;
                dueDay = dueDayinDays - 120; // subtracts unnecessary days to give a pure day of the month
			        }
			        else if(dueDayinDays<=181){
			          dueMonth = 6;
                dueDay = dueDayinDays - 151; // subtracts unnecessary days to give a pure day of the month
			        }
			        else if(dueDayinDays<=212){
			          dueMonth = 7;
                dueDay = dueDayinDays - 181; // subtracts unnecessary days to give a pure day of the month
			        }
			        else if(dueDayinDays<=243){
			          dueMonth = 8;
                dueDay = dueDayinDays - 212; // subtracts unnecessary days to give a pure day of the month
			        }
			        else if(dueDayinDays<=273){
			          dueMonth = 8;
                dueDay = dueDayinDays - 243; // subtracts unnecessary days to give a pure day of the month
			        }
			        else if(dueDayinDays<=304){
			          dueMonth = 10;
                dueDay = dueDayinDays - 273; // subtracts unnecessary days to give a pure day of the month
			        }
			        else if(dueDayinDays<=334){
			          dueMonth = 11;
                dueDay = dueDayinDays - 304; // subtracts unnecessary days to give a pure day of the month
			        }
			        else if(dueDayinDays<=365){
			          dueMonth = 12;
			          dueDay = dueDayinDays - 334; // subtracts unnecessary days to give a pure day of the month
			        }
              calculating = false; //breaks the loop
							// prints the result
              Magic.println("Your child's due date is "+dueMonth+"/"+dueDay+"/"+dueYear);
			      }

		      }







	}


	}
