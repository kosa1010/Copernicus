package copernicus.profiles;

//package profiles;
import java.util.ResourceBundle;

public abstract class Categories {

    public static final int NO_OF_CATEGORIES = 20;

    public static final int UNKNOWN = -1;

    public static final int NORM = 0;
    public static final int NEUROSIS = 1;
    public static final int PSYCHOPATHY = 2;
    public static final int ORGANIC = 3;
    public static final int SCHIZOPHRENIA = 4;
    public static final int DELUSION_SYNDROME = 5;
    public static final int REACTIV_PSYCHOSIS = 6;
    public static final int PARANOIA = 7;
    public static final int MANIC_STATE = 8;
    public static final int CRIMINALITY = 9;
    public static final int ALCOHOLISM = 10;
    public static final int DRUG_INDUCTION = 11;
    public static final int SIMULATION = 12;
    public static final int DISSIMULATION = 13;
    public static final int DEVIATIONAL_ANSWERING_STYLE_1 = 14;
    public static final int DEVIATIONAL_ANSWERING_STYLE_2 = 15;
    public static final int DEVIATIONAL_ANSWERING_STYLE_3 = 16;
    public static final int DEVIATIONAL_ANSWERING_STYLE_4 = 17;
    public static final int DEVIATIONAL_ANSWERING_STYLE_5 = 18;
    public static final int DEVIATIONAL_ANSWERING_STYLE_6 = 19;

    public static final int NOT_VALIDATED = 100;
    public static final int DEPENDENCE = 101;
    public static final int NEUROTICISM = 102;
    public static final int PSYCHOTICISM = 103;
    public static final int SOCIOPATHY = 104;

    public static final int NORMALIZING_W = 200;
    public static final int NORMALIZING_M = 201;
    public static final int NORMALIZING_MW = 202;

    public static final int ALL = 1000;

    public static final int DEFAULT = 2000;
    public static final int UNDEF = 2001;

    public static String getAbbreviation(int category) {
        String abbr;

        switch (category) {
            case Categories.NORM: {
                abbr = "NORM";
                break;
            }
            case Categories.NEUROSIS: {
                abbr = "NEUR";
                break;
            }
            case Categories.PSYCHOPATHY: {
                abbr = "PSYCH";
                break;
            }
            case Categories.ORGANIC: {
                abbr = "ORG";
                break;
            }
            case Categories.SCHIZOPHRENIA: {
                abbr = "SCHIZ";
                break;
            }
            case Categories.DELUSION_SYNDROME: {
                abbr = "DEL";
                break;
            }
            case Categories.REACTIV_PSYCHOSIS: {
                abbr = "REACT";
                break;
            }
            case Categories.PARANOIA: {
                abbr = "PARAN";
                break;
            }
            case Categories.MANIC_STATE: {
                abbr = "MANIC";
                break;
            }
            case Categories.CRIMINALITY: {
                abbr = "CRIM";
                break;
            }
            case Categories.ALCOHOLISM: {
                abbr = "ALCOH";
                break;
            }
            case Categories.DRUG_INDUCTION: {
                abbr = "DRUG";
                break;
            }
            case Categories.SIMULATION: {
                abbr = "SIM";
                break;
            }
            case Categories.DISSIMULATION: {
                abbr = "DISSIM";
                break;
            }
            case Categories.DEVIATIONAL_ANSWERING_STYLE_1: {
                abbr = "DEV1";
                break;
            }
            case Categories.DEVIATIONAL_ANSWERING_STYLE_2: {
                abbr = "DEV2";
                break;
            }
            case Categories.DEVIATIONAL_ANSWERING_STYLE_3: {
                abbr = "DEV3";
                break;
            }
            case Categories.DEVIATIONAL_ANSWERING_STYLE_4: {
                abbr = "DEV4";
                break;
            }
            case Categories.DEVIATIONAL_ANSWERING_STYLE_5: {
                abbr = "DEV5";
                break;
            }
            case Categories.DEVIATIONAL_ANSWERING_STYLE_6: {
                abbr = "DEV6";
                break;
            }
            case Categories.NOT_VALIDATED: {
                abbr = "NOT";
                break;
            }
            case Categories.DEPENDENCE: {
                abbr = "DEP";
                break;
            }
            case Categories.NEUROTICISM: {
                abbr = "NEUR";
                break;
            }
            case Categories.PSYCHOTICISM: {
                abbr = "PSYCH";
                break;
            }
            case Categories.SOCIOPATHY: {
                abbr = "SOCIO";
                break;
            }
            case Categories.DEFAULT: {
                abbr = "DEFAULT";
                break;
            }
            case Categories.UNDEF: {
                abbr = "UNDEF";
                break;
            }
            default: {
                abbr = "UNKNOWN";
                break;
            }
        }

        return abbr;
    }

