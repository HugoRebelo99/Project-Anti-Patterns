import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Testes {
    static Pessoa pessoa;

    @BeforeAll
    public static void setup() throws Exception {
        pessoa = new Pessoa("Ricardo", 20, "Esquina à direita como de quem vem da esquerda", "123456789");
        //System.out.println("Uma nova pessoa foi criada.");
    }

    //loudmouth, enumerator,anal probe,free ride
   /* @Test
    public void testPessoa1() throws NoSuchFieldException, IllegalAccessException {

        System.out.println("Teste que verifica o nome e a idade.");
        assertEquals("Ricardo", pessoa.getNome());
        System.out.println("Nome: " + pessoa.getNome());

        Field getIdade = Pessoa.class.getDeclaredField("idade");
        getIdade.setAccessible(true);

        int Idade = (int) getIdade.get(pessoa);
        assertEquals(21, Idade);
        System.out.println("Idade: " + Idade);
    }*/

    @Test
    public void testPessoaNome() throws NoSuchFieldException, IllegalAccessException {
        assertEquals("Ricardo", pessoa.getNome());
    }

    @Test
    public void testPessoaIdade() throws NoSuchFieldException, IllegalAccessException {
        assertEquals(21, pessoa.getIdade());
    }

    @Test
    public void testPessoaContribuinte(){
        assertEquals("123456789", pessoa.getContribuinte());
    }

    @Test //cucko e loudmouth
    public void testPessoaMorada() throws Exception {
        /*Pessoa p = new Pessoa("Hugo", 20, "Ali debaixo da ponte", "987654321");
        assertEquals("Ali debaixo da ponte", p.getMorada());
        System.out.println("Morada: " + p.getMorada());*/
        assertEquals("Esquina à direita como de quem vem da esquerda", pessoa.getMorada());
    }
    //slow poke
  /*  @Test
    public void largeDataSimulation() throws Exception {
        ArrayList<Integer> Data = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++){
            Data.add(i);
            Thread.sleep(100);
        }
        assertThrows(PessoaNotValidatedException.class, () ->{
            Pessoa pessoa = new Pessoa("David", 22, "", "123459876");
        });

    }*/
    @Test
    public void testPessoaException() throws Exception {
        assertThrows(PessoaNotValidatedException.class, () ->{
            Pessoa pessoa = new Pessoa("David", 22, "", "123459876");
        });

    }

    @Test
    public void testPessoaidadeException() throws Exception {
        assertThrows(PessoaNotValidatedException.class, () -> {
            pessoa = new Pessoa("Ricardo", -1, "Esquina à direita como de quem vem da esquerda", "123456789");
        });
    }



}
