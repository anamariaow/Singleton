public class MainDue {
    public void start() {
  //      Main main = new Main()
  // uso Main che è un'istanza static e posso accederci direttamente con la classe e non creando new Main, quindi no main.getDb()
        Database db = Main.getDb();
    }
}
