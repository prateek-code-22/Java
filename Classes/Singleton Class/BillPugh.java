package Classes.Singleton Class;

public class BillPugh {
    private BillPugh(){}

    //nested class doesnt get loaded when compile 
    private static class BillPughHelper{
        private static final BillPugh instant_obj = new BillPugh();
    }

    public static BillPugh getInstance(){
        return BillPughHelper.instant_obj;
    }
}
