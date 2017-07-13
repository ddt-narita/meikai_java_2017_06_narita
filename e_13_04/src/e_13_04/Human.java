package e_13_04;

/**
 * クラスHumanはその人の情報を表すクラスです。
 * 名前、身長、体重、生年月日を持っています。
 * @author 成田修之
 * @see object
 */
public class Human {
	private String name;	//名前のインスタンス変数
	private int height;	//身長のインスタンス変数
	private int weight;	//体重のインスタンス変数
	private Day birthday;

	/**
	 * Humanクラスのコンストラクタです。
	 * 引数で受け取った情報でインスタンスを生成します
	 * @param name 名前
	 * @param height 身長
	 * @param weight 体重
	 * @param birthday 生年月日
	 */
	Human(String name, int height, int weight, Day birthday) {
		this.name = name;		//引数nameで名前のフィールドを初期化
		this.height = height;	//引数heightで身長のフィールドを初期化
		this.weight = weight;	//引数weightで体重のフィールドを初期化
		//引数で誕生日のフィールドを初期化
		this.birthday = new Day(birthday);
	}

	/**
	 * 名前のゲッターです。
	 * @return 名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 身長のゲッターです
	 * @return 身長
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * 体重のゲッターです
	 * @return 体重
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * 標準体重を求めるメソッドです
	 * @return 標準体重
	 */
	public double getStdHeight() {
		//身長に標準体重を求める計算をして返却
		return (this.height - 100) * 0.9;

	}

	/**
	 * インスタンスの全情報を表示するメソッドです
	 */
	public void displayAll() {
		//名前を表示する
		System.out.println("名前：" + name);
		//身長を表示する
		System.out.println("身長：" + height);
		//体重を表示する
		System.out.println("体重：" + weight);
	}

	/**
	 * 文字列表現を返却するメソッドです。
	 */
	public String toString() {
		return String.format("名前：%9s\n身長：%4d\n体重：%4d\n誕生日："+ birthday + "\n", name, height, weight);
	}
}
