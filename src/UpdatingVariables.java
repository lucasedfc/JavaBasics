public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1700;
        // bonus
        salary += 200;
        System.out.println(salary);

        // taxes
        salary -= 50;
        System.out.println(salary);

        // extras $30 each
        // food: $45
        salary = salary + (30 * 2) - 45;
        System.out.println(salary);

        // update strings
        String employeeName = "Lucas Ocampos";
        employeeName = employeeName + " Hernandez";
        System.out.println(employeeName);
        employeeName = "Martin " + employeeName;
        System.out.println(employeeName);
    }
}
