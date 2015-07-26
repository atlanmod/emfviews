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
import emfviews.dsl.services.SqlviewGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlviewParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create view'", "'from'", "','", "'as'", "'select'", "'where'", "'*'", "'.'", "'AND'", "'OR'", "'='", "'<='", "'>='", "'<'", "'>'", "'<>'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSqlviewParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSqlviewParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSqlviewParser.tokenNames; }
    public String getGrammarFileName() { return "../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g"; }



     	private SqlviewGrammarAccess grammarAccess;
     	
        public InternalSqlviewParser(TokenStream input, SqlviewGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SqlviewGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'create view' ( (lv_viewName_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_metamodel_3_0= ruleMetamodel ) ) (otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) ) )* ( (lv_expression_6_0= ruleExpression ) ) ) ;
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
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:79:28: ( (otherlv_0= 'create view' ( (lv_viewName_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_metamodel_3_0= ruleMetamodel ) ) (otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) ) )* ( (lv_expression_6_0= ruleExpression ) ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:80:1: (otherlv_0= 'create view' ( (lv_viewName_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_metamodel_3_0= ruleMetamodel ) ) (otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) ) )* ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:80:1: (otherlv_0= 'create view' ( (lv_viewName_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_metamodel_3_0= ruleMetamodel ) ) (otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) ) )* ( (lv_expression_6_0= ruleExpression ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:80:3: otherlv_0= 'create view' ( (lv_viewName_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_metamodel_3_0= ruleMetamodel ) ) (otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) ) )* ( (lv_expression_6_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getCreateViewKeyword_0());
                
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:84:1: ( (lv_viewName_1_0= RULE_ID ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:85:1: (lv_viewName_1_0= RULE_ID )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:85:1: (lv_viewName_1_0= RULE_ID )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:86:3: lv_viewName_1_0= RULE_ID
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

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getFromKeyword_2());
                
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:106:1: ( (lv_metamodel_3_0= ruleMetamodel ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:107:1: (lv_metamodel_3_0= ruleMetamodel )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:107:1: (lv_metamodel_3_0= ruleMetamodel )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:108:3: lv_metamodel_3_0= ruleMetamodel
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

            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:124:2: (otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:124:4: otherlv_4= ',' ( (lv_metamodel_5_0= ruleMetamodel ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModel190); 

            	        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getCommaKeyword_4_0());
            	        
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:128:1: ( (lv_metamodel_5_0= ruleMetamodel ) )
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:129:1: (lv_metamodel_5_0= ruleMetamodel )
            	    {
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:129:1: (lv_metamodel_5_0= ruleMetamodel )
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:130:3: lv_metamodel_5_0= ruleMetamodel
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

            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:146:4: ( (lv_expression_6_0= ruleExpression ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:147:1: (lv_expression_6_0= ruleExpression )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:147:1: (lv_expression_6_0= ruleExpression )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:148:3: lv_expression_6_0= ruleExpression
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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:172:1: entryRuleMetamodel returns [EObject current=null] : iv_ruleMetamodel= ruleMetamodel EOF ;
    public final EObject entryRuleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodel = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:173:2: (iv_ruleMetamodel= ruleMetamodel EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:174:2: iv_ruleMetamodel= ruleMetamodel EOF
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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:181:1: ruleMetamodel returns [EObject current=null] : ( ( (lv_metamodelURL_0_0= ruleEString ) ) otherlv_1= 'as' ( (lv_metamodelName_2_0= ruleMetamodelName ) ) ) ;
    public final EObject ruleMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_metamodelURL_0_0 = null;

        EObject lv_metamodelName_2_0 = null;


         enterRule(); 
            
        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:184:28: ( ( ( (lv_metamodelURL_0_0= ruleEString ) ) otherlv_1= 'as' ( (lv_metamodelName_2_0= ruleMetamodelName ) ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:185:1: ( ( (lv_metamodelURL_0_0= ruleEString ) ) otherlv_1= 'as' ( (lv_metamodelName_2_0= ruleMetamodelName ) ) )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:185:1: ( ( (lv_metamodelURL_0_0= ruleEString ) ) otherlv_1= 'as' ( (lv_metamodelName_2_0= ruleMetamodelName ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:185:2: ( (lv_metamodelURL_0_0= ruleEString ) ) otherlv_1= 'as' ( (lv_metamodelName_2_0= ruleMetamodelName ) )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:185:2: ( (lv_metamodelURL_0_0= ruleEString ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:186:1: (lv_metamodelURL_0_0= ruleEString )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:186:1: (lv_metamodelURL_0_0= ruleEString )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:187:3: lv_metamodelURL_0_0= ruleEString
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
                
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:207:1: ( (lv_metamodelName_2_0= ruleMetamodelName ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:208:1: (lv_metamodelName_2_0= ruleMetamodelName )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:208:1: (lv_metamodelName_2_0= ruleMetamodelName )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:209:3: lv_metamodelName_2_0= ruleMetamodelName
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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:233:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:234:2: (iv_ruleExpression= ruleExpression EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:235:2: iv_ruleExpression= ruleExpression EOF
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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:242:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'select' ( (lv_select_1_0= ruleSelect ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleFrom ) ) otherlv_4= 'where' ( (lv_condition_5_0= ruleCondition ) )+ ) ;
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
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:245:28: ( (otherlv_0= 'select' ( (lv_select_1_0= ruleSelect ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleFrom ) ) otherlv_4= 'where' ( (lv_condition_5_0= ruleCondition ) )+ ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:246:1: (otherlv_0= 'select' ( (lv_select_1_0= ruleSelect ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleFrom ) ) otherlv_4= 'where' ( (lv_condition_5_0= ruleCondition ) )+ )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:246:1: (otherlv_0= 'select' ( (lv_select_1_0= ruleSelect ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleFrom ) ) otherlv_4= 'where' ( (lv_condition_5_0= ruleCondition ) )+ )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:246:3: otherlv_0= 'select' ( (lv_select_1_0= ruleSelect ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleFrom ) ) otherlv_4= 'where' ( (lv_condition_5_0= ruleCondition ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleExpression442); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getSelectKeyword_0());
                
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:250:1: ( (lv_select_1_0= ruleSelect ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:251:1: (lv_select_1_0= ruleSelect )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:251:1: (lv_select_1_0= ruleSelect )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:252:3: lv_select_1_0= ruleSelect
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleExpression475); 

                	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getFromKeyword_2());
                
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:272:1: ( (lv_from_3_0= ruleFrom ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:273:1: (lv_from_3_0= ruleFrom )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:273:1: (lv_from_3_0= ruleFrom )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:274:3: lv_from_3_0= ruleFrom
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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleExpression508); 

                	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getWhereKeyword_4());
                
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:294:1: ( (lv_condition_5_0= ruleCondition ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:295:1: (lv_condition_5_0= ruleCondition )
            	    {
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:295:1: (lv_condition_5_0= ruleCondition )
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:296:3: lv_condition_5_0= ruleCondition
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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:320:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:321:2: (iv_ruleSelect= ruleSelect EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:322:2: iv_ruleSelect= ruleSelect EOF
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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:329:1: ruleSelect returns [EObject current=null] : ( ( (lv_select_0_0= '*' ) ) | ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= ruleClass ) ) otherlv_4= '.' ( (lv_attribute_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= ruleClass ) ) otherlv_10= '.' ( (lv_attribute_11_0= ruleAttribute ) ) )* ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token lv_select_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_class_3_0 = null;

        EObject lv_attribute_5_0 = null;

        EObject lv_class_9_0 = null;

        EObject lv_attribute_11_0 = null;


         enterRule(); 
            
        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:332:28: ( ( ( (lv_select_0_0= '*' ) ) | ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= ruleClass ) ) otherlv_4= '.' ( (lv_attribute_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= ruleClass ) ) otherlv_10= '.' ( (lv_attribute_11_0= ruleAttribute ) ) )* ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:333:1: ( ( (lv_select_0_0= '*' ) ) | ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= ruleClass ) ) otherlv_4= '.' ( (lv_attribute_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= ruleClass ) ) otherlv_10= '.' ( (lv_attribute_11_0= ruleAttribute ) ) )* ) )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:333:1: ( ( (lv_select_0_0= '*' ) ) | ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= ruleClass ) ) otherlv_4= '.' ( (lv_attribute_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= ruleClass ) ) otherlv_10= '.' ( (lv_attribute_11_0= ruleAttribute ) ) )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
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
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:333:2: ( (lv_select_0_0= '*' ) )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:333:2: ( (lv_select_0_0= '*' ) )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:334:1: (lv_select_0_0= '*' )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:334:1: (lv_select_0_0= '*' )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:335:3: lv_select_0_0= '*'
                    {
                    lv_select_0_0=(Token)match(input,17,FOLLOW_17_in_ruleSelect619); 

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
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:349:6: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= ruleClass ) ) otherlv_4= '.' ( (lv_attribute_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= ruleClass ) ) otherlv_10= '.' ( (lv_attribute_11_0= ruleAttribute ) ) )* )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:349:6: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= ruleClass ) ) otherlv_4= '.' ( (lv_attribute_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= ruleClass ) ) otherlv_10= '.' ( (lv_attribute_11_0= ruleAttribute ) ) )* )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:349:7: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= ruleClass ) ) otherlv_4= '.' ( (lv_attribute_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= ruleClass ) ) otherlv_10= '.' ( (lv_attribute_11_0= ruleAttribute ) ) )*
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:349:7: ( (otherlv_1= RULE_ID ) )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:350:1: (otherlv_1= RULE_ID )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:350:1: (otherlv_1= RULE_ID )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:351:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelect659); 

                    		newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getMetamodelMetamodelNameCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleSelect671); 

                        	newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getFullStopKeyword_1_1());
                        
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:366:1: ( (lv_class_3_0= ruleClass ) )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:367:1: (lv_class_3_0= ruleClass )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:367:1: (lv_class_3_0= ruleClass )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:368:3: lv_class_3_0= ruleClass
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectAccess().getClassClassParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClass_in_ruleSelect692);
                    lv_class_3_0=ruleClass();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectRule());
                    	        }
                           		add(
                           			current, 
                           			"class",
                            		lv_class_3_0, 
                            		"Class");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleSelect704); 

                        	newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getFullStopKeyword_1_3());
                        
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:388:1: ( (lv_attribute_5_0= ruleAttribute ) )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:389:1: (lv_attribute_5_0= ruleAttribute )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:389:1: (lv_attribute_5_0= ruleAttribute )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:390:3: lv_attribute_5_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectAccess().getAttributeAttributeParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribute_in_ruleSelect725);
                    lv_attribute_5_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectRule());
                    	        }
                           		add(
                           			current, 
                           			"attribute",
                            		lv_attribute_5_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:406:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= ruleClass ) ) otherlv_10= '.' ( (lv_attribute_11_0= ruleAttribute ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:406:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= ruleClass ) ) otherlv_10= '.' ( (lv_attribute_11_0= ruleAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleSelect738); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getCommaKeyword_1_5_0());
                    	        
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:410:1: ( (otherlv_7= RULE_ID ) )
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:411:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:411:1: (otherlv_7= RULE_ID )
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:412:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSelectRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelect758); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getSelectAccess().getMetamodelMetamodelNameCrossReference_1_5_1_0()); 
                    	    	

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleSelect770); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getSelectAccess().getFullStopKeyword_1_5_2());
                    	        
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:427:1: ( (lv_class_9_0= ruleClass ) )
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:428:1: (lv_class_9_0= ruleClass )
                    	    {
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:428:1: (lv_class_9_0= ruleClass )
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:429:3: lv_class_9_0= ruleClass
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectAccess().getClassClassParserRuleCall_1_5_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClass_in_ruleSelect791);
                    	    lv_class_9_0=ruleClass();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSelectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"class",
                    	            		lv_class_9_0, 
                    	            		"Class");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleSelect803); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSelectAccess().getFullStopKeyword_1_5_4());
                    	        
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:449:1: ( (lv_attribute_11_0= ruleAttribute ) )
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:450:1: (lv_attribute_11_0= ruleAttribute )
                    	    {
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:450:1: (lv_attribute_11_0= ruleAttribute )
                    	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:451:3: lv_attribute_11_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectAccess().getAttributeAttributeParserRuleCall_1_5_5_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleSelect824);
                    	    lv_attribute_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSelectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attribute",
                    	            		lv_attribute_11_0, 
                    	            		"Attribute");
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


    // $ANTLR start "entryRuleFrom"
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:475:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:476:2: (iv_ruleFrom= ruleFrom EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:477:2: iv_ruleFrom= ruleFrom EOF
            {
             newCompositeNode(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_ruleFrom_in_entryRuleFrom863);
            iv_ruleFrom=ruleFrom();

            state._fsp--;

             current =iv_ruleFrom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrom873); 

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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:484:1: ruleFrom returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_class_2_0= ruleClass ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_class_6_0= ruleClass ) ) )* ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_class_2_0 = null;

        EObject lv_class_6_0 = null;


         enterRule(); 
            
        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:487:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_class_2_0= ruleClass ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_class_6_0= ruleClass ) ) )* ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:488:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_class_2_0= ruleClass ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_class_6_0= ruleClass ) ) )* )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:488:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_class_2_0= ruleClass ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_class_6_0= ruleClass ) ) )* )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:488:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_class_2_0= ruleClass ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_class_6_0= ruleClass ) ) )*
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:488:2: ( (otherlv_0= RULE_ID ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:489:1: (otherlv_0= RULE_ID )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:489:1: (otherlv_0= RULE_ID )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:490:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFromRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFrom918); 

            		newLeafNode(otherlv_0, grammarAccess.getFromAccess().getMetamodelMetamodelNameCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleFrom930); 

                	newLeafNode(otherlv_1, grammarAccess.getFromAccess().getFullStopKeyword_1());
                
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:505:1: ( (lv_class_2_0= ruleClass ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:506:1: (lv_class_2_0= ruleClass )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:506:1: (lv_class_2_0= ruleClass )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:507:3: lv_class_2_0= ruleClass
            {
             
            	        newCompositeNode(grammarAccess.getFromAccess().getClassClassParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleClass_in_ruleFrom951);
            lv_class_2_0=ruleClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFromRule());
            	        }
                   		add(
                   			current, 
                   			"class",
                    		lv_class_2_0, 
                    		"Class");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:523:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_class_6_0= ruleClass ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:523:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_class_6_0= ruleClass ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFrom964); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFromAccess().getCommaKeyword_3_0());
            	        
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:527:1: ( (otherlv_4= RULE_ID ) )
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:528:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:528:1: (otherlv_4= RULE_ID )
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:529:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFromRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFrom984); 

            	    		newLeafNode(otherlv_4, grammarAccess.getFromAccess().getMetamodelMetamodelNameCrossReference_3_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleFrom996); 

            	        	newLeafNode(otherlv_5, grammarAccess.getFromAccess().getFullStopKeyword_3_2());
            	        
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:544:1: ( (lv_class_6_0= ruleClass ) )
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:545:1: (lv_class_6_0= ruleClass )
            	    {
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:545:1: (lv_class_6_0= ruleClass )
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:546:3: lv_class_6_0= ruleClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFromAccess().getClassClassParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClass_in_ruleFrom1017);
            	    lv_class_6_0=ruleClass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFromRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"class",
            	            		lv_class_6_0, 
            	            		"Class");
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


    // $ANTLR start "entryRuleAttribute"
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:570:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:571:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:572:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1055);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1065); 

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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:579:1: ruleAttribute returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:582:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:583:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:583:1: ( (lv_name_0_0= RULE_ID ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:584:1: (lv_name_0_0= RULE_ID )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:584:1: (lv_name_0_0= RULE_ID )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:585:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1106); 

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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:609:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:610:2: (iv_ruleClass= ruleClass EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:611:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass1146);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass1156); 

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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:618:1: ruleClass returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:621:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:622:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:622:1: ( (lv_name_0_0= RULE_ID ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:623:1: (lv_name_0_0= RULE_ID )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:623:1: (lv_name_0_0= RULE_ID )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:624:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1197); 

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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:648:1: entryRuleMetamodelName returns [EObject current=null] : iv_ruleMetamodelName= ruleMetamodelName EOF ;
    public final EObject entryRuleMetamodelName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelName = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:649:2: (iv_ruleMetamodelName= ruleMetamodelName EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:650:2: iv_ruleMetamodelName= ruleMetamodelName EOF
            {
             newCompositeNode(grammarAccess.getMetamodelNameRule()); 
            pushFollow(FOLLOW_ruleMetamodelName_in_entryRuleMetamodelName1237);
            iv_ruleMetamodelName=ruleMetamodelName();

            state._fsp--;

             current =iv_ruleMetamodelName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelName1247); 

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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:657:1: ruleMetamodelName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMetamodelName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:660:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:661:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:661:1: ( (lv_name_0_0= RULE_ID ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:662:1: (lv_name_0_0= RULE_ID )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:662:1: (lv_name_0_0= RULE_ID )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:663:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetamodelName1288); 

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


    // $ANTLR start "entryRuleCondition"
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:687:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:688:2: (iv_ruleCondition= ruleCondition EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:689:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1328);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1338); 

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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:696:1: ruleCondition returns [EObject current=null] : ( ( (lv_value_0_0= ruleComparison ) ) ( (otherlv_1= 'AND' | otherlv_2= 'OR' ) ( (lv_value_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:699:28: ( ( ( (lv_value_0_0= ruleComparison ) ) ( (otherlv_1= 'AND' | otherlv_2= 'OR' ) ( (lv_value_3_0= ruleComparison ) ) )* ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:700:1: ( ( (lv_value_0_0= ruleComparison ) ) ( (otherlv_1= 'AND' | otherlv_2= 'OR' ) ( (lv_value_3_0= ruleComparison ) ) )* )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:700:1: ( ( (lv_value_0_0= ruleComparison ) ) ( (otherlv_1= 'AND' | otherlv_2= 'OR' ) ( (lv_value_3_0= ruleComparison ) ) )* )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:700:2: ( (lv_value_0_0= ruleComparison ) ) ( (otherlv_1= 'AND' | otherlv_2= 'OR' ) ( (lv_value_3_0= ruleComparison ) ) )*
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:700:2: ( (lv_value_0_0= ruleComparison ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:701:1: (lv_value_0_0= ruleComparison )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:701:1: (lv_value_0_0= ruleComparison )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:702:3: lv_value_0_0= ruleComparison
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getValueComparisonParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComparison_in_ruleCondition1384);
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

            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:718:2: ( (otherlv_1= 'AND' | otherlv_2= 'OR' ) ( (lv_value_3_0= ruleComparison ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=19 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:718:3: (otherlv_1= 'AND' | otherlv_2= 'OR' ) ( (lv_value_3_0= ruleComparison ) )
            	    {
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:718:3: (otherlv_1= 'AND' | otherlv_2= 'OR' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==19) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==20) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:718:5: otherlv_1= 'AND'
            	            {
            	            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleCondition1398); 

            	                	newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getANDKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:723:7: otherlv_2= 'OR'
            	            {
            	            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCondition1416); 

            	                	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getORKeyword_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:727:2: ( (lv_value_3_0= ruleComparison ) )
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:728:1: (lv_value_3_0= ruleComparison )
            	    {
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:728:1: (lv_value_3_0= ruleComparison )
            	    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:729:3: lv_value_3_0= ruleComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionAccess().getValueComparisonParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparison_in_ruleCondition1438);
            	    lv_value_3_0=ruleComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"value",
            	            		lv_value_3_0, 
            	            		"Comparison");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "entryRuleComparison"
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:753:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:754:2: (iv_ruleComparison= ruleComparison EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:755:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1476);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1486); 

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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:762:1: ruleComparison returns [EObject current=null] : ( ( (lv_left_0_0= ruleLeft ) ) (otherlv_1= '=' | otherlv_2= '<=' | otherlv_3= '>=' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<>' ) ( (lv_right_7_0= ruleRight ) ) ) ;
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
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:765:28: ( ( ( (lv_left_0_0= ruleLeft ) ) (otherlv_1= '=' | otherlv_2= '<=' | otherlv_3= '>=' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<>' ) ( (lv_right_7_0= ruleRight ) ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:766:1: ( ( (lv_left_0_0= ruleLeft ) ) (otherlv_1= '=' | otherlv_2= '<=' | otherlv_3= '>=' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<>' ) ( (lv_right_7_0= ruleRight ) ) )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:766:1: ( ( (lv_left_0_0= ruleLeft ) ) (otherlv_1= '=' | otherlv_2= '<=' | otherlv_3= '>=' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<>' ) ( (lv_right_7_0= ruleRight ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:766:2: ( (lv_left_0_0= ruleLeft ) ) (otherlv_1= '=' | otherlv_2= '<=' | otherlv_3= '>=' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<>' ) ( (lv_right_7_0= ruleRight ) )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:766:2: ( (lv_left_0_0= ruleLeft ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:767:1: (lv_left_0_0= ruleLeft )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:767:1: (lv_left_0_0= ruleLeft )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:768:3: lv_left_0_0= ruleLeft
            {
             
            	        newCompositeNode(grammarAccess.getComparisonAccess().getLeftLeftParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLeft_in_ruleComparison1532);
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

            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:784:2: (otherlv_1= '=' | otherlv_2= '<=' | otherlv_3= '>=' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<>' )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case 26:
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
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:784:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleComparison1545); 

                        	newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:789:7: otherlv_2= '<='
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleComparison1563); 

                        	newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:794:7: otherlv_3= '>='
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleComparison1581); 

                        	newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_2());
                        

                    }
                    break;
                case 4 :
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:799:7: otherlv_4= '<'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleComparison1599); 

                        	newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_3());
                        

                    }
                    break;
                case 5 :
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:804:7: otherlv_5= '>'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleComparison1617); 

                        	newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_4());
                        

                    }
                    break;
                case 6 :
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:809:7: otherlv_6= '<>'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleComparison1635); 

                        	newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getLessThanSignGreaterThanSignKeyword_1_5());
                        

                    }
                    break;

            }

            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:813:2: ( (lv_right_7_0= ruleRight ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:814:1: (lv_right_7_0= ruleRight )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:814:1: (lv_right_7_0= ruleRight )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:815:3: lv_right_7_0= ruleRight
            {
             
            	        newCompositeNode(grammarAccess.getComparisonAccess().getRightRightParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRight_in_ruleComparison1657);
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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:839:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:840:2: (iv_ruleLeft= ruleLeft EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:841:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_ruleLeft_in_entryRuleLeft1693);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeft1703); 

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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:848:1: ruleLeft returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereLeft_4_0= ruleAttribute ) ) ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_attributeWhereLeft_4_0 = null;


         enterRule(); 
            
        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:851:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereLeft_4_0= ruleAttribute ) ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:852:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereLeft_4_0= ruleAttribute ) ) )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:852:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereLeft_4_0= ruleAttribute ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:852:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereLeft_4_0= ruleAttribute ) )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:852:2: ( (otherlv_0= RULE_ID ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:853:1: (otherlv_0= RULE_ID )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:853:1: (otherlv_0= RULE_ID )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:854:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLeftRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLeft1748); 

            		newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getMetamodelMetamodelNameCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleLeft1760); 

                	newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getFullStopKeyword_1());
                
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:869:1: ( (otherlv_2= RULE_ID ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:870:1: (otherlv_2= RULE_ID )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:870:1: (otherlv_2= RULE_ID )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:871:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLeftRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLeft1780); 

            		newLeafNode(otherlv_2, grammarAccess.getLeftAccess().getClassClassCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleLeft1792); 

                	newLeafNode(otherlv_3, grammarAccess.getLeftAccess().getFullStopKeyword_3());
                
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:886:1: ( (lv_attributeWhereLeft_4_0= ruleAttribute ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:887:1: (lv_attributeWhereLeft_4_0= ruleAttribute )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:887:1: (lv_attributeWhereLeft_4_0= ruleAttribute )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:888:3: lv_attributeWhereLeft_4_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getLeftAccess().getAttributeWhereLeftAttributeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleLeft1813);
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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:912:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:913:2: (iv_ruleRight= ruleRight EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:914:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_ruleRight_in_entryRuleRight1849);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRight1859); 

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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:921:1: ruleRight returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) ) ) | ( (lv_value_5_0= ruleEString ) ) ) ;
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
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:924:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) ) ) | ( (lv_value_5_0= ruleEString ) ) ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:925:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) ) ) | ( (lv_value_5_0= ruleEString ) ) )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:925:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) ) ) | ( (lv_value_5_0= ruleEString ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||LA9_1==RULE_ID||(LA9_1>=19 && LA9_1<=20)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==18) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:925:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) ) )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:925:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) ) )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:925:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_attributeWhereRight_4_0= ruleAttribute ) )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:925:3: ( (otherlv_0= RULE_ID ) )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:926:1: (otherlv_0= RULE_ID )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:926:1: (otherlv_0= RULE_ID )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:927:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRightRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRight1905); 

                    		newLeafNode(otherlv_0, grammarAccess.getRightAccess().getMetamodelMetamodelNameCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleRight1917); 

                        	newLeafNode(otherlv_1, grammarAccess.getRightAccess().getFullStopKeyword_0_1());
                        
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:942:1: ( (otherlv_2= RULE_ID ) )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:943:1: (otherlv_2= RULE_ID )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:943:1: (otherlv_2= RULE_ID )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:944:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRightRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRight1937); 

                    		newLeafNode(otherlv_2, grammarAccess.getRightAccess().getClassClassCrossReference_0_2_0()); 
                    	

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleRight1949); 

                        	newLeafNode(otherlv_3, grammarAccess.getRightAccess().getFullStopKeyword_0_3());
                        
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:959:1: ( (lv_attributeWhereRight_4_0= ruleAttribute ) )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:960:1: (lv_attributeWhereRight_4_0= ruleAttribute )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:960:1: (lv_attributeWhereRight_4_0= ruleAttribute )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:961:3: lv_attributeWhereRight_4_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getRightAccess().getAttributeWhereRightAttributeParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribute_in_ruleRight1970);
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
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:978:6: ( (lv_value_5_0= ruleEString ) )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:978:6: ( (lv_value_5_0= ruleEString ) )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:979:1: (lv_value_5_0= ruleEString )
                    {
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:979:1: (lv_value_5_0= ruleEString )
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:980:3: lv_value_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRightAccess().getValueEStringParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleRight1998);
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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:1004:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:1005:2: (iv_ruleEString= ruleEString EOF )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:1006:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString2035);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString2046); 

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
    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:1013:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:1016:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:1017:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:1017:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:1017:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString2086); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../emfviews.dsl/src-gen/emfviews/dsl/parser/antlr/internal/InternalSqlview.g:1025:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString2112); 

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
    public static final BitSet FOLLOW_15_in_ruleExpression442 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleExpression463 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExpression475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFrom_in_ruleExpression496 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExpression508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleExpression529 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSelect619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelect659 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSelect671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleSelect692 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSelect704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSelect725 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleSelect738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelect758 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSelect770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleSelect791 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSelect803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSelect824 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleFrom_in_entryRuleFrom863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrom873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFrom918 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFrom930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleFrom951 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleFrom964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFrom984 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFrom996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleFrom1017 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelName_in_entryRuleMetamodelName1237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelName1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetamodelName1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleCondition1384 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleCondition1398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20_in_ruleCondition1416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleCondition1438 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_ruleComparison1532 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_21_in_ruleComparison1545 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_22_in_ruleComparison1563 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_23_in_ruleComparison1581 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24_in_ruleComparison1599 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25_in_ruleComparison1617 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_26_in_ruleComparison1635 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleRight_in_ruleComparison1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_entryRuleLeft1693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeft1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLeft1748 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLeft1760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLeft1780 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLeft1792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleLeft1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRight_in_entryRuleRight1849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRight1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRight1905 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRight1917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRight1937 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRight1949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleRight1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleRight1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString2112 = new BitSet(new long[]{0x0000000000000002L});

}