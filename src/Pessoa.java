public class Pessoa {

    private String nome;
    private int idade;
    private String morada;

    public Pessoa(String nome, int idade, String morada) throws PessoaNotValidatedException {
        if(idade < 0 || nome.equals("") || morada.equals(""))
            throw new PessoaNotValidatedException();
        this.nome = nome;
        this.idade = idade;
        this.morada = morada;
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

    public void Envelhecer(){
        this.idade++;
        System.out.println("Parabéns, estás a ficar velho.");
    }
}
