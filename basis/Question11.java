package java_basic.Question11;

import java.util.Scanner;

/**
 * @author manaf
 *
 */
public class Question11 {

	public static void main(String[] args) {

		// スキャナ定義
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数を入力してください");

		try {
			// 文字列入力
			String word1 = scanner.nextLine();
			int num1 = Integer.parseInt(word1);

			String word2 = scanner.nextLine();
			int num2 = Integer.parseInt(word2);

			// multiplicationメソッドの呼び出し
			int calculateMulti = multiplication(num1, num2);

			// divisionメソッドの呼び出し
			int calculateDivi = division(calculateMulti);

			System.out.println(num1 + "と" + num2 + "の掛け算の結果の値は" + calculateMulti + "です");
			System.out.println(num1 + "と" + num2 + "の掛け算結果を2で割った値は" + calculateDivi + "です");

		} catch (NumberFormatException e) { // 整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");
		} finally {
			scanner.close();
		}
	}

	// multiplicationメソッド
	public static int multiplication(int num1, int num2) {
		// 掛け算処理
		int calculateMulti = num1 * num2;
		return calculateMulti;
	}

	// divisionメソッド
	public static int division(int calculateMulti) {
		//割り算処理
		int calculateDivi = calculateMulti / 2;
		return calculateDivi;
	}

}
