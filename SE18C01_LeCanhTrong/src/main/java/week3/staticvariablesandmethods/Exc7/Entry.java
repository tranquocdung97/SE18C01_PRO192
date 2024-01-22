/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3.staticvariablesandmethods.Exc7;

/**
 *
 * @author lct2k3
 */

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

