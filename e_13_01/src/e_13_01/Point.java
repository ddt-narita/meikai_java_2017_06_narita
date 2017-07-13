/* 演習13-01
 * 図形クラス群をテストするプログラムの作成。Shape型の配列の個々の要素が参照するインスタンスを選択して読み込むように
 * 作成日：7月13日
 * 作成者：成田修之
 */

package e_13_01;

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
