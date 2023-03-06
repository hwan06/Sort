# 자료구조 (정렬 종류)
1. 삽입 정렬(insertion sort)
# 자료구조에서 정렬 기법의 목적
자료 관리 효율 증가
# 삽입정렬 방법 및 예시
![img](https://user-images.githubusercontent.com/114748934/223014207-f9b61046-fc5e-4097-b474-b56405815a89.gif)
# 삽입정렬 자바로 구현하는 알고리즘
int i,j,temp;
		for(i=1; i<size; i++) {
			temp = arr[i];
			for(j=i; j>0 && arr[j-1]>temp;j--) {
				arr[j] = arr[j-1];
						arr[j]=temp;
			}
		}
