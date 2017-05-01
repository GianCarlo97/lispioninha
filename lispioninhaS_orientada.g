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
	id1=ID {
		//adiciona id1 em listaP} -- FEITO
		$listaP.put($id1.text);
	}	
	(
	id2=ID {
		//adiciona id2 em listaP} -- FEITO
		$listaP.put($id2.text);
	}
	)?
	;
lista_args returns [ArrayList<Double> listaA]
	: 	{ $listaA = new ArrayList<Double>(); }
	t1=termo {
		//adiciona valor de t1 em listaA} -- FEITO
		$listaA.put($t1.text);
	}
	( 
	t2=termo {
		//adiciona valor de t1 em listaA} -- FEITO
		$listaA.put($t2.text);
	}
	)?
	;
termo 	returns [double v]
	:
	ID 
        { 
           	$v = 0.0;  
           	
           	//se ID esta' em ts -- FEITO
		//$v = valor de ID informado em ts -- FEITO
		//senao acusa erroGeral e informa variavel nao declarada -- FEITO
           	if (ts.containsKey($ID.text)){
           		$v = ts.get($ID.text);
           	}
           	else{
           		erroGeral = true;
           		System.out.println ("Erro de variavel nao declarada");
           	}
			
        }
	| ch = chamada {
		//$v = valor da chamada -- FEITO
		$v = $ch.vC; 
	}
	| de = decisao {
		//$v = valor da decisao -- FEITO
		$v = $de.vD; 
	}
	| NUMERO {
		//$v = valor do NUMERO -- FEITO
		 $v = Double.parseDouble($NUMERO.text); 
	}
	| ex = expr {
		//$v = valor da expressao -- FEITO
		$v = $ex.v;
	} 
        ;
expr 	returns [double v]
	: 
	PAR_ESQ te = termo
	{
		//declara uma variavel flag para identificar os operadores e inicializa v
		$v = $te.v;
	}
	(
	MAIS tePlus = termo {
		//identifica a opcao
		$flag = 1;
	} 
	| MENOS teLess = termo{
		//identifica a opcao
		$flag = 2;
	}
	
	| VEZES teMulti = termo{
		//identifica a opcao
		$flag = 3;
	}
	| DIVIDE teDiv = termo{
		//identifica a opcao
		$flag = 4;
	}
	) 
	t1=termo {
		//v � o valor de t1
		$v = Double.parseDouble($t1.text);
	}
	t2=termo 
	{	
		//se primeira opcao, soma
		if (flag == 1){
			v += Double.parseDouble($t2.text);
		}

		else if (flag == 2){
			v -= Double.parseDouble($t2.text);
		}
		else if (flag == 3){
			v *= Double.parseDouble($t2.text);
		}
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
	MAIS {
		//inclui "+" em lC
		$1C.put($MAIS.text);
	}
	| MENOS {
		//inclui "-" em lC
		$1C.put($MENOS.text);
	}
	| VEZES {
		//inclui "*" em lC
		$1C.put($VEZES.text);
	}
	| DIVIDE {
		//inclui "/" em lC
		$1C.put($DIVIDE.text);			
	}
	) 
	(
	id1=ID {
		//inclui id1 em lC
		$1C.put($id1.text);
	}
	|
	n1=NUMERO {
		//inclui n1 em lC
		$1C.put($n1.text);
	}
	)
	(
	id2=ID {
		//inclui id2 em lC
		$1C.put($id2.text);			
	}
	|
	n2=NUMERO {
		//inclui n2 em lC
		 $1C.put($n2.text);
	}
	)
	PAR_DIR
 	;
chamada	returns [double vC]: 
	PAR_ESQ 
	ID 
	{
	//declara uma variaval local boolean flag para detectar erro inicializado false e declara
	boolean arg_cont = false; 
	//uma variaval para contar o numero de argumentos inicializada zerada
	$arg = 0;
	
	}
	(
	la = lista_args{
		//pega o numero de argumentos pelo tamanho da listaA
		$arg = $la.size();
	}
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
	if (ts.containsKey($ID.text)){
           	
           	//	pega o objeto Atrib associado a ID
           	$v = ts.get($ID.text);
           	}
	//	pega op, operando1 e operando2
		if (op.containsKey(
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
		if (		
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
