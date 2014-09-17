package September;

import java.util.ArrayList;
import java.util.List;

public class CountandSay {
	
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String res = "";
        List<Integer> oldList = new ArrayList<Integer>();
        oldList.add(1);
        for(int i=1; i<n; i++){
        	List<Integer> newList = new ArrayList<Integer>();
        	for(int j=0, k=1; j<oldList.size(); j++){
        		while(j<oldList.size()-1 && oldList.get(j) == oldList.get(j+1)){
        			k++;j++;
        		}
        		newList.add(k);
        		newList.add(oldList.get(j));
        		k = 1;
        	}
        	oldList = newList;
        }
        for(int i=0; i<oldList.size(); i++)
        	res += oldList.get(i);
        return res;
    }
	
	public static void main(String[] args) {
		CountandSay test = new CountandSay();
		System.out.println(test.countAndSay(1));
		System.out.println(test.countAndSay(2));
		System.out.println(test.countAndSay(3));
		System.out.println(test.countAndSay(4));
		System.out.println(test.countAndSay(5));
		System.out.println(test.countAndSay(6));
		System.out.println(test.countAndSay(7));
		System.out.println(test.countAndSay(8));
		System.out.println(test.countAndSay(9));
		System.out.println(test.countAndSay(10));
		
		
	}

}
