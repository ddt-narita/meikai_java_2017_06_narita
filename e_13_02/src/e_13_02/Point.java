/* 演習13-02
 * 図形クラス群に対して直角二等辺三角形を表すクラス群を追加する
 * 作成日：7月13日
 * 作成者：成田修之
 */

package e_13_02;

public class Point extends Shape{

	//コンストラクタ。フィールドがないので何も行わない
	public Point() {

	}

	//文字列表現を返却するメソッド
	public String toString() {
		//図形の情報を文字列として返却する
		return "Point";
	}

	//描画するメソッド
	public void draw() {
		//ポイント＋を表示
		System.out.println('+');
	}



}
