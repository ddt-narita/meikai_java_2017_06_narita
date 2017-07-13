package e_13_03;

public class HumanPlayer extends JankenPlayer{

	//コンストラクタ
	public HumanPlayer(int nHand) {
		//引数で親クラスのコンストラクタを呼び出して初期化
		super(nHand);
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//メソッドhandを使って人間プレーヤの出し手の文字列を返却する
		return "人間プレーヤーの出し手：" + hand();
	}
}
