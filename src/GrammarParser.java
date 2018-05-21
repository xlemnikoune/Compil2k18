// $ANTLR 3.5.2 Grammar.g 2018-05-21 16:46:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class GrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ANDBOOL", "ANOBLOCK", 
		"ATTRIBUTE", "BLOCK", "BOOL", "CALLFUN", "COMMENT", "DIV", "EPERLU", "EQUAL", 
		"IDF", "IF", "INT", "MAIN", "NEW", "NEXT", "OPBOOLEQ", "ORBOOL", "PREV", 
		"RES", "STAR", "STRING", "SUB", "UNAIRE", "UNISTAR", "UNISUB", "VEC", 
		"WS", "'('", "')'", "','", "'->'", "'.'", "':'", "';'", "'['", "']'", 
		"'bool'", "'break'", "'else'", "'fn'", "'i32'", "'input'", "'len'", "'let'", 
		"'mut'", "'print'", "'raw_print'", "'return'", "'struct'", "'vec'", "'while'", 
		"'{'", "'}'"
	};
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
	public static final int T__58=58;
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
	// Grammar.g:25:1: axiom : fichier EOF -> fichier ;
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
			// Grammar.g:25:7: ( fichier EOF -> fichier )
			// Grammar.g:25:9: fichier EOF
			{
			pushFollow(FOLLOW_fichier_in_axiom95);
			fichier1=fichier();
			state._fsp--;

			stream_fichier.add(fichier1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_axiom97);  
			stream_EOF.add(EOF2);

			if (!mainFound){System.err.println("main not found");}
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
			// 25:78: -> fichier
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
	// Grammar.g:28:1: fichier : ( decl )* ;
	public final GrammarParser.fichier_return fichier() throws RecognitionException {
		GrammarParser.fichier_return retval = new GrammarParser.fichier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope decl3 =null;


		try {
			// Grammar.g:28:9: ( ( decl )* )
			// Grammar.g:28:11: ( decl )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:28:11: ( decl )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==45||LA1_0==54) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Grammar.g:28:11: decl
					{
					pushFollow(FOLLOW_decl_in_fichier113);
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
	// Grammar.g:31:1: decl : ( declFun | declStruct );
	public final GrammarParser.decl_return decl() throws RecognitionException {
		GrammarParser.decl_return retval = new GrammarParser.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declFun4 =null;
		ParserRuleReturnScope declStruct5 =null;


		try {
			// Grammar.g:31:6: ( declFun | declStruct )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==45) ) {
				alt2=1;
			}
			else if ( (LA2_0==54) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Grammar.g:31:8: declFun
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_declFun_in_decl124);
					declFun4=declFun();
					state._fsp--;

					adaptor.addChild(root_0, declFun4.getTree());

					}
					break;
				case 2 :
					// Grammar.g:32:3: declStruct
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_declStruct_in_decl129);
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
	// Grammar.g:35:1: declStruct : 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) ;
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
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");

		try {
			// Grammar.g:35:12: ( 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) )
			// Grammar.g:35:14: 'struct' IDF '{' ( args )? '}'
			{
			string_literal6=(Token)match(input,54,FOLLOW_54_in_declStruct138);  
			stream_54.add(string_literal6);

			IDF7=(Token)match(input,IDF,FOLLOW_IDF_in_declStruct140);  
			stream_IDF.add(IDF7);

			char_literal8=(Token)match(input,57,FOLLOW_57_in_declStruct142);  
			stream_57.add(char_literal8);

			// Grammar.g:35:31: ( args )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==IDF) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Grammar.g:35:31: args
					{
					pushFollow(FOLLOW_args_in_declStruct144);
					args9=args();
					state._fsp--;

					stream_args.add(args9.getTree());
					}
					break;

			}

			char_literal10=(Token)match(input,58,FOLLOW_58_in_declStruct147);  
			stream_58.add(char_literal10);

			// AST REWRITE
			// elements: 54, IDF, args
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 35:41: -> ^( 'struct' IDF ( args )? )
			{
				// Grammar.g:35:44: ^( 'struct' IDF ( args )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_54.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDF.nextNode());
				// Grammar.g:35:59: ( args )?
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
	// Grammar.g:38:1: args : IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* ;
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Grammar.g:38:6: ( IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* )
			// Grammar.g:38:8: IDF ':' type ( ',' IDF ':' type )*
			{
			IDF11=(Token)match(input,IDF,FOLLOW_IDF_in_args168);  
			stream_IDF.add(IDF11);

			char_literal12=(Token)match(input,38,FOLLOW_38_in_args170);  
			stream_38.add(char_literal12);

			pushFollow(FOLLOW_type_in_args172);
			type13=type();
			state._fsp--;

			stream_type.add(type13.getTree());
			// Grammar.g:38:21: ( ',' IDF ':' type )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==35) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Grammar.g:38:22: ',' IDF ':' type
					{
					char_literal14=(Token)match(input,35,FOLLOW_35_in_args175);  
					stream_35.add(char_literal14);

					IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_args177);  
					stream_IDF.add(IDF15);

					char_literal16=(Token)match(input,38,FOLLOW_38_in_args179);  
					stream_38.add(char_literal16);

					pushFollow(FOLLOW_type_in_args181);
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
			// elements: type, IDF
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 38:41: -> ( ^( IDF type ) )*
			{
				// Grammar.g:38:44: ( ^( IDF type ) )*
				while ( stream_type.hasNext()||stream_IDF.hasNext() ) {
					// Grammar.g:38:45: ^( IDF type )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					root_1 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);
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
		return retval;
	}
	// $ANTLR end "args"


	public static class declFun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declFun"
	// Grammar.g:41:1: declFun : 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) ;
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
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_MAIN=new RewriteRuleTokenStream(adaptor,"token MAIN");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Grammar.g:41:9: ( 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) )
			// Grammar.g:41:11: 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
			{
			string_literal18=(Token)match(input,45,FOLLOW_45_in_declFun203);  
			stream_45.add(string_literal18);

			// Grammar.g:41:16: ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
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
					// Grammar.g:41:17: IDF '(' ( args )? ')' ( '->' type )? block
					{
					IDF19=(Token)match(input,IDF,FOLLOW_IDF_in_declFun206);  
					stream_IDF.add(IDF19);

					char_literal20=(Token)match(input,33,FOLLOW_33_in_declFun208);  
					stream_33.add(char_literal20);

					// Grammar.g:41:25: ( args )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==IDF) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Grammar.g:41:25: args
							{
							pushFollow(FOLLOW_args_in_declFun210);
							args21=args();
							state._fsp--;

							stream_args.add(args21.getTree());
							}
							break;

					}

					char_literal22=(Token)match(input,34,FOLLOW_34_in_declFun213);  
					stream_34.add(char_literal22);

					// Grammar.g:41:35: ( '->' type )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==36) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// Grammar.g:41:36: '->' type
							{
							string_literal23=(Token)match(input,36,FOLLOW_36_in_declFun216);  
							stream_36.add(string_literal23);

							pushFollow(FOLLOW_type_in_declFun218);
							type24=type();
							state._fsp--;

							stream_type.add(type24.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_block_in_declFun222);
					block25=block();
					state._fsp--;

					stream_block.add(block25.getTree());
					// AST REWRITE
					// elements: args, 36, block, type, 45, IDF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 41:54: -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block )
					{
						// Grammar.g:41:57: ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);
						adaptor.addChild(root_1, stream_IDF.nextNode());
						// Grammar.g:41:68: ( ^( '->' type ) )?
						if ( stream_36.hasNext()||stream_type.hasNext() ) {
							// Grammar.g:41:68: ^( '->' type )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_36.nextNode(), root_2);
							adaptor.addChild(root_2, stream_type.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_36.reset();
						stream_type.reset();

						// Grammar.g:41:82: ( args )?
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
					// Grammar.g:42:4: MAIN '(' ')' block
					{
					mainFound = true;
					MAIN26=(Token)match(input,MAIN,FOLLOW_MAIN_in_declFun249);  
					stream_MAIN.add(MAIN26);

					char_literal27=(Token)match(input,33,FOLLOW_33_in_declFun251);  
					stream_33.add(char_literal27);

					char_literal28=(Token)match(input,34,FOLLOW_34_in_declFun253);  
					stream_34.add(char_literal28);

					pushFollow(FOLLOW_block_in_declFun255);
					block29=block();
					state._fsp--;

					stream_block.add(block29.getTree());
					// AST REWRITE
					// elements: MAIN, 45, block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 42:42: -> ^( 'fn' MAIN block )
					{
						// Grammar.g:42:45: ^( 'fn' MAIN block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);
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
	// Grammar.g:45:1: type : (| 'i32' | 'bool' | IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) );
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
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_PREV=new RewriteRuleTokenStream(adaptor,"token PREV");
		RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
		RewriteRuleTokenStream stream_EPERLU=new RewriteRuleTokenStream(adaptor,"token EPERLU");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Grammar.g:45:6: (| 'i32' | 'bool' | IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) )
			int alt8=6;
			switch ( input.LA(1) ) {
			case EQUAL:
			case NEXT:
			case 34:
			case 35:
			case 57:
			case 58:
				{
				alt8=1;
				}
				break;
			case 46:
				{
				alt8=2;
				}
				break;
			case 42:
				{
				alt8=3;
				}
				break;
			case IDF:
				{
				alt8=4;
				}
				break;
			case 55:
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
					// Grammar.g:45:8: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// Grammar.g:45:10: 'i32'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal30=(Token)match(input,46,FOLLOW_46_in_type277); 
					string_literal30_tree = (CommonTree)adaptor.create(string_literal30);
					adaptor.addChild(root_0, string_literal30_tree);

					}
					break;
				case 3 :
					// Grammar.g:46:3: 'bool'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal31=(Token)match(input,42,FOLLOW_42_in_type281); 
					string_literal31_tree = (CommonTree)adaptor.create(string_literal31);
					adaptor.addChild(root_0, string_literal31_tree);

					}
					break;
				case 4 :
					// Grammar.g:47:2: IDF
					{
					root_0 = (CommonTree)adaptor.nil();


					IDF32=(Token)match(input,IDF,FOLLOW_IDF_in_type284); 
					IDF32_tree = (CommonTree)adaptor.create(IDF32);
					adaptor.addChild(root_0, IDF32_tree);

					}
					break;
				case 5 :
					// Grammar.g:48:4: 'vec' ( '<' type '>' )
					{
					string_literal33=(Token)match(input,55,FOLLOW_55_in_type289);  
					stream_55.add(string_literal33);

					// Grammar.g:48:10: ( '<' type '>' )
					// Grammar.g:48:11: '<' type '>'
					{
					char_literal34=(Token)match(input,PREV,FOLLOW_PREV_in_type292);  
					stream_PREV.add(char_literal34);

					pushFollow(FOLLOW_type_in_type294);
					type35=type();
					state._fsp--;

					stream_type.add(type35.getTree());
					char_literal36=(Token)match(input,NEXT,FOLLOW_NEXT_in_type296);  
					stream_NEXT.add(char_literal36);

					}

					// AST REWRITE
					// elements: 55, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 48:25: -> ^( 'vec' type )
					{
						// Grammar.g:48:28: ^( 'vec' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_55.nextNode(), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Grammar.g:49:3: '&' type
					{
					char_literal37=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_type310);  
					stream_EPERLU.add(char_literal37);

					pushFollow(FOLLOW_type_in_type312);
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
					// 49:12: -> ^( '&' type )
					{
						// Grammar.g:49:15: ^( '&' type )
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
	// Grammar.g:52:1: block : '{' instruct '}' -> ^( BLOCK instruct ) ;
	public final GrammarParser.block_return block() throws RecognitionException {
		GrammarParser.block_return retval = new GrammarParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal39=null;
		Token char_literal41=null;
		ParserRuleReturnScope instruct40 =null;

		CommonTree char_literal39_tree=null;
		CommonTree char_literal41_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleSubtreeStream stream_instruct=new RewriteRuleSubtreeStream(adaptor,"rule instruct");

		try {
			// Grammar.g:52:7: ( '{' instruct '}' -> ^( BLOCK instruct ) )
			// Grammar.g:52:9: '{' instruct '}'
			{
			char_literal39=(Token)match(input,57,FOLLOW_57_in_block329);  
			stream_57.add(char_literal39);

			pushFollow(FOLLOW_instruct_in_block331);
			instruct40=instruct();
			state._fsp--;

			stream_instruct.add(instruct40.getTree());
			char_literal41=(Token)match(input,58,FOLLOW_58_in_block332);  
			stream_58.add(char_literal41);

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
			// 52:24: -> ^( BLOCK instruct )
			{
				// Grammar.g:52:27: ^( BLOCK instruct )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				adaptor.addChild(root_1, stream_instruct.nextTree());
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
	// Grammar.g:56:1: callFun : '(' ( expr ( ',' expr )* )? ')' -> ^( CALLFUN ( expr )* ) ;
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammar.g:56:9: ( '(' ( expr ( ',' expr )* )? ')' -> ^( CALLFUN ( expr )* ) )
			// Grammar.g:56:11: '(' ( expr ( ',' expr )* )? ')'
			{
			char_literal42=(Token)match(input,33,FOLLOW_33_in_callFun351);  
			stream_33.add(char_literal42);

			// Grammar.g:56:15: ( expr ( ',' expr )* )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BOOL||LA10_0==EPERLU||LA10_0==IDF||LA10_0==INT||LA10_0==STAR||(LA10_0 >= SUB && LA10_0 <= UNAIRE)||LA10_0==33||LA10_0==47||(LA10_0 >= 51 && LA10_0 <= 52)||LA10_0==55||LA10_0==57) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Grammar.g:56:16: expr ( ',' expr )*
					{
					pushFollow(FOLLOW_expr_in_callFun354);
					expr43=expr();
					state._fsp--;

					stream_expr.add(expr43.getTree());
					// Grammar.g:56:21: ( ',' expr )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==35) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// Grammar.g:56:22: ',' expr
							{
							char_literal44=(Token)match(input,35,FOLLOW_35_in_callFun357);  
							stream_35.add(char_literal44);

							pushFollow(FOLLOW_expr_in_callFun359);
							expr45=expr();
							state._fsp--;

							stream_expr.add(expr45.getTree());
							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;

			}

			char_literal46=(Token)match(input,34,FOLLOW_34_in_callFun365);  
			stream_34.add(char_literal46);

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
			// 56:39: -> ^( CALLFUN ( expr )* )
			{
				// Grammar.g:56:42: ^( CALLFUN ( expr )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALLFUN, "CALLFUN"), root_1);
				// Grammar.g:56:52: ( expr )*
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

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
	// $ANTLR end "callFun"


	public static class newStruc_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "newStruc"
	// Grammar.g:58:1: newStruc : '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) ;
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");

		try {
			// Grammar.g:58:10: ( '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) )
			// Grammar.g:58:12: '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}'
			{
			char_literal47=(Token)match(input,57,FOLLOW_57_in_newStruc382);  
			stream_57.add(char_literal47);

			IDF48=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc384);  
			stream_IDF.add(IDF48);

			char_literal49=(Token)match(input,38,FOLLOW_38_in_newStruc386);  
			stream_38.add(char_literal49);

			pushFollow(FOLLOW_bigExpr_in_newStruc388);
			bigExpr50=bigExpr();
			state._fsp--;

			stream_bigExpr.add(bigExpr50.getTree());
			// Grammar.g:58:32: ( ',' IDF ':' bigExpr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==35) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Grammar.g:58:33: ',' IDF ':' bigExpr
					{
					char_literal51=(Token)match(input,35,FOLLOW_35_in_newStruc391);  
					stream_35.add(char_literal51);

					IDF52=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc393);  
					stream_IDF.add(IDF52);

					char_literal53=(Token)match(input,38,FOLLOW_38_in_newStruc395);  
					stream_38.add(char_literal53);

					pushFollow(FOLLOW_bigExpr_in_newStruc397);
					bigExpr54=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr54.getTree());
					}
					break;

				default :
					break loop11;
				}
			}

			char_literal55=(Token)match(input,58,FOLLOW_58_in_newStruc401);  
			stream_58.add(char_literal55);

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
			// 58:59: -> ^( NEW ( ^( IDF bigExpr ) )* )
			{
				// Grammar.g:58:62: ^( NEW ( ^( IDF bigExpr ) )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);
				// Grammar.g:58:68: ( ^( IDF bigExpr ) )*
				while ( stream_bigExpr.hasNext()||stream_IDF.hasNext() ) {
					// Grammar.g:58:68: ^( IDF bigExpr )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);
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
		return retval;
	}
	// $ANTLR end "newStruc"


	public static class instrBoucle_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instrBoucle"
	// Grammar.g:60:1: instrBoucle : ( ';' ( instruct )? -> ( instruct )? | -> RES );
	public final GrammarParser.instrBoucle_return instrBoucle() throws RecognitionException {
		GrammarParser.instrBoucle_return retval = new GrammarParser.instrBoucle_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal56=null;
		ParserRuleReturnScope instruct57 =null;

		CommonTree char_literal56_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_instruct=new RewriteRuleSubtreeStream(adaptor,"rule instruct");

		try {
			// Grammar.g:61:2: ( ';' ( instruct )? -> ( instruct )? | -> RES )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==39) ) {
				alt13=1;
			}
			else if ( (LA13_0==58) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// Grammar.g:61:4: ';' ( instruct )?
					{
					char_literal56=(Token)match(input,39,FOLLOW_39_in_instrBoucle424);  
					stream_39.add(char_literal56);

					// Grammar.g:61:8: ( instruct )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==BOOL||LA12_0==EPERLU||(LA12_0 >= IDF && LA12_0 <= INT)||LA12_0==STAR||(LA12_0 >= SUB && LA12_0 <= UNAIRE)||LA12_0==33||LA12_0==39||LA12_0==43||LA12_0==47||LA12_0==49||(LA12_0 >= 51 && LA12_0 <= 53)||(LA12_0 >= 55 && LA12_0 <= 57)) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// Grammar.g:61:8: instruct
							{
							pushFollow(FOLLOW_instruct_in_instrBoucle426);
							instruct57=instruct();
							state._fsp--;

							stream_instruct.add(instruct57.getTree());
							}
							break;

					}

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
					// 61:18: -> ( instruct )?
					{
						// Grammar.g:61:21: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:62:4: 
					{
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
					// 62:4: -> RES
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(RES, "RES"));
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
	// $ANTLR end "instrBoucle"


	public static class instruct_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruct"
	// Grammar.g:64:1: instruct : ( expr instrBoucle | ';' ( instruct )? -> ( instruct )? | 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' ( instruct )? -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) ( instruct )? | 'while' expr block ( instruct )? -> ^( 'while' expr block ) ( instruct )? | 'return' ( expr )? ';' ( instruct )? -> ^( 'return' ( expr )? ) ( instruct )? | 'break' ';' ( instruct )? -> 'break' ( instruct )? | ifExpr ( instruct )? );
	public final GrammarParser.instruct_return instruct() throws RecognitionException {
		GrammarParser.instruct_return retval = new GrammarParser.instruct_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal60=null;
		Token string_literal62=null;
		Token string_literal63=null;
		Token char_literal65=null;
		Token char_literal67=null;
		Token char_literal69=null;
		Token string_literal71=null;
		Token string_literal75=null;
		Token char_literal77=null;
		Token string_literal79=null;
		Token char_literal80=null;
		ParserRuleReturnScope expr58 =null;
		ParserRuleReturnScope instrBoucle59 =null;
		ParserRuleReturnScope instruct61 =null;
		ParserRuleReturnScope dotIDF64 =null;
		ParserRuleReturnScope type66 =null;
		ParserRuleReturnScope bigExpr68 =null;
		ParserRuleReturnScope instruct70 =null;
		ParserRuleReturnScope expr72 =null;
		ParserRuleReturnScope block73 =null;
		ParserRuleReturnScope instruct74 =null;
		ParserRuleReturnScope expr76 =null;
		ParserRuleReturnScope instruct78 =null;
		ParserRuleReturnScope instruct81 =null;
		ParserRuleReturnScope ifExpr82 =null;
		ParserRuleReturnScope instruct83 =null;

		CommonTree char_literal60_tree=null;
		CommonTree string_literal62_tree=null;
		CommonTree string_literal63_tree=null;
		CommonTree char_literal65_tree=null;
		CommonTree char_literal67_tree=null;
		CommonTree char_literal69_tree=null;
		CommonTree string_literal71_tree=null;
		CommonTree string_literal75_tree=null;
		CommonTree char_literal77_tree=null;
		CommonTree string_literal79_tree=null;
		CommonTree char_literal80_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_instruct=new RewriteRuleSubtreeStream(adaptor,"rule instruct");
		RewriteRuleSubtreeStream stream_dotIDF=new RewriteRuleSubtreeStream(adaptor,"rule dotIDF");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Grammar.g:64:10: ( expr instrBoucle | ';' ( instruct )? -> ( instruct )? | 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' ( instruct )? -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) ( instruct )? | 'while' expr block ( instruct )? -> ^( 'while' expr block ) ( instruct )? | 'return' ( expr )? ';' ( instruct )? -> ^( 'return' ( expr )? ) ( instruct )? | 'break' ';' ( instruct )? -> 'break' ( instruct )? | ifExpr ( instruct )? )
			int alt23=7;
			switch ( input.LA(1) ) {
			case BOOL:
			case EPERLU:
			case IDF:
			case INT:
			case STAR:
			case SUB:
			case UNAIRE:
			case 33:
			case 47:
			case 51:
			case 52:
			case 55:
			case 57:
				{
				alt23=1;
				}
				break;
			case 39:
				{
				alt23=2;
				}
				break;
			case 49:
				{
				alt23=3;
				}
				break;
			case 56:
				{
				alt23=4;
				}
				break;
			case 53:
				{
				alt23=5;
				}
				break;
			case 43:
				{
				alt23=6;
				}
				break;
			case IF:
				{
				alt23=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// Grammar.g:65:3: expr instrBoucle
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expr_in_instruct450);
					expr58=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr58.getTree());

					pushFollow(FOLLOW_instrBoucle_in_instruct452);
					instrBoucle59=instrBoucle();
					state._fsp--;

					adaptor.addChild(root_0, instrBoucle59.getTree());

					}
					break;
				case 2 :
					// Grammar.g:66:3: ';' ( instruct )?
					{
					char_literal60=(Token)match(input,39,FOLLOW_39_in_instruct456);  
					stream_39.add(char_literal60);

					// Grammar.g:66:7: ( instruct )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==BOOL||LA14_0==EPERLU||(LA14_0 >= IDF && LA14_0 <= INT)||LA14_0==STAR||(LA14_0 >= SUB && LA14_0 <= UNAIRE)||LA14_0==33||LA14_0==39||LA14_0==43||LA14_0==47||LA14_0==49||(LA14_0 >= 51 && LA14_0 <= 53)||(LA14_0 >= 55 && LA14_0 <= 57)) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// Grammar.g:66:7: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct458);
							instruct61=instruct();
							state._fsp--;

							stream_instruct.add(instruct61.getTree());
							}
							break;

					}

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
					// 66:16: -> ( instruct )?
					{
						// Grammar.g:66:19: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammar.g:67:3: 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' ( instruct )?
					{
					string_literal62=(Token)match(input,49,FOLLOW_49_in_instruct467);  
					stream_49.add(string_literal62);

					// Grammar.g:67:9: ( 'mut' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==50) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// Grammar.g:67:9: 'mut'
							{
							string_literal63=(Token)match(input,50,FOLLOW_50_in_instruct469);  
							stream_50.add(string_literal63);

							}
							break;

					}

					pushFollow(FOLLOW_dotIDF_in_instruct472);
					dotIDF64=dotIDF();
					state._fsp--;

					stream_dotIDF.add(dotIDF64.getTree());
					// Grammar.g:67:23: ( ':' type )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==38) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// Grammar.g:67:24: ':' type
							{
							char_literal65=(Token)match(input,38,FOLLOW_38_in_instruct475);  
							stream_38.add(char_literal65);

							pushFollow(FOLLOW_type_in_instruct477);
							type66=type();
							state._fsp--;

							stream_type.add(type66.getTree());
							}
							break;

					}

					char_literal67=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instruct481);  
					stream_EQUAL.add(char_literal67);

					pushFollow(FOLLOW_bigExpr_in_instruct483);
					bigExpr68=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr68.getTree());
					char_literal69=(Token)match(input,39,FOLLOW_39_in_instruct485);  
					stream_39.add(char_literal69);

					// Grammar.g:67:51: ( instruct )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==BOOL||LA17_0==EPERLU||(LA17_0 >= IDF && LA17_0 <= INT)||LA17_0==STAR||(LA17_0 >= SUB && LA17_0 <= UNAIRE)||LA17_0==33||LA17_0==39||LA17_0==43||LA17_0==47||LA17_0==49||(LA17_0 >= 51 && LA17_0 <= 53)||(LA17_0 >= 55 && LA17_0 <= 57)) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// Grammar.g:67:51: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct487);
							instruct70=instruct();
							state._fsp--;

							stream_instruct.add(instruct70.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: type, bigExpr, instruct, EQUAL, 49, 50, dotIDF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 67:60: -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) ( instruct )?
					{
						// Grammar.g:67:63: ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_49.nextNode(), root_1);
						// Grammar.g:67:71: ( 'mut' )?
						if ( stream_50.hasNext() ) {
							adaptor.addChild(root_1, stream_50.nextNode());
						}
						stream_50.reset();

						// Grammar.g:67:78: ( type )?
						if ( stream_type.hasNext() ) {
							adaptor.addChild(root_1, stream_type.nextTree());
						}
						stream_type.reset();

						// Grammar.g:67:86: ^( '=' dotIDF bigExpr )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_EQUAL.nextNode(), root_2);
						adaptor.addChild(root_2, stream_dotIDF.nextTree());
						adaptor.addChild(root_2, stream_bigExpr.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

						// Grammar.g:67:110: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Grammar.g:68:3: 'while' expr block ( instruct )?
					{
					string_literal71=(Token)match(input,56,FOLLOW_56_in_instruct517);  
					stream_56.add(string_literal71);

					pushFollow(FOLLOW_expr_in_instruct519);
					expr72=expr();
					state._fsp--;

					stream_expr.add(expr72.getTree());
					pushFollow(FOLLOW_block_in_instruct521);
					block73=block();
					state._fsp--;

					stream_block.add(block73.getTree());
					// Grammar.g:68:22: ( instruct )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==BOOL||LA18_0==EPERLU||(LA18_0 >= IDF && LA18_0 <= INT)||LA18_0==STAR||(LA18_0 >= SUB && LA18_0 <= UNAIRE)||LA18_0==33||LA18_0==39||LA18_0==43||LA18_0==47||LA18_0==49||(LA18_0 >= 51 && LA18_0 <= 53)||(LA18_0 >= 55 && LA18_0 <= 57)) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// Grammar.g:68:22: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct523);
							instruct74=instruct();
							state._fsp--;

							stream_instruct.add(instruct74.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: 56, instruct, block, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 68:31: -> ^( 'while' expr block ) ( instruct )?
					{
						// Grammar.g:68:34: ^( 'while' expr block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_56.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

						// Grammar.g:68:56: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Grammar.g:69:3: 'return' ( expr )? ';' ( instruct )?
					{
					string_literal75=(Token)match(input,53,FOLLOW_53_in_instruct540);  
					stream_53.add(string_literal75);

					// Grammar.g:69:12: ( expr )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==BOOL||LA19_0==EPERLU||LA19_0==IDF||LA19_0==INT||LA19_0==STAR||(LA19_0 >= SUB && LA19_0 <= UNAIRE)||LA19_0==33||LA19_0==47||(LA19_0 >= 51 && LA19_0 <= 52)||LA19_0==55||LA19_0==57) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// Grammar.g:69:12: expr
							{
							pushFollow(FOLLOW_expr_in_instruct542);
							expr76=expr();
							state._fsp--;

							stream_expr.add(expr76.getTree());
							}
							break;

					}

					char_literal77=(Token)match(input,39,FOLLOW_39_in_instruct545);  
					stream_39.add(char_literal77);

					// Grammar.g:69:22: ( instruct )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==BOOL||LA20_0==EPERLU||(LA20_0 >= IDF && LA20_0 <= INT)||LA20_0==STAR||(LA20_0 >= SUB && LA20_0 <= UNAIRE)||LA20_0==33||LA20_0==39||LA20_0==43||LA20_0==47||LA20_0==49||(LA20_0 >= 51 && LA20_0 <= 53)||(LA20_0 >= 55 && LA20_0 <= 57)) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// Grammar.g:69:22: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct547);
							instruct78=instruct();
							state._fsp--;

							stream_instruct.add(instruct78.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: 53, instruct, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 69:31: -> ^( 'return' ( expr )? ) ( instruct )?
					{
						// Grammar.g:69:34: ^( 'return' ( expr )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_53.nextNode(), root_1);
						// Grammar.g:69:45: ( expr )?
						if ( stream_expr.hasNext() ) {
							adaptor.addChild(root_1, stream_expr.nextTree());
						}
						stream_expr.reset();

						adaptor.addChild(root_0, root_1);
						}

						// Grammar.g:69:52: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Grammar.g:70:3: 'break' ';' ( instruct )?
					{
					string_literal79=(Token)match(input,43,FOLLOW_43_in_instruct563);  
					stream_43.add(string_literal79);

					char_literal80=(Token)match(input,39,FOLLOW_39_in_instruct565);  
					stream_39.add(char_literal80);

					// Grammar.g:70:15: ( instruct )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==BOOL||LA21_0==EPERLU||(LA21_0 >= IDF && LA21_0 <= INT)||LA21_0==STAR||(LA21_0 >= SUB && LA21_0 <= UNAIRE)||LA21_0==33||LA21_0==39||LA21_0==43||LA21_0==47||LA21_0==49||(LA21_0 >= 51 && LA21_0 <= 53)||(LA21_0 >= 55 && LA21_0 <= 57)) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// Grammar.g:70:15: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct567);
							instruct81=instruct();
							state._fsp--;

							stream_instruct.add(instruct81.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: 43, instruct
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 70:24: -> 'break' ( instruct )?
					{
						adaptor.addChild(root_0, stream_43.nextNode());
						// Grammar.g:70:35: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// Grammar.g:71:3: ifExpr ( instruct )?
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifExpr_in_instruct578);
					ifExpr82=ifExpr();
					state._fsp--;

					adaptor.addChild(root_0, ifExpr82.getTree());

					// Grammar.g:71:10: ( instruct )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==BOOL||LA22_0==EPERLU||(LA22_0 >= IDF && LA22_0 <= INT)||LA22_0==STAR||(LA22_0 >= SUB && LA22_0 <= UNAIRE)||LA22_0==33||LA22_0==39||LA22_0==43||LA22_0==47||LA22_0==49||(LA22_0 >= 51 && LA22_0 <= 53)||(LA22_0 >= 55 && LA22_0 <= 57)) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// Grammar.g:71:10: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct580);
							instruct83=instruct();
							state._fsp--;

							adaptor.addChild(root_0, instruct83.getTree());

							}
							break;

					}

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
	// Grammar.g:74:1: dotIDF : IDF ( '.' ^ IDF )? ;
	public final GrammarParser.dotIDF_return dotIDF() throws RecognitionException {
		GrammarParser.dotIDF_return retval = new GrammarParser.dotIDF_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF84=null;
		Token char_literal85=null;
		Token IDF86=null;

		CommonTree IDF84_tree=null;
		CommonTree char_literal85_tree=null;
		CommonTree IDF86_tree=null;

		try {
			// Grammar.g:74:9: ( IDF ( '.' ^ IDF )? )
			// Grammar.g:75:1: IDF ( '.' ^ IDF )?
			{
			root_0 = (CommonTree)adaptor.nil();


			IDF84=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF592); 
			IDF84_tree = (CommonTree)adaptor.create(IDF84);
			adaptor.addChild(root_0, IDF84_tree);

			// Grammar.g:75:5: ( '.' ^ IDF )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==37) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Grammar.g:75:6: '.' ^ IDF
					{
					char_literal85=(Token)match(input,37,FOLLOW_37_in_dotIDF595); 
					char_literal85_tree = (CommonTree)adaptor.create(char_literal85);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal85_tree, root_0);

					IDF86=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF598); 
					IDF86_tree = (CommonTree)adaptor.create(IDF86);
					adaptor.addChild(root_0, IDF86_tree);

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
	// Grammar.g:77:1: ifExpr : 'if' expr block ( 'else' block )? -> ^( 'if' expr block ( ^( 'else' block ) )? ) ;
	public final GrammarParser.ifExpr_return ifExpr() throws RecognitionException {
		GrammarParser.ifExpr_return retval = new GrammarParser.ifExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal87=null;
		Token string_literal90=null;
		ParserRuleReturnScope expr88 =null;
		ParserRuleReturnScope block89 =null;
		ParserRuleReturnScope block91 =null;

		CommonTree string_literal87_tree=null;
		CommonTree string_literal90_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// Grammar.g:77:8: ( 'if' expr block ( 'else' block )? -> ^( 'if' expr block ( ^( 'else' block ) )? ) )
			// Grammar.g:77:10: 'if' expr block ( 'else' block )?
			{
			string_literal87=(Token)match(input,IF,FOLLOW_IF_in_ifExpr608);  
			stream_IF.add(string_literal87);

			pushFollow(FOLLOW_expr_in_ifExpr610);
			expr88=expr();
			state._fsp--;

			stream_expr.add(expr88.getTree());
			pushFollow(FOLLOW_block_in_ifExpr612);
			block89=block();
			state._fsp--;

			stream_block.add(block89.getTree());
			// Grammar.g:77:26: ( 'else' block )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==44) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Grammar.g:77:27: 'else' block
					{
					string_literal90=(Token)match(input,44,FOLLOW_44_in_ifExpr615);  
					stream_44.add(string_literal90);

					pushFollow(FOLLOW_block_in_ifExpr617);
					block91=block();
					state._fsp--;

					stream_block.add(block91.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: 44, expr, block, IF, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 77:43: -> ^( 'if' expr block ( ^( 'else' block ) )? )
			{
				// Grammar.g:77:46: ^( 'if' expr block ( ^( 'else' block ) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				// Grammar.g:77:64: ( ^( 'else' block ) )?
				if ( stream_44.hasNext()||stream_block.hasNext() ) {
					// Grammar.g:77:64: ^( 'else' block )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot(stream_44.nextNode(), root_2);
					adaptor.addChild(root_2, stream_block.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_44.reset();
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
	// Grammar.g:79:1: binExpr1 : binExpr2 ( EQUAL ^ binExpr2 )* ;
	public final GrammarParser.binExpr1_return binExpr1() throws RecognitionException {
		GrammarParser.binExpr1_return retval = new GrammarParser.binExpr1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL93=null;
		ParserRuleReturnScope binExpr292 =null;
		ParserRuleReturnScope binExpr294 =null;

		CommonTree EQUAL93_tree=null;

		try {
			// Grammar.g:79:10: ( binExpr2 ( EQUAL ^ binExpr2 )* )
			// Grammar.g:79:12: binExpr2 ( EQUAL ^ binExpr2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr2_in_binExpr1645);
			binExpr292=binExpr2();
			state._fsp--;

			adaptor.addChild(root_0, binExpr292.getTree());

			// Grammar.g:79:21: ( EQUAL ^ binExpr2 )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==EQUAL) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// Grammar.g:79:22: EQUAL ^ binExpr2
					{
					EQUAL93=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_binExpr1648); 
					EQUAL93_tree = (CommonTree)adaptor.create(EQUAL93);
					root_0 = (CommonTree)adaptor.becomeRoot(EQUAL93_tree, root_0);

					pushFollow(FOLLOW_binExpr2_in_binExpr1651);
					binExpr294=binExpr2();
					state._fsp--;

					adaptor.addChild(root_0, binExpr294.getTree());

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
	// $ANTLR end "binExpr1"


	public static class binExpr2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr2"
	// Grammar.g:81:1: binExpr2 : binExpr3 ( ORBOOL ^ binExpr3 )* ;
	public final GrammarParser.binExpr2_return binExpr2() throws RecognitionException {
		GrammarParser.binExpr2_return retval = new GrammarParser.binExpr2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ORBOOL96=null;
		ParserRuleReturnScope binExpr395 =null;
		ParserRuleReturnScope binExpr397 =null;

		CommonTree ORBOOL96_tree=null;

		try {
			// Grammar.g:81:10: ( binExpr3 ( ORBOOL ^ binExpr3 )* )
			// Grammar.g:81:12: binExpr3 ( ORBOOL ^ binExpr3 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr3_in_binExpr2662);
			binExpr395=binExpr3();
			state._fsp--;

			adaptor.addChild(root_0, binExpr395.getTree());

			// Grammar.g:81:20: ( ORBOOL ^ binExpr3 )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==ORBOOL) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// Grammar.g:81:21: ORBOOL ^ binExpr3
					{
					ORBOOL96=(Token)match(input,ORBOOL,FOLLOW_ORBOOL_in_binExpr2664); 
					ORBOOL96_tree = (CommonTree)adaptor.create(ORBOOL96);
					root_0 = (CommonTree)adaptor.becomeRoot(ORBOOL96_tree, root_0);

					pushFollow(FOLLOW_binExpr3_in_binExpr2667);
					binExpr397=binExpr3();
					state._fsp--;

					adaptor.addChild(root_0, binExpr397.getTree());

					}
					break;

				default :
					break loop27;
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
	// Grammar.g:83:1: binExpr3 : binExpr4 ( ANDBOOL ^ binExpr4 )* ;
	public final GrammarParser.binExpr3_return binExpr3() throws RecognitionException {
		GrammarParser.binExpr3_return retval = new GrammarParser.binExpr3_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANDBOOL99=null;
		ParserRuleReturnScope binExpr498 =null;
		ParserRuleReturnScope binExpr4100 =null;

		CommonTree ANDBOOL99_tree=null;

		try {
			// Grammar.g:83:10: ( binExpr4 ( ANDBOOL ^ binExpr4 )* )
			// Grammar.g:83:12: binExpr4 ( ANDBOOL ^ binExpr4 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr4_in_binExpr3678);
			binExpr498=binExpr4();
			state._fsp--;

			adaptor.addChild(root_0, binExpr498.getTree());

			// Grammar.g:83:20: ( ANDBOOL ^ binExpr4 )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==ANDBOOL) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// Grammar.g:83:21: ANDBOOL ^ binExpr4
					{
					ANDBOOL99=(Token)match(input,ANDBOOL,FOLLOW_ANDBOOL_in_binExpr3680); 
					ANDBOOL99_tree = (CommonTree)adaptor.create(ANDBOOL99);
					root_0 = (CommonTree)adaptor.becomeRoot(ANDBOOL99_tree, root_0);

					pushFollow(FOLLOW_binExpr4_in_binExpr3683);
					binExpr4100=binExpr4();
					state._fsp--;

					adaptor.addChild(root_0, binExpr4100.getTree());

					}
					break;

				default :
					break loop28;
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
	// Grammar.g:85:1: binExpr4 : binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )* ;
	public final GrammarParser.binExpr4_return binExpr4() throws RecognitionException {
		GrammarParser.binExpr4_return retval = new GrammarParser.binExpr4_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PREV102=null;
		Token OPBOOLEQ103=null;
		Token NEXT104=null;
		ParserRuleReturnScope binExpr5101 =null;
		ParserRuleReturnScope binExpr5105 =null;

		CommonTree PREV102_tree=null;
		CommonTree OPBOOLEQ103_tree=null;
		CommonTree NEXT104_tree=null;

		try {
			// Grammar.g:85:10: ( binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )* )
			// Grammar.g:85:12: binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr5_in_binExpr4694);
			binExpr5101=binExpr5();
			state._fsp--;

			adaptor.addChild(root_0, binExpr5101.getTree());

			// Grammar.g:85:20: ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= NEXT && LA30_0 <= OPBOOLEQ)||LA30_0==PREV) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// Grammar.g:85:21: ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5
					{
					// Grammar.g:85:21: ( PREV ^| OPBOOLEQ ^| NEXT ^)
					int alt29=3;
					switch ( input.LA(1) ) {
					case PREV:
						{
						alt29=1;
						}
						break;
					case OPBOOLEQ:
						{
						alt29=2;
						}
						break;
					case NEXT:
						{
						alt29=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}
					switch (alt29) {
						case 1 :
							// Grammar.g:85:22: PREV ^
							{
							PREV102=(Token)match(input,PREV,FOLLOW_PREV_in_binExpr4697); 
							PREV102_tree = (CommonTree)adaptor.create(PREV102);
							root_0 = (CommonTree)adaptor.becomeRoot(PREV102_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:85:28: OPBOOLEQ ^
							{
							OPBOOLEQ103=(Token)match(input,OPBOOLEQ,FOLLOW_OPBOOLEQ_in_binExpr4700); 
							OPBOOLEQ103_tree = (CommonTree)adaptor.create(OPBOOLEQ103);
							root_0 = (CommonTree)adaptor.becomeRoot(OPBOOLEQ103_tree, root_0);

							}
							break;
						case 3 :
							// Grammar.g:85:38: NEXT ^
							{
							NEXT104=(Token)match(input,NEXT,FOLLOW_NEXT_in_binExpr4703); 
							NEXT104_tree = (CommonTree)adaptor.create(NEXT104);
							root_0 = (CommonTree)adaptor.becomeRoot(NEXT104_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_binExpr5_in_binExpr4707);
					binExpr5105=binExpr5();
					state._fsp--;

					adaptor.addChild(root_0, binExpr5105.getTree());

					}
					break;

				default :
					break loop30;
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
	// Grammar.g:87:1: binExpr5 : binExpr6 ( ( ADD ^| SUB ^) binExpr6 )* ;
	public final GrammarParser.binExpr5_return binExpr5() throws RecognitionException {
		GrammarParser.binExpr5_return retval = new GrammarParser.binExpr5_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ADD107=null;
		Token SUB108=null;
		ParserRuleReturnScope binExpr6106 =null;
		ParserRuleReturnScope binExpr6109 =null;

		CommonTree ADD107_tree=null;
		CommonTree SUB108_tree=null;

		try {
			// Grammar.g:87:10: ( binExpr6 ( ( ADD ^| SUB ^) binExpr6 )* )
			// Grammar.g:87:12: binExpr6 ( ( ADD ^| SUB ^) binExpr6 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr6_in_binExpr5718);
			binExpr6106=binExpr6();
			state._fsp--;

			adaptor.addChild(root_0, binExpr6106.getTree());

			// Grammar.g:87:20: ( ( ADD ^| SUB ^) binExpr6 )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==ADD||LA32_0==SUB) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// Grammar.g:87:21: ( ADD ^| SUB ^) binExpr6
					{
					// Grammar.g:87:21: ( ADD ^| SUB ^)
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==ADD) ) {
						alt31=1;
					}
					else if ( (LA31_0==SUB) ) {
						alt31=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}

					switch (alt31) {
						case 1 :
							// Grammar.g:87:22: ADD ^
							{
							ADD107=(Token)match(input,ADD,FOLLOW_ADD_in_binExpr5721); 
							ADD107_tree = (CommonTree)adaptor.create(ADD107);
							root_0 = (CommonTree)adaptor.becomeRoot(ADD107_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:87:27: SUB ^
							{
							SUB108=(Token)match(input,SUB,FOLLOW_SUB_in_binExpr5724); 
							SUB108_tree = (CommonTree)adaptor.create(SUB108);
							root_0 = (CommonTree)adaptor.becomeRoot(SUB108_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_binExpr6_in_binExpr5729);
					binExpr6109=binExpr6();
					state._fsp--;

					adaptor.addChild(root_0, binExpr6109.getTree());

					}
					break;

				default :
					break loop32;
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
	// Grammar.g:89:1: binExpr6 : unExpr ( ( STAR ^| DIV ^) unExpr )* ;
	public final GrammarParser.binExpr6_return binExpr6() throws RecognitionException {
		GrammarParser.binExpr6_return retval = new GrammarParser.binExpr6_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR111=null;
		Token DIV112=null;
		ParserRuleReturnScope unExpr110 =null;
		ParserRuleReturnScope unExpr113 =null;

		CommonTree STAR111_tree=null;
		CommonTree DIV112_tree=null;

		try {
			// Grammar.g:89:10: ( unExpr ( ( STAR ^| DIV ^) unExpr )* )
			// Grammar.g:89:12: unExpr ( ( STAR ^| DIV ^) unExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unExpr_in_binExpr6740);
			unExpr110=unExpr();
			state._fsp--;

			adaptor.addChild(root_0, unExpr110.getTree());

			// Grammar.g:89:19: ( ( STAR ^| DIV ^) unExpr )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==DIV||LA34_0==STAR) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// Grammar.g:89:20: ( STAR ^| DIV ^) unExpr
					{
					// Grammar.g:89:20: ( STAR ^| DIV ^)
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==STAR) ) {
						alt33=1;
					}
					else if ( (LA33_0==DIV) ) {
						alt33=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// Grammar.g:89:21: STAR ^
							{
							STAR111=(Token)match(input,STAR,FOLLOW_STAR_in_binExpr6744); 
							STAR111_tree = (CommonTree)adaptor.create(STAR111);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR111_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:89:27: DIV ^
							{
							DIV112=(Token)match(input,DIV,FOLLOW_DIV_in_binExpr6747); 
							DIV112_tree = (CommonTree)adaptor.create(DIV112);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV112_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unExpr_in_binExpr6751);
					unExpr113=unExpr();
					state._fsp--;

					adaptor.addChild(root_0, unExpr113.getTree());

					}
					break;

				default :
					break loop34;
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
	// Grammar.g:91:1: vectExpr : starExpr ( '[' ^ expr ']' !)* ;
	public final GrammarParser.vectExpr_return vectExpr() throws RecognitionException {
		GrammarParser.vectExpr_return retval = new GrammarParser.vectExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal115=null;
		Token char_literal117=null;
		ParserRuleReturnScope starExpr114 =null;
		ParserRuleReturnScope expr116 =null;

		CommonTree char_literal115_tree=null;
		CommonTree char_literal117_tree=null;

		try {
			// Grammar.g:91:10: ( starExpr ( '[' ^ expr ']' !)* )
			// Grammar.g:91:12: starExpr ( '[' ^ expr ']' !)*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_starExpr_in_vectExpr762);
			starExpr114=starExpr();
			state._fsp--;

			adaptor.addChild(root_0, starExpr114.getTree());

			// Grammar.g:91:21: ( '[' ^ expr ']' !)*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==40) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// Grammar.g:91:22: '[' ^ expr ']' !
					{
					char_literal115=(Token)match(input,40,FOLLOW_40_in_vectExpr765); 
					char_literal115_tree = (CommonTree)adaptor.create(char_literal115);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal115_tree, root_0);

					pushFollow(FOLLOW_expr_in_vectExpr768);
					expr116=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr116.getTree());

					char_literal117=(Token)match(input,41,FOLLOW_41_in_vectExpr770); 
					}
					break;

				default :
					break loop35;
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
	// $ANTLR end "vectExpr"


	public static class starExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "starExpr"
	// Grammar.g:93:1: starExpr : ( STAR moinsExpr -> ^( UNISTAR moinsExpr ) | moinsExpr );
	public final GrammarParser.starExpr_return starExpr() throws RecognitionException {
		GrammarParser.starExpr_return retval = new GrammarParser.starExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR118=null;
		ParserRuleReturnScope moinsExpr119 =null;
		ParserRuleReturnScope moinsExpr120 =null;

		CommonTree STAR118_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleSubtreeStream stream_moinsExpr=new RewriteRuleSubtreeStream(adaptor,"rule moinsExpr");

		try {
			// Grammar.g:94:2: ( STAR moinsExpr -> ^( UNISTAR moinsExpr ) | moinsExpr )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==STAR) ) {
				alt36=1;
			}
			else if ( (LA36_0==BOOL||LA36_0==IDF||LA36_0==INT||LA36_0==SUB||LA36_0==33||LA36_0==47||LA36_0==57) ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// Grammar.g:94:5: STAR moinsExpr
					{
					STAR118=(Token)match(input,STAR,FOLLOW_STAR_in_starExpr784);  
					stream_STAR.add(STAR118);

					pushFollow(FOLLOW_moinsExpr_in_starExpr786);
					moinsExpr119=moinsExpr();
					state._fsp--;

					stream_moinsExpr.add(moinsExpr119.getTree());
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
					// 94:20: -> ^( UNISTAR moinsExpr )
					{
						// Grammar.g:94:23: ^( UNISTAR moinsExpr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNISTAR, "UNISTAR"), root_1);
						adaptor.addChild(root_1, stream_moinsExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:95:4: moinsExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_moinsExpr_in_starExpr799);
					moinsExpr120=moinsExpr();
					state._fsp--;

					adaptor.addChild(root_0, moinsExpr120.getTree());

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
	// $ANTLR end "starExpr"


	public static class moinsExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "moinsExpr"
	// Grammar.g:97:1: moinsExpr : ( SUB moinsExpr -> ^( UNISUB moinsExpr ) | atom );
	public final GrammarParser.moinsExpr_return moinsExpr() throws RecognitionException {
		GrammarParser.moinsExpr_return retval = new GrammarParser.moinsExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUB121=null;
		ParserRuleReturnScope moinsExpr122 =null;
		ParserRuleReturnScope atom123 =null;

		CommonTree SUB121_tree=null;
		RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
		RewriteRuleSubtreeStream stream_moinsExpr=new RewriteRuleSubtreeStream(adaptor,"rule moinsExpr");

		try {
			// Grammar.g:98:2: ( SUB moinsExpr -> ^( UNISUB moinsExpr ) | atom )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==SUB) ) {
				alt37=1;
			}
			else if ( (LA37_0==BOOL||LA37_0==IDF||LA37_0==INT||LA37_0==33||LA37_0==47||LA37_0==57) ) {
				alt37=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// Grammar.g:98:5: SUB moinsExpr
					{
					SUB121=(Token)match(input,SUB,FOLLOW_SUB_in_moinsExpr811);  
					stream_SUB.add(SUB121);

					pushFollow(FOLLOW_moinsExpr_in_moinsExpr813);
					moinsExpr122=moinsExpr();
					state._fsp--;

					stream_moinsExpr.add(moinsExpr122.getTree());
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
					// 98:19: -> ^( UNISUB moinsExpr )
					{
						// Grammar.g:98:22: ^( UNISUB moinsExpr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNISUB, "UNISUB"), root_1);
						adaptor.addChild(root_1, stream_moinsExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:99:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_moinsExpr826);
					atom123=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom123.getTree());

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
	// $ANTLR end "moinsExpr"


	public static class dotExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dotExpr"
	// Grammar.g:102:1: dotExpr : vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? ;
	public final GrammarParser.dotExpr_return dotExpr() throws RecognitionException {
		GrammarParser.dotExpr_return retval = new GrammarParser.dotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal125=null;
		Token IDF126=null;
		Token string_literal127=null;
		Token char_literal128=null;
		Token char_literal129=null;
		ParserRuleReturnScope vectExpr124 =null;

		CommonTree char_literal125_tree=null;
		CommonTree IDF126_tree=null;
		CommonTree string_literal127_tree=null;
		CommonTree char_literal128_tree=null;
		CommonTree char_literal129_tree=null;

		try {
			// Grammar.g:102:9: ( vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? )
			// Grammar.g:102:11: vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_vectExpr_in_dotExpr835);
			vectExpr124=vectExpr();
			state._fsp--;

			adaptor.addChild(root_0, vectExpr124.getTree());

			// Grammar.g:102:20: ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==37) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Grammar.g:102:21: '.' ^ ( IDF | 'len' '(' ! ')' !)
					{
					char_literal125=(Token)match(input,37,FOLLOW_37_in_dotExpr838); 
					char_literal125_tree = (CommonTree)adaptor.create(char_literal125);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal125_tree, root_0);

					// Grammar.g:102:26: ( IDF | 'len' '(' ! ')' !)
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==IDF) ) {
						alt38=1;
					}
					else if ( (LA38_0==48) ) {
						alt38=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						throw nvae;
					}

					switch (alt38) {
						case 1 :
							// Grammar.g:102:27: IDF
							{
							IDF126=(Token)match(input,IDF,FOLLOW_IDF_in_dotExpr842); 
							IDF126_tree = (CommonTree)adaptor.create(IDF126);
							adaptor.addChild(root_0, IDF126_tree);

							}
							break;
						case 2 :
							// Grammar.g:102:33: 'len' '(' ! ')' !
							{
							string_literal127=(Token)match(input,48,FOLLOW_48_in_dotExpr846); 
							string_literal127_tree = (CommonTree)adaptor.create(string_literal127);
							adaptor.addChild(root_0, string_literal127_tree);

							char_literal128=(Token)match(input,33,FOLLOW_33_in_dotExpr848); 
							char_literal129=(Token)match(input,34,FOLLOW_34_in_dotExpr850); 
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
	// Grammar.g:104:1: unExpr : ( UNAIRE ^| EPERLU ^)? dotExpr ;
	public final GrammarParser.unExpr_return unExpr() throws RecognitionException {
		GrammarParser.unExpr_return retval = new GrammarParser.unExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE130=null;
		Token EPERLU131=null;
		ParserRuleReturnScope dotExpr132 =null;

		CommonTree UNAIRE130_tree=null;
		CommonTree EPERLU131_tree=null;

		try {
			// Grammar.g:104:8: ( ( UNAIRE ^| EPERLU ^)? dotExpr )
			// Grammar.g:104:10: ( UNAIRE ^| EPERLU ^)? dotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:104:10: ( UNAIRE ^| EPERLU ^)?
			int alt40=3;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==UNAIRE) ) {
				alt40=1;
			}
			else if ( (LA40_0==EPERLU) ) {
				alt40=2;
			}
			switch (alt40) {
				case 1 :
					// Grammar.g:104:11: UNAIRE ^
					{
					UNAIRE130=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_unExpr864); 
					UNAIRE130_tree = (CommonTree)adaptor.create(UNAIRE130);
					root_0 = (CommonTree)adaptor.becomeRoot(UNAIRE130_tree, root_0);

					}
					break;
				case 2 :
					// Grammar.g:104:19: EPERLU ^
					{
					EPERLU131=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_unExpr867); 
					EPERLU131_tree = (CommonTree)adaptor.create(EPERLU131);
					root_0 = (CommonTree)adaptor.becomeRoot(EPERLU131_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_dotExpr_in_unExpr872);
			dotExpr132=dotExpr();
			state._fsp--;

			adaptor.addChild(root_0, dotExpr132.getTree());

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
	// Grammar.g:106:1: atom : ( INT | BOOL | IDF ^ ( ( callFun ) )? | block -> ^( ANOBLOCK block ) | '(' expr ')' -> expr | 'input' '(' STRING ')' -> ^( 'input' STRING ) );
	public final GrammarParser.atom_return atom() throws RecognitionException {
		GrammarParser.atom_return retval = new GrammarParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT133=null;
		Token BOOL134=null;
		Token IDF135=null;
		Token char_literal138=null;
		Token char_literal140=null;
		Token string_literal141=null;
		Token char_literal142=null;
		Token STRING143=null;
		Token char_literal144=null;
		ParserRuleReturnScope callFun136 =null;
		ParserRuleReturnScope block137 =null;
		ParserRuleReturnScope expr139 =null;

		CommonTree INT133_tree=null;
		CommonTree BOOL134_tree=null;
		CommonTree IDF135_tree=null;
		CommonTree char_literal138_tree=null;
		CommonTree char_literal140_tree=null;
		CommonTree string_literal141_tree=null;
		CommonTree char_literal142_tree=null;
		CommonTree STRING143_tree=null;
		CommonTree char_literal144_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammar.g:106:6: ( INT | BOOL | IDF ^ ( ( callFun ) )? | block -> ^( ANOBLOCK block ) | '(' expr ')' -> expr | 'input' '(' STRING ')' -> ^( 'input' STRING ) )
			int alt42=6;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt42=1;
				}
				break;
			case BOOL:
				{
				alt42=2;
				}
				break;
			case IDF:
				{
				alt42=3;
				}
				break;
			case 57:
				{
				alt42=4;
				}
				break;
			case 33:
				{
				alt42=5;
				}
				break;
			case 47:
				{
				alt42=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// Grammar.g:106:8: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT133=(Token)match(input,INT,FOLLOW_INT_in_atom880); 
					INT133_tree = (CommonTree)adaptor.create(INT133);
					adaptor.addChild(root_0, INT133_tree);

					}
					break;
				case 2 :
					// Grammar.g:107:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL134=(Token)match(input,BOOL,FOLLOW_BOOL_in_atom884); 
					BOOL134_tree = (CommonTree)adaptor.create(BOOL134);
					adaptor.addChild(root_0, BOOL134_tree);

					}
					break;
				case 3 :
					// Grammar.g:108:4: IDF ^ ( ( callFun ) )?
					{
					root_0 = (CommonTree)adaptor.nil();


					IDF135=(Token)match(input,IDF,FOLLOW_IDF_in_atom889); 
					IDF135_tree = (CommonTree)adaptor.create(IDF135);
					root_0 = (CommonTree)adaptor.becomeRoot(IDF135_tree, root_0);

					// Grammar.g:108:9: ( ( callFun ) )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==33) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// Grammar.g:108:10: ( callFun )
							{
							// Grammar.g:108:10: ( callFun )
							// Grammar.g:108:11: callFun
							{
							pushFollow(FOLLOW_callFun_in_atom894);
							callFun136=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun136.getTree());

							}

							}
							break;

					}

					}
					break;
				case 4 :
					// Grammar.g:109:3: block
					{
					pushFollow(FOLLOW_block_in_atom901);
					block137=block();
					state._fsp--;

					stream_block.add(block137.getTree());
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
					// 109:9: -> ^( ANOBLOCK block )
					{
						// Grammar.g:109:12: ^( ANOBLOCK block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANOBLOCK, "ANOBLOCK"), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Grammar.g:110:3: '(' expr ')'
					{
					char_literal138=(Token)match(input,33,FOLLOW_33_in_atom913);  
					stream_33.add(char_literal138);

					pushFollow(FOLLOW_expr_in_atom914);
					expr139=expr();
					state._fsp--;

					stream_expr.add(expr139.getTree());
					char_literal140=(Token)match(input,34,FOLLOW_34_in_atom915);  
					stream_34.add(char_literal140);

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
					// 110:13: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Grammar.g:111:2: 'input' '(' STRING ')'
					{
					string_literal141=(Token)match(input,47,FOLLOW_47_in_atom921);  
					stream_47.add(string_literal141);

					char_literal142=(Token)match(input,33,FOLLOW_33_in_atom923);  
					stream_33.add(char_literal142);

					STRING143=(Token)match(input,STRING,FOLLOW_STRING_in_atom925);  
					stream_STRING.add(STRING143);

					char_literal144=(Token)match(input,34,FOLLOW_34_in_atom927);  
					stream_34.add(char_literal144);

					// AST REWRITE
					// elements: 47, STRING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 111:25: -> ^( 'input' STRING )
					{
						// Grammar.g:111:28: ^( 'input' STRING )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_47.nextNode(), root_1);
						adaptor.addChild(root_1, stream_STRING.nextNode());
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
	// $ANTLR end "atom"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Grammar.g:113:1: expr : ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' exS ( ',' exS )* ')' -> ^( 'print' ( exS )* ) | 'raw_print' '!' '(' exS ( ',' exS )* ')' -> ^( 'raw_print' ( exS )* ) | binExpr1 );
	public final GrammarParser.expr_return expr() throws RecognitionException {
		GrammarParser.expr_return retval = new GrammarParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal145=null;
		Token char_literal146=null;
		Token char_literal147=null;
		Token char_literal149=null;
		Token char_literal151=null;
		Token string_literal152=null;
		Token char_literal153=null;
		Token char_literal154=null;
		Token char_literal156=null;
		Token char_literal158=null;
		Token string_literal159=null;
		Token char_literal160=null;
		Token char_literal161=null;
		Token char_literal163=null;
		Token char_literal165=null;
		ParserRuleReturnScope expr148 =null;
		ParserRuleReturnScope expr150 =null;
		ParserRuleReturnScope exS155 =null;
		ParserRuleReturnScope exS157 =null;
		ParserRuleReturnScope exS162 =null;
		ParserRuleReturnScope exS164 =null;
		ParserRuleReturnScope binExpr1166 =null;

		CommonTree string_literal145_tree=null;
		CommonTree char_literal146_tree=null;
		CommonTree char_literal147_tree=null;
		CommonTree char_literal149_tree=null;
		CommonTree char_literal151_tree=null;
		CommonTree string_literal152_tree=null;
		CommonTree char_literal153_tree=null;
		CommonTree char_literal154_tree=null;
		CommonTree char_literal156_tree=null;
		CommonTree char_literal158_tree=null;
		CommonTree string_literal159_tree=null;
		CommonTree char_literal160_tree=null;
		CommonTree char_literal161_tree=null;
		CommonTree char_literal163_tree=null;
		CommonTree char_literal165_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_UNAIRE=new RewriteRuleTokenStream(adaptor,"token UNAIRE");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_exS=new RewriteRuleSubtreeStream(adaptor,"rule exS");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammar.g:113:6: ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' exS ( ',' exS )* ')' -> ^( 'print' ( exS )* ) | 'raw_print' '!' '(' exS ( ',' exS )* ')' -> ^( 'raw_print' ( exS )* ) | binExpr1 )
			int alt46=4;
			switch ( input.LA(1) ) {
			case 55:
				{
				alt46=1;
				}
				break;
			case 51:
				{
				alt46=2;
				}
				break;
			case 52:
				{
				alt46=3;
				}
				break;
			case BOOL:
			case EPERLU:
			case IDF:
			case INT:
			case STAR:
			case SUB:
			case UNAIRE:
			case 33:
			case 47:
			case 57:
				{
				alt46=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// Grammar.g:113:8: 'vec' '!' '[' expr ( ',' expr )* ']'
					{
					string_literal145=(Token)match(input,55,FOLLOW_55_in_expr943);  
					stream_55.add(string_literal145);

					char_literal146=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr945);  
					stream_UNAIRE.add(char_literal146);

					char_literal147=(Token)match(input,40,FOLLOW_40_in_expr947);  
					stream_40.add(char_literal147);

					pushFollow(FOLLOW_expr_in_expr949);
					expr148=expr();
					state._fsp--;

					stream_expr.add(expr148.getTree());
					// Grammar.g:113:26: ( ',' expr )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==35) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// Grammar.g:113:27: ',' expr
							{
							char_literal149=(Token)match(input,35,FOLLOW_35_in_expr951);  
							stream_35.add(char_literal149);

							pushFollow(FOLLOW_expr_in_expr953);
							expr150=expr();
							state._fsp--;

							stream_expr.add(expr150.getTree());
							}
							break;

						default :
							break loop43;
						}
					}

					char_literal151=(Token)match(input,41,FOLLOW_41_in_expr957);  
					stream_41.add(char_literal151);

					// AST REWRITE
					// elements: expr, 55
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 113:42: -> ^( 'vec' ( expr )* )
					{
						// Grammar.g:113:45: ^( 'vec' ( expr )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_55.nextNode(), root_1);
						// Grammar.g:113:53: ( expr )*
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
					// Grammar.g:114:2: 'print' '!' '(' exS ( ',' exS )* ')'
					{
					string_literal152=(Token)match(input,51,FOLLOW_51_in_expr969);  
					stream_51.add(string_literal152);

					char_literal153=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr971);  
					stream_UNAIRE.add(char_literal153);

					char_literal154=(Token)match(input,33,FOLLOW_33_in_expr973);  
					stream_33.add(char_literal154);

					pushFollow(FOLLOW_exS_in_expr975);
					exS155=exS();
					state._fsp--;

					stream_exS.add(exS155.getTree());
					// Grammar.g:114:23: ( ',' exS )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==35) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// Grammar.g:114:24: ',' exS
							{
							char_literal156=(Token)match(input,35,FOLLOW_35_in_expr979);  
							stream_35.add(char_literal156);

							pushFollow(FOLLOW_exS_in_expr981);
							exS157=exS();
							state._fsp--;

							stream_exS.add(exS157.getTree());
							}
							break;

						default :
							break loop44;
						}
					}

					char_literal158=(Token)match(input,34,FOLLOW_34_in_expr985);  
					stream_34.add(char_literal158);

					// AST REWRITE
					// elements: exS, 51
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 114:38: -> ^( 'print' ( exS )* )
					{
						// Grammar.g:114:41: ^( 'print' ( exS )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_51.nextNode(), root_1);
						// Grammar.g:114:51: ( exS )*
						while ( stream_exS.hasNext() ) {
							adaptor.addChild(root_1, stream_exS.nextTree());
						}
						stream_exS.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammar.g:115:2: 'raw_print' '!' '(' exS ( ',' exS )* ')'
					{
					string_literal159=(Token)match(input,52,FOLLOW_52_in_expr997);  
					stream_52.add(string_literal159);

					char_literal160=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr999);  
					stream_UNAIRE.add(char_literal160);

					char_literal161=(Token)match(input,33,FOLLOW_33_in_expr1001);  
					stream_33.add(char_literal161);

					pushFollow(FOLLOW_exS_in_expr1003);
					exS162=exS();
					state._fsp--;

					stream_exS.add(exS162.getTree());
					// Grammar.g:115:26: ( ',' exS )*
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==35) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// Grammar.g:115:27: ',' exS
							{
							char_literal163=(Token)match(input,35,FOLLOW_35_in_expr1006);  
							stream_35.add(char_literal163);

							pushFollow(FOLLOW_exS_in_expr1008);
							exS164=exS();
							state._fsp--;

							stream_exS.add(exS164.getTree());
							}
							break;

						default :
							break loop45;
						}
					}

					char_literal165=(Token)match(input,34,FOLLOW_34_in_expr1012);  
					stream_34.add(char_literal165);

					// AST REWRITE
					// elements: 52, exS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 115:41: -> ^( 'raw_print' ( exS )* )
					{
						// Grammar.g:115:44: ^( 'raw_print' ( exS )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_52.nextNode(), root_1);
						// Grammar.g:115:58: ( exS )*
						while ( stream_exS.hasNext() ) {
							adaptor.addChild(root_1, stream_exS.nextTree());
						}
						stream_exS.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Grammar.g:116:3: binExpr1
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_binExpr1_in_expr1025);
					binExpr1166=binExpr1();
					state._fsp--;

					adaptor.addChild(root_0, binExpr1166.getTree());

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


	public static class exS_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exS"
	// Grammar.g:118:1: exS : ( expr | STRING );
	public final GrammarParser.exS_return exS() throws RecognitionException {
		GrammarParser.exS_return retval = new GrammarParser.exS_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STRING168=null;
		ParserRuleReturnScope expr167 =null;

		CommonTree STRING168_tree=null;

		try {
			// Grammar.g:118:5: ( expr | STRING )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==BOOL||LA47_0==EPERLU||LA47_0==IDF||LA47_0==INT||LA47_0==STAR||(LA47_0 >= SUB && LA47_0 <= UNAIRE)||LA47_0==33||LA47_0==47||(LA47_0 >= 51 && LA47_0 <= 52)||LA47_0==55||LA47_0==57) ) {
				alt47=1;
			}
			else if ( (LA47_0==STRING) ) {
				alt47=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// Grammar.g:118:7: expr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expr_in_exS1033);
					expr167=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr167.getTree());

					}
					break;
				case 2 :
					// Grammar.g:119:3: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING168=(Token)match(input,STRING,FOLLOW_STRING_in_exS1037); 
					STRING168_tree = (CommonTree)adaptor.create(STRING168);
					adaptor.addChild(root_0, STRING168_tree);

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
	// $ANTLR end "exS"


	public static class bigbinExpr1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr1"
	// Grammar.g:121:1: bigbinExpr1 : bigbinExpr2 ( EQUAL ^ bigbinExpr2 )* ;
	public final GrammarParser.bigbinExpr1_return bigbinExpr1() throws RecognitionException {
		GrammarParser.bigbinExpr1_return retval = new GrammarParser.bigbinExpr1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL170=null;
		ParserRuleReturnScope bigbinExpr2169 =null;
		ParserRuleReturnScope bigbinExpr2171 =null;

		CommonTree EQUAL170_tree=null;

		try {
			// Grammar.g:121:13: ( bigbinExpr2 ( EQUAL ^ bigbinExpr2 )* )
			// Grammar.g:121:15: bigbinExpr2 ( EQUAL ^ bigbinExpr2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr2_in_bigbinExpr11045);
			bigbinExpr2169=bigbinExpr2();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr2169.getTree());

			// Grammar.g:121:27: ( EQUAL ^ bigbinExpr2 )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==EQUAL) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// Grammar.g:121:28: EQUAL ^ bigbinExpr2
					{
					EQUAL170=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_bigbinExpr11048); 
					EQUAL170_tree = (CommonTree)adaptor.create(EQUAL170);
					root_0 = (CommonTree)adaptor.becomeRoot(EQUAL170_tree, root_0);

					pushFollow(FOLLOW_bigbinExpr2_in_bigbinExpr11051);
					bigbinExpr2171=bigbinExpr2();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr2171.getTree());

					}
					break;

				default :
					break loop48;
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
	// Grammar.g:123:1: bigbinExpr2 : bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )* ;
	public final GrammarParser.bigbinExpr2_return bigbinExpr2() throws RecognitionException {
		GrammarParser.bigbinExpr2_return retval = new GrammarParser.bigbinExpr2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ORBOOL173=null;
		ParserRuleReturnScope bigbinExpr3172 =null;
		ParserRuleReturnScope bigbinExpr3174 =null;

		CommonTree ORBOOL173_tree=null;

		try {
			// Grammar.g:123:13: ( bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )* )
			// Grammar.g:123:15: bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr3_in_bigbinExpr21062);
			bigbinExpr3172=bigbinExpr3();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr3172.getTree());

			// Grammar.g:123:26: ( ORBOOL ^ bigbinExpr3 )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==ORBOOL) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// Grammar.g:123:27: ORBOOL ^ bigbinExpr3
					{
					ORBOOL173=(Token)match(input,ORBOOL,FOLLOW_ORBOOL_in_bigbinExpr21064); 
					ORBOOL173_tree = (CommonTree)adaptor.create(ORBOOL173);
					root_0 = (CommonTree)adaptor.becomeRoot(ORBOOL173_tree, root_0);

					pushFollow(FOLLOW_bigbinExpr3_in_bigbinExpr21067);
					bigbinExpr3174=bigbinExpr3();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr3174.getTree());

					}
					break;

				default :
					break loop49;
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
	// Grammar.g:125:1: bigbinExpr3 : bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )* ;
	public final GrammarParser.bigbinExpr3_return bigbinExpr3() throws RecognitionException {
		GrammarParser.bigbinExpr3_return retval = new GrammarParser.bigbinExpr3_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANDBOOL176=null;
		ParserRuleReturnScope bigbinExpr4175 =null;
		ParserRuleReturnScope bigbinExpr4177 =null;

		CommonTree ANDBOOL176_tree=null;

		try {
			// Grammar.g:125:13: ( bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )* )
			// Grammar.g:125:15: bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr4_in_bigbinExpr31077);
			bigbinExpr4175=bigbinExpr4();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr4175.getTree());

			// Grammar.g:125:26: ( ANDBOOL ^ bigbinExpr4 )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==ANDBOOL) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// Grammar.g:125:27: ANDBOOL ^ bigbinExpr4
					{
					ANDBOOL176=(Token)match(input,ANDBOOL,FOLLOW_ANDBOOL_in_bigbinExpr31079); 
					ANDBOOL176_tree = (CommonTree)adaptor.create(ANDBOOL176);
					root_0 = (CommonTree)adaptor.becomeRoot(ANDBOOL176_tree, root_0);

					pushFollow(FOLLOW_bigbinExpr4_in_bigbinExpr31082);
					bigbinExpr4177=bigbinExpr4();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr4177.getTree());

					}
					break;

				default :
					break loop50;
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
	// Grammar.g:127:1: bigbinExpr4 : bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )* ;
	public final GrammarParser.bigbinExpr4_return bigbinExpr4() throws RecognitionException {
		GrammarParser.bigbinExpr4_return retval = new GrammarParser.bigbinExpr4_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PREV179=null;
		Token OPBOOLEQ180=null;
		Token NEXT181=null;
		ParserRuleReturnScope bigbinExpr5178 =null;
		ParserRuleReturnScope bigbinExpr5182 =null;

		CommonTree PREV179_tree=null;
		CommonTree OPBOOLEQ180_tree=null;
		CommonTree NEXT181_tree=null;

		try {
			// Grammar.g:127:13: ( bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )* )
			// Grammar.g:127:15: bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr5_in_bigbinExpr41093);
			bigbinExpr5178=bigbinExpr5();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr5178.getTree());

			// Grammar.g:127:26: ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( ((LA52_0 >= NEXT && LA52_0 <= OPBOOLEQ)||LA52_0==PREV) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// Grammar.g:127:27: ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5
					{
					// Grammar.g:127:27: ( PREV ^| OPBOOLEQ ^| NEXT ^)
					int alt51=3;
					switch ( input.LA(1) ) {
					case PREV:
						{
						alt51=1;
						}
						break;
					case OPBOOLEQ:
						{
						alt51=2;
						}
						break;
					case NEXT:
						{
						alt51=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 51, 0, input);
						throw nvae;
					}
					switch (alt51) {
						case 1 :
							// Grammar.g:127:28: PREV ^
							{
							PREV179=(Token)match(input,PREV,FOLLOW_PREV_in_bigbinExpr41096); 
							PREV179_tree = (CommonTree)adaptor.create(PREV179);
							root_0 = (CommonTree)adaptor.becomeRoot(PREV179_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:127:34: OPBOOLEQ ^
							{
							OPBOOLEQ180=(Token)match(input,OPBOOLEQ,FOLLOW_OPBOOLEQ_in_bigbinExpr41099); 
							OPBOOLEQ180_tree = (CommonTree)adaptor.create(OPBOOLEQ180);
							root_0 = (CommonTree)adaptor.becomeRoot(OPBOOLEQ180_tree, root_0);

							}
							break;
						case 3 :
							// Grammar.g:127:44: NEXT ^
							{
							NEXT181=(Token)match(input,NEXT,FOLLOW_NEXT_in_bigbinExpr41102); 
							NEXT181_tree = (CommonTree)adaptor.create(NEXT181);
							root_0 = (CommonTree)adaptor.becomeRoot(NEXT181_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_bigbinExpr5_in_bigbinExpr41106);
					bigbinExpr5182=bigbinExpr5();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr5182.getTree());

					}
					break;

				default :
					break loop52;
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
	// Grammar.g:129:1: bigbinExpr5 : bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )* ;
	public final GrammarParser.bigbinExpr5_return bigbinExpr5() throws RecognitionException {
		GrammarParser.bigbinExpr5_return retval = new GrammarParser.bigbinExpr5_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set184=null;
		ParserRuleReturnScope bigbinExpr6183 =null;
		ParserRuleReturnScope bigbinExpr6185 =null;

		CommonTree set184_tree=null;

		try {
			// Grammar.g:129:13: ( bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )* )
			// Grammar.g:129:15: bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr6_in_bigbinExpr51117);
			bigbinExpr6183=bigbinExpr6();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr6183.getTree());

			// Grammar.g:129:26: ( ( ADD | SUB ) ^ bigbinExpr6 )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==ADD||LA53_0==SUB) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// Grammar.g:129:27: ( ADD | SUB ) ^ bigbinExpr6
					{
					set184=input.LT(1);
					set184=input.LT(1);
					if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set184), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_bigbinExpr6_in_bigbinExpr51126);
					bigbinExpr6185=bigbinExpr6();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr6185.getTree());

					}
					break;

				default :
					break loop53;
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
	// Grammar.g:131:1: bigbinExpr6 : bigunExpr ( ( STAR ^| DIV ^) bigunExpr )* ;
	public final GrammarParser.bigbinExpr6_return bigbinExpr6() throws RecognitionException {
		GrammarParser.bigbinExpr6_return retval = new GrammarParser.bigbinExpr6_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR187=null;
		Token DIV188=null;
		ParserRuleReturnScope bigunExpr186 =null;
		ParserRuleReturnScope bigunExpr189 =null;

		CommonTree STAR187_tree=null;
		CommonTree DIV188_tree=null;

		try {
			// Grammar.g:131:13: ( bigunExpr ( ( STAR ^| DIV ^) bigunExpr )* )
			// Grammar.g:131:15: bigunExpr ( ( STAR ^| DIV ^) bigunExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigunExpr_in_bigbinExpr61137);
			bigunExpr186=bigunExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigunExpr186.getTree());

			// Grammar.g:131:25: ( ( STAR ^| DIV ^) bigunExpr )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==DIV||LA55_0==STAR) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// Grammar.g:131:26: ( STAR ^| DIV ^) bigunExpr
					{
					// Grammar.g:131:26: ( STAR ^| DIV ^)
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==STAR) ) {
						alt54=1;
					}
					else if ( (LA54_0==DIV) ) {
						alt54=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 54, 0, input);
						throw nvae;
					}

					switch (alt54) {
						case 1 :
							// Grammar.g:131:27: STAR ^
							{
							STAR187=(Token)match(input,STAR,FOLLOW_STAR_in_bigbinExpr61141); 
							STAR187_tree = (CommonTree)adaptor.create(STAR187);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR187_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:131:33: DIV ^
							{
							DIV188=(Token)match(input,DIV,FOLLOW_DIV_in_bigbinExpr61144); 
							DIV188_tree = (CommonTree)adaptor.create(DIV188);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV188_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_bigunExpr_in_bigbinExpr61148);
					bigunExpr189=bigunExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigunExpr189.getTree());

					}
					break;

				default :
					break loop55;
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
	// Grammar.g:133:1: bigvectExpr : bigstarExpr ( '[' ^ bigExpr ']' !)* ;
	public final GrammarParser.bigvectExpr_return bigvectExpr() throws RecognitionException {
		GrammarParser.bigvectExpr_return retval = new GrammarParser.bigvectExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal191=null;
		Token char_literal193=null;
		ParserRuleReturnScope bigstarExpr190 =null;
		ParserRuleReturnScope bigExpr192 =null;

		CommonTree char_literal191_tree=null;
		CommonTree char_literal193_tree=null;

		try {
			// Grammar.g:133:13: ( bigstarExpr ( '[' ^ bigExpr ']' !)* )
			// Grammar.g:133:15: bigstarExpr ( '[' ^ bigExpr ']' !)*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigstarExpr_in_bigvectExpr1158);
			bigstarExpr190=bigstarExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigstarExpr190.getTree());

			// Grammar.g:133:27: ( '[' ^ bigExpr ']' !)*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==40) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// Grammar.g:133:28: '[' ^ bigExpr ']' !
					{
					char_literal191=(Token)match(input,40,FOLLOW_40_in_bigvectExpr1161); 
					char_literal191_tree = (CommonTree)adaptor.create(char_literal191);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal191_tree, root_0);

					pushFollow(FOLLOW_bigExpr_in_bigvectExpr1164);
					bigExpr192=bigExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigExpr192.getTree());

					char_literal193=(Token)match(input,41,FOLLOW_41_in_bigvectExpr1166); 
					}
					break;

				default :
					break loop56;
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
	// $ANTLR end "bigvectExpr"


	public static class bigstarExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigstarExpr"
	// Grammar.g:135:1: bigstarExpr : ( STAR bigmoinsExpr -> ^( UNISTAR bigmoinsExpr ) | bigmoinsExpr );
	public final GrammarParser.bigstarExpr_return bigstarExpr() throws RecognitionException {
		GrammarParser.bigstarExpr_return retval = new GrammarParser.bigstarExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR194=null;
		ParserRuleReturnScope bigmoinsExpr195 =null;
		ParserRuleReturnScope bigmoinsExpr196 =null;

		CommonTree STAR194_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleSubtreeStream stream_bigmoinsExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigmoinsExpr");

		try {
			// Grammar.g:136:2: ( STAR bigmoinsExpr -> ^( UNISTAR bigmoinsExpr ) | bigmoinsExpr )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==STAR) ) {
				alt57=1;
			}
			else if ( (LA57_0==BOOL||LA57_0==IDF||LA57_0==INT||LA57_0==SUB||LA57_0==33||LA57_0==47||LA57_0==57) ) {
				alt57=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// Grammar.g:136:5: STAR bigmoinsExpr
					{
					STAR194=(Token)match(input,STAR,FOLLOW_STAR_in_bigstarExpr1180);  
					stream_STAR.add(STAR194);

					pushFollow(FOLLOW_bigmoinsExpr_in_bigstarExpr1182);
					bigmoinsExpr195=bigmoinsExpr();
					state._fsp--;

					stream_bigmoinsExpr.add(bigmoinsExpr195.getTree());
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
					// 136:23: -> ^( UNISTAR bigmoinsExpr )
					{
						// Grammar.g:136:26: ^( UNISTAR bigmoinsExpr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNISTAR, "UNISTAR"), root_1);
						adaptor.addChild(root_1, stream_bigmoinsExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:137:4: bigmoinsExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bigmoinsExpr_in_bigstarExpr1195);
					bigmoinsExpr196=bigmoinsExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigmoinsExpr196.getTree());

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
	// $ANTLR end "bigstarExpr"


	public static class bigmoinsExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigmoinsExpr"
	// Grammar.g:139:1: bigmoinsExpr : ( SUB bigmoinsExpr -> ^( UNISUB bigmoinsExpr ) | bigatom );
	public final GrammarParser.bigmoinsExpr_return bigmoinsExpr() throws RecognitionException {
		GrammarParser.bigmoinsExpr_return retval = new GrammarParser.bigmoinsExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUB197=null;
		ParserRuleReturnScope bigmoinsExpr198 =null;
		ParserRuleReturnScope bigatom199 =null;

		CommonTree SUB197_tree=null;
		RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
		RewriteRuleSubtreeStream stream_bigmoinsExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigmoinsExpr");

		try {
			// Grammar.g:140:2: ( SUB bigmoinsExpr -> ^( UNISUB bigmoinsExpr ) | bigatom )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==SUB) ) {
				alt58=1;
			}
			else if ( (LA58_0==BOOL||LA58_0==IDF||LA58_0==INT||LA58_0==33||LA58_0==47||LA58_0==57) ) {
				alt58=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// Grammar.g:140:5: SUB bigmoinsExpr
					{
					SUB197=(Token)match(input,SUB,FOLLOW_SUB_in_bigmoinsExpr1207);  
					stream_SUB.add(SUB197);

					pushFollow(FOLLOW_bigmoinsExpr_in_bigmoinsExpr1209);
					bigmoinsExpr198=bigmoinsExpr();
					state._fsp--;

					stream_bigmoinsExpr.add(bigmoinsExpr198.getTree());
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
					// 140:22: -> ^( UNISUB bigmoinsExpr )
					{
						// Grammar.g:140:25: ^( UNISUB bigmoinsExpr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNISUB, "UNISUB"), root_1);
						adaptor.addChild(root_1, stream_bigmoinsExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:141:4: bigatom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bigatom_in_bigmoinsExpr1222);
					bigatom199=bigatom();
					state._fsp--;

					adaptor.addChild(root_0, bigatom199.getTree());

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
	// $ANTLR end "bigmoinsExpr"


	public static class bigdotExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigdotExpr"
	// Grammar.g:144:1: bigdotExpr : bigvectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? ;
	public final GrammarParser.bigdotExpr_return bigdotExpr() throws RecognitionException {
		GrammarParser.bigdotExpr_return retval = new GrammarParser.bigdotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal201=null;
		Token IDF202=null;
		Token string_literal203=null;
		Token char_literal204=null;
		Token char_literal205=null;
		ParserRuleReturnScope bigvectExpr200 =null;

		CommonTree char_literal201_tree=null;
		CommonTree IDF202_tree=null;
		CommonTree string_literal203_tree=null;
		CommonTree char_literal204_tree=null;
		CommonTree char_literal205_tree=null;

		try {
			// Grammar.g:144:12: ( bigvectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? )
			// Grammar.g:144:14: bigvectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigvectExpr_in_bigdotExpr1231);
			bigvectExpr200=bigvectExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigvectExpr200.getTree());

			// Grammar.g:144:26: ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==37) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// Grammar.g:144:27: '.' ^ ( IDF | 'len' '(' ! ')' !)
					{
					char_literal201=(Token)match(input,37,FOLLOW_37_in_bigdotExpr1234); 
					char_literal201_tree = (CommonTree)adaptor.create(char_literal201);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal201_tree, root_0);

					// Grammar.g:144:32: ( IDF | 'len' '(' ! ')' !)
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==IDF) ) {
						alt59=1;
					}
					else if ( (LA59_0==48) ) {
						alt59=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 59, 0, input);
						throw nvae;
					}

					switch (alt59) {
						case 1 :
							// Grammar.g:144:33: IDF
							{
							IDF202=(Token)match(input,IDF,FOLLOW_IDF_in_bigdotExpr1238); 
							IDF202_tree = (CommonTree)adaptor.create(IDF202);
							adaptor.addChild(root_0, IDF202_tree);

							}
							break;
						case 2 :
							// Grammar.g:144:39: 'len' '(' ! ')' !
							{
							string_literal203=(Token)match(input,48,FOLLOW_48_in_bigdotExpr1242); 
							string_literal203_tree = (CommonTree)adaptor.create(string_literal203);
							adaptor.addChild(root_0, string_literal203_tree);

							char_literal204=(Token)match(input,33,FOLLOW_33_in_bigdotExpr1244); 
							char_literal205=(Token)match(input,34,FOLLOW_34_in_bigdotExpr1246); 
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
	// Grammar.g:146:1: bigunExpr : ( UNAIRE ^| EPERLU ^)? bigdotExpr ;
	public final GrammarParser.bigunExpr_return bigunExpr() throws RecognitionException {
		GrammarParser.bigunExpr_return retval = new GrammarParser.bigunExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE206=null;
		Token EPERLU207=null;
		ParserRuleReturnScope bigdotExpr208 =null;

		CommonTree UNAIRE206_tree=null;
		CommonTree EPERLU207_tree=null;

		try {
			// Grammar.g:146:11: ( ( UNAIRE ^| EPERLU ^)? bigdotExpr )
			// Grammar.g:146:13: ( UNAIRE ^| EPERLU ^)? bigdotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:146:13: ( UNAIRE ^| EPERLU ^)?
			int alt61=3;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==UNAIRE) ) {
				alt61=1;
			}
			else if ( (LA61_0==EPERLU) ) {
				alt61=2;
			}
			switch (alt61) {
				case 1 :
					// Grammar.g:146:14: UNAIRE ^
					{
					UNAIRE206=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigunExpr1260); 
					UNAIRE206_tree = (CommonTree)adaptor.create(UNAIRE206);
					root_0 = (CommonTree)adaptor.becomeRoot(UNAIRE206_tree, root_0);

					}
					break;
				case 2 :
					// Grammar.g:146:22: EPERLU ^
					{
					EPERLU207=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_bigunExpr1263); 
					EPERLU207_tree = (CommonTree)adaptor.create(EPERLU207);
					root_0 = (CommonTree)adaptor.becomeRoot(EPERLU207_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_bigdotExpr_in_bigunExpr1268);
			bigdotExpr208=bigdotExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigdotExpr208.getTree());

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
	// Grammar.g:148:1: bigExpr : ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' exS ( ',' exS )* ')' -> ^( 'print' ( exS )* ) | 'raw_print' '!' '(' exS ( ',' exS )* ')' -> ^( 'raw_print' ( exS )* ) | bigbinExpr1 );
	public final GrammarParser.bigExpr_return bigExpr() throws RecognitionException {
		GrammarParser.bigExpr_return retval = new GrammarParser.bigExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal209=null;
		Token char_literal210=null;
		Token char_literal211=null;
		Token char_literal213=null;
		Token char_literal215=null;
		Token string_literal216=null;
		Token char_literal217=null;
		Token char_literal218=null;
		Token char_literal220=null;
		Token char_literal222=null;
		Token string_literal223=null;
		Token char_literal224=null;
		Token char_literal225=null;
		Token char_literal227=null;
		Token char_literal229=null;
		ParserRuleReturnScope expr212 =null;
		ParserRuleReturnScope expr214 =null;
		ParserRuleReturnScope exS219 =null;
		ParserRuleReturnScope exS221 =null;
		ParserRuleReturnScope exS226 =null;
		ParserRuleReturnScope exS228 =null;
		ParserRuleReturnScope bigbinExpr1230 =null;

		CommonTree string_literal209_tree=null;
		CommonTree char_literal210_tree=null;
		CommonTree char_literal211_tree=null;
		CommonTree char_literal213_tree=null;
		CommonTree char_literal215_tree=null;
		CommonTree string_literal216_tree=null;
		CommonTree char_literal217_tree=null;
		CommonTree char_literal218_tree=null;
		CommonTree char_literal220_tree=null;
		CommonTree char_literal222_tree=null;
		CommonTree string_literal223_tree=null;
		CommonTree char_literal224_tree=null;
		CommonTree char_literal225_tree=null;
		CommonTree char_literal227_tree=null;
		CommonTree char_literal229_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_UNAIRE=new RewriteRuleTokenStream(adaptor,"token UNAIRE");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_exS=new RewriteRuleSubtreeStream(adaptor,"rule exS");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammar.g:149:3: ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' exS ( ',' exS )* ')' -> ^( 'print' ( exS )* ) | 'raw_print' '!' '(' exS ( ',' exS )* ')' -> ^( 'raw_print' ( exS )* ) | bigbinExpr1 )
			int alt65=4;
			switch ( input.LA(1) ) {
			case 55:
				{
				alt65=1;
				}
				break;
			case 51:
				{
				alt65=2;
				}
				break;
			case 52:
				{
				alt65=3;
				}
				break;
			case BOOL:
			case EPERLU:
			case IDF:
			case INT:
			case STAR:
			case SUB:
			case UNAIRE:
			case 33:
			case 47:
			case 57:
				{
				alt65=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// Grammar.g:149:3: 'vec' '!' '[' expr ( ',' expr )* ']'
					{
					string_literal209=(Token)match(input,55,FOLLOW_55_in_bigExpr1278);  
					stream_55.add(string_literal209);

					char_literal210=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1280);  
					stream_UNAIRE.add(char_literal210);

					char_literal211=(Token)match(input,40,FOLLOW_40_in_bigExpr1282);  
					stream_40.add(char_literal211);

					pushFollow(FOLLOW_expr_in_bigExpr1284);
					expr212=expr();
					state._fsp--;

					stream_expr.add(expr212.getTree());
					// Grammar.g:149:22: ( ',' expr )*
					loop62:
					while (true) {
						int alt62=2;
						int LA62_0 = input.LA(1);
						if ( (LA62_0==35) ) {
							alt62=1;
						}

						switch (alt62) {
						case 1 :
							// Grammar.g:149:23: ',' expr
							{
							char_literal213=(Token)match(input,35,FOLLOW_35_in_bigExpr1287);  
							stream_35.add(char_literal213);

							pushFollow(FOLLOW_expr_in_bigExpr1289);
							expr214=expr();
							state._fsp--;

							stream_expr.add(expr214.getTree());
							}
							break;

						default :
							break loop62;
						}
					}

					char_literal215=(Token)match(input,41,FOLLOW_41_in_bigExpr1292);  
					stream_41.add(char_literal215);

					// AST REWRITE
					// elements: 55, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 149:37: -> ^( 'vec' ( expr )* )
					{
						// Grammar.g:149:40: ^( 'vec' ( expr )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_55.nextNode(), root_1);
						// Grammar.g:149:48: ( expr )*
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
					// Grammar.g:150:5: 'print' '!' '(' exS ( ',' exS )* ')'
					{
					string_literal216=(Token)match(input,51,FOLLOW_51_in_bigExpr1307);  
					stream_51.add(string_literal216);

					char_literal217=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1309);  
					stream_UNAIRE.add(char_literal217);

					char_literal218=(Token)match(input,33,FOLLOW_33_in_bigExpr1311);  
					stream_33.add(char_literal218);

					pushFollow(FOLLOW_exS_in_bigExpr1313);
					exS219=exS();
					state._fsp--;

					stream_exS.add(exS219.getTree());
					// Grammar.g:150:25: ( ',' exS )*
					loop63:
					while (true) {
						int alt63=2;
						int LA63_0 = input.LA(1);
						if ( (LA63_0==35) ) {
							alt63=1;
						}

						switch (alt63) {
						case 1 :
							// Grammar.g:150:26: ',' exS
							{
							char_literal220=(Token)match(input,35,FOLLOW_35_in_bigExpr1316);  
							stream_35.add(char_literal220);

							pushFollow(FOLLOW_exS_in_bigExpr1318);
							exS221=exS();
							state._fsp--;

							stream_exS.add(exS221.getTree());
							}
							break;

						default :
							break loop63;
						}
					}

					char_literal222=(Token)match(input,34,FOLLOW_34_in_bigExpr1322);  
					stream_34.add(char_literal222);

					// AST REWRITE
					// elements: 51, exS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 150:40: -> ^( 'print' ( exS )* )
					{
						// Grammar.g:150:43: ^( 'print' ( exS )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_51.nextNode(), root_1);
						// Grammar.g:150:53: ( exS )*
						while ( stream_exS.hasNext() ) {
							adaptor.addChild(root_1, stream_exS.nextTree());
						}
						stream_exS.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammar.g:151:2: 'raw_print' '!' '(' exS ( ',' exS )* ')'
					{
					string_literal223=(Token)match(input,52,FOLLOW_52_in_bigExpr1334);  
					stream_52.add(string_literal223);

					char_literal224=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1336);  
					stream_UNAIRE.add(char_literal224);

					char_literal225=(Token)match(input,33,FOLLOW_33_in_bigExpr1338);  
					stream_33.add(char_literal225);

					pushFollow(FOLLOW_exS_in_bigExpr1340);
					exS226=exS();
					state._fsp--;

					stream_exS.add(exS226.getTree());
					// Grammar.g:151:26: ( ',' exS )*
					loop64:
					while (true) {
						int alt64=2;
						int LA64_0 = input.LA(1);
						if ( (LA64_0==35) ) {
							alt64=1;
						}

						switch (alt64) {
						case 1 :
							// Grammar.g:151:27: ',' exS
							{
							char_literal227=(Token)match(input,35,FOLLOW_35_in_bigExpr1343);  
							stream_35.add(char_literal227);

							pushFollow(FOLLOW_exS_in_bigExpr1345);
							exS228=exS();
							state._fsp--;

							stream_exS.add(exS228.getTree());
							}
							break;

						default :
							break loop64;
						}
					}

					char_literal229=(Token)match(input,34,FOLLOW_34_in_bigExpr1349);  
					stream_34.add(char_literal229);

					// AST REWRITE
					// elements: exS, 52
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 151:41: -> ^( 'raw_print' ( exS )* )
					{
						// Grammar.g:151:44: ^( 'raw_print' ( exS )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_52.nextNode(), root_1);
						// Grammar.g:151:58: ( exS )*
						while ( stream_exS.hasNext() ) {
							adaptor.addChild(root_1, stream_exS.nextTree());
						}
						stream_exS.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Grammar.g:152:3: bigbinExpr1
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bigbinExpr1_in_bigExpr1362);
					bigbinExpr1230=bigbinExpr1();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr1230.getTree());

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
	// Grammar.g:154:1: bigatom : ( INT | BOOL | IDF ^ ( newStruc | callFun )? | block -> ^( ANOBLOCK block ) | 'input' '(' STRING ')' -> ^( 'input' STRING ) | '(' bigExpr ')' -> bigExpr );
	public final GrammarParser.bigatom_return bigatom() throws RecognitionException {
		GrammarParser.bigatom_return retval = new GrammarParser.bigatom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT231=null;
		Token BOOL232=null;
		Token IDF233=null;
		Token string_literal237=null;
		Token char_literal238=null;
		Token STRING239=null;
		Token char_literal240=null;
		Token char_literal241=null;
		Token char_literal243=null;
		ParserRuleReturnScope newStruc234 =null;
		ParserRuleReturnScope callFun235 =null;
		ParserRuleReturnScope block236 =null;
		ParserRuleReturnScope bigExpr242 =null;

		CommonTree INT231_tree=null;
		CommonTree BOOL232_tree=null;
		CommonTree IDF233_tree=null;
		CommonTree string_literal237_tree=null;
		CommonTree char_literal238_tree=null;
		CommonTree STRING239_tree=null;
		CommonTree char_literal240_tree=null;
		CommonTree char_literal241_tree=null;
		CommonTree char_literal243_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// Grammar.g:154:9: ( INT | BOOL | IDF ^ ( newStruc | callFun )? | block -> ^( ANOBLOCK block ) | 'input' '(' STRING ')' -> ^( 'input' STRING ) | '(' bigExpr ')' -> bigExpr )
			int alt67=6;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt67=1;
				}
				break;
			case BOOL:
				{
				alt67=2;
				}
				break;
			case IDF:
				{
				alt67=3;
				}
				break;
			case 57:
				{
				alt67=4;
				}
				break;
			case 47:
				{
				alt67=5;
				}
				break;
			case 33:
				{
				alt67=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// Grammar.g:154:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT231=(Token)match(input,INT,FOLLOW_INT_in_bigatom1370); 
					INT231_tree = (CommonTree)adaptor.create(INT231);
					adaptor.addChild(root_0, INT231_tree);

					}
					break;
				case 2 :
					// Grammar.g:155:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL232=(Token)match(input,BOOL,FOLLOW_BOOL_in_bigatom1374); 
					BOOL232_tree = (CommonTree)adaptor.create(BOOL232);
					adaptor.addChild(root_0, BOOL232_tree);

					}
					break;
				case 3 :
					// Grammar.g:156:4: IDF ^ ( newStruc | callFun )?
					{
					root_0 = (CommonTree)adaptor.nil();


					IDF233=(Token)match(input,IDF,FOLLOW_IDF_in_bigatom1379); 
					IDF233_tree = (CommonTree)adaptor.create(IDF233);
					root_0 = (CommonTree)adaptor.becomeRoot(IDF233_tree, root_0);

					// Grammar.g:156:9: ( newStruc | callFun )?
					int alt66=3;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==57) ) {
						alt66=1;
					}
					else if ( (LA66_0==33) ) {
						alt66=2;
					}
					switch (alt66) {
						case 1 :
							// Grammar.g:156:10: newStruc
							{
							pushFollow(FOLLOW_newStruc_in_bigatom1383);
							newStruc234=newStruc();
							state._fsp--;

							adaptor.addChild(root_0, newStruc234.getTree());

							}
							break;
						case 2 :
							// Grammar.g:156:19: callFun
							{
							pushFollow(FOLLOW_callFun_in_bigatom1385);
							callFun235=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun235.getTree());

							}
							break;

					}

					}
					break;
				case 4 :
					// Grammar.g:157:3: block
					{
					pushFollow(FOLLOW_block_in_bigatom1391);
					block236=block();
					state._fsp--;

					stream_block.add(block236.getTree());
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
					// 157:9: -> ^( ANOBLOCK block )
					{
						// Grammar.g:157:12: ^( ANOBLOCK block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANOBLOCK, "ANOBLOCK"), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Grammar.g:158:2: 'input' '(' STRING ')'
					{
					string_literal237=(Token)match(input,47,FOLLOW_47_in_bigatom1402);  
					stream_47.add(string_literal237);

					char_literal238=(Token)match(input,33,FOLLOW_33_in_bigatom1404);  
					stream_33.add(char_literal238);

					STRING239=(Token)match(input,STRING,FOLLOW_STRING_in_bigatom1406);  
					stream_STRING.add(STRING239);

					char_literal240=(Token)match(input,34,FOLLOW_34_in_bigatom1408);  
					stream_34.add(char_literal240);

					// AST REWRITE
					// elements: STRING, 47
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 158:25: -> ^( 'input' STRING )
					{
						// Grammar.g:158:28: ^( 'input' STRING )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_47.nextNode(), root_1);
						adaptor.addChild(root_1, stream_STRING.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Grammar.g:159:2: '(' bigExpr ')'
					{
					char_literal241=(Token)match(input,33,FOLLOW_33_in_bigatom1419);  
					stream_33.add(char_literal241);

					pushFollow(FOLLOW_bigExpr_in_bigatom1420);
					bigExpr242=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr242.getTree());
					char_literal243=(Token)match(input,34,FOLLOW_34_in_bigatom1421);  
					stream_34.add(char_literal243);

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
					// 159:16: -> bigExpr
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



	public static final BitSet FOLLOW_fichier_in_axiom95 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_axiom97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_fichier113 = new BitSet(new long[]{0x0040200000000002L});
	public static final BitSet FOLLOW_declFun_in_decl124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declStruct_in_decl129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_declStruct138 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_declStruct140 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_declStruct142 = new BitSet(new long[]{0x0400000000008000L});
	public static final BitSet FOLLOW_args_in_declStruct144 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_declStruct147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_args168 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_args170 = new BitSet(new long[]{0x008044080000A000L});
	public static final BitSet FOLLOW_type_in_args172 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_args175 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_args177 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_args179 = new BitSet(new long[]{0x008044080000A000L});
	public static final BitSet FOLLOW_type_in_args181 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_45_in_declFun203 = new BitSet(new long[]{0x0000000000048000L});
	public static final BitSet FOLLOW_IDF_in_declFun206 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_declFun208 = new BitSet(new long[]{0x0000000400008000L});
	public static final BitSet FOLLOW_args_in_declFun210 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_declFun213 = new BitSet(new long[]{0x0200001000000000L});
	public static final BitSet FOLLOW_36_in_declFun216 = new BitSet(new long[]{0x028044000000A000L});
	public static final BitSet FOLLOW_type_in_declFun218 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_block_in_declFun222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_declFun249 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_declFun251 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_declFun253 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_block_in_declFun255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_type277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_type281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_type284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_type289 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_PREV_in_type292 = new BitSet(new long[]{0x008044000010A000L});
	public static final BitSet FOLLOW_type_in_type294 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_NEXT_in_type296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EPERLU_in_type310 = new BitSet(new long[]{0x008044000000A000L});
	public static final BitSet FOLLOW_type_in_type312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_block329 = new BitSet(new long[]{0x03BA88821A03A200L});
	public static final BitSet FOLLOW_instruct_in_block331 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_block332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_callFun351 = new BitSet(new long[]{0x029880061A02A200L});
	public static final BitSet FOLLOW_expr_in_callFun354 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_35_in_callFun357 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_expr_in_callFun359 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_34_in_callFun365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_newStruc382 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_newStruc384 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_newStruc386 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc388 = new BitSet(new long[]{0x0400000800000000L});
	public static final BitSet FOLLOW_35_in_newStruc391 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_newStruc393 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_newStruc395 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc397 = new BitSet(new long[]{0x0400000800000000L});
	public static final BitSet FOLLOW_58_in_newStruc401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_instrBoucle424 = new BitSet(new long[]{0x03BA88821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instrBoucle426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_instruct450 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_instrBoucle_in_instruct452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_instruct456 = new BitSet(new long[]{0x03BA88821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_instruct467 = new BitSet(new long[]{0x0004000000008000L});
	public static final BitSet FOLLOW_50_in_instruct469 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_dotIDF_in_instruct472 = new BitSet(new long[]{0x0000004000004000L});
	public static final BitSet FOLLOW_38_in_instruct475 = new BitSet(new long[]{0x008044000000E000L});
	public static final BitSet FOLLOW_type_in_instruct477 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EQUAL_in_instruct481 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_bigExpr_in_instruct483 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_instruct485 = new BitSet(new long[]{0x03BA88821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_instruct517 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_expr_in_instruct519 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_block_in_instruct521 = new BitSet(new long[]{0x03BA88821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_instruct540 = new BitSet(new long[]{0x029880821A02A200L});
	public static final BitSet FOLLOW_expr_in_instruct542 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_instruct545 = new BitSet(new long[]{0x03BA88821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_instruct563 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_instruct565 = new BitSet(new long[]{0x03BA88821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpr_in_instruct578 = new BitSet(new long[]{0x03BA88821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_dotIDF592 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_dotIDF595 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_dotIDF598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifExpr608 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_expr_in_ifExpr610 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr612 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_ifExpr615 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr2_in_binExpr1645 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_EQUAL_in_binExpr1648 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_binExpr2_in_binExpr1651 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_binExpr3_in_binExpr2662 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_ORBOOL_in_binExpr2664 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_binExpr3_in_binExpr2667 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_binExpr4_in_binExpr3678 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ANDBOOL_in_binExpr3680 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_binExpr4_in_binExpr3683 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_binExpr5_in_binExpr4694 = new BitSet(new long[]{0x0000000000B00002L});
	public static final BitSet FOLLOW_PREV_in_binExpr4697 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_OPBOOLEQ_in_binExpr4700 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_NEXT_in_binExpr4703 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_binExpr5_in_binExpr4707 = new BitSet(new long[]{0x0000000000B00002L});
	public static final BitSet FOLLOW_binExpr6_in_binExpr5718 = new BitSet(new long[]{0x0000000008000012L});
	public static final BitSet FOLLOW_ADD_in_binExpr5721 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_SUB_in_binExpr5724 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_binExpr6_in_binExpr5729 = new BitSet(new long[]{0x0000000008000012L});
	public static final BitSet FOLLOW_unExpr_in_binExpr6740 = new BitSet(new long[]{0x0000000002001002L});
	public static final BitSet FOLLOW_STAR_in_binExpr6744 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_DIV_in_binExpr6747 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_unExpr_in_binExpr6751 = new BitSet(new long[]{0x0000000002001002L});
	public static final BitSet FOLLOW_starExpr_in_vectExpr762 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_vectExpr765 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_expr_in_vectExpr768 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_vectExpr770 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_STAR_in_starExpr784 = new BitSet(new long[]{0x0200800208028200L});
	public static final BitSet FOLLOW_moinsExpr_in_starExpr786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moinsExpr_in_starExpr799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_moinsExpr811 = new BitSet(new long[]{0x0200800208028200L});
	public static final BitSet FOLLOW_moinsExpr_in_moinsExpr813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_moinsExpr826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vectExpr_in_dotExpr835 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_dotExpr838 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_IDF_in_dotExpr842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_dotExpr846 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_dotExpr848 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_dotExpr850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_unExpr864 = new BitSet(new long[]{0x020080020A028200L});
	public static final BitSet FOLLOW_EPERLU_in_unExpr867 = new BitSet(new long[]{0x020080020A028200L});
	public static final BitSet FOLLOW_dotExpr_in_unExpr872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_atom884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_atom889 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_callFun_in_atom894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_atom901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_atom913 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_expr_in_atom914 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_atom915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_atom921 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_atom923 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_STRING_in_atom925 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_atom927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_expr943 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr945 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_expr947 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_expr_in_expr949 = new BitSet(new long[]{0x0000020800000000L});
	public static final BitSet FOLLOW_35_in_expr951 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_expr_in_expr953 = new BitSet(new long[]{0x0000020800000000L});
	public static final BitSet FOLLOW_41_in_expr957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_expr969 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr971 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_expr973 = new BitSet(new long[]{0x029880021E02A200L});
	public static final BitSet FOLLOW_exS_in_expr975 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_35_in_expr979 = new BitSet(new long[]{0x029880021E02A200L});
	public static final BitSet FOLLOW_exS_in_expr981 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_34_in_expr985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_expr997 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr999 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_expr1001 = new BitSet(new long[]{0x029880021E02A200L});
	public static final BitSet FOLLOW_exS_in_expr1003 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_35_in_expr1006 = new BitSet(new long[]{0x029880021E02A200L});
	public static final BitSet FOLLOW_exS_in_expr1008 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_34_in_expr1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr1_in_expr1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exS1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_exS1037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr2_in_bigbinExpr11045 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_EQUAL_in_bigbinExpr11048 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_bigbinExpr2_in_bigbinExpr11051 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bigbinExpr3_in_bigbinExpr21062 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_ORBOOL_in_bigbinExpr21064 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_bigbinExpr3_in_bigbinExpr21067 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_bigbinExpr4_in_bigbinExpr31077 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ANDBOOL_in_bigbinExpr31079 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_bigbinExpr4_in_bigbinExpr31082 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_bigbinExpr5_in_bigbinExpr41093 = new BitSet(new long[]{0x0000000000B00002L});
	public static final BitSet FOLLOW_PREV_in_bigbinExpr41096 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_OPBOOLEQ_in_bigbinExpr41099 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_NEXT_in_bigbinExpr41102 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_bigbinExpr5_in_bigbinExpr41106 = new BitSet(new long[]{0x0000000000B00002L});
	public static final BitSet FOLLOW_bigbinExpr6_in_bigbinExpr51117 = new BitSet(new long[]{0x0000000008000012L});
	public static final BitSet FOLLOW_set_in_bigbinExpr51119 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_bigbinExpr6_in_bigbinExpr51126 = new BitSet(new long[]{0x0000000008000012L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr61137 = new BitSet(new long[]{0x0000000002001002L});
	public static final BitSet FOLLOW_STAR_in_bigbinExpr61141 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_DIV_in_bigbinExpr61144 = new BitSet(new long[]{0x020080021A02A200L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr61148 = new BitSet(new long[]{0x0000000002001002L});
	public static final BitSet FOLLOW_bigstarExpr_in_bigvectExpr1158 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_bigvectExpr1161 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_bigExpr_in_bigvectExpr1164 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_bigvectExpr1166 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_STAR_in_bigstarExpr1180 = new BitSet(new long[]{0x0200800208028200L});
	public static final BitSet FOLLOW_bigmoinsExpr_in_bigstarExpr1182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigmoinsExpr_in_bigstarExpr1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_bigmoinsExpr1207 = new BitSet(new long[]{0x0200800208028200L});
	public static final BitSet FOLLOW_bigmoinsExpr_in_bigmoinsExpr1209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigatom_in_bigmoinsExpr1222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigvectExpr_in_bigdotExpr1231 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_bigdotExpr1234 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_IDF_in_bigdotExpr1238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_bigdotExpr1242 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_bigdotExpr1244 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_bigdotExpr1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_bigunExpr1260 = new BitSet(new long[]{0x020080020A028200L});
	public static final BitSet FOLLOW_EPERLU_in_bigunExpr1263 = new BitSet(new long[]{0x020080020A028200L});
	public static final BitSet FOLLOW_bigdotExpr_in_bigunExpr1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_bigExpr1278 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1280 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_bigExpr1282 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_expr_in_bigExpr1284 = new BitSet(new long[]{0x0000020800000000L});
	public static final BitSet FOLLOW_35_in_bigExpr1287 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_expr_in_bigExpr1289 = new BitSet(new long[]{0x0000020800000000L});
	public static final BitSet FOLLOW_41_in_bigExpr1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_bigExpr1307 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1309 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_bigExpr1311 = new BitSet(new long[]{0x029880021E02A200L});
	public static final BitSet FOLLOW_exS_in_bigExpr1313 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_35_in_bigExpr1316 = new BitSet(new long[]{0x029880021E02A200L});
	public static final BitSet FOLLOW_exS_in_bigExpr1318 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_34_in_bigExpr1322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_bigExpr1334 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1336 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_bigExpr1338 = new BitSet(new long[]{0x029880021E02A200L});
	public static final BitSet FOLLOW_exS_in_bigExpr1340 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_35_in_bigExpr1343 = new BitSet(new long[]{0x029880021E02A200L});
	public static final BitSet FOLLOW_exS_in_bigExpr1345 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_34_in_bigExpr1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr1_in_bigExpr1362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_bigatom1370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_bigatom1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_bigatom1379 = new BitSet(new long[]{0x0200000200000002L});
	public static final BitSet FOLLOW_newStruc_in_bigatom1383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callFun_in_bigatom1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_bigatom1391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_bigatom1402 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_bigatom1404 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_STRING_in_bigatom1406 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_bigatom1408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_bigatom1419 = new BitSet(new long[]{0x029880021A02A200L});
	public static final BitSet FOLLOW_bigExpr_in_bigatom1420 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_bigatom1421 = new BitSet(new long[]{0x0000000000000002L});
}
