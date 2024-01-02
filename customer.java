package hotel.customer;

public class customer extends Date {
    private String customerFullName;
    private String Email;
    private String gender;

    public customer(String customerFullName, String gender, String email, int day, int month, int year) {
        super(day,month,year);
        this.customerFullName= customerFullName;
        this.gender = gender;
        this.Email = email;
    }

    public customer (){
        super();
        this.customerFullName = "name";
        this.gender = "male";
        this.Email="email@example.com";

    }
    public void setCustomerFullName(String customerFullName){this.customerFullName=customerFullName;}
    public void setEmail(String email){this.Email =email;}
    public void setGender(String g){this.gender=g;}

    public String getCustomerFullName(){return customerFullName;}
    public String getEmail(){return Email;}
    public String getGender(){return gender;}
    public String getDob(){return super.toString();}

}
