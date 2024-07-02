/*
Name: Jonpaul Addorisio
Class: CSC151 - Programming I
Date:

Filename:investment_counting.cpp

Desc:
The following program showcases a while loop used for count controlled looping.

*/
#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    cout << fixed << setprecision(2);
    const double INITIAL_BALANCE = 10000;
    const double FINAL_BALANCE = 20000;
    const double INTEREST_RATE = 3.5;

    double currentBalance = INITIAL_BALANCE;
    int years = 1;

    cout << "The interest rate is: " << setprecision(1) << INTEREST_RATE
         << setprecision(2) << "%\n";
    cout << "Year: \tEnd of year Balance:\n";
    while ( currentBalance <= FINAL_BALANCE) { // loop 10 times)
        currentBalance= currentBalance + (1 + (INTEREST_RATE / 100));

        cout << years << "\t" << currentBalance << endl;
        ++years;
    }



//end program
    cout << endl << endl << endl;
    return 0;
}


