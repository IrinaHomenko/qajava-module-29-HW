import org.example.Person;
import org.junit.Assert;
import org.testng.annotations.Test;

public class PersonTest {

    @Test(description = "Проверка на указанном диапозоне: тинейджер 13 - 19 лет включительно")
    public void basicLogic () {

        boolean resultBasic = Person.isTeenager(15);
        Assert.assertTrue(Person.isTeenager(15));
        System.out.println( "Тинейджер в 15 лет?- " + resultBasic);

    }
    @Test (description = "Проверка на границах входящих в диапозон ")
    public void inBoundaries () {
        boolean resultFirstBoundary = Person.isTeenager(13);
        Assert.assertTrue(Person.isTeenager(13));
        System.out.println("Тинейджер 13 лет? - " + resultFirstBoundary);

        boolean resultAfterFirstBoundary = Person.isTeenager(14);
        Assert.assertTrue(Person.isTeenager(14));
        System.out.println("Тинейджер в 14 лет? - " + resultAfterFirstBoundary);

        boolean resultBeforeSecondBoundary = Person.isTeenager(18);
        Assert.assertTrue(Person.isTeenager(18));
        System.out.println("Тинейджер в 18 лет? - " + resultBeforeSecondBoundary);

        boolean resultSecondBoundary = Person.isTeenager(19);
        Assert.assertTrue(Person.isTeenager(19));
        System.out.println("Тинейджер 19 лет - " + resultSecondBoundary);
    }

    @Test (description = "Проверка на границах невходящих в диапозон ")
    public void outOfBoundaries () {
        boolean resultBeforeFirstBoundary = Person.isTeenager(12);
        Assert.assertFalse(Person.isTeenager(12));
        System.out.println("Тинейджер до 13 лет? - " + resultBeforeFirstBoundary);

        boolean resultAfterSecondBoundary = Person.isTeenager(20);
        Assert.assertFalse(Person.isTeenager(20));
        System.out.println("Тинейджер после 20 лет? - " + resultAfterSecondBoundary);
    }

    @Test (description = "Проверка на невалидных данных")
    public void invalidData(){
        boolean resultZero = Person.isTeenager(0);
        Assert.assertFalse(Person.isTeenager(0));
        System.out.println("Новорожденные это тинейджеры? - " + resultZero);

        boolean resultInvalid = Person.isTeenager(-6);
        Assert.assertFalse(Person.isTeenager(-6));
        System.out.println("Люди несуществующего возраста тинеджеры? - " + resultInvalid);
    }
}