class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs,Comparator.comparing(s->s.length()));
        int len = strs.length;
        String prefix="";
        for(int i=0;i<strs[0].length();i++){
            boolean flag = false;
            for(int j=1;j<len;j++){
               if((strs[0].charAt(i))!=(strs[j].charAt(i))){
                  return prefix;
               }
            }
            prefix+=strs[0].charAt(i);

        }
        return prefix;
    }
}

OR

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            String current=strs[i];
            String changes="";
            for(int j=0;j<prefix.length() && j<current.length() ;j++){
                 if(prefix.charAt(j)==current.charAt(j)){
                     changes+=prefix.charAt(j);
                 }else{
                    break;
                 }
            }
            prefix=changes;
        }
        return prefix;
    }
}
