package game;

import constant.Constant;

/**
 * 選択オブジェクト
 */
public class Select {

	/**
	 * 番号
	 */
	private int num;

	/**
	 * コンストラクタ
	 *
	 * @param num
	 */
	public Select(int num) {
		this.num = num;
	}

	/**
	 * 終了か
	 *
	 * @return
	 */
	public boolean isEnd() {
		return Constant.END == this.num;
	}

	/**
	 * タイトルの選択肢でないか
	 *
	 * @return
	 */
	public boolean isNotTitle() {
		if (this.num == Constant.START) {
			return false;
		}
		if (this.num == Constant.END) {
			return false;
		}
		return true;
	}
}
