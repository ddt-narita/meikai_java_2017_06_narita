/* 演習11-01
 * クラスDateIdをパッケージId、DateIdTesterを無名パッケージに所属させるように変更
 * 作成日：7月6日
 * 作成者：成田修之
 */

import id.DateId;

public class DateIdTester {

	public static void main(String[] args) {
		//パッケージidのクラスDateIdの1個目のインスタンス
		DateId a = new DateId();
		//パッケージidのクラスDateIdの2個目のインスタンス
		DateId b = new DateId();
		//パッケージidのクラスDateIdの3個目のインスタンス
		DateId c = new DateId();

		//1個目のインスタンスの識別番号を表示
		System.out.println("aの識別番号：" + a.getId());
		//2個目のインスタンスの識別番号を表示
		System.out.println("bの識別番号：" + b.getId());
		//3個目のインスタンスの識別番号を表示
		System.out.println("cの識別番号：" + c.getId());
	}

}
