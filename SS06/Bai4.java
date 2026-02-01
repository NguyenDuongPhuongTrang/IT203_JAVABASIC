import java.math.BigDecimal;

class Employee {
    private int id;
    private String fullname;
    private BigDecimal salary;

    public Employee(){};
    public Employee(int id, String fullname){
        this.id = id;
        this.fullname = fullname;
    };
    public Employee(int id, String fullname, BigDecimal salary){
        this.id = id;
        this.fullname = fullname;
        this.salary = salary;
    };

    void displayInformation(){
        System.out.println("Mã nhân viên: " + this.id);
        System.out.println("Tên nhân viên: " + this.fullname);
        System.out.println("Lương: " + this.salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayInformation();
        Employee e2 = new Employee(1, "Trang");
        e.displayInformation();
        Employee e3 = new Employee(2, "Phuongtrang", new BigDecimal("5000.0"));
        e.displayInformation();
    }
}


