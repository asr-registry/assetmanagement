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
public class TransactionCustomAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private boolean active;
    private String codingBlock;
    private String language;
    private String name;
    private  boolean usedOnTransfer;
}
