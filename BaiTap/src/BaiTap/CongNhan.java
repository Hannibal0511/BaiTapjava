package BaiTap;


public class CongNhan extends CanBo {
    int Bac;

    public int getBac() {
        return Bac;
    }

    public void setBac(int Bac) {
        this.Bac = Bac;
    }

    public CongNhan(String HoTen, int Tuoi, String GioiTinh, String DiaChi, int Bac) {
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.Bac = Bac;
    }
}
