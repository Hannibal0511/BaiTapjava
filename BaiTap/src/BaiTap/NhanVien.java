package BaiTap;

public class NhanVien extends CanBo {
    String CongViec;

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String CongViec) {
        this.CongViec = CongViec;
    }

    public NhanVien(String HoTen, int Tuoi, String GioiTinh, String DiaChi, String CongViec) {
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.CongViec = CongViec;
    }
}
