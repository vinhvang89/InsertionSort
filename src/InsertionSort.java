public class InsertionSort {
    static int[] numbers = { 3,5,8,2,3,12,32,97};
    public static void sort(){
        for (int i = 1; i < numbers.length ; i++) {
            int valueToInsert = numbers[i];
            int holdPosition = i;
            while (holdPosition > 0 && numbers[holdPosition -1] > valueToInsert){
                numbers[holdPosition] = numbers[holdPosition -1];
                holdPosition--;
            }
            if(holdPosition != i)
            numbers[holdPosition] = valueToInsert;
        }
    }
}
