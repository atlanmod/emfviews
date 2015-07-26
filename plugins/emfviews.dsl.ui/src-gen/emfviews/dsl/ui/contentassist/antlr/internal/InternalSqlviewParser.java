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
import emfviews.dsl.services.SqlviewGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlviewParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'OR'", "'='", "'<='", "'>='", "'<'", "'>'", "'<>'", "'create view'", "'from'", "','", "'as'", "'select'", "'where'", "'.'", "'*'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g"; }


     
     	private SqlviewGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SqlviewGrammarAccess grammarAccess) {
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:61:1: ( ruleModel EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:62:1: ruleModel EOF
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:76:1: ( rule__Model__Group__0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:76:2: rule__Model__Group__0
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:88:1: entryRuleMetamodel : ruleMetamodel EOF ;
    public final void entryRuleMetamodel() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:89:1: ( ruleMetamodel EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:90:1: ruleMetamodel EOF
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:97:1: ruleMetamodel : ( ( rule__Metamodel__Group__0 ) ) ;
    public final void ruleMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:101:2: ( ( ( rule__Metamodel__Group__0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:102:1: ( ( rule__Metamodel__Group__0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:102:1: ( ( rule__Metamodel__Group__0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:103:1: ( rule__Metamodel__Group__0 )
            {
             before(grammarAccess.getMetamodelAccess().getGroup()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:104:1: ( rule__Metamodel__Group__0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:104:2: rule__Metamodel__Group__0
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:116:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:117:1: ( ruleExpression EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:118:1: ruleExpression EOF
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:125:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:129:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:130:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:130:1: ( ( rule__Expression__Group__0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:131:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:132:1: ( rule__Expression__Group__0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:132:2: rule__Expression__Group__0
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:144:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:145:1: ( ruleSelect EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:146:1: ruleSelect EOF
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:153:1: ruleSelect : ( ( rule__Select__Alternatives ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:157:2: ( ( ( rule__Select__Alternatives ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:158:1: ( ( rule__Select__Alternatives ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:158:1: ( ( rule__Select__Alternatives ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:159:1: ( rule__Select__Alternatives )
            {
             before(grammarAccess.getSelectAccess().getAlternatives()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:160:1: ( rule__Select__Alternatives )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:160:2: rule__Select__Alternatives
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


    // $ANTLR start "entryRuleFrom"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:172:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:173:1: ( ruleFrom EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:174:1: ruleFrom EOF
            {
             before(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_ruleFrom_in_entryRuleFrom301);
            ruleFrom();

            state._fsp--;

             after(grammarAccess.getFromRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrom308); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:181:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:185:2: ( ( ( rule__From__Group__0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:186:1: ( ( rule__From__Group__0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:186:1: ( ( rule__From__Group__0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:187:1: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:188:1: ( rule__From__Group__0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:188:2: rule__From__Group__0
            {
            pushFollow(FOLLOW_rule__From__Group__0_in_ruleFrom334);
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


    // $ANTLR start "entryRuleAttribute"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:200:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:201:1: ( ruleAttribute EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:202:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute361);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute368); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:209:1: ruleAttribute : ( ( rule__Attribute__NameAssignment ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:213:2: ( ( ( rule__Attribute__NameAssignment ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:214:1: ( ( rule__Attribute__NameAssignment ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:214:1: ( ( rule__Attribute__NameAssignment ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:215:1: ( rule__Attribute__NameAssignment )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:216:1: ( rule__Attribute__NameAssignment )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:216:2: rule__Attribute__NameAssignment
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_in_ruleAttribute394);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:228:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:229:1: ( ruleClass EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:230:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass421);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass428); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:237:1: ruleClass : ( ( rule__Class__NameAssignment ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:241:2: ( ( ( rule__Class__NameAssignment ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:242:1: ( ( rule__Class__NameAssignment ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:242:1: ( ( rule__Class__NameAssignment ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:243:1: ( rule__Class__NameAssignment )
            {
             before(grammarAccess.getClassAccess().getNameAssignment()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:244:1: ( rule__Class__NameAssignment )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:244:2: rule__Class__NameAssignment
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_in_ruleClass454);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:256:1: entryRuleMetamodelName : ruleMetamodelName EOF ;
    public final void entryRuleMetamodelName() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:257:1: ( ruleMetamodelName EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:258:1: ruleMetamodelName EOF
            {
             before(grammarAccess.getMetamodelNameRule()); 
            pushFollow(FOLLOW_ruleMetamodelName_in_entryRuleMetamodelName481);
            ruleMetamodelName();

            state._fsp--;

             after(grammarAccess.getMetamodelNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelName488); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:265:1: ruleMetamodelName : ( ( rule__MetamodelName__NameAssignment ) ) ;
    public final void ruleMetamodelName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:269:2: ( ( ( rule__MetamodelName__NameAssignment ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:270:1: ( ( rule__MetamodelName__NameAssignment ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:270:1: ( ( rule__MetamodelName__NameAssignment ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:271:1: ( rule__MetamodelName__NameAssignment )
            {
             before(grammarAccess.getMetamodelNameAccess().getNameAssignment()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:272:1: ( rule__MetamodelName__NameAssignment )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:272:2: rule__MetamodelName__NameAssignment
            {
            pushFollow(FOLLOW_rule__MetamodelName__NameAssignment_in_ruleMetamodelName514);
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


    // $ANTLR start "entryRuleCondition"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:284:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:285:1: ( ruleCondition EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:286:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition541);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition548); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:293:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:297:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:298:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:298:1: ( ( rule__Condition__Group__0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:299:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:300:1: ( rule__Condition__Group__0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:300:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition574);
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


    // $ANTLR start "entryRuleComparison"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:312:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:313:1: ( ruleComparison EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:314:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison601);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison608); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:321:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:325:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:326:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:326:1: ( ( rule__Comparison__Group__0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:327:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:328:1: ( rule__Comparison__Group__0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:328:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison634);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:340:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:341:1: ( ruleLeft EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:342:1: ruleLeft EOF
            {
             before(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_ruleLeft_in_entryRuleLeft661);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getLeftRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeft668); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:349:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:353:2: ( ( ( rule__Left__Group__0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:354:1: ( ( rule__Left__Group__0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:354:1: ( ( rule__Left__Group__0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:355:1: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:356:1: ( rule__Left__Group__0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:356:2: rule__Left__Group__0
            {
            pushFollow(FOLLOW_rule__Left__Group__0_in_ruleLeft694);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:368:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:369:1: ( ruleRight EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:370:1: ruleRight EOF
            {
             before(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_ruleRight_in_entryRuleRight721);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getRightRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRight728); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:377:1: ruleRight : ( ( rule__Right__Alternatives ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:381:2: ( ( ( rule__Right__Alternatives ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:382:1: ( ( rule__Right__Alternatives ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:382:1: ( ( rule__Right__Alternatives ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:383:1: ( rule__Right__Alternatives )
            {
             before(grammarAccess.getRightAccess().getAlternatives()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:384:1: ( rule__Right__Alternatives )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:384:2: rule__Right__Alternatives
            {
            pushFollow(FOLLOW_rule__Right__Alternatives_in_ruleRight754);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:396:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:397:1: ( ruleEString EOF )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:398:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString781);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString788); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:405:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:409:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:410:1: ( ( rule__EString__Alternatives ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:410:1: ( ( rule__EString__Alternatives ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:411:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:412:1: ( rule__EString__Alternatives )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:412:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString814);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:424:1: rule__Select__Alternatives : ( ( ( rule__Select__SelectAssignment_0 ) ) | ( ( rule__Select__Group_1__0 ) ) );
    public final void rule__Select__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:428:1: ( ( ( rule__Select__SelectAssignment_0 ) ) | ( ( rule__Select__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
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
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:429:1: ( ( rule__Select__SelectAssignment_0 ) )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:429:1: ( ( rule__Select__SelectAssignment_0 ) )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:430:1: ( rule__Select__SelectAssignment_0 )
                    {
                     before(grammarAccess.getSelectAccess().getSelectAssignment_0()); 
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:431:1: ( rule__Select__SelectAssignment_0 )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:431:2: rule__Select__SelectAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Select__SelectAssignment_0_in_rule__Select__Alternatives850);
                    rule__Select__SelectAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getSelectAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:435:6: ( ( rule__Select__Group_1__0 ) )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:435:6: ( ( rule__Select__Group_1__0 ) )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:436:1: ( rule__Select__Group_1__0 )
                    {
                     before(grammarAccess.getSelectAccess().getGroup_1()); 
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:437:1: ( rule__Select__Group_1__0 )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:437:2: rule__Select__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Select__Group_1__0_in_rule__Select__Alternatives868);
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


    // $ANTLR start "rule__Condition__Alternatives_1_0"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:446:1: rule__Condition__Alternatives_1_0 : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__Condition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:450:1: ( ( 'AND' ) | ( 'OR' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:451:1: ( 'AND' )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:451:1: ( 'AND' )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:452:1: 'AND'
                    {
                     before(grammarAccess.getConditionAccess().getANDKeyword_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Condition__Alternatives_1_0902); 
                     after(grammarAccess.getConditionAccess().getANDKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:459:6: ( 'OR' )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:459:6: ( 'OR' )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:460:1: 'OR'
                    {
                     before(grammarAccess.getConditionAccess().getORKeyword_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Condition__Alternatives_1_0922); 
                     after(grammarAccess.getConditionAccess().getORKeyword_1_0_1()); 

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


    // $ANTLR start "rule__Comparison__Alternatives_1"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:472:1: rule__Comparison__Alternatives_1 : ( ( '=' ) | ( '<=' ) | ( '>=' ) | ( '<' ) | ( '>' ) | ( '<>' ) );
    public final void rule__Comparison__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:476:1: ( ( '=' ) | ( '<=' ) | ( '>=' ) | ( '<' ) | ( '>' ) | ( '<>' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:477:1: ( '=' )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:477:1: ( '=' )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:478:1: '='
                    {
                     before(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0()); 
                    match(input,13,FOLLOW_13_in_rule__Comparison__Alternatives_1957); 
                     after(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:485:6: ( '<=' )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:485:6: ( '<=' )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:486:1: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1()); 
                    match(input,14,FOLLOW_14_in_rule__Comparison__Alternatives_1977); 
                     after(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:493:6: ( '>=' )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:493:6: ( '>=' )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:494:1: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_2()); 
                    match(input,15,FOLLOW_15_in_rule__Comparison__Alternatives_1997); 
                     after(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:501:6: ( '<' )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:501:6: ( '<' )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:502:1: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_3()); 
                    match(input,16,FOLLOW_16_in_rule__Comparison__Alternatives_11017); 
                     after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:509:6: ( '>' )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:509:6: ( '>' )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:510:1: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_4()); 
                    match(input,17,FOLLOW_17_in_rule__Comparison__Alternatives_11037); 
                     after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:517:6: ( '<>' )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:517:6: ( '<>' )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:518:1: '<>'
                    {
                     before(grammarAccess.getComparisonAccess().getLessThanSignGreaterThanSignKeyword_1_5()); 
                    match(input,18,FOLLOW_18_in_rule__Comparison__Alternatives_11057); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:530:1: rule__Right__Alternatives : ( ( ( rule__Right__Group_0__0 ) ) | ( ( rule__Right__ValueAssignment_1 ) ) );
    public final void rule__Right__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:534:1: ( ( ( rule__Right__Group_0__0 ) ) | ( ( rule__Right__ValueAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==RULE_ID||(LA4_1>=11 && LA4_1<=12)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==25) ) {
                    alt4=1;
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
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:535:1: ( ( rule__Right__Group_0__0 ) )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:535:1: ( ( rule__Right__Group_0__0 ) )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:536:1: ( rule__Right__Group_0__0 )
                    {
                     before(grammarAccess.getRightAccess().getGroup_0()); 
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:537:1: ( rule__Right__Group_0__0 )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:537:2: rule__Right__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Right__Group_0__0_in_rule__Right__Alternatives1091);
                    rule__Right__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRightAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:541:6: ( ( rule__Right__ValueAssignment_1 ) )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:541:6: ( ( rule__Right__ValueAssignment_1 ) )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:542:1: ( rule__Right__ValueAssignment_1 )
                    {
                     before(grammarAccess.getRightAccess().getValueAssignment_1()); 
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:543:1: ( rule__Right__ValueAssignment_1 )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:543:2: rule__Right__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Right__ValueAssignment_1_in_rule__Right__Alternatives1109);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:552:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:556:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:557:1: ( RULE_STRING )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:557:1: ( RULE_STRING )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:558:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1142); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:563:6: ( RULE_ID )
                    {
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:563:6: ( RULE_ID )
                    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:564:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1159); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:576:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:580:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:581:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01189);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01192);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:588:1: rule__Model__Group__0__Impl : ( 'create view' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:592:1: ( ( 'create view' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:593:1: ( 'create view' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:593:1: ( 'create view' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:594:1: 'create view'
            {
             before(grammarAccess.getModelAccess().getCreateViewKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group__0__Impl1220); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:607:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:611:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:612:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11251);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11254);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:619:1: rule__Model__Group__1__Impl : ( ( rule__Model__ViewNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:623:1: ( ( ( rule__Model__ViewNameAssignment_1 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:624:1: ( ( rule__Model__ViewNameAssignment_1 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:624:1: ( ( rule__Model__ViewNameAssignment_1 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:625:1: ( rule__Model__ViewNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getViewNameAssignment_1()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:626:1: ( rule__Model__ViewNameAssignment_1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:626:2: rule__Model__ViewNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ViewNameAssignment_1_in_rule__Model__Group__1__Impl1281);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:636:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:640:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:641:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21311);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21314);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:648:1: rule__Model__Group__2__Impl : ( 'from' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:652:1: ( ( 'from' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:653:1: ( 'from' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:653:1: ( 'from' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:654:1: 'from'
            {
             before(grammarAccess.getModelAccess().getFromKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__2__Impl1342); 
             after(grammarAccess.getModelAccess().getFromKeyword_2()); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:667:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:671:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:672:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31373);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31376);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:679:1: rule__Model__Group__3__Impl : ( ( rule__Model__MetamodelAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:683:1: ( ( ( rule__Model__MetamodelAssignment_3 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:684:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:684:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:685:1: ( rule__Model__MetamodelAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_3()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:686:1: ( rule__Model__MetamodelAssignment_3 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:686:2: rule__Model__MetamodelAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl1403);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:696:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:700:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:701:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41433);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41436);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:708:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:712:1: ( ( ( rule__Model__Group_4__0 )* ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:713:1: ( ( rule__Model__Group_4__0 )* )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:713:1: ( ( rule__Model__Group_4__0 )* )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:714:1: ( rule__Model__Group_4__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:715:1: ( rule__Model__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:715:2: rule__Model__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl1463);
            	    rule__Model__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:725:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:729:1: ( rule__Model__Group__5__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:730:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51494);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:736:1: rule__Model__Group__5__Impl : ( ( rule__Model__ExpressionAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:740:1: ( ( ( rule__Model__ExpressionAssignment_5 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:741:1: ( ( rule__Model__ExpressionAssignment_5 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:741:1: ( ( rule__Model__ExpressionAssignment_5 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:742:1: ( rule__Model__ExpressionAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getExpressionAssignment_5()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:743:1: ( rule__Model__ExpressionAssignment_5 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:743:2: rule__Model__ExpressionAssignment_5
            {
            pushFollow(FOLLOW_rule__Model__ExpressionAssignment_5_in_rule__Model__Group__5__Impl1521);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:765:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:769:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:770:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__01563);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__01566);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:777:1: rule__Model__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:781:1: ( ( ',' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:782:1: ( ',' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:782:1: ( ',' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:783:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group_4__0__Impl1594); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:796:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:800:1: ( rule__Model__Group_4__1__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:801:2: rule__Model__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__11625);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:807:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__MetamodelAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:811:1: ( ( ( rule__Model__MetamodelAssignment_4_1 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:812:1: ( ( rule__Model__MetamodelAssignment_4_1 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:812:1: ( ( rule__Model__MetamodelAssignment_4_1 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:813:1: ( rule__Model__MetamodelAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_4_1()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:814:1: ( rule__Model__MetamodelAssignment_4_1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:814:2: rule__Model__MetamodelAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_4_1_in_rule__Model__Group_4__1__Impl1652);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:828:1: rule__Metamodel__Group__0 : rule__Metamodel__Group__0__Impl rule__Metamodel__Group__1 ;
    public final void rule__Metamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:832:1: ( rule__Metamodel__Group__0__Impl rule__Metamodel__Group__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:833:2: rule__Metamodel__Group__0__Impl rule__Metamodel__Group__1
            {
            pushFollow(FOLLOW_rule__Metamodel__Group__0__Impl_in_rule__Metamodel__Group__01686);
            rule__Metamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metamodel__Group__1_in_rule__Metamodel__Group__01689);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:840:1: rule__Metamodel__Group__0__Impl : ( ( rule__Metamodel__MetamodelURLAssignment_0 ) ) ;
    public final void rule__Metamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:844:1: ( ( ( rule__Metamodel__MetamodelURLAssignment_0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:845:1: ( ( rule__Metamodel__MetamodelURLAssignment_0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:845:1: ( ( rule__Metamodel__MetamodelURLAssignment_0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:846:1: ( rule__Metamodel__MetamodelURLAssignment_0 )
            {
             before(grammarAccess.getMetamodelAccess().getMetamodelURLAssignment_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:847:1: ( rule__Metamodel__MetamodelURLAssignment_0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:847:2: rule__Metamodel__MetamodelURLAssignment_0
            {
            pushFollow(FOLLOW_rule__Metamodel__MetamodelURLAssignment_0_in_rule__Metamodel__Group__0__Impl1716);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:857:1: rule__Metamodel__Group__1 : rule__Metamodel__Group__1__Impl rule__Metamodel__Group__2 ;
    public final void rule__Metamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:861:1: ( rule__Metamodel__Group__1__Impl rule__Metamodel__Group__2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:862:2: rule__Metamodel__Group__1__Impl rule__Metamodel__Group__2
            {
            pushFollow(FOLLOW_rule__Metamodel__Group__1__Impl_in_rule__Metamodel__Group__11746);
            rule__Metamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metamodel__Group__2_in_rule__Metamodel__Group__11749);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:869:1: rule__Metamodel__Group__1__Impl : ( 'as' ) ;
    public final void rule__Metamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:873:1: ( ( 'as' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:874:1: ( 'as' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:874:1: ( 'as' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:875:1: 'as'
            {
             before(grammarAccess.getMetamodelAccess().getAsKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Metamodel__Group__1__Impl1777); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:888:1: rule__Metamodel__Group__2 : rule__Metamodel__Group__2__Impl ;
    public final void rule__Metamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:892:1: ( rule__Metamodel__Group__2__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:893:2: rule__Metamodel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Metamodel__Group__2__Impl_in_rule__Metamodel__Group__21808);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:899:1: rule__Metamodel__Group__2__Impl : ( ( rule__Metamodel__MetamodelNameAssignment_2 ) ) ;
    public final void rule__Metamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:903:1: ( ( ( rule__Metamodel__MetamodelNameAssignment_2 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:904:1: ( ( rule__Metamodel__MetamodelNameAssignment_2 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:904:1: ( ( rule__Metamodel__MetamodelNameAssignment_2 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:905:1: ( rule__Metamodel__MetamodelNameAssignment_2 )
            {
             before(grammarAccess.getMetamodelAccess().getMetamodelNameAssignment_2()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:906:1: ( rule__Metamodel__MetamodelNameAssignment_2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:906:2: rule__Metamodel__MetamodelNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Metamodel__MetamodelNameAssignment_2_in_rule__Metamodel__Group__2__Impl1835);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:922:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:926:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:927:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__01871);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__01874);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:934:1: rule__Expression__Group__0__Impl : ( 'select' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:938:1: ( ( 'select' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:939:1: ( 'select' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:939:1: ( 'select' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:940:1: 'select'
            {
             before(grammarAccess.getExpressionAccess().getSelectKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Expression__Group__0__Impl1902); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:953:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:957:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:958:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__11933);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__11936);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:965:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__SelectAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:969:1: ( ( ( rule__Expression__SelectAssignment_1 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:970:1: ( ( rule__Expression__SelectAssignment_1 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:970:1: ( ( rule__Expression__SelectAssignment_1 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:971:1: ( rule__Expression__SelectAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getSelectAssignment_1()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:972:1: ( rule__Expression__SelectAssignment_1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:972:2: rule__Expression__SelectAssignment_1
            {
            pushFollow(FOLLOW_rule__Expression__SelectAssignment_1_in_rule__Expression__Group__1__Impl1963);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:982:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl rule__Expression__Group__3 ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:986:1: ( rule__Expression__Group__2__Impl rule__Expression__Group__3 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:987:2: rule__Expression__Group__2__Impl rule__Expression__Group__3
            {
            pushFollow(FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__21993);
            rule__Expression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__3_in_rule__Expression__Group__21996);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:994:1: rule__Expression__Group__2__Impl : ( 'from' ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:998:1: ( ( 'from' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:999:1: ( 'from' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:999:1: ( 'from' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1000:1: 'from'
            {
             before(grammarAccess.getExpressionAccess().getFromKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Expression__Group__2__Impl2024); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1013:1: rule__Expression__Group__3 : rule__Expression__Group__3__Impl rule__Expression__Group__4 ;
    public final void rule__Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1017:1: ( rule__Expression__Group__3__Impl rule__Expression__Group__4 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1018:2: rule__Expression__Group__3__Impl rule__Expression__Group__4
            {
            pushFollow(FOLLOW_rule__Expression__Group__3__Impl_in_rule__Expression__Group__32055);
            rule__Expression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__4_in_rule__Expression__Group__32058);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1025:1: rule__Expression__Group__3__Impl : ( ( rule__Expression__FromAssignment_3 ) ) ;
    public final void rule__Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1029:1: ( ( ( rule__Expression__FromAssignment_3 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1030:1: ( ( rule__Expression__FromAssignment_3 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1030:1: ( ( rule__Expression__FromAssignment_3 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1031:1: ( rule__Expression__FromAssignment_3 )
            {
             before(grammarAccess.getExpressionAccess().getFromAssignment_3()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1032:1: ( rule__Expression__FromAssignment_3 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1032:2: rule__Expression__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__Expression__FromAssignment_3_in_rule__Expression__Group__3__Impl2085);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1042:1: rule__Expression__Group__4 : rule__Expression__Group__4__Impl rule__Expression__Group__5 ;
    public final void rule__Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1046:1: ( rule__Expression__Group__4__Impl rule__Expression__Group__5 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1047:2: rule__Expression__Group__4__Impl rule__Expression__Group__5
            {
            pushFollow(FOLLOW_rule__Expression__Group__4__Impl_in_rule__Expression__Group__42115);
            rule__Expression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__5_in_rule__Expression__Group__42118);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1054:1: rule__Expression__Group__4__Impl : ( 'where' ) ;
    public final void rule__Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1058:1: ( ( 'where' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1059:1: ( 'where' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1059:1: ( 'where' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1060:1: 'where'
            {
             before(grammarAccess.getExpressionAccess().getWhereKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Expression__Group__4__Impl2146); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1073:1: rule__Expression__Group__5 : rule__Expression__Group__5__Impl ;
    public final void rule__Expression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1077:1: ( rule__Expression__Group__5__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1078:2: rule__Expression__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__5__Impl_in_rule__Expression__Group__52177);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1084:1: rule__Expression__Group__5__Impl : ( ( ( rule__Expression__ConditionAssignment_5 ) ) ( ( rule__Expression__ConditionAssignment_5 )* ) ) ;
    public final void rule__Expression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1088:1: ( ( ( ( rule__Expression__ConditionAssignment_5 ) ) ( ( rule__Expression__ConditionAssignment_5 )* ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1089:1: ( ( ( rule__Expression__ConditionAssignment_5 ) ) ( ( rule__Expression__ConditionAssignment_5 )* ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1089:1: ( ( ( rule__Expression__ConditionAssignment_5 ) ) ( ( rule__Expression__ConditionAssignment_5 )* ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1090:1: ( ( rule__Expression__ConditionAssignment_5 ) ) ( ( rule__Expression__ConditionAssignment_5 )* )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1090:1: ( ( rule__Expression__ConditionAssignment_5 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1091:1: ( rule__Expression__ConditionAssignment_5 )
            {
             before(grammarAccess.getExpressionAccess().getConditionAssignment_5()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1092:1: ( rule__Expression__ConditionAssignment_5 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1092:2: rule__Expression__ConditionAssignment_5
            {
            pushFollow(FOLLOW_rule__Expression__ConditionAssignment_5_in_rule__Expression__Group__5__Impl2206);
            rule__Expression__ConditionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getConditionAssignment_5()); 

            }

            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1095:1: ( ( rule__Expression__ConditionAssignment_5 )* )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1096:1: ( rule__Expression__ConditionAssignment_5 )*
            {
             before(grammarAccess.getExpressionAccess().getConditionAssignment_5()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1097:1: ( rule__Expression__ConditionAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1097:2: rule__Expression__ConditionAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Expression__ConditionAssignment_5_in_rule__Expression__Group__5__Impl2218);
            	    rule__Expression__ConditionAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1120:1: rule__Select__Group_1__0 : rule__Select__Group_1__0__Impl rule__Select__Group_1__1 ;
    public final void rule__Select__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1124:1: ( rule__Select__Group_1__0__Impl rule__Select__Group_1__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1125:2: rule__Select__Group_1__0__Impl rule__Select__Group_1__1
            {
            pushFollow(FOLLOW_rule__Select__Group_1__0__Impl_in_rule__Select__Group_1__02263);
            rule__Select__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_1__1_in_rule__Select__Group_1__02266);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1132:1: rule__Select__Group_1__0__Impl : ( ( rule__Select__MetamodelAssignment_1_0 ) ) ;
    public final void rule__Select__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1136:1: ( ( ( rule__Select__MetamodelAssignment_1_0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1137:1: ( ( rule__Select__MetamodelAssignment_1_0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1137:1: ( ( rule__Select__MetamodelAssignment_1_0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1138:1: ( rule__Select__MetamodelAssignment_1_0 )
            {
             before(grammarAccess.getSelectAccess().getMetamodelAssignment_1_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1139:1: ( rule__Select__MetamodelAssignment_1_0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1139:2: rule__Select__MetamodelAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Select__MetamodelAssignment_1_0_in_rule__Select__Group_1__0__Impl2293);
            rule__Select__MetamodelAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getMetamodelAssignment_1_0()); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1149:1: rule__Select__Group_1__1 : rule__Select__Group_1__1__Impl rule__Select__Group_1__2 ;
    public final void rule__Select__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1153:1: ( rule__Select__Group_1__1__Impl rule__Select__Group_1__2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1154:2: rule__Select__Group_1__1__Impl rule__Select__Group_1__2
            {
            pushFollow(FOLLOW_rule__Select__Group_1__1__Impl_in_rule__Select__Group_1__12323);
            rule__Select__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_1__2_in_rule__Select__Group_1__12326);
            rule__Select__Group_1__2();

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1161:1: rule__Select__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Select__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1165:1: ( ( '.' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1166:1: ( '.' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1166:1: ( '.' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1167:1: '.'
            {
             before(grammarAccess.getSelectAccess().getFullStopKeyword_1_1()); 
            match(input,25,FOLLOW_25_in_rule__Select__Group_1__1__Impl2354); 
             after(grammarAccess.getSelectAccess().getFullStopKeyword_1_1()); 

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


    // $ANTLR start "rule__Select__Group_1__2"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1180:1: rule__Select__Group_1__2 : rule__Select__Group_1__2__Impl rule__Select__Group_1__3 ;
    public final void rule__Select__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1184:1: ( rule__Select__Group_1__2__Impl rule__Select__Group_1__3 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1185:2: rule__Select__Group_1__2__Impl rule__Select__Group_1__3
            {
            pushFollow(FOLLOW_rule__Select__Group_1__2__Impl_in_rule__Select__Group_1__22385);
            rule__Select__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_1__3_in_rule__Select__Group_1__22388);
            rule__Select__Group_1__3();

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
    // $ANTLR end "rule__Select__Group_1__2"


    // $ANTLR start "rule__Select__Group_1__2__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1192:1: rule__Select__Group_1__2__Impl : ( ( rule__Select__ClassAssignment_1_2 ) ) ;
    public final void rule__Select__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1196:1: ( ( ( rule__Select__ClassAssignment_1_2 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1197:1: ( ( rule__Select__ClassAssignment_1_2 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1197:1: ( ( rule__Select__ClassAssignment_1_2 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1198:1: ( rule__Select__ClassAssignment_1_2 )
            {
             before(grammarAccess.getSelectAccess().getClassAssignment_1_2()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1199:1: ( rule__Select__ClassAssignment_1_2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1199:2: rule__Select__ClassAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Select__ClassAssignment_1_2_in_rule__Select__Group_1__2__Impl2415);
            rule__Select__ClassAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getClassAssignment_1_2()); 

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
    // $ANTLR end "rule__Select__Group_1__2__Impl"


    // $ANTLR start "rule__Select__Group_1__3"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1209:1: rule__Select__Group_1__3 : rule__Select__Group_1__3__Impl rule__Select__Group_1__4 ;
    public final void rule__Select__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1213:1: ( rule__Select__Group_1__3__Impl rule__Select__Group_1__4 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1214:2: rule__Select__Group_1__3__Impl rule__Select__Group_1__4
            {
            pushFollow(FOLLOW_rule__Select__Group_1__3__Impl_in_rule__Select__Group_1__32445);
            rule__Select__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_1__4_in_rule__Select__Group_1__32448);
            rule__Select__Group_1__4();

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
    // $ANTLR end "rule__Select__Group_1__3"


    // $ANTLR start "rule__Select__Group_1__3__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1221:1: rule__Select__Group_1__3__Impl : ( '.' ) ;
    public final void rule__Select__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1225:1: ( ( '.' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1226:1: ( '.' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1226:1: ( '.' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1227:1: '.'
            {
             before(grammarAccess.getSelectAccess().getFullStopKeyword_1_3()); 
            match(input,25,FOLLOW_25_in_rule__Select__Group_1__3__Impl2476); 
             after(grammarAccess.getSelectAccess().getFullStopKeyword_1_3()); 

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
    // $ANTLR end "rule__Select__Group_1__3__Impl"


    // $ANTLR start "rule__Select__Group_1__4"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1240:1: rule__Select__Group_1__4 : rule__Select__Group_1__4__Impl rule__Select__Group_1__5 ;
    public final void rule__Select__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1244:1: ( rule__Select__Group_1__4__Impl rule__Select__Group_1__5 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1245:2: rule__Select__Group_1__4__Impl rule__Select__Group_1__5
            {
            pushFollow(FOLLOW_rule__Select__Group_1__4__Impl_in_rule__Select__Group_1__42507);
            rule__Select__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_1__5_in_rule__Select__Group_1__42510);
            rule__Select__Group_1__5();

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
    // $ANTLR end "rule__Select__Group_1__4"


    // $ANTLR start "rule__Select__Group_1__4__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1252:1: rule__Select__Group_1__4__Impl : ( ( rule__Select__AttributeAssignment_1_4 ) ) ;
    public final void rule__Select__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1256:1: ( ( ( rule__Select__AttributeAssignment_1_4 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1257:1: ( ( rule__Select__AttributeAssignment_1_4 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1257:1: ( ( rule__Select__AttributeAssignment_1_4 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1258:1: ( rule__Select__AttributeAssignment_1_4 )
            {
             before(grammarAccess.getSelectAccess().getAttributeAssignment_1_4()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1259:1: ( rule__Select__AttributeAssignment_1_4 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1259:2: rule__Select__AttributeAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Select__AttributeAssignment_1_4_in_rule__Select__Group_1__4__Impl2537);
            rule__Select__AttributeAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getAttributeAssignment_1_4()); 

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
    // $ANTLR end "rule__Select__Group_1__4__Impl"


    // $ANTLR start "rule__Select__Group_1__5"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1269:1: rule__Select__Group_1__5 : rule__Select__Group_1__5__Impl ;
    public final void rule__Select__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1273:1: ( rule__Select__Group_1__5__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1274:2: rule__Select__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__Select__Group_1__5__Impl_in_rule__Select__Group_1__52567);
            rule__Select__Group_1__5__Impl();

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
    // $ANTLR end "rule__Select__Group_1__5"


    // $ANTLR start "rule__Select__Group_1__5__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1280:1: rule__Select__Group_1__5__Impl : ( ( rule__Select__Group_1_5__0 )* ) ;
    public final void rule__Select__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1284:1: ( ( ( rule__Select__Group_1_5__0 )* ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1285:1: ( ( rule__Select__Group_1_5__0 )* )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1285:1: ( ( rule__Select__Group_1_5__0 )* )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1286:1: ( rule__Select__Group_1_5__0 )*
            {
             before(grammarAccess.getSelectAccess().getGroup_1_5()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1287:1: ( rule__Select__Group_1_5__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1287:2: rule__Select__Group_1_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Select__Group_1_5__0_in_rule__Select__Group_1__5__Impl2594);
            	    rule__Select__Group_1_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getGroup_1_5()); 

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
    // $ANTLR end "rule__Select__Group_1__5__Impl"


    // $ANTLR start "rule__Select__Group_1_5__0"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1309:1: rule__Select__Group_1_5__0 : rule__Select__Group_1_5__0__Impl rule__Select__Group_1_5__1 ;
    public final void rule__Select__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1313:1: ( rule__Select__Group_1_5__0__Impl rule__Select__Group_1_5__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1314:2: rule__Select__Group_1_5__0__Impl rule__Select__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__Select__Group_1_5__0__Impl_in_rule__Select__Group_1_5__02637);
            rule__Select__Group_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_1_5__1_in_rule__Select__Group_1_5__02640);
            rule__Select__Group_1_5__1();

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
    // $ANTLR end "rule__Select__Group_1_5__0"


    // $ANTLR start "rule__Select__Group_1_5__0__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1321:1: rule__Select__Group_1_5__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1325:1: ( ( ',' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1326:1: ( ',' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1326:1: ( ',' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1327:1: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_1_5_0()); 
            match(input,21,FOLLOW_21_in_rule__Select__Group_1_5__0__Impl2668); 
             after(grammarAccess.getSelectAccess().getCommaKeyword_1_5_0()); 

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
    // $ANTLR end "rule__Select__Group_1_5__0__Impl"


    // $ANTLR start "rule__Select__Group_1_5__1"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1340:1: rule__Select__Group_1_5__1 : rule__Select__Group_1_5__1__Impl rule__Select__Group_1_5__2 ;
    public final void rule__Select__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1344:1: ( rule__Select__Group_1_5__1__Impl rule__Select__Group_1_5__2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1345:2: rule__Select__Group_1_5__1__Impl rule__Select__Group_1_5__2
            {
            pushFollow(FOLLOW_rule__Select__Group_1_5__1__Impl_in_rule__Select__Group_1_5__12699);
            rule__Select__Group_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_1_5__2_in_rule__Select__Group_1_5__12702);
            rule__Select__Group_1_5__2();

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
    // $ANTLR end "rule__Select__Group_1_5__1"


    // $ANTLR start "rule__Select__Group_1_5__1__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1352:1: rule__Select__Group_1_5__1__Impl : ( ( rule__Select__MetamodelAssignment_1_5_1 ) ) ;
    public final void rule__Select__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1356:1: ( ( ( rule__Select__MetamodelAssignment_1_5_1 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1357:1: ( ( rule__Select__MetamodelAssignment_1_5_1 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1357:1: ( ( rule__Select__MetamodelAssignment_1_5_1 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1358:1: ( rule__Select__MetamodelAssignment_1_5_1 )
            {
             before(grammarAccess.getSelectAccess().getMetamodelAssignment_1_5_1()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1359:1: ( rule__Select__MetamodelAssignment_1_5_1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1359:2: rule__Select__MetamodelAssignment_1_5_1
            {
            pushFollow(FOLLOW_rule__Select__MetamodelAssignment_1_5_1_in_rule__Select__Group_1_5__1__Impl2729);
            rule__Select__MetamodelAssignment_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getMetamodelAssignment_1_5_1()); 

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
    // $ANTLR end "rule__Select__Group_1_5__1__Impl"


    // $ANTLR start "rule__Select__Group_1_5__2"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1369:1: rule__Select__Group_1_5__2 : rule__Select__Group_1_5__2__Impl rule__Select__Group_1_5__3 ;
    public final void rule__Select__Group_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1373:1: ( rule__Select__Group_1_5__2__Impl rule__Select__Group_1_5__3 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1374:2: rule__Select__Group_1_5__2__Impl rule__Select__Group_1_5__3
            {
            pushFollow(FOLLOW_rule__Select__Group_1_5__2__Impl_in_rule__Select__Group_1_5__22759);
            rule__Select__Group_1_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_1_5__3_in_rule__Select__Group_1_5__22762);
            rule__Select__Group_1_5__3();

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
    // $ANTLR end "rule__Select__Group_1_5__2"


    // $ANTLR start "rule__Select__Group_1_5__2__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1381:1: rule__Select__Group_1_5__2__Impl : ( '.' ) ;
    public final void rule__Select__Group_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1385:1: ( ( '.' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1386:1: ( '.' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1386:1: ( '.' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1387:1: '.'
            {
             before(grammarAccess.getSelectAccess().getFullStopKeyword_1_5_2()); 
            match(input,25,FOLLOW_25_in_rule__Select__Group_1_5__2__Impl2790); 
             after(grammarAccess.getSelectAccess().getFullStopKeyword_1_5_2()); 

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
    // $ANTLR end "rule__Select__Group_1_5__2__Impl"


    // $ANTLR start "rule__Select__Group_1_5__3"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1400:1: rule__Select__Group_1_5__3 : rule__Select__Group_1_5__3__Impl rule__Select__Group_1_5__4 ;
    public final void rule__Select__Group_1_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1404:1: ( rule__Select__Group_1_5__3__Impl rule__Select__Group_1_5__4 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1405:2: rule__Select__Group_1_5__3__Impl rule__Select__Group_1_5__4
            {
            pushFollow(FOLLOW_rule__Select__Group_1_5__3__Impl_in_rule__Select__Group_1_5__32821);
            rule__Select__Group_1_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_1_5__4_in_rule__Select__Group_1_5__32824);
            rule__Select__Group_1_5__4();

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
    // $ANTLR end "rule__Select__Group_1_5__3"


    // $ANTLR start "rule__Select__Group_1_5__3__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1412:1: rule__Select__Group_1_5__3__Impl : ( ( rule__Select__ClassAssignment_1_5_3 ) ) ;
    public final void rule__Select__Group_1_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1416:1: ( ( ( rule__Select__ClassAssignment_1_5_3 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1417:1: ( ( rule__Select__ClassAssignment_1_5_3 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1417:1: ( ( rule__Select__ClassAssignment_1_5_3 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1418:1: ( rule__Select__ClassAssignment_1_5_3 )
            {
             before(grammarAccess.getSelectAccess().getClassAssignment_1_5_3()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1419:1: ( rule__Select__ClassAssignment_1_5_3 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1419:2: rule__Select__ClassAssignment_1_5_3
            {
            pushFollow(FOLLOW_rule__Select__ClassAssignment_1_5_3_in_rule__Select__Group_1_5__3__Impl2851);
            rule__Select__ClassAssignment_1_5_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getClassAssignment_1_5_3()); 

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
    // $ANTLR end "rule__Select__Group_1_5__3__Impl"


    // $ANTLR start "rule__Select__Group_1_5__4"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1429:1: rule__Select__Group_1_5__4 : rule__Select__Group_1_5__4__Impl rule__Select__Group_1_5__5 ;
    public final void rule__Select__Group_1_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1433:1: ( rule__Select__Group_1_5__4__Impl rule__Select__Group_1_5__5 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1434:2: rule__Select__Group_1_5__4__Impl rule__Select__Group_1_5__5
            {
            pushFollow(FOLLOW_rule__Select__Group_1_5__4__Impl_in_rule__Select__Group_1_5__42881);
            rule__Select__Group_1_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_1_5__5_in_rule__Select__Group_1_5__42884);
            rule__Select__Group_1_5__5();

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
    // $ANTLR end "rule__Select__Group_1_5__4"


    // $ANTLR start "rule__Select__Group_1_5__4__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1441:1: rule__Select__Group_1_5__4__Impl : ( '.' ) ;
    public final void rule__Select__Group_1_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1445:1: ( ( '.' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1446:1: ( '.' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1446:1: ( '.' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1447:1: '.'
            {
             before(grammarAccess.getSelectAccess().getFullStopKeyword_1_5_4()); 
            match(input,25,FOLLOW_25_in_rule__Select__Group_1_5__4__Impl2912); 
             after(grammarAccess.getSelectAccess().getFullStopKeyword_1_5_4()); 

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
    // $ANTLR end "rule__Select__Group_1_5__4__Impl"


    // $ANTLR start "rule__Select__Group_1_5__5"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1460:1: rule__Select__Group_1_5__5 : rule__Select__Group_1_5__5__Impl ;
    public final void rule__Select__Group_1_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1464:1: ( rule__Select__Group_1_5__5__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1465:2: rule__Select__Group_1_5__5__Impl
            {
            pushFollow(FOLLOW_rule__Select__Group_1_5__5__Impl_in_rule__Select__Group_1_5__52943);
            rule__Select__Group_1_5__5__Impl();

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
    // $ANTLR end "rule__Select__Group_1_5__5"


    // $ANTLR start "rule__Select__Group_1_5__5__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1471:1: rule__Select__Group_1_5__5__Impl : ( ( rule__Select__AttributeAssignment_1_5_5 ) ) ;
    public final void rule__Select__Group_1_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1475:1: ( ( ( rule__Select__AttributeAssignment_1_5_5 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1476:1: ( ( rule__Select__AttributeAssignment_1_5_5 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1476:1: ( ( rule__Select__AttributeAssignment_1_5_5 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1477:1: ( rule__Select__AttributeAssignment_1_5_5 )
            {
             before(grammarAccess.getSelectAccess().getAttributeAssignment_1_5_5()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1478:1: ( rule__Select__AttributeAssignment_1_5_5 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1478:2: rule__Select__AttributeAssignment_1_5_5
            {
            pushFollow(FOLLOW_rule__Select__AttributeAssignment_1_5_5_in_rule__Select__Group_1_5__5__Impl2970);
            rule__Select__AttributeAssignment_1_5_5();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getAttributeAssignment_1_5_5()); 

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
    // $ANTLR end "rule__Select__Group_1_5__5__Impl"


    // $ANTLR start "rule__From__Group__0"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1500:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1504:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1505:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__03012);
            rule__From__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__From__Group__1_in_rule__From__Group__03015);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1512:1: rule__From__Group__0__Impl : ( ( rule__From__MetamodelAssignment_0 ) ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1516:1: ( ( ( rule__From__MetamodelAssignment_0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1517:1: ( ( rule__From__MetamodelAssignment_0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1517:1: ( ( rule__From__MetamodelAssignment_0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1518:1: ( rule__From__MetamodelAssignment_0 )
            {
             before(grammarAccess.getFromAccess().getMetamodelAssignment_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1519:1: ( rule__From__MetamodelAssignment_0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1519:2: rule__From__MetamodelAssignment_0
            {
            pushFollow(FOLLOW_rule__From__MetamodelAssignment_0_in_rule__From__Group__0__Impl3042);
            rule__From__MetamodelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getMetamodelAssignment_0()); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1529:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1533:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1534:2: rule__From__Group__1__Impl rule__From__Group__2
            {
            pushFollow(FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__13072);
            rule__From__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__From__Group__2_in_rule__From__Group__13075);
            rule__From__Group__2();

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1541:1: rule__From__Group__1__Impl : ( '.' ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1545:1: ( ( '.' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1546:1: ( '.' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1546:1: ( '.' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1547:1: '.'
            {
             before(grammarAccess.getFromAccess().getFullStopKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__From__Group__1__Impl3103); 
             after(grammarAccess.getFromAccess().getFullStopKeyword_1()); 

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


    // $ANTLR start "rule__From__Group__2"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1560:1: rule__From__Group__2 : rule__From__Group__2__Impl rule__From__Group__3 ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1564:1: ( rule__From__Group__2__Impl rule__From__Group__3 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1565:2: rule__From__Group__2__Impl rule__From__Group__3
            {
            pushFollow(FOLLOW_rule__From__Group__2__Impl_in_rule__From__Group__23134);
            rule__From__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__From__Group__3_in_rule__From__Group__23137);
            rule__From__Group__3();

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
    // $ANTLR end "rule__From__Group__2"


    // $ANTLR start "rule__From__Group__2__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1572:1: rule__From__Group__2__Impl : ( ( rule__From__ClassAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1576:1: ( ( ( rule__From__ClassAssignment_2 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1577:1: ( ( rule__From__ClassAssignment_2 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1577:1: ( ( rule__From__ClassAssignment_2 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1578:1: ( rule__From__ClassAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getClassAssignment_2()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1579:1: ( rule__From__ClassAssignment_2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1579:2: rule__From__ClassAssignment_2
            {
            pushFollow(FOLLOW_rule__From__ClassAssignment_2_in_rule__From__Group__2__Impl3164);
            rule__From__ClassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getClassAssignment_2()); 

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
    // $ANTLR end "rule__From__Group__2__Impl"


    // $ANTLR start "rule__From__Group__3"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1589:1: rule__From__Group__3 : rule__From__Group__3__Impl ;
    public final void rule__From__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1593:1: ( rule__From__Group__3__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1594:2: rule__From__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__From__Group__3__Impl_in_rule__From__Group__33194);
            rule__From__Group__3__Impl();

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
    // $ANTLR end "rule__From__Group__3"


    // $ANTLR start "rule__From__Group__3__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1600:1: rule__From__Group__3__Impl : ( ( rule__From__Group_3__0 )* ) ;
    public final void rule__From__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1604:1: ( ( ( rule__From__Group_3__0 )* ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1605:1: ( ( rule__From__Group_3__0 )* )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1605:1: ( ( rule__From__Group_3__0 )* )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1606:1: ( rule__From__Group_3__0 )*
            {
             before(grammarAccess.getFromAccess().getGroup_3()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1607:1: ( rule__From__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1607:2: rule__From__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__From__Group_3__0_in_rule__From__Group__3__Impl3221);
            	    rule__From__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFromAccess().getGroup_3()); 

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
    // $ANTLR end "rule__From__Group__3__Impl"


    // $ANTLR start "rule__From__Group_3__0"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1625:1: rule__From__Group_3__0 : rule__From__Group_3__0__Impl rule__From__Group_3__1 ;
    public final void rule__From__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1629:1: ( rule__From__Group_3__0__Impl rule__From__Group_3__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1630:2: rule__From__Group_3__0__Impl rule__From__Group_3__1
            {
            pushFollow(FOLLOW_rule__From__Group_3__0__Impl_in_rule__From__Group_3__03260);
            rule__From__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__From__Group_3__1_in_rule__From__Group_3__03263);
            rule__From__Group_3__1();

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
    // $ANTLR end "rule__From__Group_3__0"


    // $ANTLR start "rule__From__Group_3__0__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1637:1: rule__From__Group_3__0__Impl : ( ',' ) ;
    public final void rule__From__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1641:1: ( ( ',' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1642:1: ( ',' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1642:1: ( ',' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1643:1: ','
            {
             before(grammarAccess.getFromAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__From__Group_3__0__Impl3291); 
             after(grammarAccess.getFromAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__From__Group_3__0__Impl"


    // $ANTLR start "rule__From__Group_3__1"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1656:1: rule__From__Group_3__1 : rule__From__Group_3__1__Impl rule__From__Group_3__2 ;
    public final void rule__From__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1660:1: ( rule__From__Group_3__1__Impl rule__From__Group_3__2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1661:2: rule__From__Group_3__1__Impl rule__From__Group_3__2
            {
            pushFollow(FOLLOW_rule__From__Group_3__1__Impl_in_rule__From__Group_3__13322);
            rule__From__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__From__Group_3__2_in_rule__From__Group_3__13325);
            rule__From__Group_3__2();

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
    // $ANTLR end "rule__From__Group_3__1"


    // $ANTLR start "rule__From__Group_3__1__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1668:1: rule__From__Group_3__1__Impl : ( ( rule__From__MetamodelAssignment_3_1 ) ) ;
    public final void rule__From__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1672:1: ( ( ( rule__From__MetamodelAssignment_3_1 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1673:1: ( ( rule__From__MetamodelAssignment_3_1 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1673:1: ( ( rule__From__MetamodelAssignment_3_1 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1674:1: ( rule__From__MetamodelAssignment_3_1 )
            {
             before(grammarAccess.getFromAccess().getMetamodelAssignment_3_1()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1675:1: ( rule__From__MetamodelAssignment_3_1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1675:2: rule__From__MetamodelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__From__MetamodelAssignment_3_1_in_rule__From__Group_3__1__Impl3352);
            rule__From__MetamodelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getMetamodelAssignment_3_1()); 

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
    // $ANTLR end "rule__From__Group_3__1__Impl"


    // $ANTLR start "rule__From__Group_3__2"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1685:1: rule__From__Group_3__2 : rule__From__Group_3__2__Impl rule__From__Group_3__3 ;
    public final void rule__From__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1689:1: ( rule__From__Group_3__2__Impl rule__From__Group_3__3 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1690:2: rule__From__Group_3__2__Impl rule__From__Group_3__3
            {
            pushFollow(FOLLOW_rule__From__Group_3__2__Impl_in_rule__From__Group_3__23382);
            rule__From__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__From__Group_3__3_in_rule__From__Group_3__23385);
            rule__From__Group_3__3();

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
    // $ANTLR end "rule__From__Group_3__2"


    // $ANTLR start "rule__From__Group_3__2__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1697:1: rule__From__Group_3__2__Impl : ( '.' ) ;
    public final void rule__From__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1701:1: ( ( '.' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1702:1: ( '.' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1702:1: ( '.' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1703:1: '.'
            {
             before(grammarAccess.getFromAccess().getFullStopKeyword_3_2()); 
            match(input,25,FOLLOW_25_in_rule__From__Group_3__2__Impl3413); 
             after(grammarAccess.getFromAccess().getFullStopKeyword_3_2()); 

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
    // $ANTLR end "rule__From__Group_3__2__Impl"


    // $ANTLR start "rule__From__Group_3__3"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1716:1: rule__From__Group_3__3 : rule__From__Group_3__3__Impl ;
    public final void rule__From__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1720:1: ( rule__From__Group_3__3__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1721:2: rule__From__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__From__Group_3__3__Impl_in_rule__From__Group_3__33444);
            rule__From__Group_3__3__Impl();

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
    // $ANTLR end "rule__From__Group_3__3"


    // $ANTLR start "rule__From__Group_3__3__Impl"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1727:1: rule__From__Group_3__3__Impl : ( ( rule__From__ClassAssignment_3_3 ) ) ;
    public final void rule__From__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1731:1: ( ( ( rule__From__ClassAssignment_3_3 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1732:1: ( ( rule__From__ClassAssignment_3_3 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1732:1: ( ( rule__From__ClassAssignment_3_3 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1733:1: ( rule__From__ClassAssignment_3_3 )
            {
             before(grammarAccess.getFromAccess().getClassAssignment_3_3()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1734:1: ( rule__From__ClassAssignment_3_3 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1734:2: rule__From__ClassAssignment_3_3
            {
            pushFollow(FOLLOW_rule__From__ClassAssignment_3_3_in_rule__From__Group_3__3__Impl3471);
            rule__From__ClassAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getClassAssignment_3_3()); 

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
    // $ANTLR end "rule__From__Group_3__3__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1752:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1756:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1757:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__03509);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__03512);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1764:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__ValueAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1768:1: ( ( ( rule__Condition__ValueAssignment_0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1769:1: ( ( rule__Condition__ValueAssignment_0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1769:1: ( ( rule__Condition__ValueAssignment_0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1770:1: ( rule__Condition__ValueAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1771:1: ( rule__Condition__ValueAssignment_0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1771:2: rule__Condition__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__Condition__ValueAssignment_0_in_rule__Condition__Group__0__Impl3539);
            rule__Condition__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getValueAssignment_0()); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1781:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1785:1: ( rule__Condition__Group__1__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1786:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__13569);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1792:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Group_1__0 )* ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1796:1: ( ( ( rule__Condition__Group_1__0 )* ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1797:1: ( ( rule__Condition__Group_1__0 )* )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1797:1: ( ( rule__Condition__Group_1__0 )* )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1798:1: ( rule__Condition__Group_1__0 )*
            {
             before(grammarAccess.getConditionAccess().getGroup_1()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1799:1: ( rule__Condition__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=11 && LA10_0<=12)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1799:2: rule__Condition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Condition__Group_1__0_in_rule__Condition__Group__1__Impl3596);
            	    rule__Condition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1813:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1817:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1818:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Condition__Group_1__0__Impl_in_rule__Condition__Group_1__03631);
            rule__Condition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group_1__1_in_rule__Condition__Group_1__03634);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1825:1: rule__Condition__Group_1__0__Impl : ( ( rule__Condition__Alternatives_1_0 ) ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1829:1: ( ( ( rule__Condition__Alternatives_1_0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1830:1: ( ( rule__Condition__Alternatives_1_0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1830:1: ( ( rule__Condition__Alternatives_1_0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1831:1: ( rule__Condition__Alternatives_1_0 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_1_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1832:1: ( rule__Condition__Alternatives_1_0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1832:2: rule__Condition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Condition__Alternatives_1_0_in_rule__Condition__Group_1__0__Impl3661);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1842:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1846:1: ( rule__Condition__Group_1__1__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1847:2: rule__Condition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group_1__1__Impl_in_rule__Condition__Group_1__13691);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1853:1: rule__Condition__Group_1__1__Impl : ( ( rule__Condition__ValueAssignment_1_1 ) ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1857:1: ( ( ( rule__Condition__ValueAssignment_1_1 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1858:1: ( ( rule__Condition__ValueAssignment_1_1 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1858:1: ( ( rule__Condition__ValueAssignment_1_1 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1859:1: ( rule__Condition__ValueAssignment_1_1 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_1_1()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1860:1: ( rule__Condition__ValueAssignment_1_1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1860:2: rule__Condition__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Condition__ValueAssignment_1_1_in_rule__Condition__Group_1__1__Impl3718);
            rule__Condition__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getValueAssignment_1_1()); 

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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1874:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1878:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1879:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__03752);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__03755);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1886:1: rule__Comparison__Group__0__Impl : ( ( rule__Comparison__LeftAssignment_0 ) ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1890:1: ( ( ( rule__Comparison__LeftAssignment_0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1891:1: ( ( rule__Comparison__LeftAssignment_0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1891:1: ( ( rule__Comparison__LeftAssignment_0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1892:1: ( rule__Comparison__LeftAssignment_0 )
            {
             before(grammarAccess.getComparisonAccess().getLeftAssignment_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1893:1: ( rule__Comparison__LeftAssignment_0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1893:2: rule__Comparison__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Comparison__LeftAssignment_0_in_rule__Comparison__Group__0__Impl3782);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1903:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1907:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1908:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__13812);
            rule__Comparison__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__13815);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1915:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Alternatives_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1919:1: ( ( ( rule__Comparison__Alternatives_1 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1920:1: ( ( rule__Comparison__Alternatives_1 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1920:1: ( ( rule__Comparison__Alternatives_1 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1921:1: ( rule__Comparison__Alternatives_1 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1922:1: ( rule__Comparison__Alternatives_1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1922:2: rule__Comparison__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Comparison__Alternatives_1_in_rule__Comparison__Group__1__Impl3842);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1932:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1936:1: ( rule__Comparison__Group__2__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1937:2: rule__Comparison__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__23872);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1943:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__RightAssignment_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1947:1: ( ( ( rule__Comparison__RightAssignment_2 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1948:1: ( ( rule__Comparison__RightAssignment_2 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1948:1: ( ( rule__Comparison__RightAssignment_2 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1949:1: ( rule__Comparison__RightAssignment_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_2()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1950:1: ( rule__Comparison__RightAssignment_2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1950:2: rule__Comparison__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_2_in_rule__Comparison__Group__2__Impl3899);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1966:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1970:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1971:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FOLLOW_rule__Left__Group__0__Impl_in_rule__Left__Group__03935);
            rule__Left__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Left__Group__1_in_rule__Left__Group__03938);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1978:1: rule__Left__Group__0__Impl : ( ( rule__Left__MetamodelAssignment_0 ) ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1982:1: ( ( ( rule__Left__MetamodelAssignment_0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1983:1: ( ( rule__Left__MetamodelAssignment_0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1983:1: ( ( rule__Left__MetamodelAssignment_0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1984:1: ( rule__Left__MetamodelAssignment_0 )
            {
             before(grammarAccess.getLeftAccess().getMetamodelAssignment_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1985:1: ( rule__Left__MetamodelAssignment_0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1985:2: rule__Left__MetamodelAssignment_0
            {
            pushFollow(FOLLOW_rule__Left__MetamodelAssignment_0_in_rule__Left__Group__0__Impl3965);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1995:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:1999:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2000:2: rule__Left__Group__1__Impl rule__Left__Group__2
            {
            pushFollow(FOLLOW_rule__Left__Group__1__Impl_in_rule__Left__Group__13995);
            rule__Left__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Left__Group__2_in_rule__Left__Group__13998);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2007:1: rule__Left__Group__1__Impl : ( '.' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2011:1: ( ( '.' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2012:1: ( '.' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2012:1: ( '.' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2013:1: '.'
            {
             before(grammarAccess.getLeftAccess().getFullStopKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Left__Group__1__Impl4026); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2026:1: rule__Left__Group__2 : rule__Left__Group__2__Impl rule__Left__Group__3 ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2030:1: ( rule__Left__Group__2__Impl rule__Left__Group__3 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2031:2: rule__Left__Group__2__Impl rule__Left__Group__3
            {
            pushFollow(FOLLOW_rule__Left__Group__2__Impl_in_rule__Left__Group__24057);
            rule__Left__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Left__Group__3_in_rule__Left__Group__24060);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2038:1: rule__Left__Group__2__Impl : ( ( rule__Left__ClassAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2042:1: ( ( ( rule__Left__ClassAssignment_2 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2043:1: ( ( rule__Left__ClassAssignment_2 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2043:1: ( ( rule__Left__ClassAssignment_2 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2044:1: ( rule__Left__ClassAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getClassAssignment_2()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2045:1: ( rule__Left__ClassAssignment_2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2045:2: rule__Left__ClassAssignment_2
            {
            pushFollow(FOLLOW_rule__Left__ClassAssignment_2_in_rule__Left__Group__2__Impl4087);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2055:1: rule__Left__Group__3 : rule__Left__Group__3__Impl rule__Left__Group__4 ;
    public final void rule__Left__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2059:1: ( rule__Left__Group__3__Impl rule__Left__Group__4 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2060:2: rule__Left__Group__3__Impl rule__Left__Group__4
            {
            pushFollow(FOLLOW_rule__Left__Group__3__Impl_in_rule__Left__Group__34117);
            rule__Left__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Left__Group__4_in_rule__Left__Group__34120);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2067:1: rule__Left__Group__3__Impl : ( '.' ) ;
    public final void rule__Left__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2071:1: ( ( '.' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2072:1: ( '.' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2072:1: ( '.' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2073:1: '.'
            {
             before(grammarAccess.getLeftAccess().getFullStopKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Left__Group__3__Impl4148); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2086:1: rule__Left__Group__4 : rule__Left__Group__4__Impl ;
    public final void rule__Left__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2090:1: ( rule__Left__Group__4__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2091:2: rule__Left__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Left__Group__4__Impl_in_rule__Left__Group__44179);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2097:1: rule__Left__Group__4__Impl : ( ( rule__Left__AttributeWhereLeftAssignment_4 ) ) ;
    public final void rule__Left__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2101:1: ( ( ( rule__Left__AttributeWhereLeftAssignment_4 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2102:1: ( ( rule__Left__AttributeWhereLeftAssignment_4 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2102:1: ( ( rule__Left__AttributeWhereLeftAssignment_4 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2103:1: ( rule__Left__AttributeWhereLeftAssignment_4 )
            {
             before(grammarAccess.getLeftAccess().getAttributeWhereLeftAssignment_4()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2104:1: ( rule__Left__AttributeWhereLeftAssignment_4 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2104:2: rule__Left__AttributeWhereLeftAssignment_4
            {
            pushFollow(FOLLOW_rule__Left__AttributeWhereLeftAssignment_4_in_rule__Left__Group__4__Impl4206);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2124:1: rule__Right__Group_0__0 : rule__Right__Group_0__0__Impl rule__Right__Group_0__1 ;
    public final void rule__Right__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2128:1: ( rule__Right__Group_0__0__Impl rule__Right__Group_0__1 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2129:2: rule__Right__Group_0__0__Impl rule__Right__Group_0__1
            {
            pushFollow(FOLLOW_rule__Right__Group_0__0__Impl_in_rule__Right__Group_0__04246);
            rule__Right__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group_0__1_in_rule__Right__Group_0__04249);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2136:1: rule__Right__Group_0__0__Impl : ( ( rule__Right__MetamodelAssignment_0_0 ) ) ;
    public final void rule__Right__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2140:1: ( ( ( rule__Right__MetamodelAssignment_0_0 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2141:1: ( ( rule__Right__MetamodelAssignment_0_0 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2141:1: ( ( rule__Right__MetamodelAssignment_0_0 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2142:1: ( rule__Right__MetamodelAssignment_0_0 )
            {
             before(grammarAccess.getRightAccess().getMetamodelAssignment_0_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2143:1: ( rule__Right__MetamodelAssignment_0_0 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2143:2: rule__Right__MetamodelAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Right__MetamodelAssignment_0_0_in_rule__Right__Group_0__0__Impl4276);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2153:1: rule__Right__Group_0__1 : rule__Right__Group_0__1__Impl rule__Right__Group_0__2 ;
    public final void rule__Right__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2157:1: ( rule__Right__Group_0__1__Impl rule__Right__Group_0__2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2158:2: rule__Right__Group_0__1__Impl rule__Right__Group_0__2
            {
            pushFollow(FOLLOW_rule__Right__Group_0__1__Impl_in_rule__Right__Group_0__14306);
            rule__Right__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group_0__2_in_rule__Right__Group_0__14309);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2165:1: rule__Right__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Right__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2169:1: ( ( '.' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2170:1: ( '.' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2170:1: ( '.' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2171:1: '.'
            {
             before(grammarAccess.getRightAccess().getFullStopKeyword_0_1()); 
            match(input,25,FOLLOW_25_in_rule__Right__Group_0__1__Impl4337); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2184:1: rule__Right__Group_0__2 : rule__Right__Group_0__2__Impl rule__Right__Group_0__3 ;
    public final void rule__Right__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2188:1: ( rule__Right__Group_0__2__Impl rule__Right__Group_0__3 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2189:2: rule__Right__Group_0__2__Impl rule__Right__Group_0__3
            {
            pushFollow(FOLLOW_rule__Right__Group_0__2__Impl_in_rule__Right__Group_0__24368);
            rule__Right__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group_0__3_in_rule__Right__Group_0__24371);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2196:1: rule__Right__Group_0__2__Impl : ( ( rule__Right__ClassAssignment_0_2 ) ) ;
    public final void rule__Right__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2200:1: ( ( ( rule__Right__ClassAssignment_0_2 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2201:1: ( ( rule__Right__ClassAssignment_0_2 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2201:1: ( ( rule__Right__ClassAssignment_0_2 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2202:1: ( rule__Right__ClassAssignment_0_2 )
            {
             before(grammarAccess.getRightAccess().getClassAssignment_0_2()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2203:1: ( rule__Right__ClassAssignment_0_2 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2203:2: rule__Right__ClassAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Right__ClassAssignment_0_2_in_rule__Right__Group_0__2__Impl4398);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2213:1: rule__Right__Group_0__3 : rule__Right__Group_0__3__Impl rule__Right__Group_0__4 ;
    public final void rule__Right__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2217:1: ( rule__Right__Group_0__3__Impl rule__Right__Group_0__4 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2218:2: rule__Right__Group_0__3__Impl rule__Right__Group_0__4
            {
            pushFollow(FOLLOW_rule__Right__Group_0__3__Impl_in_rule__Right__Group_0__34428);
            rule__Right__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group_0__4_in_rule__Right__Group_0__34431);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2225:1: rule__Right__Group_0__3__Impl : ( '.' ) ;
    public final void rule__Right__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2229:1: ( ( '.' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2230:1: ( '.' )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2230:1: ( '.' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2231:1: '.'
            {
             before(grammarAccess.getRightAccess().getFullStopKeyword_0_3()); 
            match(input,25,FOLLOW_25_in_rule__Right__Group_0__3__Impl4459); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2244:1: rule__Right__Group_0__4 : rule__Right__Group_0__4__Impl ;
    public final void rule__Right__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2248:1: ( rule__Right__Group_0__4__Impl )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2249:2: rule__Right__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Right__Group_0__4__Impl_in_rule__Right__Group_0__44490);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2255:1: rule__Right__Group_0__4__Impl : ( ( rule__Right__AttributeWhereRightAssignment_0_4 ) ) ;
    public final void rule__Right__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2259:1: ( ( ( rule__Right__AttributeWhereRightAssignment_0_4 ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2260:1: ( ( rule__Right__AttributeWhereRightAssignment_0_4 ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2260:1: ( ( rule__Right__AttributeWhereRightAssignment_0_4 ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2261:1: ( rule__Right__AttributeWhereRightAssignment_0_4 )
            {
             before(grammarAccess.getRightAccess().getAttributeWhereRightAssignment_0_4()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2262:1: ( rule__Right__AttributeWhereRightAssignment_0_4 )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2262:2: rule__Right__AttributeWhereRightAssignment_0_4
            {
            pushFollow(FOLLOW_rule__Right__AttributeWhereRightAssignment_0_4_in_rule__Right__Group_0__4__Impl4517);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2283:1: rule__Model__ViewNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__ViewNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2287:1: ( ( RULE_ID ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2288:1: ( RULE_ID )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2288:1: ( RULE_ID )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2289:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getViewNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__ViewNameAssignment_14562); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2298:1: rule__Model__MetamodelAssignment_3 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2302:1: ( ( ruleMetamodel ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2303:1: ( ruleMetamodel )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2303:1: ( ruleMetamodel )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2304:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_34593);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2313:1: rule__Model__MetamodelAssignment_4_1 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2317:1: ( ( ruleMetamodel ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2318:1: ( ruleMetamodel )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2318:1: ( ruleMetamodel )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2319:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_4_14624);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2328:1: rule__Model__ExpressionAssignment_5 : ( ruleExpression ) ;
    public final void rule__Model__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2332:1: ( ( ruleExpression ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2333:1: ( ruleExpression )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2333:1: ( ruleExpression )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2334:1: ruleExpression
            {
             before(grammarAccess.getModelAccess().getExpressionExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Model__ExpressionAssignment_54655);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2343:1: rule__Metamodel__MetamodelURLAssignment_0 : ( ruleEString ) ;
    public final void rule__Metamodel__MetamodelURLAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2347:1: ( ( ruleEString ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2348:1: ( ruleEString )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2348:1: ( ruleEString )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2349:1: ruleEString
            {
             before(grammarAccess.getMetamodelAccess().getMetamodelURLEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Metamodel__MetamodelURLAssignment_04686);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2358:1: rule__Metamodel__MetamodelNameAssignment_2 : ( ruleMetamodelName ) ;
    public final void rule__Metamodel__MetamodelNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2362:1: ( ( ruleMetamodelName ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2363:1: ( ruleMetamodelName )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2363:1: ( ruleMetamodelName )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2364:1: ruleMetamodelName
            {
             before(grammarAccess.getMetamodelAccess().getMetamodelNameMetamodelNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMetamodelName_in_rule__Metamodel__MetamodelNameAssignment_24717);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2373:1: rule__Expression__SelectAssignment_1 : ( ruleSelect ) ;
    public final void rule__Expression__SelectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2377:1: ( ( ruleSelect ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2378:1: ( ruleSelect )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2378:1: ( ruleSelect )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2379:1: ruleSelect
            {
             before(grammarAccess.getExpressionAccess().getSelectSelectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSelect_in_rule__Expression__SelectAssignment_14748);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2388:1: rule__Expression__FromAssignment_3 : ( ruleFrom ) ;
    public final void rule__Expression__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2392:1: ( ( ruleFrom ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2393:1: ( ruleFrom )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2393:1: ( ruleFrom )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2394:1: ruleFrom
            {
             before(grammarAccess.getExpressionAccess().getFromFromParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFrom_in_rule__Expression__FromAssignment_34779);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2403:1: rule__Expression__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Expression__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2407:1: ( ( ruleCondition ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2408:1: ( ruleCondition )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2408:1: ( ruleCondition )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2409:1: ruleCondition
            {
             before(grammarAccess.getExpressionAccess().getConditionConditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Expression__ConditionAssignment_54810);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2418:1: rule__Select__SelectAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Select__SelectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2422:1: ( ( ( '*' ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2423:1: ( ( '*' ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2423:1: ( ( '*' ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2424:1: ( '*' )
            {
             before(grammarAccess.getSelectAccess().getSelectAsteriskKeyword_0_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2425:1: ( '*' )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2426:1: '*'
            {
             before(grammarAccess.getSelectAccess().getSelectAsteriskKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Select__SelectAssignment_04846); 
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


    // $ANTLR start "rule__Select__MetamodelAssignment_1_0"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2441:1: rule__Select__MetamodelAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Select__MetamodelAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2445:1: ( ( ( RULE_ID ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2446:1: ( ( RULE_ID ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2446:1: ( ( RULE_ID ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2447:1: ( RULE_ID )
            {
             before(grammarAccess.getSelectAccess().getMetamodelMetamodelNameCrossReference_1_0_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2448:1: ( RULE_ID )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2449:1: RULE_ID
            {
             before(grammarAccess.getSelectAccess().getMetamodelMetamodelNameIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Select__MetamodelAssignment_1_04889); 
             after(grammarAccess.getSelectAccess().getMetamodelMetamodelNameIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getSelectAccess().getMetamodelMetamodelNameCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__Select__MetamodelAssignment_1_0"


    // $ANTLR start "rule__Select__ClassAssignment_1_2"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2460:1: rule__Select__ClassAssignment_1_2 : ( ruleClass ) ;
    public final void rule__Select__ClassAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2464:1: ( ( ruleClass ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2465:1: ( ruleClass )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2465:1: ( ruleClass )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2466:1: ruleClass
            {
             before(grammarAccess.getSelectAccess().getClassClassParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Select__ClassAssignment_1_24924);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getClassClassParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Select__ClassAssignment_1_2"


    // $ANTLR start "rule__Select__AttributeAssignment_1_4"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2475:1: rule__Select__AttributeAssignment_1_4 : ( ruleAttribute ) ;
    public final void rule__Select__AttributeAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2479:1: ( ( ruleAttribute ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2480:1: ( ruleAttribute )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2480:1: ( ruleAttribute )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2481:1: ruleAttribute
            {
             before(grammarAccess.getSelectAccess().getAttributeAttributeParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Select__AttributeAssignment_1_44955);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getAttributeAttributeParserRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__Select__AttributeAssignment_1_4"


    // $ANTLR start "rule__Select__MetamodelAssignment_1_5_1"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2490:1: rule__Select__MetamodelAssignment_1_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Select__MetamodelAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2494:1: ( ( ( RULE_ID ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2495:1: ( ( RULE_ID ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2495:1: ( ( RULE_ID ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2496:1: ( RULE_ID )
            {
             before(grammarAccess.getSelectAccess().getMetamodelMetamodelNameCrossReference_1_5_1_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2497:1: ( RULE_ID )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2498:1: RULE_ID
            {
             before(grammarAccess.getSelectAccess().getMetamodelMetamodelNameIDTerminalRuleCall_1_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Select__MetamodelAssignment_1_5_14990); 
             after(grammarAccess.getSelectAccess().getMetamodelMetamodelNameIDTerminalRuleCall_1_5_1_0_1()); 

            }

             after(grammarAccess.getSelectAccess().getMetamodelMetamodelNameCrossReference_1_5_1_0()); 

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
    // $ANTLR end "rule__Select__MetamodelAssignment_1_5_1"


    // $ANTLR start "rule__Select__ClassAssignment_1_5_3"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2509:1: rule__Select__ClassAssignment_1_5_3 : ( ruleClass ) ;
    public final void rule__Select__ClassAssignment_1_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2513:1: ( ( ruleClass ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2514:1: ( ruleClass )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2514:1: ( ruleClass )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2515:1: ruleClass
            {
             before(grammarAccess.getSelectAccess().getClassClassParserRuleCall_1_5_3_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Select__ClassAssignment_1_5_35025);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getClassClassParserRuleCall_1_5_3_0()); 

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
    // $ANTLR end "rule__Select__ClassAssignment_1_5_3"


    // $ANTLR start "rule__Select__AttributeAssignment_1_5_5"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2524:1: rule__Select__AttributeAssignment_1_5_5 : ( ruleAttribute ) ;
    public final void rule__Select__AttributeAssignment_1_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2528:1: ( ( ruleAttribute ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2529:1: ( ruleAttribute )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2529:1: ( ruleAttribute )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2530:1: ruleAttribute
            {
             before(grammarAccess.getSelectAccess().getAttributeAttributeParserRuleCall_1_5_5_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Select__AttributeAssignment_1_5_55056);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getAttributeAttributeParserRuleCall_1_5_5_0()); 

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
    // $ANTLR end "rule__Select__AttributeAssignment_1_5_5"


    // $ANTLR start "rule__From__MetamodelAssignment_0"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2539:1: rule__From__MetamodelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__From__MetamodelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2543:1: ( ( ( RULE_ID ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2544:1: ( ( RULE_ID ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2544:1: ( ( RULE_ID ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2545:1: ( RULE_ID )
            {
             before(grammarAccess.getFromAccess().getMetamodelMetamodelNameCrossReference_0_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2546:1: ( RULE_ID )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2547:1: RULE_ID
            {
             before(grammarAccess.getFromAccess().getMetamodelMetamodelNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__From__MetamodelAssignment_05091); 
             after(grammarAccess.getFromAccess().getMetamodelMetamodelNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFromAccess().getMetamodelMetamodelNameCrossReference_0_0()); 

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
    // $ANTLR end "rule__From__MetamodelAssignment_0"


    // $ANTLR start "rule__From__ClassAssignment_2"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2558:1: rule__From__ClassAssignment_2 : ( ruleClass ) ;
    public final void rule__From__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2562:1: ( ( ruleClass ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2563:1: ( ruleClass )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2563:1: ( ruleClass )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2564:1: ruleClass
            {
             before(grammarAccess.getFromAccess().getClassClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__From__ClassAssignment_25126);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getFromAccess().getClassClassParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__From__ClassAssignment_2"


    // $ANTLR start "rule__From__MetamodelAssignment_3_1"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2573:1: rule__From__MetamodelAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__From__MetamodelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2577:1: ( ( ( RULE_ID ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2578:1: ( ( RULE_ID ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2578:1: ( ( RULE_ID ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2579:1: ( RULE_ID )
            {
             before(grammarAccess.getFromAccess().getMetamodelMetamodelNameCrossReference_3_1_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2580:1: ( RULE_ID )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2581:1: RULE_ID
            {
             before(grammarAccess.getFromAccess().getMetamodelMetamodelNameIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__From__MetamodelAssignment_3_15161); 
             after(grammarAccess.getFromAccess().getMetamodelMetamodelNameIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getFromAccess().getMetamodelMetamodelNameCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__From__MetamodelAssignment_3_1"


    // $ANTLR start "rule__From__ClassAssignment_3_3"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2592:1: rule__From__ClassAssignment_3_3 : ( ruleClass ) ;
    public final void rule__From__ClassAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2596:1: ( ( ruleClass ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2597:1: ( ruleClass )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2597:1: ( ruleClass )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2598:1: ruleClass
            {
             before(grammarAccess.getFromAccess().getClassClassParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__From__ClassAssignment_3_35196);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getFromAccess().getClassClassParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__From__ClassAssignment_3_3"


    // $ANTLR start "rule__Attribute__NameAssignment"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2607:1: rule__Attribute__NameAssignment : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2611:1: ( ( RULE_ID ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2612:1: ( RULE_ID )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2612:1: ( RULE_ID )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2613:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment5227); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2622:1: rule__Class__NameAssignment : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2626:1: ( ( RULE_ID ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2627:1: ( RULE_ID )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2627:1: ( RULE_ID )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2628:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment5258); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2637:1: rule__MetamodelName__NameAssignment : ( RULE_ID ) ;
    public final void rule__MetamodelName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2641:1: ( ( RULE_ID ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2642:1: ( RULE_ID )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2642:1: ( RULE_ID )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2643:1: RULE_ID
            {
             before(grammarAccess.getMetamodelNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MetamodelName__NameAssignment5289); 
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


    // $ANTLR start "rule__Condition__ValueAssignment_0"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2652:1: rule__Condition__ValueAssignment_0 : ( ruleComparison ) ;
    public final void rule__Condition__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2656:1: ( ( ruleComparison ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2657:1: ( ruleComparison )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2657:1: ( ruleComparison )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2658:1: ruleComparison
            {
             before(grammarAccess.getConditionAccess().getValueComparisonParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Condition__ValueAssignment_05320);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getValueComparisonParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Condition__ValueAssignment_0"


    // $ANTLR start "rule__Condition__ValueAssignment_1_1"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2667:1: rule__Condition__ValueAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__Condition__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2671:1: ( ( ruleComparison ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2672:1: ( ruleComparison )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2672:1: ( ruleComparison )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2673:1: ruleComparison
            {
             before(grammarAccess.getConditionAccess().getValueComparisonParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Condition__ValueAssignment_1_15351);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getValueComparisonParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Condition__ValueAssignment_1_1"


    // $ANTLR start "rule__Comparison__LeftAssignment_0"
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2682:1: rule__Comparison__LeftAssignment_0 : ( ruleLeft ) ;
    public final void rule__Comparison__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2686:1: ( ( ruleLeft ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2687:1: ( ruleLeft )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2687:1: ( ruleLeft )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2688:1: ruleLeft
            {
             before(grammarAccess.getComparisonAccess().getLeftLeftParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLeft_in_rule__Comparison__LeftAssignment_05382);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2697:1: rule__Comparison__RightAssignment_2 : ( ruleRight ) ;
    public final void rule__Comparison__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2701:1: ( ( ruleRight ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2702:1: ( ruleRight )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2702:1: ( ruleRight )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2703:1: ruleRight
            {
             before(grammarAccess.getComparisonAccess().getRightRightParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRight_in_rule__Comparison__RightAssignment_25413);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2712:1: rule__Left__MetamodelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Left__MetamodelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2716:1: ( ( ( RULE_ID ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2717:1: ( ( RULE_ID ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2717:1: ( ( RULE_ID ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2718:1: ( RULE_ID )
            {
             before(grammarAccess.getLeftAccess().getMetamodelMetamodelNameCrossReference_0_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2719:1: ( RULE_ID )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2720:1: RULE_ID
            {
             before(grammarAccess.getLeftAccess().getMetamodelMetamodelNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Left__MetamodelAssignment_05448); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2731:1: rule__Left__ClassAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Left__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2735:1: ( ( ( RULE_ID ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2736:1: ( ( RULE_ID ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2736:1: ( ( RULE_ID ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2737:1: ( RULE_ID )
            {
             before(grammarAccess.getLeftAccess().getClassClassCrossReference_2_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2738:1: ( RULE_ID )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2739:1: RULE_ID
            {
             before(grammarAccess.getLeftAccess().getClassClassIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Left__ClassAssignment_25487); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2750:1: rule__Left__AttributeWhereLeftAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Left__AttributeWhereLeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2754:1: ( ( ruleAttribute ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2755:1: ( ruleAttribute )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2755:1: ( ruleAttribute )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2756:1: ruleAttribute
            {
             before(grammarAccess.getLeftAccess().getAttributeWhereLeftAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Left__AttributeWhereLeftAssignment_45522);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2765:1: rule__Right__MetamodelAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Right__MetamodelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2769:1: ( ( ( RULE_ID ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2770:1: ( ( RULE_ID ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2770:1: ( ( RULE_ID ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2771:1: ( RULE_ID )
            {
             before(grammarAccess.getRightAccess().getMetamodelMetamodelNameCrossReference_0_0_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2772:1: ( RULE_ID )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2773:1: RULE_ID
            {
             before(grammarAccess.getRightAccess().getMetamodelMetamodelNameIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Right__MetamodelAssignment_0_05557); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2784:1: rule__Right__ClassAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Right__ClassAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2788:1: ( ( ( RULE_ID ) ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2789:1: ( ( RULE_ID ) )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2789:1: ( ( RULE_ID ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2790:1: ( RULE_ID )
            {
             before(grammarAccess.getRightAccess().getClassClassCrossReference_0_2_0()); 
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2791:1: ( RULE_ID )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2792:1: RULE_ID
            {
             before(grammarAccess.getRightAccess().getClassClassIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Right__ClassAssignment_0_25596); 
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2803:1: rule__Right__AttributeWhereRightAssignment_0_4 : ( ruleAttribute ) ;
    public final void rule__Right__AttributeWhereRightAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2807:1: ( ( ruleAttribute ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2808:1: ( ruleAttribute )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2808:1: ( ruleAttribute )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2809:1: ruleAttribute
            {
             before(grammarAccess.getRightAccess().getAttributeWhereRightAttributeParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Right__AttributeWhereRightAssignment_0_45631);
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
    // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2818:1: rule__Right__ValueAssignment_1 : ( ruleEString ) ;
    public final void rule__Right__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2822:1: ( ( ruleEString ) )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2823:1: ( ruleEString )
            {
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2823:1: ( ruleEString )
            // ../emfviews.dsl.ui/src-gen/emfviews/dsl/ui/contentassist/antlr/internal/InternalSqlview.g:2824:1: ruleEString
            {
             before(grammarAccess.getRightAccess().getValueEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Right__ValueAssignment_15662);
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
    public static final BitSet FOLLOW_ruleFrom_in_entryRuleFrom301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrom308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0_in_ruleFrom334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_in_ruleAttribute394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_in_ruleClass454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelName_in_entryRuleMetamodelName481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelName488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelName__NameAssignment_in_ruleMetamodelName514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_entryRuleLeft661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeft668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__0_in_ruleLeft694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRight_in_entryRuleRight721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRight728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Alternatives_in_ruleRight754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__SelectAssignment_0_in_rule__Select__Alternatives850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1__0_in_rule__Select__Alternatives868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Condition__Alternatives_1_0902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Condition__Alternatives_1_0922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Comparison__Alternatives_1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Comparison__Alternatives_1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Comparison__Alternatives_1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Comparison__Alternatives_11017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Comparison__Alternatives_11037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Comparison__Alternatives_11057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group_0__0_in_rule__Right__Alternatives1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__ValueAssignment_1_in_rule__Right__Alternatives1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__0__Impl1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11251 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ViewNameAssignment_1_in_rule__Model__Group__1__Impl1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21311 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__2__Impl1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31373 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41433 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl1463 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExpressionAssignment_5_in_rule__Model__Group__5__Impl1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__01563 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__01566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group_4__0__Impl1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__11625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_4_1_in_rule__Model__Group_4__1__Impl1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__Group__0__Impl_in_rule__Metamodel__Group__01686 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Metamodel__Group__1_in_rule__Metamodel__Group__01689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__MetamodelURLAssignment_0_in_rule__Metamodel__Group__0__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__Group__1__Impl_in_rule__Metamodel__Group__11746 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Metamodel__Group__2_in_rule__Metamodel__Group__11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Metamodel__Group__1__Impl1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__Group__2__Impl_in_rule__Metamodel__Group__21808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__MetamodelNameAssignment_2_in_rule__Metamodel__Group__2__Impl1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__01871 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__01874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Expression__Group__0__Impl1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__11933 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__11936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__SelectAssignment_1_in_rule__Expression__Group__1__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__21993 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Expression__Group__3_in_rule__Expression__Group__21996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Expression__Group__2__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__3__Impl_in_rule__Expression__Group__32055 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Expression__Group__4_in_rule__Expression__Group__32058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__FromAssignment_3_in_rule__Expression__Group__3__Impl2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__4__Impl_in_rule__Expression__Group__42115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Expression__Group__5_in_rule__Expression__Group__42118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Expression__Group__4__Impl2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__5__Impl_in_rule__Expression__Group__52177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ConditionAssignment_5_in_rule__Expression__Group__5__Impl2206 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Expression__ConditionAssignment_5_in_rule__Expression__Group__5__Impl2218 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Select__Group_1__0__Impl_in_rule__Select__Group_1__02263 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Select__Group_1__1_in_rule__Select__Group_1__02266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__MetamodelAssignment_1_0_in_rule__Select__Group_1__0__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1__1__Impl_in_rule__Select__Group_1__12323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Select__Group_1__2_in_rule__Select__Group_1__12326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Select__Group_1__1__Impl2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1__2__Impl_in_rule__Select__Group_1__22385 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Select__Group_1__3_in_rule__Select__Group_1__22388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__ClassAssignment_1_2_in_rule__Select__Group_1__2__Impl2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1__3__Impl_in_rule__Select__Group_1__32445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Select__Group_1__4_in_rule__Select__Group_1__32448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Select__Group_1__3__Impl2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1__4__Impl_in_rule__Select__Group_1__42507 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Select__Group_1__5_in_rule__Select__Group_1__42510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__AttributeAssignment_1_4_in_rule__Select__Group_1__4__Impl2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1__5__Impl_in_rule__Select__Group_1__52567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1_5__0_in_rule__Select__Group_1__5__Impl2594 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Select__Group_1_5__0__Impl_in_rule__Select__Group_1_5__02637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Select__Group_1_5__1_in_rule__Select__Group_1_5__02640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Select__Group_1_5__0__Impl2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1_5__1__Impl_in_rule__Select__Group_1_5__12699 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Select__Group_1_5__2_in_rule__Select__Group_1_5__12702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__MetamodelAssignment_1_5_1_in_rule__Select__Group_1_5__1__Impl2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1_5__2__Impl_in_rule__Select__Group_1_5__22759 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Select__Group_1_5__3_in_rule__Select__Group_1_5__22762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Select__Group_1_5__2__Impl2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1_5__3__Impl_in_rule__Select__Group_1_5__32821 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Select__Group_1_5__4_in_rule__Select__Group_1_5__32824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__ClassAssignment_1_5_3_in_rule__Select__Group_1_5__3__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1_5__4__Impl_in_rule__Select__Group_1_5__42881 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Select__Group_1_5__5_in_rule__Select__Group_1_5__42884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Select__Group_1_5__4__Impl2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_1_5__5__Impl_in_rule__Select__Group_1_5__52943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__AttributeAssignment_1_5_5_in_rule__Select__Group_1_5__5__Impl2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__03012 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__From__Group__1_in_rule__From__Group__03015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__MetamodelAssignment_0_in_rule__From__Group__0__Impl3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__13072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__From__Group__2_in_rule__From__Group__13075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__From__Group__1__Impl3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__2__Impl_in_rule__From__Group__23134 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__From__Group__3_in_rule__From__Group__23137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__ClassAssignment_2_in_rule__From__Group__2__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__3__Impl_in_rule__From__Group__33194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group_3__0_in_rule__From__Group__3__Impl3221 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__From__Group_3__0__Impl_in_rule__From__Group_3__03260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__From__Group_3__1_in_rule__From__Group_3__03263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__From__Group_3__0__Impl3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group_3__1__Impl_in_rule__From__Group_3__13322 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__From__Group_3__2_in_rule__From__Group_3__13325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__MetamodelAssignment_3_1_in_rule__From__Group_3__1__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group_3__2__Impl_in_rule__From__Group_3__23382 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__From__Group_3__3_in_rule__From__Group_3__23385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__From__Group_3__2__Impl3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group_3__3__Impl_in_rule__From__Group_3__33444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__ClassAssignment_3_3_in_rule__From__Group_3__3__Impl3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__03509 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__03512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ValueAssignment_0_in_rule__Condition__Group__0__Impl3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__13569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_1__0_in_rule__Condition__Group__1__Impl3596 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Condition__Group_1__0__Impl_in_rule__Condition__Group_1__03631 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Condition__Group_1__1_in_rule__Condition__Group_1__03634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Alternatives_1_0_in_rule__Condition__Group_1__0__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_1__1__Impl_in_rule__Condition__Group_1__13691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ValueAssignment_1_1_in_rule__Condition__Group_1__1__Impl3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__03752 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__03755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__LeftAssignment_0_in_rule__Comparison__Group__0__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__13812 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__13815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Alternatives_1_in_rule__Comparison__Group__1__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__23872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_2_in_rule__Comparison__Group__2__Impl3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__0__Impl_in_rule__Left__Group__03935 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Left__Group__1_in_rule__Left__Group__03938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__MetamodelAssignment_0_in_rule__Left__Group__0__Impl3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__1__Impl_in_rule__Left__Group__13995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Left__Group__2_in_rule__Left__Group__13998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Left__Group__1__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__2__Impl_in_rule__Left__Group__24057 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Left__Group__3_in_rule__Left__Group__24060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__ClassAssignment_2_in_rule__Left__Group__2__Impl4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__3__Impl_in_rule__Left__Group__34117 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Left__Group__4_in_rule__Left__Group__34120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Left__Group__3__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__4__Impl_in_rule__Left__Group__44179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__AttributeWhereLeftAssignment_4_in_rule__Left__Group__4__Impl4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group_0__0__Impl_in_rule__Right__Group_0__04246 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Right__Group_0__1_in_rule__Right__Group_0__04249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__MetamodelAssignment_0_0_in_rule__Right__Group_0__0__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group_0__1__Impl_in_rule__Right__Group_0__14306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Right__Group_0__2_in_rule__Right__Group_0__14309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Right__Group_0__1__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group_0__2__Impl_in_rule__Right__Group_0__24368 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Right__Group_0__3_in_rule__Right__Group_0__24371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__ClassAssignment_0_2_in_rule__Right__Group_0__2__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group_0__3__Impl_in_rule__Right__Group_0__34428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Right__Group_0__4_in_rule__Right__Group_0__34431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Right__Group_0__3__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group_0__4__Impl_in_rule__Right__Group_0__44490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__AttributeWhereRightAssignment_0_4_in_rule__Right__Group_0__4__Impl4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__ViewNameAssignment_14562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_34593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_4_14624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Model__ExpressionAssignment_54655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Metamodel__MetamodelURLAssignment_04686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelName_in_rule__Metamodel__MetamodelNameAssignment_24717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_rule__Expression__SelectAssignment_14748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_rule__Expression__FromAssignment_34779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Expression__ConditionAssignment_54810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Select__SelectAssignment_04846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Select__MetamodelAssignment_1_04889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Select__ClassAssignment_1_24924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Select__AttributeAssignment_1_44955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Select__MetamodelAssignment_1_5_14990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Select__ClassAssignment_1_5_35025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Select__AttributeAssignment_1_5_55056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__From__MetamodelAssignment_05091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__From__ClassAssignment_25126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__From__MetamodelAssignment_3_15161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__From__ClassAssignment_3_35196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MetamodelName__NameAssignment5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Condition__ValueAssignment_05320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Condition__ValueAssignment_1_15351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_rule__Comparison__LeftAssignment_05382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRight_in_rule__Comparison__RightAssignment_25413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Left__MetamodelAssignment_05448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Left__ClassAssignment_25487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Left__AttributeWhereLeftAssignment_45522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Right__MetamodelAssignment_0_05557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Right__ClassAssignment_0_25596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Right__AttributeWhereRightAssignment_0_45631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Right__ValueAssignment_15662 = new BitSet(new long[]{0x0000000000000002L});

}