public class App {
    public static void main(String[] args){
        int[] myList = {1, 2, 3, 4, 5};

        for(int i = 0, j = myList.length - 1; i < myList.length / 2; i++, j--){
            int temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
            
        for(int i = 0; i < myList.length; i++){    
            System.out.print(myList[i] + " ");
        }
    }
}
