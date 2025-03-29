public class App {
    public static void main(String[] args){
        //reversingArray();
        //binarySearchImplementation();
        //twoDimensionalArray();


    }

    public static void reversingArray(){
        /*
            Key issue was a Logic Error, intially I was traversing the whole array,
            however, logically you only need to traverse half of it; or 1 less than 
            half if the length of the array is odd 
        */

        int[] myList = {1, 2, 3, 4, 5};

        for(int i = 0, j = myList.length - 1; i < myList.length / 2; i++, j--){
            int temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
            
        for(int i = 0; i < myList.length; i++){    
            System.out.print(myList[i] + " ");
        }
        System.out.println("\n");
    }

    public static void binarySearchImplementation(){
        int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int keyValue = 7;

            /*
                Logic: Begin by having the lowest value, then the highest value set
                       Then have the middle value tested
                       If middle value is key, provide feedback and 'break;'
                       If the key is lower, assign middle value to high
                       If the key is higher, assign middle value to low
            */

        int low = 0;
        int high = numList.length - 1;
        int iterationCount = 0;
        
        /*
            Just a small note when running this, note that the values outputted in the
            console are actually the index's of the array elements, not the elements themselves.
            So the middle value is correct if its 1 below the actual keyValue in this case. 
        */

        while (high >= low) {
            iterationCount++;
            System.out.println("Iteration " + iterationCount);
            int mid = (low + high) / 2;
            System.out.println("    Low value: " + low + " | Middle value: " + mid + " | High value: " + high);
            if(keyValue < numList[mid]){
                high = mid - 1;
            }
            else if(numList[mid] == keyValue){
                System.out.println("Number found! It was " + numList[mid]);
                break;
            }
            else{
                low = mid + 1;
            }
            System.out.println("    Low value: " + low + " | Middle value: " + mid + " | High value: " + high);
        }   
    }

    public static void twoDimensionalArray(){
        int[][] testArray = new int[10][10];

        //Initialise Array with variables
        for(int i = 0; i < testArray.length; i++){

            int count = 1;

            for(int j = 0; j < testArray.length - 1; j++){
                testArray[i][j] = count;
                count++;

                System.out.print(testArray[i][j]);
            }

            System.out.println();

        }

        // Prints out an array 10x10 counting 1-9 on every row

    }
}
