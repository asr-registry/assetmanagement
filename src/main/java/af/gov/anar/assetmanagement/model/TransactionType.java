package af.gov.anar.assetmanagement.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class TransactionType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private  boolean cashInvolved;
    private String transactionClass;
    private String rectroactiveAdjustmentType;
    private String intervenientType;
    private String predefinedDebitAccount;
    private String predefinedCreditAccout;
    private String allowedFinancialOperationType;
    private String debitAccountOrigin;
    private String creditAccountOrigin;
    private String language;
    private String name;
}
