package creational.builder;

public class Client {

    private String name;

    private String surname;

    private String mail;

    private String password;

    public Client(ClientBuilder builder) {
        this.name = builder.getName();
        this.surname = builder.getSurname();
        this.mail = builder.getMail();
        this.password = builder.getPassword();
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class ClientBuilder
    {

        private String name;

        private String surname;

        private String mail;

        private String password;

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getMail() {
            return mail;
        }

        public String getPassword() {
            return password;
        }

        public ClientBuilder name(String name)
        {
            this.name=name;
            return this;
        }

        public ClientBuilder surname(String surname)
        {
            this.surname=surname;
            return this;
        }

        public ClientBuilder mail(String mail)
        {
            this.mail=mail;
            return this;
        }

        public ClientBuilder password(String password)
        {
            this.password=password;
            return this;
        }

        public Client build()
        {
            return new Client(this);
        }


    }
}
