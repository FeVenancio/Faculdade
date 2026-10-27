package calculadora;
/*
    Implementa operações matemáticas básicas.
    @author Felipe Sanches Venâncio
    @version 1.0
*/
public class Calculadora {
    /*
        Executa uma operação matemática entre dois números inteiros.
        @param a primeiro número da operação
        @param b segundo número da operação
        @param op operador matemático (+, -, * ou /)
        @return mensagem contendo o resultado ou a descrição do erro
     */
    public String calc(int a, int b, String op) {

        // Verifica se o operador é válido e executa a operação.
        if ("+".equals(op)) {
            return "O resultado é: " + (a + b);

        } else if ("-".equals(op)) {
            return "O resultado é: " + (a - b);

        } else if ("*".equals(op)) {
            return "O resultado é: " + (a * b);

        } else if ("/".equals(op)) {

            // O divisor é o segundo número: b.
            if (b == 0) {
                return "Não é possível divisão por 0";
            }

            return "O resultado é: " + (a / b);

        } else {
            return "Operador inválido, tente (+, -, / ou *)";
        }
    }
}
