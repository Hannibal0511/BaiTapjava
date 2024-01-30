package BaiTap2;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Mã tài liệu: " + getMaTaiLieu());
        System.out.println("Nhà xuất bản: " + getTenNhaXuatBan());
        System.out.println("Số bản phát hành: " + getSoBanPhatHanh());
        System.out.println("Ngày phát hành: " + ngayPhatHanh);
    }
}
