package BaiTap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Them moi can bo");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Hien thi danh sach can bo");
            System.out.println("4. Thoat");
            
            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();
            System.out.println("=================");
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Loai Can Bo: ");
                    String LoaiCanBo = scanner.nextLine();
                    System.out.print("Nhap Ho Ten: ");
                    String HoTen = scanner.nextLine();
                    System.out.print("Nhap Tuoi: ");
                    int Tuoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhap Gioi Tinh: ");
                    String GioiTinh = scanner.nextLine();
                    System.out.print("Nhap Dia Chi: ");
                    String DiaChi = scanner.nextLine();

                    if (LoaiCanBo.equalsIgnoreCase("Cong Nhan")) {
                        System.out.print("Nhap Bac: ");
                        int Bac = scanner.nextInt();
                        System.out.println("====================");
                        qlcb.ThemCanBo(new CongNhan(HoTen, Tuoi, GioiTinh, DiaChi, Bac));
                    } else if (LoaiCanBo.equalsIgnoreCase("Ky Su")) {
                        System.out.print("Nhap Nganh Dao Tao: ");
                        String NganhDaoTao = scanner.nextLine();
                        System.out.println("====================");
                        qlcb.ThemCanBo(new KySu(HoTen, Tuoi, GioiTinh, DiaChi, NganhDaoTao));
                    } else if (LoaiCanBo.equalsIgnoreCase("Nhan Vien")) {
                        System.out.print("Nhap Cong Viec: ");
                        String CongViec = scanner.nextLine();
                        System.out.println("====================");
                        qlcb.ThemCanBo(new NhanVien(HoTen, Tuoi, GioiTinh, DiaChi, CongViec));
                    } else {
                        System.out.println("Loai Can Bo Khong Co San!!!");
                    }
                    break;
                case 2:
                    System.out.print("Nhap Ho Ten Can Tim: ");
                    String TenCanTim = scanner.nextLine();
                    CanBo CanBoTimKiem = qlcb.TimKiemTheoHoTen(TenCanTim);
                    if (CanBoTimKiem != null) {
                        System.out.println("=======================");
                        System.out.println("THONG TIN CUA CAN BO:");
                        System.out.println("Ho Ten: " + CanBoTimKiem.HoTen);
                        System.out.println("Tuoi: " + CanBoTimKiem.Tuoi);
                        System.out.println("Gioi Tinh: " + CanBoTimKiem.GioiTinh);
                        System.out.println("Dia Chi: " + CanBoTimKiem.DiaChi);
                        System.out.println("=======================");
                        if (CanBoTimKiem instanceof CongNhan) {
                            System.out.println("Bac: " + ((CongNhan) CanBoTimKiem).Bac);
                        } else if (CanBoTimKiem instanceof KySu) {
                            System.out.println("Nganh Dao Tao: " + ((KySu) CanBoTimKiem).NganhDaoTao);
                        } else if (CanBoTimKiem instanceof NhanVien) {
                            System.out.println("Cong Viec: " + ((NhanVien) CanBoTimKiem).CongViec);
                        }
                    } else {
                        System.out.println("Khong Tim Thay Can Bo " + TenCanTim);
                    }
                    break;
                case 3:
                    qlcb.DanhSachCanBo();
                    break;
                case 4:
                    System.out.println("Thoat Khoi Chuong Trinh.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui Long Chon Lai.");
                    break;
            }
        }
    }
}
