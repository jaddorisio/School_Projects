/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date: 09/27/2016

Filename:Class1Review

Desc: The following sourcefile contains central themse for chapter 2 for review purpose.

*/
#include <iostream>
#include <string>
using namespace std;

int main()
{	
// constant number of jumps
const int NUM_JUMPS = 3;

// declare 3 integer variables to holf the length of 3 jumps in centimeters
	int jump1 = 0;
	int jump2 = 0;
	int jump3 = 0;


// declare 1 integer variable to store the sum of the jumps

	int totalJump = 0;

// declare 1 average variable to store the average of the jumps
	double averageOfJumps = 0;

// declare 2 character variables to store the jumpers initials
	char intial1 = 'a';
	char intial2 = 'b';
// declare 1 string variable to store wheter this even was
// the long jump or the triple jump
	string typeOfJump = " ";

// promt the user for their intiials and the event type
cout << "Please enter your intials like so EX. J A" << endl;
cin >> intial1;
cin >> intial2;

// TEST
cout << endl;
cout << intial1 << intial2 << endl;
cin.ignore();
cout << "Please enter the event. Ex Long Jump or Triple Jump" << endl;


getline(cin, typeOfJump);
cout << endl;
// prompt the user for the three jumps

cout << "Please enter jump 1" << endl;
cin >> jump1;
cout << "Please enter jump 2" << endl;
cin >> jump2;
cout << "Please enter jump 3" << endl;
cin >> jump3;

// Calculate the sum of the jumps 

totalJump = jump1 + jump2 + jump3;
// Calculate the average 

averageOfJumps = static_cast<double>(totalJump)/>NUM_JUMPS;

//Display the average
cout << "The average jump distance for " << intial1 << intial2 << " in the " << typeOfJump << " is "
		<< averageOfJumps << "cm." << endl;



//end program
cout << endl << endl << endl;
return 0;
}

