package iga.krawczyk;

public class App {

    public static void main(String[] args) {
        String[] years = {"2022/2023","2023/2024","2023/2024", "2024/2025", "2025/2026", "LAST YEAR!!!!!"};


        // years.length == 5

        for (int i = 0; i < years.length; i++) {
            printlnMassage(years[i]);
            System.out.println(i);
        }
    }


    static void printlnMassage(String year) {

        System.out.println("Witajcie drodzy klienci");
        System.out.println("w roku " + year);
        System.out.println("zapoznajcie się z naszym menu");
        System.out.println("zapraszamy w dzień i w nocy");
        System.out.println("dania na cipło i na zimno");
        System.out.println("przygotowujemy dania włoskie i hiszpańskie ");
        System.out.println("w roku " + year + " dania będą unikatowe");


    }
}