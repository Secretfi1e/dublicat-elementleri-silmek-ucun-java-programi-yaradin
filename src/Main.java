public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] numbers ={12,13,20,19,25,13,20};

        int uniqueElementLength=0;
        int count=0;
        int  indexForUniques=0;
        for (int i=0;i<numbers.length;i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;


                }
            }
            if (count < 2) {
                uniqueElementLength++;
            }
            count = 0;
        }
             int[] uniques =new int[uniqueElementLength];
        for (int i=0;i<numbers.length;i++){
            count=0;
            for (int j=0;j<numbers.length;j++){
                if(numbers[i] == numbers[j]){
    count++;

                }

            }

            if(count<2 && indexForUniques < uniqueElementLength) {

            uniques[indexForUniques] = numbers[i];
            indexForUniques++;
         count=0;

        }
        }
        for(int item : uniques) {
            System.out.println(item);

        }}}














