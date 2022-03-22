package todo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTodo {
    public static ArrayList<Todo> todoList = new ArrayList<>();

    public static void main(String[] args) {
        imprimeTela();

    }


    public static void imprimeTela(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----Todo App---------");
        System.out.println("digite uma das opcoes abaixo: ");
        System.out.println("[1] - listar todos ");
        System.out.println("[2] - Voltar para tela inicial ");
        System.out.println("[3] - Adicionar todo; ");
        System.out.println("[4] - concluir todo; ");

        switch (entrada.nextInt()) {
            case 1:
                listaTodos();
                break;
            case 2:
                imprimeTela();
                break;
            case 3:
                criarTodo();
                break;
            case 4:
                atualizaTodo();
                break;
        }
    }
    public static void criarTodo(){
        limpaTela();
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        Todo todo = new Todo();
        int op = 1;

        System.out.println("---Adicionar Todo ----");
        System.out.println("digite o id: ");
        todo.setId(entrada.nextInt());
        System.out.println("digite o todo: ");
        todo.setTodo(entradaString.nextLine());

        todoList.add(todo);
        System.out.println("todo adicionado com sucesso!");
        System.out.println();
        System.out.println();
        imprimeTela();

    }
    public static void listaTodos(){
        Scanner entrada = new Scanner(System.in);
        limpaTela();
        System.out.println("---Todos Adicionados ---");

        for (Todo todo : todoList){
            var concluido  = todo.getDone()? "Concluido": "não concluído";
            System.out.println(todo.getId() + todo.getTodo() + " : " + concluido );

        }

        System.out.println("---[1] - Voltar a tela Inicial ---");
        switch (entrada.nextInt()){
            case 1:
                limpaTela();
                imprimeTela();
        }
    }
    public static void atualizaTodo(){
        Scanner entrada = new Scanner(System.in);
        Todo todo = new Todo();
        System.out.println("digite o id do todo que deseja concluir: ");
        for(int i = 0; i < todoList.size(); i++){
            if(!todoList.get(i).getDone()){
                System.out.println("id: " + i + " - " + todoList.get(i).getTodo());
            }
        }
        int todoId = entrada.nextInt();
        todo.setId(todoList.get(todoId).getId());
        todo.setTodo(todoList.get(todoId).getTodo());
        todo.setDone(true);
        todoList.set(todoId,todo);

        System.out.println("todo concluido ");
        imprimeTela();
    }
    public static void limpaTela(){
        for(int i = 0; i < 100; i++)
        {
            System.out.println("");
        }
    }
}
