package java_basic.Question2;

public class Question2 {

	public static void main(String[] args) {

		System.out.println("整数を入力してください");

		try {
			//　文字列を入力
			String word = new java.util.Scanner(System.in).nextLine();

			//　文字列を数字に変換
			int num = Integer.parseInt(word);

			//　偶数判定
			if (num % 2 == 0) {
				System.out.println("入力された" + num + "は偶数です");

			} else {
			//　奇数の場合
				System.out.println("入力された" + num + "は奇数です");
			}

			//	例外処理
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		}
	}
}
