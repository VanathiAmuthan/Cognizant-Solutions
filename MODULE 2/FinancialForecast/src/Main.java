public class Main {
    public static void main(String[] args) {
        double presentValue = 1000.0; // ₹1000 starting
        double growthRate = 0.1;      // 10% annual growth
        int years = 5;                // Forecast for 5 years

        double resultRecursive = Forecast.futureValue(presentValue, growthRate, years);
        System.out.printf("Recursive Future Value after %d years: Rs.%.2f\n", years, resultRecursive);

        double resultIterative = Forecast.futureValueIterative(presentValue, growthRate, years);
        System.out.printf("Iterative Future Value after %d years: Rs.%.2f\n", years, resultIterative);
    }
}
