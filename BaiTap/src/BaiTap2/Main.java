package BaiTap2;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySach quanLySach = new QuanLySach();

        int choice = 0; 

        do {
            System.out.println("===== Quản Lý Thư Viện =====");
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Xoá tài liệu");
            System.out.println("3. Hiển thị thông tin về tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("5. Thoát chương trình");
            System.out.print("Chọn chức năng (1-5): ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); 
            } catch (Exception e) {
                scanner.nextLine(); 
                System.out.println("Vui lòng nhập một số từ 1 đến 5.");
                continue;
            }

            switch (choice) {
                case 1:
                    quanLySach.themMoiTaiLieu(nhapTaiLieu(scanner));
                    break;
                case 2:
                    System.out.print("Nhập mã tài liệu cần xoá: ");
                    String maXoa = scanner.nextLine();
                    quanLySach.xoaTaiLieu(maXoa);
                    break;
                case 3:
                    System.out.print("Nhập mã tài liệu cần hiển thị thông tin: ");
                    String maHienThi = scanner.nextLine();
                    quanLySach.hienThiThongTinTaiLieu(maHienThi);
                    break;
                case 4:
                    timKiemTheoLoai(scanner, quanLySach);
                    break;
                case 5:
                    quanLySach.thoatChuongTrinh();
                    break;
                default:
                    System.out.println("Vui lòng chọn một số từ 1 đến 5.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static TaiLieu nhapTaiLieu(Scanner scanner) {
        System.out.println("Chọn loại tài liệu:");
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.print("Chọn loại tài liệu (1-3): ");

        int loaiChon = scanner.nextInt();
        scanner.nextLine(); 

        switch (loaiChon) {
            case 1:
                return nhapSach(scanner);
            case 2:
                return nhapTapChi(scanner);
            case 3:
                return nhapBao(scanner);
            default:
                System.out.println("Không xác định được loại tài liệu. Trả về null.");
                return null;
        }
    }

    private static Sach nhapSach(Scanner scanner) {
        System.out.print("Nhập mã tài liệu: ");
        String maTaiLieu = scanner.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        String tenNhaXuatBan = scanner.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soBanPhatHanh = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nhập tên tác giả: ");
        String tenTacGia = scanner.nextLine();
        System.out.print("Nhập số trang: ");
        int soTrang = scanner.nextInt();
        scanner.nextLine(); 

        return new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
    }

    private static TapChi nhapTapChi(Scanner scanner) {
        System.out.print("Nhập mã tài liệu: ");
        String maTaiLieu = scanner.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        String tenNhaXuatBan = scanner.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soBanPhatHanh = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nhập số phát hành: ");
        int soPhatHanh = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nhập tháng phát hành: ");
        String thangPhatHanh = scanner.nextLine();

        return new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
    }

    private static Bao nhapBao(Scanner scanner) {
        System.out.print("Nhập mã tài liệu: ");
        String maTaiLieu = scanner.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        String tenNhaXuatBan = scanner.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soBanPhatHanh = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nhập ngày phát hành: ");
        String ngayPhatHanh = scanner.nextLine();

        return new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh);
    }

    private static void timKiemTheoLoai(Scanner scanner, QuanLySach quanLySach) {
        System.out.println("Tìm kiếm tài liệu theo loại:");
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.print("Chọn loại tài liệu (1-3): ");

        try {
            int loaiChon = scanner.nextInt();
            scanner.nextLine(); 

            switch (loaiChon) {
                case 1:
                    quanLySach.timKiemTheoLoai(Sach.class);
                    break;
                case 2:
                    quanLySach.timKiemTheoLoai(TapChi.class);
                    break;
                case 3:
                    quanLySach.timKiemTheoLoai(Bao.class);
                    break;
                default:
                    System.out.println("Vui lòng chọn một số từ 1 đến 3.");
            }
        } catch (Exception e) {
            scanner.nextLine(); 
            System.out.println("Vui lòng nhập một số từ 1 đến 3.");
        }
    }
}

