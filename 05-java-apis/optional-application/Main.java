import java.util.Optional;
import domain.User;
import domain.UserV2;
import static domain.SexEnum.FEMALE;
import static domain.SexEnum.MALE;

void main()
{

    // Utilizando a classe optional, é possível trabalhar com valores nulos sem quebrar o código,
    // abaixo segue alguns exemplos de funções dessa classe e como se deve tratar possíveis valores nulos.

    Optional<User> optional = Optional.ofNullable(new User("João", 18, MALE));
    //Optional<User> optional = Optional.empty();

    Optional<UserV2> newUser = optional.map(user -> toV2Domain(user));
    System.out.println(newUser.orElseThrow());
}

private static UserV2 toV2Domain(User user) {
    return new UserV2(user.name(), user.age(), user.sex());
}

public static User defaultUser()
{
    System.out.println("Buscando valor default");
    return new User("Maria", 22, FEMALE);
};