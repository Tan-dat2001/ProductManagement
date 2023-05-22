package ProductManagement;

public class ConsMatHang implements IMatHang {
    private MatHang first;
    private MatHang rest;

    public ConsMatHang(MatHang first, MatHang rest) {
        this.first = first;
        this.rest = rest;
    }

    public MatHang getFirst() {
        return first;
    }

    public void setFirst(MatHang first) {
        this.first = first;
    }

    public MatHang getRest() {
        return rest;
    }

    public void setRest(MatHang rest) {
        this.rest = rest;
    }

    @Override
    public String listProduct() {
        return this.first.getTenMatHang() + " ; " + this.rest.listProduct();

    }
}
