package ext;

public class Animals {
    private String name;

    public Animals(String name){
        this.name = name;//ключевое слово "this"
    }


    public void eat(){
        System.out.println("omnomnom");
    }

    public String getname(){
        return  name;
    }

    public void setName(String name){
        this.name = name;//ключевое слово "this"
    }
}
