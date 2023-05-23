package ProductManagement;

public class DienGD extends MatHang{
    private double thue = 0.1;


    public DienGD(String tenMatHang, float giaNhap, NhaSanXuat nhaSanXuat, double thue) {
        super(tenMatHang, giaNhap, nhaSanXuat);
        this.thue = thue;
    }

    @Override
    public double price() {
        return this.getGiaNhap() + this.thue + this.getGiaNhap()*0.2;
    }

}
