package solutions;

public class SelectionSort {

    public int[] selectionSortMethod(int[] nums) {
        int smallestIndex;
        int vacume;
        for (int i = 0;i<nums.length; i++){
            smallestIndex=i;
            for (int j = i; j <nums.length; j++) {
                if(nums[j]<nums[smallestIndex])
                    smallestIndex=j;
            }
            vacume=nums[i];
            nums[i]=nums[smallestIndex];
            nums[smallestIndex]=vacume;
        }
        return nums;
    }

    public int[] selectSort(int[] nums){
        int helper;
        int currentMin;
        int leng= nums.length;
        for( int i =0 ; i < leng-1; i++){
            currentMin = nums[i];
            for ( int j =i ; j<leng ; j++){
                if(nums[j]< currentMin){
                    currentMin=nums[j];
                    nums[j]=nums[i];
                    nums[i]=currentMin;

                }
            }
        }
        return nums;
    }


}
