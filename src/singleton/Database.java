package singleton;

public class Database {
    private Database database  = new Database();
    private Database(){

    }
    public Database getDatabaseInstance(){
       return database;
    }
}
