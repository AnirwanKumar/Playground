#include <math.h>
#include <stdio.h>

int main() {
    int num, originalNum, remainder, n = 0, result = 0, power;
    
    scanf("%d", &num);

    originalNum = num;

    while (originalNum != 0) {
        originalNum /= 10;
        ++n;
    }
    originalNum = num;

    while (originalNum != 0) {
        remainder = originalNum % 10;

        // pow() returns a double value
        // round() return the equivalent int
        power = round(pow(remainder, n));
        result += power;
        originalNum /= 10;
    }

    if (result == num)
        printf("Kindly proceed with encrypting");
    else
        printf("It is not an Armstrong number");
    return 0;
}
