package java_basic.Question6;

public class Main {

	public static void main(String[] args) {
		System.out.println("本日の曜日番号を入力してください");

		try {

			//	曜日番号を入力
			String day = new java.util.Scanner(System.in).nextLine();

			int daynum = Integer.parseInt(day);

			//	曜日番号の分岐
			switch (daynum) {

			case 0:
				System.out.println("本日は日曜日です");

				break;

			case 1:
				System.out.println("本日は月曜日です");

				break;

			case 2:
				System.out.println("本日は火曜日です");

				break;

			case 3:
				System.out.println("本日は水曜日です");

				break;

			case 4:
				System.out.println("本日は木曜日です");

				break;

			case 5:
				System.out.println("本日は金曜日です");

				break;

			case 6:
				System.out.println("本日は土曜日です");

				break;

			//	例外処理（0～6以外の整数の入力）
			default:

				System.out.println("0～6の範囲で入力してください");
			}

			//	例外処理（整数以外の文字の入力）
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		}
	}

}
