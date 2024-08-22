public class RecursiveForecast 
{
    // Recursive function to predict future value
    public static double predictFutureValue(double presentValue, double interestRate, int years) 
    {
        if (years == 0) 
        {
            return presentValue; // Base case: no more years to predict
        } 
        else 
        {
            // Recursive case: apply interest rate to previous year's value
            double futureValue = presentValue * (1 + interestRate);
            return predictFutureValue(futureValue, interestRate, years - 1);
        }
    }

    public static void main(String[] args) 
    {
        double initialInvestment = 1000; // Present value
        double annualInterestRate = 0.05; // 5% interest rate per year
        int yearsToPredict = 5; // Predict future value for 5 years

        double futureInvestmentValue = predictFutureValue(initialInvestment, annualInterestRate, yearsToPredict);

        System.out.println("Predicted future investment value after " + yearsToPredict + " years: $" + futureInvestmentValue);
    }
}
