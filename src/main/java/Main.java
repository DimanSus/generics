public class Main {
    public static void main(String[] args) {
        Byte [] arrayByte = {2, 5, 6, 8, 1};
        SumGen<Byte> byteSumGen = new SumGen<>(arrayByte);
        byteSumGen.sum();

        Integer[] arrayInt = {231, 123, 67, 0, 213};
        SumGen<Integer> integerSumGen = new SumGen<>(arrayInt);
        integerSumGen.sum();

        Double[] arrrayDouble = {3.123, 127.1, 213.2, 12.0, 75.6};
        SumGen<Double> doubleSumGen = new SumGen<>(arrrayDouble);
        doubleSumGen.sum();
    }
}
