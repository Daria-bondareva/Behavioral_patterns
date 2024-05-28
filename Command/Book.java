package Behavioral_patterns.Command;

public class Book {
    public void add(){
        System.out.println("Додаємо книгу");
    }
    public void delete(){
        System.out.println("Видаляємо книгу");
    }
    public void changeStatus(){
        System.out.println("Змінюємо статус прочитання");
    }
    public void changeRating(){
        System.out.println("Змінюємо рейтинг книги");
    }
    public void addComment(){
        System.out.println("Додаємо коментар");
    }
}
