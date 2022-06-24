package java_basic.Question12;

/**
 * java基礎 Question12 Personクラス
 * @author Your name
 */
class Person {
	private String name; // 氏名

	/**
	 * コンストラクタ
	 */
	public Person() {
		this.name = "ダミー";
	}

	/**
	 * コンストラクタ
	 * @param name 氏名
	 */
	public Person(String name) {
		this.name = name;
	}

	/**
	 * 氏名取得
	 * @return String 氏名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 氏名設定
	 * @param name 氏名
	 */
	public void setName(String name) {
		this.name = name;
	}
}