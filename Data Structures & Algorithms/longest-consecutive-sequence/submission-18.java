class Solution {
    public int longestConsecutive(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        if(nums.length == 0) return 0;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int cons = 1; Integer prev = null; int cur=0; int maxCons=1;
        for (int key : map.keySet()) {
            if (prev != null) {
                if (key - prev == 1) {
                    cons++;
                } else {
                    cons = 1;
                }
                maxCons = Math.max(maxCons, cons);
            }
            prev = key;
        }

        return maxCons;
    }
}
