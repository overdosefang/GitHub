package cn.itcase_02;
/*
 * 1,1,2,3,5,8,...
 */
public class DiGuiDemo {
	
	public static void main(String[] args) {
		int[] arr=new int[20];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<20;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println(arr[19]);
		System.out.println("------------------");
		
		System.out.println(diGui(20));
	}
	
	public static int diGui(int n) {
		if(n==1 || n==2) {
			return 1;
		}else {
			return diGui(n-1)+diGui(n-2);
		}
	}
}
