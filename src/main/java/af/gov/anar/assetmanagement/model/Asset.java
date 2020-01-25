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
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private boolean component;
    private boolean movable;
    private boolean handleDepreciation;
    private boolean qualifiable;
    private int usefulLife;
    private int totalPeriodsToDepreciate;
    private int salvageValuePercentage;
    private String parentClass;
    private String depreciationMethod;
    private String unitOfMeature;
    private int usefulLifeUOM;
    private String ReferenceDate;
    private String customDomainType;
    private String language;
    private String name;
    private String description;
    private String accumulatedDepreciationCoding;
    private String codingBlock;
    private String revolutionSurplusCoding;
    private String expenseCodingBlock;
    private String inheratDepreciationModeFrom;
}
