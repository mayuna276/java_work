package java_basic.Question8;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author manaf
 *
 */

public class Question8 {

	public static void main(String[] args) {

		// scanner定義
		Scanner scanner = new Scanner(System.in);

		System.out.println("整数の数を入力してください");

		try {

			//文字列入力
			String word = scanner.nextLine();

			//文字変換
			int num = Integer.parseInt(word);

			if (num <= 0) { //0以下が入力された場合

				System.out.println("整数は0より大きい値を入力してください");

				return;
			}

			//ArrayList作成
			ArrayList<Integer> score = new ArrayList<Integer>();

			System.out.println("整数の各値を入力してください");

		    // 合計値の定義
		    int sum = 0;			

			for (int i = 0; i < num; i++) { // 配列の値を出力

				String word1 = scanner.nextLine(); // 文字入力

				int num1 = Integer.parseInt(word1); // 文字変換

				score.add(num1); //ArrayListへの代入

				sum += score.get(i); //合計値の計算
			}

			// 値の出力
			System.out.print("入力された値は");

			for (int value : score) { //配列の値を1つずつ出力
				System.out.print(value + " ");
			}

			System.out.println("です");

			// 平均値の計算
			int ave = sum / score.size();

			System.out.println("入力された整数の平均は" + ave + "です");

		} catch (NumberFormatException e) {

			System.out.println("整数以外の値が入力されました");

		} finally {

			scanner.close();
		}

	}

}
