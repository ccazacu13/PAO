package Library;

import Person.*;

import java.util.*;

public class Library {
    private static int id;

    private final int library_id;

    private String name, phone, email;

    private Address address;

    private int book_count;

    Map<Integer, Person> readers = new HashMap<>();

    public Library(){
        this.library_id = id++;
    }

    public Library(String name, String phone, String email, Address address, int book_count) {
        this.library_id = id++;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.book_count = book_count;
    }

    public void read_library(Scanner scanner){
//        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("Phone: ");
        this.phone = scanner.nextLine();
        System.out.print("Email: ");
        this.email = scanner.nextLine();

        boolean check = true;
        while(check) {
            try {
                System.out.print("Book count: ");
                this.book_count = Integer.parseInt(scanner.nextLine());
                check = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println("This is not a valid number!");
            }
        }
        System.out.println("Address: ");
        this.address = new Address();
        this.address.read_address(scanner);

//        scanner.close();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getBook_count() {
        return book_count;
    }

    public void setBook_count(int book_count) {
        this.book_count = book_count;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library_id=" + library_id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", book_count=" + book_count +
                '}';
    }

}