/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date:

Filename: OverloadedFunctions

Desc:

*/
#include <iostream>
using namespace std;
int times(int x, int y) { 
	int temp;
	
	temp = x * y;
	return temp;
}

double times(double x, double y) {
	double temp;
	
	temp = x * y;
	
	return temp;
}

int main() {
	
	cout << times(7.75, 8.4545) << endl;
	cout << times(7, 8) << endl;
//end program
cout << endl << endl << endl;
return 0;
}

