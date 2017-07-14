/* 演習14-01
 * テキストの図形クラス群を利用するプログラムを作成
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_14_01;
/**
 * 平行四辺形を表すクラス
 *
 * @author 成田修之
 * @see Shape
 * @see Plane2D
 *
 */
public class Parallelogram extends Shape implements Plane2D {
	//平行四辺形の底辺の長さ
	private int width;
	//高さ
	private int height;

	//コンストラクタ
	public Parallelogram(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//なんの図形であるのかと底辺、高さの長さを表示
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}

	//描画するためのメソッド
	public void draw() {
		//高さ分繰り返す
		for(int i = 1; i <= height; i++) {
			//高さから1引いた値と同じだけ繰り返して空白表示
			for(int j = 1; j <= height - i; j++) {
				System.out.print(' ');
			}
			//幅分繰り返してアスタリスクで図形を表示
			for(int j = 1; j <= width; j++) {
				System.out.print('*');
			}
			//一段ごとに改行する
			System.out.println();
		}
	}

	//図形の面積を取得するメソッド
	public int getArea() {
		return width * height;
	}

}
