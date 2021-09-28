class MajorityElement2 {
    
    public List<Integer> majorityElement(int[] nums) {
        int el1 = 0, el2 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == el1) {
                count1++;
            } else if (num == el2) {
                count2++;
            } else if (count1 == 0) {
                el1 = num;
                count1++;
            } else if (count2 == 0) {
                el2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        count1 = 0; 
        count2 = 0;
        for (int num : nums) {
            if (num == el1) {
                count1++;
            } else if (num == el2) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            result.add(el1);
        }
        if (count2 > nums.length / 3) {
            result.add(el2);
        }
        return result;
    }
}