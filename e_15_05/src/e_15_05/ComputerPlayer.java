/* 演習15-05
 * 3人で行うじゃんけんプログラムを作成する
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_15_05;

import java.util.Random;

public class ComputerPlayer extends JankenPlayer{

	Random rand = new Random();

	//コンストラクタ
	public ComputerPlayer() {
		//親クラスのコンストラクタで0で初期化
		super(0);
		//ランダムな値を生成する関数で1から3のランダムな値でセット
		setHand(rand.nextInt(3) + 1);
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//コンピュータークラスの出す手がいくつであるかの文字列を格納
		return hand();
	}
}
