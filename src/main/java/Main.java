public class Main {
    public static void main(String[] args) {
        User user = new User("Ivan", 66);
        System.out.println(user.getName());

        User user1 = new User("Ivan2", 88);
        System.out.println(user1.getAge());
        System.out.println(user1.getName());

    }
}
