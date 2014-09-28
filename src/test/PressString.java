package test;

public class PressString {
	
	public String press(String s){
		String res = "";
		int count = 1;
		for(int i=0; i<s.length(); i++){
			if(i != s.length()-1 &&s.charAt(i) == s.charAt(i+1)){
				count++;
			}
			else{
				if(count > 1)
					res += count;
				res += s.charAt(i);
				count = 1;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		PressString test = new PressString();
		System.out.println(test.press("pppppppp"));
	}

}
