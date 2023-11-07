import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTest{

    Pessoa pessoa;

    @BeforeEach
    void setUp(){
        this.pessoa = new Pessoa();
    }

    @Test
    void dizerOlaTest(){
        assertEquals(pessoa.dizerOla(), "Olá, maven!");
    }

    

}
