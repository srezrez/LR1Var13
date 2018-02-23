package application.service;

public class Logic {
	StringBuilder res;

	public Logic() {
	}

	public Logic(StringBuilder res) {
		super();
		this.res = res;
	}

	public StringBuilder getRes() {
		return res;
	}

	public void setRes(StringBuilder res) {
		this.res = res;
	}
	
	public void init() {
		res = new StringBuilder();
	}
	
	/**
	 * Method converts decimal numbers into binary.
	 * @param num
	 * @return String
	 */
	public String convert(int num) {
		init();
		while(num>0) {
			res.append(num%2);
			num/=2;
		}
		res.reverse();
		return res.toString();
	}

}
