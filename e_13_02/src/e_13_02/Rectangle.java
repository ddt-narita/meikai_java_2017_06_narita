/* 演習13-02
 * 図形クラス群に対して直角二等辺三角形を表すクラス群を追加する
 * 作成日：7月13日
 * 作成者：成田修之
 */
package e_13_02;

public class Rectangle extends Shape{

	//長方形の幅のフィールド
	private int width;
	//長方形の高さのフィールド
	private int height;

	//コンストラクタ
	public Rectangle(int width, int height) {
		//引数で幅を初期化
		this.width = width;
		//引数で高さを初期化
		this.height = height;
	}

	//文字列表現で返却するメソッド
	public String toString() {
		//図形情報を文字列で返却する
		return "Rectangle(width:" + width + ", height:" + height + ")";
	}

	//描画するメソッド
	public void draw() {
		//高さ分繰り返す
		for(int i = 1; i <= height; i++) {
			//幅分繰り返す
			for(int j = 1; j <= width; j++) {
				//アスタリスクで長方形を表示
				System.out.print('*');
			}
			//各段ごとに改行する
			System.out.println();
		}
	}
}
