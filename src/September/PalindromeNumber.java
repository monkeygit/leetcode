package September;

public class PalindromeNumber {
	
	public boolean isPalindrome(int x){
		if(x < 0) return false;
		return x == reverse(x);
	}
	
    private int reverse(int x) {
        int r = 0;
		while(x > 0){
			int unit = x % 10;
			r = r * 10 + unit;
			x /= 10;
		}
		return r;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
