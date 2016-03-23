package monoge.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import monoge.dsl.services.ExtensionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExtensionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'define'", "'extending'", "':'", "','", "'{'", "'}'", "'add class'", "'specializing'", "'.'", "'supertyping'", "'modify class'", "'add property'", "'type'", "'modify property'", "'='", "'filter property'", "'filter class'", "'add constraint'", "'filter constraint'", "'*..1'", "'0..1'", "'1..1'", "'1..*'", "'*..*'", "'*'", "'0..*'", "'composition'", "'association'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExtensionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExtensionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExtensionParser.tokenNames; }
    public String getGrammarFileName() { return "../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g"; }



     	private ExtensionGrammarAccess grammarAccess;
     	
        public InternalExtensionParser(TokenStream input, ExtensionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ExtensionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'define' ( (lv_extensionName_1_0= RULE_ID ) ) otherlv_2= 'extending' ( (lv_metamodel_3_0= ruleMetamodel ) ) otherlv_4= ':' ( (lv_prefix_5_0= rulePrefix ) ) (otherlv_6= ',' ( (lv_metamodel_7_0= ruleMetamodel ) ) otherlv_8= ':' ( (lv_prefix_9_0= rulePrefix ) ) )* otherlv_10= '{' ( (lv_extensions_11_0= ruleExtension ) )* otherlv_12= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_extensionName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_metamodel_3_0 = null;

        EObject lv_prefix_5_0 = null;

        EObject lv_metamodel_7_0 = null;

        EObject lv_prefix_9_0 = null;

        EObject lv_extensions_11_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:79:28: ( (otherlv_0= 'define' ( (lv_extensionName_1_0= RULE_ID ) ) otherlv_2= 'extending' ( (lv_metamodel_3_0= ruleMetamodel ) ) otherlv_4= ':' ( (lv_prefix_5_0= rulePrefix ) ) (otherlv_6= ',' ( (lv_metamodel_7_0= ruleMetamodel ) ) otherlv_8= ':' ( (lv_prefix_9_0= rulePrefix ) ) )* otherlv_10= '{' ( (lv_extensions_11_0= ruleExtension ) )* otherlv_12= '}' ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:80:1: (otherlv_0= 'define' ( (lv_extensionName_1_0= RULE_ID ) ) otherlv_2= 'extending' ( (lv_metamodel_3_0= ruleMetamodel ) ) otherlv_4= ':' ( (lv_prefix_5_0= rulePrefix ) ) (otherlv_6= ',' ( (lv_metamodel_7_0= ruleMetamodel ) ) otherlv_8= ':' ( (lv_prefix_9_0= rulePrefix ) ) )* otherlv_10= '{' ( (lv_extensions_11_0= ruleExtension ) )* otherlv_12= '}' )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:80:1: (otherlv_0= 'define' ( (lv_extensionName_1_0= RULE_ID ) ) otherlv_2= 'extending' ( (lv_metamodel_3_0= ruleMetamodel ) ) otherlv_4= ':' ( (lv_prefix_5_0= rulePrefix ) ) (otherlv_6= ',' ( (lv_metamodel_7_0= ruleMetamodel ) ) otherlv_8= ':' ( (lv_prefix_9_0= rulePrefix ) ) )* otherlv_10= '{' ( (lv_extensions_11_0= ruleExtension ) )* otherlv_12= '}' )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:80:3: otherlv_0= 'define' ( (lv_extensionName_1_0= RULE_ID ) ) otherlv_2= 'extending' ( (lv_metamodel_3_0= ruleMetamodel ) ) otherlv_4= ':' ( (lv_prefix_5_0= rulePrefix ) ) (otherlv_6= ',' ( (lv_metamodel_7_0= ruleMetamodel ) ) otherlv_8= ':' ( (lv_prefix_9_0= rulePrefix ) ) )* otherlv_10= '{' ( (lv_extensions_11_0= ruleExtension ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDefineKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:84:1: ( (lv_extensionName_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:85:1: (lv_extensionName_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:85:1: (lv_extensionName_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:86:3: lv_extensionName_1_0= RULE_ID
            {
            lv_extensionName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel139); 

            			newLeafNode(lv_extensionName_1_0, grammarAccess.getModelAccess().getExtensionNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"extensionName",
                    		lv_extensionName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getExtendingKeyword_2());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:106:1: ( (lv_metamodel_3_0= ruleMetamodel ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:107:1: (lv_metamodel_3_0= ruleMetamodel )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:107:1: (lv_metamodel_3_0= ruleMetamodel )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:108:3: lv_metamodel_3_0= ruleMetamodel
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModel189); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getColonKeyword_4());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:128:1: ( (lv_prefix_5_0= rulePrefix ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:129:1: (lv_prefix_5_0= rulePrefix )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:129:1: (lv_prefix_5_0= rulePrefix )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:130:3: lv_prefix_5_0= rulePrefix
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulePrefix_in_ruleModel210);
            lv_prefix_5_0=rulePrefix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"prefix",
                    		lv_prefix_5_0, 
                    		"Prefix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:146:2: (otherlv_6= ',' ( (lv_metamodel_7_0= ruleMetamodel ) ) otherlv_8= ':' ( (lv_prefix_9_0= rulePrefix ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:146:4: otherlv_6= ',' ( (lv_metamodel_7_0= ruleMetamodel ) ) otherlv_8= ':' ( (lv_prefix_9_0= rulePrefix ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleModel223); 

            	        	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getCommaKeyword_6_0());
            	        
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:150:1: ( (lv_metamodel_7_0= ruleMetamodel ) )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:151:1: (lv_metamodel_7_0= ruleMetamodel )
            	    {
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:151:1: (lv_metamodel_7_0= ruleMetamodel )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:152:3: lv_metamodel_7_0= ruleMetamodel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetamodel_in_ruleModel244);
            	    lv_metamodel_7_0=ruleMetamodel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metamodel",
            	            		lv_metamodel_7_0, 
            	            		"Metamodel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleModel256); 

            	        	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getColonKeyword_6_2());
            	        
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:172:1: ( (lv_prefix_9_0= rulePrefix ) )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:173:1: (lv_prefix_9_0= rulePrefix )
            	    {
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:173:1: (lv_prefix_9_0= rulePrefix )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:174:3: lv_prefix_9_0= rulePrefix
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_6_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrefix_in_ruleModel277);
            	    lv_prefix_9_0=rulePrefix();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prefix",
            	            		lv_prefix_9_0, 
            	            		"Prefix");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleModel291); 

                	newLeafNode(otherlv_10, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:194:1: ( (lv_extensions_11_0= ruleExtension ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==21||LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:195:1: (lv_extensions_11_0= ruleExtension )
            	    {
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:195:1: (lv_extensions_11_0= ruleExtension )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:196:3: lv_extensions_11_0= ruleExtension
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getExtensionsExtensionParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExtension_in_ruleModel312);
            	    lv_extensions_11_0=ruleExtension();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extensions",
            	            		lv_extensions_11_0, 
            	            		"Extension");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleModel325); 

                	newLeafNode(otherlv_12, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9());
                

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


    // $ANTLR start "entryRuleExtension"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:224:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:225:2: (iv_ruleExtension= ruleExtension EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:226:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FOLLOW_ruleExtension_in_entryRuleExtension361);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtension371); 

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
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:233:1: ruleExtension returns [EObject current=null] : (this_Create_0= ruleCreate | this_Refine_1= ruleRefine | this_Generalize_2= ruleGeneralize | this_ModifyClass_3= ruleModifyClass | this_FilterClass_4= ruleFilterClass ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_Refine_1 = null;

        EObject this_Generalize_2 = null;

        EObject this_ModifyClass_3 = null;

        EObject this_FilterClass_4 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:236:28: ( (this_Create_0= ruleCreate | this_Refine_1= ruleRefine | this_Generalize_2= ruleGeneralize | this_ModifyClass_3= ruleModifyClass | this_FilterClass_4= ruleFilterClass ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:237:1: (this_Create_0= ruleCreate | this_Refine_1= ruleRefine | this_Generalize_2= ruleGeneralize | this_ModifyClass_3= ruleModifyClass | this_FilterClass_4= ruleFilterClass )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:237:1: (this_Create_0= ruleCreate | this_Refine_1= ruleRefine | this_Generalize_2= ruleGeneralize | this_ModifyClass_3= ruleModifyClass | this_FilterClass_4= ruleFilterClass )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case 16:
                    case 17:
                    case 21:
                    case 27:
                        {
                        alt3=1;
                        }
                        break;
                    case 20:
                        {
                        alt3=3;
                        }
                        break;
                    case 18:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 27:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:238:5: this_Create_0= ruleCreate
                    {
                     
                            newCompositeNode(grammarAccess.getExtensionAccess().getCreateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCreate_in_ruleExtension418);
                    this_Create_0=ruleCreate();

                    state._fsp--;

                     
                            current = this_Create_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:248:5: this_Refine_1= ruleRefine
                    {
                     
                            newCompositeNode(grammarAccess.getExtensionAccess().getRefineParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRefine_in_ruleExtension445);
                    this_Refine_1=ruleRefine();

                    state._fsp--;

                     
                            current = this_Refine_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:258:5: this_Generalize_2= ruleGeneralize
                    {
                     
                            newCompositeNode(grammarAccess.getExtensionAccess().getGeneralizeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGeneralize_in_ruleExtension472);
                    this_Generalize_2=ruleGeneralize();

                    state._fsp--;

                     
                            current = this_Generalize_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:268:5: this_ModifyClass_3= ruleModifyClass
                    {
                     
                            newCompositeNode(grammarAccess.getExtensionAccess().getModifyClassParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleModifyClass_in_ruleExtension499);
                    this_ModifyClass_3=ruleModifyClass();

                    state._fsp--;

                     
                            current = this_ModifyClass_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:278:5: this_FilterClass_4= ruleFilterClass
                    {
                     
                            newCompositeNode(grammarAccess.getExtensionAccess().getFilterClassParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFilterClass_in_ruleExtension526);
                    this_FilterClass_4=ruleFilterClass();

                    state._fsp--;

                     
                            current = this_FilterClass_4; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleMetamodel"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:294:1: entryRuleMetamodel returns [EObject current=null] : iv_ruleMetamodel= ruleMetamodel EOF ;
    public final EObject entryRuleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodel = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:295:2: (iv_ruleMetamodel= ruleMetamodel EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:296:2: iv_ruleMetamodel= ruleMetamodel EOF
            {
             newCompositeNode(grammarAccess.getMetamodelRule()); 
            pushFollow(FOLLOW_ruleMetamodel_in_entryRuleMetamodel561);
            iv_ruleMetamodel=ruleMetamodel();

            state._fsp--;

             current =iv_ruleMetamodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodel571); 

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
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:303:1: ruleMetamodel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMetamodel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:306:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:307:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:307:1: ( (lv_name_0_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:308:1: (lv_name_0_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:308:1: (lv_name_0_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:309:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetamodel612); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetamodelRule());
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
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRulePrefix"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:333:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:334:2: (iv_rulePrefix= rulePrefix EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:335:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix652);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix662); 

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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:342:1: rulePrefix returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:345:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:346:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:346:1: ( (lv_name_0_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:347:1: (lv_name_0_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:347:1: (lv_name_0_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:348:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrefix703); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrefixRule());
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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleCreate"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:372:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:373:2: (iv_ruleCreate= ruleCreate EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:374:2: iv_ruleCreate= ruleCreate EOF
            {
             newCompositeNode(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_ruleCreate_in_entryRuleCreate743);
            iv_ruleCreate=ruleCreate();

            state._fsp--;

             current =iv_ruleCreate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreate753); 

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
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:381:1: ruleCreate returns [EObject current=null] : (otherlv_0= 'add class' ( (lv_class_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_class_1_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:384:28: ( (otherlv_0= 'add class' ( (lv_class_1_0= RULE_ID ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:385:1: (otherlv_0= 'add class' ( (lv_class_1_0= RULE_ID ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:385:1: (otherlv_0= 'add class' ( (lv_class_1_0= RULE_ID ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:385:3: otherlv_0= 'add class' ( (lv_class_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleCreate790); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getAddClassKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:389:1: ( (lv_class_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:390:1: (lv_class_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:390:1: (lv_class_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:391:3: lv_class_1_0= RULE_ID
            {
            lv_class_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreate807); 

            			newLeafNode(lv_class_1_0, grammarAccess.getCreateAccess().getClassIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleRefine"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:415:1: entryRuleRefine returns [EObject current=null] : iv_ruleRefine= ruleRefine EOF ;
    public final EObject entryRuleRefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefine = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:416:2: (iv_ruleRefine= ruleRefine EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:417:2: iv_ruleRefine= ruleRefine EOF
            {
             newCompositeNode(grammarAccess.getRefineRule()); 
            pushFollow(FOLLOW_ruleRefine_in_entryRuleRefine848);
            iv_ruleRefine=ruleRefine();

            state._fsp--;

             current =iv_ruleRefine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefine858); 

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
    // $ANTLR end "entryRuleRefine"


    // $ANTLR start "ruleRefine"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:424:1: ruleRefine returns [EObject current=null] : (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'specializing' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_classOriginal_5_0= RULE_ID ) ) ) ;
    public final EObject ruleRefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_classNew_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_classOriginal_5_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:427:28: ( (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'specializing' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_classOriginal_5_0= RULE_ID ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:428:1: (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'specializing' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_classOriginal_5_0= RULE_ID ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:428:1: (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'specializing' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_classOriginal_5_0= RULE_ID ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:428:3: otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'specializing' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_classOriginal_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleRefine895); 

                	newLeafNode(otherlv_0, grammarAccess.getRefineAccess().getAddClassKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:432:1: ( (lv_classNew_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:433:1: (lv_classNew_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:433:1: (lv_classNew_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:434:3: lv_classNew_1_0= RULE_ID
            {
            lv_classNew_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefine912); 

            			newLeafNode(lv_classNew_1_0, grammarAccess.getRefineAccess().getClassNewIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classNew",
                    		lv_classNew_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleRefine929); 

                	newLeafNode(otherlv_2, grammarAccess.getRefineAccess().getSpecializingKeyword_2());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:454:1: ( (otherlv_3= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:455:1: (otherlv_3= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:455:1: (otherlv_3= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:456:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefineRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefine949); 

            		newLeafNode(otherlv_3, grammarAccess.getRefineAccess().getPrefixPrefixCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleRefine961); 

                	newLeafNode(otherlv_4, grammarAccess.getRefineAccess().getFullStopKeyword_4());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:471:1: ( (lv_classOriginal_5_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:472:1: (lv_classOriginal_5_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:472:1: (lv_classOriginal_5_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:473:3: lv_classOriginal_5_0= RULE_ID
            {
            lv_classOriginal_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefine978); 

            			newLeafNode(lv_classOriginal_5_0, grammarAccess.getRefineAccess().getClassOriginalIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classOriginal",
                    		lv_classOriginal_5_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleRefine"


    // $ANTLR start "entryRuleGeneralize"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:497:1: entryRuleGeneralize returns [EObject current=null] : iv_ruleGeneralize= ruleGeneralize EOF ;
    public final EObject entryRuleGeneralize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralize = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:498:2: (iv_ruleGeneralize= ruleGeneralize EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:499:2: iv_ruleGeneralize= ruleGeneralize EOF
            {
             newCompositeNode(grammarAccess.getGeneralizeRule()); 
            pushFollow(FOLLOW_ruleGeneralize_in_entryRuleGeneralize1019);
            iv_ruleGeneralize=ruleGeneralize();

            state._fsp--;

             current =iv_ruleGeneralize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralize1029); 

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
    // $ANTLR end "entryRuleGeneralize"


    // $ANTLR start "ruleGeneralize"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:506:1: ruleGeneralize returns [EObject current=null] : (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'supertyping' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_class_5_0= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) ) )* ) ;
    public final EObject ruleGeneralize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_classNew_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_class_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_class_9_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:509:28: ( (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'supertyping' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_class_5_0= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) ) )* ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:510:1: (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'supertyping' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_class_5_0= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) ) )* )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:510:1: (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'supertyping' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_class_5_0= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) ) )* )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:510:3: otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'supertyping' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_class_5_0= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleGeneralize1066); 

                	newLeafNode(otherlv_0, grammarAccess.getGeneralizeAccess().getAddClassKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:514:1: ( (lv_classNew_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:515:1: (lv_classNew_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:515:1: (lv_classNew_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:516:3: lv_classNew_1_0= RULE_ID
            {
            lv_classNew_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralize1083); 

            			newLeafNode(lv_classNew_1_0, grammarAccess.getGeneralizeAccess().getClassNewIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneralizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classNew",
                    		lv_classNew_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleGeneralize1100); 

                	newLeafNode(otherlv_2, grammarAccess.getGeneralizeAccess().getSupertypingKeyword_2());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:536:1: ( (otherlv_3= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:537:1: (otherlv_3= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:537:1: (otherlv_3= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:538:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneralizeRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralize1120); 

            		newLeafNode(otherlv_3, grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleGeneralize1132); 

                	newLeafNode(otherlv_4, grammarAccess.getGeneralizeAccess().getFullStopKeyword_4());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:553:1: ( (lv_class_5_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:554:1: (lv_class_5_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:554:1: (lv_class_5_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:555:3: lv_class_5_0= RULE_ID
            {
            lv_class_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralize1149); 

            			newLeafNode(lv_class_5_0, grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneralizeRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_5_0, 
                    		"ID");
            	    

            }


            }

            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:571:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:571:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleGeneralize1167); 

            	        	newLeafNode(otherlv_6, grammarAccess.getGeneralizeAccess().getCommaKeyword_6_0());
            	        
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:575:1: ( (otherlv_7= RULE_ID ) )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:576:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:576:1: (otherlv_7= RULE_ID )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:577:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGeneralizeRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralize1187); 

            	    		newLeafNode(otherlv_7, grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_6_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleGeneralize1199); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGeneralizeAccess().getFullStopKeyword_6_2());
            	        
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:592:1: ( (lv_class_9_0= RULE_ID ) )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:593:1: (lv_class_9_0= RULE_ID )
            	    {
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:593:1: (lv_class_9_0= RULE_ID )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:594:3: lv_class_9_0= RULE_ID
            	    {
            	    lv_class_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralize1216); 

            	    			newLeafNode(lv_class_9_0, grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_6_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGeneralizeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"class",
            	            		lv_class_9_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleGeneralize"


    // $ANTLR start "entryRuleModifyClass"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:618:1: entryRuleModifyClass returns [EObject current=null] : iv_ruleModifyClass= ruleModifyClass EOF ;
    public final EObject entryRuleModifyClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyClass = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:619:2: (iv_ruleModifyClass= ruleModifyClass EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:620:2: iv_ruleModifyClass= ruleModifyClass EOF
            {
             newCompositeNode(grammarAccess.getModifyClassRule()); 
            pushFollow(FOLLOW_ruleModifyClass_in_entryRuleModifyClass1259);
            iv_ruleModifyClass=ruleModifyClass();

            state._fsp--;

             current =iv_ruleModifyClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyClass1269); 

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
    // $ANTLR end "entryRuleModifyClass"


    // $ANTLR start "ruleModifyClass"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:627:1: ruleModifyClass returns [EObject current=null] : (otherlv_0= 'modify class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_modifyOperators_5_0= ruleModifyOperator ) )* otherlv_6= '}' ) ;
    public final EObject ruleModifyClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_class_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_modifyOperators_5_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:630:28: ( (otherlv_0= 'modify class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_modifyOperators_5_0= ruleModifyOperator ) )* otherlv_6= '}' ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:631:1: (otherlv_0= 'modify class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_modifyOperators_5_0= ruleModifyOperator ) )* otherlv_6= '}' )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:631:1: (otherlv_0= 'modify class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_modifyOperators_5_0= ruleModifyOperator ) )* otherlv_6= '}' )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:631:3: otherlv_0= 'modify class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_modifyOperators_5_0= ruleModifyOperator ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleModifyClass1306); 

                	newLeafNode(otherlv_0, grammarAccess.getModifyClassAccess().getModifyClassKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:635:1: ( (otherlv_1= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:636:1: (otherlv_1= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:636:1: (otherlv_1= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:637:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getModifyClassRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModifyClass1326); 

            		newLeafNode(otherlv_1, grammarAccess.getModifyClassAccess().getPrefixPrefixCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleModifyClass1338); 

                	newLeafNode(otherlv_2, grammarAccess.getModifyClassAccess().getFullStopKeyword_2());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:652:1: ( (lv_class_3_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:653:1: (lv_class_3_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:653:1: (lv_class_3_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:654:3: lv_class_3_0= RULE_ID
            {
            lv_class_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModifyClass1355); 

            			newLeafNode(lv_class_3_0, grammarAccess.getModifyClassAccess().getClassIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModifyClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleModifyClass1372); 

                	newLeafNode(otherlv_4, grammarAccess.getModifyClassAccess().getLeftCurlyBracketKeyword_4());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:674:1: ( (lv_modifyOperators_5_0= ruleModifyOperator ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22||LA5_0==24||LA5_0==26||(LA5_0>=28 && LA5_0<=29)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:675:1: (lv_modifyOperators_5_0= ruleModifyOperator )
            	    {
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:675:1: (lv_modifyOperators_5_0= ruleModifyOperator )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:676:3: lv_modifyOperators_5_0= ruleModifyOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModifyClassAccess().getModifyOperatorsModifyOperatorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModifyOperator_in_ruleModifyClass1393);
            	    lv_modifyOperators_5_0=ruleModifyOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModifyClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modifyOperators",
            	            		lv_modifyOperators_5_0, 
            	            		"ModifyOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleModifyClass1406); 

                	newLeafNode(otherlv_6, grammarAccess.getModifyClassAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleModifyClass"


    // $ANTLR start "entryRuleModifyOperator"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:704:1: entryRuleModifyOperator returns [EObject current=null] : iv_ruleModifyOperator= ruleModifyOperator EOF ;
    public final EObject entryRuleModifyOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyOperator = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:705:2: (iv_ruleModifyOperator= ruleModifyOperator EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:706:2: iv_ruleModifyOperator= ruleModifyOperator EOF
            {
             newCompositeNode(grammarAccess.getModifyOperatorRule()); 
            pushFollow(FOLLOW_ruleModifyOperator_in_entryRuleModifyOperator1442);
            iv_ruleModifyOperator=ruleModifyOperator();

            state._fsp--;

             current =iv_ruleModifyOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyOperator1452); 

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
    // $ANTLR end "entryRuleModifyOperator"


    // $ANTLR start "ruleModifyOperator"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:713:1: ruleModifyOperator returns [EObject current=null] : (this_AddProperty_0= ruleAddProperty | this_ModifyProperty_1= ruleModifyProperty | this_FilterProperty_2= ruleFilterProperty | this_AddConstraint_3= ruleAddConstraint | this_FilterConstraint_4= ruleFilterConstraint ) ;
    public final EObject ruleModifyOperator() throws RecognitionException {
        EObject current = null;

        EObject this_AddProperty_0 = null;

        EObject this_ModifyProperty_1 = null;

        EObject this_FilterProperty_2 = null;

        EObject this_AddConstraint_3 = null;

        EObject this_FilterConstraint_4 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:716:28: ( (this_AddProperty_0= ruleAddProperty | this_ModifyProperty_1= ruleModifyProperty | this_FilterProperty_2= ruleFilterProperty | this_AddConstraint_3= ruleAddConstraint | this_FilterConstraint_4= ruleFilterConstraint ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:717:1: (this_AddProperty_0= ruleAddProperty | this_ModifyProperty_1= ruleModifyProperty | this_FilterProperty_2= ruleFilterProperty | this_AddConstraint_3= ruleAddConstraint | this_FilterConstraint_4= ruleFilterConstraint )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:717:1: (this_AddProperty_0= ruleAddProperty | this_ModifyProperty_1= ruleModifyProperty | this_FilterProperty_2= ruleFilterProperty | this_AddConstraint_3= ruleAddConstraint | this_FilterConstraint_4= ruleFilterConstraint )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            case 29:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:718:5: this_AddProperty_0= ruleAddProperty
                    {
                     
                            newCompositeNode(grammarAccess.getModifyOperatorAccess().getAddPropertyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAddProperty_in_ruleModifyOperator1499);
                    this_AddProperty_0=ruleAddProperty();

                    state._fsp--;

                     
                            current = this_AddProperty_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:728:5: this_ModifyProperty_1= ruleModifyProperty
                    {
                     
                            newCompositeNode(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleModifyProperty_in_ruleModifyOperator1526);
                    this_ModifyProperty_1=ruleModifyProperty();

                    state._fsp--;

                     
                            current = this_ModifyProperty_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:738:5: this_FilterProperty_2= ruleFilterProperty
                    {
                     
                            newCompositeNode(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFilterProperty_in_ruleModifyOperator1553);
                    this_FilterProperty_2=ruleFilterProperty();

                    state._fsp--;

                     
                            current = this_FilterProperty_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:748:5: this_AddConstraint_3= ruleAddConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAddConstraint_in_ruleModifyOperator1580);
                    this_AddConstraint_3=ruleAddConstraint();

                    state._fsp--;

                     
                            current = this_AddConstraint_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:758:5: this_FilterConstraint_4= ruleFilterConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getModifyOperatorAccess().getFilterConstraintParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFilterConstraint_in_ruleModifyOperator1607);
                    this_FilterConstraint_4=ruleFilterConstraint();

                    state._fsp--;

                     
                            current = this_FilterConstraint_4; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleModifyOperator"


    // $ANTLR start "entryRuleAddProperty"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:774:1: entryRuleAddProperty returns [EObject current=null] : iv_ruleAddProperty= ruleAddProperty EOF ;
    public final EObject entryRuleAddProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddProperty = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:775:2: (iv_ruleAddProperty= ruleAddProperty EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:776:2: iv_ruleAddProperty= ruleAddProperty EOF
            {
             newCompositeNode(grammarAccess.getAddPropertyRule()); 
            pushFollow(FOLLOW_ruleAddProperty_in_entryRuleAddProperty1642);
            iv_ruleAddProperty=ruleAddProperty();

            state._fsp--;

             current =iv_ruleAddProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddProperty1652); 

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
    // $ANTLR end "entryRuleAddProperty"


    // $ANTLR start "ruleAddProperty"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:783:1: ruleAddProperty returns [EObject current=null] : (otherlv_0= 'add property' ( (lv_property_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ( (lv_cardinality_4_0= ruleCardinality ) )? ( (lv_relationType_5_0= ruleRelationType ) )? ) ;
    public final EObject ruleAddProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_property_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_cardinality_4_0 = null;

        AntlrDatatypeRuleToken lv_relationType_5_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:786:28: ( (otherlv_0= 'add property' ( (lv_property_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ( (lv_cardinality_4_0= ruleCardinality ) )? ( (lv_relationType_5_0= ruleRelationType ) )? ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:787:1: (otherlv_0= 'add property' ( (lv_property_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ( (lv_cardinality_4_0= ruleCardinality ) )? ( (lv_relationType_5_0= ruleRelationType ) )? )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:787:1: (otherlv_0= 'add property' ( (lv_property_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ( (lv_cardinality_4_0= ruleCardinality ) )? ( (lv_relationType_5_0= ruleRelationType ) )? )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:787:3: otherlv_0= 'add property' ( (lv_property_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ( (lv_cardinality_4_0= ruleCardinality ) )? ( (lv_relationType_5_0= ruleRelationType ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleAddProperty1689); 

                	newLeafNode(otherlv_0, grammarAccess.getAddPropertyAccess().getAddPropertyKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:791:1: ( (lv_property_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:792:1: (lv_property_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:792:1: (lv_property_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:793:3: lv_property_1_0= RULE_ID
            {
            lv_property_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddProperty1706); 

            			newLeafNode(lv_property_1_0, grammarAccess.getAddPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"property",
                    		lv_property_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAddProperty1723); 

                	newLeafNode(otherlv_2, grammarAccess.getAddPropertyAccess().getTypeKeyword_2());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:813:1: ( (lv_type_3_0= ruleType ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:814:1: (lv_type_3_0= ruleType )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:814:1: (lv_type_3_0= ruleType )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:815:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAddPropertyAccess().getTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAddProperty1744);
            lv_type_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAddPropertyRule());
            	        }
                   		add(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:831:2: ( (lv_cardinality_4_0= ruleCardinality ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=30 && LA7_0<=36)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:832:1: (lv_cardinality_4_0= ruleCardinality )
                    {
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:832:1: (lv_cardinality_4_0= ruleCardinality )
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:833:3: lv_cardinality_4_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getAddPropertyAccess().getCardinalityCardinalityParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleAddProperty1765);
                    lv_cardinality_4_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAddPropertyRule());
                    	        }
                           		add(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_4_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:849:3: ( (lv_relationType_5_0= ruleRelationType ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=37 && LA8_0<=38)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:850:1: (lv_relationType_5_0= ruleRelationType )
                    {
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:850:1: (lv_relationType_5_0= ruleRelationType )
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:851:3: lv_relationType_5_0= ruleRelationType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAddPropertyAccess().getRelationTypeRelationTypeParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationType_in_ruleAddProperty1787);
                    lv_relationType_5_0=ruleRelationType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAddPropertyRule());
                    	        }
                           		add(
                           			current, 
                           			"relationType",
                            		lv_relationType_5_0, 
                            		"RelationType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleAddProperty"


    // $ANTLR start "entryRuleType"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:875:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:876:2: (iv_ruleType= ruleType EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:877:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1824);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1834); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:884:1: ruleType returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_class_3_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:887:28: ( ( ( (lv_type_0_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:888:1: ( ( (lv_type_0_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:888:1: ( ( (lv_type_0_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||LA9_1==16||LA9_1==22||LA9_1==24||LA9_1==26||(LA9_1>=28 && LA9_1<=38)) ) {
                    alt9=1;
                }
                else if ( (LA9_1==19) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:888:2: ( (lv_type_0_0= RULE_ID ) )
                    {
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:888:2: ( (lv_type_0_0= RULE_ID ) )
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:889:1: (lv_type_0_0= RULE_ID )
                    {
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:889:1: (lv_type_0_0= RULE_ID )
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:890:3: lv_type_0_0= RULE_ID
                    {
                    lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType1876); 

                    			newLeafNode(lv_type_0_0, grammarAccess.getTypeAccess().getTypeIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:907:6: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) )
                    {
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:907:6: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) )
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:907:7: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) )
                    {
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:907:7: ( (otherlv_1= RULE_ID ) )
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:908:1: (otherlv_1= RULE_ID )
                    {
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:908:1: (otherlv_1= RULE_ID )
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:909:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType1908); 

                    		newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getPrefixPrefixCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleType1920); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getFullStopKeyword_1_1());
                        
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:924:1: ( (lv_class_3_0= RULE_ID ) )
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:925:1: (lv_class_3_0= RULE_ID )
                    {
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:925:1: (lv_class_3_0= RULE_ID )
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:926:3: lv_class_3_0= RULE_ID
                    {
                    lv_class_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType1937); 

                    			newLeafNode(lv_class_3_0, grammarAccess.getTypeAccess().getClassIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_3_0, 
                            		"ID");
                    	    

                    }


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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleModifyProperty"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:950:1: entryRuleModifyProperty returns [EObject current=null] : iv_ruleModifyProperty= ruleModifyProperty EOF ;
    public final EObject entryRuleModifyProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyProperty = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:951:2: (iv_ruleModifyProperty= ruleModifyProperty EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:952:2: iv_ruleModifyProperty= ruleModifyProperty EOF
            {
             newCompositeNode(grammarAccess.getModifyPropertyRule()); 
            pushFollow(FOLLOW_ruleModifyProperty_in_entryRuleModifyProperty1979);
            iv_ruleModifyProperty=ruleModifyProperty();

            state._fsp--;

             current =iv_ruleModifyProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyProperty1989); 

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
    // $ANTLR end "entryRuleModifyProperty"


    // $ANTLR start "ruleModifyProperty"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:959:1: ruleModifyProperty returns [EObject current=null] : (otherlv_0= 'modify property' ( (lv_property_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleValueAssignment ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) ) )* ) ;
    public final EObject ruleModifyProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_property_1_0=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:962:28: ( (otherlv_0= 'modify property' ( (lv_property_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleValueAssignment ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) ) )* ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:963:1: (otherlv_0= 'modify property' ( (lv_property_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleValueAssignment ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) ) )* )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:963:1: (otherlv_0= 'modify property' ( (lv_property_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleValueAssignment ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) ) )* )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:963:3: otherlv_0= 'modify property' ( (lv_property_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleValueAssignment ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleModifyProperty2026); 

                	newLeafNode(otherlv_0, grammarAccess.getModifyPropertyAccess().getModifyPropertyKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:967:1: ( (lv_property_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:968:1: (lv_property_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:968:1: (lv_property_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:969:3: lv_property_1_0= RULE_ID
            {
            lv_property_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModifyProperty2043); 

            			newLeafNode(lv_property_1_0, grammarAccess.getModifyPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModifyPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"property",
                    		lv_property_1_0, 
                    		"ID");
            	    

            }


            }

            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:985:2: ( (lv_value_2_0= ruleValueAssignment ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:986:1: (lv_value_2_0= ruleValueAssignment )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:986:1: (lv_value_2_0= ruleValueAssignment )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:987:3: lv_value_2_0= ruleValueAssignment
            {
             
            	        newCompositeNode(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValueAssignment_in_ruleModifyProperty2069);
            lv_value_2_0=ruleValueAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModifyPropertyRule());
            	        }
                   		add(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ValueAssignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1003:2: (otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1003:4: otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleModifyProperty2082); 

            	        	newLeafNode(otherlv_3, grammarAccess.getModifyPropertyAccess().getCommaKeyword_3_0());
            	        
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1007:1: ( (lv_value_4_0= ruleValueAssignment ) )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1008:1: (lv_value_4_0= ruleValueAssignment )
            	    {
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1008:1: (lv_value_4_0= ruleValueAssignment )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1009:3: lv_value_4_0= ruleValueAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueAssignment_in_ruleModifyProperty2103);
            	    lv_value_4_0=ruleValueAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModifyPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"value",
            	            		lv_value_4_0, 
            	            		"ValueAssignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleModifyProperty"


    // $ANTLR start "entryRuleValueAssignment"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1033:1: entryRuleValueAssignment returns [EObject current=null] : iv_ruleValueAssignment= ruleValueAssignment EOF ;
    public final EObject entryRuleValueAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueAssignment = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1034:2: (iv_ruleValueAssignment= ruleValueAssignment EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1035:2: iv_ruleValueAssignment= ruleValueAssignment EOF
            {
             newCompositeNode(grammarAccess.getValueAssignmentRule()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment2141);
            iv_ruleValueAssignment=ruleValueAssignment();

            state._fsp--;

             current =iv_ruleValueAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueAssignment2151); 

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
    // $ANTLR end "entryRuleValueAssignment"


    // $ANTLR start "ruleValueAssignment"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1042:1: ruleValueAssignment returns [EObject current=null] : ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleValueAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1045:28: ( ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1046:1: ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1046:1: ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1046:2: ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1046:2: ( (lv_attribute_0_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1047:1: (lv_attribute_0_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1047:1: (lv_attribute_0_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1048:3: lv_attribute_0_0= RULE_ID
            {
            lv_attribute_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueAssignment2193); 

            			newLeafNode(lv_attribute_0_0, grammarAccess.getValueAssignmentAccess().getAttributeIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValueAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attribute",
                    		lv_attribute_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleValueAssignment2210); 

                	newLeafNode(otherlv_1, grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1068:1: ( (lv_value_2_0= ruleEString ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1069:1: (lv_value_2_0= ruleEString )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1069:1: (lv_value_2_0= ruleEString )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1070:3: lv_value_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValueAssignmentAccess().getValueEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleValueAssignment2231);
            lv_value_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"EString");
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
    // $ANTLR end "ruleValueAssignment"


    // $ANTLR start "entryRuleFilterProperty"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1094:1: entryRuleFilterProperty returns [EObject current=null] : iv_ruleFilterProperty= ruleFilterProperty EOF ;
    public final EObject entryRuleFilterProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterProperty = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1095:2: (iv_ruleFilterProperty= ruleFilterProperty EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1096:2: iv_ruleFilterProperty= ruleFilterProperty EOF
            {
             newCompositeNode(grammarAccess.getFilterPropertyRule()); 
            pushFollow(FOLLOW_ruleFilterProperty_in_entryRuleFilterProperty2267);
            iv_ruleFilterProperty=ruleFilterProperty();

            state._fsp--;

             current =iv_ruleFilterProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterProperty2277); 

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
    // $ANTLR end "entryRuleFilterProperty"


    // $ANTLR start "ruleFilterProperty"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1103:1: ruleFilterProperty returns [EObject current=null] : (otherlv_0= 'filter property' ( (lv_property_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFilterProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_property_1_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1106:28: ( (otherlv_0= 'filter property' ( (lv_property_1_0= RULE_ID ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1107:1: (otherlv_0= 'filter property' ( (lv_property_1_0= RULE_ID ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1107:1: (otherlv_0= 'filter property' ( (lv_property_1_0= RULE_ID ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1107:3: otherlv_0= 'filter property' ( (lv_property_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleFilterProperty2314); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterPropertyAccess().getFilterPropertyKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1111:1: ( (lv_property_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1112:1: (lv_property_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1112:1: (lv_property_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1113:3: lv_property_1_0= RULE_ID
            {
            lv_property_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilterProperty2331); 

            			newLeafNode(lv_property_1_0, grammarAccess.getFilterPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"property",
                    		lv_property_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleFilterProperty"


    // $ANTLR start "entryRuleFilterClass"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1137:1: entryRuleFilterClass returns [EObject current=null] : iv_ruleFilterClass= ruleFilterClass EOF ;
    public final EObject entryRuleFilterClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterClass = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1138:2: (iv_ruleFilterClass= ruleFilterClass EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1139:2: iv_ruleFilterClass= ruleFilterClass EOF
            {
             newCompositeNode(grammarAccess.getFilterClassRule()); 
            pushFollow(FOLLOW_ruleFilterClass_in_entryRuleFilterClass2372);
            iv_ruleFilterClass=ruleFilterClass();

            state._fsp--;

             current =iv_ruleFilterClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterClass2382); 

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
    // $ANTLR end "entryRuleFilterClass"


    // $ANTLR start "ruleFilterClass"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1146:1: ruleFilterClass returns [EObject current=null] : (otherlv_0= 'filter class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) ) ;
    public final EObject ruleFilterClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_class_3_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1149:28: ( (otherlv_0= 'filter class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1150:1: (otherlv_0= 'filter class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1150:1: (otherlv_0= 'filter class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1150:3: otherlv_0= 'filter class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleFilterClass2419); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterClassAccess().getFilterClassKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1154:1: ( (otherlv_1= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1155:1: (otherlv_1= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1155:1: (otherlv_1= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1156:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterClassRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilterClass2439); 

            		newLeafNode(otherlv_1, grammarAccess.getFilterClassAccess().getPrefixPrefixCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleFilterClass2451); 

                	newLeafNode(otherlv_2, grammarAccess.getFilterClassAccess().getFullStopKeyword_2());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1171:1: ( (lv_class_3_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1172:1: (lv_class_3_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1172:1: (lv_class_3_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1173:3: lv_class_3_0= RULE_ID
            {
            lv_class_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilterClass2468); 

            			newLeafNode(lv_class_3_0, grammarAccess.getFilterClassAccess().getClassIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_3_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleFilterClass"


    // $ANTLR start "entryRuleAddConstraint"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1197:1: entryRuleAddConstraint returns [EObject current=null] : iv_ruleAddConstraint= ruleAddConstraint EOF ;
    public final EObject entryRuleAddConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddConstraint = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1198:2: (iv_ruleAddConstraint= ruleAddConstraint EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1199:2: iv_ruleAddConstraint= ruleAddConstraint EOF
            {
             newCompositeNode(grammarAccess.getAddConstraintRule()); 
            pushFollow(FOLLOW_ruleAddConstraint_in_entryRuleAddConstraint2509);
            iv_ruleAddConstraint=ruleAddConstraint();

            state._fsp--;

             current =iv_ruleAddConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddConstraint2519); 

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
    // $ANTLR end "entryRuleAddConstraint"


    // $ANTLR start "ruleAddConstraint"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1206:1: ruleAddConstraint returns [EObject current=null] : (otherlv_0= 'add constraint' ( (lv_constraint_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleAddConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_constraint_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1209:28: ( (otherlv_0= 'add constraint' ( (lv_constraint_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1210:1: (otherlv_0= 'add constraint' ( (lv_constraint_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1210:1: (otherlv_0= 'add constraint' ( (lv_constraint_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1210:3: otherlv_0= 'add constraint' ( (lv_constraint_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAddConstraint2556); 

                	newLeafNode(otherlv_0, grammarAccess.getAddConstraintAccess().getAddConstraintKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1214:1: ( (lv_constraint_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1215:1: (lv_constraint_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1215:1: (lv_constraint_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1216:3: lv_constraint_1_0= RULE_ID
            {
            lv_constraint_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddConstraint2573); 

            			newLeafNode(lv_constraint_1_0, grammarAccess.getAddConstraintAccess().getConstraintIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"constraint",
                    		lv_constraint_1_0, 
                    		"ID");
            	    

            }


            }

            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1232:2: ( (lv_value_2_0= ruleEString ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1233:1: (lv_value_2_0= ruleEString )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1233:1: (lv_value_2_0= ruleEString )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1234:3: lv_value_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAddConstraintAccess().getValueEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleAddConstraint2599);
            lv_value_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAddConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"EString");
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
    // $ANTLR end "ruleAddConstraint"


    // $ANTLR start "entryRuleFilterConstraint"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1258:1: entryRuleFilterConstraint returns [EObject current=null] : iv_ruleFilterConstraint= ruleFilterConstraint EOF ;
    public final EObject entryRuleFilterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterConstraint = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1259:2: (iv_ruleFilterConstraint= ruleFilterConstraint EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1260:2: iv_ruleFilterConstraint= ruleFilterConstraint EOF
            {
             newCompositeNode(grammarAccess.getFilterConstraintRule()); 
            pushFollow(FOLLOW_ruleFilterConstraint_in_entryRuleFilterConstraint2635);
            iv_ruleFilterConstraint=ruleFilterConstraint();

            state._fsp--;

             current =iv_ruleFilterConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterConstraint2645); 

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
    // $ANTLR end "entryRuleFilterConstraint"


    // $ANTLR start "ruleFilterConstraint"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1267:1: ruleFilterConstraint returns [EObject current=null] : (otherlv_0= 'filter constraint' ( (lv_constraint_1_0= ruleEString ) ) ) ;
    public final EObject ruleFilterConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1270:28: ( (otherlv_0= 'filter constraint' ( (lv_constraint_1_0= ruleEString ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1271:1: (otherlv_0= 'filter constraint' ( (lv_constraint_1_0= ruleEString ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1271:1: (otherlv_0= 'filter constraint' ( (lv_constraint_1_0= ruleEString ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1271:3: otherlv_0= 'filter constraint' ( (lv_constraint_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFilterConstraint2682); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterConstraintAccess().getFilterConstraintKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1275:1: ( (lv_constraint_1_0= ruleEString ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1276:1: (lv_constraint_1_0= ruleEString )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1276:1: (lv_constraint_1_0= ruleEString )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1277:3: lv_constraint_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFilterConstraintAccess().getConstraintEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleFilterConstraint2703);
            lv_constraint_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"constraint",
                    		lv_constraint_1_0, 
                    		"EString");
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
    // $ANTLR end "ruleFilterConstraint"


    // $ANTLR start "entryRuleCardinality"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1301:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1302:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1303:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality2740);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality2751); 

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1310:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*..1' | kw= '0..1' | kw= '1..1' | kw= '1..*' | kw= '*..*' | kw= '*' | kw= '0..*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1313:28: ( (kw= '*..1' | kw= '0..1' | kw= '1..1' | kw= '1..*' | kw= '*..*' | kw= '*' | kw= '0..*' ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1314:1: (kw= '*..1' | kw= '0..1' | kw= '1..1' | kw= '1..*' | kw= '*..*' | kw= '*' | kw= '0..*' )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1314:1: (kw= '*..1' | kw= '0..1' | kw= '1..1' | kw= '1..*' | kw= '*..*' | kw= '*' | kw= '0..*' )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            case 34:
                {
                alt11=5;
                }
                break;
            case 35:
                {
                alt11=6;
                }
                break;
            case 36:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1315:2: kw= '*..1'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleCardinality2789); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1322:2: kw= '0..1'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleCardinality2808); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCardinalityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1329:2: kw= '1..1'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleCardinality2827); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1336:2: kw= '1..*'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleCardinality2846); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1343:2: kw= '*..*'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleCardinality2865); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1350:2: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleCardinality2884); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1357:2: kw= '0..*'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleCardinality2903); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCardinalityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_6()); 
                        

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleRelationType"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1370:1: entryRuleRelationType returns [String current=null] : iv_ruleRelationType= ruleRelationType EOF ;
    public final String entryRuleRelationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationType = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1371:2: (iv_ruleRelationType= ruleRelationType EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1372:2: iv_ruleRelationType= ruleRelationType EOF
            {
             newCompositeNode(grammarAccess.getRelationTypeRule()); 
            pushFollow(FOLLOW_ruleRelationType_in_entryRuleRelationType2944);
            iv_ruleRelationType=ruleRelationType();

            state._fsp--;

             current =iv_ruleRelationType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationType2955); 

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
    // $ANTLR end "entryRuleRelationType"


    // $ANTLR start "ruleRelationType"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1379:1: ruleRelationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'composition' | kw= 'association' ) ;
    public final AntlrDatatypeRuleToken ruleRelationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1382:28: ( (kw= 'composition' | kw= 'association' ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1383:1: (kw= 'composition' | kw= 'association' )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1383:1: (kw= 'composition' | kw= 'association' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            else if ( (LA12_0==38) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1384:2: kw= 'composition'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleRelationType2993); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationTypeAccess().getCompositionKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1391:2: kw= 'association'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleRelationType3012); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationTypeAccess().getAssociationKeyword_1()); 
                        

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
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "entryRuleEString"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1404:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1405:2: (iv_ruleEString= ruleEString EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1406:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString3053);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString3064); 

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
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1413:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1416:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1417:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1417:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1417:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString3104); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1425:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString3130); 

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
    public static final BitSet FOLLOW_12_in_ruleModel156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMetamodel_in_ruleModel177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleModel210 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleModel223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMetamodel_in_ruleModel244 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleModel277 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleModel291 = new BitSet(new long[]{0x0000000008230000L});
    public static final BitSet FOLLOW_ruleExtension_in_ruleModel312 = new BitSet(new long[]{0x0000000008230000L});
    public static final BitSet FOLLOW_16_in_ruleModel325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtension371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_ruleExtension418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefine_in_ruleExtension445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralize_in_ruleExtension472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyClass_in_ruleExtension499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterClass_in_ruleExtension526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_entryRuleMetamodel561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodel571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetamodel612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrefix703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_entryRuleCreate743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreate753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCreate790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreate807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefine_in_entryRuleRefine848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefine858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRefine895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefine912 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRefine929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefine949 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRefine961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefine978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralize_in_entryRuleGeneralize1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralize1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleGeneralize1066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralize1083 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGeneralize1100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralize1120 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGeneralize1132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralize1149 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleGeneralize1167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralize1187 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGeneralize1199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralize1216 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleModifyClass_in_entryRuleModifyClass1259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyClass1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleModifyClass1306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModifyClass1326 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleModifyClass1338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModifyClass1355 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModifyClass1372 = new BitSet(new long[]{0x0000000035410000L});
    public static final BitSet FOLLOW_ruleModifyOperator_in_ruleModifyClass1393 = new BitSet(new long[]{0x0000000035410000L});
    public static final BitSet FOLLOW_16_in_ruleModifyClass1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyOperator_in_entryRuleModifyOperator1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyOperator1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddProperty_in_ruleModifyOperator1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyProperty_in_ruleModifyOperator1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterProperty_in_ruleModifyOperator1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddConstraint_in_ruleModifyOperator1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterConstraint_in_ruleModifyOperator1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddProperty_in_entryRuleAddProperty1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddProperty1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAddProperty1689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddProperty1706 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAddProperty1723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleAddProperty1744 = new BitSet(new long[]{0x0000007FC0000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleAddProperty1765 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_ruleAddProperty1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType1908 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleType1920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyProperty_in_entryRuleModifyProperty1979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyProperty1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleModifyProperty2026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModifyProperty2043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_ruleModifyProperty2069 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleModifyProperty2082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_ruleModifyProperty2103 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment2141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueAssignment2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueAssignment2193 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleValueAssignment2210 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleValueAssignment2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterProperty_in_entryRuleFilterProperty2267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterProperty2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFilterProperty2314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilterProperty2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterClass_in_entryRuleFilterClass2372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterClass2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFilterClass2419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilterClass2439 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFilterClass2451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilterClass2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddConstraint_in_entryRuleAddConstraint2509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddConstraint2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAddConstraint2556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddConstraint2573 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAddConstraint2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterConstraint_in_entryRuleFilterConstraint2635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterConstraint2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFilterConstraint2682 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleFilterConstraint2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality2740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCardinality2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCardinality2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCardinality2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCardinality2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCardinality2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCardinality2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCardinality2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_entryRuleRelationType2944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationType2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRelationType2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRelationType3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString3053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString3130 = new BitSet(new long[]{0x0000000000000002L});

}