/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date:

Filename:

Desc:

*/
#include <iostream>
using namespace std;

int main() {
int frameTotal;
int adder;
int i = 0;



while ( i < 10){
	cout << "Enter score for frame " << i +1 << ": "; cin >> adder;
	while (adder <0 || adder > 30){
		cout << "Invalid Entry" << endl;
		cout << "Enter score for frame " << i +1 << ": "; cin >> adder;
		
	}
	frameTotal+= adder;
	
	++i;
}

cout << frameTotal;


//end program
return 0;
}

