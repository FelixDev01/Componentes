import service.TaxService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaxService taxService = new TaxService();

        System.out.println(taxService.tax(4000));
    }
}