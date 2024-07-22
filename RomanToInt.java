// https://leetcode.com/problems/roman-to-integer/
class RomanToInt {
    public int romanToInt(String s) {
        int result=0;
        int previousVlaue=0;
        int currentValue=0;
        for(int i=s.length()-1;i>-1;i--){
            switch(s.charAt(i)){
                case 'I':
                   currentValue=1;
                   break;
                case 'V':
                   currentValue=5;
                   break;
                case 'X':
                
                   currentValue=10;
                   break;
                case 'L':
                   currentValue=50;
                   break;
                case 'C':
                   currentValue=100;
                   break;
                case 'D':
                   currentValue=500;
                   break;
                case 'M':
                   currentValue=1000;
                   break;
                default:


            }
            if(currentValue>=previousVlaue){
                result+=currentValue;
                previousVlaue=currentValue;
            }else{
               result-=currentValue;
                previousVlaue=currentValue;
            }
            
        }
        return result;
    }
}
