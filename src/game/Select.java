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

	/**
	 * カード選択の番号でないか
	 *
	 * @return
	 */
	public boolean isNotSelectCard() {
		if (this.num == Constant.CARD1) {
			return false;
		}
		if (this.num == Constant.CARD2) {
			return false;
		}
		if (this.num == Constant.CARD3) {
			return false;
		}
		if (this.num == Constant.CARD4) {
			return false;
		}
		if (this.num == Constant.CARD5) {
			return false;
		}
		if (this.num == Constant.CARD_DECIDE) {
			return false;
		}
		return true;
	}

	/**
	 * 番号を取得する
	 *
	 * @return
	 */
	public int getNum() {
		return this.num;
	}

	/**
	 * カード決定の番号か
	 *
	 * @return
	 */
	public boolean isCardDeside() {
		return this.num == Constant.CARD_DECIDE;
	}
}
