class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while(low < high) {
            int mid = low + ((high - low) / 2);

            long ans = 0;
            for(int pile : piles) {
                ans += (pile + mid - 1) / mid;

                if(ans > h) break; 
            }

            if(ans <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
