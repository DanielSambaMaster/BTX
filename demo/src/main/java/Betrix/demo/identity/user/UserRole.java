package Betrix.demo.identity.user;

public enum UserRole {

    FULLACESS(0),SUPERVISOR(1),AGENT(3);



    private int userRole;
    UserRole(int userRole){
        this.userRole =userRole;
    }

    public int getUserRole() {
        return this.userRole;
    }
}
