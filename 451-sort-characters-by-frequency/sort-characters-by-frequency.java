class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Character key:map.keySet()){
            pq.add(key);
        }
        StringBuilder ans=new StringBuilder();
        while(!pq.isEmpty()){
            char ch=pq.poll();
            int freq=map.get(ch);
            for(int i=0;i<freq;i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}