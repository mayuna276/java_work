package java_basic.Question12;

import java.util.Scanner;

/**
 * @author manaf
 *
 */
public class Question12 {

	public static void main(String[] args) {

		// スキャナ定義
		Scanner scanner = new Scanner(System.in);

		//氏名番号選択
		System.out.println("1：氏名を入力する");
		System.out.println("2：氏名を入力しない");
		System.out.println("番号を選択してください（1 , 2）");

		try {
			//番号入力
			String nameNum = scanner.nextLine();
			int num = Integer.parseInt(nameNum);

			switch (num) {

				case 1: // 1が入力された場合
					System.out.println("氏名を入力してください");
					System.out.print("氏名：");
					String name = scanner.nextLine();
					// Personメソッド呼び出し
					Person n1 = new Person(name);
					System.out.println("私の名前は" + n1.getName() + "です");

					break;

				case 2: // 2が入力された場合
					// Personメソッド呼び出し
					Person n2 = new Person();
					System.out.println("私の名前は" + n2.getName() + "です");

					break;

			default: // 1、2以外の値が入力されたとき
				System.out.println("1～2の範囲で入力してください");

			}
		} catch (NumberFormatException e) { // 整数以外が入力されたとき
			System.out.println("整数以外の値が入力されました");
		} finally {
			scanner.close();
		}
	}

}
