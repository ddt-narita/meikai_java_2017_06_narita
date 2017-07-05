/* 演習10-02
 * クラスIdを識別番号の間隔をメソッドによって変更できるように変更
 * 作成日：7月5日
 * 作成者：成田修之
 */

package e_10_02;

public class ExId {
	//何番までの識別番号を与えたかを表すクラス変数
	static int counter = 0;

	//識別番号の間隔を表すクラス変数
	static int nInterval = 1;

	//識別番号を表すフィールド
	private int id;

	//コンストラクタ
	public ExId() {
		//与えた識別番号に識別番号の間隔を足して新たな識別番号となるようにする
		counter += nInterval;
		//その識別番号でフィールドidを初期化する
		id = counter;
	}

	//識別番号を返却するインスタンスメソッド
	public int getId() {
		return id;
	}

	//最後に与えた識別番号を返却するクラスメソッド
	public static int getMaxId() {
		return counter;
	}

	//識別番号の間隔をセットするメソッド
	static void setInterval(int n) {
		nInterval = n;
	}
}
