import entities.Employee;
import service.BrazilTaxService;
import service.PensionService;
import service.SalaryService;
import service.TaxService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario: ");
        String name = scanner.next();
        System.out.println("Digite o salario bruto desse funcionario: ");
        Double grossSalary = scanner.nextDouble();

        TaxService taxService = new BrazilTaxService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(taxService, pensionService);

        Employee employee = new Employee(grossSalary, name);

        double netSalary = salaryService.netSalary(employee);
        System.out.println("Salario liquido: " + netSalary);

    }
}