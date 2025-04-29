public class User {
    private String first_name;
    private String last_name;
    private int age;
    
    public User(){

    }


    public User(String first_name, String last_name, int age){
        set_first_name(first_name);
        set_last_name(last_name);
        set_age(age);
    }

    public String toString(){
        return get_first_name() + " " + get_last_name();
    }



    public enum Lastname{
        Keeper , Hawk , Dillion  
    }

    void set_first_name(String first_name){
      this.first_name=first_name;
    }
    void set_last_name(String last_name){
      this.last_name=last_name;
    }
    
    void set_last_name(Lastname last_name){

        this.last_name=last_name.name();
    }

    void set_age(int age){
      this.age=age;
    }
    String get_first_name(){
      return first_name;
    }
    String get_last_name(){
      return last_name;
    }
    int get_age(){
      return age;
    }
    
}
