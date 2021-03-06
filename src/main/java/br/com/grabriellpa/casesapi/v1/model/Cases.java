package br.com.grabriellpa.casesapi.v1.model;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cases {

    @Id
    @SequenceGenerator(
            name = "case_occurrence_sequence",
            sequenceName = "case_occurrence_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "case_occurrence_sequence"
    )
    private Long id;
    private String date;
    private String numberOfCases;
}
