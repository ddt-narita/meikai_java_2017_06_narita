/* 演習10-05
 * 口座クラスにインスタンスが生成されるたびに「開設ありがとうございます」と表示するようにインスタンス初期化子を作成
 * 作成日：7月6日
 * 作成者：成田修之
 */

package e_10_05;

public class AccountTester {

	public static void main(String[] args) {

		//足立さんの情報でインスタンスを生成
		Account adachi = new Account("足立幸一", "123456", 10000);
		//足立さんの口座情報を表示する
		System.out.println("足立君の口座");
		//口座名義を表示する
		System.out.println("口座名義" + adachi.getName());
		//口座番号を表示する
		System.out.println("口座番号" + adachi.getNo());
		//預金残高を表示する
		System.out.println("預金番号" + adachi.getBalance());
		//識別番号を表示する
		System.out.println("識別番号" + adachi.getId());

		//仲田さんの情報でインスタンスを生成
		Account nakata = new Account("仲田真二", "654321", 200);
		//仲田さんの口座情報を表示する
		System.out.println("仲田君の口座");
		//口座名義を表示する
		System.out.println("口座名義" + nakata.getName());
		//口座番号を表示
		System.out.println("口座番号" + nakata.getNo());
		//預金番号を表示する
		System.out.println("預金番号" + nakata.getBalance());
		//識別番号を表示する
		System.out.println("識別番号" + nakata.getId());
	}

}
