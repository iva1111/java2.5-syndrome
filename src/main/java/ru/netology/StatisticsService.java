package ru.netology;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public int findMax(int[] incomes) {
        int currentMaxIndex = 0;
        int currentMax = incomes[0];
        for (int income : incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
            return currentMax;
    }
}
