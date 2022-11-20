import java.util.List;

public class Invoice {

    public String customer;
    public List<Performance> performances;

    public Invoice(String customer, List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }

    int calculateCredits() {
        return performances.stream().mapToInt(Performance::calculateVolumeCredits).sum();
    }

    int calculateTotalAmount() {
        return performances.stream().mapToInt(Performance::calculateTotalAmount).sum();
    }
}