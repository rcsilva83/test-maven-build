import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testMain() {
        // Teste simples para garantir que o método main não lança exceção
        assertDoesNotThrow(() -> Main.main(new String[] {}));
    }
}
