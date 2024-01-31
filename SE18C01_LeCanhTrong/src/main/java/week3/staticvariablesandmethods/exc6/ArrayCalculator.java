/*
Bạn hãy tạo ra lớp ArrayCalculator trong file ArrayCalculator.java với thông tin giống như sau:



Giải thích:

ArrayCalculator là lớp không có thuộc tính nào.
sumOfArray(arr: int[]) là phương thức static có đầu vào là mảng các số nguyên và trả về tổng của mảng này.
sumOfArray(arr: double[]) là phương thức static có đầu vào là mảng các số thực và trả về tổng của mảng này.
Chương trình để test lớp ArrayCalculator:

class Entry {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 4, 2};
		double[] arr2 = new double[] {1.3, 4.2, 6.7};
		System.out.println(ArrayCalculator.sumOfArray(arr1));
		System.out.println(ArrayCalculator.sumOfArray(arr2));
	}
}
Kết quả khi chạy chương trình:

9
12.2
 */
package week3.staticvariablesandmethods.exc6;

public class ArrayCalculator {
	public static int sumOfArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static double sumOfArray(double arr[]) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
