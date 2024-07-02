/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date: 12/20/2016

Filename:jonpaula_assignment6.2.cpp

Desc:
Write a function named isEven that accepts an integer value.  
The function should return true if the value received is an even number and return false otherwise.  
Write a simple main() function to test your function.

*/
#include <iostream>

using namespace std;

bool isEven(int value){
	if (value % 2 == 0) {
		return true;
	}
	else {
		return false;
	}
}
int main() {
int integerVal;
cout << "Enter Integer value: ";
cin >> integerVal;
if (isEven(integerVal))
 cout << "Even";
else {
	cout << "odd";
}

//end program
cout << endl << endl << endl;
return 0;
}

