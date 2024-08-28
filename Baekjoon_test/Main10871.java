package print;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main10871 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // 개수-> 몇개를 입력 받을 건지 결정한다. 공간을 만드는 역할
		int x = input.nextInt(); // 비교할 숫자

		// 리스트에 넣을 값을 저장한다.
		ArrayList<Integer> list = new ArrayList<>(); //숫자를 저장할 리스트를 초기화한다. 
		for (int i = 0; i < n; i++) { //n번 반복하며, 각 반복에서 입력된 값을 리스트에 추가한다. 
			list.add(input.nextInt()); //input.nextInt()를 통해서 각 반복 시에 사용자가 입력한 숫자를 받아오면서 리스트에 추가한다. 
		}

		for (int i = 0; i < n; i++) {
			if (list.get(i) < x) {
				System.out.print(list.get(i) + " ");
			}
		}

	}

}
