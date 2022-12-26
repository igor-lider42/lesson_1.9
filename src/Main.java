public class Main {
//1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и
// годе публикации. Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
//2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
//3. Написать конструкторы для обоих классов, заполняющие все поля.
//4. Создать геттеры для всех полей автора и всех полей книги.
//5. Создать сеттер для поля «Год публикации» у книги.
//6. В методе main создать несколько объектов Книга (достаточно двух) и
// несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга.
// Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
//    Метод main не должен находиться в классах Book и Author.
//    Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
//7. В том же методе main изменить год публикации одной из книг с помощью сеттера.


    public static void main(String[] args) {
        String nameJohn = "John";
        int ageJohn = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя - " + names[i] + " Возраст - " + ages[i]);
        }
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John", 13);

        System.out.println("Лёгкий уровень");
        Author stephenKing = new Author("Stephen", "King");
        Book firstBook = new Book("Desperation", stephenKing, 1997);

        Book secondBook = new Book("Effective Java", new Author("Joshua", "Bloch"), 2015);
        firstBook.setPublishYear(2020);
        System.out.println(firstBook.getPublishYear());


    }
}