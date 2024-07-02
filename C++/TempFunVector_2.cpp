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
vector<double> rain(12,0);
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

rain.at(0)= 5.7 ;
rain.at(1)= 5.4;
rain.at(2)= 6.3;
rain.at(3)= 5.5;
rain.at(4)= 5;
rain.at(5)= 4.2;
rain.at(6)= 4.4;
rain.at(7)= 3.7;
rain.at(8)= 3.5;
rain.at(9)= 3;
rain.at(10)= 4.5;
rain.at(11)= 6;


double tempSum = 0.0;
int i;
int counter = 0;
cout << "Month  Temp  RainFall" << endl;
for (i=0; i < 12;i++){
	//if (alTempMonth.at(i) >= 50){
	
	cout << monthName[i] << "  | " << alTempMonth.at(i) << " |  " << rain.at(i) << endl;
	tempSum += alTempMonth.at(i);
	counter++;
//}
}
cout << "The average annual temperature is: " << tempSum / counter ;

//cout << "Please enter a month that you would like to check the average temperature for alabama: ";
//cin >> month;
//if (month > 0 && month <13)


//cout << endl << monthName[month - 1]<< ": " << alTempMonth[month -1];

//end program
cout << endl << endl << endl;
return 0;
}

