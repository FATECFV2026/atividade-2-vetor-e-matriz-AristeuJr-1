

import java.util.Arrays;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        // TODO: Implementar menu interativo com as seguintes opcoes:
        // 1. Exercicio 01: Progressao Geometrica
        // 2. Exercicio 02: Sequencia Decrescente
        // 3. Exercicio 03: Vetor Dinamico
        // 4. Exercicio 04: Sequencia Crescente com Soma
        // 5. Exercicio 05: Matriz com Valores Incrementais
        // 6. Exercicio 06: Operacao entre Matrizes
        // 0. Sair
        
        // Utilize o método lerValor para validação de entrada
        // Exiba os resultados utilizando Arrays.toString() para vetores
        // Para matrizes, utilize o método exibirMatriz()
    }
    
    /**
     * Metodo auxiliar para ler e validar entrada do usuario
     * @param scanner Scanner para leitura
     * @param mensagem Mensagem a ser exibida
     * @param min Valor minimo (exclusivo)
     * @param max Valor maximo (inclusivo)
     * @return Valor valido lido
     */
    private static int lerValor(Scanner scanner, String mensagem, int min, int max) {
        // TODO: Implementar validacao de entrada
        // Deve repetir a leitura ate que o valor seja valido (min < valor <= max)
        return 0; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo auxiliar para exibir matriz formatada
     * @param matriz Matriz a ser exibida
     */
    private static void exibirMatriz(int[][] matriz) {
        // TODO: Implementar exibicao da matriz
        // Use System.out.printf("%4d ", matriz[i][j]) para formatacao
    }
    
    /**
     * Exercicio 01: Progressao Geometrica
     * @param valorInicial Valor inicial (deve ser <= 20)
     * @return Vetor de 10 elementos com progressao geometrica (dobro) ou null se invalido
     */
    public static int[] progressaoGeometrica(int valorInicial) {
        // TODO: Implementar progressao geometrica
        // Validar se valorInicial <= 20 (retornar null se invalido)
        // Criar vetor de 10 elementos
        // vetor[0] = valorInicial
        // Para i=1 ate 9: vetor[i] = vetor[i-1] * 2
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Exercicio 02: Sequencia Decrescente
     * @param valorInicial Valor inicial (deve ser > 1)
     * @return Vetor de 10 elementos com sequencia decrescente ou null se invalido
     */
    public static int[] sequenciaDecrescente(int valorInicial) {
        // TODO: Implementar sequencia decrescente
        // Validar se valorInicial > 1 (retornar null se invalido)
        // Criar vetor de 10 elementos
        // vetor[0] = valorInicial
        // Para i=1 ate 9: vetor[i] = vetor[i-1] - 1
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Exercicio 03: Vetor Dinamico
     * @param tamanho Tamanho do vetor (deve ser <= 1000)
     * @return Vetor com sequencia de 1 ate tamanho ou null se invalido
     */
    public static int[] vetorDinamico(int tamanho) {
        // TODO: Implementar vetor dinamico
        // Validar se tamanho <= 1000 (retornar null se invalido)
        // Criar vetor com tamanho especifico
        // Para i=0 ate tamanho-1: vetor[i] = i + 1
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Exercicio 04: Sequencia Crescente com Soma
     * @param valorInicial Valor inicial
     * @return Vetor de 10 elementos com sequencia crescente
     */
    public static int[] sequenciaCresenteComSoma(int valorInicial) {
        // TODO: Implementar sequencia crescente
        // Criar vetor de 10 elementos
        // vetor[0] = valorInicial
        // Para i=1 ate 9: vetor[i] = vetor[i-1] + 1
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Calcula a soma de todos os elementos do vetor
     * @param vetor Vetor para calcular a soma
     * @return Soma de todos os elementos
     */
    public static int calcularSoma(int[] vetor) {
        // TODO: Implementar calculo da soma
        // Percorrer o vetor e somar todos os elementos
        return 0; // Remover esta linha apos implementacao
    }
    
    /**
     * Exercicio 05: Matriz com Valores Incrementais
     * @param tamanho Tamanho da matriz quadrada
     * @return Matriz NxN com valores incrementais iniciando em tamanho+1
     */
    public static int[][] matrizIncrementais(int tamanho) {
        // TODO: Implementar matriz com valores incrementais
        // Criar matriz quadrada NxN
        // Contador inicial = tamanho + 1
        // Para cada posicao [i][j]: matriz[i][j] = contador++
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Exercicio 06: Operacao entre Matrizes
     * @param tamanho Tamanho das matrizes quadradas
     * @return Array com 3 matrizes: [0]=N, [1]=Z, [2]=Soma
     */
    public static int[][][] operacaoEntreMatrizes(int tamanho) {
        // TODO: Implementar operacao entre matrizes
        // Criar 3 matrizes NxN: matrizN, matrizZ, matrizSoma
        // Contador inicial = tamanho + 1
        // Para cada posicao [i][j]:
        //   matrizN[i][j] = contador
        //   matrizZ[i][j] = contador (valores iguais)
        //   matrizSoma[i][j] = matrizN[i][j] + matrizZ[i][j]
        //   contador++
        // Retornar array com as 3 matrizes
        return null; // Remover esta linha apos implementacao
    }
    
    // ========================================
    // METODOS REQUERIDOS PELO AUTOGRADER
    // NAO REMOVER - Necessarios para avaliacao automatica
    // ========================================
    
    /**
     * Metodo ex01 para compatibilidade com autograder
     * @return resultado do exercicio 01
     */
    public static int[] ex01() {
        // TODO: Implementar leitura de entrada e chamar progressaoGeometrica()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex02 para compatibilidade com autograder
     * @return resultado do exercicio 02
     */
    public static int[] ex02() {
        // TODO: Implementar leitura de entrada e chamar sequenciaDecrescente()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex03 para compatibilidade com autograder
     * @return resultado do exercicio 03
     */
    public static int[] ex03() {
        // TODO: Implementar leitura de entrada e chamar vetorDinamico()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex04 para compatibilidade com autograder
     * @return resultado do exercicio 04
     */
    public static int[] ex04() {
        // TODO: Implementar leitura de entrada e chamar sequenciaCresenteComSoma()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex05 para compatibilidade com autograder
     * @return resultado do exercicio 05
     */
    public static int[][] ex05() {
        // TODO: Implementar leitura de entrada e chamar matrizIncrementais()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex06 para compatibilidade com autograder
     * @return resultado do exercicio 06
     */
    public static int[][][] ex06() {
        // TODO: Implementar leitura de entrada e chamar operacaoEntreMatrizes()
        return null; // Remover esta linha apos implementacao
    }
}
