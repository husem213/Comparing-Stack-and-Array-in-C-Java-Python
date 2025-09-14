#include <iostream>
#include <string>

using namespace std;

void ExchangeValues(string& FirstElement, string& SecondElement)
{
    string TempElement;

    TempElement = FirstElement;
    FirstElement = SecondElement;
    SecondElement = TempElement;
}

void ReversingArray(string MyArray[5], int ArrayLength = 5)
{
    for(int i = 0; i < (ArrayLength / 2); i++)
    {
        ExchangeValues(MyArray[i], MyArray[ArrayLength - i - 1]);
    }
}

void PrintArrayElements(string MyArray[5], int ArrayLength = 5)
{
    cout << endl << "Array Elements Are: ";
    for(int i = 0; i < ArrayLength; i++)
    {
        cout << MyArray[i] << "\t";
    }
}

int main()
{
    string MyArray[5] = {"Yellow", "Blue", "Black", "Green", "Purple"};
    PrintArrayElements(MyArray);
    ReversingArray(MyArray);
    PrintArrayElements(MyArray);
    return 0;
}