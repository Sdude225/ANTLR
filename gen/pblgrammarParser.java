// Generated from C:/Users/HP/Desktop/antlr-demo\pblgrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pblgrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, SNAPSHOT=2, ASTROSIGN=3, DETERMINE=4, FOR=5, DAY=6, MONTH=7, YEAR=8, 
		HOUR=9, MINUTE=10, PRINT=11, PLANET=12, TRUE=13, FALSE=14, ARRAY=15, GENDER=16, 
		LOCATION=17, DEG=18, SIGN=19, GNDNAME=20, PLANET_NAME=21, TYPEOFCALC=22, 
		STRING=23, DIGIT=24, NUM_REAL=25, COLON=26, COMA=27, WS=28, EQUAL=29, 
		DELIM=30, SQRBRACK=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variable_declaration = 2, RULE_array_declaration = 3, 
		RULE_variable_name = 4, RULE_variable_value = 5, RULE_function_parameters = 6, 
		RULE_location = 7, RULE_zone = 8, RULE_date_of_birth = 9, RULE_time_of_birth = 10, 
		RULE_print_statement = 11, RULE_bool = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variable_declaration", "array_declaration", 
			"variable_name", "variable_value", "function_parameters", "location", 
			"zone", "date_of_birth", "time_of_birth", "print_statement", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "':'", "','", null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "SNAPSHOT", "ASTROSIGN", "DETERMINE", "FOR", "DAY", "MONTH", 
			"YEAR", "HOUR", "MINUTE", "PRINT", "PLANET", "TRUE", "FALSE", "ARRAY", 
			"GENDER", "LOCATION", "DEG", "SIGN", "GNDNAME", "PLANET_NAME", "TYPEOFCALC", 
			"STRING", "DIGIT", "NUM_REAL", "COLON", "COMA", "WS", "EQUAL", "DELIM", 
			"SQRBRACK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "pblgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pblgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(pblgrammarParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				statement();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << ARRAY))) != 0) );
			setState(31);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				variable_declaration();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				array_declaration();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				print_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(pblgrammarParser.VAR, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(pblgrammarParser.EQUAL, 0); }
		public Variable_valueContext variable_value() {
			return getRuleContext(Variable_valueContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(VAR);
			setState(39);
			variable_name();
			setState(40);
			match(EQUAL);
			setState(41);
			variable_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_declarationContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(pblgrammarParser.ARRAY, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public List<TerminalNode> SQRBRACK() { return getTokens(pblgrammarParser.SQRBRACK); }
		public TerminalNode SQRBRACK(int i) {
			return getToken(pblgrammarParser.SQRBRACK, i);
		}
		public TerminalNode DIGIT() { return getToken(pblgrammarParser.DIGIT, 0); }
		public Array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterArray_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitArray_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitArray_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(ARRAY);
			setState(44);
			variable_name();
			setState(45);
			match(SQRBRACK);
			setState(46);
			match(DIGIT);
			setState(47);
			match(SQRBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(pblgrammarParser.STRING, 0); }
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_valueContext extends ParserRuleContext {
		public TerminalNode GENDER() { return getToken(pblgrammarParser.GENDER, 0); }
		public List<TerminalNode> DELIM() { return getTokens(pblgrammarParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(pblgrammarParser.DELIM, i);
		}
		public TerminalNode GNDNAME() { return getToken(pblgrammarParser.GNDNAME, 0); }
		public TerminalNode TYPEOFCALC() { return getToken(pblgrammarParser.TYPEOFCALC, 0); }
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public TerminalNode PLANET() { return getToken(pblgrammarParser.PLANET, 0); }
		public TerminalNode PLANET_NAME() { return getToken(pblgrammarParser.PLANET_NAME, 0); }
		public TerminalNode LOCATION() { return getToken(pblgrammarParser.LOCATION, 0); }
		public List<TerminalNode> DEG() { return getTokens(pblgrammarParser.DEG); }
		public TerminalNode DEG(int i) {
			return getToken(pblgrammarParser.DEG, i);
		}
		public List<TerminalNode> COMA() { return getTokens(pblgrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pblgrammarParser.COMA, i);
		}
		public TerminalNode SNAPSHOT() { return getToken(pblgrammarParser.SNAPSHOT, 0); }
		public Date_of_birthContext date_of_birth() {
			return getRuleContext(Date_of_birthContext.class,0);
		}
		public Time_of_birthContext time_of_birth() {
			return getRuleContext(Time_of_birthContext.class,0);
		}
		public ZoneContext zone() {
			return getRuleContext(ZoneContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode ASTROSIGN() { return getToken(pblgrammarParser.ASTROSIGN, 0); }
		public TerminalNode SIGN() { return getToken(pblgrammarParser.SIGN, 0); }
		public Variable_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterVariable_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitVariable_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitVariable_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_valueContext variable_value() throws RecognitionException {
		Variable_valueContext _localctx = new Variable_valueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_value);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(GENDER);
				setState(52);
				match(DELIM);
				setState(53);
				match(GNDNAME);
				setState(54);
				match(DELIM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(TYPEOFCALC);
				setState(56);
				match(DELIM);
				setState(57);
				function_parameters();
				setState(58);
				match(DELIM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(TYPEOFCALC);
				setState(61);
				match(DELIM);
				setState(62);
				match(DELIM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(PLANET);
				setState(64);
				match(DELIM);
				setState(65);
				match(PLANET_NAME);
				setState(66);
				match(DELIM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				match(LOCATION);
				setState(68);
				match(DELIM);
				setState(69);
				match(DEG);
				setState(70);
				match(COMA);
				setState(71);
				match(DEG);
				setState(72);
				match(DELIM);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				match(SNAPSHOT);
				setState(74);
				match(DELIM);
				setState(75);
				date_of_birth();
				setState(76);
				match(COMA);
				setState(77);
				time_of_birth();
				setState(78);
				match(COMA);
				setState(79);
				zone();
				setState(80);
				match(COMA);
				setState(81);
				location();
				setState(82);
				match(DELIM);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				match(ASTROSIGN);
				setState(85);
				match(DELIM);
				setState(86);
				match(SIGN);
				setState(87);
				match(DELIM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parametersContext extends ParserRuleContext {
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public TerminalNode COMA() { return getToken(pblgrammarParser.COMA, 0); }
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitFunction_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitFunction_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				variable_name();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(95);
				match(COMA);
				setState(96);
				variable_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public List<TerminalNode> DEG() { return getTokens(pblgrammarParser.DEG); }
		public TerminalNode DEG(int i) {
			return getToken(pblgrammarParser.DEG, i);
		}
		public TerminalNode COMA() { return getToken(pblgrammarParser.COMA, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(DEG);
			setState(100);
			match(COMA);
			setState(101);
			match(DEG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZoneContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(pblgrammarParser.STRING, 0); }
		public ZoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitZone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZoneContext zone() throws RecognitionException {
		ZoneContext _localctx = new ZoneContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_zone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_of_birthContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(pblgrammarParser.DAY, 0); }
		public List<TerminalNode> COLON() { return getTokens(pblgrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(pblgrammarParser.COLON, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(pblgrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(pblgrammarParser.DIGIT, i);
		}
		public List<TerminalNode> COMA() { return getTokens(pblgrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pblgrammarParser.COMA, i);
		}
		public TerminalNode MONTH() { return getToken(pblgrammarParser.MONTH, 0); }
		public TerminalNode YEAR() { return getToken(pblgrammarParser.YEAR, 0); }
		public Date_of_birthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_of_birth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterDate_of_birth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitDate_of_birth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitDate_of_birth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_of_birthContext date_of_birth() throws RecognitionException {
		Date_of_birthContext _localctx = new Date_of_birthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_date_of_birth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(DAY);
			setState(106);
			match(COLON);
			setState(107);
			match(DIGIT);
			setState(108);
			match(COMA);
			setState(109);
			match(MONTH);
			setState(110);
			match(COLON);
			setState(111);
			match(DIGIT);
			setState(112);
			match(COMA);
			setState(113);
			match(YEAR);
			setState(114);
			match(COLON);
			setState(115);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_of_birthContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(pblgrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(pblgrammarParser.DIGIT, i);
		}
		public TerminalNode COLON() { return getToken(pblgrammarParser.COLON, 0); }
		public Time_of_birthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_of_birth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterTime_of_birth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitTime_of_birth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitTime_of_birth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_of_birthContext time_of_birth() throws RecognitionException {
		Time_of_birthContext _localctx = new Time_of_birthContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_time_of_birth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(DIGIT);
			setState(118);
			match(COLON);
			setState(119);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(pblgrammarParser.PRINT, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitPrint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(PRINT);
			setState(122);
			variable_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(pblgrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pblgrammarParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pblgrammarListener ) ((pblgrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pblgrammarVisitor ) return ((pblgrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0081\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\3\3\3"+
		"\3\3\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7[\n\7\3\b\6\b^\n\b\r\b\16\b_\3\b\3\b\5\bd\n\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\2\3\3\2\17\20\2~\2\35\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b-\3"+
		"\2\2\2\n\63\3\2\2\2\fZ\3\2\2\2\16]\3\2\2\2\20e\3\2\2\2\22i\3\2\2\2\24"+
		"k\3\2\2\2\26w\3\2\2\2\30{\3\2\2\2\32~\3\2\2\2\34\36\5\4\3\2\35\34\3\2"+
		"\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\2\2\3\"\3"+
		"\3\2\2\2#\'\5\6\4\2$\'\5\b\5\2%\'\5\30\r\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2"+
		"\2\'\5\3\2\2\2()\7\3\2\2)*\5\n\6\2*+\7\37\2\2+,\5\f\7\2,\7\3\2\2\2-.\7"+
		"\21\2\2./\5\n\6\2/\60\7!\2\2\60\61\7\32\2\2\61\62\7!\2\2\62\t\3\2\2\2"+
		"\63\64\7\31\2\2\64\13\3\2\2\2\65\66\7\22\2\2\66\67\7 \2\2\678\7\26\2\2"+
		"8[\7 \2\29:\7\30\2\2:;\7 \2\2;<\5\16\b\2<=\7 \2\2=[\3\2\2\2>?\7\30\2\2"+
		"?@\7 \2\2@[\7 \2\2AB\7\16\2\2BC\7 \2\2CD\7\27\2\2D[\7 \2\2EF\7\23\2\2"+
		"FG\7 \2\2GH\7\24\2\2HI\7\35\2\2IJ\7\24\2\2J[\7 \2\2KL\7\4\2\2LM\7 \2\2"+
		"MN\5\24\13\2NO\7\35\2\2OP\5\26\f\2PQ\7\35\2\2QR\5\22\n\2RS\7\35\2\2ST"+
		"\5\20\t\2TU\7 \2\2U[\3\2\2\2VW\7\5\2\2WX\7 \2\2XY\7\25\2\2Y[\7 \2\2Z\65"+
		"\3\2\2\2Z9\3\2\2\2Z>\3\2\2\2ZA\3\2\2\2ZE\3\2\2\2ZK\3\2\2\2ZV\3\2\2\2["+
		"\r\3\2\2\2\\^\5\n\6\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2"+
		"\2ab\7\35\2\2bd\5\n\6\2ca\3\2\2\2cd\3\2\2\2d\17\3\2\2\2ef\7\24\2\2fg\7"+
		"\35\2\2gh\7\24\2\2h\21\3\2\2\2ij\7\31\2\2j\23\3\2\2\2kl\7\b\2\2lm\7\34"+
		"\2\2mn\7\32\2\2no\7\35\2\2op\7\t\2\2pq\7\34\2\2qr\7\32\2\2rs\7\35\2\2"+
		"st\7\n\2\2tu\7\34\2\2uv\7\32\2\2v\25\3\2\2\2wx\7\32\2\2xy\7\34\2\2yz\7"+
		"\32\2\2z\27\3\2\2\2{|\7\r\2\2|}\5\n\6\2}\31\3\2\2\2~\177\t\2\2\2\177\33"+
		"\3\2\2\2\7\37&Z_c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}