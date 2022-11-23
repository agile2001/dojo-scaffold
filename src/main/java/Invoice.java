import java.util.List;

public class Invoice {

    private String customer;
    private List<Performance> performances;

    public Invoice(String customer, List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }

    int calculateTotalAmount() {
        return performances.stream().mapToInt(Performance::calculateAmount).sum();
    }

    int calculateVolumeCredits() {
        return performances.stream().mapToInt(Performance::calculateVolumeCredits).sum();
    }

    public String getCustomer() {
        return customer;
    }
}