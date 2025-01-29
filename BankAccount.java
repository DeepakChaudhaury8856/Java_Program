import java.util.Scanner;

public class BankAccount {
    public int bal;
    String ANo;
    String Aty;

    BankAccount(String ANo, String Aty, int bal) {
        this.ANo = ANo;
        this.Aty = Aty;
        this.bal = bal;
    }

    public void Deposite(String ANo1) {
        if (ANo.equals(ANo1)) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter Balance");
            int Dbal1 = Integer.parseInt(sc2.nextLine());
            bal += Dbal1;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Account Number is not Found");
        }

    }

    public void Withdraw(String ano2) {
        Scanner sc2 = new Scanner(System.in);
        if (ANo.equals(ano2)) {
            System.out.println("Enter Balance");
            int bal1 = Integer.parseInt(sc2.nextLine());
            if (bal1 <= bal) {
                bal -= bal1;
                System.out.println("Withdraw Successful" + "\n" + "Your balance :" + bal);
            } else {
                System.out.println("Balance is not sufficent ");
            }

        } else {
            System.out.println(" Account Number is not Found");
        }
    }

    void DBal() {
        System.out.println("Your Account Balance is :" + bal);
    }

    void Display() {
        System.out.println("ANo:" + ANo);
        System.out.println("ATy:" + Aty);
        System.out.println("bal:" + bal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number");
        String AcN = sc.nextLine();
        System.out.println("Enter Account Type");
        String ATY = sc.nextLine();
        System.out.println("Enter Balance");
        int bal = Integer.parseInt(sc.nextLine());

        BankAccount obj = new BankAccount(AcN, ATY, bal);
        System.out.println("Choise which opration are performce");
        System.out.println("1.Deposite");
        System.out.println("2.Withdraw");
        System.out.println("3.Check balance");
        System.out.println("5.exit");
        System.out.println("4.Account Detail");

        do {
            String op = sc.nextLine();
            if (op.equals("1")) {
                System.out.println("Enter Account Number");
                String Acn = sc.nextLine();

                obj.Deposite(Acn);
            } else if (op.equals("2")) {
                System.out.println("Enter Account Number");
                String acn = sc.nextLine();

                obj.Withdraw(acn);

            } else if (op.equals("3")) {
                obj.DBal();
            } else if (op.equals("4")) {
                obj.Display();
            } else if (op.equals("5")) {
                System.exit(0);

            } else {
                System.out.println("Please Enter Valid opation");
            }

            System.out.println("Choise which opration are performce");

        } while (true);

    }

}
