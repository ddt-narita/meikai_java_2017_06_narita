/* 演習14-01
 * テキストの図形クラス群を利用するプログラムを作成
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_14_01;

public class VirtLine extends AbstLine {

	//コンストラクタ
	public VirtLine(int length) {
		//親クラスのコンストラクタで初期化
		super(length);
	}

	//文字列表現で返却するメソッド
	public String toString() {
		//図形情報を文字列で返却
		return "VirtLine(length:" + getLength() + ")";
	}

	//描画するメソッド
	public void draw() {
		//直線の長さ分だけ繰り返す
		for(int i = 1; i <= getLength(); i++) {
			//|を表示して改行する
			System.out.println('|');
		}
	}
}
