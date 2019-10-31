public class DonHang {

	private KhachHang khachHang;
	private NhanVienBanHang nhanvien;
	private int tongtien;

	public void Taohoadon() {
		throw new UnsupportedOperationException();
	}

	public KhachHang getKhachHang() {
		return this.khachHang;
	}

	/**
	 * 
	 * @param khachHang
	 */
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public NhanVienBanHang getNhanvien() {
		return this.nhanvien;
	}

	/**
	 * 
	 * @param nhanvien
	 */
	public void setNhanvien(NhanVienBanHang nhanvien) {
		this.nhanvien = nhanvien;
	}

}