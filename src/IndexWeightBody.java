public class IndexWeightBody {

    public double calculate(int weight, int growth) {
        double growthDouble = (growth / 100) * (growth / 100);
        double result = weight / growthDouble;
        return result;
    }
}
