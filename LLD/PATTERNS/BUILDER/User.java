
public class User {}
    private String name;
    private int rollNum;
    private String place;
    private int age;
    public void User(Builder b){
        this.name = b.name;
        this.rollNum = b.rollNum;
        this.place = b.place;
        this.age = b.age;
    }

    class Builder{
        static String name;
        static int rollNum;
        static String place;
        static int age;
        public static Builder(String name, int rollNum){
            this.name = name;
            this.rollNum = rollNum;
        }

        public Builder place(String place){
            this.place = place;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
