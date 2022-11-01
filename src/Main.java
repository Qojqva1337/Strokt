

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        String firstName = "Ivan";
        String middleName = "Vasilevich";
        String lastName = "Groznyi";

        String fullName = lastName + ' ' + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);


        System.out.println("Zadanie 2");
        String firstName1 = "Ivan";
        String middleName1 = "Ivanovich";
        String lastName1 = "Ivanov";

        String fullName1 = lastName1 + ' ' + firstName1 + " " + middleName1;
        System.out.println("ФИО сотрудника - " + fullName1);

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1.toUpperCase());

        System.out.println("Zadanie 3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName2);


    }

}