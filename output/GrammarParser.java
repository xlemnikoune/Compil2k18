// $ANTLR null /home/frosqh/workspace/raimondi3u/Grammar.g 2018-03-06 13:54:51

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ANDBOOL", "ATTRIBUTE", 
		"BLOCK", "BOOL", "CALLFUN", "COMMENT", "DIV", "EPERLU", "EQUAL", "IDF", 
		"IF", "INT", "MAIN", "NEW", "NEXT", "OPBOOLEQ", "ORBOOL", "PREV", "STAR", 
		"STRING", "SUB", "UNAIRE", "VEC", "WS", "'('", "')'", "','", "'->'", "'.'", 
		"':'", "';'", "'['", "']'", "'bool'", "'break'", "'else'", "'fn'", "'i32'", 
		"'len'", "'let'", "'loop'", "'mut'", "'print'", "'return'", "'struct'", 
		"'vec'", "'while'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
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
	public static final int ADD=4;
	public static final int ANDBOOL=5;
	public static final int ATTRIBUTE=6;
	public static final int BLOCK=7;
	public static final int BOOL=8;
	public static final int CALLFUN=9;
	public static final int COMMENT=10;
	public static final int DIV=11;
	public static final int EPERLU=12;
	public static final int EQUAL=13;
	public static final int IDF=14;
	public static final int IF=15;
	public static final int INT=16;
	public static final int MAIN=17;
	public static final int NEW=18;
	public static final int NEXT=19;
	public static final int OPBOOLEQ=20;
	public static final int ORBOOL=21;
	public static final int PREV=22;
	public static final int STAR=23;
	public static final int STRING=24;
	public static final int SUB=25;
	public static final int UNAIRE=26;
	public static final int VEC=27;
	public static final int WS=28;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "bigExpr", "type", "binExpr2", "axiom", "atom", "newStruc", 
		"bigatom", "unExpr", "bigbinExpr2", "binExpr5", "starExpr", "vectExpr", 
		"bigbinExpr6", "binExpr3", "bigbinExpr5", "binExpr1", "dotIDF", "bigbinExpr4", 
		"bigvectExpr", "bigunExpr", "fichier", "args", "callFun", "bigdotExpr", 
		"instruct", "bigbinExpr3", "declStruct", "block", "ifExpr", "bigbinExpr1", 
		"dotExpr", "declFun", "decl", "expr", "binExpr4", "moinsExpr", "binExpr6"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false
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
	@Override public String getGrammarFileName() { return "/home/frosqh/workspace/raimondi3u/Grammar.g"; }


	boolean mainFound = false;


	public static class axiom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "axiom"
	// /home/frosqh/workspace/raimondi3u/Grammar.g:20:1: axiom : fichier EOF -> fichier ;
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
		dbg.location(20, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:20:7: ( fichier EOF -> fichier )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:20:9: fichier EOF
			{
			dbg.location(20,9);
			pushFollow(FOLLOW_fichier_in_axiom78);
			fichier1=fichier();
			state._fsp--;

			stream_fichier.add(fichier1.getTree());dbg.location(20,17);
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_axiom80);  
			stream_EOF.add(EOF2);
			dbg.location(20,21);
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
			// 20:93: -> fichier
			{
				dbg.location(20,96);
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
		dbg.location(21, 0);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:23:1: fichier : ( decl )* ;
	public final GrammarParser.fichier_return fichier() throws RecognitionException {
		GrammarParser.fichier_return retval = new GrammarParser.fichier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope decl3 =null;


		try { dbg.enterRule(getGrammarFileName(), "fichier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:23:9: ( ( decl )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:23:11: ( decl )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(23,11);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:23:11: ( decl )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==41||LA1_0==49) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:23:11: decl
					{
					dbg.location(23,11);
					pushFollow(FOLLOW_decl_in_fichier96);
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
		dbg.location(24, 0);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:26:1: decl : ( declFun | declStruct );
	public final GrammarParser.decl_return decl() throws RecognitionException {
		GrammarParser.decl_return retval = new GrammarParser.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declFun4 =null;
		ParserRuleReturnScope declStruct5 =null;


		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:26:6: ( declFun | declStruct )
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==41) ) {
				alt2=1;
			}
			else if ( (LA2_0==49) ) {
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:26:8: declFun
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(26,8);
					pushFollow(FOLLOW_declFun_in_decl107);
					declFun4=declFun();
					state._fsp--;

					adaptor.addChild(root_0, declFun4.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:27:3: declStruct
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(27,3);
					pushFollow(FOLLOW_declStruct_in_decl111);
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
		dbg.location(28, 0);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:30:1: declStruct : 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) ;
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
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");

		try { dbg.enterRule(getGrammarFileName(), "declStruct");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:30:12: ( 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:30:14: 'struct' IDF '{' ( args )? '}'
			{
			dbg.location(30,14);
			string_literal6=(Token)match(input,49,FOLLOW_49_in_declStruct120);  
			stream_49.add(string_literal6);
			dbg.location(30,23);
			IDF7=(Token)match(input,IDF,FOLLOW_IDF_in_declStruct122);  
			stream_IDF.add(IDF7);
			dbg.location(30,27);
			char_literal8=(Token)match(input,52,FOLLOW_52_in_declStruct124);  
			stream_52.add(char_literal8);
			dbg.location(30,31);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:30:31: ( args )?
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:30:31: args
					{
					dbg.location(30,31);
					pushFollow(FOLLOW_args_in_declStruct126);
					args9=args();
					state._fsp--;

					stream_args.add(args9.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(30,37);
			char_literal10=(Token)match(input,53,FOLLOW_53_in_declStruct129);  
			stream_53.add(char_literal10);

			// AST REWRITE
			// elements: IDF, 49, args
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 30:41: -> ^( 'struct' IDF ( args )? )
			{
				dbg.location(30,44);
				// /home/frosqh/workspace/raimondi3u/Grammar.g:30:44: ^( 'struct' IDF ( args )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(30,46);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_49.nextNode(), root_1);
				dbg.location(30,55);
				adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(30,59);
				// /home/frosqh/workspace/raimondi3u/Grammar.g:30:59: ( args )?
				if ( stream_args.hasNext() ) {
					dbg.location(30,59);
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
		dbg.location(31, 0);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:33:1: args : IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* ;
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
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "args");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:33:6: ( IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:33:8: IDF ':' type ( ',' IDF ':' type )*
			{
			dbg.location(33,8);
			IDF11=(Token)match(input,IDF,FOLLOW_IDF_in_args150);  
			stream_IDF.add(IDF11);
			dbg.location(33,12);
			char_literal12=(Token)match(input,34,FOLLOW_34_in_args152);  
			stream_34.add(char_literal12);
			dbg.location(33,16);
			pushFollow(FOLLOW_type_in_args154);
			type13=type();
			state._fsp--;

			stream_type.add(type13.getTree());dbg.location(33,21);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:33:21: ( ',' IDF ':' type )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==31) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:33:22: ',' IDF ':' type
					{
					dbg.location(33,22);
					char_literal14=(Token)match(input,31,FOLLOW_31_in_args157);  
					stream_31.add(char_literal14);
					dbg.location(33,26);
					IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_args159);  
					stream_IDF.add(IDF15);
					dbg.location(33,30);
					char_literal16=(Token)match(input,34,FOLLOW_34_in_args161);  
					stream_34.add(char_literal16);
					dbg.location(33,34);
					pushFollow(FOLLOW_type_in_args163);
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
			// 33:41: -> ( ^( IDF type ) )*
			{
				dbg.location(33,44);
				// /home/frosqh/workspace/raimondi3u/Grammar.g:33:44: ( ^( IDF type ) )*
				while ( stream_type.hasNext()||stream_IDF.hasNext() ) {
					dbg.location(33,45);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:33:45: ^( IDF type )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					dbg.location(33,47);
					root_1 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);
					dbg.location(33,51);
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
		dbg.location(34, 0);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:36:1: declFun : 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( args )? ( ^( '->' type ) )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) ;
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
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_MAIN=new RewriteRuleTokenStream(adaptor,"token MAIN");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "declFun");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:36:9: ( 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( args )? ( ^( '->' type ) )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:36:11: 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( args )? ( ^( '->' type ) )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
			{
			dbg.location(36,11);
			string_literal18=(Token)match(input,41,FOLLOW_41_in_declFun185);  
			stream_41.add(string_literal18);
			dbg.location(36,16);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:36:16: ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( args )? ( ^( '->' type ) )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:36:17: IDF '(' ( args )? ')' ( '->' type )? block
					{
					dbg.location(36,17);
					IDF19=(Token)match(input,IDF,FOLLOW_IDF_in_declFun188);  
					stream_IDF.add(IDF19);
					dbg.location(36,21);
					char_literal20=(Token)match(input,29,FOLLOW_29_in_declFun190);  
					stream_29.add(char_literal20);
					dbg.location(36,25);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:36:25: ( args )?
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

							// /home/frosqh/workspace/raimondi3u/Grammar.g:36:25: args
							{
							dbg.location(36,25);
							pushFollow(FOLLOW_args_in_declFun192);
							args21=args();
							state._fsp--;

							stream_args.add(args21.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(5);}
					dbg.location(36,31);
					char_literal22=(Token)match(input,30,FOLLOW_30_in_declFun195);  
					stream_30.add(char_literal22);
					dbg.location(36,35);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:36:35: ( '->' type )?
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( (LA6_0==32) ) {
						alt6=1;
					}
					} finally {dbg.exitDecision(6);}

					switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:36:36: '->' type
							{
							dbg.location(36,36);
							string_literal23=(Token)match(input,32,FOLLOW_32_in_declFun198);  
							stream_32.add(string_literal23);
							dbg.location(36,41);
							pushFollow(FOLLOW_type_in_declFun200);
							type24=type();
							state._fsp--;

							stream_type.add(type24.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(6);}
					dbg.location(36,48);
					pushFollow(FOLLOW_block_in_declFun204);
					block25=block();
					state._fsp--;

					stream_block.add(block25.getTree());
					// AST REWRITE
					// elements: block, type, 32, args, 41, IDF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 36:54: -> ^( 'fn' IDF ( args )? ( ^( '->' type ) )? block )
					{
						dbg.location(36,57);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:36:57: ^( 'fn' IDF ( args )? ( ^( '->' type ) )? block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(36,59);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_41.nextNode(), root_1);
						dbg.location(36,64);
						adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(36,68);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:36:68: ( args )?
						if ( stream_args.hasNext() ) {
							dbg.location(36,68);
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();
						dbg.location(36,74);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:36:74: ( ^( '->' type ) )?
						if ( stream_type.hasNext()||stream_32.hasNext() ) {
							dbg.location(36,74);
							// /home/frosqh/workspace/raimondi3u/Grammar.g:36:74: ^( '->' type )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							dbg.location(36,76);
							root_2 = (CommonTree)adaptor.becomeRoot(stream_32.nextNode(), root_2);
							dbg.location(36,81);
							adaptor.addChild(root_2, stream_type.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_type.reset();
						stream_32.reset();
						dbg.location(36,88);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:37:4: MAIN '(' ')' block
					{
					dbg.location(37,4);
					mainFound = true;dbg.location(37,23);
					MAIN26=(Token)match(input,MAIN,FOLLOW_MAIN_in_declFun230);  
					stream_MAIN.add(MAIN26);
					dbg.location(37,28);
					char_literal27=(Token)match(input,29,FOLLOW_29_in_declFun232);  
					stream_29.add(char_literal27);
					dbg.location(37,32);
					char_literal28=(Token)match(input,30,FOLLOW_30_in_declFun234);  
					stream_30.add(char_literal28);
					dbg.location(37,36);
					pushFollow(FOLLOW_block_in_declFun236);
					block29=block();
					state._fsp--;

					stream_block.add(block29.getTree());
					// AST REWRITE
					// elements: 41, MAIN, block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 37:42: -> ^( 'fn' MAIN block )
					{
						dbg.location(37,45);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:37:45: ^( 'fn' MAIN block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(37,47);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_41.nextNode(), root_1);
						dbg.location(37,52);
						adaptor.addChild(root_1, stream_MAIN.nextNode());dbg.location(37,57);
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
		dbg.location(38, 0);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:40:1: type : (| 'i32' | 'bool' | IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) );
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
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:40:6: (| 'i32' | 'bool' | IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) )
			int alt8=6;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case EQUAL:
			case NEXT:
			case 30:
			case 31:
			case 52:
			case 53:
				{
				alt8=1;
				}
				break;
			case 42:
				{
				alt8=2;
				}
				break;
			case 38:
				{
				alt8=3;
				}
				break;
			case IDF:
				{
				alt8=4;
				}
				break;
			case 50:
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:40:8: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:40:10: 'i32'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(40,10);
					string_literal30=(Token)match(input,42,FOLLOW_42_in_type258); 
					string_literal30_tree = (CommonTree)adaptor.create(string_literal30);
					adaptor.addChild(root_0, string_literal30_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:41:3: 'bool'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(41,3);
					string_literal31=(Token)match(input,38,FOLLOW_38_in_type262); 
					string_literal31_tree = (CommonTree)adaptor.create(string_literal31);
					adaptor.addChild(root_0, string_literal31_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:42:2: IDF
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(42,2);
					IDF32=(Token)match(input,IDF,FOLLOW_IDF_in_type265); 
					IDF32_tree = (CommonTree)adaptor.create(IDF32);
					adaptor.addChild(root_0, IDF32_tree);

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:43:4: 'vec' ( '<' type '>' )
					{
					dbg.location(43,4);
					string_literal33=(Token)match(input,50,FOLLOW_50_in_type270);  
					stream_50.add(string_literal33);
					dbg.location(43,10);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:43:10: ( '<' type '>' )
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:43:11: '<' type '>'
					{
					dbg.location(43,11);
					char_literal34=(Token)match(input,PREV,FOLLOW_PREV_in_type273);  
					stream_PREV.add(char_literal34);
					dbg.location(43,15);
					pushFollow(FOLLOW_type_in_type275);
					type35=type();
					state._fsp--;

					stream_type.add(type35.getTree());dbg.location(43,20);
					char_literal36=(Token)match(input,NEXT,FOLLOW_NEXT_in_type277);  
					stream_NEXT.add(char_literal36);

					}

					// AST REWRITE
					// elements: 50, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 43:25: -> ^( 'vec' type )
					{
						dbg.location(43,28);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:43:28: ^( 'vec' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(43,30);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_50.nextNode(), root_1);
						dbg.location(43,36);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:44:3: '&' type
					{
					dbg.location(44,3);
					char_literal37=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_type291);  
					stream_EPERLU.add(char_literal37);
					dbg.location(44,7);
					pushFollow(FOLLOW_type_in_type293);
					type38=type();
					state._fsp--;

					stream_type.add(type38.getTree());
					// AST REWRITE
					// elements: EPERLU, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 44:12: -> ^( '&' type )
					{
						dbg.location(44,15);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:44:15: ^( '&' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(44,17);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_EPERLU.nextNode(), root_1);
						dbg.location(44,21);
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
		dbg.location(45, 0);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:47:1: block : '{' ( instruct )* '}' -> ^( BLOCK ( instruct )* ) ;
	public final GrammarParser.block_return block() throws RecognitionException {
		GrammarParser.block_return retval = new GrammarParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal39=null;
		Token char_literal41=null;
		ParserRuleReturnScope instruct40 =null;

		CommonTree char_literal39_tree=null;
		CommonTree char_literal41_tree=null;
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_instruct=new RewriteRuleSubtreeStream(adaptor,"rule instruct");

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:47:7: ( '{' ( instruct )* '}' -> ^( BLOCK ( instruct )* ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:47:9: '{' ( instruct )* '}'
			{
			dbg.location(47,9);
			char_literal39=(Token)match(input,52,FOLLOW_52_in_block310);  
			stream_52.add(char_literal39);
			dbg.location(47,13);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:47:13: ( instruct )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==BOOL||LA9_0==EPERLU||(LA9_0 >= IDF && LA9_0 <= INT)||LA9_0==STAR||(LA9_0 >= SUB && LA9_0 <= UNAIRE)||LA9_0==29||LA9_0==35||LA9_0==39||(LA9_0 >= 44 && LA9_0 <= 45)||(LA9_0 >= 47 && LA9_0 <= 48)||(LA9_0 >= 50 && LA9_0 <= 52)) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:47:13: instruct
					{
					dbg.location(47,13);
					pushFollow(FOLLOW_instruct_in_block312);
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
			dbg.location(47,23);
			char_literal41=(Token)match(input,53,FOLLOW_53_in_block315);  
			stream_53.add(char_literal41);

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
			// 47:26: -> ^( BLOCK ( instruct )* )
			{
				dbg.location(47,29);
				// /home/frosqh/workspace/raimondi3u/Grammar.g:47:29: ^( BLOCK ( instruct )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(47,31);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				dbg.location(47,37);
				// /home/frosqh/workspace/raimondi3u/Grammar.g:47:37: ( instruct )*
				while ( stream_instruct.hasNext() ) {
					dbg.location(47,37);
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
		dbg.location(48, 0);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:51:1: callFun : '(' expr ( ',' expr )* ')' -> ( expr )* ;
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
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "callFun");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:51:9: ( '(' expr ( ',' expr )* ')' -> ( expr )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:51:11: '(' expr ( ',' expr )* ')'
			{
			dbg.location(51,11);
			char_literal42=(Token)match(input,29,FOLLOW_29_in_callFun334);  
			stream_29.add(char_literal42);
			dbg.location(51,15);
			pushFollow(FOLLOW_expr_in_callFun336);
			expr43=expr();
			state._fsp--;

			stream_expr.add(expr43.getTree());dbg.location(51,20);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:51:20: ( ',' expr )*
			try { dbg.enterSubRule(10);

			loop10:
			while (true) {
				int alt10=2;
				try { dbg.enterDecision(10, decisionCanBacktrack[10]);

				int LA10_0 = input.LA(1);
				if ( (LA10_0==31) ) {
					alt10=1;
				}

				} finally {dbg.exitDecision(10);}

				switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:51:21: ',' expr
					{
					dbg.location(51,21);
					char_literal44=(Token)match(input,31,FOLLOW_31_in_callFun339);  
					stream_31.add(char_literal44);
					dbg.location(51,25);
					pushFollow(FOLLOW_expr_in_callFun341);
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
			dbg.location(51,32);
			char_literal46=(Token)match(input,30,FOLLOW_30_in_callFun345);  
			stream_30.add(char_literal46);

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
			// 51:36: -> ( expr )*
			{
				dbg.location(51,39);
				// /home/frosqh/workspace/raimondi3u/Grammar.g:51:39: ( expr )*
				while ( stream_expr.hasNext() ) {
					dbg.location(51,39);
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
		dbg.location(51, 43);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:53:1: newStruc : '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) ;
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
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");

		try { dbg.enterRule(getGrammarFileName(), "newStruc");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(53, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:53:10: ( '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:53:12: '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}'
			{
			dbg.location(53,12);
			char_literal47=(Token)match(input,52,FOLLOW_52_in_newStruc358);  
			stream_52.add(char_literal47);
			dbg.location(53,16);
			IDF48=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc360);  
			stream_IDF.add(IDF48);
			dbg.location(53,20);
			char_literal49=(Token)match(input,34,FOLLOW_34_in_newStruc362);  
			stream_34.add(char_literal49);
			dbg.location(53,24);
			pushFollow(FOLLOW_bigExpr_in_newStruc364);
			bigExpr50=bigExpr();
			state._fsp--;

			stream_bigExpr.add(bigExpr50.getTree());dbg.location(53,32);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:53:32: ( ',' IDF ':' bigExpr )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==31) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:53:33: ',' IDF ':' bigExpr
					{
					dbg.location(53,33);
					char_literal51=(Token)match(input,31,FOLLOW_31_in_newStruc367);  
					stream_31.add(char_literal51);
					dbg.location(53,37);
					IDF52=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc369);  
					stream_IDF.add(IDF52);
					dbg.location(53,41);
					char_literal53=(Token)match(input,34,FOLLOW_34_in_newStruc371);  
					stream_34.add(char_literal53);
					dbg.location(53,45);
					pushFollow(FOLLOW_bigExpr_in_newStruc373);
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
			dbg.location(53,55);
			char_literal55=(Token)match(input,53,FOLLOW_53_in_newStruc377);  
			stream_53.add(char_literal55);

			// AST REWRITE
			// elements: IDF, bigExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 53:59: -> ^( NEW ( ^( IDF bigExpr ) )* )
			{
				dbg.location(53,62);
				// /home/frosqh/workspace/raimondi3u/Grammar.g:53:62: ^( NEW ( ^( IDF bigExpr ) )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(53,64);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);
				dbg.location(53,68);
				// /home/frosqh/workspace/raimondi3u/Grammar.g:53:68: ( ^( IDF bigExpr ) )*
				while ( stream_IDF.hasNext()||stream_bigExpr.hasNext() ) {
					dbg.location(53,68);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:53:68: ^( IDF bigExpr )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					dbg.location(53,70);
					root_2 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);
					dbg.location(53,74);
					adaptor.addChild(root_2, stream_bigExpr.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_IDF.reset();
				stream_bigExpr.reset();

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
		dbg.location(53, 83);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:55:1: instruct : ( expr ';' -> expr | ';' ->| 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) | 'while' expr block -> ^( 'while' expr block ) | 'return' ( expr )? ';' -> ^( 'return' ( expr )? ) | 'loop' block -> ^( 'loop' block ) | 'break' ';' -> 'break' | ifExpr );
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
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_dotIDF=new RewriteRuleSubtreeStream(adaptor,"rule dotIDF");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "instruct");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(55, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:55:10: ( expr ';' -> expr | ';' ->| 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) | 'while' expr block -> ^( 'while' expr block ) | 'return' ( expr )? ';' -> ^( 'return' ( expr )? ) | 'loop' block -> ^( 'loop' block ) | 'break' ';' -> 'break' | ifExpr )
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
			case 29:
			case 47:
			case 50:
			case 52:
				{
				alt15=1;
				}
				break;
			case 35:
				{
				alt15=2;
				}
				break;
			case 44:
				{
				alt15=3;
				}
				break;
			case 51:
				{
				alt15=4;
				}
				break;
			case 48:
				{
				alt15=5;
				}
				break;
			case 45:
				{
				alt15=6;
				}
				break;
			case 39:
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:56:3: expr ';'
					{
					dbg.location(56,3);
					pushFollow(FOLLOW_expr_in_instruct401);
					expr56=expr();
					state._fsp--;

					stream_expr.add(expr56.getTree());dbg.location(56,8);
					char_literal57=(Token)match(input,35,FOLLOW_35_in_instruct403);  
					stream_35.add(char_literal57);

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
					// 56:12: -> expr
					{
						dbg.location(56,15);
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:57:3: ';'
					{
					dbg.location(57,3);
					char_literal58=(Token)match(input,35,FOLLOW_35_in_instruct411);  
					stream_35.add(char_literal58);

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
					// 57:7: ->
					{
						dbg.location(58,0);
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:58:3: 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';'
					{
					dbg.location(58,3);
					string_literal59=(Token)match(input,44,FOLLOW_44_in_instruct417);  
					stream_44.add(string_literal59);
					dbg.location(58,9);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:58:9: ( 'mut' )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==46) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:58:9: 'mut'
							{
							dbg.location(58,9);
							string_literal60=(Token)match(input,46,FOLLOW_46_in_instruct419);  
							stream_46.add(string_literal60);

							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(58,16);
					pushFollow(FOLLOW_dotIDF_in_instruct422);
					dotIDF61=dotIDF();
					state._fsp--;

					stream_dotIDF.add(dotIDF61.getTree());dbg.location(58,23);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:58:23: ( ':' type )?
					int alt13=2;
					try { dbg.enterSubRule(13);
					try { dbg.enterDecision(13, decisionCanBacktrack[13]);

					int LA13_0 = input.LA(1);
					if ( (LA13_0==34) ) {
						alt13=1;
					}
					} finally {dbg.exitDecision(13);}

					switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:58:24: ':' type
							{
							dbg.location(58,24);
							char_literal62=(Token)match(input,34,FOLLOW_34_in_instruct425);  
							stream_34.add(char_literal62);
							dbg.location(58,28);
							pushFollow(FOLLOW_type_in_instruct427);
							type63=type();
							state._fsp--;

							stream_type.add(type63.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(58,35);
					char_literal64=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instruct431);  
					stream_EQUAL.add(char_literal64);
					dbg.location(58,39);
					pushFollow(FOLLOW_bigExpr_in_instruct433);
					bigExpr65=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr65.getTree());dbg.location(58,47);
					char_literal66=(Token)match(input,35,FOLLOW_35_in_instruct435);  
					stream_35.add(char_literal66);

					// AST REWRITE
					// elements: 44, 46, type, bigExpr, dotIDF, EQUAL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 58:51: -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) )
					{
						dbg.location(58,54);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:58:54: ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(58,56);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_44.nextNode(), root_1);
						dbg.location(58,62);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:58:62: ( 'mut' )?
						if ( stream_46.hasNext() ) {
							dbg.location(58,62);
							adaptor.addChild(root_1, stream_46.nextNode());
						}
						stream_46.reset();
						dbg.location(58,69);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:58:69: ( type )?
						if ( stream_type.hasNext() ) {
							dbg.location(58,70);
							adaptor.addChild(root_1, stream_type.nextTree());
						}
						stream_type.reset();
						dbg.location(58,77);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:58:77: ^( '=' dotIDF bigExpr )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(58,79);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_EQUAL.nextNode(), root_2);
						dbg.location(58,83);
						adaptor.addChild(root_2, stream_dotIDF.nextTree());dbg.location(58,90);
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:59:3: 'while' expr block
					{
					dbg.location(59,3);
					string_literal67=(Token)match(input,51,FOLLOW_51_in_instruct462);  
					stream_51.add(string_literal67);
					dbg.location(59,11);
					pushFollow(FOLLOW_expr_in_instruct464);
					expr68=expr();
					state._fsp--;

					stream_expr.add(expr68.getTree());dbg.location(59,16);
					pushFollow(FOLLOW_block_in_instruct466);
					block69=block();
					state._fsp--;

					stream_block.add(block69.getTree());
					// AST REWRITE
					// elements: 51, block, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 59:22: -> ^( 'while' expr block )
					{
						dbg.location(59,25);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:59:25: ^( 'while' expr block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(59,27);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_51.nextNode(), root_1);
						dbg.location(59,35);
						adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(59,40);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:60:3: 'return' ( expr )? ';'
					{
					dbg.location(60,3);
					string_literal70=(Token)match(input,48,FOLLOW_48_in_instruct480);  
					stream_48.add(string_literal70);
					dbg.location(60,12);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:60:12: ( expr )?
					int alt14=2;
					try { dbg.enterSubRule(14);
					try { dbg.enterDecision(14, decisionCanBacktrack[14]);

					int LA14_0 = input.LA(1);
					if ( (LA14_0==BOOL||LA14_0==EPERLU||LA14_0==IDF||LA14_0==INT||LA14_0==STAR||(LA14_0 >= SUB && LA14_0 <= UNAIRE)||LA14_0==29||LA14_0==47||LA14_0==50||LA14_0==52) ) {
						alt14=1;
					}
					} finally {dbg.exitDecision(14);}

					switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:60:12: expr
							{
							dbg.location(60,12);
							pushFollow(FOLLOW_expr_in_instruct482);
							expr71=expr();
							state._fsp--;

							stream_expr.add(expr71.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(60,18);
					char_literal72=(Token)match(input,35,FOLLOW_35_in_instruct485);  
					stream_35.add(char_literal72);

					// AST REWRITE
					// elements: 48, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 60:22: -> ^( 'return' ( expr )? )
					{
						dbg.location(60,25);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:60:25: ^( 'return' ( expr )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(60,27);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_48.nextNode(), root_1);
						dbg.location(60,36);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:60:36: ( expr )?
						if ( stream_expr.hasNext() ) {
							dbg.location(60,36);
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:61:3: 'loop' block
					{
					dbg.location(61,3);
					string_literal73=(Token)match(input,45,FOLLOW_45_in_instruct498);  
					stream_45.add(string_literal73);
					dbg.location(61,10);
					pushFollow(FOLLOW_block_in_instruct500);
					block74=block();
					state._fsp--;

					stream_block.add(block74.getTree());
					// AST REWRITE
					// elements: 45, block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 61:16: -> ^( 'loop' block )
					{
						dbg.location(61,19);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:61:19: ^( 'loop' block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(61,21);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);
						dbg.location(61,28);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:62:3: 'break' ';'
					{
					dbg.location(62,3);
					string_literal75=(Token)match(input,39,FOLLOW_39_in_instruct512);  
					stream_39.add(string_literal75);
					dbg.location(62,11);
					char_literal76=(Token)match(input,35,FOLLOW_35_in_instruct514);  
					stream_35.add(char_literal76);

					// AST REWRITE
					// elements: 39
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 62:15: -> 'break'
					{
						dbg.location(62,18);
						adaptor.addChild(root_0, stream_39.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:63:3: ifExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(63,3);
					pushFollow(FOLLOW_ifExpr_in_instruct522);
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
		dbg.location(64, 0);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:66:1: dotIDF : IDF ( '.' ^ IDF )? ;
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
		dbg.location(66, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:66:9: ( IDF ( '.' ^ IDF )? )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:67:1: IDF ( '.' ^ IDF )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(67,1);
			IDF78=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF533); 
			IDF78_tree = (CommonTree)adaptor.create(IDF78);
			adaptor.addChild(root_0, IDF78_tree);
			dbg.location(67,5);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:67:5: ( '.' ^ IDF )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==33) ) {
				alt16=1;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:67:6: '.' ^ IDF
					{
					dbg.location(67,9);
					char_literal79=(Token)match(input,33,FOLLOW_33_in_dotIDF536); 
					char_literal79_tree = (CommonTree)adaptor.create(char_literal79);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal79_tree, root_0);
					dbg.location(67,11);
					IDF80=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF539); 
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
		dbg.location(67, 15);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:69:1: ifExpr : 'if' expr block ( 'else' block )? -> ^( 'if' expr block ( ^( 'else' block ) )? ) ;
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
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try { dbg.enterRule(getGrammarFileName(), "ifExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:69:8: ( 'if' expr block ( 'else' block )? -> ^( 'if' expr block ( ^( 'else' block ) )? ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:69:10: 'if' expr block ( 'else' block )?
			{
			dbg.location(69,10);
			string_literal81=(Token)match(input,IF,FOLLOW_IF_in_ifExpr549);  
			stream_IF.add(string_literal81);
			dbg.location(69,15);
			pushFollow(FOLLOW_expr_in_ifExpr551);
			expr82=expr();
			state._fsp--;

			stream_expr.add(expr82.getTree());dbg.location(69,20);
			pushFollow(FOLLOW_block_in_ifExpr553);
			block83=block();
			state._fsp--;

			stream_block.add(block83.getTree());dbg.location(69,26);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:69:26: ( 'else' block )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==40) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:69:27: 'else' block
					{
					dbg.location(69,27);
					string_literal84=(Token)match(input,40,FOLLOW_40_in_ifExpr556);  
					stream_40.add(string_literal84);
					dbg.location(69,34);
					pushFollow(FOLLOW_block_in_ifExpr558);
					block85=block();
					state._fsp--;

					stream_block.add(block85.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(17);}

			// AST REWRITE
			// elements: block, IF, 40, expr, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 69:43: -> ^( 'if' expr block ( ^( 'else' block ) )? )
			{
				dbg.location(69,46);
				// /home/frosqh/workspace/raimondi3u/Grammar.g:69:46: ^( 'if' expr block ( ^( 'else' block ) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(69,48);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				dbg.location(69,53);
				adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(69,58);
				adaptor.addChild(root_1, stream_block.nextTree());dbg.location(69,64);
				// /home/frosqh/workspace/raimondi3u/Grammar.g:69:64: ( ^( 'else' block ) )?
				if ( stream_40.hasNext()||stream_block.hasNext() ) {
					dbg.location(69,64);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:69:64: ^( 'else' block )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					dbg.location(69,66);
					root_2 = (CommonTree)adaptor.becomeRoot(stream_40.nextNode(), root_2);
					dbg.location(69,73);
					adaptor.addChild(root_2, stream_block.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_40.reset();
				stream_block.reset();

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
		dbg.location(69, 80);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:71:1: binExpr1 : binExpr2 ( EQUAL ^ binExpr2 )* ;
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
		dbg.location(71, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:71:10: ( binExpr2 ( EQUAL ^ binExpr2 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:71:12: binExpr2 ( EQUAL ^ binExpr2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(71,12);
			pushFollow(FOLLOW_binExpr2_in_binExpr1586);
			binExpr286=binExpr2();
			state._fsp--;

			adaptor.addChild(root_0, binExpr286.getTree());
			dbg.location(71,21);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:71:21: ( EQUAL ^ binExpr2 )*
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:71:22: EQUAL ^ binExpr2
					{
					dbg.location(71,27);
					EQUAL87=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_binExpr1589); 
					EQUAL87_tree = (CommonTree)adaptor.create(EQUAL87);
					root_0 = (CommonTree)adaptor.becomeRoot(EQUAL87_tree, root_0);
					dbg.location(71,29);
					pushFollow(FOLLOW_binExpr2_in_binExpr1592);
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
		dbg.location(71, 38);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:73:1: binExpr2 : binExpr3 ( ORBOOL ^ binExpr3 )* ;
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
		dbg.location(73, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:73:10: ( binExpr3 ( ORBOOL ^ binExpr3 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:73:12: binExpr3 ( ORBOOL ^ binExpr3 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(73,12);
			pushFollow(FOLLOW_binExpr3_in_binExpr2603);
			binExpr389=binExpr3();
			state._fsp--;

			adaptor.addChild(root_0, binExpr389.getTree());
			dbg.location(73,20);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:73:20: ( ORBOOL ^ binExpr3 )*
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:73:21: ORBOOL ^ binExpr3
					{
					dbg.location(73,27);
					ORBOOL90=(Token)match(input,ORBOOL,FOLLOW_ORBOOL_in_binExpr2605); 
					ORBOOL90_tree = (CommonTree)adaptor.create(ORBOOL90);
					root_0 = (CommonTree)adaptor.becomeRoot(ORBOOL90_tree, root_0);
					dbg.location(73,29);
					pushFollow(FOLLOW_binExpr3_in_binExpr2608);
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
		dbg.location(73, 38);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:75:1: binExpr3 : binExpr4 ( ANDBOOL ^ binExpr4 )* ;
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
		dbg.location(75, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:75:10: ( binExpr4 ( ANDBOOL ^ binExpr4 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:75:12: binExpr4 ( ANDBOOL ^ binExpr4 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(75,12);
			pushFollow(FOLLOW_binExpr4_in_binExpr3619);
			binExpr492=binExpr4();
			state._fsp--;

			adaptor.addChild(root_0, binExpr492.getTree());
			dbg.location(75,20);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:75:20: ( ANDBOOL ^ binExpr4 )*
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:75:21: ANDBOOL ^ binExpr4
					{
					dbg.location(75,28);
					ANDBOOL93=(Token)match(input,ANDBOOL,FOLLOW_ANDBOOL_in_binExpr3621); 
					ANDBOOL93_tree = (CommonTree)adaptor.create(ANDBOOL93);
					root_0 = (CommonTree)adaptor.becomeRoot(ANDBOOL93_tree, root_0);
					dbg.location(75,30);
					pushFollow(FOLLOW_binExpr4_in_binExpr3624);
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
		dbg.location(75, 39);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:77:1: binExpr4 : binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )* ;
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
		dbg.location(77, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:77:10: ( binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:77:12: binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(77,12);
			pushFollow(FOLLOW_binExpr5_in_binExpr4635);
			binExpr595=binExpr5();
			state._fsp--;

			adaptor.addChild(root_0, binExpr595.getTree());
			dbg.location(77,20);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:77:20: ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )*
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:77:21: ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5
					{
					dbg.location(77,21);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:77:21: ( PREV ^| OPBOOLEQ ^| NEXT ^)
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

							// /home/frosqh/workspace/raimondi3u/Grammar.g:77:22: PREV ^
							{
							dbg.location(77,26);
							PREV96=(Token)match(input,PREV,FOLLOW_PREV_in_binExpr4638); 
							PREV96_tree = (CommonTree)adaptor.create(PREV96);
							root_0 = (CommonTree)adaptor.becomeRoot(PREV96_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:77:28: OPBOOLEQ ^
							{
							dbg.location(77,36);
							OPBOOLEQ97=(Token)match(input,OPBOOLEQ,FOLLOW_OPBOOLEQ_in_binExpr4641); 
							OPBOOLEQ97_tree = (CommonTree)adaptor.create(OPBOOLEQ97);
							root_0 = (CommonTree)adaptor.becomeRoot(OPBOOLEQ97_tree, root_0);

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:77:38: NEXT ^
							{
							dbg.location(77,42);
							NEXT98=(Token)match(input,NEXT,FOLLOW_NEXT_in_binExpr4644); 
							NEXT98_tree = (CommonTree)adaptor.create(NEXT98);
							root_0 = (CommonTree)adaptor.becomeRoot(NEXT98_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(21);}
					dbg.location(77,45);
					pushFollow(FOLLOW_binExpr5_in_binExpr4648);
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
		dbg.location(77, 54);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:79:1: binExpr5 : binExpr6 ( ( ADD ^| SUB ^) binExpr6 )* ;
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
		dbg.location(79, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:79:10: ( binExpr6 ( ( ADD ^| SUB ^) binExpr6 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:79:12: binExpr6 ( ( ADD ^| SUB ^) binExpr6 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(79,12);
			pushFollow(FOLLOW_binExpr6_in_binExpr5659);
			binExpr6100=binExpr6();
			state._fsp--;

			adaptor.addChild(root_0, binExpr6100.getTree());
			dbg.location(79,20);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:79:20: ( ( ADD ^| SUB ^) binExpr6 )*
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:79:21: ( ADD ^| SUB ^) binExpr6
					{
					dbg.location(79,21);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:79:21: ( ADD ^| SUB ^)
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

							// /home/frosqh/workspace/raimondi3u/Grammar.g:79:22: ADD ^
							{
							dbg.location(79,25);
							ADD101=(Token)match(input,ADD,FOLLOW_ADD_in_binExpr5662); 
							ADD101_tree = (CommonTree)adaptor.create(ADD101);
							root_0 = (CommonTree)adaptor.becomeRoot(ADD101_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:79:27: SUB ^
							{
							dbg.location(79,30);
							SUB102=(Token)match(input,SUB,FOLLOW_SUB_in_binExpr5665); 
							SUB102_tree = (CommonTree)adaptor.create(SUB102);
							root_0 = (CommonTree)adaptor.becomeRoot(SUB102_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(23);}
					dbg.location(79,34);
					pushFollow(FOLLOW_binExpr6_in_binExpr5670);
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
		dbg.location(79, 43);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:81:1: binExpr6 : unExpr ( ( STAR ^| DIV ^) unExpr )* ;
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
		dbg.location(81, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:81:10: ( unExpr ( ( STAR ^| DIV ^) unExpr )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:81:12: unExpr ( ( STAR ^| DIV ^) unExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(81,12);
			pushFollow(FOLLOW_unExpr_in_binExpr6681);
			unExpr104=unExpr();
			state._fsp--;

			adaptor.addChild(root_0, unExpr104.getTree());
			dbg.location(81,19);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:81:19: ( ( STAR ^| DIV ^) unExpr )*
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:81:20: ( STAR ^| DIV ^) unExpr
					{
					dbg.location(81,20);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:81:20: ( STAR ^| DIV ^)
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

							// /home/frosqh/workspace/raimondi3u/Grammar.g:81:21: STAR ^
							{
							dbg.location(81,25);
							STAR105=(Token)match(input,STAR,FOLLOW_STAR_in_binExpr6685); 
							STAR105_tree = (CommonTree)adaptor.create(STAR105);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR105_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:81:27: DIV ^
							{
							dbg.location(81,30);
							DIV106=(Token)match(input,DIV,FOLLOW_DIV_in_binExpr6688); 
							DIV106_tree = (CommonTree)adaptor.create(DIV106);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV106_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(25);}
					dbg.location(81,33);
					pushFollow(FOLLOW_unExpr_in_binExpr6692);
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
		dbg.location(81, 40);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:83:1: vectExpr : starExpr ( '[' ^ expr ']' !)? ;
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
		dbg.location(83, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:83:10: ( starExpr ( '[' ^ expr ']' !)? )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:83:12: starExpr ( '[' ^ expr ']' !)?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(83,12);
			pushFollow(FOLLOW_starExpr_in_vectExpr703);
			starExpr108=starExpr();
			state._fsp--;

			adaptor.addChild(root_0, starExpr108.getTree());
			dbg.location(83,21);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:83:21: ( '[' ^ expr ']' !)?
			int alt27=2;
			try { dbg.enterSubRule(27);
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==36) ) {
				alt27=1;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:83:22: '[' ^ expr ']' !
					{
					dbg.location(83,25);
					char_literal109=(Token)match(input,36,FOLLOW_36_in_vectExpr706); 
					char_literal109_tree = (CommonTree)adaptor.create(char_literal109);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal109_tree, root_0);
					dbg.location(83,27);
					pushFollow(FOLLOW_expr_in_vectExpr709);
					expr110=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr110.getTree());
					dbg.location(83,35);
					char_literal111=(Token)match(input,37,FOLLOW_37_in_vectExpr711); 
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
		dbg.location(83, 37);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:85:1: starExpr : ( STAR ^)? moinsExpr ;
	public final GrammarParser.starExpr_return starExpr() throws RecognitionException {
		GrammarParser.starExpr_return retval = new GrammarParser.starExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR112=null;
		ParserRuleReturnScope moinsExpr113 =null;

		CommonTree STAR112_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "starExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(85, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:86:2: ( ( STAR ^)? moinsExpr )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:86:5: ( STAR ^)? moinsExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(86,9);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:86:9: ( STAR ^)?
			int alt28=2;
			try { dbg.enterSubRule(28);
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==STAR) ) {
				alt28=1;
			}
			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:86:9: STAR ^
					{
					dbg.location(86,9);
					STAR112=(Token)match(input,STAR,FOLLOW_STAR_in_starExpr725); 
					STAR112_tree = (CommonTree)adaptor.create(STAR112);
					root_0 = (CommonTree)adaptor.becomeRoot(STAR112_tree, root_0);

					}
					break;

			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(86,12);
			pushFollow(FOLLOW_moinsExpr_in_starExpr729);
			moinsExpr113=moinsExpr();
			state._fsp--;

			adaptor.addChild(root_0, moinsExpr113.getTree());

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
		dbg.location(86, 20);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:88:1: moinsExpr : ( SUB ^)? atom ;
	public final GrammarParser.moinsExpr_return moinsExpr() throws RecognitionException {
		GrammarParser.moinsExpr_return retval = new GrammarParser.moinsExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUB114=null;
		ParserRuleReturnScope atom115 =null;

		CommonTree SUB114_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "moinsExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(88, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:89:2: ( ( SUB ^)? atom )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:89:5: ( SUB ^)? atom
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(89,8);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:89:8: ( SUB ^)?
			int alt29=2;
			try { dbg.enterSubRule(29);
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			int LA29_0 = input.LA(1);
			if ( (LA29_0==SUB) ) {
				alt29=1;
			}
			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:89:8: SUB ^
					{
					dbg.location(89,8);
					SUB114=(Token)match(input,SUB,FOLLOW_SUB_in_moinsExpr741); 
					SUB114_tree = (CommonTree)adaptor.create(SUB114);
					root_0 = (CommonTree)adaptor.becomeRoot(SUB114_tree, root_0);

					}
					break;

			}
			} finally {dbg.exitSubRule(29);}
			dbg.location(89,10);
			pushFollow(FOLLOW_atom_in_moinsExpr744);
			atom115=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom115.getTree());

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
		dbg.location(89, 13);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:92:1: dotExpr : vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? ;
	public final GrammarParser.dotExpr_return dotExpr() throws RecognitionException {
		GrammarParser.dotExpr_return retval = new GrammarParser.dotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal117=null;
		Token IDF118=null;
		Token string_literal119=null;
		Token char_literal120=null;
		Token char_literal121=null;
		ParserRuleReturnScope vectExpr116 =null;

		CommonTree char_literal117_tree=null;
		CommonTree IDF118_tree=null;
		CommonTree string_literal119_tree=null;
		CommonTree char_literal120_tree=null;
		CommonTree char_literal121_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dotExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:92:9: ( vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:92:11: vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(92,11);
			pushFollow(FOLLOW_vectExpr_in_dotExpr753);
			vectExpr116=vectExpr();
			state._fsp--;

			adaptor.addChild(root_0, vectExpr116.getTree());
			dbg.location(92,20);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:92:20: ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			int alt31=2;
			try { dbg.enterSubRule(31);
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			int LA31_0 = input.LA(1);
			if ( (LA31_0==33) ) {
				alt31=1;
			}
			} finally {dbg.exitDecision(31);}

			switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:92:21: '.' ^ ( IDF | 'len' '(' ! ')' !)
					{
					dbg.location(92,24);
					char_literal117=(Token)match(input,33,FOLLOW_33_in_dotExpr756); 
					char_literal117_tree = (CommonTree)adaptor.create(char_literal117);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal117_tree, root_0);
					dbg.location(92,26);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:92:26: ( IDF | 'len' '(' ! ')' !)
					int alt30=2;
					try { dbg.enterSubRule(30);
					try { dbg.enterDecision(30, decisionCanBacktrack[30]);

					int LA30_0 = input.LA(1);
					if ( (LA30_0==IDF) ) {
						alt30=1;
					}
					else if ( (LA30_0==43) ) {
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

							// /home/frosqh/workspace/raimondi3u/Grammar.g:92:27: IDF
							{
							dbg.location(92,27);
							IDF118=(Token)match(input,IDF,FOLLOW_IDF_in_dotExpr760); 
							IDF118_tree = (CommonTree)adaptor.create(IDF118);
							adaptor.addChild(root_0, IDF118_tree);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:92:33: 'len' '(' ! ')' !
							{
							dbg.location(92,33);
							string_literal119=(Token)match(input,43,FOLLOW_43_in_dotExpr764); 
							string_literal119_tree = (CommonTree)adaptor.create(string_literal119);
							adaptor.addChild(root_0, string_literal119_tree);
							dbg.location(92,42);
							char_literal120=(Token)match(input,29,FOLLOW_29_in_dotExpr766); dbg.location(92,46);
							char_literal121=(Token)match(input,30,FOLLOW_30_in_dotExpr768); 
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
		dbg.location(92, 50);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:94:1: unExpr : ( UNAIRE ^| EPERLU ^)? dotExpr ;
	public final GrammarParser.unExpr_return unExpr() throws RecognitionException {
		GrammarParser.unExpr_return retval = new GrammarParser.unExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE122=null;
		Token EPERLU123=null;
		ParserRuleReturnScope dotExpr124 =null;

		CommonTree UNAIRE122_tree=null;
		CommonTree EPERLU123_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "unExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(94, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:94:8: ( ( UNAIRE ^| EPERLU ^)? dotExpr )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:94:10: ( UNAIRE ^| EPERLU ^)? dotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(94,10);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:94:10: ( UNAIRE ^| EPERLU ^)?
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:94:11: UNAIRE ^
					{
					dbg.location(94,17);
					UNAIRE122=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_unExpr782); 
					UNAIRE122_tree = (CommonTree)adaptor.create(UNAIRE122);
					root_0 = (CommonTree)adaptor.becomeRoot(UNAIRE122_tree, root_0);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:94:19: EPERLU ^
					{
					dbg.location(94,25);
					EPERLU123=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_unExpr785); 
					EPERLU123_tree = (CommonTree)adaptor.create(EPERLU123);
					root_0 = (CommonTree)adaptor.becomeRoot(EPERLU123_tree, root_0);

					}
					break;

			}
			} finally {dbg.exitSubRule(32);}
			dbg.location(94,29);
			pushFollow(FOLLOW_dotExpr_in_unExpr790);
			dotExpr124=dotExpr();
			state._fsp--;

			adaptor.addChild(root_0, dotExpr124.getTree());

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
		dbg.location(94, 35);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:96:1: atom : ( INT | BOOL | IDF ^ ( ( callFun ) )? | '(' expr ')' -> expr );
	public final GrammarParser.atom_return atom() throws RecognitionException {
		GrammarParser.atom_return retval = new GrammarParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT125=null;
		Token BOOL126=null;
		Token IDF127=null;
		Token char_literal129=null;
		Token char_literal131=null;
		ParserRuleReturnScope callFun128 =null;
		ParserRuleReturnScope expr130 =null;

		CommonTree INT125_tree=null;
		CommonTree BOOL126_tree=null;
		CommonTree IDF127_tree=null;
		CommonTree char_literal129_tree=null;
		CommonTree char_literal131_tree=null;
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(96, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:96:6: ( INT | BOOL | IDF ^ ( ( callFun ) )? | '(' expr ')' -> expr )
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
			case 29:
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:96:8: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(96,8);
					INT125=(Token)match(input,INT,FOLLOW_INT_in_atom798); 
					INT125_tree = (CommonTree)adaptor.create(INT125);
					adaptor.addChild(root_0, INT125_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:97:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(97,3);
					BOOL126=(Token)match(input,BOOL,FOLLOW_BOOL_in_atom801); 
					BOOL126_tree = (CommonTree)adaptor.create(BOOL126);
					adaptor.addChild(root_0, BOOL126_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:98:4: IDF ^ ( ( callFun ) )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(98,7);
					IDF127=(Token)match(input,IDF,FOLLOW_IDF_in_atom806); 
					IDF127_tree = (CommonTree)adaptor.create(IDF127);
					root_0 = (CommonTree)adaptor.becomeRoot(IDF127_tree, root_0);
					dbg.location(98,9);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:98:9: ( ( callFun ) )?
					int alt33=2;
					try { dbg.enterSubRule(33);
					try { dbg.enterDecision(33, decisionCanBacktrack[33]);

					int LA33_0 = input.LA(1);
					if ( (LA33_0==29) ) {
						alt33=1;
					}
					} finally {dbg.exitDecision(33);}

					switch (alt33) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:98:10: ( callFun )
							{
							dbg.location(98,10);
							// /home/frosqh/workspace/raimondi3u/Grammar.g:98:10: ( callFun )
							dbg.enterAlt(1);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:98:11: callFun
							{
							dbg.location(98,11);
							pushFollow(FOLLOW_callFun_in_atom811);
							callFun128=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun128.getTree());

							}

							}
							break;

					}
					} finally {dbg.exitSubRule(33);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:99:3: '(' expr ')'
					{
					dbg.location(99,3);
					char_literal129=(Token)match(input,29,FOLLOW_29_in_atom817);  
					stream_29.add(char_literal129);
					dbg.location(99,6);
					pushFollow(FOLLOW_expr_in_atom818);
					expr130=expr();
					state._fsp--;

					stream_expr.add(expr130.getTree());dbg.location(99,10);
					char_literal131=(Token)match(input,30,FOLLOW_30_in_atom819);  
					stream_30.add(char_literal131);

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
					// 99:13: -> expr
					{
						dbg.location(99,16);
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
		dbg.location(99, 19);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:101:1: expr : ( 'vec' '!' '[' expr ']' -> ^( 'vec' expr ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | binExpr1 );
	public final GrammarParser.expr_return expr() throws RecognitionException {
		GrammarParser.expr_return retval = new GrammarParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal132=null;
		Token char_literal133=null;
		Token char_literal134=null;
		Token char_literal136=null;
		Token string_literal137=null;
		Token char_literal138=null;
		Token char_literal139=null;
		Token char_literal141=null;
		ParserRuleReturnScope expr135 =null;
		ParserRuleReturnScope expr140 =null;
		ParserRuleReturnScope block142 =null;
		ParserRuleReturnScope binExpr1143 =null;

		CommonTree string_literal132_tree=null;
		CommonTree char_literal133_tree=null;
		CommonTree char_literal134_tree=null;
		CommonTree char_literal136_tree=null;
		CommonTree string_literal137_tree=null;
		CommonTree char_literal138_tree=null;
		CommonTree char_literal139_tree=null;
		CommonTree char_literal141_tree=null;
		RewriteRuleTokenStream stream_UNAIRE=new RewriteRuleTokenStream(adaptor,"token UNAIRE");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(101, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:101:6: ( 'vec' '!' '[' expr ']' -> ^( 'vec' expr ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | binExpr1 )
			int alt35=4;
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			switch ( input.LA(1) ) {
			case 50:
				{
				alt35=1;
				}
				break;
			case 47:
				{
				alt35=2;
				}
				break;
			case 52:
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
			case 29:
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:101:8: 'vec' '!' '[' expr ']'
					{
					dbg.location(101,8);
					string_literal132=(Token)match(input,50,FOLLOW_50_in_expr831);  
					stream_50.add(string_literal132);
					dbg.location(101,14);
					char_literal133=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr833);  
					stream_UNAIRE.add(char_literal133);
					dbg.location(101,18);
					char_literal134=(Token)match(input,36,FOLLOW_36_in_expr835);  
					stream_36.add(char_literal134);
					dbg.location(101,22);
					pushFollow(FOLLOW_expr_in_expr837);
					expr135=expr();
					state._fsp--;

					stream_expr.add(expr135.getTree());dbg.location(101,27);
					char_literal136=(Token)match(input,37,FOLLOW_37_in_expr839);  
					stream_37.add(char_literal136);

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
					// 101:31: -> ^( 'vec' expr )
					{
						dbg.location(101,34);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:101:34: ^( 'vec' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(101,36);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_50.nextNode(), root_1);
						dbg.location(101,42);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:102:3: 'print' '!' '(' expr ')'
					{
					dbg.location(102,3);
					string_literal137=(Token)match(input,47,FOLLOW_47_in_expr851);  
					stream_47.add(string_literal137);
					dbg.location(102,11);
					char_literal138=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr853);  
					stream_UNAIRE.add(char_literal138);
					dbg.location(102,15);
					char_literal139=(Token)match(input,29,FOLLOW_29_in_expr855);  
					stream_29.add(char_literal139);
					dbg.location(102,19);
					pushFollow(FOLLOW_expr_in_expr857);
					expr140=expr();
					state._fsp--;

					stream_expr.add(expr140.getTree());dbg.location(102,24);
					char_literal141=(Token)match(input,30,FOLLOW_30_in_expr859);  
					stream_30.add(char_literal141);

					// AST REWRITE
					// elements: 47, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 102:28: -> ^( 'print' expr )
					{
						dbg.location(102,31);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:102:31: ^( 'print' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(102,33);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_47.nextNode(), root_1);
						dbg.location(102,41);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:103:3: block
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(103,3);
					pushFollow(FOLLOW_block_in_expr870);
					block142=block();
					state._fsp--;

					adaptor.addChild(root_0, block142.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:104:3: binExpr1
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(104,3);
					pushFollow(FOLLOW_binExpr1_in_expr874);
					binExpr1143=binExpr1();
					state._fsp--;

					adaptor.addChild(root_0, binExpr1143.getTree());

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
		dbg.location(104, 10);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:107:1: bigbinExpr1 : bigbinExpr2 ( EQUAL ^ bigbinExpr2 )* ;
	public final GrammarParser.bigbinExpr1_return bigbinExpr1() throws RecognitionException {
		GrammarParser.bigbinExpr1_return retval = new GrammarParser.bigbinExpr1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL145=null;
		ParserRuleReturnScope bigbinExpr2144 =null;
		ParserRuleReturnScope bigbinExpr2146 =null;

		CommonTree EQUAL145_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:107:13: ( bigbinExpr2 ( EQUAL ^ bigbinExpr2 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:107:15: bigbinExpr2 ( EQUAL ^ bigbinExpr2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(107,15);
			pushFollow(FOLLOW_bigbinExpr2_in_bigbinExpr1883);
			bigbinExpr2144=bigbinExpr2();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr2144.getTree());
			dbg.location(107,27);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:107:27: ( EQUAL ^ bigbinExpr2 )*
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:107:28: EQUAL ^ bigbinExpr2
					{
					dbg.location(107,33);
					EQUAL145=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_bigbinExpr1886); 
					EQUAL145_tree = (CommonTree)adaptor.create(EQUAL145);
					root_0 = (CommonTree)adaptor.becomeRoot(EQUAL145_tree, root_0);
					dbg.location(107,35);
					pushFollow(FOLLOW_bigbinExpr2_in_bigbinExpr1889);
					bigbinExpr2146=bigbinExpr2();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr2146.getTree());

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
		dbg.location(107, 47);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:109:1: bigbinExpr2 : bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )* ;
	public final GrammarParser.bigbinExpr2_return bigbinExpr2() throws RecognitionException {
		GrammarParser.bigbinExpr2_return retval = new GrammarParser.bigbinExpr2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ORBOOL148=null;
		ParserRuleReturnScope bigbinExpr3147 =null;
		ParserRuleReturnScope bigbinExpr3149 =null;

		CommonTree ORBOOL148_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(109, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:109:13: ( bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:109:15: bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(109,15);
			pushFollow(FOLLOW_bigbinExpr3_in_bigbinExpr2900);
			bigbinExpr3147=bigbinExpr3();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr3147.getTree());
			dbg.location(109,26);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:109:26: ( ORBOOL ^ bigbinExpr3 )*
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:109:27: ORBOOL ^ bigbinExpr3
					{
					dbg.location(109,33);
					ORBOOL148=(Token)match(input,ORBOOL,FOLLOW_ORBOOL_in_bigbinExpr2902); 
					ORBOOL148_tree = (CommonTree)adaptor.create(ORBOOL148);
					root_0 = (CommonTree)adaptor.becomeRoot(ORBOOL148_tree, root_0);
					dbg.location(109,35);
					pushFollow(FOLLOW_bigbinExpr3_in_bigbinExpr2905);
					bigbinExpr3149=bigbinExpr3();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr3149.getTree());

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
		dbg.location(109, 47);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:111:1: bigbinExpr3 : bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )* ;
	public final GrammarParser.bigbinExpr3_return bigbinExpr3() throws RecognitionException {
		GrammarParser.bigbinExpr3_return retval = new GrammarParser.bigbinExpr3_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANDBOOL151=null;
		ParserRuleReturnScope bigbinExpr4150 =null;
		ParserRuleReturnScope bigbinExpr4152 =null;

		CommonTree ANDBOOL151_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr3");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(111, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:111:13: ( bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:111:15: bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(111,15);
			pushFollow(FOLLOW_bigbinExpr4_in_bigbinExpr3916);
			bigbinExpr4150=bigbinExpr4();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr4150.getTree());
			dbg.location(111,26);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:111:26: ( ANDBOOL ^ bigbinExpr4 )*
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:111:27: ANDBOOL ^ bigbinExpr4
					{
					dbg.location(111,34);
					ANDBOOL151=(Token)match(input,ANDBOOL,FOLLOW_ANDBOOL_in_bigbinExpr3918); 
					ANDBOOL151_tree = (CommonTree)adaptor.create(ANDBOOL151);
					root_0 = (CommonTree)adaptor.becomeRoot(ANDBOOL151_tree, root_0);
					dbg.location(111,36);
					pushFollow(FOLLOW_bigbinExpr4_in_bigbinExpr3921);
					bigbinExpr4152=bigbinExpr4();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr4152.getTree());

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
		dbg.location(111, 48);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:113:1: bigbinExpr4 : bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )* ;
	public final GrammarParser.bigbinExpr4_return bigbinExpr4() throws RecognitionException {
		GrammarParser.bigbinExpr4_return retval = new GrammarParser.bigbinExpr4_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PREV154=null;
		Token OPBOOLEQ155=null;
		Token NEXT156=null;
		ParserRuleReturnScope bigbinExpr5153 =null;
		ParserRuleReturnScope bigbinExpr5157 =null;

		CommonTree PREV154_tree=null;
		CommonTree OPBOOLEQ155_tree=null;
		CommonTree NEXT156_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr4");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:113:13: ( bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:113:15: bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(113,15);
			pushFollow(FOLLOW_bigbinExpr5_in_bigbinExpr4932);
			bigbinExpr5153=bigbinExpr5();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr5153.getTree());
			dbg.location(113,26);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:113:26: ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )*
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:113:27: ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5
					{
					dbg.location(113,27);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:113:27: ( PREV ^| OPBOOLEQ ^| NEXT ^)
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

							// /home/frosqh/workspace/raimondi3u/Grammar.g:113:28: PREV ^
							{
							dbg.location(113,32);
							PREV154=(Token)match(input,PREV,FOLLOW_PREV_in_bigbinExpr4935); 
							PREV154_tree = (CommonTree)adaptor.create(PREV154);
							root_0 = (CommonTree)adaptor.becomeRoot(PREV154_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:113:34: OPBOOLEQ ^
							{
							dbg.location(113,42);
							OPBOOLEQ155=(Token)match(input,OPBOOLEQ,FOLLOW_OPBOOLEQ_in_bigbinExpr4938); 
							OPBOOLEQ155_tree = (CommonTree)adaptor.create(OPBOOLEQ155);
							root_0 = (CommonTree)adaptor.becomeRoot(OPBOOLEQ155_tree, root_0);

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:113:44: NEXT ^
							{
							dbg.location(113,48);
							NEXT156=(Token)match(input,NEXT,FOLLOW_NEXT_in_bigbinExpr4941); 
							NEXT156_tree = (CommonTree)adaptor.create(NEXT156);
							root_0 = (CommonTree)adaptor.becomeRoot(NEXT156_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(39);}
					dbg.location(113,51);
					pushFollow(FOLLOW_bigbinExpr5_in_bigbinExpr4945);
					bigbinExpr5157=bigbinExpr5();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr5157.getTree());

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
		dbg.location(113, 63);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:115:1: bigbinExpr5 : bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )* ;
	public final GrammarParser.bigbinExpr5_return bigbinExpr5() throws RecognitionException {
		GrammarParser.bigbinExpr5_return retval = new GrammarParser.bigbinExpr5_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set159=null;
		ParserRuleReturnScope bigbinExpr6158 =null;
		ParserRuleReturnScope bigbinExpr6160 =null;

		CommonTree set159_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr5");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(115, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:115:13: ( bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:115:15: bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(115,15);
			pushFollow(FOLLOW_bigbinExpr6_in_bigbinExpr5956);
			bigbinExpr6158=bigbinExpr6();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr6158.getTree());
			dbg.location(115,26);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:115:26: ( ( ADD | SUB ) ^ bigbinExpr6 )*
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:115:27: ( ADD | SUB ) ^ bigbinExpr6
					{
					dbg.location(115,36);
					set159=input.LT(1);
					set159=input.LT(1);
					if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set159), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(115,38);
					pushFollow(FOLLOW_bigbinExpr6_in_bigbinExpr5965);
					bigbinExpr6160=bigbinExpr6();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr6160.getTree());

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
		dbg.location(115, 50);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:117:1: bigbinExpr6 : bigunExpr ( ( STAR ^| DIV ^) bigunExpr )* ;
	public final GrammarParser.bigbinExpr6_return bigbinExpr6() throws RecognitionException {
		GrammarParser.bigbinExpr6_return retval = new GrammarParser.bigbinExpr6_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR162=null;
		Token DIV163=null;
		ParserRuleReturnScope bigunExpr161 =null;
		ParserRuleReturnScope bigunExpr164 =null;

		CommonTree STAR162_tree=null;
		CommonTree DIV163_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr6");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:117:13: ( bigunExpr ( ( STAR ^| DIV ^) bigunExpr )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:117:15: bigunExpr ( ( STAR ^| DIV ^) bigunExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(117,15);
			pushFollow(FOLLOW_bigunExpr_in_bigbinExpr6976);
			bigunExpr161=bigunExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigunExpr161.getTree());
			dbg.location(117,25);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:117:25: ( ( STAR ^| DIV ^) bigunExpr )*
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:117:26: ( STAR ^| DIV ^) bigunExpr
					{
					dbg.location(117,26);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:117:26: ( STAR ^| DIV ^)
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

							// /home/frosqh/workspace/raimondi3u/Grammar.g:117:27: STAR ^
							{
							dbg.location(117,31);
							STAR162=(Token)match(input,STAR,FOLLOW_STAR_in_bigbinExpr6980); 
							STAR162_tree = (CommonTree)adaptor.create(STAR162);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR162_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:117:33: DIV ^
							{
							dbg.location(117,36);
							DIV163=(Token)match(input,DIV,FOLLOW_DIV_in_bigbinExpr6983); 
							DIV163_tree = (CommonTree)adaptor.create(DIV163);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV163_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(42);}
					dbg.location(117,39);
					pushFollow(FOLLOW_bigunExpr_in_bigbinExpr6987);
					bigunExpr164=bigunExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigunExpr164.getTree());

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
		dbg.location(117, 49);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:119:1: bigvectExpr : bigatom ( '[' bigExpr ']' )? ;
	public final GrammarParser.bigvectExpr_return bigvectExpr() throws RecognitionException {
		GrammarParser.bigvectExpr_return retval = new GrammarParser.bigvectExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal166=null;
		Token char_literal168=null;
		ParserRuleReturnScope bigatom165 =null;
		ParserRuleReturnScope bigExpr167 =null;

		CommonTree char_literal166_tree=null;
		CommonTree char_literal168_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigvectExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(119, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:119:13: ( bigatom ( '[' bigExpr ']' )? )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:119:15: bigatom ( '[' bigExpr ']' )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(119,15);
			pushFollow(FOLLOW_bigatom_in_bigvectExpr998);
			bigatom165=bigatom();
			state._fsp--;

			adaptor.addChild(root_0, bigatom165.getTree());
			dbg.location(119,23);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:119:23: ( '[' bigExpr ']' )?
			int alt44=2;
			try { dbg.enterSubRule(44);
			try { dbg.enterDecision(44, decisionCanBacktrack[44]);

			int LA44_0 = input.LA(1);
			if ( (LA44_0==36) ) {
				alt44=1;
			}
			} finally {dbg.exitDecision(44);}

			switch (alt44) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:119:24: '[' bigExpr ']'
					{
					dbg.location(119,24);
					char_literal166=(Token)match(input,36,FOLLOW_36_in_bigvectExpr1001); 
					char_literal166_tree = (CommonTree)adaptor.create(char_literal166);
					adaptor.addChild(root_0, char_literal166_tree);
					dbg.location(119,28);
					pushFollow(FOLLOW_bigExpr_in_bigvectExpr1003);
					bigExpr167=bigExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigExpr167.getTree());
					dbg.location(119,36);
					char_literal168=(Token)match(input,37,FOLLOW_37_in_bigvectExpr1005); 
					char_literal168_tree = (CommonTree)adaptor.create(char_literal168);
					adaptor.addChild(root_0, char_literal168_tree);

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
		dbg.location(119, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigvectExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigvectExpr"


	public static class bigdotExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigdotExpr"
	// /home/frosqh/workspace/raimondi3u/Grammar.g:121:1: bigdotExpr : bigvectExpr ( '.' ^ ( IDF | 'len' '(' ')' ) )? ;
	public final GrammarParser.bigdotExpr_return bigdotExpr() throws RecognitionException {
		GrammarParser.bigdotExpr_return retval = new GrammarParser.bigdotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal170=null;
		Token IDF171=null;
		Token string_literal172=null;
		Token char_literal173=null;
		Token char_literal174=null;
		ParserRuleReturnScope bigvectExpr169 =null;

		CommonTree char_literal170_tree=null;
		CommonTree IDF171_tree=null;
		CommonTree string_literal172_tree=null;
		CommonTree char_literal173_tree=null;
		CommonTree char_literal174_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigdotExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:121:12: ( bigvectExpr ( '.' ^ ( IDF | 'len' '(' ')' ) )? )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:121:14: bigvectExpr ( '.' ^ ( IDF | 'len' '(' ')' ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(121,14);
			pushFollow(FOLLOW_bigvectExpr_in_bigdotExpr1015);
			bigvectExpr169=bigvectExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigvectExpr169.getTree());
			dbg.location(121,26);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:121:26: ( '.' ^ ( IDF | 'len' '(' ')' ) )?
			int alt46=2;
			try { dbg.enterSubRule(46);
			try { dbg.enterDecision(46, decisionCanBacktrack[46]);

			int LA46_0 = input.LA(1);
			if ( (LA46_0==33) ) {
				alt46=1;
			}
			} finally {dbg.exitDecision(46);}

			switch (alt46) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:121:27: '.' ^ ( IDF | 'len' '(' ')' )
					{
					dbg.location(121,30);
					char_literal170=(Token)match(input,33,FOLLOW_33_in_bigdotExpr1018); 
					char_literal170_tree = (CommonTree)adaptor.create(char_literal170);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal170_tree, root_0);
					dbg.location(121,32);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:121:32: ( IDF | 'len' '(' ')' )
					int alt45=2;
					try { dbg.enterSubRule(45);
					try { dbg.enterDecision(45, decisionCanBacktrack[45]);

					int LA45_0 = input.LA(1);
					if ( (LA45_0==IDF) ) {
						alt45=1;
					}
					else if ( (LA45_0==43) ) {
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

							// /home/frosqh/workspace/raimondi3u/Grammar.g:121:33: IDF
							{
							dbg.location(121,33);
							IDF171=(Token)match(input,IDF,FOLLOW_IDF_in_bigdotExpr1022); 
							IDF171_tree = (CommonTree)adaptor.create(IDF171);
							adaptor.addChild(root_0, IDF171_tree);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:121:39: 'len' '(' ')'
							{
							dbg.location(121,39);
							string_literal172=(Token)match(input,43,FOLLOW_43_in_bigdotExpr1026); 
							string_literal172_tree = (CommonTree)adaptor.create(string_literal172);
							adaptor.addChild(root_0, string_literal172_tree);
							dbg.location(121,45);
							char_literal173=(Token)match(input,29,FOLLOW_29_in_bigdotExpr1028); 
							char_literal173_tree = (CommonTree)adaptor.create(char_literal173);
							adaptor.addChild(root_0, char_literal173_tree);
							dbg.location(121,48);
							char_literal174=(Token)match(input,30,FOLLOW_30_in_bigdotExpr1029); 
							char_literal174_tree = (CommonTree)adaptor.create(char_literal174);
							adaptor.addChild(root_0, char_literal174_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(45);}

					}
					break;

			}
			} finally {dbg.exitSubRule(46);}

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
		dbg.location(121, 53);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:123:1: bigunExpr : ( UNAIRE ^)? bigdotExpr ;
	public final GrammarParser.bigunExpr_return bigunExpr() throws RecognitionException {
		GrammarParser.bigunExpr_return retval = new GrammarParser.bigunExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE175=null;
		ParserRuleReturnScope bigdotExpr176 =null;

		CommonTree UNAIRE175_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigunExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(123, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:123:11: ( ( UNAIRE ^)? bigdotExpr )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/raimondi3u/Grammar.g:123:13: ( UNAIRE ^)? bigdotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(123,19);
			// /home/frosqh/workspace/raimondi3u/Grammar.g:123:19: ( UNAIRE ^)?
			int alt47=2;
			try { dbg.enterSubRule(47);
			try { dbg.enterDecision(47, decisionCanBacktrack[47]);

			int LA47_0 = input.LA(1);
			if ( (LA47_0==UNAIRE) ) {
				alt47=1;
			}
			} finally {dbg.exitDecision(47);}

			switch (alt47) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:123:19: UNAIRE ^
					{
					dbg.location(123,19);
					UNAIRE175=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigunExpr1040); 
					UNAIRE175_tree = (CommonTree)adaptor.create(UNAIRE175);
					root_0 = (CommonTree)adaptor.becomeRoot(UNAIRE175_tree, root_0);

					}
					break;

			}
			} finally {dbg.exitSubRule(47);}
			dbg.location(123,22);
			pushFollow(FOLLOW_bigdotExpr_in_bigunExpr1044);
			bigdotExpr176=bigdotExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigdotExpr176.getTree());

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
		dbg.location(123, 31);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:125:1: bigExpr : ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | bigbinExpr1 );
	public final GrammarParser.bigExpr_return bigExpr() throws RecognitionException {
		GrammarParser.bigExpr_return retval = new GrammarParser.bigExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal177=null;
		Token char_literal178=null;
		Token char_literal179=null;
		Token char_literal181=null;
		Token char_literal183=null;
		Token string_literal184=null;
		Token char_literal185=null;
		Token char_literal186=null;
		Token char_literal188=null;
		ParserRuleReturnScope expr180 =null;
		ParserRuleReturnScope expr182 =null;
		ParserRuleReturnScope expr187 =null;
		ParserRuleReturnScope block189 =null;
		ParserRuleReturnScope bigbinExpr1190 =null;

		CommonTree string_literal177_tree=null;
		CommonTree char_literal178_tree=null;
		CommonTree char_literal179_tree=null;
		CommonTree char_literal181_tree=null;
		CommonTree char_literal183_tree=null;
		CommonTree string_literal184_tree=null;
		CommonTree char_literal185_tree=null;
		CommonTree char_literal186_tree=null;
		CommonTree char_literal188_tree=null;
		RewriteRuleTokenStream stream_UNAIRE=new RewriteRuleTokenStream(adaptor,"token UNAIRE");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "bigExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:126:3: ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | bigbinExpr1 )
			int alt49=4;
			try { dbg.enterDecision(49, decisionCanBacktrack[49]);

			switch ( input.LA(1) ) {
			case 50:
				{
				alt49=1;
				}
				break;
			case 47:
				{
				alt49=2;
				}
				break;
			case 52:
				{
				alt49=3;
				}
				break;
			case BOOL:
			case IDF:
			case INT:
			case UNAIRE:
			case 29:
				{
				alt49=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(49);}

			switch (alt49) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:126:3: 'vec' '!' '[' expr ( ',' expr )* ']'
					{
					dbg.location(126,3);
					string_literal177=(Token)match(input,50,FOLLOW_50_in_bigExpr1053);  
					stream_50.add(string_literal177);
					dbg.location(126,9);
					char_literal178=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1055);  
					stream_UNAIRE.add(char_literal178);
					dbg.location(126,13);
					char_literal179=(Token)match(input,36,FOLLOW_36_in_bigExpr1057);  
					stream_36.add(char_literal179);
					dbg.location(126,17);
					pushFollow(FOLLOW_expr_in_bigExpr1059);
					expr180=expr();
					state._fsp--;

					stream_expr.add(expr180.getTree());dbg.location(126,22);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:126:22: ( ',' expr )*
					try { dbg.enterSubRule(48);

					loop48:
					while (true) {
						int alt48=2;
						try { dbg.enterDecision(48, decisionCanBacktrack[48]);

						int LA48_0 = input.LA(1);
						if ( (LA48_0==31) ) {
							alt48=1;
						}

						} finally {dbg.exitDecision(48);}

						switch (alt48) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:126:23: ',' expr
							{
							dbg.location(126,23);
							char_literal181=(Token)match(input,31,FOLLOW_31_in_bigExpr1062);  
							stream_31.add(char_literal181);
							dbg.location(126,27);
							pushFollow(FOLLOW_expr_in_bigExpr1064);
							expr182=expr();
							state._fsp--;

							stream_expr.add(expr182.getTree());
							}
							break;

						default :
							break loop48;
						}
					}
					} finally {dbg.exitSubRule(48);}
					dbg.location(126,33);
					char_literal183=(Token)match(input,37,FOLLOW_37_in_bigExpr1067);  
					stream_37.add(char_literal183);

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
					// 126:37: -> ^( 'vec' ( expr )* )
					{
						dbg.location(126,40);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:126:40: ^( 'vec' ( expr )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(126,42);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_50.nextNode(), root_1);
						dbg.location(126,48);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:126:48: ( expr )*
						while ( stream_expr.hasNext() ) {
							dbg.location(126,48);
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:127:3: 'print' '!' '(' expr ')'
					{
					dbg.location(127,3);
					string_literal184=(Token)match(input,47,FOLLOW_47_in_bigExpr1080);  
					stream_47.add(string_literal184);
					dbg.location(127,11);
					char_literal185=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1082);  
					stream_UNAIRE.add(char_literal185);
					dbg.location(127,15);
					char_literal186=(Token)match(input,29,FOLLOW_29_in_bigExpr1084);  
					stream_29.add(char_literal186);
					dbg.location(127,19);
					pushFollow(FOLLOW_expr_in_bigExpr1086);
					expr187=expr();
					state._fsp--;

					stream_expr.add(expr187.getTree());dbg.location(127,24);
					char_literal188=(Token)match(input,30,FOLLOW_30_in_bigExpr1088);  
					stream_30.add(char_literal188);

					// AST REWRITE
					// elements: 47, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 127:28: -> ^( 'print' expr )
					{
						dbg.location(127,31);
						// /home/frosqh/workspace/raimondi3u/Grammar.g:127:31: ^( 'print' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(127,33);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_47.nextNode(), root_1);
						dbg.location(127,41);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:128:3: block
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(128,3);
					pushFollow(FOLLOW_block_in_bigExpr1099);
					block189=block();
					state._fsp--;

					adaptor.addChild(root_0, block189.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:129:3: bigbinExpr1
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(129,3);
					pushFollow(FOLLOW_bigbinExpr1_in_bigExpr1103);
					bigbinExpr1190=bigbinExpr1();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr1190.getTree());

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
		dbg.location(129, 13);

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
	// /home/frosqh/workspace/raimondi3u/Grammar.g:131:1: bigatom : ( INT | BOOL | IDF ^ ( newStruc | callFun )? | '(' bigExpr ')' -> bigExpr );
	public final GrammarParser.bigatom_return bigatom() throws RecognitionException {
		GrammarParser.bigatom_return retval = new GrammarParser.bigatom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT191=null;
		Token BOOL192=null;
		Token IDF193=null;
		Token char_literal196=null;
		Token char_literal198=null;
		ParserRuleReturnScope newStruc194 =null;
		ParserRuleReturnScope callFun195 =null;
		ParserRuleReturnScope bigExpr197 =null;

		CommonTree INT191_tree=null;
		CommonTree BOOL192_tree=null;
		CommonTree IDF193_tree=null;
		CommonTree char_literal196_tree=null;
		CommonTree char_literal198_tree=null;
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");

		try { dbg.enterRule(getGrammarFileName(), "bigatom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(131, 0);

		try {
			// /home/frosqh/workspace/raimondi3u/Grammar.g:131:9: ( INT | BOOL | IDF ^ ( newStruc | callFun )? | '(' bigExpr ')' -> bigExpr )
			int alt51=4;
			try { dbg.enterDecision(51, decisionCanBacktrack[51]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt51=1;
				}
				break;
			case BOOL:
				{
				alt51=2;
				}
				break;
			case IDF:
				{
				alt51=3;
				}
				break;
			case 29:
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

					// /home/frosqh/workspace/raimondi3u/Grammar.g:131:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(131,11);
					INT191=(Token)match(input,INT,FOLLOW_INT_in_bigatom1111); 
					INT191_tree = (CommonTree)adaptor.create(INT191);
					adaptor.addChild(root_0, INT191_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:132:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(132,3);
					BOOL192=(Token)match(input,BOOL,FOLLOW_BOOL_in_bigatom1114); 
					BOOL192_tree = (CommonTree)adaptor.create(BOOL192);
					adaptor.addChild(root_0, BOOL192_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:133:4: IDF ^ ( newStruc | callFun )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(133,7);
					IDF193=(Token)match(input,IDF,FOLLOW_IDF_in_bigatom1119); 
					IDF193_tree = (CommonTree)adaptor.create(IDF193);
					root_0 = (CommonTree)adaptor.becomeRoot(IDF193_tree, root_0);
					dbg.location(133,9);
					// /home/frosqh/workspace/raimondi3u/Grammar.g:133:9: ( newStruc | callFun )?
					int alt50=3;
					try { dbg.enterSubRule(50);
					try { dbg.enterDecision(50, decisionCanBacktrack[50]);

					int LA50_0 = input.LA(1);
					if ( (LA50_0==52) ) {
						alt50=1;
					}
					else if ( (LA50_0==29) ) {
						alt50=2;
					}
					} finally {dbg.exitDecision(50);}

					switch (alt50) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:133:10: newStruc
							{
							dbg.location(133,10);
							pushFollow(FOLLOW_newStruc_in_bigatom1123);
							newStruc194=newStruc();
							state._fsp--;

							adaptor.addChild(root_0, newStruc194.getTree());

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/raimondi3u/Grammar.g:133:19: callFun
							{
							dbg.location(133,19);
							pushFollow(FOLLOW_callFun_in_bigatom1125);
							callFun195=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun195.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(50);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/frosqh/workspace/raimondi3u/Grammar.g:134:3: '(' bigExpr ')'
					{
					dbg.location(134,3);
					char_literal196=(Token)match(input,29,FOLLOW_29_in_bigatom1130);  
					stream_29.add(char_literal196);
					dbg.location(134,6);
					pushFollow(FOLLOW_bigExpr_in_bigatom1131);
					bigExpr197=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr197.getTree());dbg.location(134,13);
					char_literal198=(Token)match(input,30,FOLLOW_30_in_bigatom1132);  
					stream_30.add(char_literal198);

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
					// 134:17: -> bigExpr
					{
						dbg.location(134,20);
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
		dbg.location(134, 26);

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



	public static final BitSet FOLLOW_fichier_in_axiom78 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_axiom80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_fichier96 = new BitSet(new long[]{0x0002020000000002L});
	public static final BitSet FOLLOW_declFun_in_decl107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declStruct_in_decl111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_declStruct120 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_declStruct122 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_declStruct124 = new BitSet(new long[]{0x0020000000004000L});
	public static final BitSet FOLLOW_args_in_declStruct126 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_declStruct129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_args150 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_args152 = new BitSet(new long[]{0x0004044080005000L});
	public static final BitSet FOLLOW_type_in_args154 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_args157 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_args159 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_args161 = new BitSet(new long[]{0x0004044080005000L});
	public static final BitSet FOLLOW_type_in_args163 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_41_in_declFun185 = new BitSet(new long[]{0x0000000000024000L});
	public static final BitSet FOLLOW_IDF_in_declFun188 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declFun190 = new BitSet(new long[]{0x0000000040004000L});
	public static final BitSet FOLLOW_args_in_declFun192 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_declFun195 = new BitSet(new long[]{0x0010000100000000L});
	public static final BitSet FOLLOW_32_in_declFun198 = new BitSet(new long[]{0x0014044000005000L});
	public static final BitSet FOLLOW_type_in_declFun200 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_block_in_declFun204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_declFun230 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declFun232 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_declFun234 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_block_in_declFun236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_type258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_type262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_type265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_type270 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_PREV_in_type273 = new BitSet(new long[]{0x0004044000085000L});
	public static final BitSet FOLLOW_type_in_type275 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NEXT_in_type277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EPERLU_in_type291 = new BitSet(new long[]{0x0004044000005000L});
	public static final BitSet FOLLOW_type_in_type293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_block310 = new BitSet(new long[]{0x003DB0882681D100L});
	public static final BitSet FOLLOW_instruct_in_block312 = new BitSet(new long[]{0x003DB0882681D100L});
	public static final BitSet FOLLOW_53_in_block315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_callFun334 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_callFun336 = new BitSet(new long[]{0x00000000C0000000L});
	public static final BitSet FOLLOW_31_in_callFun339 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_callFun341 = new BitSet(new long[]{0x00000000C0000000L});
	public static final BitSet FOLLOW_30_in_callFun345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_newStruc358 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_newStruc360 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_newStruc362 = new BitSet(new long[]{0x0014800024014100L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc364 = new BitSet(new long[]{0x0020000080000000L});
	public static final BitSet FOLLOW_31_in_newStruc367 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_newStruc369 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_newStruc371 = new BitSet(new long[]{0x0014800024014100L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc373 = new BitSet(new long[]{0x0020000080000000L});
	public static final BitSet FOLLOW_53_in_newStruc377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_instruct401 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruct403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_instruct411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_instruct417 = new BitSet(new long[]{0x0000400000004000L});
	public static final BitSet FOLLOW_46_in_instruct419 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_dotIDF_in_instruct422 = new BitSet(new long[]{0x0000000400002000L});
	public static final BitSet FOLLOW_34_in_instruct425 = new BitSet(new long[]{0x0004044000007000L});
	public static final BitSet FOLLOW_type_in_instruct427 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_instruct431 = new BitSet(new long[]{0x0014800024014100L});
	public static final BitSet FOLLOW_bigExpr_in_instruct433 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruct435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_instruct462 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_instruct464 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_block_in_instruct466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_instruct480 = new BitSet(new long[]{0x0014800826815100L});
	public static final BitSet FOLLOW_expr_in_instruct482 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruct485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_instruct498 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_block_in_instruct500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_instruct512 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruct514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpr_in_instruct522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_dotIDF533 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_dotIDF536 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_dotIDF539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifExpr549 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_ifExpr551 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr553 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_ifExpr556 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr2_in_binExpr1586 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_EQUAL_in_binExpr1589 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_binExpr2_in_binExpr1592 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_binExpr3_in_binExpr2603 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_ORBOOL_in_binExpr2605 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_binExpr3_in_binExpr2608 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_binExpr4_in_binExpr3619 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ANDBOOL_in_binExpr3621 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_binExpr4_in_binExpr3624 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_binExpr5_in_binExpr4635 = new BitSet(new long[]{0x0000000000580002L});
	public static final BitSet FOLLOW_PREV_in_binExpr4638 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_OPBOOLEQ_in_binExpr4641 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_NEXT_in_binExpr4644 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_binExpr5_in_binExpr4648 = new BitSet(new long[]{0x0000000000580002L});
	public static final BitSet FOLLOW_binExpr6_in_binExpr5659 = new BitSet(new long[]{0x0000000002000012L});
	public static final BitSet FOLLOW_ADD_in_binExpr5662 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_SUB_in_binExpr5665 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_binExpr6_in_binExpr5670 = new BitSet(new long[]{0x0000000002000012L});
	public static final BitSet FOLLOW_unExpr_in_binExpr6681 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_STAR_in_binExpr6685 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_DIV_in_binExpr6688 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_unExpr_in_binExpr6692 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_starExpr_in_vectExpr703 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_vectExpr706 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_vectExpr709 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_vectExpr711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_starExpr725 = new BitSet(new long[]{0x0000000022014100L});
	public static final BitSet FOLLOW_moinsExpr_in_starExpr729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_moinsExpr741 = new BitSet(new long[]{0x0000000020014100L});
	public static final BitSet FOLLOW_atom_in_moinsExpr744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vectExpr_in_dotExpr753 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_dotExpr756 = new BitSet(new long[]{0x0000080000004000L});
	public static final BitSet FOLLOW_IDF_in_dotExpr760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_dotExpr764 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_dotExpr766 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_dotExpr768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_unExpr782 = new BitSet(new long[]{0x0000000022814100L});
	public static final BitSet FOLLOW_EPERLU_in_unExpr785 = new BitSet(new long[]{0x0000000022814100L});
	public static final BitSet FOLLOW_dotExpr_in_unExpr790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_atom801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_atom806 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_callFun_in_atom811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_atom817 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_atom818 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_atom819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_expr831 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr833 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_expr835 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_expr837 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_expr839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_expr851 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr853 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_expr855 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_expr857 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_expr859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_expr870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr1_in_expr874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr2_in_bigbinExpr1883 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_EQUAL_in_bigbinExpr1886 = new BitSet(new long[]{0x0000000024014100L});
	public static final BitSet FOLLOW_bigbinExpr2_in_bigbinExpr1889 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_bigbinExpr3_in_bigbinExpr2900 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_ORBOOL_in_bigbinExpr2902 = new BitSet(new long[]{0x0000000024014100L});
	public static final BitSet FOLLOW_bigbinExpr3_in_bigbinExpr2905 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_bigbinExpr4_in_bigbinExpr3916 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ANDBOOL_in_bigbinExpr3918 = new BitSet(new long[]{0x0000000024014100L});
	public static final BitSet FOLLOW_bigbinExpr4_in_bigbinExpr3921 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_bigbinExpr5_in_bigbinExpr4932 = new BitSet(new long[]{0x0000000000580002L});
	public static final BitSet FOLLOW_PREV_in_bigbinExpr4935 = new BitSet(new long[]{0x0000000024014100L});
	public static final BitSet FOLLOW_OPBOOLEQ_in_bigbinExpr4938 = new BitSet(new long[]{0x0000000024014100L});
	public static final BitSet FOLLOW_NEXT_in_bigbinExpr4941 = new BitSet(new long[]{0x0000000024014100L});
	public static final BitSet FOLLOW_bigbinExpr5_in_bigbinExpr4945 = new BitSet(new long[]{0x0000000000580002L});
	public static final BitSet FOLLOW_bigbinExpr6_in_bigbinExpr5956 = new BitSet(new long[]{0x0000000002000012L});
	public static final BitSet FOLLOW_set_in_bigbinExpr5958 = new BitSet(new long[]{0x0000000024014100L});
	public static final BitSet FOLLOW_bigbinExpr6_in_bigbinExpr5965 = new BitSet(new long[]{0x0000000002000012L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr6976 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_STAR_in_bigbinExpr6980 = new BitSet(new long[]{0x0000000024014100L});
	public static final BitSet FOLLOW_DIV_in_bigbinExpr6983 = new BitSet(new long[]{0x0000000024014100L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr6987 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_bigatom_in_bigvectExpr998 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_bigvectExpr1001 = new BitSet(new long[]{0x0014800024014100L});
	public static final BitSet FOLLOW_bigExpr_in_bigvectExpr1003 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_bigvectExpr1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigvectExpr_in_bigdotExpr1015 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_bigdotExpr1018 = new BitSet(new long[]{0x0000080000004000L});
	public static final BitSet FOLLOW_IDF_in_bigdotExpr1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_bigdotExpr1026 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_bigdotExpr1028 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_bigdotExpr1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_bigunExpr1040 = new BitSet(new long[]{0x0000000020014100L});
	public static final BitSet FOLLOW_bigdotExpr_in_bigunExpr1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_bigExpr1053 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1055 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_bigExpr1057 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_bigExpr1059 = new BitSet(new long[]{0x0000002080000000L});
	public static final BitSet FOLLOW_31_in_bigExpr1062 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_bigExpr1064 = new BitSet(new long[]{0x0000002080000000L});
	public static final BitSet FOLLOW_37_in_bigExpr1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_bigExpr1080 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1082 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_bigExpr1084 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_bigExpr1086 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_bigExpr1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_bigExpr1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr1_in_bigExpr1103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_bigatom1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_bigatom1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_bigatom1119 = new BitSet(new long[]{0x0010000020000002L});
	public static final BitSet FOLLOW_newStruc_in_bigatom1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callFun_in_bigatom1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_bigatom1130 = new BitSet(new long[]{0x0014800024014100L});
	public static final BitSet FOLLOW_bigExpr_in_bigatom1131 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_bigatom1132 = new BitSet(new long[]{0x0000000000000002L});
}
