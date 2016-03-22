package emfviews.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import emfviews.dsl.services.VpdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVpdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create view'", "'on'", "','", "'as'", "'select'", "'from'", "'where'", "'*'", "'.'", "'join'", "'and'", "'or'", "'='", "'<='", "'>='", "'<'", "'>'", "'<>'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVpdlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpdlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpdlParser.tokenNames; }
    public String getGrammarFileName() { return "../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g"; }



     	private VpdlGrammarAccess grammarAccess;
     	
        public InternalVpdlParser(TokenStream input, VpdlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected VpdlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'create view' ( (lv_viewName_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_metamodel_3_0= ruleMetamodel ) ) (otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) ) )* ( (lv_expression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_viewName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_metamodel_3_0 = null;

        EObject lv_metamodel_5_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:79:28: ( (otherlv_0= 'create view' ( (lv_viewName_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_metamodel_3_0= ruleMetamodel ) ) (otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) ) )* ( (lv_expression_6_0= ruleExpression ) ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:80:1: (otherlv_0= 'create view' ( (lv_viewName_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_metamodel_3_0= ruleMetamodel ) ) (otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) ) )* ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:80:1: (otherlv_0= 'create view' ( (lv_viewName_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_metamodel_3_0= ruleMetamodel ) ) (otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) ) )* ( (lv_expression_6_0= ruleExpression ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:80:3: otherlv_0= 'create view' ( (lv_viewName_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_metamodel_3_0= ruleMetamodel ) ) (otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) ) )* ( (lv_expression_6_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getCreateViewKeyword_0());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:84:1: ( (lv_viewName_1_0= RULE_ID ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:85:1: (lv_viewName_1_0= RULE_ID )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:85:1: (lv_viewName_1_0= RULE_ID )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:86:3: lv_viewName_1_0= RULE_ID
            {
            lv_viewName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel139); 

            			newLeafNode(lv_viewName_1_0, grammarAccess.getModelAccess().getViewNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"viewName",
                    		lv_viewName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getOnKeyword_2());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:106:1: ( (lv_metamodel_3_0= ruleMetamodel ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:107:1: (lv_metamodel_3_0= ruleMetamodel )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:107:1: (lv_metamodel_3_0= ruleMetamodel )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:108:3: lv_metamodel_3_0= ruleMetamodel
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMetamodel_in_ruleModel177);
            lv_metamodel_3_0=ruleMetamodel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"metamodel",
                    		lv_metamodel_3_0, 
                    		"Metamodel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:124:2: (otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:124:4: otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModel190); 

            	        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getCommaKeyword_4_0());
            	        
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:128:1: ( (lv_metamodel_5_0= ruleMetamodel ) )
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:129:1: (lv_metamodel_5_0= ruleMetamodel )
            	    {
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:129:1: (lv_metamodel_5_0= ruleMetamodel )
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:130:3: lv_metamodel_5_0= ruleMetamodel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetamodel_in_ruleModel211);
            	    lv_metamodel_5_0=ruleMetamodel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metamodel",
            	            		lv_metamodel_5_0, 
            	            		"Metamodel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:146:4: ( (lv_expression_6_0= ruleExpression ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:147:1: (lv_expression_6_0= ruleExpression )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:147:1: (lv_expression_6_0= ruleExpression )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:148:3: lv_expression_6_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getExpressionExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleModel234);
            lv_expression_6_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"expression",
                    		lv_expression_6_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMetamodel"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:172:1: entryRuleMetamodel returns [EObject current=null] : iv_ruleMetamodel= ruleMetamodel EOF ;
    public final EObject entryRuleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodel = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:173:2: (iv_ruleMetamodel= ruleMetamodel EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:174:2: iv_ruleMetamodel= ruleMetamodel EOF
            {
             newCompositeNode(grammarAccess.getMetamodelRule()); 
            pushFollow(FOLLOW_ruleMetamodel_in_entryRuleMetamodel270);
            iv_ruleMetamodel=ruleMetamodel();

            state._fsp--;

             current =iv_ruleMetamodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodel280); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:181:1: ruleMetamodel returns [EObject current=null] : ( ( (lv_metamodelURL_0_0= ruleEString ) ) otherlv_1= 'as' ( (lv_metamodelName_2_0= ruleMetamodelName ) ) ) ;
    public final EObject ruleMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_metamodelURL_0_0 = null;

        EObject lv_metamodelName_2_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:184:28: ( ( ( (lv_metamodelURL_0_0= ruleEString ) ) otherlv_1= 'as' ( (lv_metamodelName_2_0= ruleMetamodelName ) ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:185:1: ( ( (lv_metamodelURL_0_0= ruleEString ) ) otherlv_1= 'as' ( (lv_metamodelName_2_0= ruleMetamodelName ) ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:185:1: ( ( (lv_metamodelURL_0_0= ruleEString ) ) otherlv_1= 'as' ( (lv_metamodelName_2_0= ruleMetamodelName ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:185:2: ( (lv_metamodelURL_0_0= ruleEString ) ) otherlv_1= 'as' ( (lv_metamodelName_2_0= ruleMetamodelName ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:185:2: ( (lv_metamodelURL_0_0= ruleEString ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:186:1: (lv_metamodelURL_0_0= ruleEString )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:186:1: (lv_metamodelURL_0_0= ruleEString )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:187:3: lv_metamodelURL_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMetamodelAccess().getMetamodelURLEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleMetamodel326);
            lv_metamodelURL_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetamodelRule());
            	        }
                   		add(
                   			current, 
                   			"metamodelURL",
                    		lv_metamodelURL_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMetamodel338); 

                	newLeafNode(otherlv_1, grammarAccess.getMetamodelAccess().getAsKeyword_1());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:207:1: ( (lv_metamodelName_2_0= ruleMetamodelName ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:208:1: (lv_metamodelName_2_0= ruleMetamodelName )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:208:1: (lv_metamodelName_2_0= ruleMetamodelName )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:209:3: lv_metamodelName_2_0= ruleMetamodelName
            {
             
            	        newCompositeNode(grammarAccess.getMetamodelAccess().getMetamodelNameMetamodelNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMetamodelName_in_ruleMetamodel359);
            lv_metamodelName_2_0=ruleMetamodelName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetamodelRule());
            	        }
                   		add(
                   			current, 
                   			"metamodelName",
                    		lv_metamodelName_2_0, 
                    		"MetamodelName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRuleExpression"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:233:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:234:2: (iv_ruleExpression= ruleExpression EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:235:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression395);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression405); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:242:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'select' ( (lv_select_1_0= ruleSelect ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleFrom ) ) otherlv_4= 'where' ( (lv_condition_5_0= ruleCondition ) )+ ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_select_1_0 = null;

        EObject lv_from_3_0 = null;

        EObject lv_condition_5_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:245:28: ( (otherlv_0= 'select' ( (lv_select_1_0= ruleSelect ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleFrom ) ) otherlv_4= 'where' ( (lv_condition_5_0= ruleCondition ) )+ ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:246:1: (otherlv_0= 'select' ( (lv_select_1_0= ruleSelect ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleFrom ) ) otherlv_4= 'where' ( (lv_condition_5_0= ruleCondition ) )+ )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:246:1: (otherlv_0= 'select' ( (lv_select_1_0= ruleSelect ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleFrom ) ) otherlv_4= 'where' ( (lv_condition_5_0= ruleCondition ) )+ )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:246:3: otherlv_0= 'select' ( (lv_select_1_0= ruleSelect ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleFrom ) ) otherlv_4= 'where' ( (lv_condition_5_0= ruleCondition ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleExpression442); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getSelectKeyword_0());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:250:1: ( (lv_select_1_0= ruleSelect ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:251:1: (lv_select_1_0= ruleSelect )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:251:1: (lv_select_1_0= ruleSelect )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:252:3: lv_select_1_0= ruleSelect
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getSelectSelectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSelect_in_ruleExpression463);
            lv_select_1_0=ruleSelect();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"select",
                    		lv_select_1_0, 
                    		"Select");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleExpression475); 

                	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getFromKeyword_2());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:272:1: ( (lv_from_3_0= ruleFrom ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:273:1: (lv_from_3_0= ruleFrom )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:273:1: (lv_from_3_0= ruleFrom )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:274:3: lv_from_3_0= ruleFrom
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getFromFromParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFrom_in_ruleExpression496);
            lv_from_3_0=ruleFrom();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"from",
                    		lv_from_3_0, 
                    		"From");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleExpression508); 

                	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getWhereKeyword_4());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:294:1: ( (lv_condition_5_0= ruleCondition ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:295:1: (lv_condition_5_0= ruleCondition )
            	    {
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:295:1: (lv_condition_5_0= ruleCondition )
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:296:3: lv_condition_5_0= ruleCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getConditionConditionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCondition_in_ruleExpression529);
            	    lv_condition_5_0=ruleCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"condition",
            	            		lv_condition_5_0, 
            	            		"Condition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSelect"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:320:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:321:2: (iv_ruleSelect= ruleSelect EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:322:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect566);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect576); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:329:1: ruleSelect returns [EObject current=null] : ( ( (lv_select_0_0= '*' ) ) | ( ( (lv_selectAttribute_1_0= ruleSelectAttribute ) ) (otherlv_2= ',' ( (lv_selectAttribute_3_0= ruleSelectAttribute ) ) )* ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token lv_select_0_0=null;
        Token otherlv_2=null;
        EObject lv_selectAttribute_1_0 = null;

        EObject lv_selectAttribute_3_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:332:28: ( ( ( (lv_select_0_0= '*' ) ) | ( ( (lv_selectAttribute_1_0= ruleSelectAttribute ) ) (otherlv_2= ',' ( (lv_selectAttribute_3_0= ruleSelectAttribute ) ) )* ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:333:1: ( ( (lv_select_0_0= '*' ) ) | ( ( (lv_selectAttribute_1_0= ruleSelectAttribute ) ) (otherlv_2= ',' ( (lv_selectAttribute_3_0= ruleSelectAttribute ) ) )* ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:333:1: ( ( (lv_select_0_0= '*' ) ) | ( ( (lv_selectAttribute_1_0= ruleSelectAttribute ) ) (otherlv_2= ',' ( (lv_selectAttribute_3_0= ruleSelectAttribute ) ) )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:333:2: ( (lv_select_0_0= '*' ) )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:333:2: ( (lv_select_0_0= '*' ) )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:334:1: (lv_select_0_0= '*' )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:334:1: (lv_select_0_0= '*' )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:335:3: lv_select_0_0= '*'
                    {
                    lv_select_0_0=(Token)match(input,18,FOLLOW_18_in_ruleSelect619); 

                            newLeafNode(lv_select_0_0, grammarAccess.getSelectAccess().getSelectAsteriskKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectRule());
                    	        }
                           		addWithLastConsumed(current, "select", lv_select_0_0, "*");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:349:6: ( ( (lv_selectAttribute_1_0= ruleSelectAttribute ) ) (otherlv_2= ',' ( (lv_selectAttribute_3_0= ruleSelectAttribute ) ) )* )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:349:6: ( ( (lv_selectAttribute_1_0= ruleSelectAttribute ) ) (otherlv_2= ',' ( (lv_selectAttribute_3_0= ruleSelectAttribute ) ) )* )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:349:7: ( (lv_selectAttribute_1_0= ruleSelectAttribute ) ) (otherlv_2= ',' ( (lv_selectAttribute_3_0= ruleSelectAttribute ) ) )*
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:349:7: ( (lv_selectAttribute_1_0= ruleSelectAttribute ) )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:350:1: (lv_selectAttribute_1_0= ruleSelectAttribute )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:350:1: (lv_selectAttribute_1_0= ruleSelectAttribute )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:351:3: lv_selectAttribute_1_0= ruleSelectAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectAccess().getSelectAttributeSelectAttributeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectAttribute_in_ruleSelect660);
                    lv_selectAttribute_1_0=ruleSelectAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectRule());
                    	        }
                           		add(
                           			current, 
                           			"selectAttribute",
                            		lv_selectAttribute_1_0, 
                            		"SelectAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:367:2: (otherlv_2= ',' ( (lv_selectAttribute_3_0= ruleSelectAttribute ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:367:4: otherlv_2= ',' ( (lv_selectAttribute_3_0= ruleSelectAttribute ) )
                    	    {
                    	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSelect673); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:371:1: ( (lv_selectAttribute_3_0= ruleSelectAttribute ) )
                    	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:372:1: (lv_selectAttribute_3_0= ruleSelectAttribute )
                    	    {
                    	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:372:1: (lv_selectAttribute_3_0= ruleSelectAttribute )
                    	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:373:3: lv_selectAttribute_3_0= ruleSelectAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectAccess().getSelectAttributeSelectAttributeParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSelectAttribute_in_ruleSelect694);
                    	    lv_selectAttribute_3_0=ruleSelectAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSelectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"selectAttribute",
                    	            		lv_selectAttribute_3_0, 
                    	            		"SelectAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleSelectAttribute"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:397:1: entryRuleSelectAttribute returns [EObject current=null] : iv_ruleSelectAttribute= ruleSelectAttribute EOF ;
    public final EObject entryRuleSelectAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAttribute = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:398:2: (iv_ruleSelectAttribute= ruleSelectAttribute EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:399:2: iv_ruleSelectAttribute= ruleSelectAttribute EOF
            {
             newCompositeNode(grammarAccess.getSelectAttributeRule()); 
            pushFollow(FOLLOW_ruleSelectAttribute_in_entryRuleSelectAttribute733);
            iv_ruleSelectAttribute=ruleSelectAttribute();

            state._fsp--;

             current =iv_ruleSelectAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAttribute743); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectAttribute"


    // $ANTLR start "ruleSelectAttribute"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:406:1: ruleSelectAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_class_2_0= ruleClass ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleAttribute ) ) ) ;
    public final EObject ruleSelectAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_class_2_0 = null;

        EObject lv_attribute_4_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:409:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_class_2_0= ruleClass ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleAttribute ) ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:410:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_class_2_0= ruleClass ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleAttribute ) ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:410:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_class_2_0= ruleClass ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleAttribute ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:410:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_class_2_0= ruleClass ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleAttribute ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:410:2: ( (otherlv_0= RULE_ID ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:411:1: (otherlv_0= RULE_ID )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:411:1: (otherlv_0= RULE_ID )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:412:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectAttribute788); 

            		newLeafNode(otherlv_0, grammarAccess.getSelectAttributeAccess().getMetamodelMetamodelNameCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleSelectAttribute800); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectAttributeAccess().getFullStopKeyword_1());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:427:1: ( (lv_class_2_0= ruleClass ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:428:1: (lv_class_2_0= ruleClass )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:428:1: (lv_class_2_0= ruleClass )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:429:3: lv_class_2_0= ruleClass
            {
             
            	        newCompositeNode(grammarAccess.getSelectAttributeAccess().getClassClassParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleClass_in_ruleSelectAttribute821);
            lv_class_2_0=ruleClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectAttributeRule());
            	        }
                   		add(
                   			current, 
                   			"class",
                    		lv_class_2_0, 
                    		"Class");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSelectAttribute833); 

                	newLeafNode(otherlv_3, grammarAccess.getSelectAttributeAccess().getFullStopKeyword_3());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:449:1: ( (lv_attribute_4_0= ruleAttribute ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:450:1: (lv_attribute_4_0= ruleAttribute )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:450:1: (lv_attribute_4_0= ruleAttribute )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:451:3: lv_attribute_4_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getSelectAttributeAccess().getAttributeAttributeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleSelectAttribute854);
            lv_attribute_4_0=ruleAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectAttributeRule());
            	        }
                   		add(
                   			current, 
                   			"attribute",
                    		lv_attribute_4_0, 
                    		"Attribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectAttribute"


    // $ANTLR start "entryRuleFrom"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:475:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:476:2: (iv_ruleFrom= ruleFrom EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:477:2: iv_ruleFrom= ruleFrom EOF
            {
             newCompositeNode(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_ruleFrom_in_entryRuleFrom890);
            iv_ruleFrom=ruleFrom();

            state._fsp--;

             current =iv_ruleFrom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrom900); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:484:1: ruleFrom returns [EObject current=null] : ( ( (lv_join_0_0= ruleJoin ) ) (otherlv_1= ',' ( (lv_join_2_0= ruleJoin ) ) )* ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_join_0_0 = null;

        EObject lv_join_2_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:487:28: ( ( ( (lv_join_0_0= ruleJoin ) ) (otherlv_1= ',' ( (lv_join_2_0= ruleJoin ) ) )* ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:488:1: ( ( (lv_join_0_0= ruleJoin ) ) (otherlv_1= ',' ( (lv_join_2_0= ruleJoin ) ) )* )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:488:1: ( ( (lv_join_0_0= ruleJoin ) ) (otherlv_1= ',' ( (lv_join_2_0= ruleJoin ) ) )* )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:488:2: ( (lv_join_0_0= ruleJoin ) ) (otherlv_1= ',' ( (lv_join_2_0= ruleJoin ) ) )*
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:488:2: ( (lv_join_0_0= ruleJoin ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:489:1: (lv_join_0_0= ruleJoin )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:489:1: (lv_join_0_0= ruleJoin )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:490:3: lv_join_0_0= ruleJoin
            {
             
            	        newCompositeNode(grammarAccess.getFromAccess().getJoinJoinParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleJoin_in_ruleFrom946);
            lv_join_0_0=ruleJoin();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFromRule());
            	        }
                   		add(
                   			current, 
                   			"join",
                    		lv_join_0_0, 
                    		"Join");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:506:2: (otherlv_1= ',' ( (lv_join_2_0= ruleJoin ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:506:4: otherlv_1= ',' ( (lv_join_2_0= ruleJoin ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleFrom959); 

            	        	newLeafNode(otherlv_1, grammarAccess.getFromAccess().getCommaKeyword_1_0());
            	        
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:510:1: ( (lv_join_2_0= ruleJoin ) )
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:511:1: (lv_join_2_0= ruleJoin )
            	    {
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:511:1: (lv_join_2_0= ruleJoin )
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:512:3: lv_join_2_0= ruleJoin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFromAccess().getJoinJoinParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJoin_in_ruleFrom980);
            	    lv_join_2_0=ruleJoin();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFromRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"join",
            	            		lv_join_2_0, 
            	            		"Join");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRuleJoin"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:536:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:537:2: (iv_ruleJoin= ruleJoin EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:538:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin1018);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin1028); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:545:1: ruleJoin returns [EObject current=null] : ( ( (lv_joinLeft_0_0= ruleJoinLeft ) ) otherlv_1= 'join' ( (lv_joinRight_2_0= ruleJoinRight ) ) otherlv_3= 'as' ( (lv_relation_4_0= ruleRelation ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_joinLeft_0_0 = null;

        EObject lv_joinRight_2_0 = null;

        EObject lv_relation_4_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:548:28: ( ( ( (lv_joinLeft_0_0= ruleJoinLeft ) ) otherlv_1= 'join' ( (lv_joinRight_2_0= ruleJoinRight ) ) otherlv_3= 'as' ( (lv_relation_4_0= ruleRelation ) ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:549:1: ( ( (lv_joinLeft_0_0= ruleJoinLeft ) ) otherlv_1= 'join' ( (lv_joinRight_2_0= ruleJoinRight ) ) otherlv_3= 'as' ( (lv_relation_4_0= ruleRelation ) ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:549:1: ( ( (lv_joinLeft_0_0= ruleJoinLeft ) ) otherlv_1= 'join' ( (lv_joinRight_2_0= ruleJoinRight ) ) otherlv_3= 'as' ( (lv_relation_4_0= ruleRelation ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:549:2: ( (lv_joinLeft_0_0= ruleJoinLeft ) ) otherlv_1= 'join' ( (lv_joinRight_2_0= ruleJoinRight ) ) otherlv_3= 'as' ( (lv_relation_4_0= ruleRelation ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:549:2: ( (lv_joinLeft_0_0= ruleJoinLeft ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:550:1: (lv_joinLeft_0_0= ruleJoinLeft )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:550:1: (lv_joinLeft_0_0= ruleJoinLeft )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:551:3: lv_joinLeft_0_0= ruleJoinLeft
            {
             
            	        newCompositeNode(grammarAccess.getJoinAccess().getJoinLeftJoinLeftParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleJoinLeft_in_ruleJoin1074);
            lv_joinLeft_0_0=ruleJoinLeft();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinRule());
            	        }
                   		add(
                   			current, 
                   			"joinLeft",
                    		lv_joinLeft_0_0, 
                    		"JoinLeft");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleJoin1086); 

                	newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getJoinKeyword_1());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:571:1: ( (lv_joinRight_2_0= ruleJoinRight ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:572:1: (lv_joinRight_2_0= ruleJoinRight )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:572:1: (lv_joinRight_2_0= ruleJoinRight )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:573:3: lv_joinRight_2_0= ruleJoinRight
            {
             
            	        newCompositeNode(grammarAccess.getJoinAccess().getJoinRightJoinRightParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJoinRight_in_ruleJoin1107);
            lv_joinRight_2_0=ruleJoinRight();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinRule());
            	        }
                   		add(
                   			current, 
                   			"joinRight",
                    		lv_joinRight_2_0, 
                    		"JoinRight");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleJoin1119); 

                	newLeafNode(otherlv_3, grammarAccess.getJoinAccess().getAsKeyword_3());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:593:1: ( (lv_relation_4_0= ruleRelation ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:594:1: (lv_relation_4_0= ruleRelation )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:594:1: (lv_relation_4_0= ruleRelation )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:595:3: lv_relation_4_0= ruleRelation
            {
             
            	        newCompositeNode(grammarAccess.getJoinAccess().getRelationRelationParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleRelation_in_ruleJoin1140);
            lv_relation_4_0=ruleRelation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinRule());
            	        }
                   		add(
                   			current, 
                   			"relation",
                    		lv_relation_4_0, 
                    		"Relation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleJoinLeft"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:619:1: entryRuleJoinLeft returns [EObject current=null] : iv_ruleJoinLeft= ruleJoinLeft EOF ;
    public final EObject entryRuleJoinLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinLeft = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:620:2: (iv_ruleJoinLeft= ruleJoinLeft EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:621:2: iv_ruleJoinLeft= ruleJoinLeft EOF
            {
             newCompositeNode(grammarAccess.getJoinLeftRule()); 
            pushFollow(FOLLOW_ruleJoinLeft_in_entryRuleJoinLeft1176);
            iv_ruleJoinLeft=ruleJoinLeft();

            state._fsp--;

             current =iv_ruleJoinLeft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinLeft1186); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinLeft"


    // $ANTLR start "ruleJoinLeft"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:628:1: ruleJoinLeft returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_classLeft_2_0= ruleClass ) ) ) ;
    public final EObject ruleJoinLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_classLeft_2_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:631:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_classLeft_2_0= ruleClass ) ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:632:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_classLeft_2_0= ruleClass ) ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:632:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_classLeft_2_0= ruleClass ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:632:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_classLeft_2_0= ruleClass ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:632:2: ( (otherlv_0= RULE_ID ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:633:1: (otherlv_0= RULE_ID )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:633:1: (otherlv_0= RULE_ID )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:634:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJoinLeftRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJoinLeft1231); 

            		newLeafNode(otherlv_0, grammarAccess.getJoinLeftAccess().getMetamodelLeftMetamodelNameCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleJoinLeft1243); 

                	newLeafNode(otherlv_1, grammarAccess.getJoinLeftAccess().getFullStopKeyword_1());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:649:1: ( (lv_classLeft_2_0= ruleClass ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:650:1: (lv_classLeft_2_0= ruleClass )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:650:1: (lv_classLeft_2_0= ruleClass )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:651:3: lv_classLeft_2_0= ruleClass
            {
             
            	        newCompositeNode(grammarAccess.getJoinLeftAccess().getClassLeftClassParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleClass_in_ruleJoinLeft1264);
            lv_classLeft_2_0=ruleClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinLeftRule());
            	        }
                   		add(
                   			current, 
                   			"classLeft",
                    		lv_classLeft_2_0, 
                    		"Class");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinLeft"


    // $ANTLR start "entryRuleJoinRight"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:675:1: entryRuleJoinRight returns [EObject current=null] : iv_ruleJoinRight= ruleJoinRight EOF ;
    public final EObject entryRuleJoinRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinRight = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:676:2: (iv_ruleJoinRight= ruleJoinRight EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:677:2: iv_ruleJoinRight= ruleJoinRight EOF
            {
             newCompositeNode(grammarAccess.getJoinRightRule()); 
            pushFollow(FOLLOW_ruleJoinRight_in_entryRuleJoinRight1300);
            iv_ruleJoinRight=ruleJoinRight();

            state._fsp--;

             current =iv_ruleJoinRight; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinRight1310); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinRight"


    // $ANTLR start "ruleJoinRight"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:684:1: ruleJoinRight returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_classRight_2_0= ruleClass ) ) ) ;
    public final EObject ruleJoinRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_classRight_2_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:687:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_classRight_2_0= ruleClass ) ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:688:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_classRight_2_0= ruleClass ) ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:688:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_classRight_2_0= ruleClass ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:688:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_classRight_2_0= ruleClass ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:688:2: ( (otherlv_0= RULE_ID ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:689:1: (otherlv_0= RULE_ID )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:689:1: (otherlv_0= RULE_ID )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:690:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJoinRightRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJoinRight1355); 

            		newLeafNode(otherlv_0, grammarAccess.getJoinRightAccess().getMetamodelRightMetamodelNameCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleJoinRight1367); 

                	newLeafNode(otherlv_1, grammarAccess.getJoinRightAccess().getFullStopKeyword_1());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:705:1: ( (lv_classRight_2_0= ruleClass ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:706:1: (lv_classRight_2_0= ruleClass )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:706:1: (lv_classRight_2_0= ruleClass )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:707:3: lv_classRight_2_0= ruleClass
            {
             
            	        newCompositeNode(grammarAccess.getJoinRightAccess().getClassRightClassParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleClass_in_ruleJoinRight1388);
            lv_classRight_2_0=ruleClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinRightRule());
            	        }
                   		add(
                   			current, 
                   			"classRight",
                    		lv_classRight_2_0, 
                    		"Class");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinRight"


    // $ANTLR start "entryRuleAttribute"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:731:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:732:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:733:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1424);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1434); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:740:1: ruleAttribute returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:743:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:744:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:744:1: ( (lv_name_0_0= RULE_ID ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:745:1: (lv_name_0_0= RULE_ID )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:745:1: (lv_name_0_0= RULE_ID )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:746:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1475); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleClass"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:770:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:771:2: (iv_ruleClass= ruleClass EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:772:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass1515);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass1525); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:779:1: ruleClass returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:782:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:783:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:783:1: ( (lv_name_0_0= RULE_ID ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:784:1: (lv_name_0_0= RULE_ID )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:784:1: (lv_name_0_0= RULE_ID )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:785:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1566); 

            			newLeafNode(lv_name_0_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleMetamodelName"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:809:1: entryRuleMetamodelName returns [EObject current=null] : iv_ruleMetamodelName= ruleMetamodelName EOF ;
    public final EObject entryRuleMetamodelName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelName = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:810:2: (iv_ruleMetamodelName= ruleMetamodelName EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:811:2: iv_ruleMetamodelName= ruleMetamodelName EOF
            {
             newCompositeNode(grammarAccess.getMetamodelNameRule()); 
            pushFollow(FOLLOW_ruleMetamodelName_in_entryRuleMetamodelName1606);
            iv_ruleMetamodelName=ruleMetamodelName();

            state._fsp--;

             current =iv_ruleMetamodelName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelName1616); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodelName"


    // $ANTLR start "ruleMetamodelName"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:818:1: ruleMetamodelName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMetamodelName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:821:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:822:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:822:1: ( (lv_name_0_0= RULE_ID ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:823:1: (lv_name_0_0= RULE_ID )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:823:1: (lv_name_0_0= RULE_ID )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:824:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetamodelName1657); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMetamodelNameAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetamodelNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodelName"


    // $ANTLR start "entryRuleRelation"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:848:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:849:2: (iv_ruleRelation= ruleRelation EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:850:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation1697);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation1707); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:857:1: ruleRelation returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:860:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:861:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:861:1: ( (lv_name_0_0= RULE_ID ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:862:1: (lv_name_0_0= RULE_ID )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:862:1: (lv_name_0_0= RULE_ID )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:863:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelation1748); 

            			newLeafNode(lv_name_0_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleCondition"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:887:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:888:2: (iv_ruleCondition= ruleCondition EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:889:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1788);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1798); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:896:1: ruleCondition returns [EObject current=null] : ( ( ( (lv_value_0_0= ruleComparison ) ) | ( (lv_value_1_0= ruleEclExpression ) ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( ( (lv_value_4_0= ruleComparison ) ) | ( (lv_value_5_0= ruleEclExpression ) ) ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:899:28: ( ( ( ( (lv_value_0_0= ruleComparison ) ) | ( (lv_value_1_0= ruleEclExpression ) ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( ( (lv_value_4_0= ruleComparison ) ) | ( (lv_value_5_0= ruleEclExpression ) ) ) )* ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:900:1: ( ( ( (lv_value_0_0= ruleComparison ) ) | ( (lv_value_1_0= ruleEclExpression ) ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( ( (lv_value_4_0= ruleComparison ) ) | ( (lv_value_5_0= ruleEclExpression ) ) ) )* )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:900:1: ( ( ( (lv_value_0_0= ruleComparison ) ) | ( (lv_value_1_0= ruleEclExpression ) ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( ( (lv_value_4_0= ruleComparison ) ) | ( (lv_value_5_0= ruleEclExpression ) ) ) )* )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:900:2: ( ( (lv_value_0_0= ruleComparison ) ) | ( (lv_value_1_0= ruleEclExpression ) ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( ( (lv_value_4_0= ruleComparison ) ) | ( (lv_value_5_0= ruleEclExpression ) ) ) )*
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:900:2: ( ( (lv_value_0_0= ruleComparison ) ) | ( (lv_value_1_0= ruleEclExpression ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=RULE_ID && LA6_1<=RULE_STRING)||(LA6_1>=21 && LA6_1<=22)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==19) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:900:3: ( (lv_value_0_0= ruleComparison ) )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:900:3: ( (lv_value_0_0= ruleComparison ) )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:901:1: (lv_value_0_0= ruleComparison )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:901:1: (lv_value_0_0= ruleComparison )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:902:3: lv_value_0_0= ruleComparison
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getValueComparisonParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComparison_in_ruleCondition1845);
                    lv_value_0_0=ruleComparison();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		add(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"Comparison");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:919:6: ( (lv_value_1_0= ruleEclExpression ) )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:919:6: ( (lv_value_1_0= ruleEclExpression ) )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:920:1: (lv_value_1_0= ruleEclExpression )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:920:1: (lv_value_1_0= ruleEclExpression )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:921:3: lv_value_1_0= ruleEclExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getValueEclExpressionParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEclExpression_in_ruleCondition1872);
                    lv_value_1_0=ruleEclExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		add(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"EclExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:937:3: ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( ( (lv_value_4_0= ruleComparison ) ) | ( (lv_value_5_0= ruleEclExpression ) ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=22)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:937:4: (otherlv_2= 'and' | otherlv_3= 'or' ) ( ( (lv_value_4_0= ruleComparison ) ) | ( (lv_value_5_0= ruleEclExpression ) ) )
            	    {
            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:937:4: (otherlv_2= 'and' | otherlv_3= 'or' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==21) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==22) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:937:6: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleCondition1887); 

            	                	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getAndKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:942:7: otherlv_3= 'or'
            	            {
            	            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleCondition1905); 

            	                	newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getOrKeyword_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:946:2: ( ( (lv_value_4_0= ruleComparison ) ) | ( (lv_value_5_0= ruleEclExpression ) ) )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==RULE_ID) ) {
            	        int LA8_1 = input.LA(2);

            	        if ( (LA8_1==19) ) {
            	            alt8=1;
            	        }
            	        else if ( (LA8_1==EOF||(LA8_1>=RULE_ID && LA8_1<=RULE_STRING)||(LA8_1>=21 && LA8_1<=22)) ) {
            	            alt8=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 8, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA8_0==RULE_STRING) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:946:3: ( (lv_value_4_0= ruleComparison ) )
            	            {
            	            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:946:3: ( (lv_value_4_0= ruleComparison ) )
            	            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:947:1: (lv_value_4_0= ruleComparison )
            	            {
            	            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:947:1: (lv_value_4_0= ruleComparison )
            	            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:948:3: lv_value_4_0= ruleComparison
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getConditionAccess().getValueComparisonParserRuleCall_1_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleComparison_in_ruleCondition1928);
            	            lv_value_4_0=ruleComparison();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"value",
            	                    		lv_value_4_0, 
            	                    		"Comparison");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:965:6: ( (lv_value_5_0= ruleEclExpression ) )
            	            {
            	            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:965:6: ( (lv_value_5_0= ruleEclExpression ) )
            	            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:966:1: (lv_value_5_0= ruleEclExpression )
            	            {
            	            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:966:1: (lv_value_5_0= ruleEclExpression )
            	            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:967:3: lv_value_5_0= ruleEclExpression
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getConditionAccess().getValueEclExpressionParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleEclExpression_in_ruleCondition1955);
            	            lv_value_5_0=ruleEclExpression();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"value",
            	                    		lv_value_5_0, 
            	                    		"EclExpression");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEclExpression"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:991:1: entryRuleEclExpression returns [EObject current=null] : iv_ruleEclExpression= ruleEclExpression EOF ;
    public final EObject entryRuleEclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclExpression = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:992:2: (iv_ruleEclExpression= ruleEclExpression EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:993:2: iv_ruleEclExpression= ruleEclExpression EOF
            {
             newCompositeNode(grammarAccess.getEclExpressionRule()); 
            pushFollow(FOLLOW_ruleEclExpression_in_entryRuleEclExpression1994);
            iv_ruleEclExpression=ruleEclExpression();

            state._fsp--;

             current =iv_ruleEclExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEclExpression2004); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEclExpression"


    // $ANTLR start "ruleEclExpression"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1000:1: ruleEclExpression returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleEclExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1003:28: ( ( (lv_value_0_0= ruleEString ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1004:1: ( (lv_value_0_0= ruleEString ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1004:1: ( (lv_value_0_0= ruleEString ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1005:1: (lv_value_0_0= ruleEString )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1005:1: (lv_value_0_0= ruleEString )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1006:3: lv_value_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEclExpressionAccess().getValueEStringParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleEclExpression2049);
            lv_value_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEclExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEclExpression"


    // $ANTLR start "entryRuleComparison"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1030:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1031:2: (iv_ruleComparison= ruleComparison EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1032:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison2084);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2094); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1039:1: ruleComparison returns [EObject current=null] : ( ( (lv_left_0_0= ruleLeft ) ) (otherlv_1= '=' | otherlv_2= '<=' | otherlv_3= '>=' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<>' ) ( (lv_right_7_0= ruleRight ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1042:28: ( ( ( (lv_left_0_0= ruleLeft ) ) (otherlv_1= '=' | otherlv_2= '<=' | otherlv_3= '>=' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<>' ) ( (lv_right_7_0= ruleRight ) ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1043:1: ( ( (lv_left_0_0= ruleLeft ) ) (otherlv_1= '=' | otherlv_2= '<=' | otherlv_3= '>=' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<>' ) ( (lv_right_7_0= ruleRight ) ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1043:1: ( ( (lv_left_0_0= ruleLeft ) ) (otherlv_1= '=' | otherlv_2= '<=' | otherlv_3= '>=' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<>' ) ( (lv_right_7_0= ruleRight ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1043:2: ( (lv_left_0_0= ruleLeft ) ) (otherlv_1= '=' | otherlv_2= '<=' | otherlv_3= '>=' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<>' ) ( (lv_right_7_0= ruleRight ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1043:2: ( (lv_left_0_0= ruleLeft ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1044:1: (lv_left_0_0= ruleLeft )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1044:1: (lv_left_0_0= ruleLeft )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1045:3: lv_left_0_0= ruleLeft
            {
             
            	        newCompositeNode(grammarAccess.getComparisonAccess().getLeftLeftParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLeft_in_ruleComparison2140);
            lv_left_0_0=ruleLeft();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	        }
                   		add(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"Left");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1061:2: (otherlv_1= '=' | otherlv_2= '<=' | otherlv_3= '>=' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<>' )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            case 27:
                {
                alt10=5;
                }
                break;
            case 28:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1061:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleComparison2153); 

                        	newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1066:7: otherlv_2= '<='
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleComparison2171); 

                        	newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1071:7: otherlv_3= '>='
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleComparison2189); 

                        	newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_2());
                        

                    }
                    break;
                case 4 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1076:7: otherlv_4= '<'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleComparison2207); 

                        	newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_3());
                        

                    }
                    break;
                case 5 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1081:7: otherlv_5= '>'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleComparison2225); 

                        	newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_4());
                        

                    }
                    break;
                case 6 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1086:7: otherlv_6= '<>'
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleComparison2243); 

                        	newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getLessThanSignGreaterThanSignKeyword_1_5());
                        

                    }
                    break;

            }

            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1090:2: ( (lv_right_7_0= ruleRight ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1091:1: (lv_right_7_0= ruleRight )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1091:1: (lv_right_7_0= ruleRight )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1092:3: lv_right_7_0= ruleRight
            {
             
            	        newCompositeNode(grammarAccess.getComparisonAccess().getRightRightParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRight_in_ruleComparison2265);
            lv_right_7_0=ruleRight();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	        }
                   		add(
                   			current, 
                   			"right",
                    		lv_right_7_0, 
                    		"Right");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleLeft"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1116:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1117:2: (iv_ruleLeft= ruleLeft EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1118:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_ruleLeft_in_entryRuleLeft2301);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeft2311); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1125:1: ruleLeft returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereLeft_4_0= ruleAttribute ) ) ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_attributeWhereLeft_4_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1128:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereLeft_4_0= ruleAttribute ) ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1129:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereLeft_4_0= ruleAttribute ) ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1129:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereLeft_4_0= ruleAttribute ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1129:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereLeft_4_0= ruleAttribute ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1129:2: ( (otherlv_0= RULE_ID ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1130:1: (otherlv_0= RULE_ID )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1130:1: (otherlv_0= RULE_ID )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1131:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLeftRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLeft2356); 

            		newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getMetamodelMetamodelNameCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleLeft2368); 

                	newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getFullStopKeyword_1());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1146:1: ( (otherlv_2= RULE_ID ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1147:1: (otherlv_2= RULE_ID )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1147:1: (otherlv_2= RULE_ID )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1148:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLeftRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLeft2388); 

            		newLeafNode(otherlv_2, grammarAccess.getLeftAccess().getClassClassCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleLeft2400); 

                	newLeafNode(otherlv_3, grammarAccess.getLeftAccess().getFullStopKeyword_3());
                
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1163:1: ( (lv_attributeWhereLeft_4_0= ruleAttribute ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1164:1: (lv_attributeWhereLeft_4_0= ruleAttribute )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1164:1: (lv_attributeWhereLeft_4_0= ruleAttribute )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1165:3: lv_attributeWhereLeft_4_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getLeftAccess().getAttributeWhereLeftAttributeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleLeft2421);
            lv_attributeWhereLeft_4_0=ruleAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeftRule());
            	        }
                   		set(
                   			current, 
                   			"attributeWhereLeft",
                    		lv_attributeWhereLeft_4_0, 
                    		"Attribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1189:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1190:2: (iv_ruleRight= ruleRight EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1191:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_ruleRight_in_entryRuleRight2457);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRight2467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1198:1: ruleRight returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) ) ) | ( (lv_value_5_0= ruleEString ) ) ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_attributeWhereRight_4_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1201:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) ) ) | ( (lv_value_5_0= ruleEString ) ) ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1202:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) ) ) | ( (lv_value_5_0= ruleEString ) ) )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1202:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) ) ) | ( (lv_value_5_0= ruleEString ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||(LA11_1>=RULE_ID && LA11_1<=RULE_STRING)||(LA11_1>=21 && LA11_1<=22)) ) {
                    alt11=2;
                }
                else if ( (LA11_1==19) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1202:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) ) )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1202:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) ) )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1202:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1202:3: ( (otherlv_0= RULE_ID ) )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1203:1: (otherlv_0= RULE_ID )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1203:1: (otherlv_0= RULE_ID )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1204:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRightRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRight2513); 

                    		newLeafNode(otherlv_0, grammarAccess.getRightAccess().getMetamodelMetamodelNameCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRight2525); 

                        	newLeafNode(otherlv_1, grammarAccess.getRightAccess().getFullStopKeyword_0_1());
                        
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1219:1: ( (otherlv_2= RULE_ID ) )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1220:1: (otherlv_2= RULE_ID )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1220:1: (otherlv_2= RULE_ID )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1221:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRightRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRight2545); 

                    		newLeafNode(otherlv_2, grammarAccess.getRightAccess().getClassClassCrossReference_0_2_0()); 
                    	

                    }


                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleRight2557); 

                        	newLeafNode(otherlv_3, grammarAccess.getRightAccess().getFullStopKeyword_0_3());
                        
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1236:1: ( (lv_attributeWhereRight_4_0= ruleAttribute ) )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1237:1: (lv_attributeWhereRight_4_0= ruleAttribute )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1237:1: (lv_attributeWhereRight_4_0= ruleAttribute )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1238:3: lv_attributeWhereRight_4_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getRightAccess().getAttributeWhereRightAttributeParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribute_in_ruleRight2578);
                    lv_attributeWhereRight_4_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRightRule());
                    	        }
                           		set(
                           			current, 
                           			"attributeWhereRight",
                            		lv_attributeWhereRight_4_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1255:6: ( (lv_value_5_0= ruleEString ) )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1255:6: ( (lv_value_5_0= ruleEString ) )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1256:1: (lv_value_5_0= ruleEString )
                    {
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1256:1: (lv_value_5_0= ruleEString )
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1257:3: lv_value_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRightAccess().getValueEStringParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleRight2606);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRightRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleEString"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1281:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1282:2: (iv_ruleEString= ruleEString EOF )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1283:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString2643);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString2654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1290:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1293:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1294:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1294:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1294:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString2694); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vpdl.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalVpdl.g:1302:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString2720); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel156 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleMetamodel_in_ruleModel177 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleModel190 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleMetamodel_in_ruleModel211 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModel234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_entryRuleMetamodel270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodel280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleMetamodel326 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMetamodel338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMetamodelName_in_ruleMetamodel359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleExpression442 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleExpression463 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExpression475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFrom_in_ruleExpression496 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExpression508 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleExpression529 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSelect619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAttribute_in_ruleSelect660 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleSelect673 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleSelectAttribute_in_ruleSelect694 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleSelectAttribute_in_entryRuleSelectAttribute733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAttribute743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectAttribute788 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSelectAttribute800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleSelectAttribute821 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSelectAttribute833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSelectAttribute854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_entryRuleFrom890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrom900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_ruleFrom946 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleFrom959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJoin_in_ruleFrom980 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin1018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinLeft_in_ruleJoin1074 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleJoin1086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJoinRight_in_ruleJoin1107 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJoin1119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleJoin1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinLeft_in_entryRuleJoinLeft1176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinLeft1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJoinLeft1231 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleJoinLeft1243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleJoinLeft1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinRight_in_entryRuleJoinRight1300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinRight1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJoinRight1355 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleJoinRight1367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleJoinRight1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelName_in_entryRuleMetamodelName1606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelName1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetamodelName1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation1697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleCondition1845 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleEclExpression_in_ruleCondition1872 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleCondition1887 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_22_in_ruleCondition1905 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleCondition1928 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleEclExpression_in_ruleCondition1955 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleEclExpression_in_entryRuleEclExpression1994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEclExpression2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleEclExpression2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_ruleComparison2140 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_23_in_ruleComparison2153 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24_in_ruleComparison2171 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25_in_ruleComparison2189 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_26_in_ruleComparison2207 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_27_in_ruleComparison2225 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_28_in_ruleComparison2243 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleRight_in_ruleComparison2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_entryRuleLeft2301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeft2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLeft2356 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLeft2368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLeft2388 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLeft2400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleLeft2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRight_in_entryRuleRight2457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRight2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRight2513 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRight2525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRight2545 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRight2557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleRight2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleRight2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString2720 = new BitSet(new long[]{0x0000000000000002L});

}