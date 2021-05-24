import java.io.File;
import java.util.*;

// NID, Passport, first last name, DoB

public class task_01 {
    public static void main(String[] args) {

        ArrayList<Citizen> citizens = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        try{
            File file = new File("C:\\Users\\tanvi\\IdeaProjects\\SDLCpro-01\\src\\citizen.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){

                int passport = scanner.nextInt();
                int NID = scanner.nextInt();
                String firstName = scanner.next();
                String lastName = scanner.next();
                String birthday = scanner.next();

                // create an object
                Citizen citizen = new Citizen(passport,NID,firstName,lastName,birthday);
                System.out.println(citizen);

                // insert into arraylist
                citizens.add(citizen);

                //insert into map(NID,Passport)
                for(Citizen c : citizens){
                    //check if multiple passport is available 
                    hashMap.put(c.NID,c.passport);
                }

            }

            System.out.println(citizens);
            System.out.println("END");

        }catch(Exception e){
            System.out.println("File not found");
        }
    }
}


class Citizen{
    int passport;
    int NID;
    String firstName;
    String lastName;
    String birthday;

    public Citizen(int passport, int NID, String firstName, String lastName, String birthday) {
        this.passport = passport;
        this.NID = NID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "passport='" + passport + '\'' +
                ", NID='" + NID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
