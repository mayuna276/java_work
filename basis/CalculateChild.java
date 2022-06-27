package java_basic.Question13;


/**java基礎 Question13 CalculateChildクラス
 * @author manaf
 *
 */
public class CalculateChild extends CalculateSuper {

	public CalculateChild(int num1, int num2) {
		/**
		 * コンストラクタ(親クラスのコンストラクタを呼び出し)
		 */
		super(num1, num2);
	}

	/**
	 * 足し算結果⇒引き算結果の順で出力処理を呼び出し
	 */
	public void flow() {
		subtraction();
		sum();
	}
}
