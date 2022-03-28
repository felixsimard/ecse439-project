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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'User'", "'{'", "'name'", "':'", "'password'", "'phone'", "'email'", "'}'", "'Customer'", "'DeliveryDriver'", "'isAvailable'", "'carLicenceNumber'", "'Order'", "'STATUS'", "'DELIVER_TO'", "'CUSTOMER'", "'DRIVER'", "'ORDERED_AT'", "'DELIVERED_AT'", "'REQUESTEDDELIVERYDATETIME'", "'ITEMS'", "'Restaurant'", "'address'", "'Menu'", "'items'", "'price'", "'description'", "'category'", "'quantity'", "'menuItem'", "'Review'", "'numStars'", "'reviewDatetime'", "'.'", "'-'", "'@'", "'.com'", "'accepted'", "'preparation'", "'ready_pickup'", "'picked_up'", "'delivered'", "'appetizer'", "'side_dish'", "'main_dish'", "'dessert'", "'drink'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    // InternalMyRds.g:72:1: ruleRDS returns [EObject current=null] : ( ( ( (lv_users_0_0= ruleUser ) ) (otherlv_1= ',' ( (lv_users_2_0= ruleUser ) ) )* )? ( ( (lv_restaurants_3_0= ruleRestaurant ) ) (otherlv_4= ',' ( (lv_restaurants_5_0= ruleRestaurant ) ) )* )? ( ( (lv_orders_6_0= ruleOrder ) ) (otherlv_7= ',' ( (lv_orders_8_0= ruleOrder ) ) )* )? ) ;
    public final EObject ruleRDS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_users_0_0 = null;

        EObject lv_users_2_0 = null;

        EObject lv_restaurants_3_0 = null;

        EObject lv_restaurants_5_0 = null;

        EObject lv_orders_6_0 = null;

        EObject lv_orders_8_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:78:2: ( ( ( ( (lv_users_0_0= ruleUser ) ) (otherlv_1= ',' ( (lv_users_2_0= ruleUser ) ) )* )? ( ( (lv_restaurants_3_0= ruleRestaurant ) ) (otherlv_4= ',' ( (lv_restaurants_5_0= ruleRestaurant ) ) )* )? ( ( (lv_orders_6_0= ruleOrder ) ) (otherlv_7= ',' ( (lv_orders_8_0= ruleOrder ) ) )* )? ) )
            // InternalMyRds.g:79:2: ( ( ( (lv_users_0_0= ruleUser ) ) (otherlv_1= ',' ( (lv_users_2_0= ruleUser ) ) )* )? ( ( (lv_restaurants_3_0= ruleRestaurant ) ) (otherlv_4= ',' ( (lv_restaurants_5_0= ruleRestaurant ) ) )* )? ( ( (lv_orders_6_0= ruleOrder ) ) (otherlv_7= ',' ( (lv_orders_8_0= ruleOrder ) ) )* )? )
            {
            // InternalMyRds.g:79:2: ( ( ( (lv_users_0_0= ruleUser ) ) (otherlv_1= ',' ( (lv_users_2_0= ruleUser ) ) )* )? ( ( (lv_restaurants_3_0= ruleRestaurant ) ) (otherlv_4= ',' ( (lv_restaurants_5_0= ruleRestaurant ) ) )* )? ( ( (lv_orders_6_0= ruleOrder ) ) (otherlv_7= ',' ( (lv_orders_8_0= ruleOrder ) ) )* )? )
            // InternalMyRds.g:80:3: ( ( (lv_users_0_0= ruleUser ) ) (otherlv_1= ',' ( (lv_users_2_0= ruleUser ) ) )* )? ( ( (lv_restaurants_3_0= ruleRestaurant ) ) (otherlv_4= ',' ( (lv_restaurants_5_0= ruleRestaurant ) ) )* )? ( ( (lv_orders_6_0= ruleOrder ) ) (otherlv_7= ',' ( (lv_orders_8_0= ruleOrder ) ) )* )?
            {
            // InternalMyRds.g:80:3: ( ( (lv_users_0_0= ruleUser ) ) (otherlv_1= ',' ( (lv_users_2_0= ruleUser ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyRds.g:81:4: ( (lv_users_0_0= ruleUser ) ) (otherlv_1= ',' ( (lv_users_2_0= ruleUser ) ) )*
                    {
                    // InternalMyRds.g:81:4: ( (lv_users_0_0= ruleUser ) )
                    // InternalMyRds.g:82:5: (lv_users_0_0= ruleUser )
                    {
                    // InternalMyRds.g:82:5: (lv_users_0_0= ruleUser )
                    // InternalMyRds.g:83:6: lv_users_0_0= ruleUser
                    {

                    						newCompositeNode(grammarAccess.getRDSAccess().getUsersUserParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_users_0_0=ruleUser();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRDSRule());
                    						}
                    						add(
                    							current,
                    							"users",
                    							lv_users_0_0,
                    							"org.xtext.project.rds.MyRds.User");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyRds.g:100:4: (otherlv_1= ',' ( (lv_users_2_0= ruleUser ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyRds.g:101:5: otherlv_1= ',' ( (lv_users_2_0= ruleUser ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FOLLOW_4); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getRDSAccess().getCommaKeyword_0_1_0());
                    	    				
                    	    // InternalMyRds.g:105:5: ( (lv_users_2_0= ruleUser ) )
                    	    // InternalMyRds.g:106:6: (lv_users_2_0= ruleUser )
                    	    {
                    	    // InternalMyRds.g:106:6: (lv_users_2_0= ruleUser )
                    	    // InternalMyRds.g:107:7: lv_users_2_0= ruleUser
                    	    {

                    	    							newCompositeNode(grammarAccess.getRDSAccess().getUsersUserParserRuleCall_0_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_3);
                    	    lv_users_2_0=ruleUser();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRDSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"users",
                    	    								lv_users_2_0,
                    	    								"org.xtext.project.rds.MyRds.User");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyRds.g:126:3: ( ( (lv_restaurants_3_0= ruleRestaurant ) ) (otherlv_4= ',' ( (lv_restaurants_5_0= ruleRestaurant ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyRds.g:127:4: ( (lv_restaurants_3_0= ruleRestaurant ) ) (otherlv_4= ',' ( (lv_restaurants_5_0= ruleRestaurant ) ) )*
                    {
                    // InternalMyRds.g:127:4: ( (lv_restaurants_3_0= ruleRestaurant ) )
                    // InternalMyRds.g:128:5: (lv_restaurants_3_0= ruleRestaurant )
                    {
                    // InternalMyRds.g:128:5: (lv_restaurants_3_0= ruleRestaurant )
                    // InternalMyRds.g:129:6: lv_restaurants_3_0= ruleRestaurant
                    {

                    						newCompositeNode(grammarAccess.getRDSAccess().getRestaurantsRestaurantParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_restaurants_3_0=ruleRestaurant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRDSRule());
                    						}
                    						add(
                    							current,
                    							"restaurants",
                    							lv_restaurants_3_0,
                    							"org.xtext.project.rds.MyRds.Restaurant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyRds.g:146:4: (otherlv_4= ',' ( (lv_restaurants_5_0= ruleRestaurant ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==11) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyRds.g:147:5: otherlv_4= ',' ( (lv_restaurants_5_0= ruleRestaurant ) )
                    	    {
                    	    otherlv_4=(Token)match(input,11,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRDSAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMyRds.g:151:5: ( (lv_restaurants_5_0= ruleRestaurant ) )
                    	    // InternalMyRds.g:152:6: (lv_restaurants_5_0= ruleRestaurant )
                    	    {
                    	    // InternalMyRds.g:152:6: (lv_restaurants_5_0= ruleRestaurant )
                    	    // InternalMyRds.g:153:7: lv_restaurants_5_0= ruleRestaurant
                    	    {

                    	    							newCompositeNode(grammarAccess.getRDSAccess().getRestaurantsRestaurantParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_restaurants_5_0=ruleRestaurant();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRDSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"restaurants",
                    	    								lv_restaurants_5_0,
                    	    								"org.xtext.project.rds.MyRds.Restaurant");
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
                    break;

            }

            // InternalMyRds.g:172:3: ( ( (lv_orders_6_0= ruleOrder ) ) (otherlv_7= ',' ( (lv_orders_8_0= ruleOrder ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyRds.g:173:4: ( (lv_orders_6_0= ruleOrder ) ) (otherlv_7= ',' ( (lv_orders_8_0= ruleOrder ) ) )*
                    {
                    // InternalMyRds.g:173:4: ( (lv_orders_6_0= ruleOrder ) )
                    // InternalMyRds.g:174:5: (lv_orders_6_0= ruleOrder )
                    {
                    // InternalMyRds.g:174:5: (lv_orders_6_0= ruleOrder )
                    // InternalMyRds.g:175:6: lv_orders_6_0= ruleOrder
                    {

                    						newCompositeNode(grammarAccess.getRDSAccess().getOrdersOrderParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_orders_6_0=ruleOrder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRDSRule());
                    						}
                    						add(
                    							current,
                    							"orders",
                    							lv_orders_6_0,
                    							"org.xtext.project.rds.MyRds.Order");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyRds.g:192:4: (otherlv_7= ',' ( (lv_orders_8_0= ruleOrder ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==11) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyRds.g:193:5: otherlv_7= ',' ( (lv_orders_8_0= ruleOrder ) )
                    	    {
                    	    otherlv_7=(Token)match(input,11,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRDSAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMyRds.g:197:5: ( (lv_orders_8_0= ruleOrder ) )
                    	    // InternalMyRds.g:198:6: (lv_orders_8_0= ruleOrder )
                    	    {
                    	    // InternalMyRds.g:198:6: (lv_orders_8_0= ruleOrder )
                    	    // InternalMyRds.g:199:7: lv_orders_8_0= ruleOrder
                    	    {

                    	    							newCompositeNode(grammarAccess.getRDSAccess().getOrdersOrderParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_orders_8_0=ruleOrder();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRDSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"orders",
                    	    								lv_orders_8_0,
                    	    								"org.xtext.project.rds.MyRds.Order");
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
    // $ANTLR end "ruleRDS"


    // $ANTLR start "entryRuleUser"
    // InternalMyRds.g:222:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalMyRds.g:222:45: (iv_ruleUser= ruleUser EOF )
            // InternalMyRds.g:223:2: iv_ruleUser= ruleUser EOF
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
    // InternalMyRds.g:229:1: ruleUser returns [EObject current=null] : (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'password' otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'phone' otherlv_11= ':' ( (lv_phone_12_0= rulePHONE ) ) otherlv_13= ',' otherlv_14= 'email' otherlv_15= ':' ( (lv_email_16_0= ruleEMAIL ) ) otherlv_17= ',' ( ( (lv_roles_18_0= ruleUserRole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleUserRole ) ) )* )+ otherlv_21= '}' ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_password_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_phone_12_0 = null;

        AntlrDatatypeRuleToken lv_email_16_0 = null;

        EObject lv_roles_18_0 = null;

        EObject lv_roles_20_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:235:2: ( (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'password' otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'phone' otherlv_11= ':' ( (lv_phone_12_0= rulePHONE ) ) otherlv_13= ',' otherlv_14= 'email' otherlv_15= ':' ( (lv_email_16_0= ruleEMAIL ) ) otherlv_17= ',' ( ( (lv_roles_18_0= ruleUserRole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleUserRole ) ) )* )+ otherlv_21= '}' ) )
            // InternalMyRds.g:236:2: (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'password' otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'phone' otherlv_11= ':' ( (lv_phone_12_0= rulePHONE ) ) otherlv_13= ',' otherlv_14= 'email' otherlv_15= ':' ( (lv_email_16_0= ruleEMAIL ) ) otherlv_17= ',' ( ( (lv_roles_18_0= ruleUserRole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleUserRole ) ) )* )+ otherlv_21= '}' )
            {
            // InternalMyRds.g:236:2: (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'password' otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'phone' otherlv_11= ':' ( (lv_phone_12_0= rulePHONE ) ) otherlv_13= ',' otherlv_14= 'email' otherlv_15= ':' ( (lv_email_16_0= ruleEMAIL ) ) otherlv_17= ',' ( ( (lv_roles_18_0= ruleUserRole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleUserRole ) ) )* )+ otherlv_21= '}' )
            // InternalMyRds.g:237:3: otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'password' otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'phone' otherlv_11= ':' ( (lv_phone_12_0= rulePHONE ) ) otherlv_13= ',' otherlv_14= 'email' otherlv_15= ':' ( (lv_email_16_0= ruleEMAIL ) ) otherlv_17= ',' ( ( (lv_roles_18_0= ruleUserRole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleUserRole ) ) )* )+ otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getUserAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getUserAccess().getColonKeyword_3());
            		
            // InternalMyRds.g:253:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalMyRds.g:254:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalMyRds.g:254:4: (lv_name_4_0= RULE_STRING )
            // InternalMyRds.g:255:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_name_4_0, grammarAccess.getUserAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getUserAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getUserAccess().getPasswordKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getUserAccess().getColonKeyword_7());
            		
            // InternalMyRds.g:283:3: ( (lv_password_8_0= RULE_STRING ) )
            // InternalMyRds.g:284:4: (lv_password_8_0= RULE_STRING )
            {
            // InternalMyRds.g:284:4: (lv_password_8_0= RULE_STRING )
            // InternalMyRds.g:285:5: lv_password_8_0= RULE_STRING
            {
            lv_password_8_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_9=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getUserAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getUserAccess().getPhoneKeyword_10());
            		
            otherlv_11=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_11, grammarAccess.getUserAccess().getColonKeyword_11());
            		
            // InternalMyRds.g:313:3: ( (lv_phone_12_0= rulePHONE ) )
            // InternalMyRds.g:314:4: (lv_phone_12_0= rulePHONE )
            {
            // InternalMyRds.g:314:4: (lv_phone_12_0= rulePHONE )
            // InternalMyRds.g:315:5: lv_phone_12_0= rulePHONE
            {

            					newCompositeNode(grammarAccess.getUserAccess().getPhonePHONEParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_13);
            lv_phone_12_0=rulePHONE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"phone",
            						lv_phone_12_0,
            						"org.xtext.project.rds.MyRds.PHONE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,11,FOLLOW_17); 

            			newLeafNode(otherlv_13, grammarAccess.getUserAccess().getCommaKeyword_13());
            		
            otherlv_14=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getUserAccess().getEmailKeyword_14());
            		
            otherlv_15=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_15, grammarAccess.getUserAccess().getColonKeyword_15());
            		
            // InternalMyRds.g:344:3: ( (lv_email_16_0= ruleEMAIL ) )
            // InternalMyRds.g:345:4: (lv_email_16_0= ruleEMAIL )
            {
            // InternalMyRds.g:345:4: (lv_email_16_0= ruleEMAIL )
            // InternalMyRds.g:346:5: lv_email_16_0= ruleEMAIL
            {

            					newCompositeNode(grammarAccess.getUserAccess().getEmailEMAILParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_13);
            lv_email_16_0=ruleEMAIL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"email",
            						lv_email_16_0,
            						"org.xtext.project.rds.MyRds.EMAIL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_17, grammarAccess.getUserAccess().getCommaKeyword_17());
            		
            // InternalMyRds.g:367:3: ( ( (lv_roles_18_0= ruleUserRole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleUserRole ) ) )* )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=20 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyRds.g:368:4: ( (lv_roles_18_0= ruleUserRole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleUserRole ) ) )*
            	    {
            	    // InternalMyRds.g:368:4: ( (lv_roles_18_0= ruleUserRole ) )
            	    // InternalMyRds.g:369:5: (lv_roles_18_0= ruleUserRole )
            	    {
            	    // InternalMyRds.g:369:5: (lv_roles_18_0= ruleUserRole )
            	    // InternalMyRds.g:370:6: lv_roles_18_0= ruleUserRole
            	    {

            	    						newCompositeNode(grammarAccess.getUserAccess().getRolesUserRoleParserRuleCall_18_0_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_roles_18_0=ruleUserRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUserRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_18_0,
            	    							"org.xtext.project.rds.MyRds.UserRole");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyRds.g:387:4: (otherlv_19= ',' ( (lv_roles_20_0= ruleUserRole ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==11) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalMyRds.g:388:5: otherlv_19= ',' ( (lv_roles_20_0= ruleUserRole ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,11,FOLLOW_18); 

            	    	    					newLeafNode(otherlv_19, grammarAccess.getUserAccess().getCommaKeyword_18_1_0());
            	    	    				
            	    	    // InternalMyRds.g:392:5: ( (lv_roles_20_0= ruleUserRole ) )
            	    	    // InternalMyRds.g:393:6: (lv_roles_20_0= ruleUserRole )
            	    	    {
            	    	    // InternalMyRds.g:393:6: (lv_roles_20_0= ruleUserRole )
            	    	    // InternalMyRds.g:394:7: lv_roles_20_0= ruleUserRole
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getUserAccess().getRolesUserRoleParserRuleCall_18_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_roles_20_0=ruleUserRole();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getUserRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"roles",
            	    	    								lv_roles_20_0,
            	    	    								"org.xtext.project.rds.MyRds.UserRole");
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
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_21=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_19());
            		

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


    // $ANTLR start "entryRuleUserRole"
    // InternalMyRds.g:421:1: entryRuleUserRole returns [EObject current=null] : iv_ruleUserRole= ruleUserRole EOF ;
    public final EObject entryRuleUserRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserRole = null;


        try {
            // InternalMyRds.g:421:49: (iv_ruleUserRole= ruleUserRole EOF )
            // InternalMyRds.g:422:2: iv_ruleUserRole= ruleUserRole EOF
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
    // InternalMyRds.g:428:1: ruleUserRole returns [EObject current=null] : (this_Customer_0= ruleCustomer | this_DeliveryDriver_1= ruleDeliveryDriver ) ;
    public final EObject ruleUserRole() throws RecognitionException {
        EObject current = null;

        EObject this_Customer_0 = null;

        EObject this_DeliveryDriver_1 = null;



        	enterRule();

        try {
            // InternalMyRds.g:434:2: ( (this_Customer_0= ruleCustomer | this_DeliveryDriver_1= ruleDeliveryDriver ) )
            // InternalMyRds.g:435:2: (this_Customer_0= ruleCustomer | this_DeliveryDriver_1= ruleDeliveryDriver )
            {
            // InternalMyRds.g:435:2: (this_Customer_0= ruleCustomer | this_DeliveryDriver_1= ruleDeliveryDriver )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyRds.g:436:3: this_Customer_0= ruleCustomer
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
                    // InternalMyRds.g:445:3: this_DeliveryDriver_1= ruleDeliveryDriver
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


    // $ANTLR start "entryRuleCustomer"
    // InternalMyRds.g:457:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalMyRds.g:457:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalMyRds.g:458:2: iv_ruleCustomer= ruleCustomer EOF
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
    // InternalMyRds.g:464:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'Customer' ( (lv_username_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_username_1_0=null;


        	enterRule();

        try {
            // InternalMyRds.g:470:2: ( (otherlv_0= 'Customer' ( (lv_username_1_0= RULE_ID ) ) ) )
            // InternalMyRds.g:471:2: (otherlv_0= 'Customer' ( (lv_username_1_0= RULE_ID ) ) )
            {
            // InternalMyRds.g:471:2: (otherlv_0= 'Customer' ( (lv_username_1_0= RULE_ID ) ) )
            // InternalMyRds.g:472:3: otherlv_0= 'Customer' ( (lv_username_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerKeyword_0());
            		
            // InternalMyRds.g:476:3: ( (lv_username_1_0= RULE_ID ) )
            // InternalMyRds.g:477:4: (lv_username_1_0= RULE_ID )
            {
            // InternalMyRds.g:477:4: (lv_username_1_0= RULE_ID )
            // InternalMyRds.g:478:5: lv_username_1_0= RULE_ID
            {
            lv_username_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_username_1_0, grammarAccess.getCustomerAccess().getUsernameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"username",
            						lv_username_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleDeliveryDriver"
    // InternalMyRds.g:498:1: entryRuleDeliveryDriver returns [EObject current=null] : iv_ruleDeliveryDriver= ruleDeliveryDriver EOF ;
    public final EObject entryRuleDeliveryDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeliveryDriver = null;


        try {
            // InternalMyRds.g:498:55: (iv_ruleDeliveryDriver= ruleDeliveryDriver EOF )
            // InternalMyRds.g:499:2: iv_ruleDeliveryDriver= ruleDeliveryDriver EOF
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
    // InternalMyRds.g:505:1: ruleDeliveryDriver returns [EObject current=null] : (otherlv_0= 'DeliveryDriver' ( (lv_username_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isAvailable_3_0= 'isAvailable' ) )? otherlv_4= ',' otherlv_5= 'carLicenceNumber' otherlv_6= ':' ( (lv_carLicenceNumber_7_0= ruleLICENCE ) ) otherlv_8= '}' ) ;
    public final EObject ruleDeliveryDriver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_username_1_0=null;
        Token otherlv_2=null;
        Token lv_isAvailable_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_carLicenceNumber_7_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:511:2: ( (otherlv_0= 'DeliveryDriver' ( (lv_username_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isAvailable_3_0= 'isAvailable' ) )? otherlv_4= ',' otherlv_5= 'carLicenceNumber' otherlv_6= ':' ( (lv_carLicenceNumber_7_0= ruleLICENCE ) ) otherlv_8= '}' ) )
            // InternalMyRds.g:512:2: (otherlv_0= 'DeliveryDriver' ( (lv_username_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isAvailable_3_0= 'isAvailable' ) )? otherlv_4= ',' otherlv_5= 'carLicenceNumber' otherlv_6= ':' ( (lv_carLicenceNumber_7_0= ruleLICENCE ) ) otherlv_8= '}' )
            {
            // InternalMyRds.g:512:2: (otherlv_0= 'DeliveryDriver' ( (lv_username_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isAvailable_3_0= 'isAvailable' ) )? otherlv_4= ',' otherlv_5= 'carLicenceNumber' otherlv_6= ':' ( (lv_carLicenceNumber_7_0= ruleLICENCE ) ) otherlv_8= '}' )
            // InternalMyRds.g:513:3: otherlv_0= 'DeliveryDriver' ( (lv_username_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_isAvailable_3_0= 'isAvailable' ) )? otherlv_4= ',' otherlv_5= 'carLicenceNumber' otherlv_6= ':' ( (lv_carLicenceNumber_7_0= ruleLICENCE ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDeliveryDriverAccess().getDeliveryDriverKeyword_0());
            		
            // InternalMyRds.g:517:3: ( (lv_username_1_0= RULE_ID ) )
            // InternalMyRds.g:518:4: (lv_username_1_0= RULE_ID )
            {
            // InternalMyRds.g:518:4: (lv_username_1_0= RULE_ID )
            // InternalMyRds.g:519:5: lv_username_1_0= RULE_ID
            {
            lv_username_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_username_1_0, grammarAccess.getDeliveryDriverAccess().getUsernameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryDriverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"username",
            						lv_username_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDeliveryDriverAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyRds.g:539:3: ( (lv_isAvailable_3_0= 'isAvailable' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyRds.g:540:4: (lv_isAvailable_3_0= 'isAvailable' )
                    {
                    // InternalMyRds.g:540:4: (lv_isAvailable_3_0= 'isAvailable' )
                    // InternalMyRds.g:541:5: lv_isAvailable_3_0= 'isAvailable'
                    {
                    lv_isAvailable_3_0=(Token)match(input,22,FOLLOW_13); 

                    					newLeafNode(lv_isAvailable_3_0, grammarAccess.getDeliveryDriverAccess().getIsAvailableIsAvailableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeliveryDriverRule());
                    					}
                    					setWithLastConsumed(current, "isAvailable", lv_isAvailable_3_0 != null, "isAvailable");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,11,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getDeliveryDriverAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getDeliveryDriverAccess().getCarLicenceNumberKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getDeliveryDriverAccess().getColonKeyword_6());
            		
            // InternalMyRds.g:565:3: ( (lv_carLicenceNumber_7_0= ruleLICENCE ) )
            // InternalMyRds.g:566:4: (lv_carLicenceNumber_7_0= ruleLICENCE )
            {
            // InternalMyRds.g:566:4: (lv_carLicenceNumber_7_0= ruleLICENCE )
            // InternalMyRds.g:567:5: lv_carLicenceNumber_7_0= ruleLICENCE
            {

            					newCompositeNode(grammarAccess.getDeliveryDriverAccess().getCarLicenceNumberLICENCEParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_carLicenceNumber_7_0=ruleLICENCE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeliveryDriverRule());
            					}
            					set(
            						current,
            						"carLicenceNumber",
            						lv_carLicenceNumber_7_0,
            						"org.xtext.project.rds.MyRds.LICENCE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDeliveryDriverAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalMyRds.g:592:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalMyRds.g:592:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalMyRds.g:593:2: iv_ruleOrder= ruleOrder EOF
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
    // InternalMyRds.g:599:1: ruleOrder returns [EObject current=null] : (otherlv_0= 'Order' ( (lv_orderNumber_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'STATUS' otherlv_4= ':' ( (lv_status_5_0= ruleOrderStatus ) ) otherlv_6= ',' otherlv_7= 'DELIVER_TO' otherlv_8= ':' ( (lv_deliveryAddress_9_0= ruleADDRESS ) ) otherlv_10= ',' otherlv_11= 'CUSTOMER' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) otherlv_14= ',' otherlv_15= 'DRIVER' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= ',' otherlv_19= 'ORDERED_AT' otherlv_20= ':' ( (lv_orderedDatetime_21_0= ruleDATETIME ) ) otherlv_22= ',' otherlv_23= 'DELIVERED_AT' otherlv_24= ':' ( (lv_deliveredDatetime_25_0= ruleDATETIME ) ) otherlv_26= ',' otherlv_27= 'REQUESTEDDELIVERYDATETIME' otherlv_28= ':' ( (lv_requestedDeliveryDatetime_29_0= ruleDATETIME ) ) otherlv_30= ',' otherlv_31= 'ITEMS' otherlv_32= ':' ( ( (lv_orderItems_33_0= ruleOrderItem ) ) (otherlv_34= ',' ( (lv_orderItems_35_0= ruleOrderItem ) ) )* )? ( (lv_review_36_0= ruleReview ) )? otherlv_37= '}' ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_orderNumber_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_37=null;
        Enumerator lv_status_5_0 = null;

        AntlrDatatypeRuleToken lv_deliveryAddress_9_0 = null;

        AntlrDatatypeRuleToken lv_orderedDatetime_21_0 = null;

        AntlrDatatypeRuleToken lv_deliveredDatetime_25_0 = null;

        AntlrDatatypeRuleToken lv_requestedDeliveryDatetime_29_0 = null;

        EObject lv_orderItems_33_0 = null;

        EObject lv_orderItems_35_0 = null;

        EObject lv_review_36_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:605:2: ( (otherlv_0= 'Order' ( (lv_orderNumber_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'STATUS' otherlv_4= ':' ( (lv_status_5_0= ruleOrderStatus ) ) otherlv_6= ',' otherlv_7= 'DELIVER_TO' otherlv_8= ':' ( (lv_deliveryAddress_9_0= ruleADDRESS ) ) otherlv_10= ',' otherlv_11= 'CUSTOMER' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) otherlv_14= ',' otherlv_15= 'DRIVER' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= ',' otherlv_19= 'ORDERED_AT' otherlv_20= ':' ( (lv_orderedDatetime_21_0= ruleDATETIME ) ) otherlv_22= ',' otherlv_23= 'DELIVERED_AT' otherlv_24= ':' ( (lv_deliveredDatetime_25_0= ruleDATETIME ) ) otherlv_26= ',' otherlv_27= 'REQUESTEDDELIVERYDATETIME' otherlv_28= ':' ( (lv_requestedDeliveryDatetime_29_0= ruleDATETIME ) ) otherlv_30= ',' otherlv_31= 'ITEMS' otherlv_32= ':' ( ( (lv_orderItems_33_0= ruleOrderItem ) ) (otherlv_34= ',' ( (lv_orderItems_35_0= ruleOrderItem ) ) )* )? ( (lv_review_36_0= ruleReview ) )? otherlv_37= '}' ) )
            // InternalMyRds.g:606:2: (otherlv_0= 'Order' ( (lv_orderNumber_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'STATUS' otherlv_4= ':' ( (lv_status_5_0= ruleOrderStatus ) ) otherlv_6= ',' otherlv_7= 'DELIVER_TO' otherlv_8= ':' ( (lv_deliveryAddress_9_0= ruleADDRESS ) ) otherlv_10= ',' otherlv_11= 'CUSTOMER' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) otherlv_14= ',' otherlv_15= 'DRIVER' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= ',' otherlv_19= 'ORDERED_AT' otherlv_20= ':' ( (lv_orderedDatetime_21_0= ruleDATETIME ) ) otherlv_22= ',' otherlv_23= 'DELIVERED_AT' otherlv_24= ':' ( (lv_deliveredDatetime_25_0= ruleDATETIME ) ) otherlv_26= ',' otherlv_27= 'REQUESTEDDELIVERYDATETIME' otherlv_28= ':' ( (lv_requestedDeliveryDatetime_29_0= ruleDATETIME ) ) otherlv_30= ',' otherlv_31= 'ITEMS' otherlv_32= ':' ( ( (lv_orderItems_33_0= ruleOrderItem ) ) (otherlv_34= ',' ( (lv_orderItems_35_0= ruleOrderItem ) ) )* )? ( (lv_review_36_0= ruleReview ) )? otherlv_37= '}' )
            {
            // InternalMyRds.g:606:2: (otherlv_0= 'Order' ( (lv_orderNumber_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'STATUS' otherlv_4= ':' ( (lv_status_5_0= ruleOrderStatus ) ) otherlv_6= ',' otherlv_7= 'DELIVER_TO' otherlv_8= ':' ( (lv_deliveryAddress_9_0= ruleADDRESS ) ) otherlv_10= ',' otherlv_11= 'CUSTOMER' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) otherlv_14= ',' otherlv_15= 'DRIVER' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= ',' otherlv_19= 'ORDERED_AT' otherlv_20= ':' ( (lv_orderedDatetime_21_0= ruleDATETIME ) ) otherlv_22= ',' otherlv_23= 'DELIVERED_AT' otherlv_24= ':' ( (lv_deliveredDatetime_25_0= ruleDATETIME ) ) otherlv_26= ',' otherlv_27= 'REQUESTEDDELIVERYDATETIME' otherlv_28= ':' ( (lv_requestedDeliveryDatetime_29_0= ruleDATETIME ) ) otherlv_30= ',' otherlv_31= 'ITEMS' otherlv_32= ':' ( ( (lv_orderItems_33_0= ruleOrderItem ) ) (otherlv_34= ',' ( (lv_orderItems_35_0= ruleOrderItem ) ) )* )? ( (lv_review_36_0= ruleReview ) )? otherlv_37= '}' )
            // InternalMyRds.g:607:3: otherlv_0= 'Order' ( (lv_orderNumber_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'STATUS' otherlv_4= ':' ( (lv_status_5_0= ruleOrderStatus ) ) otherlv_6= ',' otherlv_7= 'DELIVER_TO' otherlv_8= ':' ( (lv_deliveryAddress_9_0= ruleADDRESS ) ) otherlv_10= ',' otherlv_11= 'CUSTOMER' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) otherlv_14= ',' otherlv_15= 'DRIVER' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= ',' otherlv_19= 'ORDERED_AT' otherlv_20= ':' ( (lv_orderedDatetime_21_0= ruleDATETIME ) ) otherlv_22= ',' otherlv_23= 'DELIVERED_AT' otherlv_24= ':' ( (lv_deliveredDatetime_25_0= ruleDATETIME ) ) otherlv_26= ',' otherlv_27= 'REQUESTEDDELIVERYDATETIME' otherlv_28= ':' ( (lv_requestedDeliveryDatetime_29_0= ruleDATETIME ) ) otherlv_30= ',' otherlv_31= 'ITEMS' otherlv_32= ':' ( ( (lv_orderItems_33_0= ruleOrderItem ) ) (otherlv_34= ',' ( (lv_orderItems_35_0= ruleOrderItem ) ) )* )? ( (lv_review_36_0= ruleReview ) )? otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderAccess().getOrderKeyword_0());
            		
            // InternalMyRds.g:611:3: ( (lv_orderNumber_1_0= RULE_ID ) )
            // InternalMyRds.g:612:4: (lv_orderNumber_1_0= RULE_ID )
            {
            // InternalMyRds.g:612:4: (lv_orderNumber_1_0= RULE_ID )
            // InternalMyRds.g:613:5: lv_orderNumber_1_0= RULE_ID
            {
            lv_orderNumber_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_orderNumber_1_0, grammarAccess.getOrderAccess().getOrderNumberIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"orderNumber",
            						lv_orderNumber_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getOrderAccess().getSTATUSKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getColonKeyword_4());
            		
            // InternalMyRds.g:641:3: ( (lv_status_5_0= ruleOrderStatus ) )
            // InternalMyRds.g:642:4: (lv_status_5_0= ruleOrderStatus )
            {
            // InternalMyRds.g:642:4: (lv_status_5_0= ruleOrderStatus )
            // InternalMyRds.g:643:5: lv_status_5_0= ruleOrderStatus
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getStatusOrderStatusEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_status_5_0=ruleOrderStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_5_0,
            						"org.xtext.project.rds.MyRds.OrderStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getOrderAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getOrderAccess().getDELIVER_TOKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getOrderAccess().getColonKeyword_8());
            		
            // InternalMyRds.g:672:3: ( (lv_deliveryAddress_9_0= ruleADDRESS ) )
            // InternalMyRds.g:673:4: (lv_deliveryAddress_9_0= ruleADDRESS )
            {
            // InternalMyRds.g:673:4: (lv_deliveryAddress_9_0= ruleADDRESS )
            // InternalMyRds.g:674:5: lv_deliveryAddress_9_0= ruleADDRESS
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getDeliveryAddressADDRESSParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_13);
            lv_deliveryAddress_9_0=ruleADDRESS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"deliveryAddress",
            						lv_deliveryAddress_9_0,
            						"org.xtext.project.rds.MyRds.ADDRESS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,11,FOLLOW_27); 

            			newLeafNode(otherlv_10, grammarAccess.getOrderAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getOrderAccess().getCUSTOMERKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getOrderAccess().getColonKeyword_12());
            		
            // InternalMyRds.g:703:3: ( (otherlv_13= RULE_ID ) )
            // InternalMyRds.g:704:4: (otherlv_13= RULE_ID )
            {
            // InternalMyRds.g:704:4: (otherlv_13= RULE_ID )
            // InternalMyRds.g:705:5: otherlv_13= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            				
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_13, grammarAccess.getOrderAccess().getCustomerCustomerCrossReference_13_0());
            				

            }


            }

            otherlv_14=(Token)match(input,11,FOLLOW_28); 

            			newLeafNode(otherlv_14, grammarAccess.getOrderAccess().getCommaKeyword_14());
            		
            otherlv_15=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getOrderAccess().getDRIVERKeyword_15());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_16, grammarAccess.getOrderAccess().getColonKeyword_16());
            		
            // InternalMyRds.g:728:3: ( (otherlv_17= RULE_ID ) )
            // InternalMyRds.g:729:4: (otherlv_17= RULE_ID )
            {
            // InternalMyRds.g:729:4: (otherlv_17= RULE_ID )
            // InternalMyRds.g:730:5: otherlv_17= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            				
            otherlv_17=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_17, grammarAccess.getOrderAccess().getDeliveryDriverDeliveryDriverCrossReference_17_0());
            				

            }


            }

            otherlv_18=(Token)match(input,11,FOLLOW_29); 

            			newLeafNode(otherlv_18, grammarAccess.getOrderAccess().getCommaKeyword_18());
            		
            otherlv_19=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_19, grammarAccess.getOrderAccess().getORDERED_ATKeyword_19());
            		
            otherlv_20=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_20, grammarAccess.getOrderAccess().getColonKeyword_20());
            		
            // InternalMyRds.g:753:3: ( (lv_orderedDatetime_21_0= ruleDATETIME ) )
            // InternalMyRds.g:754:4: (lv_orderedDatetime_21_0= ruleDATETIME )
            {
            // InternalMyRds.g:754:4: (lv_orderedDatetime_21_0= ruleDATETIME )
            // InternalMyRds.g:755:5: lv_orderedDatetime_21_0= ruleDATETIME
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getOrderedDatetimeDATETIMEParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_13);
            lv_orderedDatetime_21_0=ruleDATETIME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"orderedDatetime",
            						lv_orderedDatetime_21_0,
            						"org.xtext.project.rds.MyRds.DATETIME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,11,FOLLOW_30); 

            			newLeafNode(otherlv_22, grammarAccess.getOrderAccess().getCommaKeyword_22());
            		
            otherlv_23=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_23, grammarAccess.getOrderAccess().getDELIVERED_ATKeyword_23());
            		
            otherlv_24=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_24, grammarAccess.getOrderAccess().getColonKeyword_24());
            		
            // InternalMyRds.g:784:3: ( (lv_deliveredDatetime_25_0= ruleDATETIME ) )
            // InternalMyRds.g:785:4: (lv_deliveredDatetime_25_0= ruleDATETIME )
            {
            // InternalMyRds.g:785:4: (lv_deliveredDatetime_25_0= ruleDATETIME )
            // InternalMyRds.g:786:5: lv_deliveredDatetime_25_0= ruleDATETIME
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getDeliveredDatetimeDATETIMEParserRuleCall_25_0());
            				
            pushFollow(FOLLOW_13);
            lv_deliveredDatetime_25_0=ruleDATETIME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"deliveredDatetime",
            						lv_deliveredDatetime_25_0,
            						"org.xtext.project.rds.MyRds.DATETIME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_26=(Token)match(input,11,FOLLOW_31); 

            			newLeafNode(otherlv_26, grammarAccess.getOrderAccess().getCommaKeyword_26());
            		
            otherlv_27=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_27, grammarAccess.getOrderAccess().getREQUESTEDDELIVERYDATETIMEKeyword_27());
            		
            otherlv_28=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_28, grammarAccess.getOrderAccess().getColonKeyword_28());
            		
            // InternalMyRds.g:815:3: ( (lv_requestedDeliveryDatetime_29_0= ruleDATETIME ) )
            // InternalMyRds.g:816:4: (lv_requestedDeliveryDatetime_29_0= ruleDATETIME )
            {
            // InternalMyRds.g:816:4: (lv_requestedDeliveryDatetime_29_0= ruleDATETIME )
            // InternalMyRds.g:817:5: lv_requestedDeliveryDatetime_29_0= ruleDATETIME
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getRequestedDeliveryDatetimeDATETIMEParserRuleCall_29_0());
            				
            pushFollow(FOLLOW_13);
            lv_requestedDeliveryDatetime_29_0=ruleDATETIME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"requestedDeliveryDatetime",
            						lv_requestedDeliveryDatetime_29_0,
            						"org.xtext.project.rds.MyRds.DATETIME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_30=(Token)match(input,11,FOLLOW_32); 

            			newLeafNode(otherlv_30, grammarAccess.getOrderAccess().getCommaKeyword_30());
            		
            otherlv_31=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_31, grammarAccess.getOrderAccess().getITEMSKeyword_31());
            		
            otherlv_32=(Token)match(input,15,FOLLOW_33); 

            			newLeafNode(otherlv_32, grammarAccess.getOrderAccess().getColonKeyword_32());
            		
            // InternalMyRds.g:846:3: ( ( (lv_orderItems_33_0= ruleOrderItem ) ) (otherlv_34= ',' ( (lv_orderItems_35_0= ruleOrderItem ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyRds.g:847:4: ( (lv_orderItems_33_0= ruleOrderItem ) ) (otherlv_34= ',' ( (lv_orderItems_35_0= ruleOrderItem ) ) )*
                    {
                    // InternalMyRds.g:847:4: ( (lv_orderItems_33_0= ruleOrderItem ) )
                    // InternalMyRds.g:848:5: (lv_orderItems_33_0= ruleOrderItem )
                    {
                    // InternalMyRds.g:848:5: (lv_orderItems_33_0= ruleOrderItem )
                    // InternalMyRds.g:849:6: lv_orderItems_33_0= ruleOrderItem
                    {

                    						newCompositeNode(grammarAccess.getOrderAccess().getOrderItemsOrderItemParserRuleCall_33_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_orderItems_33_0=ruleOrderItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrderRule());
                    						}
                    						add(
                    							current,
                    							"orderItems",
                    							lv_orderItems_33_0,
                    							"org.xtext.project.rds.MyRds.OrderItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyRds.g:866:4: (otherlv_34= ',' ( (lv_orderItems_35_0= ruleOrderItem ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==11) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyRds.g:867:5: otherlv_34= ',' ( (lv_orderItems_35_0= ruleOrderItem ) )
                    	    {
                    	    otherlv_34=(Token)match(input,11,FOLLOW_9); 

                    	    					newLeafNode(otherlv_34, grammarAccess.getOrderAccess().getCommaKeyword_33_1_0());
                    	    				
                    	    // InternalMyRds.g:871:5: ( (lv_orderItems_35_0= ruleOrderItem ) )
                    	    // InternalMyRds.g:872:6: (lv_orderItems_35_0= ruleOrderItem )
                    	    {
                    	    // InternalMyRds.g:872:6: (lv_orderItems_35_0= ruleOrderItem )
                    	    // InternalMyRds.g:873:7: lv_orderItems_35_0= ruleOrderItem
                    	    {

                    	    							newCompositeNode(grammarAccess.getOrderAccess().getOrderItemsOrderItemParserRuleCall_33_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_orderItems_35_0=ruleOrderItem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOrderRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"orderItems",
                    	    								lv_orderItems_35_0,
                    	    								"org.xtext.project.rds.MyRds.OrderItem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyRds.g:892:3: ( (lv_review_36_0= ruleReview ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyRds.g:893:4: (lv_review_36_0= ruleReview )
                    {
                    // InternalMyRds.g:893:4: (lv_review_36_0= ruleReview )
                    // InternalMyRds.g:894:5: lv_review_36_0= ruleReview
                    {

                    					newCompositeNode(grammarAccess.getOrderAccess().getReviewReviewParserRuleCall_34_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_review_36_0=ruleReview();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOrderRule());
                    					}
                    					add(
                    						current,
                    						"review",
                    						lv_review_36_0,
                    						"org.xtext.project.rds.MyRds.Review");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_37=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_35());
            		

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
    // InternalMyRds.g:919:1: entryRuleRestaurant returns [EObject current=null] : iv_ruleRestaurant= ruleRestaurant EOF ;
    public final EObject entryRuleRestaurant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestaurant = null;


        try {
            // InternalMyRds.g:919:51: (iv_ruleRestaurant= ruleRestaurant EOF )
            // InternalMyRds.g:920:2: iv_ruleRestaurant= ruleRestaurant EOF
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
    // InternalMyRds.g:926:1: ruleRestaurant returns [EObject current=null] : (otherlv_0= 'Restaurant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) otherlv_6= ',' ( (lv_menu_7_0= ruleMenu ) ) otherlv_8= '}' ) ;
    public final EObject ruleRestaurant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_address_5_0 = null;

        EObject lv_menu_7_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:932:2: ( (otherlv_0= 'Restaurant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) otherlv_6= ',' ( (lv_menu_7_0= ruleMenu ) ) otherlv_8= '}' ) )
            // InternalMyRds.g:933:2: (otherlv_0= 'Restaurant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) otherlv_6= ',' ( (lv_menu_7_0= ruleMenu ) ) otherlv_8= '}' )
            {
            // InternalMyRds.g:933:2: (otherlv_0= 'Restaurant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) otherlv_6= ',' ( (lv_menu_7_0= ruleMenu ) ) otherlv_8= '}' )
            // InternalMyRds.g:934:3: otherlv_0= 'Restaurant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) otherlv_6= ',' ( (lv_menu_7_0= ruleMenu ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getRestaurantAccess().getRestaurantKeyword_0());
            		
            // InternalMyRds.g:938:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyRds.g:939:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyRds.g:939:4: (lv_name_1_0= RULE_ID )
            // InternalMyRds.g:940:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRestaurantAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestaurantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getRestaurantAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRestaurantAccess().getAddressKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getRestaurantAccess().getColonKeyword_4());
            		
            // InternalMyRds.g:968:3: ( (lv_address_5_0= ruleADDRESS ) )
            // InternalMyRds.g:969:4: (lv_address_5_0= ruleADDRESS )
            {
            // InternalMyRds.g:969:4: (lv_address_5_0= ruleADDRESS )
            // InternalMyRds.g:970:5: lv_address_5_0= ruleADDRESS
            {

            					newCompositeNode(grammarAccess.getRestaurantAccess().getAddressADDRESSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_address_5_0=ruleADDRESS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestaurantRule());
            					}
            					set(
            						current,
            						"address",
            						lv_address_5_0,
            						"org.xtext.project.rds.MyRds.ADDRESS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getRestaurantAccess().getCommaKeyword_6());
            		
            // InternalMyRds.g:991:3: ( (lv_menu_7_0= ruleMenu ) )
            // InternalMyRds.g:992:4: (lv_menu_7_0= ruleMenu )
            {
            // InternalMyRds.g:992:4: (lv_menu_7_0= ruleMenu )
            // InternalMyRds.g:993:5: lv_menu_7_0= ruleMenu
            {

            					newCompositeNode(grammarAccess.getRestaurantAccess().getMenuMenuParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_menu_7_0=ruleMenu();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestaurantRule());
            					}
            					add(
            						current,
            						"menu",
            						lv_menu_7_0,
            						"org.xtext.project.rds.MyRds.Menu");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRestaurantAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalMyRds.g:1018:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // InternalMyRds.g:1018:45: (iv_ruleMenu= ruleMenu EOF )
            // InternalMyRds.g:1019:2: iv_ruleMenu= ruleMenu EOF
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
    // InternalMyRds.g:1025:1: ruleMenu returns [EObject current=null] : (otherlv_0= 'Menu' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'items' otherlv_4= ':' ( ( (lv_menuItems_5_0= ruleMenuItem ) ) (otherlv_6= ',' ( (lv_menuItems_7_0= ruleMenuItem ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_menuItems_5_0 = null;

        EObject lv_menuItems_7_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:1031:2: ( (otherlv_0= 'Menu' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'items' otherlv_4= ':' ( ( (lv_menuItems_5_0= ruleMenuItem ) ) (otherlv_6= ',' ( (lv_menuItems_7_0= ruleMenuItem ) ) )* )? otherlv_8= '}' ) )
            // InternalMyRds.g:1032:2: (otherlv_0= 'Menu' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'items' otherlv_4= ':' ( ( (lv_menuItems_5_0= ruleMenuItem ) ) (otherlv_6= ',' ( (lv_menuItems_7_0= ruleMenuItem ) ) )* )? otherlv_8= '}' )
            {
            // InternalMyRds.g:1032:2: (otherlv_0= 'Menu' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'items' otherlv_4= ':' ( ( (lv_menuItems_5_0= ruleMenuItem ) ) (otherlv_6= ',' ( (lv_menuItems_7_0= ruleMenuItem ) ) )* )? otherlv_8= '}' )
            // InternalMyRds.g:1033:3: otherlv_0= 'Menu' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'items' otherlv_4= ':' ( ( (lv_menuItems_5_0= ruleMenuItem ) ) (otherlv_6= ',' ( (lv_menuItems_7_0= ruleMenuItem ) ) )* )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getMenuAccess().getMenuKeyword_0());
            		
            // InternalMyRds.g:1037:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyRds.g:1038:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyRds.g:1038:4: (lv_id_1_0= RULE_ID )
            // InternalMyRds.g:1039:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getMenuAccess().getItemsKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getColonKeyword_4());
            		
            // InternalMyRds.g:1067:3: ( ( (lv_menuItems_5_0= ruleMenuItem ) ) (otherlv_6= ',' ( (lv_menuItems_7_0= ruleMenuItem ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyRds.g:1068:4: ( (lv_menuItems_5_0= ruleMenuItem ) ) (otherlv_6= ',' ( (lv_menuItems_7_0= ruleMenuItem ) ) )*
                    {
                    // InternalMyRds.g:1068:4: ( (lv_menuItems_5_0= ruleMenuItem ) )
                    // InternalMyRds.g:1069:5: (lv_menuItems_5_0= ruleMenuItem )
                    {
                    // InternalMyRds.g:1069:5: (lv_menuItems_5_0= ruleMenuItem )
                    // InternalMyRds.g:1070:6: lv_menuItems_5_0= ruleMenuItem
                    {

                    						newCompositeNode(grammarAccess.getMenuAccess().getMenuItemsMenuItemParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_menuItems_5_0=ruleMenuItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMenuRule());
                    						}
                    						add(
                    							current,
                    							"menuItems",
                    							lv_menuItems_5_0,
                    							"org.xtext.project.rds.MyRds.MenuItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyRds.g:1087:4: (otherlv_6= ',' ( (lv_menuItems_7_0= ruleMenuItem ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==11) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyRds.g:1088:5: otherlv_6= ',' ( (lv_menuItems_7_0= ruleMenuItem ) )
                    	    {
                    	    otherlv_6=(Token)match(input,11,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMenuAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalMyRds.g:1092:5: ( (lv_menuItems_7_0= ruleMenuItem ) )
                    	    // InternalMyRds.g:1093:6: (lv_menuItems_7_0= ruleMenuItem )
                    	    {
                    	    // InternalMyRds.g:1093:6: (lv_menuItems_7_0= ruleMenuItem )
                    	    // InternalMyRds.g:1094:7: lv_menuItems_7_0= ruleMenuItem
                    	    {

                    	    							newCompositeNode(grammarAccess.getMenuAccess().getMenuItemsMenuItemParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    lv_menuItems_7_0=ruleMenuItem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMenuRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"menuItems",
                    	    								lv_menuItems_7_0,
                    	    								"org.xtext.project.rds.MyRds.MenuItem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyRds.g:1121:1: entryRuleMenuItem returns [EObject current=null] : iv_ruleMenuItem= ruleMenuItem EOF ;
    public final EObject entryRuleMenuItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenuItem = null;


        try {
            // InternalMyRds.g:1121:49: (iv_ruleMenuItem= ruleMenuItem EOF )
            // InternalMyRds.g:1122:2: iv_ruleMenuItem= ruleMenuItem EOF
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
    // InternalMyRds.g:1128:1: ruleMenuItem returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'price' otherlv_6= ':' ( (lv_price_7_0= ruleDECIMAL ) ) otherlv_8= ',' otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ',' otherlv_13= 'category' otherlv_14= ':' ( (lv_category_15_0= ruleMenuItemCategory ) ) otherlv_16= '}' ) ;
    public final EObject ruleMenuItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_price_7_0 = null;

        Enumerator lv_category_15_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:1134:2: ( (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'price' otherlv_6= ':' ( (lv_price_7_0= ruleDECIMAL ) ) otherlv_8= ',' otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ',' otherlv_13= 'category' otherlv_14= ':' ( (lv_category_15_0= ruleMenuItemCategory ) ) otherlv_16= '}' ) )
            // InternalMyRds.g:1135:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'price' otherlv_6= ':' ( (lv_price_7_0= ruleDECIMAL ) ) otherlv_8= ',' otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ',' otherlv_13= 'category' otherlv_14= ':' ( (lv_category_15_0= ruleMenuItemCategory ) ) otherlv_16= '}' )
            {
            // InternalMyRds.g:1135:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'price' otherlv_6= ':' ( (lv_price_7_0= ruleDECIMAL ) ) otherlv_8= ',' otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ',' otherlv_13= 'category' otherlv_14= ':' ( (lv_category_15_0= ruleMenuItemCategory ) ) otherlv_16= '}' )
            // InternalMyRds.g:1136:3: otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'price' otherlv_6= ':' ( (lv_price_7_0= ruleDECIMAL ) ) otherlv_8= ',' otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ',' otherlv_13= 'category' otherlv_14= ':' ( (lv_category_15_0= ruleMenuItemCategory ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMenuItemAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMenuItemAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMenuItemAccess().getColonKeyword_2());
            		
            // InternalMyRds.g:1148:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyRds.g:1149:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyRds.g:1149:4: (lv_name_3_0= RULE_ID )
            // InternalMyRds.g:1150:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMenuItemAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getMenuItemAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getMenuItemAccess().getPriceKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getMenuItemAccess().getColonKeyword_6());
            		
            // InternalMyRds.g:1178:3: ( (lv_price_7_0= ruleDECIMAL ) )
            // InternalMyRds.g:1179:4: (lv_price_7_0= ruleDECIMAL )
            {
            // InternalMyRds.g:1179:4: (lv_price_7_0= ruleDECIMAL )
            // InternalMyRds.g:1180:5: lv_price_7_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getMenuItemAccess().getPriceDECIMALParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_13);
            lv_price_7_0=ruleDECIMAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMenuItemRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_7_0,
            						"org.xtext.project.rds.MyRds.DECIMAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,11,FOLLOW_41); 

            			newLeafNode(otherlv_8, grammarAccess.getMenuItemAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getMenuItemAccess().getDescriptionKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getMenuItemAccess().getColonKeyword_10());
            		
            // InternalMyRds.g:1209:3: ( (lv_description_11_0= RULE_STRING ) )
            // InternalMyRds.g:1210:4: (lv_description_11_0= RULE_STRING )
            {
            // InternalMyRds.g:1210:4: (lv_description_11_0= RULE_STRING )
            // InternalMyRds.g:1211:5: lv_description_11_0= RULE_STRING
            {
            lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_12=(Token)match(input,11,FOLLOW_42); 

            			newLeafNode(otherlv_12, grammarAccess.getMenuItemAccess().getCommaKeyword_12());
            		
            otherlv_13=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getMenuItemAccess().getCategoryKeyword_13());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_43); 

            			newLeafNode(otherlv_14, grammarAccess.getMenuItemAccess().getColonKeyword_14());
            		
            // InternalMyRds.g:1239:3: ( (lv_category_15_0= ruleMenuItemCategory ) )
            // InternalMyRds.g:1240:4: (lv_category_15_0= ruleMenuItemCategory )
            {
            // InternalMyRds.g:1240:4: (lv_category_15_0= ruleMenuItemCategory )
            // InternalMyRds.g:1241:5: lv_category_15_0= ruleMenuItemCategory
            {

            					newCompositeNode(grammarAccess.getMenuItemAccess().getCategoryMenuItemCategoryEnumRuleCall_15_0());
            				
            pushFollow(FOLLOW_23);
            lv_category_15_0=ruleMenuItemCategory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMenuItemRule());
            					}
            					set(
            						current,
            						"category",
            						lv_category_15_0,
            						"org.xtext.project.rds.MyRds.MenuItemCategory");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getMenuItemAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalMyRds.g:1266:1: entryRuleOrderItem returns [EObject current=null] : iv_ruleOrderItem= ruleOrderItem EOF ;
    public final EObject entryRuleOrderItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderItem = null;


        try {
            // InternalMyRds.g:1266:50: (iv_ruleOrderItem= ruleOrderItem EOF )
            // InternalMyRds.g:1267:2: iv_ruleOrderItem= ruleOrderItem EOF
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
    // InternalMyRds.g:1273:1: ruleOrderItem returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'quantity' otherlv_2= ':' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'menuItem' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) ;
    public final EObject ruleOrderItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_quantity_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyRds.g:1279:2: ( (otherlv_0= '{' otherlv_1= 'quantity' otherlv_2= ':' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'menuItem' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) )
            // InternalMyRds.g:1280:2: (otherlv_0= '{' otherlv_1= 'quantity' otherlv_2= ':' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'menuItem' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            {
            // InternalMyRds.g:1280:2: (otherlv_0= '{' otherlv_1= 'quantity' otherlv_2= ':' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'menuItem' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            // InternalMyRds.g:1281:3: otherlv_0= '{' otherlv_1= 'quantity' otherlv_2= ':' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'menuItem' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderItemAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderItemAccess().getQuantityKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getOrderItemAccess().getColonKeyword_2());
            		
            // InternalMyRds.g:1293:3: ( (lv_quantity_3_0= RULE_INT ) )
            // InternalMyRds.g:1294:4: (lv_quantity_3_0= RULE_INT )
            {
            // InternalMyRds.g:1294:4: (lv_quantity_3_0= RULE_INT )
            // InternalMyRds.g:1295:5: lv_quantity_3_0= RULE_INT
            {
            lv_quantity_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_quantity_3_0, grammarAccess.getOrderItemAccess().getQuantityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getOrderItemAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getOrderItemAccess().getMenuItemKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getOrderItemAccess().getColonKeyword_6());
            		
            // InternalMyRds.g:1323:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyRds.g:1324:4: (otherlv_7= RULE_ID )
            {
            // InternalMyRds.g:1324:4: (otherlv_7= RULE_ID )
            // InternalMyRds.g:1325:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderItemRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_7, grammarAccess.getOrderItemAccess().getMenuItemMenuItemCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOrderItemAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalMyRds.g:1344:1: entryRuleReview returns [EObject current=null] : iv_ruleReview= ruleReview EOF ;
    public final EObject entryRuleReview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReview = null;


        try {
            // InternalMyRds.g:1344:47: (iv_ruleReview= ruleReview EOF )
            // InternalMyRds.g:1345:2: iv_ruleReview= ruleReview EOF
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
    // InternalMyRds.g:1351:1: ruleReview returns [EObject current=null] : (otherlv_0= 'Review' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'numStars' otherlv_4= ':' ( (lv_numStars_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'description' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'reviewDatetime' otherlv_12= ':' ( (lv_reviewDatetime_13_0= ruleDATETIME ) ) otherlv_14= '}' ) ;
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
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_reviewDatetime_13_0 = null;



        	enterRule();

        try {
            // InternalMyRds.g:1357:2: ( (otherlv_0= 'Review' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'numStars' otherlv_4= ':' ( (lv_numStars_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'description' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'reviewDatetime' otherlv_12= ':' ( (lv_reviewDatetime_13_0= ruleDATETIME ) ) otherlv_14= '}' ) )
            // InternalMyRds.g:1358:2: (otherlv_0= 'Review' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'numStars' otherlv_4= ':' ( (lv_numStars_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'description' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'reviewDatetime' otherlv_12= ':' ( (lv_reviewDatetime_13_0= ruleDATETIME ) ) otherlv_14= '}' )
            {
            // InternalMyRds.g:1358:2: (otherlv_0= 'Review' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'numStars' otherlv_4= ':' ( (lv_numStars_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'description' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'reviewDatetime' otherlv_12= ':' ( (lv_reviewDatetime_13_0= ruleDATETIME ) ) otherlv_14= '}' )
            // InternalMyRds.g:1359:3: otherlv_0= 'Review' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'numStars' otherlv_4= ':' ( (lv_numStars_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'description' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'reviewDatetime' otherlv_12= ':' ( (lv_reviewDatetime_13_0= ruleDATETIME ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getReviewAccess().getReviewKeyword_0());
            		
            // InternalMyRds.g:1363:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyRds.g:1364:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyRds.g:1364:4: (lv_id_1_0= RULE_ID )
            // InternalMyRds.g:1365:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getReviewAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getReviewAccess().getNumStarsKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getReviewAccess().getColonKeyword_4());
            		
            // InternalMyRds.g:1393:3: ( (lv_numStars_5_0= RULE_INT ) )
            // InternalMyRds.g:1394:4: (lv_numStars_5_0= RULE_INT )
            {
            // InternalMyRds.g:1394:4: (lv_numStars_5_0= RULE_INT )
            // InternalMyRds.g:1395:5: lv_numStars_5_0= RULE_INT
            {
            lv_numStars_5_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_6=(Token)match(input,11,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getReviewAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getReviewAccess().getDescriptionKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getReviewAccess().getColonKeyword_8());
            		
            // InternalMyRds.g:1423:3: ( (lv_description_9_0= RULE_STRING ) )
            // InternalMyRds.g:1424:4: (lv_description_9_0= RULE_STRING )
            {
            // InternalMyRds.g:1424:4: (lv_description_9_0= RULE_STRING )
            // InternalMyRds.g:1425:5: lv_description_9_0= RULE_STRING
            {
            lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_description_9_0, grammarAccess.getReviewAccess().getDescriptionSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,11,FOLLOW_47); 

            			newLeafNode(otherlv_10, grammarAccess.getReviewAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,44,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getReviewAccess().getReviewDatetimeKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getReviewAccess().getColonKeyword_12());
            		
            // InternalMyRds.g:1453:3: ( (lv_reviewDatetime_13_0= ruleDATETIME ) )
            // InternalMyRds.g:1454:4: (lv_reviewDatetime_13_0= ruleDATETIME )
            {
            // InternalMyRds.g:1454:4: (lv_reviewDatetime_13_0= ruleDATETIME )
            // InternalMyRds.g:1455:5: lv_reviewDatetime_13_0= ruleDATETIME
            {

            					newCompositeNode(grammarAccess.getReviewAccess().getReviewDatetimeDATETIMEParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_23);
            lv_reviewDatetime_13_0=ruleDATETIME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReviewRule());
            					}
            					set(
            						current,
            						"reviewDatetime",
            						lv_reviewDatetime_13_0,
            						"org.xtext.project.rds.MyRds.DATETIME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getReviewAccess().getRightCurlyBracketKeyword_14());
            		

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
    // InternalMyRds.g:1480:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalMyRds.g:1480:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalMyRds.g:1481:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalMyRds.g:1487:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyRds.g:1493:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMyRds.g:1494:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMyRds.g:1494:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMyRds.g:1495:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_48); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,45,FOLLOW_16); 

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


    // $ANTLR start "entryRulePHONE"
    // InternalMyRds.g:1518:1: entryRulePHONE returns [String current=null] : iv_rulePHONE= rulePHONE EOF ;
    public final String entryRulePHONE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePHONE = null;


        try {
            // InternalMyRds.g:1518:45: (iv_rulePHONE= rulePHONE EOF )
            // InternalMyRds.g:1519:2: iv_rulePHONE= rulePHONE EOF
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
    // InternalMyRds.g:1525:1: rulePHONE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePHONE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalMyRds.g:1531:2: ( (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT ) )
            // InternalMyRds.g:1532:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT )
            {
            // InternalMyRds.g:1532:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT )
            // InternalMyRds.g:1533:3: this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_49); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getPHONEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,46,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPHONEAccess().getHyphenMinusKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_49); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getPHONEAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,46,FOLLOW_16); 

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
    // InternalMyRds.g:1568:1: entryRuleEMAIL returns [String current=null] : iv_ruleEMAIL= ruleEMAIL EOF ;
    public final String entryRuleEMAIL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMAIL = null;


        try {
            // InternalMyRds.g:1568:45: (iv_ruleEMAIL= ruleEMAIL EOF )
            // InternalMyRds.g:1569:2: iv_ruleEMAIL= ruleEMAIL EOF
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
    // InternalMyRds.g:1575:1: ruleEMAIL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING kw= '@' this_STRING_2= RULE_STRING kw= '.com' ) ;
    public final AntlrDatatypeRuleToken ruleEMAIL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalMyRds.g:1581:2: ( (this_STRING_0= RULE_STRING kw= '@' this_STRING_2= RULE_STRING kw= '.com' ) )
            // InternalMyRds.g:1582:2: (this_STRING_0= RULE_STRING kw= '@' this_STRING_2= RULE_STRING kw= '.com' )
            {
            // InternalMyRds.g:1582:2: (this_STRING_0= RULE_STRING kw= '@' this_STRING_2= RULE_STRING kw= '.com' )
            // InternalMyRds.g:1583:3: this_STRING_0= RULE_STRING kw= '@' this_STRING_2= RULE_STRING kw= '.com'
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

            			current.merge(this_STRING_0);
            		

            			newLeafNode(this_STRING_0, grammarAccess.getEMAILAccess().getSTRINGTerminalRuleCall_0());
            		
            kw=(Token)match(input,47,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEMAILAccess().getCommercialAtKeyword_1());
            		
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_51); 

            			current.merge(this_STRING_2);
            		

            			newLeafNode(this_STRING_2, grammarAccess.getEMAILAccess().getSTRINGTerminalRuleCall_2());
            		
            kw=(Token)match(input,48,FOLLOW_2); 

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
    // InternalMyRds.g:1611:1: entryRuleDATETIME returns [String current=null] : iv_ruleDATETIME= ruleDATETIME EOF ;
    public final String entryRuleDATETIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATETIME = null;


        try {
            // InternalMyRds.g:1611:48: (iv_ruleDATETIME= ruleDATETIME EOF )
            // InternalMyRds.g:1612:2: iv_ruleDATETIME= ruleDATETIME EOF
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
    // InternalMyRds.g:1618:1: ruleDATETIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT ) ;
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
            // InternalMyRds.g:1624:2: ( (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT ) )
            // InternalMyRds.g:1625:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT )
            {
            // InternalMyRds.g:1625:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT )
            // InternalMyRds.g:1626:3: this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_49); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,46,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATETIMEAccess().getHyphenMinusKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_49); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,46,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATETIMEAccess().getHyphenMinusKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_16); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_4());
            		
            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_11); 

            			current.merge(this_INT_5);
            		

            			newLeafNode(this_INT_5, grammarAccess.getDATETIMEAccess().getINTTerminalRuleCall_5());
            		
            kw=(Token)match(input,15,FOLLOW_16); 

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
    // InternalMyRds.g:1680:1: entryRuleADDRESS returns [String current=null] : iv_ruleADDRESS= ruleADDRESS EOF ;
    public final String entryRuleADDRESS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleADDRESS = null;


        try {
            // InternalMyRds.g:1680:47: (iv_ruleADDRESS= ruleADDRESS EOF )
            // InternalMyRds.g:1681:2: iv_ruleADDRESS= ruleADDRESS EOF
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
    // InternalMyRds.g:1687:1: ruleADDRESS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleADDRESS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token kw=null;
        Token this_STRING_3=null;


        	enterRule();

        try {
            // InternalMyRds.g:1693:2: ( (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING ) )
            // InternalMyRds.g:1694:2: (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING )
            {
            // InternalMyRds.g:1694:2: (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING )
            // InternalMyRds.g:1695:3: this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_0());
            		
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_13); 

            			current.merge(this_STRING_1);
            		

            			newLeafNode(this_STRING_1, grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_1());
            		
            kw=(Token)match(input,11,FOLLOW_12); 

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
    // InternalMyRds.g:1725:1: entryRuleLICENCE returns [String current=null] : iv_ruleLICENCE= ruleLICENCE EOF ;
    public final String entryRuleLICENCE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLICENCE = null;


        try {
            // InternalMyRds.g:1725:47: (iv_ruleLICENCE= ruleLICENCE EOF )
            // InternalMyRds.g:1726:2: iv_ruleLICENCE= ruleLICENCE EOF
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
    // InternalMyRds.g:1732:1: ruleLICENCE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleLICENCE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyRds.g:1738:2: ( (this_STRING_0= RULE_STRING this_INT_1= RULE_INT ) )
            // InternalMyRds.g:1739:2: (this_STRING_0= RULE_STRING this_INT_1= RULE_INT )
            {
            // InternalMyRds.g:1739:2: (this_STRING_0= RULE_STRING this_INT_1= RULE_INT )
            // InternalMyRds.g:1740:3: this_STRING_0= RULE_STRING this_INT_1= RULE_INT
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            			current.merge(this_STRING_0);
            		

            			newLeafNode(this_STRING_0, grammarAccess.getLICENCEAccess().getSTRINGTerminalRuleCall_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getLICENCEAccess().getINTTerminalRuleCall_1());
            		

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
    // InternalMyRds.g:1758:1: ruleOrderStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'accepted' ) | (enumLiteral_1= 'preparation' ) | (enumLiteral_2= 'ready_pickup' ) | (enumLiteral_3= 'picked_up' ) | (enumLiteral_4= 'delivered' ) ) ;
    public final Enumerator ruleOrderStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyRds.g:1764:2: ( ( (enumLiteral_0= 'accepted' ) | (enumLiteral_1= 'preparation' ) | (enumLiteral_2= 'ready_pickup' ) | (enumLiteral_3= 'picked_up' ) | (enumLiteral_4= 'delivered' ) ) )
            // InternalMyRds.g:1765:2: ( (enumLiteral_0= 'accepted' ) | (enumLiteral_1= 'preparation' ) | (enumLiteral_2= 'ready_pickup' ) | (enumLiteral_3= 'picked_up' ) | (enumLiteral_4= 'delivered' ) )
            {
            // InternalMyRds.g:1765:2: ( (enumLiteral_0= 'accepted' ) | (enumLiteral_1= 'preparation' ) | (enumLiteral_2= 'ready_pickup' ) | (enumLiteral_3= 'picked_up' ) | (enumLiteral_4= 'delivered' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt16=1;
                }
                break;
            case 50:
                {
                alt16=2;
                }
                break;
            case 51:
                {
                alt16=3;
                }
                break;
            case 52:
                {
                alt16=4;
                }
                break;
            case 53:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyRds.g:1766:3: (enumLiteral_0= 'accepted' )
                    {
                    // InternalMyRds.g:1766:3: (enumLiteral_0= 'accepted' )
                    // InternalMyRds.g:1767:4: enumLiteral_0= 'accepted'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getOrderStatusAccess().getACCEPTEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrderStatusAccess().getACCEPTEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyRds.g:1774:3: (enumLiteral_1= 'preparation' )
                    {
                    // InternalMyRds.g:1774:3: (enumLiteral_1= 'preparation' )
                    // InternalMyRds.g:1775:4: enumLiteral_1= 'preparation'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getOrderStatusAccess().getPREPARATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrderStatusAccess().getPREPARATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyRds.g:1782:3: (enumLiteral_2= 'ready_pickup' )
                    {
                    // InternalMyRds.g:1782:3: (enumLiteral_2= 'ready_pickup' )
                    // InternalMyRds.g:1783:4: enumLiteral_2= 'ready_pickup'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getOrderStatusAccess().getREADY_PICKUPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOrderStatusAccess().getREADY_PICKUPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyRds.g:1790:3: (enumLiteral_3= 'picked_up' )
                    {
                    // InternalMyRds.g:1790:3: (enumLiteral_3= 'picked_up' )
                    // InternalMyRds.g:1791:4: enumLiteral_3= 'picked_up'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getOrderStatusAccess().getPICKED_UPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOrderStatusAccess().getPICKED_UPEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyRds.g:1798:3: (enumLiteral_4= 'delivered' )
                    {
                    // InternalMyRds.g:1798:3: (enumLiteral_4= 'delivered' )
                    // InternalMyRds.g:1799:4: enumLiteral_4= 'delivered'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

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
    // InternalMyRds.g:1809:1: ruleMenuItemCategory returns [Enumerator current=null] : ( (enumLiteral_0= 'appetizer' ) | (enumLiteral_1= 'side_dish' ) | (enumLiteral_2= 'main_dish' ) | (enumLiteral_3= 'dessert' ) | (enumLiteral_4= 'drink' ) ) ;
    public final Enumerator ruleMenuItemCategory() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyRds.g:1815:2: ( ( (enumLiteral_0= 'appetizer' ) | (enumLiteral_1= 'side_dish' ) | (enumLiteral_2= 'main_dish' ) | (enumLiteral_3= 'dessert' ) | (enumLiteral_4= 'drink' ) ) )
            // InternalMyRds.g:1816:2: ( (enumLiteral_0= 'appetizer' ) | (enumLiteral_1= 'side_dish' ) | (enumLiteral_2= 'main_dish' ) | (enumLiteral_3= 'dessert' ) | (enumLiteral_4= 'drink' ) )
            {
            // InternalMyRds.g:1816:2: ( (enumLiteral_0= 'appetizer' ) | (enumLiteral_1= 'side_dish' ) | (enumLiteral_2= 'main_dish' ) | (enumLiteral_3= 'dessert' ) | (enumLiteral_4= 'drink' ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt17=1;
                }
                break;
            case 55:
                {
                alt17=2;
                }
                break;
            case 56:
                {
                alt17=3;
                }
                break;
            case 57:
                {
                alt17=4;
                }
                break;
            case 58:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyRds.g:1817:3: (enumLiteral_0= 'appetizer' )
                    {
                    // InternalMyRds.g:1817:3: (enumLiteral_0= 'appetizer' )
                    // InternalMyRds.g:1818:4: enumLiteral_0= 'appetizer'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getMenuItemCategoryAccess().getAPPETIZEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMenuItemCategoryAccess().getAPPETIZEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyRds.g:1825:3: (enumLiteral_1= 'side_dish' )
                    {
                    // InternalMyRds.g:1825:3: (enumLiteral_1= 'side_dish' )
                    // InternalMyRds.g:1826:4: enumLiteral_1= 'side_dish'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getMenuItemCategoryAccess().getSIDE_DISHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMenuItemCategoryAccess().getSIDE_DISHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyRds.g:1833:3: (enumLiteral_2= 'main_dish' )
                    {
                    // InternalMyRds.g:1833:3: (enumLiteral_2= 'main_dish' )
                    // InternalMyRds.g:1834:4: enumLiteral_2= 'main_dish'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getMenuItemCategoryAccess().getMAIN_DISHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMenuItemCategoryAccess().getMAIN_DISHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyRds.g:1841:3: (enumLiteral_3= 'dessert' )
                    {
                    // InternalMyRds.g:1841:3: (enumLiteral_3= 'dessert' )
                    // InternalMyRds.g:1842:4: enumLiteral_3= 'dessert'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getMenuItemCategoryAccess().getDESSERTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMenuItemCategoryAccess().getDESSERTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyRds.g:1849:3: (enumLiteral_4= 'drink' )
                    {
                    // InternalMyRds.g:1849:3: (enumLiteral_4= 'drink' )
                    // InternalMyRds.g:1850:4: enumLiteral_4= 'drink'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000201000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000380800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x003E000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000082000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000080800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x07C0000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});

}