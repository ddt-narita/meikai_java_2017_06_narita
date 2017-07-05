package e_08_01;

public class Human {
	private String name;	//名前のインスタンス変数
	private int height;	//身長のインスタンス変数
	private int weight;	//体重のインスタンス変数

	//Humanクラスのコンストラクタ
	Human(String name, int height, int weight) {
		this.name = name;		//引数nameで名前のインスタンス変数を初期化
		this.height = height;	//引数heightで身長のインスタンス変数を初期化
		this.weight = weight;	//引数weightで体重のインスタンス変数を初期化
	}

	//名前を返却するインスタンスメソッド
	String getName() {
		return name;
	}

	//身長を返却するインスタンスメソッド
	int getHeight() {
		return height;
	}

	//体重を返却するインスタンスメソッド
	int getWeight() {
		return weight;
	}

	//標準体重を返却するインスタンスメソッド
	double getStdHeight() {
		//身長に標準体重を求める計算をして返却
		return (this.height - 100) * 0.9;

	}

	//全情報を表示するインスタンスメソッド
	void displayAll() {
		//名前を表示する
		System.out.println("名前：" + name);
		//身長を表示する
		System.out.println("身長：" + height);
		//体重を表示する
		System.out.println("体重：" + weight);
	}

}
