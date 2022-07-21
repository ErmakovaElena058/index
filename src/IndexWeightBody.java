public class IndexWeightBody {

    public int calculate(int weight, int growth) {
        int growthMetrDouble = growth / 100 * 2;
        int result = weight / growthMetrDouble;
    return result;
    }
}
