

package e_13_02;

import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		int nShapeNumber;		//何個図形を作るか入力するのに使う変数
		int nShapeKind;		//図形の種類を選択するのに使う変数
		int nLineLength;		//直線の長さの入力に使う変数
		int nRectWidth;		//長方形の幅の長さの入力に使う変数
		int nRectHeight;		//長方形の高さの入力に使う変数
		int nTriLength;		//
		int nTriKind;

		//作って表示させたい図形の個数の入力
		System.out.print("図形の数：");
		//個数を入力
		nShapeNumber = stdIn.nextInt();

		//親クラスShapeの配列を入力された数作り、それぞれの図形を参照するようにする
		Shape[] pShape = new Shape[nShapeNumber];

		//入力された個数分繰り返す
		for(int i = 0; i < nShapeNumber; i++) {
			//作りたい図形の種類の入力を促す
			System.out.print(i + 1 + "番の図形の種類（1…点/2…水平直線/3…垂直直線/4…長方形/5…直角2等辺三角形）：");
			//作りたい図形の種類に応じた値を入力
			nShapeKind = stdIn.nextInt();

			//入力された種類に相当する値に応じて分岐
			switch(nShapeKind) {

			//点に相当する値が入力されたとき
			case 1:
				//ポイントのインスタンスを参照するようにする
				pShape[i] = new Point(); break;

			//水平直線の時
			case 2:
				//直線の長さの入力を促す
				System.out.print("長さ：");
				//長さを入力する
				nLineLength = stdIn.nextInt();
				//入力された長さの水平直線のインスタンスを参照するようにする
				pShape[i] = new HorzLine(nLineLength); break;

			//垂直直線の時
			case 3:
				//直線の長さの入力をうながす
				System.out.print("長さ：");
				//長さを入力する
				nLineLength = stdIn.nextInt();
				//入力された長さの垂直直線のインスタンスを参照するようにする
				pShape[i] = new VirtLine(nLineLength); break;

			//長方形の時
			case 4:
				//長方形の幅の入力を促す
				System.out.print("幅：");
				//幅を入力
				nRectWidth = stdIn.nextInt();
				//長方形の高さの入力を促す
				System.out.print("高さ：");
				//高さを入力
				nRectHeight = stdIn.nextInt();
				//入力された幅、高さの長方形のインスタンスを参照するようにする
				pShape[i] = new Rectangle(nRectWidth, nRectHeight);
				break;

			//直角2等辺三角形の時
			case 5:
				//2等辺三角形の一辺の長さの入力を促す
				System.out.print("一辺の長さ：");
				//一辺の長さを入力
				nTriLength = stdIn.nextInt();
				//直角2等辺三角形の直角の位置を入力してもらう
				System.out.print("直角2等辺三角形の直角の位置（1…左下/2…左上/3…右下/4…右上）：");
				//直角の位置を入力
				nTriKind = stdIn.nextInt();
				//直角の位置で分岐
				switch(nTriKind) {
				//左下の時
				case 1:
					//一辺の長さが入力された値の左下直角2等辺三角形のインスタンスを参照するようにする
					pShape[i] = new IsoscelesTriangleLD(nTriLength);
					break;
				//左上の時
				case 2:
					//一辺の長さが入力された値の左上直角2等辺三角形のインスタンスを参照するようにする
					pShape[i] = new IsoscelesTriangleLU(nTriLength);
					break;
				//右下の時
				case 3:
					//一辺の長さが入力された値の右下直角2等辺三角形のインスタンスを参照するようにする
					pShape[i] = new IsoscelesTriangleRD(nTriLength);
					break;
				//右上の時
				case 4:
					//一辺の長さが入力された値の右上直角2等辺三角形のインスタンスを参照するようにする
					pShape[i] = new IsoscelesTriangleRU(nTriLength);
					break;
				}
				break;
			}
		}
		//配列の全要素を表示する
		for(Shape s: pShape) {
			//各要素について図形情報と図形を表示する
			s.print();
			//一つの図形ごとに改行
			System.out.println();
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
