/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date: 12/12/2016

Filename: jonpaula_assignment5.cpp


Desc: A program that will inform the user to input a number and then check all numbers leading up 
to that number to see if they are prime numbers.

*/
#include <iostream>
#include <vector>
#include <iomanip>
#include <limits>
using namespace std;

/*
Desc: This function takes in a user inputed value and checks to see if
	  the value meets the critera of required input
pre: "temp" must equal something
post: the corrected value is returned
*/
void CheckVectorValue(int& temp) {
	while (cin.fail() || temp <= 1){
			if (cin.fail()) {
			cin.clear();
			cin.ignore(numeric_limits<int>::max(),'\n');
			cout << "**ERROR: non-numeric value**" << endl;
			cout << "Please enter an Integer number that you would like to test if the number and numbers" << endl ;
			cout << "leading to that number are prime(Must me greater than 1): ";
			cin >> temp;
			}
			else if ( temp == 1) {
			cout << "**ERROR: number is equal to 1**" << endl;
			cout << "Please enter an Integer number that you would like to test if the number and numbers" << endl ;
			cout << "leading to that number are prime(Must me greater than 1): ";
			cin >> temp;
			}
			else if (temp < 1) {
			cout << "**ERROR: number is less than 1 **" << endl;
			cout << "Please enter an Integer number that you would like to test if the number and numbers" << endl ;
			cout << "leading to that number are prime(Must me greater than 1): ";
			cin >> temp;
			}
		}
			return;
}

/*
Desc: This function takes in a boolean vector and returns the 
	  indexs which are not prime as false.
pre: a vector size value determind by user
post: Vector with True and false values
*/
void PrimeNumCheck(vector<bool>& primeNum, int sizeOfVector)
{
int i;
int k;

// Loop that checks for primes
for ( i = 2; i * i < sizeOfVector; i++) {
	for ( k = i;  k * i < sizeOfVector; k++){
			primeNum.at(i*k) = false;
	}
}
	return;
}


int main() {
// "user" variable
int vectorSize = 0;
// counter variables
int i = 0;
int j = 0;

// Ask user to enter value for prime check
cout << "Ex: 102" << endl;
cout << "Please enter an Integer number that you would like to test if the number and numbers" << endl ;
cout << "leading to that number are prime(Must me greater than 1): ";
cin >> vectorSize;

// Call to function that will check for correct input value
CheckVectorValue(vectorSize);

// Declares Vector and set default value to true
// Adds 1 to vectorsize to included number typed
vectorSize +=1;
vector<bool> primeNum(vectorSize, true);

// Call to function that will check for primes 
PrimeNumCheck(primeNum, vectorSize);



// Display Prime numbers in a "not so perfect chart"
cout << "List of Prime Number: " << endl << "____________________________________" << endl << "|";
for(i= 2; i < vectorSize; i++)
{
	if (primeNum.at(i) == true) { 
		cout << setw(4) << i << ", |";
		j += 1;
		if ( j % 5 == 0)
			cout << endl << "|";
		
	}
}


//end program

cout << endl << endl << endl;
return 0;
}


