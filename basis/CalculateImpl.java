package java_basic.Question14;

/**java基礎 Question14 CalculateImpインターフェース実装クラス
 * @author manaf
 *
 */
public class CalculateImpl implements Calculate {

	// 掛け算処理
	public int multiplication(int num1, int num2) {
		int calculateMulti = num1 * num2;
		return calculateMulti;
	}

	// 割り算処理
	public int division(int calculateMulti, int division_number) {
		int calculateDivi = calculateMulti / division_number;
		return calculateDivi;
	}
}
