class Solution {
    public boolean judgeCircle(String moves) {
        int l = 0, u = 0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            switch (ch)
            {
                case 'L':
                    l--;
                    break;
                case 'R':
                    l++;
                    break;
                case 'U':
                    u--;
                    break;
                case 'D':
                    u++;
                    break;

                default :
                    break;
            }
        }
        
        return l == 0 && u == 0;
    }
}

        
    