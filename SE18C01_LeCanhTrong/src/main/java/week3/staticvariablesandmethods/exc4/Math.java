/*
Bạn hãy tạo ra lớp Math với thông tin giống như sau:



Trong sơ đồ lớp thì các phương thức và thuộc tính được gạch dưới chính là các phương thức static và thuộc tính static.

Giải thích lớp Math:

PI là biến static có giá trị mặc định là 3.14
abs(x: int) là hàm trả về giá trị tuyệt đối của số x.
add(x: int, y: int) là hàm trả về tổng 2 số x và y.
subtract(x: int, y: int) là hàm trả về hiệu 2 số x và y.
min(x: int, y: int) là hàm trả về số nhỏ nhất trong 2 số.
max(x: int, y: int) là hàm trả về số lớn nhất trong 2 số.
pow(x: int, y: int) là hàm trả về xy.
Chương trình để test lớp Math:

class Entry {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-2));
		System.out.println(Math.add(2, 3));
		System.out.println(Math.subtract(2, 3));
		System.out.println(Math.min(2, 3));
		System.out.println(Math.max(2, 3));
		System.out.println(Math.pow(2, 3));
	}
}
Kết quả khi chạy chương trình:

3.14
2
5
-1
2
3
8
 */
package week3.staticvariablesandmethods.exc4;


class Math {
	public static double PI = 3.14;

	public static int abs(int x) {
		return x < 0 ? -x : x;
	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int subtract(int x, int y) {
		return x - y;
	}

	public static int min(int x, int y) {
		return x < y ? x : y;
	}

	public static int max(int x, int y) {
		return x > y ? x : y;
	}

	public static int pow(int x, int y) {
		int power = 1;
		for (int i = 0; i < y; i++) {
			power *= x;
		}
		return power;
	}
}
