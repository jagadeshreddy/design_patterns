package singleton;

public class DatabaseSync {
    private static DatabaseSync databaseSync = null;
    private DatabaseSync(){

    }
    public static DatabaseSync getDatabaseSync(){
        if(databaseSync == null){
            synchronized(DatabaseSync.class){
                if(databaseSync == null){
                    databaseSync = new DatabaseSync();
                    return databaseSync;
                }
            }
        }
        return databaseSync;
    }

}
