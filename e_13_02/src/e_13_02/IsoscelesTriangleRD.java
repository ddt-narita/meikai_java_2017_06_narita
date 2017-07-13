package e_13_02;

public class IsoscelesTriangleRD extends IsoscelesTriangle {
	//コンストラクタ
	public IsoscelesTriangleRD(int length) {
		//親クラスのコンストラクタで初期化
		super(length);
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//図形情報を文字列で返却
		return "IsoscelesTriangleRD(length:" + getLength() + ")";
	}

	//描画するメソッド
	public void draw() {
		//一辺の長さ分だけ繰り返す
		for(int i = 0; i < getLength(); i++) {
			//一辺の長さからその段の値分引いた分繰り返す
			for(int j = 0; j < getLength() - i - 1; j++) {
				//空白を表示する
				System.out.print(" ");
			}
			//一辺の長さからその段目を引いた分だけ繰り返す
			for(int j = 0; j < i + 1; j++) {
				//アスタリスクで2等辺三角形を表示
				System.out.print('*');
			}
			//一段ごとに改行
			System.out.println();
		}
	}
}
