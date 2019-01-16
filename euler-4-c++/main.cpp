#include <iostream>
#include <algorithm>

using namespace std;


string numberToString(int number)
{
    return to_string(number);
}


bool stringIsAPalindrome(const string &palindromeCandidate)
{
    string half = palindromeCandidate.substr(0, palindromeCandidate.length()/2);
    string otherHalf = palindromeCandidate.substr(palindromeCandidate.length()/2);
    reverse(otherHalf.begin(), otherHalf.end());
    return half == otherHalf;
}


int main() {
    int startingNumber = 999;
    int myFactors[2];
    int maxPalindrome = 0;
    for(int i = startingNumber; i >= 1; i--)
    {
        for(int j = startingNumber; j >= 1; j--)
        {
            int productOfInnerAndOutNumber = i * j;
            if(stringIsAPalindrome(numberToString(productOfInnerAndOutNumber)) && productOfInnerAndOutNumber > maxPalindrome)
            {
                maxPalindrome = productOfInnerAndOutNumber;
                myFactors[0] = i;
                myFactors[1] = j;

            }
        }
    }
    cout << "Number is " + numberToString(maxPalindrome) + " And numbers are " + numberToString(myFactors[0]) + " and "  + numberToString(myFactors[1]) << endl;
    return 0;
}