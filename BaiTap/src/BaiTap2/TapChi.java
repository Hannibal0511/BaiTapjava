package BaiTap2;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private String thangPhatHanh;

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, String thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Mã tài liệu: " + getMaTaiLieu());
        System.out.println("Nhà xuất bản: " + getTenNhaXuatBan());
        System.out.println("Số bản phát hành: " + getSoBanPhatHanh());
        System.out.println("Số phát hành: " + soPhatHanh);
        System.out.println("Tháng phát hành: " + thangPhatHanh);
    }
}