    public static String getName(int category, ResourceBundle ui) {
        String name;

        switch (category) {
            case Categories.NORM: {
                name = ui.getString("category_norm");
                break;
            }
            case Categories.NEUROSIS: {
                name = ui.getString("category_neur");
                break;
            }
            case Categories.PSYCHOPATHY: {
                name = ui.getString("category_psych");
                break;
            }
            case Categories.ORGANIC: {
                name = ui.getString("category_org");
                break;
            }
            case Categories.SCHIZOPHRENIA: {
                name = ui.getString("category_schiz");
                break;
            }
            case Categories.DELUSION_SYNDROME: {
                name = ui.getString("category_del");
                break;
            }
            case Categories.REACTIV_PSYCHOSIS: {
                name = ui.getString("category_re_psy");
                break;
            }
            case Categories.PARANOIA: {
                name = ui.getString("category_paran");
                break;
            }
            case Categories.MANIC_STATE: {
                name = ui.getString("category_man_st");
                break;
            }
            case Categories.CRIMINALITY: {
                name = ui.getString("category_crim");
                break;
            }
            case Categories.ALCOHOLISM: {
                name = ui.getString("category_alcoh");
                break;
            }
            case Categories.DRUG_INDUCTION: {
                name = ui.getString("category_drug");
                break;
            }
            case Categories.SIMULATION: {
                name = ui.getString("category_simu");
                break;
            }
            case Categories.DISSIMULATION: {
                name = ui.getString("category_dissimu");
                break;
            }
            case Categories.DEVIATIONAL_ANSWERING_STYLE_1: {
                name = ui.getString("category_dev1");
                break;
            }
            case Categories.DEVIATIONAL_ANSWERING_STYLE_2: {
                name = ui.getString("category_dev2");
                break;
            }
            case Categories.DEVIATIONAL_ANSWERING_STYLE_3: {
                name = ui.getString("category_dev3");
                break;
            }
            case Categories.DEVIATIONAL_ANSWERING_STYLE_4: {
                name = ui.getString("category_dev4");
                break;
            }
            case Categories.DEVIATIONAL_ANSWERING_STYLE_5: {
                name = ui.getString("category_dev5");
                break;
            }
            case Categories.DEVIATIONAL_ANSWERING_STYLE_6: {
                name = ui.getString("category_dev6");
                break;
            }
            case Categories.NOT_VALIDATED: {
                name = ui.getString("category_not_valid");
                break;
            }
            case Categories.DEPENDENCE: {
                name = ui.getString("category_dep");
                break;
            }
            case Categories.NEUROTICISM: {
                name = ui.getString("category_neurot");
                break;
            }
            case Categories.PSYCHOTICISM: {
                name = ui.getString("category_psychot");
                break;
            }
            case Categories.SOCIOPATHY: {
                name = ui.getString("category_socio");
                break;
            }
            case Categories.DEFAULT: {
                name = ui.getString("category_default");
                break;
            }
            case Categories.UNDEF: {
                name = ui.getString("category_undef");
                break;
            }
            default: {
                name = ui.getString("category_unknown");
                break;
            }
        }

        name = name.replace("_", " ");
        name = name.toLowerCase();

        return name;
    }

