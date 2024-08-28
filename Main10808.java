package print;

import java.util.ArrayList;
import java.util.Scanner;
//이 코드는 런타임이 오래 걸리는 
public class Main10808 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n = input.nextInt();
		
		ArrayList <Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(input.nextInt());//배열에 담은 다음 
			//베열에 있는 값을 비교해서 가져온다 
		}//배열에 숫자를 담음 
		
		int max = list.get(0); //최소값과 최대값 변수 초기화 ->ArrayList의 첫 번째 요소를 기준으로 최소값(min)과 최대값(max)을 비교하고 갱신하기 위해서
		int min = list.get(0);
		
		for (int i=1; i<list.size();i++) {
			if(list.get(i)<min) {
				min=list.get(i);
			}
			else if(list.get(i)>max) {
				max = list.get(i);
			}
			
		}
		
		System.out.print(min +" "+ max);
		
		
		
		
		
	}

}
