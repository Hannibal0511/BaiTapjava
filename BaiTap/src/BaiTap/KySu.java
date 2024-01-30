package BaiTap;

public class KySu extends CanBo {
    String NganhDaoTao;

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String NganhDaoTao) {
        this.NganhDaoTao = NganhDaoTao;
    }

    public KySu(String HoTen, int Tuoi, String GioiTinh, String DiaChi, String NganhDaoTao) {
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.NganhDaoTao = NganhDaoTao;
    }
}
