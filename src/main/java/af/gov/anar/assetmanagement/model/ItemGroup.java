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
public class ItemGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private boolean isDefault;
    private  String language;
    private String abbreviation;
    private String purpose;
}
