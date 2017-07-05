/* 演習10-01
 * 連番クラスIdに最後に与えた識別番号を返却するクラスメソッドを追加する
 * 作成日：7月5日
 * 作成者：成田修之
 */

package e_10_01;

public class IdTester {

	public static void main(String[] args) {
		Id idA = new Id();		//識別番号Aを作成
		Id idB = new Id();		//識別番号Bを作成

		//aの識別番号を表示
		System.out.println("aの識別番号：" + idA.getId());
		//bの識別番号を表示
		System.out.println("bの識別番号：" + idB.getId());

		//クラスメソッドを使って最後に与えた識別番号を表示
		System.out.println("最後に与えた識別番号：" + Id.getMaxId());

	}

}
