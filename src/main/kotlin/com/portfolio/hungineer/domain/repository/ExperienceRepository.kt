package com.portfolio.hungineer.domain.repository

import com.portfolio.hungineer.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long> {


}