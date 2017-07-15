package concurrent.base;

public class test {
	public static void main(String[] args){
		String str = "15/20+5/18"; // [15, 20+5, 400]
		String[] ans = str.split("\\/");
		
		int num1 = Integer.parseInt(ans[0]);
		
		
		int idx1 = ans[1].indexOf("+");
		int num2 = Integer.parseInt(ans[1].substring(0, idx1));
		int num3 = Integer.parseInt(ans[1].substring(idx1+1));
		int num4 = Integer.parseInt(ans[2]);
		int sum = num1 + num2 + num3;
		int max = 0;
		max = find(sum, num4);
		
		int[] res = {-1, -1};
		
		System.out.println(sum/max+"/"+num4/max);
	}
	public static int find(int m, int n){ // 24  9
		int temp = 0;
		while(m % n != 0){
			temp = n; // temp = 6, n = 3, m = 6
			n = m % n;
			m = temp;
		}
		return n;
	}
}
