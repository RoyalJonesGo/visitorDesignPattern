public class ShippingCostCalculatorImpl implements ShippingCostCalculator{
    @Override
    public void visit(Chair chair){
        double cost = 5.0; //flat rate
        System.out.println("Shipping cost for Chair: $" + cost);
    }
    @Override
    public void visit(Table table){
        double cost = table.getArea() * 2.0; //cost-based
        System.out.println("Shipping cost for Table: $" + cost);
    }
    @Override
    public void visit(Sofa sofa){
        double cost = sofa.getVolume() * 1.5 + sofa.getDistance() * 0.5; //cost-based
        System.out.println("Shipping cost for Sofa: $" + cost);
    }
}
