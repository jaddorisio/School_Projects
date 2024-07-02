/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date:

Filename:

Desc:

*/
#include <iostream>
using namespace std;

int main() {
	int userGrade;
	int lowGrade;
	int highGrade;
	int averageGrade;
	int amountGrade = 0;
	
	//Prompts the user for the grades
	cout << "Please enter a numeric assessment grade (-1 to quit): ";
	cin >> userGrade; //user inputs -1 but still continues to if statement
	
	//Checks if the user put in a grade larger than 100
	if(userGrade > 100 || userGrade < -1){ // since grade does not fall in this range does not exvute
		cout << "*** ERROR: Grade outside valid range ***" << endl;
		userGrade = 0;
	}
	if(userGrade <= 100 && userGrade >= 0){ // since grade does not fall in this range does not exvute
		// if it is then will add to amount of grades put in
		averageGrade += userGrade;
		amountGrade += 1;
	}
	
		//Loops the user until they put in -1
	while(userGrade <= 100 && userGrade > -1){
		cout << "Please enter a numeric assessment grade (-1 to quit): ";
		cin >> userGrade;
		
		//Checks if the user put in a grade larger than 100
		if(userGrade > 100 || userGrade < -1){
			cout << "*** ERROR: Grade outside valid range ***" << endl;
			userGrade = 0;
		}
		// if it is then will add to amount of grades put in
		if(userGrade <= 100 && userGrade >= 0){
			averageGrade += userGrade;
			amountGrade += 1;
		}
	}

	cout << endl << "Scores included in the set: "<< amountGrade << endl;
	cout << "Average grade for set: " << averageGrade << endl;
	cout << "Lowest numeric grade: "<< endl;
	cout << "Highest numeric grade: "<< endl;
	cout << endl << "Grade Counts:"<< endl;
//end program
cout << endl << endl << endl;
return 0;
}

