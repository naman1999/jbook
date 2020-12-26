package InheritanceDemo;

public class VIPMember extends Member {
    public VIPMember(String pName, int pMemberID, int pMemberSince){
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }

    @Override
    public void calculaterAnnualFee(){
        annualFee = (1-0.01*getDiscount())*1200;
    }
}
