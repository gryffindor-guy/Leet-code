class MajorityElement {
    public int majorityElement(int[] nums) {
        int el1 = 0, c1 = 0;
        for (int num : nums) {
            if (num == el1) {
                c1++;
            }
            else if (c1 == 0) {
                el1 = num;
                c1++;
            }
            else {
                c1--;
            }
        }
        return el1;
    }
}