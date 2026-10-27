package practice_6.cost_counter;

public class Main {

    static void main(String[] args) {

        CostCounter costCounter = new CostCounter();

        costCounter.addCosts(1, 111.11);
        costCounter.addCosts(2, 22.0);
        costCounter.addCosts(3, 333.33);
        costCounter.addCosts(4, 444.44);

        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.minCostPerMonth());
    }
}
