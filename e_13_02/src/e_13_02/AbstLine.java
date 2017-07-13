/* 演習13-02
 * 図形クラス群に対して直角二等辺三角形を表すクラス群を追加する
 * 作成日：7月13日
 * 作成者：成田修之
 */

package e_13_02;

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
