/* 演習09-04
 * 人間クラスに誕生日のフィールドとtoStringメソッドを追加
 * 作成日：7月5日
 * 作成者：成田修之
 */

package e_09_04;

public class Human {
	private String name;	//名前のインスタンス変数
	private int height;	//身長のインスタンス変数
	private int weight;	//体重のインスタンス変数
	private Day birthday;

	//Humanクラスのコンストラクタ
	Human(String name, int height, int weight, Day birthday) {
		this.name = name;		//引数nameで名前のフィールドを初期化
		this.height = height;	//引数heightで身長のフィールドを初期化
		this.weight = weight;	//引数weightで体重のフィールドを初期化
		//引数で誕生日のフィールドを初期化
		this.birthday = new Day(birthday);
	}

	//名前を返却するインスタンスメソッド
	public String getName() {
		return name;
	}

	//身長を返却するインスタンスメソッド
	public int getHeight() {
		return height;
	}

	//体重を返却するインスタンスメソッド
	public int getWeight() {
		return weight;
	}

	//標準体重を返却するインスタンスメソッド
	public double getStdHeight() {
		//身長に標準体重を求める計算をして返却
		return (this.height - 100) * 0.9;

	}

	//全情報を表示するインスタンスメソッド
	public void displayAll() {
		//名前を表示する
		System.out.println("名前：" + name);
		//身長を表示する
		System.out.println("身長：" + height);
		//体重を表示する
		System.out.println("体重：" + weight);
	}

	//文字列表現を返却するメソッド
	public String toString() {
		return String.format("名前：%9s\n身長：%4d\n体重：%4d\n誕生日："+ birthday + "\n", name, height, weight);
	}
}
