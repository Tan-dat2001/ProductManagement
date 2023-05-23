package ProductManagement;


public class ConsMatHang implements IMatHang {
    private MatHang first;
    private IMatHang rest;

    public ConsMatHang(MatHang first, IMatHang rest) {
        this.first = first;
        this.rest = rest;
    }


    @Override
    public String listProduct(NhaSanXuat nhaSanXuat) {
        if(this.first.getNhaSanXuat().equals(nhaSanXuat)){
            return this.first.getTenMatHang() + " ; " + this.rest.listProduct(nhaSanXuat);
        }else{
            return this.rest.listProduct(nhaSanXuat);
        }
    }
    //Done
    @Override
    public boolean isSupplied(NhaSanXuat nhaSanXuat) {
        if(this.first.nhaSanXuat.equals(nhaSanXuat)){
            return true;
        }else{
            return this.rest.isSupplied(nhaSanXuat);
        }
    }
    //NotYet
    @Override
    public boolean sameProdcut(NhaSanXuat nhaSanXuat1, NhaSanXuat nhaSanXuat2) {
        if(this.first.getNhaSanXuat().equals(nhaSanXuat1) && this.first.getNhaSanXuat().equals(nhaSanXuat2)){
            return true;
        }else{
            return this.rest.sameProdcut(nhaSanXuat1, nhaSanXuat2);
        }
    }

    //NotYet
    @Override
    public MatHang minPrice() {
        MatHang matHang = this.first;
        if( this.first.price() < matHang.price() ){
            matHang = this.first;
        }else{
             this.rest.minPrice();
        }
        return matHang;
    }
    //NotYet
    @Override
    public IMatHang domecstic() {
        if(this.first instanceof DienGD){
            return new ConsMatHang(first,rest.domecstic());
        }
        return this.rest.domecstic();
    }

    @Override
    public String toString() {
        return "ConsMatHang{" +
                "first=" + first.getTenMatHang() +
                ", rest=" + rest +
                '}';
    }
}
