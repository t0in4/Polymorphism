import compiletime.New;
import myth.Chimera;
import myth.Dragon;
import myth.MythicalAnimal;
import runtime.Next;
import runtime.Precedence;

public class Main {
    public static void main(String[] args) {

        New newInstance1 = new New();
        New newInstance2 = new New(1,2,3);
        New newInstance3 = new New(0.1f, 0.2f, 0.3f);
        New newInstance4 = new New("1", "2", "3");

        // полиморфизм рантайма основывается на двух принципах:
        // 1. ссылочная переменная суперкласса (родительского) может ссылаться
        //    на любой объект наследник (подкласс)
        // 2. метод суперкласса (родительского) может быть переписан
        //    в подклассе.
        Precedence precedenceInstance = new Precedence(10, 2, 3);
        Next nextInstance = new Next(10, 2, 3);
        Precedence mixInstance = new Next(10, 2, 3);

        System.out.println(precedenceInstance.calculate(4,5,6));
        System.out.println(nextInstance.calculate(4,5,6));
        System.out.println(mixInstance.calculate(7, 8, 9));

        // package myth
        MythicalAnimal chimera = new Chimera();
        MythicalAnimal dragon = new Dragon();
        MythicalAnimal animal = new MythicalAnimal();

        chimera.hello();
        dragon.hello();
        animal.hello();
    }
}