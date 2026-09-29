class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberHistory = new HashMap<>();

            for (int i = 0;i<nums.length;i++) {

                int complementaryNumber = target - nums[i];

                if (numberHistory.containsKey(complementaryNumber)) {
                    int [] indexPair = {numberHistory.get(complementaryNumber), i};
                    return indexPair;
                }
                    numberHistory.put(nums[i], i);
            }
            int [] nothing = {};
            return nothing;
            
    }
}