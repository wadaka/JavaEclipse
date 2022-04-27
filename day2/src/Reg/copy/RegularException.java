package Reg.copy;

public class RegularException {
	public static void main(String[] args) {
		String s = "Java";
		if(s.matches("Java")) {
			System.out.println("Match!");
		}
		if(s.matches("J.va")) {
			System.out.println("Match!");
		}
		String sa = "Jaaaava";
		if(sa.matches("Ja*va")) {
			System.out.println("Match!");
		}
		if(sa.matches(".*")) {
			System.out.println("Match!");
		}
		if(sa.matches("Hel{3}o")) {
			System.out.println("Match!");
		}
		if(sa.matches("Hel{3,}o")) {
			System.out.println("Match!");
		}
		if(sa.matches("Hel{3,6}o")) {
			System.out.println("Match!");
		}
		String mo3 = "aks";
		String mo4 = "akit";
		/*if(mo3.matches("{a-z}{3}")) {
			System.out.println("Match!");
		}
		if(mo4.matches("{a-z}{3}")) {
			System.out.println("Match!");
		}*/
		s="abc,def:ghi";
		String Rw = s.replaceAll("[beh]","X");
		String[] words=s.split("[,:]");
		for(String w:words) {
			System.out.print(w+"->");
		}
		System.out.println(Rw); //aXc,dXf:gXi;
		Method(3,5,7,9);
		Method();
		int sums = sumOf(1,1,1);
		System.out.println(sums);
		int sum = sumOf(0,21,21,21,384,21,87);
		System.out.println(sum);
	}
	public static void Method(int...args) {
		for(int i:args) {
			System.out.println(i);
		}
	}
	public static int sumOf(int n,int...nums) {
		int sum=0;
		for(int i:nums) {
			sum+=i;
		}
		return sum;
	}
}
