package exestacionamento;

import javax.swing.JOptionPane;

public class Exestacionamento {

    public static void main(String[] args) {
     estacClasse conteudo = new estacClasse();
     
     conteudo.setCarroModelo(JOptionPane.showInputDialog("Coloque o modelo do seu carro: "));
     conteudo.setPlacaCarro(JOptionPane.showInputDialog("Coloque a placa do seu carro: "));
     conteudo.setHoraEntrada(Double.parseDouble(JOptionPane.showInputDialog("Coloque a hora de sua entrada: ")));
     conteudo.setHoraSaida(Double.parseDouble(JOptionPane.showInputDialog("Coloque a hora de sua saida: ")));
     
     conteudo.tempoGasto(conteudo.getHoraEntrada(),conteudo.getHoraSaida());
     conteudo.preco(conteudo.getTemp());
     conteudo.notaFiscal(conteudo.getCarroModelo(),conteudo.getHoraEntrada(),conteudo.getHoraSaida(),conteudo.getPlacaCarro(),conteudo.getTemp(),conteudo.getValor());
    }
}