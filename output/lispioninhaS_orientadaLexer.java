// $ANTLR 3.5.1 /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g 2017-05-01 20:22:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lispioninhaS_orientadaLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public lispioninhaS_orientadaLexer() {} 
	public lispioninhaS_orientadaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public lispioninhaS_orientadaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g"; }

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			int _type = T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:477:3: ( 't' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:477:5: 't'
			{
			match('t'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T"

	// $ANTLR start "NIL"
	public final void mNIL() throws RecognitionException {
		try {
			int _type = NIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:478:6: ( 'nil' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:478:8: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NIL"

	// $ANTLR start "COND"
	public final void mCOND() throws RecognitionException {
		try {
			int _type = COND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:479:7: ( 'cond' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:479:9: 'cond'
			{
			match("cond"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COND"

	// $ANTLR start "SETQ"
	public final void mSETQ() throws RecognitionException {
		try {
			int _type = SETQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:480:7: ( 'setq' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:480:9: 'setq'
			{
			match("setq"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SETQ"

	// $ANTLR start "DEFUN"
	public final void mDEFUN() throws RecognitionException {
		try {
			int _type = DEFUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:481:8: ( 'defun' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:481:10: 'defun'
			{
			match("defun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFUN"

	// $ANTLR start "PAR_ESQ"
	public final void mPAR_ESQ() throws RecognitionException {
		try {
			int _type = PAR_ESQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:482:9: ( '(' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:482:11: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAR_ESQ"

	// $ANTLR start "PAR_DIR"
	public final void mPAR_DIR() throws RecognitionException {
		try {
			int _type = PAR_DIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:483:9: ( ')' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:483:11: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAR_DIR"

	// $ANTLR start "MAIS"
	public final void mMAIS() throws RecognitionException {
		try {
			int _type = MAIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:484:6: ( '+' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:484:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIS"

	// $ANTLR start "MENOS"
	public final void mMENOS() throws RecognitionException {
		try {
			int _type = MENOS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:485:7: ( '-' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:485:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MENOS"

	// $ANTLR start "VEZES"
	public final void mVEZES() throws RecognitionException {
		try {
			int _type = VEZES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:486:7: ( '*' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:486:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VEZES"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:487:8: ( '/' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:487:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "IGUAL"
	public final void mIGUAL() throws RecognitionException {
		try {
			int _type = IGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:488:8: ( '==' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:488:10: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IGUAL"

	// $ANTLR start "DIFERENTE"
	public final void mDIFERENTE() throws RecognitionException {
		try {
			int _type = DIFERENTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:490:2: ( '!=' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:490:4: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIFERENTE"

	// $ANTLR start "MENOR"
	public final void mMENOR() throws RecognitionException {
		try {
			int _type = MENOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:491:7: ( '<' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:491:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MENOR"

	// $ANTLR start "MENORIGUAL"
	public final void mMENORIGUAL() throws RecognitionException {
		try {
			int _type = MENORIGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:493:2: ( '<=' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:493:4: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MENORIGUAL"

	// $ANTLR start "MAIOR"
	public final void mMAIOR() throws RecognitionException {
		try {
			int _type = MAIOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:494:7: ( '>' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:494:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIOR"

	// $ANTLR start "MAIORIGUAL"
	public final void mMAIORIGUAL() throws RecognitionException {
		try {
			int _type = MAIORIGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:496:2: ( '>=' )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:496:4: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIORIGUAL"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:497:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:497:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:497:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUMERO"
	public final void mNUMERO() throws RecognitionException {
		try {
			int _type = NUMERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:500:5: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* | ( '-' )? '.' ( '0' .. '9' )+ | ( '-' )? ( '0' .. '9' )+ )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:500:9: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )*
					{
					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:500:9: ( '-' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0=='-') ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:500:10: '-'
							{
							match('-'); 
							}
							break;

					}

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:500:16: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:500:32: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;
				case 2 :
					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:501:9: ( '-' )? '.' ( '0' .. '9' )+
					{
					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:501:9: ( '-' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='-') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:501:10: '-'
							{
							match('-'); 
							}
							break;

					}

					match('.'); 
					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:501:20: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					}
					break;
				case 3 :
					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:502:9: ( '-' )? ( '0' .. '9' )+
					{
					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:502:9: ( '-' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='-') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:502:10: '-'
							{
							match('-'); 
							}
							break;

					}

					// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:502:16: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERO"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:505:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:505:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:8: ( T | NIL | COND | SETQ | DEFUN | PAR_ESQ | PAR_DIR | MAIS | MENOS | VEZES | DIVIDE | IGUAL | DIFERENTE | MENOR | MENORIGUAL | MAIOR | MAIORIGUAL | ID | NUMERO | WS )
		int alt10=20;
		switch ( input.LA(1) ) {
		case 't':
			{
			int LA10_1 = input.LA(2);
			if ( ((LA10_1 >= '0' && LA10_1 <= '9')||(LA10_1 >= 'A' && LA10_1 <= 'Z')||LA10_1=='_'||(LA10_1 >= 'a' && LA10_1 <= 'z')) ) {
				alt10=18;
			}

			else {
				alt10=1;
			}

			}
			break;
		case 'n':
			{
			int LA10_2 = input.LA(2);
			if ( (LA10_2=='i') ) {
				int LA10_20 = input.LA(3);
				if ( (LA10_20=='l') ) {
					int LA10_29 = input.LA(4);
					if ( ((LA10_29 >= '0' && LA10_29 <= '9')||(LA10_29 >= 'A' && LA10_29 <= 'Z')||LA10_29=='_'||(LA10_29 >= 'a' && LA10_29 <= 'z')) ) {
						alt10=18;
					}

					else {
						alt10=2;
					}

				}

				else {
					alt10=18;
				}

			}

			else {
				alt10=18;
			}

			}
			break;
		case 'c':
			{
			int LA10_3 = input.LA(2);
			if ( (LA10_3=='o') ) {
				int LA10_21 = input.LA(3);
				if ( (LA10_21=='n') ) {
					int LA10_30 = input.LA(4);
					if ( (LA10_30=='d') ) {
						int LA10_34 = input.LA(5);
						if ( ((LA10_34 >= '0' && LA10_34 <= '9')||(LA10_34 >= 'A' && LA10_34 <= 'Z')||LA10_34=='_'||(LA10_34 >= 'a' && LA10_34 <= 'z')) ) {
							alt10=18;
						}

						else {
							alt10=3;
						}

					}

					else {
						alt10=18;
					}

				}

				else {
					alt10=18;
				}

			}

			else {
				alt10=18;
			}

			}
			break;
		case 's':
			{
			int LA10_4 = input.LA(2);
			if ( (LA10_4=='e') ) {
				int LA10_22 = input.LA(3);
				if ( (LA10_22=='t') ) {
					int LA10_31 = input.LA(4);
					if ( (LA10_31=='q') ) {
						int LA10_35 = input.LA(5);
						if ( ((LA10_35 >= '0' && LA10_35 <= '9')||(LA10_35 >= 'A' && LA10_35 <= 'Z')||LA10_35=='_'||(LA10_35 >= 'a' && LA10_35 <= 'z')) ) {
							alt10=18;
						}

						else {
							alt10=4;
						}

					}

					else {
						alt10=18;
					}

				}

				else {
					alt10=18;
				}

			}

			else {
				alt10=18;
			}

			}
			break;
		case 'd':
			{
			int LA10_5 = input.LA(2);
			if ( (LA10_5=='e') ) {
				int LA10_23 = input.LA(3);
				if ( (LA10_23=='f') ) {
					int LA10_32 = input.LA(4);
					if ( (LA10_32=='u') ) {
						int LA10_36 = input.LA(5);
						if ( (LA10_36=='n') ) {
							int LA10_39 = input.LA(6);
							if ( ((LA10_39 >= '0' && LA10_39 <= '9')||(LA10_39 >= 'A' && LA10_39 <= 'Z')||LA10_39=='_'||(LA10_39 >= 'a' && LA10_39 <= 'z')) ) {
								alt10=18;
							}

							else {
								alt10=5;
							}

						}

						else {
							alt10=18;
						}

					}

					else {
						alt10=18;
					}

				}

				else {
					alt10=18;
				}

			}

			else {
				alt10=18;
			}

			}
			break;
		case '(':
			{
			alt10=6;
			}
			break;
		case ')':
			{
			alt10=7;
			}
			break;
		case '+':
			{
			alt10=8;
			}
			break;
		case '-':
			{
			int LA10_9 = input.LA(2);
			if ( (LA10_9=='.'||(LA10_9 >= '0' && LA10_9 <= '9')) ) {
				alt10=19;
			}

			else {
				alt10=9;
			}

			}
			break;
		case '*':
			{
			alt10=10;
			}
			break;
		case '/':
			{
			alt10=11;
			}
			break;
		case '=':
			{
			alt10=12;
			}
			break;
		case '!':
			{
			alt10=13;
			}
			break;
		case '<':
			{
			int LA10_14 = input.LA(2);
			if ( (LA10_14=='=') ) {
				alt10=15;
			}

			else {
				alt10=14;
			}

			}
			break;
		case '>':
			{
			int LA10_15 = input.LA(2);
			if ( (LA10_15=='=') ) {
				alt10=17;
			}

			else {
				alt10=16;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt10=18;
			}
			break;
		case '.':
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt10=19;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt10=20;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 10, 0, input);
			throw nvae;
		}
		switch (alt10) {
			case 1 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:10: T
				{
				mT(); 

				}
				break;
			case 2 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:12: NIL
				{
				mNIL(); 

				}
				break;
			case 3 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:16: COND
				{
				mCOND(); 

				}
				break;
			case 4 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:21: SETQ
				{
				mSETQ(); 

				}
				break;
			case 5 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:26: DEFUN
				{
				mDEFUN(); 

				}
				break;
			case 6 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:32: PAR_ESQ
				{
				mPAR_ESQ(); 

				}
				break;
			case 7 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:40: PAR_DIR
				{
				mPAR_DIR(); 

				}
				break;
			case 8 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:48: MAIS
				{
				mMAIS(); 

				}
				break;
			case 9 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:53: MENOS
				{
				mMENOS(); 

				}
				break;
			case 10 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:59: VEZES
				{
				mVEZES(); 

				}
				break;
			case 11 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:65: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 12 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:72: IGUAL
				{
				mIGUAL(); 

				}
				break;
			case 13 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:78: DIFERENTE
				{
				mDIFERENTE(); 

				}
				break;
			case 14 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:88: MENOR
				{
				mMENOR(); 

				}
				break;
			case 15 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:94: MENORIGUAL
				{
				mMENORIGUAL(); 

				}
				break;
			case 16 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:105: MAIOR
				{
				mMAIOR(); 

				}
				break;
			case 17 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:111: MAIORIGUAL
				{
				mMAIORIGUAL(); 

				}
				break;
			case 18 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:122: ID
				{
				mID(); 

				}
				break;
			case 19 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:125: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 20 :
				// /home/gian/Programs/Antlrworks/trabalho/lispioninha/lispioninhaS_orientada.g:1:132: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\2\uffff\1\5\3\uffff";
	static final String DFA9_eofS =
		"\6\uffff";
	static final String DFA9_minS =
		"\1\55\2\56\3\uffff";
	static final String DFA9_maxS =
		"\3\71\3\uffff";
	static final String DFA9_acceptS =
		"\3\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\6\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\1\1\3\1\uffff\12\2",
			"\1\3\1\uffff\12\2",
			"\1\4\1\uffff\12\2",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "499:1: NUMERO : ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* | ( '-' )? '.' ( '0' .. '9' )+ | ( '-' )? ( '0' .. '9' )+ );";
		}
	}

}
