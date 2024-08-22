import Servicos.ServicosCelular;

public class IPhone {
    public static void main(String[] args) throws Exception {
        ServicosCelular serv = new ServicosCelular();
        serv.ligar("21 1234-5678");
        serv.tocar();
        serv.selecionarMusica("Mozart");
        serv.tocar();
        serv.atender();
        serv.exibirPagina("www.dio.me");
        serv.adicionarNovaAba();
        serv.exibirPagina("www.dio.me");
        serv.atualizarPagina();
    }
}
