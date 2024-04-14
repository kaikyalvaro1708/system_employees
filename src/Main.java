import Employees.SalaryLogical.FullTimeEmployee;
import Employees.SalaryLogical.HourlyEmployee;
import Employees.SalaryLogical.Manager;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto funcionário integral
        FullTimeEmployee firstEmployee = new FullTimeEmployee("Carlos", 30, 3000);

        // Obtendo e imprimindo os dados do funcionário integral
        System.out.println("""
                --------------------
                Funcionário Integral
                """);
        String name = firstEmployee.getName();
        int age = firstEmployee.getAge();
        double salary = firstEmployee.calculateSalary(); // Utilizando calculateSalary ao invés de getSalary
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Salário: " + salary);

        // Criando um objeto funcionário por hora
        HourlyEmployee secondEmployee = new HourlyEmployee("Amanda", 25, 0, 20, 80);

        // Obtendo e imprimindo os dados do funcionário por hora
        System.out.println("""
                --------------------
                Funcionário por hora
                """);
        name = secondEmployee.getName();
        age = secondEmployee.getAge();
        double hourlySalary = secondEmployee.calculateSalary(); // Utilizando calculateSalary ao invés de getSalary
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Salário: " + hourlySalary);

        // Modificando o número de horas trabalhadas
        secondEmployee.setHoursWorked(100);

        // Imprimindo o salário após modificar o número de horas trabalhadas
        double modifiedHourlySalary = secondEmployee.calculateSalary();
        System.out.println("Salário após modificar horas trabalhadas: " + modifiedHourlySalary);

        // Obtendo e imprimindo a taxa horária do funcionário por hora
        System.out.println("Taxa horária: " + secondEmployee.getHourlyRate());

        // Criando um objeto gerente
        Manager manager = new Manager("Pedro", 35, 0, 5000, 1000);

        // Obtendo e imprimindo os dados do gerente
        System.out.println("""
                --------------------
                Gerente
                """);
        name = manager.getName();
        age = manager.getAge();
        double managerSalary = manager.calculateSalary(); // Utilizando calculateSalary ao invés de getSalary
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Salário: " + managerSalary);

        // Modificando o salário base do gerente
        manager.setBaseSalary(6000);

        // Imprimindo o salário após modificar o salário base
        double modifiedManagerSalary = manager.calculateSalary();
        System.out.println("Salário após modificar salário base: " + modifiedManagerSalary);

        // Obtendo e imprimindo o bônus de desempenho do gerente
        System.out.println("Bônus de desempenho: " + manager.getPerformanceBonus());
    }
}
