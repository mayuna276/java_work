package java_basic.Question4;

public class Question4 {

	public static void main(String[] args) {

		System.out.println("2つの同じ文字列を入力してください");

		//	変数の初期化
		String word1 = null;

		String word2 = null;

		//	無限ループ
		while (true) {

			//	1つ目の文字列を入力
			word1 = new java.util.Scanner(System.in).nextLine();

			//	2つ目の文字列を入力
			word2 = new java.util.Scanner(System.in).nextLine();

			//　空白が入力されている場合
			if (word1.isBlank() || word2.isBlank()) {
				System.out.println("空白が入力されています");

				//　違う文字列の場合
			} else if (!word1.equals(word2)) {

				System.out.println("違う文字列です");

				// 文字列が同じ場合
			} else {
				// ループを抜ける
				break;
			}

		}
		//　同じ文字列の場合
		System.out.println("同じ文字列です");
	}

}