public interface Comunicator
{

    default void enviaMensagem(String mensagem)
    {
        System.out.println(mensagem);
    };

}
