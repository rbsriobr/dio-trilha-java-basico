package Servicos;

public class ServicosCelular implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    private String nomeMusica = "";
    private String url = "";
    private boolean novaAbaAdic = false;
    private boolean musicaTocando = false;

    public void atender() {
        System.out.println("Atender telefone");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }
    public void ligar(String numero) {
        System.out.println("Ligar para número: " + numero);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
        this.novaAbaAdic = true;
    }

    public void atualizarPagina() {
        if(novaAbaAdic){
            if(url.equals("")){
                System.out.println("Nenhuma pagina exibida");
            }
            else{
                System.out.println("Atualizar página");
            }
        }
        else {
            System.out.println("Nenhuma aba adicionada");
        }
    }

    public void exibirPagina(String url) {
        if(novaAbaAdic){
            System.out.println("Exibir página: " + url);
            this.url = url;
        }
        else {
            System.out.println("Nenhuma aba adicionada");
        }
    }

    public void pausar() {
        if(!musicaTocando)
        {
            System.out.println("Nenhuma música tocando");
            musicaTocando = false;
        }
        else {
            // if(nomeMusica.equals("")){
            //     System.out.println("Nenhuma música selecionada");
            // }
            // else{
                System.out.println("Pausar musica");
            //}
        }
    }

    public void selecionarMusica(String nomeMusica) {
        System.out.println("Musica selecionada");
        this.nomeMusica = nomeMusica;
    }

    public void tocar() {
        if(nomeMusica.equals("")){
            System.out.println("Nenhuma música selecionada");
        }
        else{
            musicaTocando = true;
            System.out.println("Tocar musica: " + nomeMusica);
        }
    }
}
