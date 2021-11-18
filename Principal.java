import java.util.*;

import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        List<Item> listItens =  new ArrayList<>();

        String menu = "1-Adicionar um item à coleção\n2-Exibir coleção de itens\n3-Exibir valor da coleção\n0-Sair";
        int options;
        int optionsCaseOne;
        double valor;

        do{
            options = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (options) {
                case 1:
                optionsCaseOne = Integer.parseInt(JOptionPane.showInputDialog("1-Moeda\n2-Selo Regular\n3- Selo Comemorativo"));
                valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do item"));

                    switch (optionsCaseOne) {
                        case 1:
                            listItens.add(new Moeda(valor));
                            break;

                        case 2:
                            listItens.add(new SeloRegular("Selo Regular", valor));
                            break;
                       
                        case 3:
                            listItens.add(new SeloComemorativo("Selo Comemorativo", valor));
                            break;
                    }
                    break;

                case 2:
                    for(Item item : listItens) {
                        item.exibir();
                    }
                    break;

                case 3:
                double result = 0;
                    for (Item item : listItens) {
                        result = result + item.getValor();
                    }
                    JOptionPane.showMessageDialog(null,String.format("Valor da coleção: R$%.2f", result));
                    break;
            }
        }while(options!=0);
    }
}
