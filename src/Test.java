public class Test {
    public static void main(String[] args) {
        InsertionSort.sort();
        for (int i = 0; i < InsertionSort.numbers.length ; i++) {
            System.out.print( InsertionSort.numbers[i] + " ");
        }
    }
}
