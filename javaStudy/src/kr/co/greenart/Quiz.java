package kr.co.greenart;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3}, // arr[0][0], arr[0][1], arr[0][2]
				{4, 5, 6}, // arr[1][0], 
				{7, 8, 9}  // arr[2][0]
			};
		
//		// 깊은 복사
//		int[] arr = {0, 1, 2, 3, 4};
//		int[] num = new int[arr.length]; // new연산자를 통해서 새로운 배열 객체를 생성
//		System.arraycopy(arr, 0, num, 0, 0);
//		
//		// 깊은 복사
//		int[] arr2 = {80, 96, 88, 90};
//		int[] num2 = Arrays.copyOf(arr2, arr2.length);
//		
//		// 얕은 복사
//		int[] arr3 = {0, 1, 2, 3, 4};
//		int[] num3 = arr3;
//		
//		System.out.println("깊은 복사 결과 :" + (arr==num));
//		System.out.println("깊은 복사 결과 :" + (arr2==num2));
//		System.out.println("얕은 복사 결과 :" + (arr3==num3));
//		System.out.println("주소 : "+arr3);
//		System.out.println("주소 : "+num3);
		
		
	
//		
//		System.out.println("arr :"+Arrays.toString(arr));
//		System.out.println("num :"+Arrays.toString(num));
//		
//		// for문 돌려서 값을 넣음
//		for(int i=0; i<arr.length; i++) {
//			num[i] = arr[i];
//		}
//		arr[2] = 1000;
//		
//		System.out.println("arr :"+Arrays.toString(arr));
//		System.out.println("num :"+Arrays.toString(num));
//		
		
		
		// 얕은 복사
//		int[] arr = {0, 1, 2, 3, 4};
//		int[] num = arr;
//		
//		System.out.println("복사하기 전 arr :"+Arrays.toString(arr));
//		System.out.println("복사하기 전 num :"+Arrays.toString(num));
//		num[2] = 100;
//		System.out.println("복사한 후 arr :"+Arrays.toString(arr));
//		System.out.println("복사한 후 num :"+Arrays.toString(num));
		
//		int[] arr2 = {80, 96, 88, 90};
//////								  복사할배열   복사할요소개수
//		int[] num2 = Arrays.copyOf(arr2, arr2.length);
//		System.out.println(arr2);
//		System.out.println(num2);
		
		
//		Arrays.sort(score);  // 오름차순 정렬
//		
//		System.out.println("가장 작은 숫자는 : " + score[0]);
//		System.out.println("가장 큰 숫자는 : " + score[score.length-1]); // score[3]
		
//		System.out.println(Arrays.toString(score));
		
		
		
		
//		System.out.println(Arrays.equals(score, num));
		
//		System.out.println(Arrays.toString(num));
		
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		
//		int sum = 0;
//		
//		for(int i=0; i<score.length; i++) {
//			sum += score[i];
////			sum = sum + score[i];
//			
//			if(i==0) {
//				System.out.printf("국어점수는 %d점 입니다. \n", score[i]);
//			} else if(i==1) {
//				System.out.printf("영어점수는 %d점 입니다. \n", score[i]);				
//			} else if(i==2) {
//				System.out.printf("수학점수는 %d점 입니다. \n", score[i]);
//			} else if(i==3) {
//				System.out.printf("과학점수는 %d점 입니다. \n", score[i]);
//			}
//		}
//		
////		int average = sum / score.length;
//		int average = sum / 4;
//		System.out.printf("평균 점수는 %d점 입니다.", average);
		
		
		
		

	}

}
