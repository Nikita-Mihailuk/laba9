import java.util.Scanner;
class Student{
    private String fio;
    private int date;
    private String address;
    private String telephone;
    private int course;
    private String faculty;

    Student(String fio, int date, String address, String telephone, int course, String faculty){
        this.fio = fio;
        this.date = date;
        this.address = address;
        this.telephone = telephone;
        this.course = course;
        this.faculty = faculty;
    }

    public String getFio(){ return this.fio; }
    public void setFio(String fio){ this.fio = fio; }

    public int getDate(){ return this.date; }
    public void setDate(int date){ this.date = date; }

    public String getAddress(){ return this.address; }

    public String getTelephone(){ return this.telephone; }
    public void setTelephone(String telephone){ this.telephone = telephone; }

    public void setCourse(int course){ this.course = course; }

    public String getFaculty(){ return this.faculty; }

    public void displayInfo(){
        System.out.println("ФИО: " + fio + "\nДата рождения: " + date + "\nАдрес: " + address + "\nТелефон: " + telephone + "\nКурс: " + course + "\nФакультет: " + faculty);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student[] students = new Student[3];
        students[0] = new Student("Иванов Иван Иванович", 2015, "ул. Ленина, д. 10", "555-1234", 4, "Информационные технологии");
        students[1] = new Student("Петров Петр Петрович", 2021, "пр. Победы, д. 20", "555-5678", 1, "Информационные технологии");
        students[2] = new Student("Сидорова Анна Игоревна", 2006, "ул. Солнечная, д. 5", "555-9012", 3, "Медицина");

        System.out.println("ФИО всех студентов:\n");
        for (int i = 0; i < students.length; i++){
            System.out.printf("ФИО: %s \n", students[i].getFio());
        }

        System.out.print ("Введите факультет: ");
        String f = in.nextLine();
        System.out.println("Студенты с заданным факультетом:\n");
        for (int i = 0; i < students.length; i++){
            if(students[i].getFaculty().equals(f)) students[i].displayInfo();
        }

        System.out.print ("Введите год: ");
        int d = in.nextInt();
        System.out.println("Студенты, поступившие после заданного года:\n");
        for (int i = 0; i < students.length; i++){
            if(students[i].getDate() > d) students[i].displayInfo();
        }
    }
}