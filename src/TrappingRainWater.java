public class TrappingRainWater {
    public static int getWaterUnits(int[] buildInArray){
        int[] left = new int[buildInArray.length];
        int[] right = new int[buildInArray.length];
        int waterUnits = 0;
        left[0] = buildInArray[0];
        for(int leftIndex = 1; leftIndex<left.length; leftIndex++){
            left[leftIndex] = Math.max(left[leftIndex-1],buildInArray[leftIndex]);
        }
        right[buildInArray.length-1] = buildInArray[buildInArray.length-1];
        for (int rightIndex = buildInArray.length-2; rightIndex>=0; rightIndex--){
            right[rightIndex] = Math.max(right[rightIndex+1],buildInArray[rightIndex]);
        }
        for(int currentIndex = 0; currentIndex<buildInArray.length; currentIndex++){
            waterUnits=waterUnits+Math.min(left[currentIndex],right[currentIndex]) - buildInArray[currentIndex];
        }
        return waterUnits;
    }
    public static void main(String[] args) {
        int[] a = {5,0,5,3,2,1,4};
        System.out.println(getWaterUnits(a));
    }
}
