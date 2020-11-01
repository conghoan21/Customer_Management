import java.util.ArrayList;
import java.util.List;

public class DB {
    public static int ID=0;
    private static List<Customer> list = new ArrayList<>();

    static {
        initData();
    }

    private static void initData(){
        add(new Customer("Luong","Tuan","012345678","Ha Noi"));
        add(new Customer("Nguyen","Tuan","365874423","Ha Noi"));
        add(new Customer("Do","Nam","5465231846","Nam Dinh"));
        add(new Customer("Truong","Chung","012634875","Nam Dinh"));
        add(new Customer("Nguyen","Thanh","132156423","Ha Noi"));
    }

    public static void add(Customer customer) {
        list.add(customer);
    }

    public static void edit(Customer customer) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == customer.getID()) {
                list.set(i, customer);
            }
        }
    }

    public static void delete(int ID) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == ID) {
                list.remove(list.get(i));
            }
        }
    }

    public static List<Customer> getList(){
        return list;
    }

    public static Customer getCustomerByID(int ID){
        for (Customer temp: list){
            if(temp.getID() == ID){
                return temp;
            }
        }
        return null;
    }
}
