/* 演習13-02
 * 図形クラス群に対して直角二等辺三角形を表すクラス群を追加する
 * 作成日：7月13日
 * 作成者：成田修之
 */

package e_13_02;

abstract public class IsoscelesTriangle extends Shape{

	//2等辺三角形の一辺の長さをあわせるフィールド
	private int length;

	//一辺の長さを返却するゲッター
	public int getLength() {
		return length;
	}

	//コンストラクタ
	public IsoscelesTriangle(int length) {
		//引数で一辺の長さを初期化
		this.length = length;
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//図形の情報を文字列で返却する
		return "IsoscelesTriangle(length" + length + ")";
	}

}
