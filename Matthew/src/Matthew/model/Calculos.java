package Matthew.model;

import Matthew.model.vo.ResultadosVO;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Calculos {

    //Balanço Patrimonial
    private double dCaixaEqui;
    private double dEstoque;
    private double dContaReceber;
    private double dAtivoCirculante;
    private double dAtivoTotal;
    private double dEmprestimos;
    private double dPatrimonioLiq;
    private double dPassivoCirculante;
    private double dPassivoPermanente;
    private double dResultadoFinanceiro;
    //DRE 
    private double dReceitaBruta;
    private double dCustoMercadoriaVendida;
    private double dDespesas;
    private double dLucroAImpostos;
    private double dResultadoOp;
    private double dLucroBruto;
    private double dLucroPerda;

    public String[] sListaContas = {"Liquidez corrente", "Liquidez imediata", "Capital de giro rapido",
        "Indice de Liquidez Geral", "indice de giro do estoque", "Prazo de recebimento",
        "giro de ativo", "endividamento geral", "Endividamento à curto prazo",
        "Margem de lucro", "Margem Operacional", "margem Bruta",
        "Retorno do Ativo", "Retorno do Patrimônio Liquido", "Grau de alavancagem Operacional", "grau de alavancagem Financeira"
    };

    double[] dResultados = new double[sListaContas.length];

    public void setdEstoque(double dEstoque) {
        this.dEstoque = dEstoque;
    }

    public void setdLucroOpBruto(double dLucroOpBruto) {
        this.dLucroBruto = dLucroOpBruto;
    }

    public void setdReceitaOpBruta(double dReceitaOpBruta) {
        this.dReceitaBruta = dReceitaOpBruta;
    }

    public void setdResultadoOp(double dReceitaOpLiquida) {
        this.dResultadoOp = dReceitaOpLiquida;
    }

    public void setdContaReceber(double dContaReceber) {
        this.dContaReceber = dContaReceber;
    }

    public void setdCustoMercadoriaVendida(double dCustoMercadoriaVendida) {
        this.dCustoMercadoriaVendida = dCustoMercadoriaVendida;
    }

    private void liquidezCorrente() {
        dResultados[0] = dAtivoCirculante / dPassivoCirculante;
    }

    private void liquidezImediata() {
        dResultados[1] = dCaixaEqui / dPassivoCirculante;
    }

    private void capitalGiroRapido() {
        dResultados[2] = (dAtivoCirculante - dEstoque) / dPassivoCirculante;
    }

    private void liquidezGeral() {
        dResultados[3] = dAtivoTotal / (dPassivoCirculante + dPassivoPermanente);
    }

    private void giroEstoque() {
        dResultados[4] = dCustoMercadoriaVendida / dEstoque;
    }

    private void prazoMedioRecebimento() {
        dResultados[5] = (dContaReceber * 360) / dReceitaBruta;
    }

    private void giroAtivo() {
        dResultados[6] = dReceitaBruta / dAtivoTotal;
    }

    private void endividamentoGeral() {
        //total de passivo  = passivoCirculante + passivoPermanente
        dResultados[7] = ((dPassivoCirculante + dPassivoPermanente) / dPatrimonioLiq)*100;
    }

    private void endividamentoCurtoPrazo() {
        dResultados[8] = (dPassivoCirculante / dPatrimonioLiq)*100;
    }

    private void margemLucro() {
        dResultados[9] = (dLucroPerda / dReceitaBruta)*100;
    }

    private void margemOperacional() {
        // oq é Resultado Operacional Antes do Resultado Financeiro (custos)
        dResultados[10] = (dResultadoOp /  dReceitaBruta)*100;
    }

    private void margemBruta() {
        dResultados[11] = (dLucroBruto / dReceitaBruta)*100;
    }

    private void retornoAtivo() {
        dResultados[12] = dLucroPerda / dAtivoTotal;
    }

    private void retornoPatrimonioLiq() {
        dResultados[13] = dLucroPerda / dPatrimonioLiq;
    }

    private void alavancagemOp() {
        dResultados[14] = dLucroBruto / dResultadoOp;
    }

    private void alavancagemFinanceira() {
        //lucro antes dos impostos == margem liquida TRUE
        dResultados[15] = dResultadoOp / dLucroAImpostos;
    }

    public double[] getdResultados() {
        return dResultados;
    }

    public List<ResultadosVO> Calcular() {
        liquidezCorrente();
        liquidezImediata();
        capitalGiroRapido();
        liquidezGeral();
        giroEstoque();
        prazoMedioRecebimento();
        giroAtivo();
        endividamentoGeral();
        endividamentoCurtoPrazo();
        margemLucro();
        margemOperacional();
        margemBruta();
        retornoAtivo();
        retornoPatrimonioLiq();
        alavancagemOp();
        alavancagemFinanceira();
        
        

        List<ResultadosVO> res = new ArrayList<>();
        int i = 0;
        for (double dResultado : dResultados) {
            res.add(new ResultadosVO(sListaContas[i], dResultado));
            i++;
        }
        return res;
    }

    public double getdCaixaEqui() {
        return dCaixaEqui;
    }

    public void setdCaixaEqui(double dCaixaEqui) {
        this.dCaixaEqui = dCaixaEqui;
    }

    public double getdAtivoCirculante() {
        return dAtivoCirculante;
    }

    public void setdAtivoCirculante(double dAtivoCirculante) {
        this.dAtivoCirculante = dAtivoCirculante;
    }

    public double getdAtivoTotal() {
        return dAtivoTotal;
    }

    public void setdAtivoTotal(double dAtivoTotal) {
        this.dAtivoTotal = dAtivoTotal;
    }

    public double getdEmprestimos() {
        return dEmprestimos;
    }

    public void setdEmprestimos(double dEmprestimos) {
        this.dEmprestimos = dEmprestimos;
    }

    public double getdPatrimonioLiq() {
        return dPatrimonioLiq;
    }

    public void setdPatrimonioLiq(double dPatrimonioLiq) {
        this.dPatrimonioLiq = dPatrimonioLiq;
    }

    public double getdPassivoCirculante() {
        return dPassivoCirculante;
    }

    public void setdPassivoCirculante(double dPassivoCirculante) {
        this.dPassivoCirculante = dPassivoCirculante;
    }

    public double getdPassivoPermanente() {
        return dPassivoPermanente;
    }

    public void setdPassivoPermanente(double dPassivoPermanente) {
        this.dPassivoPermanente = dPassivoPermanente;
    }

    public double getdReceitaBruta() {
        return dReceitaBruta;
    }

    public void setdReceitaBruta(double dReceitaBruta) {
        this.dReceitaBruta = dReceitaBruta;
    }

    public double getdDespesas() {
        return dDespesas;
    }

    public void setdDespesas(double dDespesas) {
        this.dDespesas = dDespesas;
    }

    public double getdLucroAImpostos() {
        return dLucroAImpostos;
    }

    public void setdLucroAImpostos(double dLucroAImpostos) {
        this.dLucroAImpostos = dLucroAImpostos;
    }

    public double getdLucroBruto() {
        return dLucroBruto;
    }

    public void setdLucroBruto(double dLucroBruto) {
        this.dLucroBruto = dLucroBruto;
    }

    public double getdLucroPerda() {
        return dLucroPerda;
    }

    public void setdLucroPerda(double dLucroPerda) {
        this.dLucroPerda = dLucroPerda;
    }

    public double getdResultadoFinanceiro() {
        return dResultadoFinanceiro;
    }

    public void setdResultadoFinanceiro(double dResultadoFinanceiro) {
        this.dResultadoFinanceiro = dResultadoFinanceiro;
    }
}
