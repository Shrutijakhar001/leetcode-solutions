class Solution {
    public int findTheWinner(int n, int k) {

        Queue<Integer> q = new LinkedList<>();

        // Add all friends
        for(int i = 1; i <= n; i++) {
            q.offer(i);
        }

        // Eliminate friends
        while(q.size() > 1) {

            // Move k-1 friends to the back
            for(int i = 1; i < k; i++) {
                int x = q.poll();
                q.offer(x);
            }

            // Eliminate kth friend
            q.poll();
        }

        // Return winner
        return q.poll();
    }
}