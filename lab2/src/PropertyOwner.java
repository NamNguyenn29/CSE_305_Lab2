import java.util.ArrayList;
import java.util.Scanner;

public class PropertyOwner {
    private static Scanner sc = new Scanner(System.in);

    private User User;
    private ArrayList<Property> listOfProperties;

    public PropertyOwner() {

    }

    public PropertyOwner(User user, ArrayList<Property> listOfProperties) {
        User = user;
        this.listOfProperties = listOfProperties;
    }

    public void addProperty(Property property) {
        this.listOfProperties.add(property);
    }

    public void removeProperty(Property property) {
        for (int i = 0; i < listOfProperties.size(); i++) {
            if (listOfProperties.get(i).getPropertyID() == property.getPropertyID()) {
                listOfProperties.remove(i);
                break;
            }
        }
    }
}
