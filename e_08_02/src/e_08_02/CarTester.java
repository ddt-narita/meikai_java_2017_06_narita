/* 演習08-02
 * 自動車クラスに対して、フィールドやメソッドを自由に追加する
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_08_02;

import java.util.Scanner;

public class CarTester {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);

		//これからデータの入力をすることを明示
		System.out.println("車のデータを入力してください。");
		//車の名前を入力
		System.out.print("名前は：");
		String strName = stdIn.next();

		//車の車幅を入力
		System.out.print("車幅は：");
		int nWidth = stdIn.nextInt();

		//車の高さを入力
		System.out.print("高さは：");
		int nHeight = stdIn.nextInt();

		//車の長さを入力
		System.out.print("長さは：");
		int nLength = stdIn.nextInt();

		//燃料の容量を入力
		System.out.print("ガソリンタンクの容量は：");
		int nFuelCapa = stdIn.nextInt();

		//現在の燃料を入力するための変数、ループに入るために容量より多い値で初期化
		int nFuel = nFuelCapa + 1;
		//入力された現在の残燃料が容量より多い限り繰り返す
		for (;nFuel > nFuelCapa;) {
			//現在の残燃料を入力
			System.out.print("現在のガソリン量は：");
			nFuel = stdIn.nextInt();
			//入力された燃料が容量より多いとき
			if(nFuel > nFuelCapa) {
				//多すぎることをつたえてもう一度入力する
				System.out.println("多すぎます。");
			}
		}

		//車のナンバーを入力
		System.out.print("車のナンバーは：");
		String strCarNo = stdIn.next();

		//燃費を入力する
		System.out.print("車の燃費は：");
		int nFuelEco = stdIn.nextInt();

		//入力された情報でクラスCarのオブジェクトを作る
		Car myCar = new Car(strName, nWidth, nHeight, nLength, nFuel, nFuelCapa, strCarNo, nFuelEco);
		//出来上がったオブジェクトのインスタンスメソッドを使って情報を表示
		System.out.print("入力された車の情報を表示します。");
		myCar.putSpec();

		//移動しないが入力されないかぎり繰り返す
		while(true) {
			//現在の位置と残燃料を表示
			System.out.println("現在地（" + myCar.getX() + ", " + myCar.getY() + ") ・残り燃料：" + myCar.getFuel());
			//給油するかどうかを入力
			System.out.print("給油しますか[0…No/1…Yes]：");
			//入力されたのが給油することを示すとき
			if(stdIn.nextInt() == 1) {
				//どの程度給油するか入力
				System.out.print("どのくらい給油しますか：");
				//入力された値でインスタンスメソッドrefuelingを使って給油を行おうとして、falseが返却され給油ができなかったとき
				if(!myCar.refueling(stdIn.nextDouble())) {
					//入力された給油量が多すぎて給油ができなかったことを表示
					System.out.println("多すぎます。給油しませんでした");
				}
				//給油の流れの後残燃料を表示
				System.out.println("残り燃料：" + myCar.getFuel());
			}
			//移動鶴かどうかを入力
			System.out.print("移動しますか[0…No/1…Yes]：");
			//移動しないが入力されたときbreakでループを抜けプログラムを終了する
			if(stdIn.nextInt() == 0) {
				break;
			}

			//移動する場合はx方向の移動距離を入力
			System.out.print("x方向の移動距離：");
			double dx = stdIn.nextDouble();
			//y方向の移動距離を入力
			System.out.print("y方向の移動距離：");
			double dy = stdIn.nextDouble();

			//入力された2つの移動距離でメソッドmoveで移動しようとしてfalseが返却され、燃料不足で移動できなかったとき
			if(!myCar.move(dx, dy)) {
				//移動できなかったことを表示
				System.out.println("燃料が足りません！");
			}


		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
