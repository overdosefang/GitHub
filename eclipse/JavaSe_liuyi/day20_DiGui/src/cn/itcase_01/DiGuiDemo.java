package cn.itcase_01;

public class DiGuiDemo {
	public static void main(String[] args) {
		for(int i = 1;i<=35;i++) {
			System.out.println("i="+i+":"+panDuan(i));
		}
	}
	
	public static int panDuan(int n) {
		if(n<1) {
			System.out.println("请输入大于0的整数");
			return -1;
		}
		return jieCheng(n);
	}
	
	public static int jieCheng(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*jieCheng(n-1);
		}
	}
}
