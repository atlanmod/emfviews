package monoge.dsl.ui.contentassist.antlr.internal; 

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
import monoge.dsl.services.ExtensionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExtensionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*..1'", "'0..1'", "'1..1'", "'1..*'", "'*..*'", "'*'", "'0..*'", "'composition'", "'association'", "'define'", "'extending'", "':'", "'{'", "'}'", "','", "'add class'", "'specializing'", "'.'", "'supertyping'", "'modify class'", "'add property'", "'type'", "'modify property'", "'='", "'filter property'", "'filter class'", "'add constraint'", "'filter constraint'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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
    public String getGrammarFileName() { return "../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g"; }


     
     	private ExtensionGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExtensionGrammarAccess grammarAccess) {
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:61:1: ( ruleModel EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:62:1: ruleModel EOF
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:76:1: ( rule__Model__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:76:2: rule__Model__Group__0
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


    // $ANTLR start "entryRuleExtension"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:88:1: entryRuleExtension : ruleExtension EOF ;
    public final void entryRuleExtension() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:89:1: ( ruleExtension EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:90:1: ruleExtension EOF
            {
             before(grammarAccess.getExtensionRule()); 
            pushFollow(FOLLOW_ruleExtension_in_entryRuleExtension121);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getExtensionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtension128); 

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
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:97:1: ruleExtension : ( ( rule__Extension__Alternatives ) ) ;
    public final void ruleExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:101:2: ( ( ( rule__Extension__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:102:1: ( ( rule__Extension__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:102:1: ( ( rule__Extension__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:103:1: ( rule__Extension__Alternatives )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:104:1: ( rule__Extension__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:104:2: rule__Extension__Alternatives
            {
            pushFollow(FOLLOW_rule__Extension__Alternatives_in_ruleExtension154);
            rule__Extension__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleMetamodel"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:116:1: entryRuleMetamodel : ruleMetamodel EOF ;
    public final void entryRuleMetamodel() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:117:1: ( ruleMetamodel EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:118:1: ruleMetamodel EOF
            {
             before(grammarAccess.getMetamodelRule()); 
            pushFollow(FOLLOW_ruleMetamodel_in_entryRuleMetamodel181);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getMetamodelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodel188); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:125:1: ruleMetamodel : ( ( rule__Metamodel__NameAssignment ) ) ;
    public final void ruleMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:129:2: ( ( ( rule__Metamodel__NameAssignment ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:130:1: ( ( rule__Metamodel__NameAssignment ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:130:1: ( ( rule__Metamodel__NameAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:131:1: ( rule__Metamodel__NameAssignment )
            {
             before(grammarAccess.getMetamodelAccess().getNameAssignment()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:132:1: ( rule__Metamodel__NameAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:132:2: rule__Metamodel__NameAssignment
            {
            pushFollow(FOLLOW_rule__Metamodel__NameAssignment_in_ruleMetamodel214);
            rule__Metamodel__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelAccess().getNameAssignment()); 

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


    // $ANTLR start "entryRulePrefix"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:144:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:145:1: ( rulePrefix EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:146:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix241);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix248); 

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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:153:1: rulePrefix : ( ( rule__Prefix__NameAssignment ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:157:2: ( ( ( rule__Prefix__NameAssignment ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:158:1: ( ( rule__Prefix__NameAssignment ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:158:1: ( ( rule__Prefix__NameAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:159:1: ( rule__Prefix__NameAssignment )
            {
             before(grammarAccess.getPrefixAccess().getNameAssignment()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:160:1: ( rule__Prefix__NameAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:160:2: rule__Prefix__NameAssignment
            {
            pushFollow(FOLLOW_rule__Prefix__NameAssignment_in_rulePrefix274);
            rule__Prefix__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getNameAssignment()); 

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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleCreate"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:172:1: entryRuleCreate : ruleCreate EOF ;
    public final void entryRuleCreate() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:173:1: ( ruleCreate EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:174:1: ruleCreate EOF
            {
             before(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_ruleCreate_in_entryRuleCreate301);
            ruleCreate();

            state._fsp--;

             after(grammarAccess.getCreateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreate308); 

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
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:181:1: ruleCreate : ( ( rule__Create__Group__0 ) ) ;
    public final void ruleCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:185:2: ( ( ( rule__Create__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:186:1: ( ( rule__Create__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:186:1: ( ( rule__Create__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:187:1: ( rule__Create__Group__0 )
            {
             before(grammarAccess.getCreateAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:188:1: ( rule__Create__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:188:2: rule__Create__Group__0
            {
            pushFollow(FOLLOW_rule__Create__Group__0_in_ruleCreate334);
            rule__Create__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getGroup()); 

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
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleRefine"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:200:1: entryRuleRefine : ruleRefine EOF ;
    public final void entryRuleRefine() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:201:1: ( ruleRefine EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:202:1: ruleRefine EOF
            {
             before(grammarAccess.getRefineRule()); 
            pushFollow(FOLLOW_ruleRefine_in_entryRuleRefine361);
            ruleRefine();

            state._fsp--;

             after(grammarAccess.getRefineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefine368); 

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
    // $ANTLR end "entryRuleRefine"


    // $ANTLR start "ruleRefine"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:209:1: ruleRefine : ( ( rule__Refine__Group__0 ) ) ;
    public final void ruleRefine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:213:2: ( ( ( rule__Refine__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:214:1: ( ( rule__Refine__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:214:1: ( ( rule__Refine__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:215:1: ( rule__Refine__Group__0 )
            {
             before(grammarAccess.getRefineAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:216:1: ( rule__Refine__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:216:2: rule__Refine__Group__0
            {
            pushFollow(FOLLOW_rule__Refine__Group__0_in_ruleRefine394);
            rule__Refine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefineAccess().getGroup()); 

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
    // $ANTLR end "ruleRefine"


    // $ANTLR start "entryRuleGeneralize"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:228:1: entryRuleGeneralize : ruleGeneralize EOF ;
    public final void entryRuleGeneralize() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:229:1: ( ruleGeneralize EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:230:1: ruleGeneralize EOF
            {
             before(grammarAccess.getGeneralizeRule()); 
            pushFollow(FOLLOW_ruleGeneralize_in_entryRuleGeneralize421);
            ruleGeneralize();

            state._fsp--;

             after(grammarAccess.getGeneralizeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralize428); 

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
    // $ANTLR end "entryRuleGeneralize"


    // $ANTLR start "ruleGeneralize"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:237:1: ruleGeneralize : ( ( rule__Generalize__Group__0 ) ) ;
    public final void ruleGeneralize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:241:2: ( ( ( rule__Generalize__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:242:1: ( ( rule__Generalize__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:242:1: ( ( rule__Generalize__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:243:1: ( rule__Generalize__Group__0 )
            {
             before(grammarAccess.getGeneralizeAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:244:1: ( rule__Generalize__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:244:2: rule__Generalize__Group__0
            {
            pushFollow(FOLLOW_rule__Generalize__Group__0_in_ruleGeneralize454);
            rule__Generalize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizeAccess().getGroup()); 

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
    // $ANTLR end "ruleGeneralize"


    // $ANTLR start "entryRuleModifyClass"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:256:1: entryRuleModifyClass : ruleModifyClass EOF ;
    public final void entryRuleModifyClass() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:257:1: ( ruleModifyClass EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:258:1: ruleModifyClass EOF
            {
             before(grammarAccess.getModifyClassRule()); 
            pushFollow(FOLLOW_ruleModifyClass_in_entryRuleModifyClass481);
            ruleModifyClass();

            state._fsp--;

             after(grammarAccess.getModifyClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyClass488); 

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
    // $ANTLR end "entryRuleModifyClass"


    // $ANTLR start "ruleModifyClass"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:265:1: ruleModifyClass : ( ( rule__ModifyClass__Group__0 ) ) ;
    public final void ruleModifyClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:269:2: ( ( ( rule__ModifyClass__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:270:1: ( ( rule__ModifyClass__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:270:1: ( ( rule__ModifyClass__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:271:1: ( rule__ModifyClass__Group__0 )
            {
             before(grammarAccess.getModifyClassAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:272:1: ( rule__ModifyClass__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:272:2: rule__ModifyClass__Group__0
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__0_in_ruleModifyClass514);
            rule__ModifyClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifyClassAccess().getGroup()); 

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
    // $ANTLR end "ruleModifyClass"


    // $ANTLR start "entryRuleModifyOperator"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:284:1: entryRuleModifyOperator : ruleModifyOperator EOF ;
    public final void entryRuleModifyOperator() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:285:1: ( ruleModifyOperator EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:286:1: ruleModifyOperator EOF
            {
             before(grammarAccess.getModifyOperatorRule()); 
            pushFollow(FOLLOW_ruleModifyOperator_in_entryRuleModifyOperator541);
            ruleModifyOperator();

            state._fsp--;

             after(grammarAccess.getModifyOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyOperator548); 

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
    // $ANTLR end "entryRuleModifyOperator"


    // $ANTLR start "ruleModifyOperator"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:293:1: ruleModifyOperator : ( ( rule__ModifyOperator__Alternatives ) ) ;
    public final void ruleModifyOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:297:2: ( ( ( rule__ModifyOperator__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:298:1: ( ( rule__ModifyOperator__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:298:1: ( ( rule__ModifyOperator__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:299:1: ( rule__ModifyOperator__Alternatives )
            {
             before(grammarAccess.getModifyOperatorAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:300:1: ( rule__ModifyOperator__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:300:2: rule__ModifyOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ModifyOperator__Alternatives_in_ruleModifyOperator574);
            rule__ModifyOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModifyOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModifyOperator"


    // $ANTLR start "entryRuleAddProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:312:1: entryRuleAddProperty : ruleAddProperty EOF ;
    public final void entryRuleAddProperty() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:313:1: ( ruleAddProperty EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:314:1: ruleAddProperty EOF
            {
             before(grammarAccess.getAddPropertyRule()); 
            pushFollow(FOLLOW_ruleAddProperty_in_entryRuleAddProperty601);
            ruleAddProperty();

            state._fsp--;

             after(grammarAccess.getAddPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddProperty608); 

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
    // $ANTLR end "entryRuleAddProperty"


    // $ANTLR start "ruleAddProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:321:1: ruleAddProperty : ( ( rule__AddProperty__Group__0 ) ) ;
    public final void ruleAddProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:325:2: ( ( ( rule__AddProperty__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:326:1: ( ( rule__AddProperty__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:326:1: ( ( rule__AddProperty__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:327:1: ( rule__AddProperty__Group__0 )
            {
             before(grammarAccess.getAddPropertyAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:328:1: ( rule__AddProperty__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:328:2: rule__AddProperty__Group__0
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__0_in_ruleAddProperty634);
            rule__AddProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleAddProperty"


    // $ANTLR start "entryRuleType"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:340:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:341:1: ( ruleType EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:342:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType661);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType668); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:349:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:353:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:354:1: ( ( rule__Type__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:354:1: ( ( rule__Type__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:355:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:356:1: ( rule__Type__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:356:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType694);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleModifyProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:368:1: entryRuleModifyProperty : ruleModifyProperty EOF ;
    public final void entryRuleModifyProperty() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:369:1: ( ruleModifyProperty EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:370:1: ruleModifyProperty EOF
            {
             before(grammarAccess.getModifyPropertyRule()); 
            pushFollow(FOLLOW_ruleModifyProperty_in_entryRuleModifyProperty721);
            ruleModifyProperty();

            state._fsp--;

             after(grammarAccess.getModifyPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyProperty728); 

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
    // $ANTLR end "entryRuleModifyProperty"


    // $ANTLR start "ruleModifyProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:377:1: ruleModifyProperty : ( ( rule__ModifyProperty__Group__0 ) ) ;
    public final void ruleModifyProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:381:2: ( ( ( rule__ModifyProperty__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:382:1: ( ( rule__ModifyProperty__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:382:1: ( ( rule__ModifyProperty__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:383:1: ( rule__ModifyProperty__Group__0 )
            {
             before(grammarAccess.getModifyPropertyAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:384:1: ( rule__ModifyProperty__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:384:2: rule__ModifyProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__0_in_ruleModifyProperty754);
            rule__ModifyProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifyPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleModifyProperty"


    // $ANTLR start "entryRuleValueAssignment"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:396:1: entryRuleValueAssignment : ruleValueAssignment EOF ;
    public final void entryRuleValueAssignment() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:397:1: ( ruleValueAssignment EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:398:1: ruleValueAssignment EOF
            {
             before(grammarAccess.getValueAssignmentRule()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment781);
            ruleValueAssignment();

            state._fsp--;

             after(grammarAccess.getValueAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueAssignment788); 

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
    // $ANTLR end "entryRuleValueAssignment"


    // $ANTLR start "ruleValueAssignment"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:405:1: ruleValueAssignment : ( ( rule__ValueAssignment__Group__0 ) ) ;
    public final void ruleValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:409:2: ( ( ( rule__ValueAssignment__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:410:1: ( ( rule__ValueAssignment__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:410:1: ( ( rule__ValueAssignment__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:411:1: ( rule__ValueAssignment__Group__0 )
            {
             before(grammarAccess.getValueAssignmentAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:412:1: ( rule__ValueAssignment__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:412:2: rule__ValueAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__0_in_ruleValueAssignment814);
            rule__ValueAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleValueAssignment"


    // $ANTLR start "entryRuleFilterProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:424:1: entryRuleFilterProperty : ruleFilterProperty EOF ;
    public final void entryRuleFilterProperty() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:425:1: ( ruleFilterProperty EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:426:1: ruleFilterProperty EOF
            {
             before(grammarAccess.getFilterPropertyRule()); 
            pushFollow(FOLLOW_ruleFilterProperty_in_entryRuleFilterProperty841);
            ruleFilterProperty();

            state._fsp--;

             after(grammarAccess.getFilterPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterProperty848); 

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
    // $ANTLR end "entryRuleFilterProperty"


    // $ANTLR start "ruleFilterProperty"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:433:1: ruleFilterProperty : ( ( rule__FilterProperty__Group__0 ) ) ;
    public final void ruleFilterProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:437:2: ( ( ( rule__FilterProperty__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:438:1: ( ( rule__FilterProperty__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:438:1: ( ( rule__FilterProperty__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:439:1: ( rule__FilterProperty__Group__0 )
            {
             before(grammarAccess.getFilterPropertyAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:440:1: ( rule__FilterProperty__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:440:2: rule__FilterProperty__Group__0
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__0_in_ruleFilterProperty874);
            rule__FilterProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleFilterProperty"


    // $ANTLR start "entryRuleFilterClass"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:452:1: entryRuleFilterClass : ruleFilterClass EOF ;
    public final void entryRuleFilterClass() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:453:1: ( ruleFilterClass EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:454:1: ruleFilterClass EOF
            {
             before(grammarAccess.getFilterClassRule()); 
            pushFollow(FOLLOW_ruleFilterClass_in_entryRuleFilterClass901);
            ruleFilterClass();

            state._fsp--;

             after(grammarAccess.getFilterClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterClass908); 

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
    // $ANTLR end "entryRuleFilterClass"


    // $ANTLR start "ruleFilterClass"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:461:1: ruleFilterClass : ( ( rule__FilterClass__Group__0 ) ) ;
    public final void ruleFilterClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:465:2: ( ( ( rule__FilterClass__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:466:1: ( ( rule__FilterClass__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:466:1: ( ( rule__FilterClass__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:467:1: ( rule__FilterClass__Group__0 )
            {
             before(grammarAccess.getFilterClassAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:468:1: ( rule__FilterClass__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:468:2: rule__FilterClass__Group__0
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__0_in_ruleFilterClass934);
            rule__FilterClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterClassAccess().getGroup()); 

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
    // $ANTLR end "ruleFilterClass"


    // $ANTLR start "entryRuleAddConstraint"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:480:1: entryRuleAddConstraint : ruleAddConstraint EOF ;
    public final void entryRuleAddConstraint() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:481:1: ( ruleAddConstraint EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:482:1: ruleAddConstraint EOF
            {
             before(grammarAccess.getAddConstraintRule()); 
            pushFollow(FOLLOW_ruleAddConstraint_in_entryRuleAddConstraint961);
            ruleAddConstraint();

            state._fsp--;

             after(grammarAccess.getAddConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddConstraint968); 

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
    // $ANTLR end "entryRuleAddConstraint"


    // $ANTLR start "ruleAddConstraint"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:489:1: ruleAddConstraint : ( ( rule__AddConstraint__Group__0 ) ) ;
    public final void ruleAddConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:493:2: ( ( ( rule__AddConstraint__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:494:1: ( ( rule__AddConstraint__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:494:1: ( ( rule__AddConstraint__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:495:1: ( rule__AddConstraint__Group__0 )
            {
             before(grammarAccess.getAddConstraintAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:496:1: ( rule__AddConstraint__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:496:2: rule__AddConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__0_in_ruleAddConstraint994);
            rule__AddConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleAddConstraint"


    // $ANTLR start "entryRuleFilterConstraint"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:508:1: entryRuleFilterConstraint : ruleFilterConstraint EOF ;
    public final void entryRuleFilterConstraint() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:509:1: ( ruleFilterConstraint EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:510:1: ruleFilterConstraint EOF
            {
             before(grammarAccess.getFilterConstraintRule()); 
            pushFollow(FOLLOW_ruleFilterConstraint_in_entryRuleFilterConstraint1021);
            ruleFilterConstraint();

            state._fsp--;

             after(grammarAccess.getFilterConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterConstraint1028); 

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
    // $ANTLR end "entryRuleFilterConstraint"


    // $ANTLR start "ruleFilterConstraint"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:517:1: ruleFilterConstraint : ( ( rule__FilterConstraint__Group__0 ) ) ;
    public final void ruleFilterConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:521:2: ( ( ( rule__FilterConstraint__Group__0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:522:1: ( ( rule__FilterConstraint__Group__0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:522:1: ( ( rule__FilterConstraint__Group__0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:523:1: ( rule__FilterConstraint__Group__0 )
            {
             before(grammarAccess.getFilterConstraintAccess().getGroup()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:524:1: ( rule__FilterConstraint__Group__0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:524:2: rule__FilterConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__0_in_ruleFilterConstraint1054);
            rule__FilterConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleFilterConstraint"


    // $ANTLR start "entryRuleCardinality"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:536:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:537:1: ( ruleCardinality EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:538:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1081);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1088); 

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:545:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:549:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:550:1: ( ( rule__Cardinality__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:550:1: ( ( rule__Cardinality__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:551:1: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:552:1: ( rule__Cardinality__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:552:2: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality1114);
            rule__Cardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleRelationType"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:564:1: entryRuleRelationType : ruleRelationType EOF ;
    public final void entryRuleRelationType() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:565:1: ( ruleRelationType EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:566:1: ruleRelationType EOF
            {
             before(grammarAccess.getRelationTypeRule()); 
            pushFollow(FOLLOW_ruleRelationType_in_entryRuleRelationType1141);
            ruleRelationType();

            state._fsp--;

             after(grammarAccess.getRelationTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationType1148); 

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
    // $ANTLR end "entryRuleRelationType"


    // $ANTLR start "ruleRelationType"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:573:1: ruleRelationType : ( ( rule__RelationType__Alternatives ) ) ;
    public final void ruleRelationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:577:2: ( ( ( rule__RelationType__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:578:1: ( ( rule__RelationType__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:578:1: ( ( rule__RelationType__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:579:1: ( rule__RelationType__Alternatives )
            {
             before(grammarAccess.getRelationTypeAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:580:1: ( rule__RelationType__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:580:2: rule__RelationType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1174);
            rule__RelationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "entryRuleEString"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:592:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:593:1: ( ruleEString EOF )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:594:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1201);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1208); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:601:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:605:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:606:1: ( ( rule__EString__Alternatives ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:606:1: ( ( rule__EString__Alternatives ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:607:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:608:1: ( rule__EString__Alternatives )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:608:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString1234);
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


    // $ANTLR start "rule__Extension__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:620:1: rule__Extension__Alternatives : ( ( ruleCreate ) | ( ruleRefine ) | ( ruleGeneralize ) | ( ruleModifyClass ) | ( ruleFilterClass ) );
    public final void rule__Extension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:624:1: ( ( ruleCreate ) | ( ruleRefine ) | ( ruleGeneralize ) | ( ruleModifyClass ) | ( ruleFilterClass ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 27:
                        {
                        alt1=2;
                        }
                        break;
                    case EOF:
                    case 24:
                    case 26:
                    case 30:
                    case 36:
                        {
                        alt1=1;
                        }
                        break;
                    case 29:
                        {
                        alt1=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 4, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            case 36:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:625:1: ( ruleCreate )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:625:1: ( ruleCreate )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:626:1: ruleCreate
                    {
                     before(grammarAccess.getExtensionAccess().getCreateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCreate_in_rule__Extension__Alternatives1270);
                    ruleCreate();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getCreateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:631:6: ( ruleRefine )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:631:6: ( ruleRefine )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:632:1: ruleRefine
                    {
                     before(grammarAccess.getExtensionAccess().getRefineParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRefine_in_rule__Extension__Alternatives1287);
                    ruleRefine();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getRefineParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:637:6: ( ruleGeneralize )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:637:6: ( ruleGeneralize )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:638:1: ruleGeneralize
                    {
                     before(grammarAccess.getExtensionAccess().getGeneralizeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGeneralize_in_rule__Extension__Alternatives1304);
                    ruleGeneralize();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getGeneralizeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:643:6: ( ruleModifyClass )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:643:6: ( ruleModifyClass )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:644:1: ruleModifyClass
                    {
                     before(grammarAccess.getExtensionAccess().getModifyClassParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleModifyClass_in_rule__Extension__Alternatives1321);
                    ruleModifyClass();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getModifyClassParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:649:6: ( ruleFilterClass )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:649:6: ( ruleFilterClass )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:650:1: ruleFilterClass
                    {
                     before(grammarAccess.getExtensionAccess().getFilterClassParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleFilterClass_in_rule__Extension__Alternatives1338);
                    ruleFilterClass();

                    state._fsp--;

                     after(grammarAccess.getExtensionAccess().getFilterClassParserRuleCall_4()); 

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
    // $ANTLR end "rule__Extension__Alternatives"


    // $ANTLR start "rule__ModifyOperator__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:660:1: rule__ModifyOperator__Alternatives : ( ( ruleAddProperty ) | ( ruleModifyProperty ) | ( ruleFilterProperty ) | ( ruleAddConstraint ) | ( ruleFilterConstraint ) );
    public final void rule__ModifyOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:664:1: ( ( ruleAddProperty ) | ( ruleModifyProperty ) | ( ruleFilterProperty ) | ( ruleAddConstraint ) | ( ruleFilterConstraint ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            case 38:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:665:1: ( ruleAddProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:665:1: ( ruleAddProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:666:1: ruleAddProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getAddPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAddProperty_in_rule__ModifyOperator__Alternatives1370);
                    ruleAddProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getAddPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:671:6: ( ruleModifyProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:671:6: ( ruleModifyProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:672:1: ruleModifyProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleModifyProperty_in_rule__ModifyOperator__Alternatives1387);
                    ruleModifyProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:677:6: ( ruleFilterProperty )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:677:6: ( ruleFilterProperty )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:678:1: ruleFilterProperty
                    {
                     before(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFilterProperty_in_rule__ModifyOperator__Alternatives1404);
                    ruleFilterProperty();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:683:6: ( ruleAddConstraint )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:683:6: ( ruleAddConstraint )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:684:1: ruleAddConstraint
                    {
                     before(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAddConstraint_in_rule__ModifyOperator__Alternatives1421);
                    ruleAddConstraint();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:689:6: ( ruleFilterConstraint )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:689:6: ( ruleFilterConstraint )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:690:1: ruleFilterConstraint
                    {
                     before(grammarAccess.getModifyOperatorAccess().getFilterConstraintParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleFilterConstraint_in_rule__ModifyOperator__Alternatives1438);
                    ruleFilterConstraint();

                    state._fsp--;

                     after(grammarAccess.getModifyOperatorAccess().getFilterConstraintParserRuleCall_4()); 

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
    // $ANTLR end "rule__ModifyOperator__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:700:1: rule__Type__Alternatives : ( ( ( rule__Type__TypeAssignment_0 ) ) | ( ( rule__Type__Group_1__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:704:1: ( ( ( rule__Type__TypeAssignment_0 ) ) | ( ( rule__Type__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=11 && LA3_1<=19)||LA3_1==24||LA3_1==31||LA3_1==33||LA3_1==35||(LA3_1>=37 && LA3_1<=38)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==28) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:705:1: ( ( rule__Type__TypeAssignment_0 ) )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:705:1: ( ( rule__Type__TypeAssignment_0 ) )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:706:1: ( rule__Type__TypeAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_0()); 
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:707:1: ( rule__Type__TypeAssignment_0 )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:707:2: rule__Type__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__TypeAssignment_0_in_rule__Type__Alternatives1470);
                    rule__Type__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:711:6: ( ( rule__Type__Group_1__0 ) )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:711:6: ( ( rule__Type__Group_1__0 ) )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:712:1: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:713:1: ( rule__Type__Group_1__0 )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:713:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1488);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:722:1: rule__Cardinality__Alternatives : ( ( '*..1' ) | ( '0..1' ) | ( '1..1' ) | ( '1..*' ) | ( '*..*' ) | ( '*' ) | ( '0..*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:726:1: ( ( '*..1' ) | ( '0..1' ) | ( '1..1' ) | ( '1..*' ) | ( '*..*' ) | ( '*' ) | ( '0..*' ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:727:1: ( '*..1' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:727:1: ( '*..1' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:728:1: '*..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Cardinality__Alternatives1522); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:735:6: ( '0..1' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:735:6: ( '0..1' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:736:1: '0..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Cardinality__Alternatives1542); 
                     after(grammarAccess.getCardinalityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:743:6: ( '1..1' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:743:6: ( '1..1' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:744:1: '1..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Cardinality__Alternatives1562); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:751:6: ( '1..*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:751:6: ( '1..*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:752:1: '1..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Cardinality__Alternatives1582); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:759:6: ( '*..*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:759:6: ( '*..*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:760:1: '*..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Cardinality__Alternatives1602); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:767:6: ( '*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:767:6: ( '*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:768:1: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__Cardinality__Alternatives1622); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:775:6: ( '0..*' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:775:6: ( '0..*' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:776:1: '0..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_6()); 
                    match(input,17,FOLLOW_17_in_rule__Cardinality__Alternatives1642); 
                     after(grammarAccess.getCardinalityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_6()); 

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
    // $ANTLR end "rule__Cardinality__Alternatives"


    // $ANTLR start "rule__RelationType__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:788:1: rule__RelationType__Alternatives : ( ( 'composition' ) | ( 'association' ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:792:1: ( ( 'composition' ) | ( 'association' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:793:1: ( 'composition' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:793:1: ( 'composition' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:794:1: 'composition'
                    {
                     before(grammarAccess.getRelationTypeAccess().getCompositionKeyword_0()); 
                    match(input,18,FOLLOW_18_in_rule__RelationType__Alternatives1677); 
                     after(grammarAccess.getRelationTypeAccess().getCompositionKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:801:6: ( 'association' )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:801:6: ( 'association' )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:802:1: 'association'
                    {
                     before(grammarAccess.getRelationTypeAccess().getAssociationKeyword_1()); 
                    match(input,19,FOLLOW_19_in_rule__RelationType__Alternatives1697); 
                     after(grammarAccess.getRelationTypeAccess().getAssociationKeyword_1()); 

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
    // $ANTLR end "rule__RelationType__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:814:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:818:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:819:1: ( RULE_STRING )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:819:1: ( RULE_STRING )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:820:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1731); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:825:6: ( RULE_ID )
                    {
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:825:6: ( RULE_ID )
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:826:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1748); 
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:838:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:842:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:843:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01778);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01781);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:850:1: rule__Model__Group__0__Impl : ( 'define' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:854:1: ( ( 'define' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:855:1: ( 'define' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:855:1: ( 'define' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:856:1: 'define'
            {
             before(grammarAccess.getModelAccess().getDefineKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__0__Impl1809); 
             after(grammarAccess.getModelAccess().getDefineKeyword_0()); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:869:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:873:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:874:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11840);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11843);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:881:1: rule__Model__Group__1__Impl : ( ( rule__Model__ExtensionNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:885:1: ( ( ( rule__Model__ExtensionNameAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:886:1: ( ( rule__Model__ExtensionNameAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:886:1: ( ( rule__Model__ExtensionNameAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:887:1: ( rule__Model__ExtensionNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getExtensionNameAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:888:1: ( rule__Model__ExtensionNameAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:888:2: rule__Model__ExtensionNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ExtensionNameAssignment_1_in_rule__Model__Group__1__Impl1870);
            rule__Model__ExtensionNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExtensionNameAssignment_1()); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:898:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:902:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:903:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21900);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21903);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:910:1: rule__Model__Group__2__Impl : ( 'extending' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:914:1: ( ( 'extending' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:915:1: ( 'extending' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:915:1: ( 'extending' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:916:1: 'extending'
            {
             before(grammarAccess.getModelAccess().getExtendingKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group__2__Impl1931); 
             after(grammarAccess.getModelAccess().getExtendingKeyword_2()); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:929:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:933:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:934:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31962);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31965);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:941:1: rule__Model__Group__3__Impl : ( ( rule__Model__MetamodelAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:945:1: ( ( ( rule__Model__MetamodelAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:946:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:946:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:947:1: ( rule__Model__MetamodelAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:948:1: ( rule__Model__MetamodelAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:948:2: rule__Model__MetamodelAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl1992);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:958:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:962:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:963:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42022);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42025);
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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:970:1: rule__Model__Group__4__Impl : ( ':' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:974:1: ( ( ':' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:975:1: ( ':' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:975:1: ( ':' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:976:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group__4__Impl2053); 
             after(grammarAccess.getModelAccess().getColonKeyword_4()); 

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:989:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:993:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:994:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52084);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52087);
            rule__Model__Group__6();

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
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1001:1: rule__Model__Group__5__Impl : ( ( rule__Model__PrefixAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1005:1: ( ( ( rule__Model__PrefixAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1006:1: ( ( rule__Model__PrefixAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1006:1: ( ( rule__Model__PrefixAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1007:1: ( rule__Model__PrefixAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1008:1: ( rule__Model__PrefixAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1008:2: rule__Model__PrefixAssignment_5
            {
            pushFollow(FOLLOW_rule__Model__PrefixAssignment_5_in_rule__Model__Group__5__Impl2114);
            rule__Model__PrefixAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPrefixAssignment_5()); 

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


    // $ANTLR start "rule__Model__Group__6"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1018:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1022:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1023:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62144);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62147);
            rule__Model__Group__7();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1030:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1034:1: ( ( ( rule__Model__Group_6__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1035:1: ( ( rule__Model__Group_6__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1035:1: ( ( rule__Model__Group_6__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1036:1: ( rule__Model__Group_6__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1037:1: ( rule__Model__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1037:2: rule__Model__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl2174);
            	    rule__Model__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1047:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1051:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1052:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72205);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__72208);
            rule__Model__Group__8();

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
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1059:1: rule__Model__Group__7__Impl : ( '{' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1063:1: ( ( '{' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1064:1: ( '{' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1064:1: ( '{' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1065:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Model__Group__7__Impl2236); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1078:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1082:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1083:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__82267);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__9_in_rule__Model__Group__82270);
            rule__Model__Group__9();

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
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1090:1: rule__Model__Group__8__Impl : ( ( rule__Model__ExtensionsAssignment_8 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1094:1: ( ( ( rule__Model__ExtensionsAssignment_8 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1095:1: ( ( rule__Model__ExtensionsAssignment_8 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1095:1: ( ( rule__Model__ExtensionsAssignment_8 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1096:1: ( rule__Model__ExtensionsAssignment_8 )*
            {
             before(grammarAccess.getModelAccess().getExtensionsAssignment_8()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1097:1: ( rule__Model__ExtensionsAssignment_8 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26||LA8_0==30||LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1097:2: rule__Model__ExtensionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Model__ExtensionsAssignment_8_in_rule__Model__Group__8__Impl2297);
            	    rule__Model__ExtensionsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getExtensionsAssignment_8()); 

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
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1107:1: rule__Model__Group__9 : rule__Model__Group__9__Impl ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1111:1: ( rule__Model__Group__9__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1112:2: rule__Model__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__92328);
            rule__Model__Group__9__Impl();

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
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1118:1: rule__Model__Group__9__Impl : ( '}' ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1122:1: ( ( '}' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1123:1: ( '}' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1123:1: ( '}' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1124:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_24_in_rule__Model__Group__9__Impl2356); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group_6__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1157:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1161:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1162:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
            {
            pushFollow(FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__02407);
            rule__Model__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__02410);
            rule__Model__Group_6__1();

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
    // $ANTLR end "rule__Model__Group_6__0"


    // $ANTLR start "rule__Model__Group_6__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1169:1: rule__Model__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1173:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1174:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1174:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1175:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_6_0()); 
            match(input,25,FOLLOW_25_in_rule__Model__Group_6__0__Impl2438); 
             after(grammarAccess.getModelAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Model__Group_6__0__Impl"


    // $ANTLR start "rule__Model__Group_6__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1188:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl rule__Model__Group_6__2 ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1192:1: ( rule__Model__Group_6__1__Impl rule__Model__Group_6__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1193:2: rule__Model__Group_6__1__Impl rule__Model__Group_6__2
            {
            pushFollow(FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__12469);
            rule__Model__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__2_in_rule__Model__Group_6__12472);
            rule__Model__Group_6__2();

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
    // $ANTLR end "rule__Model__Group_6__1"


    // $ANTLR start "rule__Model__Group_6__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1200:1: rule__Model__Group_6__1__Impl : ( ( rule__Model__MetamodelAssignment_6_1 ) ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1204:1: ( ( ( rule__Model__MetamodelAssignment_6_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1205:1: ( ( rule__Model__MetamodelAssignment_6_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1205:1: ( ( rule__Model__MetamodelAssignment_6_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1206:1: ( rule__Model__MetamodelAssignment_6_1 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_6_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1207:1: ( rule__Model__MetamodelAssignment_6_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1207:2: rule__Model__MetamodelAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Model__MetamodelAssignment_6_1_in_rule__Model__Group_6__1__Impl2499);
            rule__Model__MetamodelAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMetamodelAssignment_6_1()); 

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
    // $ANTLR end "rule__Model__Group_6__1__Impl"


    // $ANTLR start "rule__Model__Group_6__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1217:1: rule__Model__Group_6__2 : rule__Model__Group_6__2__Impl rule__Model__Group_6__3 ;
    public final void rule__Model__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1221:1: ( rule__Model__Group_6__2__Impl rule__Model__Group_6__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1222:2: rule__Model__Group_6__2__Impl rule__Model__Group_6__3
            {
            pushFollow(FOLLOW_rule__Model__Group_6__2__Impl_in_rule__Model__Group_6__22529);
            rule__Model__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_6__3_in_rule__Model__Group_6__22532);
            rule__Model__Group_6__3();

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
    // $ANTLR end "rule__Model__Group_6__2"


    // $ANTLR start "rule__Model__Group_6__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1229:1: rule__Model__Group_6__2__Impl : ( ':' ) ;
    public final void rule__Model__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1233:1: ( ( ':' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1234:1: ( ':' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1234:1: ( ':' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1235:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_6_2()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group_6__2__Impl2560); 
             after(grammarAccess.getModelAccess().getColonKeyword_6_2()); 

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
    // $ANTLR end "rule__Model__Group_6__2__Impl"


    // $ANTLR start "rule__Model__Group_6__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1248:1: rule__Model__Group_6__3 : rule__Model__Group_6__3__Impl ;
    public final void rule__Model__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1252:1: ( rule__Model__Group_6__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1253:2: rule__Model__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_6__3__Impl_in_rule__Model__Group_6__32591);
            rule__Model__Group_6__3__Impl();

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
    // $ANTLR end "rule__Model__Group_6__3"


    // $ANTLR start "rule__Model__Group_6__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1259:1: rule__Model__Group_6__3__Impl : ( ( rule__Model__PrefixAssignment_6_3 ) ) ;
    public final void rule__Model__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1263:1: ( ( ( rule__Model__PrefixAssignment_6_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1264:1: ( ( rule__Model__PrefixAssignment_6_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1264:1: ( ( rule__Model__PrefixAssignment_6_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1265:1: ( rule__Model__PrefixAssignment_6_3 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_6_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1266:1: ( rule__Model__PrefixAssignment_6_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1266:2: rule__Model__PrefixAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Model__PrefixAssignment_6_3_in_rule__Model__Group_6__3__Impl2618);
            rule__Model__PrefixAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPrefixAssignment_6_3()); 

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
    // $ANTLR end "rule__Model__Group_6__3__Impl"


    // $ANTLR start "rule__Create__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1284:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1288:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1289:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_rule__Create__Group__0__Impl_in_rule__Create__Group__02656);
            rule__Create__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Create__Group__1_in_rule__Create__Group__02659);
            rule__Create__Group__1();

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
    // $ANTLR end "rule__Create__Group__0"


    // $ANTLR start "rule__Create__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1296:1: rule__Create__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1300:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1301:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1301:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1302:1: 'add class'
            {
             before(grammarAccess.getCreateAccess().getAddClassKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Create__Group__0__Impl2687); 
             after(grammarAccess.getCreateAccess().getAddClassKeyword_0()); 

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
    // $ANTLR end "rule__Create__Group__0__Impl"


    // $ANTLR start "rule__Create__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1315:1: rule__Create__Group__1 : rule__Create__Group__1__Impl ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1319:1: ( rule__Create__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1320:2: rule__Create__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Create__Group__1__Impl_in_rule__Create__Group__12718);
            rule__Create__Group__1__Impl();

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
    // $ANTLR end "rule__Create__Group__1"


    // $ANTLR start "rule__Create__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1326:1: rule__Create__Group__1__Impl : ( ( rule__Create__ClassAssignment_1 ) ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1330:1: ( ( ( rule__Create__ClassAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1331:1: ( ( rule__Create__ClassAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1331:1: ( ( rule__Create__ClassAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1332:1: ( rule__Create__ClassAssignment_1 )
            {
             before(grammarAccess.getCreateAccess().getClassAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1333:1: ( rule__Create__ClassAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1333:2: rule__Create__ClassAssignment_1
            {
            pushFollow(FOLLOW_rule__Create__ClassAssignment_1_in_rule__Create__Group__1__Impl2745);
            rule__Create__ClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getClassAssignment_1()); 

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
    // $ANTLR end "rule__Create__Group__1__Impl"


    // $ANTLR start "rule__Refine__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1347:1: rule__Refine__Group__0 : rule__Refine__Group__0__Impl rule__Refine__Group__1 ;
    public final void rule__Refine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1351:1: ( rule__Refine__Group__0__Impl rule__Refine__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1352:2: rule__Refine__Group__0__Impl rule__Refine__Group__1
            {
            pushFollow(FOLLOW_rule__Refine__Group__0__Impl_in_rule__Refine__Group__02779);
            rule__Refine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__1_in_rule__Refine__Group__02782);
            rule__Refine__Group__1();

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
    // $ANTLR end "rule__Refine__Group__0"


    // $ANTLR start "rule__Refine__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1359:1: rule__Refine__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Refine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1363:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1364:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1364:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1365:1: 'add class'
            {
             before(grammarAccess.getRefineAccess().getAddClassKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Refine__Group__0__Impl2810); 
             after(grammarAccess.getRefineAccess().getAddClassKeyword_0()); 

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
    // $ANTLR end "rule__Refine__Group__0__Impl"


    // $ANTLR start "rule__Refine__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1378:1: rule__Refine__Group__1 : rule__Refine__Group__1__Impl rule__Refine__Group__2 ;
    public final void rule__Refine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1382:1: ( rule__Refine__Group__1__Impl rule__Refine__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1383:2: rule__Refine__Group__1__Impl rule__Refine__Group__2
            {
            pushFollow(FOLLOW_rule__Refine__Group__1__Impl_in_rule__Refine__Group__12841);
            rule__Refine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__2_in_rule__Refine__Group__12844);
            rule__Refine__Group__2();

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
    // $ANTLR end "rule__Refine__Group__1"


    // $ANTLR start "rule__Refine__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1390:1: rule__Refine__Group__1__Impl : ( ( rule__Refine__ClassNewAssignment_1 ) ) ;
    public final void rule__Refine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1394:1: ( ( ( rule__Refine__ClassNewAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1395:1: ( ( rule__Refine__ClassNewAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1395:1: ( ( rule__Refine__ClassNewAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1396:1: ( rule__Refine__ClassNewAssignment_1 )
            {
             before(grammarAccess.getRefineAccess().getClassNewAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1397:1: ( rule__Refine__ClassNewAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1397:2: rule__Refine__ClassNewAssignment_1
            {
            pushFollow(FOLLOW_rule__Refine__ClassNewAssignment_1_in_rule__Refine__Group__1__Impl2871);
            rule__Refine__ClassNewAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRefineAccess().getClassNewAssignment_1()); 

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
    // $ANTLR end "rule__Refine__Group__1__Impl"


    // $ANTLR start "rule__Refine__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1407:1: rule__Refine__Group__2 : rule__Refine__Group__2__Impl rule__Refine__Group__3 ;
    public final void rule__Refine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1411:1: ( rule__Refine__Group__2__Impl rule__Refine__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1412:2: rule__Refine__Group__2__Impl rule__Refine__Group__3
            {
            pushFollow(FOLLOW_rule__Refine__Group__2__Impl_in_rule__Refine__Group__22901);
            rule__Refine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__3_in_rule__Refine__Group__22904);
            rule__Refine__Group__3();

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
    // $ANTLR end "rule__Refine__Group__2"


    // $ANTLR start "rule__Refine__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1419:1: rule__Refine__Group__2__Impl : ( 'specializing' ) ;
    public final void rule__Refine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1423:1: ( ( 'specializing' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1424:1: ( 'specializing' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1424:1: ( 'specializing' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1425:1: 'specializing'
            {
             before(grammarAccess.getRefineAccess().getSpecializingKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Refine__Group__2__Impl2932); 
             after(grammarAccess.getRefineAccess().getSpecializingKeyword_2()); 

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
    // $ANTLR end "rule__Refine__Group__2__Impl"


    // $ANTLR start "rule__Refine__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1438:1: rule__Refine__Group__3 : rule__Refine__Group__3__Impl rule__Refine__Group__4 ;
    public final void rule__Refine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1442:1: ( rule__Refine__Group__3__Impl rule__Refine__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1443:2: rule__Refine__Group__3__Impl rule__Refine__Group__4
            {
            pushFollow(FOLLOW_rule__Refine__Group__3__Impl_in_rule__Refine__Group__32963);
            rule__Refine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__4_in_rule__Refine__Group__32966);
            rule__Refine__Group__4();

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
    // $ANTLR end "rule__Refine__Group__3"


    // $ANTLR start "rule__Refine__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1450:1: rule__Refine__Group__3__Impl : ( ( rule__Refine__PrefixAssignment_3 ) ) ;
    public final void rule__Refine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1454:1: ( ( ( rule__Refine__PrefixAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1455:1: ( ( rule__Refine__PrefixAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1455:1: ( ( rule__Refine__PrefixAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1456:1: ( rule__Refine__PrefixAssignment_3 )
            {
             before(grammarAccess.getRefineAccess().getPrefixAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1457:1: ( rule__Refine__PrefixAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1457:2: rule__Refine__PrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__Refine__PrefixAssignment_3_in_rule__Refine__Group__3__Impl2993);
            rule__Refine__PrefixAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRefineAccess().getPrefixAssignment_3()); 

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
    // $ANTLR end "rule__Refine__Group__3__Impl"


    // $ANTLR start "rule__Refine__Group__4"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1467:1: rule__Refine__Group__4 : rule__Refine__Group__4__Impl rule__Refine__Group__5 ;
    public final void rule__Refine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1471:1: ( rule__Refine__Group__4__Impl rule__Refine__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1472:2: rule__Refine__Group__4__Impl rule__Refine__Group__5
            {
            pushFollow(FOLLOW_rule__Refine__Group__4__Impl_in_rule__Refine__Group__43023);
            rule__Refine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Refine__Group__5_in_rule__Refine__Group__43026);
            rule__Refine__Group__5();

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
    // $ANTLR end "rule__Refine__Group__4"


    // $ANTLR start "rule__Refine__Group__4__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1479:1: rule__Refine__Group__4__Impl : ( '.' ) ;
    public final void rule__Refine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1483:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1484:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1484:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1485:1: '.'
            {
             before(grammarAccess.getRefineAccess().getFullStopKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Refine__Group__4__Impl3054); 
             after(grammarAccess.getRefineAccess().getFullStopKeyword_4()); 

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
    // $ANTLR end "rule__Refine__Group__4__Impl"


    // $ANTLR start "rule__Refine__Group__5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1498:1: rule__Refine__Group__5 : rule__Refine__Group__5__Impl ;
    public final void rule__Refine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1502:1: ( rule__Refine__Group__5__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1503:2: rule__Refine__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Refine__Group__5__Impl_in_rule__Refine__Group__53085);
            rule__Refine__Group__5__Impl();

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
    // $ANTLR end "rule__Refine__Group__5"


    // $ANTLR start "rule__Refine__Group__5__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1509:1: rule__Refine__Group__5__Impl : ( ( rule__Refine__ClassOriginalAssignment_5 ) ) ;
    public final void rule__Refine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1513:1: ( ( ( rule__Refine__ClassOriginalAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1514:1: ( ( rule__Refine__ClassOriginalAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1514:1: ( ( rule__Refine__ClassOriginalAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1515:1: ( rule__Refine__ClassOriginalAssignment_5 )
            {
             before(grammarAccess.getRefineAccess().getClassOriginalAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1516:1: ( rule__Refine__ClassOriginalAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1516:2: rule__Refine__ClassOriginalAssignment_5
            {
            pushFollow(FOLLOW_rule__Refine__ClassOriginalAssignment_5_in_rule__Refine__Group__5__Impl3112);
            rule__Refine__ClassOriginalAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRefineAccess().getClassOriginalAssignment_5()); 

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
    // $ANTLR end "rule__Refine__Group__5__Impl"


    // $ANTLR start "rule__Generalize__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1538:1: rule__Generalize__Group__0 : rule__Generalize__Group__0__Impl rule__Generalize__Group__1 ;
    public final void rule__Generalize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1542:1: ( rule__Generalize__Group__0__Impl rule__Generalize__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1543:2: rule__Generalize__Group__0__Impl rule__Generalize__Group__1
            {
            pushFollow(FOLLOW_rule__Generalize__Group__0__Impl_in_rule__Generalize__Group__03154);
            rule__Generalize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__1_in_rule__Generalize__Group__03157);
            rule__Generalize__Group__1();

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
    // $ANTLR end "rule__Generalize__Group__0"


    // $ANTLR start "rule__Generalize__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1550:1: rule__Generalize__Group__0__Impl : ( 'add class' ) ;
    public final void rule__Generalize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1554:1: ( ( 'add class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1555:1: ( 'add class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1555:1: ( 'add class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1556:1: 'add class'
            {
             before(grammarAccess.getGeneralizeAccess().getAddClassKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Generalize__Group__0__Impl3185); 
             after(grammarAccess.getGeneralizeAccess().getAddClassKeyword_0()); 

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
    // $ANTLR end "rule__Generalize__Group__0__Impl"


    // $ANTLR start "rule__Generalize__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1569:1: rule__Generalize__Group__1 : rule__Generalize__Group__1__Impl rule__Generalize__Group__2 ;
    public final void rule__Generalize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1573:1: ( rule__Generalize__Group__1__Impl rule__Generalize__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1574:2: rule__Generalize__Group__1__Impl rule__Generalize__Group__2
            {
            pushFollow(FOLLOW_rule__Generalize__Group__1__Impl_in_rule__Generalize__Group__13216);
            rule__Generalize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__2_in_rule__Generalize__Group__13219);
            rule__Generalize__Group__2();

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
    // $ANTLR end "rule__Generalize__Group__1"


    // $ANTLR start "rule__Generalize__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1581:1: rule__Generalize__Group__1__Impl : ( ( rule__Generalize__ClassNewAssignment_1 ) ) ;
    public final void rule__Generalize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1585:1: ( ( ( rule__Generalize__ClassNewAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1586:1: ( ( rule__Generalize__ClassNewAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1586:1: ( ( rule__Generalize__ClassNewAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1587:1: ( rule__Generalize__ClassNewAssignment_1 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassNewAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1588:1: ( rule__Generalize__ClassNewAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1588:2: rule__Generalize__ClassNewAssignment_1
            {
            pushFollow(FOLLOW_rule__Generalize__ClassNewAssignment_1_in_rule__Generalize__Group__1__Impl3246);
            rule__Generalize__ClassNewAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizeAccess().getClassNewAssignment_1()); 

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
    // $ANTLR end "rule__Generalize__Group__1__Impl"


    // $ANTLR start "rule__Generalize__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1598:1: rule__Generalize__Group__2 : rule__Generalize__Group__2__Impl rule__Generalize__Group__3 ;
    public final void rule__Generalize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1602:1: ( rule__Generalize__Group__2__Impl rule__Generalize__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1603:2: rule__Generalize__Group__2__Impl rule__Generalize__Group__3
            {
            pushFollow(FOLLOW_rule__Generalize__Group__2__Impl_in_rule__Generalize__Group__23276);
            rule__Generalize__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__3_in_rule__Generalize__Group__23279);
            rule__Generalize__Group__3();

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
    // $ANTLR end "rule__Generalize__Group__2"


    // $ANTLR start "rule__Generalize__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1610:1: rule__Generalize__Group__2__Impl : ( 'supertyping' ) ;
    public final void rule__Generalize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1614:1: ( ( 'supertyping' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1615:1: ( 'supertyping' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1615:1: ( 'supertyping' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1616:1: 'supertyping'
            {
             before(grammarAccess.getGeneralizeAccess().getSupertypingKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Generalize__Group__2__Impl3307); 
             after(grammarAccess.getGeneralizeAccess().getSupertypingKeyword_2()); 

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
    // $ANTLR end "rule__Generalize__Group__2__Impl"


    // $ANTLR start "rule__Generalize__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1629:1: rule__Generalize__Group__3 : rule__Generalize__Group__3__Impl rule__Generalize__Group__4 ;
    public final void rule__Generalize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1633:1: ( rule__Generalize__Group__3__Impl rule__Generalize__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1634:2: rule__Generalize__Group__3__Impl rule__Generalize__Group__4
            {
            pushFollow(FOLLOW_rule__Generalize__Group__3__Impl_in_rule__Generalize__Group__33338);
            rule__Generalize__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__4_in_rule__Generalize__Group__33341);
            rule__Generalize__Group__4();

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
    // $ANTLR end "rule__Generalize__Group__3"


    // $ANTLR start "rule__Generalize__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1641:1: rule__Generalize__Group__3__Impl : ( ( rule__Generalize__PrefixAssignment_3 ) ) ;
    public final void rule__Generalize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1645:1: ( ( ( rule__Generalize__PrefixAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1646:1: ( ( rule__Generalize__PrefixAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1646:1: ( ( rule__Generalize__PrefixAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1647:1: ( rule__Generalize__PrefixAssignment_3 )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1648:1: ( rule__Generalize__PrefixAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1648:2: rule__Generalize__PrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__Generalize__PrefixAssignment_3_in_rule__Generalize__Group__3__Impl3368);
            rule__Generalize__PrefixAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizeAccess().getPrefixAssignment_3()); 

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
    // $ANTLR end "rule__Generalize__Group__3__Impl"


    // $ANTLR start "rule__Generalize__Group__4"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1658:1: rule__Generalize__Group__4 : rule__Generalize__Group__4__Impl rule__Generalize__Group__5 ;
    public final void rule__Generalize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1662:1: ( rule__Generalize__Group__4__Impl rule__Generalize__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1663:2: rule__Generalize__Group__4__Impl rule__Generalize__Group__5
            {
            pushFollow(FOLLOW_rule__Generalize__Group__4__Impl_in_rule__Generalize__Group__43398);
            rule__Generalize__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__5_in_rule__Generalize__Group__43401);
            rule__Generalize__Group__5();

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
    // $ANTLR end "rule__Generalize__Group__4"


    // $ANTLR start "rule__Generalize__Group__4__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1670:1: rule__Generalize__Group__4__Impl : ( '.' ) ;
    public final void rule__Generalize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1674:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1675:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1675:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1676:1: '.'
            {
             before(grammarAccess.getGeneralizeAccess().getFullStopKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Generalize__Group__4__Impl3429); 
             after(grammarAccess.getGeneralizeAccess().getFullStopKeyword_4()); 

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
    // $ANTLR end "rule__Generalize__Group__4__Impl"


    // $ANTLR start "rule__Generalize__Group__5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1689:1: rule__Generalize__Group__5 : rule__Generalize__Group__5__Impl rule__Generalize__Group__6 ;
    public final void rule__Generalize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1693:1: ( rule__Generalize__Group__5__Impl rule__Generalize__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1694:2: rule__Generalize__Group__5__Impl rule__Generalize__Group__6
            {
            pushFollow(FOLLOW_rule__Generalize__Group__5__Impl_in_rule__Generalize__Group__53460);
            rule__Generalize__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group__6_in_rule__Generalize__Group__53463);
            rule__Generalize__Group__6();

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
    // $ANTLR end "rule__Generalize__Group__5"


    // $ANTLR start "rule__Generalize__Group__5__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1701:1: rule__Generalize__Group__5__Impl : ( ( rule__Generalize__ClassAssignment_5 ) ) ;
    public final void rule__Generalize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1705:1: ( ( ( rule__Generalize__ClassAssignment_5 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1706:1: ( ( rule__Generalize__ClassAssignment_5 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1706:1: ( ( rule__Generalize__ClassAssignment_5 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1707:1: ( rule__Generalize__ClassAssignment_5 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1708:1: ( rule__Generalize__ClassAssignment_5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1708:2: rule__Generalize__ClassAssignment_5
            {
            pushFollow(FOLLOW_rule__Generalize__ClassAssignment_5_in_rule__Generalize__Group__5__Impl3490);
            rule__Generalize__ClassAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizeAccess().getClassAssignment_5()); 

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
    // $ANTLR end "rule__Generalize__Group__5__Impl"


    // $ANTLR start "rule__Generalize__Group__6"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1718:1: rule__Generalize__Group__6 : rule__Generalize__Group__6__Impl ;
    public final void rule__Generalize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1722:1: ( rule__Generalize__Group__6__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1723:2: rule__Generalize__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Generalize__Group__6__Impl_in_rule__Generalize__Group__63520);
            rule__Generalize__Group__6__Impl();

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
    // $ANTLR end "rule__Generalize__Group__6"


    // $ANTLR start "rule__Generalize__Group__6__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1729:1: rule__Generalize__Group__6__Impl : ( ( rule__Generalize__Group_6__0 )* ) ;
    public final void rule__Generalize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1733:1: ( ( ( rule__Generalize__Group_6__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1734:1: ( ( rule__Generalize__Group_6__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1734:1: ( ( rule__Generalize__Group_6__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1735:1: ( rule__Generalize__Group_6__0 )*
            {
             before(grammarAccess.getGeneralizeAccess().getGroup_6()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1736:1: ( rule__Generalize__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1736:2: rule__Generalize__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Generalize__Group_6__0_in_rule__Generalize__Group__6__Impl3547);
            	    rule__Generalize__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGeneralizeAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Generalize__Group__6__Impl"


    // $ANTLR start "rule__Generalize__Group_6__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1760:1: rule__Generalize__Group_6__0 : rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1 ;
    public final void rule__Generalize__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1764:1: ( rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1765:2: rule__Generalize__Group_6__0__Impl rule__Generalize__Group_6__1
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__0__Impl_in_rule__Generalize__Group_6__03592);
            rule__Generalize__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__1_in_rule__Generalize__Group_6__03595);
            rule__Generalize__Group_6__1();

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
    // $ANTLR end "rule__Generalize__Group_6__0"


    // $ANTLR start "rule__Generalize__Group_6__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1772:1: rule__Generalize__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Generalize__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1776:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1777:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1777:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1778:1: ','
            {
             before(grammarAccess.getGeneralizeAccess().getCommaKeyword_6_0()); 
            match(input,25,FOLLOW_25_in_rule__Generalize__Group_6__0__Impl3623); 
             after(grammarAccess.getGeneralizeAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Generalize__Group_6__0__Impl"


    // $ANTLR start "rule__Generalize__Group_6__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1791:1: rule__Generalize__Group_6__1 : rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2 ;
    public final void rule__Generalize__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1795:1: ( rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1796:2: rule__Generalize__Group_6__1__Impl rule__Generalize__Group_6__2
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__1__Impl_in_rule__Generalize__Group_6__13654);
            rule__Generalize__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__2_in_rule__Generalize__Group_6__13657);
            rule__Generalize__Group_6__2();

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
    // $ANTLR end "rule__Generalize__Group_6__1"


    // $ANTLR start "rule__Generalize__Group_6__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1803:1: rule__Generalize__Group_6__1__Impl : ( ( rule__Generalize__PrefixAssignment_6_1 ) ) ;
    public final void rule__Generalize__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1807:1: ( ( ( rule__Generalize__PrefixAssignment_6_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1808:1: ( ( rule__Generalize__PrefixAssignment_6_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1808:1: ( ( rule__Generalize__PrefixAssignment_6_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1809:1: ( rule__Generalize__PrefixAssignment_6_1 )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixAssignment_6_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1810:1: ( rule__Generalize__PrefixAssignment_6_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1810:2: rule__Generalize__PrefixAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Generalize__PrefixAssignment_6_1_in_rule__Generalize__Group_6__1__Impl3684);
            rule__Generalize__PrefixAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizeAccess().getPrefixAssignment_6_1()); 

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
    // $ANTLR end "rule__Generalize__Group_6__1__Impl"


    // $ANTLR start "rule__Generalize__Group_6__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1820:1: rule__Generalize__Group_6__2 : rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3 ;
    public final void rule__Generalize__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1824:1: ( rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1825:2: rule__Generalize__Group_6__2__Impl rule__Generalize__Group_6__3
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__2__Impl_in_rule__Generalize__Group_6__23714);
            rule__Generalize__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalize__Group_6__3_in_rule__Generalize__Group_6__23717);
            rule__Generalize__Group_6__3();

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
    // $ANTLR end "rule__Generalize__Group_6__2"


    // $ANTLR start "rule__Generalize__Group_6__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1832:1: rule__Generalize__Group_6__2__Impl : ( '.' ) ;
    public final void rule__Generalize__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1836:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1837:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1837:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1838:1: '.'
            {
             before(grammarAccess.getGeneralizeAccess().getFullStopKeyword_6_2()); 
            match(input,28,FOLLOW_28_in_rule__Generalize__Group_6__2__Impl3745); 
             after(grammarAccess.getGeneralizeAccess().getFullStopKeyword_6_2()); 

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
    // $ANTLR end "rule__Generalize__Group_6__2__Impl"


    // $ANTLR start "rule__Generalize__Group_6__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1851:1: rule__Generalize__Group_6__3 : rule__Generalize__Group_6__3__Impl ;
    public final void rule__Generalize__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1855:1: ( rule__Generalize__Group_6__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1856:2: rule__Generalize__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Generalize__Group_6__3__Impl_in_rule__Generalize__Group_6__33776);
            rule__Generalize__Group_6__3__Impl();

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
    // $ANTLR end "rule__Generalize__Group_6__3"


    // $ANTLR start "rule__Generalize__Group_6__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1862:1: rule__Generalize__Group_6__3__Impl : ( ( rule__Generalize__ClassAssignment_6_3 ) ) ;
    public final void rule__Generalize__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1866:1: ( ( ( rule__Generalize__ClassAssignment_6_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1867:1: ( ( rule__Generalize__ClassAssignment_6_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1867:1: ( ( rule__Generalize__ClassAssignment_6_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1868:1: ( rule__Generalize__ClassAssignment_6_3 )
            {
             before(grammarAccess.getGeneralizeAccess().getClassAssignment_6_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1869:1: ( rule__Generalize__ClassAssignment_6_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1869:2: rule__Generalize__ClassAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Generalize__ClassAssignment_6_3_in_rule__Generalize__Group_6__3__Impl3803);
            rule__Generalize__ClassAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizeAccess().getClassAssignment_6_3()); 

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
    // $ANTLR end "rule__Generalize__Group_6__3__Impl"


    // $ANTLR start "rule__ModifyClass__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1887:1: rule__ModifyClass__Group__0 : rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1 ;
    public final void rule__ModifyClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1891:1: ( rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1892:2: rule__ModifyClass__Group__0__Impl rule__ModifyClass__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__0__Impl_in_rule__ModifyClass__Group__03841);
            rule__ModifyClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__1_in_rule__ModifyClass__Group__03844);
            rule__ModifyClass__Group__1();

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
    // $ANTLR end "rule__ModifyClass__Group__0"


    // $ANTLR start "rule__ModifyClass__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1899:1: rule__ModifyClass__Group__0__Impl : ( 'modify class' ) ;
    public final void rule__ModifyClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1903:1: ( ( 'modify class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1904:1: ( 'modify class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1904:1: ( 'modify class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1905:1: 'modify class'
            {
             before(grammarAccess.getModifyClassAccess().getModifyClassKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ModifyClass__Group__0__Impl3872); 
             after(grammarAccess.getModifyClassAccess().getModifyClassKeyword_0()); 

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
    // $ANTLR end "rule__ModifyClass__Group__0__Impl"


    // $ANTLR start "rule__ModifyClass__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1918:1: rule__ModifyClass__Group__1 : rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2 ;
    public final void rule__ModifyClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1922:1: ( rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1923:2: rule__ModifyClass__Group__1__Impl rule__ModifyClass__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__1__Impl_in_rule__ModifyClass__Group__13903);
            rule__ModifyClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__2_in_rule__ModifyClass__Group__13906);
            rule__ModifyClass__Group__2();

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
    // $ANTLR end "rule__ModifyClass__Group__1"


    // $ANTLR start "rule__ModifyClass__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1930:1: rule__ModifyClass__Group__1__Impl : ( ( rule__ModifyClass__PrefixAssignment_1 ) ) ;
    public final void rule__ModifyClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1934:1: ( ( ( rule__ModifyClass__PrefixAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1935:1: ( ( rule__ModifyClass__PrefixAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1935:1: ( ( rule__ModifyClass__PrefixAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1936:1: ( rule__ModifyClass__PrefixAssignment_1 )
            {
             before(grammarAccess.getModifyClassAccess().getPrefixAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1937:1: ( rule__ModifyClass__PrefixAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1937:2: rule__ModifyClass__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyClass__PrefixAssignment_1_in_rule__ModifyClass__Group__1__Impl3933);
            rule__ModifyClass__PrefixAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyClassAccess().getPrefixAssignment_1()); 

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
    // $ANTLR end "rule__ModifyClass__Group__1__Impl"


    // $ANTLR start "rule__ModifyClass__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1947:1: rule__ModifyClass__Group__2 : rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3 ;
    public final void rule__ModifyClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1951:1: ( rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1952:2: rule__ModifyClass__Group__2__Impl rule__ModifyClass__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__2__Impl_in_rule__ModifyClass__Group__23963);
            rule__ModifyClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__3_in_rule__ModifyClass__Group__23966);
            rule__ModifyClass__Group__3();

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
    // $ANTLR end "rule__ModifyClass__Group__2"


    // $ANTLR start "rule__ModifyClass__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1959:1: rule__ModifyClass__Group__2__Impl : ( '.' ) ;
    public final void rule__ModifyClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1963:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1964:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1964:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1965:1: '.'
            {
             before(grammarAccess.getModifyClassAccess().getFullStopKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__ModifyClass__Group__2__Impl3994); 
             after(grammarAccess.getModifyClassAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__ModifyClass__Group__2__Impl"


    // $ANTLR start "rule__ModifyClass__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1978:1: rule__ModifyClass__Group__3 : rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4 ;
    public final void rule__ModifyClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1982:1: ( rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1983:2: rule__ModifyClass__Group__3__Impl rule__ModifyClass__Group__4
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__3__Impl_in_rule__ModifyClass__Group__34025);
            rule__ModifyClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__4_in_rule__ModifyClass__Group__34028);
            rule__ModifyClass__Group__4();

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
    // $ANTLR end "rule__ModifyClass__Group__3"


    // $ANTLR start "rule__ModifyClass__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1990:1: rule__ModifyClass__Group__3__Impl : ( ( rule__ModifyClass__ClassAssignment_3 ) ) ;
    public final void rule__ModifyClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1994:1: ( ( ( rule__ModifyClass__ClassAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1995:1: ( ( rule__ModifyClass__ClassAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1995:1: ( ( rule__ModifyClass__ClassAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1996:1: ( rule__ModifyClass__ClassAssignment_3 )
            {
             before(grammarAccess.getModifyClassAccess().getClassAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1997:1: ( rule__ModifyClass__ClassAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:1997:2: rule__ModifyClass__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__ModifyClass__ClassAssignment_3_in_rule__ModifyClass__Group__3__Impl4055);
            rule__ModifyClass__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModifyClassAccess().getClassAssignment_3()); 

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
    // $ANTLR end "rule__ModifyClass__Group__3__Impl"


    // $ANTLR start "rule__ModifyClass__Group__4"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2007:1: rule__ModifyClass__Group__4 : rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5 ;
    public final void rule__ModifyClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2011:1: ( rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2012:2: rule__ModifyClass__Group__4__Impl rule__ModifyClass__Group__5
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__4__Impl_in_rule__ModifyClass__Group__44085);
            rule__ModifyClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__5_in_rule__ModifyClass__Group__44088);
            rule__ModifyClass__Group__5();

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
    // $ANTLR end "rule__ModifyClass__Group__4"


    // $ANTLR start "rule__ModifyClass__Group__4__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2019:1: rule__ModifyClass__Group__4__Impl : ( '{' ) ;
    public final void rule__ModifyClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2023:1: ( ( '{' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2024:1: ( '{' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2024:1: ( '{' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2025:1: '{'
            {
             before(grammarAccess.getModifyClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__ModifyClass__Group__4__Impl4116); 
             after(grammarAccess.getModifyClassAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ModifyClass__Group__4__Impl"


    // $ANTLR start "rule__ModifyClass__Group__5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2038:1: rule__ModifyClass__Group__5 : rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6 ;
    public final void rule__ModifyClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2042:1: ( rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2043:2: rule__ModifyClass__Group__5__Impl rule__ModifyClass__Group__6
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__5__Impl_in_rule__ModifyClass__Group__54147);
            rule__ModifyClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyClass__Group__6_in_rule__ModifyClass__Group__54150);
            rule__ModifyClass__Group__6();

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
    // $ANTLR end "rule__ModifyClass__Group__5"


    // $ANTLR start "rule__ModifyClass__Group__5__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2050:1: rule__ModifyClass__Group__5__Impl : ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* ) ;
    public final void rule__ModifyClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2054:1: ( ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2055:1: ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2055:1: ( ( rule__ModifyClass__ModifyOperatorsAssignment_5 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2056:1: ( rule__ModifyClass__ModifyOperatorsAssignment_5 )*
            {
             before(grammarAccess.getModifyClassAccess().getModifyOperatorsAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2057:1: ( rule__ModifyClass__ModifyOperatorsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31||LA10_0==33||LA10_0==35||(LA10_0>=37 && LA10_0<=38)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2057:2: rule__ModifyClass__ModifyOperatorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ModifyClass__ModifyOperatorsAssignment_5_in_rule__ModifyClass__Group__5__Impl4177);
            	    rule__ModifyClass__ModifyOperatorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModifyClassAccess().getModifyOperatorsAssignment_5()); 

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
    // $ANTLR end "rule__ModifyClass__Group__5__Impl"


    // $ANTLR start "rule__ModifyClass__Group__6"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2067:1: rule__ModifyClass__Group__6 : rule__ModifyClass__Group__6__Impl ;
    public final void rule__ModifyClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2071:1: ( rule__ModifyClass__Group__6__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2072:2: rule__ModifyClass__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ModifyClass__Group__6__Impl_in_rule__ModifyClass__Group__64208);
            rule__ModifyClass__Group__6__Impl();

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
    // $ANTLR end "rule__ModifyClass__Group__6"


    // $ANTLR start "rule__ModifyClass__Group__6__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2078:1: rule__ModifyClass__Group__6__Impl : ( '}' ) ;
    public final void rule__ModifyClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2082:1: ( ( '}' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2083:1: ( '}' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2083:1: ( '}' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2084:1: '}'
            {
             before(grammarAccess.getModifyClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__ModifyClass__Group__6__Impl4236); 
             after(grammarAccess.getModifyClassAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ModifyClass__Group__6__Impl"


    // $ANTLR start "rule__AddProperty__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2111:1: rule__AddProperty__Group__0 : rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1 ;
    public final void rule__AddProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2115:1: ( rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2116:2: rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__0__Impl_in_rule__AddProperty__Group__04281);
            rule__AddProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__1_in_rule__AddProperty__Group__04284);
            rule__AddProperty__Group__1();

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
    // $ANTLR end "rule__AddProperty__Group__0"


    // $ANTLR start "rule__AddProperty__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2123:1: rule__AddProperty__Group__0__Impl : ( 'add property' ) ;
    public final void rule__AddProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2127:1: ( ( 'add property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2128:1: ( 'add property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2128:1: ( 'add property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2129:1: 'add property'
            {
             before(grammarAccess.getAddPropertyAccess().getAddPropertyKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__AddProperty__Group__0__Impl4312); 
             after(grammarAccess.getAddPropertyAccess().getAddPropertyKeyword_0()); 

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
    // $ANTLR end "rule__AddProperty__Group__0__Impl"


    // $ANTLR start "rule__AddProperty__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2142:1: rule__AddProperty__Group__1 : rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2 ;
    public final void rule__AddProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2146:1: ( rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2147:2: rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__1__Impl_in_rule__AddProperty__Group__14343);
            rule__AddProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__2_in_rule__AddProperty__Group__14346);
            rule__AddProperty__Group__2();

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
    // $ANTLR end "rule__AddProperty__Group__1"


    // $ANTLR start "rule__AddProperty__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2154:1: rule__AddProperty__Group__1__Impl : ( ( rule__AddProperty__PropertyAssignment_1 ) ) ;
    public final void rule__AddProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2158:1: ( ( ( rule__AddProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2159:1: ( ( rule__AddProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2159:1: ( ( rule__AddProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2160:1: ( rule__AddProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getAddPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2161:1: ( rule__AddProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2161:2: rule__AddProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__AddProperty__PropertyAssignment_1_in_rule__AddProperty__Group__1__Impl4373);
            rule__AddProperty__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getPropertyAssignment_1()); 

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
    // $ANTLR end "rule__AddProperty__Group__1__Impl"


    // $ANTLR start "rule__AddProperty__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2171:1: rule__AddProperty__Group__2 : rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3 ;
    public final void rule__AddProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2175:1: ( rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2176:2: rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__2__Impl_in_rule__AddProperty__Group__24403);
            rule__AddProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__3_in_rule__AddProperty__Group__24406);
            rule__AddProperty__Group__3();

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
    // $ANTLR end "rule__AddProperty__Group__2"


    // $ANTLR start "rule__AddProperty__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2183:1: rule__AddProperty__Group__2__Impl : ( 'type' ) ;
    public final void rule__AddProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2187:1: ( ( 'type' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2188:1: ( 'type' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2188:1: ( 'type' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2189:1: 'type'
            {
             before(grammarAccess.getAddPropertyAccess().getTypeKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__AddProperty__Group__2__Impl4434); 
             after(grammarAccess.getAddPropertyAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__AddProperty__Group__2__Impl"


    // $ANTLR start "rule__AddProperty__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2202:1: rule__AddProperty__Group__3 : rule__AddProperty__Group__3__Impl rule__AddProperty__Group__4 ;
    public final void rule__AddProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2206:1: ( rule__AddProperty__Group__3__Impl rule__AddProperty__Group__4 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2207:2: rule__AddProperty__Group__3__Impl rule__AddProperty__Group__4
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__3__Impl_in_rule__AddProperty__Group__34465);
            rule__AddProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__4_in_rule__AddProperty__Group__34468);
            rule__AddProperty__Group__4();

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
    // $ANTLR end "rule__AddProperty__Group__3"


    // $ANTLR start "rule__AddProperty__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2214:1: rule__AddProperty__Group__3__Impl : ( ( rule__AddProperty__TypeAssignment_3 ) ) ;
    public final void rule__AddProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2218:1: ( ( ( rule__AddProperty__TypeAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2219:1: ( ( rule__AddProperty__TypeAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2219:1: ( ( rule__AddProperty__TypeAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2220:1: ( rule__AddProperty__TypeAssignment_3 )
            {
             before(grammarAccess.getAddPropertyAccess().getTypeAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2221:1: ( rule__AddProperty__TypeAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2221:2: rule__AddProperty__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__AddProperty__TypeAssignment_3_in_rule__AddProperty__Group__3__Impl4495);
            rule__AddProperty__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__AddProperty__Group__3__Impl"


    // $ANTLR start "rule__AddProperty__Group__4"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2231:1: rule__AddProperty__Group__4 : rule__AddProperty__Group__4__Impl rule__AddProperty__Group__5 ;
    public final void rule__AddProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2235:1: ( rule__AddProperty__Group__4__Impl rule__AddProperty__Group__5 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2236:2: rule__AddProperty__Group__4__Impl rule__AddProperty__Group__5
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__4__Impl_in_rule__AddProperty__Group__44525);
            rule__AddProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddProperty__Group__5_in_rule__AddProperty__Group__44528);
            rule__AddProperty__Group__5();

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
    // $ANTLR end "rule__AddProperty__Group__4"


    // $ANTLR start "rule__AddProperty__Group__4__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2243:1: rule__AddProperty__Group__4__Impl : ( ( rule__AddProperty__CardinalityAssignment_4 )? ) ;
    public final void rule__AddProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2247:1: ( ( ( rule__AddProperty__CardinalityAssignment_4 )? ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2248:1: ( ( rule__AddProperty__CardinalityAssignment_4 )? )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2248:1: ( ( rule__AddProperty__CardinalityAssignment_4 )? )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2249:1: ( rule__AddProperty__CardinalityAssignment_4 )?
            {
             before(grammarAccess.getAddPropertyAccess().getCardinalityAssignment_4()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2250:1: ( rule__AddProperty__CardinalityAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=17)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2250:2: rule__AddProperty__CardinalityAssignment_4
                    {
                    pushFollow(FOLLOW_rule__AddProperty__CardinalityAssignment_4_in_rule__AddProperty__Group__4__Impl4555);
                    rule__AddProperty__CardinalityAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddPropertyAccess().getCardinalityAssignment_4()); 

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
    // $ANTLR end "rule__AddProperty__Group__4__Impl"


    // $ANTLR start "rule__AddProperty__Group__5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2260:1: rule__AddProperty__Group__5 : rule__AddProperty__Group__5__Impl ;
    public final void rule__AddProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2264:1: ( rule__AddProperty__Group__5__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2265:2: rule__AddProperty__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__AddProperty__Group__5__Impl_in_rule__AddProperty__Group__54586);
            rule__AddProperty__Group__5__Impl();

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
    // $ANTLR end "rule__AddProperty__Group__5"


    // $ANTLR start "rule__AddProperty__Group__5__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2271:1: rule__AddProperty__Group__5__Impl : ( ( rule__AddProperty__RelationTypeAssignment_5 )? ) ;
    public final void rule__AddProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2275:1: ( ( ( rule__AddProperty__RelationTypeAssignment_5 )? ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2276:1: ( ( rule__AddProperty__RelationTypeAssignment_5 )? )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2276:1: ( ( rule__AddProperty__RelationTypeAssignment_5 )? )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2277:1: ( rule__AddProperty__RelationTypeAssignment_5 )?
            {
             before(grammarAccess.getAddPropertyAccess().getRelationTypeAssignment_5()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2278:1: ( rule__AddProperty__RelationTypeAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=18 && LA12_0<=19)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2278:2: rule__AddProperty__RelationTypeAssignment_5
                    {
                    pushFollow(FOLLOW_rule__AddProperty__RelationTypeAssignment_5_in_rule__AddProperty__Group__5__Impl4613);
                    rule__AddProperty__RelationTypeAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddPropertyAccess().getRelationTypeAssignment_5()); 

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
    // $ANTLR end "rule__AddProperty__Group__5__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2300:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2304:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2305:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__04656);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__04659);
            rule__Type__Group_1__1();

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
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2312:1: rule__Type__Group_1__0__Impl : ( ( rule__Type__PrefixAssignment_1_0 ) ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2316:1: ( ( ( rule__Type__PrefixAssignment_1_0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2317:1: ( ( rule__Type__PrefixAssignment_1_0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2317:1: ( ( rule__Type__PrefixAssignment_1_0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2318:1: ( rule__Type__PrefixAssignment_1_0 )
            {
             before(grammarAccess.getTypeAccess().getPrefixAssignment_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2319:1: ( rule__Type__PrefixAssignment_1_0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2319:2: rule__Type__PrefixAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Type__PrefixAssignment_1_0_in_rule__Type__Group_1__0__Impl4686);
            rule__Type__PrefixAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getPrefixAssignment_1_0()); 

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
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2329:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2333:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2334:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__14716);
            rule__Type__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__14719);
            rule__Type__Group_1__2();

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
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2341:1: rule__Type__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2345:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2346:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2346:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2347:1: '.'
            {
             before(grammarAccess.getTypeAccess().getFullStopKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__Type__Group_1__1__Impl4747); 
             after(grammarAccess.getTypeAccess().getFullStopKeyword_1_1()); 

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
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_1__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2360:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2364:1: ( rule__Type__Group_1__2__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2365:2: rule__Type__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__24778);
            rule__Type__Group_1__2__Impl();

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
    // $ANTLR end "rule__Type__Group_1__2"


    // $ANTLR start "rule__Type__Group_1__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2371:1: rule__Type__Group_1__2__Impl : ( ( rule__Type__ClassAssignment_1_2 ) ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2375:1: ( ( ( rule__Type__ClassAssignment_1_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2376:1: ( ( rule__Type__ClassAssignment_1_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2376:1: ( ( rule__Type__ClassAssignment_1_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2377:1: ( rule__Type__ClassAssignment_1_2 )
            {
             before(grammarAccess.getTypeAccess().getClassAssignment_1_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2378:1: ( rule__Type__ClassAssignment_1_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2378:2: rule__Type__ClassAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Type__ClassAssignment_1_2_in_rule__Type__Group_1__2__Impl4805);
            rule__Type__ClassAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getClassAssignment_1_2()); 

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
    // $ANTLR end "rule__Type__Group_1__2__Impl"


    // $ANTLR start "rule__ModifyProperty__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2394:1: rule__ModifyProperty__Group__0 : rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1 ;
    public final void rule__ModifyProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2398:1: ( rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2399:2: rule__ModifyProperty__Group__0__Impl rule__ModifyProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__0__Impl_in_rule__ModifyProperty__Group__04841);
            rule__ModifyProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__1_in_rule__ModifyProperty__Group__04844);
            rule__ModifyProperty__Group__1();

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
    // $ANTLR end "rule__ModifyProperty__Group__0"


    // $ANTLR start "rule__ModifyProperty__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2406:1: rule__ModifyProperty__Group__0__Impl : ( 'modify property' ) ;
    public final void rule__ModifyProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2410:1: ( ( 'modify property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2411:1: ( 'modify property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2411:1: ( 'modify property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2412:1: 'modify property'
            {
             before(grammarAccess.getModifyPropertyAccess().getModifyPropertyKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__ModifyProperty__Group__0__Impl4872); 
             after(grammarAccess.getModifyPropertyAccess().getModifyPropertyKeyword_0()); 

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
    // $ANTLR end "rule__ModifyProperty__Group__0__Impl"


    // $ANTLR start "rule__ModifyProperty__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2425:1: rule__ModifyProperty__Group__1 : rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2 ;
    public final void rule__ModifyProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2429:1: ( rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2430:2: rule__ModifyProperty__Group__1__Impl rule__ModifyProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__1__Impl_in_rule__ModifyProperty__Group__14903);
            rule__ModifyProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__2_in_rule__ModifyProperty__Group__14906);
            rule__ModifyProperty__Group__2();

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
    // $ANTLR end "rule__ModifyProperty__Group__1"


    // $ANTLR start "rule__ModifyProperty__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2437:1: rule__ModifyProperty__Group__1__Impl : ( ( rule__ModifyProperty__PropertyAssignment_1 ) ) ;
    public final void rule__ModifyProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2441:1: ( ( ( rule__ModifyProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2442:1: ( ( rule__ModifyProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2442:1: ( ( rule__ModifyProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2443:1: ( rule__ModifyProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getModifyPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2444:1: ( rule__ModifyProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2444:2: rule__ModifyProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__PropertyAssignment_1_in_rule__ModifyProperty__Group__1__Impl4933);
            rule__ModifyProperty__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyPropertyAccess().getPropertyAssignment_1()); 

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
    // $ANTLR end "rule__ModifyProperty__Group__1__Impl"


    // $ANTLR start "rule__ModifyProperty__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2454:1: rule__ModifyProperty__Group__2 : rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3 ;
    public final void rule__ModifyProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2458:1: ( rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2459:2: rule__ModifyProperty__Group__2__Impl rule__ModifyProperty__Group__3
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__2__Impl_in_rule__ModifyProperty__Group__24963);
            rule__ModifyProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group__3_in_rule__ModifyProperty__Group__24966);
            rule__ModifyProperty__Group__3();

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
    // $ANTLR end "rule__ModifyProperty__Group__2"


    // $ANTLR start "rule__ModifyProperty__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2466:1: rule__ModifyProperty__Group__2__Impl : ( ( rule__ModifyProperty__ValueAssignment_2 ) ) ;
    public final void rule__ModifyProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2470:1: ( ( ( rule__ModifyProperty__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2471:1: ( ( rule__ModifyProperty__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2471:1: ( ( rule__ModifyProperty__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2472:1: ( rule__ModifyProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getModifyPropertyAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2473:1: ( rule__ModifyProperty__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2473:2: rule__ModifyProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ModifyProperty__ValueAssignment_2_in_rule__ModifyProperty__Group__2__Impl4993);
            rule__ModifyProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModifyPropertyAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__ModifyProperty__Group__2__Impl"


    // $ANTLR start "rule__ModifyProperty__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2483:1: rule__ModifyProperty__Group__3 : rule__ModifyProperty__Group__3__Impl ;
    public final void rule__ModifyProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2487:1: ( rule__ModifyProperty__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2488:2: rule__ModifyProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group__3__Impl_in_rule__ModifyProperty__Group__35023);
            rule__ModifyProperty__Group__3__Impl();

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
    // $ANTLR end "rule__ModifyProperty__Group__3"


    // $ANTLR start "rule__ModifyProperty__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2494:1: rule__ModifyProperty__Group__3__Impl : ( ( rule__ModifyProperty__Group_3__0 )* ) ;
    public final void rule__ModifyProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2498:1: ( ( ( rule__ModifyProperty__Group_3__0 )* ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2499:1: ( ( rule__ModifyProperty__Group_3__0 )* )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2499:1: ( ( rule__ModifyProperty__Group_3__0 )* )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2500:1: ( rule__ModifyProperty__Group_3__0 )*
            {
             before(grammarAccess.getModifyPropertyAccess().getGroup_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2501:1: ( rule__ModifyProperty__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2501:2: rule__ModifyProperty__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ModifyProperty__Group_3__0_in_rule__ModifyProperty__Group__3__Impl5050);
            	    rule__ModifyProperty__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModifyPropertyAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ModifyProperty__Group__3__Impl"


    // $ANTLR start "rule__ModifyProperty__Group_3__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2519:1: rule__ModifyProperty__Group_3__0 : rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1 ;
    public final void rule__ModifyProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2523:1: ( rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2524:2: rule__ModifyProperty__Group_3__0__Impl rule__ModifyProperty__Group_3__1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__0__Impl_in_rule__ModifyProperty__Group_3__05089);
            rule__ModifyProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__1_in_rule__ModifyProperty__Group_3__05092);
            rule__ModifyProperty__Group_3__1();

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
    // $ANTLR end "rule__ModifyProperty__Group_3__0"


    // $ANTLR start "rule__ModifyProperty__Group_3__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2531:1: rule__ModifyProperty__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ModifyProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2535:1: ( ( ',' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2536:1: ( ',' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2536:1: ( ',' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2537:1: ','
            {
             before(grammarAccess.getModifyPropertyAccess().getCommaKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__ModifyProperty__Group_3__0__Impl5120); 
             after(grammarAccess.getModifyPropertyAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ModifyProperty__Group_3__0__Impl"


    // $ANTLR start "rule__ModifyProperty__Group_3__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2550:1: rule__ModifyProperty__Group_3__1 : rule__ModifyProperty__Group_3__1__Impl ;
    public final void rule__ModifyProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2554:1: ( rule__ModifyProperty__Group_3__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2555:2: rule__ModifyProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ModifyProperty__Group_3__1__Impl_in_rule__ModifyProperty__Group_3__15151);
            rule__ModifyProperty__Group_3__1__Impl();

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
    // $ANTLR end "rule__ModifyProperty__Group_3__1"


    // $ANTLR start "rule__ModifyProperty__Group_3__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2561:1: rule__ModifyProperty__Group_3__1__Impl : ( ( rule__ModifyProperty__ValueAssignment_3_1 ) ) ;
    public final void rule__ModifyProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2565:1: ( ( ( rule__ModifyProperty__ValueAssignment_3_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2566:1: ( ( rule__ModifyProperty__ValueAssignment_3_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2566:1: ( ( rule__ModifyProperty__ValueAssignment_3_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2567:1: ( rule__ModifyProperty__ValueAssignment_3_1 )
            {
             before(grammarAccess.getModifyPropertyAccess().getValueAssignment_3_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2568:1: ( rule__ModifyProperty__ValueAssignment_3_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2568:2: rule__ModifyProperty__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ModifyProperty__ValueAssignment_3_1_in_rule__ModifyProperty__Group_3__1__Impl5178);
            rule__ModifyProperty__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyPropertyAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__ModifyProperty__Group_3__1__Impl"


    // $ANTLR start "rule__ValueAssignment__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2582:1: rule__ValueAssignment__Group__0 : rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 ;
    public final void rule__ValueAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2586:1: ( rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2587:2: rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__05212);
            rule__ValueAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__05215);
            rule__ValueAssignment__Group__1();

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
    // $ANTLR end "rule__ValueAssignment__Group__0"


    // $ANTLR start "rule__ValueAssignment__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2594:1: rule__ValueAssignment__Group__0__Impl : ( ( rule__ValueAssignment__AttributeAssignment_0 ) ) ;
    public final void rule__ValueAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2598:1: ( ( ( rule__ValueAssignment__AttributeAssignment_0 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2599:1: ( ( rule__ValueAssignment__AttributeAssignment_0 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2599:1: ( ( rule__ValueAssignment__AttributeAssignment_0 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2600:1: ( rule__ValueAssignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getValueAssignmentAccess().getAttributeAssignment_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2601:1: ( rule__ValueAssignment__AttributeAssignment_0 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2601:2: rule__ValueAssignment__AttributeAssignment_0
            {
            pushFollow(FOLLOW_rule__ValueAssignment__AttributeAssignment_0_in_rule__ValueAssignment__Group__0__Impl5242);
            rule__ValueAssignment__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValueAssignmentAccess().getAttributeAssignment_0()); 

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
    // $ANTLR end "rule__ValueAssignment__Group__0__Impl"


    // $ANTLR start "rule__ValueAssignment__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2611:1: rule__ValueAssignment__Group__1 : rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 ;
    public final void rule__ValueAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2615:1: ( rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2616:2: rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__15272);
            rule__ValueAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__15275);
            rule__ValueAssignment__Group__2();

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
    // $ANTLR end "rule__ValueAssignment__Group__1"


    // $ANTLR start "rule__ValueAssignment__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2623:1: rule__ValueAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__ValueAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2627:1: ( ( '=' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2628:1: ( '=' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2628:1: ( '=' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2629:1: '='
            {
             before(grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__ValueAssignment__Group__1__Impl5303); 
             after(grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__ValueAssignment__Group__1__Impl"


    // $ANTLR start "rule__ValueAssignment__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2642:1: rule__ValueAssignment__Group__2 : rule__ValueAssignment__Group__2__Impl ;
    public final void rule__ValueAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2646:1: ( rule__ValueAssignment__Group__2__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2647:2: rule__ValueAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__25334);
            rule__ValueAssignment__Group__2__Impl();

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
    // $ANTLR end "rule__ValueAssignment__Group__2"


    // $ANTLR start "rule__ValueAssignment__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2653:1: rule__ValueAssignment__Group__2__Impl : ( ( rule__ValueAssignment__ValueAssignment_2 ) ) ;
    public final void rule__ValueAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2657:1: ( ( ( rule__ValueAssignment__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2658:1: ( ( rule__ValueAssignment__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2658:1: ( ( rule__ValueAssignment__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2659:1: ( rule__ValueAssignment__ValueAssignment_2 )
            {
             before(grammarAccess.getValueAssignmentAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2660:1: ( rule__ValueAssignment__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2660:2: rule__ValueAssignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__ValueAssignment_2_in_rule__ValueAssignment__Group__2__Impl5361);
            rule__ValueAssignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValueAssignmentAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__ValueAssignment__Group__2__Impl"


    // $ANTLR start "rule__FilterProperty__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2676:1: rule__FilterProperty__Group__0 : rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1 ;
    public final void rule__FilterProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2680:1: ( rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2681:2: rule__FilterProperty__Group__0__Impl rule__FilterProperty__Group__1
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__0__Impl_in_rule__FilterProperty__Group__05397);
            rule__FilterProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterProperty__Group__1_in_rule__FilterProperty__Group__05400);
            rule__FilterProperty__Group__1();

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
    // $ANTLR end "rule__FilterProperty__Group__0"


    // $ANTLR start "rule__FilterProperty__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2688:1: rule__FilterProperty__Group__0__Impl : ( 'filter property' ) ;
    public final void rule__FilterProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2692:1: ( ( 'filter property' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2693:1: ( 'filter property' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2693:1: ( 'filter property' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2694:1: 'filter property'
            {
             before(grammarAccess.getFilterPropertyAccess().getFilterPropertyKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__FilterProperty__Group__0__Impl5428); 
             after(grammarAccess.getFilterPropertyAccess().getFilterPropertyKeyword_0()); 

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
    // $ANTLR end "rule__FilterProperty__Group__0__Impl"


    // $ANTLR start "rule__FilterProperty__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2707:1: rule__FilterProperty__Group__1 : rule__FilterProperty__Group__1__Impl ;
    public final void rule__FilterProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2711:1: ( rule__FilterProperty__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2712:2: rule__FilterProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterProperty__Group__1__Impl_in_rule__FilterProperty__Group__15459);
            rule__FilterProperty__Group__1__Impl();

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
    // $ANTLR end "rule__FilterProperty__Group__1"


    // $ANTLR start "rule__FilterProperty__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2718:1: rule__FilterProperty__Group__1__Impl : ( ( rule__FilterProperty__PropertyAssignment_1 ) ) ;
    public final void rule__FilterProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2722:1: ( ( ( rule__FilterProperty__PropertyAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2723:1: ( ( rule__FilterProperty__PropertyAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2723:1: ( ( rule__FilterProperty__PropertyAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2724:1: ( rule__FilterProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getFilterPropertyAccess().getPropertyAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2725:1: ( rule__FilterProperty__PropertyAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2725:2: rule__FilterProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterProperty__PropertyAssignment_1_in_rule__FilterProperty__Group__1__Impl5486);
            rule__FilterProperty__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterPropertyAccess().getPropertyAssignment_1()); 

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
    // $ANTLR end "rule__FilterProperty__Group__1__Impl"


    // $ANTLR start "rule__FilterClass__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2739:1: rule__FilterClass__Group__0 : rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1 ;
    public final void rule__FilterClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2743:1: ( rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2744:2: rule__FilterClass__Group__0__Impl rule__FilterClass__Group__1
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__0__Impl_in_rule__FilterClass__Group__05520);
            rule__FilterClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__1_in_rule__FilterClass__Group__05523);
            rule__FilterClass__Group__1();

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
    // $ANTLR end "rule__FilterClass__Group__0"


    // $ANTLR start "rule__FilterClass__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2751:1: rule__FilterClass__Group__0__Impl : ( 'filter class' ) ;
    public final void rule__FilterClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2755:1: ( ( 'filter class' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2756:1: ( 'filter class' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2756:1: ( 'filter class' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2757:1: 'filter class'
            {
             before(grammarAccess.getFilterClassAccess().getFilterClassKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__FilterClass__Group__0__Impl5551); 
             after(grammarAccess.getFilterClassAccess().getFilterClassKeyword_0()); 

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
    // $ANTLR end "rule__FilterClass__Group__0__Impl"


    // $ANTLR start "rule__FilterClass__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2770:1: rule__FilterClass__Group__1 : rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2 ;
    public final void rule__FilterClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2774:1: ( rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2775:2: rule__FilterClass__Group__1__Impl rule__FilterClass__Group__2
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__1__Impl_in_rule__FilterClass__Group__15582);
            rule__FilterClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__2_in_rule__FilterClass__Group__15585);
            rule__FilterClass__Group__2();

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
    // $ANTLR end "rule__FilterClass__Group__1"


    // $ANTLR start "rule__FilterClass__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2782:1: rule__FilterClass__Group__1__Impl : ( ( rule__FilterClass__PrefixAssignment_1 ) ) ;
    public final void rule__FilterClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2786:1: ( ( ( rule__FilterClass__PrefixAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2787:1: ( ( rule__FilterClass__PrefixAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2787:1: ( ( rule__FilterClass__PrefixAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2788:1: ( rule__FilterClass__PrefixAssignment_1 )
            {
             before(grammarAccess.getFilterClassAccess().getPrefixAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2789:1: ( rule__FilterClass__PrefixAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2789:2: rule__FilterClass__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterClass__PrefixAssignment_1_in_rule__FilterClass__Group__1__Impl5612);
            rule__FilterClass__PrefixAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterClassAccess().getPrefixAssignment_1()); 

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
    // $ANTLR end "rule__FilterClass__Group__1__Impl"


    // $ANTLR start "rule__FilterClass__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2799:1: rule__FilterClass__Group__2 : rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3 ;
    public final void rule__FilterClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2803:1: ( rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2804:2: rule__FilterClass__Group__2__Impl rule__FilterClass__Group__3
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__2__Impl_in_rule__FilterClass__Group__25642);
            rule__FilterClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterClass__Group__3_in_rule__FilterClass__Group__25645);
            rule__FilterClass__Group__3();

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
    // $ANTLR end "rule__FilterClass__Group__2"


    // $ANTLR start "rule__FilterClass__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2811:1: rule__FilterClass__Group__2__Impl : ( '.' ) ;
    public final void rule__FilterClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2815:1: ( ( '.' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2816:1: ( '.' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2816:1: ( '.' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2817:1: '.'
            {
             before(grammarAccess.getFilterClassAccess().getFullStopKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__FilterClass__Group__2__Impl5673); 
             after(grammarAccess.getFilterClassAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__FilterClass__Group__2__Impl"


    // $ANTLR start "rule__FilterClass__Group__3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2830:1: rule__FilterClass__Group__3 : rule__FilterClass__Group__3__Impl ;
    public final void rule__FilterClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2834:1: ( rule__FilterClass__Group__3__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2835:2: rule__FilterClass__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FilterClass__Group__3__Impl_in_rule__FilterClass__Group__35704);
            rule__FilterClass__Group__3__Impl();

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
    // $ANTLR end "rule__FilterClass__Group__3"


    // $ANTLR start "rule__FilterClass__Group__3__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2841:1: rule__FilterClass__Group__3__Impl : ( ( rule__FilterClass__ClassAssignment_3 ) ) ;
    public final void rule__FilterClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2845:1: ( ( ( rule__FilterClass__ClassAssignment_3 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2846:1: ( ( rule__FilterClass__ClassAssignment_3 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2846:1: ( ( rule__FilterClass__ClassAssignment_3 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2847:1: ( rule__FilterClass__ClassAssignment_3 )
            {
             before(grammarAccess.getFilterClassAccess().getClassAssignment_3()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2848:1: ( rule__FilterClass__ClassAssignment_3 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2848:2: rule__FilterClass__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__FilterClass__ClassAssignment_3_in_rule__FilterClass__Group__3__Impl5731);
            rule__FilterClass__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFilterClassAccess().getClassAssignment_3()); 

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
    // $ANTLR end "rule__FilterClass__Group__3__Impl"


    // $ANTLR start "rule__AddConstraint__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2866:1: rule__AddConstraint__Group__0 : rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1 ;
    public final void rule__AddConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2870:1: ( rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2871:2: rule__AddConstraint__Group__0__Impl rule__AddConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__0__Impl_in_rule__AddConstraint__Group__05769);
            rule__AddConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddConstraint__Group__1_in_rule__AddConstraint__Group__05772);
            rule__AddConstraint__Group__1();

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
    // $ANTLR end "rule__AddConstraint__Group__0"


    // $ANTLR start "rule__AddConstraint__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2878:1: rule__AddConstraint__Group__0__Impl : ( 'add constraint' ) ;
    public final void rule__AddConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2882:1: ( ( 'add constraint' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2883:1: ( 'add constraint' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2883:1: ( 'add constraint' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2884:1: 'add constraint'
            {
             before(grammarAccess.getAddConstraintAccess().getAddConstraintKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__AddConstraint__Group__0__Impl5800); 
             after(grammarAccess.getAddConstraintAccess().getAddConstraintKeyword_0()); 

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
    // $ANTLR end "rule__AddConstraint__Group__0__Impl"


    // $ANTLR start "rule__AddConstraint__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2897:1: rule__AddConstraint__Group__1 : rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2 ;
    public final void rule__AddConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2901:1: ( rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2902:2: rule__AddConstraint__Group__1__Impl rule__AddConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__1__Impl_in_rule__AddConstraint__Group__15831);
            rule__AddConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddConstraint__Group__2_in_rule__AddConstraint__Group__15834);
            rule__AddConstraint__Group__2();

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
    // $ANTLR end "rule__AddConstraint__Group__1"


    // $ANTLR start "rule__AddConstraint__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2909:1: rule__AddConstraint__Group__1__Impl : ( ( rule__AddConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__AddConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2913:1: ( ( ( rule__AddConstraint__ConstraintAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2914:1: ( ( rule__AddConstraint__ConstraintAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2914:1: ( ( rule__AddConstraint__ConstraintAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2915:1: ( rule__AddConstraint__ConstraintAssignment_1 )
            {
             before(grammarAccess.getAddConstraintAccess().getConstraintAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2916:1: ( rule__AddConstraint__ConstraintAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2916:2: rule__AddConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__AddConstraint__ConstraintAssignment_1_in_rule__AddConstraint__Group__1__Impl5861);
            rule__AddConstraint__ConstraintAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddConstraintAccess().getConstraintAssignment_1()); 

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
    // $ANTLR end "rule__AddConstraint__Group__1__Impl"


    // $ANTLR start "rule__AddConstraint__Group__2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2926:1: rule__AddConstraint__Group__2 : rule__AddConstraint__Group__2__Impl ;
    public final void rule__AddConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2930:1: ( rule__AddConstraint__Group__2__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2931:2: rule__AddConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AddConstraint__Group__2__Impl_in_rule__AddConstraint__Group__25891);
            rule__AddConstraint__Group__2__Impl();

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
    // $ANTLR end "rule__AddConstraint__Group__2"


    // $ANTLR start "rule__AddConstraint__Group__2__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2937:1: rule__AddConstraint__Group__2__Impl : ( ( rule__AddConstraint__ValueAssignment_2 ) ) ;
    public final void rule__AddConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2941:1: ( ( ( rule__AddConstraint__ValueAssignment_2 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2942:1: ( ( rule__AddConstraint__ValueAssignment_2 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2942:1: ( ( rule__AddConstraint__ValueAssignment_2 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2943:1: ( rule__AddConstraint__ValueAssignment_2 )
            {
             before(grammarAccess.getAddConstraintAccess().getValueAssignment_2()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2944:1: ( rule__AddConstraint__ValueAssignment_2 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2944:2: rule__AddConstraint__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AddConstraint__ValueAssignment_2_in_rule__AddConstraint__Group__2__Impl5918);
            rule__AddConstraint__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddConstraintAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__AddConstraint__Group__2__Impl"


    // $ANTLR start "rule__FilterConstraint__Group__0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2960:1: rule__FilterConstraint__Group__0 : rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1 ;
    public final void rule__FilterConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2964:1: ( rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2965:2: rule__FilterConstraint__Group__0__Impl rule__FilterConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__0__Impl_in_rule__FilterConstraint__Group__05954);
            rule__FilterConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterConstraint__Group__1_in_rule__FilterConstraint__Group__05957);
            rule__FilterConstraint__Group__1();

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
    // $ANTLR end "rule__FilterConstraint__Group__0"


    // $ANTLR start "rule__FilterConstraint__Group__0__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2972:1: rule__FilterConstraint__Group__0__Impl : ( 'filter constraint' ) ;
    public final void rule__FilterConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2976:1: ( ( 'filter constraint' ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2977:1: ( 'filter constraint' )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2977:1: ( 'filter constraint' )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2978:1: 'filter constraint'
            {
             before(grammarAccess.getFilterConstraintAccess().getFilterConstraintKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__FilterConstraint__Group__0__Impl5985); 
             after(grammarAccess.getFilterConstraintAccess().getFilterConstraintKeyword_0()); 

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
    // $ANTLR end "rule__FilterConstraint__Group__0__Impl"


    // $ANTLR start "rule__FilterConstraint__Group__1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2991:1: rule__FilterConstraint__Group__1 : rule__FilterConstraint__Group__1__Impl ;
    public final void rule__FilterConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2995:1: ( rule__FilterConstraint__Group__1__Impl )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:2996:2: rule__FilterConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterConstraint__Group__1__Impl_in_rule__FilterConstraint__Group__16016);
            rule__FilterConstraint__Group__1__Impl();

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
    // $ANTLR end "rule__FilterConstraint__Group__1"


    // $ANTLR start "rule__FilterConstraint__Group__1__Impl"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3002:1: rule__FilterConstraint__Group__1__Impl : ( ( rule__FilterConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__FilterConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3006:1: ( ( ( rule__FilterConstraint__ConstraintAssignment_1 ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3007:1: ( ( rule__FilterConstraint__ConstraintAssignment_1 ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3007:1: ( ( rule__FilterConstraint__ConstraintAssignment_1 ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3008:1: ( rule__FilterConstraint__ConstraintAssignment_1 )
            {
             before(grammarAccess.getFilterConstraintAccess().getConstraintAssignment_1()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3009:1: ( rule__FilterConstraint__ConstraintAssignment_1 )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3009:2: rule__FilterConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterConstraint__ConstraintAssignment_1_in_rule__FilterConstraint__Group__1__Impl6043);
            rule__FilterConstraint__ConstraintAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterConstraintAccess().getConstraintAssignment_1()); 

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
    // $ANTLR end "rule__FilterConstraint__Group__1__Impl"


    // $ANTLR start "rule__Model__ExtensionNameAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3024:1: rule__Model__ExtensionNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__ExtensionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3028:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3029:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3029:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3030:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getExtensionNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__ExtensionNameAssignment_16082); 
             after(grammarAccess.getModelAccess().getExtensionNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ExtensionNameAssignment_1"


    // $ANTLR start "rule__Model__MetamodelAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3039:1: rule__Model__MetamodelAssignment_3 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3043:1: ( ( ruleMetamodel ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3044:1: ( ruleMetamodel )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3044:1: ( ruleMetamodel )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3045:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_36113);
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


    // $ANTLR start "rule__Model__PrefixAssignment_5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3054:1: rule__Model__PrefixAssignment_5 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3058:1: ( ( rulePrefix ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3059:1: ( rulePrefix )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3059:1: ( rulePrefix )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3060:1: rulePrefix
            {
             before(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_56144);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Model__PrefixAssignment_5"


    // $ANTLR start "rule__Model__MetamodelAssignment_6_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3069:1: rule__Model__MetamodelAssignment_6_1 : ( ruleMetamodel ) ;
    public final void rule__Model__MetamodelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3073:1: ( ( ruleMetamodel ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3074:1: ( ruleMetamodel )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3074:1: ( ruleMetamodel )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3075:1: ruleMetamodel
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_6_16175);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMetamodelMetamodelParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Model__MetamodelAssignment_6_1"


    // $ANTLR start "rule__Model__PrefixAssignment_6_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3084:1: rule__Model__PrefixAssignment_6_3 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3088:1: ( ( rulePrefix ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3089:1: ( rulePrefix )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3089:1: ( rulePrefix )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3090:1: rulePrefix
            {
             before(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_6_36206);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__Model__PrefixAssignment_6_3"


    // $ANTLR start "rule__Model__ExtensionsAssignment_8"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3099:1: rule__Model__ExtensionsAssignment_8 : ( ruleExtension ) ;
    public final void rule__Model__ExtensionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3103:1: ( ( ruleExtension ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3104:1: ( ruleExtension )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3104:1: ( ruleExtension )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3105:1: ruleExtension
            {
             before(grammarAccess.getModelAccess().getExtensionsExtensionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleExtension_in_rule__Model__ExtensionsAssignment_86237);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExtensionsExtensionParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Model__ExtensionsAssignment_8"


    // $ANTLR start "rule__Metamodel__NameAssignment"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3114:1: rule__Metamodel__NameAssignment : ( RULE_ID ) ;
    public final void rule__Metamodel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3118:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3119:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3119:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3120:1: RULE_ID
            {
             before(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment6268); 
             after(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Metamodel__NameAssignment"


    // $ANTLR start "rule__Prefix__NameAssignment"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3129:1: rule__Prefix__NameAssignment : ( RULE_ID ) ;
    public final void rule__Prefix__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3133:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3134:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3134:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3135:1: RULE_ID
            {
             before(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment6299); 
             after(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Prefix__NameAssignment"


    // $ANTLR start "rule__Create__ClassAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3144:1: rule__Create__ClassAssignment_1 : ( RULE_ID ) ;
    public final void rule__Create__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3148:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3149:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3149:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3150:1: RULE_ID
            {
             before(grammarAccess.getCreateAccess().getClassIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Create__ClassAssignment_16330); 
             after(grammarAccess.getCreateAccess().getClassIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Create__ClassAssignment_1"


    // $ANTLR start "rule__Refine__ClassNewAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3159:1: rule__Refine__ClassNewAssignment_1 : ( RULE_ID ) ;
    public final void rule__Refine__ClassNewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3163:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3164:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3164:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3165:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getClassNewIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__ClassNewAssignment_16361); 
             after(grammarAccess.getRefineAccess().getClassNewIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Refine__ClassNewAssignment_1"


    // $ANTLR start "rule__Refine__PrefixAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3174:1: rule__Refine__PrefixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Refine__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3178:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3179:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3179:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3180:1: ( RULE_ID )
            {
             before(grammarAccess.getRefineAccess().getPrefixPrefixCrossReference_3_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3181:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3182:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__PrefixAssignment_36396); 
             after(grammarAccess.getRefineAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRefineAccess().getPrefixPrefixCrossReference_3_0()); 

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
    // $ANTLR end "rule__Refine__PrefixAssignment_3"


    // $ANTLR start "rule__Refine__ClassOriginalAssignment_5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3193:1: rule__Refine__ClassOriginalAssignment_5 : ( RULE_ID ) ;
    public final void rule__Refine__ClassOriginalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3197:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3198:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3198:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3199:1: RULE_ID
            {
             before(grammarAccess.getRefineAccess().getClassOriginalIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Refine__ClassOriginalAssignment_56431); 
             after(grammarAccess.getRefineAccess().getClassOriginalIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Refine__ClassOriginalAssignment_5"


    // $ANTLR start "rule__Generalize__ClassNewAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3208:1: rule__Generalize__ClassNewAssignment_1 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassNewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3212:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3213:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3213:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3214:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassNewIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassNewAssignment_16462); 
             after(grammarAccess.getGeneralizeAccess().getClassNewIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Generalize__ClassNewAssignment_1"


    // $ANTLR start "rule__Generalize__PrefixAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3223:1: rule__Generalize__PrefixAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Generalize__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3227:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3228:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3228:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3229:1: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_3_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3230:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3231:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_36497); 
             after(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_3_0()); 

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
    // $ANTLR end "rule__Generalize__PrefixAssignment_3"


    // $ANTLR start "rule__Generalize__ClassAssignment_5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3242:1: rule__Generalize__ClassAssignment_5 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3246:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3247:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3247:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3248:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_56532); 
             after(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Generalize__ClassAssignment_5"


    // $ANTLR start "rule__Generalize__PrefixAssignment_6_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3257:1: rule__Generalize__PrefixAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generalize__PrefixAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3261:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3262:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3262:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3263:1: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_6_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3264:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3265:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_6_16567); 
             after(grammarAccess.getGeneralizeAccess().getPrefixPrefixIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getGeneralizeAccess().getPrefixPrefixCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Generalize__PrefixAssignment_6_1"


    // $ANTLR start "rule__Generalize__ClassAssignment_6_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3276:1: rule__Generalize__ClassAssignment_6_3 : ( RULE_ID ) ;
    public final void rule__Generalize__ClassAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3280:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3281:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3281:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3282:1: RULE_ID
            {
             before(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_6_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_6_36602); 
             after(grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__Generalize__ClassAssignment_6_3"


    // $ANTLR start "rule__ModifyClass__PrefixAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3291:1: rule__ModifyClass__PrefixAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ModifyClass__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3295:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3296:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3296:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3297:1: ( RULE_ID )
            {
             before(grammarAccess.getModifyClassAccess().getPrefixPrefixCrossReference_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3298:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3299:1: RULE_ID
            {
             before(grammarAccess.getModifyClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyClass__PrefixAssignment_16637); 
             after(grammarAccess.getModifyClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getModifyClassAccess().getPrefixPrefixCrossReference_1_0()); 

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
    // $ANTLR end "rule__ModifyClass__PrefixAssignment_1"


    // $ANTLR start "rule__ModifyClass__ClassAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3310:1: rule__ModifyClass__ClassAssignment_3 : ( RULE_ID ) ;
    public final void rule__ModifyClass__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3314:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3315:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3315:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3316:1: RULE_ID
            {
             before(grammarAccess.getModifyClassAccess().getClassIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyClass__ClassAssignment_36672); 
             after(grammarAccess.getModifyClassAccess().getClassIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ModifyClass__ClassAssignment_3"


    // $ANTLR start "rule__ModifyClass__ModifyOperatorsAssignment_5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3325:1: rule__ModifyClass__ModifyOperatorsAssignment_5 : ( ruleModifyOperator ) ;
    public final void rule__ModifyClass__ModifyOperatorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3329:1: ( ( ruleModifyOperator ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3330:1: ( ruleModifyOperator )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3330:1: ( ruleModifyOperator )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3331:1: ruleModifyOperator
            {
             before(grammarAccess.getModifyClassAccess().getModifyOperatorsModifyOperatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleModifyOperator_in_rule__ModifyClass__ModifyOperatorsAssignment_56703);
            ruleModifyOperator();

            state._fsp--;

             after(grammarAccess.getModifyClassAccess().getModifyOperatorsModifyOperatorParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ModifyClass__ModifyOperatorsAssignment_5"


    // $ANTLR start "rule__AddProperty__PropertyAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3340:1: rule__AddProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3344:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3345:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3345:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3346:1: RULE_ID
            {
             before(grammarAccess.getAddPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddProperty__PropertyAssignment_16734); 
             after(grammarAccess.getAddPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AddProperty__PropertyAssignment_1"


    // $ANTLR start "rule__AddProperty__TypeAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3355:1: rule__AddProperty__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__AddProperty__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3359:1: ( ( ruleType ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3360:1: ( ruleType )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3360:1: ( ruleType )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3361:1: ruleType
            {
             before(grammarAccess.getAddPropertyAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__AddProperty__TypeAssignment_36765);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAddPropertyAccess().getTypeTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AddProperty__TypeAssignment_3"


    // $ANTLR start "rule__AddProperty__CardinalityAssignment_4"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3370:1: rule__AddProperty__CardinalityAssignment_4 : ( ruleCardinality ) ;
    public final void rule__AddProperty__CardinalityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3374:1: ( ( ruleCardinality ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3375:1: ( ruleCardinality )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3375:1: ( ruleCardinality )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3376:1: ruleCardinality
            {
             before(grammarAccess.getAddPropertyAccess().getCardinalityCardinalityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__AddProperty__CardinalityAssignment_46796);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getAddPropertyAccess().getCardinalityCardinalityParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__AddProperty__CardinalityAssignment_4"


    // $ANTLR start "rule__AddProperty__RelationTypeAssignment_5"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3385:1: rule__AddProperty__RelationTypeAssignment_5 : ( ruleRelationType ) ;
    public final void rule__AddProperty__RelationTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3389:1: ( ( ruleRelationType ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3390:1: ( ruleRelationType )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3390:1: ( ruleRelationType )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3391:1: ruleRelationType
            {
             before(grammarAccess.getAddPropertyAccess().getRelationTypeRelationTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRelationType_in_rule__AddProperty__RelationTypeAssignment_56827);
            ruleRelationType();

            state._fsp--;

             after(grammarAccess.getAddPropertyAccess().getRelationTypeRelationTypeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__AddProperty__RelationTypeAssignment_5"


    // $ANTLR start "rule__Type__TypeAssignment_0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3400:1: rule__Type__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3404:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3405:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3405:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3406:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__TypeAssignment_06858); 
             after(grammarAccess.getTypeAccess().getTypeIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Type__TypeAssignment_0"


    // $ANTLR start "rule__Type__PrefixAssignment_1_0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3415:1: rule__Type__PrefixAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Type__PrefixAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3419:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3420:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3420:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3421:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getPrefixPrefixCrossReference_1_0_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3422:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3423:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getPrefixPrefixIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__PrefixAssignment_1_06893); 
             after(grammarAccess.getTypeAccess().getPrefixPrefixIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getPrefixPrefixCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__Type__PrefixAssignment_1_0"


    // $ANTLR start "rule__Type__ClassAssignment_1_2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3434:1: rule__Type__ClassAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Type__ClassAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3438:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3439:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3439:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3440:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getClassIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__ClassAssignment_1_26928); 
             after(grammarAccess.getTypeAccess().getClassIDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Type__ClassAssignment_1_2"


    // $ANTLR start "rule__ModifyProperty__PropertyAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3449:1: rule__ModifyProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModifyProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3453:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3454:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3454:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3455:1: RULE_ID
            {
             before(grammarAccess.getModifyPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModifyProperty__PropertyAssignment_16959); 
             after(grammarAccess.getModifyPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ModifyProperty__PropertyAssignment_1"


    // $ANTLR start "rule__ModifyProperty__ValueAssignment_2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3464:1: rule__ModifyProperty__ValueAssignment_2 : ( ruleValueAssignment ) ;
    public final void rule__ModifyProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3468:1: ( ( ruleValueAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3469:1: ( ruleValueAssignment )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3469:1: ( ruleValueAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3470:1: ruleValueAssignment
            {
             before(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_26990);
            ruleValueAssignment();

            state._fsp--;

             after(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ModifyProperty__ValueAssignment_2"


    // $ANTLR start "rule__ModifyProperty__ValueAssignment_3_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3479:1: rule__ModifyProperty__ValueAssignment_3_1 : ( ruleValueAssignment ) ;
    public final void rule__ModifyProperty__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3483:1: ( ( ruleValueAssignment ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3484:1: ( ruleValueAssignment )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3484:1: ( ruleValueAssignment )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3485:1: ruleValueAssignment
            {
             before(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_3_17021);
            ruleValueAssignment();

            state._fsp--;

             after(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ModifyProperty__ValueAssignment_3_1"


    // $ANTLR start "rule__ValueAssignment__AttributeAssignment_0"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3494:1: rule__ValueAssignment__AttributeAssignment_0 : ( RULE_ID ) ;
    public final void rule__ValueAssignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3498:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3499:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3499:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3500:1: RULE_ID
            {
             before(grammarAccess.getValueAssignmentAccess().getAttributeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValueAssignment__AttributeAssignment_07052); 
             after(grammarAccess.getValueAssignmentAccess().getAttributeIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ValueAssignment__AttributeAssignment_0"


    // $ANTLR start "rule__ValueAssignment__ValueAssignment_2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3509:1: rule__ValueAssignment__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__ValueAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3513:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3514:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3514:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3515:1: ruleEString
            {
             before(grammarAccess.getValueAssignmentAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ValueAssignment__ValueAssignment_27083);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueAssignmentAccess().getValueEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ValueAssignment__ValueAssignment_2"


    // $ANTLR start "rule__FilterProperty__PropertyAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3524:1: rule__FilterProperty__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__FilterProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3528:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3529:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3529:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3530:1: RULE_ID
            {
             before(grammarAccess.getFilterPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterProperty__PropertyAssignment_17114); 
             after(grammarAccess.getFilterPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FilterProperty__PropertyAssignment_1"


    // $ANTLR start "rule__FilterClass__PrefixAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3539:1: rule__FilterClass__PrefixAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FilterClass__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3543:1: ( ( ( RULE_ID ) ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3544:1: ( ( RULE_ID ) )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3544:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3545:1: ( RULE_ID )
            {
             before(grammarAccess.getFilterClassAccess().getPrefixPrefixCrossReference_1_0()); 
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3546:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3547:1: RULE_ID
            {
             before(grammarAccess.getFilterClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterClass__PrefixAssignment_17149); 
             after(grammarAccess.getFilterClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFilterClassAccess().getPrefixPrefixCrossReference_1_0()); 

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
    // $ANTLR end "rule__FilterClass__PrefixAssignment_1"


    // $ANTLR start "rule__FilterClass__ClassAssignment_3"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3558:1: rule__FilterClass__ClassAssignment_3 : ( RULE_ID ) ;
    public final void rule__FilterClass__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3562:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3563:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3563:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3564:1: RULE_ID
            {
             before(grammarAccess.getFilterClassAccess().getClassIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterClass__ClassAssignment_37184); 
             after(grammarAccess.getFilterClassAccess().getClassIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__FilterClass__ClassAssignment_3"


    // $ANTLR start "rule__AddConstraint__ConstraintAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3573:1: rule__AddConstraint__ConstraintAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3577:1: ( ( RULE_ID ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3578:1: ( RULE_ID )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3578:1: ( RULE_ID )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3579:1: RULE_ID
            {
             before(grammarAccess.getAddConstraintAccess().getConstraintIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddConstraint__ConstraintAssignment_17215); 
             after(grammarAccess.getAddConstraintAccess().getConstraintIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AddConstraint__ConstraintAssignment_1"


    // $ANTLR start "rule__AddConstraint__ValueAssignment_2"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3588:1: rule__AddConstraint__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__AddConstraint__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3592:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3593:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3593:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3594:1: ruleEString
            {
             before(grammarAccess.getAddConstraintAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__AddConstraint__ValueAssignment_27246);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddConstraintAccess().getValueEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AddConstraint__ValueAssignment_2"


    // $ANTLR start "rule__FilterConstraint__ConstraintAssignment_1"
    // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3603:1: rule__FilterConstraint__ConstraintAssignment_1 : ( ruleEString ) ;
    public final void rule__FilterConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3607:1: ( ( ruleEString ) )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3608:1: ( ruleEString )
            {
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3608:1: ( ruleEString )
            // ../monoge.dsl.ui/src-gen/monoge/dsl/ui/contentassist/antlr/internal/InternalExtension.g:3609:1: ruleEString
            {
             before(grammarAccess.getFilterConstraintAccess().getConstraintEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__FilterConstraint__ConstraintAssignment_17277);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterConstraintAccess().getConstraintEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FilterConstraint__ConstraintAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtension128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extension__Alternatives_in_ruleExtension154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_entryRuleMetamodel181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodel188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__NameAssignment_in_ruleMetamodel214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__NameAssignment_in_rulePrefix274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_entryRuleCreate301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreate308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__0_in_ruleCreate334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefine_in_entryRuleRefine361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefine368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__0_in_ruleRefine394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralize_in_entryRuleGeneralize421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralize428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__0_in_ruleGeneralize454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyClass_in_entryRuleModifyClass481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyClass488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__0_in_ruleModifyClass514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyOperator_in_entryRuleModifyOperator541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyOperator548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyOperator__Alternatives_in_ruleModifyOperator574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddProperty_in_entryRuleAddProperty601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddProperty608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__0_in_ruleAddProperty634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyProperty_in_entryRuleModifyProperty721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyProperty728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__0_in_ruleModifyProperty754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueAssignment788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__0_in_ruleValueAssignment814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterProperty_in_entryRuleFilterProperty841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterProperty848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__0_in_ruleFilterProperty874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterClass_in_entryRuleFilterClass901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterClass908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__0_in_ruleFilterClass934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddConstraint_in_entryRuleAddConstraint961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddConstraint968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__0_in_ruleAddConstraint994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterConstraint_in_entryRuleFilterConstraint1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterConstraint1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__0_in_ruleFilterConstraint1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_entryRuleRelationType1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationType1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_rule__Extension__Alternatives1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefine_in_rule__Extension__Alternatives1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralize_in_rule__Extension__Alternatives1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyClass_in_rule__Extension__Alternatives1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterClass_in_rule__Extension__Alternatives1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddProperty_in_rule__ModifyOperator__Alternatives1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyProperty_in_rule__ModifyOperator__Alternatives1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterProperty_in_rule__ModifyOperator__Alternatives1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddConstraint_in_rule__ModifyOperator__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterConstraint_in_rule__ModifyOperator__Alternatives1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_0_in_rule__Type__Alternatives1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Cardinality__Alternatives1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Cardinality__Alternatives1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Cardinality__Alternatives1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Cardinality__Alternatives1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cardinality__Alternatives1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Cardinality__Alternatives1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Cardinality__Alternatives1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RelationType__Alternatives1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RelationType__Alternatives1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__0__Impl1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11840 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExtensionNameAssignment_1_in_rule__Model__Group__1__Impl1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21900 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group__2__Impl1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31962 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_3_in_rule__Model__Group__3__Impl1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group__4__Impl2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52084 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PrefixAssignment_5_in_rule__Model__Group__5__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62144 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl2174 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72205 = new BitSet(new long[]{0x0000001045000000L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__72208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Model__Group__7__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__82267 = new BitSet(new long[]{0x0000001045000000L});
    public static final BitSet FOLLOW_rule__Model__Group__9_in_rule__Model__Group__82270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExtensionsAssignment_8_in_rule__Model__Group__8__Impl2297 = new BitSet(new long[]{0x0000001044000002L});
    public static final BitSet FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__92328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Model__Group__9__Impl2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__02407 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__02410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group_6__0__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__12469 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Model__Group_6__2_in_rule__Model__Group_6__12472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelAssignment_6_1_in_rule__Model__Group_6__1__Impl2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__2__Impl_in_rule__Model__Group_6__22529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_6__3_in_rule__Model__Group_6__22532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group_6__2__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_6__3__Impl_in_rule__Model__Group_6__32591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PrefixAssignment_6_3_in_rule__Model__Group_6__3__Impl2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__0__Impl_in_rule__Create__Group__02656 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Create__Group__1_in_rule__Create__Group__02659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Create__Group__0__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__1__Impl_in_rule__Create__Group__12718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__ClassAssignment_1_in_rule__Create__Group__1__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__0__Impl_in_rule__Refine__Group__02779 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__1_in_rule__Refine__Group__02782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Refine__Group__0__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__1__Impl_in_rule__Refine__Group__12841 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Refine__Group__2_in_rule__Refine__Group__12844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__ClassNewAssignment_1_in_rule__Refine__Group__1__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__2__Impl_in_rule__Refine__Group__22901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__3_in_rule__Refine__Group__22904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Refine__Group__2__Impl2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__3__Impl_in_rule__Refine__Group__32963 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Refine__Group__4_in_rule__Refine__Group__32966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__PrefixAssignment_3_in_rule__Refine__Group__3__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__4__Impl_in_rule__Refine__Group__43023 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Refine__Group__5_in_rule__Refine__Group__43026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Refine__Group__4__Impl3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__Group__5__Impl_in_rule__Refine__Group__53085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Refine__ClassOriginalAssignment_5_in_rule__Refine__Group__5__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__0__Impl_in_rule__Generalize__Group__03154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__1_in_rule__Generalize__Group__03157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Generalize__Group__0__Impl3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__1__Impl_in_rule__Generalize__Group__13216 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__2_in_rule__Generalize__Group__13219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassNewAssignment_1_in_rule__Generalize__Group__1__Impl3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__2__Impl_in_rule__Generalize__Group__23276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__3_in_rule__Generalize__Group__23279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Generalize__Group__2__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__3__Impl_in_rule__Generalize__Group__33338 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__4_in_rule__Generalize__Group__33341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__PrefixAssignment_3_in_rule__Generalize__Group__3__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__4__Impl_in_rule__Generalize__Group__43398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group__5_in_rule__Generalize__Group__43401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Generalize__Group__4__Impl3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__5__Impl_in_rule__Generalize__Group__53460 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group__6_in_rule__Generalize__Group__53463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassAssignment_5_in_rule__Generalize__Group__5__Impl3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group__6__Impl_in_rule__Generalize__Group__63520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__0_in_rule__Generalize__Group__6__Impl3547 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__0__Impl_in_rule__Generalize__Group_6__03592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__1_in_rule__Generalize__Group_6__03595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Generalize__Group_6__0__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__1__Impl_in_rule__Generalize__Group_6__13654 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__2_in_rule__Generalize__Group_6__13657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__PrefixAssignment_6_1_in_rule__Generalize__Group_6__1__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__2__Impl_in_rule__Generalize__Group_6__23714 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__3_in_rule__Generalize__Group_6__23717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Generalize__Group_6__2__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__Group_6__3__Impl_in_rule__Generalize__Group_6__33776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalize__ClassAssignment_6_3_in_rule__Generalize__Group_6__3__Impl3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__0__Impl_in_rule__ModifyClass__Group__03841 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__1_in_rule__ModifyClass__Group__03844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ModifyClass__Group__0__Impl3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__1__Impl_in_rule__ModifyClass__Group__13903 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__2_in_rule__ModifyClass__Group__13906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__PrefixAssignment_1_in_rule__ModifyClass__Group__1__Impl3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__2__Impl_in_rule__ModifyClass__Group__23963 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__3_in_rule__ModifyClass__Group__23966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ModifyClass__Group__2__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__3__Impl_in_rule__ModifyClass__Group__34025 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__4_in_rule__ModifyClass__Group__34028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__ClassAssignment_3_in_rule__ModifyClass__Group__3__Impl4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__4__Impl_in_rule__ModifyClass__Group__44085 = new BitSet(new long[]{0x0000006A81000000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__5_in_rule__ModifyClass__Group__44088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ModifyClass__Group__4__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__5__Impl_in_rule__ModifyClass__Group__54147 = new BitSet(new long[]{0x0000006A81000000L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__6_in_rule__ModifyClass__Group__54150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__ModifyOperatorsAssignment_5_in_rule__ModifyClass__Group__5__Impl4177 = new BitSet(new long[]{0x0000006A80000002L});
    public static final BitSet FOLLOW_rule__ModifyClass__Group__6__Impl_in_rule__ModifyClass__Group__64208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ModifyClass__Group__6__Impl4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__0__Impl_in_rule__AddProperty__Group__04281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__1_in_rule__AddProperty__Group__04284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AddProperty__Group__0__Impl4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__1__Impl_in_rule__AddProperty__Group__14343 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__2_in_rule__AddProperty__Group__14346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__PropertyAssignment_1_in_rule__AddProperty__Group__1__Impl4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__2__Impl_in_rule__AddProperty__Group__24403 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__3_in_rule__AddProperty__Group__24406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AddProperty__Group__2__Impl4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__3__Impl_in_rule__AddProperty__Group__34465 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__4_in_rule__AddProperty__Group__34468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__TypeAssignment_3_in_rule__AddProperty__Group__3__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__4__Impl_in_rule__AddProperty__Group__44525 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__5_in_rule__AddProperty__Group__44528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__CardinalityAssignment_4_in_rule__AddProperty__Group__4__Impl4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__Group__5__Impl_in_rule__AddProperty__Group__54586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddProperty__RelationTypeAssignment_5_in_rule__AddProperty__Group__5__Impl4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__04656 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__04659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__PrefixAssignment_1_0_in_rule__Type__Group_1__0__Impl4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__14716 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__14719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Type__Group_1__1__Impl4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__24778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ClassAssignment_1_2_in_rule__Type__Group_1__2__Impl4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__0__Impl_in_rule__ModifyProperty__Group__04841 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__1_in_rule__ModifyProperty__Group__04844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ModifyProperty__Group__0__Impl4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__1__Impl_in_rule__ModifyProperty__Group__14903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__2_in_rule__ModifyProperty__Group__14906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__PropertyAssignment_1_in_rule__ModifyProperty__Group__1__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__2__Impl_in_rule__ModifyProperty__Group__24963 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__3_in_rule__ModifyProperty__Group__24966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__ValueAssignment_2_in_rule__ModifyProperty__Group__2__Impl4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group__3__Impl_in_rule__ModifyProperty__Group__35023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__0_in_rule__ModifyProperty__Group__3__Impl5050 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__0__Impl_in_rule__ModifyProperty__Group_3__05089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__1_in_rule__ModifyProperty__Group_3__05092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ModifyProperty__Group_3__0__Impl5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__Group_3__1__Impl_in_rule__ModifyProperty__Group_3__15151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifyProperty__ValueAssignment_3_1_in_rule__ModifyProperty__Group_3__1__Impl5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__05212 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__05215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__AttributeAssignment_0_in_rule__ValueAssignment__Group__0__Impl5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__15272 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__15275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ValueAssignment__Group__1__Impl5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__25334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__ValueAssignment_2_in_rule__ValueAssignment__Group__2__Impl5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__0__Impl_in_rule__FilterProperty__Group__05397 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__1_in_rule__FilterProperty__Group__05400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FilterProperty__Group__0__Impl5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__Group__1__Impl_in_rule__FilterProperty__Group__15459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterProperty__PropertyAssignment_1_in_rule__FilterProperty__Group__1__Impl5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__0__Impl_in_rule__FilterClass__Group__05520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__1_in_rule__FilterClass__Group__05523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FilterClass__Group__0__Impl5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__1__Impl_in_rule__FilterClass__Group__15582 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__2_in_rule__FilterClass__Group__15585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__PrefixAssignment_1_in_rule__FilterClass__Group__1__Impl5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__2__Impl_in_rule__FilterClass__Group__25642 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__3_in_rule__FilterClass__Group__25645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FilterClass__Group__2__Impl5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__Group__3__Impl_in_rule__FilterClass__Group__35704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterClass__ClassAssignment_3_in_rule__FilterClass__Group__3__Impl5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__0__Impl_in_rule__AddConstraint__Group__05769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__1_in_rule__AddConstraint__Group__05772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__AddConstraint__Group__0__Impl5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__1__Impl_in_rule__AddConstraint__Group__15831 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__2_in_rule__AddConstraint__Group__15834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__ConstraintAssignment_1_in_rule__AddConstraint__Group__1__Impl5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__Group__2__Impl_in_rule__AddConstraint__Group__25891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddConstraint__ValueAssignment_2_in_rule__AddConstraint__Group__2__Impl5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__0__Impl_in_rule__FilterConstraint__Group__05954 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__1_in_rule__FilterConstraint__Group__05957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FilterConstraint__Group__0__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__Group__1__Impl_in_rule__FilterConstraint__Group__16016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterConstraint__ConstraintAssignment_1_in_rule__FilterConstraint__Group__1__Impl6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__ExtensionNameAssignment_16082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_36113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_56144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__Model__MetamodelAssignment_6_16175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Model__PrefixAssignment_6_36206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtension_in_rule__Model__ExtensionsAssignment_86237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Create__ClassAssignment_16330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__ClassNewAssignment_16361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__PrefixAssignment_36396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Refine__ClassOriginalAssignment_56431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassNewAssignment_16462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_36497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_56532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__PrefixAssignment_6_16567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generalize__ClassAssignment_6_36602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyClass__PrefixAssignment_16637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyClass__ClassAssignment_36672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyOperator_in_rule__ModifyClass__ModifyOperatorsAssignment_56703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddProperty__PropertyAssignment_16734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AddProperty__TypeAssignment_36765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__AddProperty__CardinalityAssignment_46796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_rule__AddProperty__RelationTypeAssignment_56827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__TypeAssignment_06858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__PrefixAssignment_1_06893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__ClassAssignment_1_26928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModifyProperty__PropertyAssignment_16959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_26990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_rule__ModifyProperty__ValueAssignment_3_17021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValueAssignment__AttributeAssignment_07052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ValueAssignment__ValueAssignment_27083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterProperty__PropertyAssignment_17114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterClass__PrefixAssignment_17149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterClass__ClassAssignment_37184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddConstraint__ConstraintAssignment_17215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__AddConstraint__ValueAssignment_27246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__FilterConstraint__ConstraintAssignment_17277 = new BitSet(new long[]{0x0000000000000002L});

}