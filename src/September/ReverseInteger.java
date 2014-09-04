package September;

public class ReverseInteger {

	/*
	 * Consider how to handle with overflow case
	 * Method_1: see following code
	 * Method_2: treat the integer as a string
	 */
	public int reverse(int x){
		long r = 0;
		boolean isNagetive = false;
		if(x < 0){
			isNagetive = true;
			x = -x;
		}
		while(x > 0){
			r = r * 10 + x % 10;
			x /= 10;
			/*Method_1*/
			if(r > Integer.MAX_VALUE){
				r = 0;
				break;
			}
		}
		
		if(isNagetive) return (int) -r;
		else return (int) r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reverse(123));
		System.out.println(ri.reverse(-123));
		System.out.println(ri.reverse(0));
		System.out.println(ri.reverse(10000));
		System.out.println(ri.reverse(1234567899));
	}

}
