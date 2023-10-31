package home6;

public abstract class Teacher {
//  сделала класс абстрактным
    protected String firstName;
    protected String lastName;
//  сделала поля защищёнными

    protected Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

// Убрал возможность получать и переписывать защищённые поля (класс закрыт для модификаций, открыт для расширений)
// Избавился от неиспользуемых функций

}
