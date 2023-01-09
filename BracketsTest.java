import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsTest {

    @Test
    public void testBrackets1() {
        String line = "()";
        assertTrue(Brackets.brackets(line));
    }

    @Test
    public void testBrackets2() {
        String line = "Здесь нет скобок";
        assertTrue(Brackets.brackets(line));

    }

    @Test
    public void testBrackets3() {
        String line = "()[{]}";
        assertFalse(Brackets.brackets(line));
    }

    @Test
    public void testBrackets4() {
        String line = "())";
        assertFalse(Brackets.brackets(line));
    }

    @Test
    public void testBrackets5() {
        String line = "(()";
        assertFalse(Brackets.brackets(line));
    }
    // Решение: По завершеннии каждой операции по поиску соответствия нужно убрать из стека пару, прошедшую проверку:
    // Так должны выглядить наши "case":
    /*case '}' : if (stack.isEmpty() || stack.peek() != '{'){
        flag = false;
        break;
    } else  {
        stack.pop();
        break;
    }
    
    if (!stack.isEmpty()){  // Чтоб убедиться, что не осталось непарных открывающих скобок
            flag= false;
    */

    // Ниже еще одна проверка, чтоб убедиться в некорректности работы первоначального метода

    @Test
    public void testeBrackets6() {
        String line = "(()[[]{{{}";
        assertFalse(Brackets.brackets(line));
    }


}