package day10;

public class Sungjunk {

	public static void main(String[] args) {
		String[] names = {"tom", "ann","jhon"};
		int[] kor = {50,30,90};
		int[] math = {33,44,55};
		int i;
		System.out.print("name: ");
		for(i = 0; i < names.length; i++) {
		System.out.print(names[i] + " ");
		}
		System.out.println();
		System.out.print("kor: ");
		for(i = 0; i < kor.length; i++) {
		System.out.printf("%4d",kor[i]);
		}
		System.out.println();
		System.out.print("math: ");
		for(i = 0; i < math.length; i++) {
		System.out.printf("%3d ",math[i]);
		}
		System.out.println();
		System.out.print("total: ");;
		int total = 0;
		for(i = 0; i < 3; i++) {
			total = math[i] + kor[i];
			System.out.print(total + " ");
		}

	}

}
