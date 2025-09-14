#include <iostream>
#include <stack>
#include <string>

using namespace std;

string ReadString()
{
    string input;
    cout << "Enter a word or sentence: ";
    getline(cin, input);

    return input;
}

stack<char> PushLettersToStack(string& input)
{
    stack<char> s;
    for (char c : input) {
        s.push(c);
    }
    return s;
}

stack <char> ReverseStack(stack <char> s)
{
    stack <char> reversed;
    while (!s.empty()) {
        reversed.push(s.top());
        s.pop();
    }
    return reversed;
}

string StackToString(stack <char> s)
{
    string result;
    while (!s.empty()) {
        result += s.top();
        s.pop();
    }
    return result;
}

int main() {

    string input = ReadString();
    stack <char> stInput = PushLettersToStack(input);
    string reversed = StackToString(ReverseStack(stInput));
    cout << "Reversed: " << reversed << endl;

    return 0;
}