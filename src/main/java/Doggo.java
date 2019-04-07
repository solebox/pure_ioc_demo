public class Doggo implements Borkable {

    private String name;
    private Integer age;

    public static void Doggo(){
        System.out.println("Doggo constructor");
    }

    @Override
    public void bork() {
        System.out.println(this.name + "(age: "+ this.age + ") Bork Bork!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}
