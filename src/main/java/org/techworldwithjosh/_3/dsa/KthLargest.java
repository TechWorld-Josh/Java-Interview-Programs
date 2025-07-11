package org.techworldwithjosh._3.dsa;

import java.util.PriorityQueue;

class KthLargest {

    PriorityQueue<Integer> pq;
    int K;

    public KthLargest(int k, int[] nums) {
        K = k;
        pq = new PriorityQueue<>();
        for (int i : nums) {
            if (pq.size() < k) pq.add(i);
            else {
                if (pq.peek() < i) {
                    pq.poll();
                    pq.add(i);
                }
            }
        }
    }

    public int add(int val) {
        if (pq.size() < K) pq.add(val);
        else {
            if (pq.peek() < val) {
                pq.poll();
                pq.add(val);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = {4, 5, 8, 2};

        KthLargest kthLargest = new KthLargest(k, nums);
        System.out.println("KthLargest initialized with k=" + k + " and nums=" + java.util.Arrays.toString(nums));
        System.out.println("Initial " + k + "th largest element: " + kthLargest.pq.peek());
    }
}
