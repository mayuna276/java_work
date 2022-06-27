package java_basic.Question13;
import java.util.Scanner;

/**メインメソッド
 * @author manaf
 *
 */
public class Qusetion13 {

	public static final int INPUT_NAME_1 = 1; //足し算⇒引き算の順番で出力する場合
	public static final int INPUT_NAME_2 = 2; //引き算⇒足し算の順番で出力する場合

	public static void main(String[] args) {
		// スキャナ定義
		Scanner scanner = new Scanner(System.in);

		System.out.println("1：足し算結果⇒引き算結果の順で出力する");
		System.out.println("2：引き算結果⇒足し算結果の順で出力する");
		System.out.println("番号を選択してください（1 , 2）");

		try {
			//番号選択
			String InputNum = scanner.nextLine();
			int input = Integer.parseInt(InputNum);

			if (input < INPUT_NAME_1 || INPUT_NAME_2 < input) {// 1～2以外の整数が入力された場合
				System.out.println("1～2の範囲で入力してください");
				return;
			}
			// 2つの整数を入力
			System.out.println("整数を入力してください");
			System.out.print("1個目：");
			String CalcuNum1 = scanner.nextLine();
			int num1 = Integer.parseInt(CalcuNum1);

			System.out.print("2個目：");
			String CalcuNum2 = scanner.nextLine();
			int num2 = Integer.parseInt(CalcuNum2);

			if (input == INPUT_NAME_1) {// 番号選択で1を入力した場合
				CalculateSuper calculate1 = new CalculateSuper(num1, num2);//CalculateSuperを呼び出し
				calculate1.flow();//flowメソッドを呼び出し
			} else {
				CalculateChild calculate2 = new CalculateChild(num1, num2);//CalculateChildを呼び出し
				calculate2.flow();//flowメソッドを呼び出し
			}
		} catch (NumberFormatException e) {// 整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");
		} finally {
			scanner.close();
		}

	}

}
