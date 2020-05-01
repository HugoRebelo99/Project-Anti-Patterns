public class Pessoa {

    private String nome;
    private int idade;
    private String morada;
    private String contribuinte;

    public Pessoa(String nome, int idade, String morada, String contribuinte) throws PessoaNotValidatedException {
        if(idade < 0 || nome.equals("") || morada.equals("") || contribuinte.equals(""))
            throw new PessoaNotValidatedException();
        this.nome = nome;
        this.idade = idade;
        this.morada = morada;
        this.contribuinte = contribuinte;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMorada() {
        return morada;
    }

    public String getContribuinte(){ return contribuinte; }

    public void Envelhecer(){
        this.idade++;
        System.out.println("Parabéns, estás a ficar velho.");
    }
}
