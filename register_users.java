import java.util.List;
import java.util.ArrayList;


public class register_users {

    public static void main(String[] args){
    User uuu = new User("Hilbert", "Jamie", 44);

    inheritance teacher_type= new inheritance();

    teacher_type.set_first_name("Henry");
    teacher_type.set_last_name("Boston");
    teacher_type.set_user_type(inheritance.user_type.Teacher);
    teacher_type.set_age(94);
    teacher_type.set_gender(true);


    List<User> list_of_users = new ArrayList<User>();

    list_of_users.add(uuu);
    list_of_users.add(new User("Mason", "Yellow" , 44));


    list_of_users.add(teacher_type);
    
    System.out.println(list_of_users);


}
}