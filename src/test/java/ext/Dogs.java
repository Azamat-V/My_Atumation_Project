package ext;

public class Dogs extends Animals implements Color{//"extends" нужен для связи класса "Animals" с классом "Dogs". "implements" нужен для связи(переопределения)метода из интерфейса "Color".
    //Для связи с классом родителем переопределять методы не нужно. Для связи с интерфейсом нужно применять implements.
    public Dogs(String name) {//конструктор для связи(обрашения) к классу Родителю "Animals" ключевое слово "Super"
        super(name);
    }

    public void say(){
        System.out.println("Gav");
    };

    @Override//переопределение реализации метода из интерфейса "Color"
    public void getColor() {
        System.out.println("White");
    }
}
