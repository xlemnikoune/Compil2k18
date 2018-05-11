// $ANTLR 3.5.2 Grammar.g 2018-05-11 06:38:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int ADD=4;
	public static final int ANDBOOL=5;
	public static final int ANOBLOCK=6;
	public static final int ATTRIBUTE=7;
	public static final int BLOCK=8;
	public static final int BOOL=9;
	public static final int CALLFUN=10;
	public static final int COMMENT=11;
	public static final int DIV=12;
	public static final int EPERLU=13;
	public static final int EQUAL=14;
	public static final int IDF=15;
	public static final int IF=16;
	public static final int INT=17;
	public static final int MAIN=18;
	public static final int NEW=19;
	public static final int NEXT=20;
	public static final int OPBOOLEQ=21;
	public static final int ORBOOL=22;
	public static final int PREV=23;
	public static final int RES=24;
	public static final int STAR=25;
	public static final int STRING=26;
	public static final int SUB=27;
	public static final int UNAIRE=28;
	public static final int UNISTAR=29;
	public static final int UNISUB=30;
	public static final int VEC=31;
	public static final int WS=32;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GrammarLexer() {} 
	public GrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Grammar.g"; }

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:2:7: ( '(' )
			// Grammar.g:2:9: '('
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:3:7: ( ')' )
			// Grammar.g:3:9: ')'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:4:7: ( ',' )
			// Grammar.g:4:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:5:7: ( '->' )
			// Grammar.g:5:9: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:6:7: ( '.' )
			// Grammar.g:6:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:7:7: ( ':' )
			// Grammar.g:7:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:8:7: ( ';' )
			// Grammar.g:8:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:9:7: ( '[' )
			// Grammar.g:9:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:10:7: ( ']' )
			// Grammar.g:10:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:11:7: ( 'bool' )
			// Grammar.g:11:9: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:12:7: ( 'break' )
			// Grammar.g:12:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:13:7: ( 'else' )
			// Grammar.g:13:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:14:7: ( 'fn' )
			// Grammar.g:14:9: 'fn'
			{
			match("fn"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:15:7: ( 'i32' )
			// Grammar.g:15:9: 'i32'
			{
			match("i32"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:16:7: ( 'len' )
			// Grammar.g:16:9: 'len'
			{
			match("len"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:17:7: ( 'let' )
			// Grammar.g:17:9: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:18:7: ( 'loop' )
			// Grammar.g:18:9: 'loop'
			{
			match("loop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:19:7: ( 'mut' )
			// Grammar.g:19:9: 'mut'
			{
			match("mut"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:20:7: ( 'print' )
			// Grammar.g:20:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:21:7: ( 'return' )
			// Grammar.g:21:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:22:7: ( 'struct' )
			// Grammar.g:22:9: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:23:7: ( 'vec' )
			// Grammar.g:23:9: 'vec'
			{
			match("vec"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:24:7: ( 'while' )
			// Grammar.g:24:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:25:7: ( '{' )
			// Grammar.g:25:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:26:7: ( '}' )
			// Grammar.g:26:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:156:7: ( '=' )
			// Grammar.g:156:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "ORBOOL"
	public final void mORBOOL() throws RecognitionException {
		try {
			int _type = ORBOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:158:8: ( '||' )
			// Grammar.g:158:10: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORBOOL"

	// $ANTLR start "ANDBOOL"
	public final void mANDBOOL() throws RecognitionException {
		try {
			int _type = ANDBOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:160:9: ( '&&' )
			// Grammar.g:160:11: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANDBOOL"

	// $ANTLR start "PREV"
	public final void mPREV() throws RecognitionException {
		try {
			int _type = PREV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:162:7: ( '<' )
			// Grammar.g:162:10: '<'
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
	// $ANTLR end "PREV"

	// $ANTLR start "NEXT"
	public final void mNEXT() throws RecognitionException {
		try {
			int _type = NEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:163:7: ( '>' )
			// Grammar.g:163:10: '>'
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
	// $ANTLR end "NEXT"

	// $ANTLR start "OPBOOLEQ"
	public final void mOPBOOLEQ() throws RecognitionException {
		try {
			int _type = OPBOOLEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:165:10: ( '==' | '!=' | '<=' | '>=' )
			int alt1=4;
			switch ( input.LA(1) ) {
			case '=':
				{
				alt1=1;
				}
				break;
			case '!':
				{
				alt1=2;
				}
				break;
			case '<':
				{
				alt1=3;
				}
				break;
			case '>':
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// Grammar.g:165:12: '=='
					{
					match("=="); 

					}
					break;
				case 2 :
					// Grammar.g:165:17: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// Grammar.g:165:22: '<='
					{
					match("<="); 

					}
					break;
				case 4 :
					// Grammar.g:165:27: '>='
					{
					match(">="); 

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
	// $ANTLR end "OPBOOLEQ"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:167:5: ( '+' )
			// Grammar.g:167:7: '+'
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
	// $ANTLR end "ADD"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:169:7: ( '*' )
			// Grammar.g:169:10: '*'
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
	// $ANTLR end "STAR"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:171:5: ( '/' )
			// Grammar.g:171:7: '/'
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
	// $ANTLR end "DIV"

	// $ANTLR start "UNAIRE"
	public final void mUNAIRE() throws RecognitionException {
		try {
			int _type = UNAIRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:173:8: ( '!' )
			// Grammar.g:173:11: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNAIRE"

	// $ANTLR start "EPERLU"
	public final void mEPERLU() throws RecognitionException {
		try {
			int _type = EPERLU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:175:9: ( '&' )
			// Grammar.g:175:12: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EPERLU"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:177:5: ( 'if' )
			// Grammar.g:177:8: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:180:6: ( '-' )
			// Grammar.g:180:9: '-'
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
	// $ANTLR end "SUB"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:182:7: ( 'main' )
			// Grammar.g:182:9: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:185:7: ( 'true' | 'false' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='t') ) {
				alt2=1;
			}
			else if ( (LA2_0=='f') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Grammar.g:185:9: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// Grammar.g:185:17: 'false'
					{
					match("false"); 

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
	// $ANTLR end "BOOL"

	// $ANTLR start "IDF"
	public final void mIDF() throws RecognitionException {
		try {
			int _type = IDF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:188:8: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// Grammar.g:188:10: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Grammar.g:188:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Grammar.g:
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
					break loop3;
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
	// $ANTLR end "IDF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:192:8: ( ( '0' .. '9' )+ )
			// Grammar.g:192:10: ( '0' .. '9' )+
			{
			// Grammar.g:192:10: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Grammar.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:198:3: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
			// Grammar.g:198:3: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
			{
			match('\"'); 
			// Grammar.g:198:7: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Grammar.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
					break loop5;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:201:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// Grammar.g:201:13: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// Grammar.g:201:18: ( options {greedy=false; } : . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='*') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='/') ) {
						alt6=2;
					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Grammar.g:201:46: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "ATTRIBUTE"
	public final void mATTRIBUTE() throws RecognitionException {
		try {
			int _type = ATTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:203:11: ( '#' ( options {greedy=false; } : . )* ( '\\n' | '\\t' ) )
			// Grammar.g:203:13: '#' ( options {greedy=false; } : . )* ( '\\n' | '\\t' )
			{
			match('#'); 
			// Grammar.g:203:17: ( options {greedy=false; } : . )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')) ) {
					alt7=2;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\b')||(LA7_0 >= '\u000B' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Grammar.g:203:45: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop7;
				}
			}

			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n') ) {
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
	// $ANTLR end "ATTRIBUTE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammar.g:205:8: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// Grammar.g:205:10: ( ' ' | '\\t' | '\\r' | '\\n' )
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
		// Grammar.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | EQUAL | ORBOOL | ANDBOOL | PREV | NEXT | OPBOOLEQ | ADD | STAR | DIV | UNAIRE | EPERLU | IF | SUB | MAIN | BOOL | IDF | INT | STRING | COMMENT | ATTRIBUTE | WS )
		int alt8=46;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// Grammar.g:1:10: T__33
				{
				mT__33(); 

				}
				break;
			case 2 :
				// Grammar.g:1:16: T__34
				{
				mT__34(); 

				}
				break;
			case 3 :
				// Grammar.g:1:22: T__35
				{
				mT__35(); 

				}
				break;
			case 4 :
				// Grammar.g:1:28: T__36
				{
				mT__36(); 

				}
				break;
			case 5 :
				// Grammar.g:1:34: T__37
				{
				mT__37(); 

				}
				break;
			case 6 :
				// Grammar.g:1:40: T__38
				{
				mT__38(); 

				}
				break;
			case 7 :
				// Grammar.g:1:46: T__39
				{
				mT__39(); 

				}
				break;
			case 8 :
				// Grammar.g:1:52: T__40
				{
				mT__40(); 

				}
				break;
			case 9 :
				// Grammar.g:1:58: T__41
				{
				mT__41(); 

				}
				break;
			case 10 :
				// Grammar.g:1:64: T__42
				{
				mT__42(); 

				}
				break;
			case 11 :
				// Grammar.g:1:70: T__43
				{
				mT__43(); 

				}
				break;
			case 12 :
				// Grammar.g:1:76: T__44
				{
				mT__44(); 

				}
				break;
			case 13 :
				// Grammar.g:1:82: T__45
				{
				mT__45(); 

				}
				break;
			case 14 :
				// Grammar.g:1:88: T__46
				{
				mT__46(); 

				}
				break;
			case 15 :
				// Grammar.g:1:94: T__47
				{
				mT__47(); 

				}
				break;
			case 16 :
				// Grammar.g:1:100: T__48
				{
				mT__48(); 

				}
				break;
			case 17 :
				// Grammar.g:1:106: T__49
				{
				mT__49(); 

				}
				break;
			case 18 :
				// Grammar.g:1:112: T__50
				{
				mT__50(); 

				}
				break;
			case 19 :
				// Grammar.g:1:118: T__51
				{
				mT__51(); 

				}
				break;
			case 20 :
				// Grammar.g:1:124: T__52
				{
				mT__52(); 

				}
				break;
			case 21 :
				// Grammar.g:1:130: T__53
				{
				mT__53(); 

				}
				break;
			case 22 :
				// Grammar.g:1:136: T__54
				{
				mT__54(); 

				}
				break;
			case 23 :
				// Grammar.g:1:142: T__55
				{
				mT__55(); 

				}
				break;
			case 24 :
				// Grammar.g:1:148: T__56
				{
				mT__56(); 

				}
				break;
			case 25 :
				// Grammar.g:1:154: T__57
				{
				mT__57(); 

				}
				break;
			case 26 :
				// Grammar.g:1:160: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 27 :
				// Grammar.g:1:166: ORBOOL
				{
				mORBOOL(); 

				}
				break;
			case 28 :
				// Grammar.g:1:173: ANDBOOL
				{
				mANDBOOL(); 

				}
				break;
			case 29 :
				// Grammar.g:1:181: PREV
				{
				mPREV(); 

				}
				break;
			case 30 :
				// Grammar.g:1:186: NEXT
				{
				mNEXT(); 

				}
				break;
			case 31 :
				// Grammar.g:1:191: OPBOOLEQ
				{
				mOPBOOLEQ(); 

				}
				break;
			case 32 :
				// Grammar.g:1:200: ADD
				{
				mADD(); 

				}
				break;
			case 33 :
				// Grammar.g:1:204: STAR
				{
				mSTAR(); 

				}
				break;
			case 34 :
				// Grammar.g:1:209: DIV
				{
				mDIV(); 

				}
				break;
			case 35 :
				// Grammar.g:1:213: UNAIRE
				{
				mUNAIRE(); 

				}
				break;
			case 36 :
				// Grammar.g:1:220: EPERLU
				{
				mEPERLU(); 

				}
				break;
			case 37 :
				// Grammar.g:1:227: IF
				{
				mIF(); 

				}
				break;
			case 38 :
				// Grammar.g:1:230: SUB
				{
				mSUB(); 

				}
				break;
			case 39 :
				// Grammar.g:1:234: MAIN
				{
				mMAIN(); 

				}
				break;
			case 40 :
				// Grammar.g:1:239: BOOL
				{
				mBOOL(); 

				}
				break;
			case 41 :
				// Grammar.g:1:244: IDF
				{
				mIDF(); 

				}
				break;
			case 42 :
				// Grammar.g:1:248: INT
				{
				mINT(); 

				}
				break;
			case 43 :
				// Grammar.g:1:252: STRING
				{
				mSTRING(); 

				}
				break;
			case 44 :
				// Grammar.g:1:259: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 45 :
				// Grammar.g:1:267: ATTRIBUTE
				{
				mATTRIBUTE(); 

				}
				break;
			case 46 :
				// Grammar.g:1:277: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\4\uffff\1\47\5\uffff\13\41\2\uffff\1\71\1\uffff\1\73\1\74\1\75\1\76\2"+
		"\uffff\1\100\1\41\7\uffff\3\41\1\105\2\41\1\110\11\41\11\uffff\4\41\1"+
		"\uffff\1\41\1\130\1\uffff\1\131\1\132\1\41\1\134\4\41\1\141\2\41\1\144"+
		"\1\41\1\146\1\41\3\uffff\1\150\1\uffff\1\151\3\41\1\uffff\1\41\1\156\1"+
		"\uffff\1\157\1\uffff\1\156\2\uffff\1\160\2\41\1\163\3\uffff\1\164\1\165"+
		"\3\uffff";
	static final String DFA8_eofS =
		"\166\uffff";
	static final String DFA8_minS =
		"\1\11\3\uffff\1\76\5\uffff\1\157\1\154\1\141\1\63\1\145\1\141\1\162\1"+
		"\145\1\164\1\145\1\150\2\uffff\1\75\1\uffff\1\46\3\75\2\uffff\1\52\1\162"+
		"\7\uffff\1\157\1\145\1\163\1\60\1\154\1\62\1\60\1\156\1\157\1\164\2\151"+
		"\1\164\1\162\1\143\1\151\11\uffff\1\165\1\154\1\141\1\145\1\uffff\1\163"+
		"\1\60\1\uffff\2\60\1\160\1\60\2\156\2\165\1\60\1\154\1\145\1\60\1\153"+
		"\1\60\1\145\3\uffff\1\60\1\uffff\1\60\1\164\1\162\1\143\1\uffff\1\145"+
		"\1\60\1\uffff\1\60\1\uffff\1\60\2\uffff\1\60\1\156\1\164\1\60\3\uffff"+
		"\2\60\3\uffff";
	static final String DFA8_maxS =
		"\1\175\3\uffff\1\76\5\uffff\1\162\1\154\1\156\1\146\1\157\1\165\1\162"+
		"\1\145\1\164\1\145\1\150\2\uffff\1\75\1\uffff\1\46\3\75\2\uffff\1\52\1"+
		"\162\7\uffff\1\157\1\145\1\163\1\172\1\154\1\62\1\172\1\164\1\157\1\164"+
		"\2\151\1\164\1\162\1\143\1\151\11\uffff\1\165\1\154\1\141\1\145\1\uffff"+
		"\1\163\1\172\1\uffff\2\172\1\160\1\172\2\156\2\165\1\172\1\154\1\145\1"+
		"\172\1\153\1\172\1\145\3\uffff\1\172\1\uffff\1\172\1\164\1\162\1\143\1"+
		"\uffff\1\145\1\172\1\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\156\1\164"+
		"\1\172\3\uffff\2\172\3\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\1\11\13\uffff\1\30\1\31"+
		"\1\uffff\1\33\4\uffff\1\40\1\41\2\uffff\1\51\1\52\1\53\1\55\1\56\1\4\1"+
		"\46\20\uffff\1\37\1\32\1\34\1\44\1\35\1\36\1\43\1\54\1\42\4\uffff\1\15"+
		"\2\uffff\1\45\17\uffff\1\16\1\17\1\20\1\uffff\1\22\4\uffff\1\26\2\uffff"+
		"\1\12\1\uffff\1\14\1\uffff\1\21\1\47\4\uffff\1\50\1\13\1\23\2\uffff\1"+
		"\27\1\24\1\25";
	static final String DFA8_specialS =
		"\166\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\45\2\uffff\1\45\22\uffff\1\45\1\34\1\43\1\44\2\uffff\1\31\1\uffff"+
			"\1\1\1\2\1\36\1\35\1\3\1\4\1\5\1\37\12\42\1\6\1\7\1\32\1\27\1\33\34\uffff"+
			"\1\10\1\uffff\1\11\3\uffff\1\41\1\12\2\41\1\13\1\14\2\41\1\15\2\41\1"+
			"\16\1\17\2\41\1\20\1\41\1\21\1\22\1\40\1\41\1\23\1\24\3\41\1\25\1\30"+
			"\1\26",
			"",
			"",
			"",
			"\1\46",
			"",
			"",
			"",
			"",
			"",
			"\1\50\2\uffff\1\51",
			"\1\52",
			"\1\54\14\uffff\1\53",
			"\1\55\62\uffff\1\56",
			"\1\57\11\uffff\1\60",
			"\1\62\23\uffff\1\61",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"",
			"",
			"\1\70",
			"",
			"\1\72",
			"\1\70",
			"\1\70",
			"\1\70",
			"",
			"",
			"\1\77",
			"\1\101",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\102",
			"\1\103",
			"\1\104",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\106",
			"\1\107",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\111\5\uffff\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"",
			"\1\127",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\133",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\142",
			"\1\143",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\145",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\147",
			"",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\152",
			"\1\153",
			"\1\154",
			"",
			"\1\155",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\161",
			"\1\162",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | EQUAL | ORBOOL | ANDBOOL | PREV | NEXT | OPBOOLEQ | ADD | STAR | DIV | UNAIRE | EPERLU | IF | SUB | MAIN | BOOL | IDF | INT | STRING | COMMENT | ATTRIBUTE | WS );";
		}
	}

}
