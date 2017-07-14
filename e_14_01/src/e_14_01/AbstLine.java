/* 演習14-01
 * テキストの図形クラス群を利用するプログラムを作成
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_14_01;

public abstract class AbstLine extends Shape{

	//直線の長さを表すフィールド
	private int length;

	//コンストラクタ
	public AbstLine(int length) {
		//引数をセッターに与えて初期化
		setLength(length);
	}

	//長さのゲッター
	public int getLength() {
		//フィールドの長さを返却する
		return length;
	}

	//長さのセッター
	public void setLength(int length) {
		//引数をフィールドの長さに代入する
		this.length = length;
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//図形情報を文字列として返却する
		return "AbstLine(length:" + length + ")";
	}

}
