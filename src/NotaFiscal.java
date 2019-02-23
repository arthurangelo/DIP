
public class NotaFiscal {
private double valor;
private double impostoSimplesSobre0;
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
public double getImpostoSimplesSobre0() {
	return impostoSimplesSobre0;
}
public void setImpostoSimplesSobre0(double impostoSimplesSobre0) {
	this.impostoSimplesSobre0 = impostoSimplesSobre0;
}
public NotaFiscal(double valor, double impostoSimplesSobre0) {

	this.valor = valor;
	this.impostoSimplesSobre0 = impostoSimplesSobre0;
}


}
