/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Marcos Felipe
 */
public class AbstractFactory {

    public static void main(String[] args) {
        PagamentosFactory pagamentoMoip = new MoipFactory();
        Boleto boletoMoip = pagamentoMoip.gerarBoleto();
        System.out.println(boletoMoip.dadosBoleto());
        
        PagamentosFactory pagamentoPagSeguro = new PagSeguroFactory();
        Boleto boletoPagSeguro = pagamentoPagSeguro.gerarBoleto();
        System.out.println(boletoPagSeguro.dadosBoleto());
    }
}
