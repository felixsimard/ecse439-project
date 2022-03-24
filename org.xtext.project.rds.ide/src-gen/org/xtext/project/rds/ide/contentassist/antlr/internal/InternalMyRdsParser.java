package org.xtext.project.rds.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.project.rds.services.MyRdsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyRdsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'accepted'", "'preparation'", "'ready_pickup'", "'picked_up'", "'delivered'", "'appetizer'", "'side_dish'", "'main_dish'", "'dessert'", "'drink'", "'user'", "'{'", "'username'", "':'", "'password'", "'name'", "'phone'", "'email'", "'}'", "'Customer'", "'DeliveryDriver'", "'isAvailable'", "'carLicenceNumber'", "'Order'", "'orderNumber'", "'status'", "'deliveryAddress'", "'orderedDatetime'", "'deliveredDatetime'", "'requestedDeliveryDatetime'", "'review'", "'customer'", "'deliveryDriver'", "'Restaurant'", "'address'", "'menu'", "'Menu'", "'restaurant'", "'MenuItem'", "'price'", "'description'", "'category'", "'OrderItem'", "'quantity'", "'order'", "'menuItem'", "'Review'", "'numStars'", "'reviewDatetime'", "'.'", "'-'", "'@'", "'.com'", "','"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyRdsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyRdsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyRdsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyRds.g"; }


    	private MyRdsGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyRdsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRDS"
    // InternalMyRds.g:53:1: entryRuleRDS : ruleRDS EOF ;
    public final void entryRuleRDS() throws RecognitionException {
        try {
            // InternalMyRds.g:54:1: ( ruleRDS EOF )
            // InternalMyRds.g:55:1: ruleRDS EOF
            {
             before(grammarAccess.getRDSRule()); 
            pushFollow(FOLLOW_1);
            ruleRDS();

            state._fsp--;

             after(grammarAccess.getRDSRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRDS"


    // $ANTLR start "ruleRDS"
    // InternalMyRds.g:62:1: ruleRDS : ( ( rule__RDS__ElementsAssignment )* ) ;
    public final void ruleRDS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:66:2: ( ( ( rule__RDS__ElementsAssignment )* ) )
            // InternalMyRds.g:67:2: ( ( rule__RDS__ElementsAssignment )* )
            {
            // InternalMyRds.g:67:2: ( ( rule__RDS__ElementsAssignment )* )
            // InternalMyRds.g:68:3: ( rule__RDS__ElementsAssignment )*
            {
             before(grammarAccess.getRDSAccess().getElementsAssignment()); 
            // InternalMyRds.g:69:3: ( rule__RDS__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21||(LA1_0>=30 && LA1_0<=31)||LA1_0==34||LA1_0==44||LA1_0==47||LA1_0==49||LA1_0==53||LA1_0==57) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyRds.g:69:4: rule__RDS__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__RDS__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRDSAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRDS"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalMyRds.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalMyRds.g:79:1: ( ruleAbstractElement EOF )
            // InternalMyRds.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalMyRds.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalMyRds.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalMyRds.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalMyRds.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalMyRds.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalMyRds.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleUserRole"
    // InternalMyRds.g:103:1: entryRuleUserRole : ruleUserRole EOF ;
    public final void entryRuleUserRole() throws RecognitionException {
        try {
            // InternalMyRds.g:104:1: ( ruleUserRole EOF )
            // InternalMyRds.g:105:1: ruleUserRole EOF
            {
             before(grammarAccess.getUserRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleUserRole();

            state._fsp--;

             after(grammarAccess.getUserRoleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUserRole"


    // $ANTLR start "ruleUserRole"
    // InternalMyRds.g:112:1: ruleUserRole : ( ( rule__UserRole__Alternatives ) ) ;
    public final void ruleUserRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:116:2: ( ( ( rule__UserRole__Alternatives ) ) )
            // InternalMyRds.g:117:2: ( ( rule__UserRole__Alternatives ) )
            {
            // InternalMyRds.g:117:2: ( ( rule__UserRole__Alternatives ) )
            // InternalMyRds.g:118:3: ( rule__UserRole__Alternatives )
            {
             before(grammarAccess.getUserRoleAccess().getAlternatives()); 
            // InternalMyRds.g:119:3: ( rule__UserRole__Alternatives )
            // InternalMyRds.g:119:4: rule__UserRole__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UserRole__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUserRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserRole"


    // $ANTLR start "entryRuleUser"
    // InternalMyRds.g:128:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalMyRds.g:129:1: ( ruleUser EOF )
            // InternalMyRds.g:130:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalMyRds.g:137:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:141:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalMyRds.g:142:2: ( ( rule__User__Group__0 ) )
            {
            // InternalMyRds.g:142:2: ( ( rule__User__Group__0 ) )
            // InternalMyRds.g:143:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalMyRds.g:144:3: ( rule__User__Group__0 )
            // InternalMyRds.g:144:4: rule__User__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleCustomer"
    // InternalMyRds.g:153:1: entryRuleCustomer : ruleCustomer EOF ;
    public final void entryRuleCustomer() throws RecognitionException {
        try {
            // InternalMyRds.g:154:1: ( ruleCustomer EOF )
            // InternalMyRds.g:155:1: ruleCustomer EOF
            {
             before(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getCustomerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalMyRds.g:162:1: ruleCustomer : ( ( rule__Customer__Group__0 ) ) ;
    public final void ruleCustomer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:166:2: ( ( ( rule__Customer__Group__0 ) ) )
            // InternalMyRds.g:167:2: ( ( rule__Customer__Group__0 ) )
            {
            // InternalMyRds.g:167:2: ( ( rule__Customer__Group__0 ) )
            // InternalMyRds.g:168:3: ( rule__Customer__Group__0 )
            {
             before(grammarAccess.getCustomerAccess().getGroup()); 
            // InternalMyRds.g:169:3: ( rule__Customer__Group__0 )
            // InternalMyRds.g:169:4: rule__Customer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleDeliveryDriver"
    // InternalMyRds.g:178:1: entryRuleDeliveryDriver : ruleDeliveryDriver EOF ;
    public final void entryRuleDeliveryDriver() throws RecognitionException {
        try {
            // InternalMyRds.g:179:1: ( ruleDeliveryDriver EOF )
            // InternalMyRds.g:180:1: ruleDeliveryDriver EOF
            {
             before(grammarAccess.getDeliveryDriverRule()); 
            pushFollow(FOLLOW_1);
            ruleDeliveryDriver();

            state._fsp--;

             after(grammarAccess.getDeliveryDriverRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeliveryDriver"


    // $ANTLR start "ruleDeliveryDriver"
    // InternalMyRds.g:187:1: ruleDeliveryDriver : ( ( rule__DeliveryDriver__Group__0 ) ) ;
    public final void ruleDeliveryDriver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:191:2: ( ( ( rule__DeliveryDriver__Group__0 ) ) )
            // InternalMyRds.g:192:2: ( ( rule__DeliveryDriver__Group__0 ) )
            {
            // InternalMyRds.g:192:2: ( ( rule__DeliveryDriver__Group__0 ) )
            // InternalMyRds.g:193:3: ( rule__DeliveryDriver__Group__0 )
            {
             before(grammarAccess.getDeliveryDriverAccess().getGroup()); 
            // InternalMyRds.g:194:3: ( rule__DeliveryDriver__Group__0 )
            // InternalMyRds.g:194:4: rule__DeliveryDriver__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryDriverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeliveryDriver"


    // $ANTLR start "entryRuleOrder"
    // InternalMyRds.g:203:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // InternalMyRds.g:204:1: ( ruleOrder EOF )
            // InternalMyRds.g:205:1: ruleOrder EOF
            {
             before(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getOrderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalMyRds.g:212:1: ruleOrder : ( ( rule__Order__Group__0 ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:216:2: ( ( ( rule__Order__Group__0 ) ) )
            // InternalMyRds.g:217:2: ( ( rule__Order__Group__0 ) )
            {
            // InternalMyRds.g:217:2: ( ( rule__Order__Group__0 ) )
            // InternalMyRds.g:218:3: ( rule__Order__Group__0 )
            {
             before(grammarAccess.getOrderAccess().getGroup()); 
            // InternalMyRds.g:219:3: ( rule__Order__Group__0 )
            // InternalMyRds.g:219:4: rule__Order__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleRestaurant"
    // InternalMyRds.g:228:1: entryRuleRestaurant : ruleRestaurant EOF ;
    public final void entryRuleRestaurant() throws RecognitionException {
        try {
            // InternalMyRds.g:229:1: ( ruleRestaurant EOF )
            // InternalMyRds.g:230:1: ruleRestaurant EOF
            {
             before(grammarAccess.getRestaurantRule()); 
            pushFollow(FOLLOW_1);
            ruleRestaurant();

            state._fsp--;

             after(grammarAccess.getRestaurantRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRestaurant"


    // $ANTLR start "ruleRestaurant"
    // InternalMyRds.g:237:1: ruleRestaurant : ( ( rule__Restaurant__Group__0 ) ) ;
    public final void ruleRestaurant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:241:2: ( ( ( rule__Restaurant__Group__0 ) ) )
            // InternalMyRds.g:242:2: ( ( rule__Restaurant__Group__0 ) )
            {
            // InternalMyRds.g:242:2: ( ( rule__Restaurant__Group__0 ) )
            // InternalMyRds.g:243:3: ( rule__Restaurant__Group__0 )
            {
             before(grammarAccess.getRestaurantAccess().getGroup()); 
            // InternalMyRds.g:244:3: ( rule__Restaurant__Group__0 )
            // InternalMyRds.g:244:4: rule__Restaurant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestaurantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestaurant"


    // $ANTLR start "entryRuleMenu"
    // InternalMyRds.g:253:1: entryRuleMenu : ruleMenu EOF ;
    public final void entryRuleMenu() throws RecognitionException {
        try {
            // InternalMyRds.g:254:1: ( ruleMenu EOF )
            // InternalMyRds.g:255:1: ruleMenu EOF
            {
             before(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_1);
            ruleMenu();

            state._fsp--;

             after(grammarAccess.getMenuRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // InternalMyRds.g:262:1: ruleMenu : ( ( rule__Menu__Group__0 ) ) ;
    public final void ruleMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:266:2: ( ( ( rule__Menu__Group__0 ) ) )
            // InternalMyRds.g:267:2: ( ( rule__Menu__Group__0 ) )
            {
            // InternalMyRds.g:267:2: ( ( rule__Menu__Group__0 ) )
            // InternalMyRds.g:268:3: ( rule__Menu__Group__0 )
            {
             before(grammarAccess.getMenuAccess().getGroup()); 
            // InternalMyRds.g:269:3: ( rule__Menu__Group__0 )
            // InternalMyRds.g:269:4: rule__Menu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleMenuItem"
    // InternalMyRds.g:278:1: entryRuleMenuItem : ruleMenuItem EOF ;
    public final void entryRuleMenuItem() throws RecognitionException {
        try {
            // InternalMyRds.g:279:1: ( ruleMenuItem EOF )
            // InternalMyRds.g:280:1: ruleMenuItem EOF
            {
             before(grammarAccess.getMenuItemRule()); 
            pushFollow(FOLLOW_1);
            ruleMenuItem();

            state._fsp--;

             after(grammarAccess.getMenuItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMenuItem"


    // $ANTLR start "ruleMenuItem"
    // InternalMyRds.g:287:1: ruleMenuItem : ( ( rule__MenuItem__Group__0 ) ) ;
    public final void ruleMenuItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:291:2: ( ( ( rule__MenuItem__Group__0 ) ) )
            // InternalMyRds.g:292:2: ( ( rule__MenuItem__Group__0 ) )
            {
            // InternalMyRds.g:292:2: ( ( rule__MenuItem__Group__0 ) )
            // InternalMyRds.g:293:3: ( rule__MenuItem__Group__0 )
            {
             before(grammarAccess.getMenuItemAccess().getGroup()); 
            // InternalMyRds.g:294:3: ( rule__MenuItem__Group__0 )
            // InternalMyRds.g:294:4: rule__MenuItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMenuItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMenuItem"


    // $ANTLR start "entryRuleOrderItem"
    // InternalMyRds.g:303:1: entryRuleOrderItem : ruleOrderItem EOF ;
    public final void entryRuleOrderItem() throws RecognitionException {
        try {
            // InternalMyRds.g:304:1: ( ruleOrderItem EOF )
            // InternalMyRds.g:305:1: ruleOrderItem EOF
            {
             before(grammarAccess.getOrderItemRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderItem();

            state._fsp--;

             after(grammarAccess.getOrderItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrderItem"


    // $ANTLR start "ruleOrderItem"
    // InternalMyRds.g:312:1: ruleOrderItem : ( ( rule__OrderItem__Group__0 ) ) ;
    public final void ruleOrderItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:316:2: ( ( ( rule__OrderItem__Group__0 ) ) )
            // InternalMyRds.g:317:2: ( ( rule__OrderItem__Group__0 ) )
            {
            // InternalMyRds.g:317:2: ( ( rule__OrderItem__Group__0 ) )
            // InternalMyRds.g:318:3: ( rule__OrderItem__Group__0 )
            {
             before(grammarAccess.getOrderItemAccess().getGroup()); 
            // InternalMyRds.g:319:3: ( rule__OrderItem__Group__0 )
            // InternalMyRds.g:319:4: rule__OrderItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderItem"


    // $ANTLR start "entryRuleReview"
    // InternalMyRds.g:328:1: entryRuleReview : ruleReview EOF ;
    public final void entryRuleReview() throws RecognitionException {
        try {
            // InternalMyRds.g:329:1: ( ruleReview EOF )
            // InternalMyRds.g:330:1: ruleReview EOF
            {
             before(grammarAccess.getReviewRule()); 
            pushFollow(FOLLOW_1);
            ruleReview();

            state._fsp--;

             after(grammarAccess.getReviewRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReview"


    // $ANTLR start "ruleReview"
    // InternalMyRds.g:337:1: ruleReview : ( ( rule__Review__Group__0 ) ) ;
    public final void ruleReview() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:341:2: ( ( ( rule__Review__Group__0 ) ) )
            // InternalMyRds.g:342:2: ( ( rule__Review__Group__0 ) )
            {
            // InternalMyRds.g:342:2: ( ( rule__Review__Group__0 ) )
            // InternalMyRds.g:343:3: ( rule__Review__Group__0 )
            {
             before(grammarAccess.getReviewAccess().getGroup()); 
            // InternalMyRds.g:344:3: ( rule__Review__Group__0 )
            // InternalMyRds.g:344:4: rule__Review__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Review__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReviewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReview"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalMyRds.g:353:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalMyRds.g:354:1: ( ruleDECIMAL EOF )
            // InternalMyRds.g:355:1: ruleDECIMAL EOF
            {
             before(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getDECIMALRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalMyRds.g:362:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:366:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalMyRds.g:367:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalMyRds.g:367:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalMyRds.g:368:3: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // InternalMyRds.g:369:3: ( rule__DECIMAL__Group__0 )
            // InternalMyRds.g:369:4: rule__DECIMAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDECIMALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleFULLNAME"
    // InternalMyRds.g:378:1: entryRuleFULLNAME : ruleFULLNAME EOF ;
    public final void entryRuleFULLNAME() throws RecognitionException {
        try {
            // InternalMyRds.g:379:1: ( ruleFULLNAME EOF )
            // InternalMyRds.g:380:1: ruleFULLNAME EOF
            {
             before(grammarAccess.getFULLNAMERule()); 
            pushFollow(FOLLOW_1);
            ruleFULLNAME();

            state._fsp--;

             after(grammarAccess.getFULLNAMERule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFULLNAME"


    // $ANTLR start "ruleFULLNAME"
    // InternalMyRds.g:387:1: ruleFULLNAME : ( ( rule__FULLNAME__Group__0 ) ) ;
    public final void ruleFULLNAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:391:2: ( ( ( rule__FULLNAME__Group__0 ) ) )
            // InternalMyRds.g:392:2: ( ( rule__FULLNAME__Group__0 ) )
            {
            // InternalMyRds.g:392:2: ( ( rule__FULLNAME__Group__0 ) )
            // InternalMyRds.g:393:3: ( rule__FULLNAME__Group__0 )
            {
             before(grammarAccess.getFULLNAMEAccess().getGroup()); 
            // InternalMyRds.g:394:3: ( rule__FULLNAME__Group__0 )
            // InternalMyRds.g:394:4: rule__FULLNAME__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FULLNAME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFULLNAMEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFULLNAME"


    // $ANTLR start "entryRulePHONE"
    // InternalMyRds.g:403:1: entryRulePHONE : rulePHONE EOF ;
    public final void entryRulePHONE() throws RecognitionException {
        try {
            // InternalMyRds.g:404:1: ( rulePHONE EOF )
            // InternalMyRds.g:405:1: rulePHONE EOF
            {
             before(grammarAccess.getPHONERule()); 
            pushFollow(FOLLOW_1);
            rulePHONE();

            state._fsp--;

             after(grammarAccess.getPHONERule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePHONE"


    // $ANTLR start "rulePHONE"
    // InternalMyRds.g:412:1: rulePHONE : ( ( rule__PHONE__Group__0 ) ) ;
    public final void rulePHONE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:416:2: ( ( ( rule__PHONE__Group__0 ) ) )
            // InternalMyRds.g:417:2: ( ( rule__PHONE__Group__0 ) )
            {
            // InternalMyRds.g:417:2: ( ( rule__PHONE__Group__0 ) )
            // InternalMyRds.g:418:3: ( rule__PHONE__Group__0 )
            {
             before(grammarAccess.getPHONEAccess().getGroup()); 
            // InternalMyRds.g:419:3: ( rule__PHONE__Group__0 )
            // InternalMyRds.g:419:4: rule__PHONE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PHONE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPHONEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePHONE"


    // $ANTLR start "entryRuleEMAIL"
    // InternalMyRds.g:428:1: entryRuleEMAIL : ruleEMAIL EOF ;
    public final void entryRuleEMAIL() throws RecognitionException {
        try {
            // InternalMyRds.g:429:1: ( ruleEMAIL EOF )
            // InternalMyRds.g:430:1: ruleEMAIL EOF
            {
             before(grammarAccess.getEMAILRule()); 
            pushFollow(FOLLOW_1);
            ruleEMAIL();

            state._fsp--;

             after(grammarAccess.getEMAILRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEMAIL"


    // $ANTLR start "ruleEMAIL"
    // InternalMyRds.g:437:1: ruleEMAIL : ( ( rule__EMAIL__Group__0 ) ) ;
    public final void ruleEMAIL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:441:2: ( ( ( rule__EMAIL__Group__0 ) ) )
            // InternalMyRds.g:442:2: ( ( rule__EMAIL__Group__0 ) )
            {
            // InternalMyRds.g:442:2: ( ( rule__EMAIL__Group__0 ) )
            // InternalMyRds.g:443:3: ( rule__EMAIL__Group__0 )
            {
             before(grammarAccess.getEMAILAccess().getGroup()); 
            // InternalMyRds.g:444:3: ( rule__EMAIL__Group__0 )
            // InternalMyRds.g:444:4: rule__EMAIL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EMAIL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEMAILAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEMAIL"


    // $ANTLR start "entryRuleDATETIME"
    // InternalMyRds.g:453:1: entryRuleDATETIME : ruleDATETIME EOF ;
    public final void entryRuleDATETIME() throws RecognitionException {
        try {
            // InternalMyRds.g:454:1: ( ruleDATETIME EOF )
            // InternalMyRds.g:455:1: ruleDATETIME EOF
            {
             before(grammarAccess.getDATETIMERule()); 
            pushFollow(FOLLOW_1);
            ruleDATETIME();

            state._fsp--;

             after(grammarAccess.getDATETIMERule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDATETIME"


    // $ANTLR start "ruleDATETIME"
    // InternalMyRds.g:462:1: ruleDATETIME : ( ( rule__DATETIME__Group__0 ) ) ;
    public final void ruleDATETIME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:466:2: ( ( ( rule__DATETIME__Group__0 ) ) )
            // InternalMyRds.g:467:2: ( ( rule__DATETIME__Group__0 ) )
            {
            // InternalMyRds.g:467:2: ( ( rule__DATETIME__Group__0 ) )
            // InternalMyRds.g:468:3: ( rule__DATETIME__Group__0 )
            {
             before(grammarAccess.getDATETIMEAccess().getGroup()); 
            // InternalMyRds.g:469:3: ( rule__DATETIME__Group__0 )
            // InternalMyRds.g:469:4: rule__DATETIME__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DATETIME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDATETIMEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDATETIME"


    // $ANTLR start "entryRuleADDRESS"
    // InternalMyRds.g:478:1: entryRuleADDRESS : ruleADDRESS EOF ;
    public final void entryRuleADDRESS() throws RecognitionException {
        try {
            // InternalMyRds.g:479:1: ( ruleADDRESS EOF )
            // InternalMyRds.g:480:1: ruleADDRESS EOF
            {
             before(grammarAccess.getADDRESSRule()); 
            pushFollow(FOLLOW_1);
            ruleADDRESS();

            state._fsp--;

             after(grammarAccess.getADDRESSRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleADDRESS"


    // $ANTLR start "ruleADDRESS"
    // InternalMyRds.g:487:1: ruleADDRESS : ( ( rule__ADDRESS__Group__0 ) ) ;
    public final void ruleADDRESS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:491:2: ( ( ( rule__ADDRESS__Group__0 ) ) )
            // InternalMyRds.g:492:2: ( ( rule__ADDRESS__Group__0 ) )
            {
            // InternalMyRds.g:492:2: ( ( rule__ADDRESS__Group__0 ) )
            // InternalMyRds.g:493:3: ( rule__ADDRESS__Group__0 )
            {
             before(grammarAccess.getADDRESSAccess().getGroup()); 
            // InternalMyRds.g:494:3: ( rule__ADDRESS__Group__0 )
            // InternalMyRds.g:494:4: rule__ADDRESS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getADDRESSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleADDRESS"


    // $ANTLR start "entryRuleLICENCE"
    // InternalMyRds.g:503:1: entryRuleLICENCE : ruleLICENCE EOF ;
    public final void entryRuleLICENCE() throws RecognitionException {
        try {
            // InternalMyRds.g:504:1: ( ruleLICENCE EOF )
            // InternalMyRds.g:505:1: ruleLICENCE EOF
            {
             before(grammarAccess.getLICENCERule()); 
            pushFollow(FOLLOW_1);
            ruleLICENCE();

            state._fsp--;

             after(grammarAccess.getLICENCERule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLICENCE"


    // $ANTLR start "ruleLICENCE"
    // InternalMyRds.g:512:1: ruleLICENCE : ( ( rule__LICENCE__Group__0 ) ) ;
    public final void ruleLICENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:516:2: ( ( ( rule__LICENCE__Group__0 ) ) )
            // InternalMyRds.g:517:2: ( ( rule__LICENCE__Group__0 ) )
            {
            // InternalMyRds.g:517:2: ( ( rule__LICENCE__Group__0 ) )
            // InternalMyRds.g:518:3: ( rule__LICENCE__Group__0 )
            {
             before(grammarAccess.getLICENCEAccess().getGroup()); 
            // InternalMyRds.g:519:3: ( rule__LICENCE__Group__0 )
            // InternalMyRds.g:519:4: rule__LICENCE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LICENCE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLICENCEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLICENCE"


    // $ANTLR start "ruleOrderStatus"
    // InternalMyRds.g:528:1: ruleOrderStatus : ( ( rule__OrderStatus__Alternatives ) ) ;
    public final void ruleOrderStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:532:1: ( ( ( rule__OrderStatus__Alternatives ) ) )
            // InternalMyRds.g:533:2: ( ( rule__OrderStatus__Alternatives ) )
            {
            // InternalMyRds.g:533:2: ( ( rule__OrderStatus__Alternatives ) )
            // InternalMyRds.g:534:3: ( rule__OrderStatus__Alternatives )
            {
             before(grammarAccess.getOrderStatusAccess().getAlternatives()); 
            // InternalMyRds.g:535:3: ( rule__OrderStatus__Alternatives )
            // InternalMyRds.g:535:4: rule__OrderStatus__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OrderStatus__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderStatusAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderStatus"


    // $ANTLR start "ruleMenuItemCategory"
    // InternalMyRds.g:544:1: ruleMenuItemCategory : ( ( rule__MenuItemCategory__Alternatives ) ) ;
    public final void ruleMenuItemCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:548:1: ( ( ( rule__MenuItemCategory__Alternatives ) ) )
            // InternalMyRds.g:549:2: ( ( rule__MenuItemCategory__Alternatives ) )
            {
            // InternalMyRds.g:549:2: ( ( rule__MenuItemCategory__Alternatives ) )
            // InternalMyRds.g:550:3: ( rule__MenuItemCategory__Alternatives )
            {
             before(grammarAccess.getMenuItemCategoryAccess().getAlternatives()); 
            // InternalMyRds.g:551:3: ( rule__MenuItemCategory__Alternatives )
            // InternalMyRds.g:551:4: rule__MenuItemCategory__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MenuItemCategory__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMenuItemCategoryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMenuItemCategory"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalMyRds.g:559:1: rule__AbstractElement__Alternatives : ( ( ruleUser ) | ( ruleOrder ) | ( ruleUserRole ) | ( ruleRestaurant ) | ( ruleOrderItem ) | ( ruleMenuItem ) | ( ruleReview ) | ( ruleMenu ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:563:1: ( ( ruleUser ) | ( ruleOrder ) | ( ruleUserRole ) | ( ruleRestaurant ) | ( ruleOrderItem ) | ( ruleMenuItem ) | ( ruleReview ) | ( ruleMenu ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 30:
            case 31:
                {
                alt2=3;
                }
                break;
            case 44:
                {
                alt2=4;
                }
                break;
            case 53:
                {
                alt2=5;
                }
                break;
            case 49:
                {
                alt2=6;
                }
                break;
            case 57:
                {
                alt2=7;
                }
                break;
            case 47:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyRds.g:564:2: ( ruleUser )
                    {
                    // InternalMyRds.g:564:2: ( ruleUser )
                    // InternalMyRds.g:565:3: ruleUser
                    {
                     before(grammarAccess.getAbstractElementAccess().getUserParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getUserParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyRds.g:570:2: ( ruleOrder )
                    {
                    // InternalMyRds.g:570:2: ( ruleOrder )
                    // InternalMyRds.g:571:3: ruleOrder
                    {
                     before(grammarAccess.getAbstractElementAccess().getOrderParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOrder();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getOrderParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyRds.g:576:2: ( ruleUserRole )
                    {
                    // InternalMyRds.g:576:2: ( ruleUserRole )
                    // InternalMyRds.g:577:3: ruleUserRole
                    {
                     before(grammarAccess.getAbstractElementAccess().getUserRoleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUserRole();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getUserRoleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyRds.g:582:2: ( ruleRestaurant )
                    {
                    // InternalMyRds.g:582:2: ( ruleRestaurant )
                    // InternalMyRds.g:583:3: ruleRestaurant
                    {
                     before(grammarAccess.getAbstractElementAccess().getRestaurantParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRestaurant();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getRestaurantParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyRds.g:588:2: ( ruleOrderItem )
                    {
                    // InternalMyRds.g:588:2: ( ruleOrderItem )
                    // InternalMyRds.g:589:3: ruleOrderItem
                    {
                     before(grammarAccess.getAbstractElementAccess().getOrderItemParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOrderItem();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getOrderItemParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyRds.g:594:2: ( ruleMenuItem )
                    {
                    // InternalMyRds.g:594:2: ( ruleMenuItem )
                    // InternalMyRds.g:595:3: ruleMenuItem
                    {
                     before(grammarAccess.getAbstractElementAccess().getMenuItemParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleMenuItem();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getMenuItemParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyRds.g:600:2: ( ruleReview )
                    {
                    // InternalMyRds.g:600:2: ( ruleReview )
                    // InternalMyRds.g:601:3: ruleReview
                    {
                     before(grammarAccess.getAbstractElementAccess().getReviewParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleReview();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getReviewParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyRds.g:606:2: ( ruleMenu )
                    {
                    // InternalMyRds.g:606:2: ( ruleMenu )
                    // InternalMyRds.g:607:3: ruleMenu
                    {
                     before(grammarAccess.getAbstractElementAccess().getMenuParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleMenu();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getMenuParserRuleCall_7()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__UserRole__Alternatives"
    // InternalMyRds.g:616:1: rule__UserRole__Alternatives : ( ( ruleCustomer ) | ( ruleDeliveryDriver ) );
    public final void rule__UserRole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:620:1: ( ( ruleCustomer ) | ( ruleDeliveryDriver ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==30) ) {
                alt3=1;
            }
            else if ( (LA3_0==31) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyRds.g:621:2: ( ruleCustomer )
                    {
                    // InternalMyRds.g:621:2: ( ruleCustomer )
                    // InternalMyRds.g:622:3: ruleCustomer
                    {
                     before(grammarAccess.getUserRoleAccess().getCustomerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomer();

                    state._fsp--;

                     after(grammarAccess.getUserRoleAccess().getCustomerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyRds.g:627:2: ( ruleDeliveryDriver )
                    {
                    // InternalMyRds.g:627:2: ( ruleDeliveryDriver )
                    // InternalMyRds.g:628:3: ruleDeliveryDriver
                    {
                     before(grammarAccess.getUserRoleAccess().getDeliveryDriverParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeliveryDriver();

                    state._fsp--;

                     after(grammarAccess.getUserRoleAccess().getDeliveryDriverParserRuleCall_1()); 

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
    // $ANTLR end "rule__UserRole__Alternatives"


    // $ANTLR start "rule__OrderStatus__Alternatives"
    // InternalMyRds.g:637:1: rule__OrderStatus__Alternatives : ( ( ( 'accepted' ) ) | ( ( 'preparation' ) ) | ( ( 'ready_pickup' ) ) | ( ( 'picked_up' ) ) | ( ( 'delivered' ) ) );
    public final void rule__OrderStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:641:1: ( ( ( 'accepted' ) ) | ( ( 'preparation' ) ) | ( ( 'ready_pickup' ) ) | ( ( 'picked_up' ) ) | ( ( 'delivered' ) ) )
            int alt4=5;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyRds.g:642:2: ( ( 'accepted' ) )
                    {
                    // InternalMyRds.g:642:2: ( ( 'accepted' ) )
                    // InternalMyRds.g:643:3: ( 'accepted' )
                    {
                     before(grammarAccess.getOrderStatusAccess().getACCEPTEDEnumLiteralDeclaration_0()); 
                    // InternalMyRds.g:644:3: ( 'accepted' )
                    // InternalMyRds.g:644:4: 'accepted'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderStatusAccess().getACCEPTEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyRds.g:648:2: ( ( 'preparation' ) )
                    {
                    // InternalMyRds.g:648:2: ( ( 'preparation' ) )
                    // InternalMyRds.g:649:3: ( 'preparation' )
                    {
                     before(grammarAccess.getOrderStatusAccess().getPREPARATIONEnumLiteralDeclaration_1()); 
                    // InternalMyRds.g:650:3: ( 'preparation' )
                    // InternalMyRds.g:650:4: 'preparation'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderStatusAccess().getPREPARATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyRds.g:654:2: ( ( 'ready_pickup' ) )
                    {
                    // InternalMyRds.g:654:2: ( ( 'ready_pickup' ) )
                    // InternalMyRds.g:655:3: ( 'ready_pickup' )
                    {
                     before(grammarAccess.getOrderStatusAccess().getREADY_PICKUPEnumLiteralDeclaration_2()); 
                    // InternalMyRds.g:656:3: ( 'ready_pickup' )
                    // InternalMyRds.g:656:4: 'ready_pickup'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderStatusAccess().getREADY_PICKUPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyRds.g:660:2: ( ( 'picked_up' ) )
                    {
                    // InternalMyRds.g:660:2: ( ( 'picked_up' ) )
                    // InternalMyRds.g:661:3: ( 'picked_up' )
                    {
                     before(grammarAccess.getOrderStatusAccess().getPICKED_UPEnumLiteralDeclaration_3()); 
                    // InternalMyRds.g:662:3: ( 'picked_up' )
                    // InternalMyRds.g:662:4: 'picked_up'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderStatusAccess().getPICKED_UPEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyRds.g:666:2: ( ( 'delivered' ) )
                    {
                    // InternalMyRds.g:666:2: ( ( 'delivered' ) )
                    // InternalMyRds.g:667:3: ( 'delivered' )
                    {
                     before(grammarAccess.getOrderStatusAccess().getDELIVEREDEnumLiteralDeclaration_4()); 
                    // InternalMyRds.g:668:3: ( 'delivered' )
                    // InternalMyRds.g:668:4: 'delivered'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderStatusAccess().getDELIVEREDEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__OrderStatus__Alternatives"


    // $ANTLR start "rule__MenuItemCategory__Alternatives"
    // InternalMyRds.g:676:1: rule__MenuItemCategory__Alternatives : ( ( ( 'appetizer' ) ) | ( ( 'side_dish' ) ) | ( ( 'main_dish' ) ) | ( ( 'dessert' ) ) | ( ( 'drink' ) ) );
    public final void rule__MenuItemCategory__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:680:1: ( ( ( 'appetizer' ) ) | ( ( 'side_dish' ) ) | ( ( 'main_dish' ) ) | ( ( 'dessert' ) ) | ( ( 'drink' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyRds.g:681:2: ( ( 'appetizer' ) )
                    {
                    // InternalMyRds.g:681:2: ( ( 'appetizer' ) )
                    // InternalMyRds.g:682:3: ( 'appetizer' )
                    {
                     before(grammarAccess.getMenuItemCategoryAccess().getAPPETIZEREnumLiteralDeclaration_0()); 
                    // InternalMyRds.g:683:3: ( 'appetizer' )
                    // InternalMyRds.g:683:4: 'appetizer'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMenuItemCategoryAccess().getAPPETIZEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyRds.g:687:2: ( ( 'side_dish' ) )
                    {
                    // InternalMyRds.g:687:2: ( ( 'side_dish' ) )
                    // InternalMyRds.g:688:3: ( 'side_dish' )
                    {
                     before(grammarAccess.getMenuItemCategoryAccess().getSIDE_DISHEnumLiteralDeclaration_1()); 
                    // InternalMyRds.g:689:3: ( 'side_dish' )
                    // InternalMyRds.g:689:4: 'side_dish'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMenuItemCategoryAccess().getSIDE_DISHEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyRds.g:693:2: ( ( 'main_dish' ) )
                    {
                    // InternalMyRds.g:693:2: ( ( 'main_dish' ) )
                    // InternalMyRds.g:694:3: ( 'main_dish' )
                    {
                     before(grammarAccess.getMenuItemCategoryAccess().getMAIN_DISHEnumLiteralDeclaration_2()); 
                    // InternalMyRds.g:695:3: ( 'main_dish' )
                    // InternalMyRds.g:695:4: 'main_dish'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMenuItemCategoryAccess().getMAIN_DISHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyRds.g:699:2: ( ( 'dessert' ) )
                    {
                    // InternalMyRds.g:699:2: ( ( 'dessert' ) )
                    // InternalMyRds.g:700:3: ( 'dessert' )
                    {
                     before(grammarAccess.getMenuItemCategoryAccess().getDESSERTEnumLiteralDeclaration_3()); 
                    // InternalMyRds.g:701:3: ( 'dessert' )
                    // InternalMyRds.g:701:4: 'dessert'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getMenuItemCategoryAccess().getDESSERTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyRds.g:705:2: ( ( 'drink' ) )
                    {
                    // InternalMyRds.g:705:2: ( ( 'drink' ) )
                    // InternalMyRds.g:706:3: ( 'drink' )
                    {
                     before(grammarAccess.getMenuItemCategoryAccess().getDRINKEnumLiteralDeclaration_4()); 
                    // InternalMyRds.g:707:3: ( 'drink' )
                    // InternalMyRds.g:707:4: 'drink'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMenuItemCategoryAccess().getDRINKEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__MenuItemCategory__Alternatives"


    // $ANTLR start "rule__User__Group__0"
    // InternalMyRds.g:715:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:719:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalMyRds.g:720:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__1();

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
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // InternalMyRds.g:727:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:731:1: ( ( 'user' ) )
            // InternalMyRds.g:732:1: ( 'user' )
            {
            // InternalMyRds.g:732:1: ( 'user' )
            // InternalMyRds.g:733:2: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUserKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // InternalMyRds.g:742:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:746:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalMyRds.g:747:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__2();

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
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // InternalMyRds.g:754:1: rule__User__Group__1__Impl : ( ( rule__User__IdAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:758:1: ( ( ( rule__User__IdAssignment_1 ) ) )
            // InternalMyRds.g:759:1: ( ( rule__User__IdAssignment_1 ) )
            {
            // InternalMyRds.g:759:1: ( ( rule__User__IdAssignment_1 ) )
            // InternalMyRds.g:760:2: ( rule__User__IdAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getIdAssignment_1()); 
            // InternalMyRds.g:761:2: ( rule__User__IdAssignment_1 )
            // InternalMyRds.g:761:3: rule__User__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__User__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__User__Group__2"
    // InternalMyRds.g:769:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:773:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // InternalMyRds.g:774:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__User__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__3();

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
    // $ANTLR end "rule__User__Group__2"


    // $ANTLR start "rule__User__Group__2__Impl"
    // InternalMyRds.g:781:1: rule__User__Group__2__Impl : ( '{' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:785:1: ( ( '{' ) )
            // InternalMyRds.g:786:1: ( '{' )
            {
            // InternalMyRds.g:786:1: ( '{' )
            // InternalMyRds.g:787:2: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2__Impl"


    // $ANTLR start "rule__User__Group__3"
    // InternalMyRds.g:796:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:800:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // InternalMyRds.g:801:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__User__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__4();

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
    // $ANTLR end "rule__User__Group__3"


    // $ANTLR start "rule__User__Group__3__Impl"
    // InternalMyRds.g:808:1: rule__User__Group__3__Impl : ( 'username' ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:812:1: ( ( 'username' ) )
            // InternalMyRds.g:813:1: ( 'username' )
            {
            // InternalMyRds.g:813:1: ( 'username' )
            // InternalMyRds.g:814:2: 'username'
            {
             before(grammarAccess.getUserAccess().getUsernameKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUsernameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__3__Impl"


    // $ANTLR start "rule__User__Group__4"
    // InternalMyRds.g:823:1: rule__User__Group__4 : rule__User__Group__4__Impl rule__User__Group__5 ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:827:1: ( rule__User__Group__4__Impl rule__User__Group__5 )
            // InternalMyRds.g:828:2: rule__User__Group__4__Impl rule__User__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__User__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__5();

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
    // $ANTLR end "rule__User__Group__4"


    // $ANTLR start "rule__User__Group__4__Impl"
    // InternalMyRds.g:835:1: rule__User__Group__4__Impl : ( ':' ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:839:1: ( ( ':' ) )
            // InternalMyRds.g:840:1: ( ':' )
            {
            // InternalMyRds.g:840:1: ( ':' )
            // InternalMyRds.g:841:2: ':'
            {
             before(grammarAccess.getUserAccess().getColonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__4__Impl"


    // $ANTLR start "rule__User__Group__5"
    // InternalMyRds.g:850:1: rule__User__Group__5 : rule__User__Group__5__Impl rule__User__Group__6 ;
    public final void rule__User__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:854:1: ( rule__User__Group__5__Impl rule__User__Group__6 )
            // InternalMyRds.g:855:2: rule__User__Group__5__Impl rule__User__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__User__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__6();

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
    // $ANTLR end "rule__User__Group__5"


    // $ANTLR start "rule__User__Group__5__Impl"
    // InternalMyRds.g:862:1: rule__User__Group__5__Impl : ( ( rule__User__UsernameAssignment_5 ) ) ;
    public final void rule__User__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:866:1: ( ( ( rule__User__UsernameAssignment_5 ) ) )
            // InternalMyRds.g:867:1: ( ( rule__User__UsernameAssignment_5 ) )
            {
            // InternalMyRds.g:867:1: ( ( rule__User__UsernameAssignment_5 ) )
            // InternalMyRds.g:868:2: ( rule__User__UsernameAssignment_5 )
            {
             before(grammarAccess.getUserAccess().getUsernameAssignment_5()); 
            // InternalMyRds.g:869:2: ( rule__User__UsernameAssignment_5 )
            // InternalMyRds.g:869:3: rule__User__UsernameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__User__UsernameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getUsernameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__5__Impl"


    // $ANTLR start "rule__User__Group__6"
    // InternalMyRds.g:877:1: rule__User__Group__6 : rule__User__Group__6__Impl rule__User__Group__7 ;
    public final void rule__User__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:881:1: ( rule__User__Group__6__Impl rule__User__Group__7 )
            // InternalMyRds.g:882:2: rule__User__Group__6__Impl rule__User__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__User__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__7();

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
    // $ANTLR end "rule__User__Group__6"


    // $ANTLR start "rule__User__Group__6__Impl"
    // InternalMyRds.g:889:1: rule__User__Group__6__Impl : ( 'password' ) ;
    public final void rule__User__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:893:1: ( ( 'password' ) )
            // InternalMyRds.g:894:1: ( 'password' )
            {
            // InternalMyRds.g:894:1: ( 'password' )
            // InternalMyRds.g:895:2: 'password'
            {
             before(grammarAccess.getUserAccess().getPasswordKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getPasswordKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__6__Impl"


    // $ANTLR start "rule__User__Group__7"
    // InternalMyRds.g:904:1: rule__User__Group__7 : rule__User__Group__7__Impl rule__User__Group__8 ;
    public final void rule__User__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:908:1: ( rule__User__Group__7__Impl rule__User__Group__8 )
            // InternalMyRds.g:909:2: rule__User__Group__7__Impl rule__User__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__User__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__8();

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
    // $ANTLR end "rule__User__Group__7"


    // $ANTLR start "rule__User__Group__7__Impl"
    // InternalMyRds.g:916:1: rule__User__Group__7__Impl : ( ':' ) ;
    public final void rule__User__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:920:1: ( ( ':' ) )
            // InternalMyRds.g:921:1: ( ':' )
            {
            // InternalMyRds.g:921:1: ( ':' )
            // InternalMyRds.g:922:2: ':'
            {
             before(grammarAccess.getUserAccess().getColonKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__7__Impl"


    // $ANTLR start "rule__User__Group__8"
    // InternalMyRds.g:931:1: rule__User__Group__8 : rule__User__Group__8__Impl rule__User__Group__9 ;
    public final void rule__User__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:935:1: ( rule__User__Group__8__Impl rule__User__Group__9 )
            // InternalMyRds.g:936:2: rule__User__Group__8__Impl rule__User__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__User__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__9();

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
    // $ANTLR end "rule__User__Group__8"


    // $ANTLR start "rule__User__Group__8__Impl"
    // InternalMyRds.g:943:1: rule__User__Group__8__Impl : ( ( rule__User__PasswordAssignment_8 ) ) ;
    public final void rule__User__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:947:1: ( ( ( rule__User__PasswordAssignment_8 ) ) )
            // InternalMyRds.g:948:1: ( ( rule__User__PasswordAssignment_8 ) )
            {
            // InternalMyRds.g:948:1: ( ( rule__User__PasswordAssignment_8 ) )
            // InternalMyRds.g:949:2: ( rule__User__PasswordAssignment_8 )
            {
             before(grammarAccess.getUserAccess().getPasswordAssignment_8()); 
            // InternalMyRds.g:950:2: ( rule__User__PasswordAssignment_8 )
            // InternalMyRds.g:950:3: rule__User__PasswordAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__User__PasswordAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getPasswordAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__8__Impl"


    // $ANTLR start "rule__User__Group__9"
    // InternalMyRds.g:958:1: rule__User__Group__9 : rule__User__Group__9__Impl rule__User__Group__10 ;
    public final void rule__User__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:962:1: ( rule__User__Group__9__Impl rule__User__Group__10 )
            // InternalMyRds.g:963:2: rule__User__Group__9__Impl rule__User__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__User__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__10();

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
    // $ANTLR end "rule__User__Group__9"


    // $ANTLR start "rule__User__Group__9__Impl"
    // InternalMyRds.g:970:1: rule__User__Group__9__Impl : ( 'name' ) ;
    public final void rule__User__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:974:1: ( ( 'name' ) )
            // InternalMyRds.g:975:1: ( 'name' )
            {
            // InternalMyRds.g:975:1: ( 'name' )
            // InternalMyRds.g:976:2: 'name'
            {
             before(grammarAccess.getUserAccess().getNameKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getNameKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__9__Impl"


    // $ANTLR start "rule__User__Group__10"
    // InternalMyRds.g:985:1: rule__User__Group__10 : rule__User__Group__10__Impl rule__User__Group__11 ;
    public final void rule__User__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:989:1: ( rule__User__Group__10__Impl rule__User__Group__11 )
            // InternalMyRds.g:990:2: rule__User__Group__10__Impl rule__User__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__User__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__11();

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
    // $ANTLR end "rule__User__Group__10"


    // $ANTLR start "rule__User__Group__10__Impl"
    // InternalMyRds.g:997:1: rule__User__Group__10__Impl : ( ':' ) ;
    public final void rule__User__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1001:1: ( ( ':' ) )
            // InternalMyRds.g:1002:1: ( ':' )
            {
            // InternalMyRds.g:1002:1: ( ':' )
            // InternalMyRds.g:1003:2: ':'
            {
             before(grammarAccess.getUserAccess().getColonKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__10__Impl"


    // $ANTLR start "rule__User__Group__11"
    // InternalMyRds.g:1012:1: rule__User__Group__11 : rule__User__Group__11__Impl rule__User__Group__12 ;
    public final void rule__User__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1016:1: ( rule__User__Group__11__Impl rule__User__Group__12 )
            // InternalMyRds.g:1017:2: rule__User__Group__11__Impl rule__User__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__User__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__12();

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
    // $ANTLR end "rule__User__Group__11"


    // $ANTLR start "rule__User__Group__11__Impl"
    // InternalMyRds.g:1024:1: rule__User__Group__11__Impl : ( ( rule__User__NameAssignment_11 ) ) ;
    public final void rule__User__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1028:1: ( ( ( rule__User__NameAssignment_11 ) ) )
            // InternalMyRds.g:1029:1: ( ( rule__User__NameAssignment_11 ) )
            {
            // InternalMyRds.g:1029:1: ( ( rule__User__NameAssignment_11 ) )
            // InternalMyRds.g:1030:2: ( rule__User__NameAssignment_11 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_11()); 
            // InternalMyRds.g:1031:2: ( rule__User__NameAssignment_11 )
            // InternalMyRds.g:1031:3: rule__User__NameAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__User__NameAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__11__Impl"


    // $ANTLR start "rule__User__Group__12"
    // InternalMyRds.g:1039:1: rule__User__Group__12 : rule__User__Group__12__Impl rule__User__Group__13 ;
    public final void rule__User__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1043:1: ( rule__User__Group__12__Impl rule__User__Group__13 )
            // InternalMyRds.g:1044:2: rule__User__Group__12__Impl rule__User__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__User__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__13();

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
    // $ANTLR end "rule__User__Group__12"


    // $ANTLR start "rule__User__Group__12__Impl"
    // InternalMyRds.g:1051:1: rule__User__Group__12__Impl : ( 'phone' ) ;
    public final void rule__User__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1055:1: ( ( 'phone' ) )
            // InternalMyRds.g:1056:1: ( 'phone' )
            {
            // InternalMyRds.g:1056:1: ( 'phone' )
            // InternalMyRds.g:1057:2: 'phone'
            {
             before(grammarAccess.getUserAccess().getPhoneKeyword_12()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getPhoneKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__12__Impl"


    // $ANTLR start "rule__User__Group__13"
    // InternalMyRds.g:1066:1: rule__User__Group__13 : rule__User__Group__13__Impl rule__User__Group__14 ;
    public final void rule__User__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1070:1: ( rule__User__Group__13__Impl rule__User__Group__14 )
            // InternalMyRds.g:1071:2: rule__User__Group__13__Impl rule__User__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__User__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__14();

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
    // $ANTLR end "rule__User__Group__13"


    // $ANTLR start "rule__User__Group__13__Impl"
    // InternalMyRds.g:1078:1: rule__User__Group__13__Impl : ( ':' ) ;
    public final void rule__User__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1082:1: ( ( ':' ) )
            // InternalMyRds.g:1083:1: ( ':' )
            {
            // InternalMyRds.g:1083:1: ( ':' )
            // InternalMyRds.g:1084:2: ':'
            {
             before(grammarAccess.getUserAccess().getColonKeyword_13()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getColonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__13__Impl"


    // $ANTLR start "rule__User__Group__14"
    // InternalMyRds.g:1093:1: rule__User__Group__14 : rule__User__Group__14__Impl rule__User__Group__15 ;
    public final void rule__User__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1097:1: ( rule__User__Group__14__Impl rule__User__Group__15 )
            // InternalMyRds.g:1098:2: rule__User__Group__14__Impl rule__User__Group__15
            {
            pushFollow(FOLLOW_13);
            rule__User__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__15();

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
    // $ANTLR end "rule__User__Group__14"


    // $ANTLR start "rule__User__Group__14__Impl"
    // InternalMyRds.g:1105:1: rule__User__Group__14__Impl : ( ( rule__User__PhoneAssignment_14 ) ) ;
    public final void rule__User__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1109:1: ( ( ( rule__User__PhoneAssignment_14 ) ) )
            // InternalMyRds.g:1110:1: ( ( rule__User__PhoneAssignment_14 ) )
            {
            // InternalMyRds.g:1110:1: ( ( rule__User__PhoneAssignment_14 ) )
            // InternalMyRds.g:1111:2: ( rule__User__PhoneAssignment_14 )
            {
             before(grammarAccess.getUserAccess().getPhoneAssignment_14()); 
            // InternalMyRds.g:1112:2: ( rule__User__PhoneAssignment_14 )
            // InternalMyRds.g:1112:3: rule__User__PhoneAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__User__PhoneAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getPhoneAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__14__Impl"


    // $ANTLR start "rule__User__Group__15"
    // InternalMyRds.g:1120:1: rule__User__Group__15 : rule__User__Group__15__Impl rule__User__Group__16 ;
    public final void rule__User__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1124:1: ( rule__User__Group__15__Impl rule__User__Group__16 )
            // InternalMyRds.g:1125:2: rule__User__Group__15__Impl rule__User__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__User__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__16();

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
    // $ANTLR end "rule__User__Group__15"


    // $ANTLR start "rule__User__Group__15__Impl"
    // InternalMyRds.g:1132:1: rule__User__Group__15__Impl : ( 'email' ) ;
    public final void rule__User__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1136:1: ( ( 'email' ) )
            // InternalMyRds.g:1137:1: ( 'email' )
            {
            // InternalMyRds.g:1137:1: ( 'email' )
            // InternalMyRds.g:1138:2: 'email'
            {
             before(grammarAccess.getUserAccess().getEmailKeyword_15()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getEmailKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__15__Impl"


    // $ANTLR start "rule__User__Group__16"
    // InternalMyRds.g:1147:1: rule__User__Group__16 : rule__User__Group__16__Impl rule__User__Group__17 ;
    public final void rule__User__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1151:1: ( rule__User__Group__16__Impl rule__User__Group__17 )
            // InternalMyRds.g:1152:2: rule__User__Group__16__Impl rule__User__Group__17
            {
            pushFollow(FOLLOW_8);
            rule__User__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__17();

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
    // $ANTLR end "rule__User__Group__16"


    // $ANTLR start "rule__User__Group__16__Impl"
    // InternalMyRds.g:1159:1: rule__User__Group__16__Impl : ( ':' ) ;
    public final void rule__User__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1163:1: ( ( ':' ) )
            // InternalMyRds.g:1164:1: ( ':' )
            {
            // InternalMyRds.g:1164:1: ( ':' )
            // InternalMyRds.g:1165:2: ':'
            {
             before(grammarAccess.getUserAccess().getColonKeyword_16()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getColonKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__16__Impl"


    // $ANTLR start "rule__User__Group__17"
    // InternalMyRds.g:1174:1: rule__User__Group__17 : rule__User__Group__17__Impl rule__User__Group__18 ;
    public final void rule__User__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1178:1: ( rule__User__Group__17__Impl rule__User__Group__18 )
            // InternalMyRds.g:1179:2: rule__User__Group__17__Impl rule__User__Group__18
            {
            pushFollow(FOLLOW_14);
            rule__User__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__18();

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
    // $ANTLR end "rule__User__Group__17"


    // $ANTLR start "rule__User__Group__17__Impl"
    // InternalMyRds.g:1186:1: rule__User__Group__17__Impl : ( ( rule__User__EmailAssignment_17 ) ) ;
    public final void rule__User__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1190:1: ( ( ( rule__User__EmailAssignment_17 ) ) )
            // InternalMyRds.g:1191:1: ( ( rule__User__EmailAssignment_17 ) )
            {
            // InternalMyRds.g:1191:1: ( ( rule__User__EmailAssignment_17 ) )
            // InternalMyRds.g:1192:2: ( rule__User__EmailAssignment_17 )
            {
             before(grammarAccess.getUserAccess().getEmailAssignment_17()); 
            // InternalMyRds.g:1193:2: ( rule__User__EmailAssignment_17 )
            // InternalMyRds.g:1193:3: rule__User__EmailAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__User__EmailAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getEmailAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__17__Impl"


    // $ANTLR start "rule__User__Group__18"
    // InternalMyRds.g:1201:1: rule__User__Group__18 : rule__User__Group__18__Impl rule__User__Group__19 ;
    public final void rule__User__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1205:1: ( rule__User__Group__18__Impl rule__User__Group__19 )
            // InternalMyRds.g:1206:2: rule__User__Group__18__Impl rule__User__Group__19
            {
            pushFollow(FOLLOW_14);
            rule__User__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__19();

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
    // $ANTLR end "rule__User__Group__18"


    // $ANTLR start "rule__User__Group__18__Impl"
    // InternalMyRds.g:1213:1: rule__User__Group__18__Impl : ( ( rule__User__ElementsAssignment_18 )* ) ;
    public final void rule__User__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1217:1: ( ( ( rule__User__ElementsAssignment_18 )* ) )
            // InternalMyRds.g:1218:1: ( ( rule__User__ElementsAssignment_18 )* )
            {
            // InternalMyRds.g:1218:1: ( ( rule__User__ElementsAssignment_18 )* )
            // InternalMyRds.g:1219:2: ( rule__User__ElementsAssignment_18 )*
            {
             before(grammarAccess.getUserAccess().getElementsAssignment_18()); 
            // InternalMyRds.g:1220:2: ( rule__User__ElementsAssignment_18 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyRds.g:1220:3: rule__User__ElementsAssignment_18
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__User__ElementsAssignment_18();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getUserAccess().getElementsAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__18__Impl"


    // $ANTLR start "rule__User__Group__19"
    // InternalMyRds.g:1228:1: rule__User__Group__19 : rule__User__Group__19__Impl ;
    public final void rule__User__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1232:1: ( rule__User__Group__19__Impl )
            // InternalMyRds.g:1233:2: rule__User__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__19__Impl();

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
    // $ANTLR end "rule__User__Group__19"


    // $ANTLR start "rule__User__Group__19__Impl"
    // InternalMyRds.g:1239:1: rule__User__Group__19__Impl : ( '}' ) ;
    public final void rule__User__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1243:1: ( ( '}' ) )
            // InternalMyRds.g:1244:1: ( '}' )
            {
            // InternalMyRds.g:1244:1: ( '}' )
            // InternalMyRds.g:1245:2: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_19()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__19__Impl"


    // $ANTLR start "rule__Customer__Group__0"
    // InternalMyRds.g:1255:1: rule__Customer__Group__0 : rule__Customer__Group__0__Impl rule__Customer__Group__1 ;
    public final void rule__Customer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1259:1: ( rule__Customer__Group__0__Impl rule__Customer__Group__1 )
            // InternalMyRds.g:1260:2: rule__Customer__Group__0__Impl rule__Customer__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Customer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__1();

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
    // $ANTLR end "rule__Customer__Group__0"


    // $ANTLR start "rule__Customer__Group__0__Impl"
    // InternalMyRds.g:1267:1: rule__Customer__Group__0__Impl : ( 'Customer' ) ;
    public final void rule__Customer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1271:1: ( ( 'Customer' ) )
            // InternalMyRds.g:1272:1: ( 'Customer' )
            {
            // InternalMyRds.g:1272:1: ( 'Customer' )
            // InternalMyRds.g:1273:2: 'Customer'
            {
             before(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0__Impl"


    // $ANTLR start "rule__Customer__Group__1"
    // InternalMyRds.g:1282:1: rule__Customer__Group__1 : rule__Customer__Group__1__Impl rule__Customer__Group__2 ;
    public final void rule__Customer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1286:1: ( rule__Customer__Group__1__Impl rule__Customer__Group__2 )
            // InternalMyRds.g:1287:2: rule__Customer__Group__1__Impl rule__Customer__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Customer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__2();

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
    // $ANTLR end "rule__Customer__Group__1"


    // $ANTLR start "rule__Customer__Group__1__Impl"
    // InternalMyRds.g:1294:1: rule__Customer__Group__1__Impl : ( ( rule__Customer__IdAssignment_1 ) ) ;
    public final void rule__Customer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1298:1: ( ( ( rule__Customer__IdAssignment_1 ) ) )
            // InternalMyRds.g:1299:1: ( ( rule__Customer__IdAssignment_1 ) )
            {
            // InternalMyRds.g:1299:1: ( ( rule__Customer__IdAssignment_1 ) )
            // InternalMyRds.g:1300:2: ( rule__Customer__IdAssignment_1 )
            {
             before(grammarAccess.getCustomerAccess().getIdAssignment_1()); 
            // InternalMyRds.g:1301:2: ( rule__Customer__IdAssignment_1 )
            // InternalMyRds.g:1301:3: rule__Customer__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Customer__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1__Impl"


    // $ANTLR start "rule__Customer__Group__2"
    // InternalMyRds.g:1309:1: rule__Customer__Group__2 : rule__Customer__Group__2__Impl rule__Customer__Group__3 ;
    public final void rule__Customer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1313:1: ( rule__Customer__Group__2__Impl rule__Customer__Group__3 )
            // InternalMyRds.g:1314:2: rule__Customer__Group__2__Impl rule__Customer__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Customer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__3();

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
    // $ANTLR end "rule__Customer__Group__2"


    // $ANTLR start "rule__Customer__Group__2__Impl"
    // InternalMyRds.g:1321:1: rule__Customer__Group__2__Impl : ( '{' ) ;
    public final void rule__Customer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1325:1: ( ( '{' ) )
            // InternalMyRds.g:1326:1: ( '{' )
            {
            // InternalMyRds.g:1326:1: ( '{' )
            // InternalMyRds.g:1327:2: '{'
            {
             before(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2__Impl"


    // $ANTLR start "rule__Customer__Group__3"
    // InternalMyRds.g:1336:1: rule__Customer__Group__3 : rule__Customer__Group__3__Impl rule__Customer__Group__4 ;
    public final void rule__Customer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1340:1: ( rule__Customer__Group__3__Impl rule__Customer__Group__4 )
            // InternalMyRds.g:1341:2: rule__Customer__Group__3__Impl rule__Customer__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Customer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__4();

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
    // $ANTLR end "rule__Customer__Group__3"


    // $ANTLR start "rule__Customer__Group__3__Impl"
    // InternalMyRds.g:1348:1: rule__Customer__Group__3__Impl : ( ( rule__Customer__OrdersAssignment_3 )* ) ;
    public final void rule__Customer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1352:1: ( ( ( rule__Customer__OrdersAssignment_3 )* ) )
            // InternalMyRds.g:1353:1: ( ( rule__Customer__OrdersAssignment_3 )* )
            {
            // InternalMyRds.g:1353:1: ( ( rule__Customer__OrdersAssignment_3 )* )
            // InternalMyRds.g:1354:2: ( rule__Customer__OrdersAssignment_3 )*
            {
             before(grammarAccess.getCustomerAccess().getOrdersAssignment_3()); 
            // InternalMyRds.g:1355:2: ( rule__Customer__OrdersAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyRds.g:1355:3: rule__Customer__OrdersAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Customer__OrdersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCustomerAccess().getOrdersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__3__Impl"


    // $ANTLR start "rule__Customer__Group__4"
    // InternalMyRds.g:1363:1: rule__Customer__Group__4 : rule__Customer__Group__4__Impl ;
    public final void rule__Customer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1367:1: ( rule__Customer__Group__4__Impl )
            // InternalMyRds.g:1368:2: rule__Customer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__4__Impl();

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
    // $ANTLR end "rule__Customer__Group__4"


    // $ANTLR start "rule__Customer__Group__4__Impl"
    // InternalMyRds.g:1374:1: rule__Customer__Group__4__Impl : ( '}' ) ;
    public final void rule__Customer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1378:1: ( ( '}' ) )
            // InternalMyRds.g:1379:1: ( '}' )
            {
            // InternalMyRds.g:1379:1: ( '}' )
            // InternalMyRds.g:1380:2: '}'
            {
             before(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__4__Impl"


    // $ANTLR start "rule__DeliveryDriver__Group__0"
    // InternalMyRds.g:1390:1: rule__DeliveryDriver__Group__0 : rule__DeliveryDriver__Group__0__Impl rule__DeliveryDriver__Group__1 ;
    public final void rule__DeliveryDriver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1394:1: ( rule__DeliveryDriver__Group__0__Impl rule__DeliveryDriver__Group__1 )
            // InternalMyRds.g:1395:2: rule__DeliveryDriver__Group__0__Impl rule__DeliveryDriver__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DeliveryDriver__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__Group__1();

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
    // $ANTLR end "rule__DeliveryDriver__Group__0"


    // $ANTLR start "rule__DeliveryDriver__Group__0__Impl"
    // InternalMyRds.g:1402:1: rule__DeliveryDriver__Group__0__Impl : ( 'DeliveryDriver' ) ;
    public final void rule__DeliveryDriver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1406:1: ( ( 'DeliveryDriver' ) )
            // InternalMyRds.g:1407:1: ( 'DeliveryDriver' )
            {
            // InternalMyRds.g:1407:1: ( 'DeliveryDriver' )
            // InternalMyRds.g:1408:2: 'DeliveryDriver'
            {
             before(grammarAccess.getDeliveryDriverAccess().getDeliveryDriverKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDeliveryDriverAccess().getDeliveryDriverKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__Group__0__Impl"


    // $ANTLR start "rule__DeliveryDriver__Group__1"
    // InternalMyRds.g:1417:1: rule__DeliveryDriver__Group__1 : rule__DeliveryDriver__Group__1__Impl rule__DeliveryDriver__Group__2 ;
    public final void rule__DeliveryDriver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1421:1: ( rule__DeliveryDriver__Group__1__Impl rule__DeliveryDriver__Group__2 )
            // InternalMyRds.g:1422:2: rule__DeliveryDriver__Group__1__Impl rule__DeliveryDriver__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DeliveryDriver__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__Group__2();

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
    // $ANTLR end "rule__DeliveryDriver__Group__1"


    // $ANTLR start "rule__DeliveryDriver__Group__1__Impl"
    // InternalMyRds.g:1429:1: rule__DeliveryDriver__Group__1__Impl : ( ( rule__DeliveryDriver__IdAssignment_1 ) ) ;
    public final void rule__DeliveryDriver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1433:1: ( ( ( rule__DeliveryDriver__IdAssignment_1 ) ) )
            // InternalMyRds.g:1434:1: ( ( rule__DeliveryDriver__IdAssignment_1 ) )
            {
            // InternalMyRds.g:1434:1: ( ( rule__DeliveryDriver__IdAssignment_1 ) )
            // InternalMyRds.g:1435:2: ( rule__DeliveryDriver__IdAssignment_1 )
            {
             before(grammarAccess.getDeliveryDriverAccess().getIdAssignment_1()); 
            // InternalMyRds.g:1436:2: ( rule__DeliveryDriver__IdAssignment_1 )
            // InternalMyRds.g:1436:3: rule__DeliveryDriver__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryDriverAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__Group__1__Impl"


    // $ANTLR start "rule__DeliveryDriver__Group__2"
    // InternalMyRds.g:1444:1: rule__DeliveryDriver__Group__2 : rule__DeliveryDriver__Group__2__Impl rule__DeliveryDriver__Group__3 ;
    public final void rule__DeliveryDriver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1448:1: ( rule__DeliveryDriver__Group__2__Impl rule__DeliveryDriver__Group__3 )
            // InternalMyRds.g:1449:2: rule__DeliveryDriver__Group__2__Impl rule__DeliveryDriver__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__DeliveryDriver__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__Group__3();

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
    // $ANTLR end "rule__DeliveryDriver__Group__2"


    // $ANTLR start "rule__DeliveryDriver__Group__2__Impl"
    // InternalMyRds.g:1456:1: rule__DeliveryDriver__Group__2__Impl : ( '{' ) ;
    public final void rule__DeliveryDriver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1460:1: ( ( '{' ) )
            // InternalMyRds.g:1461:1: ( '{' )
            {
            // InternalMyRds.g:1461:1: ( '{' )
            // InternalMyRds.g:1462:2: '{'
            {
             before(grammarAccess.getDeliveryDriverAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDeliveryDriverAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__Group__2__Impl"


    // $ANTLR start "rule__DeliveryDriver__Group__3"
    // InternalMyRds.g:1471:1: rule__DeliveryDriver__Group__3 : rule__DeliveryDriver__Group__3__Impl rule__DeliveryDriver__Group__4 ;
    public final void rule__DeliveryDriver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1475:1: ( rule__DeliveryDriver__Group__3__Impl rule__DeliveryDriver__Group__4 )
            // InternalMyRds.g:1476:2: rule__DeliveryDriver__Group__3__Impl rule__DeliveryDriver__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DeliveryDriver__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__Group__4();

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
    // $ANTLR end "rule__DeliveryDriver__Group__3"


    // $ANTLR start "rule__DeliveryDriver__Group__3__Impl"
    // InternalMyRds.g:1483:1: rule__DeliveryDriver__Group__3__Impl : ( 'isAvailable' ) ;
    public final void rule__DeliveryDriver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1487:1: ( ( 'isAvailable' ) )
            // InternalMyRds.g:1488:1: ( 'isAvailable' )
            {
            // InternalMyRds.g:1488:1: ( 'isAvailable' )
            // InternalMyRds.g:1489:2: 'isAvailable'
            {
             before(grammarAccess.getDeliveryDriverAccess().getIsAvailableKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDeliveryDriverAccess().getIsAvailableKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__Group__3__Impl"


    // $ANTLR start "rule__DeliveryDriver__Group__4"
    // InternalMyRds.g:1498:1: rule__DeliveryDriver__Group__4 : rule__DeliveryDriver__Group__4__Impl rule__DeliveryDriver__Group__5 ;
    public final void rule__DeliveryDriver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1502:1: ( rule__DeliveryDriver__Group__4__Impl rule__DeliveryDriver__Group__5 )
            // InternalMyRds.g:1503:2: rule__DeliveryDriver__Group__4__Impl rule__DeliveryDriver__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__DeliveryDriver__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__Group__5();

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
    // $ANTLR end "rule__DeliveryDriver__Group__4"


    // $ANTLR start "rule__DeliveryDriver__Group__4__Impl"
    // InternalMyRds.g:1510:1: rule__DeliveryDriver__Group__4__Impl : ( ':' ) ;
    public final void rule__DeliveryDriver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1514:1: ( ( ':' ) )
            // InternalMyRds.g:1515:1: ( ':' )
            {
            // InternalMyRds.g:1515:1: ( ':' )
            // InternalMyRds.g:1516:2: ':'
            {
             before(grammarAccess.getDeliveryDriverAccess().getColonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDeliveryDriverAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__Group__4__Impl"


    // $ANTLR start "rule__DeliveryDriver__Group__5"
    // InternalMyRds.g:1525:1: rule__DeliveryDriver__Group__5 : rule__DeliveryDriver__Group__5__Impl rule__DeliveryDriver__Group__6 ;
    public final void rule__DeliveryDriver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1529:1: ( rule__DeliveryDriver__Group__5__Impl rule__DeliveryDriver__Group__6 )
            // InternalMyRds.g:1530:2: rule__DeliveryDriver__Group__5__Impl rule__DeliveryDriver__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__DeliveryDriver__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__Group__6();

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
    // $ANTLR end "rule__DeliveryDriver__Group__5"


    // $ANTLR start "rule__DeliveryDriver__Group__5__Impl"
    // InternalMyRds.g:1537:1: rule__DeliveryDriver__Group__5__Impl : ( ( rule__DeliveryDriver__IsAvailableAssignment_5 ) ) ;
    public final void rule__DeliveryDriver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1541:1: ( ( ( rule__DeliveryDriver__IsAvailableAssignment_5 ) ) )
            // InternalMyRds.g:1542:1: ( ( rule__DeliveryDriver__IsAvailableAssignment_5 ) )
            {
            // InternalMyRds.g:1542:1: ( ( rule__DeliveryDriver__IsAvailableAssignment_5 ) )
            // InternalMyRds.g:1543:2: ( rule__DeliveryDriver__IsAvailableAssignment_5 )
            {
             before(grammarAccess.getDeliveryDriverAccess().getIsAvailableAssignment_5()); 
            // InternalMyRds.g:1544:2: ( rule__DeliveryDriver__IsAvailableAssignment_5 )
            // InternalMyRds.g:1544:3: rule__DeliveryDriver__IsAvailableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__IsAvailableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryDriverAccess().getIsAvailableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__Group__5__Impl"


    // $ANTLR start "rule__DeliveryDriver__Group__6"
    // InternalMyRds.g:1552:1: rule__DeliveryDriver__Group__6 : rule__DeliveryDriver__Group__6__Impl rule__DeliveryDriver__Group__7 ;
    public final void rule__DeliveryDriver__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1556:1: ( rule__DeliveryDriver__Group__6__Impl rule__DeliveryDriver__Group__7 )
            // InternalMyRds.g:1557:2: rule__DeliveryDriver__Group__6__Impl rule__DeliveryDriver__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__DeliveryDriver__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__Group__7();

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
    // $ANTLR end "rule__DeliveryDriver__Group__6"


    // $ANTLR start "rule__DeliveryDriver__Group__6__Impl"
    // InternalMyRds.g:1564:1: rule__DeliveryDriver__Group__6__Impl : ( 'carLicenceNumber' ) ;
    public final void rule__DeliveryDriver__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1568:1: ( ( 'carLicenceNumber' ) )
            // InternalMyRds.g:1569:1: ( 'carLicenceNumber' )
            {
            // InternalMyRds.g:1569:1: ( 'carLicenceNumber' )
            // InternalMyRds.g:1570:2: 'carLicenceNumber'
            {
             before(grammarAccess.getDeliveryDriverAccess().getCarLicenceNumberKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDeliveryDriverAccess().getCarLicenceNumberKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__Group__6__Impl"


    // $ANTLR start "rule__DeliveryDriver__Group__7"
    // InternalMyRds.g:1579:1: rule__DeliveryDriver__Group__7 : rule__DeliveryDriver__Group__7__Impl rule__DeliveryDriver__Group__8 ;
    public final void rule__DeliveryDriver__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1583:1: ( rule__DeliveryDriver__Group__7__Impl rule__DeliveryDriver__Group__8 )
            // InternalMyRds.g:1584:2: rule__DeliveryDriver__Group__7__Impl rule__DeliveryDriver__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__DeliveryDriver__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__Group__8();

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
    // $ANTLR end "rule__DeliveryDriver__Group__7"


    // $ANTLR start "rule__DeliveryDriver__Group__7__Impl"
    // InternalMyRds.g:1591:1: rule__DeliveryDriver__Group__7__Impl : ( ':' ) ;
    public final void rule__DeliveryDriver__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1595:1: ( ( ':' ) )
            // InternalMyRds.g:1596:1: ( ':' )
            {
            // InternalMyRds.g:1596:1: ( ':' )
            // InternalMyRds.g:1597:2: ':'
            {
             before(grammarAccess.getDeliveryDriverAccess().getColonKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDeliveryDriverAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__Group__7__Impl"


    // $ANTLR start "rule__DeliveryDriver__Group__8"
    // InternalMyRds.g:1606:1: rule__DeliveryDriver__Group__8 : rule__DeliveryDriver__Group__8__Impl rule__DeliveryDriver__Group__9 ;
    public final void rule__DeliveryDriver__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1610:1: ( rule__DeliveryDriver__Group__8__Impl rule__DeliveryDriver__Group__9 )
            // InternalMyRds.g:1611:2: rule__DeliveryDriver__Group__8__Impl rule__DeliveryDriver__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__DeliveryDriver__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__Group__9();

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
    // $ANTLR end "rule__DeliveryDriver__Group__8"


    // $ANTLR start "rule__DeliveryDriver__Group__8__Impl"
    // InternalMyRds.g:1618:1: rule__DeliveryDriver__Group__8__Impl : ( ( rule__DeliveryDriver__CarLicenceNumberAssignment_8 ) ) ;
    public final void rule__DeliveryDriver__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1622:1: ( ( ( rule__DeliveryDriver__CarLicenceNumberAssignment_8 ) ) )
            // InternalMyRds.g:1623:1: ( ( rule__DeliveryDriver__CarLicenceNumberAssignment_8 ) )
            {
            // InternalMyRds.g:1623:1: ( ( rule__DeliveryDriver__CarLicenceNumberAssignment_8 ) )
            // InternalMyRds.g:1624:2: ( rule__DeliveryDriver__CarLicenceNumberAssignment_8 )
            {
             before(grammarAccess.getDeliveryDriverAccess().getCarLicenceNumberAssignment_8()); 
            // InternalMyRds.g:1625:2: ( rule__DeliveryDriver__CarLicenceNumberAssignment_8 )
            // InternalMyRds.g:1625:3: rule__DeliveryDriver__CarLicenceNumberAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__CarLicenceNumberAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryDriverAccess().getCarLicenceNumberAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__Group__8__Impl"


    // $ANTLR start "rule__DeliveryDriver__Group__9"
    // InternalMyRds.g:1633:1: rule__DeliveryDriver__Group__9 : rule__DeliveryDriver__Group__9__Impl rule__DeliveryDriver__Group__10 ;
    public final void rule__DeliveryDriver__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1637:1: ( rule__DeliveryDriver__Group__9__Impl rule__DeliveryDriver__Group__10 )
            // InternalMyRds.g:1638:2: rule__DeliveryDriver__Group__9__Impl rule__DeliveryDriver__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__DeliveryDriver__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__Group__10();

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
    // $ANTLR end "rule__DeliveryDriver__Group__9"


    // $ANTLR start "rule__DeliveryDriver__Group__9__Impl"
    // InternalMyRds.g:1645:1: rule__DeliveryDriver__Group__9__Impl : ( ( rule__DeliveryDriver__OrdersAssignment_9 )* ) ;
    public final void rule__DeliveryDriver__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1649:1: ( ( ( rule__DeliveryDriver__OrdersAssignment_9 )* ) )
            // InternalMyRds.g:1650:1: ( ( rule__DeliveryDriver__OrdersAssignment_9 )* )
            {
            // InternalMyRds.g:1650:1: ( ( rule__DeliveryDriver__OrdersAssignment_9 )* )
            // InternalMyRds.g:1651:2: ( rule__DeliveryDriver__OrdersAssignment_9 )*
            {
             before(grammarAccess.getDeliveryDriverAccess().getOrdersAssignment_9()); 
            // InternalMyRds.g:1652:2: ( rule__DeliveryDriver__OrdersAssignment_9 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyRds.g:1652:3: rule__DeliveryDriver__OrdersAssignment_9
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__DeliveryDriver__OrdersAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDeliveryDriverAccess().getOrdersAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__Group__9__Impl"


    // $ANTLR start "rule__DeliveryDriver__Group__10"
    // InternalMyRds.g:1660:1: rule__DeliveryDriver__Group__10 : rule__DeliveryDriver__Group__10__Impl ;
    public final void rule__DeliveryDriver__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1664:1: ( rule__DeliveryDriver__Group__10__Impl )
            // InternalMyRds.g:1665:2: rule__DeliveryDriver__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryDriver__Group__10__Impl();

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
    // $ANTLR end "rule__DeliveryDriver__Group__10"


    // $ANTLR start "rule__DeliveryDriver__Group__10__Impl"
    // InternalMyRds.g:1671:1: rule__DeliveryDriver__Group__10__Impl : ( '}' ) ;
    public final void rule__DeliveryDriver__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1675:1: ( ( '}' ) )
            // InternalMyRds.g:1676:1: ( '}' )
            {
            // InternalMyRds.g:1676:1: ( '}' )
            // InternalMyRds.g:1677:2: '}'
            {
             before(grammarAccess.getDeliveryDriverAccess().getRightCurlyBracketKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDeliveryDriverAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__Group__10__Impl"


    // $ANTLR start "rule__Order__Group__0"
    // InternalMyRds.g:1687:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1691:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalMyRds.g:1692:2: rule__Order__Group__0__Impl rule__Order__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Order__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__1();

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
    // $ANTLR end "rule__Order__Group__0"


    // $ANTLR start "rule__Order__Group__0__Impl"
    // InternalMyRds.g:1699:1: rule__Order__Group__0__Impl : ( 'Order' ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1703:1: ( ( 'Order' ) )
            // InternalMyRds.g:1704:1: ( 'Order' )
            {
            // InternalMyRds.g:1704:1: ( 'Order' )
            // InternalMyRds.g:1705:2: 'Order'
            {
             before(grammarAccess.getOrderAccess().getOrderKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getOrderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__0__Impl"


    // $ANTLR start "rule__Order__Group__1"
    // InternalMyRds.g:1714:1: rule__Order__Group__1 : rule__Order__Group__1__Impl rule__Order__Group__2 ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1718:1: ( rule__Order__Group__1__Impl rule__Order__Group__2 )
            // InternalMyRds.g:1719:2: rule__Order__Group__1__Impl rule__Order__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Order__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__2();

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
    // $ANTLR end "rule__Order__Group__1"


    // $ANTLR start "rule__Order__Group__1__Impl"
    // InternalMyRds.g:1726:1: rule__Order__Group__1__Impl : ( ( rule__Order__IdAssignment_1 ) ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1730:1: ( ( ( rule__Order__IdAssignment_1 ) ) )
            // InternalMyRds.g:1731:1: ( ( rule__Order__IdAssignment_1 ) )
            {
            // InternalMyRds.g:1731:1: ( ( rule__Order__IdAssignment_1 ) )
            // InternalMyRds.g:1732:2: ( rule__Order__IdAssignment_1 )
            {
             before(grammarAccess.getOrderAccess().getIdAssignment_1()); 
            // InternalMyRds.g:1733:2: ( rule__Order__IdAssignment_1 )
            // InternalMyRds.g:1733:3: rule__Order__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Order__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__1__Impl"


    // $ANTLR start "rule__Order__Group__2"
    // InternalMyRds.g:1741:1: rule__Order__Group__2 : rule__Order__Group__2__Impl rule__Order__Group__3 ;
    public final void rule__Order__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1745:1: ( rule__Order__Group__2__Impl rule__Order__Group__3 )
            // InternalMyRds.g:1746:2: rule__Order__Group__2__Impl rule__Order__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Order__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__3();

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
    // $ANTLR end "rule__Order__Group__2"


    // $ANTLR start "rule__Order__Group__2__Impl"
    // InternalMyRds.g:1753:1: rule__Order__Group__2__Impl : ( '{' ) ;
    public final void rule__Order__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1757:1: ( ( '{' ) )
            // InternalMyRds.g:1758:1: ( '{' )
            {
            // InternalMyRds.g:1758:1: ( '{' )
            // InternalMyRds.g:1759:2: '{'
            {
             before(grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__2__Impl"


    // $ANTLR start "rule__Order__Group__3"
    // InternalMyRds.g:1768:1: rule__Order__Group__3 : rule__Order__Group__3__Impl rule__Order__Group__4 ;
    public final void rule__Order__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1772:1: ( rule__Order__Group__3__Impl rule__Order__Group__4 )
            // InternalMyRds.g:1773:2: rule__Order__Group__3__Impl rule__Order__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Order__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__4();

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
    // $ANTLR end "rule__Order__Group__3"


    // $ANTLR start "rule__Order__Group__3__Impl"
    // InternalMyRds.g:1780:1: rule__Order__Group__3__Impl : ( 'orderNumber' ) ;
    public final void rule__Order__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1784:1: ( ( 'orderNumber' ) )
            // InternalMyRds.g:1785:1: ( 'orderNumber' )
            {
            // InternalMyRds.g:1785:1: ( 'orderNumber' )
            // InternalMyRds.g:1786:2: 'orderNumber'
            {
             before(grammarAccess.getOrderAccess().getOrderNumberKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getOrderNumberKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__3__Impl"


    // $ANTLR start "rule__Order__Group__4"
    // InternalMyRds.g:1795:1: rule__Order__Group__4 : rule__Order__Group__4__Impl rule__Order__Group__5 ;
    public final void rule__Order__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1799:1: ( rule__Order__Group__4__Impl rule__Order__Group__5 )
            // InternalMyRds.g:1800:2: rule__Order__Group__4__Impl rule__Order__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Order__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__5();

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
    // $ANTLR end "rule__Order__Group__4"


    // $ANTLR start "rule__Order__Group__4__Impl"
    // InternalMyRds.g:1807:1: rule__Order__Group__4__Impl : ( ':' ) ;
    public final void rule__Order__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1811:1: ( ( ':' ) )
            // InternalMyRds.g:1812:1: ( ':' )
            {
            // InternalMyRds.g:1812:1: ( ':' )
            // InternalMyRds.g:1813:2: ':'
            {
             before(grammarAccess.getOrderAccess().getColonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__4__Impl"


    // $ANTLR start "rule__Order__Group__5"
    // InternalMyRds.g:1822:1: rule__Order__Group__5 : rule__Order__Group__5__Impl rule__Order__Group__6 ;
    public final void rule__Order__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1826:1: ( rule__Order__Group__5__Impl rule__Order__Group__6 )
            // InternalMyRds.g:1827:2: rule__Order__Group__5__Impl rule__Order__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Order__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__6();

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
    // $ANTLR end "rule__Order__Group__5"


    // $ANTLR start "rule__Order__Group__5__Impl"
    // InternalMyRds.g:1834:1: rule__Order__Group__5__Impl : ( ( rule__Order__OrderNumberAssignment_5 ) ) ;
    public final void rule__Order__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1838:1: ( ( ( rule__Order__OrderNumberAssignment_5 ) ) )
            // InternalMyRds.g:1839:1: ( ( rule__Order__OrderNumberAssignment_5 ) )
            {
            // InternalMyRds.g:1839:1: ( ( rule__Order__OrderNumberAssignment_5 ) )
            // InternalMyRds.g:1840:2: ( rule__Order__OrderNumberAssignment_5 )
            {
             before(grammarAccess.getOrderAccess().getOrderNumberAssignment_5()); 
            // InternalMyRds.g:1841:2: ( rule__Order__OrderNumberAssignment_5 )
            // InternalMyRds.g:1841:3: rule__Order__OrderNumberAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Order__OrderNumberAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getOrderNumberAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__5__Impl"


    // $ANTLR start "rule__Order__Group__6"
    // InternalMyRds.g:1849:1: rule__Order__Group__6 : rule__Order__Group__6__Impl rule__Order__Group__7 ;
    public final void rule__Order__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1853:1: ( rule__Order__Group__6__Impl rule__Order__Group__7 )
            // InternalMyRds.g:1854:2: rule__Order__Group__6__Impl rule__Order__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Order__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__7();

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
    // $ANTLR end "rule__Order__Group__6"


    // $ANTLR start "rule__Order__Group__6__Impl"
    // InternalMyRds.g:1861:1: rule__Order__Group__6__Impl : ( 'status' ) ;
    public final void rule__Order__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1865:1: ( ( 'status' ) )
            // InternalMyRds.g:1866:1: ( 'status' )
            {
            // InternalMyRds.g:1866:1: ( 'status' )
            // InternalMyRds.g:1867:2: 'status'
            {
             before(grammarAccess.getOrderAccess().getStatusKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getStatusKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__6__Impl"


    // $ANTLR start "rule__Order__Group__7"
    // InternalMyRds.g:1876:1: rule__Order__Group__7 : rule__Order__Group__7__Impl rule__Order__Group__8 ;
    public final void rule__Order__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1880:1: ( rule__Order__Group__7__Impl rule__Order__Group__8 )
            // InternalMyRds.g:1881:2: rule__Order__Group__7__Impl rule__Order__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Order__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__8();

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
    // $ANTLR end "rule__Order__Group__7"


    // $ANTLR start "rule__Order__Group__7__Impl"
    // InternalMyRds.g:1888:1: rule__Order__Group__7__Impl : ( ':' ) ;
    public final void rule__Order__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1892:1: ( ( ':' ) )
            // InternalMyRds.g:1893:1: ( ':' )
            {
            // InternalMyRds.g:1893:1: ( ':' )
            // InternalMyRds.g:1894:2: ':'
            {
             before(grammarAccess.getOrderAccess().getColonKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__7__Impl"


    // $ANTLR start "rule__Order__Group__8"
    // InternalMyRds.g:1903:1: rule__Order__Group__8 : rule__Order__Group__8__Impl rule__Order__Group__9 ;
    public final void rule__Order__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1907:1: ( rule__Order__Group__8__Impl rule__Order__Group__9 )
            // InternalMyRds.g:1908:2: rule__Order__Group__8__Impl rule__Order__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Order__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__9();

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
    // $ANTLR end "rule__Order__Group__8"


    // $ANTLR start "rule__Order__Group__8__Impl"
    // InternalMyRds.g:1915:1: rule__Order__Group__8__Impl : ( ( rule__Order__StatusAssignment_8 ) ) ;
    public final void rule__Order__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1919:1: ( ( ( rule__Order__StatusAssignment_8 ) ) )
            // InternalMyRds.g:1920:1: ( ( rule__Order__StatusAssignment_8 ) )
            {
            // InternalMyRds.g:1920:1: ( ( rule__Order__StatusAssignment_8 ) )
            // InternalMyRds.g:1921:2: ( rule__Order__StatusAssignment_8 )
            {
             before(grammarAccess.getOrderAccess().getStatusAssignment_8()); 
            // InternalMyRds.g:1922:2: ( rule__Order__StatusAssignment_8 )
            // InternalMyRds.g:1922:3: rule__Order__StatusAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Order__StatusAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getStatusAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__8__Impl"


    // $ANTLR start "rule__Order__Group__9"
    // InternalMyRds.g:1930:1: rule__Order__Group__9 : rule__Order__Group__9__Impl rule__Order__Group__10 ;
    public final void rule__Order__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1934:1: ( rule__Order__Group__9__Impl rule__Order__Group__10 )
            // InternalMyRds.g:1935:2: rule__Order__Group__9__Impl rule__Order__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Order__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__10();

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
    // $ANTLR end "rule__Order__Group__9"


    // $ANTLR start "rule__Order__Group__9__Impl"
    // InternalMyRds.g:1942:1: rule__Order__Group__9__Impl : ( 'deliveryAddress' ) ;
    public final void rule__Order__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1946:1: ( ( 'deliveryAddress' ) )
            // InternalMyRds.g:1947:1: ( 'deliveryAddress' )
            {
            // InternalMyRds.g:1947:1: ( 'deliveryAddress' )
            // InternalMyRds.g:1948:2: 'deliveryAddress'
            {
             before(grammarAccess.getOrderAccess().getDeliveryAddressKeyword_9()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getDeliveryAddressKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__9__Impl"


    // $ANTLR start "rule__Order__Group__10"
    // InternalMyRds.g:1957:1: rule__Order__Group__10 : rule__Order__Group__10__Impl rule__Order__Group__11 ;
    public final void rule__Order__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1961:1: ( rule__Order__Group__10__Impl rule__Order__Group__11 )
            // InternalMyRds.g:1962:2: rule__Order__Group__10__Impl rule__Order__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Order__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__11();

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
    // $ANTLR end "rule__Order__Group__10"


    // $ANTLR start "rule__Order__Group__10__Impl"
    // InternalMyRds.g:1969:1: rule__Order__Group__10__Impl : ( ':' ) ;
    public final void rule__Order__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1973:1: ( ( ':' ) )
            // InternalMyRds.g:1974:1: ( ':' )
            {
            // InternalMyRds.g:1974:1: ( ':' )
            // InternalMyRds.g:1975:2: ':'
            {
             before(grammarAccess.getOrderAccess().getColonKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__10__Impl"


    // $ANTLR start "rule__Order__Group__11"
    // InternalMyRds.g:1984:1: rule__Order__Group__11 : rule__Order__Group__11__Impl rule__Order__Group__12 ;
    public final void rule__Order__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:1988:1: ( rule__Order__Group__11__Impl rule__Order__Group__12 )
            // InternalMyRds.g:1989:2: rule__Order__Group__11__Impl rule__Order__Group__12
            {
            pushFollow(FOLLOW_22);
            rule__Order__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__12();

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
    // $ANTLR end "rule__Order__Group__11"


    // $ANTLR start "rule__Order__Group__11__Impl"
    // InternalMyRds.g:1996:1: rule__Order__Group__11__Impl : ( ( rule__Order__DeliveryAddressAssignment_11 ) ) ;
    public final void rule__Order__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2000:1: ( ( ( rule__Order__DeliveryAddressAssignment_11 ) ) )
            // InternalMyRds.g:2001:1: ( ( rule__Order__DeliveryAddressAssignment_11 ) )
            {
            // InternalMyRds.g:2001:1: ( ( rule__Order__DeliveryAddressAssignment_11 ) )
            // InternalMyRds.g:2002:2: ( rule__Order__DeliveryAddressAssignment_11 )
            {
             before(grammarAccess.getOrderAccess().getDeliveryAddressAssignment_11()); 
            // InternalMyRds.g:2003:2: ( rule__Order__DeliveryAddressAssignment_11 )
            // InternalMyRds.g:2003:3: rule__Order__DeliveryAddressAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Order__DeliveryAddressAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getDeliveryAddressAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__11__Impl"


    // $ANTLR start "rule__Order__Group__12"
    // InternalMyRds.g:2011:1: rule__Order__Group__12 : rule__Order__Group__12__Impl rule__Order__Group__13 ;
    public final void rule__Order__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2015:1: ( rule__Order__Group__12__Impl rule__Order__Group__13 )
            // InternalMyRds.g:2016:2: rule__Order__Group__12__Impl rule__Order__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Order__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__13();

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
    // $ANTLR end "rule__Order__Group__12"


    // $ANTLR start "rule__Order__Group__12__Impl"
    // InternalMyRds.g:2023:1: rule__Order__Group__12__Impl : ( 'orderedDatetime' ) ;
    public final void rule__Order__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2027:1: ( ( 'orderedDatetime' ) )
            // InternalMyRds.g:2028:1: ( 'orderedDatetime' )
            {
            // InternalMyRds.g:2028:1: ( 'orderedDatetime' )
            // InternalMyRds.g:2029:2: 'orderedDatetime'
            {
             before(grammarAccess.getOrderAccess().getOrderedDatetimeKeyword_12()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getOrderedDatetimeKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__12__Impl"


    // $ANTLR start "rule__Order__Group__13"
    // InternalMyRds.g:2038:1: rule__Order__Group__13 : rule__Order__Group__13__Impl rule__Order__Group__14 ;
    public final void rule__Order__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2042:1: ( rule__Order__Group__13__Impl rule__Order__Group__14 )
            // InternalMyRds.g:2043:2: rule__Order__Group__13__Impl rule__Order__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__Order__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__14();

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
    // $ANTLR end "rule__Order__Group__13"


    // $ANTLR start "rule__Order__Group__13__Impl"
    // InternalMyRds.g:2050:1: rule__Order__Group__13__Impl : ( ':' ) ;
    public final void rule__Order__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2054:1: ( ( ':' ) )
            // InternalMyRds.g:2055:1: ( ':' )
            {
            // InternalMyRds.g:2055:1: ( ':' )
            // InternalMyRds.g:2056:2: ':'
            {
             before(grammarAccess.getOrderAccess().getColonKeyword_13()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getColonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__13__Impl"


    // $ANTLR start "rule__Order__Group__14"
    // InternalMyRds.g:2065:1: rule__Order__Group__14 : rule__Order__Group__14__Impl rule__Order__Group__15 ;
    public final void rule__Order__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2069:1: ( rule__Order__Group__14__Impl rule__Order__Group__15 )
            // InternalMyRds.g:2070:2: rule__Order__Group__14__Impl rule__Order__Group__15
            {
            pushFollow(FOLLOW_23);
            rule__Order__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__15();

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
    // $ANTLR end "rule__Order__Group__14"


    // $ANTLR start "rule__Order__Group__14__Impl"
    // InternalMyRds.g:2077:1: rule__Order__Group__14__Impl : ( ( rule__Order__OrderedDatetimeAssignment_14 ) ) ;
    public final void rule__Order__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2081:1: ( ( ( rule__Order__OrderedDatetimeAssignment_14 ) ) )
            // InternalMyRds.g:2082:1: ( ( rule__Order__OrderedDatetimeAssignment_14 ) )
            {
            // InternalMyRds.g:2082:1: ( ( rule__Order__OrderedDatetimeAssignment_14 ) )
            // InternalMyRds.g:2083:2: ( rule__Order__OrderedDatetimeAssignment_14 )
            {
             before(grammarAccess.getOrderAccess().getOrderedDatetimeAssignment_14()); 
            // InternalMyRds.g:2084:2: ( rule__Order__OrderedDatetimeAssignment_14 )
            // InternalMyRds.g:2084:3: rule__Order__OrderedDatetimeAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Order__OrderedDatetimeAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getOrderedDatetimeAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__14__Impl"


    // $ANTLR start "rule__Order__Group__15"
    // InternalMyRds.g:2092:1: rule__Order__Group__15 : rule__Order__Group__15__Impl rule__Order__Group__16 ;
    public final void rule__Order__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2096:1: ( rule__Order__Group__15__Impl rule__Order__Group__16 )
            // InternalMyRds.g:2097:2: rule__Order__Group__15__Impl rule__Order__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__Order__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__16();

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
    // $ANTLR end "rule__Order__Group__15"


    // $ANTLR start "rule__Order__Group__15__Impl"
    // InternalMyRds.g:2104:1: rule__Order__Group__15__Impl : ( 'deliveredDatetime' ) ;
    public final void rule__Order__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2108:1: ( ( 'deliveredDatetime' ) )
            // InternalMyRds.g:2109:1: ( 'deliveredDatetime' )
            {
            // InternalMyRds.g:2109:1: ( 'deliveredDatetime' )
            // InternalMyRds.g:2110:2: 'deliveredDatetime'
            {
             before(grammarAccess.getOrderAccess().getDeliveredDatetimeKeyword_15()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getDeliveredDatetimeKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__15__Impl"


    // $ANTLR start "rule__Order__Group__16"
    // InternalMyRds.g:2119:1: rule__Order__Group__16 : rule__Order__Group__16__Impl rule__Order__Group__17 ;
    public final void rule__Order__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2123:1: ( rule__Order__Group__16__Impl rule__Order__Group__17 )
            // InternalMyRds.g:2124:2: rule__Order__Group__16__Impl rule__Order__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__Order__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__17();

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
    // $ANTLR end "rule__Order__Group__16"


    // $ANTLR start "rule__Order__Group__16__Impl"
    // InternalMyRds.g:2131:1: rule__Order__Group__16__Impl : ( ':' ) ;
    public final void rule__Order__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2135:1: ( ( ':' ) )
            // InternalMyRds.g:2136:1: ( ':' )
            {
            // InternalMyRds.g:2136:1: ( ':' )
            // InternalMyRds.g:2137:2: ':'
            {
             before(grammarAccess.getOrderAccess().getColonKeyword_16()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getColonKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__16__Impl"


    // $ANTLR start "rule__Order__Group__17"
    // InternalMyRds.g:2146:1: rule__Order__Group__17 : rule__Order__Group__17__Impl rule__Order__Group__18 ;
    public final void rule__Order__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2150:1: ( rule__Order__Group__17__Impl rule__Order__Group__18 )
            // InternalMyRds.g:2151:2: rule__Order__Group__17__Impl rule__Order__Group__18
            {
            pushFollow(FOLLOW_24);
            rule__Order__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__18();

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
    // $ANTLR end "rule__Order__Group__17"


    // $ANTLR start "rule__Order__Group__17__Impl"
    // InternalMyRds.g:2158:1: rule__Order__Group__17__Impl : ( ( rule__Order__DeliveredDatetimeAssignment_17 ) ) ;
    public final void rule__Order__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2162:1: ( ( ( rule__Order__DeliveredDatetimeAssignment_17 ) ) )
            // InternalMyRds.g:2163:1: ( ( rule__Order__DeliveredDatetimeAssignment_17 ) )
            {
            // InternalMyRds.g:2163:1: ( ( rule__Order__DeliveredDatetimeAssignment_17 ) )
            // InternalMyRds.g:2164:2: ( rule__Order__DeliveredDatetimeAssignment_17 )
            {
             before(grammarAccess.getOrderAccess().getDeliveredDatetimeAssignment_17()); 
            // InternalMyRds.g:2165:2: ( rule__Order__DeliveredDatetimeAssignment_17 )
            // InternalMyRds.g:2165:3: rule__Order__DeliveredDatetimeAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Order__DeliveredDatetimeAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getDeliveredDatetimeAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__17__Impl"


    // $ANTLR start "rule__Order__Group__18"
    // InternalMyRds.g:2173:1: rule__Order__Group__18 : rule__Order__Group__18__Impl rule__Order__Group__19 ;
    public final void rule__Order__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2177:1: ( rule__Order__Group__18__Impl rule__Order__Group__19 )
            // InternalMyRds.g:2178:2: rule__Order__Group__18__Impl rule__Order__Group__19
            {
            pushFollow(FOLLOW_7);
            rule__Order__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__19();

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
    // $ANTLR end "rule__Order__Group__18"


    // $ANTLR start "rule__Order__Group__18__Impl"
    // InternalMyRds.g:2185:1: rule__Order__Group__18__Impl : ( 'requestedDeliveryDatetime' ) ;
    public final void rule__Order__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2189:1: ( ( 'requestedDeliveryDatetime' ) )
            // InternalMyRds.g:2190:1: ( 'requestedDeliveryDatetime' )
            {
            // InternalMyRds.g:2190:1: ( 'requestedDeliveryDatetime' )
            // InternalMyRds.g:2191:2: 'requestedDeliveryDatetime'
            {
             before(grammarAccess.getOrderAccess().getRequestedDeliveryDatetimeKeyword_18()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getRequestedDeliveryDatetimeKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__18__Impl"


    // $ANTLR start "rule__Order__Group__19"
    // InternalMyRds.g:2200:1: rule__Order__Group__19 : rule__Order__Group__19__Impl rule__Order__Group__20 ;
    public final void rule__Order__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2204:1: ( rule__Order__Group__19__Impl rule__Order__Group__20 )
            // InternalMyRds.g:2205:2: rule__Order__Group__19__Impl rule__Order__Group__20
            {
            pushFollow(FOLLOW_12);
            rule__Order__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__20();

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
    // $ANTLR end "rule__Order__Group__19"


    // $ANTLR start "rule__Order__Group__19__Impl"
    // InternalMyRds.g:2212:1: rule__Order__Group__19__Impl : ( ':' ) ;
    public final void rule__Order__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2216:1: ( ( ':' ) )
            // InternalMyRds.g:2217:1: ( ':' )
            {
            // InternalMyRds.g:2217:1: ( ':' )
            // InternalMyRds.g:2218:2: ':'
            {
             before(grammarAccess.getOrderAccess().getColonKeyword_19()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getColonKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__19__Impl"


    // $ANTLR start "rule__Order__Group__20"
    // InternalMyRds.g:2227:1: rule__Order__Group__20 : rule__Order__Group__20__Impl rule__Order__Group__21 ;
    public final void rule__Order__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2231:1: ( rule__Order__Group__20__Impl rule__Order__Group__21 )
            // InternalMyRds.g:2232:2: rule__Order__Group__20__Impl rule__Order__Group__21
            {
            pushFollow(FOLLOW_25);
            rule__Order__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__21();

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
    // $ANTLR end "rule__Order__Group__20"


    // $ANTLR start "rule__Order__Group__20__Impl"
    // InternalMyRds.g:2239:1: rule__Order__Group__20__Impl : ( ( rule__Order__RequestedDeliveryDatetimeAssignment_20 ) ) ;
    public final void rule__Order__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2243:1: ( ( ( rule__Order__RequestedDeliveryDatetimeAssignment_20 ) ) )
            // InternalMyRds.g:2244:1: ( ( rule__Order__RequestedDeliveryDatetimeAssignment_20 ) )
            {
            // InternalMyRds.g:2244:1: ( ( rule__Order__RequestedDeliveryDatetimeAssignment_20 ) )
            // InternalMyRds.g:2245:2: ( rule__Order__RequestedDeliveryDatetimeAssignment_20 )
            {
             before(grammarAccess.getOrderAccess().getRequestedDeliveryDatetimeAssignment_20()); 
            // InternalMyRds.g:2246:2: ( rule__Order__RequestedDeliveryDatetimeAssignment_20 )
            // InternalMyRds.g:2246:3: rule__Order__RequestedDeliveryDatetimeAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__Order__RequestedDeliveryDatetimeAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getRequestedDeliveryDatetimeAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__20__Impl"


    // $ANTLR start "rule__Order__Group__21"
    // InternalMyRds.g:2254:1: rule__Order__Group__21 : rule__Order__Group__21__Impl rule__Order__Group__22 ;
    public final void rule__Order__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2258:1: ( rule__Order__Group__21__Impl rule__Order__Group__22 )
            // InternalMyRds.g:2259:2: rule__Order__Group__21__Impl rule__Order__Group__22
            {
            pushFollow(FOLLOW_25);
            rule__Order__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__22();

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
    // $ANTLR end "rule__Order__Group__21"


    // $ANTLR start "rule__Order__Group__21__Impl"
    // InternalMyRds.g:2266:1: rule__Order__Group__21__Impl : ( ( rule__Order__OrderItemsAssignment_21 )* ) ;
    public final void rule__Order__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2270:1: ( ( ( rule__Order__OrderItemsAssignment_21 )* ) )
            // InternalMyRds.g:2271:1: ( ( rule__Order__OrderItemsAssignment_21 )* )
            {
            // InternalMyRds.g:2271:1: ( ( rule__Order__OrderItemsAssignment_21 )* )
            // InternalMyRds.g:2272:2: ( rule__Order__OrderItemsAssignment_21 )*
            {
             before(grammarAccess.getOrderAccess().getOrderItemsAssignment_21()); 
            // InternalMyRds.g:2273:2: ( rule__Order__OrderItemsAssignment_21 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyRds.g:2273:3: rule__Order__OrderItemsAssignment_21
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Order__OrderItemsAssignment_21();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getOrderAccess().getOrderItemsAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__21__Impl"


    // $ANTLR start "rule__Order__Group__22"
    // InternalMyRds.g:2281:1: rule__Order__Group__22 : rule__Order__Group__22__Impl rule__Order__Group__23 ;
    public final void rule__Order__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2285:1: ( rule__Order__Group__22__Impl rule__Order__Group__23 )
            // InternalMyRds.g:2286:2: rule__Order__Group__22__Impl rule__Order__Group__23
            {
            pushFollow(FOLLOW_7);
            rule__Order__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__23();

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
    // $ANTLR end "rule__Order__Group__22"


    // $ANTLR start "rule__Order__Group__22__Impl"
    // InternalMyRds.g:2293:1: rule__Order__Group__22__Impl : ( 'review' ) ;
    public final void rule__Order__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2297:1: ( ( 'review' ) )
            // InternalMyRds.g:2298:1: ( 'review' )
            {
            // InternalMyRds.g:2298:1: ( 'review' )
            // InternalMyRds.g:2299:2: 'review'
            {
             before(grammarAccess.getOrderAccess().getReviewKeyword_22()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getReviewKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__22__Impl"


    // $ANTLR start "rule__Order__Group__23"
    // InternalMyRds.g:2308:1: rule__Order__Group__23 : rule__Order__Group__23__Impl rule__Order__Group__24 ;
    public final void rule__Order__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2312:1: ( rule__Order__Group__23__Impl rule__Order__Group__24 )
            // InternalMyRds.g:2313:2: rule__Order__Group__23__Impl rule__Order__Group__24
            {
            pushFollow(FOLLOW_4);
            rule__Order__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__24();

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
    // $ANTLR end "rule__Order__Group__23"


    // $ANTLR start "rule__Order__Group__23__Impl"
    // InternalMyRds.g:2320:1: rule__Order__Group__23__Impl : ( ':' ) ;
    public final void rule__Order__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2324:1: ( ( ':' ) )
            // InternalMyRds.g:2325:1: ( ':' )
            {
            // InternalMyRds.g:2325:1: ( ':' )
            // InternalMyRds.g:2326:2: ':'
            {
             before(grammarAccess.getOrderAccess().getColonKeyword_23()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getColonKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__23__Impl"


    // $ANTLR start "rule__Order__Group__24"
    // InternalMyRds.g:2335:1: rule__Order__Group__24 : rule__Order__Group__24__Impl rule__Order__Group__25 ;
    public final void rule__Order__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2339:1: ( rule__Order__Group__24__Impl rule__Order__Group__25 )
            // InternalMyRds.g:2340:2: rule__Order__Group__24__Impl rule__Order__Group__25
            {
            pushFollow(FOLLOW_26);
            rule__Order__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__25();

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
    // $ANTLR end "rule__Order__Group__24"


    // $ANTLR start "rule__Order__Group__24__Impl"
    // InternalMyRds.g:2347:1: rule__Order__Group__24__Impl : ( ( rule__Order__ReviewAssignment_24 ) ) ;
    public final void rule__Order__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2351:1: ( ( ( rule__Order__ReviewAssignment_24 ) ) )
            // InternalMyRds.g:2352:1: ( ( rule__Order__ReviewAssignment_24 ) )
            {
            // InternalMyRds.g:2352:1: ( ( rule__Order__ReviewAssignment_24 ) )
            // InternalMyRds.g:2353:2: ( rule__Order__ReviewAssignment_24 )
            {
             before(grammarAccess.getOrderAccess().getReviewAssignment_24()); 
            // InternalMyRds.g:2354:2: ( rule__Order__ReviewAssignment_24 )
            // InternalMyRds.g:2354:3: rule__Order__ReviewAssignment_24
            {
            pushFollow(FOLLOW_2);
            rule__Order__ReviewAssignment_24();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getReviewAssignment_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__24__Impl"


    // $ANTLR start "rule__Order__Group__25"
    // InternalMyRds.g:2362:1: rule__Order__Group__25 : rule__Order__Group__25__Impl rule__Order__Group__26 ;
    public final void rule__Order__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2366:1: ( rule__Order__Group__25__Impl rule__Order__Group__26 )
            // InternalMyRds.g:2367:2: rule__Order__Group__25__Impl rule__Order__Group__26
            {
            pushFollow(FOLLOW_7);
            rule__Order__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__26();

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
    // $ANTLR end "rule__Order__Group__25"


    // $ANTLR start "rule__Order__Group__25__Impl"
    // InternalMyRds.g:2374:1: rule__Order__Group__25__Impl : ( 'customer' ) ;
    public final void rule__Order__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2378:1: ( ( 'customer' ) )
            // InternalMyRds.g:2379:1: ( 'customer' )
            {
            // InternalMyRds.g:2379:1: ( 'customer' )
            // InternalMyRds.g:2380:2: 'customer'
            {
             before(grammarAccess.getOrderAccess().getCustomerKeyword_25()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getCustomerKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__25__Impl"


    // $ANTLR start "rule__Order__Group__26"
    // InternalMyRds.g:2389:1: rule__Order__Group__26 : rule__Order__Group__26__Impl rule__Order__Group__27 ;
    public final void rule__Order__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2393:1: ( rule__Order__Group__26__Impl rule__Order__Group__27 )
            // InternalMyRds.g:2394:2: rule__Order__Group__26__Impl rule__Order__Group__27
            {
            pushFollow(FOLLOW_4);
            rule__Order__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__27();

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
    // $ANTLR end "rule__Order__Group__26"


    // $ANTLR start "rule__Order__Group__26__Impl"
    // InternalMyRds.g:2401:1: rule__Order__Group__26__Impl : ( ':' ) ;
    public final void rule__Order__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2405:1: ( ( ':' ) )
            // InternalMyRds.g:2406:1: ( ':' )
            {
            // InternalMyRds.g:2406:1: ( ':' )
            // InternalMyRds.g:2407:2: ':'
            {
             before(grammarAccess.getOrderAccess().getColonKeyword_26()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getColonKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__26__Impl"


    // $ANTLR start "rule__Order__Group__27"
    // InternalMyRds.g:2416:1: rule__Order__Group__27 : rule__Order__Group__27__Impl rule__Order__Group__28 ;
    public final void rule__Order__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2420:1: ( rule__Order__Group__27__Impl rule__Order__Group__28 )
            // InternalMyRds.g:2421:2: rule__Order__Group__27__Impl rule__Order__Group__28
            {
            pushFollow(FOLLOW_27);
            rule__Order__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__28();

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
    // $ANTLR end "rule__Order__Group__27"


    // $ANTLR start "rule__Order__Group__27__Impl"
    // InternalMyRds.g:2428:1: rule__Order__Group__27__Impl : ( ( rule__Order__CustomerAssignment_27 ) ) ;
    public final void rule__Order__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2432:1: ( ( ( rule__Order__CustomerAssignment_27 ) ) )
            // InternalMyRds.g:2433:1: ( ( rule__Order__CustomerAssignment_27 ) )
            {
            // InternalMyRds.g:2433:1: ( ( rule__Order__CustomerAssignment_27 ) )
            // InternalMyRds.g:2434:2: ( rule__Order__CustomerAssignment_27 )
            {
             before(grammarAccess.getOrderAccess().getCustomerAssignment_27()); 
            // InternalMyRds.g:2435:2: ( rule__Order__CustomerAssignment_27 )
            // InternalMyRds.g:2435:3: rule__Order__CustomerAssignment_27
            {
            pushFollow(FOLLOW_2);
            rule__Order__CustomerAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getCustomerAssignment_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__27__Impl"


    // $ANTLR start "rule__Order__Group__28"
    // InternalMyRds.g:2443:1: rule__Order__Group__28 : rule__Order__Group__28__Impl rule__Order__Group__29 ;
    public final void rule__Order__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2447:1: ( rule__Order__Group__28__Impl rule__Order__Group__29 )
            // InternalMyRds.g:2448:2: rule__Order__Group__28__Impl rule__Order__Group__29
            {
            pushFollow(FOLLOW_7);
            rule__Order__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__29();

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
    // $ANTLR end "rule__Order__Group__28"


    // $ANTLR start "rule__Order__Group__28__Impl"
    // InternalMyRds.g:2455:1: rule__Order__Group__28__Impl : ( 'deliveryDriver' ) ;
    public final void rule__Order__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2459:1: ( ( 'deliveryDriver' ) )
            // InternalMyRds.g:2460:1: ( 'deliveryDriver' )
            {
            // InternalMyRds.g:2460:1: ( 'deliveryDriver' )
            // InternalMyRds.g:2461:2: 'deliveryDriver'
            {
             before(grammarAccess.getOrderAccess().getDeliveryDriverKeyword_28()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getDeliveryDriverKeyword_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__28__Impl"


    // $ANTLR start "rule__Order__Group__29"
    // InternalMyRds.g:2470:1: rule__Order__Group__29 : rule__Order__Group__29__Impl rule__Order__Group__30 ;
    public final void rule__Order__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2474:1: ( rule__Order__Group__29__Impl rule__Order__Group__30 )
            // InternalMyRds.g:2475:2: rule__Order__Group__29__Impl rule__Order__Group__30
            {
            pushFollow(FOLLOW_4);
            rule__Order__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__30();

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
    // $ANTLR end "rule__Order__Group__29"


    // $ANTLR start "rule__Order__Group__29__Impl"
    // InternalMyRds.g:2482:1: rule__Order__Group__29__Impl : ( ':' ) ;
    public final void rule__Order__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2486:1: ( ( ':' ) )
            // InternalMyRds.g:2487:1: ( ':' )
            {
            // InternalMyRds.g:2487:1: ( ':' )
            // InternalMyRds.g:2488:2: ':'
            {
             before(grammarAccess.getOrderAccess().getColonKeyword_29()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getColonKeyword_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__29__Impl"


    // $ANTLR start "rule__Order__Group__30"
    // InternalMyRds.g:2497:1: rule__Order__Group__30 : rule__Order__Group__30__Impl rule__Order__Group__31 ;
    public final void rule__Order__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2501:1: ( rule__Order__Group__30__Impl rule__Order__Group__31 )
            // InternalMyRds.g:2502:2: rule__Order__Group__30__Impl rule__Order__Group__31
            {
            pushFollow(FOLLOW_28);
            rule__Order__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__31();

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
    // $ANTLR end "rule__Order__Group__30"


    // $ANTLR start "rule__Order__Group__30__Impl"
    // InternalMyRds.g:2509:1: rule__Order__Group__30__Impl : ( ( rule__Order__DeliveryDriverAssignment_30 ) ) ;
    public final void rule__Order__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2513:1: ( ( ( rule__Order__DeliveryDriverAssignment_30 ) ) )
            // InternalMyRds.g:2514:1: ( ( rule__Order__DeliveryDriverAssignment_30 ) )
            {
            // InternalMyRds.g:2514:1: ( ( rule__Order__DeliveryDriverAssignment_30 ) )
            // InternalMyRds.g:2515:2: ( rule__Order__DeliveryDriverAssignment_30 )
            {
             before(grammarAccess.getOrderAccess().getDeliveryDriverAssignment_30()); 
            // InternalMyRds.g:2516:2: ( rule__Order__DeliveryDriverAssignment_30 )
            // InternalMyRds.g:2516:3: rule__Order__DeliveryDriverAssignment_30
            {
            pushFollow(FOLLOW_2);
            rule__Order__DeliveryDriverAssignment_30();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getDeliveryDriverAssignment_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__30__Impl"


    // $ANTLR start "rule__Order__Group__31"
    // InternalMyRds.g:2524:1: rule__Order__Group__31 : rule__Order__Group__31__Impl ;
    public final void rule__Order__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2528:1: ( rule__Order__Group__31__Impl )
            // InternalMyRds.g:2529:2: rule__Order__Group__31__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group__31__Impl();

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
    // $ANTLR end "rule__Order__Group__31"


    // $ANTLR start "rule__Order__Group__31__Impl"
    // InternalMyRds.g:2535:1: rule__Order__Group__31__Impl : ( '}' ) ;
    public final void rule__Order__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2539:1: ( ( '}' ) )
            // InternalMyRds.g:2540:1: ( '}' )
            {
            // InternalMyRds.g:2540:1: ( '}' )
            // InternalMyRds.g:2541:2: '}'
            {
             before(grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_31()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__31__Impl"


    // $ANTLR start "rule__Restaurant__Group__0"
    // InternalMyRds.g:2551:1: rule__Restaurant__Group__0 : rule__Restaurant__Group__0__Impl rule__Restaurant__Group__1 ;
    public final void rule__Restaurant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2555:1: ( rule__Restaurant__Group__0__Impl rule__Restaurant__Group__1 )
            // InternalMyRds.g:2556:2: rule__Restaurant__Group__0__Impl rule__Restaurant__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Restaurant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__1();

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
    // $ANTLR end "rule__Restaurant__Group__0"


    // $ANTLR start "rule__Restaurant__Group__0__Impl"
    // InternalMyRds.g:2563:1: rule__Restaurant__Group__0__Impl : ( 'Restaurant' ) ;
    public final void rule__Restaurant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2567:1: ( ( 'Restaurant' ) )
            // InternalMyRds.g:2568:1: ( 'Restaurant' )
            {
            // InternalMyRds.g:2568:1: ( 'Restaurant' )
            // InternalMyRds.g:2569:2: 'Restaurant'
            {
             before(grammarAccess.getRestaurantAccess().getRestaurantKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getRestaurantKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__0__Impl"


    // $ANTLR start "rule__Restaurant__Group__1"
    // InternalMyRds.g:2578:1: rule__Restaurant__Group__1 : rule__Restaurant__Group__1__Impl rule__Restaurant__Group__2 ;
    public final void rule__Restaurant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2582:1: ( rule__Restaurant__Group__1__Impl rule__Restaurant__Group__2 )
            // InternalMyRds.g:2583:2: rule__Restaurant__Group__1__Impl rule__Restaurant__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Restaurant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__2();

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
    // $ANTLR end "rule__Restaurant__Group__1"


    // $ANTLR start "rule__Restaurant__Group__1__Impl"
    // InternalMyRds.g:2590:1: rule__Restaurant__Group__1__Impl : ( ( rule__Restaurant__IdAssignment_1 ) ) ;
    public final void rule__Restaurant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2594:1: ( ( ( rule__Restaurant__IdAssignment_1 ) ) )
            // InternalMyRds.g:2595:1: ( ( rule__Restaurant__IdAssignment_1 ) )
            {
            // InternalMyRds.g:2595:1: ( ( rule__Restaurant__IdAssignment_1 ) )
            // InternalMyRds.g:2596:2: ( rule__Restaurant__IdAssignment_1 )
            {
             before(grammarAccess.getRestaurantAccess().getIdAssignment_1()); 
            // InternalMyRds.g:2597:2: ( rule__Restaurant__IdAssignment_1 )
            // InternalMyRds.g:2597:3: rule__Restaurant__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Restaurant__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRestaurantAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__1__Impl"


    // $ANTLR start "rule__Restaurant__Group__2"
    // InternalMyRds.g:2605:1: rule__Restaurant__Group__2 : rule__Restaurant__Group__2__Impl rule__Restaurant__Group__3 ;
    public final void rule__Restaurant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2609:1: ( rule__Restaurant__Group__2__Impl rule__Restaurant__Group__3 )
            // InternalMyRds.g:2610:2: rule__Restaurant__Group__2__Impl rule__Restaurant__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Restaurant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__3();

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
    // $ANTLR end "rule__Restaurant__Group__2"


    // $ANTLR start "rule__Restaurant__Group__2__Impl"
    // InternalMyRds.g:2617:1: rule__Restaurant__Group__2__Impl : ( '{' ) ;
    public final void rule__Restaurant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2621:1: ( ( '{' ) )
            // InternalMyRds.g:2622:1: ( '{' )
            {
            // InternalMyRds.g:2622:1: ( '{' )
            // InternalMyRds.g:2623:2: '{'
            {
             before(grammarAccess.getRestaurantAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__2__Impl"


    // $ANTLR start "rule__Restaurant__Group__3"
    // InternalMyRds.g:2632:1: rule__Restaurant__Group__3 : rule__Restaurant__Group__3__Impl rule__Restaurant__Group__4 ;
    public final void rule__Restaurant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2636:1: ( rule__Restaurant__Group__3__Impl rule__Restaurant__Group__4 )
            // InternalMyRds.g:2637:2: rule__Restaurant__Group__3__Impl rule__Restaurant__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Restaurant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__4();

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
    // $ANTLR end "rule__Restaurant__Group__3"


    // $ANTLR start "rule__Restaurant__Group__3__Impl"
    // InternalMyRds.g:2644:1: rule__Restaurant__Group__3__Impl : ( 'name' ) ;
    public final void rule__Restaurant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2648:1: ( ( 'name' ) )
            // InternalMyRds.g:2649:1: ( 'name' )
            {
            // InternalMyRds.g:2649:1: ( 'name' )
            // InternalMyRds.g:2650:2: 'name'
            {
             before(grammarAccess.getRestaurantAccess().getNameKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__3__Impl"


    // $ANTLR start "rule__Restaurant__Group__4"
    // InternalMyRds.g:2659:1: rule__Restaurant__Group__4 : rule__Restaurant__Group__4__Impl rule__Restaurant__Group__5 ;
    public final void rule__Restaurant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2663:1: ( rule__Restaurant__Group__4__Impl rule__Restaurant__Group__5 )
            // InternalMyRds.g:2664:2: rule__Restaurant__Group__4__Impl rule__Restaurant__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Restaurant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__5();

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
    // $ANTLR end "rule__Restaurant__Group__4"


    // $ANTLR start "rule__Restaurant__Group__4__Impl"
    // InternalMyRds.g:2671:1: rule__Restaurant__Group__4__Impl : ( ':' ) ;
    public final void rule__Restaurant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2675:1: ( ( ':' ) )
            // InternalMyRds.g:2676:1: ( ':' )
            {
            // InternalMyRds.g:2676:1: ( ':' )
            // InternalMyRds.g:2677:2: ':'
            {
             before(grammarAccess.getRestaurantAccess().getColonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__4__Impl"


    // $ANTLR start "rule__Restaurant__Group__5"
    // InternalMyRds.g:2686:1: rule__Restaurant__Group__5 : rule__Restaurant__Group__5__Impl rule__Restaurant__Group__6 ;
    public final void rule__Restaurant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2690:1: ( rule__Restaurant__Group__5__Impl rule__Restaurant__Group__6 )
            // InternalMyRds.g:2691:2: rule__Restaurant__Group__5__Impl rule__Restaurant__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Restaurant__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__6();

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
    // $ANTLR end "rule__Restaurant__Group__5"


    // $ANTLR start "rule__Restaurant__Group__5__Impl"
    // InternalMyRds.g:2698:1: rule__Restaurant__Group__5__Impl : ( ( rule__Restaurant__NameAssignment_5 ) ) ;
    public final void rule__Restaurant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2702:1: ( ( ( rule__Restaurant__NameAssignment_5 ) ) )
            // InternalMyRds.g:2703:1: ( ( rule__Restaurant__NameAssignment_5 ) )
            {
            // InternalMyRds.g:2703:1: ( ( rule__Restaurant__NameAssignment_5 ) )
            // InternalMyRds.g:2704:2: ( rule__Restaurant__NameAssignment_5 )
            {
             before(grammarAccess.getRestaurantAccess().getNameAssignment_5()); 
            // InternalMyRds.g:2705:2: ( rule__Restaurant__NameAssignment_5 )
            // InternalMyRds.g:2705:3: rule__Restaurant__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Restaurant__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRestaurantAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__5__Impl"


    // $ANTLR start "rule__Restaurant__Group__6"
    // InternalMyRds.g:2713:1: rule__Restaurant__Group__6 : rule__Restaurant__Group__6__Impl rule__Restaurant__Group__7 ;
    public final void rule__Restaurant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2717:1: ( rule__Restaurant__Group__6__Impl rule__Restaurant__Group__7 )
            // InternalMyRds.g:2718:2: rule__Restaurant__Group__6__Impl rule__Restaurant__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Restaurant__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__7();

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
    // $ANTLR end "rule__Restaurant__Group__6"


    // $ANTLR start "rule__Restaurant__Group__6__Impl"
    // InternalMyRds.g:2725:1: rule__Restaurant__Group__6__Impl : ( 'address' ) ;
    public final void rule__Restaurant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2729:1: ( ( 'address' ) )
            // InternalMyRds.g:2730:1: ( 'address' )
            {
            // InternalMyRds.g:2730:1: ( 'address' )
            // InternalMyRds.g:2731:2: 'address'
            {
             before(grammarAccess.getRestaurantAccess().getAddressKeyword_6()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getAddressKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__6__Impl"


    // $ANTLR start "rule__Restaurant__Group__7"
    // InternalMyRds.g:2740:1: rule__Restaurant__Group__7 : rule__Restaurant__Group__7__Impl rule__Restaurant__Group__8 ;
    public final void rule__Restaurant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2744:1: ( rule__Restaurant__Group__7__Impl rule__Restaurant__Group__8 )
            // InternalMyRds.g:2745:2: rule__Restaurant__Group__7__Impl rule__Restaurant__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Restaurant__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__8();

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
    // $ANTLR end "rule__Restaurant__Group__7"


    // $ANTLR start "rule__Restaurant__Group__7__Impl"
    // InternalMyRds.g:2752:1: rule__Restaurant__Group__7__Impl : ( ':' ) ;
    public final void rule__Restaurant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2756:1: ( ( ':' ) )
            // InternalMyRds.g:2757:1: ( ':' )
            {
            // InternalMyRds.g:2757:1: ( ':' )
            // InternalMyRds.g:2758:2: ':'
            {
             before(grammarAccess.getRestaurantAccess().getColonKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__7__Impl"


    // $ANTLR start "rule__Restaurant__Group__8"
    // InternalMyRds.g:2767:1: rule__Restaurant__Group__8 : rule__Restaurant__Group__8__Impl rule__Restaurant__Group__9 ;
    public final void rule__Restaurant__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2771:1: ( rule__Restaurant__Group__8__Impl rule__Restaurant__Group__9 )
            // InternalMyRds.g:2772:2: rule__Restaurant__Group__8__Impl rule__Restaurant__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__Restaurant__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__9();

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
    // $ANTLR end "rule__Restaurant__Group__8"


    // $ANTLR start "rule__Restaurant__Group__8__Impl"
    // InternalMyRds.g:2779:1: rule__Restaurant__Group__8__Impl : ( ( rule__Restaurant__AddressAssignment_8 ) ) ;
    public final void rule__Restaurant__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2783:1: ( ( ( rule__Restaurant__AddressAssignment_8 ) ) )
            // InternalMyRds.g:2784:1: ( ( rule__Restaurant__AddressAssignment_8 ) )
            {
            // InternalMyRds.g:2784:1: ( ( rule__Restaurant__AddressAssignment_8 ) )
            // InternalMyRds.g:2785:2: ( rule__Restaurant__AddressAssignment_8 )
            {
             before(grammarAccess.getRestaurantAccess().getAddressAssignment_8()); 
            // InternalMyRds.g:2786:2: ( rule__Restaurant__AddressAssignment_8 )
            // InternalMyRds.g:2786:3: rule__Restaurant__AddressAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Restaurant__AddressAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRestaurantAccess().getAddressAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__8__Impl"


    // $ANTLR start "rule__Restaurant__Group__9"
    // InternalMyRds.g:2794:1: rule__Restaurant__Group__9 : rule__Restaurant__Group__9__Impl rule__Restaurant__Group__10 ;
    public final void rule__Restaurant__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2798:1: ( rule__Restaurant__Group__9__Impl rule__Restaurant__Group__10 )
            // InternalMyRds.g:2799:2: rule__Restaurant__Group__9__Impl rule__Restaurant__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Restaurant__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__10();

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
    // $ANTLR end "rule__Restaurant__Group__9"


    // $ANTLR start "rule__Restaurant__Group__9__Impl"
    // InternalMyRds.g:2806:1: rule__Restaurant__Group__9__Impl : ( 'menu' ) ;
    public final void rule__Restaurant__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2810:1: ( ( 'menu' ) )
            // InternalMyRds.g:2811:1: ( 'menu' )
            {
            // InternalMyRds.g:2811:1: ( 'menu' )
            // InternalMyRds.g:2812:2: 'menu'
            {
             before(grammarAccess.getRestaurantAccess().getMenuKeyword_9()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getMenuKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__9__Impl"


    // $ANTLR start "rule__Restaurant__Group__10"
    // InternalMyRds.g:2821:1: rule__Restaurant__Group__10 : rule__Restaurant__Group__10__Impl rule__Restaurant__Group__11 ;
    public final void rule__Restaurant__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2825:1: ( rule__Restaurant__Group__10__Impl rule__Restaurant__Group__11 )
            // InternalMyRds.g:2826:2: rule__Restaurant__Group__10__Impl rule__Restaurant__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Restaurant__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__11();

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
    // $ANTLR end "rule__Restaurant__Group__10"


    // $ANTLR start "rule__Restaurant__Group__10__Impl"
    // InternalMyRds.g:2833:1: rule__Restaurant__Group__10__Impl : ( ':' ) ;
    public final void rule__Restaurant__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2837:1: ( ( ':' ) )
            // InternalMyRds.g:2838:1: ( ':' )
            {
            // InternalMyRds.g:2838:1: ( ':' )
            // InternalMyRds.g:2839:2: ':'
            {
             before(grammarAccess.getRestaurantAccess().getColonKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__10__Impl"


    // $ANTLR start "rule__Restaurant__Group__11"
    // InternalMyRds.g:2848:1: rule__Restaurant__Group__11 : rule__Restaurant__Group__11__Impl rule__Restaurant__Group__12 ;
    public final void rule__Restaurant__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2852:1: ( rule__Restaurant__Group__11__Impl rule__Restaurant__Group__12 )
            // InternalMyRds.g:2853:2: rule__Restaurant__Group__11__Impl rule__Restaurant__Group__12
            {
            pushFollow(FOLLOW_28);
            rule__Restaurant__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__12();

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
    // $ANTLR end "rule__Restaurant__Group__11"


    // $ANTLR start "rule__Restaurant__Group__11__Impl"
    // InternalMyRds.g:2860:1: rule__Restaurant__Group__11__Impl : ( ( rule__Restaurant__MenuAssignment_11 ) ) ;
    public final void rule__Restaurant__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2864:1: ( ( ( rule__Restaurant__MenuAssignment_11 ) ) )
            // InternalMyRds.g:2865:1: ( ( rule__Restaurant__MenuAssignment_11 ) )
            {
            // InternalMyRds.g:2865:1: ( ( rule__Restaurant__MenuAssignment_11 ) )
            // InternalMyRds.g:2866:2: ( rule__Restaurant__MenuAssignment_11 )
            {
             before(grammarAccess.getRestaurantAccess().getMenuAssignment_11()); 
            // InternalMyRds.g:2867:2: ( rule__Restaurant__MenuAssignment_11 )
            // InternalMyRds.g:2867:3: rule__Restaurant__MenuAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Restaurant__MenuAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRestaurantAccess().getMenuAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__11__Impl"


    // $ANTLR start "rule__Restaurant__Group__12"
    // InternalMyRds.g:2875:1: rule__Restaurant__Group__12 : rule__Restaurant__Group__12__Impl ;
    public final void rule__Restaurant__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2879:1: ( rule__Restaurant__Group__12__Impl )
            // InternalMyRds.g:2880:2: rule__Restaurant__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__12__Impl();

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
    // $ANTLR end "rule__Restaurant__Group__12"


    // $ANTLR start "rule__Restaurant__Group__12__Impl"
    // InternalMyRds.g:2886:1: rule__Restaurant__Group__12__Impl : ( '}' ) ;
    public final void rule__Restaurant__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2890:1: ( ( '}' ) )
            // InternalMyRds.g:2891:1: ( '}' )
            {
            // InternalMyRds.g:2891:1: ( '}' )
            // InternalMyRds.g:2892:2: '}'
            {
             before(grammarAccess.getRestaurantAccess().getRightCurlyBracketKeyword_12()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__12__Impl"


    // $ANTLR start "rule__Menu__Group__0"
    // InternalMyRds.g:2902:1: rule__Menu__Group__0 : rule__Menu__Group__0__Impl rule__Menu__Group__1 ;
    public final void rule__Menu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2906:1: ( rule__Menu__Group__0__Impl rule__Menu__Group__1 )
            // InternalMyRds.g:2907:2: rule__Menu__Group__0__Impl rule__Menu__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Menu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__1();

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
    // $ANTLR end "rule__Menu__Group__0"


    // $ANTLR start "rule__Menu__Group__0__Impl"
    // InternalMyRds.g:2914:1: rule__Menu__Group__0__Impl : ( 'Menu' ) ;
    public final void rule__Menu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2918:1: ( ( 'Menu' ) )
            // InternalMyRds.g:2919:1: ( 'Menu' )
            {
            // InternalMyRds.g:2919:1: ( 'Menu' )
            // InternalMyRds.g:2920:2: 'Menu'
            {
             before(grammarAccess.getMenuAccess().getMenuKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getMenuKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__0__Impl"


    // $ANTLR start "rule__Menu__Group__1"
    // InternalMyRds.g:2929:1: rule__Menu__Group__1 : rule__Menu__Group__1__Impl rule__Menu__Group__2 ;
    public final void rule__Menu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2933:1: ( rule__Menu__Group__1__Impl rule__Menu__Group__2 )
            // InternalMyRds.g:2934:2: rule__Menu__Group__1__Impl rule__Menu__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Menu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__2();

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
    // $ANTLR end "rule__Menu__Group__1"


    // $ANTLR start "rule__Menu__Group__1__Impl"
    // InternalMyRds.g:2941:1: rule__Menu__Group__1__Impl : ( ( rule__Menu__IdAssignment_1 ) ) ;
    public final void rule__Menu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2945:1: ( ( ( rule__Menu__IdAssignment_1 ) ) )
            // InternalMyRds.g:2946:1: ( ( rule__Menu__IdAssignment_1 ) )
            {
            // InternalMyRds.g:2946:1: ( ( rule__Menu__IdAssignment_1 ) )
            // InternalMyRds.g:2947:2: ( rule__Menu__IdAssignment_1 )
            {
             before(grammarAccess.getMenuAccess().getIdAssignment_1()); 
            // InternalMyRds.g:2948:2: ( rule__Menu__IdAssignment_1 )
            // InternalMyRds.g:2948:3: rule__Menu__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Menu__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__1__Impl"


    // $ANTLR start "rule__Menu__Group__2"
    // InternalMyRds.g:2956:1: rule__Menu__Group__2 : rule__Menu__Group__2__Impl rule__Menu__Group__3 ;
    public final void rule__Menu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2960:1: ( rule__Menu__Group__2__Impl rule__Menu__Group__3 )
            // InternalMyRds.g:2961:2: rule__Menu__Group__2__Impl rule__Menu__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Menu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__3();

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
    // $ANTLR end "rule__Menu__Group__2"


    // $ANTLR start "rule__Menu__Group__2__Impl"
    // InternalMyRds.g:2968:1: rule__Menu__Group__2__Impl : ( '{' ) ;
    public final void rule__Menu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2972:1: ( ( '{' ) )
            // InternalMyRds.g:2973:1: ( '{' )
            {
            // InternalMyRds.g:2973:1: ( '{' )
            // InternalMyRds.g:2974:2: '{'
            {
             before(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__2__Impl"


    // $ANTLR start "rule__Menu__Group__3"
    // InternalMyRds.g:2983:1: rule__Menu__Group__3 : rule__Menu__Group__3__Impl rule__Menu__Group__4 ;
    public final void rule__Menu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2987:1: ( rule__Menu__Group__3__Impl rule__Menu__Group__4 )
            // InternalMyRds.g:2988:2: rule__Menu__Group__3__Impl rule__Menu__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Menu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__4();

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
    // $ANTLR end "rule__Menu__Group__3"


    // $ANTLR start "rule__Menu__Group__3__Impl"
    // InternalMyRds.g:2995:1: rule__Menu__Group__3__Impl : ( 'restaurant' ) ;
    public final void rule__Menu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:2999:1: ( ( 'restaurant' ) )
            // InternalMyRds.g:3000:1: ( 'restaurant' )
            {
            // InternalMyRds.g:3000:1: ( 'restaurant' )
            // InternalMyRds.g:3001:2: 'restaurant'
            {
             before(grammarAccess.getMenuAccess().getRestaurantKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getRestaurantKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__3__Impl"


    // $ANTLR start "rule__Menu__Group__4"
    // InternalMyRds.g:3010:1: rule__Menu__Group__4 : rule__Menu__Group__4__Impl rule__Menu__Group__5 ;
    public final void rule__Menu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3014:1: ( rule__Menu__Group__4__Impl rule__Menu__Group__5 )
            // InternalMyRds.g:3015:2: rule__Menu__Group__4__Impl rule__Menu__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Menu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__5();

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
    // $ANTLR end "rule__Menu__Group__4"


    // $ANTLR start "rule__Menu__Group__4__Impl"
    // InternalMyRds.g:3022:1: rule__Menu__Group__4__Impl : ( ':' ) ;
    public final void rule__Menu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3026:1: ( ( ':' ) )
            // InternalMyRds.g:3027:1: ( ':' )
            {
            // InternalMyRds.g:3027:1: ( ':' )
            // InternalMyRds.g:3028:2: ':'
            {
             before(grammarAccess.getMenuAccess().getColonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__4__Impl"


    // $ANTLR start "rule__Menu__Group__5"
    // InternalMyRds.g:3037:1: rule__Menu__Group__5 : rule__Menu__Group__5__Impl rule__Menu__Group__6 ;
    public final void rule__Menu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3041:1: ( rule__Menu__Group__5__Impl rule__Menu__Group__6 )
            // InternalMyRds.g:3042:2: rule__Menu__Group__5__Impl rule__Menu__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Menu__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__6();

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
    // $ANTLR end "rule__Menu__Group__5"


    // $ANTLR start "rule__Menu__Group__5__Impl"
    // InternalMyRds.g:3049:1: rule__Menu__Group__5__Impl : ( ( rule__Menu__RestaurantAssignment_5 ) ) ;
    public final void rule__Menu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3053:1: ( ( ( rule__Menu__RestaurantAssignment_5 ) ) )
            // InternalMyRds.g:3054:1: ( ( rule__Menu__RestaurantAssignment_5 ) )
            {
            // InternalMyRds.g:3054:1: ( ( rule__Menu__RestaurantAssignment_5 ) )
            // InternalMyRds.g:3055:2: ( rule__Menu__RestaurantAssignment_5 )
            {
             before(grammarAccess.getMenuAccess().getRestaurantAssignment_5()); 
            // InternalMyRds.g:3056:2: ( rule__Menu__RestaurantAssignment_5 )
            // InternalMyRds.g:3056:3: rule__Menu__RestaurantAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Menu__RestaurantAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getRestaurantAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__5__Impl"


    // $ANTLR start "rule__Menu__Group__6"
    // InternalMyRds.g:3064:1: rule__Menu__Group__6 : rule__Menu__Group__6__Impl rule__Menu__Group__7 ;
    public final void rule__Menu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3068:1: ( rule__Menu__Group__6__Impl rule__Menu__Group__7 )
            // InternalMyRds.g:3069:2: rule__Menu__Group__6__Impl rule__Menu__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Menu__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__7();

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
    // $ANTLR end "rule__Menu__Group__6"


    // $ANTLR start "rule__Menu__Group__6__Impl"
    // InternalMyRds.g:3076:1: rule__Menu__Group__6__Impl : ( ( rule__Menu__MenuItemsAssignment_6 )* ) ;
    public final void rule__Menu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3080:1: ( ( ( rule__Menu__MenuItemsAssignment_6 )* ) )
            // InternalMyRds.g:3081:1: ( ( rule__Menu__MenuItemsAssignment_6 )* )
            {
            // InternalMyRds.g:3081:1: ( ( rule__Menu__MenuItemsAssignment_6 )* )
            // InternalMyRds.g:3082:2: ( rule__Menu__MenuItemsAssignment_6 )*
            {
             before(grammarAccess.getMenuAccess().getMenuItemsAssignment_6()); 
            // InternalMyRds.g:3083:2: ( rule__Menu__MenuItemsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyRds.g:3083:3: rule__Menu__MenuItemsAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Menu__MenuItemsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMenuAccess().getMenuItemsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__6__Impl"


    // $ANTLR start "rule__Menu__Group__7"
    // InternalMyRds.g:3091:1: rule__Menu__Group__7 : rule__Menu__Group__7__Impl ;
    public final void rule__Menu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3095:1: ( rule__Menu__Group__7__Impl )
            // InternalMyRds.g:3096:2: rule__Menu__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group__7__Impl();

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
    // $ANTLR end "rule__Menu__Group__7"


    // $ANTLR start "rule__Menu__Group__7__Impl"
    // InternalMyRds.g:3102:1: rule__Menu__Group__7__Impl : ( '}' ) ;
    public final void rule__Menu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3106:1: ( ( '}' ) )
            // InternalMyRds.g:3107:1: ( '}' )
            {
            // InternalMyRds.g:3107:1: ( '}' )
            // InternalMyRds.g:3108:2: '}'
            {
             before(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__7__Impl"


    // $ANTLR start "rule__MenuItem__Group__0"
    // InternalMyRds.g:3118:1: rule__MenuItem__Group__0 : rule__MenuItem__Group__0__Impl rule__MenuItem__Group__1 ;
    public final void rule__MenuItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3122:1: ( rule__MenuItem__Group__0__Impl rule__MenuItem__Group__1 )
            // InternalMyRds.g:3123:2: rule__MenuItem__Group__0__Impl rule__MenuItem__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MenuItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__1();

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
    // $ANTLR end "rule__MenuItem__Group__0"


    // $ANTLR start "rule__MenuItem__Group__0__Impl"
    // InternalMyRds.g:3130:1: rule__MenuItem__Group__0__Impl : ( 'MenuItem' ) ;
    public final void rule__MenuItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3134:1: ( ( 'MenuItem' ) )
            // InternalMyRds.g:3135:1: ( 'MenuItem' )
            {
            // InternalMyRds.g:3135:1: ( 'MenuItem' )
            // InternalMyRds.g:3136:2: 'MenuItem'
            {
             before(grammarAccess.getMenuItemAccess().getMenuItemKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getMenuItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__0__Impl"


    // $ANTLR start "rule__MenuItem__Group__1"
    // InternalMyRds.g:3145:1: rule__MenuItem__Group__1 : rule__MenuItem__Group__1__Impl rule__MenuItem__Group__2 ;
    public final void rule__MenuItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3149:1: ( rule__MenuItem__Group__1__Impl rule__MenuItem__Group__2 )
            // InternalMyRds.g:3150:2: rule__MenuItem__Group__1__Impl rule__MenuItem__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MenuItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__2();

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
    // $ANTLR end "rule__MenuItem__Group__1"


    // $ANTLR start "rule__MenuItem__Group__1__Impl"
    // InternalMyRds.g:3157:1: rule__MenuItem__Group__1__Impl : ( ( rule__MenuItem__IdAssignment_1 ) ) ;
    public final void rule__MenuItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3161:1: ( ( ( rule__MenuItem__IdAssignment_1 ) ) )
            // InternalMyRds.g:3162:1: ( ( rule__MenuItem__IdAssignment_1 ) )
            {
            // InternalMyRds.g:3162:1: ( ( rule__MenuItem__IdAssignment_1 ) )
            // InternalMyRds.g:3163:2: ( rule__MenuItem__IdAssignment_1 )
            {
             before(grammarAccess.getMenuItemAccess().getIdAssignment_1()); 
            // InternalMyRds.g:3164:2: ( rule__MenuItem__IdAssignment_1 )
            // InternalMyRds.g:3164:3: rule__MenuItem__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MenuItem__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMenuItemAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__1__Impl"


    // $ANTLR start "rule__MenuItem__Group__2"
    // InternalMyRds.g:3172:1: rule__MenuItem__Group__2 : rule__MenuItem__Group__2__Impl rule__MenuItem__Group__3 ;
    public final void rule__MenuItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3176:1: ( rule__MenuItem__Group__2__Impl rule__MenuItem__Group__3 )
            // InternalMyRds.g:3177:2: rule__MenuItem__Group__2__Impl rule__MenuItem__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MenuItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__3();

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
    // $ANTLR end "rule__MenuItem__Group__2"


    // $ANTLR start "rule__MenuItem__Group__2__Impl"
    // InternalMyRds.g:3184:1: rule__MenuItem__Group__2__Impl : ( '{' ) ;
    public final void rule__MenuItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3188:1: ( ( '{' ) )
            // InternalMyRds.g:3189:1: ( '{' )
            {
            // InternalMyRds.g:3189:1: ( '{' )
            // InternalMyRds.g:3190:2: '{'
            {
             before(grammarAccess.getMenuItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__2__Impl"


    // $ANTLR start "rule__MenuItem__Group__3"
    // InternalMyRds.g:3199:1: rule__MenuItem__Group__3 : rule__MenuItem__Group__3__Impl rule__MenuItem__Group__4 ;
    public final void rule__MenuItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3203:1: ( rule__MenuItem__Group__3__Impl rule__MenuItem__Group__4 )
            // InternalMyRds.g:3204:2: rule__MenuItem__Group__3__Impl rule__MenuItem__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MenuItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__4();

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
    // $ANTLR end "rule__MenuItem__Group__3"


    // $ANTLR start "rule__MenuItem__Group__3__Impl"
    // InternalMyRds.g:3211:1: rule__MenuItem__Group__3__Impl : ( 'name' ) ;
    public final void rule__MenuItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3215:1: ( ( 'name' ) )
            // InternalMyRds.g:3216:1: ( 'name' )
            {
            // InternalMyRds.g:3216:1: ( 'name' )
            // InternalMyRds.g:3217:2: 'name'
            {
             before(grammarAccess.getMenuItemAccess().getNameKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__3__Impl"


    // $ANTLR start "rule__MenuItem__Group__4"
    // InternalMyRds.g:3226:1: rule__MenuItem__Group__4 : rule__MenuItem__Group__4__Impl rule__MenuItem__Group__5 ;
    public final void rule__MenuItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3230:1: ( rule__MenuItem__Group__4__Impl rule__MenuItem__Group__5 )
            // InternalMyRds.g:3231:2: rule__MenuItem__Group__4__Impl rule__MenuItem__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__MenuItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__5();

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
    // $ANTLR end "rule__MenuItem__Group__4"


    // $ANTLR start "rule__MenuItem__Group__4__Impl"
    // InternalMyRds.g:3238:1: rule__MenuItem__Group__4__Impl : ( ':' ) ;
    public final void rule__MenuItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3242:1: ( ( ':' ) )
            // InternalMyRds.g:3243:1: ( ':' )
            {
            // InternalMyRds.g:3243:1: ( ':' )
            // InternalMyRds.g:3244:2: ':'
            {
             before(grammarAccess.getMenuItemAccess().getColonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__4__Impl"


    // $ANTLR start "rule__MenuItem__Group__5"
    // InternalMyRds.g:3253:1: rule__MenuItem__Group__5 : rule__MenuItem__Group__5__Impl rule__MenuItem__Group__6 ;
    public final void rule__MenuItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3257:1: ( rule__MenuItem__Group__5__Impl rule__MenuItem__Group__6 )
            // InternalMyRds.g:3258:2: rule__MenuItem__Group__5__Impl rule__MenuItem__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__MenuItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__6();

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
    // $ANTLR end "rule__MenuItem__Group__5"


    // $ANTLR start "rule__MenuItem__Group__5__Impl"
    // InternalMyRds.g:3265:1: rule__MenuItem__Group__5__Impl : ( ( rule__MenuItem__NameAssignment_5 ) ) ;
    public final void rule__MenuItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3269:1: ( ( ( rule__MenuItem__NameAssignment_5 ) ) )
            // InternalMyRds.g:3270:1: ( ( rule__MenuItem__NameAssignment_5 ) )
            {
            // InternalMyRds.g:3270:1: ( ( rule__MenuItem__NameAssignment_5 ) )
            // InternalMyRds.g:3271:2: ( rule__MenuItem__NameAssignment_5 )
            {
             before(grammarAccess.getMenuItemAccess().getNameAssignment_5()); 
            // InternalMyRds.g:3272:2: ( rule__MenuItem__NameAssignment_5 )
            // InternalMyRds.g:3272:3: rule__MenuItem__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MenuItem__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMenuItemAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__5__Impl"


    // $ANTLR start "rule__MenuItem__Group__6"
    // InternalMyRds.g:3280:1: rule__MenuItem__Group__6 : rule__MenuItem__Group__6__Impl rule__MenuItem__Group__7 ;
    public final void rule__MenuItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3284:1: ( rule__MenuItem__Group__6__Impl rule__MenuItem__Group__7 )
            // InternalMyRds.g:3285:2: rule__MenuItem__Group__6__Impl rule__MenuItem__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__MenuItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__7();

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
    // $ANTLR end "rule__MenuItem__Group__6"


    // $ANTLR start "rule__MenuItem__Group__6__Impl"
    // InternalMyRds.g:3292:1: rule__MenuItem__Group__6__Impl : ( 'price' ) ;
    public final void rule__MenuItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3296:1: ( ( 'price' ) )
            // InternalMyRds.g:3297:1: ( 'price' )
            {
            // InternalMyRds.g:3297:1: ( 'price' )
            // InternalMyRds.g:3298:2: 'price'
            {
             before(grammarAccess.getMenuItemAccess().getPriceKeyword_6()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getPriceKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__6__Impl"


    // $ANTLR start "rule__MenuItem__Group__7"
    // InternalMyRds.g:3307:1: rule__MenuItem__Group__7 : rule__MenuItem__Group__7__Impl rule__MenuItem__Group__8 ;
    public final void rule__MenuItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3311:1: ( rule__MenuItem__Group__7__Impl rule__MenuItem__Group__8 )
            // InternalMyRds.g:3312:2: rule__MenuItem__Group__7__Impl rule__MenuItem__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__MenuItem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__8();

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
    // $ANTLR end "rule__MenuItem__Group__7"


    // $ANTLR start "rule__MenuItem__Group__7__Impl"
    // InternalMyRds.g:3319:1: rule__MenuItem__Group__7__Impl : ( ':' ) ;
    public final void rule__MenuItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3323:1: ( ( ':' ) )
            // InternalMyRds.g:3324:1: ( ':' )
            {
            // InternalMyRds.g:3324:1: ( ':' )
            // InternalMyRds.g:3325:2: ':'
            {
             before(grammarAccess.getMenuItemAccess().getColonKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__7__Impl"


    // $ANTLR start "rule__MenuItem__Group__8"
    // InternalMyRds.g:3334:1: rule__MenuItem__Group__8 : rule__MenuItem__Group__8__Impl rule__MenuItem__Group__9 ;
    public final void rule__MenuItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3338:1: ( rule__MenuItem__Group__8__Impl rule__MenuItem__Group__9 )
            // InternalMyRds.g:3339:2: rule__MenuItem__Group__8__Impl rule__MenuItem__Group__9
            {
            pushFollow(FOLLOW_33);
            rule__MenuItem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__9();

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
    // $ANTLR end "rule__MenuItem__Group__8"


    // $ANTLR start "rule__MenuItem__Group__8__Impl"
    // InternalMyRds.g:3346:1: rule__MenuItem__Group__8__Impl : ( ( rule__MenuItem__PriceAssignment_8 ) ) ;
    public final void rule__MenuItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3350:1: ( ( ( rule__MenuItem__PriceAssignment_8 ) ) )
            // InternalMyRds.g:3351:1: ( ( rule__MenuItem__PriceAssignment_8 ) )
            {
            // InternalMyRds.g:3351:1: ( ( rule__MenuItem__PriceAssignment_8 ) )
            // InternalMyRds.g:3352:2: ( rule__MenuItem__PriceAssignment_8 )
            {
             before(grammarAccess.getMenuItemAccess().getPriceAssignment_8()); 
            // InternalMyRds.g:3353:2: ( rule__MenuItem__PriceAssignment_8 )
            // InternalMyRds.g:3353:3: rule__MenuItem__PriceAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__MenuItem__PriceAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMenuItemAccess().getPriceAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__8__Impl"


    // $ANTLR start "rule__MenuItem__Group__9"
    // InternalMyRds.g:3361:1: rule__MenuItem__Group__9 : rule__MenuItem__Group__9__Impl rule__MenuItem__Group__10 ;
    public final void rule__MenuItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3365:1: ( rule__MenuItem__Group__9__Impl rule__MenuItem__Group__10 )
            // InternalMyRds.g:3366:2: rule__MenuItem__Group__9__Impl rule__MenuItem__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__MenuItem__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__10();

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
    // $ANTLR end "rule__MenuItem__Group__9"


    // $ANTLR start "rule__MenuItem__Group__9__Impl"
    // InternalMyRds.g:3373:1: rule__MenuItem__Group__9__Impl : ( 'description' ) ;
    public final void rule__MenuItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3377:1: ( ( 'description' ) )
            // InternalMyRds.g:3378:1: ( 'description' )
            {
            // InternalMyRds.g:3378:1: ( 'description' )
            // InternalMyRds.g:3379:2: 'description'
            {
             before(grammarAccess.getMenuItemAccess().getDescriptionKeyword_9()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getDescriptionKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__9__Impl"


    // $ANTLR start "rule__MenuItem__Group__10"
    // InternalMyRds.g:3388:1: rule__MenuItem__Group__10 : rule__MenuItem__Group__10__Impl rule__MenuItem__Group__11 ;
    public final void rule__MenuItem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3392:1: ( rule__MenuItem__Group__10__Impl rule__MenuItem__Group__11 )
            // InternalMyRds.g:3393:2: rule__MenuItem__Group__10__Impl rule__MenuItem__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__MenuItem__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__11();

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
    // $ANTLR end "rule__MenuItem__Group__10"


    // $ANTLR start "rule__MenuItem__Group__10__Impl"
    // InternalMyRds.g:3400:1: rule__MenuItem__Group__10__Impl : ( ':' ) ;
    public final void rule__MenuItem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3404:1: ( ( ':' ) )
            // InternalMyRds.g:3405:1: ( ':' )
            {
            // InternalMyRds.g:3405:1: ( ':' )
            // InternalMyRds.g:3406:2: ':'
            {
             before(grammarAccess.getMenuItemAccess().getColonKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__10__Impl"


    // $ANTLR start "rule__MenuItem__Group__11"
    // InternalMyRds.g:3415:1: rule__MenuItem__Group__11 : rule__MenuItem__Group__11__Impl rule__MenuItem__Group__12 ;
    public final void rule__MenuItem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3419:1: ( rule__MenuItem__Group__11__Impl rule__MenuItem__Group__12 )
            // InternalMyRds.g:3420:2: rule__MenuItem__Group__11__Impl rule__MenuItem__Group__12
            {
            pushFollow(FOLLOW_34);
            rule__MenuItem__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__12();

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
    // $ANTLR end "rule__MenuItem__Group__11"


    // $ANTLR start "rule__MenuItem__Group__11__Impl"
    // InternalMyRds.g:3427:1: rule__MenuItem__Group__11__Impl : ( ( rule__MenuItem__DescriptionAssignment_11 ) ) ;
    public final void rule__MenuItem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3431:1: ( ( ( rule__MenuItem__DescriptionAssignment_11 ) ) )
            // InternalMyRds.g:3432:1: ( ( rule__MenuItem__DescriptionAssignment_11 ) )
            {
            // InternalMyRds.g:3432:1: ( ( rule__MenuItem__DescriptionAssignment_11 ) )
            // InternalMyRds.g:3433:2: ( rule__MenuItem__DescriptionAssignment_11 )
            {
             before(grammarAccess.getMenuItemAccess().getDescriptionAssignment_11()); 
            // InternalMyRds.g:3434:2: ( rule__MenuItem__DescriptionAssignment_11 )
            // InternalMyRds.g:3434:3: rule__MenuItem__DescriptionAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__MenuItem__DescriptionAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMenuItemAccess().getDescriptionAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__11__Impl"


    // $ANTLR start "rule__MenuItem__Group__12"
    // InternalMyRds.g:3442:1: rule__MenuItem__Group__12 : rule__MenuItem__Group__12__Impl rule__MenuItem__Group__13 ;
    public final void rule__MenuItem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3446:1: ( rule__MenuItem__Group__12__Impl rule__MenuItem__Group__13 )
            // InternalMyRds.g:3447:2: rule__MenuItem__Group__12__Impl rule__MenuItem__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__MenuItem__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__13();

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
    // $ANTLR end "rule__MenuItem__Group__12"


    // $ANTLR start "rule__MenuItem__Group__12__Impl"
    // InternalMyRds.g:3454:1: rule__MenuItem__Group__12__Impl : ( 'category' ) ;
    public final void rule__MenuItem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3458:1: ( ( 'category' ) )
            // InternalMyRds.g:3459:1: ( 'category' )
            {
            // InternalMyRds.g:3459:1: ( 'category' )
            // InternalMyRds.g:3460:2: 'category'
            {
             before(grammarAccess.getMenuItemAccess().getCategoryKeyword_12()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getCategoryKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__12__Impl"


    // $ANTLR start "rule__MenuItem__Group__13"
    // InternalMyRds.g:3469:1: rule__MenuItem__Group__13 : rule__MenuItem__Group__13__Impl rule__MenuItem__Group__14 ;
    public final void rule__MenuItem__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3473:1: ( rule__MenuItem__Group__13__Impl rule__MenuItem__Group__14 )
            // InternalMyRds.g:3474:2: rule__MenuItem__Group__13__Impl rule__MenuItem__Group__14
            {
            pushFollow(FOLLOW_35);
            rule__MenuItem__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__14();

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
    // $ANTLR end "rule__MenuItem__Group__13"


    // $ANTLR start "rule__MenuItem__Group__13__Impl"
    // InternalMyRds.g:3481:1: rule__MenuItem__Group__13__Impl : ( ':' ) ;
    public final void rule__MenuItem__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3485:1: ( ( ':' ) )
            // InternalMyRds.g:3486:1: ( ':' )
            {
            // InternalMyRds.g:3486:1: ( ':' )
            // InternalMyRds.g:3487:2: ':'
            {
             before(grammarAccess.getMenuItemAccess().getColonKeyword_13()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getColonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__13__Impl"


    // $ANTLR start "rule__MenuItem__Group__14"
    // InternalMyRds.g:3496:1: rule__MenuItem__Group__14 : rule__MenuItem__Group__14__Impl rule__MenuItem__Group__15 ;
    public final void rule__MenuItem__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3500:1: ( rule__MenuItem__Group__14__Impl rule__MenuItem__Group__15 )
            // InternalMyRds.g:3501:2: rule__MenuItem__Group__14__Impl rule__MenuItem__Group__15
            {
            pushFollow(FOLLOW_36);
            rule__MenuItem__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__15();

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
    // $ANTLR end "rule__MenuItem__Group__14"


    // $ANTLR start "rule__MenuItem__Group__14__Impl"
    // InternalMyRds.g:3508:1: rule__MenuItem__Group__14__Impl : ( ( rule__MenuItem__CategoryAssignment_14 ) ) ;
    public final void rule__MenuItem__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3512:1: ( ( ( rule__MenuItem__CategoryAssignment_14 ) ) )
            // InternalMyRds.g:3513:1: ( ( rule__MenuItem__CategoryAssignment_14 ) )
            {
            // InternalMyRds.g:3513:1: ( ( rule__MenuItem__CategoryAssignment_14 ) )
            // InternalMyRds.g:3514:2: ( rule__MenuItem__CategoryAssignment_14 )
            {
             before(grammarAccess.getMenuItemAccess().getCategoryAssignment_14()); 
            // InternalMyRds.g:3515:2: ( rule__MenuItem__CategoryAssignment_14 )
            // InternalMyRds.g:3515:3: rule__MenuItem__CategoryAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__MenuItem__CategoryAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getMenuItemAccess().getCategoryAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__14__Impl"


    // $ANTLR start "rule__MenuItem__Group__15"
    // InternalMyRds.g:3523:1: rule__MenuItem__Group__15 : rule__MenuItem__Group__15__Impl rule__MenuItem__Group__16 ;
    public final void rule__MenuItem__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3527:1: ( rule__MenuItem__Group__15__Impl rule__MenuItem__Group__16 )
            // InternalMyRds.g:3528:2: rule__MenuItem__Group__15__Impl rule__MenuItem__Group__16
            {
            pushFollow(FOLLOW_36);
            rule__MenuItem__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__16();

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
    // $ANTLR end "rule__MenuItem__Group__15"


    // $ANTLR start "rule__MenuItem__Group__15__Impl"
    // InternalMyRds.g:3535:1: rule__MenuItem__Group__15__Impl : ( ( rule__MenuItem__OrderItemsAssignment_15 )* ) ;
    public final void rule__MenuItem__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3539:1: ( ( ( rule__MenuItem__OrderItemsAssignment_15 )* ) )
            // InternalMyRds.g:3540:1: ( ( rule__MenuItem__OrderItemsAssignment_15 )* )
            {
            // InternalMyRds.g:3540:1: ( ( rule__MenuItem__OrderItemsAssignment_15 )* )
            // InternalMyRds.g:3541:2: ( rule__MenuItem__OrderItemsAssignment_15 )*
            {
             before(grammarAccess.getMenuItemAccess().getOrderItemsAssignment_15()); 
            // InternalMyRds.g:3542:2: ( rule__MenuItem__OrderItemsAssignment_15 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyRds.g:3542:3: rule__MenuItem__OrderItemsAssignment_15
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__MenuItem__OrderItemsAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMenuItemAccess().getOrderItemsAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__15__Impl"


    // $ANTLR start "rule__MenuItem__Group__16"
    // InternalMyRds.g:3550:1: rule__MenuItem__Group__16 : rule__MenuItem__Group__16__Impl rule__MenuItem__Group__17 ;
    public final void rule__MenuItem__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3554:1: ( rule__MenuItem__Group__16__Impl rule__MenuItem__Group__17 )
            // InternalMyRds.g:3555:2: rule__MenuItem__Group__16__Impl rule__MenuItem__Group__17
            {
            pushFollow(FOLLOW_7);
            rule__MenuItem__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__17();

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
    // $ANTLR end "rule__MenuItem__Group__16"


    // $ANTLR start "rule__MenuItem__Group__16__Impl"
    // InternalMyRds.g:3562:1: rule__MenuItem__Group__16__Impl : ( 'menu' ) ;
    public final void rule__MenuItem__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3566:1: ( ( 'menu' ) )
            // InternalMyRds.g:3567:1: ( 'menu' )
            {
            // InternalMyRds.g:3567:1: ( 'menu' )
            // InternalMyRds.g:3568:2: 'menu'
            {
             before(grammarAccess.getMenuItemAccess().getMenuKeyword_16()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getMenuKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__16__Impl"


    // $ANTLR start "rule__MenuItem__Group__17"
    // InternalMyRds.g:3577:1: rule__MenuItem__Group__17 : rule__MenuItem__Group__17__Impl rule__MenuItem__Group__18 ;
    public final void rule__MenuItem__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3581:1: ( rule__MenuItem__Group__17__Impl rule__MenuItem__Group__18 )
            // InternalMyRds.g:3582:2: rule__MenuItem__Group__17__Impl rule__MenuItem__Group__18
            {
            pushFollow(FOLLOW_4);
            rule__MenuItem__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__18();

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
    // $ANTLR end "rule__MenuItem__Group__17"


    // $ANTLR start "rule__MenuItem__Group__17__Impl"
    // InternalMyRds.g:3589:1: rule__MenuItem__Group__17__Impl : ( ':' ) ;
    public final void rule__MenuItem__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3593:1: ( ( ':' ) )
            // InternalMyRds.g:3594:1: ( ':' )
            {
            // InternalMyRds.g:3594:1: ( ':' )
            // InternalMyRds.g:3595:2: ':'
            {
             before(grammarAccess.getMenuItemAccess().getColonKeyword_17()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getColonKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__17__Impl"


    // $ANTLR start "rule__MenuItem__Group__18"
    // InternalMyRds.g:3604:1: rule__MenuItem__Group__18 : rule__MenuItem__Group__18__Impl rule__MenuItem__Group__19 ;
    public final void rule__MenuItem__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3608:1: ( rule__MenuItem__Group__18__Impl rule__MenuItem__Group__19 )
            // InternalMyRds.g:3609:2: rule__MenuItem__Group__18__Impl rule__MenuItem__Group__19
            {
            pushFollow(FOLLOW_28);
            rule__MenuItem__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__19();

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
    // $ANTLR end "rule__MenuItem__Group__18"


    // $ANTLR start "rule__MenuItem__Group__18__Impl"
    // InternalMyRds.g:3616:1: rule__MenuItem__Group__18__Impl : ( ( rule__MenuItem__MenuAssignment_18 ) ) ;
    public final void rule__MenuItem__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3620:1: ( ( ( rule__MenuItem__MenuAssignment_18 ) ) )
            // InternalMyRds.g:3621:1: ( ( rule__MenuItem__MenuAssignment_18 ) )
            {
            // InternalMyRds.g:3621:1: ( ( rule__MenuItem__MenuAssignment_18 ) )
            // InternalMyRds.g:3622:2: ( rule__MenuItem__MenuAssignment_18 )
            {
             before(grammarAccess.getMenuItemAccess().getMenuAssignment_18()); 
            // InternalMyRds.g:3623:2: ( rule__MenuItem__MenuAssignment_18 )
            // InternalMyRds.g:3623:3: rule__MenuItem__MenuAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__MenuItem__MenuAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getMenuItemAccess().getMenuAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__18__Impl"


    // $ANTLR start "rule__MenuItem__Group__19"
    // InternalMyRds.g:3631:1: rule__MenuItem__Group__19 : rule__MenuItem__Group__19__Impl ;
    public final void rule__MenuItem__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3635:1: ( rule__MenuItem__Group__19__Impl )
            // InternalMyRds.g:3636:2: rule__MenuItem__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MenuItem__Group__19__Impl();

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
    // $ANTLR end "rule__MenuItem__Group__19"


    // $ANTLR start "rule__MenuItem__Group__19__Impl"
    // InternalMyRds.g:3642:1: rule__MenuItem__Group__19__Impl : ( '}' ) ;
    public final void rule__MenuItem__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3646:1: ( ( '}' ) )
            // InternalMyRds.g:3647:1: ( '}' )
            {
            // InternalMyRds.g:3647:1: ( '}' )
            // InternalMyRds.g:3648:2: '}'
            {
             before(grammarAccess.getMenuItemAccess().getRightCurlyBracketKeyword_19()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__Group__19__Impl"


    // $ANTLR start "rule__OrderItem__Group__0"
    // InternalMyRds.g:3658:1: rule__OrderItem__Group__0 : rule__OrderItem__Group__0__Impl rule__OrderItem__Group__1 ;
    public final void rule__OrderItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3662:1: ( rule__OrderItem__Group__0__Impl rule__OrderItem__Group__1 )
            // InternalMyRds.g:3663:2: rule__OrderItem__Group__0__Impl rule__OrderItem__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OrderItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__1();

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
    // $ANTLR end "rule__OrderItem__Group__0"


    // $ANTLR start "rule__OrderItem__Group__0__Impl"
    // InternalMyRds.g:3670:1: rule__OrderItem__Group__0__Impl : ( 'OrderItem' ) ;
    public final void rule__OrderItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3674:1: ( ( 'OrderItem' ) )
            // InternalMyRds.g:3675:1: ( 'OrderItem' )
            {
            // InternalMyRds.g:3675:1: ( 'OrderItem' )
            // InternalMyRds.g:3676:2: 'OrderItem'
            {
             before(grammarAccess.getOrderItemAccess().getOrderItemKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getOrderItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__0__Impl"


    // $ANTLR start "rule__OrderItem__Group__1"
    // InternalMyRds.g:3685:1: rule__OrderItem__Group__1 : rule__OrderItem__Group__1__Impl rule__OrderItem__Group__2 ;
    public final void rule__OrderItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3689:1: ( rule__OrderItem__Group__1__Impl rule__OrderItem__Group__2 )
            // InternalMyRds.g:3690:2: rule__OrderItem__Group__1__Impl rule__OrderItem__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__OrderItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__2();

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
    // $ANTLR end "rule__OrderItem__Group__1"


    // $ANTLR start "rule__OrderItem__Group__1__Impl"
    // InternalMyRds.g:3697:1: rule__OrderItem__Group__1__Impl : ( ( rule__OrderItem__IdAssignment_1 ) ) ;
    public final void rule__OrderItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3701:1: ( ( ( rule__OrderItem__IdAssignment_1 ) ) )
            // InternalMyRds.g:3702:1: ( ( rule__OrderItem__IdAssignment_1 ) )
            {
            // InternalMyRds.g:3702:1: ( ( rule__OrderItem__IdAssignment_1 ) )
            // InternalMyRds.g:3703:2: ( rule__OrderItem__IdAssignment_1 )
            {
             before(grammarAccess.getOrderItemAccess().getIdAssignment_1()); 
            // InternalMyRds.g:3704:2: ( rule__OrderItem__IdAssignment_1 )
            // InternalMyRds.g:3704:3: rule__OrderItem__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderItem__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderItemAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__1__Impl"


    // $ANTLR start "rule__OrderItem__Group__2"
    // InternalMyRds.g:3712:1: rule__OrderItem__Group__2 : rule__OrderItem__Group__2__Impl rule__OrderItem__Group__3 ;
    public final void rule__OrderItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3716:1: ( rule__OrderItem__Group__2__Impl rule__OrderItem__Group__3 )
            // InternalMyRds.g:3717:2: rule__OrderItem__Group__2__Impl rule__OrderItem__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__OrderItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__3();

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
    // $ANTLR end "rule__OrderItem__Group__2"


    // $ANTLR start "rule__OrderItem__Group__2__Impl"
    // InternalMyRds.g:3724:1: rule__OrderItem__Group__2__Impl : ( '{' ) ;
    public final void rule__OrderItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3728:1: ( ( '{' ) )
            // InternalMyRds.g:3729:1: ( '{' )
            {
            // InternalMyRds.g:3729:1: ( '{' )
            // InternalMyRds.g:3730:2: '{'
            {
             before(grammarAccess.getOrderItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__2__Impl"


    // $ANTLR start "rule__OrderItem__Group__3"
    // InternalMyRds.g:3739:1: rule__OrderItem__Group__3 : rule__OrderItem__Group__3__Impl rule__OrderItem__Group__4 ;
    public final void rule__OrderItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3743:1: ( rule__OrderItem__Group__3__Impl rule__OrderItem__Group__4 )
            // InternalMyRds.g:3744:2: rule__OrderItem__Group__3__Impl rule__OrderItem__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__OrderItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__4();

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
    // $ANTLR end "rule__OrderItem__Group__3"


    // $ANTLR start "rule__OrderItem__Group__3__Impl"
    // InternalMyRds.g:3751:1: rule__OrderItem__Group__3__Impl : ( 'quantity' ) ;
    public final void rule__OrderItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3755:1: ( ( 'quantity' ) )
            // InternalMyRds.g:3756:1: ( 'quantity' )
            {
            // InternalMyRds.g:3756:1: ( 'quantity' )
            // InternalMyRds.g:3757:2: 'quantity'
            {
             before(grammarAccess.getOrderItemAccess().getQuantityKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getQuantityKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__3__Impl"


    // $ANTLR start "rule__OrderItem__Group__4"
    // InternalMyRds.g:3766:1: rule__OrderItem__Group__4 : rule__OrderItem__Group__4__Impl rule__OrderItem__Group__5 ;
    public final void rule__OrderItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3770:1: ( rule__OrderItem__Group__4__Impl rule__OrderItem__Group__5 )
            // InternalMyRds.g:3771:2: rule__OrderItem__Group__4__Impl rule__OrderItem__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__OrderItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__5();

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
    // $ANTLR end "rule__OrderItem__Group__4"


    // $ANTLR start "rule__OrderItem__Group__4__Impl"
    // InternalMyRds.g:3778:1: rule__OrderItem__Group__4__Impl : ( ':' ) ;
    public final void rule__OrderItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3782:1: ( ( ':' ) )
            // InternalMyRds.g:3783:1: ( ':' )
            {
            // InternalMyRds.g:3783:1: ( ':' )
            // InternalMyRds.g:3784:2: ':'
            {
             before(grammarAccess.getOrderItemAccess().getColonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__4__Impl"


    // $ANTLR start "rule__OrderItem__Group__5"
    // InternalMyRds.g:3793:1: rule__OrderItem__Group__5 : rule__OrderItem__Group__5__Impl rule__OrderItem__Group__6 ;
    public final void rule__OrderItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3797:1: ( rule__OrderItem__Group__5__Impl rule__OrderItem__Group__6 )
            // InternalMyRds.g:3798:2: rule__OrderItem__Group__5__Impl rule__OrderItem__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__OrderItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__6();

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
    // $ANTLR end "rule__OrderItem__Group__5"


    // $ANTLR start "rule__OrderItem__Group__5__Impl"
    // InternalMyRds.g:3805:1: rule__OrderItem__Group__5__Impl : ( ( rule__OrderItem__QuantityAssignment_5 ) ) ;
    public final void rule__OrderItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3809:1: ( ( ( rule__OrderItem__QuantityAssignment_5 ) ) )
            // InternalMyRds.g:3810:1: ( ( rule__OrderItem__QuantityAssignment_5 ) )
            {
            // InternalMyRds.g:3810:1: ( ( rule__OrderItem__QuantityAssignment_5 ) )
            // InternalMyRds.g:3811:2: ( rule__OrderItem__QuantityAssignment_5 )
            {
             before(grammarAccess.getOrderItemAccess().getQuantityAssignment_5()); 
            // InternalMyRds.g:3812:2: ( rule__OrderItem__QuantityAssignment_5 )
            // InternalMyRds.g:3812:3: rule__OrderItem__QuantityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__OrderItem__QuantityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOrderItemAccess().getQuantityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__5__Impl"


    // $ANTLR start "rule__OrderItem__Group__6"
    // InternalMyRds.g:3820:1: rule__OrderItem__Group__6 : rule__OrderItem__Group__6__Impl rule__OrderItem__Group__7 ;
    public final void rule__OrderItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3824:1: ( rule__OrderItem__Group__6__Impl rule__OrderItem__Group__7 )
            // InternalMyRds.g:3825:2: rule__OrderItem__Group__6__Impl rule__OrderItem__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__OrderItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__7();

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
    // $ANTLR end "rule__OrderItem__Group__6"


    // $ANTLR start "rule__OrderItem__Group__6__Impl"
    // InternalMyRds.g:3832:1: rule__OrderItem__Group__6__Impl : ( 'order' ) ;
    public final void rule__OrderItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3836:1: ( ( 'order' ) )
            // InternalMyRds.g:3837:1: ( 'order' )
            {
            // InternalMyRds.g:3837:1: ( 'order' )
            // InternalMyRds.g:3838:2: 'order'
            {
             before(grammarAccess.getOrderItemAccess().getOrderKeyword_6()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getOrderKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__6__Impl"


    // $ANTLR start "rule__OrderItem__Group__7"
    // InternalMyRds.g:3847:1: rule__OrderItem__Group__7 : rule__OrderItem__Group__7__Impl rule__OrderItem__Group__8 ;
    public final void rule__OrderItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3851:1: ( rule__OrderItem__Group__7__Impl rule__OrderItem__Group__8 )
            // InternalMyRds.g:3852:2: rule__OrderItem__Group__7__Impl rule__OrderItem__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__OrderItem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__8();

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
    // $ANTLR end "rule__OrderItem__Group__7"


    // $ANTLR start "rule__OrderItem__Group__7__Impl"
    // InternalMyRds.g:3859:1: rule__OrderItem__Group__7__Impl : ( ':' ) ;
    public final void rule__OrderItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3863:1: ( ( ':' ) )
            // InternalMyRds.g:3864:1: ( ':' )
            {
            // InternalMyRds.g:3864:1: ( ':' )
            // InternalMyRds.g:3865:2: ':'
            {
             before(grammarAccess.getOrderItemAccess().getColonKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__7__Impl"


    // $ANTLR start "rule__OrderItem__Group__8"
    // InternalMyRds.g:3874:1: rule__OrderItem__Group__8 : rule__OrderItem__Group__8__Impl rule__OrderItem__Group__9 ;
    public final void rule__OrderItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3878:1: ( rule__OrderItem__Group__8__Impl rule__OrderItem__Group__9 )
            // InternalMyRds.g:3879:2: rule__OrderItem__Group__8__Impl rule__OrderItem__Group__9
            {
            pushFollow(FOLLOW_39);
            rule__OrderItem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__9();

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
    // $ANTLR end "rule__OrderItem__Group__8"


    // $ANTLR start "rule__OrderItem__Group__8__Impl"
    // InternalMyRds.g:3886:1: rule__OrderItem__Group__8__Impl : ( ( rule__OrderItem__ForOrderAssignment_8 ) ) ;
    public final void rule__OrderItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3890:1: ( ( ( rule__OrderItem__ForOrderAssignment_8 ) ) )
            // InternalMyRds.g:3891:1: ( ( rule__OrderItem__ForOrderAssignment_8 ) )
            {
            // InternalMyRds.g:3891:1: ( ( rule__OrderItem__ForOrderAssignment_8 ) )
            // InternalMyRds.g:3892:2: ( rule__OrderItem__ForOrderAssignment_8 )
            {
             before(grammarAccess.getOrderItemAccess().getForOrderAssignment_8()); 
            // InternalMyRds.g:3893:2: ( rule__OrderItem__ForOrderAssignment_8 )
            // InternalMyRds.g:3893:3: rule__OrderItem__ForOrderAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__OrderItem__ForOrderAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getOrderItemAccess().getForOrderAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__8__Impl"


    // $ANTLR start "rule__OrderItem__Group__9"
    // InternalMyRds.g:3901:1: rule__OrderItem__Group__9 : rule__OrderItem__Group__9__Impl rule__OrderItem__Group__10 ;
    public final void rule__OrderItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3905:1: ( rule__OrderItem__Group__9__Impl rule__OrderItem__Group__10 )
            // InternalMyRds.g:3906:2: rule__OrderItem__Group__9__Impl rule__OrderItem__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__OrderItem__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__10();

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
    // $ANTLR end "rule__OrderItem__Group__9"


    // $ANTLR start "rule__OrderItem__Group__9__Impl"
    // InternalMyRds.g:3913:1: rule__OrderItem__Group__9__Impl : ( 'menuItem' ) ;
    public final void rule__OrderItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3917:1: ( ( 'menuItem' ) )
            // InternalMyRds.g:3918:1: ( 'menuItem' )
            {
            // InternalMyRds.g:3918:1: ( 'menuItem' )
            // InternalMyRds.g:3919:2: 'menuItem'
            {
             before(grammarAccess.getOrderItemAccess().getMenuItemKeyword_9()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getMenuItemKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__9__Impl"


    // $ANTLR start "rule__OrderItem__Group__10"
    // InternalMyRds.g:3928:1: rule__OrderItem__Group__10 : rule__OrderItem__Group__10__Impl rule__OrderItem__Group__11 ;
    public final void rule__OrderItem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3932:1: ( rule__OrderItem__Group__10__Impl rule__OrderItem__Group__11 )
            // InternalMyRds.g:3933:2: rule__OrderItem__Group__10__Impl rule__OrderItem__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__OrderItem__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__11();

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
    // $ANTLR end "rule__OrderItem__Group__10"


    // $ANTLR start "rule__OrderItem__Group__10__Impl"
    // InternalMyRds.g:3940:1: rule__OrderItem__Group__10__Impl : ( ':' ) ;
    public final void rule__OrderItem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3944:1: ( ( ':' ) )
            // InternalMyRds.g:3945:1: ( ':' )
            {
            // InternalMyRds.g:3945:1: ( ':' )
            // InternalMyRds.g:3946:2: ':'
            {
             before(grammarAccess.getOrderItemAccess().getColonKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__10__Impl"


    // $ANTLR start "rule__OrderItem__Group__11"
    // InternalMyRds.g:3955:1: rule__OrderItem__Group__11 : rule__OrderItem__Group__11__Impl rule__OrderItem__Group__12 ;
    public final void rule__OrderItem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3959:1: ( rule__OrderItem__Group__11__Impl rule__OrderItem__Group__12 )
            // InternalMyRds.g:3960:2: rule__OrderItem__Group__11__Impl rule__OrderItem__Group__12
            {
            pushFollow(FOLLOW_28);
            rule__OrderItem__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__12();

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
    // $ANTLR end "rule__OrderItem__Group__11"


    // $ANTLR start "rule__OrderItem__Group__11__Impl"
    // InternalMyRds.g:3967:1: rule__OrderItem__Group__11__Impl : ( ( rule__OrderItem__MenuItemAssignment_11 ) ) ;
    public final void rule__OrderItem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3971:1: ( ( ( rule__OrderItem__MenuItemAssignment_11 ) ) )
            // InternalMyRds.g:3972:1: ( ( rule__OrderItem__MenuItemAssignment_11 ) )
            {
            // InternalMyRds.g:3972:1: ( ( rule__OrderItem__MenuItemAssignment_11 ) )
            // InternalMyRds.g:3973:2: ( rule__OrderItem__MenuItemAssignment_11 )
            {
             before(grammarAccess.getOrderItemAccess().getMenuItemAssignment_11()); 
            // InternalMyRds.g:3974:2: ( rule__OrderItem__MenuItemAssignment_11 )
            // InternalMyRds.g:3974:3: rule__OrderItem__MenuItemAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__OrderItem__MenuItemAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getOrderItemAccess().getMenuItemAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__11__Impl"


    // $ANTLR start "rule__OrderItem__Group__12"
    // InternalMyRds.g:3982:1: rule__OrderItem__Group__12 : rule__OrderItem__Group__12__Impl ;
    public final void rule__OrderItem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3986:1: ( rule__OrderItem__Group__12__Impl )
            // InternalMyRds.g:3987:2: rule__OrderItem__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderItem__Group__12__Impl();

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
    // $ANTLR end "rule__OrderItem__Group__12"


    // $ANTLR start "rule__OrderItem__Group__12__Impl"
    // InternalMyRds.g:3993:1: rule__OrderItem__Group__12__Impl : ( '}' ) ;
    public final void rule__OrderItem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:3997:1: ( ( '}' ) )
            // InternalMyRds.g:3998:1: ( '}' )
            {
            // InternalMyRds.g:3998:1: ( '}' )
            // InternalMyRds.g:3999:2: '}'
            {
             before(grammarAccess.getOrderItemAccess().getRightCurlyBracketKeyword_12()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__Group__12__Impl"


    // $ANTLR start "rule__Review__Group__0"
    // InternalMyRds.g:4009:1: rule__Review__Group__0 : rule__Review__Group__0__Impl rule__Review__Group__1 ;
    public final void rule__Review__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4013:1: ( rule__Review__Group__0__Impl rule__Review__Group__1 )
            // InternalMyRds.g:4014:2: rule__Review__Group__0__Impl rule__Review__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Review__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__1();

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
    // $ANTLR end "rule__Review__Group__0"


    // $ANTLR start "rule__Review__Group__0__Impl"
    // InternalMyRds.g:4021:1: rule__Review__Group__0__Impl : ( 'Review' ) ;
    public final void rule__Review__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4025:1: ( ( 'Review' ) )
            // InternalMyRds.g:4026:1: ( 'Review' )
            {
            // InternalMyRds.g:4026:1: ( 'Review' )
            // InternalMyRds.g:4027:2: 'Review'
            {
             before(grammarAccess.getReviewAccess().getReviewKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getReviewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__0__Impl"


    // $ANTLR start "rule__Review__Group__1"
    // InternalMyRds.g:4036:1: rule__Review__Group__1 : rule__Review__Group__1__Impl rule__Review__Group__2 ;
    public final void rule__Review__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4040:1: ( rule__Review__Group__1__Impl rule__Review__Group__2 )
            // InternalMyRds.g:4041:2: rule__Review__Group__1__Impl rule__Review__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Review__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__2();

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
    // $ANTLR end "rule__Review__Group__1"


    // $ANTLR start "rule__Review__Group__1__Impl"
    // InternalMyRds.g:4048:1: rule__Review__Group__1__Impl : ( ( rule__Review__IdAssignment_1 ) ) ;
    public final void rule__Review__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4052:1: ( ( ( rule__Review__IdAssignment_1 ) ) )
            // InternalMyRds.g:4053:1: ( ( rule__Review__IdAssignment_1 ) )
            {
            // InternalMyRds.g:4053:1: ( ( rule__Review__IdAssignment_1 ) )
            // InternalMyRds.g:4054:2: ( rule__Review__IdAssignment_1 )
            {
             before(grammarAccess.getReviewAccess().getIdAssignment_1()); 
            // InternalMyRds.g:4055:2: ( rule__Review__IdAssignment_1 )
            // InternalMyRds.g:4055:3: rule__Review__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Review__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReviewAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__1__Impl"


    // $ANTLR start "rule__Review__Group__2"
    // InternalMyRds.g:4063:1: rule__Review__Group__2 : rule__Review__Group__2__Impl rule__Review__Group__3 ;
    public final void rule__Review__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4067:1: ( rule__Review__Group__2__Impl rule__Review__Group__3 )
            // InternalMyRds.g:4068:2: rule__Review__Group__2__Impl rule__Review__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__Review__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__3();

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
    // $ANTLR end "rule__Review__Group__2"


    // $ANTLR start "rule__Review__Group__2__Impl"
    // InternalMyRds.g:4075:1: rule__Review__Group__2__Impl : ( '{' ) ;
    public final void rule__Review__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4079:1: ( ( '{' ) )
            // InternalMyRds.g:4080:1: ( '{' )
            {
            // InternalMyRds.g:4080:1: ( '{' )
            // InternalMyRds.g:4081:2: '{'
            {
             before(grammarAccess.getReviewAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__2__Impl"


    // $ANTLR start "rule__Review__Group__3"
    // InternalMyRds.g:4090:1: rule__Review__Group__3 : rule__Review__Group__3__Impl rule__Review__Group__4 ;
    public final void rule__Review__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4094:1: ( rule__Review__Group__3__Impl rule__Review__Group__4 )
            // InternalMyRds.g:4095:2: rule__Review__Group__3__Impl rule__Review__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Review__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__4();

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
    // $ANTLR end "rule__Review__Group__3"


    // $ANTLR start "rule__Review__Group__3__Impl"
    // InternalMyRds.g:4102:1: rule__Review__Group__3__Impl : ( 'numStars' ) ;
    public final void rule__Review__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4106:1: ( ( 'numStars' ) )
            // InternalMyRds.g:4107:1: ( 'numStars' )
            {
            // InternalMyRds.g:4107:1: ( 'numStars' )
            // InternalMyRds.g:4108:2: 'numStars'
            {
             before(grammarAccess.getReviewAccess().getNumStarsKeyword_3()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getNumStarsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__3__Impl"


    // $ANTLR start "rule__Review__Group__4"
    // InternalMyRds.g:4117:1: rule__Review__Group__4 : rule__Review__Group__4__Impl rule__Review__Group__5 ;
    public final void rule__Review__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4121:1: ( rule__Review__Group__4__Impl rule__Review__Group__5 )
            // InternalMyRds.g:4122:2: rule__Review__Group__4__Impl rule__Review__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Review__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__5();

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
    // $ANTLR end "rule__Review__Group__4"


    // $ANTLR start "rule__Review__Group__4__Impl"
    // InternalMyRds.g:4129:1: rule__Review__Group__4__Impl : ( ':' ) ;
    public final void rule__Review__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4133:1: ( ( ':' ) )
            // InternalMyRds.g:4134:1: ( ':' )
            {
            // InternalMyRds.g:4134:1: ( ':' )
            // InternalMyRds.g:4135:2: ':'
            {
             before(grammarAccess.getReviewAccess().getColonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__4__Impl"


    // $ANTLR start "rule__Review__Group__5"
    // InternalMyRds.g:4144:1: rule__Review__Group__5 : rule__Review__Group__5__Impl rule__Review__Group__6 ;
    public final void rule__Review__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4148:1: ( rule__Review__Group__5__Impl rule__Review__Group__6 )
            // InternalMyRds.g:4149:2: rule__Review__Group__5__Impl rule__Review__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Review__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__6();

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
    // $ANTLR end "rule__Review__Group__5"


    // $ANTLR start "rule__Review__Group__5__Impl"
    // InternalMyRds.g:4156:1: rule__Review__Group__5__Impl : ( ( rule__Review__NumStarsAssignment_5 ) ) ;
    public final void rule__Review__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4160:1: ( ( ( rule__Review__NumStarsAssignment_5 ) ) )
            // InternalMyRds.g:4161:1: ( ( rule__Review__NumStarsAssignment_5 ) )
            {
            // InternalMyRds.g:4161:1: ( ( rule__Review__NumStarsAssignment_5 ) )
            // InternalMyRds.g:4162:2: ( rule__Review__NumStarsAssignment_5 )
            {
             before(grammarAccess.getReviewAccess().getNumStarsAssignment_5()); 
            // InternalMyRds.g:4163:2: ( rule__Review__NumStarsAssignment_5 )
            // InternalMyRds.g:4163:3: rule__Review__NumStarsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Review__NumStarsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReviewAccess().getNumStarsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__5__Impl"


    // $ANTLR start "rule__Review__Group__6"
    // InternalMyRds.g:4171:1: rule__Review__Group__6 : rule__Review__Group__6__Impl rule__Review__Group__7 ;
    public final void rule__Review__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4175:1: ( rule__Review__Group__6__Impl rule__Review__Group__7 )
            // InternalMyRds.g:4176:2: rule__Review__Group__6__Impl rule__Review__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Review__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__7();

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
    // $ANTLR end "rule__Review__Group__6"


    // $ANTLR start "rule__Review__Group__6__Impl"
    // InternalMyRds.g:4183:1: rule__Review__Group__6__Impl : ( 'description' ) ;
    public final void rule__Review__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4187:1: ( ( 'description' ) )
            // InternalMyRds.g:4188:1: ( 'description' )
            {
            // InternalMyRds.g:4188:1: ( 'description' )
            // InternalMyRds.g:4189:2: 'description'
            {
             before(grammarAccess.getReviewAccess().getDescriptionKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getDescriptionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__6__Impl"


    // $ANTLR start "rule__Review__Group__7"
    // InternalMyRds.g:4198:1: rule__Review__Group__7 : rule__Review__Group__7__Impl rule__Review__Group__8 ;
    public final void rule__Review__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4202:1: ( rule__Review__Group__7__Impl rule__Review__Group__8 )
            // InternalMyRds.g:4203:2: rule__Review__Group__7__Impl rule__Review__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Review__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__8();

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
    // $ANTLR end "rule__Review__Group__7"


    // $ANTLR start "rule__Review__Group__7__Impl"
    // InternalMyRds.g:4210:1: rule__Review__Group__7__Impl : ( ':' ) ;
    public final void rule__Review__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4214:1: ( ( ':' ) )
            // InternalMyRds.g:4215:1: ( ':' )
            {
            // InternalMyRds.g:4215:1: ( ':' )
            // InternalMyRds.g:4216:2: ':'
            {
             before(grammarAccess.getReviewAccess().getColonKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__7__Impl"


    // $ANTLR start "rule__Review__Group__8"
    // InternalMyRds.g:4225:1: rule__Review__Group__8 : rule__Review__Group__8__Impl rule__Review__Group__9 ;
    public final void rule__Review__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4229:1: ( rule__Review__Group__8__Impl rule__Review__Group__9 )
            // InternalMyRds.g:4230:2: rule__Review__Group__8__Impl rule__Review__Group__9
            {
            pushFollow(FOLLOW_41);
            rule__Review__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__9();

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
    // $ANTLR end "rule__Review__Group__8"


    // $ANTLR start "rule__Review__Group__8__Impl"
    // InternalMyRds.g:4237:1: rule__Review__Group__8__Impl : ( ( rule__Review__DescriptionAssignment_8 ) ) ;
    public final void rule__Review__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4241:1: ( ( ( rule__Review__DescriptionAssignment_8 ) ) )
            // InternalMyRds.g:4242:1: ( ( rule__Review__DescriptionAssignment_8 ) )
            {
            // InternalMyRds.g:4242:1: ( ( rule__Review__DescriptionAssignment_8 ) )
            // InternalMyRds.g:4243:2: ( rule__Review__DescriptionAssignment_8 )
            {
             before(grammarAccess.getReviewAccess().getDescriptionAssignment_8()); 
            // InternalMyRds.g:4244:2: ( rule__Review__DescriptionAssignment_8 )
            // InternalMyRds.g:4244:3: rule__Review__DescriptionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Review__DescriptionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getReviewAccess().getDescriptionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__8__Impl"


    // $ANTLR start "rule__Review__Group__9"
    // InternalMyRds.g:4252:1: rule__Review__Group__9 : rule__Review__Group__9__Impl rule__Review__Group__10 ;
    public final void rule__Review__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4256:1: ( rule__Review__Group__9__Impl rule__Review__Group__10 )
            // InternalMyRds.g:4257:2: rule__Review__Group__9__Impl rule__Review__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Review__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__10();

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
    // $ANTLR end "rule__Review__Group__9"


    // $ANTLR start "rule__Review__Group__9__Impl"
    // InternalMyRds.g:4264:1: rule__Review__Group__9__Impl : ( 'reviewDatetime' ) ;
    public final void rule__Review__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4268:1: ( ( 'reviewDatetime' ) )
            // InternalMyRds.g:4269:1: ( 'reviewDatetime' )
            {
            // InternalMyRds.g:4269:1: ( 'reviewDatetime' )
            // InternalMyRds.g:4270:2: 'reviewDatetime'
            {
             before(grammarAccess.getReviewAccess().getReviewDatetimeKeyword_9()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getReviewDatetimeKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__9__Impl"


    // $ANTLR start "rule__Review__Group__10"
    // InternalMyRds.g:4279:1: rule__Review__Group__10 : rule__Review__Group__10__Impl rule__Review__Group__11 ;
    public final void rule__Review__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4283:1: ( rule__Review__Group__10__Impl rule__Review__Group__11 )
            // InternalMyRds.g:4284:2: rule__Review__Group__10__Impl rule__Review__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Review__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__11();

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
    // $ANTLR end "rule__Review__Group__10"


    // $ANTLR start "rule__Review__Group__10__Impl"
    // InternalMyRds.g:4291:1: rule__Review__Group__10__Impl : ( ':' ) ;
    public final void rule__Review__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4295:1: ( ( ':' ) )
            // InternalMyRds.g:4296:1: ( ':' )
            {
            // InternalMyRds.g:4296:1: ( ':' )
            // InternalMyRds.g:4297:2: ':'
            {
             before(grammarAccess.getReviewAccess().getColonKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__10__Impl"


    // $ANTLR start "rule__Review__Group__11"
    // InternalMyRds.g:4306:1: rule__Review__Group__11 : rule__Review__Group__11__Impl rule__Review__Group__12 ;
    public final void rule__Review__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4310:1: ( rule__Review__Group__11__Impl rule__Review__Group__12 )
            // InternalMyRds.g:4311:2: rule__Review__Group__11__Impl rule__Review__Group__12
            {
            pushFollow(FOLLOW_38);
            rule__Review__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__12();

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
    // $ANTLR end "rule__Review__Group__11"


    // $ANTLR start "rule__Review__Group__11__Impl"
    // InternalMyRds.g:4318:1: rule__Review__Group__11__Impl : ( ( rule__Review__ReviewDatetimeAssignment_11 ) ) ;
    public final void rule__Review__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4322:1: ( ( ( rule__Review__ReviewDatetimeAssignment_11 ) ) )
            // InternalMyRds.g:4323:1: ( ( rule__Review__ReviewDatetimeAssignment_11 ) )
            {
            // InternalMyRds.g:4323:1: ( ( rule__Review__ReviewDatetimeAssignment_11 ) )
            // InternalMyRds.g:4324:2: ( rule__Review__ReviewDatetimeAssignment_11 )
            {
             before(grammarAccess.getReviewAccess().getReviewDatetimeAssignment_11()); 
            // InternalMyRds.g:4325:2: ( rule__Review__ReviewDatetimeAssignment_11 )
            // InternalMyRds.g:4325:3: rule__Review__ReviewDatetimeAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Review__ReviewDatetimeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getReviewAccess().getReviewDatetimeAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__11__Impl"


    // $ANTLR start "rule__Review__Group__12"
    // InternalMyRds.g:4333:1: rule__Review__Group__12 : rule__Review__Group__12__Impl rule__Review__Group__13 ;
    public final void rule__Review__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4337:1: ( rule__Review__Group__12__Impl rule__Review__Group__13 )
            // InternalMyRds.g:4338:2: rule__Review__Group__12__Impl rule__Review__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Review__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__13();

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
    // $ANTLR end "rule__Review__Group__12"


    // $ANTLR start "rule__Review__Group__12__Impl"
    // InternalMyRds.g:4345:1: rule__Review__Group__12__Impl : ( 'order' ) ;
    public final void rule__Review__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4349:1: ( ( 'order' ) )
            // InternalMyRds.g:4350:1: ( 'order' )
            {
            // InternalMyRds.g:4350:1: ( 'order' )
            // InternalMyRds.g:4351:2: 'order'
            {
             before(grammarAccess.getReviewAccess().getOrderKeyword_12()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getOrderKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__12__Impl"


    // $ANTLR start "rule__Review__Group__13"
    // InternalMyRds.g:4360:1: rule__Review__Group__13 : rule__Review__Group__13__Impl rule__Review__Group__14 ;
    public final void rule__Review__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4364:1: ( rule__Review__Group__13__Impl rule__Review__Group__14 )
            // InternalMyRds.g:4365:2: rule__Review__Group__13__Impl rule__Review__Group__14
            {
            pushFollow(FOLLOW_4);
            rule__Review__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__14();

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
    // $ANTLR end "rule__Review__Group__13"


    // $ANTLR start "rule__Review__Group__13__Impl"
    // InternalMyRds.g:4372:1: rule__Review__Group__13__Impl : ( ':' ) ;
    public final void rule__Review__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4376:1: ( ( ':' ) )
            // InternalMyRds.g:4377:1: ( ':' )
            {
            // InternalMyRds.g:4377:1: ( ':' )
            // InternalMyRds.g:4378:2: ':'
            {
             before(grammarAccess.getReviewAccess().getColonKeyword_13()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getColonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__13__Impl"


    // $ANTLR start "rule__Review__Group__14"
    // InternalMyRds.g:4387:1: rule__Review__Group__14 : rule__Review__Group__14__Impl rule__Review__Group__15 ;
    public final void rule__Review__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4391:1: ( rule__Review__Group__14__Impl rule__Review__Group__15 )
            // InternalMyRds.g:4392:2: rule__Review__Group__14__Impl rule__Review__Group__15
            {
            pushFollow(FOLLOW_28);
            rule__Review__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__15();

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
    // $ANTLR end "rule__Review__Group__14"


    // $ANTLR start "rule__Review__Group__14__Impl"
    // InternalMyRds.g:4399:1: rule__Review__Group__14__Impl : ( ( rule__Review__ReviewedOrderAssignment_14 ) ) ;
    public final void rule__Review__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4403:1: ( ( ( rule__Review__ReviewedOrderAssignment_14 ) ) )
            // InternalMyRds.g:4404:1: ( ( rule__Review__ReviewedOrderAssignment_14 ) )
            {
            // InternalMyRds.g:4404:1: ( ( rule__Review__ReviewedOrderAssignment_14 ) )
            // InternalMyRds.g:4405:2: ( rule__Review__ReviewedOrderAssignment_14 )
            {
             before(grammarAccess.getReviewAccess().getReviewedOrderAssignment_14()); 
            // InternalMyRds.g:4406:2: ( rule__Review__ReviewedOrderAssignment_14 )
            // InternalMyRds.g:4406:3: rule__Review__ReviewedOrderAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Review__ReviewedOrderAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getReviewAccess().getReviewedOrderAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__14__Impl"


    // $ANTLR start "rule__Review__Group__15"
    // InternalMyRds.g:4414:1: rule__Review__Group__15 : rule__Review__Group__15__Impl ;
    public final void rule__Review__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4418:1: ( rule__Review__Group__15__Impl )
            // InternalMyRds.g:4419:2: rule__Review__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Review__Group__15__Impl();

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
    // $ANTLR end "rule__Review__Group__15"


    // $ANTLR start "rule__Review__Group__15__Impl"
    // InternalMyRds.g:4425:1: rule__Review__Group__15__Impl : ( '}' ) ;
    public final void rule__Review__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4429:1: ( ( '}' ) )
            // InternalMyRds.g:4430:1: ( '}' )
            {
            // InternalMyRds.g:4430:1: ( '}' )
            // InternalMyRds.g:4431:2: '}'
            {
             before(grammarAccess.getReviewAccess().getRightCurlyBracketKeyword_15()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__15__Impl"


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalMyRds.g:4441:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4445:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalMyRds.g:4446:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__DECIMAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__1();

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
    // $ANTLR end "rule__DECIMAL__Group__0"


    // $ANTLR start "rule__DECIMAL__Group__0__Impl"
    // InternalMyRds.g:4453:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4457:1: ( ( RULE_INT ) )
            // InternalMyRds.g:4458:1: ( RULE_INT )
            {
            // InternalMyRds.g:4458:1: ( RULE_INT )
            // InternalMyRds.g:4459:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group__1"
    // InternalMyRds.g:4468:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4472:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalMyRds.g:4473:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DECIMAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2();

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
    // $ANTLR end "rule__DECIMAL__Group__1"


    // $ANTLR start "rule__DECIMAL__Group__1__Impl"
    // InternalMyRds.g:4480:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4484:1: ( ( '.' ) )
            // InternalMyRds.g:4485:1: ( '.' )
            {
            // InternalMyRds.g:4485:1: ( '.' )
            // InternalMyRds.g:4486:2: '.'
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__2"
    // InternalMyRds.g:4495:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4499:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalMyRds.g:4500:2: rule__DECIMAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2__Impl();

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
    // $ANTLR end "rule__DECIMAL__Group__2"


    // $ANTLR start "rule__DECIMAL__Group__2__Impl"
    // InternalMyRds.g:4506:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4510:1: ( ( RULE_INT ) )
            // InternalMyRds.g:4511:1: ( RULE_INT )
            {
            // InternalMyRds.g:4511:1: ( RULE_INT )
            // InternalMyRds.g:4512:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__2__Impl"


    // $ANTLR start "rule__FULLNAME__Group__0"
    // InternalMyRds.g:4522:1: rule__FULLNAME__Group__0 : rule__FULLNAME__Group__0__Impl rule__FULLNAME__Group__1 ;
    public final void rule__FULLNAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4526:1: ( rule__FULLNAME__Group__0__Impl rule__FULLNAME__Group__1 )
            // InternalMyRds.g:4527:2: rule__FULLNAME__Group__0__Impl rule__FULLNAME__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FULLNAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FULLNAME__Group__1();

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
    // $ANTLR end "rule__FULLNAME__Group__0"


    // $ANTLR start "rule__FULLNAME__Group__0__Impl"
    // InternalMyRds.g:4534:1: rule__FULLNAME__Group__0__Impl : ( RULE_STRING ) ;
    public final void rule__FULLNAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4538:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:4539:1: ( RULE_STRING )
            {
            // InternalMyRds.g:4539:1: ( RULE_STRING )
            // InternalMyRds.g:4540:2: RULE_STRING
            {
             before(grammarAccess.getFULLNAMEAccess().getSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFULLNAMEAccess().getSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FULLNAME__Group__0__Impl"


    // $ANTLR start "rule__FULLNAME__Group__1"
    // InternalMyRds.g:4549:1: rule__FULLNAME__Group__1 : rule__FULLNAME__Group__1__Impl ;
    public final void rule__FULLNAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4553:1: ( rule__FULLNAME__Group__1__Impl )
            // InternalMyRds.g:4554:2: rule__FULLNAME__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FULLNAME__Group__1__Impl();

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
    // $ANTLR end "rule__FULLNAME__Group__1"


    // $ANTLR start "rule__FULLNAME__Group__1__Impl"
    // InternalMyRds.g:4560:1: rule__FULLNAME__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__FULLNAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4564:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:4565:1: ( RULE_STRING )
            {
            // InternalMyRds.g:4565:1: ( RULE_STRING )
            // InternalMyRds.g:4566:2: RULE_STRING
            {
             before(grammarAccess.getFULLNAMEAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFULLNAMEAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FULLNAME__Group__1__Impl"


    // $ANTLR start "rule__PHONE__Group__0"
    // InternalMyRds.g:4576:1: rule__PHONE__Group__0 : rule__PHONE__Group__0__Impl rule__PHONE__Group__1 ;
    public final void rule__PHONE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4580:1: ( rule__PHONE__Group__0__Impl rule__PHONE__Group__1 )
            // InternalMyRds.g:4581:2: rule__PHONE__Group__0__Impl rule__PHONE__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__PHONE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PHONE__Group__1();

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
    // $ANTLR end "rule__PHONE__Group__0"


    // $ANTLR start "rule__PHONE__Group__0__Impl"
    // InternalMyRds.g:4588:1: rule__PHONE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__PHONE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4592:1: ( ( RULE_INT ) )
            // InternalMyRds.g:4593:1: ( RULE_INT )
            {
            // InternalMyRds.g:4593:1: ( RULE_INT )
            // InternalMyRds.g:4594:2: RULE_INT
            {
             before(grammarAccess.getPHONEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPHONEAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PHONE__Group__0__Impl"


    // $ANTLR start "rule__PHONE__Group__1"
    // InternalMyRds.g:4603:1: rule__PHONE__Group__1 : rule__PHONE__Group__1__Impl rule__PHONE__Group__2 ;
    public final void rule__PHONE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4607:1: ( rule__PHONE__Group__1__Impl rule__PHONE__Group__2 )
            // InternalMyRds.g:4608:2: rule__PHONE__Group__1__Impl rule__PHONE__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PHONE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PHONE__Group__2();

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
    // $ANTLR end "rule__PHONE__Group__1"


    // $ANTLR start "rule__PHONE__Group__1__Impl"
    // InternalMyRds.g:4615:1: rule__PHONE__Group__1__Impl : ( '-' ) ;
    public final void rule__PHONE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4619:1: ( ( '-' ) )
            // InternalMyRds.g:4620:1: ( '-' )
            {
            // InternalMyRds.g:4620:1: ( '-' )
            // InternalMyRds.g:4621:2: '-'
            {
             before(grammarAccess.getPHONEAccess().getHyphenMinusKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPHONEAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PHONE__Group__1__Impl"


    // $ANTLR start "rule__PHONE__Group__2"
    // InternalMyRds.g:4630:1: rule__PHONE__Group__2 : rule__PHONE__Group__2__Impl rule__PHONE__Group__3 ;
    public final void rule__PHONE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4634:1: ( rule__PHONE__Group__2__Impl rule__PHONE__Group__3 )
            // InternalMyRds.g:4635:2: rule__PHONE__Group__2__Impl rule__PHONE__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__PHONE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PHONE__Group__3();

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
    // $ANTLR end "rule__PHONE__Group__2"


    // $ANTLR start "rule__PHONE__Group__2__Impl"
    // InternalMyRds.g:4642:1: rule__PHONE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__PHONE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4646:1: ( ( RULE_INT ) )
            // InternalMyRds.g:4647:1: ( RULE_INT )
            {
            // InternalMyRds.g:4647:1: ( RULE_INT )
            // InternalMyRds.g:4648:2: RULE_INT
            {
             before(grammarAccess.getPHONEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPHONEAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PHONE__Group__2__Impl"


    // $ANTLR start "rule__PHONE__Group__3"
    // InternalMyRds.g:4657:1: rule__PHONE__Group__3 : rule__PHONE__Group__3__Impl rule__PHONE__Group__4 ;
    public final void rule__PHONE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4661:1: ( rule__PHONE__Group__3__Impl rule__PHONE__Group__4 )
            // InternalMyRds.g:4662:2: rule__PHONE__Group__3__Impl rule__PHONE__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__PHONE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PHONE__Group__4();

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
    // $ANTLR end "rule__PHONE__Group__3"


    // $ANTLR start "rule__PHONE__Group__3__Impl"
    // InternalMyRds.g:4669:1: rule__PHONE__Group__3__Impl : ( '-' ) ;
    public final void rule__PHONE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4673:1: ( ( '-' ) )
            // InternalMyRds.g:4674:1: ( '-' )
            {
            // InternalMyRds.g:4674:1: ( '-' )
            // InternalMyRds.g:4675:2: '-'
            {
             before(grammarAccess.getPHONEAccess().getHyphenMinusKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPHONEAccess().getHyphenMinusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PHONE__Group__3__Impl"


    // $ANTLR start "rule__PHONE__Group__4"
    // InternalMyRds.g:4684:1: rule__PHONE__Group__4 : rule__PHONE__Group__4__Impl ;
    public final void rule__PHONE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4688:1: ( rule__PHONE__Group__4__Impl )
            // InternalMyRds.g:4689:2: rule__PHONE__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PHONE__Group__4__Impl();

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
    // $ANTLR end "rule__PHONE__Group__4"


    // $ANTLR start "rule__PHONE__Group__4__Impl"
    // InternalMyRds.g:4695:1: rule__PHONE__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__PHONE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4699:1: ( ( RULE_INT ) )
            // InternalMyRds.g:4700:1: ( RULE_INT )
            {
            // InternalMyRds.g:4700:1: ( RULE_INT )
            // InternalMyRds.g:4701:2: RULE_INT
            {
             before(grammarAccess.getPHONEAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPHONEAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PHONE__Group__4__Impl"


    // $ANTLR start "rule__EMAIL__Group__0"
    // InternalMyRds.g:4711:1: rule__EMAIL__Group__0 : rule__EMAIL__Group__0__Impl rule__EMAIL__Group__1 ;
    public final void rule__EMAIL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4715:1: ( rule__EMAIL__Group__0__Impl rule__EMAIL__Group__1 )
            // InternalMyRds.g:4716:2: rule__EMAIL__Group__0__Impl rule__EMAIL__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__EMAIL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EMAIL__Group__1();

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
    // $ANTLR end "rule__EMAIL__Group__0"


    // $ANTLR start "rule__EMAIL__Group__0__Impl"
    // InternalMyRds.g:4723:1: rule__EMAIL__Group__0__Impl : ( RULE_STRING ) ;
    public final void rule__EMAIL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4727:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:4728:1: ( RULE_STRING )
            {
            // InternalMyRds.g:4728:1: ( RULE_STRING )
            // InternalMyRds.g:4729:2: RULE_STRING
            {
             before(grammarAccess.getEMAILAccess().getSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEMAILAccess().getSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMAIL__Group__0__Impl"


    // $ANTLR start "rule__EMAIL__Group__1"
    // InternalMyRds.g:4738:1: rule__EMAIL__Group__1 : rule__EMAIL__Group__1__Impl rule__EMAIL__Group__2 ;
    public final void rule__EMAIL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4742:1: ( rule__EMAIL__Group__1__Impl rule__EMAIL__Group__2 )
            // InternalMyRds.g:4743:2: rule__EMAIL__Group__1__Impl rule__EMAIL__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__EMAIL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EMAIL__Group__2();

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
    // $ANTLR end "rule__EMAIL__Group__1"


    // $ANTLR start "rule__EMAIL__Group__1__Impl"
    // InternalMyRds.g:4750:1: rule__EMAIL__Group__1__Impl : ( '@' ) ;
    public final void rule__EMAIL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4754:1: ( ( '@' ) )
            // InternalMyRds.g:4755:1: ( '@' )
            {
            // InternalMyRds.g:4755:1: ( '@' )
            // InternalMyRds.g:4756:2: '@'
            {
             before(grammarAccess.getEMAILAccess().getCommercialAtKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getEMAILAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMAIL__Group__1__Impl"


    // $ANTLR start "rule__EMAIL__Group__2"
    // InternalMyRds.g:4765:1: rule__EMAIL__Group__2 : rule__EMAIL__Group__2__Impl rule__EMAIL__Group__3 ;
    public final void rule__EMAIL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4769:1: ( rule__EMAIL__Group__2__Impl rule__EMAIL__Group__3 )
            // InternalMyRds.g:4770:2: rule__EMAIL__Group__2__Impl rule__EMAIL__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__EMAIL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EMAIL__Group__3();

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
    // $ANTLR end "rule__EMAIL__Group__2"


    // $ANTLR start "rule__EMAIL__Group__2__Impl"
    // InternalMyRds.g:4777:1: rule__EMAIL__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__EMAIL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4781:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:4782:1: ( RULE_STRING )
            {
            // InternalMyRds.g:4782:1: ( RULE_STRING )
            // InternalMyRds.g:4783:2: RULE_STRING
            {
             before(grammarAccess.getEMAILAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEMAILAccess().getSTRINGTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMAIL__Group__2__Impl"


    // $ANTLR start "rule__EMAIL__Group__3"
    // InternalMyRds.g:4792:1: rule__EMAIL__Group__3 : rule__EMAIL__Group__3__Impl ;
    public final void rule__EMAIL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4796:1: ( rule__EMAIL__Group__3__Impl )
            // InternalMyRds.g:4797:2: rule__EMAIL__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EMAIL__Group__3__Impl();

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
    // $ANTLR end "rule__EMAIL__Group__3"


    // $ANTLR start "rule__EMAIL__Group__3__Impl"
    // InternalMyRds.g:4803:1: rule__EMAIL__Group__3__Impl : ( '.com' ) ;
    public final void rule__EMAIL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4807:1: ( ( '.com' ) )
            // InternalMyRds.g:4808:1: ( '.com' )
            {
            // InternalMyRds.g:4808:1: ( '.com' )
            // InternalMyRds.g:4809:2: '.com'
            {
             before(grammarAccess.getEMAILAccess().getComKeyword_3()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getEMAILAccess().getComKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMAIL__Group__3__Impl"


    // $ANTLR start "rule__DATETIME__Group__0"
    // InternalMyRds.g:4819:1: rule__DATETIME__Group__0 : rule__DATETIME__Group__0__Impl rule__DATETIME__Group__1 ;
    public final void rule__DATETIME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4823:1: ( rule__DATETIME__Group__0__Impl rule__DATETIME__Group__1 )
            // InternalMyRds.g:4824:2: rule__DATETIME__Group__0__Impl rule__DATETIME__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__DATETIME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATETIME__Group__1();

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
    // $ANTLR end "rule__DATETIME__Group__0"


    // $ANTLR start "rule__DATETIME__Group__0__Impl"
    // InternalMyRds.g:4831:1: rule__DATETIME__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DATETIME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4835:1: ( ( RULE_INT ) )
            // InternalMyRds.g:4836:1: ( RULE_INT )
            {
            // InternalMyRds.g:4836:1: ( RULE_INT )
            // InternalMyRds.g:4837:2: RULE_INT
            {
             before(grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATETIME__Group__0__Impl"


    // $ANTLR start "rule__DATETIME__Group__1"
    // InternalMyRds.g:4846:1: rule__DATETIME__Group__1 : rule__DATETIME__Group__1__Impl rule__DATETIME__Group__2 ;
    public final void rule__DATETIME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4850:1: ( rule__DATETIME__Group__1__Impl rule__DATETIME__Group__2 )
            // InternalMyRds.g:4851:2: rule__DATETIME__Group__1__Impl rule__DATETIME__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DATETIME__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATETIME__Group__2();

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
    // $ANTLR end "rule__DATETIME__Group__1"


    // $ANTLR start "rule__DATETIME__Group__1__Impl"
    // InternalMyRds.g:4858:1: rule__DATETIME__Group__1__Impl : ( '-' ) ;
    public final void rule__DATETIME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4862:1: ( ( '-' ) )
            // InternalMyRds.g:4863:1: ( '-' )
            {
            // InternalMyRds.g:4863:1: ( '-' )
            // InternalMyRds.g:4864:2: '-'
            {
             before(grammarAccess.getDATETIMEAccess().getHyphenMinusKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDATETIMEAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATETIME__Group__1__Impl"


    // $ANTLR start "rule__DATETIME__Group__2"
    // InternalMyRds.g:4873:1: rule__DATETIME__Group__2 : rule__DATETIME__Group__2__Impl rule__DATETIME__Group__3 ;
    public final void rule__DATETIME__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4877:1: ( rule__DATETIME__Group__2__Impl rule__DATETIME__Group__3 )
            // InternalMyRds.g:4878:2: rule__DATETIME__Group__2__Impl rule__DATETIME__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__DATETIME__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATETIME__Group__3();

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
    // $ANTLR end "rule__DATETIME__Group__2"


    // $ANTLR start "rule__DATETIME__Group__2__Impl"
    // InternalMyRds.g:4885:1: rule__DATETIME__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DATETIME__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4889:1: ( ( RULE_INT ) )
            // InternalMyRds.g:4890:1: ( RULE_INT )
            {
            // InternalMyRds.g:4890:1: ( RULE_INT )
            // InternalMyRds.g:4891:2: RULE_INT
            {
             before(grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATETIME__Group__2__Impl"


    // $ANTLR start "rule__DATETIME__Group__3"
    // InternalMyRds.g:4900:1: rule__DATETIME__Group__3 : rule__DATETIME__Group__3__Impl rule__DATETIME__Group__4 ;
    public final void rule__DATETIME__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4904:1: ( rule__DATETIME__Group__3__Impl rule__DATETIME__Group__4 )
            // InternalMyRds.g:4905:2: rule__DATETIME__Group__3__Impl rule__DATETIME__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__DATETIME__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATETIME__Group__4();

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
    // $ANTLR end "rule__DATETIME__Group__3"


    // $ANTLR start "rule__DATETIME__Group__3__Impl"
    // InternalMyRds.g:4912:1: rule__DATETIME__Group__3__Impl : ( '-' ) ;
    public final void rule__DATETIME__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4916:1: ( ( '-' ) )
            // InternalMyRds.g:4917:1: ( '-' )
            {
            // InternalMyRds.g:4917:1: ( '-' )
            // InternalMyRds.g:4918:2: '-'
            {
             before(grammarAccess.getDATETIMEAccess().getHyphenMinusKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDATETIMEAccess().getHyphenMinusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATETIME__Group__3__Impl"


    // $ANTLR start "rule__DATETIME__Group__4"
    // InternalMyRds.g:4927:1: rule__DATETIME__Group__4 : rule__DATETIME__Group__4__Impl rule__DATETIME__Group__5 ;
    public final void rule__DATETIME__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4931:1: ( rule__DATETIME__Group__4__Impl rule__DATETIME__Group__5 )
            // InternalMyRds.g:4932:2: rule__DATETIME__Group__4__Impl rule__DATETIME__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__DATETIME__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATETIME__Group__5();

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
    // $ANTLR end "rule__DATETIME__Group__4"


    // $ANTLR start "rule__DATETIME__Group__4__Impl"
    // InternalMyRds.g:4939:1: rule__DATETIME__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__DATETIME__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4943:1: ( ( RULE_INT ) )
            // InternalMyRds.g:4944:1: ( RULE_INT )
            {
            // InternalMyRds.g:4944:1: ( RULE_INT )
            // InternalMyRds.g:4945:2: RULE_INT
            {
             before(grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATETIME__Group__4__Impl"


    // $ANTLR start "rule__DATETIME__Group__5"
    // InternalMyRds.g:4954:1: rule__DATETIME__Group__5 : rule__DATETIME__Group__5__Impl rule__DATETIME__Group__6 ;
    public final void rule__DATETIME__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4958:1: ( rule__DATETIME__Group__5__Impl rule__DATETIME__Group__6 )
            // InternalMyRds.g:4959:2: rule__DATETIME__Group__5__Impl rule__DATETIME__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__DATETIME__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATETIME__Group__6();

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
    // $ANTLR end "rule__DATETIME__Group__5"


    // $ANTLR start "rule__DATETIME__Group__5__Impl"
    // InternalMyRds.g:4966:1: rule__DATETIME__Group__5__Impl : ( RULE_INT ) ;
    public final void rule__DATETIME__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4970:1: ( ( RULE_INT ) )
            // InternalMyRds.g:4971:1: ( RULE_INT )
            {
            // InternalMyRds.g:4971:1: ( RULE_INT )
            // InternalMyRds.g:4972:2: RULE_INT
            {
             before(grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_5()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATETIME__Group__5__Impl"


    // $ANTLR start "rule__DATETIME__Group__6"
    // InternalMyRds.g:4981:1: rule__DATETIME__Group__6 : rule__DATETIME__Group__6__Impl rule__DATETIME__Group__7 ;
    public final void rule__DATETIME__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4985:1: ( rule__DATETIME__Group__6__Impl rule__DATETIME__Group__7 )
            // InternalMyRds.g:4986:2: rule__DATETIME__Group__6__Impl rule__DATETIME__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__DATETIME__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATETIME__Group__7();

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
    // $ANTLR end "rule__DATETIME__Group__6"


    // $ANTLR start "rule__DATETIME__Group__6__Impl"
    // InternalMyRds.g:4993:1: rule__DATETIME__Group__6__Impl : ( ':' ) ;
    public final void rule__DATETIME__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:4997:1: ( ( ':' ) )
            // InternalMyRds.g:4998:1: ( ':' )
            {
            // InternalMyRds.g:4998:1: ( ':' )
            // InternalMyRds.g:4999:2: ':'
            {
             before(grammarAccess.getDATETIMEAccess().getColonKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDATETIMEAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATETIME__Group__6__Impl"


    // $ANTLR start "rule__DATETIME__Group__7"
    // InternalMyRds.g:5008:1: rule__DATETIME__Group__7 : rule__DATETIME__Group__7__Impl ;
    public final void rule__DATETIME__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5012:1: ( rule__DATETIME__Group__7__Impl )
            // InternalMyRds.g:5013:2: rule__DATETIME__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DATETIME__Group__7__Impl();

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
    // $ANTLR end "rule__DATETIME__Group__7"


    // $ANTLR start "rule__DATETIME__Group__7__Impl"
    // InternalMyRds.g:5019:1: rule__DATETIME__Group__7__Impl : ( RULE_INT ) ;
    public final void rule__DATETIME__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5023:1: ( ( RULE_INT ) )
            // InternalMyRds.g:5024:1: ( RULE_INT )
            {
            // InternalMyRds.g:5024:1: ( RULE_INT )
            // InternalMyRds.g:5025:2: RULE_INT
            {
             before(grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_7()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATETIME__Group__7__Impl"


    // $ANTLR start "rule__ADDRESS__Group__0"
    // InternalMyRds.g:5035:1: rule__ADDRESS__Group__0 : rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1 ;
    public final void rule__ADDRESS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5039:1: ( rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1 )
            // InternalMyRds.g:5040:2: rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ADDRESS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__1();

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
    // $ANTLR end "rule__ADDRESS__Group__0"


    // $ANTLR start "rule__ADDRESS__Group__0__Impl"
    // InternalMyRds.g:5047:1: rule__ADDRESS__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__ADDRESS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5051:1: ( ( RULE_INT ) )
            // InternalMyRds.g:5052:1: ( RULE_INT )
            {
            // InternalMyRds.g:5052:1: ( RULE_INT )
            // InternalMyRds.g:5053:2: RULE_INT
            {
             before(grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADDRESS__Group__0__Impl"


    // $ANTLR start "rule__ADDRESS__Group__1"
    // InternalMyRds.g:5062:1: rule__ADDRESS__Group__1 : rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2 ;
    public final void rule__ADDRESS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5066:1: ( rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2 )
            // InternalMyRds.g:5067:2: rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__ADDRESS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__2();

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
    // $ANTLR end "rule__ADDRESS__Group__1"


    // $ANTLR start "rule__ADDRESS__Group__1__Impl"
    // InternalMyRds.g:5074:1: rule__ADDRESS__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__ADDRESS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5078:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:5079:1: ( RULE_STRING )
            {
            // InternalMyRds.g:5079:1: ( RULE_STRING )
            // InternalMyRds.g:5080:2: RULE_STRING
            {
             before(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADDRESS__Group__1__Impl"


    // $ANTLR start "rule__ADDRESS__Group__2"
    // InternalMyRds.g:5089:1: rule__ADDRESS__Group__2 : rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3 ;
    public final void rule__ADDRESS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5093:1: ( rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3 )
            // InternalMyRds.g:5094:2: rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ADDRESS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__3();

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
    // $ANTLR end "rule__ADDRESS__Group__2"


    // $ANTLR start "rule__ADDRESS__Group__2__Impl"
    // InternalMyRds.g:5101:1: rule__ADDRESS__Group__2__Impl : ( ',' ) ;
    public final void rule__ADDRESS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5105:1: ( ( ',' ) )
            // InternalMyRds.g:5106:1: ( ',' )
            {
            // InternalMyRds.g:5106:1: ( ',' )
            // InternalMyRds.g:5107:2: ','
            {
             before(grammarAccess.getADDRESSAccess().getCommaKeyword_2()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADDRESS__Group__2__Impl"


    // $ANTLR start "rule__ADDRESS__Group__3"
    // InternalMyRds.g:5116:1: rule__ADDRESS__Group__3 : rule__ADDRESS__Group__3__Impl ;
    public final void rule__ADDRESS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5120:1: ( rule__ADDRESS__Group__3__Impl )
            // InternalMyRds.g:5121:2: rule__ADDRESS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__3__Impl();

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
    // $ANTLR end "rule__ADDRESS__Group__3"


    // $ANTLR start "rule__ADDRESS__Group__3__Impl"
    // InternalMyRds.g:5127:1: rule__ADDRESS__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__ADDRESS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5131:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:5132:1: ( RULE_STRING )
            {
            // InternalMyRds.g:5132:1: ( RULE_STRING )
            // InternalMyRds.g:5133:2: RULE_STRING
            {
             before(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_3()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADDRESS__Group__3__Impl"


    // $ANTLR start "rule__LICENCE__Group__0"
    // InternalMyRds.g:5143:1: rule__LICENCE__Group__0 : rule__LICENCE__Group__0__Impl rule__LICENCE__Group__1 ;
    public final void rule__LICENCE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5147:1: ( rule__LICENCE__Group__0__Impl rule__LICENCE__Group__1 )
            // InternalMyRds.g:5148:2: rule__LICENCE__Group__0__Impl rule__LICENCE__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__LICENCE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LICENCE__Group__1();

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
    // $ANTLR end "rule__LICENCE__Group__0"


    // $ANTLR start "rule__LICENCE__Group__0__Impl"
    // InternalMyRds.g:5155:1: rule__LICENCE__Group__0__Impl : ( RULE_STRING ) ;
    public final void rule__LICENCE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5159:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:5160:1: ( RULE_STRING )
            {
            // InternalMyRds.g:5160:1: ( RULE_STRING )
            // InternalMyRds.g:5161:2: RULE_STRING
            {
             before(grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LICENCE__Group__0__Impl"


    // $ANTLR start "rule__LICENCE__Group__1"
    // InternalMyRds.g:5170:1: rule__LICENCE__Group__1 : rule__LICENCE__Group__1__Impl rule__LICENCE__Group__2 ;
    public final void rule__LICENCE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5174:1: ( rule__LICENCE__Group__1__Impl rule__LICENCE__Group__2 )
            // InternalMyRds.g:5175:2: rule__LICENCE__Group__1__Impl rule__LICENCE__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__LICENCE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LICENCE__Group__2();

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
    // $ANTLR end "rule__LICENCE__Group__1"


    // $ANTLR start "rule__LICENCE__Group__1__Impl"
    // InternalMyRds.g:5182:1: rule__LICENCE__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__LICENCE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5186:1: ( ( RULE_INT ) )
            // InternalMyRds.g:5187:1: ( RULE_INT )
            {
            // InternalMyRds.g:5187:1: ( RULE_INT )
            // InternalMyRds.g:5188:2: RULE_INT
            {
             before(grammarAccess.getLICENCEAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLICENCEAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LICENCE__Group__1__Impl"


    // $ANTLR start "rule__LICENCE__Group__2"
    // InternalMyRds.g:5197:1: rule__LICENCE__Group__2 : rule__LICENCE__Group__2__Impl rule__LICENCE__Group__3 ;
    public final void rule__LICENCE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5201:1: ( rule__LICENCE__Group__2__Impl rule__LICENCE__Group__3 )
            // InternalMyRds.g:5202:2: rule__LICENCE__Group__2__Impl rule__LICENCE__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__LICENCE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LICENCE__Group__3();

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
    // $ANTLR end "rule__LICENCE__Group__2"


    // $ANTLR start "rule__LICENCE__Group__2__Impl"
    // InternalMyRds.g:5209:1: rule__LICENCE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__LICENCE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5213:1: ( ( RULE_INT ) )
            // InternalMyRds.g:5214:1: ( RULE_INT )
            {
            // InternalMyRds.g:5214:1: ( RULE_INT )
            // InternalMyRds.g:5215:2: RULE_INT
            {
             before(grammarAccess.getLICENCEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLICENCEAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LICENCE__Group__2__Impl"


    // $ANTLR start "rule__LICENCE__Group__3"
    // InternalMyRds.g:5224:1: rule__LICENCE__Group__3 : rule__LICENCE__Group__3__Impl rule__LICENCE__Group__4 ;
    public final void rule__LICENCE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5228:1: ( rule__LICENCE__Group__3__Impl rule__LICENCE__Group__4 )
            // InternalMyRds.g:5229:2: rule__LICENCE__Group__3__Impl rule__LICENCE__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__LICENCE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LICENCE__Group__4();

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
    // $ANTLR end "rule__LICENCE__Group__3"


    // $ANTLR start "rule__LICENCE__Group__3__Impl"
    // InternalMyRds.g:5236:1: rule__LICENCE__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__LICENCE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5240:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:5241:1: ( RULE_STRING )
            {
            // InternalMyRds.g:5241:1: ( RULE_STRING )
            // InternalMyRds.g:5242:2: RULE_STRING
            {
             before(grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_3()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LICENCE__Group__3__Impl"


    // $ANTLR start "rule__LICENCE__Group__4"
    // InternalMyRds.g:5251:1: rule__LICENCE__Group__4 : rule__LICENCE__Group__4__Impl rule__LICENCE__Group__5 ;
    public final void rule__LICENCE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5255:1: ( rule__LICENCE__Group__4__Impl rule__LICENCE__Group__5 )
            // InternalMyRds.g:5256:2: rule__LICENCE__Group__4__Impl rule__LICENCE__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__LICENCE__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LICENCE__Group__5();

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
    // $ANTLR end "rule__LICENCE__Group__4"


    // $ANTLR start "rule__LICENCE__Group__4__Impl"
    // InternalMyRds.g:5263:1: rule__LICENCE__Group__4__Impl : ( RULE_STRING ) ;
    public final void rule__LICENCE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5267:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:5268:1: ( RULE_STRING )
            {
            // InternalMyRds.g:5268:1: ( RULE_STRING )
            // InternalMyRds.g:5269:2: RULE_STRING
            {
             before(grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_4()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LICENCE__Group__4__Impl"


    // $ANTLR start "rule__LICENCE__Group__5"
    // InternalMyRds.g:5278:1: rule__LICENCE__Group__5 : rule__LICENCE__Group__5__Impl ;
    public final void rule__LICENCE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5282:1: ( rule__LICENCE__Group__5__Impl )
            // InternalMyRds.g:5283:2: rule__LICENCE__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LICENCE__Group__5__Impl();

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
    // $ANTLR end "rule__LICENCE__Group__5"


    // $ANTLR start "rule__LICENCE__Group__5__Impl"
    // InternalMyRds.g:5289:1: rule__LICENCE__Group__5__Impl : ( RULE_STRING ) ;
    public final void rule__LICENCE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5293:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:5294:1: ( RULE_STRING )
            {
            // InternalMyRds.g:5294:1: ( RULE_STRING )
            // InternalMyRds.g:5295:2: RULE_STRING
            {
             before(grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_5()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LICENCE__Group__5__Impl"


    // $ANTLR start "rule__RDS__ElementsAssignment"
    // InternalMyRds.g:5305:1: rule__RDS__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__RDS__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5309:1: ( ( ruleAbstractElement ) )
            // InternalMyRds.g:5310:2: ( ruleAbstractElement )
            {
            // InternalMyRds.g:5310:2: ( ruleAbstractElement )
            // InternalMyRds.g:5311:3: ruleAbstractElement
            {
             before(grammarAccess.getRDSAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getRDSAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDS__ElementsAssignment"


    // $ANTLR start "rule__User__IdAssignment_1"
    // InternalMyRds.g:5320:1: rule__User__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5324:1: ( ( RULE_ID ) )
            // InternalMyRds.g:5325:2: ( RULE_ID )
            {
            // InternalMyRds.g:5325:2: ( RULE_ID )
            // InternalMyRds.g:5326:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__IdAssignment_1"


    // $ANTLR start "rule__User__UsernameAssignment_5"
    // InternalMyRds.g:5335:1: rule__User__UsernameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__User__UsernameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5339:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:5340:2: ( RULE_STRING )
            {
            // InternalMyRds.g:5340:2: ( RULE_STRING )
            // InternalMyRds.g:5341:3: RULE_STRING
            {
             before(grammarAccess.getUserAccess().getUsernameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUsernameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__UsernameAssignment_5"


    // $ANTLR start "rule__User__PasswordAssignment_8"
    // InternalMyRds.g:5350:1: rule__User__PasswordAssignment_8 : ( RULE_STRING ) ;
    public final void rule__User__PasswordAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5354:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:5355:2: ( RULE_STRING )
            {
            // InternalMyRds.g:5355:2: ( RULE_STRING )
            // InternalMyRds.g:5356:3: RULE_STRING
            {
             before(grammarAccess.getUserAccess().getPasswordSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getPasswordSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__PasswordAssignment_8"


    // $ANTLR start "rule__User__NameAssignment_11"
    // InternalMyRds.g:5365:1: rule__User__NameAssignment_11 : ( ruleFULLNAME ) ;
    public final void rule__User__NameAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5369:1: ( ( ruleFULLNAME ) )
            // InternalMyRds.g:5370:2: ( ruleFULLNAME )
            {
            // InternalMyRds.g:5370:2: ( ruleFULLNAME )
            // InternalMyRds.g:5371:3: ruleFULLNAME
            {
             before(grammarAccess.getUserAccess().getNameFULLNAMEParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleFULLNAME();

            state._fsp--;

             after(grammarAccess.getUserAccess().getNameFULLNAMEParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__NameAssignment_11"


    // $ANTLR start "rule__User__PhoneAssignment_14"
    // InternalMyRds.g:5380:1: rule__User__PhoneAssignment_14 : ( rulePHONE ) ;
    public final void rule__User__PhoneAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5384:1: ( ( rulePHONE ) )
            // InternalMyRds.g:5385:2: ( rulePHONE )
            {
            // InternalMyRds.g:5385:2: ( rulePHONE )
            // InternalMyRds.g:5386:3: rulePHONE
            {
             before(grammarAccess.getUserAccess().getPhonePHONEParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            rulePHONE();

            state._fsp--;

             after(grammarAccess.getUserAccess().getPhonePHONEParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__PhoneAssignment_14"


    // $ANTLR start "rule__User__EmailAssignment_17"
    // InternalMyRds.g:5395:1: rule__User__EmailAssignment_17 : ( ruleEMAIL ) ;
    public final void rule__User__EmailAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5399:1: ( ( ruleEMAIL ) )
            // InternalMyRds.g:5400:2: ( ruleEMAIL )
            {
            // InternalMyRds.g:5400:2: ( ruleEMAIL )
            // InternalMyRds.g:5401:3: ruleEMAIL
            {
             before(grammarAccess.getUserAccess().getEmailEMAILParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleEMAIL();

            state._fsp--;

             after(grammarAccess.getUserAccess().getEmailEMAILParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__EmailAssignment_17"


    // $ANTLR start "rule__User__ElementsAssignment_18"
    // InternalMyRds.g:5410:1: rule__User__ElementsAssignment_18 : ( ( RULE_ID ) ) ;
    public final void rule__User__ElementsAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5414:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5415:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5415:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5416:3: ( RULE_ID )
            {
             before(grammarAccess.getUserAccess().getElementsUserRoleCrossReference_18_0()); 
            // InternalMyRds.g:5417:3: ( RULE_ID )
            // InternalMyRds.g:5418:4: RULE_ID
            {
             before(grammarAccess.getUserAccess().getElementsUserRoleIDTerminalRuleCall_18_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getElementsUserRoleIDTerminalRuleCall_18_0_1()); 

            }

             after(grammarAccess.getUserAccess().getElementsUserRoleCrossReference_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__ElementsAssignment_18"


    // $ANTLR start "rule__Customer__IdAssignment_1"
    // InternalMyRds.g:5429:1: rule__Customer__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Customer__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5433:1: ( ( RULE_ID ) )
            // InternalMyRds.g:5434:2: ( RULE_ID )
            {
            // InternalMyRds.g:5434:2: ( RULE_ID )
            // InternalMyRds.g:5435:3: RULE_ID
            {
             before(grammarAccess.getCustomerAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__IdAssignment_1"


    // $ANTLR start "rule__Customer__OrdersAssignment_3"
    // InternalMyRds.g:5444:1: rule__Customer__OrdersAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Customer__OrdersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5448:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5449:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5449:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5450:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomerAccess().getOrdersOrderCrossReference_3_0()); 
            // InternalMyRds.g:5451:3: ( RULE_ID )
            // InternalMyRds.g:5452:4: RULE_ID
            {
             before(grammarAccess.getCustomerAccess().getOrdersOrderIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getOrdersOrderIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCustomerAccess().getOrdersOrderCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__OrdersAssignment_3"


    // $ANTLR start "rule__DeliveryDriver__IdAssignment_1"
    // InternalMyRds.g:5463:1: rule__DeliveryDriver__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__DeliveryDriver__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5467:1: ( ( RULE_ID ) )
            // InternalMyRds.g:5468:2: ( RULE_ID )
            {
            // InternalMyRds.g:5468:2: ( RULE_ID )
            // InternalMyRds.g:5469:3: RULE_ID
            {
             before(grammarAccess.getDeliveryDriverAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryDriverAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__IdAssignment_1"


    // $ANTLR start "rule__DeliveryDriver__IsAvailableAssignment_5"
    // InternalMyRds.g:5478:1: rule__DeliveryDriver__IsAvailableAssignment_5 : ( RULE_INT ) ;
    public final void rule__DeliveryDriver__IsAvailableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5482:1: ( ( RULE_INT ) )
            // InternalMyRds.g:5483:2: ( RULE_INT )
            {
            // InternalMyRds.g:5483:2: ( RULE_INT )
            // InternalMyRds.g:5484:3: RULE_INT
            {
             before(grammarAccess.getDeliveryDriverAccess().getIsAvailableINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeliveryDriverAccess().getIsAvailableINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__IsAvailableAssignment_5"


    // $ANTLR start "rule__DeliveryDriver__CarLicenceNumberAssignment_8"
    // InternalMyRds.g:5493:1: rule__DeliveryDriver__CarLicenceNumberAssignment_8 : ( ruleLICENCE ) ;
    public final void rule__DeliveryDriver__CarLicenceNumberAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5497:1: ( ( ruleLICENCE ) )
            // InternalMyRds.g:5498:2: ( ruleLICENCE )
            {
            // InternalMyRds.g:5498:2: ( ruleLICENCE )
            // InternalMyRds.g:5499:3: ruleLICENCE
            {
             before(grammarAccess.getDeliveryDriverAccess().getCarLicenceNumberLICENCEParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleLICENCE();

            state._fsp--;

             after(grammarAccess.getDeliveryDriverAccess().getCarLicenceNumberLICENCEParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__CarLicenceNumberAssignment_8"


    // $ANTLR start "rule__DeliveryDriver__OrdersAssignment_9"
    // InternalMyRds.g:5508:1: rule__DeliveryDriver__OrdersAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryDriver__OrdersAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5512:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5513:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5513:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5514:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryDriverAccess().getOrdersOrderCrossReference_9_0()); 
            // InternalMyRds.g:5515:3: ( RULE_ID )
            // InternalMyRds.g:5516:4: RULE_ID
            {
             before(grammarAccess.getDeliveryDriverAccess().getOrdersOrderIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryDriverAccess().getOrdersOrderIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getDeliveryDriverAccess().getOrdersOrderCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryDriver__OrdersAssignment_9"


    // $ANTLR start "rule__Order__IdAssignment_1"
    // InternalMyRds.g:5527:1: rule__Order__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Order__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5531:1: ( ( RULE_ID ) )
            // InternalMyRds.g:5532:2: ( RULE_ID )
            {
            // InternalMyRds.g:5532:2: ( RULE_ID )
            // InternalMyRds.g:5533:3: RULE_ID
            {
             before(grammarAccess.getOrderAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__IdAssignment_1"


    // $ANTLR start "rule__Order__OrderNumberAssignment_5"
    // InternalMyRds.g:5542:1: rule__Order__OrderNumberAssignment_5 : ( RULE_INT ) ;
    public final void rule__Order__OrderNumberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5546:1: ( ( RULE_INT ) )
            // InternalMyRds.g:5547:2: ( RULE_INT )
            {
            // InternalMyRds.g:5547:2: ( RULE_INT )
            // InternalMyRds.g:5548:3: RULE_INT
            {
             before(grammarAccess.getOrderAccess().getOrderNumberINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getOrderNumberINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__OrderNumberAssignment_5"


    // $ANTLR start "rule__Order__StatusAssignment_8"
    // InternalMyRds.g:5557:1: rule__Order__StatusAssignment_8 : ( ruleOrderStatus ) ;
    public final void rule__Order__StatusAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5561:1: ( ( ruleOrderStatus ) )
            // InternalMyRds.g:5562:2: ( ruleOrderStatus )
            {
            // InternalMyRds.g:5562:2: ( ruleOrderStatus )
            // InternalMyRds.g:5563:3: ruleOrderStatus
            {
             before(grammarAccess.getOrderAccess().getStatusOrderStatusEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderStatus();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getStatusOrderStatusEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__StatusAssignment_8"


    // $ANTLR start "rule__Order__DeliveryAddressAssignment_11"
    // InternalMyRds.g:5572:1: rule__Order__DeliveryAddressAssignment_11 : ( ruleADDRESS ) ;
    public final void rule__Order__DeliveryAddressAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5576:1: ( ( ruleADDRESS ) )
            // InternalMyRds.g:5577:2: ( ruleADDRESS )
            {
            // InternalMyRds.g:5577:2: ( ruleADDRESS )
            // InternalMyRds.g:5578:3: ruleADDRESS
            {
             before(grammarAccess.getOrderAccess().getDeliveryAddressADDRESSParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleADDRESS();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getDeliveryAddressADDRESSParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__DeliveryAddressAssignment_11"


    // $ANTLR start "rule__Order__OrderedDatetimeAssignment_14"
    // InternalMyRds.g:5587:1: rule__Order__OrderedDatetimeAssignment_14 : ( ruleDATETIME ) ;
    public final void rule__Order__OrderedDatetimeAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5591:1: ( ( ruleDATETIME ) )
            // InternalMyRds.g:5592:2: ( ruleDATETIME )
            {
            // InternalMyRds.g:5592:2: ( ruleDATETIME )
            // InternalMyRds.g:5593:3: ruleDATETIME
            {
             before(grammarAccess.getOrderAccess().getOrderedDatetimeDATETIMEParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleDATETIME();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getOrderedDatetimeDATETIMEParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__OrderedDatetimeAssignment_14"


    // $ANTLR start "rule__Order__DeliveredDatetimeAssignment_17"
    // InternalMyRds.g:5602:1: rule__Order__DeliveredDatetimeAssignment_17 : ( ruleDATETIME ) ;
    public final void rule__Order__DeliveredDatetimeAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5606:1: ( ( ruleDATETIME ) )
            // InternalMyRds.g:5607:2: ( ruleDATETIME )
            {
            // InternalMyRds.g:5607:2: ( ruleDATETIME )
            // InternalMyRds.g:5608:3: ruleDATETIME
            {
             before(grammarAccess.getOrderAccess().getDeliveredDatetimeDATETIMEParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleDATETIME();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getDeliveredDatetimeDATETIMEParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__DeliveredDatetimeAssignment_17"


    // $ANTLR start "rule__Order__RequestedDeliveryDatetimeAssignment_20"
    // InternalMyRds.g:5617:1: rule__Order__RequestedDeliveryDatetimeAssignment_20 : ( ruleDATETIME ) ;
    public final void rule__Order__RequestedDeliveryDatetimeAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5621:1: ( ( ruleDATETIME ) )
            // InternalMyRds.g:5622:2: ( ruleDATETIME )
            {
            // InternalMyRds.g:5622:2: ( ruleDATETIME )
            // InternalMyRds.g:5623:3: ruleDATETIME
            {
             before(grammarAccess.getOrderAccess().getRequestedDeliveryDatetimeDATETIMEParserRuleCall_20_0()); 
            pushFollow(FOLLOW_2);
            ruleDATETIME();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getRequestedDeliveryDatetimeDATETIMEParserRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__RequestedDeliveryDatetimeAssignment_20"


    // $ANTLR start "rule__Order__OrderItemsAssignment_21"
    // InternalMyRds.g:5632:1: rule__Order__OrderItemsAssignment_21 : ( ( RULE_ID ) ) ;
    public final void rule__Order__OrderItemsAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5636:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5637:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5637:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5638:3: ( RULE_ID )
            {
             before(grammarAccess.getOrderAccess().getOrderItemsOrderItemCrossReference_21_0()); 
            // InternalMyRds.g:5639:3: ( RULE_ID )
            // InternalMyRds.g:5640:4: RULE_ID
            {
             before(grammarAccess.getOrderAccess().getOrderItemsOrderItemIDTerminalRuleCall_21_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getOrderItemsOrderItemIDTerminalRuleCall_21_0_1()); 

            }

             after(grammarAccess.getOrderAccess().getOrderItemsOrderItemCrossReference_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__OrderItemsAssignment_21"


    // $ANTLR start "rule__Order__ReviewAssignment_24"
    // InternalMyRds.g:5651:1: rule__Order__ReviewAssignment_24 : ( ( RULE_ID ) ) ;
    public final void rule__Order__ReviewAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5655:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5656:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5656:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5657:3: ( RULE_ID )
            {
             before(grammarAccess.getOrderAccess().getReviewReviewCrossReference_24_0()); 
            // InternalMyRds.g:5658:3: ( RULE_ID )
            // InternalMyRds.g:5659:4: RULE_ID
            {
             before(grammarAccess.getOrderAccess().getReviewReviewIDTerminalRuleCall_24_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getReviewReviewIDTerminalRuleCall_24_0_1()); 

            }

             after(grammarAccess.getOrderAccess().getReviewReviewCrossReference_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__ReviewAssignment_24"


    // $ANTLR start "rule__Order__CustomerAssignment_27"
    // InternalMyRds.g:5670:1: rule__Order__CustomerAssignment_27 : ( ( RULE_ID ) ) ;
    public final void rule__Order__CustomerAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5674:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5675:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5675:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5676:3: ( RULE_ID )
            {
             before(grammarAccess.getOrderAccess().getCustomerCustomerCrossReference_27_0()); 
            // InternalMyRds.g:5677:3: ( RULE_ID )
            // InternalMyRds.g:5678:4: RULE_ID
            {
             before(grammarAccess.getOrderAccess().getCustomerCustomerIDTerminalRuleCall_27_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getCustomerCustomerIDTerminalRuleCall_27_0_1()); 

            }

             after(grammarAccess.getOrderAccess().getCustomerCustomerCrossReference_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__CustomerAssignment_27"


    // $ANTLR start "rule__Order__DeliveryDriverAssignment_30"
    // InternalMyRds.g:5689:1: rule__Order__DeliveryDriverAssignment_30 : ( ( RULE_ID ) ) ;
    public final void rule__Order__DeliveryDriverAssignment_30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5693:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5694:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5694:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5695:3: ( RULE_ID )
            {
             before(grammarAccess.getOrderAccess().getDeliveryDriverDeliveryDriverCrossReference_30_0()); 
            // InternalMyRds.g:5696:3: ( RULE_ID )
            // InternalMyRds.g:5697:4: RULE_ID
            {
             before(grammarAccess.getOrderAccess().getDeliveryDriverDeliveryDriverIDTerminalRuleCall_30_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getDeliveryDriverDeliveryDriverIDTerminalRuleCall_30_0_1()); 

            }

             after(grammarAccess.getOrderAccess().getDeliveryDriverDeliveryDriverCrossReference_30_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__DeliveryDriverAssignment_30"


    // $ANTLR start "rule__Restaurant__IdAssignment_1"
    // InternalMyRds.g:5708:1: rule__Restaurant__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Restaurant__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5712:1: ( ( RULE_ID ) )
            // InternalMyRds.g:5713:2: ( RULE_ID )
            {
            // InternalMyRds.g:5713:2: ( RULE_ID )
            // InternalMyRds.g:5714:3: RULE_ID
            {
             before(grammarAccess.getRestaurantAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__IdAssignment_1"


    // $ANTLR start "rule__Restaurant__NameAssignment_5"
    // InternalMyRds.g:5723:1: rule__Restaurant__NameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Restaurant__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5727:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:5728:2: ( RULE_STRING )
            {
            // InternalMyRds.g:5728:2: ( RULE_STRING )
            // InternalMyRds.g:5729:3: RULE_STRING
            {
             before(grammarAccess.getRestaurantAccess().getNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getNameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__NameAssignment_5"


    // $ANTLR start "rule__Restaurant__AddressAssignment_8"
    // InternalMyRds.g:5738:1: rule__Restaurant__AddressAssignment_8 : ( ruleADDRESS ) ;
    public final void rule__Restaurant__AddressAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5742:1: ( ( ruleADDRESS ) )
            // InternalMyRds.g:5743:2: ( ruleADDRESS )
            {
            // InternalMyRds.g:5743:2: ( ruleADDRESS )
            // InternalMyRds.g:5744:3: ruleADDRESS
            {
             before(grammarAccess.getRestaurantAccess().getAddressADDRESSParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleADDRESS();

            state._fsp--;

             after(grammarAccess.getRestaurantAccess().getAddressADDRESSParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__AddressAssignment_8"


    // $ANTLR start "rule__Restaurant__MenuAssignment_11"
    // InternalMyRds.g:5753:1: rule__Restaurant__MenuAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Restaurant__MenuAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5757:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5758:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5758:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5759:3: ( RULE_ID )
            {
             before(grammarAccess.getRestaurantAccess().getMenuMenuCrossReference_11_0()); 
            // InternalMyRds.g:5760:3: ( RULE_ID )
            // InternalMyRds.g:5761:4: RULE_ID
            {
             before(grammarAccess.getRestaurantAccess().getMenuMenuIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getMenuMenuIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getRestaurantAccess().getMenuMenuCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__MenuAssignment_11"


    // $ANTLR start "rule__Menu__IdAssignment_1"
    // InternalMyRds.g:5772:1: rule__Menu__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Menu__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5776:1: ( ( RULE_ID ) )
            // InternalMyRds.g:5777:2: ( RULE_ID )
            {
            // InternalMyRds.g:5777:2: ( RULE_ID )
            // InternalMyRds.g:5778:3: RULE_ID
            {
             before(grammarAccess.getMenuAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__IdAssignment_1"


    // $ANTLR start "rule__Menu__RestaurantAssignment_5"
    // InternalMyRds.g:5787:1: rule__Menu__RestaurantAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Menu__RestaurantAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5791:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5792:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5792:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5793:3: ( RULE_ID )
            {
             before(grammarAccess.getMenuAccess().getRestaurantRestaurantCrossReference_5_0()); 
            // InternalMyRds.g:5794:3: ( RULE_ID )
            // InternalMyRds.g:5795:4: RULE_ID
            {
             before(grammarAccess.getMenuAccess().getRestaurantRestaurantIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getRestaurantRestaurantIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMenuAccess().getRestaurantRestaurantCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__RestaurantAssignment_5"


    // $ANTLR start "rule__Menu__MenuItemsAssignment_6"
    // InternalMyRds.g:5806:1: rule__Menu__MenuItemsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Menu__MenuItemsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5810:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5811:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5811:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5812:3: ( RULE_ID )
            {
             before(grammarAccess.getMenuAccess().getMenuItemsMenuItemCrossReference_6_0()); 
            // InternalMyRds.g:5813:3: ( RULE_ID )
            // InternalMyRds.g:5814:4: RULE_ID
            {
             before(grammarAccess.getMenuAccess().getMenuItemsMenuItemIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getMenuItemsMenuItemIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getMenuAccess().getMenuItemsMenuItemCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__MenuItemsAssignment_6"


    // $ANTLR start "rule__MenuItem__IdAssignment_1"
    // InternalMyRds.g:5825:1: rule__MenuItem__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__MenuItem__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5829:1: ( ( RULE_ID ) )
            // InternalMyRds.g:5830:2: ( RULE_ID )
            {
            // InternalMyRds.g:5830:2: ( RULE_ID )
            // InternalMyRds.g:5831:3: RULE_ID
            {
             before(grammarAccess.getMenuItemAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__IdAssignment_1"


    // $ANTLR start "rule__MenuItem__NameAssignment_5"
    // InternalMyRds.g:5840:1: rule__MenuItem__NameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__MenuItem__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5844:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:5845:2: ( RULE_STRING )
            {
            // InternalMyRds.g:5845:2: ( RULE_STRING )
            // InternalMyRds.g:5846:3: RULE_STRING
            {
             before(grammarAccess.getMenuItemAccess().getNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getNameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__NameAssignment_5"


    // $ANTLR start "rule__MenuItem__PriceAssignment_8"
    // InternalMyRds.g:5855:1: rule__MenuItem__PriceAssignment_8 : ( ruleDECIMAL ) ;
    public final void rule__MenuItem__PriceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5859:1: ( ( ruleDECIMAL ) )
            // InternalMyRds.g:5860:2: ( ruleDECIMAL )
            {
            // InternalMyRds.g:5860:2: ( ruleDECIMAL )
            // InternalMyRds.g:5861:3: ruleDECIMAL
            {
             before(grammarAccess.getMenuItemAccess().getPriceDECIMALParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getMenuItemAccess().getPriceDECIMALParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__PriceAssignment_8"


    // $ANTLR start "rule__MenuItem__DescriptionAssignment_11"
    // InternalMyRds.g:5870:1: rule__MenuItem__DescriptionAssignment_11 : ( RULE_STRING ) ;
    public final void rule__MenuItem__DescriptionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5874:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:5875:2: ( RULE_STRING )
            {
            // InternalMyRds.g:5875:2: ( RULE_STRING )
            // InternalMyRds.g:5876:3: RULE_STRING
            {
             before(grammarAccess.getMenuItemAccess().getDescriptionSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getDescriptionSTRINGTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__DescriptionAssignment_11"


    // $ANTLR start "rule__MenuItem__CategoryAssignment_14"
    // InternalMyRds.g:5885:1: rule__MenuItem__CategoryAssignment_14 : ( ruleMenuItemCategory ) ;
    public final void rule__MenuItem__CategoryAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5889:1: ( ( ruleMenuItemCategory ) )
            // InternalMyRds.g:5890:2: ( ruleMenuItemCategory )
            {
            // InternalMyRds.g:5890:2: ( ruleMenuItemCategory )
            // InternalMyRds.g:5891:3: ruleMenuItemCategory
            {
             before(grammarAccess.getMenuItemAccess().getCategoryMenuItemCategoryEnumRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleMenuItemCategory();

            state._fsp--;

             after(grammarAccess.getMenuItemAccess().getCategoryMenuItemCategoryEnumRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__CategoryAssignment_14"


    // $ANTLR start "rule__MenuItem__OrderItemsAssignment_15"
    // InternalMyRds.g:5900:1: rule__MenuItem__OrderItemsAssignment_15 : ( ( RULE_ID ) ) ;
    public final void rule__MenuItem__OrderItemsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5904:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5905:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5905:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5906:3: ( RULE_ID )
            {
             before(grammarAccess.getMenuItemAccess().getOrderItemsOrderItemCrossReference_15_0()); 
            // InternalMyRds.g:5907:3: ( RULE_ID )
            // InternalMyRds.g:5908:4: RULE_ID
            {
             before(grammarAccess.getMenuItemAccess().getOrderItemsOrderItemIDTerminalRuleCall_15_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getOrderItemsOrderItemIDTerminalRuleCall_15_0_1()); 

            }

             after(grammarAccess.getMenuItemAccess().getOrderItemsOrderItemCrossReference_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__OrderItemsAssignment_15"


    // $ANTLR start "rule__MenuItem__MenuAssignment_18"
    // InternalMyRds.g:5919:1: rule__MenuItem__MenuAssignment_18 : ( ( RULE_ID ) ) ;
    public final void rule__MenuItem__MenuAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5923:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5924:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5924:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5925:3: ( RULE_ID )
            {
             before(grammarAccess.getMenuItemAccess().getMenuMenuCrossReference_18_0()); 
            // InternalMyRds.g:5926:3: ( RULE_ID )
            // InternalMyRds.g:5927:4: RULE_ID
            {
             before(grammarAccess.getMenuItemAccess().getMenuMenuIDTerminalRuleCall_18_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMenuItemAccess().getMenuMenuIDTerminalRuleCall_18_0_1()); 

            }

             after(grammarAccess.getMenuItemAccess().getMenuMenuCrossReference_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MenuItem__MenuAssignment_18"


    // $ANTLR start "rule__OrderItem__IdAssignment_1"
    // InternalMyRds.g:5938:1: rule__OrderItem__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__OrderItem__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5942:1: ( ( RULE_ID ) )
            // InternalMyRds.g:5943:2: ( RULE_ID )
            {
            // InternalMyRds.g:5943:2: ( RULE_ID )
            // InternalMyRds.g:5944:3: RULE_ID
            {
             before(grammarAccess.getOrderItemAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__IdAssignment_1"


    // $ANTLR start "rule__OrderItem__QuantityAssignment_5"
    // InternalMyRds.g:5953:1: rule__OrderItem__QuantityAssignment_5 : ( RULE_INT ) ;
    public final void rule__OrderItem__QuantityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5957:1: ( ( RULE_INT ) )
            // InternalMyRds.g:5958:2: ( RULE_INT )
            {
            // InternalMyRds.g:5958:2: ( RULE_INT )
            // InternalMyRds.g:5959:3: RULE_INT
            {
             before(grammarAccess.getOrderItemAccess().getQuantityINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getQuantityINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__QuantityAssignment_5"


    // $ANTLR start "rule__OrderItem__ForOrderAssignment_8"
    // InternalMyRds.g:5968:1: rule__OrderItem__ForOrderAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__OrderItem__ForOrderAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5972:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5973:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5973:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5974:3: ( RULE_ID )
            {
             before(grammarAccess.getOrderItemAccess().getForOrderOrderCrossReference_8_0()); 
            // InternalMyRds.g:5975:3: ( RULE_ID )
            // InternalMyRds.g:5976:4: RULE_ID
            {
             before(grammarAccess.getOrderItemAccess().getForOrderOrderIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getForOrderOrderIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getOrderItemAccess().getForOrderOrderCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__ForOrderAssignment_8"


    // $ANTLR start "rule__OrderItem__MenuItemAssignment_11"
    // InternalMyRds.g:5987:1: rule__OrderItem__MenuItemAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__OrderItem__MenuItemAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:5991:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:5992:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:5992:2: ( ( RULE_ID ) )
            // InternalMyRds.g:5993:3: ( RULE_ID )
            {
             before(grammarAccess.getOrderItemAccess().getMenuItemMenuItemCrossReference_11_0()); 
            // InternalMyRds.g:5994:3: ( RULE_ID )
            // InternalMyRds.g:5995:4: RULE_ID
            {
             before(grammarAccess.getOrderItemAccess().getMenuItemMenuItemIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOrderItemAccess().getMenuItemMenuItemIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getOrderItemAccess().getMenuItemMenuItemCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderItem__MenuItemAssignment_11"


    // $ANTLR start "rule__Review__IdAssignment_1"
    // InternalMyRds.g:6006:1: rule__Review__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Review__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:6010:1: ( ( RULE_ID ) )
            // InternalMyRds.g:6011:2: ( RULE_ID )
            {
            // InternalMyRds.g:6011:2: ( RULE_ID )
            // InternalMyRds.g:6012:3: RULE_ID
            {
             before(grammarAccess.getReviewAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__IdAssignment_1"


    // $ANTLR start "rule__Review__NumStarsAssignment_5"
    // InternalMyRds.g:6021:1: rule__Review__NumStarsAssignment_5 : ( RULE_INT ) ;
    public final void rule__Review__NumStarsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:6025:1: ( ( RULE_INT ) )
            // InternalMyRds.g:6026:2: ( RULE_INT )
            {
            // InternalMyRds.g:6026:2: ( RULE_INT )
            // InternalMyRds.g:6027:3: RULE_INT
            {
             before(grammarAccess.getReviewAccess().getNumStarsINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getNumStarsINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__NumStarsAssignment_5"


    // $ANTLR start "rule__Review__DescriptionAssignment_8"
    // InternalMyRds.g:6036:1: rule__Review__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Review__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:6040:1: ( ( RULE_STRING ) )
            // InternalMyRds.g:6041:2: ( RULE_STRING )
            {
            // InternalMyRds.g:6041:2: ( RULE_STRING )
            // InternalMyRds.g:6042:3: RULE_STRING
            {
             before(grammarAccess.getReviewAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__DescriptionAssignment_8"


    // $ANTLR start "rule__Review__ReviewDatetimeAssignment_11"
    // InternalMyRds.g:6051:1: rule__Review__ReviewDatetimeAssignment_11 : ( ruleDATETIME ) ;
    public final void rule__Review__ReviewDatetimeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:6055:1: ( ( ruleDATETIME ) )
            // InternalMyRds.g:6056:2: ( ruleDATETIME )
            {
            // InternalMyRds.g:6056:2: ( ruleDATETIME )
            // InternalMyRds.g:6057:3: ruleDATETIME
            {
             before(grammarAccess.getReviewAccess().getReviewDatetimeDATETIMEParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleDATETIME();

            state._fsp--;

             after(grammarAccess.getReviewAccess().getReviewDatetimeDATETIMEParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__ReviewDatetimeAssignment_11"


    // $ANTLR start "rule__Review__ReviewedOrderAssignment_14"
    // InternalMyRds.g:6066:1: rule__Review__ReviewedOrderAssignment_14 : ( ( RULE_ID ) ) ;
    public final void rule__Review__ReviewedOrderAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyRds.g:6070:1: ( ( ( RULE_ID ) ) )
            // InternalMyRds.g:6071:2: ( ( RULE_ID ) )
            {
            // InternalMyRds.g:6071:2: ( ( RULE_ID ) )
            // InternalMyRds.g:6072:3: ( RULE_ID )
            {
             before(grammarAccess.getReviewAccess().getReviewedOrderOrderCrossReference_14_0()); 
            // InternalMyRds.g:6073:3: ( RULE_ID )
            // InternalMyRds.g:6074:4: RULE_ID
            {
             before(grammarAccess.getReviewAccess().getReviewedOrderOrderIDTerminalRuleCall_14_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getReviewedOrderOrderIDTerminalRuleCall_14_0_1()); 

            }

             after(grammarAccess.getReviewAccess().getReviewedOrderOrderCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__ReviewedOrderAssignment_14"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x02229004C0200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});

}