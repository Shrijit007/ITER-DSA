package DSAProject;
import java.util.Scanner;

class Date{
    private int day,year;
    private String month;
    Date(int d,String m,int y){
        day=d;
        month=m;
        year=y;
    }
    public String dateDisplay() {
        return day + "-" + month + "-" + year;
    }
    public static Boolean dateCompare(Date input,Date comp){
        if(input.year < comp.year)
            return true;
        else if(input.year == comp.year){
            if(convertMonth(input.month) < convertMonth(comp.month))
                return true;
            else if(convertMonth(input.month) == convertMonth(comp.month)){
                if(input.day < comp.day){
                    return true;
                }
            }
        }
        return false;
    }

    public static int convertMonth(String monthName) {
        int monthNumber;
        switch (monthName.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = -1;
                break;
        }
        return monthNumber;
    }
}

class golfClub{
    public int MemberID,Coach,Handicap;
    public String LastName,FirstName,Team,MemberType;
    public char Gender;
    public long Phone;
    public Date JoinDate;
    golfClub(int ID,String fname, String lname,int hc,char g,String t,String memtype,int c,long ph,Date d){
        MemberID=ID;
        FirstName=fname;
        LastName=lname;
        Handicap=hc;
        Gender=g;
        Team=t;
        MemberType=memtype;
        Coach=c;
        Phone=ph;
        JoinDate=d;
    }
    public void display() {
        String format = "| %-9s | %-10s | %-10s | %-8d | %-6s | %-10s | %-12s | %-6s | %-10s | %-10s |%n";
        System.out.format("+-----------+------------+------------+----------+--------+------------+--------------+--------+------------+------------+%n");
        System.out.printf(format, MemberID, LastName, FirstName, Handicap, Gender, Team, MemberType, Coach, Phone, JoinDate.dateDisplay());
        System.out.format("+-----------+------------+------------+----------+--------+------------+--------------+--------+------------+------------+%n");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of members: ");
        int n = sc.nextInt();
        golfClub member[] = new golfClub[n];
        int date = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of member " + (i + 1) + "/" + n);
            System.out.print("Enter Member ID: ");
            int id = sc.nextInt();
            System.out.print("Enter First Name: ");
            String fname = sc.next();
            System.out.print("Enter Last Name: ");
            String lname = sc.next();
            System.out.print("Enter Handicap: ");
            int hc = sc.nextInt();
            System.out.print("Enter Gender: ");
            char g = sc.next().charAt(0);
            System.out.print("Enter Team: ");
            String t = sc.next();
            System.out.print("Enter Member Type: ");
            String mtype = sc.next();
            System.out.print("Enter Coach: ");
            int c = sc.nextInt();
            System.out.print("Enter Phone Number: ");
            long ph = sc.nextLong();
            System.out.print("Enter Join Date(DD/MM/YY): ");
            date = sc.nextInt();
            String month = sc.next();
            int year = sc.nextInt();
            Date d = new Date(date, month, year);
            member[i] = new golfClub(id, fname, lname, hc, g, t, mtype, c, ph, d);
        }
        //display
        String format = "| %-9s | %-10s | %-10s | %-8s | %-6s | %-10s | %-12s | %-6s | %-10s | %-10s |%n";
        System.out.format("+-----------+------------+------------+----------+--------+------------+--------------+--------+------------+------------+%n");
        System.out.printf(format, "Member ID", "Last Name", "First Name", "Handicap", "Gender", "Team", "Member Type", "Coach", "Phone", "Join Date");
        for (int i = 0; i < n; i++) {
            member[i].display();
        }
        //date compare
        Date s2 = new Date(7,"april",2009);
        System.out.println("Records where member's Join Date is earlier than 7 April 2009");
        for (int i = 0; i < n; i++) {
            if(member[i].JoinDate.dateCompare(member[i].JoinDate,s2))
                member[i].display();
        }
        //handicap score less than 12
        System.out.println("Records where member's Handicap score is less than 12");
        for (int i = 0; i < n; i++) {
            if(member[i].Handicap<12)
                member[i].display();
        }
        //female and belongs to team b
        System.out.println("Records where member's are female and belongs to team B");
        for (int i = 0; i < n; i++) {
            if(((member[i].Gender=='f')||(member[i].Gender=='F')) && (member[i].Team.equals("TeamB")))
                member[i].display();
        }
    }
}
