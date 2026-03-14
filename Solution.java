class Solution {
    private boolean isDigit(String s){
        try{
            Integer.parseInt(s);
            return(true);
        }   
        catch(NumberFormatException e){
            return(false);
        }
    }

    public int maximumValue(String[] strs) {
        int max = 0;
        for(int i = 0; i < strs.length; i++){
            if(isDigit(strs[i])){
                max = Math.max(max, Integer.parseInt(strs[i]));
            }
            else{
                max = Math.max(max, strs[i].length());
            }
        }

        return(max);
    }
}
