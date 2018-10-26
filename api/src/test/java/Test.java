import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class Test {

    public static void main(String[] args) {
        System.out.println(new StandardPasswordEncoder().encode("admin"));
    }
}
