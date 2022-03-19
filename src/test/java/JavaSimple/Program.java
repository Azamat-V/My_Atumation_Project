package JavaSimple;

public class Program {
    public static void main(String[] args) {
        int num = 3;
        System.out.println("Hello world");
        System.out.println(HelpedMethods.name("HI!!!", 2));
        System.out.println("Summa = " + HelpedMethods.sum(3, 6));
        System.out.println("Summa = " + HelpedMethods.sum(num, num));
        System.out.println("Summa " + num + " + " + num + " = " + HelpedMethods.sum(num, num));

        String qwe = new String("qwe");
        boolean result = qwe == HelpedMethods.parameter;//Сравнение одинаковых типов, но с разными адрессом в памяти возвращает "false"
        System.out.println(result);

        boolean result2 = qwe.equalsIgnoreCase(HelpedMethods.parameter);//Данный метод игнорирует разные адресса и возвращает true
        System.out.println(result2);

        //String qwe = "qwe";
        //boolean result = qwe == HelpedMethods.parameter;//Здесь одинаковые адреса в памяти и типы данных возвращает true
        //System.out.println(result);

        num = 5;
        //Ветвление//
        if(num == 3){
            System.out.println("We've done it!!");
        } else if (num == 4) {
            System.out.println("We've almost done it");
        } else if (num == 5){
                System.out.println("Nothing's done");
            }

        HelpedMethods hp = new HelpedMethods();
        System.out.println("radio = " + hp.switchRadio("Afro"));

        int index = 100;
        for (int x = 0; x <= index; x++){//Ветвление для счетчика в условии 3 блока
            x = x + 30;
            System.out.println(x);
        }

        //int value;
        //while (index<110){
            //value = 1 + index;
           //index = value + index;
            //System.out.println(value);}

        int value = 0;
        while(index < 110){// условие записывается в параметрах цикла, сначала проверяется условие должно быть true
            value++;//действие записывается в тело цикла выполняется действие, если условие true
            System.out.println("Hello");
            if (value == 4){
                break;//оператор break прерывает цикл//return; если break заменит на return то весь код который написан ниже не выполняетмся
            }
        }

        System.out.println("We've finished");

        do {
            System.out.println("We've finished");//сначала выполняется действие
            index = 1000;//сначала выполняется действие
        } while (index < 110);//потом проверяется условие  в параметрах
        }
    }


