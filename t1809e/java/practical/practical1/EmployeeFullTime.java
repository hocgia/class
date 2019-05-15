public class EmployeeFullTime extends SalaryPolicy {
    float rate = 4;

    @Override
    float getSalary() {
        return rate*baseSalary;
    }

}
