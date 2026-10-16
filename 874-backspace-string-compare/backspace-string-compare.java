class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
            if(!stack1.isEmpty() ){
                stack1.pop();
            }
            }else{
                stack1.push(ch);
            }
        }
        
        for(int i=0;i<t.length();i++){
            char ch2=t.charAt(i);
            if(ch2=='#'){
            if(!stack2.isEmpty() )
            {
                stack2.pop();
            }
            }else{
                stack2.push(ch2);
            }

        }
        return stack1.equals(stack2);
        
    }
}