package pl.coderslab.entity;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        User newUser = new User();
        newUser.setUsername("Zola");
        newUser.setEmail("Zola@visa.com");
        newUser.setPassword("password");

        userDao.create(newUser);
        System.out.println("User Id created: " + newUser.getId());

        User readUser = userDao.read(newUser.getId());
        if (readUser != null) {
            System.out.println("User: " + readUser.getUsername());

        }


        readUser.setUsername("zola_new");
        userDao.update(readUser);
        System.out.println("Upadted.");


        User[] allUsers = userDao.findAll();
        for (User u : allUsers) {
            System.out.println(u.getId() + ": " + u.getUsername() + " (" + u.getEmail() + ")");
        }


        //userDao.delete(readUser.getId());
        //System.out.println("delated");
    }
}

