import dao.ClientDAO;
import dao.GenericDAO;
import dao.UserDAO;
import domain.ClientDomain;
import domain.UserDomain;

public class Main {

    private static final GenericDAO<Integer, UserDomain> userDAO = new UserDAO();
    private static final GenericDAO<String, ClientDomain> clientDAO = new ClientDAO();

    public static void main (String[] args)
    {
        System.out.println("==========UserDAO===========");
        var user = new UserDomain(1,"João", 36);
        System.out.println(userDAO.count());
        System.out.println(userDAO.save(2,user));
        System.out.println(userDAO.findAll());
        System.out.println(userDAO.find(d -> d.getId().equals(1)));
        System.out.println(userDAO.find(d -> d.getId().equals(2)));
        System.out.println(userDAO.count());
        System.out.println(userDAO.delete(new UserDomain(-1, "", -1)));
        System.out.println(userDAO.delete(user));
        System.out.println(userDAO.findAll());
        System.out.println(userDAO.count());
        System.out.println("=======fimUserDAO=======");

        System.out.println("==========ClientDAO===========");
        var client = new ClientDomain("A", "Maria", 21);
        System.out.println(clientDAO.count());
        System.out.println(clientDAO.save(1, client));
        System.out.println(clientDAO.findAll());
        System.out.println(clientDAO.find(d -> d.getId().equals("A")));
        System.out.println(clientDAO.find(d -> d.getId().equals("2")));
        System.out.println(clientDAO.count());
        System.out.println(clientDAO.delete(new ClientDomain("C", "", -1)));
        System.out.println(clientDAO.delete(client));
        System.out.println(clientDAO.findAll());
        System.out.println(clientDAO.count());
        System.out.println("=======fimClientDAO=======");


    }
}