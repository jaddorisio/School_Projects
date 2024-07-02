/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date:

Filename: DefaultParameters.cpp

Desc: This program showcases the use of default parameters.

*/
#include <iostream>
using namespace std; 
void someFunc(int n1, int n2 = 10, int n3 = 0) {
	for( int i = n3; i < n2; i++){
		cout << n1 * n1 << endl;
	}
	return;
}


int main() {
	
	
	cout << "One Argument\n";
	someFunc(3);
	cout << "Two Arguments\n";
	someFunc(3,5);
	cout << "Three Arguments\n";
	someFunc(3,5,1);


//end program
cout << endl << endl << endl;
return 0;
}

