package e_12_01;

public class Car {
	private String name;		//名前を表すインスタンス変数
	private int width;			//車幅を表すインスタンス変数
	private int height;		//車高を表すインスタンス変数
	private int length;		//車長を表すインスタンス変数
	private double x;			//現在のx座標を表すインスタンス変数
	private double y;			//現在のy座標を表すインスタンス変数
	private double fuel;		//残燃料を表すインスタンス変数
	private Day purchaseDay;	//購入日を表すインスタンス変数

	Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		this.name = name;							//車の名前を引数で初期化
		this.width = width;							//車幅を引数で初期化
		this.height = height;						//車高を引数で初期化
		this.length = length;						//車長を引数で初期化
		this.fuel = fuel;							//現在の残燃料を引数で初期化
		this.purchaseDay = new Day(purchaseDay);	//購入日を引数の購入日で初期化
		x = y = 0.0;								//位置を(0.0 , 0.0)で初期化
	}

	//現在位置のx座標を返却
	double getX() {
		return x;
	}
	//現在位置のy座標を返却
	double getY() {
		return y;
	}
	//現在の残燃料を返却
	double getFuel() {
		return fuel;
	}

	//購入日のゲッター
	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	}

	//オブジェクトの情報を表示
	void putSpec() {
		//名前の表示
		System.out.println("名前：" + name);
		//車幅を表示
		System.out.println("車幅：" + width + "mm");
		//車高を表示
		System.out.println("車高：" + height + "mm");
		//車長を表示
		System.out.println("車長：" + length + "mm");
	}

	//オブジェクトを引数分x座標方向、y座標方向に移動させるメソッド
	boolean move(double dx, double dy) {
		//引数の座標の移動距離の平方根で直線距離での実際の移動距離と消費燃料を求める
		double comsumption = Math.sqrt(dx * dx + dy * dy);
		//論理値を返す際に使う変数。消費量が残燃料を上まったときにはfalseを返すように０で初期化
		int nReturn = 0;

		//消費量が残燃料以下の時
		if(comsumption <= fuel) {
			//残燃料から消費燃料を引く
			fuel -= comsumption;
			//x座標を引数分移動
			x += dx;
			//y座標を引数分移動
			y += dy;
			//trueを返すように1を代入
			nReturn = 1;
		}
		//返却に使う変数が1かどうかでtrue, falseを返却する
		return nReturn == 1;
	}
}