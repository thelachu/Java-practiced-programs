public class College {
    private int id;
    private String name;
    private String branch;
    private int age;
    private long year;

    public void setDetails(int id, String name, String branch, int age, long year) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.age = age;
        this.year = year;
    }

    public void getDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println();
    }

    public static void main(String[] args) {
        College student1 = new College();
        College student2 = new College();
        College student3 = new College();

        student1.setDetails(1, "Lachu", "AI & DS", 20, 2025);
        student2.setDetails(2, "Anil", "AI & DS", 20, 2025);
        student3.setDetails(3, "Ajay", "AI & DS", 20, 2025);

        student1.getDetails();
        student2.getDetails();
        student3.getDetails();
    }
}
