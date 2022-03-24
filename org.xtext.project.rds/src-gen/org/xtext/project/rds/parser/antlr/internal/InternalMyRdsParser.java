package org.xtext.project.rds.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.project.rds.services.MyRdsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyRdsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'user'", "'{'", "'username'", "':'", "'password'", "'name'", "'phone'", "'email'", "'}'", "'Customer'", "'DeliveryDriver'", "'isAvailable'", "'carLicenceNumber'", "'Order'", "'orderNumber'", "'status'", "'deliveryAddress'", "'orderedDatetime'", "'deliveredDatetime'", "'requestedDeliveryDatetime'", "'review'", "'customer'", "'deliveryDriver'", "'Restaurant'", "'address'", "'menu'", "'Menu'", "'restaurant'", "'MenuItem'", "'price'", "'description'", "'category'", "'OrderItem'", "'quantity'", "'order'", "'menuItem'", "'Review'", "'numStars'", "'reviewDatetime'", "'.'", "'-'", "'@'", "'.com'", "','", "'accepted'", "'preparation'", "'ready_pickup'", "'picked_up'", "'delivered'", "'appetizer'", "'side_dish'", "'main_dish'", "'dessert'", "'drink'"
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
    public static final int RULE_ID=4;
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

        public InternalMyRdsParser(TokenStream input, MyRdsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RDS";
       	}

       	@Override
       	protected MyRdsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRDS"
    // InternalMyRds.g:65:1: entryRuleRDS returns [EObject current=null] : iv_ruleRDS= ruleRDS EOF ;
    public final EObject entryRuleRDS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDS = null;


        try {
            // InternalMyRds.g:65:44: (iv_ruleRDS= ruleRDS EOF )
            // InternalMyRds.g:66:2: iv_ruleRDS= ruleRDS EOF
            {
             newCompositeNode(grammarAccess.getRDSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRDS=ruleRDS();

            state._fsp--;

             current =iv_ruleRDS; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRDS"


    // $ANTLR start "ruleRDS"
    // InternalMyRds.g:72:1: ruleRDS returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleRDS() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:78:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalMyRds.g:79:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalMyRds.g:79:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=20 && LA1_0<=21)||LA1_0==24||LA1_0==34||LA1_0==37||LA1_0==39||LA1_0==43||LA1_0==47) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyRds.g:80:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalMyRds.g:80:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalMyRds.g:81:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getRDSAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRDSRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.project.rds.MyRds.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleRDS"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalMyRds.g:101:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalMyRds.g:101:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalMyRds.g:102:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalMyRds.g:108:1: ruleAbstractElement returns [EObject current=null] : (this_User_0= ruleUser | this_Order_1= ruleOrder | this_UserRole_2= ruleUserRole | this_Restaurant_3= ruleRestaurant | this_OrderItem_4= ruleOrderItem | this_MenuItem_5= ruleMenuItem | this_Review_6= ruleReview | this_Menu_7= ruleMenu ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_User_0 = null;

        EObject this_Order_1 = null;

        EObject this_UserRole_2 = null;

        EObject this_Restaurant_3 = null;

        EObject this_OrderItem_4 = null;

        EObject this_MenuItem_5 = null;

        EObject this_Review_6 = null;

        EObject this_Menu_7 = null;



        	enterRule();

        try {
            // InternalMyRds.g:114:2: ( (this_User_0= ruleUser | this_Order_1= ruleOrder | this_UserRole_2= ruleUserRole | this_Restaurant_3= ruleRestaurant | this_OrderItem_4= ruleOrderItem | this_MenuItem_5= ruleMenuItem | this_Review_6= ruleReview | this_Menu_7= ruleMenu ) )
            // InternalMyRds.g:115:2: (this_User_0= ruleUser | this_Order_1= ruleOrder | this_UserRole_2= ruleUserRole | this_Restaurant_3= ruleRestaurant | this_OrderItem_4= ruleOrderItem | this_MenuItem_5= ruleMenuItem | this_Review_6= ruleReview | this_Menu_7= ruleMenu )
            {
            // InternalMyRds.g:115:2: (this_User_0= ruleUser | this_Order_1= ruleOrder | this_UserRole_2= ruleUserRole | this_Restaurant_3= ruleRestaurant | this_OrderItem_4= ruleOrderItem | this_MenuItem_5= ruleMenuItem | this_Review_6= ruleReview | this_Menu_7= ruleMenu )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 20:
            case 21:
                {
                alt2=3;
                }
                break;
            case 34:
                {
                alt2=4;
                }
                break;
            case 43:
                {
                alt2=5;
                }
                break;
            case 39:
                {
                alt2=6;
                }
                break;
            case 47:
                {
                alt2=7;
                }
                break;
            case 37:
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
                    // InternalMyRds.g:116:3: this_User_0= ruleUser
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getUserParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_User_0=ruleUser();

                    state._fsp--;


                    			current = this_User_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyRds.g:125:3: this_Order_1= ruleOrder
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getOrderParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Order_1=ruleOrder();

                    state._fsp--;


                    			current = this_Order_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyRds.g:134:3: this_UserRole_2= ruleUserRole
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getUserRoleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UserRole_2=ruleUserRole();

                    state._fsp--;


                    			current = this_UserRole_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyRds.g:143:3: this_Restaurant_3= ruleRestaurant
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getRestaurantParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Restaurant_3=ruleRestaurant();

                    state._fsp--;


                    			current = this_Restaurant_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyRds.g:152:3: this_OrderItem_4= ruleOrderItem
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getOrderItemParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrderItem_4=ruleOrderItem();

                    state._fsp--;


                    			current = this_OrderItem_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyRds.g:161:3: this_MenuItem_5= ruleMenuItem
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getMenuItemParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MenuItem_5=ruleMenuItem();

                    state._fsp--;


                    			current = this_MenuItem_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyRds.g:170:3: this_Review_6= ruleReview
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getReviewParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Review_6=ruleReview();

                    state._fsp--;


                    			current = this_Review_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyRds.g:179:3: this_Menu_7= ruleMenu
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getMenuParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Menu_7=ruleMenu();

                    state._fsp--;


                    			current = this_Menu_7;
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleUserRole"
    // InternalMyRds.g:191:1: entryRuleUserRole returns [EObject current=null] : iv_ruleUserRole= ruleUserRole EOF ;
    public final EObject entryRuleUserRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserRole = null;


        try {
            // InternalMyRds.g:191:49: (iv_ruleUserRole= ruleUserRole EOF )
            // InternalMyRds.g:192:2: iv_ruleUserRole= ruleUserRole EOF
            {
             newCompositeNode(grammarAccess.getUserRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserRole=ruleUserRole();

            state._fsp--;

             current =iv_ruleUserRole; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUserRole"


    // $ANTLR start "ruleUserRole"
    // InternalMyRds.g:198:1: ruleUserRole returns [EObject current=null] : (this_Customer_0= ruleCustomer | this_DeliveryDriver_1= ruleDeliveryDriver ) ;
    public final EObject ruleUserRole() throws RecognitionException {
        EObject current = null;

        EObject this_Customer_0 = null;

        EObject this_DeliveryDriver_1 = null;



        	enterRule();

        try {
            // InternalMyRds.g:204:2: ( (this_Customer_0= ruleCustomer | this_DeliveryDriver_1= ruleDeliveryDriver ) )
            // InternalMyRds.g:205:2: (this_Customer_0= ruleCustomer | this_DeliveryDriver_1= ruleDeliveryDriver )
            {
            // InternalMyRds.g:205:2: (this_Customer_0= ruleCustomer | this_DeliveryDriver_1= ruleDeliveryDriver )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyRds.g:206:3: this_Customer_0= ruleCustomer
                    {

                    			newCompositeNode(grammarAccess.getUserRoleAccess().getCustomerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Customer_0=ruleCustomer();

                    state._fsp--;


                    			current = this_Customer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyRds.g:215:3: this_DeliveryDriver_1= ruleDeliveryDriver
                    {

                    			newCompositeNode(grammarAccess.getUserRoleAccess().getDeliveryDriverParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeliveryDriver_1=ruleDeliveryDriver();

                    state._fsp--;


                    			current = this_DeliveryDriver_1;
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
    // $ANTLR end "ruleUserRole"


    // $ANTLR start "entryRuleUser"
    // InternalMyRds.g:227:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalMyRds.g:227:45: (iv_ruleUser= ruleUser EOF )
            // InternalMyRds.g:228:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalMyRds.g:234:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'username' otherlv_4= ':' ( (lv_username_5_0= RULE_STRING ) ) otherlv_6= 'password' otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'name' otherlv_10= ':' ( (lv_name_11_0= ruleFULLNAME ) ) otherlv_12= 'phone' otherlv_13= ':' ( (lv_phone_14_0= rulePHONE ) ) otherlv_15= 'email' otherlv_16= ':' ( (lv_email_17_0= ruleEMAIL ) ) ( (otherlv_18= RULE_ID ) )* otherlv_19= '}' ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_username_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_password_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_11_0 = null;

        AntlrDatatypeRuleToken lv_phone_14_0 = null;

        AntlrDatatypeRuleToken lv_email_17_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:240:2: ( (otherlv_0= 'user' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'username' otherlv_4= ':' ( (lv_username_5_0= RULE_STRING ) ) otherlv_6= 'password' otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'name' otherlv_10= ':' ( (lv_name_11_0= ruleFULLNAME ) ) otherlv_12= 'phone' otherlv_13= ':' ( (lv_phone_14_0= rulePHONE ) ) otherlv_15= 'email' otherlv_16= ':' ( (lv_email_17_0= ruleEMAIL ) ) ( (otherlv_18= RULE_ID ) )* otherlv_19= '}' ) )
            // InternalMyRds.g:241:2: (otherlv_0= 'user' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'username' otherlv_4= ':' ( (lv_username_5_0= RULE_STRING ) ) otherlv_6= 'password' otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'name' otherlv_10= ':' ( (lv_name_11_0= ruleFULLNAME ) ) otherlv_12= 'phone' otherlv_13= ':' ( (lv_phone_14_0= rulePHONE ) ) otherlv_15= 'email' otherlv_16= ':' ( (lv_email_17_0= ruleEMAIL ) ) ( (otherlv_18= RULE_ID ) )* otherlv_19= '}' )
            {
            // InternalMyRds.g:241:2: (otherlv_0= 'user' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'username' otherlv_4= ':' ( (lv_username_5_0= RULE_STRING ) ) otherlv_6= 'password' otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'name' otherlv_10= ':' ( (lv_name_11_0= ruleFULLNAME ) ) otherlv_12= 'phone' otherlv_13= ':' ( (lv_phone_14_0= rulePHONE ) ) otherlv_15= 'email' otherlv_16= ':' ( (lv_email_17_0= ruleEMAIL ) ) ( (otherlv_18= RULE_ID ) )* otherlv_19= '}' )
            // InternalMyRds.g:242:3: otherlv_0= 'user' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'username' otherlv_4= ':' ( (lv_username_5_0= RULE_STRING ) ) otherlv_6= 'password' otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'name' otherlv_10= ':' ( (lv_name_11_0= ruleFULLNAME ) ) otherlv_12= 'phone' otherlv_13= ':' ( (lv_phone_14_0= rulePHONE ) ) otherlv_15= 'email' otherlv_16= ':' ( (lv_email_17_0= ruleEMAIL ) ) ( (otherlv_18= RULE_ID ) )* otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            // InternalMyRds.g:246:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyRds.g:247:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyRds.g:247:4: (lv_id_1_0= RULE_ID )
            // InternalMyRds.g:248:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_1_0, grammarAccess.getUserAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getUserAccess().getUsernameKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getUserAccess().getColonKeyword_4());
            		
            // InternalMyRds.g:276:3: ( (lv_username_5_0= RULE_STRING ) )
            // InternalMyRds.g:277:4: (lv_username_5_0= RULE_STRING )
            {
            // InternalMyRds.g:277:4: (lv_username_5_0= RULE_STRING )
            // InternalMyRds.g:278:5: lv_username_5_0= RULE_STRING
            {
            lv_username_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_username_5_0, grammarAccess.getUserAccess().getUsernameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"username",
            						lv_username_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getUserAccess().getPasswordKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getUserAccess().getColonKeyword_7());
            		
            // InternalMyRds.g:302:3: ( (lv_password_8_0= RULE_STRING ) )
            // InternalMyRds.g:303:4: (lv_password_8_0= RULE_STRING )
            {
            // InternalMyRds.g:303:4: (lv_password_8_0= RULE_STRING )
            // InternalMyRds.g:304:5: lv_password_8_0= RULE_STRING
            {
            lv_password_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_password_8_0, grammarAccess.getUserAccess().getPasswordSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"password",
            						lv_password_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getUserAccess().getNameKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getUserAccess().getColonKeyword_10());
            		
            // InternalMyRds.g:328:3: ( (lv_name_11_0= ruleFULLNAME ) )
            // InternalMyRds.g:329:4: (lv_name_11_0= ruleFULLNAME )
            {
            // InternalMyRds.g:329:4: (lv_name_11_0= ruleFULLNAME )
            // InternalMyRds.g:330:5: lv_name_11_0= ruleFULLNAME
            {

            					newCompositeNode(grammarAccess.getUserAccess().getNameFULLNAMEParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_11_0=ruleFULLNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_11_0,
            						"org.xtext.project.rds.MyRds.FULLNAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getUserAccess().getPhoneKeyword_12());
            		
            otherlv_13=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getUserAccess().getColonKeyword_13());
            		
            // InternalMyRds.g:355:3: ( (lv_phone_14_0= rulePHONE ) )
            // InternalMyRds.g:356:4: (lv_phone_14_0= rulePHONE )
            {
            // InternalMyRds.g:356:4: (lv_phone_14_0= rulePHONE )
            // InternalMyRds.g:357:5: lv_phone_14_0= rulePHONE
            {

            					newCompositeNode(grammarAccess.getUserAccess().getPhonePHONEParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_13);
            lv_phone_14_0=rulePHONE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"phone",
            						lv_phone_14_0,
            						"org.xtext.project.rds.MyRds.PHONE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getUserAccess().getEmailKeyword_15());
            		
            otherlv_16=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_16, grammarAccess.getUserAccess().getColonKeyword_16());
            		
            // InternalMyRds.g:382:3: ( (lv_email_17_0= ruleEMAIL ) )
            // InternalMyRds.g:383:4: (lv_email_17_0= ruleEMAIL )
            {
            // InternalMyRds.g:383:4: (lv_email_17_0= ruleEMAIL )
            // InternalMyRds.g:384:5: lv_email_17_0= ruleEMAIL
            {

            					newCompositeNode(grammarAccess.getUserAccess().getEmailEMAILParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_14);
            lv_email_17_0=ruleEMAIL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"email",
            						lv_email_17_0,
            						"org.xtext.project.rds.MyRds.EMAIL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyRds.g:401:3: ( (otherlv_18= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyRds.g:402:4: (otherlv_18= RULE_ID )
            	    {
            	    // InternalMyRds.g:402:4: (otherlv_18= RULE_ID )
            	    // InternalMyRds.g:403:5: otherlv_18= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUserRule());
            	    					}
            	    				
            	    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    					newLeafNode(otherlv_18, grammarAccess.getUserAccess().getElementsUserRoleCrossReference_18_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_19());
            		

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleCustomer"
    // InternalMyRds.g:422:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalMyRds.g:422:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalMyRds.g:423:2: iv_ruleCustomer= ruleCustomer EOF
            {
             newCompositeNode(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomer=ruleCustomer();

            state._fsp--;

             current =iv_ruleCustomer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalMyRds.g:429:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'Customer' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyRds.g:435:2: ( (otherlv_0= 'Customer' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalMyRds.g:436:2: (otherlv_0= 'Customer' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalMyRds.g:436:2: (otherlv_0= 'Customer' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalMyRds.g:437:3: otherlv_0= 'Customer' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerKeyword_0());
            		
            // InternalMyRds.g:441:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyRds.g:442:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyRds.g:442:4: (lv_id_1_0= RULE_ID )
            // InternalMyRds.g:443:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_1_0, grammarAccess.getCustomerAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyRds.g:463:3: ( (otherlv_3= RULE_ID ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyRds.g:464:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyRds.g:464:4: (otherlv_3= RULE_ID )
            	    // InternalMyRds.g:465:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCustomerRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    					newLeafNode(otherlv_3, grammarAccess.getCustomerAccess().getOrdersOrderCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleDeliveryDriver"
    // InternalMyRds.g:484:1: entryRuleDeliveryDriver returns [EObject current=null] : iv_ruleDeliveryDriver= ruleDeliveryDriver EOF ;
    public final EObject entryRuleDeliveryDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeliveryDriver = null;


        try {
            // InternalMyRds.g:484:55: (iv_ruleDeliveryDriver= ruleDeliveryDriver EOF )
            // InternalMyRds.g:485:2: iv_ruleDeliveryDriver= ruleDeliveryDriver EOF
            {
             newCompositeNode(grammarAccess.getDeliveryDriverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeliveryDriver=ruleDeliveryDriver();

            state._fsp--;

             current =iv_ruleDeliveryDriver; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeliveryDriver"


    // $ANTLR start "ruleDeliveryDriver"
    // InternalMyRds.g:491:1: ruleDeliveryDriver returns [EObject current=null] : (otherlv_0= 'DeliveryDriver' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isAvailable' otherlv_4= ':' ( (lv_isAvailable_5_0= RULE_INT ) ) otherlv_6= 'carLicenceNumber' otherlv_7= ':' ( (lv_carLicenceNumber_8_0= ruleLICENCE ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) ;
    public final EObject ruleDeliveryDriver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_isAvailable_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_carLicenceNumber_8_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:497:2: ( (otherlv_0= 'DeliveryDriver' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isAvailable' otherlv_4= ':' ( (lv_isAvailable_5_0= RULE_INT ) ) otherlv_6= 'carLicenceNumber' otherlv_7= ':' ( (lv_carLicenceNumber_8_0= ruleLICENCE ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) )
            // InternalMyRds.g:498:2: (otherlv_0= 'DeliveryDriver' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isAvailable' otherlv_4= ':' ( (lv_isAvailable_5_0= RULE_INT ) ) otherlv_6= 'carLicenceNumber' otherlv_7= ':' ( (lv_carLicenceNumber_8_0= ruleLICENCE ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            {
            // InternalMyRds.g:498:2: (otherlv_0= 'DeliveryDriver' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isAvailable' otherlv_4= ':' ( (lv_isAvailable_5_0= RULE_INT ) ) otherlv_6= 'carLicenceNumber' otherlv_7= ':' ( (lv_carLicenceNumber_8_0= ruleLICENCE ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            // InternalMyRds.g:499:3: otherlv_0= 'DeliveryDriver' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isAvailable' otherlv_4= ':' ( (lv_isAvailable_5_0= RULE_INT ) ) otherlv_6= 'carLicenceNumber' otherlv_7= ':' ( (lv_carLicenceNumber_8_0= ruleLICENCE ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeliveryDriverAccess().getDeliveryDriverKeyword_0());
            		
            // InternalMyRds.g:503:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyRds.g:504:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyRds.g:504:4: (lv_id_1_0= RULE_ID )
            // InternalMyRds.g:505:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_1_0, grammarAccess.getDeliveryDriverAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryDriverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDeliveryDriverAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDeliveryDriverAccess().getIsAvailableKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getDeliveryDriverAccess().getColonKeyword_4());
            		
            // InternalMyRds.g:533:3: ( (lv_isAvailable_5_0= RULE_INT ) )
            // InternalMyRds.g:534:4: (lv_isAvailable_5_0= RULE_INT )
            {
            // InternalMyRds.g:534:4: (lv_isAvailable_5_0= RULE_INT )
            // InternalMyRds.g:535:5: lv_isAvailable_5_0= RULE_INT
            {
            lv_isAvailable_5_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_isAvailable_5_0, grammarAccess.getDeliveryDriverAccess().getIsAvailableINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryDriverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"isAvailable",
            						lv_isAvailable_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDeliveryDriverAccess().getCarLicenceNumberKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getDeliveryDriverAccess().getColonKeyword_7());
            		
            // InternalMyRds.g:559:3: ( (lv_carLicenceNumber_8_0= ruleLICENCE ) )
            // InternalMyRds.g:560:4: (lv_carLicenceNumber_8_0= ruleLICENCE )
            {
            // InternalMyRds.g:560:4: (lv_carLicenceNumber_8_0= ruleLICENCE )
            // InternalMyRds.g:561:5: lv_carLicenceNumber_8_0= ruleLICENCE
            {

            					newCompositeNode(grammarAccess.getDeliveryDriverAccess().getCarLicenceNumberLICENCEParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_carLicenceNumber_8_0=ruleLICENCE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeliveryDriverRule());
            					}
            					set(
            						current,
            						"carLicenceNumber",
            						lv_carLicenceNumber_8_0,
            						"org.xtext.project.rds.MyRds.LICENCE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyRds.g:578:3: ( (otherlv_9= RULE_ID ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyRds.g:579:4: (otherlv_9= RULE_ID )
            	    {
            	    // InternalMyRds.g:579:4: (otherlv_9= RULE_ID )
            	    // InternalMyRds.g:580:5: otherlv_9= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDeliveryDriverRule());
            	    					}
            	    				
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    					newLeafNode(otherlv_9, grammarAccess.getDeliveryDriverAccess().getOrdersOrderCrossReference_9_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDeliveryDriverAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleDeliveryDriver"


    // $ANTLR start "entryRuleOrder"
    // InternalMyRds.g:599:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalMyRds.g:599:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalMyRds.g:600:2: iv_ruleOrder= ruleOrder EOF
            {
             newCompositeNode(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;

             current =iv_ruleOrder; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalMyRds.g:606:1: ruleOrder returns [EObject current=null] : (otherlv_0= 'Order' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'orderNumber' otherlv_4= ':' ( (lv_orderNumber_5_0= RULE_INT ) ) otherlv_6= 'status' otherlv_7= ':' ( (lv_status_8_0= ruleOrderStatus ) ) otherlv_9= 'deliveryAddress' otherlv_10= ':' ( (lv_deliveryAddress_11_0= ruleADDRESS ) ) otherlv_12= 'orderedDatetime' otherlv_13= ':' ( (lv_orderedDatetime_14_0= ruleDATETIME ) ) otherlv_15= 'deliveredDatetime' otherlv_16= ':' ( (lv_deliveredDatetime_17_0= ruleDATETIME ) ) otherlv_18= 'requestedDeliveryDatetime' otherlv_19= ':' ( (lv_requestedDeliveryDatetime_20_0= ruleDATETIME ) ) ( (otherlv_21= RULE_ID ) )* otherlv_22= 'review' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'customer' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) otherlv_28= 'deliveryDriver' otherlv_29= ':' ( (otherlv_30= RULE_ID ) ) otherlv_31= '}' ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_orderNumber_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Enumerator lv_status_8_0 = null;

        AntlrDatatypeRuleToken lv_deliveryAddress_11_0 = null;

        AntlrDatatypeRuleToken lv_orderedDatetime_14_0 = null;

        AntlrDatatypeRuleToken lv_deliveredDatetime_17_0 = null;

        AntlrDatatypeRuleToken lv_requestedDeliveryDatetime_20_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:612:2: ( (otherlv_0= 'Order' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'orderNumber' otherlv_4= ':' ( (lv_orderNumber_5_0= RULE_INT ) ) otherlv_6= 'status' otherlv_7= ':' ( (lv_status_8_0= ruleOrderStatus ) ) otherlv_9= 'deliveryAddress' otherlv_10= ':' ( (lv_deliveryAddress_11_0= ruleADDRESS ) ) otherlv_12= 'orderedDatetime' otherlv_13= ':' ( (lv_orderedDatetime_14_0= ruleDATETIME ) ) otherlv_15= 'deliveredDatetime' otherlv_16= ':' ( (lv_deliveredDatetime_17_0= ruleDATETIME ) ) otherlv_18= 'requestedDeliveryDatetime' otherlv_19= ':' ( (lv_requestedDeliveryDatetime_20_0= ruleDATETIME ) ) ( (otherlv_21= RULE_ID ) )* otherlv_22= 'review' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'customer' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) otherlv_28= 'deliveryDriver' otherlv_29= ':' ( (otherlv_30= RULE_ID ) ) otherlv_31= '}' ) )
            // InternalMyRds.g:613:2: (otherlv_0= 'Order' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'orderNumber' otherlv_4= ':' ( (lv_orderNumber_5_0= RULE_INT ) ) otherlv_6= 'status' otherlv_7= ':' ( (lv_status_8_0= ruleOrderStatus ) ) otherlv_9= 'deliveryAddress' otherlv_10= ':' ( (lv_deliveryAddress_11_0= ruleADDRESS ) ) otherlv_12= 'orderedDatetime' otherlv_13= ':' ( (lv_orderedDatetime_14_0= ruleDATETIME ) ) otherlv_15= 'deliveredDatetime' otherlv_16= ':' ( (lv_deliveredDatetime_17_0= ruleDATETIME ) ) otherlv_18= 'requestedDeliveryDatetime' otherlv_19= ':' ( (lv_requestedDeliveryDatetime_20_0= ruleDATETIME ) ) ( (otherlv_21= RULE_ID ) )* otherlv_22= 'review' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'customer' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) otherlv_28= 'deliveryDriver' otherlv_29= ':' ( (otherlv_30= RULE_ID ) ) otherlv_31= '}' )
            {
            // InternalMyRds.g:613:2: (otherlv_0= 'Order' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'orderNumber' otherlv_4= ':' ( (lv_orderNumber_5_0= RULE_INT ) ) otherlv_6= 'status' otherlv_7= ':' ( (lv_status_8_0= ruleOrderStatus ) ) otherlv_9= 'deliveryAddress' otherlv_10= ':' ( (lv_deliveryAddress_11_0= ruleADDRESS ) ) otherlv_12= 'orderedDatetime' otherlv_13= ':' ( (lv_orderedDatetime_14_0= ruleDATETIME ) ) otherlv_15= 'deliveredDatetime' otherlv_16= ':' ( (lv_deliveredDatetime_17_0= ruleDATETIME ) ) otherlv_18= 'requestedDeliveryDatetime' otherlv_19= ':' ( (lv_requestedDeliveryDatetime_20_0= ruleDATETIME ) ) ( (otherlv_21= RULE_ID ) )* otherlv_22= 'review' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'customer' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) otherlv_28= 'deliveryDriver' otherlv_29= ':' ( (otherlv_30= RULE_ID ) ) otherlv_31= '}' )
            // InternalMyRds.g:614:3: otherlv_0= 'Order' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'orderNumber' otherlv_4= ':' ( (lv_orderNumber_5_0= RULE_INT ) ) otherlv_6= 'status' otherlv_7= ':' ( (lv_status_8_0= ruleOrderStatus ) ) otherlv_9= 'deliveryAddress' otherlv_10= ':' ( (lv_deliveryAddress_11_0= ruleADDRESS ) ) otherlv_12= 'orderedDatetime' otherlv_13= ':' ( (lv_orderedDatetime_14_0= ruleDATETIME ) ) otherlv_15= 'deliveredDatetime' otherlv_16= ':' ( (lv_deliveredDatetime_17_0= ruleDATETIME ) ) otherlv_18= 'requestedDeliveryDatetime' otherlv_19= ':' ( (lv_requestedDeliveryDatetime_20_0= ruleDATETIME ) ) ( (otherlv_21= RULE_ID ) )* otherlv_22= 'review' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'customer' otherlv_26= ':' ( (otherlv_27= RULE_ID ) ) otherlv_28= 'deliveryDriver' otherlv_29= ':' ( (otherlv_30= RULE_ID ) ) otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderAccess().getOrderKeyword_0());
            		
            // InternalMyRds.g:618:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyRds.g:619:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyRds.g:619:4: (lv_id_1_0= RULE_ID )
            // InternalMyRds.g:620:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_1_0, grammarAccess.getOrderAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getOrderAccess().getOrderNumberKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getColonKeyword_4());
            		
            // InternalMyRds.g:648:3: ( (lv_orderNumber_5_0= RULE_INT ) )
            // InternalMyRds.g:649:4: (lv_orderNumber_5_0= RULE_INT )
            {
            // InternalMyRds.g:649:4: (lv_orderNumber_5_0= RULE_INT )
            // InternalMyRds.g:650:5: lv_orderNumber_5_0= RULE_INT
            {
            lv_orderNumber_5_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_orderNumber_5_0, grammarAccess.getOrderAccess().getOrderNumberINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"orderNumber",
            						lv_orderNumber_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getOrderAccess().getStatusKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getOrderAccess().getColonKeyword_7());
            		
            // InternalMyRds.g:674:3: ( (lv_status_8_0= ruleOrderStatus ) )
            // InternalMyRds.g:675:4: (lv_status_8_0= ruleOrderStatus )
            {
            // InternalMyRds.g:675:4: (lv_status_8_0= ruleOrderStatus )
            // InternalMyRds.g:676:5: lv_status_8_0= ruleOrderStatus
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getStatusOrderStatusEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
            lv_status_8_0=ruleOrderStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_8_0,
            						"org.xtext.project.rds.MyRds.OrderStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getOrderAccess().getDeliveryAddressKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getOrderAccess().getColonKeyword_10());
            		
            // InternalMyRds.g:701:3: ( (lv_deliveryAddress_11_0= ruleADDRESS ) )
            // InternalMyRds.g:702:4: (lv_deliveryAddress_11_0= ruleADDRESS )
            {
            // InternalMyRds.g:702:4: (lv_deliveryAddress_11_0= ruleADDRESS )
            // InternalMyRds.g:703:5: lv_deliveryAddress_11_0= ruleADDRESS
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getDeliveryAddressADDRESSParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_21);
            lv_deliveryAddress_11_0=ruleADDRESS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"deliveryAddress",
            						lv_deliveryAddress_11_0,
            						"org.xtext.project.rds.MyRds.ADDRESS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getOrderAccess().getOrderedDatetimeKeyword_12());
            		
            otherlv_13=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getOrderAccess().getColonKeyword_13());
            		
            // InternalMyRds.g:728:3: ( (lv_orderedDatetime_14_0= ruleDATETIME ) )
            // InternalMyRds.g:729:4: (lv_orderedDatetime_14_0= ruleDATETIME )
            {
            // InternalMyRds.g:729:4: (lv_orderedDatetime_14_0= ruleDATETIME )
            // InternalMyRds.g:730:5: lv_orderedDatetime_14_0= ruleDATETIME
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getOrderedDatetimeDATETIMEParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_22);
            lv_orderedDatetime_14_0=ruleDATETIME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"orderedDatetime",
            						lv_orderedDatetime_14_0,
            						"org.xtext.project.rds.MyRds.DATETIME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getOrderAccess().getDeliveredDatetimeKeyword_15());
            		
            otherlv_16=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_16, grammarAccess.getOrderAccess().getColonKeyword_16());
            		
            // InternalMyRds.g:755:3: ( (lv_deliveredDatetime_17_0= ruleDATETIME ) )
            // InternalMyRds.g:756:4: (lv_deliveredDatetime_17_0= ruleDATETIME )
            {
            // InternalMyRds.g:756:4: (lv_deliveredDatetime_17_0= ruleDATETIME )
            // InternalMyRds.g:757:5: lv_deliveredDatetime_17_0= ruleDATETIME
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getDeliveredDatetimeDATETIMEParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_23);
            lv_deliveredDatetime_17_0=ruleDATETIME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"deliveredDatetime",
            						lv_deliveredDatetime_17_0,
            						"org.xtext.project.rds.MyRds.DATETIME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getOrderAccess().getRequestedDeliveryDatetimeKeyword_18());
            		
            otherlv_19=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_19, grammarAccess.getOrderAccess().getColonKeyword_19());
            		
            // InternalMyRds.g:782:3: ( (lv_requestedDeliveryDatetime_20_0= ruleDATETIME ) )
            // InternalMyRds.g:783:4: (lv_requestedDeliveryDatetime_20_0= ruleDATETIME )
            {
            // InternalMyRds.g:783:4: (lv_requestedDeliveryDatetime_20_0= ruleDATETIME )
            // InternalMyRds.g:784:5: lv_requestedDeliveryDatetime_20_0= ruleDATETIME
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getRequestedDeliveryDatetimeDATETIMEParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_24);
            lv_requestedDeliveryDatetime_20_0=ruleDATETIME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"requestedDeliveryDatetime",
            						lv_requestedDeliveryDatetime_20_0,
            						"org.xtext.project.rds.MyRds.DATETIME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyRds.g:801:3: ( (otherlv_21= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyRds.g:802:4: (otherlv_21= RULE_ID )
            	    {
            	    // InternalMyRds.g:802:4: (otherlv_21= RULE_ID )
            	    // InternalMyRds.g:803:5: otherlv_21= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getOrderRule());
            	    					}
            	    				
            	    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    					newLeafNode(otherlv_21, grammarAccess.getOrderAccess().getOrderItemsOrderItemCrossReference_21_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_22=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_22, grammarAccess.getOrderAccess().getReviewKeyword_22());
            		
            otherlv_23=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_23, grammarAccess.getOrderAccess().getColonKeyword_23());
            		
            // InternalMyRds.g:822:3: ( (otherlv_24= RULE_ID ) )
            // InternalMyRds.g:823:4: (otherlv_24= RULE_ID )
            {
            // InternalMyRds.g:823:4: (otherlv_24= RULE_ID )
            // InternalMyRds.g:824:5: otherlv_24= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            				
            otherlv_24=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_24, grammarAccess.getOrderAccess().getReviewReviewCrossReference_24_0());
            				

            }


            }

            otherlv_25=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_25, grammarAccess.getOrderAccess().getCustomerKeyword_25());
            		
            otherlv_26=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_26, grammarAccess.getOrderAccess().getColonKeyword_26());
            		
            // InternalMyRds.g:843:3: ( (otherlv_27= RULE_ID ) )
            // InternalMyRds.g:844:4: (otherlv_27= RULE_ID )
            {
            // InternalMyRds.g:844:4: (otherlv_27= RULE_ID )
            // InternalMyRds.g:845:5: otherlv_27= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            				
            otherlv_27=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_27, grammarAccess.getOrderAccess().getCustomerCustomerCrossReference_27_0());
            				

            }


            }

            otherlv_28=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_28, grammarAccess.getOrderAccess().getDeliveryDriverKeyword_28());
            		
            otherlv_29=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_29, grammarAccess.getOrderAccess().getColonKeyword_29());
            		
            // InternalMyRds.g:864:3: ( (otherlv_30= RULE_ID ) )
            // InternalMyRds.g:865:4: (otherlv_30= RULE_ID )
            {
            // InternalMyRds.g:865:4: (otherlv_30= RULE_ID )
            // InternalMyRds.g:866:5: otherlv_30= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            				
            otherlv_30=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_30, grammarAccess.getOrderAccess().getDeliveryDriverDeliveryDriverCrossReference_30_0());
            				

            }


            }

            otherlv_31=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_31());
            		

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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleRestaurant"
    // InternalMyRds.g:885:1: entryRuleRestaurant returns [EObject current=null] : iv_ruleRestaurant= ruleRestaurant EOF ;
    public final EObject entryRuleRestaurant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestaurant = null;


        try {
            // InternalMyRds.g:885:51: (iv_ruleRestaurant= ruleRestaurant EOF )
            // InternalMyRds.g:886:2: iv_ruleRestaurant= ruleRestaurant EOF
            {
             newCompositeNode(grammarAccess.getRestaurantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestaurant=ruleRestaurant();

            state._fsp--;

             current =iv_ruleRestaurant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRestaurant"


    // $ANTLR start "ruleRestaurant"
    // InternalMyRds.g:892:1: ruleRestaurant returns [EObject current=null] : (otherlv_0= 'Restaurant' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'address' otherlv_7= ':' ( (lv_address_8_0= ruleADDRESS ) ) otherlv_9= 'menu' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleRestaurant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_address_8_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:898:2: ( (otherlv_0= 'Restaurant' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'address' otherlv_7= ':' ( (lv_address_8_0= ruleADDRESS ) ) otherlv_9= 'menu' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // InternalMyRds.g:899:2: (otherlv_0= 'Restaurant' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'address' otherlv_7= ':' ( (lv_address_8_0= ruleADDRESS ) ) otherlv_9= 'menu' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // InternalMyRds.g:899:2: (otherlv_0= 'Restaurant' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'address' otherlv_7= ':' ( (lv_address_8_0= ruleADDRESS ) ) otherlv_9= 'menu' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // InternalMyRds.g:900:3: otherlv_0= 'Restaurant' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'address' otherlv_7= ':' ( (lv_address_8_0= ruleADDRESS ) ) otherlv_9= 'menu' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRestaurantAccess().getRestaurantKeyword_0());
            		
            // InternalMyRds.g:904:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyRds.g:905:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyRds.g:905:4: (lv_id_1_0= RULE_ID )
            // InternalMyRds.g:906:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_1_0, grammarAccess.getRestaurantAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestaurantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRestaurantAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRestaurantAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getRestaurantAccess().getColonKeyword_4());
            		
            // InternalMyRds.g:934:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalMyRds.g:935:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalMyRds.g:935:4: (lv_name_5_0= RULE_STRING )
            // InternalMyRds.g:936:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_name_5_0, grammarAccess.getRestaurantAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestaurantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getRestaurantAccess().getAddressKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getRestaurantAccess().getColonKeyword_7());
            		
            // InternalMyRds.g:960:3: ( (lv_address_8_0= ruleADDRESS ) )
            // InternalMyRds.g:961:4: (lv_address_8_0= ruleADDRESS )
            {
            // InternalMyRds.g:961:4: (lv_address_8_0= ruleADDRESS )
            // InternalMyRds.g:962:5: lv_address_8_0= ruleADDRESS
            {

            					newCompositeNode(grammarAccess.getRestaurantAccess().getAddressADDRESSParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_29);
            lv_address_8_0=ruleADDRESS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestaurantRule());
            					}
            					set(
            						current,
            						"address",
            						lv_address_8_0,
            						"org.xtext.project.rds.MyRds.ADDRESS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getRestaurantAccess().getMenuKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getRestaurantAccess().getColonKeyword_10());
            		
            // InternalMyRds.g:987:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyRds.g:988:4: (otherlv_11= RULE_ID )
            {
            // InternalMyRds.g:988:4: (otherlv_11= RULE_ID )
            // InternalMyRds.g:989:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestaurantRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_11, grammarAccess.getRestaurantAccess().getMenuMenuCrossReference_11_0());
            				

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRestaurantAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleRestaurant"


    // $ANTLR start "entryRuleMenu"
    // InternalMyRds.g:1008:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // InternalMyRds.g:1008:45: (iv_ruleMenu= ruleMenu EOF )
            // InternalMyRds.g:1009:2: iv_ruleMenu= ruleMenu EOF
            {
             newCompositeNode(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMenu=ruleMenu();

            state._fsp--;

             current =iv_ruleMenu; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // InternalMyRds.g:1015:1: ruleMenu returns [EObject current=null] : (otherlv_0= 'Menu' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'restaurant' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyRds.g:1021:2: ( (otherlv_0= 'Menu' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'restaurant' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // InternalMyRds.g:1022:2: (otherlv_0= 'Menu' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'restaurant' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // InternalMyRds.g:1022:2: (otherlv_0= 'Menu' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'restaurant' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // InternalMyRds.g:1023:3: otherlv_0= 'Menu' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'restaurant' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMenuAccess().getMenuKeyword_0());
            		
            // InternalMyRds.g:1027:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyRds.g:1028:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyRds.g:1028:4: (lv_id_1_0= RULE_ID )
            // InternalMyRds.g:1029:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_1_0, grammarAccess.getMenuAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMenuAccess().getRestaurantKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getColonKeyword_4());
            		
            // InternalMyRds.g:1057:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyRds.g:1058:4: (otherlv_5= RULE_ID )
            {
            // InternalMyRds.g:1058:4: (otherlv_5= RULE_ID )
            // InternalMyRds.g:1059:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_5, grammarAccess.getMenuAccess().getRestaurantRestaurantCrossReference_5_0());
            				

            }


            }

            // InternalMyRds.g:1070:3: ( (otherlv_6= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyRds.g:1071:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalMyRds.g:1071:4: (otherlv_6= RULE_ID )
            	    // InternalMyRds.g:1072:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMenuRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    					newLeafNode(otherlv_6, grammarAccess.getMenuAccess().getMenuItemsMenuItemCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleMenuItem"
    // InternalMyRds.g:1091:1: entryRuleMenuItem returns [EObject current=null] : iv_ruleMenuItem= ruleMenuItem EOF ;
    public final EObject entryRuleMenuItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenuItem = null;


        try {
            // InternalMyRds.g:1091:49: (iv_ruleMenuItem= ruleMenuItem EOF )
            // InternalMyRds.g:1092:2: iv_ruleMenuItem= ruleMenuItem EOF
            {
             newCompositeNode(grammarAccess.getMenuItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMenuItem=ruleMenuItem();

            state._fsp--;

             current =iv_ruleMenuItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMenuItem"


    // $ANTLR start "ruleMenuItem"
    // InternalMyRds.g:1098:1: ruleMenuItem returns [EObject current=null] : (otherlv_0= 'MenuItem' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'price' otherlv_7= ':' ( (lv_price_8_0= ruleDECIMAL ) ) otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= 'category' otherlv_13= ':' ( (lv_category_14_0= ruleMenuItemCategory ) ) ( (otherlv_15= RULE_ID ) )* otherlv_16= 'menu' otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' ) ;
    public final EObject ruleMenuItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_price_8_0 = null;

        Enumerator lv_category_14_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:1104:2: ( (otherlv_0= 'MenuItem' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'price' otherlv_7= ':' ( (lv_price_8_0= ruleDECIMAL ) ) otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= 'category' otherlv_13= ':' ( (lv_category_14_0= ruleMenuItemCategory ) ) ( (otherlv_15= RULE_ID ) )* otherlv_16= 'menu' otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' ) )
            // InternalMyRds.g:1105:2: (otherlv_0= 'MenuItem' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'price' otherlv_7= ':' ( (lv_price_8_0= ruleDECIMAL ) ) otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= 'category' otherlv_13= ':' ( (lv_category_14_0= ruleMenuItemCategory ) ) ( (otherlv_15= RULE_ID ) )* otherlv_16= 'menu' otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' )
            {
            // InternalMyRds.g:1105:2: (otherlv_0= 'MenuItem' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'price' otherlv_7= ':' ( (lv_price_8_0= ruleDECIMAL ) ) otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= 'category' otherlv_13= ':' ( (lv_category_14_0= ruleMenuItemCategory ) ) ( (otherlv_15= RULE_ID ) )* otherlv_16= 'menu' otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' )
            // InternalMyRds.g:1106:3: otherlv_0= 'MenuItem' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'price' otherlv_7= ':' ( (lv_price_8_0= ruleDECIMAL ) ) otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= 'category' otherlv_13= ':' ( (lv_category_14_0= ruleMenuItemCategory ) ) ( (otherlv_15= RULE_ID ) )* otherlv_16= 'menu' otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMenuItemAccess().getMenuItemKeyword_0());
            		
            // InternalMyRds.g:1110:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyRds.g:1111:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyRds.g:1111:4: (lv_id_1_0= RULE_ID )
            // InternalMyRds.g:1112:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_1_0, grammarAccess.getMenuItemAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMenuItemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMenuItemAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMenuItemAccess().getColonKeyword_4());
            		
            // InternalMyRds.g:1140:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalMyRds.g:1141:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalMyRds.g:1141:4: (lv_name_5_0= RULE_STRING )
            // InternalMyRds.g:1142:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_name_5_0, grammarAccess.getMenuItemAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getMenuItemAccess().getPriceKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getMenuItemAccess().getColonKeyword_7());
            		
            // InternalMyRds.g:1166:3: ( (lv_price_8_0= ruleDECIMAL ) )
            // InternalMyRds.g:1167:4: (lv_price_8_0= ruleDECIMAL )
            {
            // InternalMyRds.g:1167:4: (lv_price_8_0= ruleDECIMAL )
            // InternalMyRds.g:1168:5: lv_price_8_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getMenuItemAccess().getPriceDECIMALParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_32);
            lv_price_8_0=ruleDECIMAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMenuItemRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_8_0,
            						"org.xtext.project.rds.MyRds.DECIMAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getMenuItemAccess().getDescriptionKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getMenuItemAccess().getColonKeyword_10());
            		
            // InternalMyRds.g:1193:3: ( (lv_description_11_0= RULE_STRING ) )
            // InternalMyRds.g:1194:4: (lv_description_11_0= RULE_STRING )
            {
            // InternalMyRds.g:1194:4: (lv_description_11_0= RULE_STRING )
            // InternalMyRds.g:1195:5: lv_description_11_0= RULE_STRING
            {
            lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_description_11_0, grammarAccess.getMenuItemAccess().getDescriptionSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getMenuItemAccess().getCategoryKeyword_12());
            		
            otherlv_13=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_13, grammarAccess.getMenuItemAccess().getColonKeyword_13());
            		
            // InternalMyRds.g:1219:3: ( (lv_category_14_0= ruleMenuItemCategory ) )
            // InternalMyRds.g:1220:4: (lv_category_14_0= ruleMenuItemCategory )
            {
            // InternalMyRds.g:1220:4: (lv_category_14_0= ruleMenuItemCategory )
            // InternalMyRds.g:1221:5: lv_category_14_0= ruleMenuItemCategory
            {

            					newCompositeNode(grammarAccess.getMenuItemAccess().getCategoryMenuItemCategoryEnumRuleCall_14_0());
            				
            pushFollow(FOLLOW_35);
            lv_category_14_0=ruleMenuItemCategory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMenuItemRule());
            					}
            					set(
            						current,
            						"category",
            						lv_category_14_0,
            						"org.xtext.project.rds.MyRds.MenuItemCategory");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyRds.g:1238:3: ( (otherlv_15= RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyRds.g:1239:4: (otherlv_15= RULE_ID )
            	    {
            	    // InternalMyRds.g:1239:4: (otherlv_15= RULE_ID )
            	    // InternalMyRds.g:1240:5: otherlv_15= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMenuItemRule());
            	    					}
            	    				
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    					newLeafNode(otherlv_15, grammarAccess.getMenuItemAccess().getOrderItemsOrderItemCrossReference_15_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_16=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_16, grammarAccess.getMenuItemAccess().getMenuKeyword_16());
            		
            otherlv_17=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getMenuItemAccess().getColonKeyword_17());
            		
            // InternalMyRds.g:1259:3: ( (otherlv_18= RULE_ID ) )
            // InternalMyRds.g:1260:4: (otherlv_18= RULE_ID )
            {
            // InternalMyRds.g:1260:4: (otherlv_18= RULE_ID )
            // InternalMyRds.g:1261:5: otherlv_18= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuItemRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_18, grammarAccess.getMenuItemAccess().getMenuMenuCrossReference_18_0());
            				

            }


            }

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getMenuItemAccess().getRightCurlyBracketKeyword_19());
            		

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
    // $ANTLR end "ruleMenuItem"


    // $ANTLR start "entryRuleOrderItem"
    // InternalMyRds.g:1280:1: entryRuleOrderItem returns [EObject current=null] : iv_ruleOrderItem= ruleOrderItem EOF ;
    public final EObject entryRuleOrderItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderItem = null;


        try {
            // InternalMyRds.g:1280:50: (iv_ruleOrderItem= ruleOrderItem EOF )
            // InternalMyRds.g:1281:2: iv_ruleOrderItem= ruleOrderItem EOF
            {
             newCompositeNode(grammarAccess.getOrderItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderItem=ruleOrderItem();

            state._fsp--;

             current =iv_ruleOrderItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrderItem"


    // $ANTLR start "ruleOrderItem"
    // InternalMyRds.g:1287:1: ruleOrderItem returns [EObject current=null] : (otherlv_0= 'OrderItem' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'quantity' otherlv_4= ':' ( (lv_quantity_5_0= RULE_INT ) ) otherlv_6= 'order' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'menuItem' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleOrderItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_quantity_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyRds.g:1293:2: ( (otherlv_0= 'OrderItem' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'quantity' otherlv_4= ':' ( (lv_quantity_5_0= RULE_INT ) ) otherlv_6= 'order' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'menuItem' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // InternalMyRds.g:1294:2: (otherlv_0= 'OrderItem' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'quantity' otherlv_4= ':' ( (lv_quantity_5_0= RULE_INT ) ) otherlv_6= 'order' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'menuItem' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // InternalMyRds.g:1294:2: (otherlv_0= 'OrderItem' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'quantity' otherlv_4= ':' ( (lv_quantity_5_0= RULE_INT ) ) otherlv_6= 'order' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'menuItem' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // InternalMyRds.g:1295:3: otherlv_0= 'OrderItem' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'quantity' otherlv_4= ':' ( (lv_quantity_5_0= RULE_INT ) ) otherlv_6= 'order' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'menuItem' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderItemAccess().getOrderItemKeyword_0());
            		
            // InternalMyRds.g:1299:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyRds.g:1300:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyRds.g:1300:4: (lv_id_1_0= RULE_ID )
            // InternalMyRds.g:1301:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_1_0, grammarAccess.getOrderItemAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getOrderItemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getOrderItemAccess().getQuantityKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getOrderItemAccess().getColonKeyword_4());
            		
            // InternalMyRds.g:1329:3: ( (lv_quantity_5_0= RULE_INT ) )
            // InternalMyRds.g:1330:4: (lv_quantity_5_0= RULE_INT )
            {
            // InternalMyRds.g:1330:4: (lv_quantity_5_0= RULE_INT )
            // InternalMyRds.g:1331:5: lv_quantity_5_0= RULE_INT
            {
            lv_quantity_5_0=(Token)match(input,RULE_INT,FOLLOW_37); 

            					newLeafNode(lv_quantity_5_0, grammarAccess.getOrderItemAccess().getQuantityINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getOrderItemAccess().getOrderKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getOrderItemAccess().getColonKeyword_7());
            		
            // InternalMyRds.g:1355:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyRds.g:1356:4: (otherlv_8= RULE_ID )
            {
            // InternalMyRds.g:1356:4: (otherlv_8= RULE_ID )
            // InternalMyRds.g:1357:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderItemRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_8, grammarAccess.getOrderItemAccess().getForOrderOrderCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,46,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getOrderItemAccess().getMenuItemKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getOrderItemAccess().getColonKeyword_10());
            		
            // InternalMyRds.g:1376:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyRds.g:1377:4: (otherlv_11= RULE_ID )
            {
            // InternalMyRds.g:1377:4: (otherlv_11= RULE_ID )
            // InternalMyRds.g:1378:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderItemRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_11, grammarAccess.getOrderItemAccess().getMenuItemMenuItemCrossReference_11_0());
            				

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getOrderItemAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleOrderItem"


    // $ANTLR start "entryRuleReview"
    // InternalMyRds.g:1397:1: entryRuleReview returns [EObject current=null] : iv_ruleReview= ruleReview EOF ;
    public final EObject entryRuleReview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReview = null;


        try {
            // InternalMyRds.g:1397:47: (iv_ruleReview= ruleReview EOF )
            // InternalMyRds.g:1398:2: iv_ruleReview= ruleReview EOF
            {
             newCompositeNode(grammarAccess.getReviewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReview=ruleReview();

            state._fsp--;

             current =iv_ruleReview; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReview"


    // $ANTLR start "ruleReview"
    // InternalMyRds.g:1404:1: ruleReview returns [EObject current=null] : (otherlv_0= 'Review' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'numStars' otherlv_4= ':' ( (lv_numStars_5_0= RULE_INT ) ) otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'reviewDatetime' otherlv_10= ':' ( (lv_reviewDatetime_11_0= ruleDATETIME ) ) otherlv_12= 'order' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) ;
    public final EObject ruleReview() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_numStars_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_reviewDatetime_11_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:1410:2: ( (otherlv_0= 'Review' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'numStars' otherlv_4= ':' ( (lv_numStars_5_0= RULE_INT ) ) otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'reviewDatetime' otherlv_10= ':' ( (lv_reviewDatetime_11_0= ruleDATETIME ) ) otherlv_12= 'order' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) )
            // InternalMyRds.g:1411:2: (otherlv_0= 'Review' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'numStars' otherlv_4= ':' ( (lv_numStars_5_0= RULE_INT ) ) otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'reviewDatetime' otherlv_10= ':' ( (lv_reviewDatetime_11_0= ruleDATETIME ) ) otherlv_12= 'order' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            {
            // InternalMyRds.g:1411:2: (otherlv_0= 'Review' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'numStars' otherlv_4= ':' ( (lv_numStars_5_0= RULE_INT ) ) otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'reviewDatetime' otherlv_10= ':' ( (lv_reviewDatetime_11_0= ruleDATETIME ) ) otherlv_12= 'order' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            // InternalMyRds.g:1412:3: otherlv_0= 'Review' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'numStars' otherlv_4= ':' ( (lv_numStars_5_0= RULE_INT ) ) otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'reviewDatetime' otherlv_10= ':' ( (lv_reviewDatetime_11_0= ruleDATETIME ) ) otherlv_12= 'order' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReviewAccess().getReviewKeyword_0());
            		
            // InternalMyRds.g:1416:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyRds.g:1417:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyRds.g:1417:4: (lv_id_1_0= RULE_ID )
            // InternalMyRds.g:1418:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_1_0, grammarAccess.getReviewAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getReviewAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getReviewAccess().getNumStarsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getReviewAccess().getColonKeyword_4());
            		
            // InternalMyRds.g:1446:3: ( (lv_numStars_5_0= RULE_INT ) )
            // InternalMyRds.g:1447:4: (lv_numStars_5_0= RULE_INT )
            {
            // InternalMyRds.g:1447:4: (lv_numStars_5_0= RULE_INT )
            // InternalMyRds.g:1448:5: lv_numStars_5_0= RULE_INT
            {
            lv_numStars_5_0=(Token)match(input,RULE_INT,FOLLOW_32); 

            					newLeafNode(lv_numStars_5_0, grammarAccess.getReviewAccess().getNumStarsINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numStars",
            						lv_numStars_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getReviewAccess().getDescriptionKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getReviewAccess().getColonKeyword_7());
            		
            // InternalMyRds.g:1472:3: ( (lv_description_8_0= RULE_STRING ) )
            // InternalMyRds.g:1473:4: (lv_description_8_0= RULE_STRING )
            {
            // InternalMyRds.g:1473:4: (lv_description_8_0= RULE_STRING )
            // InternalMyRds.g:1474:5: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_description_8_0, grammarAccess.getReviewAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getReviewAccess().getReviewDatetimeKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getReviewAccess().getColonKeyword_10());
            		
            // InternalMyRds.g:1498:3: ( (lv_reviewDatetime_11_0= ruleDATETIME ) )
            // InternalMyRds.g:1499:4: (lv_reviewDatetime_11_0= ruleDATETIME )
            {
            // InternalMyRds.g:1499:4: (lv_reviewDatetime_11_0= ruleDATETIME )
            // InternalMyRds.g:1500:5: lv_reviewDatetime_11_0= ruleDATETIME
            {

            					newCompositeNode(grammarAccess.getReviewAccess().getReviewDatetimeDATETIMEParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_37);
            lv_reviewDatetime_11_0=ruleDATETIME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReviewRule());
            					}
            					set(
            						current,
            						"reviewDatetime",
            						lv_reviewDatetime_11_0,
            						"org.xtext.project.rds.MyRds.DATETIME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getReviewAccess().getOrderKeyword_12());
            		
            otherlv_13=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getReviewAccess().getColonKeyword_13());
            		
            // InternalMyRds.g:1525:3: ( (otherlv_14= RULE_ID ) )
            // InternalMyRds.g:1526:4: (otherlv_14= RULE_ID )
            {
            // InternalMyRds.g:1526:4: (otherlv_14= RULE_ID )
            // InternalMyRds.g:1527:5: otherlv_14= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviewRule());
            					}
            				
            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_14, grammarAccess.getReviewAccess().getReviewedOrderOrderCrossReference_14_0());
            				

            }


            }

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getReviewAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleReview"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalMyRds.g:1546:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalMyRds.g:1546:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalMyRds.g:1547:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
             newCompositeNode(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;

             current =iv_ruleDECIMAL.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalMyRds.g:1553:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyRds.g:1559:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMyRds.g:1560:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMyRds.g:1560:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMyRds.g:1561:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,50,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleFULLNAME"
    // InternalMyRds.g:1584:1: entryRuleFULLNAME returns [String current=null] : iv_ruleFULLNAME= ruleFULLNAME EOF ;
    public final String entryRuleFULLNAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFULLNAME = null;


        try {
            // InternalMyRds.g:1584:48: (iv_ruleFULLNAME= ruleFULLNAME EOF )
            // InternalMyRds.g:1585:2: iv_ruleFULLNAME= ruleFULLNAME EOF
            {
             newCompositeNode(grammarAccess.getFULLNAMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFULLNAME=ruleFULLNAME();

            state._fsp--;

             current =iv_ruleFULLNAME.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFULLNAME"


    // $ANTLR start "ruleFULLNAME"
    // InternalMyRds.g:1591:1: ruleFULLNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleFULLNAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalMyRds.g:1597:2: ( (this_STRING_0= RULE_STRING this_STRING_1= RULE_STRING ) )
            // InternalMyRds.g:1598:2: (this_STRING_0= RULE_STRING this_STRING_1= RULE_STRING )
            {
            // InternalMyRds.g:1598:2: (this_STRING_0= RULE_STRING this_STRING_1= RULE_STRING )
            // InternalMyRds.g:1599:3: this_STRING_0= RULE_STRING this_STRING_1= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            			current.merge(this_STRING_0);
            		

            			newLeafNode(this_STRING_0, grammarAccess.getFULLNAMEAccess().getSTRINGTerminalRuleCall_0());
            		
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_1);
            		

            			newLeafNode(this_STRING_1, grammarAccess.getFULLNAMEAccess().getSTRINGTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleFULLNAME"


    // $ANTLR start "entryRulePHONE"
    // InternalMyRds.g:1617:1: entryRulePHONE returns [String current=null] : iv_rulePHONE= rulePHONE EOF ;
    public final String entryRulePHONE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePHONE = null;


        try {
            // InternalMyRds.g:1617:45: (iv_rulePHONE= rulePHONE EOF )
            // InternalMyRds.g:1618:2: iv_rulePHONE= rulePHONE EOF
            {
             newCompositeNode(grammarAccess.getPHONERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePHONE=rulePHONE();

            state._fsp--;

             current =iv_rulePHONE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePHONE"


    // $ANTLR start "rulePHONE"
    // InternalMyRds.g:1624:1: rulePHONE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePHONE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalMyRds.g:1630:2: ( (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT ) )
            // InternalMyRds.g:1631:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT )
            {
            // InternalMyRds.g:1631:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT )
            // InternalMyRds.g:1632:3: this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_42); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getPHONEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,51,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPHONEAccess().getHyphenMinusKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_42); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getPHONEAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,51,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPHONEAccess().getHyphenMinusKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getPHONEAccess().getINTTerminalRuleCall_4());
            		

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
    // $ANTLR end "rulePHONE"


    // $ANTLR start "entryRuleEMAIL"
    // InternalMyRds.g:1667:1: entryRuleEMAIL returns [String current=null] : iv_ruleEMAIL= ruleEMAIL EOF ;
    public final String entryRuleEMAIL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMAIL = null;


        try {
            // InternalMyRds.g:1667:45: (iv_ruleEMAIL= ruleEMAIL EOF )
            // InternalMyRds.g:1668:2: iv_ruleEMAIL= ruleEMAIL EOF
            {
             newCompositeNode(grammarAccess.getEMAILRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMAIL=ruleEMAIL();

            state._fsp--;

             current =iv_ruleEMAIL.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEMAIL"


    // $ANTLR start "ruleEMAIL"
    // InternalMyRds.g:1674:1: ruleEMAIL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING kw= '@' this_STRING_2= RULE_STRING kw= '.com' ) ;
    public final AntlrDatatypeRuleToken ruleEMAIL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalMyRds.g:1680:2: ( (this_STRING_0= RULE_STRING kw= '@' this_STRING_2= RULE_STRING kw= '.com' ) )
            // InternalMyRds.g:1681:2: (this_STRING_0= RULE_STRING kw= '@' this_STRING_2= RULE_STRING kw= '.com' )
            {
            // InternalMyRds.g:1681:2: (this_STRING_0= RULE_STRING kw= '@' this_STRING_2= RULE_STRING kw= '.com' )
            // InternalMyRds.g:1682:3: this_STRING_0= RULE_STRING kw= '@' this_STRING_2= RULE_STRING kw= '.com'
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            			current.merge(this_STRING_0);
            		

            			newLeafNode(this_STRING_0, grammarAccess.getEMAILAccess().getSTRINGTerminalRuleCall_0());
            		
            kw=(Token)match(input,52,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEMAILAccess().getCommercialAtKeyword_1());
            		
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_44); 

            			current.merge(this_STRING_2);
            		

            			newLeafNode(this_STRING_2, grammarAccess.getEMAILAccess().getSTRINGTerminalRuleCall_2());
            		
            kw=(Token)match(input,53,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEMAILAccess().getComKeyword_3());
            		

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
    // $ANTLR end "ruleEMAIL"


    // $ANTLR start "entryRuleDATETIME"
    // InternalMyRds.g:1710:1: entryRuleDATETIME returns [String current=null] : iv_ruleDATETIME= ruleDATETIME EOF ;
    public final String entryRuleDATETIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATETIME = null;


        try {
            // InternalMyRds.g:1710:48: (iv_ruleDATETIME= ruleDATETIME EOF )
            // InternalMyRds.g:1711:2: iv_ruleDATETIME= ruleDATETIME EOF
            {
             newCompositeNode(grammarAccess.getDATETIMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDATETIME=ruleDATETIME();

            state._fsp--;

             current =iv_ruleDATETIME.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDATETIME"


    // $ANTLR start "ruleDATETIME"
    // InternalMyRds.g:1717:1: ruleDATETIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDATETIME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_5=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyRds.g:1723:2: ( (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT ) )
            // InternalMyRds.g:1724:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT )
            {
            // InternalMyRds.g:1724:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT )
            // InternalMyRds.g:1725:3: this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_42); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,51,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATETIMEAccess().getHyphenMinusKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_42); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,51,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATETIMEAccess().getHyphenMinusKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_4());
            		
            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_5);
            		

            			newLeafNode(this_INT_5, grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_5());
            		
            kw=(Token)match(input,14,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATETIMEAccess().getColonKeyword_6());
            		
            this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_7);
            		

            			newLeafNode(this_INT_7, grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleDATETIME"


    // $ANTLR start "entryRuleADDRESS"
    // InternalMyRds.g:1779:1: entryRuleADDRESS returns [String current=null] : iv_ruleADDRESS= ruleADDRESS EOF ;
    public final String entryRuleADDRESS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleADDRESS = null;


        try {
            // InternalMyRds.g:1779:47: (iv_ruleADDRESS= ruleADDRESS EOF )
            // InternalMyRds.g:1780:2: iv_ruleADDRESS= ruleADDRESS EOF
            {
             newCompositeNode(grammarAccess.getADDRESSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADDRESS=ruleADDRESS();

            state._fsp--;

             current =iv_ruleADDRESS.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleADDRESS"


    // $ANTLR start "ruleADDRESS"
    // InternalMyRds.g:1786:1: ruleADDRESS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleADDRESS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token kw=null;
        Token this_STRING_3=null;


        	enterRule();

        try {
            // InternalMyRds.g:1792:2: ( (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING ) )
            // InternalMyRds.g:1793:2: (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING )
            {
            // InternalMyRds.g:1793:2: (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING )
            // InternalMyRds.g:1794:3: this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_0());
            		
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_45); 

            			current.merge(this_STRING_1);
            		

            			newLeafNode(this_STRING_1, grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_1());
            		
            kw=(Token)match(input,54,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getADDRESSAccess().getCommaKeyword_2());
            		
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_3);
            		

            			newLeafNode(this_STRING_3, grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleADDRESS"


    // $ANTLR start "entryRuleLICENCE"
    // InternalMyRds.g:1824:1: entryRuleLICENCE returns [String current=null] : iv_ruleLICENCE= ruleLICENCE EOF ;
    public final String entryRuleLICENCE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLICENCE = null;


        try {
            // InternalMyRds.g:1824:47: (iv_ruleLICENCE= ruleLICENCE EOF )
            // InternalMyRds.g:1825:2: iv_ruleLICENCE= ruleLICENCE EOF
            {
             newCompositeNode(grammarAccess.getLICENCERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLICENCE=ruleLICENCE();

            state._fsp--;

             current =iv_ruleLICENCE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLICENCE"


    // $ANTLR start "ruleLICENCE"
    // InternalMyRds.g:1831:1: ruleLICENCE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING this_INT_1= RULE_INT this_INT_2= RULE_INT this_STRING_3= RULE_STRING this_STRING_4= RULE_STRING this_STRING_5= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLICENCE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        Token this_INT_2=null;
        Token this_STRING_3=null;
        Token this_STRING_4=null;
        Token this_STRING_5=null;


        	enterRule();

        try {
            // InternalMyRds.g:1837:2: ( (this_STRING_0= RULE_STRING this_INT_1= RULE_INT this_INT_2= RULE_INT this_STRING_3= RULE_STRING this_STRING_4= RULE_STRING this_STRING_5= RULE_STRING ) )
            // InternalMyRds.g:1838:2: (this_STRING_0= RULE_STRING this_INT_1= RULE_INT this_INT_2= RULE_INT this_STRING_3= RULE_STRING this_STRING_4= RULE_STRING this_STRING_5= RULE_STRING )
            {
            // InternalMyRds.g:1838:2: (this_STRING_0= RULE_STRING this_INT_1= RULE_INT this_INT_2= RULE_INT this_STRING_3= RULE_STRING this_STRING_4= RULE_STRING this_STRING_5= RULE_STRING )
            // InternalMyRds.g:1839:3: this_STRING_0= RULE_STRING this_INT_1= RULE_INT this_INT_2= RULE_INT this_STRING_3= RULE_STRING this_STRING_4= RULE_STRING this_STRING_5= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            			current.merge(this_STRING_0);
            		

            			newLeafNode(this_STRING_0, grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getLICENCEAccess().getINTTerminalRuleCall_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_8); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getLICENCEAccess().getINTTerminalRuleCall_2());
            		
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_8); 

            			current.merge(this_STRING_3);
            		

            			newLeafNode(this_STRING_3, grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_3());
            		
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_8); 

            			current.merge(this_STRING_4);
            		

            			newLeafNode(this_STRING_4, grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_4());
            		
            this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_5);
            		

            			newLeafNode(this_STRING_5, grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleLICENCE"


    // $ANTLR start "ruleOrderStatus"
    // InternalMyRds.g:1885:1: ruleOrderStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'accepted' ) | (enumLiteral_1= 'preparation' ) | (enumLiteral_2= 'ready_pickup' ) | (enumLiteral_3= 'picked_up' ) | (enumLiteral_4= 'delivered' ) ) ;
    public final Enumerator ruleOrderStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyRds.g:1891:2: ( ( (enumLiteral_0= 'accepted' ) | (enumLiteral_1= 'preparation' ) | (enumLiteral_2= 'ready_pickup' ) | (enumLiteral_3= 'picked_up' ) | (enumLiteral_4= 'delivered' ) ) )
            // InternalMyRds.g:1892:2: ( (enumLiteral_0= 'accepted' ) | (enumLiteral_1= 'preparation' ) | (enumLiteral_2= 'ready_pickup' ) | (enumLiteral_3= 'picked_up' ) | (enumLiteral_4= 'delivered' ) )
            {
            // InternalMyRds.g:1892:2: ( (enumLiteral_0= 'accepted' ) | (enumLiteral_1= 'preparation' ) | (enumLiteral_2= 'ready_pickup' ) | (enumLiteral_3= 'picked_up' ) | (enumLiteral_4= 'delivered' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt10=1;
                }
                break;
            case 56:
                {
                alt10=2;
                }
                break;
            case 57:
                {
                alt10=3;
                }
                break;
            case 58:
                {
                alt10=4;
                }
                break;
            case 59:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyRds.g:1893:3: (enumLiteral_0= 'accepted' )
                    {
                    // InternalMyRds.g:1893:3: (enumLiteral_0= 'accepted' )
                    // InternalMyRds.g:1894:4: enumLiteral_0= 'accepted'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getOrderStatusAccess().getACCEPTEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrderStatusAccess().getACCEPTEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyRds.g:1901:3: (enumLiteral_1= 'preparation' )
                    {
                    // InternalMyRds.g:1901:3: (enumLiteral_1= 'preparation' )
                    // InternalMyRds.g:1902:4: enumLiteral_1= 'preparation'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getOrderStatusAccess().getPREPARATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrderStatusAccess().getPREPARATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyRds.g:1909:3: (enumLiteral_2= 'ready_pickup' )
                    {
                    // InternalMyRds.g:1909:3: (enumLiteral_2= 'ready_pickup' )
                    // InternalMyRds.g:1910:4: enumLiteral_2= 'ready_pickup'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getOrderStatusAccess().getREADY_PICKUPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOrderStatusAccess().getREADY_PICKUPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyRds.g:1917:3: (enumLiteral_3= 'picked_up' )
                    {
                    // InternalMyRds.g:1917:3: (enumLiteral_3= 'picked_up' )
                    // InternalMyRds.g:1918:4: enumLiteral_3= 'picked_up'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getOrderStatusAccess().getPICKED_UPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOrderStatusAccess().getPICKED_UPEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyRds.g:1925:3: (enumLiteral_4= 'delivered' )
                    {
                    // InternalMyRds.g:1925:3: (enumLiteral_4= 'delivered' )
                    // InternalMyRds.g:1926:4: enumLiteral_4= 'delivered'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getOrderStatusAccess().getDELIVEREDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOrderStatusAccess().getDELIVEREDEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleOrderStatus"


    // $ANTLR start "ruleMenuItemCategory"
    // InternalMyRds.g:1936:1: ruleMenuItemCategory returns [Enumerator current=null] : ( (enumLiteral_0= 'appetizer' ) | (enumLiteral_1= 'side_dish' ) | (enumLiteral_2= 'main_dish' ) | (enumLiteral_3= 'dessert' ) | (enumLiteral_4= 'drink' ) ) ;
    public final Enumerator ruleMenuItemCategory() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyRds.g:1942:2: ( ( (enumLiteral_0= 'appetizer' ) | (enumLiteral_1= 'side_dish' ) | (enumLiteral_2= 'main_dish' ) | (enumLiteral_3= 'dessert' ) | (enumLiteral_4= 'drink' ) ) )
            // InternalMyRds.g:1943:2: ( (enumLiteral_0= 'appetizer' ) | (enumLiteral_1= 'side_dish' ) | (enumLiteral_2= 'main_dish' ) | (enumLiteral_3= 'dessert' ) | (enumLiteral_4= 'drink' ) )
            {
            // InternalMyRds.g:1943:2: ( (enumLiteral_0= 'appetizer' ) | (enumLiteral_1= 'side_dish' ) | (enumLiteral_2= 'main_dish' ) | (enumLiteral_3= 'dessert' ) | (enumLiteral_4= 'drink' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt11=1;
                }
                break;
            case 61:
                {
                alt11=2;
                }
                break;
            case 62:
                {
                alt11=3;
                }
                break;
            case 63:
                {
                alt11=4;
                }
                break;
            case 64:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyRds.g:1944:3: (enumLiteral_0= 'appetizer' )
                    {
                    // InternalMyRds.g:1944:3: (enumLiteral_0= 'appetizer' )
                    // InternalMyRds.g:1945:4: enumLiteral_0= 'appetizer'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getMenuItemCategoryAccess().getAPPETIZEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMenuItemCategoryAccess().getAPPETIZEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyRds.g:1952:3: (enumLiteral_1= 'side_dish' )
                    {
                    // InternalMyRds.g:1952:3: (enumLiteral_1= 'side_dish' )
                    // InternalMyRds.g:1953:4: enumLiteral_1= 'side_dish'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getMenuItemCategoryAccess().getSIDE_DISHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMenuItemCategoryAccess().getSIDE_DISHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyRds.g:1960:3: (enumLiteral_2= 'main_dish' )
                    {
                    // InternalMyRds.g:1960:3: (enumLiteral_2= 'main_dish' )
                    // InternalMyRds.g:1961:4: enumLiteral_2= 'main_dish'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getMenuItemCategoryAccess().getMAIN_DISHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMenuItemCategoryAccess().getMAIN_DISHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyRds.g:1968:3: (enumLiteral_3= 'dessert' )
                    {
                    // InternalMyRds.g:1968:3: (enumLiteral_3= 'dessert' )
                    // InternalMyRds.g:1969:4: enumLiteral_3= 'dessert'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getMenuItemCategoryAccess().getDESSERTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMenuItemCategoryAccess().getDESSERTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyRds.g:1976:3: (enumLiteral_4= 'drink' )
                    {
                    // InternalMyRds.g:1976:3: (enumLiteral_4= 'drink' )
                    // InternalMyRds.g:1977:4: enumLiteral_4= 'drink'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getMenuItemCategoryAccess().getDRINKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMenuItemCategoryAccess().getDRINKEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleMenuItemCategory"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000088A401300802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0F80000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000000000L});

}