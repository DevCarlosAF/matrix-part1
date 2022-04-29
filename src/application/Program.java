package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of matrix: ");
		int n = input.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print("[" + (i + 1) + "][" + (j + 1) + "]: ");
				mat[i][j] = input.nextInt();
			}
		}

		System.out.print("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		int sum = 0;
		System.out.println();
		System.out.print("Negative numbers: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					sum++;
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("Quantity negative numbers: " + sum);

		input.close();
	}

}
