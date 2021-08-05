package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        int[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12, 15};
        assertEquals(15, service.findMax(incomesInBillions));
    }
}
