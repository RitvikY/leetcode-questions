class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        /* the best implementation of this would be to use a hashmap and treat
         * each number as a key, that way it is easier to return the top K keys
         * by using a priority queue */
        
        
           //count the frequency for each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // create a min heap
        PriorityQueue<Map.Entry<Integer, Integer>> queue 
                      = new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));

        //maintain a heap of size k.
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        //get all elements from the heap
        int[] resultArr=new int[queue.size()];
        int index =0;
        while (queue.size() > 0) {
            resultArr[index++]=queue.poll().getKey();
        }

        return resultArr;
    }
        
        
    
}