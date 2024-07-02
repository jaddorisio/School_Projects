/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date:

Filename:RightTriangleChecker.cpp

Desc: The following application prompts the user for
the 3 sides of a triangle and displays whether the triangle
is a right triangle or not a right triangle.


*/
#include <iostream>
#include <cmath>
using namespace std;

/*
Desc: This function accepts the three sides of a triangle to 
evaulate whetehr the triangle is a right triangle or not.
Pre condition:(are things that have to be in place for the function 
to complete its task): All three sides must be > 0.
Post condidtion:
	True or False value is return.
*/
bool isRightTriangle(int leg1, int leg2, int hypot){
	bool answer = false;
	if (pow(hypot, 2) == pow(leg1,2) + pow(leg2, 2) ){
		answer = true;
	}
	return answer;
}

/*
Desc: This function accepts the three sides of a triangle to 
evaulate the area of a triangle .
Pre condition:(are things that have to be in place for the function 
to complete its task): All three sides must be an integer and greater than 0.
Post condidtion:
	area value is return or -1 if integer is invalid.
*/
double heronsArea(int sideA, int sideB, int sideC){

double A = -1;
double s = 0.0;
s = (sideA + sideB + sideC) / 2.0;
if ( s * (s-sideA) * (s-sideB) * (s-sideC) <= 0)
	return A;
else {
A = sqrt(s * (s-sideA) * (s-sideB) * (s-sideC) );
return A;
}
}
int main() {
	int leg1;
	int leg2;
	int hypot;
	
	
	cout << "Enter Leg 1: ";
	cin >> leg1; 
	cout << "Enter Leg 2: ";
	cin >> leg2;
	cout << "Enter hypot: ";
	cin >> hypot;
	
	while (leg1 <= 0 || leg2 <= 0 || hypot <=leg1 || hypot <= leg2)	{
	cin.ignore();
	cout << "Try again" << endl;
	cout << "Enter Leg 1: ";
	cin >> leg1; 
	cout << "Enter Leg 2: ";
	cin >> leg2;
	
	cout << "Enter hypot: ";
	cin >> hypot;
}

if (isRightTriangle(leg1, leg2, hypot)) {
	cout << "right Triangle" << endl;
}
else {
	cout << "nope" << endl;
}
cout << "area: "  << heronsArea(leg1, leg2, hypot);



//end program
cout << endl << endl << endl;
return 0;
}

