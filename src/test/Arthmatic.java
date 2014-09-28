package test;



public class Arthmatic {
	
	public int arth(String s){
		try{
			String[] ss = s.split(" ");
			int a = Integer.parseInt(ss[0]);
			int b = Integer.parseInt(ss[2]);
			if(ss[1].equals("+"))
				return a + b;
			else if(ss[1].equals("-"))
				return a - b;
			return 0;
		}catch(NumberFormatException e){
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Arthmatic test = new Arthmatic();
		System.out.println(test.arth(" + 2"));
	}

}
