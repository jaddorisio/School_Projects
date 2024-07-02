/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date: 10/17/2016

Filename:jonpaula_assignment3.cpp

Desc:
This program will take in a user skill and if there skill level is high enough will ask them
if they would like to pay for benefits. The program will then percede to calulate their pay based
on their skill level and also caluclate decuctions. After this the relvant information will be 
displayed onto to the screen.

*/
#include <iostream>
#include <iomanip>
#include <exception>
#include <typeinfo>
using namespace std;

int main() {
	// declaring the neccessary variable to compute values
	const double SKILL_ONE_PAY = 17.0;
	const double SKILL_TWO_PAY = 20.0;
	const double SKILL_THREE_PAY = 22.0;
	int userSkillLevel;
	int hoursWorked;
	int hoursRegular;
	int hoursOverTime;
	double grossPay;
	double regularPay;
	double overTimePay;
	double totalDeduction;
	double retirementDeduction;
	double netPay;
	char optionOne;
	char optionTwo;
	char optionThree;
	char optionFour;
	const double MEDICAL_INSURANCE = 32.50;
	const int DENTAL_INSURANCE = 20;
	const int LONG_TERM_DISABILITY_INSURANCE = 10;
	const double RETIREMENT_PERCENTAGE = 0.03;
	
	
	
	// a structure that will ask the user to input his or her skil
	// level, if the skill level is not in range it will ask to reenter
	try{
	
	cout << "Please enter your skill level (1, 2, or 3): ";
	cin >> userSkillLevel;
	if (userSkillLevel > 3){
	
	throw c
}
	}catch(exception) {
	cout << "Please enter your skill level (1, 2, or 3): ";
	cin >> userSkillLevel;	
	}


	while (userSkillLevel > 3 || userSkillLevel < 1 ) {
		cout << endl << "Invalid Skill Level, Try Again.." << endl;
		cout << "Please enter your skill level (1, 2, or 3): ";
		cin >> userSkillLevel;
		
	}
	
	
	
	// This will precede to ask the user to enter his hours worked. if
	// less than 0 it will ask the user to enter again.
	cout << "Please enter your hours worked this week: ";
	cin >> hoursWorked;
	while (hoursWorked < 0) {
		cout << endl << "You can't work negative hours!! Please Try again..";
		cout << endl << "Please enter your hours worked this week: ";
		cin >> hoursWorked;
	}
	
	
	// a few if staments that will ask the user for benefit options
	// if the userskill level is high enough
	if ( userSkillLevel == 2){
		cout << "Do you have medical insurance (Y/N)? ";
		cin >> optionOne;
		cout << "Do you have dental insurance (Y/N)? ";
		cin >> optionTwo;
		cout << "Do you have long term disability insurance(Y/N)? ";
		cin >> optionThree;
		cout << endl;
	}
	else if (userSkillLevel == 3) {
		cout << "Do you have medical insurance (Y/N)? ";
		cin >> optionOne;
		cout << "Do you have dental insurance (Y/N)? ";
		cin >> optionTwo;
		cout << "Do you have long term disability insurance(Y/N)? ";
		cin >> optionThree;
		cout << "Are you enrolled in the retirement plan (Y/N)? ";
		cin >> optionFour;
		cout << endl;
	}
	else if ( userSkillLevel == 1 ){
		cout << endl;
	}
		
	
	
	// a structure of statment that will spilt the hourse worked
	// into regular and overtime hours. Then wil precede to calcualte
	// the pay for inputed skill level
	if (hoursWorked >= 40) {
		hoursOverTime = hoursWorked - 40;
	}
	hoursRegular = hoursWorked - hoursOverTime;
	
	switch(userSkillLevel){
		case 1: 
		regularPay = hoursRegular * SKILL_ONE_PAY;
		overTimePay = 1.5 * (hoursOverTime * SKILL_ONE_PAY);
		grossPay = regularPay + overTimePay;
		break;
		case 2:
		regularPay = hoursRegular * SKILL_TWO_PAY;
		overTimePay = 1.5 * (hoursOverTime * SKILL_TWO_PAY);
		grossPay = regularPay + overTimePay;
		break;
		case 3:
		regularPay = hoursRegular * SKILL_THREE_PAY;
		overTimePay = 1.5 * (hoursOverTime * SKILL_THREE_PAY);
		grossPay = regularPay + overTimePay;
		break;
	}
	
	// prints the employee information regarding hourly pay and hours worked
	cout << "Employee Summary:" << endl;
	cout << "Hours Worked: " << hoursWorked << endl;
	switch(userSkillLevel){
	
	case 1: 
	cout << "Hourly Pay Rate: $" << fixed << setprecision(2) << SKILL_ONE_PAY;
	break;
	case 2:
	cout << "Hourly Pay Rate: $" << fixed << setprecision(2) << SKILL_TWO_PAY;
	break;
	case 3:
	cout << "Hourly Pay Rate: $" << fixed << setprecision(2) << SKILL_THREE_PAY;
	break;
}
	cout << endl << endl;
	
	
	
	// prints the gross pay calulations for employee
	cout << "Gross Pay:" << endl;
	cout << "Regular Pay for " << hoursRegular << " hours: $" << regularPay << endl;
	cout << "Overtime Pay for " << hoursOverTime << " hours: $" << overTimePay << endl;
	cout << "Gross Pay: $" << fixed << setprecision(2) << grossPay << endl;
	
	
	// Determine the deductions based on user input
	// and adds them to total deduction amount. Then
	//  preceds to display the deductions to employee
	cout << endl << "Deductions:" << endl;
	if (optionOne == 'Y' || optionOne == 'y') {
		cout << "Option 1 - Medical Insurance = $32.50";
		cout << endl;
		totalDeduction += MEDICAL_INSURANCE;
	}
	if ( optionTwo == 'Y' || optionTwo == 'y') {
		cout << "Option 2 - Dental Insurance = $20.00";
		cout << endl;
		totalDeduction += DENTAL_INSURANCE;
	}
	if ( optionThree == 'Y' || optionThree == 'y') {
		cout << "Option 3 - Long Term Disability Insurance = $10.00";
		cout << endl;
		totalDeduction += LONG_TERM_DISABILITY_INSURANCE;
	}
	if (optionFour == 'Y' || optionFour == 'y') {
		retirementDeduction = grossPay * RETIREMENT_PERCENTAGE;
		cout << "3% Retirement Plan = $" << fixed << setprecision(2) << retirementDeduction;
		cout << endl;
		totalDeduction += retirementDeduction;
	}
	cout << "Total Deductions = $" << fixed << setprecision(2) << totalDeduction;
	cout << endl << endl;


	// determine on whether or not to print error message regarding
	// employee pay if amount is less than 0
	netPay = grossPay - totalDeduction;
	
	if (netPay < 0) {
		// Error message displayed
		cout << " It seems that we have enncounter an error..as the net pay has reached into the negatives.." << endl;
		cout << " Please restart Program and reenter information, " << endl << " or tell your employee he needs to work more hours in order to recieve beneifits this week" << endl;
		
	}
	else {
		// display the pay information regarding employee
		cout << "Net Pay:" << endl;
		cout << "Gross Pay: $"<< fixed << setprecision(2) << grossPay << endl;
		cout << "Deductions = $ " << fixed << setprecision(2) << totalDeduction << endl;
		cout << "Net Pay = $" << fixed << setprecision(2) << netPay;
		
	}

//end program
cout << endl << endl << endl;
return 0;
}

