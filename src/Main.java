import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        //        Задача A.
        //  Создать класс «Дни недели».
        //  Этот класс является ключом(key) в LinkedHashMap
        //  Значением (value) является Integer
        //  Случайно выбрать 100 дней в году.
        //  Посчитать сколько раз какой из дней выпадал.
        //  Например
        //        выбран 15февр, это пятница. Пт+1.
        //        Выбран 16 февр, это суббота. Сб+1


        Map< DayOfWeek , Integer> map = new LinkedHashMap<>();
        map.put(DayOfWeek.MONDAY,0);
        map.put(DayOfWeek.TUESDAY,0);
        map.put(DayOfWeek.WEDNESDAY,0);
        map.put(DayOfWeek.THURSDAY,0);
        map.put(DayOfWeek.FRIDAY,0);
        map.put(DayOfWeek.SATURDAY,0);
        map.put(DayOfWeek.SUNDAY,0);

        Random random = new Random();

        for(int i=0; i<100; i++){
            LocalDate date = LocalDate.ofYearDay(2022, random.nextInt(365)+1);
            map.put(date.getDayOfWeek(),map.get(date.getDayOfWeek())+1);
            System.out.println("выбран "+date+", это"+date.getDayOfWeek().name()+" + 1");
        }
        System.out.println(map);
    }
}
