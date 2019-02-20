import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkNr1 {

    private double loanAmount = 1000;
    private double expectedAmountToPay = 3240;

    @Test

    public void finalAmountToPay() {

        double amountToPay1 = loanAmount * (1 + (1 * 0.1));
        double amountToPay2 = loanAmount * (1 + (1 * 0.08));
        double amountToPay3 = loanAmount * (1 + (1 * 0.06));

        double finalAmountToPay = amountToPay1 + amountToPay2 + amountToPay3;

        Assertions.assertEquals(expectedAmountToPay, finalAmountToPay, "Wrong finalAmountToPay!!!");
    }





}
