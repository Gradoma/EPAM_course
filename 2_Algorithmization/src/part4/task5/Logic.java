package part4.task5;

class Logic {
    void findPreMaxNumber (int [] array){
        int indexMax = 0;
        int indexPreMax = 0;

        for (int i=0; i<array.length; i++){
            if (array[i] > array[indexMax]){
                indexPreMax = indexMax;
                indexMax = i;
            }
        }
        System.out.println("Second largest num: " + array[indexPreMax]);
    }
}
