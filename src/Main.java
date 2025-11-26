import service.PensionService;
import service.TaxService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();

        System.out.println(taxService.tax(4000));
        System.out.println(pensionService.discount(4000));

    }
}