public class KSmallestElements {
    public static void kElements(int[] arr, int k){
        for(int i=k; i< arr.length; i++){
            int currElement = arr[i];
            int max = arr[k-1];
            int maxPosition = k-1;
            for(int reverseIndex=k-2; reverseIndex>=0; reverseIndex--){
                if(arr[reverseIndex] > max){
                    max = arr[reverseIndex];
                    maxPosition = reverseIndex;
                }
            }
            if(currElement < max){
                while (maxPosition<k-1) {
                    arr[maxPosition]=arr[maxPosition+1];
                    maxPosition++;
                }
                arr[k-1]=currElement;
            }
        }
        for (int i=0; i<k; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {50,25,100,200,30};
        kElements(arr,2);
    }
}
