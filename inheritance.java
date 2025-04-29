public class inheritance extends User {
    private String user_type;
    private boolean Gender;


    void set_user_type(user_type user_type){
            this.user_type= user_type.name();
        }
    String get_user_type(){
        return user_type;
    }

    void set_gender(Boolean Gender){
            this.Gender= Gender;
        }
    boolean get_gender(){
        return Gender;
    }
 
    public enum user_type{
        Teacher, Student
    }


}
