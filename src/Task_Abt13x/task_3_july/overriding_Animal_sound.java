package Task_Abt13x.task_3_july;


class Animal{
    void sound()
    {
        System.out.println("sound");
    }
}
class dog extends Animal{
    @Override
    void sound() {
        System.out.println("bark");
    }
}
class cat extends Animal
{
    @Override
    void sound() {
        System.out.println("meow");
    }
}
class cow extends Animal{
    @Override
    void sound() {
        System.out.println("mooo");
    }
}
public class overriding_Animal_sound {
    public static void main(String[] args) {

        Animal a=new Animal();
        a.sound();

        Animal d=new dog();
        d.sound();



        cat c=new cat();
        c.sound();

        cow co=new cow();
        co.sound();

    }
}
