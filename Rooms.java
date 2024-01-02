package hotel.rooms;

public class Rooms{
    public Rooms r1[] = new Rooms[50];
    private String roomNumber;

    //type 1 = premium deluxe room
    //type 2 = premium king room
    //type 3 = twin deluxe suite
    //type 4 = single deluxe suite
    private boolean isOccupied;
    private String type;

    public Rooms(String type, String roomNumber, boolean isOccupied){

        this.type=type;
        this.roomNumber=roomNumber;
        this.isOccupied=isOccupied;
    }

    public Rooms(){
        this.type="type";
        this.roomNumber="room number";
        this.isOccupied=false;
    }

    public void setRoomNumber(String roomNumber){this.roomNumber=roomNumber;}
    public void setOccupied(boolean isOccupied){this.isOccupied=isOccupied;}
    public void setType(String type) {this.type = type;}

    public String getRoomNumber(){return roomNumber;}
    public String getType() {return type;}
    public boolean getIsOccupied(){return isOccupied;}

    public double roomPrice() {
        double price = 0;
        if (getType() == "premium deluxe room")
            price = 320.0;
        else if (getType() == "premium king room") {
            price = 300.0;
        } else if (getType() == "twin deluxe suite")
            price = 280.0;
        else if (getType() == "single deluxe suite")
            price = 250.0;
        return price;
    }




    @Override

    public String toString(){

        return String.format("room:%s\nOccupied:%b\ndescription%s\nprice/night(without tax):%f\n",getRoomNumber(),getIsOccupied(),getType(),roomPrice());
    }
}
