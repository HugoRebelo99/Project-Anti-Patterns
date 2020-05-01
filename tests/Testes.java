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
        assertThrows(PessoaNotValidatedException.class, () -> {
            pessoa = new Pessoa("Ricardo", -1, "Esquina à direita como de quem vem da esquerda", "123456789");
        });

        assertDoesNotThrow(() -> {
            pessoa = new Pessoa("Ricardo", 20, "Esquina à direita como de quem vem da esquerda", "123456789");
        });
        System.out.println("Uma nova pessoa foi criada.");
    }

    @Test
    public void testPessoa1() throws NoSuchFieldException, IllegalAccessException {

        System.out.println("Teste que verifica o nome e a idade.");
        assertEquals("Ricardo", pessoa.getNome());
        System.out.println("Nome: " + pessoa.getNome());

        Field getIdade = Pessoa.class.getDeclaredField("idade");
        getIdade.setAccessible(true);

        int Idade = (int) getIdade.get(pessoa);
        assertEquals(21, Idade);
        System.out.println("Idade: " + Idade);
    }

    @Test
    public void testPessoa2(){
        assertEquals("123456789", pessoa.getContribuinte());
    }

    @Test
    public void testPessoaMorada() throws Exception {
        Pessoa p = new Pessoa("Hugo", 20, "Ali debaixo da ponte", "987654321");
        assertEquals("Ali debaixo da ponte", p.getMorada());
        System.out.println("Morada: " + p.getMorada());
    }

    @Test
    public void largeDataSimulation() throws Exception {
        ArrayList<Integer> Data = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++){
            Data.add(i);
            Thread.sleep(100);
        }
        assertThrows(PessoaNotValidatedException.class, () ->{
            Pessoa pessoa = new Pessoa("David", 22, "", "123459876");
        });

    }

}
