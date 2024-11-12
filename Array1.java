package day10;

public class Array1 {

	public static void main(String[] args) {
		double[] arrd = new double[5];
		arrd[0] = 3.14;
		arrd[1] = 1.23;
		String[] grade = {"kor", "math", "java"};
		
		int i[] = {1,2,3,4,5};
		i[2] = 5;
		for(int j = 0; j <i.length; j++) {
			System.out.println(i[j]);
		}
		for(int j = i.length-1; j >= 0; j--) {
			System.out.println(i[j]);
		}
	}

}
