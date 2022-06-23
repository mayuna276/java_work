package java_basic.Question9;

import java.util.Scanner;

/**
 * @author manaf
 *
 */
public class Question9 {

	public static void main(String[] args) {

		// スキャナ定義
		Scanner scanner = new Scanner(System.in);
		System.out.println("5つの整数を入力してください");

		try {

			// 配列作成
			int[] array = new int[5];
			for (int i = 0; i < array.length; i++) { // 5つの整数入力
				String word = scanner.nextLine(); // 文字列入力
				int num = Integer.parseInt(word); //文字変換
				array[i] = num; //配列に代入
			}

			int work = 0; //退避用のworkの定義

			for (int j = 0; j < array.length - 1; j++) { //繰り返し処理（先頭の値）
				for (int k = j + 1; k < array.length; k++) { //繰り返し処理（隣接する値）
					if (array[j] > array[k]) { //jがkより値が大きい場合
						work = array[j]; // jをworkに退避
						array[j] = array[k]; // kをjに移動
						array[k] = work; //jをkに移動
					}
				}
			}
			// ソート結果の出力
			System.out.print("入力された値は");
			for (int value : array) { //配列の値を1つずつ出力
				System.out.print(value + " ");
			}
			System.out.println("です");

			// 最大値を出力
			System.out.println("最大値は" + array[4] + "です");
			// 最小値を出力
			System.out.println("最小値は" + array[0] + "です");

		} catch (NumberFormatException e) {// 整数以外が入力された場合
			System.out.println("整数以外の値が出力されました");
		} finally {
			scanner.close();
		}
	}
}
