package practice_6.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {

    // array, index = month number
    private ArrayList<Double> costsPerMonth = new ArrayList<>();

    // Method for adding a value (costs) by month number (from 1 to 12)
    public void addCosts(int month, Double costs) {
        costsPerMonth.add(month-1, costs);
    }

    // Method for getting costs per month
    public Double getCosts(int month) {
        return costsPerMonth.get(month-1);
    }

    // Calculate the minimal costs per month
    public Double minCostPerMonth() {
        AtomicReference<Double> min = new AtomicReference<>(costsPerMonth.getFirst());
        costsPerMonth.forEach(
                costsPerMonth -> {
                    if (costsPerMonth < min.get()) {
                        min.set(costsPerMonth);
                    }
                }
        );
        return min.get();
    }
}
