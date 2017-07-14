/* 演習14-03
 * クラスDVDPlayerを利用するプログラムの作成
 * 作成日：7月14日
 * 作成者：成田修之
 */


package e_14_03;

public class DVDPlayer implements ExPlayer {
	//再生するメソッド
	public void play() {
		System.out.println("■DVD再生開始！");
	}

	//停止するメソッド
	public void stop() {
		System.out.println("■DVD再生終了！");
	}

	//スロー再生するメソッド
	public void slow() {
		System.out.println("■DVDスロー再生開始！");
	}
}
