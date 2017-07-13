/* 演習13-01
 * 図形クラス群をテストするプログラムの作成。Shape型の配列の個々の要素が参照するインスタンスを選択して読み込むように
 * 作成日：7月13日
 * 作成者：成田修之
 */

package e_13_01;

public abstract class Shape {

	//抽象メソッド。objectクラスのメソッドを抽象メソッドとして再定義
	public abstract String toString();

	//図形を描画するためのメソッド
	public abstract void draw();

	//図形情報と図形を描画するメソッド
	public void print() {
		//
		System.out.println(toString());
		//
		draw();
	}

}
