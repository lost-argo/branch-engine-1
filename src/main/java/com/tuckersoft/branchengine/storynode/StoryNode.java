package com.tuckersoft.branchengine.storynode;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@Entity
@Table(name = "story_nodes")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class StoryNode {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 40)
    private String nodeCode;

    @Column(nullable = false, length = 80)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String sceneText;

    @Column(nullable = false)
    private Integer branchCapacity;

    @Column(nullable = false)
    private Integer currentBranches;

    private String primaryBranchCode;
    private String glitchBranchCode;

    @Column(nullable = false)
    private Instant createdAt;
}
