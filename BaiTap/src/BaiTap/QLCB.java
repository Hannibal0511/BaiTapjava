package BaiTap;

import java.util.ArrayList;

/**
 *
 * @author nhvd2
 */
public class QLCB {
    private ArrayList<CanBo> DanhSachCanBo;

    public QLCB() {
        this.DanhSachCanBo = new ArrayList<>();
    }

    public void ThemCanBo(CanBo CanBo) {
        DanhSachCanBo.add(CanBo);
    }

    public CanBo TimKiemTheoHoTen(String HoTen) {
        for (CanBo CanBo : DanhSachCanBo) {
            if (CanBo.HoTen.equals(HoTen)) {
                return CanBo;
            }
        }
        return null;
    }

    public void DanhSachCanBo() {
        for (CanBo CanBo : DanhSachCanBo) {
            System.out.println("Ho Ten: " + CanBo.HoTen);
            System.out.println("Tuoi: " + CanBo.Tuoi);
            System.out.println("Gioi Tinh: " + CanBo.GioiTinh);
            System.out.println("Dia Chi: " + CanBo.DiaChi);

            if (CanBo instanceof CongNhan CongNhan) {
                System.out.println("Bac: " + CongNhan.Bac);
            } else if (CanBo instanceof KySu KySu) {
                System.out.println("Nganh Dao Tao: " + KySu.NganhDaoTao);
            } else if (CanBo instanceof NhanVien NhanVien) {
                System.out.println("Cong Viec: " + NhanVien.CongViec);
            }

            System.out.println("===========================");
        }
    }
}
