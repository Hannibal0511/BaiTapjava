package BaiTap2;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<TaiLieu> danhSachTaiLieu;

    public QuanLySach() {
        danhSachTaiLieu = new ArrayList<>();
    }

    public ArrayList<TaiLieu> getDanhSachTaiLieu() {
        return danhSachTaiLieu;
    }

    public void setDanhSachTaiLieu(ArrayList<TaiLieu> danhSachTaiLieu) {
        this.danhSachTaiLieu = danhSachTaiLieu;
    }

    public void themMoiTaiLieu(TaiLieu taiLieu) {
        danhSachTaiLieu.add(taiLieu);
        System.out.println("Đã thêm mới tài liệu.");
    }

    public void xoaTaiLieu(String maTaiLieu) {
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if (taiLieu.getMaTaiLieu().equals(maTaiLieu)) {
                danhSachTaiLieu.remove(taiLieu);
                System.out.println("Đã xoá tài liệu có mã: " + maTaiLieu);
                return;
            }
        }
        System.out.println("Không tìm thấy tài liệu có mã: " + maTaiLieu);
    }

    public void hienThiThongTinTaiLieu(String maTaiLieu) {
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if (taiLieu.getMaTaiLieu().equals(maTaiLieu)) {
                taiLieu.hienThiThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy tài liệu có mã: " + maTaiLieu);
    }

    public void timKiemTheoLoai(Class<?> loaiTaiLieu) {
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if (loaiTaiLieu.isInstance(taiLieu)) {
                taiLieu.hienThiThongTin();
                System.out.println("----------");
            }
        }
    }

    public void thoatChuongTrinh() {
        System.out.println("Chương trình kết thúc.");
        System.exit(0);
    }
}

