public class IndexWeightBody {

    public double calculate(double weight, double growth) {
        double growthDouble = (growth / 100) * (growth / 100);
        double result = weight / growthDouble;
        return result;
    }
}
