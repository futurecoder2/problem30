public class problem32 {
    public static void main(String[ ] args)
    {
        int[] myArray = {10, 20, 30, 40, 50};

        myArray = insert(myArray, 3, 35);
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + ", ");
        }
    }
    private static int[] insert(int[] array, int index, int value)
    {
        int[] tempArray = new int[array.length + 1];

        boolean occured = false;

        int i;

        for(i = 0; i <= tempArray.length - 1; i++)
        {
            if(i == index)
            {
                tempArray[i] = value;
                occured = true;
            }
            else if(occured)
            {
                tempArray[i] = array[i-1];
            }
            else
            {
                tempArray[i] = array[i];
            }
        }
        return tempArray;
    }
}