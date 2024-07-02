/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date:

Filename: tempFunVector.cpp

Desc: Populate an array using real temperature values for
a region og the world. The values are going to represent
average monnthly temperatures.
39.7	43.7	51.5	59.6	67.8	74.9	78.4	78.3	71.8	60.7	51.5	42.3

*/
#include <iostream>
#include <string>
#include <vector>
#include <iomanip>
using namespace std;

int main() {
cout << fixed << setprecision(1);
//double alTempMonth[12] = {39.7,43.7,51.5,59.6,67.8,74.9,78.4,78.3,71.8,60.7,51.5,42.3};
string monthName[12] = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
vector<double> alTempMonth(12, 0);
alTempMonth.at(0) = 39.7;
alTempMonth.at(1) = 43.7;
alTempMonth.at(2) = 51.5;
alTempMonth.at(3) = 59.6;
alTempMonth.at(4) = 67.8;
alTempMonth.at(5) = 74.9;
alTempMonth.at(6) = 78.4;
alTempMonth.at(7) = 78.3;
alTempMonth.at(8) = 71.8;
alTempMonth.at(9) = 60.7;
alTempMonth.at(10) = 51.5;
alTempMonth.at(11) = 42.3;

double tempSum = 0.0;
int i;

for (i=0; i < 12;i++){
	cout << monthName[i] << ": " << alTempMonth.at(i) << endl;
	tempSum += alTempMonth.at(i);
}
cout << "The average annual temperature is: " << tempSum / alTempMonth.size();

//cout << "Please enter a month that you would like to check the average temperature for alabama: ";
//cin >> month;
//if (month > 0 && month <13)


//cout << endl << monthName[month - 1]<< ": " << alTempMonth[month -1];

//end program
cout << endl << endl << endl;
return 0;
}

