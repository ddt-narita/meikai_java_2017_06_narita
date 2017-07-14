/* 演習14-02
 * ロボット型ペットクラスRobotPetを拡張する。インターフェースSkinnableを実装してきせかえできるように
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_14_02;

//ロボット型ペットクラス
public class RobotPet extends Pet implements Skinnable {

	//現在の色を表す変数。
	private int skin;

	//コンストラクタ
	public RobotPet(String name, String masterName) {
		//親クラスのコンストラクタで初期化
		super(name, masterName);
		skin = BLACK;
	}

	//自己紹介するメソッド
	public void introduce() {
		//名前を表示する
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		//持ち主の名前を表示する
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}

	//家事をするメソッド
	public void work(int sw) {

		//引数の値によって分岐
		switch(sw) {
		//0の時は掃除
		case 0: System.out.println("掃除します。"); break;
		//1の時は洗濯
		case 1: System.out.println("洗濯します。"); break;
		//2の時は炊事する
		case 2: System.out.println("炊事します。"); break;
		}
	}

	//現在のスキンのゲッタ
	public int getSkin() {
		return skin;
	}

	public void changeSkin(int skin) {

		//引数がインターフェースSkinnableで定義されているときのみ
		if(skin >= 0 || skin <= 4) {
			//インスタンスに反映させる
			this.skin = skin;
			//スキン変更したことを表示
			System.out.print("スキンを");
			//引数によって分岐
			switch(skin) {
			//黒のとき
			case BLACK: 	System.out.print("黒"); break;
			//赤の時
			case RED:		System.out.print("赤"); break;
			//緑の時
			case GREEN:	System.out.print("緑"); break;
			//青の時
			case BLUE:		System.out.print("青"); break;
			//ヒョウ柄の時
			case LEOPARD:	System.out.print("ヒョウ柄"); break;
			}
			//各色に変更したことを表示する
			System.out.println("に変更しました。");

		//それ以外の時
		} else {
			//変更しなかったことをしなかったことを表示
			System.out.println("スキンを変更しませんでした。");
		}

	}
}
