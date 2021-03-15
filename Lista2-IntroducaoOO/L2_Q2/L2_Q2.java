/*
Universidade Federal Fluminense
Centro Tecnológico
Instituto de Computação
Curso de Graduação em Ciência da Computação
Disciplina: TCC00328 - Programação Orientada a Objetos
Prof.: Vânia de Oliveira Neves
Turma: B1
Aluno: Rene Cruz Freire
Matrícula: 819031057
Email: renefreire@id.uff.br
*/

/*
Lista de Exercícios 2
2 -  Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns
aniversários (aumentando a idade) e imprima seu nome e sua idade.
*/

public class L2_Q2 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.exibePessoa();
        pessoa.aniversario();
        pessoa.aniversario();
        pessoa.aniversario();
        pessoa.aniversario();
        pessoa.aniversario();
        pessoa.aniversario();
        pessoa.exibePessoa();
    }   
}
