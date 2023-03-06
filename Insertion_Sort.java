import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,4,1,2,5}; //배열방
		
		for(int i = 1; i < arr.length; i++) { //배열방 길이-1 만큼 반복 
			for(int j = i; j > 0; j--) { // 배열방 번호
				
				if(arr[j-1] > arr[j]) { // 비교할 값의 크기가 뒤에있는 방의 값의 크기보다 작은지 검사
					int temp = arr[j-1]; // temp에다가 뒤에 값을 넣기
					arr[j-1] = arr[j]; // temp값에 넣은 값의 자리에 앞에 값 넣기
					arr[j] = temp; // 앞의 값의 자리에 temp값 넣기
				}
			}
		}
		System.out.println(Arrays.toString(arr)); // 정렬 출력
	}
}
