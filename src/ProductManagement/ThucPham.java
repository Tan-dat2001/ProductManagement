package ProductManagement;

import java.util.Date;

public class ThucPham extends MatHang{
    private Date ngayHH;
    private double thue = 0.05;

    public ThucPham(String tenMatHang, float giaNhap, NhaSanXuat nhaSanXuat, Date ngayHH, double thue) {
        super(tenMatHang, giaNhap, nhaSanXuat);
        this.ngayHH = ngayHH;
        this.thue = thue;
    }

    @Override
    public double price() {
        return this.getGiaNhap() + this.thue + this.getGiaNhap()*0.2;
    }




}
