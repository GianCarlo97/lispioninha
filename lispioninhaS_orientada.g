grammar lispioninhaS_orientada;
@header {
	package Map;
	import java.util.HashMap;
	import java.util.ArrayList;
}
@members {
	public class Atrib {
		public double valor;
		public ArrayList<String> param;
		public ArrayList<String> corpo;
		public Atrib(double v) { // VARIAVEL
			valor = v; param = null; corpo = null;
		} 
		public Atrib(ArrayList<String> p, ArrayList<String> c) { // FUNCAO
			valor = 0.0; param = p; corpo = c;
		} 
	}
	HashMap<String, Atrib> ts = new HashMap<String, Atrib>();
	boolean erroGeral = false;
}

prog 	:	
	(
	declara_fun
	|
	identifica
	)+
	;
declara_fun	
	:	PAR_ESQ 
	DEFUN ID
	{ ArrayList<String> lP = null; }
	PAR_ESQ 
	(
	lista_parametros {lP = $lista_parametros.listaP;}
	)? 
	PAR_DIR 
	corpo { 
		if (!ts.containsKey($ID.text)) {
			ts.put($ID.text,new Atrib(lP,$corpo.lC)); 
		}
		else {
           		Atrib atb = ts.get($ID.text);
			if (atb.corpo == null) { // NAO ERA FUNCAO
	           		atb.valor = 0.0;
        	   		atb.param = lP;
           			atb.corpo = $corpo.lC;
           		}
			else {			
	           		erroGeral = true;
	 			System.err.println("Erro em " + $ID.getLine() + ":"
	  	        	+ $ID.getCharPositionInLine() 
	  	        	+ " - Tentativa de redefinir funcao " + $ID.text); 
			}
		}
	}
	PAR_DIR
	;
identifica
	:	PAR_ESQ SETQ 
	ID 
	termo 
	{
		if (!ts.containsKey($ID.text)) {
			ts.put($ID.text,new Atrib($termo.v)); 
		}
		else { // VALE A IDENTIFICACAO ATUAL
		     	Atrib atb = ts.get($ID.text);
           		atb.valor = $termo.v;
       	   		atb.param = null;
       			atb.corpo = null;
       		}
	}
	PAR_DIR
	{
		if (!erroGeral) System.out.println($ID.text + " = " + $termo.v);
	}
	;  
