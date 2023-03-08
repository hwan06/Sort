# 자료구조 (정렬 종류)
1. 삽입 정렬(Insertion sort)
2. 버블 정렬(Bubble sort)
3. 퀵 정렬(Quick sort)
## 자료구조에서 정렬 기법의 목적
자료 관리 효율 증가

# 1.삽입정렬 방법 및 예시
![img](https://user-images.githubusercontent.com/114748934/223014207-f9b61046-fc5e-4097-b474-b56405815a89.gif)
# 삽입정렬 자바 코드 구현
![image](https://user-images.githubusercontent.com/114748934/223294605-02a64e16-e60f-406a-8de3-0e1dc6ab9b6d.png)
## 코드 실행 화면
![image](https://user-images.githubusercontent.com/114748934/223293571-f8019976-d811-4153-9ecd-180377779071.png)

# 2.버블정렬 방법 및 예시
![image](https://velog.velcdn.com/images%2Fgillog%2Fpost%2F9f3ab7d6-54a3-468f-b892-84710575cfe7%2Fbubble-sort-001.gif)
# 버블정렬 자바 코드 구현
```
package dd;

import java.util.Arrays;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,temp;// 초기화
		int arr[] = {5,4,3,2,1}; // 배열방
		for(i = 0; i < arr.length-1; i++) { // 배열방길이-1 만큼 반복
			for(j = 0; j < arr.length-1; j++) // 배열방 번호
				if(arr[j] > arr[j+1]) { // 오른쪽 값이 왼쪽 값보다 큰지 검사
					temp = arr[j+1]; // temp에 오른쪽 값 저장
					arr[j+1] = arr[j]; // 오른쪽 값의 자리에 왼쪽값 저장
					arr[j] = temp; // 왼쪽 값의 자리에 temp값 저장
			
			System.out.println(Arrays.toString(arr)); // 버블정렬 한 단계씩 정렬
					
				}	
			}
		}
	}	
```
## 코드 실행 화면
![image](https://user-images.githubusercontent.com/114748934/223326790-6e9b9bad-a54f-4df3-8e75-7ce0adcfed84.png)

# 3.퀵 정렬 방법 및 예시
피벗(pivot)값을 제일 왼쪽 값으로 지정
![image](https://velog.velcdn.com/images%2Fkji990607%2Fpost%2F28948297-8ed3-406a-80fe-4784557d1285%2Fquick_sort.gif)
# 퀵 정렬 자바 코드 구현
![image](https://user-images.githubusercontent.com/114748934/223427507-d7417ff6-8b43-42ff-9c40-121695347869.png)

## 코드 실행 화면
![image](https://user-images.githubusercontent.com/114748934/223427582-b45cfd04-3be5-4fcd-9ea9-a4f1ab373ec3.png)
