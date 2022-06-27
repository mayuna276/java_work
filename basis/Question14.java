package java_basic.Question14;

import java.util.Scanner;

public class Question14 {
	public static final int DIVISION_NUMBER = 2; //掛け算結果を2で割る場合に利用

	public static void main(String[] args) {

		// スキャナ定義
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("整数を入力してください");
			// 2つの整数を入力
			System.out.print("1個目：");
			String word1 = scanner.nextLine();
			int num1 = Integer.parseInt(word1);

			System.out.print("2個目：");
			String word2 = scanner.nextLine();
			int num2 = Integer.parseInt(word2);

			// CalculateImplの実装
			CalculateImpl calculateimput = new CalculateImpl();
			// 掛け算処理の呼び出し
			int calculateMulti = calculateimput.multiplication(num1, num2);
			System.out.println(num1 + "と" + num2 + "の掛け算の結果の値は" + calculateMulti + "です");

			// 割り算処理の呼び出し
			int calculateDivi = calculateimput.division(calculateMulti, DIVISION_NUMBER);
			System.out.println(num1 + "と" + num2 + "の掛け算の結果を2で割った値は" + calculateDivi + "です");

		} catch (NumberFormatException e) {// 整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");
		} finally {
			scanner.close();
		}
	}

}
