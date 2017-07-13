package e_12_01;

public class CarMileage extends Car {

	//総走行距離を表すフィールド
	private double mileage;

	//コンストラクタ
	public CarMileage(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		//親クラスのコンストラクタで親クラスのメンバを初期化
		super(name, width, height, length, fuel, purchaseDay);
		//総走行距離を0.0で初期化
		mileage = 0.0;
	}

	//オブジェクトを引数分x座標方向、y座標方向に移動させるメソッド
	boolean move(double dx, double dy) {
		//移動できたかどうか返却に使う値
		int nReturn = 0;
		//現在の燃料を記憶させておく
		double nowFuel = super.getFuel();

		//引数の二つで親クラスのメソッドを読んで移動させる
		if(super.move(dx, dy)) {
			//移動距離に燃費は1なので移動前の燃料から移動後の燃料を引いたもので足し合わせる
			mileage += nowFuel - super.getFuel();
			//移動できたことを返すために1を代入
			nReturn = 1;
		}
		//移動できたか1が代入されているかどうかで返却する
		return nReturn == 1;
	}


	//総走行距離のゲッター
	public double GetMileage() {
		return mileage;
	}
}
