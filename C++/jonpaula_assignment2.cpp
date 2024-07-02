/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date: 10/03/2016

Filename:jonpaula_assignment2.cpp

Desc: This program will input the number of burgers, fries, and sodas, that a customer will purchase, as well as the customer name.
It then calulate the tax, total before tax, and grand total. It ouputs this to the customer and the ask for amount to pay. 
The program then calculates the change and gives an order number to the customer.

Note to Professor 
Was not sure if you wanted the money to be rounded up from the very first decimal point displayed, so i use set precision to display 2 points past decimal point and trucate the rest

*/

// Adds used libraries
#include <iostream>
#include <string>
#include <cstdlib>
#include <cmath>
#include <iomanip>
#include <ctime>

using namespace std;

int main() {

	// declaring neccessary varibale and constants
	// to hold values in program
	int numBurgers;
	int numFries;
	int numSoda;
	string orderName;
	const double SALES_TAX = 0.06;
	const double BURGER_COST = 1.49;
	const double FRIES_COST = 0.89;
	const double  SODA_COST = 0.99;
	double totalBeforeTax;
	double grandTotal;
	double tax;
	double amountTendered;
	double change;
	
	// retrieve values of customer
	cout << "Enter the number of burgers:  "; 
	cin >> numBurgers;
	
	cout << "Enter the number of fries:  ";
	cin >> numFries;
	
	cout << "Enter the number of sodas:  ";
	cin >> numSoda;
	cin.ignore();
	
	cout << "Please enter the name for the order:  ";
	getline(cin, orderName);
	cout << endl;
	
	// Computing Calculation for tax, total before tax, and grand total
	
	totalBeforeTax = (numBurgers * BURGER_COST) + (numFries * FRIES_COST) +(numSoda * SODA_COST);	
	tax = totalBeforeTax * SALES_TAX;
	grandTotal = tax + totalBeforeTax;
	
	// Display Computations
	
	cout << "The total before tax is:  " << "$"  << fixed << setprecision(2) << totalBeforeTax << endl;
	cout << "The tax is:  " << "$" <<  fixed << setprecision(2) << tax << endl;
	cout << "The grand total is:  " << "$" << fixed << setprecision(2) << grandTotal << endl;
	cout << endl;
	
	
	// Detemine change after being given money and the display change
	
	cout << "Enter the amount tendered:  "; 
	cin >> amountTendered;
	
	change = amountTendered - grandTotal;
	
	// an if statement and while loop to determine whether or not enough change was given .
		
	while (change < 0)
	{
		cout << "You still owe $" << fixed << setprecision(2) << abs(change) << endl; 
		cout << "Enter the new amount tendered:  "; 
		cin >> amountTendered;
		change = amountTendered - abs(change);
		
	}	
	
	if (change >= 0){
	
		cout << "The change is :  " << "$" << fixed << setprecision(2) << change;
		cout << endl << endl;
}

	// Display random order number and seeds the random with value of system time 
	srand(time(NULL));
	cout << "The order number for " << orderName << " is " << "#" << rand() % 999 + 1;
	
	
	
	
	
	
	
//end program
cout << endl << endl << endl;
return 0;
}


