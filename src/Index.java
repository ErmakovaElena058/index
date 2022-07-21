public class Index {

    public static void main(String[] args) {
        IndexWeightBody service = new IndexWeightBody();
        int weight = 56;
        int growth = 167;
        int index = service.calculate(weight, growth);
        System.out.println(index);

    }
}
