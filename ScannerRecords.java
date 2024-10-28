import java.util.Scanner;

public class ScannerRecords {
    public static void main(String[] args) {
        String name;
        String email;
        String nickname;
        int numberNickname;

        Scanner sc = new Scanner(System.in);

        System.out.print("Buen día, por favor digite su nombre Completo: ");
        name = sc.nextLine();

        System.out.print("Correo electronico: ");
        email = sc.nextLine();

        System.out.print("Ingresa como quieres que te llamemos: ");
        nickname = sc.nextLine();

        System.out.print("Ingresa tu numero favorito: ");
        numberNickname = sc.nextInt();

        sc.close();

        System.out.println("Registro exitoso!" + "\nTe damos la bienvenida a Dev Senior "+ name);
        System.out.println("Valida tu correo de registro "+email);
        System.out.println("Tu usuario es: "+nickname+numberNickname);


    }
}
