package exestacionamento;

import javax.swing.JOptionPane;

public class estacClasse {
    
        public double horaEntrada;
        public double horaSaida;
        public double valor;
        public double temp;
        public String carroModelo;
        public String placaCarro;
        
    public double getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(double horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public double getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(double horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCarroModelo() {
        return carroModelo;
    }

    public void setCarroModelo(String carroModelo) {
        this.carroModelo = carroModelo;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
        
    public double tempoGasto(double horaEntrada, double horaSaida){
    this.temp = this.horaSaida - this.horaEntrada;
    return this.temp;
    }   
    
    public double preco(double temp){
        this.valor = Math.ceil(temp);
        this.valor = this.valor * 4;
        return this.valor;
    }
    
    public void notaFiscal(String carroModelo, double horaEntrada, double horaSaida, String placaCarro, double temp, double valor) {
        JOptionPane.showMessageDialog(null,"Modelo do carro: "+ this.carroModelo
        +"\nPlaca do carro: "+ this.placaCarro
        +"\nHora de entrada: "+ this.horaEntrada
        +"\nHora de saida: "+ this.horaSaida
        +"\nTempo estacionado: "+ this.temp + " horas"
        +"\nValor à pagar: "+ this.valor +" reais");
    }
}
