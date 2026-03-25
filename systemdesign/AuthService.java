package systemdesign;


class AuthService {

    public boolean login(String username, String password) {

        // dummy check (real me DB use hoga)
        if(username.equals("vishal") && password.equals("1234")) {
            return true;
        }
        return false;
    }
}