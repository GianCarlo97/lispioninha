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
		//declara uma variavel flag para identificar os operadores e inicializa v -- FEITO
		$v = $te.v;
		int flag;
	}
	(
	MAIS{
		//identifica a opcao -- FEITO
		$flag = 1;
	} 
	| MENOS{
		//identifica a opcao -- FEITO
		$flag = 2;
	}
	
	| VEZES{
		//identifica a opcao -- FEITO
		$flag = 3;
	}
	| DIVIDE{
		//identifica a opcao -- FEITO
		$flag = 4;
	}
	) 
	t1=termo {
		//v � o valor de t1 -- FEITO
		$v = $t1.v;
	}
	t2=termo 
	{	
		//se primeira opcao, soma -- FEITO
		if (flag == 1){
			v += $t2.v;
		}
		//se segunda, diminui -- FEITO
		else if (flag == 2){
			v -= $t2.v;
		}
		//se terceira, multiplica -- FEITO
		else if (flag == 3){
			v *= $t2.v;
		}
		//se quarta, divide -- FEITO
		else if (flag == 4){
			v /= $t2.v;
		}
	}
	PAR_DIR
 	;
corpo	returns [ArrayList<String> lC]
	: 
	{ $lC = new ArrayList<String>(); }
	PAR_ESQ 
	(
	MAIS {
		//inclui "+" em lC -- FEITO
		$1C.put($MAIS.text);
	}
	| MENOS {
		//inclui "-" em lC -- FEITO
		$1C.put($MENOS.text);
	}
	| VEZES {
		//inclui "*" em lC -- FEITO
		$1C.put($VEZES.text);
	}
	| DIVIDE {
		//inclui "/" em lC -- FEITO
		$1C.put($DIVIDE.text);			
	}
	) 
	(
	id1=ID {
		//inclui id1 em lC -- FEITO
		$1C.put($id1.text);
	}
	|
	n1=NUMERO {
		//inclui n1 em lC -- FEITO
		$1C.put($n1.text);
	}
	)
	(
	id2=ID {
		//inclui id2 em lC -- FEITO
		$1C.put($id2.text);			
	}
	|
	n2=NUMERO {
		//inclui n2 em lC -- FEITO
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
	boolean erro_local = false;
	
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
           		Atrib atrib = ts.get($ID.text);
           		//	pega op, operando1 e operando2
           		op = atrib.corpo.get(0);
           		operando1 = atrib.corpo.get(1);
           		operando2 = atrib.corpo.get(2);
           		
           		
           			//	se h� parametros
	//		pega o numero de parametros
		numParam = atrib.param.size();
		if(numParam > 0){
			param1 = atrib.param.get(0);
			if(numParam > 1){
				param2 = atrib.param.get(1);
			}
		}
	//		pega param1
	//		se h� mais de um parametros
	//			pega param2
           		if(numParam == $arg){
           	//		se numero de parametros e' zero
           			if($arg == 0){
           	//			pega vP1 e vP2 diretamente no corpo
           				vP1 = Double.parceDouble(operando1);
           				vP2 = Double.parceDouble(operando2);
           				
           			}else if($arg > 0){
           	//		se numero de argumentos e' maior que zero
	//			pega vP1 do primeiro argumento
				vP1 = Double.parseDouble($la.get(0));
				if($arg > 1){
					vP2 = Double.parseDouble($la.get(1));
	//			se numero de argumentos e' maior que 1
	//			pega vP2 do segundo argumento
				}
           			}
           			
           		}else{
           			arg_cont = true;
           		}
           		
           		
           	//senao 
	//	informa funcao nao definida e acusa erro local
           	}else{
           		System.out.println("erro local funcao nao definida");
           		erro_local = true;
           	}

	
	// AVALIAR O CORPO DA FUNCAO SE NAO HOUVER ERRO
	//se nao ha erro local
	if(!erro_local){
	//	se operando1 e' igual a param1 entao v1 = vP1
		if(operando1 == param1){
			v1 = vP1;
		
	//	senao se operando1 e' igual a param2 entao v1 = vP2
		}else if(operando1 == param2){
			v1 = vP2;
	//	senao v1 e' o valor do operando1
		}else{
			v1 = Double.parceDouble(operando1);
		}
	//	se operando2 e' igual a param1 entao v2 = vP1
		if(operando2 == param1){
			v2 = vP1;
	//	senao se operando2 e' igual a param2 entao v2 = vP2
		}else if(operando == param2){
			v2 = vp2;
	//	senao v2 e' o valor do operando2
		}else{
			v2 = Double.parceDouble(operando2);
		}
	//	se op e' "+" entao vC e' a soma
	//	senao se op e' "-" entao vC e' a diminuicao
	//	senao se op e' "*" entao vC e' a produto
	//	senao se op e' "/" entao vC e' a divisao
	//senao detecta erroGeral
	}
	}
	;
decisao	returns [double vD]: 
	{//declara variaval flag boolean para achar o primeiro teste true e inicializa false
		boolean flag = true;
	}
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
	{
	//declara variaval flag zerada para detectar o operador e inicializa bT como false
		int flag2;
		bT = false;
	}
	(
	IGUAL {
		//identifica a opcao
		$flag2 = 0;	
	} 
	| DIFERENTE {
		//identifica a opcao
		$flag2 = 1;	
	}
	| MENOR	 {
		//identifica a opcao
		$flag2 = 3;		
	}
	| MENORIGUAL {
		//identifica a opcao
		$flag2 = 4;	
	}
	| MAIOR	 {
		//identifica a opcao
		$flag2 = 5;	
	}
	| MAIORIGUAL {
		//identifica a opcao
		$flag2 = 6;	
	}
	) 
	t1=termo 
	t2=termo 
	{
		//se a opcao e' IGUAL entao se ha igualdade entao bT sera true
		if (flag2 == 0){
			if (t1 == t2){
			bT = true;		
			}
		}
		//senao faz o mesmo para cada operador relacional
		else if (flag2 == 1){
			if (t1 == t2){
			bT = true;		
			}
		}
		else if (flag2 == 3){
			if (t1 == t2){
			bT = true;		
			}
		}	
		else if (flag2 == 4){
			if (t1 == t2){
			bT = true;		
			}
		}
		else if (flag2 == 5){
			if (t1 == t2){
			bT = true;		
			}
		}
		else if (flag2 == 6){
			if (t1 == t2){
			bT = true;		
			}
		}
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
