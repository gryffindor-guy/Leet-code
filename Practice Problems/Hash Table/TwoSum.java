class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(map.containsKey(difference)) {
                arr[0] = map.get(difference);
                arr[1] = i;
                return arr;
            } else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }
}