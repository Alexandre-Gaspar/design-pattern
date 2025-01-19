package patterns.builder;

/**
 * Representa uma usuário com atributos básicos como nome, sobrenome, endereço, telefone e e-mail.
 * Esta classe utiliza o padrão de projeto Builder para a criação de suas instâncias.
 */
public class User {
    private String name;
    private String surname;
    private String address;
    private String phone;
    private String email;

    /**
     * Construtor privado da classe Usuário.
     * Somente acessível pelo Builder.
     *
     * @param name    o nome da pessoa
     * @param surname o sobrenome da pessoa
     * @param address o endereço da pessoa
     * @param phone   o telefone da pessoa
     * @param email   o e-mail da pessoa
     */
    private User(String name, String surname, String address, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Builder estático interno para criar instâncias de {@link User}.
     */
    public static class Builder {
        private String name;
        private String surname;
        private String address;
        private String phone;
        private String email;

        /**
         * Construtor privado da classe Builder.
         * Para obter uma instância de {@link Builder}, use o método estático {@link Builder#aUser()}.
         */
        private Builder() {}

        /**
         * Cria uma nova instância do Builder.
         *
         * @return uma nova instância de {@link Builder}
         */
        public static Builder aUser() {
            return new Builder();
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Cria uma nova instância de {@link User} com os valores definidos no Builder.
         *
         * @return uma nova instância de {@link User}
         */
        public User build() {
            return new User(name, surname, address, phone, email);
        }
    }

    /**
     * Retorna uma representação (em texto) de um usuário, apenas com atributos não nulos.
     *
     * @return uma string representando os atributos do usuário
     */
    @Override
    public String toString() {
        var sb = new StringBuilder("User{");
        if (name != null) sb.append("name='").append(name).append('\'');
        if (surname != null) sb.append(", surname='").append(surname).append('\'');
        if (address != null) sb.append(", address='").append(address).append('\'');
        if (phone != null) sb.append(", phone='").append(phone).append('\'');
        if (email != null) sb.append(", email='").append(email).append('\'');

        sb.append('}');

        return sb.toString();
    }
}

