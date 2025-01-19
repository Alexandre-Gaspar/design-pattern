package patterns.builder;

/**
 * Classe de teste para demonstrar o uso do padrão de projeto Builder na criação de objetos {@link User}.
 */
public class BuilderPatternTest {

    /**
     * Método principal para executar os testes do padrão Builder.
     * Cria instâncias de {@link User} usando o {@link User.Builder} com diferentes combinações de atributos.
     *
     * @param args argumentos de linha de comando (não utilizados neste exemplo)
     */
    public static void main(String[] args) {

        // Criação de um usuário com todos os atributos definidos
        var person = User.Builder.aUser()
                .name("Alex")
                .surname("Gaspar")
                .address("Cacuaco, Kikolo")
                .email("alex@dev.com")
                .phone("935555500")
                .build();

        // Criação de usuário com alguns atributos definidos
        var person1 = User.Builder.aUser()
                .name("Vector")
                .surname("Elias")
                .phone("935555500")
                .build();

        // Criação de um usuário com apenas um atributo definido
        var person3 = User.Builder.aUser()
                .name("Vector")
                .build();

        // Exibição dos objetos criados
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person3);
    }
}
