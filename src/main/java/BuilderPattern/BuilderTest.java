package BuilderPattern;

/**
 * Created by volodya on 12.07.15.
 */
public class BuilderTest {

    public static void main(String[] args) {
        Client client = new Client.ClientBuilder()
                .name("Volodya")
                .surname("Krajetsky")
                .mail("@gmail.com")
                .password("123456789")
                .build();
        System.out.println(client.toString());
    }
}
