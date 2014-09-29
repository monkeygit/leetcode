package September;

public class LengthofLastWord {
	
	public int lengthOfLastWord(String s){
		String[] res = s.split(" ");
		if(res.length == 0) return 0;
		return res[res.length-1].length();
	}
	
	
	public static void main(String[] args){
		LengthofLastWord test = new LengthofLastWord();
		String s = "Today is a nice day";
		System.out.println(test.lengthOfLastWord(s));
	}
	
}	
