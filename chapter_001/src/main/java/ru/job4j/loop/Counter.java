package ru.job4j.loop;

public class Counter {
    int sum = 0;
    public int add(int start, int finish) {

        for ( ;start <= finish; start++) {
            if (start % 2 == 0) {
                sum += start;
            }
        }
        return sum;
    }
}




