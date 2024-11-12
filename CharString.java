package day10;

public class CharString {

	public static void main(String[] args) {
		int count = 0;
		String str = "programming is fun! Right";
		char[] charArr = str.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i] + " ");
			if(charArr[i] == 'R' || charArr[i] == 'r') {
				count++;
			}
		}
		System.out.println();
		System.out.println("r이 나온 횟수: " + count);

	}

}
