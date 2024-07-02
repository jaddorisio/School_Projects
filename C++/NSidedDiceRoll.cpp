/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date: 10/4/2016

Filename:NSidedDiceRoll.cpp

Desc: The following program prompts the user for the# of sides 
	on the dice and the# of dice, then generates and display
	a random number that represents the sum of the dice the 
	user provided.
	
		noteL Chapter 02 Review.

*/
#include <iostream>
#include <ctime>
#include <string>
#include <cstdlib>
using namespace std;

int main() {
	
	int numberOfDice;
	int numberOfSides;
	int diceSum;
	
	cout << "Please enter the number of side, your die will have: ";
	cin >> numberOfSides;
	cout << endl;
	cout << "Please enter the number of dice: ";
	cin >> numberOfDice;
	
	
	
	srand(time(NULL));
	diceSum = (rand() % (numberOfSides * numberOfDice) - numberOfDice + numberOfDice);
	
	cout << "Rolling Dice..";
	cout << endl << endl << endl;
	cout << "Your Sum: " << diceSum;



//end program
cout << endl << endl << endl;
return 0;
}

