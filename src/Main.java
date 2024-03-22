public class Main {
    //punto centrale per fare accedere tutti tramite getDb
    private static Database db;
//static: possiamo accedere anche senza creare un'istanza di questa classe
    public static Database getDb() {
        //se non abbiamo un database lo creiamo
        if (db == null) {
            db = new Database();
        }
        return db;
    }

    public static void main(String[] args) {
        Database localDB = getDb();
    }
}