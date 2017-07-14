/* 演習14-01
 * テキストの図形クラス群を利用するプログラムを作成
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_14_01;

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
