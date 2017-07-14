/* 演習14-01
 * テキストの図形クラス群を利用するプログラムを作成
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_14_01;

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
