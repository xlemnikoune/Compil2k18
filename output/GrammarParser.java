// $ANTLR null /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g 2018-04-12 14:28:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class GrammarParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ANDBOOL", "ANOBLOCK", 
		"ATTRIBUTE", "BLOCK", "BOOL", "CALLFUN", "COMMENT", "DIV", "EPERLU", "EQUAL", 
		"IDF", "IF", "INT", "MAIN", "NEW", "NEXT", "OPBOOLEQ", "ORBOOL", "PREV", 
		"STAR", "STRING", "SUB", "UNAIRE", "UNISTAR", "UNISUB", "VEC", "WS", "'('", 
		"')'", "','", "'->'", "'.'", "':'", "';'", "'['", "']'", "'bool'", "'break'", 
		"'else'", "'fn'", "'i32'", "'len'", "'let'", "'loop'", "'mut'", "'print'", 
		"'return'", "'struct'", "'vec'", "'while'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__32=32;
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
	public static final int STAR=24;
	public static final int STRING=25;
	public static final int SUB=26;
	public static final int UNAIRE=27;
	public static final int UNISTAR=28;
	public static final int UNISUB=29;
	public static final int VEC=30;
	public static final int WS=31;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "binExpr4", "bigbinExpr2", "dotIDF", "bigbinExpr3", "type", 
		"binExpr6", "atom", "declFun", "axiom", "newStruc", "bigbinExpr6", "binExpr5", 
		"expr", "bigvectExpr", "bigdotExpr", "binExpr2", "moinsExpr", "bigatom", 
		"fichier", "ifExpr", "bigbinExpr5", "bigmoinsExpr", "callFun", "binExpr1", 
		"bigbinExpr4", "bigunExpr", "decl", "declStruct", "args", "binExpr3", 
		"unExpr", "bigstarExpr", "instruct", "block", "vectExpr", "starExpr", 
		"bigExpr", "dotExpr", "bigbinExpr1"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public GrammarParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public GrammarParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public GrammarParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return GrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g"; }


	boolean mainFound = false;


	public static class axiom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "axiom"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:23:1: axiom : fichier EOF -> fichier ;
	public final GrammarParser.axiom_return axiom() throws RecognitionException {
		GrammarParser.axiom_return retval = new GrammarParser.axiom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope fichier1 =null;

		CommonTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_fichier=new RewriteRuleSubtreeStream(adaptor,"rule fichier");

		try { dbg.enterRule(getGrammarFileName(), "axiom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:23:7: ( fichier EOF -> fichier )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:23:9: fichier EOF
			{
			dbg.location(23,9);
			pushFollow(FOLLOW_fichier_in_axiom90);
			fichier1=fichier();
			state._fsp--;

			stream_fichier.add(fichier1.getTree());dbg.location(23,17);
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_axiom92);  
			stream_EOF.add(EOF2);
			dbg.location(23,21);
			if (!mainFound){System.err.println("main not found");System.exit(1);}
			// AST REWRITE
			// elements: fichier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 23:93: -> fichier
			{
				dbg.location(23,96);
				adaptor.addChild(root_0, stream_fichier.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(24, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "axiom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "axiom"


	public static class fichier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fichier"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:26:1: fichier : ( decl )* ;
	public final GrammarParser.fichier_return fichier() throws RecognitionException {
		GrammarParser.fichier_return retval = new GrammarParser.fichier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope decl3 =null;


		try { dbg.enterRule(getGrammarFileName(), "fichier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:26:9: ( ( decl )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:26:11: ( decl )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(26,11);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:26:11: ( decl )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==44||LA1_0==52) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:26:11: decl
					{
					dbg.location(26,11);
					pushFollow(FOLLOW_decl_in_fichier108);
					decl3=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(27, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fichier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fichier"


	public static class decl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:29:1: decl : ( declFun | declStruct );
	public final GrammarParser.decl_return decl() throws RecognitionException {
		GrammarParser.decl_return retval = new GrammarParser.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declFun4 =null;
		ParserRuleReturnScope declStruct5 =null;


		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:29:6: ( declFun | declStruct )
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==44) ) {
				alt2=1;
			}
			else if ( (LA2_0==52) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:29:8: declFun
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(29,8);
					pushFollow(FOLLOW_declFun_in_decl119);
					declFun4=declFun();
					state._fsp--;

					adaptor.addChild(root_0, declFun4.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:30:3: declStruct
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(30,3);
					pushFollow(FOLLOW_declStruct_in_decl123);
					declStruct5=declStruct();
					state._fsp--;

					adaptor.addChild(root_0, declStruct5.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(31, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decl"


	public static class declStruct_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declStruct"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:33:1: declStruct : 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) ;
	public final GrammarParser.declStruct_return declStruct() throws RecognitionException {
		GrammarParser.declStruct_return retval = new GrammarParser.declStruct_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal6=null;
		Token IDF7=null;
		Token char_literal8=null;
		Token char_literal10=null;
		ParserRuleReturnScope args9 =null;

		CommonTree string_literal6_tree=null;
		CommonTree IDF7_tree=null;
		CommonTree char_literal8_tree=null;
		CommonTree char_literal10_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");

		try { dbg.enterRule(getGrammarFileName(), "declStruct");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:33:12: ( 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:33:14: 'struct' IDF '{' ( args )? '}'
			{
			dbg.location(33,14);
			string_literal6=(Token)match(input,52,FOLLOW_52_in_declStruct132);  
			stream_52.add(string_literal6);
			dbg.location(33,23);
			IDF7=(Token)match(input,IDF,FOLLOW_IDF_in_declStruct134);  
			stream_IDF.add(IDF7);
			dbg.location(33,27);
			char_literal8=(Token)match(input,55,FOLLOW_55_in_declStruct136);  
			stream_55.add(char_literal8);
			dbg.location(33,31);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:33:31: ( args )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==IDF) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:33:31: args
					{
					dbg.location(33,31);
					pushFollow(FOLLOW_args_in_declStruct138);
					args9=args();
					state._fsp--;

					stream_args.add(args9.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(33,37);
			char_literal10=(Token)match(input,56,FOLLOW_56_in_declStruct141);  
			stream_56.add(char_literal10);

			// AST REWRITE
			// elements: args, IDF, 52
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 33:41: -> ^( 'struct' IDF ( args )? )
			{
				dbg.location(33,44);
				// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:33:44: ^( 'struct' IDF ( args )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(33,46);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_52.nextNode(), root_1);
				dbg.location(33,55);
				adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(33,59);
				// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:33:59: ( args )?
				if ( stream_args.hasNext() ) {
					dbg.location(33,59);
					adaptor.addChild(root_1, stream_args.nextTree());
				}
				stream_args.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(34, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declStruct");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "declStruct"


	public static class args_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "args"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:36:1: args : IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* ;
	public final GrammarParser.args_return args() throws RecognitionException {
		GrammarParser.args_return retval = new GrammarParser.args_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF11=null;
		Token char_literal12=null;
		Token char_literal14=null;
		Token IDF15=null;
		Token char_literal16=null;
		ParserRuleReturnScope type13 =null;
		ParserRuleReturnScope type17 =null;

		CommonTree IDF11_tree=null;
		CommonTree char_literal12_tree=null;
		CommonTree char_literal14_tree=null;
		CommonTree IDF15_tree=null;
		CommonTree char_literal16_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "args");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:36:6: ( IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:36:8: IDF ':' type ( ',' IDF ':' type )*
			{
			dbg.location(36,8);
			IDF11=(Token)match(input,IDF,FOLLOW_IDF_in_args162);  
			stream_IDF.add(IDF11);
			dbg.location(36,12);
			char_literal12=(Token)match(input,37,FOLLOW_37_in_args164);  
			stream_37.add(char_literal12);
			dbg.location(36,16);
			pushFollow(FOLLOW_type_in_args166);
			type13=type();
			state._fsp--;

			stream_type.add(type13.getTree());dbg.location(36,21);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:36:21: ( ',' IDF ':' type )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==34) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:36:22: ',' IDF ':' type
					{
					dbg.location(36,22);
					char_literal14=(Token)match(input,34,FOLLOW_34_in_args169);  
					stream_34.add(char_literal14);
					dbg.location(36,26);
					IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_args171);  
					stream_IDF.add(IDF15);
					dbg.location(36,30);
					char_literal16=(Token)match(input,37,FOLLOW_37_in_args173);  
					stream_37.add(char_literal16);
					dbg.location(36,34);
					pushFollow(FOLLOW_type_in_args175);
					type17=type();
					state._fsp--;

					stream_type.add(type17.getTree());
					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}

			// AST REWRITE
			// elements: type, IDF
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 36:41: -> ( ^( IDF type ) )*
			{
				dbg.location(36,44);
				// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:36:44: ( ^( IDF type ) )*
				while ( stream_type.hasNext()||stream_IDF.hasNext() ) {
					dbg.location(36,45);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:36:45: ^( IDF type )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					dbg.location(36,47);
					root_1 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);
					dbg.location(36,51);
					adaptor.addChild(root_1, stream_type.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_type.reset();
				stream_IDF.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(37, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "args");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "args"


	public static class declFun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declFun"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:1: declFun : 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) ;
	public final GrammarParser.declFun_return declFun() throws RecognitionException {
		GrammarParser.declFun_return retval = new GrammarParser.declFun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal18=null;
		Token IDF19=null;
		Token char_literal20=null;
		Token char_literal22=null;
		Token string_literal23=null;
		Token MAIN26=null;
		Token char_literal27=null;
		Token char_literal28=null;
		ParserRuleReturnScope args21 =null;
		ParserRuleReturnScope type24 =null;
		ParserRuleReturnScope block25 =null;
		ParserRuleReturnScope block29 =null;

		CommonTree string_literal18_tree=null;
		CommonTree IDF19_tree=null;
		CommonTree char_literal20_tree=null;
		CommonTree char_literal22_tree=null;
		CommonTree string_literal23_tree=null;
		CommonTree MAIN26_tree=null;
		CommonTree char_literal27_tree=null;
		CommonTree char_literal28_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_MAIN=new RewriteRuleTokenStream(adaptor,"token MAIN");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "declFun");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:9: ( 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:11: 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
			{
			dbg.location(39,11);
			string_literal18=(Token)match(input,44,FOLLOW_44_in_declFun197);  
			stream_44.add(string_literal18);
			dbg.location(39,16);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:16: ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==IDF) ) {
				alt7=1;
			}
			else if ( (LA7_0==MAIN) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:17: IDF '(' ( args )? ')' ( '->' type )? block
					{
					dbg.location(39,17);
					IDF19=(Token)match(input,IDF,FOLLOW_IDF_in_declFun200);  
					stream_IDF.add(IDF19);
					dbg.location(39,21);
					char_literal20=(Token)match(input,32,FOLLOW_32_in_declFun202);  
					stream_32.add(char_literal20);
					dbg.location(39,25);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:25: ( args )?
					int alt5=2;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					int LA5_0 = input.LA(1);
					if ( (LA5_0==IDF) ) {
						alt5=1;
					}
					} finally {dbg.exitDecision(5);}

					switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:25: args
							{
							dbg.location(39,25);
							pushFollow(FOLLOW_args_in_declFun204);
							args21=args();
							state._fsp--;

							stream_args.add(args21.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(5);}
					dbg.location(39,31);
					char_literal22=(Token)match(input,33,FOLLOW_33_in_declFun207);  
					stream_33.add(char_literal22);
					dbg.location(39,35);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:35: ( '->' type )?
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( (LA6_0==35) ) {
						alt6=1;
					}
					} finally {dbg.exitDecision(6);}

					switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:36: '->' type
							{
							dbg.location(39,36);
							string_literal23=(Token)match(input,35,FOLLOW_35_in_declFun210);  
							stream_35.add(string_literal23);
							dbg.location(39,41);
							pushFollow(FOLLOW_type_in_declFun212);
							type24=type();
							state._fsp--;

							stream_type.add(type24.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(6);}
					dbg.location(39,48);
					pushFollow(FOLLOW_block_in_declFun216);
					block25=block();
					state._fsp--;

					stream_block.add(block25.getTree());
					// AST REWRITE
					// elements: block, type, 44, args, 35, IDF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 39:54: -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block )
					{
						dbg.location(39,57);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:57: ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(39,59);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_44.nextNode(), root_1);
						dbg.location(39,64);
						adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(39,68);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:68: ( ^( '->' type ) )?
						if ( stream_type.hasNext()||stream_35.hasNext() ) {
							dbg.location(39,68);
							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:68: ^( '->' type )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							dbg.location(39,70);
							root_2 = (CommonTree)adaptor.becomeRoot(stream_35.nextNode(), root_2);
							dbg.location(39,75);
							adaptor.addChild(root_2, stream_type.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_type.reset();
						stream_35.reset();
						dbg.location(39,82);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:39:82: ( args )?
						if ( stream_args.hasNext() ) {
							dbg.location(39,82);
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();
						dbg.location(39,89);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:40:4: MAIN '(' ')' block
					{
					dbg.location(40,4);
					mainFound = true;dbg.location(40,23);
					MAIN26=(Token)match(input,MAIN,FOLLOW_MAIN_in_declFun243);  
					stream_MAIN.add(MAIN26);
					dbg.location(40,28);
					char_literal27=(Token)match(input,32,FOLLOW_32_in_declFun245);  
					stream_32.add(char_literal27);
					dbg.location(40,32);
					char_literal28=(Token)match(input,33,FOLLOW_33_in_declFun247);  
					stream_33.add(char_literal28);
					dbg.location(40,36);
					pushFollow(FOLLOW_block_in_declFun249);
					block29=block();
					state._fsp--;

					stream_block.add(block29.getTree());
					// AST REWRITE
					// elements: 44, MAIN, block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 40:42: -> ^( 'fn' MAIN block )
					{
						dbg.location(40,45);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:40:45: ^( 'fn' MAIN block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(40,47);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_44.nextNode(), root_1);
						dbg.location(40,52);
						adaptor.addChild(root_1, stream_MAIN.nextNode());dbg.location(40,57);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declFun");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "declFun"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:43:1: type : (| 'i32' | 'bool' | IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) );
	public final GrammarParser.type_return type() throws RecognitionException {
		GrammarParser.type_return retval = new GrammarParser.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal30=null;
		Token string_literal31=null;
		Token IDF32=null;
		Token string_literal33=null;
		Token char_literal34=null;
		Token char_literal36=null;
		Token char_literal37=null;
		ParserRuleReturnScope type35 =null;
		ParserRuleReturnScope type38 =null;

		CommonTree string_literal30_tree=null;
		CommonTree string_literal31_tree=null;
		CommonTree IDF32_tree=null;
		CommonTree string_literal33_tree=null;
		CommonTree char_literal34_tree=null;
		CommonTree char_literal36_tree=null;
		CommonTree char_literal37_tree=null;
		RewriteRuleTokenStream stream_PREV=new RewriteRuleTokenStream(adaptor,"token PREV");
		RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
		RewriteRuleTokenStream stream_EPERLU=new RewriteRuleTokenStream(adaptor,"token EPERLU");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:43:6: (| 'i32' | 'bool' | IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) )
			int alt8=6;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case EQUAL:
			case NEXT:
			case 33:
			case 34:
			case 55:
			case 56:
				{
				alt8=1;
				}
				break;
			case 45:
				{
				alt8=2;
				}
				break;
			case 41:
				{
				alt8=3;
				}
				break;
			case IDF:
				{
				alt8=4;
				}
				break;
			case 53:
				{
				alt8=5;
				}
				break;
			case EPERLU:
				{
				alt8=6;
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

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:43:8: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:43:10: 'i32'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(43,10);
					string_literal30=(Token)match(input,45,FOLLOW_45_in_type271); 
					string_literal30_tree = (CommonTree)adaptor.create(string_literal30);
					adaptor.addChild(root_0, string_literal30_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:44:3: 'bool'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(44,3);
					string_literal31=(Token)match(input,41,FOLLOW_41_in_type275); 
					string_literal31_tree = (CommonTree)adaptor.create(string_literal31);
					adaptor.addChild(root_0, string_literal31_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:45:2: IDF
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(45,2);
					IDF32=(Token)match(input,IDF,FOLLOW_IDF_in_type278); 
					IDF32_tree = (CommonTree)adaptor.create(IDF32);
					adaptor.addChild(root_0, IDF32_tree);

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:46:4: 'vec' ( '<' type '>' )
					{
					dbg.location(46,4);
					string_literal33=(Token)match(input,53,FOLLOW_53_in_type283);  
					stream_53.add(string_literal33);
					dbg.location(46,10);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:46:10: ( '<' type '>' )
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:46:11: '<' type '>'
					{
					dbg.location(46,11);
					char_literal34=(Token)match(input,PREV,FOLLOW_PREV_in_type286);  
					stream_PREV.add(char_literal34);
					dbg.location(46,15);
					pushFollow(FOLLOW_type_in_type288);
					type35=type();
					state._fsp--;

					stream_type.add(type35.getTree());dbg.location(46,20);
					char_literal36=(Token)match(input,NEXT,FOLLOW_NEXT_in_type290);  
					stream_NEXT.add(char_literal36);

					}

					// AST REWRITE
					// elements: type, 53
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 46:25: -> ^( 'vec' type )
					{
						dbg.location(46,28);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:46:28: ^( 'vec' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(46,30);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_53.nextNode(), root_1);
						dbg.location(46,36);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:47:3: '&' type
					{
					dbg.location(47,3);
					char_literal37=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_type304);  
					stream_EPERLU.add(char_literal37);
					dbg.location(47,7);
					pushFollow(FOLLOW_type_in_type306);
					type38=type();
					state._fsp--;

					stream_type.add(type38.getTree());
					// AST REWRITE
					// elements: type, EPERLU
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 47:12: -> ^( '&' type )
					{
						dbg.location(47,15);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:47:15: ^( '&' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(47,17);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_EPERLU.nextNode(), root_1);
						dbg.location(47,21);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(48, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "type"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:50:1: block : '{' ( instruct )* '}' -> ^( BLOCK ( instruct )* ) ;
	public final GrammarParser.block_return block() throws RecognitionException {
		GrammarParser.block_return retval = new GrammarParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal39=null;
		Token char_literal41=null;
		ParserRuleReturnScope instruct40 =null;

		CommonTree char_literal39_tree=null;
		CommonTree char_literal41_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleSubtreeStream stream_instruct=new RewriteRuleSubtreeStream(adaptor,"rule instruct");

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:50:7: ( '{' ( instruct )* '}' -> ^( BLOCK ( instruct )* ) )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:50:9: '{' ( instruct )* '}'
			{
			dbg.location(50,9);
			char_literal39=(Token)match(input,55,FOLLOW_55_in_block323);  
			stream_55.add(char_literal39);
			dbg.location(50,13);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:50:13: ( instruct )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==BOOL||LA9_0==EPERLU||(LA9_0 >= IDF && LA9_0 <= INT)||LA9_0==STAR||(LA9_0 >= SUB && LA9_0 <= UNAIRE)||LA9_0==32||LA9_0==38||LA9_0==42||(LA9_0 >= 47 && LA9_0 <= 48)||(LA9_0 >= 50 && LA9_0 <= 51)||(LA9_0 >= 53 && LA9_0 <= 55)) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:50:13: instruct
					{
					dbg.location(50,13);
					pushFollow(FOLLOW_instruct_in_block325);
					instruct40=instruct();
					state._fsp--;

					stream_instruct.add(instruct40.getTree());
					}
					break;

				default :
					break loop9;
				}
			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(50,23);
			char_literal41=(Token)match(input,56,FOLLOW_56_in_block328);  
			stream_56.add(char_literal41);

			// AST REWRITE
			// elements: instruct
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 50:26: -> ^( BLOCK ( instruct )* )
			{
				dbg.location(50,29);
				// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:50:29: ^( BLOCK ( instruct )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(50,31);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				dbg.location(50,37);
				// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:50:37: ( instruct )*
				while ( stream_instruct.hasNext() ) {
					dbg.location(50,37);
					adaptor.addChild(root_1, stream_instruct.nextTree());
				}
				stream_instruct.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(51, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "block"


	public static class callFun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "callFun"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:54:1: callFun : '(' expr ( ',' expr )* ')' -> ( expr )* ;
	public final GrammarParser.callFun_return callFun() throws RecognitionException {
		GrammarParser.callFun_return retval = new GrammarParser.callFun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal42=null;
		Token char_literal44=null;
		Token char_literal46=null;
		ParserRuleReturnScope expr43 =null;
		ParserRuleReturnScope expr45 =null;

		CommonTree char_literal42_tree=null;
		CommonTree char_literal44_tree=null;
		CommonTree char_literal46_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "callFun");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:54:9: ( '(' expr ( ',' expr )* ')' -> ( expr )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:54:11: '(' expr ( ',' expr )* ')'
			{
			dbg.location(54,11);
			char_literal42=(Token)match(input,32,FOLLOW_32_in_callFun347);  
			stream_32.add(char_literal42);
			dbg.location(54,15);
			pushFollow(FOLLOW_expr_in_callFun349);
			expr43=expr();
			state._fsp--;

			stream_expr.add(expr43.getTree());dbg.location(54,20);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:54:20: ( ',' expr )*
			try { dbg.enterSubRule(10);

			loop10:
			while (true) {
				int alt10=2;
				try { dbg.enterDecision(10, decisionCanBacktrack[10]);

				int LA10_0 = input.LA(1);
				if ( (LA10_0==34) ) {
					alt10=1;
				}

				} finally {dbg.exitDecision(10);}

				switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:54:21: ',' expr
					{
					dbg.location(54,21);
					char_literal44=(Token)match(input,34,FOLLOW_34_in_callFun352);  
					stream_34.add(char_literal44);
					dbg.location(54,25);
					pushFollow(FOLLOW_expr_in_callFun354);
					expr45=expr();
					state._fsp--;

					stream_expr.add(expr45.getTree());
					}
					break;

				default :
					break loop10;
				}
			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(54,32);
			char_literal46=(Token)match(input,33,FOLLOW_33_in_callFun358);  
			stream_33.add(char_literal46);

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 54:36: -> ( expr )*
			{
				dbg.location(54,39);
				// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:54:39: ( expr )*
				while ( stream_expr.hasNext() ) {
					dbg.location(54,39);
					adaptor.addChild(root_0, stream_expr.nextTree());
				}
				stream_expr.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(54, 43);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "callFun");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "callFun"


	public static class newStruc_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "newStruc"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:56:1: newStruc : '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) ;
	public final GrammarParser.newStruc_return newStruc() throws RecognitionException {
		GrammarParser.newStruc_return retval = new GrammarParser.newStruc_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal47=null;
		Token IDF48=null;
		Token char_literal49=null;
		Token char_literal51=null;
		Token IDF52=null;
		Token char_literal53=null;
		Token char_literal55=null;
		ParserRuleReturnScope bigExpr50 =null;
		ParserRuleReturnScope bigExpr54 =null;

		CommonTree char_literal47_tree=null;
		CommonTree IDF48_tree=null;
		CommonTree char_literal49_tree=null;
		CommonTree char_literal51_tree=null;
		CommonTree IDF52_tree=null;
		CommonTree char_literal53_tree=null;
		CommonTree char_literal55_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");

		try { dbg.enterRule(getGrammarFileName(), "newStruc");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:56:10: ( '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:56:12: '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}'
			{
			dbg.location(56,12);
			char_literal47=(Token)match(input,55,FOLLOW_55_in_newStruc371);  
			stream_55.add(char_literal47);
			dbg.location(56,16);
			IDF48=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc373);  
			stream_IDF.add(IDF48);
			dbg.location(56,20);
			char_literal49=(Token)match(input,37,FOLLOW_37_in_newStruc375);  
			stream_37.add(char_literal49);
			dbg.location(56,24);
			pushFollow(FOLLOW_bigExpr_in_newStruc377);
			bigExpr50=bigExpr();
			state._fsp--;

			stream_bigExpr.add(bigExpr50.getTree());dbg.location(56,32);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:56:32: ( ',' IDF ':' bigExpr )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==34) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:56:33: ',' IDF ':' bigExpr
					{
					dbg.location(56,33);
					char_literal51=(Token)match(input,34,FOLLOW_34_in_newStruc380);  
					stream_34.add(char_literal51);
					dbg.location(56,37);
					IDF52=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc382);  
					stream_IDF.add(IDF52);
					dbg.location(56,41);
					char_literal53=(Token)match(input,37,FOLLOW_37_in_newStruc384);  
					stream_37.add(char_literal53);
					dbg.location(56,45);
					pushFollow(FOLLOW_bigExpr_in_newStruc386);
					bigExpr54=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr54.getTree());
					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(56,55);
			char_literal55=(Token)match(input,56,FOLLOW_56_in_newStruc390);  
			stream_56.add(char_literal55);

			// AST REWRITE
			// elements: bigExpr, IDF
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 56:59: -> ^( NEW ( ^( IDF bigExpr ) )* )
			{
				dbg.location(56,62);
				// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:56:62: ^( NEW ( ^( IDF bigExpr ) )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(56,64);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);
				dbg.location(56,68);
				// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:56:68: ( ^( IDF bigExpr ) )*
				while ( stream_bigExpr.hasNext()||stream_IDF.hasNext() ) {
					dbg.location(56,68);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:56:68: ^( IDF bigExpr )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					dbg.location(56,70);
					root_2 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);
					dbg.location(56,74);
					adaptor.addChild(root_2, stream_bigExpr.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_bigExpr.reset();
				stream_IDF.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 83);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "newStruc");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "newStruc"


	public static class instruct_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruct"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:58:1: instruct : ( expr ';' -> expr | ';' ->| 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) | 'while' expr block -> ^( 'while' expr block ) | 'return' ( expr )? ';' -> ^( 'return' ( expr )? ) | 'loop' block -> ^( 'loop' block ) | 'break' ';' -> 'break' | ifExpr );
	public final GrammarParser.instruct_return instruct() throws RecognitionException {
		GrammarParser.instruct_return retval = new GrammarParser.instruct_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal57=null;
		Token char_literal58=null;
		Token string_literal59=null;
		Token string_literal60=null;
		Token char_literal62=null;
		Token char_literal64=null;
		Token char_literal66=null;
		Token string_literal67=null;
		Token string_literal70=null;
		Token char_literal72=null;
		Token string_literal73=null;
		Token string_literal75=null;
		Token char_literal76=null;
		ParserRuleReturnScope expr56 =null;
		ParserRuleReturnScope dotIDF61 =null;
		ParserRuleReturnScope type63 =null;
		ParserRuleReturnScope bigExpr65 =null;
		ParserRuleReturnScope expr68 =null;
		ParserRuleReturnScope block69 =null;
		ParserRuleReturnScope expr71 =null;
		ParserRuleReturnScope block74 =null;
		ParserRuleReturnScope ifExpr77 =null;

		CommonTree char_literal57_tree=null;
		CommonTree char_literal58_tree=null;
		CommonTree string_literal59_tree=null;
		CommonTree string_literal60_tree=null;
		CommonTree char_literal62_tree=null;
		CommonTree char_literal64_tree=null;
		CommonTree char_literal66_tree=null;
		CommonTree string_literal67_tree=null;
		CommonTree string_literal70_tree=null;
		CommonTree char_literal72_tree=null;
		CommonTree string_literal73_tree=null;
		CommonTree string_literal75_tree=null;
		CommonTree char_literal76_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_dotIDF=new RewriteRuleSubtreeStream(adaptor,"rule dotIDF");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "instruct");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:58:10: ( expr ';' -> expr | ';' ->| 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) | 'while' expr block -> ^( 'while' expr block ) | 'return' ( expr )? ';' -> ^( 'return' ( expr )? ) | 'loop' block -> ^( 'loop' block ) | 'break' ';' -> 'break' | ifExpr )
			int alt15=8;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			switch ( input.LA(1) ) {
			case BOOL:
			case EPERLU:
			case IDF:
			case INT:
			case STAR:
			case SUB:
			case UNAIRE:
			case 32:
			case 50:
			case 53:
			case 55:
				{
				alt15=1;
				}
				break;
			case 38:
				{
				alt15=2;
				}
				break;
			case 47:
				{
				alt15=3;
				}
				break;
			case 54:
				{
				alt15=4;
				}
				break;
			case 51:
				{
				alt15=5;
				}
				break;
			case 48:
				{
				alt15=6;
				}
				break;
			case 42:
				{
				alt15=7;
				}
				break;
			case IF:
				{
				alt15=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:59:3: expr ';'
					{
					dbg.location(59,3);
					pushFollow(FOLLOW_expr_in_instruct414);
					expr56=expr();
					state._fsp--;

					stream_expr.add(expr56.getTree());dbg.location(59,8);
					char_literal57=(Token)match(input,38,FOLLOW_38_in_instruct416);  
					stream_38.add(char_literal57);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 59:12: -> expr
					{
						dbg.location(59,15);
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:60:3: ';'
					{
					dbg.location(60,3);
					char_literal58=(Token)match(input,38,FOLLOW_38_in_instruct424);  
					stream_38.add(char_literal58);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 60:7: ->
					{
						dbg.location(61,0);
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:61:3: 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';'
					{
					dbg.location(61,3);
					string_literal59=(Token)match(input,47,FOLLOW_47_in_instruct430);  
					stream_47.add(string_literal59);
					dbg.location(61,9);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:61:9: ( 'mut' )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==49) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:61:9: 'mut'
							{
							dbg.location(61,9);
							string_literal60=(Token)match(input,49,FOLLOW_49_in_instruct432);  
							stream_49.add(string_literal60);

							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(61,16);
					pushFollow(FOLLOW_dotIDF_in_instruct435);
					dotIDF61=dotIDF();
					state._fsp--;

					stream_dotIDF.add(dotIDF61.getTree());dbg.location(61,23);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:61:23: ( ':' type )?
					int alt13=2;
					try { dbg.enterSubRule(13);
					try { dbg.enterDecision(13, decisionCanBacktrack[13]);

					int LA13_0 = input.LA(1);
					if ( (LA13_0==37) ) {
						alt13=1;
					}
					} finally {dbg.exitDecision(13);}

					switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:61:24: ':' type
							{
							dbg.location(61,24);
							char_literal62=(Token)match(input,37,FOLLOW_37_in_instruct438);  
							stream_37.add(char_literal62);
							dbg.location(61,28);
							pushFollow(FOLLOW_type_in_instruct440);
							type63=type();
							state._fsp--;

							stream_type.add(type63.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(61,35);
					char_literal64=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instruct444);  
					stream_EQUAL.add(char_literal64);
					dbg.location(61,39);
					pushFollow(FOLLOW_bigExpr_in_instruct446);
					bigExpr65=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr65.getTree());dbg.location(61,47);
					char_literal66=(Token)match(input,38,FOLLOW_38_in_instruct448);  
					stream_38.add(char_literal66);

					// AST REWRITE
					// elements: EQUAL, type, 47, bigExpr, dotIDF, 49
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 61:51: -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) )
					{
						dbg.location(61,54);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:61:54: ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(61,56);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_47.nextNode(), root_1);
						dbg.location(61,62);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:61:62: ( 'mut' )?
						if ( stream_49.hasNext() ) {
							dbg.location(61,62);
							adaptor.addChild(root_1, stream_49.nextNode());
						}
						stream_49.reset();
						dbg.location(61,69);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:61:69: ( type )?
						if ( stream_type.hasNext() ) {
							dbg.location(61,70);
							adaptor.addChild(root_1, stream_type.nextTree());
						}
						stream_type.reset();
						dbg.location(61,77);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:61:77: ^( '=' dotIDF bigExpr )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(61,79);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_EQUAL.nextNode(), root_2);
						dbg.location(61,83);
						adaptor.addChild(root_2, stream_dotIDF.nextTree());dbg.location(61,90);
						adaptor.addChild(root_2, stream_bigExpr.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:62:3: 'while' expr block
					{
					dbg.location(62,3);
					string_literal67=(Token)match(input,54,FOLLOW_54_in_instruct475);  
					stream_54.add(string_literal67);
					dbg.location(62,11);
					pushFollow(FOLLOW_expr_in_instruct477);
					expr68=expr();
					state._fsp--;

					stream_expr.add(expr68.getTree());dbg.location(62,16);
					pushFollow(FOLLOW_block_in_instruct479);
					block69=block();
					state._fsp--;

					stream_block.add(block69.getTree());
					// AST REWRITE
					// elements: expr, 54, block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 62:22: -> ^( 'while' expr block )
					{
						dbg.location(62,25);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:62:25: ^( 'while' expr block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(62,27);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_54.nextNode(), root_1);
						dbg.location(62,35);
						adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(62,40);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:63:3: 'return' ( expr )? ';'
					{
					dbg.location(63,3);
					string_literal70=(Token)match(input,51,FOLLOW_51_in_instruct493);  
					stream_51.add(string_literal70);
					dbg.location(63,12);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:63:12: ( expr )?
					int alt14=2;
					try { dbg.enterSubRule(14);
					try { dbg.enterDecision(14, decisionCanBacktrack[14]);

					int LA14_0 = input.LA(1);
					if ( (LA14_0==BOOL||LA14_0==EPERLU||LA14_0==IDF||LA14_0==INT||LA14_0==STAR||(LA14_0 >= SUB && LA14_0 <= UNAIRE)||LA14_0==32||LA14_0==50||LA14_0==53||LA14_0==55) ) {
						alt14=1;
					}
					} finally {dbg.exitDecision(14);}

					switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:63:12: expr
							{
							dbg.location(63,12);
							pushFollow(FOLLOW_expr_in_instruct495);
							expr71=expr();
							state._fsp--;

							stream_expr.add(expr71.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(63,18);
					char_literal72=(Token)match(input,38,FOLLOW_38_in_instruct498);  
					stream_38.add(char_literal72);

					// AST REWRITE
					// elements: expr, 51
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 63:22: -> ^( 'return' ( expr )? )
					{
						dbg.location(63,25);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:63:25: ^( 'return' ( expr )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(63,27);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_51.nextNode(), root_1);
						dbg.location(63,36);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:63:36: ( expr )?
						if ( stream_expr.hasNext() ) {
							dbg.location(63,36);
							adaptor.addChild(root_1, stream_expr.nextTree());
						}
						stream_expr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:64:3: 'loop' block
					{
					dbg.location(64,3);
					string_literal73=(Token)match(input,48,FOLLOW_48_in_instruct511);  
					stream_48.add(string_literal73);
					dbg.location(64,10);
					pushFollow(FOLLOW_block_in_instruct513);
					block74=block();
					state._fsp--;

					stream_block.add(block74.getTree());
					// AST REWRITE
					// elements: block, 48
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 64:16: -> ^( 'loop' block )
					{
						dbg.location(64,19);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:64:19: ^( 'loop' block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(64,21);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_48.nextNode(), root_1);
						dbg.location(64,28);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:65:3: 'break' ';'
					{
					dbg.location(65,3);
					string_literal75=(Token)match(input,42,FOLLOW_42_in_instruct525);  
					stream_42.add(string_literal75);
					dbg.location(65,11);
					char_literal76=(Token)match(input,38,FOLLOW_38_in_instruct527);  
					stream_38.add(char_literal76);

					// AST REWRITE
					// elements: 42
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 65:15: -> 'break'
					{
						dbg.location(65,18);
						adaptor.addChild(root_0, stream_42.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:66:3: ifExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(66,3);
					pushFollow(FOLLOW_ifExpr_in_instruct535);
					ifExpr77=ifExpr();
					state._fsp--;

					adaptor.addChild(root_0, ifExpr77.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(67, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "instruct");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "instruct"


	public static class dotIDF_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dotIDF"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:69:1: dotIDF : IDF ( '.' ^ IDF )? ;
	public final GrammarParser.dotIDF_return dotIDF() throws RecognitionException {
		GrammarParser.dotIDF_return retval = new GrammarParser.dotIDF_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF78=null;
		Token char_literal79=null;
		Token IDF80=null;

		CommonTree IDF78_tree=null;
		CommonTree char_literal79_tree=null;
		CommonTree IDF80_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dotIDF");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:69:9: ( IDF ( '.' ^ IDF )? )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:70:1: IDF ( '.' ^ IDF )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(70,1);
			IDF78=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF546); 
			IDF78_tree = (CommonTree)adaptor.create(IDF78);
			adaptor.addChild(root_0, IDF78_tree);
			dbg.location(70,5);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:70:5: ( '.' ^ IDF )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==36) ) {
				alt16=1;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:70:6: '.' ^ IDF
					{
					dbg.location(70,9);
					char_literal79=(Token)match(input,36,FOLLOW_36_in_dotIDF549); 
					char_literal79_tree = (CommonTree)adaptor.create(char_literal79);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal79_tree, root_0);
					dbg.location(70,11);
					IDF80=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF552); 
					IDF80_tree = (CommonTree)adaptor.create(IDF80);
					adaptor.addChild(root_0, IDF80_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(16);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(70, 15);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dotIDF");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "dotIDF"


	public static class ifExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifExpr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:72:1: ifExpr : 'if' expr block ( 'else' block )? -> ^( 'if' expr block ) ( ^( 'else' block ) )? ;
	public final GrammarParser.ifExpr_return ifExpr() throws RecognitionException {
		GrammarParser.ifExpr_return retval = new GrammarParser.ifExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal81=null;
		Token string_literal84=null;
		ParserRuleReturnScope expr82 =null;
		ParserRuleReturnScope block83 =null;
		ParserRuleReturnScope block85 =null;

		CommonTree string_literal81_tree=null;
		CommonTree string_literal84_tree=null;
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try { dbg.enterRule(getGrammarFileName(), "ifExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(72, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:72:8: ( 'if' expr block ( 'else' block )? -> ^( 'if' expr block ) ( ^( 'else' block ) )? )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:72:10: 'if' expr block ( 'else' block )?
			{
			dbg.location(72,10);
			string_literal81=(Token)match(input,IF,FOLLOW_IF_in_ifExpr562);  
			stream_IF.add(string_literal81);
			dbg.location(72,15);
			pushFollow(FOLLOW_expr_in_ifExpr564);
			expr82=expr();
			state._fsp--;

			stream_expr.add(expr82.getTree());dbg.location(72,20);
			pushFollow(FOLLOW_block_in_ifExpr566);
			block83=block();
			state._fsp--;

			stream_block.add(block83.getTree());dbg.location(72,26);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:72:26: ( 'else' block )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==43) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:72:27: 'else' block
					{
					dbg.location(72,27);
					string_literal84=(Token)match(input,43,FOLLOW_43_in_ifExpr569);  
					stream_43.add(string_literal84);
					dbg.location(72,34);
					pushFollow(FOLLOW_block_in_ifExpr571);
					block85=block();
					state._fsp--;

					stream_block.add(block85.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(17);}

			// AST REWRITE
			// elements: IF, expr, block, 43, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 72:43: -> ^( 'if' expr block ) ( ^( 'else' block ) )?
			{
				dbg.location(72,46);
				// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:72:46: ^( 'if' expr block )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(72,48);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				dbg.location(72,53);
				adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(72,58);
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}
				dbg.location(72,65);
				// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:72:65: ( ^( 'else' block ) )?
				if ( stream_43.hasNext()||stream_block.hasNext() ) {
					dbg.location(72,65);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:72:65: ^( 'else' block )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					dbg.location(72,67);
					root_1 = (CommonTree)adaptor.becomeRoot(stream_43.nextNode(), root_1);
					dbg.location(72,74);
					adaptor.addChild(root_1, stream_block.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_43.reset();
				stream_block.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(72, 80);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ifExpr"


	public static class binExpr1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr1"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:74:1: binExpr1 : binExpr2 ( EQUAL ^ binExpr2 )* ;
	public final GrammarParser.binExpr1_return binExpr1() throws RecognitionException {
		GrammarParser.binExpr1_return retval = new GrammarParser.binExpr1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL87=null;
		ParserRuleReturnScope binExpr286 =null;
		ParserRuleReturnScope binExpr288 =null;

		CommonTree EQUAL87_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:74:10: ( binExpr2 ( EQUAL ^ binExpr2 )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:74:12: binExpr2 ( EQUAL ^ binExpr2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(74,12);
			pushFollow(FOLLOW_binExpr2_in_binExpr1599);
			binExpr286=binExpr2();
			state._fsp--;

			adaptor.addChild(root_0, binExpr286.getTree());
			dbg.location(74,21);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:74:21: ( EQUAL ^ binExpr2 )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==EQUAL) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:74:22: EQUAL ^ binExpr2
					{
					dbg.location(74,27);
					EQUAL87=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_binExpr1602); 
					EQUAL87_tree = (CommonTree)adaptor.create(EQUAL87);
					root_0 = (CommonTree)adaptor.becomeRoot(EQUAL87_tree, root_0);
					dbg.location(74,29);
					pushFollow(FOLLOW_binExpr2_in_binExpr1605);
					binExpr288=binExpr2();
					state._fsp--;

					adaptor.addChild(root_0, binExpr288.getTree());

					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(74, 38);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr1"


	public static class binExpr2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr2"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:76:1: binExpr2 : binExpr3 ( ORBOOL ^ binExpr3 )* ;
	public final GrammarParser.binExpr2_return binExpr2() throws RecognitionException {
		GrammarParser.binExpr2_return retval = new GrammarParser.binExpr2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ORBOOL90=null;
		ParserRuleReturnScope binExpr389 =null;
		ParserRuleReturnScope binExpr391 =null;

		CommonTree ORBOOL90_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:76:10: ( binExpr3 ( ORBOOL ^ binExpr3 )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:76:12: binExpr3 ( ORBOOL ^ binExpr3 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(76,12);
			pushFollow(FOLLOW_binExpr3_in_binExpr2616);
			binExpr389=binExpr3();
			state._fsp--;

			adaptor.addChild(root_0, binExpr389.getTree());
			dbg.location(76,20);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:76:20: ( ORBOOL ^ binExpr3 )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				int LA19_0 = input.LA(1);
				if ( (LA19_0==ORBOOL) ) {
					alt19=1;
				}

				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:76:21: ORBOOL ^ binExpr3
					{
					dbg.location(76,27);
					ORBOOL90=(Token)match(input,ORBOOL,FOLLOW_ORBOOL_in_binExpr2618); 
					ORBOOL90_tree = (CommonTree)adaptor.create(ORBOOL90);
					root_0 = (CommonTree)adaptor.becomeRoot(ORBOOL90_tree, root_0);
					dbg.location(76,29);
					pushFollow(FOLLOW_binExpr3_in_binExpr2621);
					binExpr391=binExpr3();
					state._fsp--;

					adaptor.addChild(root_0, binExpr391.getTree());

					}
					break;

				default :
					break loop19;
				}
			}
			} finally {dbg.exitSubRule(19);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(76, 38);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr2"


	public static class binExpr3_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr3"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:78:1: binExpr3 : binExpr4 ( ANDBOOL ^ binExpr4 )* ;
	public final GrammarParser.binExpr3_return binExpr3() throws RecognitionException {
		GrammarParser.binExpr3_return retval = new GrammarParser.binExpr3_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANDBOOL93=null;
		ParserRuleReturnScope binExpr492 =null;
		ParserRuleReturnScope binExpr494 =null;

		CommonTree ANDBOOL93_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr3");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(78, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:78:10: ( binExpr4 ( ANDBOOL ^ binExpr4 )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:78:12: binExpr4 ( ANDBOOL ^ binExpr4 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(78,12);
			pushFollow(FOLLOW_binExpr4_in_binExpr3632);
			binExpr492=binExpr4();
			state._fsp--;

			adaptor.addChild(root_0, binExpr492.getTree());
			dbg.location(78,20);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:78:20: ( ANDBOOL ^ binExpr4 )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==ANDBOOL) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:78:21: ANDBOOL ^ binExpr4
					{
					dbg.location(78,28);
					ANDBOOL93=(Token)match(input,ANDBOOL,FOLLOW_ANDBOOL_in_binExpr3634); 
					ANDBOOL93_tree = (CommonTree)adaptor.create(ANDBOOL93);
					root_0 = (CommonTree)adaptor.becomeRoot(ANDBOOL93_tree, root_0);
					dbg.location(78,30);
					pushFollow(FOLLOW_binExpr4_in_binExpr3637);
					binExpr494=binExpr4();
					state._fsp--;

					adaptor.addChild(root_0, binExpr494.getTree());

					}
					break;

				default :
					break loop20;
				}
			}
			} finally {dbg.exitSubRule(20);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(78, 39);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr3");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr3"


	public static class binExpr4_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr4"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:80:1: binExpr4 : binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )* ;
	public final GrammarParser.binExpr4_return binExpr4() throws RecognitionException {
		GrammarParser.binExpr4_return retval = new GrammarParser.binExpr4_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PREV96=null;
		Token OPBOOLEQ97=null;
		Token NEXT98=null;
		ParserRuleReturnScope binExpr595 =null;
		ParserRuleReturnScope binExpr599 =null;

		CommonTree PREV96_tree=null;
		CommonTree OPBOOLEQ97_tree=null;
		CommonTree NEXT98_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr4");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:80:10: ( binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:80:12: binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(80,12);
			pushFollow(FOLLOW_binExpr5_in_binExpr4648);
			binExpr595=binExpr5();
			state._fsp--;

			adaptor.addChild(root_0, binExpr595.getTree());
			dbg.location(80,20);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:80:20: ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=2;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= NEXT && LA22_0 <= OPBOOLEQ)||LA22_0==PREV) ) {
					alt22=1;
				}

				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:80:21: ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5
					{
					dbg.location(80,21);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:80:21: ( PREV ^| OPBOOLEQ ^| NEXT ^)
					int alt21=3;
					try { dbg.enterSubRule(21);
					try { dbg.enterDecision(21, decisionCanBacktrack[21]);

					switch ( input.LA(1) ) {
					case PREV:
						{
						alt21=1;
						}
						break;
					case OPBOOLEQ:
						{
						alt21=2;
						}
						break;
					case NEXT:
						{
						alt21=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(21);}

					switch (alt21) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:80:22: PREV ^
							{
							dbg.location(80,26);
							PREV96=(Token)match(input,PREV,FOLLOW_PREV_in_binExpr4651); 
							PREV96_tree = (CommonTree)adaptor.create(PREV96);
							root_0 = (CommonTree)adaptor.becomeRoot(PREV96_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:80:28: OPBOOLEQ ^
							{
							dbg.location(80,36);
							OPBOOLEQ97=(Token)match(input,OPBOOLEQ,FOLLOW_OPBOOLEQ_in_binExpr4654); 
							OPBOOLEQ97_tree = (CommonTree)adaptor.create(OPBOOLEQ97);
							root_0 = (CommonTree)adaptor.becomeRoot(OPBOOLEQ97_tree, root_0);

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:80:38: NEXT ^
							{
							dbg.location(80,42);
							NEXT98=(Token)match(input,NEXT,FOLLOW_NEXT_in_binExpr4657); 
							NEXT98_tree = (CommonTree)adaptor.create(NEXT98);
							root_0 = (CommonTree)adaptor.becomeRoot(NEXT98_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(21);}
					dbg.location(80,45);
					pushFollow(FOLLOW_binExpr5_in_binExpr4661);
					binExpr599=binExpr5();
					state._fsp--;

					adaptor.addChild(root_0, binExpr599.getTree());

					}
					break;

				default :
					break loop22;
				}
			}
			} finally {dbg.exitSubRule(22);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(80, 54);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr4");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr4"


	public static class binExpr5_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr5"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:82:1: binExpr5 : binExpr6 ( ( ADD ^| SUB ^) binExpr6 )* ;
	public final GrammarParser.binExpr5_return binExpr5() throws RecognitionException {
		GrammarParser.binExpr5_return retval = new GrammarParser.binExpr5_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ADD101=null;
		Token SUB102=null;
		ParserRuleReturnScope binExpr6100 =null;
		ParserRuleReturnScope binExpr6103 =null;

		CommonTree ADD101_tree=null;
		CommonTree SUB102_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr5");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:82:10: ( binExpr6 ( ( ADD ^| SUB ^) binExpr6 )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:82:12: binExpr6 ( ( ADD ^| SUB ^) binExpr6 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(82,12);
			pushFollow(FOLLOW_binExpr6_in_binExpr5672);
			binExpr6100=binExpr6();
			state._fsp--;

			adaptor.addChild(root_0, binExpr6100.getTree());
			dbg.location(82,20);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:82:20: ( ( ADD ^| SUB ^) binExpr6 )*
			try { dbg.enterSubRule(24);

			loop24:
			while (true) {
				int alt24=2;
				try { dbg.enterDecision(24, decisionCanBacktrack[24]);

				int LA24_0 = input.LA(1);
				if ( (LA24_0==ADD||LA24_0==SUB) ) {
					alt24=1;
				}

				} finally {dbg.exitDecision(24);}

				switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:82:21: ( ADD ^| SUB ^) binExpr6
					{
					dbg.location(82,21);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:82:21: ( ADD ^| SUB ^)
					int alt23=2;
					try { dbg.enterSubRule(23);
					try { dbg.enterDecision(23, decisionCanBacktrack[23]);

					int LA23_0 = input.LA(1);
					if ( (LA23_0==ADD) ) {
						alt23=1;
					}
					else if ( (LA23_0==SUB) ) {
						alt23=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(23);}

					switch (alt23) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:82:22: ADD ^
							{
							dbg.location(82,25);
							ADD101=(Token)match(input,ADD,FOLLOW_ADD_in_binExpr5675); 
							ADD101_tree = (CommonTree)adaptor.create(ADD101);
							root_0 = (CommonTree)adaptor.becomeRoot(ADD101_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:82:27: SUB ^
							{
							dbg.location(82,30);
							SUB102=(Token)match(input,SUB,FOLLOW_SUB_in_binExpr5678); 
							SUB102_tree = (CommonTree)adaptor.create(SUB102);
							root_0 = (CommonTree)adaptor.becomeRoot(SUB102_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(23);}
					dbg.location(82,34);
					pushFollow(FOLLOW_binExpr6_in_binExpr5683);
					binExpr6103=binExpr6();
					state._fsp--;

					adaptor.addChild(root_0, binExpr6103.getTree());

					}
					break;

				default :
					break loop24;
				}
			}
			} finally {dbg.exitSubRule(24);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(82, 43);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr5");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr5"


	public static class binExpr6_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr6"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:84:1: binExpr6 : unExpr ( ( STAR ^| DIV ^) unExpr )* ;
	public final GrammarParser.binExpr6_return binExpr6() throws RecognitionException {
		GrammarParser.binExpr6_return retval = new GrammarParser.binExpr6_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR105=null;
		Token DIV106=null;
		ParserRuleReturnScope unExpr104 =null;
		ParserRuleReturnScope unExpr107 =null;

		CommonTree STAR105_tree=null;
		CommonTree DIV106_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr6");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(84, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:84:10: ( unExpr ( ( STAR ^| DIV ^) unExpr )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:84:12: unExpr ( ( STAR ^| DIV ^) unExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(84,12);
			pushFollow(FOLLOW_unExpr_in_binExpr6694);
			unExpr104=unExpr();
			state._fsp--;

			adaptor.addChild(root_0, unExpr104.getTree());
			dbg.location(84,19);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:84:19: ( ( STAR ^| DIV ^) unExpr )*
			try { dbg.enterSubRule(26);

			loop26:
			while (true) {
				int alt26=2;
				try { dbg.enterDecision(26, decisionCanBacktrack[26]);

				int LA26_0 = input.LA(1);
				if ( (LA26_0==DIV||LA26_0==STAR) ) {
					alt26=1;
				}

				} finally {dbg.exitDecision(26);}

				switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:84:20: ( STAR ^| DIV ^) unExpr
					{
					dbg.location(84,20);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:84:20: ( STAR ^| DIV ^)
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==STAR) ) {
						alt25=1;
					}
					else if ( (LA25_0==DIV) ) {
						alt25=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:84:21: STAR ^
							{
							dbg.location(84,25);
							STAR105=(Token)match(input,STAR,FOLLOW_STAR_in_binExpr6698); 
							STAR105_tree = (CommonTree)adaptor.create(STAR105);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR105_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:84:27: DIV ^
							{
							dbg.location(84,30);
							DIV106=(Token)match(input,DIV,FOLLOW_DIV_in_binExpr6701); 
							DIV106_tree = (CommonTree)adaptor.create(DIV106);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV106_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(25);}
					dbg.location(84,33);
					pushFollow(FOLLOW_unExpr_in_binExpr6705);
					unExpr107=unExpr();
					state._fsp--;

					adaptor.addChild(root_0, unExpr107.getTree());

					}
					break;

				default :
					break loop26;
				}
			}
			} finally {dbg.exitSubRule(26);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(84, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr6");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr6"


	public static class vectExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vectExpr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:86:1: vectExpr : starExpr ( '[' ^ expr ']' !)? ;
	public final GrammarParser.vectExpr_return vectExpr() throws RecognitionException {
		GrammarParser.vectExpr_return retval = new GrammarParser.vectExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal109=null;
		Token char_literal111=null;
		ParserRuleReturnScope starExpr108 =null;
		ParserRuleReturnScope expr110 =null;

		CommonTree char_literal109_tree=null;
		CommonTree char_literal111_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "vectExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:86:10: ( starExpr ( '[' ^ expr ']' !)? )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:86:12: starExpr ( '[' ^ expr ']' !)?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(86,12);
			pushFollow(FOLLOW_starExpr_in_vectExpr716);
			starExpr108=starExpr();
			state._fsp--;

			adaptor.addChild(root_0, starExpr108.getTree());
			dbg.location(86,21);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:86:21: ( '[' ^ expr ']' !)?
			int alt27=2;
			try { dbg.enterSubRule(27);
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==39) ) {
				alt27=1;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:86:22: '[' ^ expr ']' !
					{
					dbg.location(86,25);
					char_literal109=(Token)match(input,39,FOLLOW_39_in_vectExpr719); 
					char_literal109_tree = (CommonTree)adaptor.create(char_literal109);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal109_tree, root_0);
					dbg.location(86,27);
					pushFollow(FOLLOW_expr_in_vectExpr722);
					expr110=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr110.getTree());
					dbg.location(86,35);
					char_literal111=(Token)match(input,40,FOLLOW_40_in_vectExpr724); 
					}
					break;

			}
			} finally {dbg.exitSubRule(27);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(86, 37);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vectExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vectExpr"


	public static class starExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "starExpr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:88:1: starExpr : ( STAR moinsExpr -> ^( UNISTAR moinsExpr ) | moinsExpr );
	public final GrammarParser.starExpr_return starExpr() throws RecognitionException {
		GrammarParser.starExpr_return retval = new GrammarParser.starExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR112=null;
		ParserRuleReturnScope moinsExpr113 =null;
		ParserRuleReturnScope moinsExpr114 =null;

		CommonTree STAR112_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleSubtreeStream stream_moinsExpr=new RewriteRuleSubtreeStream(adaptor,"rule moinsExpr");

		try { dbg.enterRule(getGrammarFileName(), "starExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(88, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:89:2: ( STAR moinsExpr -> ^( UNISTAR moinsExpr ) | moinsExpr )
			int alt28=2;
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==STAR) ) {
				alt28=1;
			}
			else if ( (LA28_0==BOOL||LA28_0==IDF||LA28_0==INT||LA28_0==SUB||LA28_0==32) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:89:5: STAR moinsExpr
					{
					dbg.location(89,5);
					STAR112=(Token)match(input,STAR,FOLLOW_STAR_in_starExpr738);  
					stream_STAR.add(STAR112);
					dbg.location(89,10);
					pushFollow(FOLLOW_moinsExpr_in_starExpr740);
					moinsExpr113=moinsExpr();
					state._fsp--;

					stream_moinsExpr.add(moinsExpr113.getTree());
					// AST REWRITE
					// elements: moinsExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 89:20: -> ^( UNISTAR moinsExpr )
					{
						dbg.location(89,23);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:89:23: ^( UNISTAR moinsExpr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(89,25);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNISTAR, "UNISTAR"), root_1);
						dbg.location(89,33);
						adaptor.addChild(root_1, stream_moinsExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:90:4: moinsExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(90,4);
					pushFollow(FOLLOW_moinsExpr_in_starExpr753);
					moinsExpr114=moinsExpr();
					state._fsp--;

					adaptor.addChild(root_0, moinsExpr114.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(90, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "starExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "starExpr"


	public static class moinsExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "moinsExpr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:92:1: moinsExpr : ( SUB atom -> ^( UNISUB atom ) | atom );
	public final GrammarParser.moinsExpr_return moinsExpr() throws RecognitionException {
		GrammarParser.moinsExpr_return retval = new GrammarParser.moinsExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUB115=null;
		ParserRuleReturnScope atom116 =null;
		ParserRuleReturnScope atom117 =null;

		CommonTree SUB115_tree=null;
		RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try { dbg.enterRule(getGrammarFileName(), "moinsExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:93:2: ( SUB atom -> ^( UNISUB atom ) | atom )
			int alt29=2;
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			int LA29_0 = input.LA(1);
			if ( (LA29_0==SUB) ) {
				alt29=1;
			}
			else if ( (LA29_0==BOOL||LA29_0==IDF||LA29_0==INT||LA29_0==32) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:93:5: SUB atom
					{
					dbg.location(93,5);
					SUB115=(Token)match(input,SUB,FOLLOW_SUB_in_moinsExpr765);  
					stream_SUB.add(SUB115);
					dbg.location(93,9);
					pushFollow(FOLLOW_atom_in_moinsExpr767);
					atom116=atom();
					state._fsp--;

					stream_atom.add(atom116.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 93:14: -> ^( UNISUB atom )
					{
						dbg.location(93,17);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:93:17: ^( UNISUB atom )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(93,19);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNISUB, "UNISUB"), root_1);
						dbg.location(93,26);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:94:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(94,4);
					pushFollow(FOLLOW_atom_in_moinsExpr780);
					atom117=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom117.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(94, 7);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "moinsExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "moinsExpr"


	public static class dotExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dotExpr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:97:1: dotExpr : vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? ;
	public final GrammarParser.dotExpr_return dotExpr() throws RecognitionException {
		GrammarParser.dotExpr_return retval = new GrammarParser.dotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal119=null;
		Token IDF120=null;
		Token string_literal121=null;
		Token char_literal122=null;
		Token char_literal123=null;
		ParserRuleReturnScope vectExpr118 =null;

		CommonTree char_literal119_tree=null;
		CommonTree IDF120_tree=null;
		CommonTree string_literal121_tree=null;
		CommonTree char_literal122_tree=null;
		CommonTree char_literal123_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dotExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:97:9: ( vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:97:11: vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(97,11);
			pushFollow(FOLLOW_vectExpr_in_dotExpr789);
			vectExpr118=vectExpr();
			state._fsp--;

			adaptor.addChild(root_0, vectExpr118.getTree());
			dbg.location(97,20);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:97:20: ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			int alt31=2;
			try { dbg.enterSubRule(31);
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			int LA31_0 = input.LA(1);
			if ( (LA31_0==36) ) {
				alt31=1;
			}
			} finally {dbg.exitDecision(31);}

			switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:97:21: '.' ^ ( IDF | 'len' '(' ! ')' !)
					{
					dbg.location(97,24);
					char_literal119=(Token)match(input,36,FOLLOW_36_in_dotExpr792); 
					char_literal119_tree = (CommonTree)adaptor.create(char_literal119);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal119_tree, root_0);
					dbg.location(97,26);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:97:26: ( IDF | 'len' '(' ! ')' !)
					int alt30=2;
					try { dbg.enterSubRule(30);
					try { dbg.enterDecision(30, decisionCanBacktrack[30]);

					int LA30_0 = input.LA(1);
					if ( (LA30_0==IDF) ) {
						alt30=1;
					}
					else if ( (LA30_0==46) ) {
						alt30=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(30);}

					switch (alt30) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:97:27: IDF
							{
							dbg.location(97,27);
							IDF120=(Token)match(input,IDF,FOLLOW_IDF_in_dotExpr796); 
							IDF120_tree = (CommonTree)adaptor.create(IDF120);
							adaptor.addChild(root_0, IDF120_tree);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:97:33: 'len' '(' ! ')' !
							{
							dbg.location(97,33);
							string_literal121=(Token)match(input,46,FOLLOW_46_in_dotExpr800); 
							string_literal121_tree = (CommonTree)adaptor.create(string_literal121);
							adaptor.addChild(root_0, string_literal121_tree);
							dbg.location(97,42);
							char_literal122=(Token)match(input,32,FOLLOW_32_in_dotExpr802); dbg.location(97,46);
							char_literal123=(Token)match(input,33,FOLLOW_33_in_dotExpr804); 
							}
							break;

					}
					} finally {dbg.exitSubRule(30);}

					}
					break;

			}
			} finally {dbg.exitSubRule(31);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(97, 50);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dotExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "dotExpr"


	public static class unExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unExpr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:99:1: unExpr : ( UNAIRE ^| EPERLU ^)? dotExpr ;
	public final GrammarParser.unExpr_return unExpr() throws RecognitionException {
		GrammarParser.unExpr_return retval = new GrammarParser.unExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE124=null;
		Token EPERLU125=null;
		ParserRuleReturnScope dotExpr126 =null;

		CommonTree UNAIRE124_tree=null;
		CommonTree EPERLU125_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "unExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(99, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:99:8: ( ( UNAIRE ^| EPERLU ^)? dotExpr )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:99:10: ( UNAIRE ^| EPERLU ^)? dotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(99,10);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:99:10: ( UNAIRE ^| EPERLU ^)?
			int alt32=3;
			try { dbg.enterSubRule(32);
			try { dbg.enterDecision(32, decisionCanBacktrack[32]);

			int LA32_0 = input.LA(1);
			if ( (LA32_0==UNAIRE) ) {
				alt32=1;
			}
			else if ( (LA32_0==EPERLU) ) {
				alt32=2;
			}
			} finally {dbg.exitDecision(32);}

			switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:99:11: UNAIRE ^
					{
					dbg.location(99,17);
					UNAIRE124=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_unExpr818); 
					UNAIRE124_tree = (CommonTree)adaptor.create(UNAIRE124);
					root_0 = (CommonTree)adaptor.becomeRoot(UNAIRE124_tree, root_0);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:99:19: EPERLU ^
					{
					dbg.location(99,25);
					EPERLU125=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_unExpr821); 
					EPERLU125_tree = (CommonTree)adaptor.create(EPERLU125);
					root_0 = (CommonTree)adaptor.becomeRoot(EPERLU125_tree, root_0);

					}
					break;

			}
			} finally {dbg.exitSubRule(32);}
			dbg.location(99,29);
			pushFollow(FOLLOW_dotExpr_in_unExpr826);
			dotExpr126=dotExpr();
			state._fsp--;

			adaptor.addChild(root_0, dotExpr126.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(99, 35);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "unExpr"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:101:1: atom : ( INT | BOOL | IDF ^ ( ( callFun ) )? | '(' expr ')' -> expr );
	public final GrammarParser.atom_return atom() throws RecognitionException {
		GrammarParser.atom_return retval = new GrammarParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT127=null;
		Token BOOL128=null;
		Token IDF129=null;
		Token char_literal131=null;
		Token char_literal133=null;
		ParserRuleReturnScope callFun130 =null;
		ParserRuleReturnScope expr132 =null;

		CommonTree INT127_tree=null;
		CommonTree BOOL128_tree=null;
		CommonTree IDF129_tree=null;
		CommonTree char_literal131_tree=null;
		CommonTree char_literal133_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(101, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:101:6: ( INT | BOOL | IDF ^ ( ( callFun ) )? | '(' expr ')' -> expr )
			int alt34=4;
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt34=1;
				}
				break;
			case BOOL:
				{
				alt34=2;
				}
				break;
			case IDF:
				{
				alt34=3;
				}
				break;
			case 32:
				{
				alt34=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(34);}

			switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:101:8: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(101,8);
					INT127=(Token)match(input,INT,FOLLOW_INT_in_atom834); 
					INT127_tree = (CommonTree)adaptor.create(INT127);
					adaptor.addChild(root_0, INT127_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:102:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(102,3);
					BOOL128=(Token)match(input,BOOL,FOLLOW_BOOL_in_atom837); 
					BOOL128_tree = (CommonTree)adaptor.create(BOOL128);
					adaptor.addChild(root_0, BOOL128_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:103:4: IDF ^ ( ( callFun ) )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(103,7);
					IDF129=(Token)match(input,IDF,FOLLOW_IDF_in_atom842); 
					IDF129_tree = (CommonTree)adaptor.create(IDF129);
					root_0 = (CommonTree)adaptor.becomeRoot(IDF129_tree, root_0);
					dbg.location(103,9);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:103:9: ( ( callFun ) )?
					int alt33=2;
					try { dbg.enterSubRule(33);
					try { dbg.enterDecision(33, decisionCanBacktrack[33]);

					int LA33_0 = input.LA(1);
					if ( (LA33_0==32) ) {
						alt33=1;
					}
					} finally {dbg.exitDecision(33);}

					switch (alt33) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:103:10: ( callFun )
							{
							dbg.location(103,10);
							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:103:10: ( callFun )
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:103:11: callFun
							{
							dbg.location(103,11);
							pushFollow(FOLLOW_callFun_in_atom847);
							callFun130=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun130.getTree());

							}

							}
							break;

					}
					} finally {dbg.exitSubRule(33);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:104:3: '(' expr ')'
					{
					dbg.location(104,3);
					char_literal131=(Token)match(input,32,FOLLOW_32_in_atom853);  
					stream_32.add(char_literal131);
					dbg.location(104,6);
					pushFollow(FOLLOW_expr_in_atom854);
					expr132=expr();
					state._fsp--;

					stream_expr.add(expr132.getTree());dbg.location(104,10);
					char_literal133=(Token)match(input,33,FOLLOW_33_in_atom855);  
					stream_33.add(char_literal133);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 104:13: -> expr
					{
						dbg.location(104,16);
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(104, 19);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "atom"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:106:1: expr : ( 'vec' '!' '[' expr ']' -> ^( 'vec' expr ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block -> ^( ANOBLOCK block ) | binExpr1 );
	public final GrammarParser.expr_return expr() throws RecognitionException {
		GrammarParser.expr_return retval = new GrammarParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal134=null;
		Token char_literal135=null;
		Token char_literal136=null;
		Token char_literal138=null;
		Token string_literal139=null;
		Token char_literal140=null;
		Token char_literal141=null;
		Token char_literal143=null;
		ParserRuleReturnScope expr137 =null;
		ParserRuleReturnScope expr142 =null;
		ParserRuleReturnScope block144 =null;
		ParserRuleReturnScope binExpr1145 =null;

		CommonTree string_literal134_tree=null;
		CommonTree char_literal135_tree=null;
		CommonTree char_literal136_tree=null;
		CommonTree char_literal138_tree=null;
		CommonTree string_literal139_tree=null;
		CommonTree char_literal140_tree=null;
		CommonTree char_literal141_tree=null;
		CommonTree char_literal143_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_UNAIRE=new RewriteRuleTokenStream(adaptor,"token UNAIRE");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:106:6: ( 'vec' '!' '[' expr ']' -> ^( 'vec' expr ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block -> ^( ANOBLOCK block ) | binExpr1 )
			int alt35=4;
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			switch ( input.LA(1) ) {
			case 53:
				{
				alt35=1;
				}
				break;
			case 50:
				{
				alt35=2;
				}
				break;
			case 55:
				{
				alt35=3;
				}
				break;
			case BOOL:
			case EPERLU:
			case IDF:
			case INT:
			case STAR:
			case SUB:
			case UNAIRE:
			case 32:
				{
				alt35=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(35);}

			switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:106:8: 'vec' '!' '[' expr ']'
					{
					dbg.location(106,8);
					string_literal134=(Token)match(input,53,FOLLOW_53_in_expr867);  
					stream_53.add(string_literal134);
					dbg.location(106,14);
					char_literal135=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr869);  
					stream_UNAIRE.add(char_literal135);
					dbg.location(106,18);
					char_literal136=(Token)match(input,39,FOLLOW_39_in_expr871);  
					stream_39.add(char_literal136);
					dbg.location(106,22);
					pushFollow(FOLLOW_expr_in_expr873);
					expr137=expr();
					state._fsp--;

					stream_expr.add(expr137.getTree());dbg.location(106,27);
					char_literal138=(Token)match(input,40,FOLLOW_40_in_expr875);  
					stream_40.add(char_literal138);

					// AST REWRITE
					// elements: 53, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 106:31: -> ^( 'vec' expr )
					{
						dbg.location(106,34);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:106:34: ^( 'vec' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(106,36);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_53.nextNode(), root_1);
						dbg.location(106,42);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:107:3: 'print' '!' '(' expr ')'
					{
					dbg.location(107,3);
					string_literal139=(Token)match(input,50,FOLLOW_50_in_expr887);  
					stream_50.add(string_literal139);
					dbg.location(107,11);
					char_literal140=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr889);  
					stream_UNAIRE.add(char_literal140);
					dbg.location(107,15);
					char_literal141=(Token)match(input,32,FOLLOW_32_in_expr891);  
					stream_32.add(char_literal141);
					dbg.location(107,19);
					pushFollow(FOLLOW_expr_in_expr893);
					expr142=expr();
					state._fsp--;

					stream_expr.add(expr142.getTree());dbg.location(107,24);
					char_literal143=(Token)match(input,33,FOLLOW_33_in_expr895);  
					stream_33.add(char_literal143);

					// AST REWRITE
					// elements: expr, 50
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 107:28: -> ^( 'print' expr )
					{
						dbg.location(107,31);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:107:31: ^( 'print' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(107,33);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_50.nextNode(), root_1);
						dbg.location(107,41);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:108:3: block
					{
					dbg.location(108,3);
					pushFollow(FOLLOW_block_in_expr906);
					block144=block();
					state._fsp--;

					stream_block.add(block144.getTree());
					// AST REWRITE
					// elements: block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 108:9: -> ^( ANOBLOCK block )
					{
						dbg.location(108,12);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:108:12: ^( ANOBLOCK block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(108,14);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANOBLOCK, "ANOBLOCK"), root_1);
						dbg.location(108,23);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:109:3: binExpr1
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(109,3);
					pushFollow(FOLLOW_binExpr1_in_expr918);
					binExpr1145=binExpr1();
					state._fsp--;

					adaptor.addChild(root_0, binExpr1145.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(109, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expr"


	public static class bigbinExpr1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr1"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:112:1: bigbinExpr1 : bigbinExpr2 ( EQUAL ^ bigbinExpr2 )* ;
	public final GrammarParser.bigbinExpr1_return bigbinExpr1() throws RecognitionException {
		GrammarParser.bigbinExpr1_return retval = new GrammarParser.bigbinExpr1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL147=null;
		ParserRuleReturnScope bigbinExpr2146 =null;
		ParserRuleReturnScope bigbinExpr2148 =null;

		CommonTree EQUAL147_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(112, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:112:13: ( bigbinExpr2 ( EQUAL ^ bigbinExpr2 )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:112:15: bigbinExpr2 ( EQUAL ^ bigbinExpr2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(112,15);
			pushFollow(FOLLOW_bigbinExpr2_in_bigbinExpr1927);
			bigbinExpr2146=bigbinExpr2();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr2146.getTree());
			dbg.location(112,27);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:112:27: ( EQUAL ^ bigbinExpr2 )*
			try { dbg.enterSubRule(36);

			loop36:
			while (true) {
				int alt36=2;
				try { dbg.enterDecision(36, decisionCanBacktrack[36]);

				int LA36_0 = input.LA(1);
				if ( (LA36_0==EQUAL) ) {
					alt36=1;
				}

				} finally {dbg.exitDecision(36);}

				switch (alt36) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:112:28: EQUAL ^ bigbinExpr2
					{
					dbg.location(112,33);
					EQUAL147=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_bigbinExpr1930); 
					EQUAL147_tree = (CommonTree)adaptor.create(EQUAL147);
					root_0 = (CommonTree)adaptor.becomeRoot(EQUAL147_tree, root_0);
					dbg.location(112,35);
					pushFollow(FOLLOW_bigbinExpr2_in_bigbinExpr1933);
					bigbinExpr2148=bigbinExpr2();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr2148.getTree());

					}
					break;

				default :
					break loop36;
				}
			}
			} finally {dbg.exitSubRule(36);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(112, 47);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr1"


	public static class bigbinExpr2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr2"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:114:1: bigbinExpr2 : bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )* ;
	public final GrammarParser.bigbinExpr2_return bigbinExpr2() throws RecognitionException {
		GrammarParser.bigbinExpr2_return retval = new GrammarParser.bigbinExpr2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ORBOOL150=null;
		ParserRuleReturnScope bigbinExpr3149 =null;
		ParserRuleReturnScope bigbinExpr3151 =null;

		CommonTree ORBOOL150_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(114, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:114:13: ( bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:114:15: bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(114,15);
			pushFollow(FOLLOW_bigbinExpr3_in_bigbinExpr2944);
			bigbinExpr3149=bigbinExpr3();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr3149.getTree());
			dbg.location(114,26);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:114:26: ( ORBOOL ^ bigbinExpr3 )*
			try { dbg.enterSubRule(37);

			loop37:
			while (true) {
				int alt37=2;
				try { dbg.enterDecision(37, decisionCanBacktrack[37]);

				int LA37_0 = input.LA(1);
				if ( (LA37_0==ORBOOL) ) {
					alt37=1;
				}

				} finally {dbg.exitDecision(37);}

				switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:114:27: ORBOOL ^ bigbinExpr3
					{
					dbg.location(114,33);
					ORBOOL150=(Token)match(input,ORBOOL,FOLLOW_ORBOOL_in_bigbinExpr2946); 
					ORBOOL150_tree = (CommonTree)adaptor.create(ORBOOL150);
					root_0 = (CommonTree)adaptor.becomeRoot(ORBOOL150_tree, root_0);
					dbg.location(114,35);
					pushFollow(FOLLOW_bigbinExpr3_in_bigbinExpr2949);
					bigbinExpr3151=bigbinExpr3();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr3151.getTree());

					}
					break;

				default :
					break loop37;
				}
			}
			} finally {dbg.exitSubRule(37);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(114, 47);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr2"


	public static class bigbinExpr3_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr3"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:116:1: bigbinExpr3 : bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )* ;
	public final GrammarParser.bigbinExpr3_return bigbinExpr3() throws RecognitionException {
		GrammarParser.bigbinExpr3_return retval = new GrammarParser.bigbinExpr3_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANDBOOL153=null;
		ParserRuleReturnScope bigbinExpr4152 =null;
		ParserRuleReturnScope bigbinExpr4154 =null;

		CommonTree ANDBOOL153_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr3");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(116, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:116:13: ( bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:116:15: bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(116,15);
			pushFollow(FOLLOW_bigbinExpr4_in_bigbinExpr3960);
			bigbinExpr4152=bigbinExpr4();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr4152.getTree());
			dbg.location(116,26);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:116:26: ( ANDBOOL ^ bigbinExpr4 )*
			try { dbg.enterSubRule(38);

			loop38:
			while (true) {
				int alt38=2;
				try { dbg.enterDecision(38, decisionCanBacktrack[38]);

				int LA38_0 = input.LA(1);
				if ( (LA38_0==ANDBOOL) ) {
					alt38=1;
				}

				} finally {dbg.exitDecision(38);}

				switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:116:27: ANDBOOL ^ bigbinExpr4
					{
					dbg.location(116,34);
					ANDBOOL153=(Token)match(input,ANDBOOL,FOLLOW_ANDBOOL_in_bigbinExpr3962); 
					ANDBOOL153_tree = (CommonTree)adaptor.create(ANDBOOL153);
					root_0 = (CommonTree)adaptor.becomeRoot(ANDBOOL153_tree, root_0);
					dbg.location(116,36);
					pushFollow(FOLLOW_bigbinExpr4_in_bigbinExpr3965);
					bigbinExpr4154=bigbinExpr4();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr4154.getTree());

					}
					break;

				default :
					break loop38;
				}
			}
			} finally {dbg.exitSubRule(38);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(116, 48);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr3");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr3"


	public static class bigbinExpr4_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr4"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:118:1: bigbinExpr4 : bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )* ;
	public final GrammarParser.bigbinExpr4_return bigbinExpr4() throws RecognitionException {
		GrammarParser.bigbinExpr4_return retval = new GrammarParser.bigbinExpr4_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PREV156=null;
		Token OPBOOLEQ157=null;
		Token NEXT158=null;
		ParserRuleReturnScope bigbinExpr5155 =null;
		ParserRuleReturnScope bigbinExpr5159 =null;

		CommonTree PREV156_tree=null;
		CommonTree OPBOOLEQ157_tree=null;
		CommonTree NEXT158_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr4");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(118, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:118:13: ( bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:118:15: bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(118,15);
			pushFollow(FOLLOW_bigbinExpr5_in_bigbinExpr4976);
			bigbinExpr5155=bigbinExpr5();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr5155.getTree());
			dbg.location(118,26);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:118:26: ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )*
			try { dbg.enterSubRule(40);

			loop40:
			while (true) {
				int alt40=2;
				try { dbg.enterDecision(40, decisionCanBacktrack[40]);

				int LA40_0 = input.LA(1);
				if ( ((LA40_0 >= NEXT && LA40_0 <= OPBOOLEQ)||LA40_0==PREV) ) {
					alt40=1;
				}

				} finally {dbg.exitDecision(40);}

				switch (alt40) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:118:27: ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5
					{
					dbg.location(118,27);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:118:27: ( PREV ^| OPBOOLEQ ^| NEXT ^)
					int alt39=3;
					try { dbg.enterSubRule(39);
					try { dbg.enterDecision(39, decisionCanBacktrack[39]);

					switch ( input.LA(1) ) {
					case PREV:
						{
						alt39=1;
						}
						break;
					case OPBOOLEQ:
						{
						alt39=2;
						}
						break;
					case NEXT:
						{
						alt39=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 39, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(39);}

					switch (alt39) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:118:28: PREV ^
							{
							dbg.location(118,32);
							PREV156=(Token)match(input,PREV,FOLLOW_PREV_in_bigbinExpr4979); 
							PREV156_tree = (CommonTree)adaptor.create(PREV156);
							root_0 = (CommonTree)adaptor.becomeRoot(PREV156_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:118:34: OPBOOLEQ ^
							{
							dbg.location(118,42);
							OPBOOLEQ157=(Token)match(input,OPBOOLEQ,FOLLOW_OPBOOLEQ_in_bigbinExpr4982); 
							OPBOOLEQ157_tree = (CommonTree)adaptor.create(OPBOOLEQ157);
							root_0 = (CommonTree)adaptor.becomeRoot(OPBOOLEQ157_tree, root_0);

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:118:44: NEXT ^
							{
							dbg.location(118,48);
							NEXT158=(Token)match(input,NEXT,FOLLOW_NEXT_in_bigbinExpr4985); 
							NEXT158_tree = (CommonTree)adaptor.create(NEXT158);
							root_0 = (CommonTree)adaptor.becomeRoot(NEXT158_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(39);}
					dbg.location(118,51);
					pushFollow(FOLLOW_bigbinExpr5_in_bigbinExpr4989);
					bigbinExpr5159=bigbinExpr5();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr5159.getTree());

					}
					break;

				default :
					break loop40;
				}
			}
			} finally {dbg.exitSubRule(40);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(118, 63);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr4");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr4"


	public static class bigbinExpr5_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr5"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:120:1: bigbinExpr5 : bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )* ;
	public final GrammarParser.bigbinExpr5_return bigbinExpr5() throws RecognitionException {
		GrammarParser.bigbinExpr5_return retval = new GrammarParser.bigbinExpr5_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set161=null;
		ParserRuleReturnScope bigbinExpr6160 =null;
		ParserRuleReturnScope bigbinExpr6162 =null;

		CommonTree set161_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr5");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(120, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:120:13: ( bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:120:15: bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(120,15);
			pushFollow(FOLLOW_bigbinExpr6_in_bigbinExpr51000);
			bigbinExpr6160=bigbinExpr6();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr6160.getTree());
			dbg.location(120,26);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:120:26: ( ( ADD | SUB ) ^ bigbinExpr6 )*
			try { dbg.enterSubRule(41);

			loop41:
			while (true) {
				int alt41=2;
				try { dbg.enterDecision(41, decisionCanBacktrack[41]);

				int LA41_0 = input.LA(1);
				if ( (LA41_0==ADD||LA41_0==SUB) ) {
					alt41=1;
				}

				} finally {dbg.exitDecision(41);}

				switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:120:27: ( ADD | SUB ) ^ bigbinExpr6
					{
					dbg.location(120,36);
					set161=input.LT(1);
					set161=input.LT(1);
					if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set161), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(120,38);
					pushFollow(FOLLOW_bigbinExpr6_in_bigbinExpr51009);
					bigbinExpr6162=bigbinExpr6();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr6162.getTree());

					}
					break;

				default :
					break loop41;
				}
			}
			} finally {dbg.exitSubRule(41);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(120, 50);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr5");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr5"


	public static class bigbinExpr6_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr6"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:122:1: bigbinExpr6 : bigunExpr ( ( STAR ^| DIV ^) bigunExpr )* ;
	public final GrammarParser.bigbinExpr6_return bigbinExpr6() throws RecognitionException {
		GrammarParser.bigbinExpr6_return retval = new GrammarParser.bigbinExpr6_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR164=null;
		Token DIV165=null;
		ParserRuleReturnScope bigunExpr163 =null;
		ParserRuleReturnScope bigunExpr166 =null;

		CommonTree STAR164_tree=null;
		CommonTree DIV165_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr6");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(122, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:122:13: ( bigunExpr ( ( STAR ^| DIV ^) bigunExpr )* )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:122:15: bigunExpr ( ( STAR ^| DIV ^) bigunExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(122,15);
			pushFollow(FOLLOW_bigunExpr_in_bigbinExpr61020);
			bigunExpr163=bigunExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigunExpr163.getTree());
			dbg.location(122,25);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:122:25: ( ( STAR ^| DIV ^) bigunExpr )*
			try { dbg.enterSubRule(43);

			loop43:
			while (true) {
				int alt43=2;
				try { dbg.enterDecision(43, decisionCanBacktrack[43]);

				int LA43_0 = input.LA(1);
				if ( (LA43_0==DIV||LA43_0==STAR) ) {
					alt43=1;
				}

				} finally {dbg.exitDecision(43);}

				switch (alt43) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:122:26: ( STAR ^| DIV ^) bigunExpr
					{
					dbg.location(122,26);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:122:26: ( STAR ^| DIV ^)
					int alt42=2;
					try { dbg.enterSubRule(42);
					try { dbg.enterDecision(42, decisionCanBacktrack[42]);

					int LA42_0 = input.LA(1);
					if ( (LA42_0==STAR) ) {
						alt42=1;
					}
					else if ( (LA42_0==DIV) ) {
						alt42=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 42, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(42);}

					switch (alt42) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:122:27: STAR ^
							{
							dbg.location(122,31);
							STAR164=(Token)match(input,STAR,FOLLOW_STAR_in_bigbinExpr61024); 
							STAR164_tree = (CommonTree)adaptor.create(STAR164);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR164_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:122:33: DIV ^
							{
							dbg.location(122,36);
							DIV165=(Token)match(input,DIV,FOLLOW_DIV_in_bigbinExpr61027); 
							DIV165_tree = (CommonTree)adaptor.create(DIV165);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV165_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(42);}
					dbg.location(122,39);
					pushFollow(FOLLOW_bigunExpr_in_bigbinExpr61031);
					bigunExpr166=bigunExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigunExpr166.getTree());

					}
					break;

				default :
					break loop43;
				}
			}
			} finally {dbg.exitSubRule(43);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(122, 49);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr6");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr6"


	public static class bigvectExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigvectExpr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:124:1: bigvectExpr : bigstarExpr ( '[' ^ bigExpr ']' !)? ;
	public final GrammarParser.bigvectExpr_return bigvectExpr() throws RecognitionException {
		GrammarParser.bigvectExpr_return retval = new GrammarParser.bigvectExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal168=null;
		Token char_literal170=null;
		ParserRuleReturnScope bigstarExpr167 =null;
		ParserRuleReturnScope bigExpr169 =null;

		CommonTree char_literal168_tree=null;
		CommonTree char_literal170_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigvectExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(124, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:124:13: ( bigstarExpr ( '[' ^ bigExpr ']' !)? )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:124:15: bigstarExpr ( '[' ^ bigExpr ']' !)?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(124,15);
			pushFollow(FOLLOW_bigstarExpr_in_bigvectExpr1041);
			bigstarExpr167=bigstarExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigstarExpr167.getTree());
			dbg.location(124,27);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:124:27: ( '[' ^ bigExpr ']' !)?
			int alt44=2;
			try { dbg.enterSubRule(44);
			try { dbg.enterDecision(44, decisionCanBacktrack[44]);

			int LA44_0 = input.LA(1);
			if ( (LA44_0==39) ) {
				alt44=1;
			}
			} finally {dbg.exitDecision(44);}

			switch (alt44) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:124:28: '[' ^ bigExpr ']' !
					{
					dbg.location(124,31);
					char_literal168=(Token)match(input,39,FOLLOW_39_in_bigvectExpr1044); 
					char_literal168_tree = (CommonTree)adaptor.create(char_literal168);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal168_tree, root_0);
					dbg.location(124,33);
					pushFollow(FOLLOW_bigExpr_in_bigvectExpr1047);
					bigExpr169=bigExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigExpr169.getTree());
					dbg.location(124,44);
					char_literal170=(Token)match(input,40,FOLLOW_40_in_bigvectExpr1049); 
					}
					break;

			}
			} finally {dbg.exitSubRule(44);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(124, 46);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigvectExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigvectExpr"


	public static class bigstarExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigstarExpr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:126:1: bigstarExpr : ( STAR bigmoinsExpr -> ^( UNISTAR bigmoinsExpr ) | bigmoinsExpr );
	public final GrammarParser.bigstarExpr_return bigstarExpr() throws RecognitionException {
		GrammarParser.bigstarExpr_return retval = new GrammarParser.bigstarExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR171=null;
		ParserRuleReturnScope bigmoinsExpr172 =null;
		ParserRuleReturnScope bigmoinsExpr173 =null;

		CommonTree STAR171_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleSubtreeStream stream_bigmoinsExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigmoinsExpr");

		try { dbg.enterRule(getGrammarFileName(), "bigstarExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(126, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:127:2: ( STAR bigmoinsExpr -> ^( UNISTAR bigmoinsExpr ) | bigmoinsExpr )
			int alt45=2;
			try { dbg.enterDecision(45, decisionCanBacktrack[45]);

			int LA45_0 = input.LA(1);
			if ( (LA45_0==STAR) ) {
				alt45=1;
			}
			else if ( (LA45_0==BOOL||LA45_0==IDF||LA45_0==INT||LA45_0==SUB||LA45_0==32) ) {
				alt45=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(45);}

			switch (alt45) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:127:5: STAR bigmoinsExpr
					{
					dbg.location(127,5);
					STAR171=(Token)match(input,STAR,FOLLOW_STAR_in_bigstarExpr1063);  
					stream_STAR.add(STAR171);
					dbg.location(127,10);
					pushFollow(FOLLOW_bigmoinsExpr_in_bigstarExpr1065);
					bigmoinsExpr172=bigmoinsExpr();
					state._fsp--;

					stream_bigmoinsExpr.add(bigmoinsExpr172.getTree());
					// AST REWRITE
					// elements: bigmoinsExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 127:23: -> ^( UNISTAR bigmoinsExpr )
					{
						dbg.location(127,26);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:127:26: ^( UNISTAR bigmoinsExpr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(127,28);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNISTAR, "UNISTAR"), root_1);
						dbg.location(127,36);
						adaptor.addChild(root_1, stream_bigmoinsExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:128:4: bigmoinsExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(128,4);
					pushFollow(FOLLOW_bigmoinsExpr_in_bigstarExpr1078);
					bigmoinsExpr173=bigmoinsExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigmoinsExpr173.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(128, 15);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigstarExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigstarExpr"


	public static class bigmoinsExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigmoinsExpr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:130:1: bigmoinsExpr : ( SUB bigatom -> ^( UNISUB bigatom ) | bigatom );
	public final GrammarParser.bigmoinsExpr_return bigmoinsExpr() throws RecognitionException {
		GrammarParser.bigmoinsExpr_return retval = new GrammarParser.bigmoinsExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUB174=null;
		ParserRuleReturnScope bigatom175 =null;
		ParserRuleReturnScope bigatom176 =null;

		CommonTree SUB174_tree=null;
		RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
		RewriteRuleSubtreeStream stream_bigatom=new RewriteRuleSubtreeStream(adaptor,"rule bigatom");

		try { dbg.enterRule(getGrammarFileName(), "bigmoinsExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(130, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:131:2: ( SUB bigatom -> ^( UNISUB bigatom ) | bigatom )
			int alt46=2;
			try { dbg.enterDecision(46, decisionCanBacktrack[46]);

			int LA46_0 = input.LA(1);
			if ( (LA46_0==SUB) ) {
				alt46=1;
			}
			else if ( (LA46_0==BOOL||LA46_0==IDF||LA46_0==INT||LA46_0==32) ) {
				alt46=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(46);}

			switch (alt46) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:131:5: SUB bigatom
					{
					dbg.location(131,5);
					SUB174=(Token)match(input,SUB,FOLLOW_SUB_in_bigmoinsExpr1090);  
					stream_SUB.add(SUB174);
					dbg.location(131,9);
					pushFollow(FOLLOW_bigatom_in_bigmoinsExpr1092);
					bigatom175=bigatom();
					state._fsp--;

					stream_bigatom.add(bigatom175.getTree());
					// AST REWRITE
					// elements: bigatom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 131:17: -> ^( UNISUB bigatom )
					{
						dbg.location(131,20);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:131:20: ^( UNISUB bigatom )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(131,22);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNISUB, "UNISUB"), root_1);
						dbg.location(131,29);
						adaptor.addChild(root_1, stream_bigatom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:132:4: bigatom
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(132,4);
					pushFollow(FOLLOW_bigatom_in_bigmoinsExpr1105);
					bigatom176=bigatom();
					state._fsp--;

					adaptor.addChild(root_0, bigatom176.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(132, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigmoinsExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigmoinsExpr"


	public static class bigdotExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigdotExpr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:135:1: bigdotExpr : bigvectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? ;
	public final GrammarParser.bigdotExpr_return bigdotExpr() throws RecognitionException {
		GrammarParser.bigdotExpr_return retval = new GrammarParser.bigdotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal178=null;
		Token IDF179=null;
		Token string_literal180=null;
		Token char_literal181=null;
		Token char_literal182=null;
		ParserRuleReturnScope bigvectExpr177 =null;

		CommonTree char_literal178_tree=null;
		CommonTree IDF179_tree=null;
		CommonTree string_literal180_tree=null;
		CommonTree char_literal181_tree=null;
		CommonTree char_literal182_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigdotExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(135, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:135:12: ( bigvectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:135:14: bigvectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(135,14);
			pushFollow(FOLLOW_bigvectExpr_in_bigdotExpr1114);
			bigvectExpr177=bigvectExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigvectExpr177.getTree());
			dbg.location(135,26);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:135:26: ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			int alt48=2;
			try { dbg.enterSubRule(48);
			try { dbg.enterDecision(48, decisionCanBacktrack[48]);

			int LA48_0 = input.LA(1);
			if ( (LA48_0==36) ) {
				alt48=1;
			}
			} finally {dbg.exitDecision(48);}

			switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:135:27: '.' ^ ( IDF | 'len' '(' ! ')' !)
					{
					dbg.location(135,30);
					char_literal178=(Token)match(input,36,FOLLOW_36_in_bigdotExpr1117); 
					char_literal178_tree = (CommonTree)adaptor.create(char_literal178);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal178_tree, root_0);
					dbg.location(135,32);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:135:32: ( IDF | 'len' '(' ! ')' !)
					int alt47=2;
					try { dbg.enterSubRule(47);
					try { dbg.enterDecision(47, decisionCanBacktrack[47]);

					int LA47_0 = input.LA(1);
					if ( (LA47_0==IDF) ) {
						alt47=1;
					}
					else if ( (LA47_0==46) ) {
						alt47=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(47);}

					switch (alt47) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:135:33: IDF
							{
							dbg.location(135,33);
							IDF179=(Token)match(input,IDF,FOLLOW_IDF_in_bigdotExpr1121); 
							IDF179_tree = (CommonTree)adaptor.create(IDF179);
							adaptor.addChild(root_0, IDF179_tree);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:135:39: 'len' '(' ! ')' !
							{
							dbg.location(135,39);
							string_literal180=(Token)match(input,46,FOLLOW_46_in_bigdotExpr1125); 
							string_literal180_tree = (CommonTree)adaptor.create(string_literal180);
							adaptor.addChild(root_0, string_literal180_tree);
							dbg.location(135,48);
							char_literal181=(Token)match(input,32,FOLLOW_32_in_bigdotExpr1127); dbg.location(135,52);
							char_literal182=(Token)match(input,33,FOLLOW_33_in_bigdotExpr1129); 
							}
							break;

					}
					} finally {dbg.exitSubRule(47);}

					}
					break;

			}
			} finally {dbg.exitSubRule(48);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(135, 56);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigdotExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigdotExpr"


	public static class bigunExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigunExpr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:137:1: bigunExpr : ( UNAIRE ^| EPERLU ^)? bigdotExpr ;
	public final GrammarParser.bigunExpr_return bigunExpr() throws RecognitionException {
		GrammarParser.bigunExpr_return retval = new GrammarParser.bigunExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE183=null;
		Token EPERLU184=null;
		ParserRuleReturnScope bigdotExpr185 =null;

		CommonTree UNAIRE183_tree=null;
		CommonTree EPERLU184_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigunExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(137, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:137:11: ( ( UNAIRE ^| EPERLU ^)? bigdotExpr )
			dbg.enterAlt(1);

			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:137:13: ( UNAIRE ^| EPERLU ^)? bigdotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(137,13);
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:137:13: ( UNAIRE ^| EPERLU ^)?
			int alt49=3;
			try { dbg.enterSubRule(49);
			try { dbg.enterDecision(49, decisionCanBacktrack[49]);

			int LA49_0 = input.LA(1);
			if ( (LA49_0==UNAIRE) ) {
				alt49=1;
			}
			else if ( (LA49_0==EPERLU) ) {
				alt49=2;
			}
			} finally {dbg.exitDecision(49);}

			switch (alt49) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:137:14: UNAIRE ^
					{
					dbg.location(137,20);
					UNAIRE183=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigunExpr1143); 
					UNAIRE183_tree = (CommonTree)adaptor.create(UNAIRE183);
					root_0 = (CommonTree)adaptor.becomeRoot(UNAIRE183_tree, root_0);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:137:22: EPERLU ^
					{
					dbg.location(137,28);
					EPERLU184=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_bigunExpr1146); 
					EPERLU184_tree = (CommonTree)adaptor.create(EPERLU184);
					root_0 = (CommonTree)adaptor.becomeRoot(EPERLU184_tree, root_0);

					}
					break;

			}
			} finally {dbg.exitSubRule(49);}
			dbg.location(137,32);
			pushFollow(FOLLOW_bigdotExpr_in_bigunExpr1151);
			bigdotExpr185=bigdotExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigdotExpr185.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(137, 41);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigunExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigunExpr"


	public static class bigExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigExpr"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:139:1: bigExpr : ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | bigbinExpr1 );
	public final GrammarParser.bigExpr_return bigExpr() throws RecognitionException {
		GrammarParser.bigExpr_return retval = new GrammarParser.bigExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal186=null;
		Token char_literal187=null;
		Token char_literal188=null;
		Token char_literal190=null;
		Token char_literal192=null;
		Token string_literal193=null;
		Token char_literal194=null;
		Token char_literal195=null;
		Token char_literal197=null;
		ParserRuleReturnScope expr189 =null;
		ParserRuleReturnScope expr191 =null;
		ParserRuleReturnScope expr196 =null;
		ParserRuleReturnScope block198 =null;
		ParserRuleReturnScope bigbinExpr1199 =null;

		CommonTree string_literal186_tree=null;
		CommonTree char_literal187_tree=null;
		CommonTree char_literal188_tree=null;
		CommonTree char_literal190_tree=null;
		CommonTree char_literal192_tree=null;
		CommonTree string_literal193_tree=null;
		CommonTree char_literal194_tree=null;
		CommonTree char_literal195_tree=null;
		CommonTree char_literal197_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_UNAIRE=new RewriteRuleTokenStream(adaptor,"token UNAIRE");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "bigExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(139, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:140:3: ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | bigbinExpr1 )
			int alt51=4;
			try { dbg.enterDecision(51, decisionCanBacktrack[51]);

			switch ( input.LA(1) ) {
			case 53:
				{
				alt51=1;
				}
				break;
			case 50:
				{
				alt51=2;
				}
				break;
			case 55:
				{
				alt51=3;
				}
				break;
			case BOOL:
			case EPERLU:
			case IDF:
			case INT:
			case STAR:
			case SUB:
			case UNAIRE:
			case 32:
				{
				alt51=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(51);}

			switch (alt51) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:140:3: 'vec' '!' '[' expr ( ',' expr )* ']'
					{
					dbg.location(140,3);
					string_literal186=(Token)match(input,53,FOLLOW_53_in_bigExpr1161);  
					stream_53.add(string_literal186);
					dbg.location(140,9);
					char_literal187=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1163);  
					stream_UNAIRE.add(char_literal187);
					dbg.location(140,13);
					char_literal188=(Token)match(input,39,FOLLOW_39_in_bigExpr1165);  
					stream_39.add(char_literal188);
					dbg.location(140,17);
					pushFollow(FOLLOW_expr_in_bigExpr1167);
					expr189=expr();
					state._fsp--;

					stream_expr.add(expr189.getTree());dbg.location(140,22);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:140:22: ( ',' expr )*
					try { dbg.enterSubRule(50);

					loop50:
					while (true) {
						int alt50=2;
						try { dbg.enterDecision(50, decisionCanBacktrack[50]);

						int LA50_0 = input.LA(1);
						if ( (LA50_0==34) ) {
							alt50=1;
						}

						} finally {dbg.exitDecision(50);}

						switch (alt50) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:140:23: ',' expr
							{
							dbg.location(140,23);
							char_literal190=(Token)match(input,34,FOLLOW_34_in_bigExpr1170);  
							stream_34.add(char_literal190);
							dbg.location(140,27);
							pushFollow(FOLLOW_expr_in_bigExpr1172);
							expr191=expr();
							state._fsp--;

							stream_expr.add(expr191.getTree());
							}
							break;

						default :
							break loop50;
						}
					}
					} finally {dbg.exitSubRule(50);}
					dbg.location(140,33);
					char_literal192=(Token)match(input,40,FOLLOW_40_in_bigExpr1175);  
					stream_40.add(char_literal192);

					// AST REWRITE
					// elements: 53, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 140:37: -> ^( 'vec' ( expr )* )
					{
						dbg.location(140,40);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:140:40: ^( 'vec' ( expr )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(140,42);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_53.nextNode(), root_1);
						dbg.location(140,48);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:140:48: ( expr )*
						while ( stream_expr.hasNext() ) {
							dbg.location(140,48);
							adaptor.addChild(root_1, stream_expr.nextTree());
						}
						stream_expr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:141:3: 'print' '!' '(' expr ')'
					{
					dbg.location(141,3);
					string_literal193=(Token)match(input,50,FOLLOW_50_in_bigExpr1188);  
					stream_50.add(string_literal193);
					dbg.location(141,11);
					char_literal194=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1190);  
					stream_UNAIRE.add(char_literal194);
					dbg.location(141,15);
					char_literal195=(Token)match(input,32,FOLLOW_32_in_bigExpr1192);  
					stream_32.add(char_literal195);
					dbg.location(141,19);
					pushFollow(FOLLOW_expr_in_bigExpr1194);
					expr196=expr();
					state._fsp--;

					stream_expr.add(expr196.getTree());dbg.location(141,24);
					char_literal197=(Token)match(input,33,FOLLOW_33_in_bigExpr1196);  
					stream_33.add(char_literal197);

					// AST REWRITE
					// elements: 50, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 141:28: -> ^( 'print' expr )
					{
						dbg.location(141,31);
						// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:141:31: ^( 'print' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(141,33);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_50.nextNode(), root_1);
						dbg.location(141,41);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:142:3: block
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(142,3);
					pushFollow(FOLLOW_block_in_bigExpr1207);
					block198=block();
					state._fsp--;

					adaptor.addChild(root_0, block198.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:143:3: bigbinExpr1
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(143,3);
					pushFollow(FOLLOW_bigbinExpr1_in_bigExpr1211);
					bigbinExpr1199=bigbinExpr1();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr1199.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(143, 13);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigExpr"


	public static class bigatom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigatom"
	// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:145:1: bigatom : ( INT | BOOL | IDF ^ ( newStruc | callFun )? | '(' bigExpr ')' -> bigExpr );
	public final GrammarParser.bigatom_return bigatom() throws RecognitionException {
		GrammarParser.bigatom_return retval = new GrammarParser.bigatom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT200=null;
		Token BOOL201=null;
		Token IDF202=null;
		Token char_literal205=null;
		Token char_literal207=null;
		ParserRuleReturnScope newStruc203 =null;
		ParserRuleReturnScope callFun204 =null;
		ParserRuleReturnScope bigExpr206 =null;

		CommonTree INT200_tree=null;
		CommonTree BOOL201_tree=null;
		CommonTree IDF202_tree=null;
		CommonTree char_literal205_tree=null;
		CommonTree char_literal207_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");

		try { dbg.enterRule(getGrammarFileName(), "bigatom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(145, 0);

		try {
			// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:145:9: ( INT | BOOL | IDF ^ ( newStruc | callFun )? | '(' bigExpr ')' -> bigExpr )
			int alt53=4;
			try { dbg.enterDecision(53, decisionCanBacktrack[53]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt53=1;
				}
				break;
			case BOOL:
				{
				alt53=2;
				}
				break;
			case IDF:
				{
				alt53=3;
				}
				break;
			case 32:
				{
				alt53=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(53);}

			switch (alt53) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:145:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(145,11);
					INT200=(Token)match(input,INT,FOLLOW_INT_in_bigatom1219); 
					INT200_tree = (CommonTree)adaptor.create(INT200);
					adaptor.addChild(root_0, INT200_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:146:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(146,3);
					BOOL201=(Token)match(input,BOOL,FOLLOW_BOOL_in_bigatom1222); 
					BOOL201_tree = (CommonTree)adaptor.create(BOOL201);
					adaptor.addChild(root_0, BOOL201_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:147:4: IDF ^ ( newStruc | callFun )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(147,7);
					IDF202=(Token)match(input,IDF,FOLLOW_IDF_in_bigatom1227); 
					IDF202_tree = (CommonTree)adaptor.create(IDF202);
					root_0 = (CommonTree)adaptor.becomeRoot(IDF202_tree, root_0);
					dbg.location(147,9);
					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:147:9: ( newStruc | callFun )?
					int alt52=3;
					try { dbg.enterSubRule(52);
					try { dbg.enterDecision(52, decisionCanBacktrack[52]);

					int LA52_0 = input.LA(1);
					if ( (LA52_0==55) ) {
						alt52=1;
					}
					else if ( (LA52_0==32) ) {
						alt52=2;
					}
					} finally {dbg.exitDecision(52);}

					switch (alt52) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:147:10: newStruc
							{
							dbg.location(147,10);
							pushFollow(FOLLOW_newStruc_in_bigatom1231);
							newStruc203=newStruc();
							state._fsp--;

							adaptor.addChild(root_0, newStruc203.getTree());

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:147:19: callFun
							{
							dbg.location(147,19);
							pushFollow(FOLLOW_callFun_in_bigatom1233);
							callFun204=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun204.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(52);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/lemonni11u/Bureau/compil/raimondi3u/Grammar.g:148:3: '(' bigExpr ')'
					{
					dbg.location(148,3);
					char_literal205=(Token)match(input,32,FOLLOW_32_in_bigatom1238);  
					stream_32.add(char_literal205);
					dbg.location(148,6);
					pushFollow(FOLLOW_bigExpr_in_bigatom1239);
					bigExpr206=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr206.getTree());dbg.location(148,13);
					char_literal207=(Token)match(input,33,FOLLOW_33_in_bigatom1240);  
					stream_33.add(char_literal207);

					// AST REWRITE
					// elements: bigExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 148:17: -> bigExpr
					{
						dbg.location(148,20);
						adaptor.addChild(root_0, stream_bigExpr.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(148, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigatom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigatom"

	// Delegated rules



	public static final BitSet FOLLOW_fichier_in_axiom90 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_axiom92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_fichier108 = new BitSet(new long[]{0x0010100000000002L});
	public static final BitSet FOLLOW_declFun_in_decl119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declStruct_in_decl123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_declStruct132 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_declStruct134 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_declStruct136 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_args_in_declStruct138 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_declStruct141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_args162 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_args164 = new BitSet(new long[]{0x002022040000A000L});
	public static final BitSet FOLLOW_type_in_args166 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_args169 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_args171 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_args173 = new BitSet(new long[]{0x002022040000A000L});
	public static final BitSet FOLLOW_type_in_args175 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_44_in_declFun197 = new BitSet(new long[]{0x0000000000048000L});
	public static final BitSet FOLLOW_IDF_in_declFun200 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_declFun202 = new BitSet(new long[]{0x0000000200008000L});
	public static final BitSet FOLLOW_args_in_declFun204 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_declFun207 = new BitSet(new long[]{0x0080000800000000L});
	public static final BitSet FOLLOW_35_in_declFun210 = new BitSet(new long[]{0x00A022000000A000L});
	public static final BitSet FOLLOW_type_in_declFun212 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_block_in_declFun216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_declFun243 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_declFun245 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_declFun247 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_block_in_declFun249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_type271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_type275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_type278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_type283 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_PREV_in_type286 = new BitSet(new long[]{0x002022000010A000L});
	public static final BitSet FOLLOW_type_in_type288 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_NEXT_in_type290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EPERLU_in_type304 = new BitSet(new long[]{0x002022000000A000L});
	public static final BitSet FOLLOW_type_in_type306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_block323 = new BitSet(new long[]{0x01ED84410D03A200L});
	public static final BitSet FOLLOW_instruct_in_block325 = new BitSet(new long[]{0x01ED84410D03A200L});
	public static final BitSet FOLLOW_56_in_block328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_callFun347 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_expr_in_callFun349 = new BitSet(new long[]{0x0000000600000000L});
	public static final BitSet FOLLOW_34_in_callFun352 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_expr_in_callFun354 = new BitSet(new long[]{0x0000000600000000L});
	public static final BitSet FOLLOW_33_in_callFun358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_newStruc371 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_newStruc373 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_newStruc375 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc377 = new BitSet(new long[]{0x0100000400000000L});
	public static final BitSet FOLLOW_34_in_newStruc380 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_newStruc382 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_newStruc384 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc386 = new BitSet(new long[]{0x0100000400000000L});
	public static final BitSet FOLLOW_56_in_newStruc390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_instruct414 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_instruct416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_instruct424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_instruct430 = new BitSet(new long[]{0x0002000000008000L});
	public static final BitSet FOLLOW_49_in_instruct432 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_dotIDF_in_instruct435 = new BitSet(new long[]{0x0000002000004000L});
	public static final BitSet FOLLOW_37_in_instruct438 = new BitSet(new long[]{0x002022000000E000L});
	public static final BitSet FOLLOW_type_in_instruct440 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EQUAL_in_instruct444 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_bigExpr_in_instruct446 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_instruct448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_instruct475 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_expr_in_instruct477 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_block_in_instruct479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_instruct493 = new BitSet(new long[]{0x00A400410D02A200L});
	public static final BitSet FOLLOW_expr_in_instruct495 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_instruct498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_instruct511 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_block_in_instruct513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_instruct525 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_instruct527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpr_in_instruct535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_dotIDF546 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_dotIDF549 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_dotIDF552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifExpr562 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_expr_in_ifExpr564 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr566 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_ifExpr569 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr2_in_binExpr1599 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_EQUAL_in_binExpr1602 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_binExpr2_in_binExpr1605 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_binExpr3_in_binExpr2616 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_ORBOOL_in_binExpr2618 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_binExpr3_in_binExpr2621 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_binExpr4_in_binExpr3632 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ANDBOOL_in_binExpr3634 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_binExpr4_in_binExpr3637 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_binExpr5_in_binExpr4648 = new BitSet(new long[]{0x0000000000B00002L});
	public static final BitSet FOLLOW_PREV_in_binExpr4651 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_OPBOOLEQ_in_binExpr4654 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_NEXT_in_binExpr4657 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_binExpr5_in_binExpr4661 = new BitSet(new long[]{0x0000000000B00002L});
	public static final BitSet FOLLOW_binExpr6_in_binExpr5672 = new BitSet(new long[]{0x0000000004000012L});
	public static final BitSet FOLLOW_ADD_in_binExpr5675 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_SUB_in_binExpr5678 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_binExpr6_in_binExpr5683 = new BitSet(new long[]{0x0000000004000012L});
	public static final BitSet FOLLOW_unExpr_in_binExpr6694 = new BitSet(new long[]{0x0000000001001002L});
	public static final BitSet FOLLOW_STAR_in_binExpr6698 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_DIV_in_binExpr6701 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_unExpr_in_binExpr6705 = new BitSet(new long[]{0x0000000001001002L});
	public static final BitSet FOLLOW_starExpr_in_vectExpr716 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_vectExpr719 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_expr_in_vectExpr722 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_vectExpr724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_starExpr738 = new BitSet(new long[]{0x0000000104028200L});
	public static final BitSet FOLLOW_moinsExpr_in_starExpr740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moinsExpr_in_starExpr753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_moinsExpr765 = new BitSet(new long[]{0x0000000100028200L});
	public static final BitSet FOLLOW_atom_in_moinsExpr767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_moinsExpr780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vectExpr_in_dotExpr789 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_dotExpr792 = new BitSet(new long[]{0x0000400000008000L});
	public static final BitSet FOLLOW_IDF_in_dotExpr796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_dotExpr800 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_dotExpr802 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_dotExpr804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_unExpr818 = new BitSet(new long[]{0x0000000105028200L});
	public static final BitSet FOLLOW_EPERLU_in_unExpr821 = new BitSet(new long[]{0x0000000105028200L});
	public static final BitSet FOLLOW_dotExpr_in_unExpr826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_atom837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_atom842 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_callFun_in_atom847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_atom853 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_expr_in_atom854 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_atom855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_expr867 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr869 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_expr871 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_expr_in_expr873 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_expr875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_expr887 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr889 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_expr891 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_expr_in_expr893 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_expr895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_expr906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr1_in_expr918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr2_in_bigbinExpr1927 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_EQUAL_in_bigbinExpr1930 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_bigbinExpr2_in_bigbinExpr1933 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bigbinExpr3_in_bigbinExpr2944 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_ORBOOL_in_bigbinExpr2946 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_bigbinExpr3_in_bigbinExpr2949 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_bigbinExpr4_in_bigbinExpr3960 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ANDBOOL_in_bigbinExpr3962 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_bigbinExpr4_in_bigbinExpr3965 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_bigbinExpr5_in_bigbinExpr4976 = new BitSet(new long[]{0x0000000000B00002L});
	public static final BitSet FOLLOW_PREV_in_bigbinExpr4979 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_OPBOOLEQ_in_bigbinExpr4982 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_NEXT_in_bigbinExpr4985 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_bigbinExpr5_in_bigbinExpr4989 = new BitSet(new long[]{0x0000000000B00002L});
	public static final BitSet FOLLOW_bigbinExpr6_in_bigbinExpr51000 = new BitSet(new long[]{0x0000000004000012L});
	public static final BitSet FOLLOW_set_in_bigbinExpr51002 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_bigbinExpr6_in_bigbinExpr51009 = new BitSet(new long[]{0x0000000004000012L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr61020 = new BitSet(new long[]{0x0000000001001002L});
	public static final BitSet FOLLOW_STAR_in_bigbinExpr61024 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_DIV_in_bigbinExpr61027 = new BitSet(new long[]{0x000000010D02A200L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr61031 = new BitSet(new long[]{0x0000000001001002L});
	public static final BitSet FOLLOW_bigstarExpr_in_bigvectExpr1041 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_bigvectExpr1044 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_bigExpr_in_bigvectExpr1047 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_bigvectExpr1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_bigstarExpr1063 = new BitSet(new long[]{0x0000000104028200L});
	public static final BitSet FOLLOW_bigmoinsExpr_in_bigstarExpr1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigmoinsExpr_in_bigstarExpr1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_bigmoinsExpr1090 = new BitSet(new long[]{0x0000000100028200L});
	public static final BitSet FOLLOW_bigatom_in_bigmoinsExpr1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigatom_in_bigmoinsExpr1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigvectExpr_in_bigdotExpr1114 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_bigdotExpr1117 = new BitSet(new long[]{0x0000400000008000L});
	public static final BitSet FOLLOW_IDF_in_bigdotExpr1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_bigdotExpr1125 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_bigdotExpr1127 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_bigdotExpr1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_bigunExpr1143 = new BitSet(new long[]{0x0000000105028200L});
	public static final BitSet FOLLOW_EPERLU_in_bigunExpr1146 = new BitSet(new long[]{0x0000000105028200L});
	public static final BitSet FOLLOW_bigdotExpr_in_bigunExpr1151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_bigExpr1161 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1163 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_bigExpr1165 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_expr_in_bigExpr1167 = new BitSet(new long[]{0x0000010400000000L});
	public static final BitSet FOLLOW_34_in_bigExpr1170 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_expr_in_bigExpr1172 = new BitSet(new long[]{0x0000010400000000L});
	public static final BitSet FOLLOW_40_in_bigExpr1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_bigExpr1188 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1190 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_bigExpr1192 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_expr_in_bigExpr1194 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_bigExpr1196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_bigExpr1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr1_in_bigExpr1211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_bigatom1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_bigatom1222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_bigatom1227 = new BitSet(new long[]{0x0080000100000002L});
	public static final BitSet FOLLOW_newStruc_in_bigatom1231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callFun_in_bigatom1233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_bigatom1238 = new BitSet(new long[]{0x00A400010D02A200L});
	public static final BitSet FOLLOW_bigExpr_in_bigatom1239 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_bigatom1240 = new BitSet(new long[]{0x0000000000000002L});
}
