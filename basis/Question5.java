package java_basic.Question5;

public class Main {

	public static void main(String[] args) {

		System.out.println("整数100を入力された値で割り算します");

		System.out.println("割り算する整数を入力してください");

		try {
			//	整数を入力
			String word = new java.util.Scanner(System.in).nextLine();

			int num = Integer.parseInt(word);

			int calcu = 100 / num;

			// 割り算結果を出力
			System.out.println("割り算結果は" + calcu + "です");

			//	例外処理(整数以外が入力されたとき)
		} catch (NumberFormatException e) {

			System.out.println("整数以外の値が入力されました");

			//	例外処理(0が入力されたとき)
		} catch (ArithmeticException e) {

			System.out.println("0では割り算できません");

			//	例外発生の有無関わらず処理実行
		} finally {

			System.out.println("終了");
		}

	}

}
