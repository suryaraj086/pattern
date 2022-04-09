package pattern;

import java.util.Scanner;

public class Pattern {

	public void rightTriangle() {
		int rows = 5;
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public void leftTriangle() {
		int row = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 2 * (row - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void pyramidPattern() {
		int i, j, row = 6;
		for (i = 0; i < row; i++) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void hallowPyramid() {
		int i, j, row = 6;
		for (i = 0; i < row; i++) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				if (j == 0 || i == j || i == row - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public void zPattern() {
		int row = 5;
		for (int i = 0; i <= row; i++) {
			for (int j = row; j >= 0; j--) {
				if (i == j && i != 0) {
					System.out.print("*");
				}
				if (i == 0 || i == row) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void spiralPattern() {
		int inp = 4;
		int row = 2 * inp - 1;
		int count = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i == 0 || j == 0 || i == row - 1 || j == row - 1) {
					System.out.print(inp);
				} else {
					System.out.print(inp - count);
				}
			}
			System.out.println();
		}

	}

	public void rightPascal() {
		int i = 0, j = 0, rows = 5;
		for (i = 0; i <= rows - 1; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (i = rows - 1; i >= 0; i--) {
			for (j = 0; j <= i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public void diamondPattern() {
		int i, j, row = 6;
		for (i = 0; i < row; i++) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = row; i >= 0; i--) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void hallowDiamond() {
		int i, j, row = 6;
		for (i = 0; i < row; i++) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				if (j == 0 || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (i = row; i >= 0; i--) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				if (j == 0 || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public void sandGlassPattern() {
		int i, j, row = 6;
		for (i = row; i >= 0; i--) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = 0; i <= row; i++) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void characterPattern(char[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			System.out.print(arr[i] + " " + arr[j]);
			System.out.println();
			i++;
			j--;
		}
		System.out.print(arr[i]);
		System.out.println();
		i--;
		j++;
		while (i >= 0) {
			System.out.print(arr[i] + " " + arr[j]);
			System.out.println();
			i--;
			j++;
		}
	}

	public void numberPattern() {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public void numberPyramid() {
		int i, j, row = 5, count = 1;
		for (i = 0; i < row; i++) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					System.out.print(1 + " ");
				} else {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern obj = new Pattern();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice = scan.nextInt();
		switch (choice) {
		case 1: {
			obj.pyramidPattern();
			break;
		}
		case 2: {
			obj.rightTriangle();
			break;
		}
		case 3: {
			obj.leftTriangle();
			break;
		}
		case 4: {
			obj.zPattern();
			break;
		}
		case 5: {
			obj.spiralPattern();
			break;
		}
		case 6: {
			obj.hallowPyramid();
			break;
		}
		case 7: {
			obj.rightPascal();
			break;
		}
		case 8: {
			obj.diamondPattern();
			break;
		}
		case 9: {
			obj.sandGlassPattern();
			break;
		}
		case 10: {
			char[] arr = { 'P', 'R', 'O', 'G', 'R', 'A', 'M' };
			obj.characterPattern(arr);
			break;
		}
		case 11: {
			obj.numberPattern();
			break;
		}
		case 12: {
			obj.numberPyramid();
			break;
		}
		case 13: {
			obj.hallowDiamond();
			break;
		}
		}
	}

}
