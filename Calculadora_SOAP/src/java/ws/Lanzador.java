/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.xml.ws.Endpoint;

public class Lanzador {

    public final static String urlCalculadoraWS = "http://localhost:8888/calculadora";

    public static void main(String[] args) {
        Endpoint.publish(urlCalculadoraWS, new WSDOperaciones());
        System.out.println("Servicio Web en espera en "+urlCalculadoraWS);        
    }
}
    