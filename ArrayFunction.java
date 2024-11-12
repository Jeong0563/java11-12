package day10;

public class ArrayFunction {

	public static void main(String[] args) {
		int[] points = {10,20,30,40,50};
		int read = average(points);
		System.out.println(read);
		for(int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}

	}
	public static int average(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		arr[0] = 100;
		return sum;
	}
}
