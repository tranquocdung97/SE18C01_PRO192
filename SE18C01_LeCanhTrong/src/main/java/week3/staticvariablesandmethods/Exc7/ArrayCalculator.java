/*
Bạn hãy tạo ra lớp ArrayCalculator trong file ArrayCalculator.java với thông tin giống như sau:



Giải thích:

ArrayCalculator là lớp không có thuộc tính.
maxOfArray(arr: int[]) và maxOfArray(arr: double[]) là hai phương thức static được nạp chồng, hai phương thức này trả về giá trị lớn nhất trong mảng arr.
minOfArray(arr: int[]) và minOfArray(arr: double[]) là hai phương thức static được nạp chồng, hai phương thức này trả về giá trị nhỏ nhất trong mảng arr.
Chương trình để test lớp ArrayCalculator:

class Entry {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 3, 4, 2 };
		double[] arr2 = new double[] { 1.3, 4.2, 6.7 };
		
		System.out.println(ArrayCalculator.minOfArray(arr1));
		System.out.println(ArrayCalculator.minOfArray(arr2));
		System.out.println(ArrayCalculator.maxOfArray(arr1));
		System.out.println(ArrayCalculator.maxOfArray(arr2));
	}
}
Kết quả khi chạy chương trình:

2
1.3
4
6.7
 */
package week3.staticvariablesandmethods.Exc7;

public class ArrayCalculator {
	public static int maxOfArray(int arr[]) {
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	public static double maxOfArray(double arr[]) {
		double maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	public static int minOfArray(int arr[]) {
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	public static double minOfArray(double arr[]) {
		double minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}
}
