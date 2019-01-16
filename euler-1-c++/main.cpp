#include <iostream>

bool isDivisibleBy3Or5(int number)
{
    return number % 3 == 0 || number % 5 == 0;
}

int main() {
    int sumOfAllMultiples = 0;
    for (int i = 1; i < 1000; i++) {
        if(isDivisibleBy3Or5(i)) {
            sumOfAllMultiples += i;
        }
    }
    std::cout << sumOfAllMultiples << std::endl;
    return 0;
}