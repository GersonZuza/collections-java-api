package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gerson", 123456);
        agendaContatos.adicionarContato("Gerson", 5665);
        agendaContatos.adicionarContato("Gerson Zuza", 111111);
        agendaContatos.adicionarContato("Gerson Java", 654987);
        agendaContatos.adicionarContato("Gerson Rocha", 1111111);
        agendaContatos.adicionarContato("Gerson", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Gerson Rocha");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Gerson Java"));
    }
}