    public static int getCategoryFromString(String s) {
        int category = Categories.UNKNOWN;

        if (s.toUpperCase().contains("WSZ") || s.toUpperCase().contains("ALL")) {
            category = Categories.ALL;
        }
        if (s.toUpperCase().contains("NORM") || s.toUpperCase().contains("G_1")) {
            category = Categories.NORM;
        }
        if (s.toUpperCase().contains("NERW") || s.toUpperCase().contains("NEUR") || s.toUpperCase().contains("G_2")) {
            category = Categories.NEUROSIS;
        }
        if (s.toUpperCase().contains("PSYCHOPAT") || s.toUpperCase().contains("PSYCH") || s.toUpperCase().contains("G_3")) {
            category = Categories.PSYCHOPATHY;
        }
        if (s.toUpperCase().contains("ORG") || s.toUpperCase().contains("ORG") || s.toUpperCase().contains("G_4")) {
            category = Categories.ORGANIC;
        }
        if (s.toUpperCase().contains("SCHIZ") || s.toUpperCase().contains("G_5")) {
            category = Categories.SCHIZOPHRENIA;
        }
        if (s.toUpperCase().contains("UROJ") || s.toUpperCase().contains("DEL") || s.toUpperCase().contains("G_6")) {
            category = Categories.DELUSION_SYNDROME;
        }
        if (s.toUpperCase().contains("PSYCHOZ") || s.toUpperCase().contains("RE.PSY") || s.toUpperCase().contains("G_7")) {
            category = Categories.REACTIV_PSYCHOSIS;
        }
        if (s.toUpperCase().contains("PARAN") || s.toUpperCase().contains("G_8")) {
            category = Categories.PARANOIA;
        }
        if (s.toUpperCase().contains("MANIAK") || s.toUpperCase().contains("MAN") || s.toUpperCase().contains("G_9")) {
            category = Categories.MANIC_STATE;
        }
        if (s.toUpperCase().contains("PRZEST") || s.toUpperCase().contains("CRIM") || s.toUpperCase().contains("G_10")) {
            category = Categories.CRIMINALITY;
        }
        if (s.toUpperCase().contains("ALK") || s.toUpperCase().contains("ALCOH") || s.toUpperCase().contains("G_11")) {
            category = Categories.ALCOHOLISM;
        }
        if (s.toUpperCase().contains("NARK") || s.toUpperCase().contains("DRUG") || s.toUpperCase().contains("G_12")) {
            category = Categories.DRUG_INDUCTION;
        }
        if ((s.toUpperCase().contains("SYMUL") || s.toUpperCase().contains("SIMU")) && !s.toUpperCase().contains("D") || s.toUpperCase().contains("G_13")) {
            category = Categories.SIMULATION;
        }
        if (s.toUpperCase().contains("DYSSYM") || s.toUpperCase().contains("DISSIMU") || s.toUpperCase().contains("G_14")) {
            category = Categories.DISSIMULATION;
        }
        if ((s.toUpperCase().contains("DEW") || s.toUpperCase().contains("DEV") || s.toUpperCase().contains("DSO")) && s.contains("1") || s.toUpperCase().contains("G_15")) {
            category = Categories.DEVIATIONAL_ANSWERING_STYLE_1;
        }
        if ((s.toUpperCase().contains("DEW") || s.toUpperCase().contains("DEV") || s.toUpperCase().contains("DSO")) && s.contains("2") || s.toUpperCase().contains("G_16")) {
            category = Categories.DEVIATIONAL_ANSWERING_STYLE_2;
        }
        if ((s.toUpperCase().contains("DEW") || s.toUpperCase().contains("DEV") || s.toUpperCase().contains("DSO")) && s.contains("3") || s.toUpperCase().contains("G_17")) {
            category = Categories.DEVIATIONAL_ANSWERING_STYLE_3;
        }
        if ((s.toUpperCase().contains("DEW") || s.toUpperCase().contains("DEV") || s.toUpperCase().contains("DSO")) && s.contains("4") || s.toUpperCase().contains("G_18")) {
            category = Categories.DEVIATIONAL_ANSWERING_STYLE_4;
        }
        if ((s.toUpperCase().contains("DEW") || s.toUpperCase().contains("DEV") || s.toUpperCase().contains("DSO")) && s.contains("5") || s.toUpperCase().contains("G_19")) {
            category = Categories.DEVIATIONAL_ANSWERING_STYLE_5;
        }
        if ((s.toUpperCase().contains("DEW") || s.toUpperCase().contains("DEV") || s.toUpperCase().contains("DSO")) && s.contains("6") || s.toUpperCase().contains("G_20")) {
            category = Categories.DEVIATIONAL_ANSWERING_STYLE_6;
        }
        if (s.toUpperCase().contains("WALID") || s.toUpperCase().contains("NVAL")) {
            category = Categories.NOT_VALIDATED;
        }
        if (s.toUpperCase().contains("UZAL") || s.toUpperCase().contains("DEPEND")) {
            category = Categories.DEPENDENCE;
        }
        if (s.toUpperCase().contains("NEUROT")) {
            category = Categories.NEUROTICISM;
        }
        if (s.toUpperCase().contains("PSYCHOT")) {
            category = Categories.PSYCHOTICISM;
        }
        if (s.toUpperCase().contains("SOCJOPAT") || s.toUpperCase().contains("SOCIO")) {
            category = Categories.SOCIOPATHY;
        }
        if (s.toUpperCase().contains("20K_")) {
            category = Categories.NORMALIZING_W;
        }
        if (s.toUpperCase().contains("20M_")) {
            category = Categories.NORMALIZING_M;
        }
        if (s.toUpperCase().contains("20K+M_")) {
            category = Categories.NORMALIZING_MW;
        }
        if (s.toUpperCase().contains("DOMYSLN") || s.toUpperCase().contains("DEFAULT")) {
            category = Categories.DEFAULT;
        }
        if (s.toUpperCase().contains("NIEOKR") || s.toUpperCase().contains("UNDEF")) {
            category = Categories.UNDEF;
        }

        return category;
    }

    public static Object[] getCategoryArray(boolean withAllItem, ResourceBundle ui) {
        Object[] categoryArray;

        if (withAllItem == true) {
            categoryArray = new Object[Categories.NO_OF_CATEGORIES + 1];

            categoryArray[0] = ui.getString("item_all");

            for (int i = 0; i < Categories.NO_OF_CATEGORIES; i++) {
                categoryArray[i + 1] = Categories.getName(i, ui);
            }
        } else {
            categoryArray = new Object[Categories.NO_OF_CATEGORIES];

            for (int i = 0; i < Categories.NO_OF_CATEGORIES; i++) {
                categoryArray[i] = Categories.getName(i, ui);
            }
        }

        return categoryArray;
    }
}
