public class Nguoi {

	private string cmt;
	private int tuoi;
	private string gioitinh;
	private DiaChi diachi;
	private Hoten hoten;

	public string getCmt() {
		return this.cmt;
	}

	/**
	 * 
	 * @param cmt
	 */
	public void setCmt(int cmt) {
		throw new UnsupportedOperationException();
	}

	public int getTuoi() {
		return this.tuoi;
	}

	/**
	 * 
	 * @param tuoi
	 */
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public string getGioitinh() {
		return this.gioitinh;
	}

	/**
	 * 
	 * @param gioitinh
	 */
	public void setGioitinh(int gioitinh) {
		throw new UnsupportedOperationException();
	}

	public DiaChi getDiachi() {
		return this.diachi;
	}

	/**
	 * 
	 * @param diachi
	 */
	public void setDiachi(DiaChi diachi) {
		this.diachi = diachi;
	}

	public Hoten getHoten() {
		return this.hoten;
	}

	/**
	 * 
	 * @param hoten
	 */
	public void setHoten(Hoten hoten) {
		this.hoten = hoten;
	}

}