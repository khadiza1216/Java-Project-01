import java.time.LocalDate;
public class reservation {
    protected String name;
    protected String id;
    protected LocalDate date;

    reservation(String name, String id, LocalDate date){
    this.name= name;
    this.id= id;
    this.date= date;
    }
     void checkreservation(){
        System.out.println("name :"  +name);
        System.out.println("id:"  +id);
        System.out.println("date :"  +date);
        System.out.println("status : confirmed" );

     }
     void modifyreservation(String newname, LocalDate newdate){
        this.name = newname;
        this.date = newdate;
        System.out.println("Reservation modified successfully.");
     }
}

class resortreservation extends reservation{
    protected String roomnumber;

    resortreservation(String name, String id, LocalDate date, String roomnumber){
        super(name, id, date);
        this.roomnumber= roomnumber;
    }
    @Override
    void checkreservation (){
        super.checkreservation();
        System.out.println("room number: " +roomnumber);
    }
    
void modifyreservation (String newname, LocalDate newdate, String newroomnumber){
super.modifyreservation(newname, newdate);
this.roomnumber= newroomnumber;
System.out.println("updated successfully");
}
}

class railwayreservation extends reservation {

    protected String seatnumber;

    railwayreservation(String name, String id, LocalDate date, String seatnumber){
        super(name, id, date);
        this.seatnumber= seatnumber;
    }
    @Override
    void checkreservation (){
        super.checkreservation();
        System.out.println("seat number: " +seatnumber);
    }
void modifyreservation (String newname, LocalDate newdate, String newseatnumber){
super.modifyreservation(newname, newdate);
this.seatnumber= newseatnumber;
System.out.println("updated successfully");
}
}


class Main{
public static void main(String[] args) {
    

    resortreservation r1 = new resortreservation("khadiza", "ab3748", LocalDate.now(), "d47");
    r1.checkreservation();
    System.out.println();
    r1.modifyreservation("fatema",LocalDate.of(2024, 12, 25),"A22");
    r1.checkreservation();
    System.out.println();


    railwayreservation r2 = new railwayreservation("akbar", "cd456", LocalDate.now(), "w19" );
    r2.checkreservation();
    System.out.println();
    r2.modifyreservation("joynal",LocalDate.of(2024, 12, 26),"c22");
    r2.checkreservation();
    System.out.println();
}
}
