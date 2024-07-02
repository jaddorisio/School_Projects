/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date:

Filename:

Desc:

*/
#include <iostream>
#include <iomanip>
using namespace std;

int main() {
int deptNum;
double itemPrice;
double salePrice;
double finalPrice;


cout << "Enter dept: ";
cin >> deptNum;

cout << endl; cout << "Enter Item Price: ";
cin >> itemPrice;
switch(deptNum) {
	case 310:
		salePrice = itemPrice * 0.10;
		finalPrice = itemPrice - salePrice;
		break;
	case 438:
		salePrice = itemPrice * 0.12;
		finalPrice = itemPrice - salePrice;
		break;
	case 284:
		salePrice = itemPrice * 0.08;
		finalPrice = itemPrice - salePrice;
		break;
	case 652:
		salePrice = itemPrice * 0.15;
		finalPrice = itemPrice - salePrice;
		break;
	default:
		salePrice = itemPrice * 0.05;
		finalPrice = itemPrice - salePrice;
		break;
}

cout << "Your final price is: $" << fixed << setprecision(2) << finalPrice;


//end program

cout << endl << endl << endl;
return 0;
}

