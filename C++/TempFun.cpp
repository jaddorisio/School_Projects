/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date:

Filename: tempFun.cpp

Desc: Populate an array using real temperature values for
a region og the world. The values are going to represent
average monnthly temperatures.
39.7	43.7	51.5	59.6	67.8	74.9	78.4	78.3	71.8	60.7	51.5	42.3

*/
#include <iostream>
#include <string>
using namespace std;

int main() {
double alTempMonth[12] = {39.7,43.7,51.5,59.6,67.8,74.9,78.4,78.3,71.8,60.7,51.5,42.3};
string monthName[12] = {"JAN", 	 	"FEB", 	 	"MAR", 	 	"APR", 	 	"MAY", 	 	"JUN","	JUL", 	 	"AUG", 	"SEP",	"OCT","NOV" ,"DEC" };
int month;
cout << "Please enter a month that you would like to check the average temperature for alabama: ";
cin >> month;

cout << endl << monthName[month - 1]<< ": " << alTempMonth[month -1];

//end program
cout << endl << endl << endl;
return 0;
}

