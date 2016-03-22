package emfviews.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import emfviews.dsl.services.VpdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVpdlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'and'", "'or'", "'='", "'<='", "'>='", "'<'", "'>'", "'<>'", "'create view'", "'on'", "','", "'as'", "'select'", "'from'", "'where'", "'.'", "'join'", "'*'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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
    public String getGrammarFileName() { return "../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g"; }


     
     	private VpdlGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VpdlGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:61:1: ( ruleModel EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:76:1: ( rule__Model__Group__0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMetamodel"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:88:1: entryRuleMetamodel : ruleMetamodel EOF ;
    public final void entryRuleMetamodel() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:89:1: ( ruleMetamodel EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:90:1: ruleMetamodel EOF
            {
             before(grammarAccess.getMetamodelRule()); 
            pushFollow(FOLLOW_ruleMetamodel_in_entryRuleMetamodel121);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getMetamodelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodel128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:97:1: ruleMetamodel : ( ( rule__Metamodel__Group__0 ) ) ;
    public final void ruleMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:101:2: ( ( ( rule__Metamodel__Group__0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:102:1: ( ( rule__Metamodel__Group__0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:102:1: ( ( rule__Metamodel__Group__0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:103:1: ( rule__Metamodel__Group__0 )
            {
             before(grammarAccess.getMetamodelAccess().getGroup()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:104:1: ( rule__Metamodel__Group__0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:104:2: rule__Metamodel__Group__0
            {
            pushFollow(FOLLOW_rule__Metamodel__Group__0_in_ruleMetamodel154);
            rule__Metamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRuleExpression"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:116:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:117:1: ( ruleExpression EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:118:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression181);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:125:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:129:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:130:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:130:1: ( ( rule__Expression__Group__0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:131:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:132:1: ( rule__Expression__Group__0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:132:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression214);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSelect"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:144:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:145:1: ( ruleSelect EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:146:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect241);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:153:1: ruleSelect : ( ( rule__Select__Alternatives ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:157:2: ( ( ( rule__Select__Alternatives ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:158:1: ( ( rule__Select__Alternatives ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:158:1: ( ( rule__Select__Alternatives ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:159:1: ( rule__Select__Alternatives )
            {
             before(grammarAccess.getSelectAccess().getAlternatives()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:160:1: ( rule__Select__Alternatives )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:160:2: rule__Select__Alternatives
            {
            pushFollow(FOLLOW_rule__Select__Alternatives_in_ruleSelect274);
            rule__Select__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleSelectAttribute"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:172:1: entryRuleSelectAttribute : ruleSelectAttribute EOF ;
    public final void entryRuleSelectAttribute() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:173:1: ( ruleSelectAttribute EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:174:1: ruleSelectAttribute EOF
            {
             before(grammarAccess.getSelectAttributeRule()); 
            pushFollow(FOLLOW_ruleSelectAttribute_in_entryRuleSelectAttribute301);
            ruleSelectAttribute();

            state._fsp--;

             after(grammarAccess.getSelectAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAttribute308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectAttribute"


    // $ANTLR start "ruleSelectAttribute"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:181:1: ruleSelectAttribute : ( ( rule__SelectAttribute__Group__0 ) ) ;
    public final void ruleSelectAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:185:2: ( ( ( rule__SelectAttribute__Group__0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:186:1: ( ( rule__SelectAttribute__Group__0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:186:1: ( ( rule__SelectAttribute__Group__0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:187:1: ( rule__SelectAttribute__Group__0 )
            {
             before(grammarAccess.getSelectAttributeAccess().getGroup()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:188:1: ( rule__SelectAttribute__Group__0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:188:2: rule__SelectAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__SelectAttribute__Group__0_in_ruleSelectAttribute334);
            rule__SelectAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectAttribute"


    // $ANTLR start "entryRuleFrom"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:200:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:201:1: ( ruleFrom EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:202:1: ruleFrom EOF
            {
             before(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_ruleFrom_in_entryRuleFrom361);
            ruleFrom();

            state._fsp--;

             after(grammarAccess.getFromRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrom368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:209:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:213:2: ( ( ( rule__From__Group__0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:214:1: ( ( rule__From__Group__0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:214:1: ( ( rule__From__Group__0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:215:1: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:216:1: ( rule__From__Group__0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:216:2: rule__From__Group__0
            {
            pushFollow(FOLLOW_rule__From__Group__0_in_ruleFrom394);
            rule__From__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRuleJoin"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:228:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:229:1: ( ruleJoin EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:230:1: ruleJoin EOF
            {
             before(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin421);
            ruleJoin();

            state._fsp--;

             after(grammarAccess.getJoinRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:237:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:241:2: ( ( ( rule__Join__Group__0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:242:1: ( ( rule__Join__Group__0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:242:1: ( ( rule__Join__Group__0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:243:1: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:244:1: ( rule__Join__Group__0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:244:2: rule__Join__Group__0
            {
            pushFollow(FOLLOW_rule__Join__Group__0_in_ruleJoin454);
            rule__Join__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleJoinLeft"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:256:1: entryRuleJoinLeft : ruleJoinLeft EOF ;
    public final void entryRuleJoinLeft() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:257:1: ( ruleJoinLeft EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:258:1: ruleJoinLeft EOF
            {
             before(grammarAccess.getJoinLeftRule()); 
            pushFollow(FOLLOW_ruleJoinLeft_in_entryRuleJoinLeft481);
            ruleJoinLeft();

            state._fsp--;

             after(grammarAccess.getJoinLeftRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinLeft488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoinLeft"


    // $ANTLR start "ruleJoinLeft"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:265:1: ruleJoinLeft : ( ( rule__JoinLeft__Group__0 ) ) ;
    public final void ruleJoinLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:269:2: ( ( ( rule__JoinLeft__Group__0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:270:1: ( ( rule__JoinLeft__Group__0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:270:1: ( ( rule__JoinLeft__Group__0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:271:1: ( rule__JoinLeft__Group__0 )
            {
             before(grammarAccess.getJoinLeftAccess().getGroup()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:272:1: ( rule__JoinLeft__Group__0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:272:2: rule__JoinLeft__Group__0
            {
            pushFollow(FOLLOW_rule__JoinLeft__Group__0_in_ruleJoinLeft514);
            rule__JoinLeft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinLeftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoinLeft"


    // $ANTLR start "entryRuleJoinRight"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:284:1: entryRuleJoinRight : ruleJoinRight EOF ;
    public final void entryRuleJoinRight() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:285:1: ( ruleJoinRight EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:286:1: ruleJoinRight EOF
            {
             before(grammarAccess.getJoinRightRule()); 
            pushFollow(FOLLOW_ruleJoinRight_in_entryRuleJoinRight541);
            ruleJoinRight();

            state._fsp--;

             after(grammarAccess.getJoinRightRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinRight548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoinRight"


    // $ANTLR start "ruleJoinRight"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:293:1: ruleJoinRight : ( ( rule__JoinRight__Group__0 ) ) ;
    public final void ruleJoinRight() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:297:2: ( ( ( rule__JoinRight__Group__0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:298:1: ( ( rule__JoinRight__Group__0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:298:1: ( ( rule__JoinRight__Group__0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:299:1: ( rule__JoinRight__Group__0 )
            {
             before(grammarAccess.getJoinRightAccess().getGroup()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:300:1: ( rule__JoinRight__Group__0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:300:2: rule__JoinRight__Group__0
            {
            pushFollow(FOLLOW_rule__JoinRight__Group__0_in_ruleJoinRight574);
            rule__JoinRight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinRightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoinRight"


    // $ANTLR start "entryRuleAttribute"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:312:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:313:1: ( ruleAttribute EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:314:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute601);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:321:1: ruleAttribute : ( ( rule__Attribute__NameAssignment ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:325:2: ( ( ( rule__Attribute__NameAssignment ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:326:1: ( ( rule__Attribute__NameAssignment ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:326:1: ( ( rule__Attribute__NameAssignment ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:327:1: ( rule__Attribute__NameAssignment )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:328:1: ( rule__Attribute__NameAssignment )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:328:2: rule__Attribute__NameAssignment
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_in_ruleAttribute634);
            rule__Attribute__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleClass"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:340:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:341:1: ( ruleClass EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:342:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass661);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:349:1: ruleClass : ( ( rule__Class__NameAssignment ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:353:2: ( ( ( rule__Class__NameAssignment ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:354:1: ( ( rule__Class__NameAssignment ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:354:1: ( ( rule__Class__NameAssignment ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:355:1: ( rule__Class__NameAssignment )
            {
             before(grammarAccess.getClassAccess().getNameAssignment()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:356:1: ( rule__Class__NameAssignment )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:356:2: rule__Class__NameAssignment
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_in_ruleClass694);
            rule__Class__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleMetamodelName"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:368:1: entryRuleMetamodelName : ruleMetamodelName EOF ;
    public final void entryRuleMetamodelName() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:369:1: ( ruleMetamodelName EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:370:1: ruleMetamodelName EOF
            {
             before(grammarAccess.getMetamodelNameRule()); 
            pushFollow(FOLLOW_ruleMetamodelName_in_entryRuleMetamodelName721);
            ruleMetamodelName();

            state._fsp--;

             after(grammarAccess.getMetamodelNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelName728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetamodelName"


    // $ANTLR start "ruleMetamodelName"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:377:1: ruleMetamodelName : ( ( rule__MetamodelName__NameAssignment ) ) ;
    public final void ruleMetamodelName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:381:2: ( ( ( rule__MetamodelName__NameAssignment ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:382:1: ( ( rule__MetamodelName__NameAssignment ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:382:1: ( ( rule__MetamodelName__NameAssignment ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:383:1: ( rule__MetamodelName__NameAssignment )
            {
             before(grammarAccess.getMetamodelNameAccess().getNameAssignment()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:384:1: ( rule__MetamodelName__NameAssignment )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:384:2: rule__MetamodelName__NameAssignment
            {
            pushFollow(FOLLOW_rule__MetamodelName__NameAssignment_in_ruleMetamodelName754);
            rule__MetamodelName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodelName"


    // $ANTLR start "entryRuleRelation"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:396:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:397:1: ( ruleRelation EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:398:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation781);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:405:1: ruleRelation : ( ( rule__Relation__NameAssignment ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:409:2: ( ( ( rule__Relation__NameAssignment ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:410:1: ( ( rule__Relation__NameAssignment ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:410:1: ( ( rule__Relation__NameAssignment ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:411:1: ( rule__Relation__NameAssignment )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:412:1: ( rule__Relation__NameAssignment )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:412:2: rule__Relation__NameAssignment
            {
            pushFollow(FOLLOW_rule__Relation__NameAssignment_in_ruleRelation814);
            rule__Relation__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleCondition"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:424:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:425:1: ( ruleCondition EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:426:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition841);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:433:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:437:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:438:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:438:1: ( ( rule__Condition__Group__0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:439:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:440:1: ( rule__Condition__Group__0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:440:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition874);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEclExpression"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:452:1: entryRuleEclExpression : ruleEclExpression EOF ;
    public final void entryRuleEclExpression() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:453:1: ( ruleEclExpression EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:454:1: ruleEclExpression EOF
            {
             before(grammarAccess.getEclExpressionRule()); 
            pushFollow(FOLLOW_ruleEclExpression_in_entryRuleEclExpression901);
            ruleEclExpression();

            state._fsp--;

             after(grammarAccess.getEclExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEclExpression908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEclExpression"


    // $ANTLR start "ruleEclExpression"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:461:1: ruleEclExpression : ( ( rule__EclExpression__ValueAssignment ) ) ;
    public final void ruleEclExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:465:2: ( ( ( rule__EclExpression__ValueAssignment ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:466:1: ( ( rule__EclExpression__ValueAssignment ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:466:1: ( ( rule__EclExpression__ValueAssignment ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:467:1: ( rule__EclExpression__ValueAssignment )
            {
             before(grammarAccess.getEclExpressionAccess().getValueAssignment()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:468:1: ( rule__EclExpression__ValueAssignment )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:468:2: rule__EclExpression__ValueAssignment
            {
            pushFollow(FOLLOW_rule__EclExpression__ValueAssignment_in_ruleEclExpression934);
            rule__EclExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEclExpressionAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEclExpression"


    // $ANTLR start "entryRuleComparison"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:480:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:481:1: ( ruleComparison EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:482:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison961);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:489:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:493:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:494:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:494:1: ( ( rule__Comparison__Group__0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:495:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:496:1: ( rule__Comparison__Group__0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:496:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison994);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleLeft"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:508:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:509:1: ( ruleLeft EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:510:1: ruleLeft EOF
            {
             before(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_ruleLeft_in_entryRuleLeft1021);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getLeftRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeft1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:517:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:521:2: ( ( ( rule__Left__Group__0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:522:1: ( ( rule__Left__Group__0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:522:1: ( ( rule__Left__Group__0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:523:1: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:524:1: ( rule__Left__Group__0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:524:2: rule__Left__Group__0
            {
            pushFollow(FOLLOW_rule__Left__Group__0_in_ruleLeft1054);
            rule__Left__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:536:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:537:1: ( ruleRight EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:538:1: ruleRight EOF
            {
             before(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_ruleRight_in_entryRuleRight1081);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getRightRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRight1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:545:1: ruleRight : ( ( rule__Right__Alternatives ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:549:2: ( ( ( rule__Right__Alternatives ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:550:1: ( ( rule__Right__Alternatives ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:550:1: ( ( rule__Right__Alternatives ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:551:1: ( rule__Right__Alternatives )
            {
             before(grammarAccess.getRightAccess().getAlternatives()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:552:1: ( rule__Right__Alternatives )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:552:2: rule__Right__Alternatives
            {
            pushFollow(FOLLOW_rule__Right__Alternatives_in_ruleRight1114);
            rule__Right__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleEString"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:564:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:565:1: ( ruleEString EOF )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:566:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1141);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:573:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:577:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:578:1: ( ( rule__EString__Alternatives ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:578:1: ( ( rule__EString__Alternatives ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:579:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:580:1: ( rule__EString__Alternatives )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:580:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString1174);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Select__Alternatives"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:592:1: rule__Select__Alternatives : ( ( ( rule__Select__SelectAssignment_0 ) ) | ( ( rule__Select__Group_1__0 ) ) );
    public final void rule__Select__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:596:1: ( ( ( rule__Select__SelectAssignment_0 ) ) | ( ( rule__Select__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==28) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:597:1: ( ( rule__Select__SelectAssignment_0 ) )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:597:1: ( ( rule__Select__SelectAssignment_0 ) )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:598:1: ( rule__Select__SelectAssignment_0 )
                    {
                     before(grammarAccess.getSelectAccess().getSelectAssignment_0()); 
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:599:1: ( rule__Select__SelectAssignment_0 )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:599:2: rule__Select__SelectAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Select__SelectAssignment_0_in_rule__Select__Alternatives1210);
                    rule__Select__SelectAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getSelectAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:603:6: ( ( rule__Select__Group_1__0 ) )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:603:6: ( ( rule__Select__Group_1__0 ) )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:604:1: ( rule__Select__Group_1__0 )
                    {
                     before(grammarAccess.getSelectAccess().getGroup_1()); 
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:605:1: ( rule__Select__Group_1__0 )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:605:2: rule__Select__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Select__Group_1__0_in_rule__Select__Alternatives1228);
                    rule__Select__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:614:1: rule__Condition__Alternatives_0 : ( ( ( rule__Condition__ValueAssignment_0_0 ) ) | ( ( rule__Condition__ValueAssignment_0_1 ) ) );
    public final void rule__Condition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:618:1: ( ( ( rule__Condition__ValueAssignment_0_0 ) ) | ( ( rule__Condition__ValueAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==26) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||(LA2_1>=RULE_STRING && LA2_1<=RULE_ID)||(LA2_1>=11 && LA2_1<=12)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:619:1: ( ( rule__Condition__ValueAssignment_0_0 ) )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:619:1: ( ( rule__Condition__ValueAssignment_0_0 ) )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:620:1: ( rule__Condition__ValueAssignment_0_0 )
                    {
                     before(grammarAccess.getConditionAccess().getValueAssignment_0_0()); 
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:621:1: ( rule__Condition__ValueAssignment_0_0 )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:621:2: rule__Condition__ValueAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Condition__ValueAssignment_0_0_in_rule__Condition__Alternatives_01261);
                    rule__Condition__ValueAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getValueAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:625:6: ( ( rule__Condition__ValueAssignment_0_1 ) )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:625:6: ( ( rule__Condition__ValueAssignment_0_1 ) )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:626:1: ( rule__Condition__ValueAssignment_0_1 )
                    {
                     before(grammarAccess.getConditionAccess().getValueAssignment_0_1()); 
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:627:1: ( rule__Condition__ValueAssignment_0_1 )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:627:2: rule__Condition__ValueAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Condition__ValueAssignment_0_1_in_rule__Condition__Alternatives_01279);
                    rule__Condition__ValueAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getValueAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives_0"


    // $ANTLR start "rule__Condition__Alternatives_1_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:636:1: rule__Condition__Alternatives_1_0 : ( ( 'and' ) | ( 'or' ) );
    public final void rule__Condition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:640:1: ( ( 'and' ) | ( 'or' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:641:1: ( 'and' )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:641:1: ( 'and' )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:642:1: 'and'
                    {
                     before(grammarAccess.getConditionAccess().getAndKeyword_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Condition__Alternatives_1_01313); 
                     after(grammarAccess.getConditionAccess().getAndKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:649:6: ( 'or' )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:649:6: ( 'or' )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:650:1: 'or'
                    {
                     before(grammarAccess.getConditionAccess().getOrKeyword_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Condition__Alternatives_1_01333); 
                     after(grammarAccess.getConditionAccess().getOrKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives_1_0"


    // $ANTLR start "rule__Condition__Alternatives_1_1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:662:1: rule__Condition__Alternatives_1_1 : ( ( ( rule__Condition__ValueAssignment_1_1_0 ) ) | ( ( rule__Condition__ValueAssignment_1_1_1 ) ) );
    public final void rule__Condition__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:666:1: ( ( ( rule__Condition__ValueAssignment_1_1_0 ) ) | ( ( rule__Condition__ValueAssignment_1_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==26) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||(LA4_1>=RULE_STRING && LA4_1<=RULE_ID)||(LA4_1>=11 && LA4_1<=12)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:667:1: ( ( rule__Condition__ValueAssignment_1_1_0 ) )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:667:1: ( ( rule__Condition__ValueAssignment_1_1_0 ) )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:668:1: ( rule__Condition__ValueAssignment_1_1_0 )
                    {
                     before(grammarAccess.getConditionAccess().getValueAssignment_1_1_0()); 
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:669:1: ( rule__Condition__ValueAssignment_1_1_0 )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:669:2: rule__Condition__ValueAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Condition__ValueAssignment_1_1_0_in_rule__Condition__Alternatives_1_11367);
                    rule__Condition__ValueAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getValueAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:673:6: ( ( rule__Condition__ValueAssignment_1_1_1 ) )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:673:6: ( ( rule__Condition__ValueAssignment_1_1_1 ) )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:674:1: ( rule__Condition__ValueAssignment_1_1_1 )
                    {
                     before(grammarAccess.getConditionAccess().getValueAssignment_1_1_1()); 
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:675:1: ( rule__Condition__ValueAssignment_1_1_1 )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:675:2: rule__Condition__ValueAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__Condition__ValueAssignment_1_1_1_in_rule__Condition__Alternatives_1_11385);
                    rule__Condition__ValueAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getValueAssignment_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives_1_1"


    // $ANTLR start "rule__Comparison__Alternatives_1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:684:1: rule__Comparison__Alternatives_1 : ( ( '=' ) | ( '<=' ) | ( '>=' ) | ( '<' ) | ( '>' ) | ( '<>' ) );
    public final void rule__Comparison__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:688:1: ( ( '=' ) | ( '<=' ) | ( '>=' ) | ( '<' ) | ( '>' ) | ( '<>' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            case 18:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:689:1: ( '=' )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:689:1: ( '=' )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:690:1: '='
                    {
                     before(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0()); 
                    match(input,13,FOLLOW_13_in_rule__Comparison__Alternatives_11419); 
                     after(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:697:6: ( '<=' )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:697:6: ( '<=' )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:698:1: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1()); 
                    match(input,14,FOLLOW_14_in_rule__Comparison__Alternatives_11439); 
                     after(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:705:6: ( '>=' )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:705:6: ( '>=' )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:706:1: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_2()); 
                    match(input,15,FOLLOW_15_in_rule__Comparison__Alternatives_11459); 
                     after(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:713:6: ( '<' )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:713:6: ( '<' )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:714:1: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_3()); 
                    match(input,16,FOLLOW_16_in_rule__Comparison__Alternatives_11479); 
                     after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:721:6: ( '>' )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:721:6: ( '>' )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:722:1: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_4()); 
                    match(input,17,FOLLOW_17_in_rule__Comparison__Alternatives_11499); 
                     after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:729:6: ( '<>' )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:729:6: ( '<>' )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:730:1: '<>'
                    {
                     before(grammarAccess.getComparisonAccess().getLessThanSignGreaterThanSignKeyword_1_5()); 
                    match(input,18,FOLLOW_18_in_rule__Comparison__Alternatives_11519); 
                     after(grammarAccess.getComparisonAccess().getLessThanSignGreaterThanSignKeyword_1_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Alternatives_1"


    // $ANTLR start "rule__Right__Alternatives"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:742:1: rule__Right__Alternatives : ( ( ( rule__Right__Group_0__0 ) ) | ( ( rule__Right__ValueAssignment_1 ) ) );
    public final void rule__Right__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:746:1: ( ( ( rule__Right__Group_0__0 ) ) | ( ( rule__Right__ValueAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=RULE_STRING && LA6_1<=RULE_ID)||(LA6_1>=11 && LA6_1<=12)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==26) ) {
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
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:747:1: ( ( rule__Right__Group_0__0 ) )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:747:1: ( ( rule__Right__Group_0__0 ) )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:748:1: ( rule__Right__Group_0__0 )
                    {
                     before(grammarAccess.getRightAccess().getGroup_0()); 
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:749:1: ( rule__Right__Group_0__0 )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:749:2: rule__Right__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Right__Group_0__0_in_rule__Right__Alternatives1553);
                    rule__Right__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRightAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:753:6: ( ( rule__Right__ValueAssignment_1 ) )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:753:6: ( ( rule__Right__ValueAssignment_1 ) )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:754:1: ( rule__Right__ValueAssignment_1 )
                    {
                     before(grammarAccess.getRightAccess().getValueAssignment_1()); 
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:755:1: ( rule__Right__ValueAssignment_1 )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:755:2: rule__Right__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Right__ValueAssignment_1_in_rule__Right__Alternatives1571);
                    rule__Right__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRightAccess().getValueAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:764:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:768:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:769:1: ( RULE_STRING )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:769:1: ( RULE_STRING )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:770:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1604); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:775:6: ( RULE_ID )
                    {
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:775:6: ( RULE_ID )
                    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:776:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1621); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:788:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:792:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:793:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01651);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01654);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:800:1: rule__Model__Group__0__Impl : ( 'create view' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:804:1: ( ( 'create view' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:805:1: ( 'create view' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:805:1: ( 'create view' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:806:1: 'create view'
            {
             before(grammarAccess.getModelAccess().getCreateViewKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group__0__Impl1682); 
             after(grammarAccess.getModelAccess().getCreateViewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:819:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:823:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:824:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11713);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11716);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:831:1: rule__Model__Group__1__Impl : ( ( rule__Model__ViewNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:835:1: ( ( ( rule__Model__ViewNameAssignment_1 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:836:1: ( ( rule__Model__ViewNameAssignment_1 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:836:1: ( ( rule__Model__ViewNameAssignment_1 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:837:1: ( rule__Model__ViewNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getViewNameAssignment_1()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:838:1: ( rule__Model__ViewNameAssignment_1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:838:2: rule__Model__ViewNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ViewNameAssignment_1_in_rule__Model__Group__1__Impl1743);
            rule__Model__ViewNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getViewNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:848:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:852:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:853:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21773);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21776);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:860:1: rule__Model__Group__2__Impl : ( 'on' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:864:1: ( ( 'on' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:865:1: ( 'on' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:865:1: ( 'on' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:866:1: 'on'
            {
             before(grammarAccess.getModelAccess().getOnKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__2__Impl1804); 
             after(grammarAccess.getModelAccess().getOnKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:879:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:883:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:884:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31835);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31838);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:891:1: rule__Model__Group__3__Impl : ( ( rule__Model__MetamodelAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:895:1: ( ( ( rule__Model__MetamodelAssignment_3 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:896:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:896:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:897:1: ( rule__Model__MetamodelAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_3()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:898:1: ( rule__Model__MetamodelAssignment_3 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:898:2: rule__Model__MetamodelAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl1865);
            rule__Model__MetamodelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMetamodelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:908:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:912:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:913:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41895);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41898);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:920:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:924:1: ( ( ( rule__Model__Group_4__0 )* ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:925:1: ( ( rule__Model__Group_4__0 )* )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:925:1: ( ( rule__Model__Group_4__0 )* )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:926:1: ( rule__Model__Group_4__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:927:1: ( rule__Model__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:927:2: rule__Model__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl1925);
            	    rule__Model__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:937:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:941:1: ( rule__Model__Group__5__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:942:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51956);
            rule__Model__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:948:1: rule__Model__Group__5__Impl : ( ( rule__Model__ExpressionAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:952:1: ( ( ( rule__Model__ExpressionAssignment_5 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:953:1: ( ( rule__Model__ExpressionAssignment_5 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:953:1: ( ( rule__Model__ExpressionAssignment_5 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:954:1: ( rule__Model__ExpressionAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getExpressionAssignment_5()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:955:1: ( rule__Model__ExpressionAssignment_5 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:955:2: rule__Model__ExpressionAssignment_5
            {
            pushFollow(FOLLOW_rule__Model__ExpressionAssignment_5_in_rule__Model__Group__5__Impl1983);
            rule__Model__ExpressionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExpressionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group_4__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:977:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:981:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:982:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__02025);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__02028);
            rule__Model__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0"


    // $ANTLR start "rule__Model__Group_4__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:989:1: rule__Model__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:993:1: ( ( ',' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:994:1: ( ',' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:994:1: ( ',' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:995:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group_4__0__Impl2056); 
             after(grammarAccess.getModelAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0__Impl"


    // $ANTLR start "rule__Model__Group_4__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1008:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1012:1: ( rule__Model__Group_4__1__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1013:2: rule__Model__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__12087);
            rule__Model__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1"


    // $ANTLR start "rule__Model__Group_4__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1019:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__MetamodelAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1023:1: ( ( ( rule__Model__MetamodelAssignment_4_1 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1024:1: ( ( rule__Model__MetamodelAssignment_4_1 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1024:1: ( ( rule__Model__MetamodelAssignment_4_1 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1025:1: ( rule__Model__MetamodelAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_4_1()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1026:1: ( rule__Model__MetamodelAssignment_4_1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1026:2: rule__Model__MetamodelAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_4_1_in_rule__Model__Group_4__1__Impl2114);
            rule__Model__MetamodelAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMetamodelAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1__Impl"


    // $ANTLR start "rule__Metamodel__Group__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1040:1: rule__Metamodel__Group__0 : rule__Metamodel__Group__0__Impl rule__Metamodel__Group__1 ;
    public final void rule__Metamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1044:1: ( rule__Metamodel__Group__0__Impl rule__Metamodel__Group__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1045:2: rule__Metamodel__Group__0__Impl rule__Metamodel__Group__1
            {
            pushFollow(FOLLOW_rule__Metamodel__Group__0__Impl_in_rule__Metamodel__Group__02148);
            rule__Metamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metamodel__Group__1_in_rule__Metamodel__Group__02151);
            rule__Metamodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodel__Group__0"


    // $ANTLR start "rule__Metamodel__Group__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1052:1: rule__Metamodel__Group__0__Impl : ( ( rule__Metamodel__MetamodelURLAssignment_0 ) ) ;
    public final void rule__Metamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1056:1: ( ( ( rule__Metamodel__MetamodelURLAssignment_0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1057:1: ( ( rule__Metamodel__MetamodelURLAssignment_0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1057:1: ( ( rule__Metamodel__MetamodelURLAssignment_0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1058:1: ( rule__Metamodel__MetamodelURLAssignment_0 )
            {
             before(grammarAccess.getMetamodelAccess().getMetamodelURLAssignment_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1059:1: ( rule__Metamodel__MetamodelURLAssignment_0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1059:2: rule__Metamodel__MetamodelURLAssignment_0
            {
            pushFollow(FOLLOW_rule__Metamodel__MetamodelURLAssignment_0_in_rule__Metamodel__Group__0__Impl2178);
            rule__Metamodel__MetamodelURLAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelAccess().getMetamodelURLAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodel__Group__0__Impl"


    // $ANTLR start "rule__Metamodel__Group__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1069:1: rule__Metamodel__Group__1 : rule__Metamodel__Group__1__Impl rule__Metamodel__Group__2 ;
    public final void rule__Metamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1073:1: ( rule__Metamodel__Group__1__Impl rule__Metamodel__Group__2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1074:2: rule__Metamodel__Group__1__Impl rule__Metamodel__Group__2
            {
            pushFollow(FOLLOW_rule__Metamodel__Group__1__Impl_in_rule__Metamodel__Group__12208);
            rule__Metamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metamodel__Group__2_in_rule__Metamodel__Group__12211);
            rule__Metamodel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodel__Group__1"


    // $ANTLR start "rule__Metamodel__Group__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1081:1: rule__Metamodel__Group__1__Impl : ( 'as' ) ;
    public final void rule__Metamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1085:1: ( ( 'as' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1086:1: ( 'as' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1086:1: ( 'as' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1087:1: 'as'
            {
             before(grammarAccess.getMetamodelAccess().getAsKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Metamodel__Group__1__Impl2239); 
             after(grammarAccess.getMetamodelAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodel__Group__1__Impl"


    // $ANTLR start "rule__Metamodel__Group__2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1100:1: rule__Metamodel__Group__2 : rule__Metamodel__Group__2__Impl ;
    public final void rule__Metamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1104:1: ( rule__Metamodel__Group__2__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1105:2: rule__Metamodel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Metamodel__Group__2__Impl_in_rule__Metamodel__Group__22270);
            rule__Metamodel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodel__Group__2"


    // $ANTLR start "rule__Metamodel__Group__2__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1111:1: rule__Metamodel__Group__2__Impl : ( ( rule__Metamodel__MetamodelNameAssignment_2 ) ) ;
    public final void rule__Metamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1115:1: ( ( ( rule__Metamodel__MetamodelNameAssignment_2 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1116:1: ( ( rule__Metamodel__MetamodelNameAssignment_2 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1116:1: ( ( rule__Metamodel__MetamodelNameAssignment_2 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1117:1: ( rule__Metamodel__MetamodelNameAssignment_2 )
            {
             before(grammarAccess.getMetamodelAccess().getMetamodelNameAssignment_2()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1118:1: ( rule__Metamodel__MetamodelNameAssignment_2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1118:2: rule__Metamodel__MetamodelNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Metamodel__MetamodelNameAssignment_2_in_rule__Metamodel__Group__2__Impl2297);
            rule__Metamodel__MetamodelNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelAccess().getMetamodelNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodel__Group__2__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1134:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1138:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1139:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__02333);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__02336);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1146:1: rule__Expression__Group__0__Impl : ( 'select' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1150:1: ( ( 'select' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1151:1: ( 'select' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1151:1: ( 'select' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1152:1: 'select'
            {
             before(grammarAccess.getExpressionAccess().getSelectKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Expression__Group__0__Impl2364); 
             after(grammarAccess.getExpressionAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1165:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1169:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1170:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__12395);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__12398);
            rule__Expression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1177:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__SelectAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1181:1: ( ( ( rule__Expression__SelectAssignment_1 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1182:1: ( ( rule__Expression__SelectAssignment_1 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1182:1: ( ( rule__Expression__SelectAssignment_1 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1183:1: ( rule__Expression__SelectAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getSelectAssignment_1()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1184:1: ( rule__Expression__SelectAssignment_1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1184:2: rule__Expression__SelectAssignment_1
            {
            pushFollow(FOLLOW_rule__Expression__SelectAssignment_1_in_rule__Expression__Group__1__Impl2425);
            rule__Expression__SelectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getSelectAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1194:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl rule__Expression__Group__3 ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1198:1: ( rule__Expression__Group__2__Impl rule__Expression__Group__3 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1199:2: rule__Expression__Group__2__Impl rule__Expression__Group__3
            {
            pushFollow(FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__22455);
            rule__Expression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__3_in_rule__Expression__Group__22458);
            rule__Expression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2"


    // $ANTLR start "rule__Expression__Group__2__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1206:1: rule__Expression__Group__2__Impl : ( 'from' ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1210:1: ( ( 'from' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1211:1: ( 'from' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1211:1: ( 'from' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1212:1: 'from'
            {
             before(grammarAccess.getExpressionAccess().getFromKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Expression__Group__2__Impl2486); 
             after(grammarAccess.getExpressionAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2__Impl"


    // $ANTLR start "rule__Expression__Group__3"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1225:1: rule__Expression__Group__3 : rule__Expression__Group__3__Impl rule__Expression__Group__4 ;
    public final void rule__Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1229:1: ( rule__Expression__Group__3__Impl rule__Expression__Group__4 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1230:2: rule__Expression__Group__3__Impl rule__Expression__Group__4
            {
            pushFollow(FOLLOW_rule__Expression__Group__3__Impl_in_rule__Expression__Group__32517);
            rule__Expression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__4_in_rule__Expression__Group__32520);
            rule__Expression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__3"


    // $ANTLR start "rule__Expression__Group__3__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1237:1: rule__Expression__Group__3__Impl : ( ( rule__Expression__FromAssignment_3 ) ) ;
    public final void rule__Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1241:1: ( ( ( rule__Expression__FromAssignment_3 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1242:1: ( ( rule__Expression__FromAssignment_3 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1242:1: ( ( rule__Expression__FromAssignment_3 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1243:1: ( rule__Expression__FromAssignment_3 )
            {
             before(grammarAccess.getExpressionAccess().getFromAssignment_3()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1244:1: ( rule__Expression__FromAssignment_3 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1244:2: rule__Expression__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__Expression__FromAssignment_3_in_rule__Expression__Group__3__Impl2547);
            rule__Expression__FromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getFromAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group__4"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1254:1: rule__Expression__Group__4 : rule__Expression__Group__4__Impl rule__Expression__Group__5 ;
    public final void rule__Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1258:1: ( rule__Expression__Group__4__Impl rule__Expression__Group__5 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1259:2: rule__Expression__Group__4__Impl rule__Expression__Group__5
            {
            pushFollow(FOLLOW_rule__Expression__Group__4__Impl_in_rule__Expression__Group__42577);
            rule__Expression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__5_in_rule__Expression__Group__42580);
            rule__Expression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__4"


    // $ANTLR start "rule__Expression__Group__4__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1266:1: rule__Expression__Group__4__Impl : ( 'where' ) ;
    public final void rule__Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1270:1: ( ( 'where' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1271:1: ( 'where' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1271:1: ( 'where' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1272:1: 'where'
            {
             before(grammarAccess.getExpressionAccess().getWhereKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Expression__Group__4__Impl2608); 
             after(grammarAccess.getExpressionAccess().getWhereKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__4__Impl"


    // $ANTLR start "rule__Expression__Group__5"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1285:1: rule__Expression__Group__5 : rule__Expression__Group__5__Impl ;
    public final void rule__Expression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1289:1: ( rule__Expression__Group__5__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1290:2: rule__Expression__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__5__Impl_in_rule__Expression__Group__52639);
            rule__Expression__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__5"


    // $ANTLR start "rule__Expression__Group__5__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1296:1: rule__Expression__Group__5__Impl : ( ( ( rule__Expression__ConditionAssignment_5 ) ) ( ( rule__Expression__ConditionAssignment_5 )* ) ) ;
    public final void rule__Expression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1300:1: ( ( ( ( rule__Expression__ConditionAssignment_5 ) ) ( ( rule__Expression__ConditionAssignment_5 )* ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1301:1: ( ( ( rule__Expression__ConditionAssignment_5 ) ) ( ( rule__Expression__ConditionAssignment_5 )* ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1301:1: ( ( ( rule__Expression__ConditionAssignment_5 ) ) ( ( rule__Expression__ConditionAssignment_5 )* ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1302:1: ( ( rule__Expression__ConditionAssignment_5 ) ) ( ( rule__Expression__ConditionAssignment_5 )* )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1302:1: ( ( rule__Expression__ConditionAssignment_5 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1303:1: ( rule__Expression__ConditionAssignment_5 )
            {
             before(grammarAccess.getExpressionAccess().getConditionAssignment_5()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1304:1: ( rule__Expression__ConditionAssignment_5 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1304:2: rule__Expression__ConditionAssignment_5
            {
            pushFollow(FOLLOW_rule__Expression__ConditionAssignment_5_in_rule__Expression__Group__5__Impl2668);
            rule__Expression__ConditionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getConditionAssignment_5()); 

            }

            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1307:1: ( ( rule__Expression__ConditionAssignment_5 )* )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1308:1: ( rule__Expression__ConditionAssignment_5 )*
            {
             before(grammarAccess.getExpressionAccess().getConditionAssignment_5()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1309:1: ( rule__Expression__ConditionAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1309:2: rule__Expression__ConditionAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Expression__ConditionAssignment_5_in_rule__Expression__Group__5__Impl2680);
            	    rule__Expression__ConditionAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getConditionAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__5__Impl"


    // $ANTLR start "rule__Select__Group_1__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1332:1: rule__Select__Group_1__0 : rule__Select__Group_1__0__Impl rule__Select__Group_1__1 ;
    public final void rule__Select__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1336:1: ( rule__Select__Group_1__0__Impl rule__Select__Group_1__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1337:2: rule__Select__Group_1__0__Impl rule__Select__Group_1__1
            {
            pushFollow(FOLLOW_rule__Select__Group_1__0__Impl_in_rule__Select__Group_1__02725);
            rule__Select__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_1__1_in_rule__Select__Group_1__02728);
            rule__Select__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_1__0"


    // $ANTLR start "rule__Select__Group_1__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1344:1: rule__Select__Group_1__0__Impl : ( ( rule__Select__SelectAttributeAssignment_1_0 ) ) ;
    public final void rule__Select__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1348:1: ( ( ( rule__Select__SelectAttributeAssignment_1_0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1349:1: ( ( rule__Select__SelectAttributeAssignment_1_0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1349:1: ( ( rule__Select__SelectAttributeAssignment_1_0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1350:1: ( rule__Select__SelectAttributeAssignment_1_0 )
            {
             before(grammarAccess.getSelectAccess().getSelectAttributeAssignment_1_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1351:1: ( rule__Select__SelectAttributeAssignment_1_0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1351:2: rule__Select__SelectAttributeAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Select__SelectAttributeAssignment_1_0_in_rule__Select__Group_1__0__Impl2755);
            rule__Select__SelectAttributeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getSelectAttributeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_1__0__Impl"


    // $ANTLR start "rule__Select__Group_1__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1361:1: rule__Select__Group_1__1 : rule__Select__Group_1__1__Impl ;
    public final void rule__Select__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1365:1: ( rule__Select__Group_1__1__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1366:2: rule__Select__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Select__Group_1__1__Impl_in_rule__Select__Group_1__12785);
            rule__Select__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_1__1"


    // $ANTLR start "rule__Select__Group_1__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1372:1: rule__Select__Group_1__1__Impl : ( ( rule__Select__Group_1_1__0 )* ) ;
    public final void rule__Select__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1376:1: ( ( ( rule__Select__Group_1_1__0 )* ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1377:1: ( ( rule__Select__Group_1_1__0 )* )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1377:1: ( ( rule__Select__Group_1_1__0 )* )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1378:1: ( rule__Select__Group_1_1__0 )*
            {
             before(grammarAccess.getSelectAccess().getGroup_1_1()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1379:1: ( rule__Select__Group_1_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1379:2: rule__Select__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Select__Group_1_1__0_in_rule__Select__Group_1__1__Impl2812);
            	    rule__Select__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_1__1__Impl"


    // $ANTLR start "rule__Select__Group_1_1__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1393:1: rule__Select__Group_1_1__0 : rule__Select__Group_1_1__0__Impl rule__Select__Group_1_1__1 ;
    public final void rule__Select__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1397:1: ( rule__Select__Group_1_1__0__Impl rule__Select__Group_1_1__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1398:2: rule__Select__Group_1_1__0__Impl rule__Select__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Select__Group_1_1__0__Impl_in_rule__Select__Group_1_1__02847);
            rule__Select__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_1_1__1_in_rule__Select__Group_1_1__02850);
            rule__Select__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_1_1__0"


    // $ANTLR start "rule__Select__Group_1_1__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1405:1: rule__Select__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1409:1: ( ( ',' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1410:1: ( ',' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1410:1: ( ',' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1411:1: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_1_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Select__Group_1_1__0__Impl2878); 
             after(grammarAccess.getSelectAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_1_1__0__Impl"


    // $ANTLR start "rule__Select__Group_1_1__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1424:1: rule__Select__Group_1_1__1 : rule__Select__Group_1_1__1__Impl ;
    public final void rule__Select__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1428:1: ( rule__Select__Group_1_1__1__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1429:2: rule__Select__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Select__Group_1_1__1__Impl_in_rule__Select__Group_1_1__12909);
            rule__Select__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_1_1__1"


    // $ANTLR start "rule__Select__Group_1_1__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1435:1: rule__Select__Group_1_1__1__Impl : ( ( rule__Select__SelectAttributeAssignment_1_1_1 ) ) ;
    public final void rule__Select__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1439:1: ( ( ( rule__Select__SelectAttributeAssignment_1_1_1 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1440:1: ( ( rule__Select__SelectAttributeAssignment_1_1_1 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1440:1: ( ( rule__Select__SelectAttributeAssignment_1_1_1 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1441:1: ( rule__Select__SelectAttributeAssignment_1_1_1 )
            {
             before(grammarAccess.getSelectAccess().getSelectAttributeAssignment_1_1_1()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1442:1: ( rule__Select__SelectAttributeAssignment_1_1_1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1442:2: rule__Select__SelectAttributeAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Select__SelectAttributeAssignment_1_1_1_in_rule__Select__Group_1_1__1__Impl2936);
            rule__Select__SelectAttributeAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getSelectAttributeAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_1_1__1__Impl"


    // $ANTLR start "rule__SelectAttribute__Group__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1456:1: rule__SelectAttribute__Group__0 : rule__SelectAttribute__Group__0__Impl rule__SelectAttribute__Group__1 ;
    public final void rule__SelectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1460:1: ( rule__SelectAttribute__Group__0__Impl rule__SelectAttribute__Group__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1461:2: rule__SelectAttribute__Group__0__Impl rule__SelectAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__SelectAttribute__Group__0__Impl_in_rule__SelectAttribute__Group__02970);
            rule__SelectAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectAttribute__Group__1_in_rule__SelectAttribute__Group__02973);
            rule__SelectAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__Group__0"


    // $ANTLR start "rule__SelectAttribute__Group__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1468:1: rule__SelectAttribute__Group__0__Impl : ( ( rule__SelectAttribute__MetamodelAssignment_0 ) ) ;
    public final void rule__SelectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1472:1: ( ( ( rule__SelectAttribute__MetamodelAssignment_0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1473:1: ( ( rule__SelectAttribute__MetamodelAssignment_0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1473:1: ( ( rule__SelectAttribute__MetamodelAssignment_0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1474:1: ( rule__SelectAttribute__MetamodelAssignment_0 )
            {
             before(grammarAccess.getSelectAttributeAccess().getMetamodelAssignment_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1475:1: ( rule__SelectAttribute__MetamodelAssignment_0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1475:2: rule__SelectAttribute__MetamodelAssignment_0
            {
            pushFollow(FOLLOW_rule__SelectAttribute__MetamodelAssignment_0_in_rule__SelectAttribute__Group__0__Impl3000);
            rule__SelectAttribute__MetamodelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAttributeAccess().getMetamodelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__Group__0__Impl"


    // $ANTLR start "rule__SelectAttribute__Group__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1485:1: rule__SelectAttribute__Group__1 : rule__SelectAttribute__Group__1__Impl rule__SelectAttribute__Group__2 ;
    public final void rule__SelectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1489:1: ( rule__SelectAttribute__Group__1__Impl rule__SelectAttribute__Group__2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1490:2: rule__SelectAttribute__Group__1__Impl rule__SelectAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__SelectAttribute__Group__1__Impl_in_rule__SelectAttribute__Group__13030);
            rule__SelectAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectAttribute__Group__2_in_rule__SelectAttribute__Group__13033);
            rule__SelectAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__Group__1"


    // $ANTLR start "rule__SelectAttribute__Group__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1497:1: rule__SelectAttribute__Group__1__Impl : ( '.' ) ;
    public final void rule__SelectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1501:1: ( ( '.' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1502:1: ( '.' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1502:1: ( '.' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1503:1: '.'
            {
             before(grammarAccess.getSelectAttributeAccess().getFullStopKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__SelectAttribute__Group__1__Impl3061); 
             after(grammarAccess.getSelectAttributeAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__Group__1__Impl"


    // $ANTLR start "rule__SelectAttribute__Group__2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1516:1: rule__SelectAttribute__Group__2 : rule__SelectAttribute__Group__2__Impl rule__SelectAttribute__Group__3 ;
    public final void rule__SelectAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1520:1: ( rule__SelectAttribute__Group__2__Impl rule__SelectAttribute__Group__3 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1521:2: rule__SelectAttribute__Group__2__Impl rule__SelectAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__SelectAttribute__Group__2__Impl_in_rule__SelectAttribute__Group__23092);
            rule__SelectAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectAttribute__Group__3_in_rule__SelectAttribute__Group__23095);
            rule__SelectAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__Group__2"


    // $ANTLR start "rule__SelectAttribute__Group__2__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1528:1: rule__SelectAttribute__Group__2__Impl : ( ( rule__SelectAttribute__ClassAssignment_2 ) ) ;
    public final void rule__SelectAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1532:1: ( ( ( rule__SelectAttribute__ClassAssignment_2 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1533:1: ( ( rule__SelectAttribute__ClassAssignment_2 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1533:1: ( ( rule__SelectAttribute__ClassAssignment_2 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1534:1: ( rule__SelectAttribute__ClassAssignment_2 )
            {
             before(grammarAccess.getSelectAttributeAccess().getClassAssignment_2()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1535:1: ( rule__SelectAttribute__ClassAssignment_2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1535:2: rule__SelectAttribute__ClassAssignment_2
            {
            pushFollow(FOLLOW_rule__SelectAttribute__ClassAssignment_2_in_rule__SelectAttribute__Group__2__Impl3122);
            rule__SelectAttribute__ClassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectAttributeAccess().getClassAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__Group__2__Impl"


    // $ANTLR start "rule__SelectAttribute__Group__3"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1545:1: rule__SelectAttribute__Group__3 : rule__SelectAttribute__Group__3__Impl rule__SelectAttribute__Group__4 ;
    public final void rule__SelectAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1549:1: ( rule__SelectAttribute__Group__3__Impl rule__SelectAttribute__Group__4 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1550:2: rule__SelectAttribute__Group__3__Impl rule__SelectAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__SelectAttribute__Group__3__Impl_in_rule__SelectAttribute__Group__33152);
            rule__SelectAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectAttribute__Group__4_in_rule__SelectAttribute__Group__33155);
            rule__SelectAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__Group__3"


    // $ANTLR start "rule__SelectAttribute__Group__3__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1557:1: rule__SelectAttribute__Group__3__Impl : ( '.' ) ;
    public final void rule__SelectAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1561:1: ( ( '.' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1562:1: ( '.' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1562:1: ( '.' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1563:1: '.'
            {
             before(grammarAccess.getSelectAttributeAccess().getFullStopKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__SelectAttribute__Group__3__Impl3183); 
             after(grammarAccess.getSelectAttributeAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__Group__3__Impl"


    // $ANTLR start "rule__SelectAttribute__Group__4"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1576:1: rule__SelectAttribute__Group__4 : rule__SelectAttribute__Group__4__Impl ;
    public final void rule__SelectAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1580:1: ( rule__SelectAttribute__Group__4__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1581:2: rule__SelectAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SelectAttribute__Group__4__Impl_in_rule__SelectAttribute__Group__43214);
            rule__SelectAttribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__Group__4"


    // $ANTLR start "rule__SelectAttribute__Group__4__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1587:1: rule__SelectAttribute__Group__4__Impl : ( ( rule__SelectAttribute__AttributeAssignment_4 ) ) ;
    public final void rule__SelectAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1591:1: ( ( ( rule__SelectAttribute__AttributeAssignment_4 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1592:1: ( ( rule__SelectAttribute__AttributeAssignment_4 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1592:1: ( ( rule__SelectAttribute__AttributeAssignment_4 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1593:1: ( rule__SelectAttribute__AttributeAssignment_4 )
            {
             before(grammarAccess.getSelectAttributeAccess().getAttributeAssignment_4()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1594:1: ( rule__SelectAttribute__AttributeAssignment_4 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1594:2: rule__SelectAttribute__AttributeAssignment_4
            {
            pushFollow(FOLLOW_rule__SelectAttribute__AttributeAssignment_4_in_rule__SelectAttribute__Group__4__Impl3241);
            rule__SelectAttribute__AttributeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSelectAttributeAccess().getAttributeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__Group__4__Impl"


    // $ANTLR start "rule__From__Group__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1614:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1618:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1619:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__03281);
            rule__From__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__From__Group__1_in_rule__From__Group__03284);
            rule__From__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0"


    // $ANTLR start "rule__From__Group__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1626:1: rule__From__Group__0__Impl : ( ( rule__From__JoinAssignment_0 ) ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1630:1: ( ( ( rule__From__JoinAssignment_0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1631:1: ( ( rule__From__JoinAssignment_0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1631:1: ( ( rule__From__JoinAssignment_0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1632:1: ( rule__From__JoinAssignment_0 )
            {
             before(grammarAccess.getFromAccess().getJoinAssignment_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1633:1: ( rule__From__JoinAssignment_0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1633:2: rule__From__JoinAssignment_0
            {
            pushFollow(FOLLOW_rule__From__JoinAssignment_0_in_rule__From__Group__0__Impl3311);
            rule__From__JoinAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getJoinAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0__Impl"


    // $ANTLR start "rule__From__Group__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1643:1: rule__From__Group__1 : rule__From__Group__1__Impl ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1647:1: ( rule__From__Group__1__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1648:2: rule__From__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__13341);
            rule__From__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1"


    // $ANTLR start "rule__From__Group__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1654:1: rule__From__Group__1__Impl : ( ( rule__From__Group_1__0 )* ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1658:1: ( ( ( rule__From__Group_1__0 )* ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1659:1: ( ( rule__From__Group_1__0 )* )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1659:1: ( ( rule__From__Group_1__0 )* )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1660:1: ( rule__From__Group_1__0 )*
            {
             before(grammarAccess.getFromAccess().getGroup_1()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1661:1: ( rule__From__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1661:2: rule__From__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__From__Group_1__0_in_rule__From__Group__1__Impl3368);
            	    rule__From__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFromAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1__Impl"


    // $ANTLR start "rule__From__Group_1__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1675:1: rule__From__Group_1__0 : rule__From__Group_1__0__Impl rule__From__Group_1__1 ;
    public final void rule__From__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1679:1: ( rule__From__Group_1__0__Impl rule__From__Group_1__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1680:2: rule__From__Group_1__0__Impl rule__From__Group_1__1
            {
            pushFollow(FOLLOW_rule__From__Group_1__0__Impl_in_rule__From__Group_1__03403);
            rule__From__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__From__Group_1__1_in_rule__From__Group_1__03406);
            rule__From__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1__0"


    // $ANTLR start "rule__From__Group_1__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1687:1: rule__From__Group_1__0__Impl : ( ',' ) ;
    public final void rule__From__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1691:1: ( ( ',' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1692:1: ( ',' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1692:1: ( ',' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1693:1: ','
            {
             before(grammarAccess.getFromAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__From__Group_1__0__Impl3434); 
             after(grammarAccess.getFromAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1__0__Impl"


    // $ANTLR start "rule__From__Group_1__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1706:1: rule__From__Group_1__1 : rule__From__Group_1__1__Impl ;
    public final void rule__From__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1710:1: ( rule__From__Group_1__1__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1711:2: rule__From__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__From__Group_1__1__Impl_in_rule__From__Group_1__13465);
            rule__From__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1__1"


    // $ANTLR start "rule__From__Group_1__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1717:1: rule__From__Group_1__1__Impl : ( ( rule__From__JoinAssignment_1_1 ) ) ;
    public final void rule__From__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1721:1: ( ( ( rule__From__JoinAssignment_1_1 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1722:1: ( ( rule__From__JoinAssignment_1_1 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1722:1: ( ( rule__From__JoinAssignment_1_1 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1723:1: ( rule__From__JoinAssignment_1_1 )
            {
             before(grammarAccess.getFromAccess().getJoinAssignment_1_1()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1724:1: ( rule__From__JoinAssignment_1_1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1724:2: rule__From__JoinAssignment_1_1
            {
            pushFollow(FOLLOW_rule__From__JoinAssignment_1_1_in_rule__From__Group_1__1__Impl3492);
            rule__From__JoinAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getJoinAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_1__1__Impl"


    // $ANTLR start "rule__Join__Group__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1738:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1742:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1743:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_rule__Join__Group__0__Impl_in_rule__Join__Group__03526);
            rule__Join__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Join__Group__1_in_rule__Join__Group__03529);
            rule__Join__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__0"


    // $ANTLR start "rule__Join__Group__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1750:1: rule__Join__Group__0__Impl : ( ( rule__Join__JoinLeftAssignment_0 ) ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1754:1: ( ( ( rule__Join__JoinLeftAssignment_0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1755:1: ( ( rule__Join__JoinLeftAssignment_0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1755:1: ( ( rule__Join__JoinLeftAssignment_0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1756:1: ( rule__Join__JoinLeftAssignment_0 )
            {
             before(grammarAccess.getJoinAccess().getJoinLeftAssignment_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1757:1: ( rule__Join__JoinLeftAssignment_0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1757:2: rule__Join__JoinLeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Join__JoinLeftAssignment_0_in_rule__Join__Group__0__Impl3556);
            rule__Join__JoinLeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getJoinLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__0__Impl"


    // $ANTLR start "rule__Join__Group__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1767:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1771:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1772:2: rule__Join__Group__1__Impl rule__Join__Group__2
            {
            pushFollow(FOLLOW_rule__Join__Group__1__Impl_in_rule__Join__Group__13586);
            rule__Join__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Join__Group__2_in_rule__Join__Group__13589);
            rule__Join__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__1"


    // $ANTLR start "rule__Join__Group__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1779:1: rule__Join__Group__1__Impl : ( 'join' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1783:1: ( ( 'join' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1784:1: ( 'join' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1784:1: ( 'join' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1785:1: 'join'
            {
             before(grammarAccess.getJoinAccess().getJoinKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Join__Group__1__Impl3617); 
             after(grammarAccess.getJoinAccess().getJoinKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__1__Impl"


    // $ANTLR start "rule__Join__Group__2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1798:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1802:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1803:2: rule__Join__Group__2__Impl rule__Join__Group__3
            {
            pushFollow(FOLLOW_rule__Join__Group__2__Impl_in_rule__Join__Group__23648);
            rule__Join__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Join__Group__3_in_rule__Join__Group__23651);
            rule__Join__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__2"


    // $ANTLR start "rule__Join__Group__2__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1810:1: rule__Join__Group__2__Impl : ( ( rule__Join__JoinRightAssignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1814:1: ( ( ( rule__Join__JoinRightAssignment_2 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1815:1: ( ( rule__Join__JoinRightAssignment_2 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1815:1: ( ( rule__Join__JoinRightAssignment_2 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1816:1: ( rule__Join__JoinRightAssignment_2 )
            {
             before(grammarAccess.getJoinAccess().getJoinRightAssignment_2()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1817:1: ( rule__Join__JoinRightAssignment_2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1817:2: rule__Join__JoinRightAssignment_2
            {
            pushFollow(FOLLOW_rule__Join__JoinRightAssignment_2_in_rule__Join__Group__2__Impl3678);
            rule__Join__JoinRightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getJoinRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__2__Impl"


    // $ANTLR start "rule__Join__Group__3"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1827:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1831:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1832:2: rule__Join__Group__3__Impl rule__Join__Group__4
            {
            pushFollow(FOLLOW_rule__Join__Group__3__Impl_in_rule__Join__Group__33708);
            rule__Join__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Join__Group__4_in_rule__Join__Group__33711);
            rule__Join__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__3"


    // $ANTLR start "rule__Join__Group__3__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1839:1: rule__Join__Group__3__Impl : ( 'as' ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1843:1: ( ( 'as' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1844:1: ( 'as' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1844:1: ( 'as' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1845:1: 'as'
            {
             before(grammarAccess.getJoinAccess().getAsKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Join__Group__3__Impl3739); 
             after(grammarAccess.getJoinAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__3__Impl"


    // $ANTLR start "rule__Join__Group__4"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1858:1: rule__Join__Group__4 : rule__Join__Group__4__Impl ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1862:1: ( rule__Join__Group__4__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1863:2: rule__Join__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Join__Group__4__Impl_in_rule__Join__Group__43770);
            rule__Join__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__4"


    // $ANTLR start "rule__Join__Group__4__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1869:1: rule__Join__Group__4__Impl : ( ( rule__Join__RelationAssignment_4 ) ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1873:1: ( ( ( rule__Join__RelationAssignment_4 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1874:1: ( ( rule__Join__RelationAssignment_4 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1874:1: ( ( rule__Join__RelationAssignment_4 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1875:1: ( rule__Join__RelationAssignment_4 )
            {
             before(grammarAccess.getJoinAccess().getRelationAssignment_4()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1876:1: ( rule__Join__RelationAssignment_4 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1876:2: rule__Join__RelationAssignment_4
            {
            pushFollow(FOLLOW_rule__Join__RelationAssignment_4_in_rule__Join__Group__4__Impl3797);
            rule__Join__RelationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getRelationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__4__Impl"


    // $ANTLR start "rule__JoinLeft__Group__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1896:1: rule__JoinLeft__Group__0 : rule__JoinLeft__Group__0__Impl rule__JoinLeft__Group__1 ;
    public final void rule__JoinLeft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1900:1: ( rule__JoinLeft__Group__0__Impl rule__JoinLeft__Group__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1901:2: rule__JoinLeft__Group__0__Impl rule__JoinLeft__Group__1
            {
            pushFollow(FOLLOW_rule__JoinLeft__Group__0__Impl_in_rule__JoinLeft__Group__03837);
            rule__JoinLeft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinLeft__Group__1_in_rule__JoinLeft__Group__03840);
            rule__JoinLeft__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinLeft__Group__0"


    // $ANTLR start "rule__JoinLeft__Group__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1908:1: rule__JoinLeft__Group__0__Impl : ( ( rule__JoinLeft__MetamodelLeftAssignment_0 ) ) ;
    public final void rule__JoinLeft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1912:1: ( ( ( rule__JoinLeft__MetamodelLeftAssignment_0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1913:1: ( ( rule__JoinLeft__MetamodelLeftAssignment_0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1913:1: ( ( rule__JoinLeft__MetamodelLeftAssignment_0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1914:1: ( rule__JoinLeft__MetamodelLeftAssignment_0 )
            {
             before(grammarAccess.getJoinLeftAccess().getMetamodelLeftAssignment_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1915:1: ( rule__JoinLeft__MetamodelLeftAssignment_0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1915:2: rule__JoinLeft__MetamodelLeftAssignment_0
            {
            pushFollow(FOLLOW_rule__JoinLeft__MetamodelLeftAssignment_0_in_rule__JoinLeft__Group__0__Impl3867);
            rule__JoinLeft__MetamodelLeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJoinLeftAccess().getMetamodelLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinLeft__Group__0__Impl"


    // $ANTLR start "rule__JoinLeft__Group__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1925:1: rule__JoinLeft__Group__1 : rule__JoinLeft__Group__1__Impl rule__JoinLeft__Group__2 ;
    public final void rule__JoinLeft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1929:1: ( rule__JoinLeft__Group__1__Impl rule__JoinLeft__Group__2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1930:2: rule__JoinLeft__Group__1__Impl rule__JoinLeft__Group__2
            {
            pushFollow(FOLLOW_rule__JoinLeft__Group__1__Impl_in_rule__JoinLeft__Group__13897);
            rule__JoinLeft__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinLeft__Group__2_in_rule__JoinLeft__Group__13900);
            rule__JoinLeft__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinLeft__Group__1"


    // $ANTLR start "rule__JoinLeft__Group__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1937:1: rule__JoinLeft__Group__1__Impl : ( '.' ) ;
    public final void rule__JoinLeft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1941:1: ( ( '.' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1942:1: ( '.' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1942:1: ( '.' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1943:1: '.'
            {
             before(grammarAccess.getJoinLeftAccess().getFullStopKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__JoinLeft__Group__1__Impl3928); 
             after(grammarAccess.getJoinLeftAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinLeft__Group__1__Impl"


    // $ANTLR start "rule__JoinLeft__Group__2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1956:1: rule__JoinLeft__Group__2 : rule__JoinLeft__Group__2__Impl ;
    public final void rule__JoinLeft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1960:1: ( rule__JoinLeft__Group__2__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1961:2: rule__JoinLeft__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JoinLeft__Group__2__Impl_in_rule__JoinLeft__Group__23959);
            rule__JoinLeft__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinLeft__Group__2"


    // $ANTLR start "rule__JoinLeft__Group__2__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1967:1: rule__JoinLeft__Group__2__Impl : ( ( rule__JoinLeft__ClassLeftAssignment_2 ) ) ;
    public final void rule__JoinLeft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1971:1: ( ( ( rule__JoinLeft__ClassLeftAssignment_2 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1972:1: ( ( rule__JoinLeft__ClassLeftAssignment_2 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1972:1: ( ( rule__JoinLeft__ClassLeftAssignment_2 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1973:1: ( rule__JoinLeft__ClassLeftAssignment_2 )
            {
             before(grammarAccess.getJoinLeftAccess().getClassLeftAssignment_2()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1974:1: ( rule__JoinLeft__ClassLeftAssignment_2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1974:2: rule__JoinLeft__ClassLeftAssignment_2
            {
            pushFollow(FOLLOW_rule__JoinLeft__ClassLeftAssignment_2_in_rule__JoinLeft__Group__2__Impl3986);
            rule__JoinLeft__ClassLeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinLeftAccess().getClassLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinLeft__Group__2__Impl"


    // $ANTLR start "rule__JoinRight__Group__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1990:1: rule__JoinRight__Group__0 : rule__JoinRight__Group__0__Impl rule__JoinRight__Group__1 ;
    public final void rule__JoinRight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1994:1: ( rule__JoinRight__Group__0__Impl rule__JoinRight__Group__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:1995:2: rule__JoinRight__Group__0__Impl rule__JoinRight__Group__1
            {
            pushFollow(FOLLOW_rule__JoinRight__Group__0__Impl_in_rule__JoinRight__Group__04022);
            rule__JoinRight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinRight__Group__1_in_rule__JoinRight__Group__04025);
            rule__JoinRight__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinRight__Group__0"


    // $ANTLR start "rule__JoinRight__Group__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2002:1: rule__JoinRight__Group__0__Impl : ( ( rule__JoinRight__MetamodelRightAssignment_0 ) ) ;
    public final void rule__JoinRight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2006:1: ( ( ( rule__JoinRight__MetamodelRightAssignment_0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2007:1: ( ( rule__JoinRight__MetamodelRightAssignment_0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2007:1: ( ( rule__JoinRight__MetamodelRightAssignment_0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2008:1: ( rule__JoinRight__MetamodelRightAssignment_0 )
            {
             before(grammarAccess.getJoinRightAccess().getMetamodelRightAssignment_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2009:1: ( rule__JoinRight__MetamodelRightAssignment_0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2009:2: rule__JoinRight__MetamodelRightAssignment_0
            {
            pushFollow(FOLLOW_rule__JoinRight__MetamodelRightAssignment_0_in_rule__JoinRight__Group__0__Impl4052);
            rule__JoinRight__MetamodelRightAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJoinRightAccess().getMetamodelRightAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinRight__Group__0__Impl"


    // $ANTLR start "rule__JoinRight__Group__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2019:1: rule__JoinRight__Group__1 : rule__JoinRight__Group__1__Impl rule__JoinRight__Group__2 ;
    public final void rule__JoinRight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2023:1: ( rule__JoinRight__Group__1__Impl rule__JoinRight__Group__2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2024:2: rule__JoinRight__Group__1__Impl rule__JoinRight__Group__2
            {
            pushFollow(FOLLOW_rule__JoinRight__Group__1__Impl_in_rule__JoinRight__Group__14082);
            rule__JoinRight__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinRight__Group__2_in_rule__JoinRight__Group__14085);
            rule__JoinRight__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinRight__Group__1"


    // $ANTLR start "rule__JoinRight__Group__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2031:1: rule__JoinRight__Group__1__Impl : ( '.' ) ;
    public final void rule__JoinRight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2035:1: ( ( '.' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2036:1: ( '.' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2036:1: ( '.' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2037:1: '.'
            {
             before(grammarAccess.getJoinRightAccess().getFullStopKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__JoinRight__Group__1__Impl4113); 
             after(grammarAccess.getJoinRightAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinRight__Group__1__Impl"


    // $ANTLR start "rule__JoinRight__Group__2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2050:1: rule__JoinRight__Group__2 : rule__JoinRight__Group__2__Impl ;
    public final void rule__JoinRight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2054:1: ( rule__JoinRight__Group__2__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2055:2: rule__JoinRight__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JoinRight__Group__2__Impl_in_rule__JoinRight__Group__24144);
            rule__JoinRight__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinRight__Group__2"


    // $ANTLR start "rule__JoinRight__Group__2__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2061:1: rule__JoinRight__Group__2__Impl : ( ( rule__JoinRight__ClassRightAssignment_2 ) ) ;
    public final void rule__JoinRight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2065:1: ( ( ( rule__JoinRight__ClassRightAssignment_2 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2066:1: ( ( rule__JoinRight__ClassRightAssignment_2 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2066:1: ( ( rule__JoinRight__ClassRightAssignment_2 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2067:1: ( rule__JoinRight__ClassRightAssignment_2 )
            {
             before(grammarAccess.getJoinRightAccess().getClassRightAssignment_2()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2068:1: ( rule__JoinRight__ClassRightAssignment_2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2068:2: rule__JoinRight__ClassRightAssignment_2
            {
            pushFollow(FOLLOW_rule__JoinRight__ClassRightAssignment_2_in_rule__JoinRight__Group__2__Impl4171);
            rule__JoinRight__ClassRightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinRightAccess().getClassRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinRight__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2084:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2088:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2089:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__04207);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__04210);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2096:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__Alternatives_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2100:1: ( ( ( rule__Condition__Alternatives_0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2101:1: ( ( rule__Condition__Alternatives_0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2101:1: ( ( rule__Condition__Alternatives_0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2102:1: ( rule__Condition__Alternatives_0 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2103:1: ( rule__Condition__Alternatives_0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2103:2: rule__Condition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Condition__Alternatives_0_in_rule__Condition__Group__0__Impl4237);
            rule__Condition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2113:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2117:1: ( rule__Condition__Group__1__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2118:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__14267);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2124:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Group_1__0 )* ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2128:1: ( ( ( rule__Condition__Group_1__0 )* ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2129:1: ( ( rule__Condition__Group_1__0 )* )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2129:1: ( ( rule__Condition__Group_1__0 )* )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2130:1: ( rule__Condition__Group_1__0 )*
            {
             before(grammarAccess.getConditionAccess().getGroup_1()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2131:1: ( rule__Condition__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2131:2: rule__Condition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Condition__Group_1__0_in_rule__Condition__Group__1__Impl4294);
            	    rule__Condition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group_1__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2145:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2149:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2150:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Condition__Group_1__0__Impl_in_rule__Condition__Group_1__04329);
            rule__Condition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group_1__1_in_rule__Condition__Group_1__04332);
            rule__Condition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0"


    // $ANTLR start "rule__Condition__Group_1__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2157:1: rule__Condition__Group_1__0__Impl : ( ( rule__Condition__Alternatives_1_0 ) ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2161:1: ( ( ( rule__Condition__Alternatives_1_0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2162:1: ( ( rule__Condition__Alternatives_1_0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2162:1: ( ( rule__Condition__Alternatives_1_0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2163:1: ( rule__Condition__Alternatives_1_0 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_1_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2164:1: ( rule__Condition__Alternatives_1_0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2164:2: rule__Condition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Condition__Alternatives_1_0_in_rule__Condition__Group_1__0__Impl4359);
            rule__Condition__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0__Impl"


    // $ANTLR start "rule__Condition__Group_1__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2174:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2178:1: ( rule__Condition__Group_1__1__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2179:2: rule__Condition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group_1__1__Impl_in_rule__Condition__Group_1__14389);
            rule__Condition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1"


    // $ANTLR start "rule__Condition__Group_1__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2185:1: rule__Condition__Group_1__1__Impl : ( ( rule__Condition__Alternatives_1_1 ) ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2189:1: ( ( ( rule__Condition__Alternatives_1_1 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2190:1: ( ( rule__Condition__Alternatives_1_1 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2190:1: ( ( rule__Condition__Alternatives_1_1 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2191:1: ( rule__Condition__Alternatives_1_1 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_1_1()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2192:1: ( rule__Condition__Alternatives_1_1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2192:2: rule__Condition__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Condition__Alternatives_1_1_in_rule__Condition__Group_1__1__Impl4416);
            rule__Condition__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2206:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2210:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2211:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04450);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04453);
            rule__Comparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2218:1: rule__Comparison__Group__0__Impl : ( ( rule__Comparison__LeftAssignment_0 ) ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2222:1: ( ( ( rule__Comparison__LeftAssignment_0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2223:1: ( ( rule__Comparison__LeftAssignment_0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2223:1: ( ( rule__Comparison__LeftAssignment_0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2224:1: ( rule__Comparison__LeftAssignment_0 )
            {
             before(grammarAccess.getComparisonAccess().getLeftAssignment_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2225:1: ( rule__Comparison__LeftAssignment_0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2225:2: rule__Comparison__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Comparison__LeftAssignment_0_in_rule__Comparison__Group__0__Impl4480);
            rule__Comparison__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2235:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2239:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2240:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14510);
            rule__Comparison__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__14513);
            rule__Comparison__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2247:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Alternatives_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2251:1: ( ( ( rule__Comparison__Alternatives_1 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2252:1: ( ( rule__Comparison__Alternatives_1 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2252:1: ( ( rule__Comparison__Alternatives_1 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2253:1: ( rule__Comparison__Alternatives_1 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2254:1: ( rule__Comparison__Alternatives_1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2254:2: rule__Comparison__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Comparison__Alternatives_1_in_rule__Comparison__Group__1__Impl4540);
            rule__Comparison__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2264:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2268:1: ( rule__Comparison__Group__2__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2269:2: rule__Comparison__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__24570);
            rule__Comparison__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__2"


    // $ANTLR start "rule__Comparison__Group__2__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2275:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__RightAssignment_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2279:1: ( ( ( rule__Comparison__RightAssignment_2 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2280:1: ( ( rule__Comparison__RightAssignment_2 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2280:1: ( ( rule__Comparison__RightAssignment_2 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2281:1: ( rule__Comparison__RightAssignment_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_2()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2282:1: ( rule__Comparison__RightAssignment_2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2282:2: rule__Comparison__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_2_in_rule__Comparison__Group__2__Impl4597);
            rule__Comparison__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__2__Impl"


    // $ANTLR start "rule__Left__Group__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2298:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2302:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2303:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FOLLOW_rule__Left__Group__0__Impl_in_rule__Left__Group__04633);
            rule__Left__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Left__Group__1_in_rule__Left__Group__04636);
            rule__Left__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__0"


    // $ANTLR start "rule__Left__Group__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2310:1: rule__Left__Group__0__Impl : ( ( rule__Left__MetamodelAssignment_0 ) ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2314:1: ( ( ( rule__Left__MetamodelAssignment_0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2315:1: ( ( rule__Left__MetamodelAssignment_0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2315:1: ( ( rule__Left__MetamodelAssignment_0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2316:1: ( rule__Left__MetamodelAssignment_0 )
            {
             before(grammarAccess.getLeftAccess().getMetamodelAssignment_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2317:1: ( rule__Left__MetamodelAssignment_0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2317:2: rule__Left__MetamodelAssignment_0
            {
            pushFollow(FOLLOW_rule__Left__MetamodelAssignment_0_in_rule__Left__Group__0__Impl4663);
            rule__Left__MetamodelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getMetamodelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__0__Impl"


    // $ANTLR start "rule__Left__Group__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2327:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2331:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2332:2: rule__Left__Group__1__Impl rule__Left__Group__2
            {
            pushFollow(FOLLOW_rule__Left__Group__1__Impl_in_rule__Left__Group__14693);
            rule__Left__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Left__Group__2_in_rule__Left__Group__14696);
            rule__Left__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__1"


    // $ANTLR start "rule__Left__Group__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2339:1: rule__Left__Group__1__Impl : ( '.' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2343:1: ( ( '.' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2344:1: ( '.' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2344:1: ( '.' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2345:1: '.'
            {
             before(grammarAccess.getLeftAccess().getFullStopKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Left__Group__1__Impl4724); 
             after(grammarAccess.getLeftAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__1__Impl"


    // $ANTLR start "rule__Left__Group__2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2358:1: rule__Left__Group__2 : rule__Left__Group__2__Impl rule__Left__Group__3 ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2362:1: ( rule__Left__Group__2__Impl rule__Left__Group__3 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2363:2: rule__Left__Group__2__Impl rule__Left__Group__3
            {
            pushFollow(FOLLOW_rule__Left__Group__2__Impl_in_rule__Left__Group__24755);
            rule__Left__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Left__Group__3_in_rule__Left__Group__24758);
            rule__Left__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__2"


    // $ANTLR start "rule__Left__Group__2__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2370:1: rule__Left__Group__2__Impl : ( ( rule__Left__ClassAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2374:1: ( ( ( rule__Left__ClassAssignment_2 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2375:1: ( ( rule__Left__ClassAssignment_2 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2375:1: ( ( rule__Left__ClassAssignment_2 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2376:1: ( rule__Left__ClassAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getClassAssignment_2()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2377:1: ( rule__Left__ClassAssignment_2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2377:2: rule__Left__ClassAssignment_2
            {
            pushFollow(FOLLOW_rule__Left__ClassAssignment_2_in_rule__Left__Group__2__Impl4785);
            rule__Left__ClassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getClassAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__2__Impl"


    // $ANTLR start "rule__Left__Group__3"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2387:1: rule__Left__Group__3 : rule__Left__Group__3__Impl rule__Left__Group__4 ;
    public final void rule__Left__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2391:1: ( rule__Left__Group__3__Impl rule__Left__Group__4 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2392:2: rule__Left__Group__3__Impl rule__Left__Group__4
            {
            pushFollow(FOLLOW_rule__Left__Group__3__Impl_in_rule__Left__Group__34815);
            rule__Left__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Left__Group__4_in_rule__Left__Group__34818);
            rule__Left__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__3"


    // $ANTLR start "rule__Left__Group__3__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2399:1: rule__Left__Group__3__Impl : ( '.' ) ;
    public final void rule__Left__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2403:1: ( ( '.' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2404:1: ( '.' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2404:1: ( '.' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2405:1: '.'
            {
             before(grammarAccess.getLeftAccess().getFullStopKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Left__Group__3__Impl4846); 
             after(grammarAccess.getLeftAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__3__Impl"


    // $ANTLR start "rule__Left__Group__4"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2418:1: rule__Left__Group__4 : rule__Left__Group__4__Impl ;
    public final void rule__Left__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2422:1: ( rule__Left__Group__4__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2423:2: rule__Left__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Left__Group__4__Impl_in_rule__Left__Group__44877);
            rule__Left__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__4"


    // $ANTLR start "rule__Left__Group__4__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2429:1: rule__Left__Group__4__Impl : ( ( rule__Left__AttributeWhereLeftAssignment_4 ) ) ;
    public final void rule__Left__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2433:1: ( ( ( rule__Left__AttributeWhereLeftAssignment_4 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2434:1: ( ( rule__Left__AttributeWhereLeftAssignment_4 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2434:1: ( ( rule__Left__AttributeWhereLeftAssignment_4 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2435:1: ( rule__Left__AttributeWhereLeftAssignment_4 )
            {
             before(grammarAccess.getLeftAccess().getAttributeWhereLeftAssignment_4()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2436:1: ( rule__Left__AttributeWhereLeftAssignment_4 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2436:2: rule__Left__AttributeWhereLeftAssignment_4
            {
            pushFollow(FOLLOW_rule__Left__AttributeWhereLeftAssignment_4_in_rule__Left__Group__4__Impl4904);
            rule__Left__AttributeWhereLeftAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getAttributeWhereLeftAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__4__Impl"


    // $ANTLR start "rule__Right__Group_0__0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2456:1: rule__Right__Group_0__0 : rule__Right__Group_0__0__Impl rule__Right__Group_0__1 ;
    public final void rule__Right__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2460:1: ( rule__Right__Group_0__0__Impl rule__Right__Group_0__1 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2461:2: rule__Right__Group_0__0__Impl rule__Right__Group_0__1
            {
            pushFollow(FOLLOW_rule__Right__Group_0__0__Impl_in_rule__Right__Group_0__04944);
            rule__Right__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group_0__1_in_rule__Right__Group_0__04947);
            rule__Right__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group_0__0"


    // $ANTLR start "rule__Right__Group_0__0__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2468:1: rule__Right__Group_0__0__Impl : ( ( rule__Right__MetamodelAssignment_0_0 ) ) ;
    public final void rule__Right__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2472:1: ( ( ( rule__Right__MetamodelAssignment_0_0 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2473:1: ( ( rule__Right__MetamodelAssignment_0_0 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2473:1: ( ( rule__Right__MetamodelAssignment_0_0 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2474:1: ( rule__Right__MetamodelAssignment_0_0 )
            {
             before(grammarAccess.getRightAccess().getMetamodelAssignment_0_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2475:1: ( rule__Right__MetamodelAssignment_0_0 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2475:2: rule__Right__MetamodelAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Right__MetamodelAssignment_0_0_in_rule__Right__Group_0__0__Impl4974);
            rule__Right__MetamodelAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getMetamodelAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group_0__0__Impl"


    // $ANTLR start "rule__Right__Group_0__1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2485:1: rule__Right__Group_0__1 : rule__Right__Group_0__1__Impl rule__Right__Group_0__2 ;
    public final void rule__Right__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2489:1: ( rule__Right__Group_0__1__Impl rule__Right__Group_0__2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2490:2: rule__Right__Group_0__1__Impl rule__Right__Group_0__2
            {
            pushFollow(FOLLOW_rule__Right__Group_0__1__Impl_in_rule__Right__Group_0__15004);
            rule__Right__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group_0__2_in_rule__Right__Group_0__15007);
            rule__Right__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group_0__1"


    // $ANTLR start "rule__Right__Group_0__1__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2497:1: rule__Right__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Right__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2501:1: ( ( '.' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2502:1: ( '.' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2502:1: ( '.' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2503:1: '.'
            {
             before(grammarAccess.getRightAccess().getFullStopKeyword_0_1()); 
            match(input,26,FOLLOW_26_in_rule__Right__Group_0__1__Impl5035); 
             after(grammarAccess.getRightAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group_0__1__Impl"


    // $ANTLR start "rule__Right__Group_0__2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2516:1: rule__Right__Group_0__2 : rule__Right__Group_0__2__Impl rule__Right__Group_0__3 ;
    public final void rule__Right__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2520:1: ( rule__Right__Group_0__2__Impl rule__Right__Group_0__3 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2521:2: rule__Right__Group_0__2__Impl rule__Right__Group_0__3
            {
            pushFollow(FOLLOW_rule__Right__Group_0__2__Impl_in_rule__Right__Group_0__25066);
            rule__Right__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group_0__3_in_rule__Right__Group_0__25069);
            rule__Right__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group_0__2"


    // $ANTLR start "rule__Right__Group_0__2__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2528:1: rule__Right__Group_0__2__Impl : ( ( rule__Right__ClassAssignment_0_2 ) ) ;
    public final void rule__Right__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2532:1: ( ( ( rule__Right__ClassAssignment_0_2 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2533:1: ( ( rule__Right__ClassAssignment_0_2 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2533:1: ( ( rule__Right__ClassAssignment_0_2 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2534:1: ( rule__Right__ClassAssignment_0_2 )
            {
             before(grammarAccess.getRightAccess().getClassAssignment_0_2()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2535:1: ( rule__Right__ClassAssignment_0_2 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2535:2: rule__Right__ClassAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Right__ClassAssignment_0_2_in_rule__Right__Group_0__2__Impl5096);
            rule__Right__ClassAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getClassAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group_0__2__Impl"


    // $ANTLR start "rule__Right__Group_0__3"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2545:1: rule__Right__Group_0__3 : rule__Right__Group_0__3__Impl rule__Right__Group_0__4 ;
    public final void rule__Right__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2549:1: ( rule__Right__Group_0__3__Impl rule__Right__Group_0__4 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2550:2: rule__Right__Group_0__3__Impl rule__Right__Group_0__4
            {
            pushFollow(FOLLOW_rule__Right__Group_0__3__Impl_in_rule__Right__Group_0__35126);
            rule__Right__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group_0__4_in_rule__Right__Group_0__35129);
            rule__Right__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group_0__3"


    // $ANTLR start "rule__Right__Group_0__3__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2557:1: rule__Right__Group_0__3__Impl : ( '.' ) ;
    public final void rule__Right__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2561:1: ( ( '.' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2562:1: ( '.' )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2562:1: ( '.' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2563:1: '.'
            {
             before(grammarAccess.getRightAccess().getFullStopKeyword_0_3()); 
            match(input,26,FOLLOW_26_in_rule__Right__Group_0__3__Impl5157); 
             after(grammarAccess.getRightAccess().getFullStopKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group_0__3__Impl"


    // $ANTLR start "rule__Right__Group_0__4"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2576:1: rule__Right__Group_0__4 : rule__Right__Group_0__4__Impl ;
    public final void rule__Right__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2580:1: ( rule__Right__Group_0__4__Impl )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2581:2: rule__Right__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Right__Group_0__4__Impl_in_rule__Right__Group_0__45188);
            rule__Right__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group_0__4"


    // $ANTLR start "rule__Right__Group_0__4__Impl"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2587:1: rule__Right__Group_0__4__Impl : ( ( rule__Right__AttributeWhereRightAssignment_0_4 ) ) ;
    public final void rule__Right__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2591:1: ( ( ( rule__Right__AttributeWhereRightAssignment_0_4 ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2592:1: ( ( rule__Right__AttributeWhereRightAssignment_0_4 ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2592:1: ( ( rule__Right__AttributeWhereRightAssignment_0_4 ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2593:1: ( rule__Right__AttributeWhereRightAssignment_0_4 )
            {
             before(grammarAccess.getRightAccess().getAttributeWhereRightAssignment_0_4()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2594:1: ( rule__Right__AttributeWhereRightAssignment_0_4 )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2594:2: rule__Right__AttributeWhereRightAssignment_0_4
            {
            pushFollow(FOLLOW_rule__Right__AttributeWhereRightAssignment_0_4_in_rule__Right__Group_0__4__Impl5215);
            rule__Right__AttributeWhereRightAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getAttributeWhereRightAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group_0__4__Impl"


    // $ANTLR start "rule__Model__ViewNameAssignment_1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2615:1: rule__Model__ViewNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__ViewNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2619:1: ( ( RULE_ID ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2620:1: ( RULE_ID )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2620:1: ( RULE_ID )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2621:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getViewNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__ViewNameAssignment_15260); 
             after(grammarAccess.getModelAccess().getViewNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ViewNameAssignment_1"


    // $ANTLR start "rule__Model__MetamodelAssignment_3"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2630:1: rule__Model__MetamodelAssignment_3 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2634:1: ( ( ruleMetamodel ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2635:1: ( ruleMetamodel )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2635:1: ( ruleMetamodel )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2636:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_35291);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MetamodelAssignment_3"


    // $ANTLR start "rule__Model__MetamodelAssignment_4_1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2645:1: rule__Model__MetamodelAssignment_4_1 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2649:1: ( ( ruleMetamodel ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2650:1: ( ruleMetamodel )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2650:1: ( ruleMetamodel )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2651:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_4_15322);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MetamodelAssignment_4_1"


    // $ANTLR start "rule__Model__ExpressionAssignment_5"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2660:1: rule__Model__ExpressionAssignment_5 : ( ruleExpression ) ;
    public final void rule__Model__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2664:1: ( ( ruleExpression ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2665:1: ( ruleExpression )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2665:1: ( ruleExpression )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2666:1: ruleExpression
            {
             before(grammarAccess.getModelAccess().getExpressionExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Model__ExpressionAssignment_55353);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExpressionExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExpressionAssignment_5"


    // $ANTLR start "rule__Metamodel__MetamodelURLAssignment_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2675:1: rule__Metamodel__MetamodelURLAssignment_0 : ( ruleEString ) ;
    public final void rule__Metamodel__MetamodelURLAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2679:1: ( ( ruleEString ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2680:1: ( ruleEString )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2680:1: ( ruleEString )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2681:1: ruleEString
            {
             before(grammarAccess.getMetamodelAccess().getMetamodelURLEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Metamodel__MetamodelURLAssignment_05384);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMetamodelAccess().getMetamodelURLEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodel__MetamodelURLAssignment_0"


    // $ANTLR start "rule__Metamodel__MetamodelNameAssignment_2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2690:1: rule__Metamodel__MetamodelNameAssignment_2 : ( ruleMetamodelName ) ;
    public final void rule__Metamodel__MetamodelNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2694:1: ( ( ruleMetamodelName ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2695:1: ( ruleMetamodelName )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2695:1: ( ruleMetamodelName )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2696:1: ruleMetamodelName
            {
             before(grammarAccess.getMetamodelAccess().getMetamodelNameMetamodelNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMetamodelName_in_rule__Metamodel__MetamodelNameAssignment_25415);
            ruleMetamodelName();

            state._fsp--;

             after(grammarAccess.getMetamodelAccess().getMetamodelNameMetamodelNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodel__MetamodelNameAssignment_2"


    // $ANTLR start "rule__Expression__SelectAssignment_1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2705:1: rule__Expression__SelectAssignment_1 : ( ruleSelect ) ;
    public final void rule__Expression__SelectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2709:1: ( ( ruleSelect ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2710:1: ( ruleSelect )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2710:1: ( ruleSelect )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2711:1: ruleSelect
            {
             before(grammarAccess.getExpressionAccess().getSelectSelectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSelect_in_rule__Expression__SelectAssignment_15446);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSelectSelectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__SelectAssignment_1"


    // $ANTLR start "rule__Expression__FromAssignment_3"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2720:1: rule__Expression__FromAssignment_3 : ( ruleFrom ) ;
    public final void rule__Expression__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2724:1: ( ( ruleFrom ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2725:1: ( ruleFrom )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2725:1: ( ruleFrom )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2726:1: ruleFrom
            {
             before(grammarAccess.getExpressionAccess().getFromFromParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFrom_in_rule__Expression__FromAssignment_35477);
            ruleFrom();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getFromFromParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__FromAssignment_3"


    // $ANTLR start "rule__Expression__ConditionAssignment_5"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2735:1: rule__Expression__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Expression__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2739:1: ( ( ruleCondition ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2740:1: ( ruleCondition )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2740:1: ( ruleCondition )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2741:1: ruleCondition
            {
             before(grammarAccess.getExpressionAccess().getConditionConditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Expression__ConditionAssignment_55508);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getConditionConditionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ConditionAssignment_5"


    // $ANTLR start "rule__Select__SelectAssignment_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2750:1: rule__Select__SelectAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Select__SelectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2754:1: ( ( ( '*' ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2755:1: ( ( '*' ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2755:1: ( ( '*' ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2756:1: ( '*' )
            {
             before(grammarAccess.getSelectAccess().getSelectAsteriskKeyword_0_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2757:1: ( '*' )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2758:1: '*'
            {
             before(grammarAccess.getSelectAccess().getSelectAsteriskKeyword_0_0()); 
            match(input,28,FOLLOW_28_in_rule__Select__SelectAssignment_05544); 
             after(grammarAccess.getSelectAccess().getSelectAsteriskKeyword_0_0()); 

            }

             after(grammarAccess.getSelectAccess().getSelectAsteriskKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__SelectAssignment_0"


    // $ANTLR start "rule__Select__SelectAttributeAssignment_1_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2773:1: rule__Select__SelectAttributeAssignment_1_0 : ( ruleSelectAttribute ) ;
    public final void rule__Select__SelectAttributeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2777:1: ( ( ruleSelectAttribute ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2778:1: ( ruleSelectAttribute )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2778:1: ( ruleSelectAttribute )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2779:1: ruleSelectAttribute
            {
             before(grammarAccess.getSelectAccess().getSelectAttributeSelectAttributeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSelectAttribute_in_rule__Select__SelectAttributeAssignment_1_05583);
            ruleSelectAttribute();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getSelectAttributeSelectAttributeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__SelectAttributeAssignment_1_0"


    // $ANTLR start "rule__Select__SelectAttributeAssignment_1_1_1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2788:1: rule__Select__SelectAttributeAssignment_1_1_1 : ( ruleSelectAttribute ) ;
    public final void rule__Select__SelectAttributeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2792:1: ( ( ruleSelectAttribute ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2793:1: ( ruleSelectAttribute )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2793:1: ( ruleSelectAttribute )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2794:1: ruleSelectAttribute
            {
             before(grammarAccess.getSelectAccess().getSelectAttributeSelectAttributeParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSelectAttribute_in_rule__Select__SelectAttributeAssignment_1_1_15614);
            ruleSelectAttribute();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getSelectAttributeSelectAttributeParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__SelectAttributeAssignment_1_1_1"


    // $ANTLR start "rule__SelectAttribute__MetamodelAssignment_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2803:1: rule__SelectAttribute__MetamodelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SelectAttribute__MetamodelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2807:1: ( ( ( RULE_ID ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2808:1: ( ( RULE_ID ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2808:1: ( ( RULE_ID ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2809:1: ( RULE_ID )
            {
             before(grammarAccess.getSelectAttributeAccess().getMetamodelMetamodelNameCrossReference_0_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2810:1: ( RULE_ID )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2811:1: RULE_ID
            {
             before(grammarAccess.getSelectAttributeAccess().getMetamodelMetamodelNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SelectAttribute__MetamodelAssignment_05649); 
             after(grammarAccess.getSelectAttributeAccess().getMetamodelMetamodelNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSelectAttributeAccess().getMetamodelMetamodelNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__MetamodelAssignment_0"


    // $ANTLR start "rule__SelectAttribute__ClassAssignment_2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2822:1: rule__SelectAttribute__ClassAssignment_2 : ( ruleClass ) ;
    public final void rule__SelectAttribute__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2826:1: ( ( ruleClass ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2827:1: ( ruleClass )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2827:1: ( ruleClass )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2828:1: ruleClass
            {
             before(grammarAccess.getSelectAttributeAccess().getClassClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__SelectAttribute__ClassAssignment_25684);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getSelectAttributeAccess().getClassClassParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__ClassAssignment_2"


    // $ANTLR start "rule__SelectAttribute__AttributeAssignment_4"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2837:1: rule__SelectAttribute__AttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__SelectAttribute__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2841:1: ( ( ruleAttribute ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2842:1: ( ruleAttribute )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2842:1: ( ruleAttribute )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2843:1: ruleAttribute
            {
             before(grammarAccess.getSelectAttributeAccess().getAttributeAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__SelectAttribute__AttributeAssignment_45715);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSelectAttributeAccess().getAttributeAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAttribute__AttributeAssignment_4"


    // $ANTLR start "rule__From__JoinAssignment_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2852:1: rule__From__JoinAssignment_0 : ( ruleJoin ) ;
    public final void rule__From__JoinAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2856:1: ( ( ruleJoin ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2857:1: ( ruleJoin )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2857:1: ( ruleJoin )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2858:1: ruleJoin
            {
             before(grammarAccess.getFromAccess().getJoinJoinParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJoin_in_rule__From__JoinAssignment_05746);
            ruleJoin();

            state._fsp--;

             after(grammarAccess.getFromAccess().getJoinJoinParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__JoinAssignment_0"


    // $ANTLR start "rule__From__JoinAssignment_1_1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2867:1: rule__From__JoinAssignment_1_1 : ( ruleJoin ) ;
    public final void rule__From__JoinAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2871:1: ( ( ruleJoin ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2872:1: ( ruleJoin )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2872:1: ( ruleJoin )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2873:1: ruleJoin
            {
             before(grammarAccess.getFromAccess().getJoinJoinParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleJoin_in_rule__From__JoinAssignment_1_15777);
            ruleJoin();

            state._fsp--;

             after(grammarAccess.getFromAccess().getJoinJoinParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__JoinAssignment_1_1"


    // $ANTLR start "rule__Join__JoinLeftAssignment_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2882:1: rule__Join__JoinLeftAssignment_0 : ( ruleJoinLeft ) ;
    public final void rule__Join__JoinLeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2886:1: ( ( ruleJoinLeft ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2887:1: ( ruleJoinLeft )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2887:1: ( ruleJoinLeft )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2888:1: ruleJoinLeft
            {
             before(grammarAccess.getJoinAccess().getJoinLeftJoinLeftParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJoinLeft_in_rule__Join__JoinLeftAssignment_05808);
            ruleJoinLeft();

            state._fsp--;

             after(grammarAccess.getJoinAccess().getJoinLeftJoinLeftParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__JoinLeftAssignment_0"


    // $ANTLR start "rule__Join__JoinRightAssignment_2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2897:1: rule__Join__JoinRightAssignment_2 : ( ruleJoinRight ) ;
    public final void rule__Join__JoinRightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2901:1: ( ( ruleJoinRight ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2902:1: ( ruleJoinRight )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2902:1: ( ruleJoinRight )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2903:1: ruleJoinRight
            {
             before(grammarAccess.getJoinAccess().getJoinRightJoinRightParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJoinRight_in_rule__Join__JoinRightAssignment_25839);
            ruleJoinRight();

            state._fsp--;

             after(grammarAccess.getJoinAccess().getJoinRightJoinRightParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__JoinRightAssignment_2"


    // $ANTLR start "rule__Join__RelationAssignment_4"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2912:1: rule__Join__RelationAssignment_4 : ( ruleRelation ) ;
    public final void rule__Join__RelationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2916:1: ( ( ruleRelation ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2917:1: ( ruleRelation )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2917:1: ( ruleRelation )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2918:1: ruleRelation
            {
             before(grammarAccess.getJoinAccess().getRelationRelationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRelation_in_rule__Join__RelationAssignment_45870);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getJoinAccess().getRelationRelationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__RelationAssignment_4"


    // $ANTLR start "rule__JoinLeft__MetamodelLeftAssignment_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2927:1: rule__JoinLeft__MetamodelLeftAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__JoinLeft__MetamodelLeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2931:1: ( ( ( RULE_ID ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2932:1: ( ( RULE_ID ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2932:1: ( ( RULE_ID ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2933:1: ( RULE_ID )
            {
             before(grammarAccess.getJoinLeftAccess().getMetamodelLeftMetamodelNameCrossReference_0_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2934:1: ( RULE_ID )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2935:1: RULE_ID
            {
             before(grammarAccess.getJoinLeftAccess().getMetamodelLeftMetamodelNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JoinLeft__MetamodelLeftAssignment_05905); 
             after(grammarAccess.getJoinLeftAccess().getMetamodelLeftMetamodelNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getJoinLeftAccess().getMetamodelLeftMetamodelNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinLeft__MetamodelLeftAssignment_0"


    // $ANTLR start "rule__JoinLeft__ClassLeftAssignment_2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2946:1: rule__JoinLeft__ClassLeftAssignment_2 : ( ruleClass ) ;
    public final void rule__JoinLeft__ClassLeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2950:1: ( ( ruleClass ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2951:1: ( ruleClass )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2951:1: ( ruleClass )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2952:1: ruleClass
            {
             before(grammarAccess.getJoinLeftAccess().getClassLeftClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__JoinLeft__ClassLeftAssignment_25940);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getJoinLeftAccess().getClassLeftClassParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinLeft__ClassLeftAssignment_2"


    // $ANTLR start "rule__JoinRight__MetamodelRightAssignment_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2961:1: rule__JoinRight__MetamodelRightAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__JoinRight__MetamodelRightAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2965:1: ( ( ( RULE_ID ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2966:1: ( ( RULE_ID ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2966:1: ( ( RULE_ID ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2967:1: ( RULE_ID )
            {
             before(grammarAccess.getJoinRightAccess().getMetamodelRightMetamodelNameCrossReference_0_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2968:1: ( RULE_ID )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2969:1: RULE_ID
            {
             before(grammarAccess.getJoinRightAccess().getMetamodelRightMetamodelNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JoinRight__MetamodelRightAssignment_05975); 
             after(grammarAccess.getJoinRightAccess().getMetamodelRightMetamodelNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getJoinRightAccess().getMetamodelRightMetamodelNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinRight__MetamodelRightAssignment_0"


    // $ANTLR start "rule__JoinRight__ClassRightAssignment_2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2980:1: rule__JoinRight__ClassRightAssignment_2 : ( ruleClass ) ;
    public final void rule__JoinRight__ClassRightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2984:1: ( ( ruleClass ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2985:1: ( ruleClass )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2985:1: ( ruleClass )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2986:1: ruleClass
            {
             before(grammarAccess.getJoinRightAccess().getClassRightClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__JoinRight__ClassRightAssignment_26010);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getJoinRightAccess().getClassRightClassParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinRight__ClassRightAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2995:1: rule__Attribute__NameAssignment : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:2999:1: ( ( RULE_ID ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3000:1: ( RULE_ID )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3000:1: ( RULE_ID )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3001:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment6041); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment"


    // $ANTLR start "rule__Class__NameAssignment"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3010:1: rule__Class__NameAssignment : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3014:1: ( ( RULE_ID ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3015:1: ( RULE_ID )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3015:1: ( RULE_ID )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3016:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment6072); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment"


    // $ANTLR start "rule__MetamodelName__NameAssignment"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3025:1: rule__MetamodelName__NameAssignment : ( RULE_ID ) ;
    public final void rule__MetamodelName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3029:1: ( ( RULE_ID ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3030:1: ( RULE_ID )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3030:1: ( RULE_ID )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3031:1: RULE_ID
            {
             before(grammarAccess.getMetamodelNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MetamodelName__NameAssignment6103); 
             after(grammarAccess.getMetamodelNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelName__NameAssignment"


    // $ANTLR start "rule__Relation__NameAssignment"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3040:1: rule__Relation__NameAssignment : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3044:1: ( ( RULE_ID ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3045:1: ( RULE_ID )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3045:1: ( RULE_ID )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3046:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__NameAssignment6134); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment"


    // $ANTLR start "rule__Condition__ValueAssignment_0_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3055:1: rule__Condition__ValueAssignment_0_0 : ( ruleComparison ) ;
    public final void rule__Condition__ValueAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3059:1: ( ( ruleComparison ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3060:1: ( ruleComparison )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3060:1: ( ruleComparison )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3061:1: ruleComparison
            {
             before(grammarAccess.getConditionAccess().getValueComparisonParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Condition__ValueAssignment_0_06165);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getValueComparisonParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ValueAssignment_0_0"


    // $ANTLR start "rule__Condition__ValueAssignment_0_1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3070:1: rule__Condition__ValueAssignment_0_1 : ( ruleEclExpression ) ;
    public final void rule__Condition__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3074:1: ( ( ruleEclExpression ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3075:1: ( ruleEclExpression )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3075:1: ( ruleEclExpression )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3076:1: ruleEclExpression
            {
             before(grammarAccess.getConditionAccess().getValueEclExpressionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleEclExpression_in_rule__Condition__ValueAssignment_0_16196);
            ruleEclExpression();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getValueEclExpressionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ValueAssignment_0_1"


    // $ANTLR start "rule__Condition__ValueAssignment_1_1_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3085:1: rule__Condition__ValueAssignment_1_1_0 : ( ruleComparison ) ;
    public final void rule__Condition__ValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3089:1: ( ( ruleComparison ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3090:1: ( ruleComparison )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3090:1: ( ruleComparison )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3091:1: ruleComparison
            {
             before(grammarAccess.getConditionAccess().getValueComparisonParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Condition__ValueAssignment_1_1_06227);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getValueComparisonParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ValueAssignment_1_1_0"


    // $ANTLR start "rule__Condition__ValueAssignment_1_1_1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3100:1: rule__Condition__ValueAssignment_1_1_1 : ( ruleEclExpression ) ;
    public final void rule__Condition__ValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3104:1: ( ( ruleEclExpression ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3105:1: ( ruleEclExpression )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3105:1: ( ruleEclExpression )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3106:1: ruleEclExpression
            {
             before(grammarAccess.getConditionAccess().getValueEclExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleEclExpression_in_rule__Condition__ValueAssignment_1_1_16258);
            ruleEclExpression();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getValueEclExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ValueAssignment_1_1_1"


    // $ANTLR start "rule__EclExpression__ValueAssignment"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3115:1: rule__EclExpression__ValueAssignment : ( ruleEString ) ;
    public final void rule__EclExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3119:1: ( ( ruleEString ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3120:1: ( ruleEString )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3120:1: ( ruleEString )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3121:1: ruleEString
            {
             before(grammarAccess.getEclExpressionAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__EclExpression__ValueAssignment6289);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEclExpressionAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclExpression__ValueAssignment"


    // $ANTLR start "rule__Comparison__LeftAssignment_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3130:1: rule__Comparison__LeftAssignment_0 : ( ruleLeft ) ;
    public final void rule__Comparison__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3134:1: ( ( ruleLeft ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3135:1: ( ruleLeft )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3135:1: ( ruleLeft )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3136:1: ruleLeft
            {
             before(grammarAccess.getComparisonAccess().getLeftLeftParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLeft_in_rule__Comparison__LeftAssignment_06320);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getLeftLeftParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__LeftAssignment_0"


    // $ANTLR start "rule__Comparison__RightAssignment_2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3145:1: rule__Comparison__RightAssignment_2 : ( ruleRight ) ;
    public final void rule__Comparison__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3149:1: ( ( ruleRight ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3150:1: ( ruleRight )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3150:1: ( ruleRight )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3151:1: ruleRight
            {
             before(grammarAccess.getComparisonAccess().getRightRightParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRight_in_rule__Comparison__RightAssignment_26351);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightRightParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_2"


    // $ANTLR start "rule__Left__MetamodelAssignment_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3160:1: rule__Left__MetamodelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Left__MetamodelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3164:1: ( ( ( RULE_ID ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3165:1: ( ( RULE_ID ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3165:1: ( ( RULE_ID ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3166:1: ( RULE_ID )
            {
             before(grammarAccess.getLeftAccess().getMetamodelMetamodelNameCrossReference_0_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3167:1: ( RULE_ID )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3168:1: RULE_ID
            {
             before(grammarAccess.getLeftAccess().getMetamodelMetamodelNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Left__MetamodelAssignment_06386); 
             after(grammarAccess.getLeftAccess().getMetamodelMetamodelNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLeftAccess().getMetamodelMetamodelNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__MetamodelAssignment_0"


    // $ANTLR start "rule__Left__ClassAssignment_2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3179:1: rule__Left__ClassAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Left__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3183:1: ( ( ( RULE_ID ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3184:1: ( ( RULE_ID ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3184:1: ( ( RULE_ID ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3185:1: ( RULE_ID )
            {
             before(grammarAccess.getLeftAccess().getClassClassCrossReference_2_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3186:1: ( RULE_ID )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3187:1: RULE_ID
            {
             before(grammarAccess.getLeftAccess().getClassClassIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Left__ClassAssignment_26425); 
             after(grammarAccess.getLeftAccess().getClassClassIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLeftAccess().getClassClassCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__ClassAssignment_2"


    // $ANTLR start "rule__Left__AttributeWhereLeftAssignment_4"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3198:1: rule__Left__AttributeWhereLeftAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Left__AttributeWhereLeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3202:1: ( ( ruleAttribute ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3203:1: ( ruleAttribute )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3203:1: ( ruleAttribute )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3204:1: ruleAttribute
            {
             before(grammarAccess.getLeftAccess().getAttributeWhereLeftAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Left__AttributeWhereLeftAssignment_46460);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getLeftAccess().getAttributeWhereLeftAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__AttributeWhereLeftAssignment_4"


    // $ANTLR start "rule__Right__MetamodelAssignment_0_0"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3213:1: rule__Right__MetamodelAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Right__MetamodelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3217:1: ( ( ( RULE_ID ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3218:1: ( ( RULE_ID ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3218:1: ( ( RULE_ID ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3219:1: ( RULE_ID )
            {
             before(grammarAccess.getRightAccess().getMetamodelMetamodelNameCrossReference_0_0_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3220:1: ( RULE_ID )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3221:1: RULE_ID
            {
             before(grammarAccess.getRightAccess().getMetamodelMetamodelNameIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Right__MetamodelAssignment_0_06495); 
             after(grammarAccess.getRightAccess().getMetamodelMetamodelNameIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getRightAccess().getMetamodelMetamodelNameCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__MetamodelAssignment_0_0"


    // $ANTLR start "rule__Right__ClassAssignment_0_2"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3232:1: rule__Right__ClassAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Right__ClassAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3236:1: ( ( ( RULE_ID ) ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3237:1: ( ( RULE_ID ) )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3237:1: ( ( RULE_ID ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3238:1: ( RULE_ID )
            {
             before(grammarAccess.getRightAccess().getClassClassCrossReference_0_2_0()); 
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3239:1: ( RULE_ID )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3240:1: RULE_ID
            {
             before(grammarAccess.getRightAccess().getClassClassIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Right__ClassAssignment_0_26534); 
             after(grammarAccess.getRightAccess().getClassClassIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getRightAccess().getClassClassCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__ClassAssignment_0_2"


    // $ANTLR start "rule__Right__AttributeWhereRightAssignment_0_4"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3251:1: rule__Right__AttributeWhereRightAssignment_0_4 : ( ruleAttribute ) ;
    public final void rule__Right__AttributeWhereRightAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3255:1: ( ( ruleAttribute ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3256:1: ( ruleAttribute )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3256:1: ( ruleAttribute )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3257:1: ruleAttribute
            {
             before(grammarAccess.getRightAccess().getAttributeWhereRightAttributeParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Right__AttributeWhereRightAssignment_0_46569);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRightAccess().getAttributeWhereRightAttributeParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__AttributeWhereRightAssignment_0_4"


    // $ANTLR start "rule__Right__ValueAssignment_1"
    // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3266:1: rule__Right__ValueAssignment_1 : ( ruleEString ) ;
    public final void rule__Right__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3270:1: ( ( ruleEString ) )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3271:1: ( ruleEString )
            {
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3271:1: ( ruleEString )
            // ../vpdl.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalVpdl.g:3272:1: ruleEString
            {
             before(grammarAccess.getRightAccess().getValueEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Right__ValueAssignment_16600);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRightAccess().getValueEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_entryRuleMetamodel121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodel128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__Group__0_in_ruleMetamodel154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Alternatives_in_ruleSelect274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAttribute_in_entryRuleSelectAttribute301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAttribute308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAttribute__Group__0_in_ruleSelectAttribute334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_entryRuleFrom361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrom368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0_in_ruleFrom394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__0_in_ruleJoin454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinLeft_in_entryRuleJoinLeft481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinLeft488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinLeft__Group__0_in_ruleJoinLeft514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinRight_in_entryRuleJoinRight541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinRight548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinRight__Group__0_in_ruleJoinRight574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_in_ruleAttribute634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_in_ruleClass694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelName_in_entryRuleMetamodelName721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelName728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelName__NameAssignment_in_ruleMetamodelName754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__NameAssignment_in_ruleRelation814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEclExpression_in_entryRuleEclExpression901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEclExpression908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EclExpression__ValueAssignment_in_ruleEclExpression934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_entryRuleLeft1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeft1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__0_in_ruleLeft1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRight_in_entryRuleRight1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRight1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Alternatives_in_ruleRight1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__SelectAssignment_0_in_rule__Select__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1__0_in_rule__Select__Alternatives1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ValueAssignment_0_0_in_rule__Condition__Alternatives_01261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ValueAssignment_0_1_in_rule__Condition__Alternatives_01279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Condition__Alternatives_1_01313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Condition__Alternatives_1_01333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ValueAssignment_1_1_0_in_rule__Condition__Alternatives_1_11367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ValueAssignment_1_1_1_in_rule__Condition__Alternatives_1_11385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Comparison__Alternatives_11419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Comparison__Alternatives_11439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Comparison__Alternatives_11459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Comparison__Alternatives_11479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Comparison__Alternatives_11499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Comparison__Alternatives_11519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group_0__0_in_rule__Right__Alternatives1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__ValueAssignment_1_in_rule__Right__Alternatives1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01651 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__0__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11713 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ViewNameAssignment_1_in_rule__Model__Group__1__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21773 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__2__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31835 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41895 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl1925 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExpressionAssignment_5_in_rule__Model__Group__5__Impl1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__02025 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__02028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group_4__0__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__12087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_4_1_in_rule__Model__Group_4__1__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__Group__0__Impl_in_rule__Metamodel__Group__02148 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Metamodel__Group__1_in_rule__Metamodel__Group__02151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__MetamodelURLAssignment_0_in_rule__Metamodel__Group__0__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__Group__1__Impl_in_rule__Metamodel__Group__12208 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Metamodel__Group__2_in_rule__Metamodel__Group__12211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Metamodel__Group__1__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__Group__2__Impl_in_rule__Metamodel__Group__22270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__MetamodelNameAssignment_2_in_rule__Metamodel__Group__2__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__02333 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__02336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Expression__Group__0__Impl2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__12395 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__12398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__SelectAssignment_1_in_rule__Expression__Group__1__Impl2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__22455 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Expression__Group__3_in_rule__Expression__Group__22458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Expression__Group__2__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__3__Impl_in_rule__Expression__Group__32517 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Expression__Group__4_in_rule__Expression__Group__32520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__FromAssignment_3_in_rule__Expression__Group__3__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__4__Impl_in_rule__Expression__Group__42577 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Expression__Group__5_in_rule__Expression__Group__42580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Expression__Group__4__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__5__Impl_in_rule__Expression__Group__52639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ConditionAssignment_5_in_rule__Expression__Group__5__Impl2668 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Expression__ConditionAssignment_5_in_rule__Expression__Group__5__Impl2680 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Select__Group_1__0__Impl_in_rule__Select__Group_1__02725 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Select__Group_1__1_in_rule__Select__Group_1__02728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__SelectAttributeAssignment_1_0_in_rule__Select__Group_1__0__Impl2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1__1__Impl_in_rule__Select__Group_1__12785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1_1__0_in_rule__Select__Group_1__1__Impl2812 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Select__Group_1_1__0__Impl_in_rule__Select__Group_1_1__02847 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__Select__Group_1_1__1_in_rule__Select__Group_1_1__02850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Select__Group_1_1__0__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1_1__1__Impl_in_rule__Select__Group_1_1__12909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__SelectAttributeAssignment_1_1_1_in_rule__Select__Group_1_1__1__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAttribute__Group__0__Impl_in_rule__SelectAttribute__Group__02970 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SelectAttribute__Group__1_in_rule__SelectAttribute__Group__02973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAttribute__MetamodelAssignment_0_in_rule__SelectAttribute__Group__0__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAttribute__Group__1__Impl_in_rule__SelectAttribute__Group__13030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SelectAttribute__Group__2_in_rule__SelectAttribute__Group__13033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SelectAttribute__Group__1__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAttribute__Group__2__Impl_in_rule__SelectAttribute__Group__23092 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SelectAttribute__Group__3_in_rule__SelectAttribute__Group__23095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAttribute__ClassAssignment_2_in_rule__SelectAttribute__Group__2__Impl3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAttribute__Group__3__Impl_in_rule__SelectAttribute__Group__33152 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SelectAttribute__Group__4_in_rule__SelectAttribute__Group__33155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SelectAttribute__Group__3__Impl3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAttribute__Group__4__Impl_in_rule__SelectAttribute__Group__43214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectAttribute__AttributeAssignment_4_in_rule__SelectAttribute__Group__4__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__03281 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__From__Group__1_in_rule__From__Group__03284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__JoinAssignment_0_in_rule__From__Group__0__Impl3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__13341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group_1__0_in_rule__From__Group__1__Impl3368 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__From__Group_1__0__Impl_in_rule__From__Group_1__03403 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__From__Group_1__1_in_rule__From__Group_1__03406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__From__Group_1__0__Impl3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group_1__1__Impl_in_rule__From__Group_1__13465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__JoinAssignment_1_1_in_rule__From__Group_1__1__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__0__Impl_in_rule__Join__Group__03526 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Join__Group__1_in_rule__Join__Group__03529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__JoinLeftAssignment_0_in_rule__Join__Group__0__Impl3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__1__Impl_in_rule__Join__Group__13586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Join__Group__2_in_rule__Join__Group__13589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Join__Group__1__Impl3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__2__Impl_in_rule__Join__Group__23648 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Join__Group__3_in_rule__Join__Group__23651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__JoinRightAssignment_2_in_rule__Join__Group__2__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__3__Impl_in_rule__Join__Group__33708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Join__Group__4_in_rule__Join__Group__33711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Join__Group__3__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__4__Impl_in_rule__Join__Group__43770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__RelationAssignment_4_in_rule__Join__Group__4__Impl3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinLeft__Group__0__Impl_in_rule__JoinLeft__Group__03837 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__JoinLeft__Group__1_in_rule__JoinLeft__Group__03840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinLeft__MetamodelLeftAssignment_0_in_rule__JoinLeft__Group__0__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinLeft__Group__1__Impl_in_rule__JoinLeft__Group__13897 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__JoinLeft__Group__2_in_rule__JoinLeft__Group__13900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__JoinLeft__Group__1__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinLeft__Group__2__Impl_in_rule__JoinLeft__Group__23959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinLeft__ClassLeftAssignment_2_in_rule__JoinLeft__Group__2__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinRight__Group__0__Impl_in_rule__JoinRight__Group__04022 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__JoinRight__Group__1_in_rule__JoinRight__Group__04025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinRight__MetamodelRightAssignment_0_in_rule__JoinRight__Group__0__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinRight__Group__1__Impl_in_rule__JoinRight__Group__14082 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__JoinRight__Group__2_in_rule__JoinRight__Group__14085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__JoinRight__Group__1__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinRight__Group__2__Impl_in_rule__JoinRight__Group__24144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinRight__ClassRightAssignment_2_in_rule__JoinRight__Group__2__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__04207 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__04210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Alternatives_0_in_rule__Condition__Group__0__Impl4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__14267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_1__0_in_rule__Condition__Group__1__Impl4294 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Condition__Group_1__0__Impl_in_rule__Condition__Group_1__04329 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Condition__Group_1__1_in_rule__Condition__Group_1__04332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Alternatives_1_0_in_rule__Condition__Group_1__0__Impl4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_1__1__Impl_in_rule__Condition__Group_1__14389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Alternatives_1_1_in_rule__Condition__Group_1__1__Impl4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04450 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__LeftAssignment_0_in_rule__Comparison__Group__0__Impl4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14510 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__14513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Alternatives_1_in_rule__Comparison__Group__1__Impl4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__24570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_2_in_rule__Comparison__Group__2__Impl4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__0__Impl_in_rule__Left__Group__04633 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Left__Group__1_in_rule__Left__Group__04636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__MetamodelAssignment_0_in_rule__Left__Group__0__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__1__Impl_in_rule__Left__Group__14693 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Left__Group__2_in_rule__Left__Group__14696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Left__Group__1__Impl4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__2__Impl_in_rule__Left__Group__24755 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Left__Group__3_in_rule__Left__Group__24758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__ClassAssignment_2_in_rule__Left__Group__2__Impl4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__3__Impl_in_rule__Left__Group__34815 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Left__Group__4_in_rule__Left__Group__34818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Left__Group__3__Impl4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__4__Impl_in_rule__Left__Group__44877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__AttributeWhereLeftAssignment_4_in_rule__Left__Group__4__Impl4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group_0__0__Impl_in_rule__Right__Group_0__04944 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Right__Group_0__1_in_rule__Right__Group_0__04947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__MetamodelAssignment_0_0_in_rule__Right__Group_0__0__Impl4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group_0__1__Impl_in_rule__Right__Group_0__15004 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Right__Group_0__2_in_rule__Right__Group_0__15007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Right__Group_0__1__Impl5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group_0__2__Impl_in_rule__Right__Group_0__25066 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Right__Group_0__3_in_rule__Right__Group_0__25069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__ClassAssignment_0_2_in_rule__Right__Group_0__2__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group_0__3__Impl_in_rule__Right__Group_0__35126 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Right__Group_0__4_in_rule__Right__Group_0__35129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Right__Group_0__3__Impl5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group_0__4__Impl_in_rule__Right__Group_0__45188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__AttributeWhereRightAssignment_0_4_in_rule__Right__Group_0__4__Impl5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__ViewNameAssignment_15260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_35291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_4_15322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Model__ExpressionAssignment_55353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Metamodel__MetamodelURLAssignment_05384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelName_in_rule__Metamodel__MetamodelNameAssignment_25415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_rule__Expression__SelectAssignment_15446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_rule__Expression__FromAssignment_35477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Expression__ConditionAssignment_55508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Select__SelectAssignment_05544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAttribute_in_rule__Select__SelectAttributeAssignment_1_05583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAttribute_in_rule__Select__SelectAttributeAssignment_1_1_15614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SelectAttribute__MetamodelAssignment_05649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__SelectAttribute__ClassAssignment_25684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__SelectAttribute__AttributeAssignment_45715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_rule__From__JoinAssignment_05746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_rule__From__JoinAssignment_1_15777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinLeft_in_rule__Join__JoinLeftAssignment_05808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinRight_in_rule__Join__JoinRightAssignment_25839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__Join__RelationAssignment_45870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JoinLeft__MetamodelLeftAssignment_05905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__JoinLeft__ClassLeftAssignment_25940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JoinRight__MetamodelRightAssignment_05975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__JoinRight__ClassRightAssignment_26010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MetamodelName__NameAssignment6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__NameAssignment6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Condition__ValueAssignment_0_06165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEclExpression_in_rule__Condition__ValueAssignment_0_16196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Condition__ValueAssignment_1_1_06227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEclExpression_in_rule__Condition__ValueAssignment_1_1_16258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__EclExpression__ValueAssignment6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_rule__Comparison__LeftAssignment_06320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRight_in_rule__Comparison__RightAssignment_26351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Left__MetamodelAssignment_06386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Left__ClassAssignment_26425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Left__AttributeWhereLeftAssignment_46460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Right__MetamodelAssignment_0_06495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Right__ClassAssignment_0_26534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Right__AttributeWhereRightAssignment_0_46569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Right__ValueAssignment_16600 = new BitSet(new long[]{0x0000000000000002L});

}