public class ArrayReverser 
{
    public static void exchangeValues(String[] array, int i, int j) 
    {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void reversingArray(String[] myArray) 
    {
        int arrayLength = myArray.length;
        for (int i = 0; i < arrayLength / 2; i++) 
        {
            exchangeValues(myArray, i, arrayLength - i - 1);
        }
    }

    public static void printArrayElements(String[] myArray) 
    {
        System.out.println("\nArray Elements Are: ");
        for (String element : myArray) 
        {
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        String[] myArray = {"Yellow", "Blue", "Black", "Green", "Purple"};
        printArrayElements(myArray);
        reversingArray(myArray);
        printArrayElements(myArray);
    }
}