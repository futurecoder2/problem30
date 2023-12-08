public class problem33
{
    public static void main(String[ ] args)
    {
        int[] myArray = {10, 20, 30, 40, 50};
        myArray = remove(myArray, 3);
        for(int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + ", ");
        }
    }
    private static int[] remove(int[] array, int index)
    {
        int[] tempArray = new int[array.length - 1];

        int i;

        for(i = 0; i < array.length; i++)
        {
            if (i > index)
            {
                tempArray[i-1] = array[i];
            }
            else
            {
                tempArray[i] = array[i];
            }
        }
        return tempArray;
    }
}