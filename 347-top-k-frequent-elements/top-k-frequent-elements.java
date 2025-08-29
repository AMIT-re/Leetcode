class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> hm.get(b)-hm.get(a));
        for(int k1:hm.keySet())
        {
            pq.add(k1);
        }
        
        int res[]=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=pq.poll();
        }
        return res;

    }
}