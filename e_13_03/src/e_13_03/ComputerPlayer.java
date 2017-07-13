package e_13_03;

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
		return "コンピュータープレイヤーの出す手：" + hand();
	}
}
