package Homework.Lesson1;

public class Lesson_1_Cycle {
    public String switchRadio(String radioName){
        String radio;
        switch (radioName){
            case "1 canal":
                radio = "101.6FM";
                break;
            case "Europa+":
                radio = "106.00FM";
                break;
            default:
                radio = "Undefind";
        }
        return radio;
    }

    public String switchRadioNewWave(String radioname){
        String radio;

        radio = switch(radioname){
            case "1 canal" -> "101.6FM";
            case "Europa" -> "106.00FM";
            default -> "Undefind";
        };
        return radio;
    }
}
