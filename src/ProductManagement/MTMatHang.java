package ProductManagement;

public class MTMatHang implements IMatHang{

    @Override
    public String listProduct(NhaSanXuat nhaSanXuat) {
        return "";
    }

    @Override
    public boolean isSupplied(NhaSanXuat nhaSanXuat) {
        return false;
    }

    @Override
    public boolean sameProdcut(NhaSanXuat nhaSanXuat1, NhaSanXuat nhaSanXuat2) {
        return false;
    }

    @Override
    public MatHang minPrice() {
        return null;
    }

    @Override
    public IMatHang domecstic() {
        return new MTMatHang();
    }

    @Override
    public String toString(){
        return "";
    }

}
