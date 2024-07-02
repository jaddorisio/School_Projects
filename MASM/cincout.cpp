
#include <iostream>
//#include "stdafx.h"
using namespace std;

//extern "C" void _asmMain();
	
extern "C" void _printString(char* s)	{	cout << s;   return;}

extern "C" int _getInt()				{	int i;   cin >> i;   return i;}

extern "C" void _printInt(int i)		{	cout << i; return; }

// push a word with the char in it (smallest item you can push onto stack)
extern "C" void _printChar (char c)		{	cout << c; return; }

// main stub driver
/*
int main(){
   _asmMain();
   cout << endl;
   system("pause");
   return 0;
}
*/