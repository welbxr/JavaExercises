

void main()
{
    Comunicator sms = new Comunicator() {
        @Override
        public void enviaMensagem(String mensagem) {
            Comunicator.super.enviaMensagem(mensagem);
        }
    };

    Comunicator email = new Comunicator() {
        @Override
        public void enviaMensagem(String mensagem) {
            Comunicator.super.enviaMensagem(mensagem);
        }
    };

    Comunicator socialMedia = new Comunicator() {
        @Override
        public void enviaMensagem(String mensagem) {
            Comunicator.super.enviaMensagem(mensagem);
        }
    };

    Comunicator whatsApp = new Comunicator() {
        @Override
        public void enviaMensagem(String mensagem) {
            Comunicator.super.enviaMensagem(mensagem);
        }
    };

    sms.enviaMensagem("Você tem 15 mensagens na caixa postal");
    email.enviaMensagem("Reunião marcada para o dia 25/01");
    socialMedia.enviaMensagem("Como você tá??");
    whatsApp.enviaMensagem("A gente se vê sábado então");

}
