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
	cout << "hello welcome" << endl;
	int sideA;
	int sideB;
	int sideC;
	
	
	cout << "Enter Side A";
	cin>> sideA;
	cout << "Enter Side B";
	cin>> sideB;
	cout << "Enter Side C";
	cin >> sideC;
	cout << endl;
	
	int sidei1;
	int sidei2;
	int sideHypo;
	
	
	if (sideA >= sideB && sideA >= sideC) {
		sideHypo = sideA;
		sidei1 = sideB;
		sidei2 = sideC;
		
	}
	else if (sideB >= sideA  && sideB >= sideC){
		sideHypo = sideB;
		sidei1 = sideC;
		sidei2 = sideA;
		
		
	}
	
	else if (sideC >= sideA && sideC>= sideB){
		sideHypo = sideC;
		sidei1 = sideB;
		sidei2 = sideA;
		
	}
	
	
	
	
	
	if ((sidei1 * sidei1) + (sidei2 * sidei2) == (sideHypo * sideHypo )){
		cout << " you have a triangle" << endl;
	}
	else {
		cout << " bad triangle"<< endl;
	}
	
	
	
	


//end program
cout << endl << endl << endl;
return 0;
}

