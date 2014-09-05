package September;

public class IntegertoRoman {
	
	public String intToRoman(int num){
		String res = "";
		String[] constant = {"M","D","C","L","X","V","I"};
		int power = 1000;
		int cur1 = 0, cur2 = 2;
		while(power != 0){
			int x = num / power;
			if(x < 4)
				if(power == 1000)
					for(int i=0; i<x; i++)
						res = res + constant[cur1];
				else
					for(int i=0; i<x; i++)
						res = res + constant[cur2];
			else if(x == 4){
				cur1++;
				res = res + constant[cur2] + constant[cur1];
			}
			else if(x >=5 && x < 9){
				cur1++;
				res = res + constant[cur1];
				for(int i=0; i<(x-5); i++)
					res = res + constant[cur2];
			}
			else if(x == 9){
				res = res + constant[cur2] + constant[cur1];
			}
			if(power != 1000){
				cur1 = cur2;
				cur2 += 2;
			}
			num %= power;
			power /= 10;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegertoRoman test = new IntegertoRoman();
		System.out.println(test.intToRoman(0));
		System.out.println(test.intToRoman(1));
		System.out.println(test.intToRoman(3));
		System.out.println(test.intToRoman(4));
		System.out.println(test.intToRoman(5));
		System.out.println(test.intToRoman(9));
		System.out.println(test.intToRoman(1899));
		System.out.println(test.intToRoman(3999));
		System.out.println(test.intToRoman(1600));
		System.out.println(test.intToRoman(51));
		System.out.println(test.intToRoman(55));
		System.out.println(test.intToRoman(11));
		System.out.println(test.intToRoman(53));
		System.out.println(test.intToRoman(54));
		System.out.println(test.intToRoman(544));
		System.out.println(test.intToRoman(59));
		System.out.println(test.intToRoman(199));
	}

}
