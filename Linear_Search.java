public class Linear_Search{
    public static void main(String[] args) {
        /*
            Linear Search = Iterate through a collection one element at a time

                            runtime complexity: 0(n)

                            Disadvantages:
                            Slow for large data sets

                            Advantages:
                            Fast for searches of small to medium data sets
                            Does not need to sorted
                            Useful for Data Structures that do not have random access (Linked List)
        */
        /* declaration of an array */
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int index = Linear_Search(array,1);

        if(index != (-1)){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
        main2();
        main3();
    }
    public static void main2(){
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int index = Linear_Search(array,5);

        if(index != (-1)){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static void main3(){
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int index = Linear_Search(array,10);

        if(index != (-1)){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }
    /* calling a method that does a linear search on the array. If the index of the value is found, it will return the index. If it is not found, it will return -1 */
    private static int Linear_Search(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}