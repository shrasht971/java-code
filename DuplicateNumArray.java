public class DuplicateNumArray {
    public static void main(String[] args){
        int[] inputNumArray = {1,2,5,4,6,5,7,7,7,4};
        for(int i=0; i < inputNumArray.length; i++){
            for(int j=i+1;j <inputNumArray.length; j++){
              if(inputNumArray[i]==inputNumArray[j]){
                System.out.println("Duplicate elements in given array: " +inputNumArray[j]);
              }
            }
        }
    }
}
