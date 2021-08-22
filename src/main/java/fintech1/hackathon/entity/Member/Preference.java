package fintech1.hackathon.entity.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
@Getter
public class Preference {
    @Id
    @Column(name = "seq")
    Long seq;

    @Column(name = "email")
    private String email;

    @Column(name = "riskTaking")
    private String riskTaking;

    @Column(name = "savings")
    private boolean savings;

    @Column(name = "stock")
    private boolean stock;

    @Column(name = "alternative")
    private boolean alternative;

    @Column(name = "card")
    private boolean card;

    @Column(name = "insurance")
    private boolean insurance;

    @Column(name = "pension")
    private boolean pension;

    @Column(name = "loan")
    private boolean loan;

    @Column(name = "food")
    private boolean food;

    @Column(name = "fresh")
    private boolean fresh;

    @Column(name = "cleaning")
    private boolean cleaning;

    @Column(name = "householdGoods")
    private boolean householdGoods;

    @Column(name = "liquor")
    private boolean liquor;

    @Column(name = "contents")
    private boolean contents;

    @Column(name = "pet")
    private boolean pet;

    @Builder
    public Preference(String email, String riskTaking, boolean savings, boolean stock, boolean alternative, boolean card, boolean insurance, boolean pension, boolean loan, boolean food, boolean fresh, boolean cleaning, boolean householdGoods, boolean liquor, boolean contents, boolean pet) {
        this.email = email;
        this.riskTaking = riskTaking;
        this.savings = savings;
        this.stock = stock;
        this.alternative = alternative;
        this.card = card;
        this.insurance = insurance;
        this.pension = pension;
        this.loan = loan;
        this.food = food;
        this.fresh = fresh;
        this.cleaning = cleaning;
        this.householdGoods = householdGoods;
        this.liquor = liquor;
        this.contents = contents;
        this.pet = pet;
    }
}
