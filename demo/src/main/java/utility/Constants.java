
package utility;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Constants {

    public static final String AMERICAN_ENGLISH_FOR_LT = "AmericanEnglish";//no i18n

    public static final String CODE_FOR_LT_ENGLISH_LANGUAGE = "en-us";  //no i18n

    public static final String BASE_PACKAGE = "com.zoho";  //no i18n

    public static final String DISPATCHER = "dispatcher";  //no i18n

    public static final String SLASH = "/";  //no i18n

    public static final String NEW_LINE = "\n";  //no i18n

    public static final String MULTIPLE_NEW_LINE = "\n+";  //no i18n

    public static final String INVALID_FIELD_ERROR_MESSAGE = "Request is not submitted due to invalid field.";  //no i18n

    public static final String TRAINING_FILE_NOT_FOUND_ERROR_MESSAGE = "Training data for org id not found.";//no i18n

    public static final String INVALID_ZGID_ERROR_MESSAGE = "Given ZGID is invalid";//no i18n

    public static final String INVALID_FIELD_MISMATCH_ERROR_MESSAGE = "Request is not submitted due to mismatch in type of field."; //no i18n

    public static final String RESOURCE_NOT_FOUND_ERROR_MESSAGE = "Resource not found.";  //no i18n

    public static final String REQUEST_METHOD_NOT_FOUND_ERROR_MESSAGE = "Request method not supported for this API.";//no i18n

    public static final String SERVICE_UNAVAILABLE_ERROR_MESSAGE = "Service Unavailable. Unknown exception occurred."; //no i18n

    public static final String UNAUTHORIZED_ERROR_MESSAGE = "UnAuthorized API Request."; //no i18n

    public static final String EMPTY_STRING = ""; //no i18n

    public static final String COMMA_STRING = ","; //no i18n

    public static final String COMMA_STRING_WITH_SPACE = " , "; //no i18n

    public static final String ONE_SPACE = " "; //no i18n

    public static final String MULTIPLE_SPACE = " +"; //no i18n

    public static final String NON_ENGLISH = "Non english"; //no i18n

    public static final String SPARK_APP_NAME = "ZiaText"; //no i18n

    public static final String SPARK_WAREHOUSE_DIR = "spark.sql.warehouse.dir"; //no i18n

    public static final String SPARK_UI_ENABLED = "spark.ui.enabled"; //no i18n

    public static final String SENTIMENT_POSITIVE = "Positive"; //no i18n

    public static final String SENTIMENT_NEGATIVE = "Negative"; //no i18n

    public static final String SENTIMENT_NEUTRAL = "Neutral"; //no i18n

    public static final String GREATER_THAN = " greater than "; //no i18n

    public static final String LESS_THAN = " less than "; //no i18n

    public static final String GREATER_THAN_EQ = " greather than or equal to "; //no i18n

    public static final String LESS_THAN_EQ = " less than or equal to "; //no i18n

    public static final String EQUAL_TO = " equal to "; //no i18n

    public static final String CONTAINS = "contains";//no i18n

    public static final String NOT_CONTAINS = "not_contains";//no i18n

    public static final String STARTS_WITH = "starts_with";//no i18n

    public static final String ENDS_WITH = "ends_with";//no i18n

    public static final String IS_NOT_EMPTY = "is_not_empty";//no i18n

    public static final String IS_EMPTY = "is_empty"; //no i18n

    public static final String CHATBOT_TEST_INPUT_FILE_PATH = "data/chatbot/test/chatbotInput.csv";//no i18n

    public static final String CHATBOT_TEST_OUTPUT_FILE_PATH = "data/chatbot/test/chatbotOutput.csv";//no i18n

    public static final String CHATBOT_TEST_REPORT_FILE_PATH = "data/chatbot/test/chatbotReport.txt";//no i18n

    public static final String CHATBOT_MODULE_DS_WORDS = "data/chatbot/dictionary/ModuleDSWords.txt"; // No I18N

    public static final String CHATBOT_SIMILAR_WORD_GROUPING_FILE = "data/chatbot/dictionary/SimilarWordGrouping.txt"; // No I18N

    public static final String CHATBOT_MODULE_DS_WORDS_FIELDS_FILE = "data/chatbot/dictionary/ModuleDSWordsFields.txt"; // No I18N

    public static final String CHATBOT_MODULE_DS_WORDS_DEFAULT_CRITERIA = "data/chatbot/dictionary/ModuleDSWordsDefaultCriteria.txt"; // No I18N

    public static final String CHATBOT_MODULE_DS_WORDS_SELECT_CRITERIA = "data/chatbot/dictionary/ModuleDSWordsSelectCriteria.txt"; // No I18N

    public static final String CRM_API_MODULES_URL =  "/crm/v2/settings/modules?" ;//no i18n

    public static final String CRM_API_FIELDS_URL = "/crm/v2/settings/fields?" ;//no i18n

    public static final String CRM_API_TERRITORIES_URL = "/crm/v2/settings/territories?";//no i18n

    public static final String CRM_API_USERS_URL = "/crm/v2/users?";//no i18n

    public static final String CRM_API_ROLES_URL = "/crm/v2/settings/roles?";//no i18n

    public static final String CRM_API_GROUPS_URL = "/crm/v2/settings/user_groups?";//no i18n

    public static final String CRM_API_CUSTOM_VIEWS_URL = "/crm/v2/settings/custom_views?";//no i18n

    public static final String CRM_API_CONFIGURED_CHATBOT_URL = "/crm/v2/IntelligenceConfig/configs?";//no i18n

    public static final String CRM_API_REPORTS_URL = "";//no i18n

    public static final String CRM_API_DASHBOARDS_URL = "/crm/v2/Dashboards";//no i18n

    public static final String CRM_API_GLOBAL_SEARCH_URL = "/crm/v2/search?";//no i18n

    public static final String CRM_API_BASE_URL = "/crm/v2/"; //no i18n

    public static final String CRM_INTERNAL_API_BASE_URL = "__internal/searchallfields?"; // No I18N

    public static final String CRM_INTERNAL_API_FIELD_SEARCHWORD = CRM_INTERNAL_API_BASE_URL + "searchword="; // No I18N

    public static final String CRM_INTERNAL_API_FIELD_UITYPE = CRM_INTERNAL_API_BASE_URL + "uitype="; // No I18N

    public static final String API_TICKET_KEY = "ticket=";//no i18n

    public static final String API_AUTHTOKEN_KEY = "authtoken=";//no i18n

    public static final String ZFS_COMMONPATH = "zohocrm";//no i18n

    public static final String ZFS_ZGID = "&zgid=";//no i18n

    public static final String LABEL = "label";//no i18n

    public static final String PREVEMPTY = "prevEmpty";//no i18n

    public static final String HASNNP = "hasNnp";//no i18n

    public static final String INLAST5 = "inLast5";//no i18n

    public static final String INLAST10 = "inLast10";//no i18n

    public static final String HASNOVERBC = "hasNoVerbC";//no i18n

    public static final String HASONEVERB = "hasOneVerb";//no i18n

    public static final String HASPREWORDS = "hasPreWords";//no i18n

    public static final String HASNOVERB = "hasNoVerb";//no i18n

    public static final String HASLESSTHANTHREEWORDS = "hasLessThanThreeWords";//no i18n

    public static final String FEATURES = "features";//no i18n

    public static final String MESSAGE_FOR_SIGNATURE_MODEL_TRAINING = "signature model training successfully finished";//no i18n

    public static final String NO_DATA_IN_TRAINING_MODEL = "No rows found in training dataset path";//no i18n

    public static final String FEATURE1 = "feature1";//no i18n

    public static final String FEATURE2 = "feature2";//no i18n

    public static final String FEATURE3 = "feature3";//no i18n

    public static final String FEATURE4 = "feature4";//no i18n

    public static final String FEATURE5 = "feature5";//no i18n

    public static final String FEATURE6 = "feature6";//no i18n

    public static final String FEATURE7 = "feature7";//no i18n

    public static final String FEATURE8 = "feature8";//no i18n

    public static final String FEATURE9 = "feature9";//no i18n

    public static final String ID_SIG = "id";//no i18n

    public static final String LINE_INDEX = "lineIndex";//no i18n

    public static final String PREDICTION = "prediction";//no i18n

    public static final String SIGNATURE_EDGECASE1 = "sent from";//no i18n

    public static final String SIGNATURE_EDGECASE2 = "please consider the environment before printing";//no i18n

    public static final String REGARDS = "regards";//no i18n

    public static final String THANKS = "thanks";//no i18n

    public static final String THANK = "thank";//no i18n

    public static final String FAITHFULLY = "faithfully";//no i18n

    public static final String SINCERELY = "sincerely";//no i18n

    public static final String SINGLELINE = "-";//no i18n

    public static final String DOUBLELINE = "--";//no i18n

    public static final String EQUAL_SIGN = "="; //no i18n

    public static final String KINDLY = "kindly";//no i18n

    public static final String VB = "VB";//no i18n

    public static final String NNP  = "NNP";//no i18n

    public static final String VBD = "VBD";//no i18n

    public static final String VBG  = "VBG";//no i18n

    public static final String VBN = "VBN";//no i18n

    public static final String VBP = "VBP";//no i18n

    public static final String VBZ  = "VBZ";//no i18n

    public static final String SIGNATURE = "signature";//no i18n

    public static final String ACTIVITY_EXTRACTION = "ActivityExtraction";//no i18n

    public static final String ACTIVITY_EXTRACTION_V2 = "ActivityExtractionV2";//no i18n

    public static final String COMPETITOR_EXTRACTION = "CompetitorExtraction";//no i18n

    public static final String SMART_SUGGESTION = "SmartSuggestion";//no i18n

    public static final String TIMEZONE = "timeZone";//no i18n

    public static final String ISCOMMITMENTREQUIRED = "isCommitmentRequired";//no i18n

    public static final String CHATBOT_DEFAULT_TIME_CRITERIA = "today";//no i18n

    public static final String CHATBOT_EXTENSIVE_DEFAULT_TIME_CRITERIA = "this month";//no i18n

    public static final String HTTP = "http://";//no i18n

    public static final String ZCRMDATAWRANGLER = "ZCRMDATAWRANGLER";//no i18n

    public static final String CHATBOT_701_STATUS_MESSAGE = "I didn't understand that. Please try rephrasing."; // No I18N

    public static final String LANGUAGE_NOT_SUPPORTED = "LANGUAGE_NOT_SUPPORTED"; //no i18n

    public static final String INVALID_VERSION = "INVALID_VERSION"; //no i18n

    public static final String INVALID_VERSION_DESC = "Invalid model version"; //no i18n

    public static final String EXCEPTION_OCCURED = "EXCEPTION_OCCURED"; //no i18n

    public static final String NER_SERVICE_UNAVAILABLE = "NER_SERVICE_UNAVAILABLE"; //no i18n

    public static final String EMPTY_TEXT = "EMPTY_TEXT"; //no i18n

    public static final String NO_CONTENT = "NO_CONTENT"; //no i18n

    public static final String EMPTY_REQUEST = "EMPTY_REQUEST"; //no i18n

    public static final String TEXT_LENGTH_EXCEEDED = "TEXT_LENGTH_EXCEEDED"; //no i18n

    public static final String LANGUAGE_NOT_SUPPORTED_DESC = "Only english language is supported"; //no i18n

    public static final String MULTILINGUAL_LANGUAGE_NOT_SUPPORTED_DESC = "Only Hindi language is supported in multilingual NER"; //no i18n

    public static final String EXCEPTION_OCCURED_DESC = "Error while processing your request"; //no i18n

    public static final String SERVICE_UNAVAILABLE_DESC = "Service Unavailable"; //no i18n

    public static final String EMPTY_TEXT_DESC = "Text field is empty or of zero length"; //no i18n

    public static final String EMPTY_REQUEST_DESC = "The messages field is empty"; //no i18n

    public static final String TEXT_LENGTH_EXCEEDED_DESC = "Text length > 2500 is not allowed"; //no i18n

    public static final String NER_END_POINT = "/text/api/ner/v2/simple"; //no i18n

    public static final String NER_MULTILINGUAL_END_POINT = "/text/api/ner/v2/multilingual"; //no i18n

    public static final String KEYWORD_END_POINT = "/text/api/keyword/extract"; //no i18n

    public static final String SENTIMENT_END_POINT = "/text/api/v1/sentiment/predict"; //no i18n

    public static final String SENTIMENT_PREDICTION_END_POINT = "/text/api/v1/sentiment/document/predict"; //no i18n

    public static final String KEYWORD_SENTIMENT_END_POINT = "/text/api/v1/sentiment/keyword/analyze"; //no i18n

    public static final String KEYWORD_DISTIL_BERT_SENTIMENT_END_POINT = "/text/api/v1/sentiment/keyword/predict"; //no i18n

    public static final String VOC_END_POINT = "/text/api/voc/predict"; //no i18n

    public static final String SPEAKER_RESOLUTION_END_POINT = "/text/api/speaker/resolve"; //no i18n

    public static final String CALL_RESOLUTION_END_POINT = "/text/api/call/resolve"; //no i18n

    public static final String EMOTION_END_POINT = "/text/api/emotion/extract"; //no i18n

    public static final String INTENT_END_POINT = "/text/api/intent/extract"; //no i18n

    public static final String CLASSIFICATION_END_POINT = "/text/api/classification/predict"; //no i18n

    public static final String TRENDS_PATH = "/crm/email/v2/__internal/trendsDetails"; //no i18n

    public static final String CHATBOT_HELP_END_POINT = "/text/api/chatbot/classification/help"; //no i18n

    public static final String CHATBOT_ZIA_SKILLS_END_POINT = "/text/api/chatbot/classification/zia"; //no i18n

    public static final String ACTIVITY_CLASSIFIER_END_POINT = "/text/api/activity/classification";  //no i18n

    public static final String ACTIVITY_CLASSIFIER_V2_END_POINT = "/text/api/activity/v2/classification";  //no i18n

    public static final String SMART_SUGGESTION_CLASSIFIER_END_POINT = "/text/api/nba/predict";  //no i18n

    public static final String COMMITMENT_CLASSIFIER_END_POINT = "/text/api/commitment/predict";  //no i18n

    public static final String LANGUAGE_DETECTOR_END_POINT = "/text/api/language/detection";  //no i18n

    public static final Integer VOC_CLASSIFICATION_TYPE_FOR_TEXT = 11;

    public static final Integer VOC_CLASSIFICATION_TYPE_FOR_EMAIL = 12;

    public static final Integer ZERO = 0;

    public static final Integer ONE = 1;

    public static final Integer TWO = 2;

    public static final Integer THREE = 3;

    public static final Integer FOUR = 4;

    public static final float CALL_SEGMENT_THRESHOLD = (float) 0.8;

    public static final String[] SUPPORTED_LANGUAGES_FOR_TEXT = {"English"}; //no i18n

    public static final Set<String> SUPPORTED_LANGUAGES_FOR_TEXT_FEATURES = new HashSet<>(Arrays.asList(SUPPORTED_LANGUAGES_FOR_TEXT));

    public static final Integer MAX_LENGTH_FOR_TEXT = 2500;

    public static final Integer MAX_LENGTH_FOR_EMAIL = 25000;

    public static final Integer MAIL_TOKENS_TRUNCATION_LIMIT = 500;

    public static final Integer FEATURE_COUNT = 14;

    public static final List<String> UNWANTED_KEYWORDS = Collections.unmodifiableList(Arrays.asList(
            "ya", "yeah", "hi", "yes", "thank you", "bye", "good bye", "goodbye", "good morning", "good evening", //no i18n
            "have a nice day", "good afternoon", "good night", "pleasure", "nice day", "thanks", "thanks for calling", "time", "hello", //no i18n
            "hi", "hey", "good day", "see you", "thanks again", "help", "sir", "sure", "suit", "very much", "great day", "sure thing",  //no i18n
            "very much","great day","nice","nice day", "hello", "hi", "hey", "good day", "see you", "thanks again", "help", "sir", "sure",  //no i18n
            "suit", "very much", "great day", "sure thing","a","as","is","ya sure")); //no i18n

    public static final HashMap<String, List<String>> KEYWORD_BASED_INTENT_LABELS = new HashMap<String, List<String>>() {{
        put("getting caller information", Arrays.asList("calling from", "who is this"));   //no i18n
        put("opportunity", Arrays.asList("best price", "discount", "convincing to buy"));   //no i18n
        put("cross sell", Arrays.asList("recommend", "upgrade", "upsell", "suggestion"));   //no i18n
        put("deal closing", Arrays.asList("follow up", "schedule a demo"));   //no i18n
        put("issue", Arrays.asList("problem"));   //no i18n
        put("greetings", Arrays.asList("hello"));   //no i18n
    }};

    public static final HashMap<String, String> CALL_SEGMENT_LABEL = new HashMap<String, String>() {{
        put("getting caller information", "Getting caller information");   //no i18n
        put("opportunity", "Opportunity talks");   //no i18n
        put("cross sell", "Up-sell / Cross sell recommendations");   //no i18n
        put("deal closing", "Deal Closing");   //no i18n
        put("issue", "Issue");   //no i18n
        put("greetings","Greetings");   //no i18n
        put("Others","Others");   //no i18n
    }};

    public static final HashMap<String, String> LANG_CODES_IN_ENGLISH = new HashMap<String, String>() {{
        put("af", "Afrikaans");   //no i18n
        put("als", "Tosk Albanian");   //no i18n
        put("am", "Amharic");   //no i18n
        put("an", "Aragonese");   //no i18n
        put("ar", "Arabic");   //no i18n
        put("arz", "Egyptian Arabic");   //no i18n
        put("as", "Assamese");   //no i18n
        put("ast", "Asturian");   //no i18n
        put("av", "Avaric");   //no i18n
        put("az", "Azerbaijani");   //no i18n
        put("azb", "South Azerbaijani");   //no i18n
        put("ba", "Bashkir");   //no i18n
        put("bar", "Bavarian");   //no i18n
        put("bcl", "Central Bikol");   //no i18n
        put("be", "Belarusian");   //no i18n
        put("bg", "Bulgarian");   //no i18n
        put("bh", "Bihari languages");   //no i18n
        put("bn", "Bengali");   //no i18n
        put("bo", "Tibetan");   //no i18n
        put("bpy", "Bishnupriya");   //no i18n
        put("br", "Breton");   //no i18n
        put("bs", "Bosnian");   //no i18n
        put("bxr", "Russia Buriat");   //no i18n
        put("ca", "Catalan");   //no i18n
        put("cbk", "Chavacano");   //no i18n
        put("ce", "Chechen");   //no i18n
        put("ceb", "Cebuano");   //no i18n
        put("ckb", "Central Kurdish");   //no i18n
        put("co", "Corsican");   //no i18n
        put("cs", "Czech");   //no i18n
        put("cv", "Chuvash");   //no i18n
        put("cy", "Welsh");   //no i18n
        put("da", "Danish");   //no i18n
        put("de", "German");   //no i18n
        put("diq", "Dimli (individual language)");   //no i18n
        put("dsb", "Lower Sorbian");   //no i18n
        put("dty", "Dotyali");   //no i18n
        put("dv", "Dhivehi");   //no i18n
        put("el", "Modern Greek (1453-)");   //no i18n
        put("eml", "Emiliano-Romagnolo");   //no i18n
        put("en", "English");   //no i18n
        put("eo", "Esperanto");   //no i18n
        put("es", "Spanish");   //no i18n
        put("et", "Estonian");   //no i18n
        put("eu", "Basque");   //no i18n
        put("fa", "Persian");   //no i18n
        put("fi", "Finnish");   //no i18n
        put("fr", "French");   //no i18n
        put("frr", "Northern Frisian");   //no i18n
        put("fy", "Western Frisian");   //no i18n
        put("ga", "Irish");   //no i18n
        put("gd", "Scottish Gaelic");   //no i18n
        put("gl", "Galician");   //no i18n
        put("gn", "Guarani");   //no i18n
        put("gom", "Goan Konkani");   //no i18n
        put("gu", "Gujarati");   //no i18n
        put("gv", "Manx");   //no i18n
        put("he", "Hebrew");   //no i18n
        put("hi", "Hindi");   //no i18n
        put("hif", "Fiji Hindi");   //no i18n
        put("hr", "Croatian");   //no i18n
        put("hsb", "Upper Sorbian");   //no i18n
        put("ht", "Haitian");   //no i18n
        put("hu", "Hungarian");   //no i18n
        put("hy", "Armenian");   //no i18n
        put("ia", "Interlingua (International Auxiliary Language Association)");   //no i18n
        put("id", "Indonesian");   //no i18n
        put("ie", "Interlingue");   //no i18n
        put("ilo", "Iloko");   //no i18n
        put("io", "Ido");   //no i18n
        put("is", "Icelandic");   //no i18n
        put("it", "Italian");   //no i18n
        put("ja", "Japanese");   //no i18n
        put("jbo", "Lojban");   //no i18n
        put("jv", "Javanese");   //no i18n
        put("ka", "Georgian");   //no i18n
        put("kk", "Kazakh");   //no i18n
        put("km", "Central Khmer");   //no i18n
        put("kn", "Kannada");   //no i18n
        put("ko", "Korean");   //no i18n
        put("krc", "Karachay-Balkar");   //no i18n
        put("ku", "Kurdish");   //no i18n
        put("kv", "Komi");   //no i18n
        put("kw", "Cornish");   //no i18n
        put("ky", "Kirghiz");   //no i18n
        put("la", "Latin");   //no i18n
        put("lb", "Luxembourgish");   //no i18n
        put("lez", "Lezghian");   //no i18n
        put("li", "Limburgan");   //no i18n
        put("lmo", "Lombard");   //no i18n
        put("lo", "Lao");   //no i18n
        put("lrc", "Northern Luri");   //no i18n
        put("lt", "Lithuanian");   //no i18n
        put("lv", "Latvian");   //no i18n
        put("mai", "Maithili");   //no i18n
        put("mg", "Malagasy");   //no i18n
        put("mhr", "Eastern Mari");   //no i18n
        put("min", "Minangkabau");   //no i18n
        put("mk", "Macedonian");   //no i18n
        put("ml", "Malayalam");   //no i18n
        put("mn", "Mongolian");   //no i18n
        put("mr", "Marathi");   //no i18n
        put("mrj", "Western Mari");   //no i18n
        put("ms", "Malay (macrolanguage)");   //no i18n
        put("mt", "Maltese");   //no i18n
        put("mwl", "Mirandese");   //no i18n
        put("my", "Burmese");   //no i18n
        put("myv", "Erzya");   //no i18n
        put("mzn", "Mazanderani");   //no i18n
        put("nah", "Nahuatl languages");   //no i18n
        put("nap", "Neapolitan");   //no i18n
        put("nds", "Low German");   //no i18n
        put("ne", "Nepali (macrolanguage)");   //no i18n
        put("new", "Newari");   //no i18n
        put("nl", "Dutch");   //no i18n
        put("nn", "Norwegian Nynorsk");   //no i18n
        put("no", "Norwegian");   //no i18n
        put("oc", "Occitan (post 1500)");   //no i18n
        put("or", "Oriya (macrolanguage)");   //no i18n
        put("os", "Ossetian");   //no i18n
        put("pa", "Panjabi");   //no i18n
        put("pam", "Pampanga");   //no i18n
        put("pfl", "Pfaelzisch");   //no i18n
        put("pl", "Polish");   //no i18n
        put("pms", "Piemontese");   //no i18n
        put("pnb", "Western Panjabi");   //no i18n
        put("ps", "Pushto");   //no i18n
        put("pt", "Portuguese");   //no i18n
        put("qu", "Quechua");   //no i18n
        put("rm", "Romansh");   //no i18n
        put("ro", "Romanian");   //no i18n
        put("ru", "Russian");   //no i18n
        put("rue", "Rusyn");   //no i18n
        put("sa", "Sanskrit");   //no i18n
        put("sah", "Yakut");   //no i18n
        put("sc", "Sardinian");   //no i18n
        put("scn", "Sicilian");   //no i18n
        put("sco", "Scots");   //no i18n
        put("sd", "Sindhi");   //no i18n
        put("sh", "Serbo-Croatian");   //no i18n
        put("si", "Sinhala");   //no i18n
        put("sk", "Slovak");   //no i18n
        put("sl", "Slovenian");   //no i18n
        put("so", "Somali");   //no i18n
        put("sq", "Albanian");   //no i18n
        put("sr", "Serbian");   //no i18n
        put("su", "Sundanese");   //no i18n
        put("sv", "Swedish");   //no i18n
        put("sw", "Swahili (macrolanguage)");   //no i18n
        put("ta", "Tamil");   //no i18n
        put("te", "Telugu");   //no i18n
        put("tg", "Tajik");   //no i18n
        put("th", "Thai");   //no i18n
        put("tk", "Turkmen");   //no i18n
        put("tl", "Tagalog");   //no i18n
        put("tr", "Turkish");   //no i18n
        put("tt", "Tatar");   //no i18n
        put("tyv", "Tuvinian");   //no i18n
        put("ug", "Uighur");   //no i18n
        put("uk", "Ukrainian");   //no i18n
        put("ur", "Urdu");   //no i18n
        put("uz", "Uzbek");   //no i18n
        put("vec", "Venetian");   //no i18n
        put("vep", "Veps");   //no i18n
        put("vi", "Vietnamese");   //no i18n
        put("vls", "Vlaams");   //no i18n
        put("vo", "Volapuk");   //no i18n
        put("wa", "Walloon");   //no i18n
        put("war", "Waray (Philippines)");   //no i18n
        put("wuu", "Wu Chinese");   //no i18n
        put("xal", "Kalmyk");   //no i18n
        put("xmf", "Mingrelian");   //no i18n
        put("yi", "Yiddish");   //no i18n
        put("yo", "Yoruba");   //no i18n
        put("yue", "Yue Chinese");   //no i18n
        put("zh", "Chinese");   //no i18n
    }};
}
