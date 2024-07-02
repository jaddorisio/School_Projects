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
int userNum;
int sum = 0;
cout << "enter a number"; cin >> userNum;

for (int num = 1; num <= 100; ++num) {
	if (num < userNum) {
		if (num % 2 != 0){
			sum += num;
		}
	}
}
cout << sum;

//end program
cout << endl << endl << endl;
return 0;
}

