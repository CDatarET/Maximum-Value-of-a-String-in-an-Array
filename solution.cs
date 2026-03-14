public class Solution {
    public int MaximumValue(string[] strs) {
        int max = 0;
        foreach(string s in strs){
            if(s.All(char.IsDigit)) {
                max = Math.Max(max, int.Parse(s));
            } 
            else {
                max = Math.Max(max, s.Length);
            }
        }

        return(max);
    }
}
