import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 4, 1, 2, 5 }; // 배열방

		for (int i = 1; i < arr.length; i++) { // 배열방 길이-1 만큼 반복
			for (int j = i; j > 0; j--) { // 배열방 번호

				if (arr[j - 1] > arr[j]) { // 비교할 값의 크기가 뒤에있는 방의 값의 크기보다 작은지 검사
					int temp = arr[j - 1]; // temp에 비교할 값보다 큰 값을 넣기
					arr[j - 1] = arr[j]; // 큰 값이 있었던 자리에 작은 값 넣기
					arr[j] = temp; // 작은 값이 있었던 자리에 큰값(temp) 넣기
				}
			}
		}
		System.out.println(Arrays.toString(arr)); // 정렬 출력
	}
}
