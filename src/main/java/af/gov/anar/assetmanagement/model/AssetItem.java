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
public class AssetItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private String code;
    private String workflowStatus;
    private int fiscalYear;
    private int fiscalPeriod;
    private boolean hasWarranty;
    private boolean inPhysicalCount;
    private boolean inTransit;
    private String postingStatus;
    private String temp;
    private String notPostedReason;
    private String assetItemOrigin;
    private String postedOn;
    private String item;
    private Asset asset;
    private AssetItem parentItem;
    private int usefulLife;
    private int quantity;
    private String itemOwnershipType;
    private String usedFrom;
    private String receiptDate;
    private String manufacturedOn;
    private String assetCountLastDate;
    private String itemValueCalculation;
    private Double originalCost;
    private Double currentValue;
    private Double salvageValue;
    private Double replacementCost;
    private Double bookValue;
    private int usefulLifeUOM;
    private String unitOfMeasure;
    private ItemGroup itemGroup;
    private String lastEvaluationPhysicalCondition;
    private String itemOperationalStatus;
    private String itemType;
    private String brand;
    private String brandModel;
    private String acquisition;
    private String institution;
    //remained


}
