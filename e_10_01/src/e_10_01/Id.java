/* 演習10-01
 * 連番クラスIdに最後に与えた識別番号を返却するクラスメソッドを追加する
 * 作成日：7月5日
 * 作成者：成田修之
 */

package e_10_01;

public class Id {
	//何番までの識別番号を与えたかを表すクラス変数
	static int counter = 0;

	//識別番号を表すフィールド
	private int id;

	//コンストラクタ
	public Id() {
		//識別番号を何番まで与えたかを表す変数をインクリメントした値で初期化
		id = ++counter;
	}

	//識別番号を返却するインスタンスメソッド
	public int getId() {
		return id;
	}

	//最後に与えた識別番号を返却するクラスメソッド
	public static int getMaxId() {
		return counter;
	}

}
