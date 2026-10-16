class Solution {
    public String decodeString(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=']'){
                stack.push(ch);
            }else{
                StringBuilder str=new StringBuilder();
                while(stack.peek()!='['){
                    str.insert(0,stack.pop());

                }
                stack.pop();
                StringBuilder num=new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    num.insert(0,stack.pop());
                }
                int repeat=Integer.parseInt(num.toString());
                
                StringBuilder repeated=new StringBuilder();
                for(int j=0; j<repeat; j++){
                    repeated.append(str);
                }
                for(char c:repeated.toString().toCharArray() ){
                    stack.push(c);
                }
                

            }
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:stack){
            ans.append(ch);
        }
        return ans.toString();
        
    }
}