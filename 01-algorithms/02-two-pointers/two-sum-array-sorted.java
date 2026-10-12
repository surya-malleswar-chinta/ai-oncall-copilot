class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length-1;
        while(low < high) {
            if (numbers[low]+numbers[high] == target) {
                int[] sol = new int[] {low+1, high+1};
                return sol;
            } else if (numbers[low] + numbers[high] > target){
                high--;
            } else {
                low++;
            }
        }
        
        return null;
    }
}

