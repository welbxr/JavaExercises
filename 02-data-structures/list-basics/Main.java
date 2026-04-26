void main()
{

    ArrayList<User> users = new ArrayList<>();

    var user = new User(1, "João");
    users.add(user);
    users.add(new User(5, "Carlos"));
    users.add(new User(8, "Michel"));
    users.add(new User(3, "Marcos"));

    users.add(user);
   System.out.println(users);
}