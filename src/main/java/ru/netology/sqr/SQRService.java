package ru.netology.sqr;

public class SQRService {

    public int sqrService(int valueLimitsMin, int valueLimitsMax) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (valueLimitsMin < i * i && i * i < valueLimitsMax) {
                counter++;
            }
        }
        return counter;
    }
}
