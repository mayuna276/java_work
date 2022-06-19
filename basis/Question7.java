package java_basic.Question7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author manaf
 *
 */

public class  Question7{

	public static void main(String[] args) {

		//	Scanner定義
		Scanner scanner = new Scanner(System.in);

		//	合計値の定義
		int sum = 0;

		System.out.println("整数の数を入力してください");

		try {

			//	文字列入力
			String word = scanner.nextLine();

			//	文字変換
			int num = Integer.parseInt(word);

			if (num <= 0) { //0以下が入力された場合

				System.out.println("整数の数は0より大きい値を入力してください");

				return;
			}

			//　値の数だけ配列作成
			int[] score = new int[num];

			//　整数の各値の入力
			System.out.println("整数の各値を入力してください");

			for (int i = 0; i < score.length; i++) { //　配列の値を出力

				String word1 = scanner.nextLine(); //値の入力

				int num1 = Integer.parseInt(word1); //文字変換

				score[i] = num1; //配列の代入

				sum += score[i]; //	合計値の計算
			}

			// 値の出力
			System.out.println("入力された値は" + Arrays.toString(score) + "です");

			//　平均値の計算
			int ave = sum / score.length;

			System.out.println("入力された整数の平均は" + ave + "です");

			//　整数以外の値の入力
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		}

		finally {
			scanner.close();
		}

	}

}
