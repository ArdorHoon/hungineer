package com.portfolio.hungineer.domain.entity

import jakarta.persistence.*

@Entity
class ProjectDetail(
        content: String,
        url: String?,
        isActive: Boolean,
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_detail_id")
    var id: Long? = null

    var content: String = content

    var isActive: Boolean = isActive

    var url: String? = url

    fun update(
            content: String,
            url: String?,
            isActive: Boolean,
    ) {
        this.content = content
        this.url = url
        this.isActive = isActive
    }
}