/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date:

Filename:

Desc:

*/
#include <iostream>
#include <vector>
using namespace std;


/*
Desc: This function takes in a list of temperatures
and returns the average temoerature.
pre: temps size > 0
post: average temp is retured*/

double aveTemp(vector<double> temps){
	double average, sum = 0.0;
	
	for (int i =0; i < temps.size(); i++){
		sum += temps.at(i);
	}
	
	average = sum / temps.size();
	
	
	return average;
}

int highestTemp(vector<double>& temps) {
	double high = temps.at(0);
	int j = 0;
	for (int i =0; i < temps.size(); i++){
		if ( temps.at(i) > high){
			high = temps.at(i);
			j = i;
		}
		
	}
	return j;
	
	
}
void DropHighestTemp(vector<double>& temps){
	temps.at(highestTemp(temps)) = 0;
	return;
	
}
int main() {
	vector<double> origList(5);
	origList.at(0) = 10.0;
	origList.at(1) = 10.0;
	origList.at(2) = 100.0;
	origList.at(3) = 70.0;
	origList.at(4) = 110.0;
	
	int index = 0;
	
	
	index =  highestTemp(origList);
	cout << origList.at(4) << endl;
	DropHighestTemp(origList);

	
	cout << index << endl;
	cout << origList.at(index);
	
//end program
cout << endl << endl << endl;
return 0;
}

