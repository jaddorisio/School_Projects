/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date: 10/30/2016

Filename:jonpaula_assignment4.cpp

Desc: A program that outputs grade statitiscs after inputing a students set grades. Statitsics include grade letter count,
number of grades inputted, grade average, lowest grade, and highest grade

*/
#include <iostream>
#include <vector>
#include <limits>
using namespace std;

int main() {
	// declaring neccisary variable for app
	int temp = 0;
	int i;
	vector<int> scores; // vector to hold list of grades
	double gradeAverage;
	int lowestGrade;
	int highestGrade;
	int numA;
	int numB;
	int numC;
	int numD;
	int numF;
	
	// while loop that ask user to input grade and exits when user
	// enters -1
	while( temp != -1 ) {

		
		cout << "Please enter a numeric assessment grade (-1 to quit): ";
		cin >> temp;
		
		// a while loop that test if cin input do not fit the integer data type
		while (cin.fail()){
			cin.clear();
			cin.ignore(numeric_limits<int>::max(),'\n');
			cout << "**ERROR: Please use numeric values**" << endl;
			cout << "Please enter a numeric assessment grade (-1 to quit): ";
			cin >> temp;
			}
		// a while loop that checks for correct grade range
		while ( temp < -1 || temp > 100){
			cout << "*** ERROR: Grade outside valid range ***";
			cout << endl << "Please enter a numeric assessment grade (-1 to quit): ";
			cin >> temp;
			
			while (cin.fail()){
			cin.clear();
			cin.ignore(numeric_limits<int>::max(),'\n');
			cout << "**ERROR: Please use numeric values**" << endl;
			cout << "Please enter a numeric assessment grade (-1 to quit): ";
			cin >> temp;
			}
		}
		// adds temps variable to grade vector
		if (temp != -1) {
			scores.push_back(temp);
		}
		
	}
	
	// an if statment that only computes calculation if
	// vector contains inputed grades
	if (scores.size() >= 1){
		
		// for loop that adds each grade to grade average
		for (i=0; i < scores.size(); ++i) {
		gradeAverage+= scores.at(i);
		}
		// takes accumlated grade and computes average
		gradeAverage = gradeAverage / scores.size();
	
		// for loop structure for determining minimum grade
		lowestGrade = scores.at(scores.size()-1);
		for (i=0; i < scores.size(); ++i) {
			if (scores.at(i) < lowestGrade){
			lowestGrade = scores.at(i);
			}
		}
	
		// for loop structure for determing maximum grade
		highestGrade = scores.at(scores.size()-1);
		for (i=0; i < scores.size(); ++i) {
			if (scores.at(i) > highestGrade){
			highestGrade = scores.at(i);
			}
		}
	}
else {
	gradeAverage = 0;
	lowestGrade = 0;
	highestGrade = 0;
}
	
	// outputes assessment info
	cout << endl << "Assessment Summary Information:" << endl;
	cout << "Scores included in the set: " << scores.size() << endl;
	cout << "Average grade for set: " << gradeAverage << endl;
	cout << "Lowest numeric grade: " << lowestGrade << endl;
	cout << "Highest numeric grade: " << highestGrade << endl << endl;
	
	
	numA = 0;
	numB = 0;
	numC = 0;
	numD = 0;
	numF = 0;
	
	// for loop that counts scores to each letter grade	
	for (i=0; i < scores.size(); ++i){
		if (scores.at(i) >= 90 ){
			numA +=1;
			
		}
		else if (scores.at(i)>= 80){
			numB +=1;
		}
		else if (scores.at(i) >= 70){
			numC+=1;
		}
		else if (scores.at(i) >= 60){
			numD+=1;
		}
		else {
			numF+=1;
		}
		
	}
	// outputs grade count
	cout << "Grade Counts: " << endl;
	cout << "A's: " << numA << endl;
	cout << "B's: " << numB << endl;
	cout << "C's: " << numC << endl;
	cout << "D's: " << numD << endl;
	cout << "F's: " << numF << endl;
	
	
	



//end program
cout << endl << endl << endl;
return 0;
}

