class Solution {
    public String defangIPaddr(String address) {
        
        String ret = null;
        
        for (char c : address.toCharArray()){
            
            if (c == '.'){
                
                ret = address.replace(String.valueOf(c), "[.]");
            }
            
        }
        return ret;
    }
}
