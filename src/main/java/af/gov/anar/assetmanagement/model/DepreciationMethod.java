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
public class DepreciationMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private boolean active;
    private boolean ratesRequired;
    private  String predefinedMethodType;
    private String language;
    private String abbreviation;
    private String description;
}
