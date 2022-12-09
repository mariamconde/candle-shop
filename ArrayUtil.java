public class ArrayUtil
{
        public static void main(String [] args) 
        {
        //default constructor + integer array field 
            int [] intArray = {3,-3,-1,0,-1,4,0,3,4,0};
        //
            int result = countUniqueIntegers(intArray);
                System.out.println(result);
        }
        //and min value method
        public static int countUniqueIntegers(int [] arr) {   
        //Set integer counter for 0
        int numOfUnique = 0;
        int n = arr.length;
        //Logic to count unique values
        //array portion
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                    int tpi = 0; 

                if (arr[i] > arr[j]) 
                {  
                    tpi = arr[i];  
                        arr[i] = arr[j];   
                }  
            }
        }
        // array 2
        int count = 0;
        //count and loop
        for (int i = 0; i < n; i++)
        {
            // for index duplicate
            while (i < n - 1 && arr[i] = arr[ i + 1 ])
            {
                i++;
            }
                count++;
        }
        //setting to count variable
        numOfUnique = count;

        //Return for the number of unique values
        return numOfUnique;
        //bonus half
        //method for return array of only the unique values & swap elements
        public static int countUniqueIntegers(int [] arr)
        {
        for (int i = 1; i < n; i++)
        {
        int j = 0;
        for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
 
        if (i == j)
            num_unique++;
        }

        //Return number of unique values
        return num_unique;

        }


    }
}
