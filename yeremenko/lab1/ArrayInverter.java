package com.epam.at.yeremenko.lab1;

public class ArrayInverter {

	public static void invert(int[] arr) {
		for (int k =arr.length / 2; k >=0 ; k--) {
			int tmp = arr[k];
			arr[k] = arr[arr.length - k - 1];
			arr[arr.length - k - 1] = tmp;
		}
	}
}
