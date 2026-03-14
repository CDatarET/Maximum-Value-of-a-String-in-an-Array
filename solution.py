class Solution:
    def maximumValue(self, strs):
        m = 0
        for s in strs:
            if s.isdigit():
                m = max(m, int(s))
            else:
                m = max(m, len(s))
        
        return m
