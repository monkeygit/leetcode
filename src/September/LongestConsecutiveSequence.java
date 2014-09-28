package September;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
	
	public int longestConsecutive(int[] num){
		Map<Integer, Integer> seq = new HashMap<Integer, Integer>();
		int longest = 0;
		for(int i=0; i<num.length; i++){
			if(seq.containsKey(num[i]))
				continue;
			int low = num[i];
			int upp = num[i];
			if(seq.containsKey(num[i] - 1))
				low = seq.get(num[i] - 1);
			if(seq.containsKey(num[i] + 1))
				upp = seq.get(num[i] + 1);
			
			longest = Math.max(longest, (upp - low) + 1);
			
			seq.put(num[i], num[i]);
			seq.put(low, upp);
			seq.put(upp, low);
		}
		
		return longest;
	}
	
	public static void main(String[] args) {
		int[] a = {100,4,200,1,3,2};
		LongestConsecutiveSequence test = new LongestConsecutiveSequence();
		System.out.println(test.longestConsecutive(a));
	}

}
