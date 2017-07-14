/* 演習14-03
 * クラスDVDPlayerを利用するプログラムの作成
 * 作成日：7月14日
 * 作成者：成田修之
 */


package e_14_03;

//プレーヤーを拡張したインターフェース
public interface ExPlayer extends Player {

	//スロー再生するメソッド
	void slow();
}
