/* 演習13-03
 * じゃんけんのプレーヤーを表す抽象クラスを定義する。そこから人間プレーヤー、コンピュータープレイヤークラスを派生させる
 * 作成日：7月13日
 * 作成者：成田修之
 */

package e_13_03;

abstract public class JankenPlayer {

	//出す手のフィールド
	int nHand;

	//コンストラクタ
	public JankenPlayer(int nHand) {
		this.nHand = nHand;
	}

	//出す手のゲッタ
	public int gethand() {
		return nHand;
	}

	//出す手のセッタ
	public void setHand(int hand) {
		nHand = hand;
	}

	//出す手の文字列を返却するメソッド
	public String hand() {
		//返却する文字列を格納する変数
		String hand = "";
		//出す手に応じて分岐
		switch(this.nHand) {
		//1の時グー
		case 1: hand = "グー";   break;
		//2の時チョキ
		case 2: hand = "チョキ"; break;
		//3の時パー
		case 3: hand = "パー";   break;
		}
		//出す手に応じた文字列を返却する
		return hand;
	}

	//文字列表現を返却するメソッド
	abstract public String toString();
}
