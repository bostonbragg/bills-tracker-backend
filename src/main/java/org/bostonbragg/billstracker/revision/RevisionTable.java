package org.bostonbragg.billstracker.revision;

import jakarta.persistence.*;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@RevisionEntity
@Entity
@Table(name = "revision")
@Component
public class RevisionTable {
    @Column(name = "revision_id")
    @Id
    @GeneratedValue
    @RevisionNumber
    @SequenceGenerator(name = "revision_seq", sequenceName = "revision_seq", allocationSize = 1)
    private int revisionId;

    @Column(name = "created_timestamp")
    @RevisionTimestamp
    private LocalDateTime createdTimestamp;

}
