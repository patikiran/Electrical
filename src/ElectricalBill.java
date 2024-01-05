public class ElectricalBill {
    public String name;
    public String address;
    public int scuNo;
    public int previousUnites;
    public int presentUnites;
    public int totalUnites;
    public double unitCost=9.86;
    public double totalBill;

    public ElectricalBill(String name, String address, int scuNo, int previousUnites, int presentUnites) {
        this.name = name;
        this.address = address;
        this.scuNo = scuNo;
        this.previousUnites = previousUnites;
        this.presentUnites = presentUnites;
        //this.totalUnites = totalUnites;
        //this.unitCost = unitCost;
        //this.totalBill = totalBill;
    }

    public double bill(){
        totalUnites=presentUnites-previousUnites;
        totalBill=unitCost*totalUnites;
        System.out.println(totalBill);
        return totalBill;
    }


    @Override
    public String toString() {
        return "ElectricalBill{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", scuNo=" + scuNo +
                ", previousUnites=" + previousUnites +
                ", presentUnites=" + presentUnites +
                ", totalUnites=" + totalUnites +
                ", unitCost=" + unitCost +
                ", totalBill=" + totalBill +
                '}';
    }
}
