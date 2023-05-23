package ProductManagement;

public class MainPM {
    public static void main(String[] args) {
        NhaSanXuat nsx1 = new NhaSanXuat("NhaSXDien","Điện Bàn","0304561820");
        NhaSanXuat nsx2 = new NhaSanXuat("NhaSXTP","Điện Hồng","0304561821");
        Date d1 = new Date(2,3,2023);
        Date d2 = new Date(2,3,2023);
        Date d3 = new Date(2,4,2023);
        Date d4 = new Date(2,5,2023);
        MatHang thucpham1 = new ThucPham("Cá hộp",1000000,nsx2,d4,0.05);
        MatHang thucpham2 = new ThucPham("Snack",400000,nsx1,d3,0.05);
        MatHang thucpham3 = new ThucPham("Cá Thu",20000000,nsx2,d1,0.05);
        MatHang thucpham4 = new ThucPham("Tôm Càng",10000000,nsx2,d2,0.05);
        MatHang dienGD1 = new DienGD("Bóng đèn",3500,nsx1,0.1);
        MatHang dienGD2 = new DienGD("Quạt ",3500000,nsx2,0.1);
        MatHang dienGD3 = new DienGD("Ổ cắm điện",5000000,nsx1,0.1);
        MatHang dienGD4 = new DienGD("Ăsc Quy",35000000,nsx1,0.1);

        MTMatHang empty = new MTMatHang();
        ConsMatHang mh1 = new ConsMatHang(thucpham1, empty);
        ConsMatHang mh2 = new ConsMatHang(thucpham2, mh1);
        ConsMatHang mh3 = new ConsMatHang(dienGD2, mh2);
        ConsMatHang mh4 = new ConsMatHang(thucpham4, mh3);
        ConsMatHang mh5 = new ConsMatHang(dienGD1, mh4);

        System.out.println(mh5.listProduct(nsx1));
        System.out.println(mh5.minPrice().getTenMatHang());
        System.out.println(mh5.domecstic());

    }
}
