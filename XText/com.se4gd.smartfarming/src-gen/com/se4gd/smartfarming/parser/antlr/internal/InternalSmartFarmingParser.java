package com.se4gd.smartfarming.parser.antlr.internal;

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
import com.se4gd.smartfarming.services.SmartFarmingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmartFarmingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Farm'", "'{'", "'Location:'", "'Size:'", "'sqm'", "'Crops:'", "'['", "','", "']'", "'Farmers:'", "'IoTSystem:'", "'}'", "'-'", "'.'", "'E'", "'e'", "'Crop'", "'CropGroup:'", "'GrowthDuration:'", "'days'", "'SeedCode:'", "'Farmer'", "'FarmerID:'", "'Email:'", "'PhoneNumber:'", "'Services:'", "'IoTSystem'", "'Version:'", "'Devices:'", "'Gateways:'", "'AnalyticsSystem'", "'ServiceID:'", "'Host:'", "'URI:'", "'AnalyticsType:'", "'DataSource:'", "'OutputType:'", "'Monitoring'", "'Metrics:'", "'Sensors:'", "'Control:'", "'Controlling'", "'ControlType:'", "'Action:'", "'Actuators:'", "'Sensor'", "'DeviceID:'", "'IPAddress:'", "'Manufacturer:'", "'Type:'", "'State:'", "'Unit:'", "'Value:'", "'Protocol:'", "'CommunicationProtocol'", "'Actuator'", "'Gateway'", "'GatewayID:'", "'Model:'", "'Protocols:'", "'Vegetable'", "'Fruit'", "'Flower'", "'Tubers'", "'Harvesting'", "'Seeding'", "'Resource'", "'LineGraph'", "'PieChart'", "'BarChart'", "'Tabular'", "'Nutrient'", "'PhotoSynthesis'", "'EnvironmentalSafety'", "'Temperature'", "'Humidity'", "'CO2'", "'Oxygen'", "'PH'", "'EC'", "'LEDLight'", "'Surveillance'", "'Active'", "'Passive'", "'ZigBee'", "'MQTT'", "'COAP'", "'HTTP'", "'WIFI'", "'Bluetooth'", "'ZWave'", "'AirConditioner'", "'NutrientController'", "'LEDController'", "'OxygenController'", "'CO2Controller'", "'Increase'", "'Decrease'", "'ON'", "'OFF'", "'Alert'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalSmartFarmingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmartFarmingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmartFarmingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmartFarming.g"; }



     	private SmartFarmingGrammarAccess grammarAccess;

        public InternalSmartFarmingParser(TokenStream input, SmartFarmingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Farm";
       	}

       	@Override
       	protected SmartFarmingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFarm"
    // InternalSmartFarming.g:65:1: entryRuleFarm returns [EObject current=null] : iv_ruleFarm= ruleFarm EOF ;
    public final EObject entryRuleFarm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFarm = null;


        try {
            // InternalSmartFarming.g:65:45: (iv_ruleFarm= ruleFarm EOF )
            // InternalSmartFarming.g:66:2: iv_ruleFarm= ruleFarm EOF
            {
             newCompositeNode(grammarAccess.getFarmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFarm=ruleFarm();

            state._fsp--;

             current =iv_ruleFarm; 
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
    // $ANTLR end "entryRuleFarm"


    // $ANTLR start "ruleFarm"
    // InternalSmartFarming.g:72:1: ruleFarm returns [EObject current=null] : (otherlv_0= 'Farm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Location:' ( (lv_Location_4_0= ruleEString ) ) )? otherlv_5= 'Size:' ( (lv_Size_6_0= ruleEFloat ) ) otherlv_7= 'sqm' otherlv_8= 'Crops:' otherlv_9= '[' ( (lv_Crops_10_0= ruleCrop ) ) (otherlv_11= ',' ( (lv_Crops_12_0= ruleCrop ) ) )* otherlv_13= ']' otherlv_14= 'Farmers:' otherlv_15= '[' ( (lv_Farmers_16_0= ruleFarmer ) ) (otherlv_17= ',' ( (lv_Farmers_18_0= ruleFarmer ) ) )* otherlv_19= ']' otherlv_20= 'IoTSystem:' otherlv_21= '[' ( (lv_IoTSystem_22_0= ruleIoTSystem ) ) otherlv_23= ']' otherlv_24= '}' ) ;
    public final EObject ruleFarm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_Location_4_0 = null;

        AntlrDatatypeRuleToken lv_Size_6_0 = null;

        EObject lv_Crops_10_0 = null;

        EObject lv_Crops_12_0 = null;

        EObject lv_Farmers_16_0 = null;

        EObject lv_Farmers_18_0 = null;

        EObject lv_IoTSystem_22_0 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:78:2: ( (otherlv_0= 'Farm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Location:' ( (lv_Location_4_0= ruleEString ) ) )? otherlv_5= 'Size:' ( (lv_Size_6_0= ruleEFloat ) ) otherlv_7= 'sqm' otherlv_8= 'Crops:' otherlv_9= '[' ( (lv_Crops_10_0= ruleCrop ) ) (otherlv_11= ',' ( (lv_Crops_12_0= ruleCrop ) ) )* otherlv_13= ']' otherlv_14= 'Farmers:' otherlv_15= '[' ( (lv_Farmers_16_0= ruleFarmer ) ) (otherlv_17= ',' ( (lv_Farmers_18_0= ruleFarmer ) ) )* otherlv_19= ']' otherlv_20= 'IoTSystem:' otherlv_21= '[' ( (lv_IoTSystem_22_0= ruleIoTSystem ) ) otherlv_23= ']' otherlv_24= '}' ) )
            // InternalSmartFarming.g:79:2: (otherlv_0= 'Farm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Location:' ( (lv_Location_4_0= ruleEString ) ) )? otherlv_5= 'Size:' ( (lv_Size_6_0= ruleEFloat ) ) otherlv_7= 'sqm' otherlv_8= 'Crops:' otherlv_9= '[' ( (lv_Crops_10_0= ruleCrop ) ) (otherlv_11= ',' ( (lv_Crops_12_0= ruleCrop ) ) )* otherlv_13= ']' otherlv_14= 'Farmers:' otherlv_15= '[' ( (lv_Farmers_16_0= ruleFarmer ) ) (otherlv_17= ',' ( (lv_Farmers_18_0= ruleFarmer ) ) )* otherlv_19= ']' otherlv_20= 'IoTSystem:' otherlv_21= '[' ( (lv_IoTSystem_22_0= ruleIoTSystem ) ) otherlv_23= ']' otherlv_24= '}' )
            {
            // InternalSmartFarming.g:79:2: (otherlv_0= 'Farm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Location:' ( (lv_Location_4_0= ruleEString ) ) )? otherlv_5= 'Size:' ( (lv_Size_6_0= ruleEFloat ) ) otherlv_7= 'sqm' otherlv_8= 'Crops:' otherlv_9= '[' ( (lv_Crops_10_0= ruleCrop ) ) (otherlv_11= ',' ( (lv_Crops_12_0= ruleCrop ) ) )* otherlv_13= ']' otherlv_14= 'Farmers:' otherlv_15= '[' ( (lv_Farmers_16_0= ruleFarmer ) ) (otherlv_17= ',' ( (lv_Farmers_18_0= ruleFarmer ) ) )* otherlv_19= ']' otherlv_20= 'IoTSystem:' otherlv_21= '[' ( (lv_IoTSystem_22_0= ruleIoTSystem ) ) otherlv_23= ']' otherlv_24= '}' )
            // InternalSmartFarming.g:80:3: otherlv_0= 'Farm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Location:' ( (lv_Location_4_0= ruleEString ) ) )? otherlv_5= 'Size:' ( (lv_Size_6_0= ruleEFloat ) ) otherlv_7= 'sqm' otherlv_8= 'Crops:' otherlv_9= '[' ( (lv_Crops_10_0= ruleCrop ) ) (otherlv_11= ',' ( (lv_Crops_12_0= ruleCrop ) ) )* otherlv_13= ']' otherlv_14= 'Farmers:' otherlv_15= '[' ( (lv_Farmers_16_0= ruleFarmer ) ) (otherlv_17= ',' ( (lv_Farmers_18_0= ruleFarmer ) ) )* otherlv_19= ']' otherlv_20= 'IoTSystem:' otherlv_21= '[' ( (lv_IoTSystem_22_0= ruleIoTSystem ) ) otherlv_23= ']' otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFarmAccess().getFarmKeyword_0());
            		
            // InternalSmartFarming.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartFarming.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartFarming.g:85:4: (lv_name_1_0= ruleEString )
            // InternalSmartFarming.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFarmAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFarmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.se4gd.smartfarming.SmartFarming.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFarmAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartFarming.g:107:3: (otherlv_3= 'Location:' ( (lv_Location_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSmartFarming.g:108:4: otherlv_3= 'Location:' ( (lv_Location_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFarmAccess().getLocationKeyword_3_0());
                    			
                    // InternalSmartFarming.g:112:4: ( (lv_Location_4_0= ruleEString ) )
                    // InternalSmartFarming.g:113:5: (lv_Location_4_0= ruleEString )
                    {
                    // InternalSmartFarming.g:113:5: (lv_Location_4_0= ruleEString )
                    // InternalSmartFarming.g:114:6: lv_Location_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFarmAccess().getLocationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_Location_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFarmRule());
                    						}
                    						set(
                    							current,
                    							"Location",
                    							lv_Location_4_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getFarmAccess().getSizeKeyword_4());
            		
            // InternalSmartFarming.g:136:3: ( (lv_Size_6_0= ruleEFloat ) )
            // InternalSmartFarming.g:137:4: (lv_Size_6_0= ruleEFloat )
            {
            // InternalSmartFarming.g:137:4: (lv_Size_6_0= ruleEFloat )
            // InternalSmartFarming.g:138:5: lv_Size_6_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getFarmAccess().getSizeEFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_Size_6_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFarmRule());
            					}
            					set(
            						current,
            						"Size",
            						lv_Size_6_0,
            						"com.se4gd.smartfarming.SmartFarming.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getFarmAccess().getSqmKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getFarmAccess().getCropsKeyword_7());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getFarmAccess().getLeftSquareBracketKeyword_8());
            		
            // InternalSmartFarming.g:167:3: ( (lv_Crops_10_0= ruleCrop ) )
            // InternalSmartFarming.g:168:4: (lv_Crops_10_0= ruleCrop )
            {
            // InternalSmartFarming.g:168:4: (lv_Crops_10_0= ruleCrop )
            // InternalSmartFarming.g:169:5: lv_Crops_10_0= ruleCrop
            {

            					newCompositeNode(grammarAccess.getFarmAccess().getCropsCropParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_12);
            lv_Crops_10_0=ruleCrop();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFarmRule());
            					}
            					add(
            						current,
            						"Crops",
            						lv_Crops_10_0,
            						"com.se4gd.smartfarming.SmartFarming.Crop");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartFarming.g:186:3: (otherlv_11= ',' ( (lv_Crops_12_0= ruleCrop ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmartFarming.g:187:4: otherlv_11= ',' ( (lv_Crops_12_0= ruleCrop ) )
            	    {
            	    otherlv_11=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_11, grammarAccess.getFarmAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalSmartFarming.g:191:4: ( (lv_Crops_12_0= ruleCrop ) )
            	    // InternalSmartFarming.g:192:5: (lv_Crops_12_0= ruleCrop )
            	    {
            	    // InternalSmartFarming.g:192:5: (lv_Crops_12_0= ruleCrop )
            	    // InternalSmartFarming.g:193:6: lv_Crops_12_0= ruleCrop
            	    {

            	    						newCompositeNode(grammarAccess.getFarmAccess().getCropsCropParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_Crops_12_0=ruleCrop();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFarmRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Crops",
            	    							lv_Crops_12_0,
            	    							"com.se4gd.smartfarming.SmartFarming.Crop");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_13=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getFarmAccess().getRightSquareBracketKeyword_11());
            		
            otherlv_14=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_14, grammarAccess.getFarmAccess().getFarmersKeyword_12());
            		
            otherlv_15=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_15, grammarAccess.getFarmAccess().getLeftSquareBracketKeyword_13());
            		
            // InternalSmartFarming.g:223:3: ( (lv_Farmers_16_0= ruleFarmer ) )
            // InternalSmartFarming.g:224:4: (lv_Farmers_16_0= ruleFarmer )
            {
            // InternalSmartFarming.g:224:4: (lv_Farmers_16_0= ruleFarmer )
            // InternalSmartFarming.g:225:5: lv_Farmers_16_0= ruleFarmer
            {

            					newCompositeNode(grammarAccess.getFarmAccess().getFarmersFarmerParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_12);
            lv_Farmers_16_0=ruleFarmer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFarmRule());
            					}
            					add(
            						current,
            						"Farmers",
            						lv_Farmers_16_0,
            						"com.se4gd.smartfarming.SmartFarming.Farmer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartFarming.g:242:3: (otherlv_17= ',' ( (lv_Farmers_18_0= ruleFarmer ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmartFarming.g:243:4: otherlv_17= ',' ( (lv_Farmers_18_0= ruleFarmer ) )
            	    {
            	    otherlv_17=(Token)match(input,18,FOLLOW_14); 

            	    				newLeafNode(otherlv_17, grammarAccess.getFarmAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalSmartFarming.g:247:4: ( (lv_Farmers_18_0= ruleFarmer ) )
            	    // InternalSmartFarming.g:248:5: (lv_Farmers_18_0= ruleFarmer )
            	    {
            	    // InternalSmartFarming.g:248:5: (lv_Farmers_18_0= ruleFarmer )
            	    // InternalSmartFarming.g:249:6: lv_Farmers_18_0= ruleFarmer
            	    {

            	    						newCompositeNode(grammarAccess.getFarmAccess().getFarmersFarmerParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_Farmers_18_0=ruleFarmer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFarmRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Farmers",
            	    							lv_Farmers_18_0,
            	    							"com.se4gd.smartfarming.SmartFarming.Farmer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_19=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_19, grammarAccess.getFarmAccess().getRightSquareBracketKeyword_16());
            		
            otherlv_20=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_20, grammarAccess.getFarmAccess().getIoTSystemKeyword_17());
            		
            otherlv_21=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_21, grammarAccess.getFarmAccess().getLeftSquareBracketKeyword_18());
            		
            // InternalSmartFarming.g:279:3: ( (lv_IoTSystem_22_0= ruleIoTSystem ) )
            // InternalSmartFarming.g:280:4: (lv_IoTSystem_22_0= ruleIoTSystem )
            {
            // InternalSmartFarming.g:280:4: (lv_IoTSystem_22_0= ruleIoTSystem )
            // InternalSmartFarming.g:281:5: lv_IoTSystem_22_0= ruleIoTSystem
            {

            					newCompositeNode(grammarAccess.getFarmAccess().getIoTSystemIoTSystemParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_17);
            lv_IoTSystem_22_0=ruleIoTSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFarmRule());
            					}
            					set(
            						current,
            						"IoTSystem",
            						lv_IoTSystem_22_0,
            						"com.se4gd.smartfarming.SmartFarming.IoTSystem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_23, grammarAccess.getFarmAccess().getRightSquareBracketKeyword_20());
            		
            otherlv_24=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getFarmAccess().getRightCurlyBracketKeyword_21());
            		

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
    // $ANTLR end "ruleFarm"


    // $ANTLR start "entryRuleService"
    // InternalSmartFarming.g:310:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalSmartFarming.g:310:48: (iv_ruleService= ruleService EOF )
            // InternalSmartFarming.g:311:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalSmartFarming.g:317:1: ruleService returns [EObject current=null] : (this_AnalyticsSystem_0= ruleAnalyticsSystem | this_Monitoring_1= ruleMonitoring | this_Controlling_2= ruleControlling ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        EObject this_AnalyticsSystem_0 = null;

        EObject this_Monitoring_1 = null;

        EObject this_Controlling_2 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:323:2: ( (this_AnalyticsSystem_0= ruleAnalyticsSystem | this_Monitoring_1= ruleMonitoring | this_Controlling_2= ruleControlling ) )
            // InternalSmartFarming.g:324:2: (this_AnalyticsSystem_0= ruleAnalyticsSystem | this_Monitoring_1= ruleMonitoring | this_Controlling_2= ruleControlling )
            {
            // InternalSmartFarming.g:324:2: (this_AnalyticsSystem_0= ruleAnalyticsSystem | this_Monitoring_1= ruleMonitoring | this_Controlling_2= ruleControlling )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt4=1;
                }
                break;
            case 48:
                {
                alt4=2;
                }
                break;
            case 52:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSmartFarming.g:325:3: this_AnalyticsSystem_0= ruleAnalyticsSystem
                    {

                    			newCompositeNode(grammarAccess.getServiceAccess().getAnalyticsSystemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnalyticsSystem_0=ruleAnalyticsSystem();

                    state._fsp--;


                    			current = this_AnalyticsSystem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:334:3: this_Monitoring_1= ruleMonitoring
                    {

                    			newCompositeNode(grammarAccess.getServiceAccess().getMonitoringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Monitoring_1=ruleMonitoring();

                    state._fsp--;


                    			current = this_Monitoring_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmartFarming.g:343:3: this_Controlling_2= ruleControlling
                    {

                    			newCompositeNode(grammarAccess.getServiceAccess().getControllingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Controlling_2=ruleControlling();

                    state._fsp--;


                    			current = this_Controlling_2;
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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleDevice"
    // InternalSmartFarming.g:355:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalSmartFarming.g:355:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalSmartFarming.g:356:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalSmartFarming.g:362:1: ruleDevice returns [EObject current=null] : (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        EObject this_Actuator_0 = null;

        EObject this_Sensor_1 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:368:2: ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) )
            // InternalSmartFarming.g:369:2: (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor )
            {
            // InternalSmartFarming.g:369:2: (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==66) ) {
                alt5=1;
            }
            else if ( (LA5_0==56) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmartFarming.g:370:3: this_Actuator_0= ruleActuator
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getActuatorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actuator_0=ruleActuator();

                    state._fsp--;


                    			current = this_Actuator_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:379:3: this_Sensor_1= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_1=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_1;
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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleEString"
    // InternalSmartFarming.g:391:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmartFarming.g:391:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmartFarming.g:392:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmartFarming.g:398:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:404:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmartFarming.g:405:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmartFarming.g:405:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalSmartFarming.g:406:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:414:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEFloat"
    // InternalSmartFarming.g:425:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalSmartFarming.g:425:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalSmartFarming.g:426:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalSmartFarming.g:432:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:438:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalSmartFarming.g:439:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalSmartFarming.g:439:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalSmartFarming.g:440:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalSmartFarming.g:440:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmartFarming.g:441:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSmartFarming.g:447:3: (this_INT_1= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmartFarming.g:448:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_20); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,24,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalSmartFarming.g:468:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=25 && LA11_0<=26)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmartFarming.g:469:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalSmartFarming.g:469:4: (kw= 'E' | kw= 'e' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==25) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==26) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSmartFarming.g:470:5: kw= 'E'
                            {
                            kw=(Token)match(input,25,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSmartFarming.g:476:5: kw= 'e'
                            {
                            kw=(Token)match(input,26,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSmartFarming.g:482:4: (kw= '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==23) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSmartFarming.g:483:5: kw= '-'
                            {
                            kw=(Token)match(input,23,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleCrop"
    // InternalSmartFarming.g:501:1: entryRuleCrop returns [EObject current=null] : iv_ruleCrop= ruleCrop EOF ;
    public final EObject entryRuleCrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrop = null;


        try {
            // InternalSmartFarming.g:501:45: (iv_ruleCrop= ruleCrop EOF )
            // InternalSmartFarming.g:502:2: iv_ruleCrop= ruleCrop EOF
            {
             newCompositeNode(grammarAccess.getCropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrop=ruleCrop();

            state._fsp--;

             current =iv_ruleCrop; 
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
    // $ANTLR end "entryRuleCrop"


    // $ANTLR start "ruleCrop"
    // InternalSmartFarming.g:508:1: ruleCrop returns [EObject current=null] : (otherlv_0= 'Crop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'CropGroup:' ( (lv_CropGroup_4_0= ruleCropGroup ) ) )? otherlv_5= 'GrowthDuration:' ( (lv_GrowthDuration_6_0= ruleEInt ) ) otherlv_7= 'days' (otherlv_8= 'SeedCode:' ( (lv_SeedCode_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleCrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_CropGroup_4_0 = null;

        AntlrDatatypeRuleToken lv_GrowthDuration_6_0 = null;

        AntlrDatatypeRuleToken lv_SeedCode_9_0 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:514:2: ( (otherlv_0= 'Crop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'CropGroup:' ( (lv_CropGroup_4_0= ruleCropGroup ) ) )? otherlv_5= 'GrowthDuration:' ( (lv_GrowthDuration_6_0= ruleEInt ) ) otherlv_7= 'days' (otherlv_8= 'SeedCode:' ( (lv_SeedCode_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalSmartFarming.g:515:2: (otherlv_0= 'Crop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'CropGroup:' ( (lv_CropGroup_4_0= ruleCropGroup ) ) )? otherlv_5= 'GrowthDuration:' ( (lv_GrowthDuration_6_0= ruleEInt ) ) otherlv_7= 'days' (otherlv_8= 'SeedCode:' ( (lv_SeedCode_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalSmartFarming.g:515:2: (otherlv_0= 'Crop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'CropGroup:' ( (lv_CropGroup_4_0= ruleCropGroup ) ) )? otherlv_5= 'GrowthDuration:' ( (lv_GrowthDuration_6_0= ruleEInt ) ) otherlv_7= 'days' (otherlv_8= 'SeedCode:' ( (lv_SeedCode_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalSmartFarming.g:516:3: otherlv_0= 'Crop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'CropGroup:' ( (lv_CropGroup_4_0= ruleCropGroup ) ) )? otherlv_5= 'GrowthDuration:' ( (lv_GrowthDuration_6_0= ruleEInt ) ) otherlv_7= 'days' (otherlv_8= 'SeedCode:' ( (lv_SeedCode_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCropAccess().getCropKeyword_0());
            		
            // InternalSmartFarming.g:520:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartFarming.g:521:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartFarming.g:521:4: (lv_name_1_0= ruleEString )
            // InternalSmartFarming.g:522:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCropAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCropRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.se4gd.smartfarming.SmartFarming.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getCropAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartFarming.g:543:3: (otherlv_3= 'CropGroup:' ( (lv_CropGroup_4_0= ruleCropGroup ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmartFarming.g:544:4: otherlv_3= 'CropGroup:' ( (lv_CropGroup_4_0= ruleCropGroup ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getCropAccess().getCropGroupKeyword_3_0());
                    			
                    // InternalSmartFarming.g:548:4: ( (lv_CropGroup_4_0= ruleCropGroup ) )
                    // InternalSmartFarming.g:549:5: (lv_CropGroup_4_0= ruleCropGroup )
                    {
                    // InternalSmartFarming.g:549:5: (lv_CropGroup_4_0= ruleCropGroup )
                    // InternalSmartFarming.g:550:6: lv_CropGroup_4_0= ruleCropGroup
                    {

                    						newCompositeNode(grammarAccess.getCropAccess().getCropGroupCropGroupEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_CropGroup_4_0=ruleCropGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCropRule());
                    						}
                    						set(
                    							current,
                    							"CropGroup",
                    							lv_CropGroup_4_0,
                    							"com.se4gd.smartfarming.SmartFarming.CropGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getCropAccess().getGrowthDurationKeyword_4());
            		
            // InternalSmartFarming.g:572:3: ( (lv_GrowthDuration_6_0= ruleEInt ) )
            // InternalSmartFarming.g:573:4: (lv_GrowthDuration_6_0= ruleEInt )
            {
            // InternalSmartFarming.g:573:4: (lv_GrowthDuration_6_0= ruleEInt )
            // InternalSmartFarming.g:574:5: lv_GrowthDuration_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCropAccess().getGrowthDurationEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_GrowthDuration_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCropRule());
            					}
            					set(
            						current,
            						"GrowthDuration",
            						lv_GrowthDuration_6_0,
            						"com.se4gd.smartfarming.SmartFarming.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_7, grammarAccess.getCropAccess().getDaysKeyword_6());
            		
            // InternalSmartFarming.g:595:3: (otherlv_8= 'SeedCode:' ( (lv_SeedCode_9_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmartFarming.g:596:4: otherlv_8= 'SeedCode:' ( (lv_SeedCode_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getCropAccess().getSeedCodeKeyword_7_0());
                    			
                    // InternalSmartFarming.g:600:4: ( (lv_SeedCode_9_0= ruleEString ) )
                    // InternalSmartFarming.g:601:5: (lv_SeedCode_9_0= ruleEString )
                    {
                    // InternalSmartFarming.g:601:5: (lv_SeedCode_9_0= ruleEString )
                    // InternalSmartFarming.g:602:6: lv_SeedCode_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCropAccess().getSeedCodeEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_SeedCode_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCropRule());
                    						}
                    						set(
                    							current,
                    							"SeedCode",
                    							lv_SeedCode_9_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCropAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleCrop"


    // $ANTLR start "entryRuleFarmer"
    // InternalSmartFarming.g:628:1: entryRuleFarmer returns [EObject current=null] : iv_ruleFarmer= ruleFarmer EOF ;
    public final EObject entryRuleFarmer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFarmer = null;


        try {
            // InternalSmartFarming.g:628:47: (iv_ruleFarmer= ruleFarmer EOF )
            // InternalSmartFarming.g:629:2: iv_ruleFarmer= ruleFarmer EOF
            {
             newCompositeNode(grammarAccess.getFarmerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFarmer=ruleFarmer();

            state._fsp--;

             current =iv_ruleFarmer; 
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
    // $ANTLR end "entryRuleFarmer"


    // $ANTLR start "ruleFarmer"
    // InternalSmartFarming.g:635:1: ruleFarmer returns [EObject current=null] : (otherlv_0= 'Farmer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'FarmerID:' ( (lv_FarmerID_4_0= ruleEString ) ) )? (otherlv_5= 'Email:' ( (lv_Email_6_0= ruleEString ) ) )? (otherlv_7= 'PhoneNumber:' ( (lv_PhoneNumber_8_0= ruleEString ) ) )? otherlv_9= 'Services:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' otherlv_15= '}' ) ;
    public final EObject ruleFarmer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_FarmerID_4_0 = null;

        AntlrDatatypeRuleToken lv_Email_6_0 = null;

        AntlrDatatypeRuleToken lv_PhoneNumber_8_0 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:641:2: ( (otherlv_0= 'Farmer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'FarmerID:' ( (lv_FarmerID_4_0= ruleEString ) ) )? (otherlv_5= 'Email:' ( (lv_Email_6_0= ruleEString ) ) )? (otherlv_7= 'PhoneNumber:' ( (lv_PhoneNumber_8_0= ruleEString ) ) )? otherlv_9= 'Services:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' otherlv_15= '}' ) )
            // InternalSmartFarming.g:642:2: (otherlv_0= 'Farmer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'FarmerID:' ( (lv_FarmerID_4_0= ruleEString ) ) )? (otherlv_5= 'Email:' ( (lv_Email_6_0= ruleEString ) ) )? (otherlv_7= 'PhoneNumber:' ( (lv_PhoneNumber_8_0= ruleEString ) ) )? otherlv_9= 'Services:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' otherlv_15= '}' )
            {
            // InternalSmartFarming.g:642:2: (otherlv_0= 'Farmer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'FarmerID:' ( (lv_FarmerID_4_0= ruleEString ) ) )? (otherlv_5= 'Email:' ( (lv_Email_6_0= ruleEString ) ) )? (otherlv_7= 'PhoneNumber:' ( (lv_PhoneNumber_8_0= ruleEString ) ) )? otherlv_9= 'Services:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' otherlv_15= '}' )
            // InternalSmartFarming.g:643:3: otherlv_0= 'Farmer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'FarmerID:' ( (lv_FarmerID_4_0= ruleEString ) ) )? (otherlv_5= 'Email:' ( (lv_Email_6_0= ruleEString ) ) )? (otherlv_7= 'PhoneNumber:' ( (lv_PhoneNumber_8_0= ruleEString ) ) )? otherlv_9= 'Services:' otherlv_10= '[' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ']' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFarmerAccess().getFarmerKeyword_0());
            		
            // InternalSmartFarming.g:647:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartFarming.g:648:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartFarming.g:648:4: (lv_name_1_0= ruleEString )
            // InternalSmartFarming.g:649:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFarmerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFarmerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.se4gd.smartfarming.SmartFarming.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getFarmerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartFarming.g:670:3: (otherlv_3= 'FarmerID:' ( (lv_FarmerID_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmartFarming.g:671:4: otherlv_3= 'FarmerID:' ( (lv_FarmerID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFarmerAccess().getFarmerIDKeyword_3_0());
                    			
                    // InternalSmartFarming.g:675:4: ( (lv_FarmerID_4_0= ruleEString ) )
                    // InternalSmartFarming.g:676:5: (lv_FarmerID_4_0= ruleEString )
                    {
                    // InternalSmartFarming.g:676:5: (lv_FarmerID_4_0= ruleEString )
                    // InternalSmartFarming.g:677:6: lv_FarmerID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFarmerAccess().getFarmerIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_FarmerID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFarmerRule());
                    						}
                    						set(
                    							current,
                    							"FarmerID",
                    							lv_FarmerID_4_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:695:3: (otherlv_5= 'Email:' ( (lv_Email_6_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmartFarming.g:696:4: otherlv_5= 'Email:' ( (lv_Email_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getFarmerAccess().getEmailKeyword_4_0());
                    			
                    // InternalSmartFarming.g:700:4: ( (lv_Email_6_0= ruleEString ) )
                    // InternalSmartFarming.g:701:5: (lv_Email_6_0= ruleEString )
                    {
                    // InternalSmartFarming.g:701:5: (lv_Email_6_0= ruleEString )
                    // InternalSmartFarming.g:702:6: lv_Email_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFarmerAccess().getEmailEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_Email_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFarmerRule());
                    						}
                    						set(
                    							current,
                    							"Email",
                    							lv_Email_6_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:720:3: (otherlv_7= 'PhoneNumber:' ( (lv_PhoneNumber_8_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmartFarming.g:721:4: otherlv_7= 'PhoneNumber:' ( (lv_PhoneNumber_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getFarmerAccess().getPhoneNumberKeyword_5_0());
                    			
                    // InternalSmartFarming.g:725:4: ( (lv_PhoneNumber_8_0= ruleEString ) )
                    // InternalSmartFarming.g:726:5: (lv_PhoneNumber_8_0= ruleEString )
                    {
                    // InternalSmartFarming.g:726:5: (lv_PhoneNumber_8_0= ruleEString )
                    // InternalSmartFarming.g:727:6: lv_PhoneNumber_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFarmerAccess().getPhoneNumberEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_PhoneNumber_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFarmerRule());
                    						}
                    						set(
                    							current,
                    							"PhoneNumber",
                    							lv_PhoneNumber_8_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getFarmerAccess().getServicesKeyword_6());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getFarmerAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalSmartFarming.g:753:3: ( ( ruleEString ) )
            // InternalSmartFarming.g:754:4: ( ruleEString )
            {
            // InternalSmartFarming.g:754:4: ( ruleEString )
            // InternalSmartFarming.g:755:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFarmerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFarmerAccess().getServicesServiceCrossReference_8_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartFarming.g:769:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSmartFarming.g:770:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_12, grammarAccess.getFarmerAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalSmartFarming.g:774:4: ( ( ruleEString ) )
            	    // InternalSmartFarming.g:775:5: ( ruleEString )
            	    {
            	    // InternalSmartFarming.g:775:5: ( ruleEString )
            	    // InternalSmartFarming.g:776:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFarmerRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getFarmerAccess().getServicesServiceCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_14, grammarAccess.getFarmerAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_15=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getFarmerAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleFarmer"


    // $ANTLR start "entryRuleIoTSystem"
    // InternalSmartFarming.g:803:1: entryRuleIoTSystem returns [EObject current=null] : iv_ruleIoTSystem= ruleIoTSystem EOF ;
    public final EObject entryRuleIoTSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIoTSystem = null;


        try {
            // InternalSmartFarming.g:803:50: (iv_ruleIoTSystem= ruleIoTSystem EOF )
            // InternalSmartFarming.g:804:2: iv_ruleIoTSystem= ruleIoTSystem EOF
            {
             newCompositeNode(grammarAccess.getIoTSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIoTSystem=ruleIoTSystem();

            state._fsp--;

             current =iv_ruleIoTSystem; 
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
    // $ANTLR end "entryRuleIoTSystem"


    // $ANTLR start "ruleIoTSystem"
    // InternalSmartFarming.g:810:1: ruleIoTSystem returns [EObject current=null] : (otherlv_0= 'IoTSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Version:' ( (lv_Version_4_0= ruleEString ) ) )? otherlv_5= 'Services:' otherlv_6= '[' ( (lv_Services_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_Services_9_0= ruleService ) ) )* otherlv_10= ']' otherlv_11= 'Devices:' otherlv_12= '[' ( (lv_Devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_Devices_15_0= ruleDevice ) ) )* otherlv_16= ']' otherlv_17= 'Gateways:' otherlv_18= '[' ( (lv_Gateways_19_0= ruleGateway ) ) (otherlv_20= ',' ( (lv_Gateways_21_0= ruleGateway ) ) )* otherlv_22= ']' otherlv_23= '}' ) ;
    public final EObject ruleIoTSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_Version_4_0 = null;

        EObject lv_Services_7_0 = null;

        EObject lv_Services_9_0 = null;

        EObject lv_Devices_13_0 = null;

        EObject lv_Devices_15_0 = null;

        EObject lv_Gateways_19_0 = null;

        EObject lv_Gateways_21_0 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:816:2: ( (otherlv_0= 'IoTSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Version:' ( (lv_Version_4_0= ruleEString ) ) )? otherlv_5= 'Services:' otherlv_6= '[' ( (lv_Services_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_Services_9_0= ruleService ) ) )* otherlv_10= ']' otherlv_11= 'Devices:' otherlv_12= '[' ( (lv_Devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_Devices_15_0= ruleDevice ) ) )* otherlv_16= ']' otherlv_17= 'Gateways:' otherlv_18= '[' ( (lv_Gateways_19_0= ruleGateway ) ) (otherlv_20= ',' ( (lv_Gateways_21_0= ruleGateway ) ) )* otherlv_22= ']' otherlv_23= '}' ) )
            // InternalSmartFarming.g:817:2: (otherlv_0= 'IoTSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Version:' ( (lv_Version_4_0= ruleEString ) ) )? otherlv_5= 'Services:' otherlv_6= '[' ( (lv_Services_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_Services_9_0= ruleService ) ) )* otherlv_10= ']' otherlv_11= 'Devices:' otherlv_12= '[' ( (lv_Devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_Devices_15_0= ruleDevice ) ) )* otherlv_16= ']' otherlv_17= 'Gateways:' otherlv_18= '[' ( (lv_Gateways_19_0= ruleGateway ) ) (otherlv_20= ',' ( (lv_Gateways_21_0= ruleGateway ) ) )* otherlv_22= ']' otherlv_23= '}' )
            {
            // InternalSmartFarming.g:817:2: (otherlv_0= 'IoTSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Version:' ( (lv_Version_4_0= ruleEString ) ) )? otherlv_5= 'Services:' otherlv_6= '[' ( (lv_Services_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_Services_9_0= ruleService ) ) )* otherlv_10= ']' otherlv_11= 'Devices:' otherlv_12= '[' ( (lv_Devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_Devices_15_0= ruleDevice ) ) )* otherlv_16= ']' otherlv_17= 'Gateways:' otherlv_18= '[' ( (lv_Gateways_19_0= ruleGateway ) ) (otherlv_20= ',' ( (lv_Gateways_21_0= ruleGateway ) ) )* otherlv_22= ']' otherlv_23= '}' )
            // InternalSmartFarming.g:818:3: otherlv_0= 'IoTSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Version:' ( (lv_Version_4_0= ruleEString ) ) )? otherlv_5= 'Services:' otherlv_6= '[' ( (lv_Services_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_Services_9_0= ruleService ) ) )* otherlv_10= ']' otherlv_11= 'Devices:' otherlv_12= '[' ( (lv_Devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_Devices_15_0= ruleDevice ) ) )* otherlv_16= ']' otherlv_17= 'Gateways:' otherlv_18= '[' ( (lv_Gateways_19_0= ruleGateway ) ) (otherlv_20= ',' ( (lv_Gateways_21_0= ruleGateway ) ) )* otherlv_22= ']' otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIoTSystemAccess().getIoTSystemKeyword_0());
            		
            // InternalSmartFarming.g:822:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartFarming.g:823:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartFarming.g:823:4: (lv_name_1_0= ruleEString )
            // InternalSmartFarming.g:824:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIoTSystemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIoTSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.se4gd.smartfarming.SmartFarming.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getIoTSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartFarming.g:845:3: (otherlv_3= 'Version:' ( (lv_Version_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSmartFarming.g:846:4: otherlv_3= 'Version:' ( (lv_Version_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getIoTSystemAccess().getVersionKeyword_3_0());
                    			
                    // InternalSmartFarming.g:850:4: ( (lv_Version_4_0= ruleEString ) )
                    // InternalSmartFarming.g:851:5: (lv_Version_4_0= ruleEString )
                    {
                    // InternalSmartFarming.g:851:5: (lv_Version_4_0= ruleEString )
                    // InternalSmartFarming.g:852:6: lv_Version_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIoTSystemAccess().getVersionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_Version_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIoTSystemRule());
                    						}
                    						set(
                    							current,
                    							"Version",
                    							lv_Version_4_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getIoTSystemAccess().getServicesKeyword_4());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getIoTSystemAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalSmartFarming.g:878:3: ( (lv_Services_7_0= ruleService ) )
            // InternalSmartFarming.g:879:4: (lv_Services_7_0= ruleService )
            {
            // InternalSmartFarming.g:879:4: (lv_Services_7_0= ruleService )
            // InternalSmartFarming.g:880:5: lv_Services_7_0= ruleService
            {

            					newCompositeNode(grammarAccess.getIoTSystemAccess().getServicesServiceParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_Services_7_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIoTSystemRule());
            					}
            					add(
            						current,
            						"Services",
            						lv_Services_7_0,
            						"com.se4gd.smartfarming.SmartFarming.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartFarming.g:897:3: (otherlv_8= ',' ( (lv_Services_9_0= ruleService ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSmartFarming.g:898:4: otherlv_8= ',' ( (lv_Services_9_0= ruleService ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FOLLOW_34); 

            	    				newLeafNode(otherlv_8, grammarAccess.getIoTSystemAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSmartFarming.g:902:4: ( (lv_Services_9_0= ruleService ) )
            	    // InternalSmartFarming.g:903:5: (lv_Services_9_0= ruleService )
            	    {
            	    // InternalSmartFarming.g:903:5: (lv_Services_9_0= ruleService )
            	    // InternalSmartFarming.g:904:6: lv_Services_9_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getIoTSystemAccess().getServicesServiceParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_Services_9_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIoTSystemRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Services",
            	    							lv_Services_9_0,
            	    							"com.se4gd.smartfarming.SmartFarming.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_35); 

            			newLeafNode(otherlv_10, grammarAccess.getIoTSystemAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getIoTSystemAccess().getDevicesKeyword_9());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_36); 

            			newLeafNode(otherlv_12, grammarAccess.getIoTSystemAccess().getLeftSquareBracketKeyword_10());
            		
            // InternalSmartFarming.g:934:3: ( (lv_Devices_13_0= ruleDevice ) )
            // InternalSmartFarming.g:935:4: (lv_Devices_13_0= ruleDevice )
            {
            // InternalSmartFarming.g:935:4: (lv_Devices_13_0= ruleDevice )
            // InternalSmartFarming.g:936:5: lv_Devices_13_0= ruleDevice
            {

            					newCompositeNode(grammarAccess.getIoTSystemAccess().getDevicesDeviceParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_Devices_13_0=ruleDevice();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIoTSystemRule());
            					}
            					add(
            						current,
            						"Devices",
            						lv_Devices_13_0,
            						"com.se4gd.smartfarming.SmartFarming.Device");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartFarming.g:953:3: (otherlv_14= ',' ( (lv_Devices_15_0= ruleDevice ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSmartFarming.g:954:4: otherlv_14= ',' ( (lv_Devices_15_0= ruleDevice ) )
            	    {
            	    otherlv_14=(Token)match(input,18,FOLLOW_36); 

            	    				newLeafNode(otherlv_14, grammarAccess.getIoTSystemAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalSmartFarming.g:958:4: ( (lv_Devices_15_0= ruleDevice ) )
            	    // InternalSmartFarming.g:959:5: (lv_Devices_15_0= ruleDevice )
            	    {
            	    // InternalSmartFarming.g:959:5: (lv_Devices_15_0= ruleDevice )
            	    // InternalSmartFarming.g:960:6: lv_Devices_15_0= ruleDevice
            	    {

            	    						newCompositeNode(grammarAccess.getIoTSystemAccess().getDevicesDeviceParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_Devices_15_0=ruleDevice();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIoTSystemRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Devices",
            	    							lv_Devices_15_0,
            	    							"com.se4gd.smartfarming.SmartFarming.Device");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_16=(Token)match(input,19,FOLLOW_37); 

            			newLeafNode(otherlv_16, grammarAccess.getIoTSystemAccess().getRightSquareBracketKeyword_13());
            		
            otherlv_17=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_17, grammarAccess.getIoTSystemAccess().getGatewaysKeyword_14());
            		
            otherlv_18=(Token)match(input,17,FOLLOW_38); 

            			newLeafNode(otherlv_18, grammarAccess.getIoTSystemAccess().getLeftSquareBracketKeyword_15());
            		
            // InternalSmartFarming.g:990:3: ( (lv_Gateways_19_0= ruleGateway ) )
            // InternalSmartFarming.g:991:4: (lv_Gateways_19_0= ruleGateway )
            {
            // InternalSmartFarming.g:991:4: (lv_Gateways_19_0= ruleGateway )
            // InternalSmartFarming.g:992:5: lv_Gateways_19_0= ruleGateway
            {

            					newCompositeNode(grammarAccess.getIoTSystemAccess().getGatewaysGatewayParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_12);
            lv_Gateways_19_0=ruleGateway();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIoTSystemRule());
            					}
            					add(
            						current,
            						"Gateways",
            						lv_Gateways_19_0,
            						"com.se4gd.smartfarming.SmartFarming.Gateway");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartFarming.g:1009:3: (otherlv_20= ',' ( (lv_Gateways_21_0= ruleGateway ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSmartFarming.g:1010:4: otherlv_20= ',' ( (lv_Gateways_21_0= ruleGateway ) )
            	    {
            	    otherlv_20=(Token)match(input,18,FOLLOW_38); 

            	    				newLeafNode(otherlv_20, grammarAccess.getIoTSystemAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalSmartFarming.g:1014:4: ( (lv_Gateways_21_0= ruleGateway ) )
            	    // InternalSmartFarming.g:1015:5: (lv_Gateways_21_0= ruleGateway )
            	    {
            	    // InternalSmartFarming.g:1015:5: (lv_Gateways_21_0= ruleGateway )
            	    // InternalSmartFarming.g:1016:6: lv_Gateways_21_0= ruleGateway
            	    {

            	    						newCompositeNode(grammarAccess.getIoTSystemAccess().getGatewaysGatewayParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_Gateways_21_0=ruleGateway();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIoTSystemRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Gateways",
            	    							lv_Gateways_21_0,
            	    							"com.se4gd.smartfarming.SmartFarming.Gateway");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_22=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_22, grammarAccess.getIoTSystemAccess().getRightSquareBracketKeyword_18());
            		
            otherlv_23=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getIoTSystemAccess().getRightCurlyBracketKeyword_19());
            		

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
    // $ANTLR end "ruleIoTSystem"


    // $ANTLR start "entryRuleEInt"
    // InternalSmartFarming.g:1046:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmartFarming.g:1046:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmartFarming.g:1047:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmartFarming.g:1053:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:1059:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmartFarming.g:1060:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmartFarming.g:1060:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmartFarming.g:1061:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmartFarming.g:1061:3: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSmartFarming.g:1062:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleAnalyticsSystem"
    // InternalSmartFarming.g:1079:1: entryRuleAnalyticsSystem returns [EObject current=null] : iv_ruleAnalyticsSystem= ruleAnalyticsSystem EOF ;
    public final EObject entryRuleAnalyticsSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyticsSystem = null;


        try {
            // InternalSmartFarming.g:1079:56: (iv_ruleAnalyticsSystem= ruleAnalyticsSystem EOF )
            // InternalSmartFarming.g:1080:2: iv_ruleAnalyticsSystem= ruleAnalyticsSystem EOF
            {
             newCompositeNode(grammarAccess.getAnalyticsSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalyticsSystem=ruleAnalyticsSystem();

            state._fsp--;

             current =iv_ruleAnalyticsSystem; 
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
    // $ANTLR end "entryRuleAnalyticsSystem"


    // $ANTLR start "ruleAnalyticsSystem"
    // InternalSmartFarming.g:1086:1: ruleAnalyticsSystem returns [EObject current=null] : ( () otherlv_1= 'AnalyticsSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ServiceID:' ( (lv_ServiceID_5_0= ruleEString ) ) )? (otherlv_6= 'Host:' ( (lv_Host_7_0= ruleEString ) ) )? (otherlv_8= 'URI:' ( (lv_URI_9_0= ruleEString ) ) )? (otherlv_10= 'AnalyticsType:' ( (lv_AnalyticsType_11_0= ruleAnalyticsType ) ) )? (otherlv_12= 'DataSource:' ( (lv_DataSource_13_0= ruleEString ) ) )? (otherlv_14= 'OutputType:' ( (lv_OutputType_15_0= ruleOutputType ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleAnalyticsSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ServiceID_5_0 = null;

        AntlrDatatypeRuleToken lv_Host_7_0 = null;

        AntlrDatatypeRuleToken lv_URI_9_0 = null;

        Enumerator lv_AnalyticsType_11_0 = null;

        AntlrDatatypeRuleToken lv_DataSource_13_0 = null;

        Enumerator lv_OutputType_15_0 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:1092:2: ( ( () otherlv_1= 'AnalyticsSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ServiceID:' ( (lv_ServiceID_5_0= ruleEString ) ) )? (otherlv_6= 'Host:' ( (lv_Host_7_0= ruleEString ) ) )? (otherlv_8= 'URI:' ( (lv_URI_9_0= ruleEString ) ) )? (otherlv_10= 'AnalyticsType:' ( (lv_AnalyticsType_11_0= ruleAnalyticsType ) ) )? (otherlv_12= 'DataSource:' ( (lv_DataSource_13_0= ruleEString ) ) )? (otherlv_14= 'OutputType:' ( (lv_OutputType_15_0= ruleOutputType ) ) )? otherlv_16= '}' ) )
            // InternalSmartFarming.g:1093:2: ( () otherlv_1= 'AnalyticsSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ServiceID:' ( (lv_ServiceID_5_0= ruleEString ) ) )? (otherlv_6= 'Host:' ( (lv_Host_7_0= ruleEString ) ) )? (otherlv_8= 'URI:' ( (lv_URI_9_0= ruleEString ) ) )? (otherlv_10= 'AnalyticsType:' ( (lv_AnalyticsType_11_0= ruleAnalyticsType ) ) )? (otherlv_12= 'DataSource:' ( (lv_DataSource_13_0= ruleEString ) ) )? (otherlv_14= 'OutputType:' ( (lv_OutputType_15_0= ruleOutputType ) ) )? otherlv_16= '}' )
            {
            // InternalSmartFarming.g:1093:2: ( () otherlv_1= 'AnalyticsSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ServiceID:' ( (lv_ServiceID_5_0= ruleEString ) ) )? (otherlv_6= 'Host:' ( (lv_Host_7_0= ruleEString ) ) )? (otherlv_8= 'URI:' ( (lv_URI_9_0= ruleEString ) ) )? (otherlv_10= 'AnalyticsType:' ( (lv_AnalyticsType_11_0= ruleAnalyticsType ) ) )? (otherlv_12= 'DataSource:' ( (lv_DataSource_13_0= ruleEString ) ) )? (otherlv_14= 'OutputType:' ( (lv_OutputType_15_0= ruleOutputType ) ) )? otherlv_16= '}' )
            // InternalSmartFarming.g:1094:3: () otherlv_1= 'AnalyticsSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ServiceID:' ( (lv_ServiceID_5_0= ruleEString ) ) )? (otherlv_6= 'Host:' ( (lv_Host_7_0= ruleEString ) ) )? (otherlv_8= 'URI:' ( (lv_URI_9_0= ruleEString ) ) )? (otherlv_10= 'AnalyticsType:' ( (lv_AnalyticsType_11_0= ruleAnalyticsType ) ) )? (otherlv_12= 'DataSource:' ( (lv_DataSource_13_0= ruleEString ) ) )? (otherlv_14= 'OutputType:' ( (lv_OutputType_15_0= ruleOutputType ) ) )? otherlv_16= '}'
            {
            // InternalSmartFarming.g:1094:3: ()
            // InternalSmartFarming.g:1095:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnalyticsSystemAccess().getAnalyticsSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAnalyticsSystemAccess().getAnalyticsSystemKeyword_1());
            		
            // InternalSmartFarming.g:1105:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartFarming.g:1106:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartFarming.g:1106:4: (lv_name_2_0= ruleEString )
            // InternalSmartFarming.g:1107:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalyticsSystemAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalyticsSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.se4gd.smartfarming.SmartFarming.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getAnalyticsSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmartFarming.g:1128:3: (otherlv_4= 'ServiceID:' ( (lv_ServiceID_5_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSmartFarming.g:1129:4: otherlv_4= 'ServiceID:' ( (lv_ServiceID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAnalyticsSystemAccess().getServiceIDKeyword_4_0());
                    			
                    // InternalSmartFarming.g:1133:4: ( (lv_ServiceID_5_0= ruleEString ) )
                    // InternalSmartFarming.g:1134:5: (lv_ServiceID_5_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1134:5: (lv_ServiceID_5_0= ruleEString )
                    // InternalSmartFarming.g:1135:6: lv_ServiceID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnalyticsSystemAccess().getServiceIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_ServiceID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnalyticsSystemRule());
                    						}
                    						set(
                    							current,
                    							"ServiceID",
                    							lv_ServiceID_5_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1153:3: (otherlv_6= 'Host:' ( (lv_Host_7_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSmartFarming.g:1154:4: otherlv_6= 'Host:' ( (lv_Host_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getAnalyticsSystemAccess().getHostKeyword_5_0());
                    			
                    // InternalSmartFarming.g:1158:4: ( (lv_Host_7_0= ruleEString ) )
                    // InternalSmartFarming.g:1159:5: (lv_Host_7_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1159:5: (lv_Host_7_0= ruleEString )
                    // InternalSmartFarming.g:1160:6: lv_Host_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnalyticsSystemAccess().getHostEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_Host_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnalyticsSystemRule());
                    						}
                    						set(
                    							current,
                    							"Host",
                    							lv_Host_7_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1178:3: (otherlv_8= 'URI:' ( (lv_URI_9_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSmartFarming.g:1179:4: otherlv_8= 'URI:' ( (lv_URI_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getAnalyticsSystemAccess().getURIKeyword_6_0());
                    			
                    // InternalSmartFarming.g:1183:4: ( (lv_URI_9_0= ruleEString ) )
                    // InternalSmartFarming.g:1184:5: (lv_URI_9_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1184:5: (lv_URI_9_0= ruleEString )
                    // InternalSmartFarming.g:1185:6: lv_URI_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnalyticsSystemAccess().getURIEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_URI_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnalyticsSystemRule());
                    						}
                    						set(
                    							current,
                    							"URI",
                    							lv_URI_9_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1203:3: (otherlv_10= 'AnalyticsType:' ( (lv_AnalyticsType_11_0= ruleAnalyticsType ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSmartFarming.g:1204:4: otherlv_10= 'AnalyticsType:' ( (lv_AnalyticsType_11_0= ruleAnalyticsType ) )
                    {
                    otherlv_10=(Token)match(input,45,FOLLOW_43); 

                    				newLeafNode(otherlv_10, grammarAccess.getAnalyticsSystemAccess().getAnalyticsTypeKeyword_7_0());
                    			
                    // InternalSmartFarming.g:1208:4: ( (lv_AnalyticsType_11_0= ruleAnalyticsType ) )
                    // InternalSmartFarming.g:1209:5: (lv_AnalyticsType_11_0= ruleAnalyticsType )
                    {
                    // InternalSmartFarming.g:1209:5: (lv_AnalyticsType_11_0= ruleAnalyticsType )
                    // InternalSmartFarming.g:1210:6: lv_AnalyticsType_11_0= ruleAnalyticsType
                    {

                    						newCompositeNode(grammarAccess.getAnalyticsSystemAccess().getAnalyticsTypeAnalyticsTypeEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_AnalyticsType_11_0=ruleAnalyticsType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnalyticsSystemRule());
                    						}
                    						set(
                    							current,
                    							"AnalyticsType",
                    							lv_AnalyticsType_11_0,
                    							"com.se4gd.smartfarming.SmartFarming.AnalyticsType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1228:3: (otherlv_12= 'DataSource:' ( (lv_DataSource_13_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSmartFarming.g:1229:4: otherlv_12= 'DataSource:' ( (lv_DataSource_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getAnalyticsSystemAccess().getDataSourceKeyword_8_0());
                    			
                    // InternalSmartFarming.g:1233:4: ( (lv_DataSource_13_0= ruleEString ) )
                    // InternalSmartFarming.g:1234:5: (lv_DataSource_13_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1234:5: (lv_DataSource_13_0= ruleEString )
                    // InternalSmartFarming.g:1235:6: lv_DataSource_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnalyticsSystemAccess().getDataSourceEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_DataSource_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnalyticsSystemRule());
                    						}
                    						set(
                    							current,
                    							"DataSource",
                    							lv_DataSource_13_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1253:3: (otherlv_14= 'OutputType:' ( (lv_OutputType_15_0= ruleOutputType ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSmartFarming.g:1254:4: otherlv_14= 'OutputType:' ( (lv_OutputType_15_0= ruleOutputType ) )
                    {
                    otherlv_14=(Token)match(input,47,FOLLOW_46); 

                    				newLeafNode(otherlv_14, grammarAccess.getAnalyticsSystemAccess().getOutputTypeKeyword_9_0());
                    			
                    // InternalSmartFarming.g:1258:4: ( (lv_OutputType_15_0= ruleOutputType ) )
                    // InternalSmartFarming.g:1259:5: (lv_OutputType_15_0= ruleOutputType )
                    {
                    // InternalSmartFarming.g:1259:5: (lv_OutputType_15_0= ruleOutputType )
                    // InternalSmartFarming.g:1260:6: lv_OutputType_15_0= ruleOutputType
                    {

                    						newCompositeNode(grammarAccess.getAnalyticsSystemAccess().getOutputTypeOutputTypeEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_OutputType_15_0=ruleOutputType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnalyticsSystemRule());
                    						}
                    						set(
                    							current,
                    							"OutputType",
                    							lv_OutputType_15_0,
                    							"com.se4gd.smartfarming.SmartFarming.OutputType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getAnalyticsSystemAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleAnalyticsSystem"


    // $ANTLR start "entryRuleMonitoring"
    // InternalSmartFarming.g:1286:1: entryRuleMonitoring returns [EObject current=null] : iv_ruleMonitoring= ruleMonitoring EOF ;
    public final EObject entryRuleMonitoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoring = null;


        try {
            // InternalSmartFarming.g:1286:51: (iv_ruleMonitoring= ruleMonitoring EOF )
            // InternalSmartFarming.g:1287:2: iv_ruleMonitoring= ruleMonitoring EOF
            {
             newCompositeNode(grammarAccess.getMonitoringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitoring=ruleMonitoring();

            state._fsp--;

             current =iv_ruleMonitoring; 
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
    // $ANTLR end "entryRuleMonitoring"


    // $ANTLR start "ruleMonitoring"
    // InternalSmartFarming.g:1293:1: ruleMonitoring returns [EObject current=null] : (otherlv_0= 'Monitoring' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) ) )? (otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) ) )? (otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) ) )? (otherlv_9= 'Metrics:' ( (lv_Metrics_10_0= ruleMonitoringMetrics ) ) )? otherlv_11= 'Sensors:' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' (otherlv_17= 'Control:' ( ( ruleEString ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleMonitoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ServiceID_4_0 = null;

        AntlrDatatypeRuleToken lv_Host_6_0 = null;

        AntlrDatatypeRuleToken lv_URI_8_0 = null;

        Enumerator lv_Metrics_10_0 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:1299:2: ( (otherlv_0= 'Monitoring' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) ) )? (otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) ) )? (otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) ) )? (otherlv_9= 'Metrics:' ( (lv_Metrics_10_0= ruleMonitoringMetrics ) ) )? otherlv_11= 'Sensors:' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' (otherlv_17= 'Control:' ( ( ruleEString ) ) )? otherlv_19= '}' ) )
            // InternalSmartFarming.g:1300:2: (otherlv_0= 'Monitoring' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) ) )? (otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) ) )? (otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) ) )? (otherlv_9= 'Metrics:' ( (lv_Metrics_10_0= ruleMonitoringMetrics ) ) )? otherlv_11= 'Sensors:' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' (otherlv_17= 'Control:' ( ( ruleEString ) ) )? otherlv_19= '}' )
            {
            // InternalSmartFarming.g:1300:2: (otherlv_0= 'Monitoring' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) ) )? (otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) ) )? (otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) ) )? (otherlv_9= 'Metrics:' ( (lv_Metrics_10_0= ruleMonitoringMetrics ) ) )? otherlv_11= 'Sensors:' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' (otherlv_17= 'Control:' ( ( ruleEString ) ) )? otherlv_19= '}' )
            // InternalSmartFarming.g:1301:3: otherlv_0= 'Monitoring' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) ) )? (otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) ) )? (otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) ) )? (otherlv_9= 'Metrics:' ( (lv_Metrics_10_0= ruleMonitoringMetrics ) ) )? otherlv_11= 'Sensors:' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' (otherlv_17= 'Control:' ( ( ruleEString ) ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMonitoringAccess().getMonitoringKeyword_0());
            		
            // InternalSmartFarming.g:1305:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartFarming.g:1306:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartFarming.g:1306:4: (lv_name_1_0= ruleEString )
            // InternalSmartFarming.g:1307:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMonitoringAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitoringRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.se4gd.smartfarming.SmartFarming.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getMonitoringAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartFarming.g:1328:3: (otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSmartFarming.g:1329:4: otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMonitoringAccess().getServiceIDKeyword_3_0());
                    			
                    // InternalSmartFarming.g:1333:4: ( (lv_ServiceID_4_0= ruleEString ) )
                    // InternalSmartFarming.g:1334:5: (lv_ServiceID_4_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1334:5: (lv_ServiceID_4_0= ruleEString )
                    // InternalSmartFarming.g:1335:6: lv_ServiceID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMonitoringAccess().getServiceIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_ServiceID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitoringRule());
                    						}
                    						set(
                    							current,
                    							"ServiceID",
                    							lv_ServiceID_4_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1353:3: (otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSmartFarming.g:1354:4: otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMonitoringAccess().getHostKeyword_4_0());
                    			
                    // InternalSmartFarming.g:1358:4: ( (lv_Host_6_0= ruleEString ) )
                    // InternalSmartFarming.g:1359:5: (lv_Host_6_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1359:5: (lv_Host_6_0= ruleEString )
                    // InternalSmartFarming.g:1360:6: lv_Host_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMonitoringAccess().getHostEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_Host_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitoringRule());
                    						}
                    						set(
                    							current,
                    							"Host",
                    							lv_Host_6_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1378:3: (otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSmartFarming.g:1379:4: otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getMonitoringAccess().getURIKeyword_5_0());
                    			
                    // InternalSmartFarming.g:1383:4: ( (lv_URI_8_0= ruleEString ) )
                    // InternalSmartFarming.g:1384:5: (lv_URI_8_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1384:5: (lv_URI_8_0= ruleEString )
                    // InternalSmartFarming.g:1385:6: lv_URI_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMonitoringAccess().getURIEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_URI_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitoringRule());
                    						}
                    						set(
                    							current,
                    							"URI",
                    							lv_URI_8_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1403:3: (otherlv_9= 'Metrics:' ( (lv_Metrics_10_0= ruleMonitoringMetrics ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSmartFarming.g:1404:4: otherlv_9= 'Metrics:' ( (lv_Metrics_10_0= ruleMonitoringMetrics ) )
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_51); 

                    				newLeafNode(otherlv_9, grammarAccess.getMonitoringAccess().getMetricsKeyword_6_0());
                    			
                    // InternalSmartFarming.g:1408:4: ( (lv_Metrics_10_0= ruleMonitoringMetrics ) )
                    // InternalSmartFarming.g:1409:5: (lv_Metrics_10_0= ruleMonitoringMetrics )
                    {
                    // InternalSmartFarming.g:1409:5: (lv_Metrics_10_0= ruleMonitoringMetrics )
                    // InternalSmartFarming.g:1410:6: lv_Metrics_10_0= ruleMonitoringMetrics
                    {

                    						newCompositeNode(grammarAccess.getMonitoringAccess().getMetricsMonitoringMetricsEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_Metrics_10_0=ruleMonitoringMetrics();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitoringRule());
                    						}
                    						set(
                    							current,
                    							"Metrics",
                    							lv_Metrics_10_0,
                    							"com.se4gd.smartfarming.SmartFarming.MonitoringMetrics");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,50,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getMonitoringAccess().getSensorsKeyword_7());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getMonitoringAccess().getLeftSquareBracketKeyword_8());
            		
            // InternalSmartFarming.g:1436:3: ( ( ruleEString ) )
            // InternalSmartFarming.g:1437:4: ( ruleEString )
            {
            // InternalSmartFarming.g:1437:4: ( ruleEString )
            // InternalSmartFarming.g:1438:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitoringRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMonitoringAccess().getSensorsSensorCrossReference_9_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartFarming.g:1452:3: (otherlv_14= ',' ( ( ruleEString ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==18) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSmartFarming.g:1453:4: otherlv_14= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_14=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_14, grammarAccess.getMonitoringAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalSmartFarming.g:1457:4: ( ( ruleEString ) )
            	    // InternalSmartFarming.g:1458:5: ( ruleEString )
            	    {
            	    // InternalSmartFarming.g:1458:5: ( ruleEString )
            	    // InternalSmartFarming.g:1459:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMonitoringRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMonitoringAccess().getSensorsSensorCrossReference_10_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_16=(Token)match(input,19,FOLLOW_53); 

            			newLeafNode(otherlv_16, grammarAccess.getMonitoringAccess().getRightSquareBracketKeyword_11());
            		
            // InternalSmartFarming.g:1478:3: (otherlv_17= 'Control:' ( ( ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSmartFarming.g:1479:4: otherlv_17= 'Control:' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getMonitoringAccess().getControlKeyword_12_0());
                    			
                    // InternalSmartFarming.g:1483:4: ( ( ruleEString ) )
                    // InternalSmartFarming.g:1484:5: ( ruleEString )
                    {
                    // InternalSmartFarming.g:1484:5: ( ruleEString )
                    // InternalSmartFarming.g:1485:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMonitoringRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMonitoringAccess().getControlControllingCrossReference_12_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getMonitoringAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleMonitoring"


    // $ANTLR start "entryRuleControlling"
    // InternalSmartFarming.g:1508:1: entryRuleControlling returns [EObject current=null] : iv_ruleControlling= ruleControlling EOF ;
    public final EObject entryRuleControlling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlling = null;


        try {
            // InternalSmartFarming.g:1508:52: (iv_ruleControlling= ruleControlling EOF )
            // InternalSmartFarming.g:1509:2: iv_ruleControlling= ruleControlling EOF
            {
             newCompositeNode(grammarAccess.getControllingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlling=ruleControlling();

            state._fsp--;

             current =iv_ruleControlling; 
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
    // $ANTLR end "entryRuleControlling"


    // $ANTLR start "ruleControlling"
    // InternalSmartFarming.g:1515:1: ruleControlling returns [EObject current=null] : (otherlv_0= 'Controlling' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) ) )? (otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) ) )? (otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) ) )? (otherlv_9= 'ControlType:' ( (lv_ControlType_10_0= ruleControlType ) ) )? (otherlv_11= 'Action:' ( (lv_Action_12_0= ruleControllerAction ) ) )? otherlv_13= 'Actuators:' otherlv_14= '[' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ']' otherlv_19= '}' ) ;
    public final EObject ruleControlling() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ServiceID_4_0 = null;

        AntlrDatatypeRuleToken lv_Host_6_0 = null;

        AntlrDatatypeRuleToken lv_URI_8_0 = null;

        Enumerator lv_ControlType_10_0 = null;

        Enumerator lv_Action_12_0 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:1521:2: ( (otherlv_0= 'Controlling' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) ) )? (otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) ) )? (otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) ) )? (otherlv_9= 'ControlType:' ( (lv_ControlType_10_0= ruleControlType ) ) )? (otherlv_11= 'Action:' ( (lv_Action_12_0= ruleControllerAction ) ) )? otherlv_13= 'Actuators:' otherlv_14= '[' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ']' otherlv_19= '}' ) )
            // InternalSmartFarming.g:1522:2: (otherlv_0= 'Controlling' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) ) )? (otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) ) )? (otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) ) )? (otherlv_9= 'ControlType:' ( (lv_ControlType_10_0= ruleControlType ) ) )? (otherlv_11= 'Action:' ( (lv_Action_12_0= ruleControllerAction ) ) )? otherlv_13= 'Actuators:' otherlv_14= '[' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ']' otherlv_19= '}' )
            {
            // InternalSmartFarming.g:1522:2: (otherlv_0= 'Controlling' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) ) )? (otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) ) )? (otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) ) )? (otherlv_9= 'ControlType:' ( (lv_ControlType_10_0= ruleControlType ) ) )? (otherlv_11= 'Action:' ( (lv_Action_12_0= ruleControllerAction ) ) )? otherlv_13= 'Actuators:' otherlv_14= '[' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ']' otherlv_19= '}' )
            // InternalSmartFarming.g:1523:3: otherlv_0= 'Controlling' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) ) )? (otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) ) )? (otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) ) )? (otherlv_9= 'ControlType:' ( (lv_ControlType_10_0= ruleControlType ) ) )? (otherlv_11= 'Action:' ( (lv_Action_12_0= ruleControllerAction ) ) )? otherlv_13= 'Actuators:' otherlv_14= '[' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ']' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllingAccess().getControllingKeyword_0());
            		
            // InternalSmartFarming.g:1527:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartFarming.g:1528:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartFarming.g:1528:4: (lv_name_1_0= ruleEString )
            // InternalSmartFarming.g:1529:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getControllingAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllingRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.se4gd.smartfarming.SmartFarming.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getControllingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartFarming.g:1550:3: (otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSmartFarming.g:1551:4: otherlv_3= 'ServiceID:' ( (lv_ServiceID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getControllingAccess().getServiceIDKeyword_3_0());
                    			
                    // InternalSmartFarming.g:1555:4: ( (lv_ServiceID_4_0= ruleEString ) )
                    // InternalSmartFarming.g:1556:5: (lv_ServiceID_4_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1556:5: (lv_ServiceID_4_0= ruleEString )
                    // InternalSmartFarming.g:1557:6: lv_ServiceID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getControllingAccess().getServiceIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_ServiceID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllingRule());
                    						}
                    						set(
                    							current,
                    							"ServiceID",
                    							lv_ServiceID_4_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1575:3: (otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSmartFarming.g:1576:4: otherlv_5= 'Host:' ( (lv_Host_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getControllingAccess().getHostKeyword_4_0());
                    			
                    // InternalSmartFarming.g:1580:4: ( (lv_Host_6_0= ruleEString ) )
                    // InternalSmartFarming.g:1581:5: (lv_Host_6_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1581:5: (lv_Host_6_0= ruleEString )
                    // InternalSmartFarming.g:1582:6: lv_Host_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getControllingAccess().getHostEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_Host_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllingRule());
                    						}
                    						set(
                    							current,
                    							"Host",
                    							lv_Host_6_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1600:3: (otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSmartFarming.g:1601:4: otherlv_7= 'URI:' ( (lv_URI_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getControllingAccess().getURIKeyword_5_0());
                    			
                    // InternalSmartFarming.g:1605:4: ( (lv_URI_8_0= ruleEString ) )
                    // InternalSmartFarming.g:1606:5: (lv_URI_8_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1606:5: (lv_URI_8_0= ruleEString )
                    // InternalSmartFarming.g:1607:6: lv_URI_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getControllingAccess().getURIEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_URI_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllingRule());
                    						}
                    						set(
                    							current,
                    							"URI",
                    							lv_URI_8_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1625:3: (otherlv_9= 'ControlType:' ( (lv_ControlType_10_0= ruleControlType ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSmartFarming.g:1626:4: otherlv_9= 'ControlType:' ( (lv_ControlType_10_0= ruleControlType ) )
                    {
                    otherlv_9=(Token)match(input,53,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getControllingAccess().getControlTypeKeyword_6_0());
                    			
                    // InternalSmartFarming.g:1630:4: ( (lv_ControlType_10_0= ruleControlType ) )
                    // InternalSmartFarming.g:1631:5: (lv_ControlType_10_0= ruleControlType )
                    {
                    // InternalSmartFarming.g:1631:5: (lv_ControlType_10_0= ruleControlType )
                    // InternalSmartFarming.g:1632:6: lv_ControlType_10_0= ruleControlType
                    {

                    						newCompositeNode(grammarAccess.getControllingAccess().getControlTypeControlTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_ControlType_10_0=ruleControlType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllingRule());
                    						}
                    						set(
                    							current,
                    							"ControlType",
                    							lv_ControlType_10_0,
                    							"com.se4gd.smartfarming.SmartFarming.ControlType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1650:3: (otherlv_11= 'Action:' ( (lv_Action_12_0= ruleControllerAction ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSmartFarming.g:1651:4: otherlv_11= 'Action:' ( (lv_Action_12_0= ruleControllerAction ) )
                    {
                    otherlv_11=(Token)match(input,54,FOLLOW_60); 

                    				newLeafNode(otherlv_11, grammarAccess.getControllingAccess().getActionKeyword_7_0());
                    			
                    // InternalSmartFarming.g:1655:4: ( (lv_Action_12_0= ruleControllerAction ) )
                    // InternalSmartFarming.g:1656:5: (lv_Action_12_0= ruleControllerAction )
                    {
                    // InternalSmartFarming.g:1656:5: (lv_Action_12_0= ruleControllerAction )
                    // InternalSmartFarming.g:1657:6: lv_Action_12_0= ruleControllerAction
                    {

                    						newCompositeNode(grammarAccess.getControllingAccess().getActionControllerActionEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_Action_12_0=ruleControllerAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllingRule());
                    						}
                    						set(
                    							current,
                    							"Action",
                    							lv_Action_12_0,
                    							"com.se4gd.smartfarming.SmartFarming.ControllerAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,55,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getControllingAccess().getActuatorsKeyword_8());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getControllingAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalSmartFarming.g:1683:3: ( ( ruleEString ) )
            // InternalSmartFarming.g:1684:4: ( ruleEString )
            {
            // InternalSmartFarming.g:1684:4: ( ruleEString )
            // InternalSmartFarming.g:1685:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getControllingAccess().getActuatorsActuatorCrossReference_10_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartFarming.g:1699:3: (otherlv_16= ',' ( ( ruleEString ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==18) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSmartFarming.g:1700:4: otherlv_16= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_16=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_16, grammarAccess.getControllingAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalSmartFarming.g:1704:4: ( ( ruleEString ) )
            	    // InternalSmartFarming.g:1705:5: ( ruleEString )
            	    {
            	    // InternalSmartFarming.g:1705:5: ( ruleEString )
            	    // InternalSmartFarming.g:1706:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getControllingRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getControllingAccess().getActuatorsActuatorCrossReference_11_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_18=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_18, grammarAccess.getControllingAccess().getRightSquareBracketKeyword_12());
            		
            otherlv_19=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getControllingAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleControlling"


    // $ANTLR start "entryRuleSensor"
    // InternalSmartFarming.g:1733:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSmartFarming.g:1733:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSmartFarming.g:1734:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSmartFarming.g:1740:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) ) )? (otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) ) )? (otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) ) )? (otherlv_9= 'Type:' ( (lv_Type_10_0= ruleSensorType ) ) )? (otherlv_11= 'State:' ( (lv_State_12_0= ruleSensorState ) ) )? (otherlv_13= 'Unit:' ( (lv_Unit_14_0= ruleEString ) ) )? otherlv_15= 'Value:' ( (lv_Value_16_0= ruleEFloat ) ) otherlv_17= 'Protocol:' ( ( ruleEString ) ) otherlv_19= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_DeviceID_4_0 = null;

        AntlrDatatypeRuleToken lv_IPAddress_6_0 = null;

        AntlrDatatypeRuleToken lv_Manufacturer_8_0 = null;

        Enumerator lv_Type_10_0 = null;

        Enumerator lv_State_12_0 = null;

        AntlrDatatypeRuleToken lv_Unit_14_0 = null;

        AntlrDatatypeRuleToken lv_Value_16_0 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:1746:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) ) )? (otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) ) )? (otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) ) )? (otherlv_9= 'Type:' ( (lv_Type_10_0= ruleSensorType ) ) )? (otherlv_11= 'State:' ( (lv_State_12_0= ruleSensorState ) ) )? (otherlv_13= 'Unit:' ( (lv_Unit_14_0= ruleEString ) ) )? otherlv_15= 'Value:' ( (lv_Value_16_0= ruleEFloat ) ) otherlv_17= 'Protocol:' ( ( ruleEString ) ) otherlv_19= '}' ) )
            // InternalSmartFarming.g:1747:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) ) )? (otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) ) )? (otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) ) )? (otherlv_9= 'Type:' ( (lv_Type_10_0= ruleSensorType ) ) )? (otherlv_11= 'State:' ( (lv_State_12_0= ruleSensorState ) ) )? (otherlv_13= 'Unit:' ( (lv_Unit_14_0= ruleEString ) ) )? otherlv_15= 'Value:' ( (lv_Value_16_0= ruleEFloat ) ) otherlv_17= 'Protocol:' ( ( ruleEString ) ) otherlv_19= '}' )
            {
            // InternalSmartFarming.g:1747:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) ) )? (otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) ) )? (otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) ) )? (otherlv_9= 'Type:' ( (lv_Type_10_0= ruleSensorType ) ) )? (otherlv_11= 'State:' ( (lv_State_12_0= ruleSensorState ) ) )? (otherlv_13= 'Unit:' ( (lv_Unit_14_0= ruleEString ) ) )? otherlv_15= 'Value:' ( (lv_Value_16_0= ruleEFloat ) ) otherlv_17= 'Protocol:' ( ( ruleEString ) ) otherlv_19= '}' )
            // InternalSmartFarming.g:1748:3: otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) ) )? (otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) ) )? (otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) ) )? (otherlv_9= 'Type:' ( (lv_Type_10_0= ruleSensorType ) ) )? (otherlv_11= 'State:' ( (lv_State_12_0= ruleSensorState ) ) )? (otherlv_13= 'Unit:' ( (lv_Unit_14_0= ruleEString ) ) )? otherlv_15= 'Value:' ( (lv_Value_16_0= ruleEFloat ) ) otherlv_17= 'Protocol:' ( ( ruleEString ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalSmartFarming.g:1752:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartFarming.g:1753:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartFarming.g:1753:4: (lv_name_1_0= ruleEString )
            // InternalSmartFarming.g:1754:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.se4gd.smartfarming.SmartFarming.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartFarming.g:1775:3: (otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==57) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSmartFarming.g:1776:4: otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getDeviceIDKeyword_3_0());
                    			
                    // InternalSmartFarming.g:1780:4: ( (lv_DeviceID_4_0= ruleEString ) )
                    // InternalSmartFarming.g:1781:5: (lv_DeviceID_4_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1781:5: (lv_DeviceID_4_0= ruleEString )
                    // InternalSmartFarming.g:1782:6: lv_DeviceID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getDeviceIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_DeviceID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"DeviceID",
                    							lv_DeviceID_4_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1800:3: (otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==58) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSmartFarming.g:1801:4: otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getIPAddressKeyword_4_0());
                    			
                    // InternalSmartFarming.g:1805:4: ( (lv_IPAddress_6_0= ruleEString ) )
                    // InternalSmartFarming.g:1806:5: (lv_IPAddress_6_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1806:5: (lv_IPAddress_6_0= ruleEString )
                    // InternalSmartFarming.g:1807:6: lv_IPAddress_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getIPAddressEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_IPAddress_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"IPAddress",
                    							lv_IPAddress_6_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1825:3: (otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==59) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSmartFarming.g:1826:4: otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getManufacturerKeyword_5_0());
                    			
                    // InternalSmartFarming.g:1830:4: ( (lv_Manufacturer_8_0= ruleEString ) )
                    // InternalSmartFarming.g:1831:5: (lv_Manufacturer_8_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1831:5: (lv_Manufacturer_8_0= ruleEString )
                    // InternalSmartFarming.g:1832:6: lv_Manufacturer_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getManufacturerEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_Manufacturer_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"Manufacturer",
                    							lv_Manufacturer_8_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1850:3: (otherlv_9= 'Type:' ( (lv_Type_10_0= ruleSensorType ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==60) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSmartFarming.g:1851:4: otherlv_9= 'Type:' ( (lv_Type_10_0= ruleSensorType ) )
                    {
                    otherlv_9=(Token)match(input,60,FOLLOW_66); 

                    				newLeafNode(otherlv_9, grammarAccess.getSensorAccess().getTypeKeyword_6_0());
                    			
                    // InternalSmartFarming.g:1855:4: ( (lv_Type_10_0= ruleSensorType ) )
                    // InternalSmartFarming.g:1856:5: (lv_Type_10_0= ruleSensorType )
                    {
                    // InternalSmartFarming.g:1856:5: (lv_Type_10_0= ruleSensorType )
                    // InternalSmartFarming.g:1857:6: lv_Type_10_0= ruleSensorType
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_Type_10_0=ruleSensorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_10_0,
                    							"com.se4gd.smartfarming.SmartFarming.SensorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1875:3: (otherlv_11= 'State:' ( (lv_State_12_0= ruleSensorState ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==61) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSmartFarming.g:1876:4: otherlv_11= 'State:' ( (lv_State_12_0= ruleSensorState ) )
                    {
                    otherlv_11=(Token)match(input,61,FOLLOW_68); 

                    				newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getStateKeyword_7_0());
                    			
                    // InternalSmartFarming.g:1880:4: ( (lv_State_12_0= ruleSensorState ) )
                    // InternalSmartFarming.g:1881:5: (lv_State_12_0= ruleSensorState )
                    {
                    // InternalSmartFarming.g:1881:5: (lv_State_12_0= ruleSensorState )
                    // InternalSmartFarming.g:1882:6: lv_State_12_0= ruleSensorState
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getStateSensorStateEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_State_12_0=ruleSensorState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"State",
                    							lv_State_12_0,
                    							"com.se4gd.smartfarming.SmartFarming.SensorState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:1900:3: (otherlv_13= 'Unit:' ( (lv_Unit_14_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==62) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSmartFarming.g:1901:4: otherlv_13= 'Unit:' ( (lv_Unit_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getSensorAccess().getUnitKeyword_8_0());
                    			
                    // InternalSmartFarming.g:1905:4: ( (lv_Unit_14_0= ruleEString ) )
                    // InternalSmartFarming.g:1906:5: (lv_Unit_14_0= ruleEString )
                    {
                    // InternalSmartFarming.g:1906:5: (lv_Unit_14_0= ruleEString )
                    // InternalSmartFarming.g:1907:6: lv_Unit_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getUnitEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    lv_Unit_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"Unit",
                    							lv_Unit_14_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,63,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getSensorAccess().getValueKeyword_9());
            		
            // InternalSmartFarming.g:1929:3: ( (lv_Value_16_0= ruleEFloat ) )
            // InternalSmartFarming.g:1930:4: (lv_Value_16_0= ruleEFloat )
            {
            // InternalSmartFarming.g:1930:4: (lv_Value_16_0= ruleEFloat )
            // InternalSmartFarming.g:1931:5: lv_Value_16_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getValueEFloatParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_71);
            lv_Value_16_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"Value",
            						lv_Value_16_0,
            						"com.se4gd.smartfarming.SmartFarming.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getSensorAccess().getProtocolKeyword_11());
            		
            // InternalSmartFarming.g:1952:3: ( ( ruleEString ) )
            // InternalSmartFarming.g:1953:4: ( ruleEString )
            {
            // InternalSmartFarming.g:1953:4: ( ruleEString )
            // InternalSmartFarming.g:1954:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSensorAccess().getProtocolCommunicationProtocolCrossReference_12_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleCommunicationProtocol"
    // InternalSmartFarming.g:1976:1: entryRuleCommunicationProtocol returns [EObject current=null] : iv_ruleCommunicationProtocol= ruleCommunicationProtocol EOF ;
    public final EObject entryRuleCommunicationProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationProtocol = null;


        try {
            // InternalSmartFarming.g:1976:62: (iv_ruleCommunicationProtocol= ruleCommunicationProtocol EOF )
            // InternalSmartFarming.g:1977:2: iv_ruleCommunicationProtocol= ruleCommunicationProtocol EOF
            {
             newCompositeNode(grammarAccess.getCommunicationProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunicationProtocol=ruleCommunicationProtocol();

            state._fsp--;

             current =iv_ruleCommunicationProtocol; 
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
    // $ANTLR end "entryRuleCommunicationProtocol"


    // $ANTLR start "ruleCommunicationProtocol"
    // InternalSmartFarming.g:1983:1: ruleCommunicationProtocol returns [EObject current=null] : ( () otherlv_1= 'CommunicationProtocol' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type:' ( (lv_Type_5_0= ruleCommunicationType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleCommunicationProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_Type_5_0 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:1989:2: ( ( () otherlv_1= 'CommunicationProtocol' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type:' ( (lv_Type_5_0= ruleCommunicationType ) ) )? otherlv_6= '}' ) )
            // InternalSmartFarming.g:1990:2: ( () otherlv_1= 'CommunicationProtocol' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type:' ( (lv_Type_5_0= ruleCommunicationType ) ) )? otherlv_6= '}' )
            {
            // InternalSmartFarming.g:1990:2: ( () otherlv_1= 'CommunicationProtocol' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type:' ( (lv_Type_5_0= ruleCommunicationType ) ) )? otherlv_6= '}' )
            // InternalSmartFarming.g:1991:3: () otherlv_1= 'CommunicationProtocol' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type:' ( (lv_Type_5_0= ruleCommunicationType ) ) )? otherlv_6= '}'
            {
            // InternalSmartFarming.g:1991:3: ()
            // InternalSmartFarming.g:1992:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommunicationProtocolAccess().getCommunicationProtocolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCommunicationProtocolAccess().getCommunicationProtocolKeyword_1());
            		
            // InternalSmartFarming.g:2002:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartFarming.g:2003:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartFarming.g:2003:4: (lv_name_2_0= ruleEString )
            // InternalSmartFarming.g:2004:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommunicationProtocolAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommunicationProtocolRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.se4gd.smartfarming.SmartFarming.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_72); 

            			newLeafNode(otherlv_3, grammarAccess.getCommunicationProtocolAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmartFarming.g:2025:3: (otherlv_4= 'Type:' ( (lv_Type_5_0= ruleCommunicationType ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==60) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSmartFarming.g:2026:4: otherlv_4= 'Type:' ( (lv_Type_5_0= ruleCommunicationType ) )
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_73); 

                    				newLeafNode(otherlv_4, grammarAccess.getCommunicationProtocolAccess().getTypeKeyword_4_0());
                    			
                    // InternalSmartFarming.g:2030:4: ( (lv_Type_5_0= ruleCommunicationType ) )
                    // InternalSmartFarming.g:2031:5: (lv_Type_5_0= ruleCommunicationType )
                    {
                    // InternalSmartFarming.g:2031:5: (lv_Type_5_0= ruleCommunicationType )
                    // InternalSmartFarming.g:2032:6: lv_Type_5_0= ruleCommunicationType
                    {

                    						newCompositeNode(grammarAccess.getCommunicationProtocolAccess().getTypeCommunicationTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_Type_5_0=ruleCommunicationType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommunicationProtocolRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_5_0,
                    							"com.se4gd.smartfarming.SmartFarming.CommunicationType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCommunicationProtocolAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCommunicationProtocol"


    // $ANTLR start "entryRuleActuator"
    // InternalSmartFarming.g:2058:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalSmartFarming.g:2058:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalSmartFarming.g:2059:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalSmartFarming.g:2065:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) ) )? (otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) ) )? (otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) ) )? (otherlv_9= 'Type:' ( (lv_Type_10_0= ruleActuatorType ) ) )? otherlv_11= 'Protocol:' ( ( ruleEString ) ) otherlv_13= '}' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_DeviceID_4_0 = null;

        AntlrDatatypeRuleToken lv_IPAddress_6_0 = null;

        AntlrDatatypeRuleToken lv_Manufacturer_8_0 = null;

        Enumerator lv_Type_10_0 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:2071:2: ( (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) ) )? (otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) ) )? (otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) ) )? (otherlv_9= 'Type:' ( (lv_Type_10_0= ruleActuatorType ) ) )? otherlv_11= 'Protocol:' ( ( ruleEString ) ) otherlv_13= '}' ) )
            // InternalSmartFarming.g:2072:2: (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) ) )? (otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) ) )? (otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) ) )? (otherlv_9= 'Type:' ( (lv_Type_10_0= ruleActuatorType ) ) )? otherlv_11= 'Protocol:' ( ( ruleEString ) ) otherlv_13= '}' )
            {
            // InternalSmartFarming.g:2072:2: (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) ) )? (otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) ) )? (otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) ) )? (otherlv_9= 'Type:' ( (lv_Type_10_0= ruleActuatorType ) ) )? otherlv_11= 'Protocol:' ( ( ruleEString ) ) otherlv_13= '}' )
            // InternalSmartFarming.g:2073:3: otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) ) )? (otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) ) )? (otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) ) )? (otherlv_9= 'Type:' ( (lv_Type_10_0= ruleActuatorType ) ) )? otherlv_11= 'Protocol:' ( ( ruleEString ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
            		
            // InternalSmartFarming.g:2077:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartFarming.g:2078:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartFarming.g:2078:4: (lv_name_1_0= ruleEString )
            // InternalSmartFarming.g:2079:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.se4gd.smartfarming.SmartFarming.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartFarming.g:2100:3: (otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==57) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSmartFarming.g:2101:4: otherlv_3= 'DeviceID:' ( (lv_DeviceID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getDeviceIDKeyword_3_0());
                    			
                    // InternalSmartFarming.g:2105:4: ( (lv_DeviceID_4_0= ruleEString ) )
                    // InternalSmartFarming.g:2106:5: (lv_DeviceID_4_0= ruleEString )
                    {
                    // InternalSmartFarming.g:2106:5: (lv_DeviceID_4_0= ruleEString )
                    // InternalSmartFarming.g:2107:6: lv_DeviceID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getDeviceIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_DeviceID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"DeviceID",
                    							lv_DeviceID_4_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:2125:3: (otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSmartFarming.g:2126:4: otherlv_5= 'IPAddress:' ( (lv_IPAddress_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getActuatorAccess().getIPAddressKeyword_4_0());
                    			
                    // InternalSmartFarming.g:2130:4: ( (lv_IPAddress_6_0= ruleEString ) )
                    // InternalSmartFarming.g:2131:5: (lv_IPAddress_6_0= ruleEString )
                    {
                    // InternalSmartFarming.g:2131:5: (lv_IPAddress_6_0= ruleEString )
                    // InternalSmartFarming.g:2132:6: lv_IPAddress_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getIPAddressEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_IPAddress_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"IPAddress",
                    							lv_IPAddress_6_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:2150:3: (otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==59) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSmartFarming.g:2151:4: otherlv_7= 'Manufacturer:' ( (lv_Manufacturer_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getActuatorAccess().getManufacturerKeyword_5_0());
                    			
                    // InternalSmartFarming.g:2155:4: ( (lv_Manufacturer_8_0= ruleEString ) )
                    // InternalSmartFarming.g:2156:5: (lv_Manufacturer_8_0= ruleEString )
                    {
                    // InternalSmartFarming.g:2156:5: (lv_Manufacturer_8_0= ruleEString )
                    // InternalSmartFarming.g:2157:6: lv_Manufacturer_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getManufacturerEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_77);
                    lv_Manufacturer_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"Manufacturer",
                    							lv_Manufacturer_8_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:2175:3: (otherlv_9= 'Type:' ( (lv_Type_10_0= ruleActuatorType ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSmartFarming.g:2176:4: otherlv_9= 'Type:' ( (lv_Type_10_0= ruleActuatorType ) )
                    {
                    otherlv_9=(Token)match(input,60,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getActuatorAccess().getTypeKeyword_6_0());
                    			
                    // InternalSmartFarming.g:2180:4: ( (lv_Type_10_0= ruleActuatorType ) )
                    // InternalSmartFarming.g:2181:5: (lv_Type_10_0= ruleActuatorType )
                    {
                    // InternalSmartFarming.g:2181:5: (lv_Type_10_0= ruleActuatorType )
                    // InternalSmartFarming.g:2182:6: lv_Type_10_0= ruleActuatorType
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getTypeActuatorTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_Type_10_0=ruleActuatorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_10_0,
                    							"com.se4gd.smartfarming.SmartFarming.ActuatorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getActuatorAccess().getProtocolKeyword_7());
            		
            // InternalSmartFarming.g:2204:3: ( ( ruleEString ) )
            // InternalSmartFarming.g:2205:4: ( ruleEString )
            {
            // InternalSmartFarming.g:2205:4: ( ruleEString )
            // InternalSmartFarming.g:2206:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActuatorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActuatorAccess().getProtocolCommunicationProtocolCrossReference_8_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleGateway"
    // InternalSmartFarming.g:2228:1: entryRuleGateway returns [EObject current=null] : iv_ruleGateway= ruleGateway EOF ;
    public final EObject entryRuleGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateway = null;


        try {
            // InternalSmartFarming.g:2228:48: (iv_ruleGateway= ruleGateway EOF )
            // InternalSmartFarming.g:2229:2: iv_ruleGateway= ruleGateway EOF
            {
             newCompositeNode(grammarAccess.getGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGateway=ruleGateway();

            state._fsp--;

             current =iv_ruleGateway; 
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
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalSmartFarming.g:2235:1: ruleGateway returns [EObject current=null] : (otherlv_0= 'Gateway' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'GatewayID:' ( (lv_GatewayID_4_0= ruleEString ) ) )? (otherlv_5= 'Model:' ( (lv_Model_6_0= ruleEString ) ) )? otherlv_7= 'Devices:' otherlv_8= '[' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ']' otherlv_13= 'Protocols:' otherlv_14= '[' ( (lv_Protocols_15_0= ruleCommunicationProtocol ) ) (otherlv_16= ',' ( (lv_Protocols_17_0= ruleCommunicationProtocol ) ) )* otherlv_18= ']' otherlv_19= '}' ) ;
    public final EObject ruleGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_GatewayID_4_0 = null;

        AntlrDatatypeRuleToken lv_Model_6_0 = null;

        EObject lv_Protocols_15_0 = null;

        EObject lv_Protocols_17_0 = null;



        	enterRule();

        try {
            // InternalSmartFarming.g:2241:2: ( (otherlv_0= 'Gateway' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'GatewayID:' ( (lv_GatewayID_4_0= ruleEString ) ) )? (otherlv_5= 'Model:' ( (lv_Model_6_0= ruleEString ) ) )? otherlv_7= 'Devices:' otherlv_8= '[' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ']' otherlv_13= 'Protocols:' otherlv_14= '[' ( (lv_Protocols_15_0= ruleCommunicationProtocol ) ) (otherlv_16= ',' ( (lv_Protocols_17_0= ruleCommunicationProtocol ) ) )* otherlv_18= ']' otherlv_19= '}' ) )
            // InternalSmartFarming.g:2242:2: (otherlv_0= 'Gateway' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'GatewayID:' ( (lv_GatewayID_4_0= ruleEString ) ) )? (otherlv_5= 'Model:' ( (lv_Model_6_0= ruleEString ) ) )? otherlv_7= 'Devices:' otherlv_8= '[' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ']' otherlv_13= 'Protocols:' otherlv_14= '[' ( (lv_Protocols_15_0= ruleCommunicationProtocol ) ) (otherlv_16= ',' ( (lv_Protocols_17_0= ruleCommunicationProtocol ) ) )* otherlv_18= ']' otherlv_19= '}' )
            {
            // InternalSmartFarming.g:2242:2: (otherlv_0= 'Gateway' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'GatewayID:' ( (lv_GatewayID_4_0= ruleEString ) ) )? (otherlv_5= 'Model:' ( (lv_Model_6_0= ruleEString ) ) )? otherlv_7= 'Devices:' otherlv_8= '[' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ']' otherlv_13= 'Protocols:' otherlv_14= '[' ( (lv_Protocols_15_0= ruleCommunicationProtocol ) ) (otherlv_16= ',' ( (lv_Protocols_17_0= ruleCommunicationProtocol ) ) )* otherlv_18= ']' otherlv_19= '}' )
            // InternalSmartFarming.g:2243:3: otherlv_0= 'Gateway' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'GatewayID:' ( (lv_GatewayID_4_0= ruleEString ) ) )? (otherlv_5= 'Model:' ( (lv_Model_6_0= ruleEString ) ) )? otherlv_7= 'Devices:' otherlv_8= '[' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ']' otherlv_13= 'Protocols:' otherlv_14= '[' ( (lv_Protocols_15_0= ruleCommunicationProtocol ) ) (otherlv_16= ',' ( (lv_Protocols_17_0= ruleCommunicationProtocol ) ) )* otherlv_18= ']' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGatewayAccess().getGatewayKeyword_0());
            		
            // InternalSmartFarming.g:2247:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartFarming.g:2248:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartFarming.g:2248:4: (lv_name_1_0= ruleEString )
            // InternalSmartFarming.g:2249:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGatewayAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGatewayRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.se4gd.smartfarming.SmartFarming.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_78); 

            			newLeafNode(otherlv_2, grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartFarming.g:2270:3: (otherlv_3= 'GatewayID:' ( (lv_GatewayID_4_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==68) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSmartFarming.g:2271:4: otherlv_3= 'GatewayID:' ( (lv_GatewayID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGatewayAccess().getGatewayIDKeyword_3_0());
                    			
                    // InternalSmartFarming.g:2275:4: ( (lv_GatewayID_4_0= ruleEString ) )
                    // InternalSmartFarming.g:2276:5: (lv_GatewayID_4_0= ruleEString )
                    {
                    // InternalSmartFarming.g:2276:5: (lv_GatewayID_4_0= ruleEString )
                    // InternalSmartFarming.g:2277:6: lv_GatewayID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGatewayAccess().getGatewayIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    lv_GatewayID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGatewayRule());
                    						}
                    						set(
                    							current,
                    							"GatewayID",
                    							lv_GatewayID_4_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartFarming.g:2295:3: (otherlv_5= 'Model:' ( (lv_Model_6_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==69) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSmartFarming.g:2296:4: otherlv_5= 'Model:' ( (lv_Model_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,69,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getGatewayAccess().getModelKeyword_4_0());
                    			
                    // InternalSmartFarming.g:2300:4: ( (lv_Model_6_0= ruleEString ) )
                    // InternalSmartFarming.g:2301:5: (lv_Model_6_0= ruleEString )
                    {
                    // InternalSmartFarming.g:2301:5: (lv_Model_6_0= ruleEString )
                    // InternalSmartFarming.g:2302:6: lv_Model_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGatewayAccess().getModelEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_Model_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGatewayRule());
                    						}
                    						set(
                    							current,
                    							"Model",
                    							lv_Model_6_0,
                    							"com.se4gd.smartfarming.SmartFarming.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getGatewayAccess().getDevicesKeyword_5());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getGatewayAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalSmartFarming.g:2328:3: ( ( ruleEString ) )
            // InternalSmartFarming.g:2329:4: ( ruleEString )
            {
            // InternalSmartFarming.g:2329:4: ( ruleEString )
            // InternalSmartFarming.g:2330:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGatewayRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGatewayAccess().getDevicesDeviceCrossReference_7_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartFarming.g:2344:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==18) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalSmartFarming.g:2345:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getGatewayAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalSmartFarming.g:2349:4: ( ( ruleEString ) )
            	    // InternalSmartFarming.g:2350:5: ( ruleEString )
            	    {
            	    // InternalSmartFarming.g:2350:5: ( ruleEString )
            	    // InternalSmartFarming.g:2351:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGatewayRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGatewayAccess().getDevicesDeviceCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_12=(Token)match(input,19,FOLLOW_80); 

            			newLeafNode(otherlv_12, grammarAccess.getGatewayAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_13=(Token)match(input,70,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getGatewayAccess().getProtocolsKeyword_10());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_81); 

            			newLeafNode(otherlv_14, grammarAccess.getGatewayAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalSmartFarming.g:2378:3: ( (lv_Protocols_15_0= ruleCommunicationProtocol ) )
            // InternalSmartFarming.g:2379:4: (lv_Protocols_15_0= ruleCommunicationProtocol )
            {
            // InternalSmartFarming.g:2379:4: (lv_Protocols_15_0= ruleCommunicationProtocol )
            // InternalSmartFarming.g:2380:5: lv_Protocols_15_0= ruleCommunicationProtocol
            {

            					newCompositeNode(grammarAccess.getGatewayAccess().getProtocolsCommunicationProtocolParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_12);
            lv_Protocols_15_0=ruleCommunicationProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGatewayRule());
            					}
            					add(
            						current,
            						"Protocols",
            						lv_Protocols_15_0,
            						"com.se4gd.smartfarming.SmartFarming.CommunicationProtocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartFarming.g:2397:3: (otherlv_16= ',' ( (lv_Protocols_17_0= ruleCommunicationProtocol ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==18) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalSmartFarming.g:2398:4: otherlv_16= ',' ( (lv_Protocols_17_0= ruleCommunicationProtocol ) )
            	    {
            	    otherlv_16=(Token)match(input,18,FOLLOW_81); 

            	    				newLeafNode(otherlv_16, grammarAccess.getGatewayAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalSmartFarming.g:2402:4: ( (lv_Protocols_17_0= ruleCommunicationProtocol ) )
            	    // InternalSmartFarming.g:2403:5: (lv_Protocols_17_0= ruleCommunicationProtocol )
            	    {
            	    // InternalSmartFarming.g:2403:5: (lv_Protocols_17_0= ruleCommunicationProtocol )
            	    // InternalSmartFarming.g:2404:6: lv_Protocols_17_0= ruleCommunicationProtocol
            	    {

            	    						newCompositeNode(grammarAccess.getGatewayAccess().getProtocolsCommunicationProtocolParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_Protocols_17_0=ruleCommunicationProtocol();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGatewayRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Protocols",
            	    							lv_Protocols_17_0,
            	    							"com.se4gd.smartfarming.SmartFarming.CommunicationProtocol");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_18=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_18, grammarAccess.getGatewayAccess().getRightSquareBracketKeyword_14());
            		
            otherlv_19=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleGateway"


    // $ANTLR start "ruleCropGroup"
    // InternalSmartFarming.g:2434:1: ruleCropGroup returns [Enumerator current=null] : ( (enumLiteral_0= 'Vegetable' ) | (enumLiteral_1= 'Fruit' ) | (enumLiteral_2= 'Flower' ) | (enumLiteral_3= 'Tubers' ) ) ;
    public final Enumerator ruleCropGroup() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:2440:2: ( ( (enumLiteral_0= 'Vegetable' ) | (enumLiteral_1= 'Fruit' ) | (enumLiteral_2= 'Flower' ) | (enumLiteral_3= 'Tubers' ) ) )
            // InternalSmartFarming.g:2441:2: ( (enumLiteral_0= 'Vegetable' ) | (enumLiteral_1= 'Fruit' ) | (enumLiteral_2= 'Flower' ) | (enumLiteral_3= 'Tubers' ) )
            {
            // InternalSmartFarming.g:2441:2: ( (enumLiteral_0= 'Vegetable' ) | (enumLiteral_1= 'Fruit' ) | (enumLiteral_2= 'Flower' ) | (enumLiteral_3= 'Tubers' ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt56=1;
                }
                break;
            case 72:
                {
                alt56=2;
                }
                break;
            case 73:
                {
                alt56=3;
                }
                break;
            case 74:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalSmartFarming.g:2442:3: (enumLiteral_0= 'Vegetable' )
                    {
                    // InternalSmartFarming.g:2442:3: (enumLiteral_0= 'Vegetable' )
                    // InternalSmartFarming.g:2443:4: enumLiteral_0= 'Vegetable'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getCropGroupAccess().getVegetableEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCropGroupAccess().getVegetableEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:2450:3: (enumLiteral_1= 'Fruit' )
                    {
                    // InternalSmartFarming.g:2450:3: (enumLiteral_1= 'Fruit' )
                    // InternalSmartFarming.g:2451:4: enumLiteral_1= 'Fruit'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getCropGroupAccess().getFruitEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCropGroupAccess().getFruitEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartFarming.g:2458:3: (enumLiteral_2= 'Flower' )
                    {
                    // InternalSmartFarming.g:2458:3: (enumLiteral_2= 'Flower' )
                    // InternalSmartFarming.g:2459:4: enumLiteral_2= 'Flower'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getCropGroupAccess().getFlowerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCropGroupAccess().getFlowerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartFarming.g:2466:3: (enumLiteral_3= 'Tubers' )
                    {
                    // InternalSmartFarming.g:2466:3: (enumLiteral_3= 'Tubers' )
                    // InternalSmartFarming.g:2467:4: enumLiteral_3= 'Tubers'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getCropGroupAccess().getTubersEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCropGroupAccess().getTubersEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleCropGroup"


    // $ANTLR start "ruleAnalyticsType"
    // InternalSmartFarming.g:2477:1: ruleAnalyticsType returns [Enumerator current=null] : ( (enumLiteral_0= 'Harvesting' ) | (enumLiteral_1= 'Seeding' ) | (enumLiteral_2= 'Resource' ) ) ;
    public final Enumerator ruleAnalyticsType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:2483:2: ( ( (enumLiteral_0= 'Harvesting' ) | (enumLiteral_1= 'Seeding' ) | (enumLiteral_2= 'Resource' ) ) )
            // InternalSmartFarming.g:2484:2: ( (enumLiteral_0= 'Harvesting' ) | (enumLiteral_1= 'Seeding' ) | (enumLiteral_2= 'Resource' ) )
            {
            // InternalSmartFarming.g:2484:2: ( (enumLiteral_0= 'Harvesting' ) | (enumLiteral_1= 'Seeding' ) | (enumLiteral_2= 'Resource' ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt57=1;
                }
                break;
            case 76:
                {
                alt57=2;
                }
                break;
            case 77:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalSmartFarming.g:2485:3: (enumLiteral_0= 'Harvesting' )
                    {
                    // InternalSmartFarming.g:2485:3: (enumLiteral_0= 'Harvesting' )
                    // InternalSmartFarming.g:2486:4: enumLiteral_0= 'Harvesting'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getAnalyticsTypeAccess().getHarvestingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAnalyticsTypeAccess().getHarvestingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:2493:3: (enumLiteral_1= 'Seeding' )
                    {
                    // InternalSmartFarming.g:2493:3: (enumLiteral_1= 'Seeding' )
                    // InternalSmartFarming.g:2494:4: enumLiteral_1= 'Seeding'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getAnalyticsTypeAccess().getSeedingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAnalyticsTypeAccess().getSeedingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartFarming.g:2501:3: (enumLiteral_2= 'Resource' )
                    {
                    // InternalSmartFarming.g:2501:3: (enumLiteral_2= 'Resource' )
                    // InternalSmartFarming.g:2502:4: enumLiteral_2= 'Resource'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getAnalyticsTypeAccess().getResourceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAnalyticsTypeAccess().getResourceEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleAnalyticsType"


    // $ANTLR start "ruleOutputType"
    // InternalSmartFarming.g:2512:1: ruleOutputType returns [Enumerator current=null] : ( (enumLiteral_0= 'LineGraph' ) | (enumLiteral_1= 'PieChart' ) | (enumLiteral_2= 'BarChart' ) | (enumLiteral_3= 'Tabular' ) ) ;
    public final Enumerator ruleOutputType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:2518:2: ( ( (enumLiteral_0= 'LineGraph' ) | (enumLiteral_1= 'PieChart' ) | (enumLiteral_2= 'BarChart' ) | (enumLiteral_3= 'Tabular' ) ) )
            // InternalSmartFarming.g:2519:2: ( (enumLiteral_0= 'LineGraph' ) | (enumLiteral_1= 'PieChart' ) | (enumLiteral_2= 'BarChart' ) | (enumLiteral_3= 'Tabular' ) )
            {
            // InternalSmartFarming.g:2519:2: ( (enumLiteral_0= 'LineGraph' ) | (enumLiteral_1= 'PieChart' ) | (enumLiteral_2= 'BarChart' ) | (enumLiteral_3= 'Tabular' ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt58=1;
                }
                break;
            case 79:
                {
                alt58=2;
                }
                break;
            case 80:
                {
                alt58=3;
                }
                break;
            case 81:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalSmartFarming.g:2520:3: (enumLiteral_0= 'LineGraph' )
                    {
                    // InternalSmartFarming.g:2520:3: (enumLiteral_0= 'LineGraph' )
                    // InternalSmartFarming.g:2521:4: enumLiteral_0= 'LineGraph'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getOutputTypeAccess().getLineGraphEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOutputTypeAccess().getLineGraphEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:2528:3: (enumLiteral_1= 'PieChart' )
                    {
                    // InternalSmartFarming.g:2528:3: (enumLiteral_1= 'PieChart' )
                    // InternalSmartFarming.g:2529:4: enumLiteral_1= 'PieChart'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getOutputTypeAccess().getPieChartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOutputTypeAccess().getPieChartEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartFarming.g:2536:3: (enumLiteral_2= 'BarChart' )
                    {
                    // InternalSmartFarming.g:2536:3: (enumLiteral_2= 'BarChart' )
                    // InternalSmartFarming.g:2537:4: enumLiteral_2= 'BarChart'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getOutputTypeAccess().getBarChartEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOutputTypeAccess().getBarChartEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartFarming.g:2544:3: (enumLiteral_3= 'Tabular' )
                    {
                    // InternalSmartFarming.g:2544:3: (enumLiteral_3= 'Tabular' )
                    // InternalSmartFarming.g:2545:4: enumLiteral_3= 'Tabular'
                    {
                    enumLiteral_3=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getOutputTypeAccess().getTabularEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOutputTypeAccess().getTabularEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleOutputType"


    // $ANTLR start "ruleMonitoringMetrics"
    // InternalSmartFarming.g:2555:1: ruleMonitoringMetrics returns [Enumerator current=null] : ( (enumLiteral_0= 'Nutrient' ) | (enumLiteral_1= 'PhotoSynthesis' ) | (enumLiteral_2= 'EnvironmentalSafety' ) ) ;
    public final Enumerator ruleMonitoringMetrics() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:2561:2: ( ( (enumLiteral_0= 'Nutrient' ) | (enumLiteral_1= 'PhotoSynthesis' ) | (enumLiteral_2= 'EnvironmentalSafety' ) ) )
            // InternalSmartFarming.g:2562:2: ( (enumLiteral_0= 'Nutrient' ) | (enumLiteral_1= 'PhotoSynthesis' ) | (enumLiteral_2= 'EnvironmentalSafety' ) )
            {
            // InternalSmartFarming.g:2562:2: ( (enumLiteral_0= 'Nutrient' ) | (enumLiteral_1= 'PhotoSynthesis' ) | (enumLiteral_2= 'EnvironmentalSafety' ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt59=1;
                }
                break;
            case 83:
                {
                alt59=2;
                }
                break;
            case 84:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalSmartFarming.g:2563:3: (enumLiteral_0= 'Nutrient' )
                    {
                    // InternalSmartFarming.g:2563:3: (enumLiteral_0= 'Nutrient' )
                    // InternalSmartFarming.g:2564:4: enumLiteral_0= 'Nutrient'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getMonitoringMetricsAccess().getNutrientEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMonitoringMetricsAccess().getNutrientEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:2571:3: (enumLiteral_1= 'PhotoSynthesis' )
                    {
                    // InternalSmartFarming.g:2571:3: (enumLiteral_1= 'PhotoSynthesis' )
                    // InternalSmartFarming.g:2572:4: enumLiteral_1= 'PhotoSynthesis'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getMonitoringMetricsAccess().getPhotoSynthesisEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMonitoringMetricsAccess().getPhotoSynthesisEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartFarming.g:2579:3: (enumLiteral_2= 'EnvironmentalSafety' )
                    {
                    // InternalSmartFarming.g:2579:3: (enumLiteral_2= 'EnvironmentalSafety' )
                    // InternalSmartFarming.g:2580:4: enumLiteral_2= 'EnvironmentalSafety'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getMonitoringMetricsAccess().getEnvironmentalSafetyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMonitoringMetricsAccess().getEnvironmentalSafetyEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleMonitoringMetrics"


    // $ANTLR start "ruleSensorType"
    // InternalSmartFarming.g:2590:1: ruleSensorType returns [Enumerator current=null] : ( (enumLiteral_0= 'Temperature' ) | (enumLiteral_1= 'Humidity' ) | (enumLiteral_2= 'CO2' ) | (enumLiteral_3= 'Oxygen' ) | (enumLiteral_4= 'PH' ) | (enumLiteral_5= 'EC' ) | (enumLiteral_6= 'LEDLight' ) | (enumLiteral_7= 'Surveillance' ) ) ;
    public final Enumerator ruleSensorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:2596:2: ( ( (enumLiteral_0= 'Temperature' ) | (enumLiteral_1= 'Humidity' ) | (enumLiteral_2= 'CO2' ) | (enumLiteral_3= 'Oxygen' ) | (enumLiteral_4= 'PH' ) | (enumLiteral_5= 'EC' ) | (enumLiteral_6= 'LEDLight' ) | (enumLiteral_7= 'Surveillance' ) ) )
            // InternalSmartFarming.g:2597:2: ( (enumLiteral_0= 'Temperature' ) | (enumLiteral_1= 'Humidity' ) | (enumLiteral_2= 'CO2' ) | (enumLiteral_3= 'Oxygen' ) | (enumLiteral_4= 'PH' ) | (enumLiteral_5= 'EC' ) | (enumLiteral_6= 'LEDLight' ) | (enumLiteral_7= 'Surveillance' ) )
            {
            // InternalSmartFarming.g:2597:2: ( (enumLiteral_0= 'Temperature' ) | (enumLiteral_1= 'Humidity' ) | (enumLiteral_2= 'CO2' ) | (enumLiteral_3= 'Oxygen' ) | (enumLiteral_4= 'PH' ) | (enumLiteral_5= 'EC' ) | (enumLiteral_6= 'LEDLight' ) | (enumLiteral_7= 'Surveillance' ) )
            int alt60=8;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt60=1;
                }
                break;
            case 86:
                {
                alt60=2;
                }
                break;
            case 87:
                {
                alt60=3;
                }
                break;
            case 88:
                {
                alt60=4;
                }
                break;
            case 89:
                {
                alt60=5;
                }
                break;
            case 90:
                {
                alt60=6;
                }
                break;
            case 91:
                {
                alt60=7;
                }
                break;
            case 92:
                {
                alt60=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalSmartFarming.g:2598:3: (enumLiteral_0= 'Temperature' )
                    {
                    // InternalSmartFarming.g:2598:3: (enumLiteral_0= 'Temperature' )
                    // InternalSmartFarming.g:2599:4: enumLiteral_0= 'Temperature'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTemperatureEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getTemperatureEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:2606:3: (enumLiteral_1= 'Humidity' )
                    {
                    // InternalSmartFarming.g:2606:3: (enumLiteral_1= 'Humidity' )
                    // InternalSmartFarming.g:2607:4: enumLiteral_1= 'Humidity'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getHumidityEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getHumidityEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartFarming.g:2614:3: (enumLiteral_2= 'CO2' )
                    {
                    // InternalSmartFarming.g:2614:3: (enumLiteral_2= 'CO2' )
                    // InternalSmartFarming.g:2615:4: enumLiteral_2= 'CO2'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getCO2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getCO2EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartFarming.g:2622:3: (enumLiteral_3= 'Oxygen' )
                    {
                    // InternalSmartFarming.g:2622:3: (enumLiteral_3= 'Oxygen' )
                    // InternalSmartFarming.g:2623:4: enumLiteral_3= 'Oxygen'
                    {
                    enumLiteral_3=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getOxygenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSensorTypeAccess().getOxygenEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartFarming.g:2630:3: (enumLiteral_4= 'PH' )
                    {
                    // InternalSmartFarming.g:2630:3: (enumLiteral_4= 'PH' )
                    // InternalSmartFarming.g:2631:4: enumLiteral_4= 'PH'
                    {
                    enumLiteral_4=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPHEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSensorTypeAccess().getPHEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartFarming.g:2638:3: (enumLiteral_5= 'EC' )
                    {
                    // InternalSmartFarming.g:2638:3: (enumLiteral_5= 'EC' )
                    // InternalSmartFarming.g:2639:4: enumLiteral_5= 'EC'
                    {
                    enumLiteral_5=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getECEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSensorTypeAccess().getECEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartFarming.g:2646:3: (enumLiteral_6= 'LEDLight' )
                    {
                    // InternalSmartFarming.g:2646:3: (enumLiteral_6= 'LEDLight' )
                    // InternalSmartFarming.g:2647:4: enumLiteral_6= 'LEDLight'
                    {
                    enumLiteral_6=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getLEDLightEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSensorTypeAccess().getLEDLightEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSmartFarming.g:2654:3: (enumLiteral_7= 'Surveillance' )
                    {
                    // InternalSmartFarming.g:2654:3: (enumLiteral_7= 'Surveillance' )
                    // InternalSmartFarming.g:2655:4: enumLiteral_7= 'Surveillance'
                    {
                    enumLiteral_7=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getSurveillanceEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSensorTypeAccess().getSurveillanceEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "ruleSensorState"
    // InternalSmartFarming.g:2665:1: ruleSensorState returns [Enumerator current=null] : ( (enumLiteral_0= 'Active' ) | (enumLiteral_1= 'Passive' ) ) ;
    public final Enumerator ruleSensorState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:2671:2: ( ( (enumLiteral_0= 'Active' ) | (enumLiteral_1= 'Passive' ) ) )
            // InternalSmartFarming.g:2672:2: ( (enumLiteral_0= 'Active' ) | (enumLiteral_1= 'Passive' ) )
            {
            // InternalSmartFarming.g:2672:2: ( (enumLiteral_0= 'Active' ) | (enumLiteral_1= 'Passive' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==93) ) {
                alt61=1;
            }
            else if ( (LA61_0==94) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalSmartFarming.g:2673:3: (enumLiteral_0= 'Active' )
                    {
                    // InternalSmartFarming.g:2673:3: (enumLiteral_0= 'Active' )
                    // InternalSmartFarming.g:2674:4: enumLiteral_0= 'Active'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getSensorStateAccess().getActiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorStateAccess().getActiveEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:2681:3: (enumLiteral_1= 'Passive' )
                    {
                    // InternalSmartFarming.g:2681:3: (enumLiteral_1= 'Passive' )
                    // InternalSmartFarming.g:2682:4: enumLiteral_1= 'Passive'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getSensorStateAccess().getPassiveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorStateAccess().getPassiveEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSensorState"


    // $ANTLR start "ruleCommunicationType"
    // InternalSmartFarming.g:2692:1: ruleCommunicationType returns [Enumerator current=null] : ( (enumLiteral_0= 'ZigBee' ) | (enumLiteral_1= 'MQTT' ) | (enumLiteral_2= 'COAP' ) | (enumLiteral_3= 'HTTP' ) | (enumLiteral_4= 'WIFI' ) | (enumLiteral_5= 'Bluetooth' ) | (enumLiteral_6= 'ZWave' ) ) ;
    public final Enumerator ruleCommunicationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:2698:2: ( ( (enumLiteral_0= 'ZigBee' ) | (enumLiteral_1= 'MQTT' ) | (enumLiteral_2= 'COAP' ) | (enumLiteral_3= 'HTTP' ) | (enumLiteral_4= 'WIFI' ) | (enumLiteral_5= 'Bluetooth' ) | (enumLiteral_6= 'ZWave' ) ) )
            // InternalSmartFarming.g:2699:2: ( (enumLiteral_0= 'ZigBee' ) | (enumLiteral_1= 'MQTT' ) | (enumLiteral_2= 'COAP' ) | (enumLiteral_3= 'HTTP' ) | (enumLiteral_4= 'WIFI' ) | (enumLiteral_5= 'Bluetooth' ) | (enumLiteral_6= 'ZWave' ) )
            {
            // InternalSmartFarming.g:2699:2: ( (enumLiteral_0= 'ZigBee' ) | (enumLiteral_1= 'MQTT' ) | (enumLiteral_2= 'COAP' ) | (enumLiteral_3= 'HTTP' ) | (enumLiteral_4= 'WIFI' ) | (enumLiteral_5= 'Bluetooth' ) | (enumLiteral_6= 'ZWave' ) )
            int alt62=7;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt62=1;
                }
                break;
            case 96:
                {
                alt62=2;
                }
                break;
            case 97:
                {
                alt62=3;
                }
                break;
            case 98:
                {
                alt62=4;
                }
                break;
            case 99:
                {
                alt62=5;
                }
                break;
            case 100:
                {
                alt62=6;
                }
                break;
            case 101:
                {
                alt62=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalSmartFarming.g:2700:3: (enumLiteral_0= 'ZigBee' )
                    {
                    // InternalSmartFarming.g:2700:3: (enumLiteral_0= 'ZigBee' )
                    // InternalSmartFarming.g:2701:4: enumLiteral_0= 'ZigBee'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getCommunicationTypeAccess().getZigBeeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCommunicationTypeAccess().getZigBeeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:2708:3: (enumLiteral_1= 'MQTT' )
                    {
                    // InternalSmartFarming.g:2708:3: (enumLiteral_1= 'MQTT' )
                    // InternalSmartFarming.g:2709:4: enumLiteral_1= 'MQTT'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getCommunicationTypeAccess().getMQTTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCommunicationTypeAccess().getMQTTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartFarming.g:2716:3: (enumLiteral_2= 'COAP' )
                    {
                    // InternalSmartFarming.g:2716:3: (enumLiteral_2= 'COAP' )
                    // InternalSmartFarming.g:2717:4: enumLiteral_2= 'COAP'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getCommunicationTypeAccess().getCOAPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCommunicationTypeAccess().getCOAPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartFarming.g:2724:3: (enumLiteral_3= 'HTTP' )
                    {
                    // InternalSmartFarming.g:2724:3: (enumLiteral_3= 'HTTP' )
                    // InternalSmartFarming.g:2725:4: enumLiteral_3= 'HTTP'
                    {
                    enumLiteral_3=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getCommunicationTypeAccess().getHTTPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCommunicationTypeAccess().getHTTPEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartFarming.g:2732:3: (enumLiteral_4= 'WIFI' )
                    {
                    // InternalSmartFarming.g:2732:3: (enumLiteral_4= 'WIFI' )
                    // InternalSmartFarming.g:2733:4: enumLiteral_4= 'WIFI'
                    {
                    enumLiteral_4=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getCommunicationTypeAccess().getWIFIEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCommunicationTypeAccess().getWIFIEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartFarming.g:2740:3: (enumLiteral_5= 'Bluetooth' )
                    {
                    // InternalSmartFarming.g:2740:3: (enumLiteral_5= 'Bluetooth' )
                    // InternalSmartFarming.g:2741:4: enumLiteral_5= 'Bluetooth'
                    {
                    enumLiteral_5=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getCommunicationTypeAccess().getBluetoothEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCommunicationTypeAccess().getBluetoothEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartFarming.g:2748:3: (enumLiteral_6= 'ZWave' )
                    {
                    // InternalSmartFarming.g:2748:3: (enumLiteral_6= 'ZWave' )
                    // InternalSmartFarming.g:2749:4: enumLiteral_6= 'ZWave'
                    {
                    enumLiteral_6=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getCommunicationTypeAccess().getZWaveEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getCommunicationTypeAccess().getZWaveEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleCommunicationType"


    // $ANTLR start "ruleControlType"
    // InternalSmartFarming.g:2759:1: ruleControlType returns [Enumerator current=null] : ( (enumLiteral_0= 'AirConditioner' ) | (enumLiteral_1= 'NutrientController' ) | (enumLiteral_2= 'LEDController' ) | (enumLiteral_3= 'OxygenController' ) | (enumLiteral_4= 'CO2Controller' ) ) ;
    public final Enumerator ruleControlType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:2765:2: ( ( (enumLiteral_0= 'AirConditioner' ) | (enumLiteral_1= 'NutrientController' ) | (enumLiteral_2= 'LEDController' ) | (enumLiteral_3= 'OxygenController' ) | (enumLiteral_4= 'CO2Controller' ) ) )
            // InternalSmartFarming.g:2766:2: ( (enumLiteral_0= 'AirConditioner' ) | (enumLiteral_1= 'NutrientController' ) | (enumLiteral_2= 'LEDController' ) | (enumLiteral_3= 'OxygenController' ) | (enumLiteral_4= 'CO2Controller' ) )
            {
            // InternalSmartFarming.g:2766:2: ( (enumLiteral_0= 'AirConditioner' ) | (enumLiteral_1= 'NutrientController' ) | (enumLiteral_2= 'LEDController' ) | (enumLiteral_3= 'OxygenController' ) | (enumLiteral_4= 'CO2Controller' ) )
            int alt63=5;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt63=1;
                }
                break;
            case 103:
                {
                alt63=2;
                }
                break;
            case 104:
                {
                alt63=3;
                }
                break;
            case 105:
                {
                alt63=4;
                }
                break;
            case 106:
                {
                alt63=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalSmartFarming.g:2767:3: (enumLiteral_0= 'AirConditioner' )
                    {
                    // InternalSmartFarming.g:2767:3: (enumLiteral_0= 'AirConditioner' )
                    // InternalSmartFarming.g:2768:4: enumLiteral_0= 'AirConditioner'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getControlTypeAccess().getAirConditionerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getControlTypeAccess().getAirConditionerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:2775:3: (enumLiteral_1= 'NutrientController' )
                    {
                    // InternalSmartFarming.g:2775:3: (enumLiteral_1= 'NutrientController' )
                    // InternalSmartFarming.g:2776:4: enumLiteral_1= 'NutrientController'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getControlTypeAccess().getNutrientControllerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getControlTypeAccess().getNutrientControllerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartFarming.g:2783:3: (enumLiteral_2= 'LEDController' )
                    {
                    // InternalSmartFarming.g:2783:3: (enumLiteral_2= 'LEDController' )
                    // InternalSmartFarming.g:2784:4: enumLiteral_2= 'LEDController'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getControlTypeAccess().getLEDControllerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getControlTypeAccess().getLEDControllerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartFarming.g:2791:3: (enumLiteral_3= 'OxygenController' )
                    {
                    // InternalSmartFarming.g:2791:3: (enumLiteral_3= 'OxygenController' )
                    // InternalSmartFarming.g:2792:4: enumLiteral_3= 'OxygenController'
                    {
                    enumLiteral_3=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getControlTypeAccess().getOxygenControllerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getControlTypeAccess().getOxygenControllerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartFarming.g:2799:3: (enumLiteral_4= 'CO2Controller' )
                    {
                    // InternalSmartFarming.g:2799:3: (enumLiteral_4= 'CO2Controller' )
                    // InternalSmartFarming.g:2800:4: enumLiteral_4= 'CO2Controller'
                    {
                    enumLiteral_4=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getControlTypeAccess().getCO2ControllerEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getControlTypeAccess().getCO2ControllerEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleControlType"


    // $ANTLR start "ruleControllerAction"
    // InternalSmartFarming.g:2810:1: ruleControllerAction returns [Enumerator current=null] : ( (enumLiteral_0= 'Increase' ) | (enumLiteral_1= 'Decrease' ) | (enumLiteral_2= 'ON' ) | (enumLiteral_3= 'OFF' ) | (enumLiteral_4= 'Alert' ) ) ;
    public final Enumerator ruleControllerAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:2816:2: ( ( (enumLiteral_0= 'Increase' ) | (enumLiteral_1= 'Decrease' ) | (enumLiteral_2= 'ON' ) | (enumLiteral_3= 'OFF' ) | (enumLiteral_4= 'Alert' ) ) )
            // InternalSmartFarming.g:2817:2: ( (enumLiteral_0= 'Increase' ) | (enumLiteral_1= 'Decrease' ) | (enumLiteral_2= 'ON' ) | (enumLiteral_3= 'OFF' ) | (enumLiteral_4= 'Alert' ) )
            {
            // InternalSmartFarming.g:2817:2: ( (enumLiteral_0= 'Increase' ) | (enumLiteral_1= 'Decrease' ) | (enumLiteral_2= 'ON' ) | (enumLiteral_3= 'OFF' ) | (enumLiteral_4= 'Alert' ) )
            int alt64=5;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt64=1;
                }
                break;
            case 108:
                {
                alt64=2;
                }
                break;
            case 109:
                {
                alt64=3;
                }
                break;
            case 110:
                {
                alt64=4;
                }
                break;
            case 111:
                {
                alt64=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalSmartFarming.g:2818:3: (enumLiteral_0= 'Increase' )
                    {
                    // InternalSmartFarming.g:2818:3: (enumLiteral_0= 'Increase' )
                    // InternalSmartFarming.g:2819:4: enumLiteral_0= 'Increase'
                    {
                    enumLiteral_0=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getControllerActionAccess().getIncreaseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getControllerActionAccess().getIncreaseEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:2826:3: (enumLiteral_1= 'Decrease' )
                    {
                    // InternalSmartFarming.g:2826:3: (enumLiteral_1= 'Decrease' )
                    // InternalSmartFarming.g:2827:4: enumLiteral_1= 'Decrease'
                    {
                    enumLiteral_1=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getControllerActionAccess().getDecreaseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getControllerActionAccess().getDecreaseEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartFarming.g:2834:3: (enumLiteral_2= 'ON' )
                    {
                    // InternalSmartFarming.g:2834:3: (enumLiteral_2= 'ON' )
                    // InternalSmartFarming.g:2835:4: enumLiteral_2= 'ON'
                    {
                    enumLiteral_2=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getControllerActionAccess().getONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getControllerActionAccess().getONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartFarming.g:2842:3: (enumLiteral_3= 'OFF' )
                    {
                    // InternalSmartFarming.g:2842:3: (enumLiteral_3= 'OFF' )
                    // InternalSmartFarming.g:2843:4: enumLiteral_3= 'OFF'
                    {
                    enumLiteral_3=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getControllerActionAccess().getOFFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getControllerActionAccess().getOFFEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartFarming.g:2850:3: (enumLiteral_4= 'Alert' )
                    {
                    // InternalSmartFarming.g:2850:3: (enumLiteral_4= 'Alert' )
                    // InternalSmartFarming.g:2851:4: enumLiteral_4= 'Alert'
                    {
                    enumLiteral_4=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getControllerActionAccess().getAlertEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getControllerActionAccess().getAlertEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleControllerAction"


    // $ANTLR start "ruleActuatorType"
    // InternalSmartFarming.g:2861:1: ruleActuatorType returns [Enumerator current=null] : ( (enumLiteral_0= 'AirConditioner' ) | (enumLiteral_1= 'NutrientController' ) | (enumLiteral_2= 'LEDController' ) | (enumLiteral_3= 'OxygenController' ) | (enumLiteral_4= 'CO2Controller' ) ) ;
    public final Enumerator ruleActuatorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSmartFarming.g:2867:2: ( ( (enumLiteral_0= 'AirConditioner' ) | (enumLiteral_1= 'NutrientController' ) | (enumLiteral_2= 'LEDController' ) | (enumLiteral_3= 'OxygenController' ) | (enumLiteral_4= 'CO2Controller' ) ) )
            // InternalSmartFarming.g:2868:2: ( (enumLiteral_0= 'AirConditioner' ) | (enumLiteral_1= 'NutrientController' ) | (enumLiteral_2= 'LEDController' ) | (enumLiteral_3= 'OxygenController' ) | (enumLiteral_4= 'CO2Controller' ) )
            {
            // InternalSmartFarming.g:2868:2: ( (enumLiteral_0= 'AirConditioner' ) | (enumLiteral_1= 'NutrientController' ) | (enumLiteral_2= 'LEDController' ) | (enumLiteral_3= 'OxygenController' ) | (enumLiteral_4= 'CO2Controller' ) )
            int alt65=5;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt65=1;
                }
                break;
            case 103:
                {
                alt65=2;
                }
                break;
            case 104:
                {
                alt65=3;
                }
                break;
            case 105:
                {
                alt65=4;
                }
                break;
            case 106:
                {
                alt65=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalSmartFarming.g:2869:3: (enumLiteral_0= 'AirConditioner' )
                    {
                    // InternalSmartFarming.g:2869:3: (enumLiteral_0= 'AirConditioner' )
                    // InternalSmartFarming.g:2870:4: enumLiteral_0= 'AirConditioner'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getAirConditionerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActuatorTypeAccess().getAirConditionerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartFarming.g:2877:3: (enumLiteral_1= 'NutrientController' )
                    {
                    // InternalSmartFarming.g:2877:3: (enumLiteral_1= 'NutrientController' )
                    // InternalSmartFarming.g:2878:4: enumLiteral_1= 'NutrientController'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getNutrientControllerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActuatorTypeAccess().getNutrientControllerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartFarming.g:2885:3: (enumLiteral_2= 'LEDController' )
                    {
                    // InternalSmartFarming.g:2885:3: (enumLiteral_2= 'LEDController' )
                    // InternalSmartFarming.g:2886:4: enumLiteral_2= 'LEDController'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getLEDControllerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActuatorTypeAccess().getLEDControllerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartFarming.g:2893:3: (enumLiteral_3= 'OxygenController' )
                    {
                    // InternalSmartFarming.g:2893:3: (enumLiteral_3= 'OxygenController' )
                    // InternalSmartFarming.g:2894:4: enumLiteral_3= 'OxygenController'
                    {
                    enumLiteral_3=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getOxygenControllerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActuatorTypeAccess().getOxygenControllerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartFarming.g:2901:3: (enumLiteral_4= 'CO2Controller' )
                    {
                    // InternalSmartFarming.g:2901:3: (enumLiteral_4= 'CO2Controller' )
                    // InternalSmartFarming.g:2902:4: enumLiteral_4= 'CO2Controller'
                    {
                    enumLiteral_4=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getCO2ControllerEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getActuatorTypeAccess().getCO2ControllerEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleActuatorType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001800040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0011020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000FC0000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000F80000400000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000F00000400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000E00000400000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000C00000400000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x000000000003C000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00061C0000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0006180000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0006100000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x00000000001C0000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000000400000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00E01C0000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00E0180000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00E0100000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x000007C000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000F80000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0xFC00000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xF800000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x000000001FE00000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x1000000000400000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x1E00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x1C00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x1800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});

}