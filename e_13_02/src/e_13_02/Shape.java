/* 演習13-02
 * 図形クラス群に対して直角二等辺三角形を表すクラス群を追加する
 * 作成日：7月13日
 * 作成者：成田修之
 */
package e_13_02;

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
