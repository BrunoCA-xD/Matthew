/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matthew.model.vo;

/**
 *
 * @author bruno
 */
public class ResultadosVO {

    private String sNome;
    private double dValor;

    public ResultadosVO() {
    }

    public ResultadosVO(String sNome, double dValor) {
        this.sNome = sNome;
        this.dValor = dValor;
    }

    public double getdValor() {
        return dValor;
    }

    public String getsNome() {
        return sNome;
    }

}
