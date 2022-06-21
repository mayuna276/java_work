package java_basic.Question10;

import java.util.Scanner;

/**
 * @author manaf
 *
 */
public class Question10 {

	public static void main(String[] args) {

		//スキャナ定義
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数を入力してください");

		try {
			// 文字列入力
			String word = scanner.nextLine();
			//文字変換
			int num = Integer.parseInt(word);

			// printCalculateDoubleの呼び出し
			printCalculateDouble(num);

			// printCalculateSquareの呼び出し
			printCalculateSquare(num);

		} catch (NumberFormatException e) { //整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");
		} finally {
			scanner.close();
		}
	}

	// printCalculateDoubleメソッド
	public static void printCalculateDouble(int num) {
		// 2倍の計算処理
		int calculateDouble = num * 2;
		System.out.println("入力された" + num + "を2倍した値は" + calculateDouble + "です");
	}

	// printCalculateSquareメソッド
	public static void printCalculateSquare(int num) {
		// 2乗の計算処理
		int calculateSquare = num * num;
		System.out.println("入力された" + num + "を2乗した値は" + calculateSquare + "です");
	}

}
