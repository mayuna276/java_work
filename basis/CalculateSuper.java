package java_basic.Question13;

/**
 * java基礎 Question13 CalculateSuperクラス
 * @author Your name
 */
class CalculateSuper {
	protected int num1; // 整数1
	protected int num2; // 整数2

	/**
	 * コンストラクタ
	 * @param num1 整数1
	 * @param num2 整数2
	 */
	protected CalculateSuper(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * 足し算結果⇒引き算結果の順で出力処理を呼び出し
	 */
	protected void flow() {
		sum();
		subtraction();
	}

	/**
	 * 足し算結果を出力
	 */
	protected void sum() {
		System.out.println(num1 + " と " + num2 + " の足し算結果の値は " + (num1 + num2) + " です");
	}

	/**
	 * 引き算結果を出力
	 */
	protected void subtraction() {
		System.out.println(num1 + " と " + num2 + " の引き算結果の値は " + (num1 - num2) + " です");
	}
}