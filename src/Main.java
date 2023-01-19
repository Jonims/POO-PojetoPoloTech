import br.com.projeto.dominio.Mentoring;
import br.com.projeto.dominio.Module;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Module module1 = new Module();
        module1.setTitle("PROGRAMMING LOGIC I");
        module1.setDescription("MODULE PROGRAMMING LOGIC I");
        module1.setWorkload(10);

        Module module2 = new Module();
        module2.setTitle("OBJECT-ORIENTED PROGRAMMING I");
        module2.setDescription("MODULE OBJECT-ORIENTED PROGRAMMING I");
        module2.setWorkload(10);

        Module module3 = new Module();
        module3.setTitle("PROGRAMAÇÃO ORIENTADA A OBJETOS II");
        module3.setDescription("MODULE PROGRAMAÇÃO ORIENTADA A OBJETOS II");
        module3.setWorkload(10);

        Module module4 = new Module();
        module4.setTitle("WEB PROGRAMMING I");
        module4.setDescription("MODULE WEB PROGRAMMING I");
        module4.setWorkload(10);

        Module module5 = new Module();
        module5.setTitle("DATABASE (POSTGRES)");
        module5.setDescription("DATABASE (POSTGRES)");
        module5.setWorkload(10);

        Module module6 = new Module();
        module6.setTitle("AUTOMATED TESTS I");
        module6.setDescription("MODULE AUTOMATED TESTS I");
        module6.setWorkload(10);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoring");
        mentoring.setDescription("Description");
        mentoring.setDate(LocalDate.now());

        System.out.println(module1);
        System.out.println(module2);
        System.out.println(module3);
        System.out.println(module4);
        System.out.println(module5);
        System.out.println(module6);

        System.out.println(mentoring);

    }
}