package ProductManagement;

public interface IMatHang {
    public String listProduct(NhaSanXuat nhaSanXuat);

    public boolean isSupplied(NhaSanXuat nhaSanXuat);

    public boolean sameProdcut(NhaSanXuat nhaSanXuat1, NhaSanXuat nhaSanXuat2);
    public MatHang minPrice();

    public IMatHang domecstic();

    public String toString();
}
