package cn.itcase_07;

public class FinallyDemo {

	public static void main(String[] args) {
		
		System.out.println("∑µªÿ÷µ£∫"+getInt());
	}
	
	public static int getInt() {
		int a=10;
		try {
			System.out.println(a/0);
			a=20;
		} catch (Exception e) {
			a=30;
			return a;
		}finally {
			a=40;
			System.out.println(a);
		}
		return a;
	}

}
