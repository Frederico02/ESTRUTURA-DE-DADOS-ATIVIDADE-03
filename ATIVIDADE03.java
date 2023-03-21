import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Passo 1
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        // Passo 2
        Stack<Integer> pilha = new Stack<>();
        while (!lista.isEmpty()) {
            pilha.push(lista.remove(0));
        }

        // Passo 3
        LinkedList<Integer> fila = new LinkedList<>();
        while (!pilha.empty()) {
            fila.offer(pilha.pop());
        }

        // Passo 4
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        // Passo 5
        pilha.clear();
        while (!lista.isEmpty()) {
            pilha.push(lista.remove(0));
        }

        LinkedList<Integer> fila2 = new LinkedList<>();
        while (!pilha.empty()) {
            fila2.offer(pilha.pop());
        }

        fila.addAll(fila2);

        // Passo 6
        System.out.println(fila);
    }
}
