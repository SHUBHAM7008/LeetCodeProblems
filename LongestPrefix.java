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
