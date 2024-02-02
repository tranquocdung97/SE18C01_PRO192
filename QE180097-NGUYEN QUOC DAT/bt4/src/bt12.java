public class bt12 {
	public static int maxOfArrayy(int arr[]) {
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	public static double maxOfArrayy(double arr[]) {
		double maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	public static int minOfArrayy(int arr[]) {
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	public static double minOfArrayy(double arr[]) {
		double minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}
}
class Entry {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 3, 4, 2 };
		double[] arr2 = new double[] { 1.3, 4.2, 6.7 };
		
		System.out.println(bt12.minOfArrayy(arr1));
		System.out.println(bt12.minOfArrayy(arr2));
		System.out.println(bt12.maxOfArrayy(arr1));
		System.out.println(bt12.maxOfArrayy(arr2));
	}
}