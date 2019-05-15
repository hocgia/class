public class EmployeePartime extends SalaryPolicy {
    float rate = (float) 2.5;

    @Override
    float getSalary() {
        return rate*baseSalary;
    }
}
