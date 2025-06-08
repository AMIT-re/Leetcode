class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> str=new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
        {
            
            while(!str.isEmpty() && temperatures[i]>temperatures[str.peek()])
            {
                int id=str.pop();
                result[id]=i-id;

            }
            str.push(i);
        }
        return result;
        
    }
}