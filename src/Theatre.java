
public class Theatre {

    public static void main(String[] args) {
        // Создание актёров
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180.0);
        Actor actor2 = new Actor("Кристина", "Петрова", Gender.FEMALE, 170.0);
        Actor actor3 = new Actor("Александра", "Петрова", Gender.FEMALE, 173.0);
        Actor actor4 = new Actor("Евгений", "Сидоров", Gender.MALE, 175.0);

        // Создание режиссёра
        Director director1 = new Director("Анна", "Кузнецова", Gender.FEMALE, 15);
        Director director2 = new Director("Сергей", "Волков", Gender.MALE, 8);

        // Создание автора музыки и хореографа
        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Матильда", "Кшесинская", Gender.FEMALE);

        // Создание спектаклей
        Show regularShow = new Show("Гамлет", 120, director1);
        Opera operaShow = new Opera("Евгений Онегин", 180, director2, musicAuthor, "Текст либретто оперы Евгений Онегин", 30);
        Ballet balletShow = new Ballet("Лебединое озеро", 150, director1, musicAuthor, "Текст либретто балета Лебединое озеро", choreographer);

        // Добавляем актёров в спектакли
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);
        operaShow.addActor(actor1);
        operaShow.addActor(actor3);
        balletShow.addActor(actor2);
        balletShow.addActor(actor3);
        balletShow.addActor(actor4);


        // Вывод списка актёров для каждого спектакля
        regularShow.printActors();
        operaShow.printActors();
        balletShow.printActors();

        regularShow.printDirectorInfo();
        operaShow.printDirectorInfo();
        balletShow.printDirectorInfo();

        // Замена актёра в опере
        Actor newActor = new Actor("Елена", "Соколова", Gender.FEMALE, 168.0);
        operaShow.replaceActor(newActor, "Сидоров");
        operaShow.printActors();

        // Попытка заменить несуществующего актёра в балете
        balletShow.replaceActor(newActor, "Иванов");

        // Попытка заменить однофамильца в балете
        Actor newActor2 = new Actor("Екатерина", "Петрова", Gender.FEMALE, 168.0);
        balletShow.replaceActor(newActor2, "Петрова");


        // Выводим текст либретто для оперы и балета
        operaShow.printLibretto();
        balletShow.printLibretto();
    }
}
