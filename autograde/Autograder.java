package autograde;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Autograder {
    
    public static void main(String[] args) {
        if (args.length == 0) {
            fail("Modo nao informado. Use: ex1 | ex2 | ex3 | ex4 | ex5 | ex6");
        }

        try {
            String mode = args[0].trim().toLowerCase();
            switch (mode) {
                case "ex1":
                    testEx1();
                    break;
                case "ex2":
                    testEx2();
                    break;
                case "ex3":
                    testEx3();
                    break;
                case "ex4":
                    testEx4();
                    break;
                case "ex5":
                    testEx5();
                    break;
                case "ex6":
                    testEx6();
                    break;
                default:
                    fail("Modo invalido: " + mode);
            }
            pass();
        } catch (AssertionError e) {
            fail(e.getMessage());
        } catch (Exception e) {
            fail("Erro ao executar avaliacao: " + e.getMessage());
        }
    }

    private static void testEx1() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("progressaoGeometrica", int.class);

    
        Object result = method.invoke(null, 3);
        if (!(result instanceof int[])) {
            throw new AssertionError("progressaoGeometrica deve retornar int[]");
        }

        int[] values = (int[]) result;
        assertTrue(values.length == 10, "progressaoGeometrica deve retornar vetor de 10 elementos");
        assertTrue(values[0] == 3, "Primeiro elemento deve ser o valor informado");
        assertTrue(values[1] == 6, "Segundo elemento deve ser o dobro do primeiro");
        assertTrue(values[2] == 12, "Terceiro elemento deve ser o dobro do segundo");
        assertTrue(values[9] == 1536, "Ultimo elemento deve ser 1536 para valor inicial 3");

  
        Object resultInvalid = method.invoke(null, 25);
        assertTrue(resultInvalid == null, "Deve retornar null para valor > 20");
    }

    private static void testEx2() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("sequenciaDecrescente", int.class);


        Object result = method.invoke(null, 50);
        if (!(result instanceof int[])) {
            throw new AssertionError("sequenciaDecrescente deve retornar int[]");
        }

        int[] values = (int[]) result;
        assertTrue(values.length == 10, "sequenciaDecrescente deve retornar vetor de 10 elementos");
        assertTrue(values[0] == 50, "Primeiro elemento deve ser o valor informado");
        assertTrue(values[1] == 49, "Segundo elemento deve ser o anterior - 1");
        assertTrue(values[9] == 41, "Ultimo elemento deve ser 41 para valor inicial 50");

  
        Object resultInvalid = method.invoke(null, 1);
        assertTrue(resultInvalid == null, "Deve retornar null para valor <= 1");
    }

    private static void testEx3() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("vetorDinamico", int.class);

   
        Object result = method.invoke(null, 5);
        if (!(result instanceof int[])) {
            throw new AssertionError("vetorDinamico deve retornar int[]");
        }

        int[] values = (int[]) result;
        assertTrue(values.length == 5, "vetorDinamico deve retornar vetor com tamanho informado");
        assertTrue(values[0] == 1, "Primeiro elemento deve ser 1");
        assertTrue(values[4] == 5, "Ultimo elemento deve ser igual ao tamanho");

     
        Object resultInvalid = method.invoke(null, 1001);
        assertTrue(resultInvalid == null, "Deve retornar null para tamanho > 1000");
    }

    private static void testEx4() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method1 = clazz.getMethod("sequenciaCresenteComSoma", int.class);
        Method method2 = clazz.getMethod("calcularSoma", int[].class);

       
        Object result = method1.invoke(null, 10);
        if (!(result instanceof int[])) {
            throw new AssertionError("sequenciaCresenteComSoma deve retornar int[]");
        }

        int[] values = (int[]) result;
        assertTrue(values.length == 10, "sequenciaCresenteComSoma deve retornar vetor de 10 elementos");
        assertTrue(values[0] == 10, "Primeiro elemento deve ser o valor informado");
        assertTrue(values[1] == 11, "Segundo elemento deve ser o anterior + 1");
        assertTrue(values[9] == 19, "Ultimo elemento deve ser 19 para valor inicial 10");

    
        int soma = (int) method2.invoke(null, values);
        assertTrue(soma == 145, "Soma dos elementos deve ser 145 para sequencia iniciando em 10");
    }

    private static void testEx5() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("matrizIncrementais", int.class);

     
        Object result = method.invoke(null, 4);
        if (!(result instanceof int[][])) {
            throw new AssertionError("matrizIncrementais deve retornar int[][]");
        }

        int[][] matriz = (int[][]) result;
        assertTrue(matriz.length == 4, "Matriz deve ter tamanho 4x4");
        assertTrue(matriz[0].length == 4, "Matriz deve ter tamanho 4x4");
        assertTrue(matriz[0][0] == 5, "Primeiro elemento deve ser tamanho + 1");
        assertTrue(matriz[3][3] == 20, "Ultimo elemento deve ser sequencial");
    }

    private static void testEx6() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("operacaoEntreMatrizes", int.class);

        // Teste com tamanho 4
        Object result = method.invoke(null, 4);
        if (!(result instanceof int[][][])) {
            throw new AssertionError("operacaoEntreMatrizes deve retornar int[][][]");
        }

        int[][][] matrizes = (int[][][]) result;
        assertTrue(matrizes.length == 3, "Deve retornar 3 matrizes (N, Z, Soma)");
        
        int[][] N = matrizes[0];
        int[][] Z = matrizes[1];
        int[][] soma = matrizes[2];
        
        assertTrue(N.length == 4, "Matriz N deve ter tamanho 4x4");
        assertTrue(Z.length == 4, "Matriz Z deve ter tamanho 4x4");
        assertTrue(soma.length == 4, "Matriz Soma deve ter tamanho 4x4");
        
      
        assertTrue(Arrays.deepEquals(N, Z), "Matrizes N e Z devem ser iguais");
        

        assertTrue(soma[0][0] == N[0][0] + Z[0][0], "Soma deve ser N + Z");
        assertTrue(soma[3][3] == N[3][3] + Z[3][3], "Soma deve ser N + Z em todas as posicoes");
    }

    private static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static void pass() {
        System.out.println("OK!");
    }

    private static void fail(String message) {
        System.out.println("FAIL: " + message);
        System.exit(1);
    }
}
