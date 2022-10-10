import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mot chuoi");
        String str1 = scanner.nextLine();
        System.out.println("nhap 1 ky tu");
        char syl = 'a';
        char[] array = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            array[i] = (str1.charAt(i));
            System.out.print(array[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (syl == array[i]) {
                count += 1;
            }
        }
        System.out.println("\n");
        System.out.println("ky tu 'a' xuat hien " + count + " lan");


    }
}