/* 演習13-02
 * 図形クラス群に対して直角二等辺三角形を表すクラス群を追加する
 * 作成日：7月13日
 * 作成者：成田修之
 */

package e_13_02;

public class HorzLine extends AbstLine{

	//コンストラクタ
	public HorzLine(int length) {
		//親クラスのコンストラクタで初期化
		super(length);
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//図形情報を文字列表現で返却する
		return "HorzLine(length:" + getLength() + ")";
	}

	//図形を描画するメソッド
	public void draw() {
		//直線の長さ分だけ繰り返す
		for(int i = 1; i <= getLength(); i++) {
			//横線を表示する
			System.out.print('-');
		}
		//表示し終えたら改行する
		System.out.println();
	}


}
