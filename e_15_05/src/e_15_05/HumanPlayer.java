/* 演習15-05
 * 3人で行うじゃんけんプログラムを作成する
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_15_05;

public class HumanPlayer extends JankenPlayer{

	//コンストラクタ
	public HumanPlayer(int nHand) {
		//引数で親クラスのコンストラクタを呼び出して初期化
		super(nHand);
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//メソッドhandを使って人間プレーヤの出し手の文字列を返却する
		return hand();
	}
}
