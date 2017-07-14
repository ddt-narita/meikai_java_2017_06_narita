/* 演習14-02
 * ロボット型ペットクラスRobotPetを拡張する。インターフェースSkinnableを実装してきせかえできるように
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_14_02;

//ペットクラス
public class Pet {
	private String name;			//ペットの名前
	private String masterName;		//飼い主の名前

	//コンストラクタ
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}

	//名前のゲッタ
	public String getName() {
		return name;
	}

	//飼い主の名前のゲッタ
	public String getMasterName() {
		return masterName;
	}

	//自己紹介をするメソッド
	public void introduce() {
		//自分の名前を表示
		System.out.println("■僕の名前は" + name + "です！");
		//飼い主の名前を表示
		System.out.println("■ご主人様は" + masterName + "です！");
	}

}
