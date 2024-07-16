package com.portfolio.hungineer.domain.entity

import com.portfolio.hungineer.domain.constant.SkillType
import jakarta.persistence.*

@Entity
class Skill(
        name : String,
        type : String,
        isActive : Boolean
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="skill_id")
    var id : Long? = null

    var name : String = name

    @Column(name = "skill_type")
    @Enumerated(value = EnumType.STRING)
    var type : SkillType = SkillType.valueOf(type)

    var isActive : Boolean = isActive
}