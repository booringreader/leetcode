class Solution {
    static class Pair implements Comparable<Pair>{
            int value, index;

            public Pair(int value, int index){
                this.value = value;
                this.index = index;
            }

            @Override
            public int compareTo(Pair p2){
                return p2.value - this.value;
            }
        }
    public int[] maxSlidingWindow(int[] nums, int k) {

        // if elements in the successive windows are not overlapping
        if(k==1){
            return nums;
        }
        
        PriorityQueue<Pair> heap = new PriorityQueue<>(); // descending order

        for(int i=0; i<k; i++){
            heap.add(new Pair(nums[i], i));
        }

        ArrayList<Integer> out = new ArrayList<>(); // to store output elements 
        out.add(heap.peek().value); // first element

        for(int i=k; i<nums.length; i++){
            while(heap.size() > 0 && (heap.peek().index <= (i-k))){
                heap.remove();
            }
            heap.add(new Pair(nums[i], i));
            out.add(heap.peek().value);
        }

        int output[] = new int[out.size()];
        for(int i=0; i<out.size(); i++){
            output[i] = out.get(i);
        }

        return output;
    }
}
