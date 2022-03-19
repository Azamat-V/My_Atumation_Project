package JavaSimple;

public class HelpedMethods {

    final static String parameter = "qwe";

    public static String name(String word, int value) {
        String nameForReturn = word;
        return nameForReturn;

    }

    private String prefix (String pref){
        return pref;

    }

    protected String surfix (String suf){

        return suf;
    }

    String lost(){

        return "lost";
    }

    static int sum (int a, int b){
        return a+b;
    }
    //Ветвление//
    public String switchRadio (String radioName){
        String radio;
        switch (radioName){
            case "Afro" :
                radio = "100.2";
                break;
            case "Auto" :
                radio = "106.1";
                break;
            default:
                radio = "We don't know this radio";
        }

        return radio;

    }

    public String switchRadioNewWave(String radioName){
        String radio;

        radio = switch (radioName){
            case "Afro" -> "100.2";
            case "Auto" -> "106.1";
            default -> "We don't know this radio";
        };
        return radio;
    }
}

