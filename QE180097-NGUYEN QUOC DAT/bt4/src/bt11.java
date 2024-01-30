public class bt11 {
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
class Entry {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 4, 2};
		double[] arr2 = new double[] {1.3, 4.2, 6.7};
		System.out.println(bt11.sumOfArray(arr1));
		System.out.println(bt11.sumOfArray(arr2));
	}
}
