public class SumGen <T extends Number>{
    private T[] array;

    public SumGen(T[] array){
        this.array = array;
    }

    public void sum(){
        double sum = 0;
        for (T value: array) {
            sum+=value.doubleValue();
        }
        System.out.println(sum);
    }
}
