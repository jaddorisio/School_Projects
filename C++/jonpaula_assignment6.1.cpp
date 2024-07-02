/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date: 12/20/2016

Filename:jonpaula_assignment6.1.cpp

Desc:
Write a function named swapElements that accepts an int vector by reference, and also accepts two index values. 
 Swap the values in the vector at the two indexes.  Write a simple main() function to test your function.

*/
#include <iostream>
#include <vector>
using namespace std;
void swapElements(vector<int>& vector, int index1, int index2) {
	int i;
	int j;
	
	i = vector.at(index1);
	j = vector.at(index2);
	vector.at(index1) = j;
	vector.at(index2) = i;
}

int main() {
vector<int> grades(3);

grades.at(0) = 23;
grades.at(1) = 34;
grades.at(2) = 90;

for (int i = 0; i < 3; ++i)	{
	cout << grades.at(i) << " ";
}

swapElements(grades, 1, 2);
cout << endl;

for (int i = 0; i < 3; ++i)	{
	cout << grades.at(i) << " ";
}

	

//end program
cout << endl << endl << endl;
return 0;
}

