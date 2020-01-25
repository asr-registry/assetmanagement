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
public class DifferenceReason {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private boolean differenceActive;
    private String language;
    private String shortDescription;
    private String description;
}
