package ext;

public class Cats extends Animals implements Color {//"extends" нужен для связи класса "Animals" с классом "Cats". "implements" нужен для связи(переопределения)метода из интерфейса "Color"
    public Cats(String name) {
        super(name);//конструктор для обрашения к классу Родителю "Animals" ключевое слово "Super"
    }

    public void  say(){
        System.out.println("Myu");
    }

    @Override
    public void getColor() {
        System.out.println("Black");
    }
}

