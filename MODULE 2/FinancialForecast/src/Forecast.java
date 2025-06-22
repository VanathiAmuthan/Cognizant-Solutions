public class Forecast {

    // Recursive method to calculate future value
    public static double futureValue(double presentValue, double rate, int years) {
        if (years == 0) return presentValue;
        return futureValue(presentValue * (1 + rate), rate, years - 1);
    }

    // Iterative method to calculate future value
    public static double futureValueIterative(double presentValue, double rate, int years) {
        for (int i = 0; i < years; i++) {
            presentValue *= (1 + rate);
        }
        return presentValue;
    }
}
