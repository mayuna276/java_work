package java_basic.Question14;

/**
 * java基礎 Question14 Calculateインターフェース
 * @author Your name
 */
public interface Calculate {
	/**
	 * 掛け算処理
	 * @param num1 整数1
	 * @param num2 整数2
	 * @return 掛け算結果
	 */
	int multiplication(int num1, int num2);

	/**
	 * 割り算処理
	 * @param num1 整数1
	 * @param num2 整数2
	 * @return 割り算結果
	 */
	int division(int num1, int num2);
}