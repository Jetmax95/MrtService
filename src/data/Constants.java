package data;

/**
 * I am using this class for now to name the constants
 */

public class Constants {

    // Standard constants
    private int VAT = 24;
    private int VAT_SPECIAL = 17;

    // Prices for repairing / moving / visiting / demonstrating
    private int PRICE_FOR_VISIT_LESS_THAN_30_MINUTES = 35; // This is the base price
    private int PRICE_FOR_SECOND_VISIT = 35;
    private int PRICE_FOR_WEEKEND_VISIT = 25;
    private int PRICE_FOR_MOVING_ITEM_TO_CLOSEST_SERVICE_POINT = 30;
    private int PRICE_FOR_SERVICE_AFTER_MOVE_TO_SERVICE_POINT = 30;
    private double PRICE_FOR_EACH_KM = 0.35;
    private int PRICE_FOR_MOVING_SPARE_PART = 10;
    private int PRICE_FOR_DEMONSTRATION_OF_USAGE = 50;

    // Everything underneath is extra to the base price, depending on the case.
    private int PRICE_FOR_MOTOR_CHANGE = 45;
    private int PRICE_FOR_FLUID_LEAKAGE_RECOVERY = 35;
    private int PRICE_FOR_BOARD_CHANGE = 25;
    private int PRICE_FOR_FAN_CHANGE = 15;
    private int PRICE_FOR_RESISTANCE_CHANGE = 15;
    private int PRICE_FOR_BOILER_CHANGE = 15;
    private int PRICE_FOR_THERMOSTAT_CHANGE = 20;

    //The prices underneath are the prices that we charge The Mart for each spare part IF found in the market;
    private int DIAKOPTIS_FRITEZAS = 10;
    private int DIAKOPTIS_TOSTIERAS = 15;
    private int ILEKTRONIKOS_THERMOSTATIS_PSIGIOU = 50;
    private int THERMOSTATIS_VRASTIRA = 5;
    private int THERMOSTATIS_FRITEZAS = 15;
    private int THERMOSTATIS_TOSTIERAS = 15;
    private int RITHMIKO_ASFALIAS_TOSTIERAS = 35;
    private int ANEMISTIRAS_STIXIOU_VITRINAS = 25;
    private int ANEMISTIRAS_EKSOTERIKOS_VITRINAS = 25;
    private int RELES_ANEMISTIRA = 50;
    private int MENTESES_PORTAS_VITRINAS = 50;
    private int ANTISTASI_TOSTIERAS = 20;
    private int ANTISTASI_FRITEZAS = 20;
    private int DIAFORA_KOUMPIA = 3;
    private int MOTER_PSIGIOU_VITRINAS = 70;


    public int getVAT() {
        return VAT;
    }

    public int getVAT_SPECIAL() {
        return VAT_SPECIAL;
    }

    public int getPRICE_FOR_VISIT_LESS_THAN_30_MINUTES() {
        return PRICE_FOR_VISIT_LESS_THAN_30_MINUTES;
    }

    public int getPRICE_FOR_SECOND_VISIT() {
        return PRICE_FOR_SECOND_VISIT;
    }

    public int getPRICE_FOR_WEEKEND_VISIT() {
        return PRICE_FOR_WEEKEND_VISIT;
    }

    public int getPRICE_FOR_MOVING_ITEM_TO_CLOSEST_SERVICE_POINT() {
        return PRICE_FOR_MOVING_ITEM_TO_CLOSEST_SERVICE_POINT;
    }

    public int getPRICE_FOR_SERVICE_AFTER_MOVE_TO_SERVICE_POINT() {
        return PRICE_FOR_SERVICE_AFTER_MOVE_TO_SERVICE_POINT;
    }

    public double getPRICE_FOR_EACH_KM() {
        return PRICE_FOR_EACH_KM;
    }

    public int getPRICE_FOR_MOVING_SPARE_PART() {
        return PRICE_FOR_MOVING_SPARE_PART;
    }

    public int getPRICE_FOR_DEMONSTRATION_OF_USAGE() {
        return PRICE_FOR_DEMONSTRATION_OF_USAGE;
    }

    public int getPRICE_FOR_MOTOR_CHANGE() {
        return PRICE_FOR_MOTOR_CHANGE;
    }

    public int getPRICE_FOR_FLUID_LEAKAGE_RECOVERY() {
        return PRICE_FOR_FLUID_LEAKAGE_RECOVERY;
    }

    public int getPRICE_FOR_BOARD_CHANGE() {
        return PRICE_FOR_BOARD_CHANGE;
    }

    public int getPRICE_FOR_FAN_CHANGE() {
        return PRICE_FOR_FAN_CHANGE;
    }

    public int getPRICE_FOR_RESISTANCE_CHANGE() {
        return PRICE_FOR_RESISTANCE_CHANGE;
    }

    public int getPRICE_FOR_BOILER_CHANGE() {
        return PRICE_FOR_BOILER_CHANGE;
    }

    public int getPRICE_FOR_THERMOSTAT_CHANGE() {
        return PRICE_FOR_THERMOSTAT_CHANGE;
    }

    public int getDIAKOPTIS_FRITEZAS() {
        return DIAKOPTIS_FRITEZAS;
    }

    public int getDIAKOPTIS_TOSTIERAS() {
        return DIAKOPTIS_TOSTIERAS;
    }

    public int getILEKTRONIKOS_THERMOSTATIS_PSIGIOU() {
        return ILEKTRONIKOS_THERMOSTATIS_PSIGIOU;
    }

    public int getTHERMOSTATIS_VRASTIRA() {
        return THERMOSTATIS_VRASTIRA;
    }

    public int getTHERMOSTATIS_FRITEZAS() {
        return THERMOSTATIS_FRITEZAS;
    }

    public int getTHERMOSTATIS_TOSTIERAS() {
        return THERMOSTATIS_TOSTIERAS;
    }

    public int getRITHMIKO_ASFALIAS_TOSTIERAS() {
        return RITHMIKO_ASFALIAS_TOSTIERAS;
    }

    public int getANEMISTIRAS_STIXIOU_VITRINAS() {
        return ANEMISTIRAS_STIXIOU_VITRINAS;
    }

    public int getANEMISTIRAS_EKSOTERIKOS_VITRINAS() {
        return ANEMISTIRAS_EKSOTERIKOS_VITRINAS;
    }

    public int getRELES_ANEMISTIRA() {
        return RELES_ANEMISTIRA;
    }

    public int getMENTESES_PORTAS_VITRINAS() {
        return MENTESES_PORTAS_VITRINAS;
    }

    public int getANTISTASI_TOSTIERAS() {
        return ANTISTASI_TOSTIERAS;
    }

    public int getANTISTASI_FRITEZAS() {
        return ANTISTASI_FRITEZAS;
    }

    public int getDIAFORA_KOUMPIA() {
        return DIAFORA_KOUMPIA;
    }

    public int getMOTER_PSIGIOU_VITRINAS() {
        return MOTER_PSIGIOU_VITRINAS;
    }
}