lista_parametros returns [ArrayList<String> listaP]
	:	{ $listaP = new ArrayList<String>(); }
	id1=ID {//adiciona id1 em listaP}
	(
	id2=ID {//adiciona id2 em listaP}
	)?
	;
lista_args returns [ArrayList<Double> listaA]
	: 	{ $listaA = new ArrayList<Double>(); }
	t1=termo {//adiciona valor de t1 em listaA}
	( 
	t2=termo {//adiciona valor de t1 em listaA} 
	)?
	;
termo 	returns [double v]
	:
	ID 
        { 
           	$v = 0.0;  
			//se ID esta' em ts
			//$v = valor de ID informado em ts
			//senao acusa erroGeral e informa variavel nao declarada
        }
	| ch = chamada {//$v = valor da chamada }
		$v = $ch.vC; 
	}
	| decisao {//$v = valor da decisao }
	| NUMERO {//$v = valor do NUMERO 
	 $v = Double.parseDouble($NUMERO.text);}
	| expr {//$v = valor da expressao 
        ;
expr 	returns [double v]
	: 
	PAR_ESQ 
	{//declara uma variavel flag para identificar os operadores e inicializa v }
	(
	MAIS {//identifica a opcao} 
	| MENOS {//identifica a opcao}
	
	| VEZES {//identifica a opcao}
	| DIVIDE {//identifica a opcao}
	) 
	t1=termo {//v � o valor de t1}
	t2=termo 
	{	
		//se primeira opcao, soma
		//se segunda, diminui
		//se terceira, multiplica
		//se quarta, divide
	}
	PAR_DIR
 	;
corpo	returns [ArrayList<String> lC]
	: 
	{ $lC = new ArrayList<String>(); }
	PAR_ESQ 
	(
	MAIS {//inclui "+" em lC}
	| MENOS {//inclui "-" em lC}
	| VEZES {//inclui "*" em lC}
	| DIVIDE {//inclui "/" em lC}
	) 
	(
	id1=ID {//inclui id1 em lC}
	|
	n1=NUMERO {//inclui n1 em lC}
	)
	(
	id2=ID {//inclui id2 em lC}
	|
	n2=NUMERO {//inclui n2 em lC}
	)
	PAR_DIR
 	;
chamada	returns [double vC]: 
	PAR_ESQ 
	ID 
	{//declara uma variaval local boolean flag para detectar erro inicializado false e declara uma variaval para contar o numero de argumentos inicializada zerada}
	(
	lista_args {//pega o numero de argumentos pelo tamanho da listaA}
	)?
	PAR_DIR
	{
	// PASSAGEM DE PARAMETROS
	vC = 0;
	double v1=0, v2=0; // VALOR DOS TERMOS DO CORPO
	double vP1=0, vP2=0; // VALOR DOS PARAMETROS
	String op="", operando1="", operando2="";
	String param1="", param2="";
	int numParam=0;
	//se ID esta' em ts
	//	pega o objeto Atrib associado a ID
	//	pega op, operando1 e operando2
	//	se h� parametros
	//		pega o numero de parametros
	//		pega param1
	//		se h� mais de um parametros
	//			pega param2
	//	se numero de argumentos e' igual ao numero de parametros
	//		se numero de parametros e' zero
	//			pega vP1 e vP2 diretamente no corpo
	//		se numero de argumentos e' maior que zero
	//			pega vP1 do primeiro argumento
	//		se numero de argumentos e' maior que 1
	//			pega vP2 do segundo argumento
	//	senao
	//		informa chamada com argumentos em numero incorreto e acusa erro local
	//senao 
	//	informa funcao nao definida e acusa erro local
	// AVALIAR O CORPO DA FUNCAO SE NAO HOUVER ERRO
	//se nao ha erro local
	//	se operando1 e' igual a param1 entao v1 = vP1
	//	senao se operando1 e' igual a param2 entao v1 = vP2
	//	senao v1 e' o valor do operando1
	//	se operando2 e' igual a param1 entao v2 = vP1
	//	senao se operando2 e' igual a param2 entao v2 = vP2
	//	senao v2 e' o valor do operando2
	//	se op e' "+" entao vC e' a soma
	//	senao se op e' "-" entao vC e' a diminuicao
	//	senao se op e' "*" entao vC e' a produto
	//	senao se op e' "/" entao vC e' a divisao
	//senao detecta erroGeral
	}
	;
decisao	returns [double vD]: 
	{//declara variaval flag boolean para achar o primeiro teste true e inicializa false}
	PAR_ESQ COND 
	( 
	regra 
	{ 
		//se bT de regra e' true e nao e' o primeiro
		//	vD � igual ao vR da regra
		//	detecta que achou o primeiro bT verdadeiro
	}
	)+ 
	PAR_DIR
	;
regra 	returns [boolean bT, double vR]:	
	{inicializa bT como false e vR como zero}
	PAR_ESQ 
	teste 
	termo 
	{ 
		if (bT == true){
			
		}
		//se bT do teste e' true
		//	bT e' true
		//	vR e' igual a v do termo
	}
	PAR_DIR
	;
teste	returns [boolean bT]:	
	PAR_ESQ 
	{//declara variaval flag zerada para detectar o operador e inicializa bT como false}
	(
	IGUAL {//identifica a opcao} 
	| DIFERENTE {//identifica a opcao}
	| MENOR	 {//identifica a opcao}
	| MENORIGUAL {//identifica a opcao}
	| MAIOR	 {//identifica a opcao}
	| MAIORIGUAL {//identifica a opcao}
	) 
	t1=termo 
	t2=termo 
	{
		//se a opcao e' IGUAL entao se ha igualdade entao bT sera true
		//senao faz o mesmo para cada operador relacional
	}
	PAR_DIR 
	| T { $bT = true; }
	| NIL { $bT = false; }
	;
T	:	't';
NIL 	:	'nil';
COND 	:	'cond';
SETQ 	:	'setq';
DEFUN 	:	'defun';
PAR_ESQ :	'(';
PAR_DIR	:	')';
MAIS	:	'+';
MENOS	:	'-';
VEZES	:	'*';
DIVIDE	:	'/';
IGUAL 	:	'==';
DIFERENTE
	:	'!=';
MENOR	:	'<';
MENORIGUAL
	:	'<=';
MAIOR	:	'>';
MAIORIGUAL
	:	'>=';
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
NUMERO
    :   ('-')? ('0'..'9')+ '.' ('0'..'9')* 
    |   ('-')? '.' ('0'..'9')+ 
    |   ('-')? ('0'..'9')+
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
