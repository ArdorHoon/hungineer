package com.portfolio.hungineer.domain.repository

import com.portfolio.hungineer.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long> {


}