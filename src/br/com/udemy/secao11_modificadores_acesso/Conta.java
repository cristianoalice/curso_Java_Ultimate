package br.com.udemy.secao11_modificadores_acesso;
/*
Getters e Setters 

Getter
- � um m�todo p�blico que serve para consultar dados;
- A nomenclatura desses m�todos � getNome_do_atributo()
 */

public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;
	
//Construtor
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
//M�todo sacar
	//this.saldo = this.saldo - valor;
	public void sacar(float valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}else if(valor <= (this.saldo + this.limite)){
			//calculando o valor excedente do saque
			// 100 - 200 --> -100
			float val_ret = this.saldo - valor;
			if(val_ret < 0) {
			}
				this.saldo = 0;
			val_ret = this.limite + val_ret;
			this.limite = val_ret;
			
		}else {
			System.out.println("Saldo INSUFICIENTE. Voc� tem R$ " + this.saldo + " em sua conta!");
			//Aqui eu posso usar o "this.saldo" ao inv�s do "saldo"?
		}
	}
//M�todo depositar
	//this.saldo = this.saldo - valor;
	public void depositar(float valor) {
			this.saldo = this.saldo + valor;
	}
	//M�todo getter do atributo Saldo
	public float getSaldo() {
		return this.saldo + this.limite;
	}

}

