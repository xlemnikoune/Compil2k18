// $ANTLR 3.5.2 Grammar.g 2018-04-10 14:32:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class GrammarParser extends Parser {
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


	public GrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return GrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Grammar.g"; }


	boolean mainFound = false;


	public static class axiom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "axiom"
	// Grammar.g:20:1: axiom : fichier EOF -> fichier ;
	public final GrammarParser.axiom_return axiom() throws RecognitionException {
		GrammarParser.axiom_return retval = new GrammarParser.axiom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope fichier1 =null;

		CommonTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_fichier=new RewriteRuleSubtreeStream(adaptor,"rule fichier");

		try {
			// Grammar.g:20:7: ( fichier EOF -> fichier )
			// Grammar.g:20:9: fichier EOF
			{
			pushFollow(FOLLOW_fichier_in_axiom78);
			fichier1=fichier();
			state._fsp--;

			stream_fichier.add(fichier1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_axiom80);  
			stream_EOF.add(EOF2);

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
		return retval;
	}
	// $ANTLR end "axiom"


	public static class fichier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fichier"
	// Grammar.g:23:1: fichier : ( decl )* ;
	public final GrammarParser.fichier_return fichier() throws RecognitionException {
		GrammarParser.fichier_return retval = new GrammarParser.fichier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope decl3 =null;


		try {
			// Grammar.g:23:9: ( ( decl )* )
			// Grammar.g:23:11: ( decl )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:23:11: ( decl )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==41||LA1_0==49) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Grammar.g:23:11: decl
					{
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
		return retval;
	}
	// $ANTLR end "fichier"


	public static class decl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// Grammar.g:26:1: decl : ( declFun | declStruct );
	public final GrammarParser.decl_return decl() throws RecognitionException {
		GrammarParser.decl_return retval = new GrammarParser.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declFun4 =null;
		ParserRuleReturnScope declStruct5 =null;


		try {
			// Grammar.g:26:6: ( declFun | declStruct )
			int alt2=2;
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
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Grammar.g:26:8: declFun
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_declFun_in_decl107);
					declFun4=declFun();
					state._fsp--;

					adaptor.addChild(root_0, declFun4.getTree());

					}
					break;
				case 2 :
					// Grammar.g:27:3: declStruct
					{
					root_0 = (CommonTree)adaptor.nil();


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
		return retval;
	}
	// $ANTLR end "decl"


	public static class declStruct_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declStruct"
	// Grammar.g:30:1: declStruct : 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) ;
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

		try {
			// Grammar.g:30:12: ( 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) )
			// Grammar.g:30:14: 'struct' IDF '{' ( args )? '}'
			{
			string_literal6=(Token)match(input,49,FOLLOW_49_in_declStruct120);  
			stream_49.add(string_literal6);

			IDF7=(Token)match(input,IDF,FOLLOW_IDF_in_declStruct122);  
			stream_IDF.add(IDF7);

			char_literal8=(Token)match(input,52,FOLLOW_52_in_declStruct124);  
			stream_52.add(char_literal8);

			// Grammar.g:30:31: ( args )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==IDF) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Grammar.g:30:31: args
					{
					pushFollow(FOLLOW_args_in_declStruct126);
					args9=args();
					state._fsp--;

					stream_args.add(args9.getTree());
					}
					break;

			}

			char_literal10=(Token)match(input,53,FOLLOW_53_in_declStruct129);  
			stream_53.add(char_literal10);

			// AST REWRITE
			// elements: args, 49, IDF
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
				// Grammar.g:30:44: ^( 'struct' IDF ( args )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_49.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDF.nextNode());
				// Grammar.g:30:59: ( args )?
				if ( stream_args.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "declStruct"


	public static class args_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "args"
	// Grammar.g:33:1: args : IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* ;
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

		try {
			// Grammar.g:33:6: ( IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* )
			// Grammar.g:33:8: IDF ':' type ( ',' IDF ':' type )*
			{
			IDF11=(Token)match(input,IDF,FOLLOW_IDF_in_args150);  
			stream_IDF.add(IDF11);

			char_literal12=(Token)match(input,34,FOLLOW_34_in_args152);  
			stream_34.add(char_literal12);

			pushFollow(FOLLOW_type_in_args154);
			type13=type();
			state._fsp--;

			stream_type.add(type13.getTree());
			// Grammar.g:33:21: ( ',' IDF ':' type )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==31) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Grammar.g:33:22: ',' IDF ':' type
					{
					char_literal14=(Token)match(input,31,FOLLOW_31_in_args157);  
					stream_31.add(char_literal14);

					IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_args159);  
					stream_IDF.add(IDF15);

					char_literal16=(Token)match(input,34,FOLLOW_34_in_args161);  
					stream_34.add(char_literal16);

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

			// AST REWRITE
			// elements: IDF, type
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
				// Grammar.g:33:44: ( ^( IDF type ) )*
				while ( stream_IDF.hasNext()||stream_type.hasNext() ) {
					// Grammar.g:33:45: ^( IDF type )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					root_1 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);
					adaptor.addChild(root_1, stream_type.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_IDF.reset();
				stream_type.reset();

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
		return retval;
	}
	// $ANTLR end "args"


	public static class declFun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declFun"
	// Grammar.g:36:1: declFun : 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) ;
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

		try {
			// Grammar.g:36:9: ( 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) )
			// Grammar.g:36:11: 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
			{
			string_literal18=(Token)match(input,41,FOLLOW_41_in_declFun185);  
			stream_41.add(string_literal18);

			// Grammar.g:36:16: ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
			int alt7=2;
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
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// Grammar.g:36:17: IDF '(' ( args )? ')' ( '->' type )? block
					{
					IDF19=(Token)match(input,IDF,FOLLOW_IDF_in_declFun188);  
					stream_IDF.add(IDF19);

					char_literal20=(Token)match(input,29,FOLLOW_29_in_declFun190);  
					stream_29.add(char_literal20);

					// Grammar.g:36:25: ( args )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==IDF) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Grammar.g:36:25: args
							{
							pushFollow(FOLLOW_args_in_declFun192);
							args21=args();
							state._fsp--;

							stream_args.add(args21.getTree());
							}
							break;

					}

					char_literal22=(Token)match(input,30,FOLLOW_30_in_declFun195);  
					stream_30.add(char_literal22);

					// Grammar.g:36:35: ( '->' type )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==32) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// Grammar.g:36:36: '->' type
							{
							string_literal23=(Token)match(input,32,FOLLOW_32_in_declFun198);  
							stream_32.add(string_literal23);

							pushFollow(FOLLOW_type_in_declFun200);
							type24=type();
							state._fsp--;

							stream_type.add(type24.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_block_in_declFun204);
					block25=block();
					state._fsp--;

					stream_block.add(block25.getTree());
					// AST REWRITE
					// elements: args, type, block, 32, 41, IDF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 36:54: -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block )
					{
						// Grammar.g:36:57: ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_41.nextNode(), root_1);
						adaptor.addChild(root_1, stream_IDF.nextNode());
						// Grammar.g:36:68: ( ^( '->' type ) )?
						if ( stream_type.hasNext()||stream_32.hasNext() ) {
							// Grammar.g:36:68: ^( '->' type )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_32.nextNode(), root_2);
							adaptor.addChild(root_2, stream_type.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_type.reset();
						stream_32.reset();

						// Grammar.g:36:82: ( args )?
						if ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:37:4: MAIN '(' ')' block
					{
					mainFound = true;
					MAIN26=(Token)match(input,MAIN,FOLLOW_MAIN_in_declFun231);  
					stream_MAIN.add(MAIN26);

					char_literal27=(Token)match(input,29,FOLLOW_29_in_declFun233);  
					stream_29.add(char_literal27);

					char_literal28=(Token)match(input,30,FOLLOW_30_in_declFun235);  
					stream_30.add(char_literal28);

					pushFollow(FOLLOW_block_in_declFun237);
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
						// Grammar.g:37:45: ^( 'fn' MAIN block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_41.nextNode(), root_1);
						adaptor.addChild(root_1, stream_MAIN.nextNode());
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

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
		return retval;
	}
	// $ANTLR end "declFun"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Grammar.g:40:1: type : (| 'i32' | 'bool' | IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) );
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

		try {
			// Grammar.g:40:6: (| 'i32' | 'bool' | IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) )
			int alt8=6;
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
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// Grammar.g:40:8: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// Grammar.g:40:10: 'i32'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal30=(Token)match(input,42,FOLLOW_42_in_type259); 
					string_literal30_tree = (CommonTree)adaptor.create(string_literal30);
					adaptor.addChild(root_0, string_literal30_tree);

					}
					break;
				case 3 :
					// Grammar.g:41:3: 'bool'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal31=(Token)match(input,38,FOLLOW_38_in_type263); 
					string_literal31_tree = (CommonTree)adaptor.create(string_literal31);
					adaptor.addChild(root_0, string_literal31_tree);

					}
					break;
				case 4 :
					// Grammar.g:42:2: IDF
					{
					root_0 = (CommonTree)adaptor.nil();


					IDF32=(Token)match(input,IDF,FOLLOW_IDF_in_type266); 
					IDF32_tree = (CommonTree)adaptor.create(IDF32);
					adaptor.addChild(root_0, IDF32_tree);

					}
					break;
				case 5 :
					// Grammar.g:43:4: 'vec' ( '<' type '>' )
					{
					string_literal33=(Token)match(input,50,FOLLOW_50_in_type271);  
					stream_50.add(string_literal33);

					// Grammar.g:43:10: ( '<' type '>' )
					// Grammar.g:43:11: '<' type '>'
					{
					char_literal34=(Token)match(input,PREV,FOLLOW_PREV_in_type274);  
					stream_PREV.add(char_literal34);

					pushFollow(FOLLOW_type_in_type276);
					type35=type();
					state._fsp--;

					stream_type.add(type35.getTree());
					char_literal36=(Token)match(input,NEXT,FOLLOW_NEXT_in_type278);  
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
						// Grammar.g:43:28: ^( 'vec' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_50.nextNode(), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Grammar.g:44:3: '&' type
					{
					char_literal37=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_type292);  
					stream_EPERLU.add(char_literal37);

					pushFollow(FOLLOW_type_in_type294);
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
					// 44:12: -> ^( '&' type )
					{
						// Grammar.g:44:15: ^( '&' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_EPERLU.nextNode(), root_1);
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
		return retval;
	}
	// $ANTLR end "type"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// Grammar.g:47:1: block : '{' ( instruct )* '}' -> ^( BLOCK ( instruct )* ) ;
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

		try {
			// Grammar.g:47:7: ( '{' ( instruct )* '}' -> ^( BLOCK ( instruct )* ) )
			// Grammar.g:47:9: '{' ( instruct )* '}'
			{
			char_literal39=(Token)match(input,52,FOLLOW_52_in_block311);  
			stream_52.add(char_literal39);

			// Grammar.g:47:13: ( instruct )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==BOOL||LA9_0==EPERLU||(LA9_0 >= IDF && LA9_0 <= INT)||LA9_0==STAR||(LA9_0 >= SUB && LA9_0 <= UNAIRE)||LA9_0==29||LA9_0==35||LA9_0==39||(LA9_0 >= 44 && LA9_0 <= 45)||(LA9_0 >= 47 && LA9_0 <= 48)||(LA9_0 >= 50 && LA9_0 <= 52)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Grammar.g:47:13: instruct
					{
					pushFollow(FOLLOW_instruct_in_block313);
					instruct40=instruct();
					state._fsp--;

					stream_instruct.add(instruct40.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			char_literal41=(Token)match(input,53,FOLLOW_53_in_block316);  
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
				// Grammar.g:47:29: ^( BLOCK ( instruct )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				// Grammar.g:47:37: ( instruct )*
				while ( stream_instruct.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "block"


	public static class callFun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "callFun"
	// Grammar.g:51:1: callFun : '(' expr ( ',' expr )* ')' -> ( expr )* ;
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

		try {
			// Grammar.g:51:9: ( '(' expr ( ',' expr )* ')' -> ( expr )* )
			// Grammar.g:51:11: '(' expr ( ',' expr )* ')'
			{
			char_literal42=(Token)match(input,29,FOLLOW_29_in_callFun335);  
			stream_29.add(char_literal42);

			pushFollow(FOLLOW_expr_in_callFun337);
			expr43=expr();
			state._fsp--;

			stream_expr.add(expr43.getTree());
			// Grammar.g:51:20: ( ',' expr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==31) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Grammar.g:51:21: ',' expr
					{
					char_literal44=(Token)match(input,31,FOLLOW_31_in_callFun340);  
					stream_31.add(char_literal44);

					pushFollow(FOLLOW_expr_in_callFun342);
					expr45=expr();
					state._fsp--;

					stream_expr.add(expr45.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			char_literal46=(Token)match(input,30,FOLLOW_30_in_callFun346);  
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
				// Grammar.g:51:39: ( expr )*
				while ( stream_expr.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "callFun"


	public static class newStruc_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "newStruc"
	// Grammar.g:53:1: newStruc : '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) ;
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

		try {
			// Grammar.g:53:10: ( '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) )
			// Grammar.g:53:12: '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}'
			{
			char_literal47=(Token)match(input,52,FOLLOW_52_in_newStruc359);  
			stream_52.add(char_literal47);

			IDF48=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc361);  
			stream_IDF.add(IDF48);

			char_literal49=(Token)match(input,34,FOLLOW_34_in_newStruc363);  
			stream_34.add(char_literal49);

			pushFollow(FOLLOW_bigExpr_in_newStruc365);
			bigExpr50=bigExpr();
			state._fsp--;

			stream_bigExpr.add(bigExpr50.getTree());
			// Grammar.g:53:32: ( ',' IDF ':' bigExpr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==31) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Grammar.g:53:33: ',' IDF ':' bigExpr
					{
					char_literal51=(Token)match(input,31,FOLLOW_31_in_newStruc368);  
					stream_31.add(char_literal51);

					IDF52=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc370);  
					stream_IDF.add(IDF52);

					char_literal53=(Token)match(input,34,FOLLOW_34_in_newStruc372);  
					stream_34.add(char_literal53);

					pushFollow(FOLLOW_bigExpr_in_newStruc374);
					bigExpr54=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr54.getTree());
					}
					break;

				default :
					break loop11;
				}
			}

			char_literal55=(Token)match(input,53,FOLLOW_53_in_newStruc378);  
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
				// Grammar.g:53:62: ^( NEW ( ^( IDF bigExpr ) )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);
				// Grammar.g:53:68: ( ^( IDF bigExpr ) )*
				while ( stream_IDF.hasNext()||stream_bigExpr.hasNext() ) {
					// Grammar.g:53:68: ^( IDF bigExpr )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);
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
		return retval;
	}
	// $ANTLR end "newStruc"


	public static class instruct_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruct"
	// Grammar.g:55:1: instruct : ( expr ';' -> expr | ';' ->| 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) | 'while' expr block -> ^( 'while' expr block ) | 'return' ( expr )? ';' -> ^( 'return' ( expr )? ) | 'loop' block -> ^( 'loop' block ) | 'break' ';' -> 'break' | ifExpr );
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

		try {
			// Grammar.g:55:10: ( expr ';' -> expr | ';' ->| 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) | 'while' expr block -> ^( 'while' expr block ) | 'return' ( expr )? ';' -> ^( 'return' ( expr )? ) | 'loop' block -> ^( 'loop' block ) | 'break' ';' -> 'break' | ifExpr )
			int alt15=8;
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
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// Grammar.g:56:3: expr ';'
					{
					pushFollow(FOLLOW_expr_in_instruct402);
					expr56=expr();
					state._fsp--;

					stream_expr.add(expr56.getTree());
					char_literal57=(Token)match(input,35,FOLLOW_35_in_instruct404);  
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
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:57:3: ';'
					{
					char_literal58=(Token)match(input,35,FOLLOW_35_in_instruct412);  
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
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammar.g:58:3: 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';'
					{
					string_literal59=(Token)match(input,44,FOLLOW_44_in_instruct418);  
					stream_44.add(string_literal59);

					// Grammar.g:58:9: ( 'mut' )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==46) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// Grammar.g:58:9: 'mut'
							{
							string_literal60=(Token)match(input,46,FOLLOW_46_in_instruct420);  
							stream_46.add(string_literal60);

							}
							break;

					}

					pushFollow(FOLLOW_dotIDF_in_instruct423);
					dotIDF61=dotIDF();
					state._fsp--;

					stream_dotIDF.add(dotIDF61.getTree());
					// Grammar.g:58:23: ( ':' type )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==34) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// Grammar.g:58:24: ':' type
							{
							char_literal62=(Token)match(input,34,FOLLOW_34_in_instruct426);  
							stream_34.add(char_literal62);

							pushFollow(FOLLOW_type_in_instruct428);
							type63=type();
							state._fsp--;

							stream_type.add(type63.getTree());
							}
							break;

					}

					char_literal64=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instruct432);  
					stream_EQUAL.add(char_literal64);

					pushFollow(FOLLOW_bigExpr_in_instruct434);
					bigExpr65=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr65.getTree());
					char_literal66=(Token)match(input,35,FOLLOW_35_in_instruct436);  
					stream_35.add(char_literal66);

					// AST REWRITE
					// elements: 44, bigExpr, EQUAL, dotIDF, 46, type
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
						// Grammar.g:58:54: ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_44.nextNode(), root_1);
						// Grammar.g:58:62: ( 'mut' )?
						if ( stream_46.hasNext() ) {
							adaptor.addChild(root_1, stream_46.nextNode());
						}
						stream_46.reset();

						// Grammar.g:58:69: ( type )?
						if ( stream_type.hasNext() ) {
							adaptor.addChild(root_1, stream_type.nextTree());
						}
						stream_type.reset();

						// Grammar.g:58:77: ^( '=' dotIDF bigExpr )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_EQUAL.nextNode(), root_2);
						adaptor.addChild(root_2, stream_dotIDF.nextTree());
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
					// Grammar.g:59:3: 'while' expr block
					{
					string_literal67=(Token)match(input,51,FOLLOW_51_in_instruct463);  
					stream_51.add(string_literal67);

					pushFollow(FOLLOW_expr_in_instruct465);
					expr68=expr();
					state._fsp--;

					stream_expr.add(expr68.getTree());
					pushFollow(FOLLOW_block_in_instruct467);
					block69=block();
					state._fsp--;

					stream_block.add(block69.getTree());
					// AST REWRITE
					// elements: block, expr, 51
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
						// Grammar.g:59:25: ^( 'while' expr block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_51.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Grammar.g:60:3: 'return' ( expr )? ';'
					{
					string_literal70=(Token)match(input,48,FOLLOW_48_in_instruct481);  
					stream_48.add(string_literal70);

					// Grammar.g:60:12: ( expr )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==BOOL||LA14_0==EPERLU||LA14_0==IDF||LA14_0==INT||LA14_0==STAR||(LA14_0 >= SUB && LA14_0 <= UNAIRE)||LA14_0==29||LA14_0==47||LA14_0==50||LA14_0==52) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// Grammar.g:60:12: expr
							{
							pushFollow(FOLLOW_expr_in_instruct483);
							expr71=expr();
							state._fsp--;

							stream_expr.add(expr71.getTree());
							}
							break;

					}

					char_literal72=(Token)match(input,35,FOLLOW_35_in_instruct486);  
					stream_35.add(char_literal72);

					// AST REWRITE
					// elements: expr, 48
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
						// Grammar.g:60:25: ^( 'return' ( expr )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_48.nextNode(), root_1);
						// Grammar.g:60:36: ( expr )?
						if ( stream_expr.hasNext() ) {
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
					// Grammar.g:61:3: 'loop' block
					{
					string_literal73=(Token)match(input,45,FOLLOW_45_in_instruct499);  
					stream_45.add(string_literal73);

					pushFollow(FOLLOW_block_in_instruct501);
					block74=block();
					state._fsp--;

					stream_block.add(block74.getTree());
					// AST REWRITE
					// elements: block, 45
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
						// Grammar.g:61:19: ^( 'loop' block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// Grammar.g:62:3: 'break' ';'
					{
					string_literal75=(Token)match(input,39,FOLLOW_39_in_instruct513);  
					stream_39.add(string_literal75);

					char_literal76=(Token)match(input,35,FOLLOW_35_in_instruct515);  
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
						adaptor.addChild(root_0, stream_39.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// Grammar.g:63:3: ifExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifExpr_in_instruct523);
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
		return retval;
	}
	// $ANTLR end "instruct"


	public static class dotIDF_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dotIDF"
	// Grammar.g:66:1: dotIDF : IDF ( '.' ^ IDF )? ;
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

		try {
			// Grammar.g:66:9: ( IDF ( '.' ^ IDF )? )
			// Grammar.g:67:1: IDF ( '.' ^ IDF )?
			{
			root_0 = (CommonTree)adaptor.nil();


			IDF78=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF534); 
			IDF78_tree = (CommonTree)adaptor.create(IDF78);
			adaptor.addChild(root_0, IDF78_tree);

			// Grammar.g:67:5: ( '.' ^ IDF )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==33) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// Grammar.g:67:6: '.' ^ IDF
					{
					char_literal79=(Token)match(input,33,FOLLOW_33_in_dotIDF537); 
					char_literal79_tree = (CommonTree)adaptor.create(char_literal79);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal79_tree, root_0);

					IDF80=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF540); 
					IDF80_tree = (CommonTree)adaptor.create(IDF80);
					adaptor.addChild(root_0, IDF80_tree);

					}
					break;

			}

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
		return retval;
	}
	// $ANTLR end "dotIDF"


	public static class ifExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifExpr"
	// Grammar.g:69:1: ifExpr : 'if' expr block ( 'else' block )? -> ^( 'if' expr block ( ^( 'else' block ) )? ) ;
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

		try {
			// Grammar.g:69:8: ( 'if' expr block ( 'else' block )? -> ^( 'if' expr block ( ^( 'else' block ) )? ) )
			// Grammar.g:69:10: 'if' expr block ( 'else' block )?
			{
			string_literal81=(Token)match(input,IF,FOLLOW_IF_in_ifExpr550);  
			stream_IF.add(string_literal81);

			pushFollow(FOLLOW_expr_in_ifExpr552);
			expr82=expr();
			state._fsp--;

			stream_expr.add(expr82.getTree());
			pushFollow(FOLLOW_block_in_ifExpr554);
			block83=block();
			state._fsp--;

			stream_block.add(block83.getTree());
			// Grammar.g:69:26: ( 'else' block )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==40) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// Grammar.g:69:27: 'else' block
					{
					string_literal84=(Token)match(input,40,FOLLOW_40_in_ifExpr557);  
					stream_40.add(string_literal84);

					pushFollow(FOLLOW_block_in_ifExpr559);
					block85=block();
					state._fsp--;

					stream_block.add(block85.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: IF, 40, block, block, expr
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
				// Grammar.g:69:46: ^( 'if' expr block ( ^( 'else' block ) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				// Grammar.g:69:64: ( ^( 'else' block ) )?
				if ( stream_40.hasNext()||stream_block.hasNext() ) {
					// Grammar.g:69:64: ^( 'else' block )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot(stream_40.nextNode(), root_2);
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
		return retval;
	}
	// $ANTLR end "ifExpr"


	public static class binExpr1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr1"
	// Grammar.g:71:1: binExpr1 : binExpr2 ( EQUAL ^ binExpr2 )* ;
	public final GrammarParser.binExpr1_return binExpr1() throws RecognitionException {
		GrammarParser.binExpr1_return retval = new GrammarParser.binExpr1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL87=null;
		ParserRuleReturnScope binExpr286 =null;
		ParserRuleReturnScope binExpr288 =null;

		CommonTree EQUAL87_tree=null;

		try {
			// Grammar.g:71:10: ( binExpr2 ( EQUAL ^ binExpr2 )* )
			// Grammar.g:71:12: binExpr2 ( EQUAL ^ binExpr2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr2_in_binExpr1587);
			binExpr286=binExpr2();
			state._fsp--;

			adaptor.addChild(root_0, binExpr286.getTree());

			// Grammar.g:71:21: ( EQUAL ^ binExpr2 )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==EQUAL) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Grammar.g:71:22: EQUAL ^ binExpr2
					{
					EQUAL87=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_binExpr1590); 
					EQUAL87_tree = (CommonTree)adaptor.create(EQUAL87);
					root_0 = (CommonTree)adaptor.becomeRoot(EQUAL87_tree, root_0);

					pushFollow(FOLLOW_binExpr2_in_binExpr1593);
					binExpr288=binExpr2();
					state._fsp--;

					adaptor.addChild(root_0, binExpr288.getTree());

					}
					break;

				default :
					break loop18;
				}
			}

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
		return retval;
	}
	// $ANTLR end "binExpr1"


	public static class binExpr2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr2"
	// Grammar.g:73:1: binExpr2 : binExpr3 ( ORBOOL ^ binExpr3 )* ;
	public final GrammarParser.binExpr2_return binExpr2() throws RecognitionException {
		GrammarParser.binExpr2_return retval = new GrammarParser.binExpr2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ORBOOL90=null;
		ParserRuleReturnScope binExpr389 =null;
		ParserRuleReturnScope binExpr391 =null;

		CommonTree ORBOOL90_tree=null;

		try {
			// Grammar.g:73:10: ( binExpr3 ( ORBOOL ^ binExpr3 )* )
			// Grammar.g:73:12: binExpr3 ( ORBOOL ^ binExpr3 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr3_in_binExpr2604);
			binExpr389=binExpr3();
			state._fsp--;

			adaptor.addChild(root_0, binExpr389.getTree());

			// Grammar.g:73:20: ( ORBOOL ^ binExpr3 )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==ORBOOL) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Grammar.g:73:21: ORBOOL ^ binExpr3
					{
					ORBOOL90=(Token)match(input,ORBOOL,FOLLOW_ORBOOL_in_binExpr2606); 
					ORBOOL90_tree = (CommonTree)adaptor.create(ORBOOL90);
					root_0 = (CommonTree)adaptor.becomeRoot(ORBOOL90_tree, root_0);

					pushFollow(FOLLOW_binExpr3_in_binExpr2609);
					binExpr391=binExpr3();
					state._fsp--;

					adaptor.addChild(root_0, binExpr391.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

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
		return retval;
	}
	// $ANTLR end "binExpr2"


	public static class binExpr3_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr3"
	// Grammar.g:75:1: binExpr3 : binExpr4 ( ANDBOOL ^ binExpr4 )* ;
	public final GrammarParser.binExpr3_return binExpr3() throws RecognitionException {
		GrammarParser.binExpr3_return retval = new GrammarParser.binExpr3_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANDBOOL93=null;
		ParserRuleReturnScope binExpr492 =null;
		ParserRuleReturnScope binExpr494 =null;

		CommonTree ANDBOOL93_tree=null;

		try {
			// Grammar.g:75:10: ( binExpr4 ( ANDBOOL ^ binExpr4 )* )
			// Grammar.g:75:12: binExpr4 ( ANDBOOL ^ binExpr4 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr4_in_binExpr3620);
			binExpr492=binExpr4();
			state._fsp--;

			adaptor.addChild(root_0, binExpr492.getTree());

			// Grammar.g:75:20: ( ANDBOOL ^ binExpr4 )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==ANDBOOL) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// Grammar.g:75:21: ANDBOOL ^ binExpr4
					{
					ANDBOOL93=(Token)match(input,ANDBOOL,FOLLOW_ANDBOOL_in_binExpr3622); 
					ANDBOOL93_tree = (CommonTree)adaptor.create(ANDBOOL93);
					root_0 = (CommonTree)adaptor.becomeRoot(ANDBOOL93_tree, root_0);

					pushFollow(FOLLOW_binExpr4_in_binExpr3625);
					binExpr494=binExpr4();
					state._fsp--;

					adaptor.addChild(root_0, binExpr494.getTree());

					}
					break;

				default :
					break loop20;
				}
			}

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
		return retval;
	}
	// $ANTLR end "binExpr3"


	public static class binExpr4_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr4"
	// Grammar.g:77:1: binExpr4 : binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )* ;
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

		try {
			// Grammar.g:77:10: ( binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )* )
			// Grammar.g:77:12: binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr5_in_binExpr4636);
			binExpr595=binExpr5();
			state._fsp--;

			adaptor.addChild(root_0, binExpr595.getTree());

			// Grammar.g:77:20: ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= NEXT && LA22_0 <= OPBOOLEQ)||LA22_0==PREV) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Grammar.g:77:21: ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5
					{
					// Grammar.g:77:21: ( PREV ^| OPBOOLEQ ^| NEXT ^)
					int alt21=3;
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
						throw nvae;
					}
					switch (alt21) {
						case 1 :
							// Grammar.g:77:22: PREV ^
							{
							PREV96=(Token)match(input,PREV,FOLLOW_PREV_in_binExpr4639); 
							PREV96_tree = (CommonTree)adaptor.create(PREV96);
							root_0 = (CommonTree)adaptor.becomeRoot(PREV96_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:77:28: OPBOOLEQ ^
							{
							OPBOOLEQ97=(Token)match(input,OPBOOLEQ,FOLLOW_OPBOOLEQ_in_binExpr4642); 
							OPBOOLEQ97_tree = (CommonTree)adaptor.create(OPBOOLEQ97);
							root_0 = (CommonTree)adaptor.becomeRoot(OPBOOLEQ97_tree, root_0);

							}
							break;
						case 3 :
							// Grammar.g:77:38: NEXT ^
							{
							NEXT98=(Token)match(input,NEXT,FOLLOW_NEXT_in_binExpr4645); 
							NEXT98_tree = (CommonTree)adaptor.create(NEXT98);
							root_0 = (CommonTree)adaptor.becomeRoot(NEXT98_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_binExpr5_in_binExpr4649);
					binExpr599=binExpr5();
					state._fsp--;

					adaptor.addChild(root_0, binExpr599.getTree());

					}
					break;

				default :
					break loop22;
				}
			}

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
		return retval;
	}
	// $ANTLR end "binExpr4"


	public static class binExpr5_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr5"
	// Grammar.g:79:1: binExpr5 : binExpr6 ( ( ADD ^| SUB ^) binExpr6 )* ;
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

		try {
			// Grammar.g:79:10: ( binExpr6 ( ( ADD ^| SUB ^) binExpr6 )* )
			// Grammar.g:79:12: binExpr6 ( ( ADD ^| SUB ^) binExpr6 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr6_in_binExpr5660);
			binExpr6100=binExpr6();
			state._fsp--;

			adaptor.addChild(root_0, binExpr6100.getTree());

			// Grammar.g:79:20: ( ( ADD ^| SUB ^) binExpr6 )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==ADD||LA24_0==SUB) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// Grammar.g:79:21: ( ADD ^| SUB ^) binExpr6
					{
					// Grammar.g:79:21: ( ADD ^| SUB ^)
					int alt23=2;
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
						throw nvae;
					}

					switch (alt23) {
						case 1 :
							// Grammar.g:79:22: ADD ^
							{
							ADD101=(Token)match(input,ADD,FOLLOW_ADD_in_binExpr5663); 
							ADD101_tree = (CommonTree)adaptor.create(ADD101);
							root_0 = (CommonTree)adaptor.becomeRoot(ADD101_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:79:27: SUB ^
							{
							SUB102=(Token)match(input,SUB,FOLLOW_SUB_in_binExpr5666); 
							SUB102_tree = (CommonTree)adaptor.create(SUB102);
							root_0 = (CommonTree)adaptor.becomeRoot(SUB102_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_binExpr6_in_binExpr5671);
					binExpr6103=binExpr6();
					state._fsp--;

					adaptor.addChild(root_0, binExpr6103.getTree());

					}
					break;

				default :
					break loop24;
				}
			}

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
		return retval;
	}
	// $ANTLR end "binExpr5"


	public static class binExpr6_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr6"
	// Grammar.g:81:1: binExpr6 : unExpr ( ( STAR ^| DIV ^) unExpr )* ;
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

		try {
			// Grammar.g:81:10: ( unExpr ( ( STAR ^| DIV ^) unExpr )* )
			// Grammar.g:81:12: unExpr ( ( STAR ^| DIV ^) unExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unExpr_in_binExpr6682);
			unExpr104=unExpr();
			state._fsp--;

			adaptor.addChild(root_0, unExpr104.getTree());

			// Grammar.g:81:19: ( ( STAR ^| DIV ^) unExpr )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==DIV||LA26_0==STAR) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// Grammar.g:81:20: ( STAR ^| DIV ^) unExpr
					{
					// Grammar.g:81:20: ( STAR ^| DIV ^)
					int alt25=2;
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
						throw nvae;
					}

					switch (alt25) {
						case 1 :
							// Grammar.g:81:21: STAR ^
							{
							STAR105=(Token)match(input,STAR,FOLLOW_STAR_in_binExpr6686); 
							STAR105_tree = (CommonTree)adaptor.create(STAR105);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR105_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:81:27: DIV ^
							{
							DIV106=(Token)match(input,DIV,FOLLOW_DIV_in_binExpr6689); 
							DIV106_tree = (CommonTree)adaptor.create(DIV106);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV106_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unExpr_in_binExpr6693);
					unExpr107=unExpr();
					state._fsp--;

					adaptor.addChild(root_0, unExpr107.getTree());

					}
					break;

				default :
					break loop26;
				}
			}

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
		return retval;
	}
	// $ANTLR end "binExpr6"


	public static class vectExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vectExpr"
	// Grammar.g:83:1: vectExpr : starExpr ( '[' ^ expr ']' !)? ;
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

		try {
			// Grammar.g:83:10: ( starExpr ( '[' ^ expr ']' !)? )
			// Grammar.g:83:12: starExpr ( '[' ^ expr ']' !)?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_starExpr_in_vectExpr704);
			starExpr108=starExpr();
			state._fsp--;

			adaptor.addChild(root_0, starExpr108.getTree());

			// Grammar.g:83:21: ( '[' ^ expr ']' !)?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==36) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// Grammar.g:83:22: '[' ^ expr ']' !
					{
					char_literal109=(Token)match(input,36,FOLLOW_36_in_vectExpr707); 
					char_literal109_tree = (CommonTree)adaptor.create(char_literal109);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal109_tree, root_0);

					pushFollow(FOLLOW_expr_in_vectExpr710);
					expr110=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr110.getTree());

					char_literal111=(Token)match(input,37,FOLLOW_37_in_vectExpr712); 
					}
					break;

			}

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
		return retval;
	}
	// $ANTLR end "vectExpr"


	public static class starExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "starExpr"
	// Grammar.g:85:1: starExpr : ( STAR ^)? moinsExpr ;
	public final GrammarParser.starExpr_return starExpr() throws RecognitionException {
		GrammarParser.starExpr_return retval = new GrammarParser.starExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR112=null;
		ParserRuleReturnScope moinsExpr113 =null;

		CommonTree STAR112_tree=null;

		try {
			// Grammar.g:86:2: ( ( STAR ^)? moinsExpr )
			// Grammar.g:86:5: ( STAR ^)? moinsExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:86:9: ( STAR ^)?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==STAR) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// Grammar.g:86:9: STAR ^
					{
					STAR112=(Token)match(input,STAR,FOLLOW_STAR_in_starExpr726); 
					STAR112_tree = (CommonTree)adaptor.create(STAR112);
					root_0 = (CommonTree)adaptor.becomeRoot(STAR112_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_moinsExpr_in_starExpr730);
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
		return retval;
	}
	// $ANTLR end "starExpr"


	public static class moinsExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "moinsExpr"
	// Grammar.g:88:1: moinsExpr : ( SUB ^)? atom ;
	public final GrammarParser.moinsExpr_return moinsExpr() throws RecognitionException {
		GrammarParser.moinsExpr_return retval = new GrammarParser.moinsExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUB114=null;
		ParserRuleReturnScope atom115 =null;

		CommonTree SUB114_tree=null;

		try {
			// Grammar.g:89:2: ( ( SUB ^)? atom )
			// Grammar.g:89:5: ( SUB ^)? atom
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:89:8: ( SUB ^)?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==SUB) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// Grammar.g:89:8: SUB ^
					{
					SUB114=(Token)match(input,SUB,FOLLOW_SUB_in_moinsExpr742); 
					SUB114_tree = (CommonTree)adaptor.create(SUB114);
					root_0 = (CommonTree)adaptor.becomeRoot(SUB114_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_atom_in_moinsExpr745);
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
		return retval;
	}
	// $ANTLR end "moinsExpr"


	public static class dotExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dotExpr"
	// Grammar.g:92:1: dotExpr : vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? ;
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

		try {
			// Grammar.g:92:9: ( vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? )
			// Grammar.g:92:11: vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_vectExpr_in_dotExpr754);
			vectExpr116=vectExpr();
			state._fsp--;

			adaptor.addChild(root_0, vectExpr116.getTree());

			// Grammar.g:92:20: ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==33) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// Grammar.g:92:21: '.' ^ ( IDF | 'len' '(' ! ')' !)
					{
					char_literal117=(Token)match(input,33,FOLLOW_33_in_dotExpr757); 
					char_literal117_tree = (CommonTree)adaptor.create(char_literal117);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal117_tree, root_0);

					// Grammar.g:92:26: ( IDF | 'len' '(' ! ')' !)
					int alt30=2;
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
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// Grammar.g:92:27: IDF
							{
							IDF118=(Token)match(input,IDF,FOLLOW_IDF_in_dotExpr761); 
							IDF118_tree = (CommonTree)adaptor.create(IDF118);
							adaptor.addChild(root_0, IDF118_tree);

							}
							break;
						case 2 :
							// Grammar.g:92:33: 'len' '(' ! ')' !
							{
							string_literal119=(Token)match(input,43,FOLLOW_43_in_dotExpr765); 
							string_literal119_tree = (CommonTree)adaptor.create(string_literal119);
							adaptor.addChild(root_0, string_literal119_tree);

							char_literal120=(Token)match(input,29,FOLLOW_29_in_dotExpr767); 
							char_literal121=(Token)match(input,30,FOLLOW_30_in_dotExpr769); 
							}
							break;

					}

					}
					break;

			}

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
		return retval;
	}
	// $ANTLR end "dotExpr"


	public static class unExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unExpr"
	// Grammar.g:94:1: unExpr : ( UNAIRE ^| EPERLU ^)? dotExpr ;
	public final GrammarParser.unExpr_return unExpr() throws RecognitionException {
		GrammarParser.unExpr_return retval = new GrammarParser.unExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE122=null;
		Token EPERLU123=null;
		ParserRuleReturnScope dotExpr124 =null;

		CommonTree UNAIRE122_tree=null;
		CommonTree EPERLU123_tree=null;

		try {
			// Grammar.g:94:8: ( ( UNAIRE ^| EPERLU ^)? dotExpr )
			// Grammar.g:94:10: ( UNAIRE ^| EPERLU ^)? dotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:94:10: ( UNAIRE ^| EPERLU ^)?
			int alt32=3;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==UNAIRE) ) {
				alt32=1;
			}
			else if ( (LA32_0==EPERLU) ) {
				alt32=2;
			}
			switch (alt32) {
				case 1 :
					// Grammar.g:94:11: UNAIRE ^
					{
					UNAIRE122=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_unExpr783); 
					UNAIRE122_tree = (CommonTree)adaptor.create(UNAIRE122);
					root_0 = (CommonTree)adaptor.becomeRoot(UNAIRE122_tree, root_0);

					}
					break;
				case 2 :
					// Grammar.g:94:19: EPERLU ^
					{
					EPERLU123=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_unExpr786); 
					EPERLU123_tree = (CommonTree)adaptor.create(EPERLU123);
					root_0 = (CommonTree)adaptor.becomeRoot(EPERLU123_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_dotExpr_in_unExpr791);
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
		return retval;
	}
	// $ANTLR end "unExpr"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// Grammar.g:96:1: atom : ( INT | BOOL | IDF ^ ( ( callFun ) )? | '(' expr ')' -> expr );
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

		try {
			// Grammar.g:96:6: ( INT | BOOL | IDF ^ ( ( callFun ) )? | '(' expr ')' -> expr )
			int alt34=4;
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
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// Grammar.g:96:8: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT125=(Token)match(input,INT,FOLLOW_INT_in_atom799); 
					INT125_tree = (CommonTree)adaptor.create(INT125);
					adaptor.addChild(root_0, INT125_tree);

					}
					break;
				case 2 :
					// Grammar.g:97:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL126=(Token)match(input,BOOL,FOLLOW_BOOL_in_atom802); 
					BOOL126_tree = (CommonTree)adaptor.create(BOOL126);
					adaptor.addChild(root_0, BOOL126_tree);

					}
					break;
				case 3 :
					// Grammar.g:98:4: IDF ^ ( ( callFun ) )?
					{
					root_0 = (CommonTree)adaptor.nil();


					IDF127=(Token)match(input,IDF,FOLLOW_IDF_in_atom807); 
					IDF127_tree = (CommonTree)adaptor.create(IDF127);
					root_0 = (CommonTree)adaptor.becomeRoot(IDF127_tree, root_0);

					// Grammar.g:98:9: ( ( callFun ) )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==29) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// Grammar.g:98:10: ( callFun )
							{
							// Grammar.g:98:10: ( callFun )
							// Grammar.g:98:11: callFun
							{
							pushFollow(FOLLOW_callFun_in_atom812);
							callFun128=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun128.getTree());

							}

							}
							break;

					}

					}
					break;
				case 4 :
					// Grammar.g:99:3: '(' expr ')'
					{
					char_literal129=(Token)match(input,29,FOLLOW_29_in_atom818);  
					stream_29.add(char_literal129);

					pushFollow(FOLLOW_expr_in_atom819);
					expr130=expr();
					state._fsp--;

					stream_expr.add(expr130.getTree());
					char_literal131=(Token)match(input,30,FOLLOW_30_in_atom820);  
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
		return retval;
	}
	// $ANTLR end "atom"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Grammar.g:101:1: expr : ( 'vec' '!' '[' expr ']' -> ^( 'vec' expr ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | binExpr1 );
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

		try {
			// Grammar.g:101:6: ( 'vec' '!' '[' expr ']' -> ^( 'vec' expr ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | binExpr1 )
			int alt35=4;
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
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// Grammar.g:101:8: 'vec' '!' '[' expr ']'
					{
					string_literal132=(Token)match(input,50,FOLLOW_50_in_expr832);  
					stream_50.add(string_literal132);

					char_literal133=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr834);  
					stream_UNAIRE.add(char_literal133);

					char_literal134=(Token)match(input,36,FOLLOW_36_in_expr836);  
					stream_36.add(char_literal134);

					pushFollow(FOLLOW_expr_in_expr838);
					expr135=expr();
					state._fsp--;

					stream_expr.add(expr135.getTree());
					char_literal136=(Token)match(input,37,FOLLOW_37_in_expr840);  
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
						// Grammar.g:101:34: ^( 'vec' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_50.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:102:3: 'print' '!' '(' expr ')'
					{
					string_literal137=(Token)match(input,47,FOLLOW_47_in_expr852);  
					stream_47.add(string_literal137);

					char_literal138=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr854);  
					stream_UNAIRE.add(char_literal138);

					char_literal139=(Token)match(input,29,FOLLOW_29_in_expr856);  
					stream_29.add(char_literal139);

					pushFollow(FOLLOW_expr_in_expr858);
					expr140=expr();
					state._fsp--;

					stream_expr.add(expr140.getTree());
					char_literal141=(Token)match(input,30,FOLLOW_30_in_expr860);  
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
						// Grammar.g:102:31: ^( 'print' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_47.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammar.g:103:3: block
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_block_in_expr871);
					block142=block();
					state._fsp--;

					adaptor.addChild(root_0, block142.getTree());

					}
					break;
				case 4 :
					// Grammar.g:104:3: binExpr1
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_binExpr1_in_expr875);
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
		return retval;
	}
	// $ANTLR end "expr"


	public static class bigbinExpr1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr1"
	// Grammar.g:107:1: bigbinExpr1 : bigbinExpr2 ( EQUAL ^ bigbinExpr2 )* ;
	public final GrammarParser.bigbinExpr1_return bigbinExpr1() throws RecognitionException {
		GrammarParser.bigbinExpr1_return retval = new GrammarParser.bigbinExpr1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL145=null;
		ParserRuleReturnScope bigbinExpr2144 =null;
		ParserRuleReturnScope bigbinExpr2146 =null;

		CommonTree EQUAL145_tree=null;

		try {
			// Grammar.g:107:13: ( bigbinExpr2 ( EQUAL ^ bigbinExpr2 )* )
			// Grammar.g:107:15: bigbinExpr2 ( EQUAL ^ bigbinExpr2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr2_in_bigbinExpr1884);
			bigbinExpr2144=bigbinExpr2();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr2144.getTree());

			// Grammar.g:107:27: ( EQUAL ^ bigbinExpr2 )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==EQUAL) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// Grammar.g:107:28: EQUAL ^ bigbinExpr2
					{
					EQUAL145=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_bigbinExpr1887); 
					EQUAL145_tree = (CommonTree)adaptor.create(EQUAL145);
					root_0 = (CommonTree)adaptor.becomeRoot(EQUAL145_tree, root_0);

					pushFollow(FOLLOW_bigbinExpr2_in_bigbinExpr1890);
					bigbinExpr2146=bigbinExpr2();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr2146.getTree());

					}
					break;

				default :
					break loop36;
				}
			}

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
		return retval;
	}
	// $ANTLR end "bigbinExpr1"


	public static class bigbinExpr2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr2"
	// Grammar.g:109:1: bigbinExpr2 : bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )* ;
	public final GrammarParser.bigbinExpr2_return bigbinExpr2() throws RecognitionException {
		GrammarParser.bigbinExpr2_return retval = new GrammarParser.bigbinExpr2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ORBOOL148=null;
		ParserRuleReturnScope bigbinExpr3147 =null;
		ParserRuleReturnScope bigbinExpr3149 =null;

		CommonTree ORBOOL148_tree=null;

		try {
			// Grammar.g:109:13: ( bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )* )
			// Grammar.g:109:15: bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr3_in_bigbinExpr2901);
			bigbinExpr3147=bigbinExpr3();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr3147.getTree());

			// Grammar.g:109:26: ( ORBOOL ^ bigbinExpr3 )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==ORBOOL) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// Grammar.g:109:27: ORBOOL ^ bigbinExpr3
					{
					ORBOOL148=(Token)match(input,ORBOOL,FOLLOW_ORBOOL_in_bigbinExpr2903); 
					ORBOOL148_tree = (CommonTree)adaptor.create(ORBOOL148);
					root_0 = (CommonTree)adaptor.becomeRoot(ORBOOL148_tree, root_0);

					pushFollow(FOLLOW_bigbinExpr3_in_bigbinExpr2906);
					bigbinExpr3149=bigbinExpr3();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr3149.getTree());

					}
					break;

				default :
					break loop37;
				}
			}

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
		return retval;
	}
	// $ANTLR end "bigbinExpr2"


	public static class bigbinExpr3_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr3"
	// Grammar.g:111:1: bigbinExpr3 : bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )* ;
	public final GrammarParser.bigbinExpr3_return bigbinExpr3() throws RecognitionException {
		GrammarParser.bigbinExpr3_return retval = new GrammarParser.bigbinExpr3_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANDBOOL151=null;
		ParserRuleReturnScope bigbinExpr4150 =null;
		ParserRuleReturnScope bigbinExpr4152 =null;

		CommonTree ANDBOOL151_tree=null;

		try {
			// Grammar.g:111:13: ( bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )* )
			// Grammar.g:111:15: bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr4_in_bigbinExpr3917);
			bigbinExpr4150=bigbinExpr4();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr4150.getTree());

			// Grammar.g:111:26: ( ANDBOOL ^ bigbinExpr4 )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==ANDBOOL) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// Grammar.g:111:27: ANDBOOL ^ bigbinExpr4
					{
					ANDBOOL151=(Token)match(input,ANDBOOL,FOLLOW_ANDBOOL_in_bigbinExpr3919); 
					ANDBOOL151_tree = (CommonTree)adaptor.create(ANDBOOL151);
					root_0 = (CommonTree)adaptor.becomeRoot(ANDBOOL151_tree, root_0);

					pushFollow(FOLLOW_bigbinExpr4_in_bigbinExpr3922);
					bigbinExpr4152=bigbinExpr4();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr4152.getTree());

					}
					break;

				default :
					break loop38;
				}
			}

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
		return retval;
	}
	// $ANTLR end "bigbinExpr3"


	public static class bigbinExpr4_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr4"
	// Grammar.g:113:1: bigbinExpr4 : bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )* ;
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

		try {
			// Grammar.g:113:13: ( bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )* )
			// Grammar.g:113:15: bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr5_in_bigbinExpr4933);
			bigbinExpr5153=bigbinExpr5();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr5153.getTree());

			// Grammar.g:113:26: ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( ((LA40_0 >= NEXT && LA40_0 <= OPBOOLEQ)||LA40_0==PREV) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// Grammar.g:113:27: ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5
					{
					// Grammar.g:113:27: ( PREV ^| OPBOOLEQ ^| NEXT ^)
					int alt39=3;
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
						throw nvae;
					}
					switch (alt39) {
						case 1 :
							// Grammar.g:113:28: PREV ^
							{
							PREV154=(Token)match(input,PREV,FOLLOW_PREV_in_bigbinExpr4936); 
							PREV154_tree = (CommonTree)adaptor.create(PREV154);
							root_0 = (CommonTree)adaptor.becomeRoot(PREV154_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:113:34: OPBOOLEQ ^
							{
							OPBOOLEQ155=(Token)match(input,OPBOOLEQ,FOLLOW_OPBOOLEQ_in_bigbinExpr4939); 
							OPBOOLEQ155_tree = (CommonTree)adaptor.create(OPBOOLEQ155);
							root_0 = (CommonTree)adaptor.becomeRoot(OPBOOLEQ155_tree, root_0);

							}
							break;
						case 3 :
							// Grammar.g:113:44: NEXT ^
							{
							NEXT156=(Token)match(input,NEXT,FOLLOW_NEXT_in_bigbinExpr4942); 
							NEXT156_tree = (CommonTree)adaptor.create(NEXT156);
							root_0 = (CommonTree)adaptor.becomeRoot(NEXT156_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_bigbinExpr5_in_bigbinExpr4946);
					bigbinExpr5157=bigbinExpr5();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr5157.getTree());

					}
					break;

				default :
					break loop40;
				}
			}

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
		return retval;
	}
	// $ANTLR end "bigbinExpr4"


	public static class bigbinExpr5_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr5"
	// Grammar.g:115:1: bigbinExpr5 : bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )* ;
	public final GrammarParser.bigbinExpr5_return bigbinExpr5() throws RecognitionException {
		GrammarParser.bigbinExpr5_return retval = new GrammarParser.bigbinExpr5_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set159=null;
		ParserRuleReturnScope bigbinExpr6158 =null;
		ParserRuleReturnScope bigbinExpr6160 =null;

		CommonTree set159_tree=null;

		try {
			// Grammar.g:115:13: ( bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )* )
			// Grammar.g:115:15: bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr6_in_bigbinExpr5957);
			bigbinExpr6158=bigbinExpr6();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr6158.getTree());

			// Grammar.g:115:26: ( ( ADD | SUB ) ^ bigbinExpr6 )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==ADD||LA41_0==SUB) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// Grammar.g:115:27: ( ADD | SUB ) ^ bigbinExpr6
					{
					set159=input.LT(1);
					set159=input.LT(1);
					if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set159), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_bigbinExpr6_in_bigbinExpr5966);
					bigbinExpr6160=bigbinExpr6();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr6160.getTree());

					}
					break;

				default :
					break loop41;
				}
			}

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
		return retval;
	}
	// $ANTLR end "bigbinExpr5"


	public static class bigbinExpr6_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr6"
	// Grammar.g:117:1: bigbinExpr6 : bigunExpr ( ( STAR ^| DIV ^) bigunExpr )* ;
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

		try {
			// Grammar.g:117:13: ( bigunExpr ( ( STAR ^| DIV ^) bigunExpr )* )
			// Grammar.g:117:15: bigunExpr ( ( STAR ^| DIV ^) bigunExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigunExpr_in_bigbinExpr6977);
			bigunExpr161=bigunExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigunExpr161.getTree());

			// Grammar.g:117:25: ( ( STAR ^| DIV ^) bigunExpr )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==DIV||LA43_0==STAR) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// Grammar.g:117:26: ( STAR ^| DIV ^) bigunExpr
					{
					// Grammar.g:117:26: ( STAR ^| DIV ^)
					int alt42=2;
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
						throw nvae;
					}

					switch (alt42) {
						case 1 :
							// Grammar.g:117:27: STAR ^
							{
							STAR162=(Token)match(input,STAR,FOLLOW_STAR_in_bigbinExpr6981); 
							STAR162_tree = (CommonTree)adaptor.create(STAR162);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR162_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:117:33: DIV ^
							{
							DIV163=(Token)match(input,DIV,FOLLOW_DIV_in_bigbinExpr6984); 
							DIV163_tree = (CommonTree)adaptor.create(DIV163);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV163_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_bigunExpr_in_bigbinExpr6988);
					bigunExpr164=bigunExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigunExpr164.getTree());

					}
					break;

				default :
					break loop43;
				}
			}

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
		return retval;
	}
	// $ANTLR end "bigbinExpr6"


	public static class bigvectExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigvectExpr"
	// Grammar.g:119:1: bigvectExpr : bigstarExpr ( '[' ^ bigExpr ']' !)? ;
	public final GrammarParser.bigvectExpr_return bigvectExpr() throws RecognitionException {
		GrammarParser.bigvectExpr_return retval = new GrammarParser.bigvectExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal166=null;
		Token char_literal168=null;
		ParserRuleReturnScope bigstarExpr165 =null;
		ParserRuleReturnScope bigExpr167 =null;

		CommonTree char_literal166_tree=null;
		CommonTree char_literal168_tree=null;

		try {
			// Grammar.g:119:13: ( bigstarExpr ( '[' ^ bigExpr ']' !)? )
			// Grammar.g:119:15: bigstarExpr ( '[' ^ bigExpr ']' !)?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigstarExpr_in_bigvectExpr998);
			bigstarExpr165=bigstarExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigstarExpr165.getTree());

			// Grammar.g:119:27: ( '[' ^ bigExpr ']' !)?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==36) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// Grammar.g:119:28: '[' ^ bigExpr ']' !
					{
					char_literal166=(Token)match(input,36,FOLLOW_36_in_bigvectExpr1001); 
					char_literal166_tree = (CommonTree)adaptor.create(char_literal166);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal166_tree, root_0);

					pushFollow(FOLLOW_bigExpr_in_bigvectExpr1004);
					bigExpr167=bigExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigExpr167.getTree());

					char_literal168=(Token)match(input,37,FOLLOW_37_in_bigvectExpr1006); 
					}
					break;

			}

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
		return retval;
	}
	// $ANTLR end "bigvectExpr"


	public static class bigstarExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigstarExpr"
	// Grammar.g:121:1: bigstarExpr : ( STAR ^)? bigmoinsExpr ;
	public final GrammarParser.bigstarExpr_return bigstarExpr() throws RecognitionException {
		GrammarParser.bigstarExpr_return retval = new GrammarParser.bigstarExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR169=null;
		ParserRuleReturnScope bigmoinsExpr170 =null;

		CommonTree STAR169_tree=null;

		try {
			// Grammar.g:122:2: ( ( STAR ^)? bigmoinsExpr )
			// Grammar.g:122:5: ( STAR ^)? bigmoinsExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:122:9: ( STAR ^)?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==STAR) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Grammar.g:122:9: STAR ^
					{
					STAR169=(Token)match(input,STAR,FOLLOW_STAR_in_bigstarExpr1020); 
					STAR169_tree = (CommonTree)adaptor.create(STAR169);
					root_0 = (CommonTree)adaptor.becomeRoot(STAR169_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_bigmoinsExpr_in_bigstarExpr1024);
			bigmoinsExpr170=bigmoinsExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigmoinsExpr170.getTree());

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
		return retval;
	}
	// $ANTLR end "bigstarExpr"


	public static class bigmoinsExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigmoinsExpr"
	// Grammar.g:124:1: bigmoinsExpr : ( SUB ^)? bigatom ;
	public final GrammarParser.bigmoinsExpr_return bigmoinsExpr() throws RecognitionException {
		GrammarParser.bigmoinsExpr_return retval = new GrammarParser.bigmoinsExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUB171=null;
		ParserRuleReturnScope bigatom172 =null;

		CommonTree SUB171_tree=null;

		try {
			// Grammar.g:125:2: ( ( SUB ^)? bigatom )
			// Grammar.g:125:5: ( SUB ^)? bigatom
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:125:8: ( SUB ^)?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==SUB) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// Grammar.g:125:8: SUB ^
					{
					SUB171=(Token)match(input,SUB,FOLLOW_SUB_in_bigmoinsExpr1036); 
					SUB171_tree = (CommonTree)adaptor.create(SUB171);
					root_0 = (CommonTree)adaptor.becomeRoot(SUB171_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_bigatom_in_bigmoinsExpr1039);
			bigatom172=bigatom();
			state._fsp--;

			adaptor.addChild(root_0, bigatom172.getTree());

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
		return retval;
	}
	// $ANTLR end "bigmoinsExpr"


	public static class bigdotExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigdotExpr"
	// Grammar.g:128:1: bigdotExpr : bigvectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? ;
	public final GrammarParser.bigdotExpr_return bigdotExpr() throws RecognitionException {
		GrammarParser.bigdotExpr_return retval = new GrammarParser.bigdotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal174=null;
		Token IDF175=null;
		Token string_literal176=null;
		Token char_literal177=null;
		Token char_literal178=null;
		ParserRuleReturnScope bigvectExpr173 =null;

		CommonTree char_literal174_tree=null;
		CommonTree IDF175_tree=null;
		CommonTree string_literal176_tree=null;
		CommonTree char_literal177_tree=null;
		CommonTree char_literal178_tree=null;

		try {
			// Grammar.g:128:12: ( bigvectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? )
			// Grammar.g:128:14: bigvectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigvectExpr_in_bigdotExpr1048);
			bigvectExpr173=bigvectExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigvectExpr173.getTree());

			// Grammar.g:128:26: ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==33) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// Grammar.g:128:27: '.' ^ ( IDF | 'len' '(' ! ')' !)
					{
					char_literal174=(Token)match(input,33,FOLLOW_33_in_bigdotExpr1051); 
					char_literal174_tree = (CommonTree)adaptor.create(char_literal174);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal174_tree, root_0);

					// Grammar.g:128:32: ( IDF | 'len' '(' ! ')' !)
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==IDF) ) {
						alt47=1;
					}
					else if ( (LA47_0==43) ) {
						alt47=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}

					switch (alt47) {
						case 1 :
							// Grammar.g:128:33: IDF
							{
							IDF175=(Token)match(input,IDF,FOLLOW_IDF_in_bigdotExpr1055); 
							IDF175_tree = (CommonTree)adaptor.create(IDF175);
							adaptor.addChild(root_0, IDF175_tree);

							}
							break;
						case 2 :
							// Grammar.g:128:39: 'len' '(' ! ')' !
							{
							string_literal176=(Token)match(input,43,FOLLOW_43_in_bigdotExpr1059); 
							string_literal176_tree = (CommonTree)adaptor.create(string_literal176);
							adaptor.addChild(root_0, string_literal176_tree);

							char_literal177=(Token)match(input,29,FOLLOW_29_in_bigdotExpr1061); 
							char_literal178=(Token)match(input,30,FOLLOW_30_in_bigdotExpr1063); 
							}
							break;

					}

					}
					break;

			}

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
		return retval;
	}
	// $ANTLR end "bigdotExpr"


	public static class bigunExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigunExpr"
	// Grammar.g:130:1: bigunExpr : ( UNAIRE ^| EPERLU ^)? bigdotExpr ;
	public final GrammarParser.bigunExpr_return bigunExpr() throws RecognitionException {
		GrammarParser.bigunExpr_return retval = new GrammarParser.bigunExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE179=null;
		Token EPERLU180=null;
		ParserRuleReturnScope bigdotExpr181 =null;

		CommonTree UNAIRE179_tree=null;
		CommonTree EPERLU180_tree=null;

		try {
			// Grammar.g:130:11: ( ( UNAIRE ^| EPERLU ^)? bigdotExpr )
			// Grammar.g:130:13: ( UNAIRE ^| EPERLU ^)? bigdotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:130:13: ( UNAIRE ^| EPERLU ^)?
			int alt49=3;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==UNAIRE) ) {
				alt49=1;
			}
			else if ( (LA49_0==EPERLU) ) {
				alt49=2;
			}
			switch (alt49) {
				case 1 :
					// Grammar.g:130:14: UNAIRE ^
					{
					UNAIRE179=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigunExpr1077); 
					UNAIRE179_tree = (CommonTree)adaptor.create(UNAIRE179);
					root_0 = (CommonTree)adaptor.becomeRoot(UNAIRE179_tree, root_0);

					}
					break;
				case 2 :
					// Grammar.g:130:22: EPERLU ^
					{
					EPERLU180=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_bigunExpr1080); 
					EPERLU180_tree = (CommonTree)adaptor.create(EPERLU180);
					root_0 = (CommonTree)adaptor.becomeRoot(EPERLU180_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_bigdotExpr_in_bigunExpr1085);
			bigdotExpr181=bigdotExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigdotExpr181.getTree());

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
		return retval;
	}
	// $ANTLR end "bigunExpr"


	public static class bigExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigExpr"
	// Grammar.g:132:1: bigExpr : ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | bigbinExpr1 );
	public final GrammarParser.bigExpr_return bigExpr() throws RecognitionException {
		GrammarParser.bigExpr_return retval = new GrammarParser.bigExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal182=null;
		Token char_literal183=null;
		Token char_literal184=null;
		Token char_literal186=null;
		Token char_literal188=null;
		Token string_literal189=null;
		Token char_literal190=null;
		Token char_literal191=null;
		Token char_literal193=null;
		ParserRuleReturnScope expr185 =null;
		ParserRuleReturnScope expr187 =null;
		ParserRuleReturnScope expr192 =null;
		ParserRuleReturnScope block194 =null;
		ParserRuleReturnScope bigbinExpr1195 =null;

		CommonTree string_literal182_tree=null;
		CommonTree char_literal183_tree=null;
		CommonTree char_literal184_tree=null;
		CommonTree char_literal186_tree=null;
		CommonTree char_literal188_tree=null;
		CommonTree string_literal189_tree=null;
		CommonTree char_literal190_tree=null;
		CommonTree char_literal191_tree=null;
		CommonTree char_literal193_tree=null;
		RewriteRuleTokenStream stream_UNAIRE=new RewriteRuleTokenStream(adaptor,"token UNAIRE");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammar.g:133:3: ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | bigbinExpr1 )
			int alt51=4;
			switch ( input.LA(1) ) {
			case 50:
				{
				alt51=1;
				}
				break;
			case 47:
				{
				alt51=2;
				}
				break;
			case 52:
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
			case 29:
				{
				alt51=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}
			switch (alt51) {
				case 1 :
					// Grammar.g:133:3: 'vec' '!' '[' expr ( ',' expr )* ']'
					{
					string_literal182=(Token)match(input,50,FOLLOW_50_in_bigExpr1095);  
					stream_50.add(string_literal182);

					char_literal183=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1097);  
					stream_UNAIRE.add(char_literal183);

					char_literal184=(Token)match(input,36,FOLLOW_36_in_bigExpr1099);  
					stream_36.add(char_literal184);

					pushFollow(FOLLOW_expr_in_bigExpr1101);
					expr185=expr();
					state._fsp--;

					stream_expr.add(expr185.getTree());
					// Grammar.g:133:22: ( ',' expr )*
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==31) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// Grammar.g:133:23: ',' expr
							{
							char_literal186=(Token)match(input,31,FOLLOW_31_in_bigExpr1104);  
							stream_31.add(char_literal186);

							pushFollow(FOLLOW_expr_in_bigExpr1106);
							expr187=expr();
							state._fsp--;

							stream_expr.add(expr187.getTree());
							}
							break;

						default :
							break loop50;
						}
					}

					char_literal188=(Token)match(input,37,FOLLOW_37_in_bigExpr1109);  
					stream_37.add(char_literal188);

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
					// 133:37: -> ^( 'vec' ( expr )* )
					{
						// Grammar.g:133:40: ^( 'vec' ( expr )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_50.nextNode(), root_1);
						// Grammar.g:133:48: ( expr )*
						while ( stream_expr.hasNext() ) {
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
					// Grammar.g:134:3: 'print' '!' '(' expr ')'
					{
					string_literal189=(Token)match(input,47,FOLLOW_47_in_bigExpr1122);  
					stream_47.add(string_literal189);

					char_literal190=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1124);  
					stream_UNAIRE.add(char_literal190);

					char_literal191=(Token)match(input,29,FOLLOW_29_in_bigExpr1126);  
					stream_29.add(char_literal191);

					pushFollow(FOLLOW_expr_in_bigExpr1128);
					expr192=expr();
					state._fsp--;

					stream_expr.add(expr192.getTree());
					char_literal193=(Token)match(input,30,FOLLOW_30_in_bigExpr1130);  
					stream_30.add(char_literal193);

					// AST REWRITE
					// elements: expr, 47
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 134:28: -> ^( 'print' expr )
					{
						// Grammar.g:134:31: ^( 'print' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_47.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammar.g:135:3: block
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_block_in_bigExpr1141);
					block194=block();
					state._fsp--;

					adaptor.addChild(root_0, block194.getTree());

					}
					break;
				case 4 :
					// Grammar.g:136:3: bigbinExpr1
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bigbinExpr1_in_bigExpr1145);
					bigbinExpr1195=bigbinExpr1();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr1195.getTree());

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
		return retval;
	}
	// $ANTLR end "bigExpr"


	public static class bigatom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigatom"
	// Grammar.g:138:1: bigatom : ( INT | BOOL | IDF ^ ( newStruc | callFun )? | '(' bigExpr ')' -> bigExpr );
	public final GrammarParser.bigatom_return bigatom() throws RecognitionException {
		GrammarParser.bigatom_return retval = new GrammarParser.bigatom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT196=null;
		Token BOOL197=null;
		Token IDF198=null;
		Token char_literal201=null;
		Token char_literal203=null;
		ParserRuleReturnScope newStruc199 =null;
		ParserRuleReturnScope callFun200 =null;
		ParserRuleReturnScope bigExpr202 =null;

		CommonTree INT196_tree=null;
		CommonTree BOOL197_tree=null;
		CommonTree IDF198_tree=null;
		CommonTree char_literal201_tree=null;
		CommonTree char_literal203_tree=null;
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");

		try {
			// Grammar.g:138:9: ( INT | BOOL | IDF ^ ( newStruc | callFun )? | '(' bigExpr ')' -> bigExpr )
			int alt53=4;
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
			case 29:
				{
				alt53=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// Grammar.g:138:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT196=(Token)match(input,INT,FOLLOW_INT_in_bigatom1153); 
					INT196_tree = (CommonTree)adaptor.create(INT196);
					adaptor.addChild(root_0, INT196_tree);

					}
					break;
				case 2 :
					// Grammar.g:139:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL197=(Token)match(input,BOOL,FOLLOW_BOOL_in_bigatom1156); 
					BOOL197_tree = (CommonTree)adaptor.create(BOOL197);
					adaptor.addChild(root_0, BOOL197_tree);

					}
					break;
				case 3 :
					// Grammar.g:140:4: IDF ^ ( newStruc | callFun )?
					{
					root_0 = (CommonTree)adaptor.nil();


					IDF198=(Token)match(input,IDF,FOLLOW_IDF_in_bigatom1161); 
					IDF198_tree = (CommonTree)adaptor.create(IDF198);
					root_0 = (CommonTree)adaptor.becomeRoot(IDF198_tree, root_0);

					// Grammar.g:140:9: ( newStruc | callFun )?
					int alt52=3;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==52) ) {
						alt52=1;
					}
					else if ( (LA52_0==29) ) {
						alt52=2;
					}
					switch (alt52) {
						case 1 :
							// Grammar.g:140:10: newStruc
							{
							pushFollow(FOLLOW_newStruc_in_bigatom1165);
							newStruc199=newStruc();
							state._fsp--;

							adaptor.addChild(root_0, newStruc199.getTree());

							}
							break;
						case 2 :
							// Grammar.g:140:19: callFun
							{
							pushFollow(FOLLOW_callFun_in_bigatom1167);
							callFun200=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun200.getTree());

							}
							break;

					}

					}
					break;
				case 4 :
					// Grammar.g:141:3: '(' bigExpr ')'
					{
					char_literal201=(Token)match(input,29,FOLLOW_29_in_bigatom1172);  
					stream_29.add(char_literal201);

					pushFollow(FOLLOW_bigExpr_in_bigatom1173);
					bigExpr202=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr202.getTree());
					char_literal203=(Token)match(input,30,FOLLOW_30_in_bigatom1174);  
					stream_30.add(char_literal203);

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
					// 141:17: -> bigExpr
					{
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
	public static final BitSet FOLLOW_MAIN_in_declFun231 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declFun233 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_declFun235 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_block_in_declFun237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_type259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_type263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_type266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_type271 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_PREV_in_type274 = new BitSet(new long[]{0x0004044000085000L});
	public static final BitSet FOLLOW_type_in_type276 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NEXT_in_type278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EPERLU_in_type292 = new BitSet(new long[]{0x0004044000005000L});
	public static final BitSet FOLLOW_type_in_type294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_block311 = new BitSet(new long[]{0x003DB0882681D100L});
	public static final BitSet FOLLOW_instruct_in_block313 = new BitSet(new long[]{0x003DB0882681D100L});
	public static final BitSet FOLLOW_53_in_block316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_callFun335 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_callFun337 = new BitSet(new long[]{0x00000000C0000000L});
	public static final BitSet FOLLOW_31_in_callFun340 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_callFun342 = new BitSet(new long[]{0x00000000C0000000L});
	public static final BitSet FOLLOW_30_in_callFun346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_newStruc359 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_newStruc361 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_newStruc363 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc365 = new BitSet(new long[]{0x0020000080000000L});
	public static final BitSet FOLLOW_31_in_newStruc368 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_newStruc370 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_newStruc372 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc374 = new BitSet(new long[]{0x0020000080000000L});
	public static final BitSet FOLLOW_53_in_newStruc378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_instruct402 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruct404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_instruct412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_instruct418 = new BitSet(new long[]{0x0000400000004000L});
	public static final BitSet FOLLOW_46_in_instruct420 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_dotIDF_in_instruct423 = new BitSet(new long[]{0x0000000400002000L});
	public static final BitSet FOLLOW_34_in_instruct426 = new BitSet(new long[]{0x0004044000007000L});
	public static final BitSet FOLLOW_type_in_instruct428 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_instruct432 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_bigExpr_in_instruct434 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruct436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_instruct463 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_instruct465 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_block_in_instruct467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_instruct481 = new BitSet(new long[]{0x0014800826815100L});
	public static final BitSet FOLLOW_expr_in_instruct483 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruct486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_instruct499 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_block_in_instruct501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_instruct513 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruct515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpr_in_instruct523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_dotIDF534 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_dotIDF537 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_dotIDF540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifExpr550 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_ifExpr552 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr554 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_ifExpr557 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr2_in_binExpr1587 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_EQUAL_in_binExpr1590 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_binExpr2_in_binExpr1593 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_binExpr3_in_binExpr2604 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_ORBOOL_in_binExpr2606 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_binExpr3_in_binExpr2609 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_binExpr4_in_binExpr3620 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ANDBOOL_in_binExpr3622 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_binExpr4_in_binExpr3625 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_binExpr5_in_binExpr4636 = new BitSet(new long[]{0x0000000000580002L});
	public static final BitSet FOLLOW_PREV_in_binExpr4639 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_OPBOOLEQ_in_binExpr4642 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_NEXT_in_binExpr4645 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_binExpr5_in_binExpr4649 = new BitSet(new long[]{0x0000000000580002L});
	public static final BitSet FOLLOW_binExpr6_in_binExpr5660 = new BitSet(new long[]{0x0000000002000012L});
	public static final BitSet FOLLOW_ADD_in_binExpr5663 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_SUB_in_binExpr5666 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_binExpr6_in_binExpr5671 = new BitSet(new long[]{0x0000000002000012L});
	public static final BitSet FOLLOW_unExpr_in_binExpr6682 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_STAR_in_binExpr6686 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_DIV_in_binExpr6689 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_unExpr_in_binExpr6693 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_starExpr_in_vectExpr704 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_vectExpr707 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_vectExpr710 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_vectExpr712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_starExpr726 = new BitSet(new long[]{0x0000000022014100L});
	public static final BitSet FOLLOW_moinsExpr_in_starExpr730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_moinsExpr742 = new BitSet(new long[]{0x0000000020014100L});
	public static final BitSet FOLLOW_atom_in_moinsExpr745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vectExpr_in_dotExpr754 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_dotExpr757 = new BitSet(new long[]{0x0000080000004000L});
	public static final BitSet FOLLOW_IDF_in_dotExpr761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_dotExpr765 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_dotExpr767 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_dotExpr769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_unExpr783 = new BitSet(new long[]{0x0000000022814100L});
	public static final BitSet FOLLOW_EPERLU_in_unExpr786 = new BitSet(new long[]{0x0000000022814100L});
	public static final BitSet FOLLOW_dotExpr_in_unExpr791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_atom802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_atom807 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_callFun_in_atom812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_atom818 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_atom819 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_atom820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_expr832 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr834 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_expr836 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_expr838 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_expr840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_expr852 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr854 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_expr856 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_expr858 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_expr860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_expr871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr1_in_expr875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr2_in_bigbinExpr1884 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_EQUAL_in_bigbinExpr1887 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_bigbinExpr2_in_bigbinExpr1890 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_bigbinExpr3_in_bigbinExpr2901 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_ORBOOL_in_bigbinExpr2903 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_bigbinExpr3_in_bigbinExpr2906 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_bigbinExpr4_in_bigbinExpr3917 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ANDBOOL_in_bigbinExpr3919 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_bigbinExpr4_in_bigbinExpr3922 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_bigbinExpr5_in_bigbinExpr4933 = new BitSet(new long[]{0x0000000000580002L});
	public static final BitSet FOLLOW_PREV_in_bigbinExpr4936 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_OPBOOLEQ_in_bigbinExpr4939 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_NEXT_in_bigbinExpr4942 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_bigbinExpr5_in_bigbinExpr4946 = new BitSet(new long[]{0x0000000000580002L});
	public static final BitSet FOLLOW_bigbinExpr6_in_bigbinExpr5957 = new BitSet(new long[]{0x0000000002000012L});
	public static final BitSet FOLLOW_set_in_bigbinExpr5959 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_bigbinExpr6_in_bigbinExpr5966 = new BitSet(new long[]{0x0000000002000012L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr6977 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_STAR_in_bigbinExpr6981 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_DIV_in_bigbinExpr6984 = new BitSet(new long[]{0x0000000026815100L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr6988 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_bigstarExpr_in_bigvectExpr998 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_bigvectExpr1001 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_bigExpr_in_bigvectExpr1004 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_bigvectExpr1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_bigstarExpr1020 = new BitSet(new long[]{0x0000000022014100L});
	public static final BitSet FOLLOW_bigmoinsExpr_in_bigstarExpr1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_bigmoinsExpr1036 = new BitSet(new long[]{0x0000000020014100L});
	public static final BitSet FOLLOW_bigatom_in_bigmoinsExpr1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigvectExpr_in_bigdotExpr1048 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_bigdotExpr1051 = new BitSet(new long[]{0x0000080000004000L});
	public static final BitSet FOLLOW_IDF_in_bigdotExpr1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_bigdotExpr1059 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_bigdotExpr1061 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_bigdotExpr1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_bigunExpr1077 = new BitSet(new long[]{0x0000000022814100L});
	public static final BitSet FOLLOW_EPERLU_in_bigunExpr1080 = new BitSet(new long[]{0x0000000022814100L});
	public static final BitSet FOLLOW_bigdotExpr_in_bigunExpr1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_bigExpr1095 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1097 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_bigExpr1099 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_bigExpr1101 = new BitSet(new long[]{0x0000002080000000L});
	public static final BitSet FOLLOW_31_in_bigExpr1104 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_bigExpr1106 = new BitSet(new long[]{0x0000002080000000L});
	public static final BitSet FOLLOW_37_in_bigExpr1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_bigExpr1122 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1124 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_bigExpr1126 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_expr_in_bigExpr1128 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_bigExpr1130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_bigExpr1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr1_in_bigExpr1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_bigatom1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_bigatom1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_bigatom1161 = new BitSet(new long[]{0x0010000020000002L});
	public static final BitSet FOLLOW_newStruc_in_bigatom1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callFun_in_bigatom1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_bigatom1172 = new BitSet(new long[]{0x0014800026815100L});
	public static final BitSet FOLLOW_bigExpr_in_bigatom1173 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_bigatom1174 = new BitSet(new long[]{0x0000000000000002L});
}
