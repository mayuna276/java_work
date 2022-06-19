package java_basic.Question3;

public class Main {

	public static void main(String[] args) {

		System.out.println("整数を入力してください");

		try {
			//　1つ目の文字列を入力
			String word = new java.util.Scanner(System.in).nextLine();

			//　文字列を数字に変換
			int num = Integer.parseInt(word);

			//　正方形作成（n:縦列　入力した数字分作成されるまで繰り返す）
			for (int n = 0; n < num; n++) {

				//	正方形作成（m:横列　入力した数字分作成されるまで繰り返す）
				for (int m = 0; m < num; m++) {

					//	対角線判定
					if (n == m) {

						// 改行しない場合はSystem.out.print()
						System.out.print("＊");

					} else {
						System.out.print("・");
					}
				}
				// 改行追加
				System.out.println("");
			}

			//	例外処理
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		}
	}

}
