class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int n=s.length();
        int m=p.length();
        if(m>n)
        {
            return ans;
        }
        int[] pcount=new int[26];
        int[] scount=new int[26];
        for(int i=0;i<m;i++)
        {
            pcount[p.charAt(i)-'a']++;
            scount[s.charAt(i)-'a']++;
        }
        if(java.util.Arrays.equals(pcount,scount))
        {
            ans.add(0);
        }
        for(int i=m;i<n;i++)
        {
            scount[s.charAt(i)-'a']++;
            scount[s.charAt(i-m)-'a']--;
             if(java.util.Arrays.equals(pcount,scount))
        {
            ans.add(i-m+1);
        }

        }
        return ans;
    }
}
