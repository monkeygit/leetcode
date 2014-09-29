package September;

public class LongestCommonPrefix {
	
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int index = 0;
        int minLength = Integer.MAX_VALUE;
        String minStr = null;
        if(strs.length != 0){
        	for(int i=0; i<strs.length; i++)
        		if(strs[i].length() < minLength){
        			minLength = strs[i].length();
        			minStr = strs[i];
        		}
	        OK:
	        while(index < minLength){
	        	prefix += minStr.charAt(index);
	        	for(int i=0; i<strs.length; i++)
	        		if(!strs[i].startsWith(prefix)){
	        			prefix = prefix.substring(0, prefix.length()-1);
	        			break OK;
	        		}
	        	index++;
	        }
        }
    	return prefix;
    }
	
	public static void main(String[] args) {
		LongestCommonPrefix test = new LongestCommonPrefix();
		String[] t = {"abc","abcdefg","abcde"};
		System.out.println(test.longestCommonPrefix(t));
	}

}
