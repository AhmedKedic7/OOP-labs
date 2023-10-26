package lecture;

import java.util.Date;

public class CreditCard {
    private int cardNo;
    private Date issueDate;
    private String cvc;
    private double balance;
    private CardType cardType;

    private CardIssuer cardIssuer;

    public CreditCard(int cardNo, Date issueDate, String cvc, double balance, CardType cardType, CardIssuer cardIssuer) {
        this.cardNo = cardNo;
        this.issueDate = issueDate;
        this.cvc = cvc;
        this.balance = balance;
        this.cardType = cardType;
        this.cardIssuer = cardIssuer;
    }

    public CreditCard(double balance) {
        this.balance = balance;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardIssuer getCardIssuer() {
        return cardIssuer;
    }

    public void setCardIssuer(CardIssuer cardIssuer) {
        this.cardIssuer = cardIssuer;
    }
}
