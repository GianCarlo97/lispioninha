// $ANTLR 3.5.1 /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g 2017-05-01 18:27:07

	package Map;
	import java.util.HashMap;
	import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class lispioninhaS_orientadaParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COND", "DEFUN", "DIFERENTE", 
		"DIVIDE", "ID", "IGUAL", "MAIOR", "MAIORIGUAL", "MAIS", "MENOR", "MENORIGUAL", 
		"MENOS", "NIL", "NUMERO", "PAR_DIR", "PAR_ESQ", "SETQ", "T", "VEZES", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int COND=4;
	public static final int DEFUN=5;
	public static final int DIFERENTE=6;
	public static final int DIVIDE=7;
	public static final int ID=8;
	public static final int IGUAL=9;
	public static final int MAIOR=10;
	public static final int MAIORIGUAL=11;
	public static final int MAIS=12;
	public static final int MENOR=13;
	public static final int MENORIGUAL=14;
	public static final int MENOS=15;
	public static final int NIL=16;
	public static final int NUMERO=17;
	public static final int PAR_DIR=18;
	public static final int PAR_ESQ=19;
	public static final int SETQ=20;
	public static final int T=21;
	public static final int VEZES=22;
	public static final int WS=23;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "prog", "corpo", "expr", "identifica", "regra", "declara_fun", 
		"chamada", "decisao", "teste", "lista_parametros", "lista_args", "termo"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public lispioninhaS_orientadaParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public lispioninhaS_orientadaParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public lispioninhaS_orientadaParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return lispioninhaS_orientadaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g"; }


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



	// $ANTLR start "prog"
	// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:23:1: prog : ( declara_fun | identifica )+ ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:23:7: ( ( declara_fun | identifica )+ )
			dbg.enterAlt(1);

			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:24:2: ( declara_fun | identifica )+
			{
			dbg.location(24,2);
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:24:2: ( declara_fun | identifica )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=3;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==PAR_ESQ) ) {
					int LA1_2 = input.LA(2);
					if ( (LA1_2==DEFUN) ) {
						alt1=1;
					}
					else if ( (LA1_2==SETQ) ) {
						alt1=2;
					}

				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:25:2: declara_fun
					{
					dbg.location(25,2);
					pushFollow(FOLLOW_declara_fun_in_prog26);
					declara_fun();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:27:2: identifica
					{
					dbg.location(27,2);
					pushFollow(FOLLOW_identifica_in_prog32);
					identifica();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(29, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "declara_fun"
	// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:30:1: declara_fun : PAR_ESQ DEFUN ID PAR_ESQ ( lista_parametros )? PAR_DIR corpo PAR_DIR ;
	public final void declara_fun() throws RecognitionException {
		Token ID2=null;
		ArrayList<String> lista_parametros1 =null;
		ArrayList<String> corpo3 =null;

		try { dbg.enterRule(getGrammarFileName(), "declara_fun");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:31:2: ( PAR_ESQ DEFUN ID PAR_ESQ ( lista_parametros )? PAR_DIR corpo PAR_DIR )
			dbg.enterAlt(1);

			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:31:4: PAR_ESQ DEFUN ID PAR_ESQ ( lista_parametros )? PAR_DIR corpo PAR_DIR
			{
			dbg.location(31,4);
			match(input,PAR_ESQ,FOLLOW_PAR_ESQ_in_declara_fun47); dbg.location(32,2);
			match(input,DEFUN,FOLLOW_DEFUN_in_declara_fun51); dbg.location(32,8);
			ID2=(Token)match(input,ID,FOLLOW_ID_in_declara_fun53); dbg.location(33,2);
			 ArrayList<String> lP = null; dbg.location(34,2);
			match(input,PAR_ESQ,FOLLOW_PAR_ESQ_in_declara_fun59); dbg.location(35,2);
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:35:2: ( lista_parametros )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==ID) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:36:2: lista_parametros
					{
					dbg.location(36,2);
					pushFollow(FOLLOW_lista_parametros_in_declara_fun66);
					lista_parametros1=lista_parametros();
					state._fsp--;
					dbg.location(36,19);
					lP = lista_parametros1;
					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(38,2);
			match(input,PAR_DIR,FOLLOW_PAR_DIR_in_declara_fun76); dbg.location(39,2);
			pushFollow(FOLLOW_corpo_in_declara_fun80);
			corpo3=corpo();
			state._fsp--;
			dbg.location(39,8);
			 
					if (!ts.containsKey((ID2!=null?ID2.getText():null))) {
						ts.put((ID2!=null?ID2.getText():null),new Atrib(lP,corpo3)); 
					}
					else {
			           		Atrib atb = ts.get((ID2!=null?ID2.getText():null));
						if (atb.corpo == null) { // NAO ERA FUNCAO
				           		atb.valor = 0.0;
			        	   		atb.param = lP;
			           			atb.corpo = corpo3;
			           		}
						else {			
				           		erroGeral = true;
				 			System.err.println("Erro em " + ID2.getLine() + ":"
				  	        	+ ID2.getCharPositionInLine() 
				  	        	+ " - Tentativa de redefinir funcao " + (ID2!=null?ID2.getText():null)); 
						}
					}
				dbg.location(58,2);
			match(input,PAR_DIR,FOLLOW_PAR_DIR_in_declara_fun85); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(59, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declara_fun");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "declara_fun"



	// $ANTLR start "identifica"
	// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:60:1: identifica : PAR_ESQ SETQ ID termo PAR_DIR ;
	public final void identifica() throws RecognitionException {
		Token ID4=null;
		ParserRuleReturnScope termo5 =null;

		try { dbg.enterRule(getGrammarFileName(), "identifica");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:61:2: ( PAR_ESQ SETQ ID termo PAR_DIR )
			dbg.enterAlt(1);

			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:61:4: PAR_ESQ SETQ ID termo PAR_DIR
			{
			dbg.location(61,4);
			match(input,PAR_ESQ,FOLLOW_PAR_ESQ_in_identifica95); dbg.location(61,12);
			match(input,SETQ,FOLLOW_SETQ_in_identifica97); dbg.location(62,2);
			ID4=(Token)match(input,ID,FOLLOW_ID_in_identifica101); dbg.location(63,2);
			pushFollow(FOLLOW_termo_in_identifica105);
			termo5=termo();
			state._fsp--;
			dbg.location(64,2);

					if (!ts.containsKey((ID4!=null?ID4.getText():null))) {
						ts.put((ID4!=null?ID4.getText():null),new Atrib((termo5!=null?((lispioninhaS_orientadaParser.termo_return)termo5).v:0.0))); 
					}
					else { // VALE A IDENTIFICACAO ATUAL
					     	Atrib atb = ts.get((ID4!=null?ID4.getText():null));
			           		atb.valor = (termo5!=null?((lispioninhaS_orientadaParser.termo_return)termo5).v:0.0);
			       	   		atb.param = null;
			       			atb.corpo = null;
			       		}
				dbg.location(75,2);
			match(input,PAR_DIR,FOLLOW_PAR_DIR_in_identifica112); dbg.location(76,2);

					if (!erroGeral) System.out.println((ID4!=null?ID4.getText():null) + " = " + (termo5!=null?((lispioninhaS_orientadaParser.termo_return)termo5).v:0.0));
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(79, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifica");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "identifica"



	// $ANTLR start "lista_parametros"
	// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:80:1: lista_parametros returns [ArrayList<String> listaP] :id1= ID (id2= ID )? ;
	public final ArrayList<String> lista_parametros() throws RecognitionException {
		ArrayList<String> listaP = null;


		Token id1=null;
		Token id2=null;

		try { dbg.enterRule(getGrammarFileName(), "lista_parametros");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:81:2: (id1= ID (id2= ID )? )
			dbg.enterAlt(1);

			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:81:4: id1= ID (id2= ID )?
			{
			dbg.location(81,4);
			 listaP = new ArrayList<String>(); dbg.location(82,5);
			id1=(Token)match(input,ID,FOLLOW_ID_in_lista_parametros136); dbg.location(82,9);

					//adiciona id1 em listaP} -- FEITO
					listaP.put((id1!=null?id1.getText():null));
				dbg.location(86,2);
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:86:2: (id2= ID )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==ID) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:87:2: id2= ID
					{
					dbg.location(87,5);
					id2=(Token)match(input,ID,FOLLOW_ID_in_lista_parametros147); dbg.location(87,9);

							//adiciona id2 em listaP} -- FEITO
							listaP.put((id2!=null?id2.getText():null));
						
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(92, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lista_parametros");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return listaP;
	}
	// $ANTLR end "lista_parametros"



	// $ANTLR start "lista_args"
	// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:93:1: lista_args returns [ArrayList<Double> listaA] :t1= termo (t2= termo )? ;
	public final ArrayList<Double> lista_args() throws RecognitionException {
		ArrayList<Double> listaA = null;


		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		try { dbg.enterRule(getGrammarFileName(), "lista_args");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(93, 0);

		try {
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:94:2: (t1= termo (t2= termo )? )
			dbg.enterAlt(1);

			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:94:5: t1= termo (t2= termo )?
			{
			dbg.location(94,5);
			 listaA = new ArrayList<Double>(); dbg.location(95,4);
			pushFollow(FOLLOW_termo_in_lista_args173);
			t1=termo();
			state._fsp--;
			dbg.location(95,11);

					//adiciona valor de t1 em listaA} -- FEITO
					listaA.put((t1!=null?input.toString(t1.start,t1.stop):null));
				dbg.location(99,2);
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:99:2: (t2= termo )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==ID||LA4_0==NUMERO||LA4_0==PAR_ESQ) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:100:2: t2= termo
					{
					dbg.location(100,4);
					pushFollow(FOLLOW_termo_in_lista_args184);
					t2=termo();
					state._fsp--;
					dbg.location(100,11);

							//adiciona valor de t1 em listaA} -- FEITO
							listaA.put((t2!=null?input.toString(t2.start,t2.stop):null));
						
					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(105, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lista_args");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return listaA;
	}
	// $ANTLR end "lista_args"


	public static class termo_return extends ParserRuleReturnScope {
		public double v;
	};


	// $ANTLR start "termo"
	// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:106:1: termo returns [double v] : ( ID |ch= chamada |de= decisao | NUMERO |ex= expr );
	public final lispioninhaS_orientadaParser.termo_return termo() throws RecognitionException {
		lispioninhaS_orientadaParser.termo_return retval = new lispioninhaS_orientadaParser.termo_return();
		retval.start = input.LT(1);

		Token ID6=null;
		Token NUMERO7=null;
		double ch =0.0;
		double de =0.0;
		double ex =0.0;

		try { dbg.enterRule(getGrammarFileName(), "termo");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:107:2: ( ID |ch= chamada |de= decisao | NUMERO |ex= expr )
			int alt5=5;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			switch ( input.LA(1) ) {
			case ID:
				{
				alt5=1;
				}
				break;
			case PAR_ESQ:
				{
				switch ( input.LA(2) ) {
				case ID:
					{
					alt5=2;
					}
					break;
				case COND:
					{
					alt5=3;
					}
					break;
				case DIVIDE:
				case MAIS:
				case MENOS:
				case VEZES:
					{
					alt5=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NUMERO:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:108:2: ID
					{
					dbg.location(108,2);
					ID6=(Token)match(input,ID,FOLLOW_ID_in_termo206); dbg.location(109,9);
					 
					           	retval.v = 0.0;  
					           	
					           	//se ID esta' em ts -- FEITO
							//retval.v = valor de ID informado em ts -- FEITO
							//senao acusa erroGeral e informa variavel nao declarada -- FEITO
					           	if (ts.containsKey((ID6!=null?ID6.getText():null))){
					           		retval.v = ts.get((ID6!=null?ID6.getText():null));
					           	}
					           	else{
					           		erroGeral = true;
					           		System.out.println ("Erro de variavel nao declarada");
					           	}
								
					        
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:124:4: ch= chamada
					{
					dbg.location(124,7);
					pushFollow(FOLLOW_chamada_in_termo226);
					ch=chamada();
					state._fsp--;
					dbg.location(124,17);

							//retval.v = valor da chamada -- FEITO
							retval.v = ch; 
						
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:128:4: de= decisao
					{
					dbg.location(128,7);
					pushFollow(FOLLOW_decisao_in_termo237);
					de=decisao();
					state._fsp--;
					dbg.location(128,17);

							//retval.v = valor da decisao -- FEITO
							retval.v = de; 
						
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:132:4: NUMERO
					{
					dbg.location(132,4);
					NUMERO7=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_termo244); dbg.location(132,11);

							//retval.v = valor do NUMERO -- FEITO
							 retval.v = Double.parseDouble((NUMERO7!=null?NUMERO7.getText():null)); 
						
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:136:4: ex= expr
					{
					dbg.location(136,7);
					pushFollow(FOLLOW_expr_in_termo255);
					ex=expr();
					state._fsp--;
					dbg.location(136,14);

							//retval.v = valor da expressao -- FEITO
							retval.v = ex;
						
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(140, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "termo");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "termo"



	// $ANTLR start "expr"
	// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:141:1: expr returns [double v] : PAR_ESQ ( MAIS | MENOS | VEZES | DIVIDE ) t1= termo t2= termo PAR_DIR ;
	public final double expr() throws RecognitionException {
		double v = 0.0;


		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(141, 0);

		try {
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:142:2: ( PAR_ESQ ( MAIS | MENOS | VEZES | DIVIDE ) t1= termo t2= termo PAR_DIR )
			dbg.enterAlt(1);

			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:143:2: PAR_ESQ ( MAIS | MENOS | VEZES | DIVIDE ) t1= termo t2= termo PAR_DIR
			{
			dbg.location(143,2);
			match(input,PAR_ESQ,FOLLOW_PAR_ESQ_in_expr282); dbg.location(144,2);

					//declara uma variavel flag para identificar os operadores e inicializa v -- FEITO
					v = 0;
					int flag = 0;
				dbg.location(149,2);
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:149:2: ( MAIS | MENOS | VEZES | DIVIDE )
			int alt6=4;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			switch ( input.LA(1) ) {
			case MAIS:
				{
				alt6=1;
				}
				break;
			case MENOS:
				{
				alt6=2;
				}
				break;
			case VEZES:
				{
				alt6=3;
				}
				break;
			case DIVIDE:
				{
				alt6=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:150:2: MAIS
					{
					dbg.location(150,2);
					match(input,MAIS,FOLLOW_MAIS_in_expr291); dbg.location(150,6);

							//identifica a opcao -- FEITO
							flag = 1;
						
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:154:4: MENOS
					{
					dbg.location(154,4);
					match(input,MENOS,FOLLOW_MENOS_in_expr298); dbg.location(154,9);

							//identifica a opcao -- FEITO
							flag = 2;
						
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:159:4: VEZES
					{
					dbg.location(159,4);
					match(input,VEZES,FOLLOW_VEZES_in_expr306); dbg.location(159,9);

							//identifica a opcao -- FEITO
							flag = 3;
						
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:163:4: DIVIDE
					{
					dbg.location(163,4);
					match(input,DIVIDE,FOLLOW_DIVIDE_in_expr312); dbg.location(163,10);

							//identifica a opcao -- FEITO
							flag = 4;
						
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(168,4);
			pushFollow(FOLLOW_termo_in_expr322);
			t1=termo();
			state._fsp--;
			dbg.location(168,11);

					//v � o valor de t1 -- FEITO
					v = (t1!=null?((lispioninhaS_orientadaParser.termo_return)t1).v:0.0);
				dbg.location(172,4);
			pushFollow(FOLLOW_termo_in_expr329);
			t2=termo();
			state._fsp--;
			dbg.location(173,2);
				
					//se primeira opcao, soma -- FEITO
					if (flag == 1){
						v += (t2!=null?((lispioninhaS_orientadaParser.termo_return)t2).v:0.0);
					}
					//se segunda, diminui -- FEITO
					else if (flag == 2){
						v -= (t2!=null?((lispioninhaS_orientadaParser.termo_return)t2).v:0.0);
					}
					//se terceira, multiplica -- FEITO
					else if (flag == 3){
						v *= (t2!=null?((lispioninhaS_orientadaParser.termo_return)t2).v:0.0);
					}
					//se quarta, divide -- FEITO
					else if (flag == 4){
						v /= (t2!=null?((lispioninhaS_orientadaParser.termo_return)t2).v:0.0);
					}
				dbg.location(191,2);
			match(input,PAR_DIR,FOLLOW_PAR_DIR_in_expr336); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(192, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "expr"



	// $ANTLR start "chamada"
	// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:194:1: chamada returns [double vC] : PAR_ESQ ID (la= lista_args )? PAR_DIR ;
	public final double chamada() throws RecognitionException {
		double vC = 0.0;


		Token ID8=null;
		ArrayList<Double> la =null;

		try { dbg.enterRule(getGrammarFileName(), "chamada");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(194, 0);

		try {
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:194:28: ( PAR_ESQ ID (la= lista_args )? PAR_DIR )
			dbg.enterAlt(1);

			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:195:2: PAR_ESQ ID (la= lista_args )? PAR_DIR
			{
			dbg.location(195,2);
			match(input,PAR_ESQ,FOLLOW_PAR_ESQ_in_chamada352); dbg.location(196,2);
			ID8=(Token)match(input,ID,FOLLOW_ID_in_chamada356); dbg.location(197,2);

				//declara uma variaval local boolean flag para detectar erro inicializado false e declara
				boolean arg_cont = false; 
				//uma variaval para contar o numero de argumentos inicializada zerada
				int arg = 0;
				boolean erro_local = false;
				
				dbg.location(205,2);
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:205:2: (la= lista_args )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==ID||LA7_0==NUMERO||LA7_0==PAR_ESQ) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:206:2: la= lista_args
					{
					dbg.location(206,5);
					pushFollow(FOLLOW_lista_args_in_chamada370);
					la=lista_args();
					state._fsp--;
					dbg.location(206,17);

							//pega o numero de argumentos pelo tamanho da listaA
							arg = la.size();
						
					}
					break;

			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(211,2);
			match(input,PAR_DIR,FOLLOW_PAR_DIR_in_chamada378); dbg.location(212,2);

				// PASSAGEM DE PARAMETROS
				vC = 0;
				double v1=0, v2=0; // VALOR DOS TERMOS DO CORPO
				double vP1=0, vP2=0; // VALOR DOS PARAMETROS
				String op="", operando1="", operando2="";
				String param1="", param2="";
				int numParam=0;
				//se ID esta' em ts
				if (ts.containsKey((ID8!=null?ID8.getText():null))){
			           	
			           	//	pega o objeto Atrib associado a ID
			           		Atrib atrib = ts.get((ID8!=null?ID8.getText():null));
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
			           		if(numParam == arg){
			           	//		se numero de parametros e' zero
			           			if(arg == 0){
			           	//			pega vP1 e vP2 diretamente no corpo
			           				vP1 = Double.parceDouble(operando1);
			           				vP2 = Double.parceDouble(operando2);
			           				
			           			}else if(arg > 0){
			           	//		se numero de argumentos e' maior que zero
				//			pega vP1 do primeiro argumento
							vP1 = Double.parseDouble(la.get(0));
							if(arg > 1){
								vP2 = Double.parseDouble(la.get(1));
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
					if(op.equals($MAIS.text)){
						vC = v1 + v2;
					}else if(op.equals($MENOS.text)){
					//	senao se op e' "-" entao vC e' a diminuicao
						vC = v1 - v2;
					}else if(op.equals($VEZES.text)){//	senao se op e' "*" entao vC e' a produto
						vC = v1 * v2;
					}else if(op.equals($DIVIDE.text)){//	senao se op e' "/" entao vC e' a divisao
						vC = v1 / v2;
					}else{//senao detecta erroGeral
						erroGeral = true;
						System.out.println("erro geral");
					}
				
				
					
				
				}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(318, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "chamada");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return vC;
	}
	// $ANTLR end "chamada"



	// $ANTLR start "corpo"
	// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:319:1: corpo returns [ArrayList<String> lC] : PAR_ESQ ( MAIS | MENOS | VEZES | DIVIDE ) (id1= ID |n1= NUMERO ) (id2= ID |n2= NUMERO ) PAR_DIR ;
	public final ArrayList<String> corpo() throws RecognitionException {
		ArrayList<String> lC = null;


		Token id1=null;
		Token n1=null;
		Token id2=null;
		Token n2=null;
		Token MAIS9=null;
		Token MENOS10=null;
		Token VEZES11=null;
		Token DIVIDE12=null;

		try { dbg.enterRule(getGrammarFileName(), "corpo");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(319, 0);

		try {
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:320:2: ( PAR_ESQ ( MAIS | MENOS | VEZES | DIVIDE ) (id1= ID |n1= NUMERO ) (id2= ID |n2= NUMERO ) PAR_DIR )
			dbg.enterAlt(1);

			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:321:2: PAR_ESQ ( MAIS | MENOS | VEZES | DIVIDE ) (id1= ID |n1= NUMERO ) (id2= ID |n2= NUMERO ) PAR_DIR
			{
			dbg.location(321,2);
			 lC = new ArrayList<String>(); dbg.location(322,2);
			match(input,PAR_ESQ,FOLLOW_PAR_ESQ_in_corpo400); dbg.location(323,2);
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:323:2: ( MAIS | MENOS | VEZES | DIVIDE )
			int alt8=4;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case MAIS:
				{
				alt8=1;
				}
				break;
			case MENOS:
				{
				alt8=2;
				}
				break;
			case VEZES:
				{
				alt8=3;
				}
				break;
			case DIVIDE:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:324:2: MAIS
					{
					dbg.location(324,2);
					MAIS9=(Token)match(input,MAIS,FOLLOW_MAIS_in_corpo407); dbg.location(324,7);

							//inclui "+" em lC -- FEITO
							$1C.put((MAIS9!=null?MAIS9.getText():null));
						
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:328:4: MENOS
					{
					dbg.location(328,4);
					MENOS10=(Token)match(input,MENOS,FOLLOW_MENOS_in_corpo414); dbg.location(328,10);

							//inclui "-" em lC -- FEITO
							$1C.put((MENOS10!=null?MENOS10.getText():null));
						
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:332:4: VEZES
					{
					dbg.location(332,4);
					VEZES11=(Token)match(input,VEZES,FOLLOW_VEZES_in_corpo421); dbg.location(332,10);

							//inclui "*" em lC -- FEITO
							$1C.put((VEZES11!=null?VEZES11.getText():null));
						
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:336:4: DIVIDE
					{
					dbg.location(336,4);
					DIVIDE12=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_corpo428); dbg.location(336,11);

							//inclui "/" em lC -- FEITO
							$1C.put((DIVIDE12!=null?DIVIDE12.getText():null));			
						
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(341,2);
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:341:2: (id1= ID |n1= NUMERO )
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				alt9=1;
			}
			else if ( (LA9_0==NUMERO) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:342:2: id1= ID
					{
					dbg.location(342,5);
					id1=(Token)match(input,ID,FOLLOW_ID_in_corpo442); dbg.location(342,9);

							//inclui id1 em lC -- FEITO
							$1C.put((id1!=null?id1.getText():null));
						
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:347:2: n1= NUMERO
					{
					dbg.location(347,4);
					n1=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_corpo452); dbg.location(347,12);

							//inclui n1 em lC -- FEITO
							$1C.put((n1!=null?n1.getText():null));
						
					}
					break;

			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(352,2);
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:352:2: (id2= ID |n2= NUMERO )
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				alt10=1;
			}
			else if ( (LA10_0==NUMERO) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:353:2: id2= ID
					{
					dbg.location(353,5);
					id2=(Token)match(input,ID,FOLLOW_ID_in_corpo465); dbg.location(353,9);

							//inclui id2 em lC -- FEITO
							$1C.put((id2!=null?id2.getText():null));			
						
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:358:2: n2= NUMERO
					{
					dbg.location(358,4);
					n2=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_corpo475); dbg.location(358,12);

							//inclui n2 em lC -- FEITO
							 $1C.put((n2!=null?n2.getText():null));
						
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(363,2);
			match(input,PAR_DIR,FOLLOW_PAR_DIR_in_corpo483); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(364, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "corpo");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return lC;
	}
	// $ANTLR end "corpo"



	// $ANTLR start "decisao"
	// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:365:1: decisao returns [double vD] : PAR_ESQ COND (re= regra )+ PAR_DIR ;
	public final double decisao() throws RecognitionException {
		double vD = 0.0;


		ParserRuleReturnScope re =null;

		try { dbg.enterRule(getGrammarFileName(), "decisao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(365, 0);

		try {
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:365:28: ( PAR_ESQ COND (re= regra )+ PAR_DIR )
			dbg.enterAlt(1);

			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:366:2: PAR_ESQ COND (re= regra )+ PAR_DIR
			{
			dbg.location(366,2);
			//declara variaval flag boolean para achar o primeiro teste true e inicializa false
					boolean flag = false;
				dbg.location(369,2);
			match(input,PAR_ESQ,FOLLOW_PAR_ESQ_in_decisao501); dbg.location(369,10);
			match(input,COND,FOLLOW_COND_in_decisao503); dbg.location(370,2);
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:370:2: (re= regra )+
			int cnt11=0;
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==PAR_ESQ) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:371:2: re= regra
					{
					dbg.location(371,5);
					pushFollow(FOLLOW_regra_in_decisao515);
					re=regra();
					state._fsp--;
					dbg.location(372,2);
					 
							//se bT de regra e' true e nao e' o primeiro
							if (re.bT == true && re.vR > 0){
								//	vD � igual ao vR da regra
								vD = $vR.re;
								//	detecta que achou o primeiro bT verdadeiro
								flag = true;
								
							}
						
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt11++;
			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(383,2);
			match(input,PAR_DIR,FOLLOW_PAR_DIR_in_decisao527); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(384, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decisao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return vD;
	}
	// $ANTLR end "decisao"


	public static class regra_return extends ParserRuleReturnScope {
		public boolean bT;
		public double vR;
	};


	// $ANTLR start "regra"
	// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:385:1: regra returns [boolean bT, double vR] : PAR_ESQ te= teste ter= termo PAR_DIR ;
	public final lispioninhaS_orientadaParser.regra_return regra() throws RecognitionException {
		lispioninhaS_orientadaParser.regra_return retval = new lispioninhaS_orientadaParser.regra_return();
		retval.start = input.LT(1);

		boolean te =false;
		ParserRuleReturnScope ter =null;

		try { dbg.enterRule(getGrammarFileName(), "regra");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(385, 0);

		try {
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:385:39: ( PAR_ESQ te= teste ter= termo PAR_DIR )
			dbg.enterAlt(1);

			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:386:2: PAR_ESQ te= teste ter= termo PAR_DIR
			{
			dbg.location(386,2);

					//inicializa bT como false e vR como zero
					bT = false;
					vR = 0;
				dbg.location(391,2);
			match(input,PAR_ESQ,FOLLOW_PAR_ESQ_in_regra545); dbg.location(392,5);
			pushFollow(FOLLOW_teste_in_regra553);
			te=teste();
			state._fsp--;
			dbg.location(393,6);
			pushFollow(FOLLOW_termo_in_regra561);
			ter=termo();
			state._fsp--;
			dbg.location(394,2);
			 
					//se bT do teste e' true
					if (te.bT == true){
						//	bT e' true
						bT = true;
						//	vR e' igual a v do termo
						vR = $v.ter;
					}
				dbg.location(403,2);
			match(input,PAR_DIR,FOLLOW_PAR_DIR_in_regra568); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(404, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "regra");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "regra"



	// $ANTLR start "teste"
	// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:405:1: teste returns [boolean bT] : ( PAR_ESQ ( IGUAL | DIFERENTE | MENOR | MENORIGUAL | MAIOR | MAIORIGUAL ) t1= termo t2= termo PAR_DIR | T | NIL );
	public final boolean teste() throws RecognitionException {
		boolean bT = false;


		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		try { dbg.enterRule(getGrammarFileName(), "teste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(405, 0);

		try {
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:405:27: ( PAR_ESQ ( IGUAL | DIFERENTE | MENOR | MENORIGUAL | MAIOR | MAIORIGUAL ) t1= termo t2= termo PAR_DIR | T | NIL )
			int alt13=3;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			switch ( input.LA(1) ) {
			case PAR_ESQ:
				{
				alt13=1;
				}
				break;
			case T:
				{
				alt13=2;
				}
				break;
			case NIL:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:406:2: PAR_ESQ ( IGUAL | DIFERENTE | MENOR | MENORIGUAL | MAIOR | MAIORIGUAL ) t1= termo t2= termo PAR_DIR
					{
					dbg.location(406,2);
					match(input,PAR_ESQ,FOLLOW_PAR_ESQ_in_teste582); dbg.location(407,2);

						//declara variaval flag zerada para detectar o operador e inicializa bT como false
							int flag2;
							bT = false;
						dbg.location(412,2);
					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:412:2: ( IGUAL | DIFERENTE | MENOR | MENORIGUAL | MAIOR | MAIORIGUAL )
					int alt12=6;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					switch ( input.LA(1) ) {
					case IGUAL:
						{
						alt12=1;
						}
						break;
					case DIFERENTE:
						{
						alt12=2;
						}
						break;
					case MENOR:
						{
						alt12=3;
						}
						break;
					case MENORIGUAL:
						{
						alt12=4;
						}
						break;
					case MAIOR:
						{
						alt12=5;
						}
						break;
					case MAIORIGUAL:
						{
						alt12=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:413:2: IGUAL
							{
							dbg.location(413,2);
							match(input,IGUAL,FOLLOW_IGUAL_in_teste592); dbg.location(413,8);

									//identifica a opcao
									flag2 = 0;	
								
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:417:4: DIFERENTE
							{
							dbg.location(417,4);
							match(input,DIFERENTE,FOLLOW_DIFERENTE_in_teste600); dbg.location(417,14);

									//identifica a opcao
									flag2 = 1;	
								
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:421:4: MENOR
							{
							dbg.location(421,4);
							match(input,MENOR,FOLLOW_MENOR_in_teste607); dbg.location(421,11);

									//identifica a opcao
									flag2 = 3;		
								
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:425:4: MENORIGUAL
							{
							dbg.location(425,4);
							match(input,MENORIGUAL,FOLLOW_MENORIGUAL_in_teste615); dbg.location(425,15);

									//identifica a opcao
									flag2 = 4;	
								
							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:429:4: MAIOR
							{
							dbg.location(429,4);
							match(input,MAIOR,FOLLOW_MAIOR_in_teste622); dbg.location(429,11);

									//identifica a opcao
									flag2 = 5;	
								
							}
							break;
						case 6 :
							dbg.enterAlt(6);

							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:433:4: MAIORIGUAL
							{
							dbg.location(433,4);
							match(input,MAIORIGUAL,FOLLOW_MAIORIGUAL_in_teste630); dbg.location(433,15);

									//identifica a opcao
									flag2 = 6;	
								
							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(438,4);
					pushFollow(FOLLOW_termo_in_teste641);
					t1=termo();
					state._fsp--;
					dbg.location(439,4);
					pushFollow(FOLLOW_termo_in_teste647);
					t2=termo();
					state._fsp--;
					dbg.location(440,2);

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
						dbg.location(474,2);
					match(input,PAR_DIR,FOLLOW_PAR_DIR_in_teste654); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:475:4: T
					{
					dbg.location(475,4);
					match(input,T,FOLLOW_T_in_teste660); dbg.location(475,6);
					 bT = true; 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:476:4: NIL
					{
					dbg.location(476,4);
					match(input,NIL,FOLLOW_NIL_in_teste667); dbg.location(476,8);
					 bT = false; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(477, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return bT;
	}
	// $ANTLR end "teste"

	// Delegated rules



	public static final BitSet FOLLOW_declara_fun_in_prog26 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_identifica_in_prog32 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_PAR_ESQ_in_declara_fun47 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DEFUN_in_declara_fun51 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_declara_fun53 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAR_ESQ_in_declara_fun59 = new BitSet(new long[]{0x0000000000040100L});
	public static final BitSet FOLLOW_lista_parametros_in_declara_fun66 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PAR_DIR_in_declara_fun76 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_corpo_in_declara_fun80 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PAR_DIR_in_declara_fun85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAR_ESQ_in_identifica95 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_SETQ_in_identifica97 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_identifica101 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_termo_in_identifica105 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PAR_DIR_in_identifica112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lista_parametros136 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_ID_in_lista_parametros147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termo_in_lista_args173 = new BitSet(new long[]{0x00000000000A0102L});
	public static final BitSet FOLLOW_termo_in_lista_args184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_termo206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_chamada_in_termo226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decisao_in_termo237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_termo244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_termo255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAR_ESQ_in_expr282 = new BitSet(new long[]{0x0000000000409080L});
	public static final BitSet FOLLOW_MAIS_in_expr291 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_MENOS_in_expr298 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_VEZES_in_expr306 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_DIVIDE_in_expr312 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_termo_in_expr322 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_termo_in_expr329 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PAR_DIR_in_expr336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAR_ESQ_in_chamada352 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_chamada356 = new BitSet(new long[]{0x00000000000E0100L});
	public static final BitSet FOLLOW_lista_args_in_chamada370 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PAR_DIR_in_chamada378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAR_ESQ_in_corpo400 = new BitSet(new long[]{0x0000000000409080L});
	public static final BitSet FOLLOW_MAIS_in_corpo407 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_MENOS_in_corpo414 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_VEZES_in_corpo421 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_DIVIDE_in_corpo428 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_ID_in_corpo442 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_NUMERO_in_corpo452 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_ID_in_corpo465 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_NUMERO_in_corpo475 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PAR_DIR_in_corpo483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAR_ESQ_in_decisao501 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COND_in_decisao503 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_regra_in_decisao515 = new BitSet(new long[]{0x00000000000C0000L});
	public static final BitSet FOLLOW_PAR_DIR_in_decisao527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAR_ESQ_in_regra545 = new BitSet(new long[]{0x0000000000290000L});
	public static final BitSet FOLLOW_teste_in_regra553 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_termo_in_regra561 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PAR_DIR_in_regra568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAR_ESQ_in_teste582 = new BitSet(new long[]{0x0000000000006E40L});
	public static final BitSet FOLLOW_IGUAL_in_teste592 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_DIFERENTE_in_teste600 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_MENOR_in_teste607 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_MENORIGUAL_in_teste615 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_MAIOR_in_teste622 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_MAIORIGUAL_in_teste630 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_termo_in_teste641 = new BitSet(new long[]{0x00000000000A0100L});
	public static final BitSet FOLLOW_termo_in_teste647 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PAR_DIR_in_teste654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_in_teste660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NIL_in_teste667 = new BitSet(new long[]{0x0000000000000002L});
}
